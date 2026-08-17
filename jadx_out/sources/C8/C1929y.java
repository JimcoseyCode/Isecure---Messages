package c8;

import c8.C1904f0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: c8.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
class C1929y implements Function1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f19028g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f19029h;

    public C1929y(String str, String str2) {
        this.f19028g = str;
        this.f19029h = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return AbstractC1890X.q(this.f19028g, this.f19029h, (C1904f0.a.C0202a) obj);
    }
}
