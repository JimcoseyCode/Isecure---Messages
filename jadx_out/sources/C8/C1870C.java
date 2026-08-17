package c8;

import c8.C1904f0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: c8.C, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
class C1870C implements Function1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f18922g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f18923h;

    public C1870C(String str, String str2) {
        this.f18922g = str;
        this.f18923h = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return AbstractC1890X.v(this.f18922g, this.f18923h, (C1904f0.a.C0202a) obj);
    }
}
