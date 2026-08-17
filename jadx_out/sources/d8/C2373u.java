package d8;

import d8.AbstractC2371s;
import i7.C2750m;
import kotlin.jvm.internal.AbstractC2855l;
import t8.C3381d;
import t8.EnumC3382e;

/* JADX INFO: renamed from: d8.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class C2373u implements InterfaceC2372t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2373u f25789a = new C2373u();

    /* JADX INFO: renamed from: d8.u$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25790a;

        static {
            int[] iArr = new int[I7.l.values().length];
            try {
                iArr[I7.l.f5080m.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[I7.l.f5081n.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[I7.l.f5082o.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[I7.l.f5083p.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[I7.l.f5084q.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[I7.l.f5085r.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[I7.l.f5086s.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[I7.l.f5087t.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f25790a = iArr;
        }
    }

    private C2373u() {
    }

    @Override // d8.InterfaceC2372t
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public AbstractC2371s e(AbstractC2371s possiblyPrimitiveType) {
        AbstractC2855l.g(possiblyPrimitiveType, "possiblyPrimitiveType");
        if (!(possiblyPrimitiveType instanceof AbstractC2371s.d)) {
            return possiblyPrimitiveType;
        }
        AbstractC2371s.d dVar = (AbstractC2371s.d) possiblyPrimitiveType;
        if (dVar.i() == null) {
            return possiblyPrimitiveType;
        }
        String strF = C3381d.c(dVar.i().r()).f();
        AbstractC2855l.f(strF, "getInternalName(...)");
        return d(strF);
    }

    @Override // d8.InterfaceC2372t
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public AbstractC2371s c(String representation) {
        EnumC3382e enumC3382e;
        AbstractC2855l.g(representation, "representation");
        representation.length();
        char cCharAt = representation.charAt(0);
        EnumC3382e[] enumC3382eArrValues = EnumC3382e.values();
        int length = enumC3382eArrValues.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                enumC3382e = null;
                break;
            }
            enumC3382e = enumC3382eArrValues[i10];
            if (enumC3382e.m().charAt(0) == cCharAt) {
                break;
            }
            i10++;
        }
        if (enumC3382e != null) {
            return new AbstractC2371s.d(enumC3382e);
        }
        if (cCharAt == 'V') {
            return new AbstractC2371s.d(null);
        }
        if (cCharAt == '[') {
            String strSubstring = representation.substring(1);
            AbstractC2855l.f(strSubstring, "substring(...)");
            return new AbstractC2371s.a(c(strSubstring));
        }
        if (cCharAt == 'L') {
            P8.q.T(representation, ';', false, 2, null);
        }
        String strSubstring2 = representation.substring(1, representation.length() - 1);
        AbstractC2855l.f(strSubstring2, "substring(...)");
        return new AbstractC2371s.c(strSubstring2);
    }

    @Override // d8.InterfaceC2372t
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public AbstractC2371s.c d(String internalName) {
        AbstractC2855l.g(internalName, "internalName");
        return new AbstractC2371s.c(internalName);
    }

    @Override // d8.InterfaceC2372t
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public AbstractC2371s b(I7.l primitiveType) {
        AbstractC2855l.g(primitiveType, "primitiveType");
        switch (a.f25790a[primitiveType.ordinal()]) {
            case 1:
                return AbstractC2371s.f25777a.a();
            case 2:
                return AbstractC2371s.f25777a.c();
            case 3:
                return AbstractC2371s.f25777a.b();
            case 4:
                return AbstractC2371s.f25777a.h();
            case 5:
                return AbstractC2371s.f25777a.f();
            case 6:
                return AbstractC2371s.f25777a.e();
            case 7:
                return AbstractC2371s.f25777a.g();
            case 8:
                return AbstractC2371s.f25777a.d();
            default:
                throw new C2750m();
        }
    }

    @Override // d8.InterfaceC2372t
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public AbstractC2371s f() {
        return d("java/lang/Class");
    }

    @Override // d8.InterfaceC2372t
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public String a(AbstractC2371s type) {
        String strM;
        AbstractC2855l.g(type, "type");
        if (type instanceof AbstractC2371s.a) {
            return '[' + a(((AbstractC2371s.a) type).i());
        }
        if (type instanceof AbstractC2371s.d) {
            EnumC3382e enumC3382eI = ((AbstractC2371s.d) type).i();
            return (enumC3382eI == null || (strM = enumC3382eI.m()) == null) ? "V" : strM;
        }
        if (!(type instanceof AbstractC2371s.c)) {
            throw new C2750m();
        }
        return 'L' + ((AbstractC2371s.c) type).i() + ';';
    }
}
