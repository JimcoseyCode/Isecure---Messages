package c8;

import c8.C1904f0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: c8.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
class C1918n implements Function1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f19016g;

    public C1918n(String str) {
        this.f19016g = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return AbstractC1890X.g(this.f19016g, (C1904f0.a.C0202a) obj);
    }
}
