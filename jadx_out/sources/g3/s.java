package g3;

import android.graphics.Bitmap;
import java.util.Set;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f28202a;

    public s() {
        Set setB = c2.m.b();
        AbstractC2855l.f(setB, "newIdentityHashSet(...)");
        this.f28202a = setB;
    }

    @Override // f2.InterfaceC2605f
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Bitmap get(int i10) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, (int) Math.ceil(((double) i10) / 2.0d), Bitmap.Config.RGB_565);
        AbstractC2855l.f(bitmapCreateBitmap, "createBitmap(...)");
        this.f28202a.add(bitmapCreateBitmap);
        return bitmapCreateBitmap;
    }

    @Override // f2.InterfaceC2605f, g2.h
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void release(Bitmap value) {
        AbstractC2855l.g(value, "value");
        this.f28202a.remove(value);
        value.recycle();
    }
}
