package R;

import android.opengl.EGLSurface;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static g d(EGLSurface eGLSurface, int i10, int i11) {
        return new c(eGLSurface, i10, i11);
    }

    public abstract EGLSurface a();

    public abstract int b();

    public abstract int c();
}
