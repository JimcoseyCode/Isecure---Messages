package H4;

/* JADX INFO: renamed from: H4.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C0782d extends W {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AbstractC0784f f3760i;

    C0782d(AbstractC0784f abstractC0784f, int i10) {
        super(abstractC0784f.size(), i10);
        this.f3760i = abstractC0784f;
    }

    @Override // H4.W
    protected final Object b(int i10) {
        return this.f3760i.get(i10);
    }
}
