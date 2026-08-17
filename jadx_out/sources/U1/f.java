package U1;

import U1.b;
import U1.g;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    b.r f10905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    e f10906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f10907c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    g.C1449b f10908d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    String f10909e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    g.C1449b f10910f;

    public f() {
        this.f10905a = null;
        this.f10906b = null;
        this.f10907c = null;
        this.f10908d = null;
        this.f10909e = null;
        this.f10910f = null;
    }

    public boolean a() {
        b.r rVar = this.f10905a;
        return rVar != null && rVar.f() > 0;
    }

    public boolean b() {
        return this.f10906b != null;
    }

    public boolean c() {
        return this.f10907c != null;
    }

    public boolean d() {
        return this.f10909e != null;
    }

    public boolean e() {
        return this.f10908d != null;
    }

    public boolean f() {
        return this.f10910f != null;
    }

    public f g(float f10, float f11, float f12, float f13) {
        this.f10910f = new g.C1449b(f10, f11, f12, f13);
        return this;
    }

    public f(f fVar) {
        this.f10905a = null;
        this.f10906b = null;
        this.f10907c = null;
        this.f10908d = null;
        this.f10909e = null;
        this.f10910f = null;
        if (fVar == null) {
            return;
        }
        this.f10905a = fVar.f10905a;
        this.f10906b = fVar.f10906b;
        this.f10908d = fVar.f10908d;
        this.f10909e = fVar.f10909e;
        this.f10910f = fVar.f10910f;
    }
}
