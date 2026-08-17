package W2;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class p implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static p f12007a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f12008b = false;

    protected p() {
    }

    public static synchronized p f() {
        try {
            if (f12007a == null) {
                f12007a = new p();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f12007a;
    }

    @Override // W2.k
    public W1.d a(com.facebook.imagepipeline.request.b bVar, Object obj) {
        C1495b c1495b = new C1495b(e(bVar.getSourceUri()).toString(), bVar.getResizeOptions(), bVar.getRotationOptions(), bVar.getImageDecodeOptions(), null, null);
        if (f12008b) {
            c1495b.d(null);
            return c1495b;
        }
        c1495b.d(obj);
        return c1495b;
    }

    @Override // W2.k
    public W1.d b(com.facebook.imagepipeline.request.b bVar, Uri uri, Object obj) {
        return new W1.i(e(uri).toString());
    }

    @Override // W2.k
    public W1.d c(com.facebook.imagepipeline.request.b bVar, Object obj) {
        W1.d dVar;
        String name;
        com.facebook.imagepipeline.request.d postprocessor = bVar.getPostprocessor();
        if (postprocessor != null) {
            W1.d postprocessorCacheKey = postprocessor.getPostprocessorCacheKey();
            name = postprocessor.getClass().getName();
            dVar = postprocessorCacheKey;
        } else {
            dVar = null;
            name = null;
        }
        C1495b c1495b = new C1495b(e(bVar.getSourceUri()).toString(), bVar.getResizeOptions(), bVar.getRotationOptions(), bVar.getImageDecodeOptions(), dVar, name);
        if (f12008b) {
            c1495b.d(null);
            return c1495b;
        }
        c1495b.d(obj);
        return c1495b;
    }

    @Override // W2.k
    public W1.d d(com.facebook.imagepipeline.request.b bVar, Object obj) {
        return b(bVar, bVar.getSourceUri(), obj);
    }

    protected Uri e(Uri uri) {
        return uri;
    }
}
