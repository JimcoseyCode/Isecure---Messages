package c8;

import c8.AbstractC1899d;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: c8.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
class C1897c implements Function1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AbstractC1899d f18959g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final G8.o f18960h;

    public C1897c(AbstractC1899d abstractC1899d, G8.o oVar) {
        this.f18959g = abstractC1899d;
        this.f18960h = oVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return AbstractC1899d.I(this.f18959g, this.f18960h, (AbstractC1899d.a) obj);
    }
}
