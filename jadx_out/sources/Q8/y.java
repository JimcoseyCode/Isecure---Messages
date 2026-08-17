package q8;

import C8.S;
import L7.H;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
class y implements Function1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final S f30894g;

    public y(S s10) {
        this.f30894g = s10;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return z.c(this.f30894g, (H) obj);
    }
}
