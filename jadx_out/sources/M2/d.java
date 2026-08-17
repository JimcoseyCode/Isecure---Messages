package m2;

import c2.n;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Throwable f29563a;

        a(Throwable th) {
            this.f29563a = th;
        }

        @Override // c2.n
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c get() {
            return d.b(this.f29563a);
        }
    }

    public static n a(Throwable th) {
        return new a(th);
    }

    public static c b(Throwable th) {
        i iVarV = i.v();
        iVarV.n(th);
        return iVarV;
    }
}
