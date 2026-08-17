package d4;

import a4.AbstractC1595a;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import e4.InterfaceC2405d;
import h4.AbstractC2704a;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.zip.Adler32;

/* JADX INFO: renamed from: d4.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C2332d implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f25605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC2405d f25606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AbstractC2334f f25607c;

    public C2332d(Context context, InterfaceC2405d interfaceC2405d, AbstractC2334f abstractC2334f) {
        this.f25605a = context;
        this.f25606b = interfaceC2405d;
        this.f25607c = abstractC2334f;
    }

    private boolean d(JobScheduler jobScheduler, int i10, int i11) {
        Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            JobInfo next = it.next();
            int i12 = next.getExtras().getInt("attemptNumber");
            if (next.getId() == i10) {
                if (i12 >= i11) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // d4.x
    public void a(W3.o oVar, int i10) {
        b(oVar, i10, false);
    }

    @Override // d4.x
    public void b(W3.o oVar, int i10, boolean z10) {
        ComponentName componentName = new ComponentName(this.f25605a, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f25605a.getSystemService("jobscheduler");
        int iC = c(oVar);
        if (!z10 && d(jobScheduler, iC, i10)) {
            AbstractC1595a.b("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", oVar);
            return;
        }
        long jZ = this.f25606b.z(oVar);
        JobInfo.Builder builderC = this.f25607c.c(new JobInfo.Builder(iC, componentName), oVar.d(), jZ, i10);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i10);
        persistableBundle.putString("backendName", oVar.b());
        persistableBundle.putInt("priority", AbstractC2704a.a(oVar.d()));
        if (oVar.c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(oVar.c(), 0));
        }
        builderC.setExtras(persistableBundle);
        AbstractC1595a.c("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", oVar, Integer.valueOf(iC), Long.valueOf(this.f25607c.g(oVar.d(), jZ, i10)), Long.valueOf(jZ), Integer.valueOf(i10));
        jobScheduler.schedule(builderC.build());
    }

    int c(W3.o oVar) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f25605a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(oVar.b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(AbstractC2704a.a(oVar.d())).array());
        if (oVar.c() != null) {
            adler32.update(oVar.c());
        }
        return (int) adler32.getValue();
    }
}
