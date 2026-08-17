package S0;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import q.AbstractC3105o;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
abstract class b {
    public static boolean a(Context context, Uri uri) {
        return context.checkCallingOrSelfUriPermission(uri, 1) == 0 && !TextUtils.isEmpty(f(context, uri));
    }

    public static boolean b(Context context, Uri uri) {
        if (context.checkCallingOrSelfUriPermission(uri, 2) != 0) {
            return false;
        }
        String strF = f(context, uri);
        int iL = l(context, uri, "flags", 0);
        if (TextUtils.isEmpty(strF)) {
            return false;
        }
        if ((iL & 4) != 0) {
            return true;
        }
        if (!"vnd.android.document/directory".equals(strF) || (iL & 8) == 0) {
            return (TextUtils.isEmpty(strF) || (iL & 2) == 0) ? false : true;
        }
        return true;
    }

    private static void c(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                AbstractC3105o.a(autoCloseable);
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    public static boolean d(Context context, Uri uri) {
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = context.getContentResolver().query(uri, new String[]{"document_id"}, null, null, null);
                return cursorQuery.getCount() > 0;
            } catch (Exception e10) {
                e10.toString();
                c(cursorQuery);
                return false;
            }
        } finally {
            c(cursorQuery);
        }
    }

    public static String e(Context context, Uri uri) {
        return n(context, uri, "_display_name", null);
    }

    private static String f(Context context, Uri uri) {
        return n(context, uri, "mime_type", null);
    }

    public static String g(Context context, Uri uri) {
        String strF = f(context, uri);
        if ("vnd.android.document/directory".equals(strF)) {
            return null;
        }
        return strF;
    }

    public static boolean h(Context context, Uri uri) {
        return "vnd.android.document/directory".equals(f(context, uri));
    }

    public static boolean i(Context context, Uri uri) {
        String strF = f(context, uri);
        return ("vnd.android.document/directory".equals(strF) || TextUtils.isEmpty(strF)) ? false : true;
    }

    public static long j(Context context, Uri uri) {
        return m(context, uri, "last_modified", 0L);
    }

    public static long k(Context context, Uri uri) {
        return m(context, uri, "_size", 0L);
    }

    private static int l(Context context, Uri uri, String str, int i10) {
        return (int) m(context, uri, str, i10);
    }

    private static long m(Context context, Uri uri, String str, long j10) {
        ContentResolver contentResolver = context.getContentResolver();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = contentResolver.query(uri, new String[]{str}, null, null, null);
                if (!cursorQuery.moveToFirst() || cursorQuery.isNull(0)) {
                    c(cursorQuery);
                    return j10;
                }
                long j11 = cursorQuery.getLong(0);
                c(cursorQuery);
                return j11;
            } catch (Exception e10) {
                e10.toString();
                c(cursorQuery);
                return j10;
            }
        } catch (Throwable th) {
            c(cursorQuery);
            throw th;
        }
    }

    private static String n(Context context, Uri uri, String str, String str2) {
        ContentResolver contentResolver = context.getContentResolver();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = contentResolver.query(uri, new String[]{str}, null, null, null);
                if (!cursorQuery.moveToFirst() || cursorQuery.isNull(0)) {
                    c(cursorQuery);
                    return str2;
                }
                String string = cursorQuery.getString(0);
                c(cursorQuery);
                return string;
            } catch (Exception e10) {
                e10.toString();
                c(cursorQuery);
                return str2;
            }
        } catch (Throwable th) {
            c(cursorQuery);
            throw th;
        }
    }
}
