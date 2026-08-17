package y1;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class e implements d {
    @Override // y1.d
    public void c(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // y1.d
    public Bitmap d(int i10, int i11, Bitmap.Config config) {
        return Bitmap.createBitmap(i10, i11, config);
    }

    @Override // y1.d
    public Bitmap e(int i10, int i11, Bitmap.Config config) {
        return d(i10, i11, config);
    }

    @Override // y1.d
    public void b() {
    }

    @Override // y1.d
    public void a(int i10) {
    }
}
