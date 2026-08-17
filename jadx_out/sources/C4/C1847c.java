package c4;

import U3.j;
import W3.o;
import W3.t;
import X3.m;
import d4.x;
import e4.InterfaceC2405d;
import f4.InterfaceC2613b;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* JADX INFO: renamed from: c4.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C1847c implements InterfaceC1849e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Logger f18810f = Logger.getLogger(t.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x f18811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f18812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final X3.e f18813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC2405d f18814d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC2613b f18815e;

    public C1847c(Executor executor, X3.e eVar, x xVar, InterfaceC2405d interfaceC2405d, InterfaceC2613b interfaceC2613b) {
        this.f18812b = executor;
        this.f18813c = eVar;
        this.f18811a = xVar;
        this.f18814d = interfaceC2405d;
        this.f18815e = interfaceC2613b;
    }

    public static /* synthetic */ Object b(C1847c c1847c, o oVar, W3.i iVar) {
        c1847c.f18814d.n(oVar, iVar);
        c1847c.f18811a.a(oVar, 1);
        return null;
    }

    public static /* synthetic */ void c(final C1847c c1847c, final o oVar, j jVar, W3.i iVar) {
        c1847c.getClass();
        try {
            m mVar = c1847c.f18813c.get(oVar.b());
            if (mVar == null) {
                String str = String.format("Transport backend '%s' is not registered", oVar.b());
                f18810f.warning(str);
                jVar.a(new IllegalArgumentException(str));
            } else {
                final W3.i iVarB = mVar.b(iVar);
                c1847c.f18815e.e(new InterfaceC2613b.a() { // from class: c4.b
                    @Override // f4.InterfaceC2613b.a
                    public final Object execute() {
                        return C1847c.b(this.f18807a, oVar, iVarB);
                    }
                });
                jVar.a(null);
            }
        } catch (Exception e10) {
            f18810f.warning("Error scheduling event " + e10.getMessage());
            jVar.a(e10);
        }
    }

    @Override // c4.InterfaceC1849e
    public void a(final o oVar, final W3.i iVar, final j jVar) {
        this.f18812b.execute(new Runnable() { // from class: c4.a
            @Override // java.lang.Runnable
            public final void run() {
                C1847c.c(this.f18803g, oVar, jVar, iVar);
            }
        });
    }
}
