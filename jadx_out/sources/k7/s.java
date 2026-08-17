package K7;

import L7.InterfaceC1277b;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
class s implements Function1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final u f7168g;

    public s(u uVar) {
        this.f7168g = uVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return u.G(this.f7168g, (InterfaceC1277b) obj);
    }
}
