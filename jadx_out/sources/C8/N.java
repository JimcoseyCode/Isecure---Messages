package C8;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
class N implements Function1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Function1 f591g;

    public N(Function1 function1) {
        this.f591g = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return Q.l(this.f591g, (S) obj);
    }
}
