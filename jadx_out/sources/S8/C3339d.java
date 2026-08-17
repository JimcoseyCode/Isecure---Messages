package s8;

import L7.InterfaceC1277b;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: s8.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
class C3339d implements Function1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f32329g;

    public C3339d(boolean z10) {
        this.f32329g = z10;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return AbstractC3340e.A(this.f32329g, (InterfaceC1277b) obj);
    }
}
