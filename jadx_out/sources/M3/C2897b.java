package m3;

import P8.q;
import X2.d;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import b3.c;
import d2.AbstractC2325a;
import d3.e;
import d3.j;
import d3.k;
import d3.p;
import j7.AbstractC2800q;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import k2.f;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w0.AbstractC3461h;

/* JADX INFO: renamed from: m3.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C2897b implements c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f29581c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Resources f29582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f29583b;

    /* JADX INFO: renamed from: m3.b$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C2897b(Resources resources) {
        AbstractC2855l.g(resources, "resources");
        this.f29582a = resources;
        this.f29583b = new ConcurrentHashMap();
    }

    private final int b(String str) {
        Map map = this.f29583b;
        Object objValueOf = map.get(str);
        if (objValueOf == null) {
            Uri uri = Uri.parse(str);
            AbstractC2855l.f(uri, "parse(...)");
            objValueOf = Integer.valueOf(c(uri));
            map.put(str, objValueOf);
        }
        return ((Number) objValueOf).intValue();
    }

    private final int c(Uri uri) {
        Integer numN;
        if (!f.n(uri) && !f.p(uri)) {
            throw new IllegalStateException(("Unsupported uri " + uri).toString());
        }
        List<String> pathSegments = uri.getPathSegments();
        AbstractC2855l.f(pathSegments, "getPathSegments(...)");
        String str = (String) AbstractC2800q.s0(pathSegments);
        if (str != null && (numN = q.n(str)) != null) {
            return numN.intValue();
        }
        throw new IllegalStateException(("Unable to read resource ID from " + uri.getPath()).toString());
    }

    @Override // b3.c
    public e a(k encodedImage, int i10, p qualityInfo, d options) {
        AbstractC2855l.g(encodedImage, "encodedImage");
        AbstractC2855l.g(qualityInfo, "qualityInfo");
        AbstractC2855l.g(options, "options");
        try {
            String strD0 = encodedImage.d0();
            if (strD0 == null) {
                throw new IllegalStateException("No source in encoded image");
            }
            Drawable drawableF = AbstractC3461h.f(this.f29582a, b(strD0), null);
            if (drawableF != null) {
                return new j(drawableF);
            }
            return null;
        } catch (Throwable th) {
            AbstractC2325a.n("XmlFormatDecoder", "Cannot decode xml", th);
            return null;
        }
    }
}
