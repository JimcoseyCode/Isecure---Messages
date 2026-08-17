package L7;

import L7.M;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
class L implements Function1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final M f7293g;

    public L(M m10) {
        this.f7293g = m10;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return M.c(this.f7293g, (M.a) obj);
    }
}
