package S0;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import java.util.ArrayList;
import q.AbstractC3105o;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class d extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f10247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Uri f10248c;

    d(a aVar, Context context, Uri uri) {
        super(aVar);
        this.f10247b = context;
        this.f10248c = uri;
    }

    private static void r(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                AbstractC3105o.a(autoCloseable);
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    private static Uri s(Context context, Uri uri, String str, String str2) {
        try {
            return DocumentsContract.createDocument(context.getContentResolver(), uri, str, str2);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // S0.a
    public boolean a() {
        return b.a(this.f10247b, this.f10248c);
    }

    @Override // S0.a
    public boolean b() {
        return b.b(this.f10247b, this.f10248c);
    }

    @Override // S0.a
    public a c(String str) {
        Uri uriS = s(this.f10247b, this.f10248c, "vnd.android.document/directory", str);
        if (uriS != null) {
            return new d(this, this.f10247b, uriS);
        }
        return null;
    }

    @Override // S0.a
    public a d(String str, String str2) {
        Uri uriS = s(this.f10247b, this.f10248c, str, str2);
        if (uriS != null) {
            return new d(this, this.f10247b, uriS);
        }
        return null;
    }

    @Override // S0.a
    public boolean e() {
        try {
            return DocumentsContract.deleteDocument(this.f10247b.getContentResolver(), this.f10248c);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // S0.a
    public boolean f() {
        return b.d(this.f10247b, this.f10248c);
    }

    @Override // S0.a
    public String i() {
        return b.e(this.f10247b, this.f10248c);
    }

    @Override // S0.a
    public String k() {
        return b.g(this.f10247b, this.f10248c);
    }

    @Override // S0.a
    public Uri l() {
        return this.f10248c;
    }

    @Override // S0.a
    public boolean m() {
        return b.h(this.f10247b, this.f10248c);
    }

    @Override // S0.a
    public boolean n() {
        return b.i(this.f10247b, this.f10248c);
    }

    @Override // S0.a
    public long o() {
        return b.j(this.f10247b, this.f10248c);
    }

    @Override // S0.a
    public long p() {
        return b.k(this.f10247b, this.f10248c);
    }

    @Override // S0.a
    public a[] q() {
        ContentResolver contentResolver = this.f10247b.getContentResolver();
        Uri uri = this.f10248c;
        Uri uriBuildChildDocumentsUriUsingTree = DocumentsContract.buildChildDocumentsUriUsingTree(uri, DocumentsContract.getDocumentId(uri));
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = contentResolver.query(uriBuildChildDocumentsUriUsingTree, new String[]{"document_id"}, null, null, null);
                while (cursorQuery.moveToNext()) {
                    arrayList.add(DocumentsContract.buildDocumentUriUsingTree(this.f10248c, cursorQuery.getString(0)));
                }
            } catch (Exception e10) {
                e10.toString();
            }
            Uri[] uriArr = (Uri[]) arrayList.toArray(new Uri[0]);
            a[] aVarArr = new a[uriArr.length];
            for (int i10 = 0; i10 < uriArr.length; i10++) {
                aVarArr[i10] = new d(this, this.f10247b, uriArr[i10]);
            }
            return aVarArr;
        } finally {
            r(cursorQuery);
        }
    }
}
