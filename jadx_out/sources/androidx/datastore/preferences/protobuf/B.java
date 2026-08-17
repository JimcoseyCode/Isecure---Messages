package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class B implements Z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final I f16742b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final I f16743a;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements I {
        a() {
        }

        @Override // androidx.datastore.preferences.protobuf.I
        public H a(Class cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // androidx.datastore.preferences.protobuf.I
        public boolean b(Class cls) {
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f16744a;

        static {
            int[] iArr = new int[T.values().length];
            f16744a = iArr;
            try {
                iArr[T.PROTO3.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class c implements I {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private I[] f16745a;

        c(I... iArr) {
            this.f16745a = iArr;
        }

        @Override // androidx.datastore.preferences.protobuf.I
        public H a(Class cls) {
            for (I i10 : this.f16745a) {
                if (i10.b(cls)) {
                    return i10.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        @Override // androidx.datastore.preferences.protobuf.I
        public boolean b(Class cls) {
            for (I i10 : this.f16745a) {
                if (i10.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public B() {
        this(c());
    }

    private static boolean b(H h10) {
        return b.f16744a[h10.c().ordinal()] != 1;
    }

    private static I c() {
        return new c(C1725s.c(), d());
    }

    private static I d() {
        if (U.f16788d) {
            return f16742b;
        }
        try {
            return (I) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            return f16742b;
        }
    }

    private static Y e(Class cls, H h10) {
        if (f(cls)) {
            return M.M(cls, h10, Q.b(), A.b(), a0.K(), b(h10) ? AbstractC1723p.b() : null, G.b());
        }
        O oA = Q.a();
        AbstractC1721n abstractC1721nA = null;
        InterfaceC1731y interfaceC1731yA = A.a();
        f0 f0VarJ = a0.J();
        if (b(h10)) {
            abstractC1721nA = AbstractC1723p.a();
        }
        return M.M(cls, h10, oA, interfaceC1731yA, f0VarJ, abstractC1721nA, G.a());
    }

    private static boolean f(Class cls) {
        return U.f16788d || AbstractC1726t.class.isAssignableFrom(cls);
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public Y a(Class cls) {
        a0.G(cls);
        H hA = this.f16743a.a(cls);
        return hA.a() ? f(cls) ? N.k(a0.K(), AbstractC1723p.b(), hA.b()) : N.k(a0.J(), AbstractC1723p.a(), hA.b()) : e(cls, hA);
    }

    private B(I i10) {
        this.f16743a = (I) AbstractC1727u.b(i10, "messageInfoFactory");
    }
}
