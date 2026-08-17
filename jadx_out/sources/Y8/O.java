package y8;

import C8.N0;
import L7.EnumC1281f;
import f8.c;
import f8.q;
import f8.s;
import i7.C2750m;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final O f34047a = new O();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f34048a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f34049b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f34050c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f34051d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f34052e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ int[] f34053f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ int[] f34054g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ int[] f34055h;

        static {
            int[] iArr = new int[f8.k.values().length];
            try {
                iArr[f8.k.FINAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f8.k.OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[f8.k.ABSTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[f8.k.SEALED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f34048a = iArr;
            int[] iArr2 = new int[L7.E.values().length];
            try {
                iArr2[L7.E.f7283h.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[L7.E.f7285j.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[L7.E.f7286k.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[L7.E.f7284i.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            f34049b = iArr2;
            int[] iArr3 = new int[f8.x.values().length];
            try {
                iArr3[f8.x.INTERNAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[f8.x.PRIVATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[f8.x.PRIVATE_TO_THIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[f8.x.PROTECTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[f8.x.PUBLIC.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[f8.x.LOCAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            f34050c = iArr3;
            int[] iArr4 = new int[c.EnumC0277c.values().length];
            try {
                iArr4[c.EnumC0277c.CLASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[c.EnumC0277c.INTERFACE.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[c.EnumC0277c.ENUM_CLASS.ordinal()] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[c.EnumC0277c.ENUM_ENTRY.ordinal()] = 4;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr4[c.EnumC0277c.ANNOTATION_CLASS.ordinal()] = 5;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr4[c.EnumC0277c.OBJECT.ordinal()] = 6;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr4[c.EnumC0277c.COMPANION_OBJECT.ordinal()] = 7;
            } catch (NoSuchFieldError unused21) {
            }
            f34051d = iArr4;
            int[] iArr5 = new int[EnumC1281f.values().length];
            try {
                iArr5[EnumC1281f.f7320h.ordinal()] = 1;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr5[EnumC1281f.f7321i.ordinal()] = 2;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr5[EnumC1281f.f7322j.ordinal()] = 3;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr5[EnumC1281f.f7323k.ordinal()] = 4;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr5[EnumC1281f.f7324l.ordinal()] = 5;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr5[EnumC1281f.f7325m.ordinal()] = 6;
            } catch (NoSuchFieldError unused27) {
            }
            f34052e = iArr5;
            int[] iArr6 = new int[s.c.values().length];
            try {
                iArr6[s.c.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr6[s.c.OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr6[s.c.INV.ordinal()] = 3;
            } catch (NoSuchFieldError unused30) {
            }
            f34053f = iArr6;
            int[] iArr7 = new int[q.b.c.values().length];
            try {
                iArr7[q.b.c.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr7[q.b.c.OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr7[q.b.c.INV.ordinal()] = 3;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr7[q.b.c.STAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused34) {
            }
            f34054g = iArr7;
            int[] iArr8 = new int[N0.values().length];
            try {
                iArr8[N0.f593l.ordinal()] = 1;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr8[N0.f594m.ordinal()] = 2;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr8[N0.f592k.ordinal()] = 3;
            } catch (NoSuchFieldError unused37) {
            }
            f34055h = iArr8;
        }
    }

    private O() {
    }

    public final EnumC1281f a(c.EnumC0277c enumC0277c) {
        switch (enumC0277c == null ? -1 : a.f34051d[enumC0277c.ordinal()]) {
            case 1:
                return EnumC1281f.f7320h;
            case 2:
                return EnumC1281f.f7321i;
            case 3:
                return EnumC1281f.f7322j;
            case 4:
                return EnumC1281f.f7323k;
            case 5:
                return EnumC1281f.f7324l;
            case 6:
            case 7:
                return EnumC1281f.f7325m;
            default:
                return EnumC1281f.f7320h;
        }
    }

    public final L7.E b(f8.k kVar) {
        int i10 = kVar == null ? -1 : a.f34048a[kVar.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? L7.E.f7283h : L7.E.f7284i : L7.E.f7286k : L7.E.f7285j : L7.E.f7283h;
    }

    public final N0 c(q.b.c projection) {
        AbstractC2855l.g(projection, "projection");
        int i10 = a.f34054g[projection.ordinal()];
        if (i10 == 1) {
            return N0.f593l;
        }
        if (i10 == 2) {
            return N0.f594m;
        }
        if (i10 == 3) {
            return N0.f592k;
        }
        if (i10 != 4) {
            throw new C2750m();
        }
        throw new IllegalArgumentException("Only IN, OUT and INV are supported. Actual argument: " + projection);
    }

    public final N0 d(s.c variance) {
        AbstractC2855l.g(variance, "variance");
        int i10 = a.f34053f[variance.ordinal()];
        if (i10 == 1) {
            return N0.f593l;
        }
        if (i10 == 2) {
            return N0.f594m;
        }
        if (i10 == 3) {
            return N0.f592k;
        }
        throw new C2750m();
    }
}
