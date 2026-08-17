package i3;

import W1.d;
import W1.i;
import android.graphics.Bitmap;
import c2.k;
import com.facebook.imagepipeline.nativecode.NativeBlurFilter;

/* JADX INFO: renamed from: i3.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C2726a extends com.facebook.imagepipeline.request.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f28691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f28692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private d f28693c;

    public C2726a(int i10, int i11) {
        k.b(Boolean.valueOf(i10 > 0));
        k.b(Boolean.valueOf(i11 > 0));
        this.f28691a = i10;
        this.f28692b = i11;
    }

    @Override // com.facebook.imagepipeline.request.a, com.facebook.imagepipeline.request.d
    public d getPostprocessorCacheKey() {
        if (this.f28693c == null) {
            this.f28693c = new i(String.format(null, "i%dr%d", Integer.valueOf(this.f28691a), Integer.valueOf(this.f28692b)));
        }
        return this.f28693c;
    }

    @Override // com.facebook.imagepipeline.request.a
    public void process(Bitmap bitmap) {
        NativeBlurFilter.a(bitmap, this.f28691a, this.f28692b);
    }
}
