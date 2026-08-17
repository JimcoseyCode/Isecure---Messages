package c8;

import c8.C1904f0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: c8.D, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
class C1871D implements Function1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f18924g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f18925h;

    public C1871D(String str, String str2) {
        this.f18924g = str;
        this.f18925h = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return AbstractC1890X.w(this.f18924g, this.f18925h, (C1904f0.a.C0202a) obj);
    }
}
