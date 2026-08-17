package Y7;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: Y7.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
class C1537a implements Function1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C1538b f13016g;

    public C1537a(C1538b c1538b) {
        this.f13016g = c1538b;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return Boolean.valueOf(C1538b.h(this.f13016g, (b8.r) obj));
    }
}
