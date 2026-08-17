package y8;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: y8.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
class C3640b implements Function1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AbstractC3641c f34078g;

    public C3640b(AbstractC3641c abstractC3641c) {
        this.f34078g = abstractC3641c;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return AbstractC3641c.f(this.f34078g, (k8.c) obj);
    }
}
