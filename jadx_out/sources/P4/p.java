package P4;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class p implements InterfaceC1374h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC1375i f8827a;

    p(t tVar, InterfaceC1375i interfaceC1375i) {
        this.f8827a = interfaceC1375i;
    }

    @Override // P4.InterfaceC1374h
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        this.f8827a.onCanceled();
    }
}
