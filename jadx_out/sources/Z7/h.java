package Z7;

import C8.AbstractC0407d0;
import L7.InterfaceC1280e;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
class h implements Function1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC1280e f13647g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final i f13648h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AbstractC0407d0 f13649i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final a f13650j;

    public h(InterfaceC1280e interfaceC1280e, i iVar, AbstractC0407d0 abstractC0407d0, a aVar) {
        this.f13647g = interfaceC1280e;
        this.f13648h = iVar;
        this.f13649i = abstractC0407d0;
        this.f13650j = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return i.k(this.f13647g, this.f13648h, this.f13649i, this.f13650j, (D8.g) obj);
    }
}
