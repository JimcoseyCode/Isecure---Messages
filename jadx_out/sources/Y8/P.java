package y8;

import L7.AbstractC1294t;
import L7.AbstractC1295u;
import L7.InterfaceC1277b;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class P {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f34056a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f34057b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f34058c;

        static {
            int[] iArr = new int[f8.j.values().length];
            try {
                iArr[f8.j.DECLARATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f8.j.FAKE_OVERRIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[f8.j.DELEGATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[f8.j.SYNTHESIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f34056a = iArr;
            int[] iArr2 = new int[InterfaceC1277b.a.values().length];
            try {
                iArr2[InterfaceC1277b.a.DECLARATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[InterfaceC1277b.a.FAKE_OVERRIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[InterfaceC1277b.a.DELEGATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[InterfaceC1277b.a.SYNTHESIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            f34057b = iArr2;
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
            f34058c = iArr3;
        }
    }

    public static final AbstractC1295u a(O o10, f8.x xVar) {
        AbstractC2855l.g(o10, "<this>");
        switch (xVar == null ? -1 : a.f34058c[xVar.ordinal()]) {
            case 1:
                AbstractC1295u INTERNAL = AbstractC1294t.f7346d;
                AbstractC2855l.f(INTERNAL, "INTERNAL");
                return INTERNAL;
            case 2:
                AbstractC1295u PRIVATE = AbstractC1294t.f7343a;
                AbstractC2855l.f(PRIVATE, "PRIVATE");
                return PRIVATE;
            case 3:
                AbstractC1295u PRIVATE_TO_THIS = AbstractC1294t.f7344b;
                AbstractC2855l.f(PRIVATE_TO_THIS, "PRIVATE_TO_THIS");
                return PRIVATE_TO_THIS;
            case 4:
                AbstractC1295u PROTECTED = AbstractC1294t.f7345c;
                AbstractC2855l.f(PROTECTED, "PROTECTED");
                return PROTECTED;
            case 5:
                AbstractC1295u PUBLIC = AbstractC1294t.f7347e;
                AbstractC2855l.f(PUBLIC, "PUBLIC");
                return PUBLIC;
            case 6:
                AbstractC1295u LOCAL = AbstractC1294t.f7348f;
                AbstractC2855l.f(LOCAL, "LOCAL");
                return LOCAL;
            default:
                AbstractC1295u PRIVATE2 = AbstractC1294t.f7343a;
                AbstractC2855l.f(PRIVATE2, "PRIVATE");
                return PRIVATE2;
        }
    }

    public static final InterfaceC1277b.a b(O o10, f8.j jVar) {
        AbstractC2855l.g(o10, "<this>");
        int i10 = jVar == null ? -1 : a.f34056a[jVar.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? InterfaceC1277b.a.DECLARATION : InterfaceC1277b.a.SYNTHESIZED : InterfaceC1277b.a.DELEGATION : InterfaceC1277b.a.FAKE_OVERRIDE : InterfaceC1277b.a.DECLARATION;
    }
}
