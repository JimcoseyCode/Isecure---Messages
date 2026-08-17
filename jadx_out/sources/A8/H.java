package A8;

import A8.w;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
class H implements Function1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final w.c f99g;

    public H(w.c cVar) {
        this.f99g = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return w.c.q(this.f99g, (k8.f) obj);
    }
}
