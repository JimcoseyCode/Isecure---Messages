package e2;

import android.webkit.MimeTypeMap;
import c2.g;
import java.util.Map;

/* JADX INFO: renamed from: e2.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2394b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final MimeTypeMap f25821a = MimeTypeMap.getSingleton();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f25822b = g.of("image/heif", "heif", "image/heic", "heic");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map f25823c = g.of("heif", "image/heif", "heic", "image/heic");

    public static String a(String str) {
        String str2 = (String) f25823c.get(str);
        return str2 != null ? str2 : f25821a.getMimeTypeFromExtension(str);
    }
}
