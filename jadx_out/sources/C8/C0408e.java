package C8;

import C8.u0;
import java.util.Collection;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: C8.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
class C0408e implements Function1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Collection f631g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final u0 f632h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final G8.o f633i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final G8.j f634j;

    public C0408e(Collection collection, u0 u0Var, G8.o oVar, G8.j jVar) {
        this.f631g = collection;
        this.f632h = u0Var;
        this.f633i = oVar;
        this.f634j = jVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return C0412g.x(this.f631g, this.f632h, this.f633i, this.f634j, (u0.a) obj);
    }
}
