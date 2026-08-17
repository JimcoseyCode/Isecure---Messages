package p4;

import com.google.android.gms.signin.internal.zak;

/* JADX INFO: renamed from: p4.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC3075v implements Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ zak f30650g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ BinderC3077x f30651h;

    RunnableC3075v(BinderC3077x binderC3077x, zak zakVar) {
        this.f30651h = binderC3077x;
        this.f30650g = zakVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BinderC3077x.z(this.f30651h, this.f30650g);
    }
}
