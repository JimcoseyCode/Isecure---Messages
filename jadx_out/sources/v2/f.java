package V2;

import android.graphics.Bitmap;
import g2.h;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static f f11633a;

    private f() {
    }

    public static f a() {
        if (f11633a == null) {
            f11633a = new f();
        }
        return f11633a;
    }

    @Override // g2.h
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void release(Bitmap bitmap) {
        bitmap.recycle();
    }
}
