package C8;

import C8.A0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
class z0 implements Function1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final A0 f721g;

    public z0(A0 a02) {
        this.f721g = a02;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return A0.f(this.f721g, (A0.b) obj);
    }
}
