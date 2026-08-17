package c8;

import c8.C1904f0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: c8.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
class C1927w implements Function1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f19025g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f19026h;

    public C1927w(String str, String str2) {
        this.f19025g = str;
        this.f19026h = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return AbstractC1890X.p(this.f19025g, this.f19026h, (C1904f0.a.C0202a) obj);
    }
}
