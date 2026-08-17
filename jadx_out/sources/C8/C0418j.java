package C8;

import C8.AbstractC0430p;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: C8.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
class C0418j implements Function1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AbstractC0430p f654g;

    public C0418j(AbstractC0430p abstractC0430p) {
        this.f654g = abstractC0430p;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return AbstractC0430p.B(this.f654g, (AbstractC0430p.b) obj);
    }
}
