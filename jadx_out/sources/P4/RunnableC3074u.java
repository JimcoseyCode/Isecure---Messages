package p4;

import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: renamed from: p4.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC3074u implements Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ BinderC3077x f30649g;

    RunnableC3074u(BinderC3077x binderC3077x) {
        this.f30649g = binderC3077x;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f30649g.f30659i.b(new ConnectionResult(4));
    }
}
