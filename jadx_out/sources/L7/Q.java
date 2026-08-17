package L7;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
class Q implements Function1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final k8.c f7304g;

    public Q(k8.c cVar) {
        this.f7304g = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return Boolean.valueOf(S.g(this.f7304g, (k8.c) obj));
    }
}
