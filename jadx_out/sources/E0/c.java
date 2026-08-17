package E0;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class a {
        static Uri a(Uri uri, String str) {
            return DocumentsContract.buildDocumentUriUsingTree(uri, str);
        }

        static String b(Uri uri) {
            return DocumentsContract.getTreeDocumentId(uri);
        }
    }

    public static Uri a(Uri uri, String str) {
        return a.a(uri, str);
    }

    public static String b(Uri uri) {
        return DocumentsContract.getDocumentId(uri);
    }

    public static String c(Uri uri) {
        return a.b(uri);
    }

    public static boolean d(Context context, Uri uri) {
        return DocumentsContract.isDocumentUri(context, uri);
    }
}
