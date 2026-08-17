package c6;

import P4.AbstractC1380n;
import android.content.Context;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.concurrent.Executor;
import q5.C3119c;
import r4.AbstractC3268i;

/* JADX INFO: renamed from: c6.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class C1864i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f18852b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static C1864i f18853c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private q5.n f18854a;

    private C1864i() {
    }

    public static C1864i c() {
        C1864i c1864i;
        synchronized (f18852b) {
            AbstractC3268i.o(f18853c != null, "MlKitContext has not been initialized");
            c1864i = (C1864i) AbstractC3268i.k(f18853c);
        }
        return c1864i;
    }

    public static C1864i d(Context context) {
        C1864i c1864iE;
        synchronized (f18852b) {
            c1864iE = e(context, AbstractC1380n.f8825a);
        }
        return c1864iE;
    }

    public static C1864i e(Context context, Executor executor) {
        C1864i c1864i;
        synchronized (f18852b) {
            AbstractC3268i.o(f18853c == null, "MlKitContext is already initialized");
            C1864i c1864i2 = new C1864i();
            f18853c = c1864i2;
            Context contextF = f(context);
            q5.n nVarE = q5.n.k(executor).d(q5.f.c(contextF, MlKitComponentDiscoveryService.class).b()).b(C3119c.q(contextF, Context.class, new Class[0])).b(C3119c.q(c1864i2, C1864i.class, new Class[0])).e();
            c1864i2.f18854a = nVarE;
            nVarE.n(true);
            c1864i = f18853c;
        }
        return c1864i;
    }

    private static Context f(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext != null ? applicationContext : context;
    }

    public Object a(Class cls) {
        AbstractC3268i.o(f18853c == this, "MlKitContext has been deleted");
        AbstractC3268i.k(this.f18854a);
        return this.f18854a.a(cls);
    }

    public Context b() {
        return (Context) a(Context.class);
    }
}
