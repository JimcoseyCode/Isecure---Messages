package A8;

import A8.w;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
class I implements Function1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final w.c f100g;

    public I(w.c cVar) {
        this.f100g = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return w.c.s(this.f100g, (k8.f) obj);
    }
}
