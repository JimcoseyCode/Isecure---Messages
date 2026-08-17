package A3;

import android.content.Context;
import com.facebook.soloader.E;
import com.facebook.soloader.p;
import com.facebook.soloader.w;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f47a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f48b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f49c;

    public g(Context context, a aVar) {
        this.f47a = context;
        this.f48b = aVar;
        this.f49c = aVar.c();
    }

    private boolean b() {
        String strC = c();
        return new File(strC).exists() && this.f48b.a(strC);
    }

    private String c() {
        return this.f47a.getApplicationInfo().sourceDir;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void d(E[] eArr) {
        for (int i10 = 0; i10 < eArr.length; i10++) {
            Object[] objArr = eArr[i10];
            if (objArr instanceof w) {
                eArr[i10] = ((w) objArr).b(this.f47a);
            }
        }
    }

    @Override // A3.h
    public boolean a(UnsatisfiedLinkError unsatisfiedLinkError, E[] eArr) {
        if (b()) {
            d(eArr);
            return true;
        }
        if (this.f49c == this.f48b.c()) {
            return false;
        }
        p.g("soloader.recovery.DetectDataAppMove", "Context was updated (perhaps by another thread)");
        return true;
    }
}
