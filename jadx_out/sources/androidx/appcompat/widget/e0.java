package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class e0 extends W {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakReference f14978b;

    public e0(Context context, Resources resources) {
        super(resources);
        this.f14978b = new WeakReference(context);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i10) {
        Drawable drawableA = a(i10);
        Context context = (Context) this.f14978b.get();
        if (drawableA != null && context != null) {
            V.g().w(context, i10, drawableA);
        }
        return drawableA;
    }
}
