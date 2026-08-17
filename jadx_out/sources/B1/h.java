package B1;

import android.net.Uri;
import android.text.TextUtils;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class h implements v1.f {
    private static final String ALLOWED_URI_CHARS = "@#&=*+-_.,:!?()/~'%;$[]";
    private volatile byte[] cacheKeyBytes;
    private int hashCode;
    private final i headers;
    private String safeStringUrl;
    private URL safeUrl;
    private final String stringUrl;
    private final URL url;

    public h(URL url) {
        this(url, i.f279b);
    }

    private byte[] b() {
        if (this.cacheKeyBytes == null) {
            this.cacheKeyBytes = getCacheKey().getBytes(v1.f.f32884a);
        }
        return this.cacheKeyBytes;
    }

    private String c() {
        if (TextUtils.isEmpty(this.safeStringUrl)) {
            String string = this.stringUrl;
            if (TextUtils.isEmpty(string)) {
                string = ((URL) Q1.k.e(this.url)).toString();
            }
            this.safeStringUrl = Uri.encode(string, ALLOWED_URI_CHARS);
        }
        return this.safeStringUrl;
    }

    private URL d() {
        if (this.safeUrl == null) {
            this.safeUrl = new URL(c());
        }
        return this.safeUrl;
    }

    @Override // v1.f
    public boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (getCacheKey().equals(hVar.getCacheKey()) && this.headers.equals(hVar.headers)) {
                return true;
            }
        }
        return false;
    }

    public String getCacheKey() {
        String str = this.stringUrl;
        return str != null ? str : ((URL) Q1.k.e(this.url)).toString();
    }

    public Map<String, String> getHeaders() {
        return this.headers.a();
    }

    @Override // v1.f
    public int hashCode() {
        if (this.hashCode == 0) {
            int iHashCode = getCacheKey().hashCode();
            this.hashCode = iHashCode;
            this.hashCode = (iHashCode * 31) + this.headers.hashCode();
        }
        return this.hashCode;
    }

    public String toString() {
        return getCacheKey();
    }

    public String toStringUrl() {
        return c();
    }

    public URL toURL() throws MalformedURLException {
        return d();
    }

    @Override // v1.f
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(b());
    }

    public h(String str) {
        this(str, i.f279b);
    }

    public h(URL url, i iVar) {
        this.url = (URL) Q1.k.e(url);
        this.stringUrl = null;
        this.headers = (i) Q1.k.e(iVar);
    }

    public h(String str, i iVar) {
        this.url = null;
        this.stringUrl = Q1.k.c(str);
        this.headers = (i) Q1.k.e(iVar);
    }
}
