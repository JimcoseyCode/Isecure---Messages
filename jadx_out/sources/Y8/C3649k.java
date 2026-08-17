package y8;

import kotlin.jvm.functions.Function1;
import y8.C3650l;

/* JADX INFO: renamed from: y8.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
class C3649k implements Function1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C3650l f34097g;

    public C3649k(C3650l c3650l) {
        this.f34097g = c3650l;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return C3650l.c(this.f34097g, (C3650l.a) obj);
    }
}
