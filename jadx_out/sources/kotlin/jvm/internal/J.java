package kotlin.jvm.internal;

import i7.C2735B;
import i7.C2750m;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class J implements C7.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f29376g = new a(null);

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {

        /* JADX INFO: renamed from: kotlin.jvm.internal.J$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public /* synthetic */ class C0309a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f29377a;

            static {
                int[] iArr = new int[C7.r.values().length];
                try {
                    iArr[C7.r.f523g.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[C7.r.f524h.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[C7.r.f525i.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f29377a = iArr;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(C7.p typeParameter) {
            AbstractC2855l.g(typeParameter, "typeParameter");
            StringBuilder sb = new StringBuilder();
            int i10 = C0309a.f29377a[typeParameter.m().ordinal()];
            if (i10 == 1) {
                C2735B c2735b = C2735B.f28704a;
            } else if (i10 == 2) {
                sb.append("in ");
            } else {
                if (i10 != 3) {
                    throw new C2750m();
                }
                sb.append("out ");
            }
            sb.append(typeParameter.getName());
            return sb.toString();
        }

        private a() {
        }
    }
}
