package K7;

import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
class n implements Function1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final u f7162g;

    public n(u uVar) {
        this.f7162g = uVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return u.s(this.f7162g, (Pair) obj);
    }
}
