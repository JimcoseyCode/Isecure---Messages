package U7;

import L7.InterfaceC1280e;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2855l;
import q8.C3137b;
import s8.AbstractC3340e;

/* JADX INFO: renamed from: U7.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1476d extends AbstractC1474b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1476d(D javaTypeEnhancementState) {
        super(javaTypeEnhancementState);
        AbstractC2855l.g(javaTypeEnhancementState, "javaTypeEnhancementState");
    }

    private final List B(q8.g gVar) {
        if (!(gVar instanceof C3137b)) {
            return gVar instanceof q8.k ? AbstractC2800q.e(((q8.k) gVar).c().m()) : AbstractC2800q.j();
        }
        Iterable iterable = (Iterable) ((C3137b) gVar).b();
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            AbstractC2800q.A(arrayList, B((q8.g) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // U7.AbstractC1474b
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public Iterable m(M7.c cVar) {
        M7.h annotations;
        AbstractC2855l.g(cVar, "<this>");
        InterfaceC1280e interfaceC1280eL = AbstractC3340e.l(cVar);
        return (interfaceC1280eL == null || (annotations = interfaceC1280eL.getAnnotations()) == null) ? AbstractC2800q.j() : annotations;
    }

    @Override // U7.AbstractC1474b
    public boolean o() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // U7.AbstractC1474b
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public Iterable c(M7.c cVar, boolean z10) {
        AbstractC2855l.g(cVar, "<this>");
        Map mapA = cVar.a();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : mapA.entrySet()) {
            AbstractC2800q.A(arrayList, (!z10 || AbstractC2855l.b((k8.f) entry.getKey(), I.f11398c)) ? B((q8.g) entry.getValue()) : AbstractC2800q.j());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // U7.AbstractC1474b
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public k8.c k(M7.c cVar) {
        AbstractC2855l.g(cVar, "<this>");
        return cVar.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // U7.AbstractC1474b
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public Object l(M7.c cVar) {
        AbstractC2855l.g(cVar, "<this>");
        InterfaceC1280e interfaceC1280eL = AbstractC3340e.l(cVar);
        AbstractC2855l.d(interfaceC1280eL);
        return interfaceC1280eL;
    }
}
