package s0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class f implements InterfaceC3315d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    p f32117d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f32119f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f32120g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InterfaceC3315d f32114a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f32115b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f32116c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    a f32118e = a.UNKNOWN;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f32121h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    g f32122i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f32123j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    List f32124k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    List f32125l = new ArrayList();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public f(p pVar) {
        this.f32117d = pVar;
    }

    @Override // s0.InterfaceC3315d
    public void a(InterfaceC3315d interfaceC3315d) {
        Iterator it = this.f32125l.iterator();
        while (it.hasNext()) {
            if (!((f) it.next()).f32123j) {
                return;
            }
        }
        this.f32116c = true;
        InterfaceC3315d interfaceC3315d2 = this.f32114a;
        if (interfaceC3315d2 != null) {
            interfaceC3315d2.a(this);
        }
        if (this.f32115b) {
            this.f32117d.a(this);
            return;
        }
        f fVar = null;
        int i10 = 0;
        for (f fVar2 : this.f32125l) {
            if (!(fVar2 instanceof g)) {
                i10++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i10 == 1 && fVar.f32123j) {
            g gVar = this.f32122i;
            if (gVar != null) {
                if (!gVar.f32123j) {
                    return;
                } else {
                    this.f32119f = this.f32121h * gVar.f32120g;
                }
            }
            d(fVar.f32120g + this.f32119f);
        }
        InterfaceC3315d interfaceC3315d3 = this.f32114a;
        if (interfaceC3315d3 != null) {
            interfaceC3315d3.a(this);
        }
    }

    public void b(InterfaceC3315d interfaceC3315d) {
        this.f32124k.add(interfaceC3315d);
        if (this.f32123j) {
            interfaceC3315d.a(interfaceC3315d);
        }
    }

    public void c() {
        this.f32125l.clear();
        this.f32124k.clear();
        this.f32123j = false;
        this.f32120g = 0;
        this.f32116c = false;
        this.f32115b = false;
    }

    public void d(int i10) {
        if (this.f32123j) {
            return;
        }
        this.f32123j = true;
        this.f32120g = i10;
        for (InterfaceC3315d interfaceC3315d : this.f32124k) {
            interfaceC3315d.a(interfaceC3315d);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f32117d.f32168b.t());
        sb.append(":");
        sb.append(this.f32118e);
        sb.append("(");
        sb.append(this.f32123j ? Integer.valueOf(this.f32120g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f32125l.size());
        sb.append(":d=");
        sb.append(this.f32124k.size());
        sb.append(">");
        return sb.toString();
    }
}
