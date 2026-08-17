package W3;

import android.content.Context;
import c4.InterfaceC1849e;
import g4.InterfaceC2673a;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class t implements s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile u f12113e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC2673a f12114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC2673a f12115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC1849e f12116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d4.r f12117d;

    t(InterfaceC2673a interfaceC2673a, InterfaceC2673a interfaceC2673a2, InterfaceC1849e interfaceC1849e, d4.r rVar, d4.v vVar) {
        this.f12114a = interfaceC2673a;
        this.f12115b = interfaceC2673a2;
        this.f12116c = interfaceC1849e;
        this.f12117d = rVar;
        vVar.c();
    }

    private i b(n nVar) {
        return i.a().i(this.f12114a.a()).k(this.f12115b.a()).j(nVar.g()).h(new h(nVar.b(), nVar.d())).g(nVar.c().a()).d();
    }

    public static t c() {
        u uVar = f12113e;
        if (uVar != null) {
            return uVar.e();
        }
        throw new IllegalStateException("Not initialized!");
    }

    private static Set d(f fVar) {
        return fVar instanceof g ? Collections.unmodifiableSet(((g) fVar).a()) : Collections.singleton(U3.c.b("proto"));
    }

    public static void f(Context context) {
        if (f12113e == null) {
            synchronized (t.class) {
                try {
                    if (f12113e == null) {
                        f12113e = e.k().a(context).build();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // W3.s
    public void a(n nVar, U3.j jVar) {
        this.f12116c.a(nVar.f().f(nVar.c().c()), b(nVar), jVar);
    }

    public d4.r e() {
        return this.f12117d;
    }

    public U3.i g(f fVar) {
        return new p(d(fVar), o.a().b(fVar.getName()).c(fVar.getExtras()).a(), this);
    }
}
