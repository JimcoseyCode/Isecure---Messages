package com.google.firebase.messaging;

import P4.AbstractC1381o;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import androidx.core.app.l;
import com.google.firebase.messaging.AbstractC2236d;
import expo.modules.notifications.service.NotificationsService;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: com.google.firebase.messaging.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
class C2238f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ExecutorService f24253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f24254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final M f24255c;

    public C2238f(Context context, M m10, ExecutorService executorService) {
        this.f24253a = executorService;
        this.f24254b = context;
        this.f24255c = m10;
    }

    private boolean b() {
        if (((KeyguardManager) this.f24254b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        if (!y4.l.e()) {
            SystemClock.sleep(10L);
        }
        int iMyPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f24254b.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ActivityManager.RunningAppProcessInfo next = it.next();
                if (next.pid == iMyPid) {
                    if (next.importance == 100) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private void c(AbstractC2236d.a aVar) {
        ((NotificationManager) this.f24254b.getSystemService(NotificationsService.NOTIFICATION_KEY)).notify(aVar.f24240b, aVar.f24241c, aVar.f24239a.d());
    }

    private I d() {
        I iM = I.m(this.f24255c.p("gcm.n.image"));
        if (iM != null) {
            iM.s(this.f24253a);
        }
        return iM;
    }

    private void e(l.e eVar, I i10) {
        if (i10 == null) {
            return;
        }
        try {
            Bitmap bitmap = (Bitmap) AbstractC1381o.b(i10.r(), 5L, TimeUnit.SECONDS);
            eVar.q(bitmap);
            eVar.A(new l.b().i(bitmap).h(null));
        } catch (InterruptedException unused) {
            i10.close();
            Thread.currentThread().interrupt();
        } catch (ExecutionException e10) {
            Objects.toString(e10.getCause());
        } catch (TimeoutException unused2) {
            i10.close();
        }
    }

    boolean a() {
        if (this.f24255c.a("gcm.n.noui")) {
            return true;
        }
        if (b()) {
            return false;
        }
        I iD = d();
        AbstractC2236d.a aVarE = AbstractC2236d.e(this.f24254b, this.f24255c);
        e(aVarE.f24239a, iD);
        c(aVarE);
        return true;
    }
}
