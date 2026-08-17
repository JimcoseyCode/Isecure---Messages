package o8;

import L7.InterfaceC1276a;
import L7.InterfaceC1288m;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: o8.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
class C3024f implements Function2 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC1276a f30517g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final InterfaceC1276a f30518h;

    public C3024f(InterfaceC1276a interfaceC1276a, InterfaceC1276a interfaceC1276a2) {
        this.f30517g = interfaceC1276a;
        this.f30518h = interfaceC1276a2;
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(Object obj, Object obj2) {
        return Boolean.valueOf(C3025g.i(this.f30517g, this.f30518h, (InterfaceC1288m) obj, (InterfaceC1288m) obj2));
    }
}
