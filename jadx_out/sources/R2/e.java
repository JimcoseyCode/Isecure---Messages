package R2;

import c2.k;
import g2.AbstractC2662a;
import java.util.List;
import l3.InterfaceC2866a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f9973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f9974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f9975c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AbstractC2662a f9976d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List f9977e;

    e(f fVar) {
        this.f9973a = (c) k.g(fVar.e());
        this.f9974b = fVar.d();
        this.f9976d = fVar.f();
        this.f9977e = fVar.c();
        fVar.b();
        this.f9975c = fVar.g();
    }

    public static e b(c cVar) {
        return new e(cVar);
    }

    public static f f(c cVar) {
        return new f(cVar);
    }

    public synchronized void a() {
        AbstractC2662a.B(this.f9976d);
        this.f9976d = null;
        AbstractC2662a.I(this.f9977e);
        this.f9977e = null;
    }

    public InterfaceC2866a c() {
        return null;
    }

    public c d() {
        return this.f9973a;
    }

    public String e() {
        return this.f9975c;
    }

    private e(c cVar) {
        this.f9973a = (c) k.g(cVar);
        this.f9974b = 0;
    }
}
