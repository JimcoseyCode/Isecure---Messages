package g7;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.load.resource.bitmap.C1937g;
import v1.l;
import x1.v;
import y1.d;

/* JADX INFO: renamed from: g7.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2681a implements l {
    @Override // v1.l
    public final v a(Context context, v vVar, int i10, int i11) {
        if (!Q1.l.u(i10, i11)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i10 + " or height: " + i11 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        d dVarG = com.bumptech.glide.b.d(context).g();
        Bitmap bitmap = (Bitmap) vVar.get();
        if (i10 == Integer.MIN_VALUE) {
            i10 = bitmap.getWidth();
        }
        int i12 = i10;
        if (i11 == Integer.MIN_VALUE) {
            i11 = bitmap.getHeight();
        }
        Bitmap bitmapC = c(context.getApplicationContext(), dVarG, bitmap, i12, i11);
        return bitmap.equals(bitmapC) ? vVar : C1937g.d(bitmapC, dVarG);
    }

    void b(Bitmap bitmap, Bitmap bitmap2) {
        bitmap2.setDensity(bitmap.getDensity());
    }

    protected abstract Bitmap c(Context context, d dVar, Bitmap bitmap, int i10, int i11);
}
