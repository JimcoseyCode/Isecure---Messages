package I1;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.resource.bitmap.C1937g;
import v1.h;
import x1.v;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y1.d f3910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f3911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e f3912c;

    public c(y1.d dVar, e eVar, e eVar2) {
        this.f3910a = dVar;
        this.f3911b = eVar;
        this.f3912c = eVar2;
    }

    @Override // I1.e
    public v transcode(v vVar, h hVar) {
        Drawable drawable = (Drawable) vVar.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f3911b.transcode(C1937g.d(((BitmapDrawable) drawable).getBitmap(), this.f3910a), hVar);
        }
        if (drawable instanceof H1.c) {
            return this.f3912c.transcode(a(vVar), hVar);
        }
        return null;
    }

    private static v a(v vVar) {
        return vVar;
    }
}
