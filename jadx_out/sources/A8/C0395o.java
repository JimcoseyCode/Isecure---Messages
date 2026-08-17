package A8;

import A8.C0393m;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: A8.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
class C0395o implements Function1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C0393m.c f181g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C0393m f182h;

    public C0395o(C0393m.c cVar, C0393m c0393m) {
        this.f181g = cVar;
        this.f182h = c0393m;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return C0393m.c.f(this.f181g, this.f182h, (k8.f) obj);
    }
}
