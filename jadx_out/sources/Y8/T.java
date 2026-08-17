package y8;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
class T implements Function1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final X f34062g;

    public T(X x10) {
        this.f34062g = x10;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return X.v(this.f34062g, ((Number) obj).intValue());
    }
}
