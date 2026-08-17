package P4;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class t extends AbstractC1367a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final N f8829a = new N();

    t() {
    }

    @Override // P4.AbstractC1367a
    public final boolean a() {
        return this.f8829a.o();
    }

    @Override // P4.AbstractC1367a
    public final AbstractC1367a b(InterfaceC1375i interfaceC1375i) {
        this.f8829a.h(AbstractC1380n.f8825a, new p(this, interfaceC1375i));
        return this;
    }

    public final void c() {
        this.f8829a.w(null);
    }
}
