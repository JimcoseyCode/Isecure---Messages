package C8;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: C8.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
class C0426n implements Function1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AbstractC0430p f666g;

    public C0426n(AbstractC0430p abstractC0430p) {
        this.f666g = abstractC0430p;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return AbstractC0430p.F(this.f666g, (S) obj);
    }
}
