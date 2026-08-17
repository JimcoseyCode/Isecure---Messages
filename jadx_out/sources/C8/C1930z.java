package c8;

import c8.C1904f0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: c8.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
class C1930z implements Function1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f19030g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f19031h;

    public C1930z(String str, String str2) {
        this.f19030g = str;
        this.f19031h = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return AbstractC1890X.r(this.f19030g, this.f19031h, (C1904f0.a.C0202a) obj);
    }
}
