package E0;

import E0.h;
import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.RemoteException;
import com.facebook.react.common.assets.ReactFontManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import l1.AbstractC2861a;
import w0.AbstractC3458e;
import x0.v;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final m0.h f1021a = new m0.h(2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Comparator f1022b = new Comparator() { // from class: E0.d
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return e.a((byte[]) obj, (byte[]) obj2);
        }
    };

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private interface a {
        static a a(Context context, Uri uri) {
            return new b(context, uri);
        }

        Cursor b(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal);

        void close();
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class b implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ContentProviderClient f1023a;

        b(Context context, Uri uri) {
            this.f1023a = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }

        @Override // E0.e.a
        public Cursor b(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
            ContentProviderClient contentProviderClient = this.f1023a;
            if (contentProviderClient == null) {
                return null;
            }
            try {
                return contentProviderClient.query(uri, strArr, str, strArr2, str2, cancellationSignal);
            } catch (RemoteException unused) {
                return null;
            }
        }

        @Override // E0.e.a
        public void close() {
            ContentProviderClient contentProviderClient = this.f1023a;
            if (contentProviderClient != null) {
                contentProviderClient.close();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f1024a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f1025b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        List f1026c;

        c(String str, String str2, List list) {
            this.f1024a = str;
            this.f1025b = str2;
            this.f1026c = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Objects.equals(this.f1024a, cVar.f1024a) && Objects.equals(this.f1025b, cVar.f1025b) && Objects.equals(this.f1026c, cVar.f1026c);
        }

        public int hashCode() {
            return Objects.hash(this.f1024a, this.f1025b, this.f1026c);
        }
    }

    public static /* synthetic */ int a(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byte b10 = bArr[i10];
            byte b11 = bArr2[i10];
            if (b10 != b11) {
                return b10 - b11;
            }
        }
        return 0;
    }

    private static List b(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    private static boolean c(List list, List list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!Arrays.equals((byte[]) list.get(i10), (byte[]) list2.get(i10))) {
                return false;
            }
        }
        return true;
    }

    private static List d(f fVar, Resources resources) {
        return fVar.b() != null ? fVar.b() : AbstractC3458e.c(resources, fVar.c());
    }

    static h.a e(Context context, List list, CancellationSignal cancellationSignal) {
        String strH;
        Typeface typefaceH;
        AbstractC2861a.c("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < list.size(); i10++) {
                f fVar = (f) list.get(i10);
                if (Build.VERSION.SDK_INT < 31 || (typefaceH = v.h((strH = fVar.h()))) == null || v.j(typefaceH) == null) {
                    ProviderInfo providerInfoF = f(context.getPackageManager(), fVar, context.getResources());
                    if (providerInfoF == null) {
                        return h.a.b(1, null);
                    }
                    arrayList.add(g(context, fVar, providerInfoF.authority, cancellationSignal));
                } else {
                    arrayList.add(new h.b[]{new h.b(strH, fVar.i())});
                }
            }
            return h.a.a(0, arrayList);
        } finally {
            AbstractC2861a.f();
        }
    }

    static ProviderInfo f(PackageManager packageManager, f fVar, Resources resources) {
        AbstractC2861a.c("FontProvider.getProvider");
        try {
            List listD = d(fVar, resources);
            c cVar = new c(fVar.e(), fVar.f(), listD);
            ProviderInfo providerInfo = (ProviderInfo) f1021a.c(cVar);
            if (providerInfo != null) {
                return providerInfo;
            }
            String strE = fVar.e();
            ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(strE, 0);
            if (providerInfoResolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + strE);
            }
            if (!providerInfoResolveContentProvider.packageName.equals(fVar.f())) {
                throw new PackageManager.NameNotFoundException("Found content provider " + strE + ", but package was not " + fVar.f());
            }
            List listB = b(packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures);
            Collections.sort(listB, f1022b);
            for (int i10 = 0; i10 < listD.size(); i10++) {
                ArrayList arrayList = new ArrayList((Collection) listD.get(i10));
                Collections.sort(arrayList, f1022b);
                if (c(listB, arrayList)) {
                    f1021a.d(cVar, providerInfoResolveContentProvider);
                    return providerInfoResolveContentProvider;
                }
            }
            AbstractC2861a.f();
            return null;
        } finally {
            AbstractC2861a.f();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e1  */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v2, types: [E0.e$a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static h.b[] g(Context context, f fVar, String str, CancellationSignal cancellationSignal) {
        ?? r16;
        a aVar;
        a aVar2;
        Uri uriWithAppendedId;
        boolean z10;
        AbstractC2861a.c("FontProvider.query");
        try {
            ArrayList arrayList = new ArrayList();
            Uri uriBuild = new Uri.Builder().scheme("content").authority(str).build();
            Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            a aVarA = a.a(context, uriBuild);
            Cursor cursorB = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                AbstractC2861a.c("ContentQueryWrapper.query");
                try {
                    try {
                        cursorB = aVarA.b(uriBuild, strArr, "query = ?", new String[]{fVar.g()}, null, cancellationSignal);
                        if (cursorB == null || cursorB.getCount() <= 0) {
                            aVar = aVarA;
                        } else {
                            int columnIndex = cursorB.getColumnIndex("result_code");
                            ArrayList arrayList2 = new ArrayList();
                            int columnIndex2 = cursorB.getColumnIndex("_id");
                            int columnIndex3 = cursorB.getColumnIndex("file_id");
                            int columnIndex4 = cursorB.getColumnIndex("font_ttc_index");
                            int columnIndex5 = cursorB.getColumnIndex("font_weight");
                            int columnIndex6 = cursorB.getColumnIndex("font_italic");
                            while (cursorB.moveToNext()) {
                                int i10 = columnIndex != -1 ? cursorB.getInt(columnIndex) : 0;
                                int i11 = columnIndex4 != -1 ? cursorB.getInt(columnIndex4) : 0;
                                if (columnIndex3 == -1) {
                                    aVar2 = aVarA;
                                    uriWithAppendedId = ContentUris.withAppendedId(uriBuild, cursorB.getLong(columnIndex2));
                                } else {
                                    aVar2 = aVarA;
                                    uriWithAppendedId = ContentUris.withAppendedId(uriBuild2, cursorB.getLong(columnIndex3));
                                }
                                int i12 = columnIndex5 != -1 ? cursorB.getInt(columnIndex5) : ReactFontManager.TypefaceStyle.NORMAL;
                                if (columnIndex6 != -1) {
                                    z10 = true;
                                    if (cursorB.getInt(columnIndex6) != 1) {
                                        z10 = false;
                                    }
                                }
                                arrayList2.add(h.b.a(uriWithAppendedId, i11, i12, z10, i10));
                                aVarA = aVar2;
                            }
                            aVar = aVarA;
                            arrayList = arrayList2;
                        }
                        if (cursorB != null) {
                            cursorB.close();
                        }
                        aVar.close();
                        return (h.b[]) arrayList.toArray(new h.b[0]);
                    } finally {
                    }
                } catch (Throwable th) {
                    th = th;
                    r16 = context;
                    if (cursorB != null) {
                        cursorB.close();
                    }
                    r16.close();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                r16 = aVarA;
            }
        } finally {
            AbstractC2861a.f();
        }
    }
}
