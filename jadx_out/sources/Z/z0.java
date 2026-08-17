package Z;

import Z.C1575n;
import android.util.Range;
import com.facebook.react.uimanager.ViewDefaults;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Range f13529a = new Range(0, Integer.valueOf(ViewDefaults.NUMBER_OF_LINES));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1585y f13530b;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static abstract class a {
        a() {
        }

        public abstract z0 a();

        abstract a b(int i10);

        public abstract a c(Range range);

        public abstract a d(int i10);

        public abstract a e(C1585y c1585y);
    }

    static {
        AbstractC1582v abstractC1582v = AbstractC1582v.f13485c;
        f13530b = C1585y.e(Arrays.asList(abstractC1582v, AbstractC1582v.f13484b, AbstractC1582v.f13483a), AbstractC1577p.a(abstractC1582v));
    }

    z0() {
    }

    public static a a() {
        return new C1575n.b().e(f13530b).d(0).c(f13529a).b(-1);
    }

    abstract int b();

    public abstract Range c();

    public abstract int d();

    public abstract C1585y e();

    public abstract a f();
}
