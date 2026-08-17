package c8;

import c8.C1904f0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: c8.B, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
class C1869B implements Function1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f18921g;

    public C1869B(String str) {
        this.f18921g = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return AbstractC1890X.u(this.f18921g, (C1904f0.a.C0202a) obj);
    }
}
