package C8;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
class T implements Function1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final v0 f608g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f609h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final r0 f610i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f611j;

    public T(v0 v0Var, List list, r0 r0Var, boolean z10) {
        this.f608g = v0Var;
        this.f609h = list;
        this.f610i = r0Var;
        this.f611j = z10;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return V.l(this.f608g, this.f609h, this.f610i, this.f611j, (D8.g) obj);
    }
}
