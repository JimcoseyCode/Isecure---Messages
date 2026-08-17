package x0;

import E0.h;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import com.facebook.react.common.assets.ReactFontManager;
import com.facebook.react.uimanager.ViewDefaults;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import w0.AbstractC3458e;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
abstract class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ConcurrentHashMap f33202a = new ConcurrentHashMap();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements b {
        a() {
        }

        @Override // x0.C.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int a(h.b bVar) {
            return bVar.g();
        }

        @Override // x0.C.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean b(h.b bVar) {
            return bVar.h();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private interface b {
        int a(Object obj);

        boolean b(Object obj);
    }

    C() {
    }

    private static Object f(Object[] objArr, int i10, b bVar) {
        return g(objArr, (i10 & 1) == 0 ? ReactFontManager.TypefaceStyle.NORMAL : ReactFontManager.TypefaceStyle.BOLD, (i10 & 2) != 0, bVar);
    }

    private static Object g(Object[] objArr, int i10, boolean z10, b bVar) {
        Object obj = null;
        int i11 = ViewDefaults.NUMBER_OF_LINES;
        for (Object obj2 : objArr) {
            int iAbs = (Math.abs(bVar.a(obj2) - i10) * 2) + (bVar.b(obj2) == z10 ? 0 : 1);
            if (obj == null || i11 > iAbs) {
                obj = obj2;
                i11 = iAbs;
            }
        }
        return obj;
    }

    public abstract Typeface a(Context context, AbstractC3458e.c cVar, Resources resources, int i10);

    public abstract Typeface b(Context context, CancellationSignal cancellationSignal, h.b[] bVarArr, int i10);

    public Typeface c(Context context, CancellationSignal cancellationSignal, List list, int i10) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    protected Typeface d(Context context, InputStream inputStream) {
        File fileE = D.e(context);
        if (fileE == null) {
            return null;
        }
        try {
            if (D.d(fileE, inputStream)) {
                return Typeface.createFromFile(fileE.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileE.delete();
        }
    }

    public Typeface e(Context context, Resources resources, int i10, String str, int i11) {
        File fileE = D.e(context);
        if (fileE == null) {
            return null;
        }
        try {
            if (D.c(fileE, resources, i10)) {
                return Typeface.createFromFile(fileE.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileE.delete();
        }
    }

    protected h.b h(h.b[] bVarArr, int i10) {
        return (h.b) f(bVarArr, i10, new a());
    }
}
