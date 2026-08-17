package h6;

import I4.C1069x9;
import I4.J9;
import android.content.Context;
import c6.AbstractC1860e;
import c6.C1864i;
import e6.C2428b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class h extends AbstractC1860e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1864i f28478b;

    public h(C1864i c1864i) {
        this.f28478b = c1864i;
    }

    @Override // c6.AbstractC1860e
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        C2428b c2428b = (C2428b) obj;
        Context contextB = this.f28478b.b();
        C1069x9 c1069x9B = J9.b(b.d());
        return new k(this.f28478b, c2428b, (n.c(contextB) || com.google.android.gms.common.b.f().a(contextB) >= 204500000) ? new n(contextB, c2428b, c1069x9B) : new p(contextB, c2428b, c1069x9B), c1069x9B);
    }
}
