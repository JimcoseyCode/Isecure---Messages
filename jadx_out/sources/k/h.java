package K;

import y.M0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h implements M0 {
    public static M0 e(float f10, float f11, float f12, float f13) {
        return new a(f10, f11, f12, f13);
    }

    public static M0 f(M0 m02) {
        return new a(m02.c(), m02.a(), m02.b(), m02.d());
    }

    @Override // y.M0
    public abstract float a();

    @Override // y.M0
    public abstract float b();

    @Override // y.M0
    public abstract float c();

    @Override // y.M0
    public abstract float d();
}
