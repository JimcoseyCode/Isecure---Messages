package d8;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: d8.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
class C2353a implements Function1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AbstractC2356d f25705g;

    public C2353a(AbstractC2356d abstractC2356d) {
        this.f25705g = abstractC2356d;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return AbstractC2356d.L(this.f25705g, (InterfaceC2376x) obj);
    }
}
