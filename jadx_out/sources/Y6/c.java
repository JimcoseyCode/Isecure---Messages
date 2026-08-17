package Y6;

import androidx.fragment.app.I;
import com.swmansion.rnscreens.C2311y;
import com.swmansion.rnscreens.r;
import i7.C2750m;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class c {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f12947a;

        static {
            int[] iArr = new int[C2311y.d.values().length];
            try {
                iArr[C2311y.d.f25442g.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C2311y.d.f25443h.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C2311y.d.f25444i.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[C2311y.d.f25446k.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[C2311y.d.f25447l.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[C2311y.d.f25445j.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[C2311y.d.f25448m.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[C2311y.d.f25449n.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[C2311y.d.f25450o.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f12947a = iArr;
        }
    }

    public static final void a(I i10, C2311y.d stackAnimation, boolean z10) {
        AbstractC2855l.g(i10, "<this>");
        AbstractC2855l.g(stackAnimation, "stackAnimation");
        if (z10) {
            switch (a.f12947a[stackAnimation.ordinal()]) {
                case 1:
                    i10.r(r.f25327a, r.f25328b);
                    return;
                case 2:
                    int i11 = r.f25343q;
                    i10.r(i11, i11);
                    return;
                case 3:
                    i10.r(r.f25332f, r.f25333g);
                    return;
                case 4:
                    i10.r(r.f25349w, r.f25351y);
                    return;
                case 5:
                    i10.r(r.f25348v, r.f25352z);
                    return;
                case 6:
                    i10.r(r.f25347u, r.f25346t);
                    return;
                case 7:
                    i10.r(r.f25331e, r.f25345s);
                    return;
                case 8:
                    i10.r(r.f25342p, r.f25340n);
                    return;
                case 9:
                    i10.r(r.f25338l, r.f25336j);
                    return;
                default:
                    throw new C2750m();
            }
        }
        switch (a.f12947a[stackAnimation.ordinal()]) {
            case 1:
                i10.r(r.f25329c, r.f25330d);
                return;
            case 2:
                int i12 = r.f25343q;
                i10.r(i12, i12);
                return;
            case 3:
                i10.r(r.f25332f, r.f25333g);
                return;
            case 4:
                i10.r(r.f25348v, r.f25352z);
                return;
            case 5:
                i10.r(r.f25349w, r.f25351y);
                return;
            case 6:
                i10.r(r.f25346t, r.f25350x);
                return;
            case 7:
                i10.r(r.f25344r, r.f25334h);
                return;
            case 8:
                i10.r(r.f25339m, r.f25341o);
                return;
            case 9:
                i10.r(r.f25335i, r.f25337k);
                return;
            default:
                throw new C2750m();
        }
    }
}
