package c8;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: c8.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
class C1895b implements Function1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C1912j0 f18956g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C1907h[] f18957h;

    public C1895b(C1912j0 c1912j0, C1907h[] c1907hArr) {
        this.f18956g = c1912j0;
        this.f18957h = c1907hArr;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return AbstractC1899d.e(this.f18956g, this.f18957h, ((Number) obj).intValue());
    }
}
