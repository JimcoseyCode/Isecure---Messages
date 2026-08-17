package H1;

import Q1.k;
import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.load.resource.bitmap.C1937g;
import java.security.MessageDigest;
import v1.l;
import x1.v;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class f implements l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l f3659b;

    public f(l lVar) {
        this.f3659b = (l) k.e(lVar);
    }

    @Override // v1.l
    public v a(Context context, v vVar, int i10, int i11) {
        c cVar = (c) vVar.get();
        v c1937g = new C1937g(cVar.e(), com.bumptech.glide.b.d(context).g());
        v vVarA = this.f3659b.a(context, c1937g, i10, i11);
        if (!c1937g.equals(vVarA)) {
            c1937g.recycle();
        }
        cVar.m(this.f3659b, (Bitmap) vVarA.get());
        return vVar;
    }

    @Override // v1.f
    public boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f3659b.equals(((f) obj).f3659b);
        }
        return false;
    }

    @Override // v1.f
    public int hashCode() {
        return this.f3659b.hashCode();
    }

    @Override // v1.f
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        this.f3659b.updateDiskCacheKey(messageDigest);
    }
}
