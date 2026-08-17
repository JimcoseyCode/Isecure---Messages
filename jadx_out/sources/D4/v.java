package d4;

import e4.InterfaceC2405d;
import f4.InterfaceC2613b;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f25661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC2405d f25662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x f25663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC2613b f25664d;

    v(Executor executor, InterfaceC2405d interfaceC2405d, x xVar, InterfaceC2613b interfaceC2613b) {
        this.f25661a = executor;
        this.f25662b = interfaceC2405d;
        this.f25663c = xVar;
        this.f25664d = interfaceC2613b;
    }

    public static /* synthetic */ Object a(v vVar) {
        Iterator it = vVar.f25662b.H().iterator();
        while (it.hasNext()) {
            vVar.f25663c.a((W3.o) it.next(), 1);
        }
        return null;
    }

    public void c() {
        this.f25661a.execute(new Runnable() { // from class: d4.t
            @Override // java.lang.Runnable
            public final void run() {
                v vVar = this.f25659g;
                vVar.f25664d.e(new InterfaceC2613b.a() { // from class: d4.u
                    @Override // f4.InterfaceC2613b.a
                    public final Object execute() {
                        return v.a(vVar);
                    }
                });
            }
        });
    }
}
