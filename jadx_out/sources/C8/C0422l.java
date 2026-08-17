package C8;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: C8.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
class C0422l implements Function1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AbstractC0430p f659g;

    public C0422l(AbstractC0430p abstractC0430p) {
        this.f659g = abstractC0430p;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return AbstractC0430p.D(this.f659g, (S) obj);
    }
}
