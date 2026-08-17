package w1;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: w1.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class C3467f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final C3462a f33093f = new C3462a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3462a f33094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3466e f33095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final y1.b f33096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ContentResolver f33097d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f33098e;

    C3467f(List list, InterfaceC3466e interfaceC3466e, y1.b bVar, ContentResolver contentResolver) {
        this(list, f33093f, interfaceC3466e, bVar, contentResolver);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String b(Uri uri) throws Throwable {
        Cursor cursorA;
        Cursor cursor = null;
        try {
            cursorA = this.f33095b.a(uri);
            if (cursorA != null) {
                try {
                    try {
                        if (cursorA.moveToFirst()) {
                            String string = cursorA.getString(0);
                            cursorA.close();
                            return string;
                        }
                    } catch (SecurityException unused) {
                        if (Log.isLoggable("ThumbStreamOpener", 3)) {
                            Objects.toString(uri);
                        }
                        if (cursorA != null) {
                            cursorA.close();
                        }
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorA;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursorA != null) {
                cursorA.close();
            }
            return null;
        } catch (SecurityException unused2) {
            cursorA = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
            }
            throw th;
        }
    }

    private boolean c(File file) {
        return this.f33094a.a(file) && 0 < this.f33094a.c(file);
    }

    int a(Uri uri) {
        InputStream inputStreamOpenInputStream = null;
        try {
            try {
                inputStreamOpenInputStream = this.f33097d.openInputStream(uri);
                int iB = com.bumptech.glide.load.a.b(this.f33098e, inputStreamOpenInputStream, this.f33096c);
                if (inputStreamOpenInputStream != null) {
                    try {
                        inputStreamOpenInputStream.close();
                    } catch (IOException unused) {
                    }
                }
                return iB;
            } catch (IOException | NullPointerException unused2) {
                if (Log.isLoggable("ThumbStreamOpener", 3)) {
                    Objects.toString(uri);
                }
                if (inputStreamOpenInputStream == null) {
                    return -1;
                }
                try {
                    inputStreamOpenInputStream.close();
                    return -1;
                } catch (IOException unused3) {
                    return -1;
                }
            }
        } catch (Throwable th) {
            if (inputStreamOpenInputStream != null) {
                try {
                    inputStreamOpenInputStream.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
    }

    public InputStream d(Uri uri) throws Throwable {
        String strB = b(uri);
        if (TextUtils.isEmpty(strB)) {
            return null;
        }
        File fileB = this.f33094a.b(strB);
        if (!c(fileB)) {
            return null;
        }
        Uri uriFromFile = Uri.fromFile(fileB);
        try {
            return this.f33097d.openInputStream(uriFromFile);
        } catch (NullPointerException e10) {
            throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + uriFromFile).initCause(e10));
        }
    }

    C3467f(List list, C3462a c3462a, InterfaceC3466e interfaceC3466e, y1.b bVar, ContentResolver contentResolver) {
        this.f33094a = c3462a;
        this.f33095b = interfaceC3466e;
        this.f33096c = bVar;
        this.f33097d = contentResolver;
        this.f33098e = list;
    }
}
