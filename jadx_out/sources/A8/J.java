package A8;

import A8.w;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
class J implements Function1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final w.c f101g;

    public J(w.c cVar) {
        this.f101g = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return w.c.t(this.f101g, (k8.f) obj);
    }
}
