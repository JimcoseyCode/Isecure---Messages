package F;

import F.o1;
import android.util.Range;
import android.util.Size;
import com.facebook.react.uimanager.events.PointerEventHelper;
import y.C3563H;

/* JADX INFO: renamed from: F.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C0501p extends o1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Size f1589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Size f1590c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C3563H f1591d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f1592e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Range f1593f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC0490j0 f1594g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f1595h;

    /* JADX INFO: renamed from: F.p$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class b extends o1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Size f1596a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Size f1597b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private C3563H f1598c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Integer f1599d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Range f1600e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private InterfaceC0490j0 f1601f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Boolean f1602g;

        @Override // F.o1.a
        public o1 a() {
            Size size = this.f1596a;
            String str = PointerEventHelper.POINTER_TYPE_UNKNOWN;
            if (size == null) {
                str = PointerEventHelper.POINTER_TYPE_UNKNOWN + " resolution";
            }
            if (this.f1597b == null) {
                str = str + " originalConfiguredResolution";
            }
            if (this.f1598c == null) {
                str = str + " dynamicRange";
            }
            if (this.f1599d == null) {
                str = str + " sessionType";
            }
            if (this.f1600e == null) {
                str = str + " expectedFrameRateRange";
            }
            if (this.f1602g == null) {
                str = str + " zslDisabled";
            }
            if (str.isEmpty()) {
                return new C0501p(this.f1596a, this.f1597b, this.f1598c, this.f1599d.intValue(), this.f1600e, this.f1601f, this.f1602g.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // F.o1.a
        public o1.a b(C3563H c3563h) {
            if (c3563h == null) {
                throw new NullPointerException("Null dynamicRange");
            }
            this.f1598c = c3563h;
            return this;
        }

        @Override // F.o1.a
        public o1.a c(Range range) {
            if (range == null) {
                throw new NullPointerException("Null expectedFrameRateRange");
            }
            this.f1600e = range;
            return this;
        }

        @Override // F.o1.a
        public o1.a d(InterfaceC0490j0 interfaceC0490j0) {
            this.f1601f = interfaceC0490j0;
            return this;
        }

        @Override // F.o1.a
        public o1.a e(Size size) {
            if (size == null) {
                throw new NullPointerException("Null originalConfiguredResolution");
            }
            this.f1597b = size;
            return this;
        }

        @Override // F.o1.a
        public o1.a f(Size size) {
            if (size == null) {
                throw new NullPointerException("Null resolution");
            }
            this.f1596a = size;
            return this;
        }

        @Override // F.o1.a
        public o1.a g(int i10) {
            this.f1599d = Integer.valueOf(i10);
            return this;
        }

        @Override // F.o1.a
        public o1.a h(boolean z10) {
            this.f1602g = Boolean.valueOf(z10);
            return this;
        }

        b() {
        }

        private b(o1 o1Var) {
            this.f1596a = o1Var.f();
            this.f1597b = o1Var.e();
            this.f1598c = o1Var.b();
            this.f1599d = Integer.valueOf(o1Var.g());
            this.f1600e = o1Var.c();
            this.f1601f = o1Var.d();
            this.f1602g = Boolean.valueOf(o1Var.h());
        }
    }

    @Override // F.o1
    public C3563H b() {
        return this.f1591d;
    }

    @Override // F.o1
    public Range c() {
        return this.f1593f;
    }

    @Override // F.o1
    public InterfaceC0490j0 d() {
        return this.f1594g;
    }

    @Override // F.o1
    public Size e() {
        return this.f1590c;
    }

    public boolean equals(Object obj) {
        InterfaceC0490j0 interfaceC0490j0;
        if (obj == this) {
            return true;
        }
        if (obj instanceof o1) {
            o1 o1Var = (o1) obj;
            if (this.f1589b.equals(o1Var.f()) && this.f1590c.equals(o1Var.e()) && this.f1591d.equals(o1Var.b()) && this.f1592e == o1Var.g() && this.f1593f.equals(o1Var.c()) && ((interfaceC0490j0 = this.f1594g) != null ? interfaceC0490j0.equals(o1Var.d()) : o1Var.d() == null) && this.f1595h == o1Var.h()) {
                return true;
            }
        }
        return false;
    }

    @Override // F.o1
    public Size f() {
        return this.f1589b;
    }

    @Override // F.o1
    public int g() {
        return this.f1592e;
    }

    @Override // F.o1
    public boolean h() {
        return this.f1595h;
    }

    public int hashCode() {
        int iHashCode = (((((((((this.f1589b.hashCode() ^ 1000003) * 1000003) ^ this.f1590c.hashCode()) * 1000003) ^ this.f1591d.hashCode()) * 1000003) ^ this.f1592e) * 1000003) ^ this.f1593f.hashCode()) * 1000003;
        InterfaceC0490j0 interfaceC0490j0 = this.f1594g;
        return ((iHashCode ^ (interfaceC0490j0 == null ? 0 : interfaceC0490j0.hashCode())) * 1000003) ^ (this.f1595h ? 1231 : 1237);
    }

    @Override // F.o1
    public o1.a i() {
        return new b(this);
    }

    public String toString() {
        return "StreamSpec{resolution=" + this.f1589b + ", originalConfiguredResolution=" + this.f1590c + ", dynamicRange=" + this.f1591d + ", sessionType=" + this.f1592e + ", expectedFrameRateRange=" + this.f1593f + ", implementationOptions=" + this.f1594g + ", zslDisabled=" + this.f1595h + "}";
    }

    private C0501p(Size size, Size size2, C3563H c3563h, int i10, Range range, InterfaceC0490j0 interfaceC0490j0, boolean z10) {
        this.f1589b = size;
        this.f1590c = size2;
        this.f1591d = c3563h;
        this.f1592e = i10;
        this.f1593f = range;
        this.f1594g = interfaceC0490j0;
        this.f1595h = z10;
    }
}
