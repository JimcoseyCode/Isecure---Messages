package S0;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class c extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f10245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Uri f10246c;

    c(a aVar, Context context, Uri uri) {
        super(aVar);
        this.f10245b = context;
        this.f10246c = uri;
    }

    @Override // S0.a
    public boolean a() {
        return b.a(this.f10245b, this.f10246c);
    }

    @Override // S0.a
    public boolean b() {
        return b.b(this.f10245b, this.f10246c);
    }

    @Override // S0.a
    public a c(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // S0.a
    public a d(String str, String str2) {
        throw new UnsupportedOperationException();
    }

    @Override // S0.a
    public boolean e() {
        try {
            return DocumentsContract.deleteDocument(this.f10245b.getContentResolver(), this.f10246c);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // S0.a
    public boolean f() {
        return b.d(this.f10245b, this.f10246c);
    }

    @Override // S0.a
    public String i() {
        return b.e(this.f10245b, this.f10246c);
    }

    @Override // S0.a
    public String k() {
        return b.g(this.f10245b, this.f10246c);
    }

    @Override // S0.a
    public Uri l() {
        return this.f10246c;
    }

    @Override // S0.a
    public boolean m() {
        return b.h(this.f10245b, this.f10246c);
    }

    @Override // S0.a
    public boolean n() {
        return b.i(this.f10245b, this.f10246c);
    }

    @Override // S0.a
    public long o() {
        return b.j(this.f10245b, this.f10246c);
    }

    @Override // S0.a
    public long p() {
        return b.k(this.f10245b, this.f10246c);
    }

    @Override // S0.a
    public a[] q() {
        throw new UnsupportedOperationException();
    }
}
