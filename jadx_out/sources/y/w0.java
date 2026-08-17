package y;

import android.graphics.Rect;
import android.util.Size;
import android.view.Surface;
import java.io.Closeable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public interface w0 extends Closeable {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static abstract class a {
        public static a f(Size size, Rect rect, F.M m10, int i10, boolean z10) {
            return new C3576e(size, rect, m10, i10, z10);
        }

        public abstract F.M a();

        public abstract Rect b();

        public abstract Size c();

        public abstract boolean d();

        public abstract int e();
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static abstract class b {
        b() {
        }

        public static b c(int i10, w0 w0Var) {
            return new C3578f(i10, w0Var);
        }

        public abstract int a();

        public abstract w0 b();
    }

    Size b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    int getFormat();

    Surface o(Executor executor, H0.a aVar);

    void v(float[] fArr, float[] fArr2, boolean z10);

    void w(float[] fArr, float[] fArr2);
}
