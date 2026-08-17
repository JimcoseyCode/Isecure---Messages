package Z;

import Z.C1564c;
import android.util.Range;
import com.facebook.react.uimanager.ViewDefaults;

/* JADX INFO: renamed from: Z.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1562a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Range f13324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Range f13325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AbstractC1562a f13326c;

    /* JADX INFO: renamed from: Z.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static abstract class AbstractC0136a {
        AbstractC0136a() {
        }

        public abstract AbstractC1562a a();

        public abstract AbstractC0136a b(Range range);

        public abstract AbstractC0136a c(int i10);

        public abstract AbstractC0136a d(Range range);

        public abstract AbstractC0136a e(int i10);
    }

    static {
        Integer numValueOf = Integer.valueOf(ViewDefaults.NUMBER_OF_LINES);
        f13324a = new Range(0, numValueOf);
        f13325b = new Range(0, numValueOf);
        f13326c = a().c(0).a();
    }

    AbstractC1562a() {
    }

    public static AbstractC0136a a() {
        return new C1564c.b().f(-1).e(-1).c(-1).b(f13324a).d(f13325b);
    }

    public abstract Range b();

    public abstract int c();

    public abstract Range d();

    public abstract int e();

    public abstract int f();
}
