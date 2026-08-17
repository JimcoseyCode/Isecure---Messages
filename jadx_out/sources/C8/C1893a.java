package c8;

import c8.AbstractC1899d;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: c8.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
class C1893a implements Function1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AbstractC1899d f18953g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AbstractC1899d.a f18954h;

    public C1893a(AbstractC1899d abstractC1899d, AbstractC1899d.a aVar) {
        this.f18953g = abstractC1899d;
        this.f18954h = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return Boolean.valueOf(AbstractC1899d.i(this.f18953g, this.f18954h, obj));
    }
}
