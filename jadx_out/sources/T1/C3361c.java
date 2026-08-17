package t1;

import Q1.k;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.InputStream;
import java.util.List;
import v1.h;
import v1.j;
import x1.v;

/* JADX INFO: renamed from: t1.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C3361c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f32465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3360b f32466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final y1.b f32467c;

    public C3361c(List list, C3360b c3360b, y1.b bVar) {
        this.f32465a = list;
        this.f32466b = (C3360b) k.e(c3360b);
        this.f32467c = (y1.b) k.e(bVar);
    }

    @Override // v1.j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public v decode(InputStream inputStream, int i10, int i11, h hVar) {
        return this.f32466b.decode(Q1.a.b(inputStream), i10, i11, hVar);
    }

    @Override // v1.j
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean handles(InputStream inputStream, h hVar) {
        ImageHeaderParser.ImageType imageTypeF = com.bumptech.glide.load.a.f(this.f32465a, inputStream, this.f32467c);
        return imageTypeF.equals(ImageHeaderParser.ImageType.AVIF) || imageTypeF.equals(ImageHeaderParser.ImageType.ANIMATED_AVIF);
    }
}
