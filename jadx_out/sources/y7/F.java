package Y7;

import Y7.G;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
class F implements Function1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final G f12964g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final X7.k f12965h;

    public F(G g10, X7.k kVar) {
        this.f12964g = g10;
        this.f12965h = kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return G.i0(this.f12964g, this.f12965h, (G.a) obj);
    }
}
