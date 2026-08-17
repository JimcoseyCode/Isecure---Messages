package c8;

import c8.C1904f0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: c8.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
class C1925u implements Function1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f19023g;

    public C1925u(String str) {
        this.f19023g = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return AbstractC1890X.n(this.f19023g, (C1904f0.a.C0202a) obj);
    }
}
