package R2;

import g2.AbstractC2662a;
import java.util.List;
import l3.InterfaceC2866a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f9978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AbstractC2662a f9979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f9980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f9981d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f9982e;

    f(c cVar) {
        this.f9978a = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e a() {
        try {
            return new e(this);
        } finally {
            AbstractC2662a.B(this.f9979b);
            this.f9979b = null;
            AbstractC2662a.I(this.f9980c);
            this.f9980c = null;
        }
    }

    public InterfaceC2866a b() {
        return null;
    }

    public List c() {
        return AbstractC2662a.A(this.f9980c);
    }

    public int d() {
        return this.f9981d;
    }

    public c e() {
        return this.f9978a;
    }

    public AbstractC2662a f() {
        return AbstractC2662a.r(this.f9979b);
    }

    public String g() {
        return this.f9982e;
    }

    public f i(List list) {
        this.f9980c = AbstractC2662a.A(list);
        return this;
    }

    public f j(int i10) {
        this.f9981d = i10;
        return this;
    }

    public f k(AbstractC2662a abstractC2662a) {
        this.f9979b = AbstractC2662a.r(abstractC2662a);
        return this;
    }

    public f l(String str) {
        this.f9982e = str;
        return this;
    }

    public f h(InterfaceC2866a interfaceC2866a) {
        return this;
    }
}
