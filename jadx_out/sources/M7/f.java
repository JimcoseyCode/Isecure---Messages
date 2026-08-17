package M7;

import L7.H;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
class f implements Function1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final I7.i f7564g;

    public f(I7.i iVar) {
        this.f7564g = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return g.d(this.f7564g, (H) obj);
    }
}
