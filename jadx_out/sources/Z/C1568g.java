package Z;

import Z.r;
import com.facebook.react.uimanager.events.PointerEventHelper;

/* JADX INFO: renamed from: Z.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C1568g extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z0 f13372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AbstractC1562a f13373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f13374c;

    /* JADX INFO: renamed from: Z.g$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class b extends r.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private z0 f13375a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private AbstractC1562a f13376b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f13377c;

        @Override // Z.r.a
        public r a() {
            z0 z0Var = this.f13375a;
            String str = PointerEventHelper.POINTER_TYPE_UNKNOWN;
            if (z0Var == null) {
                str = PointerEventHelper.POINTER_TYPE_UNKNOWN + " videoSpec";
            }
            if (this.f13376b == null) {
                str = str + " audioSpec";
            }
            if (this.f13377c == null) {
                str = str + " outputFormat";
            }
            if (str.isEmpty()) {
                return new C1568g(this.f13375a, this.f13376b, this.f13377c.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // Z.r.a
        z0 c() {
            z0 z0Var = this.f13375a;
            if (z0Var != null) {
                return z0Var;
            }
            throw new IllegalStateException("Property \"videoSpec\" has not been set");
        }

        @Override // Z.r.a
        public r.a d(AbstractC1562a abstractC1562a) {
            if (abstractC1562a == null) {
                throw new NullPointerException("Null audioSpec");
            }
            this.f13376b = abstractC1562a;
            return this;
        }

        @Override // Z.r.a
        public r.a e(int i10) {
            this.f13377c = Integer.valueOf(i10);
            return this;
        }

        @Override // Z.r.a
        public r.a f(z0 z0Var) {
            if (z0Var == null) {
                throw new NullPointerException("Null videoSpec");
            }
            this.f13375a = z0Var;
            return this;
        }

        b() {
        }

        private b(r rVar) {
            this.f13375a = rVar.d();
            this.f13376b = rVar.b();
            this.f13377c = Integer.valueOf(rVar.c());
        }
    }

    @Override // Z.r
    public AbstractC1562a b() {
        return this.f13373b;
    }

    @Override // Z.r
    public int c() {
        return this.f13374c;
    }

    @Override // Z.r
    public z0 d() {
        return this.f13372a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            if (this.f13372a.equals(rVar.d()) && this.f13373b.equals(rVar.b()) && this.f13374c == rVar.c()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f13372a.hashCode() ^ 1000003) * 1000003) ^ this.f13373b.hashCode()) * 1000003) ^ this.f13374c;
    }

    @Override // Z.r
    public r.a i() {
        return new b(this);
    }

    public String toString() {
        return "MediaSpec{videoSpec=" + this.f13372a + ", audioSpec=" + this.f13373b + ", outputFormat=" + this.f13374c + "}";
    }

    private C1568g(z0 z0Var, AbstractC1562a abstractC1562a, int i10) {
        this.f13372a = z0Var;
        this.f13373b = abstractC1562a;
        this.f13374c = i10;
    }
}
