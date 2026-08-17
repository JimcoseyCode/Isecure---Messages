package I4;

/* JADX INFO: renamed from: I4.f0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C0863f0 extends AbstractC1026u {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AbstractC0885h0 f4758i;

    C0863f0(AbstractC0885h0 abstractC0885h0, int i10) {
        super(abstractC0885h0.size(), i10);
        this.f4758i = abstractC0885h0;
    }

    @Override // I4.AbstractC1026u
    protected final Object b(int i10) {
        return this.f4758i.get(i10);
    }
}
