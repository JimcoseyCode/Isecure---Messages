package C1;

import B1.n;
import B1.o;
import B1.r;
import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.resource.bitmap.d0;
import v1.h;
import w1.AbstractC3464c;
import w1.C3465d;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class c implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f472a;

    public c(Context context) {
        this.f472a = context.getApplicationContext();
    }

    private boolean c(h hVar) {
        Long l10 = (Long) hVar.b(d0.f19238d);
        return l10 != null && l10.longValue() == -1;
    }

    @Override // B1.n
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public n.a buildLoadData(Uri uri, int i10, int i11, h hVar) {
        if (AbstractC3464c.f(i10, i11) && c(hVar)) {
            return new n.a(new P1.c(uri), C3465d.c(this.f472a, uri));
        }
        return null;
    }

    @Override // B1.n
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean handles(Uri uri) {
        return AbstractC3464c.e(uri);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class a implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f473a;

        public a(Context context) {
            this.f473a = context;
        }

        @Override // B1.o
        public n build(r rVar) {
            return new c(this.f473a);
        }

        @Override // B1.o
        public void teardown() {
        }
    }
}
