package C8;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: C8.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
class C0424m implements Function1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AbstractC0430p f661g;

    public C0424m(AbstractC0430p abstractC0430p) {
        this.f661g = abstractC0430p;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return AbstractC0430p.E(this.f661g, (v0) obj);
    }
}
