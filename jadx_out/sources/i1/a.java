package I1;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
import v1.h;
import x1.v;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bitmap.CompressFormat f3907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f3908b;

    public a() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    @Override // I1.e
    public v transcode(v vVar, h hVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) vVar.get()).compress(this.f3907a, this.f3908b, byteArrayOutputStream);
        vVar.recycle();
        return new E1.b(byteArrayOutputStream.toByteArray());
    }

    public a(Bitmap.CompressFormat compressFormat, int i10) {
        this.f3907a = compressFormat;
        this.f3908b = i10;
    }
}
