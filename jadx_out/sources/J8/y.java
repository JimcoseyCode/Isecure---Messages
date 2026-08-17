package J8;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
class y implements Function1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final z f6951g;

    public y(z zVar) {
        this.f6951g = zVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return Integer.valueOf(z.f(this.f6951g, (String) obj));
    }
}
