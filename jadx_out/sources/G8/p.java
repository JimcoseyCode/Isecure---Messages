package G8;

import C8.N0;
import i7.C2750m;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class p {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3546a;

        static {
            int[] iArr = new int[N0.values().length];
            try {
                iArr[N0.f592k.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[N0.f593l.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[N0.f594m.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f3546a = iArr;
        }
    }

    public static final s a(N0 n02) {
        AbstractC2855l.g(n02, "<this>");
        int i10 = a.f3546a[n02.ordinal()];
        if (i10 == 1) {
            return s.f3549j;
        }
        if (i10 == 2) {
            return s.f3547h;
        }
        if (i10 == 3) {
            return s.f3548i;
        }
        throw new C2750m();
    }
}
