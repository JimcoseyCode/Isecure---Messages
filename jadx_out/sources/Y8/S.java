package y8;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
class S implements Function1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final X f34061g;

    public S(X x10) {
        this.f34061g = x10;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return X.f(this.f34061g, ((Number) obj).intValue());
    }
}
