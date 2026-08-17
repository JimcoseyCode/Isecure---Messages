package C8;

import java.util.List;
import kotlin.jvm.functions.Function1;
import v8.InterfaceC3442k;

/* JADX INFO: loaded from: classes2.dex */
class U implements Function1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final v0 f612g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f613h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final r0 f614i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f615j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final InterfaceC3442k f616k;

    public U(v0 v0Var, List list, r0 r0Var, boolean z10, InterfaceC3442k interfaceC3442k) {
        this.f612g = v0Var;
        this.f613h = list;
        this.f614i = r0Var;
        this.f615j = z10;
        this.f616k = interfaceC3442k;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return V.o(this.f612g, this.f613h, this.f614i, this.f615j, this.f616k, (D8.g) obj);
    }
}
