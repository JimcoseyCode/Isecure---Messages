package U7;

import L7.InterfaceC1277b;
import L7.g0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: U7.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
class C1477e implements Function1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final g0 f11508g;

    public C1477e(g0 g0Var) {
        this.f11508g = g0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return Boolean.valueOf(C1478f.l(this.f11508g, (InterfaceC1277b) obj));
    }
}
