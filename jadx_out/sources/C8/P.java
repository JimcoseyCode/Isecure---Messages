package C8;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
class P implements Function1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Q f602g;

    public P(Q q10) {
        this.f602g = q10;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return Q.f(this.f602g, (D8.g) obj);
    }
}
