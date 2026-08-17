package k8;

import i7.t;
import j7.AbstractC2800q;
import j7.K;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class j {
    /* JADX INFO: Access modifiers changed from: private */
    public static final b k(String str) {
        c cVarB = i.f29276a.b();
        f fVarQ = f.q(str);
        AbstractC2855l.f(fVarQ, "identifier(...)");
        return new b(cVarB, fVarQ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b l(String str) {
        c cVarF = i.f29276a.f();
        f fVarQ = f.q(str);
        AbstractC2855l.f(fVarQ, "identifier(...)");
        return new b(cVarF, fVarQ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b m(String str) {
        c cVarC = i.f29276a.c();
        f fVarQ = f.q(str);
        AbstractC2855l.f(fVarQ, "identifier(...)");
        return new b(cVarC, fVarQ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b n(String str) {
        c cVarD = i.f29276a.d();
        f fVarQ = f.q(str);
        AbstractC2855l.f(fVarQ, "identifier(...)");
        return new b(cVarD, fVarQ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b o(String str) {
        c cVarE = i.f29276a.e();
        f fVarQ = f.q(str);
        AbstractC2855l.f(fVarQ, "identifier(...)");
        return new b(cVarE, fVarQ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map p(Map map) {
        Set<Map.Entry> setEntrySet = map.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(B7.d.d(K.e(AbstractC2800q.u(setEntrySet, 10)), 16));
        for (Map.Entry entry : setEntrySet) {
            Pair pairA = t.a(entry.getValue(), entry.getKey());
            linkedHashMap.put(pairA.c(), pairA.d());
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b q(f fVar) {
        i iVar = i.f29276a;
        c cVarF = iVar.a().f();
        f fVarQ = f.q(fVar.m() + iVar.a().h().m());
        AbstractC2855l.f(fVarQ, "identifier(...)");
        return new b(cVarF, fVarQ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b r(String str) {
        c cVarG = i.f29276a.g();
        f fVarQ = f.q(str);
        AbstractC2855l.f(fVarQ, "identifier(...)");
        return new b(cVarG, fVarQ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b s(String str) {
        c cVarH = i.f29276a.h();
        f fVarQ = f.q(str);
        AbstractC2855l.f(fVarQ, "identifier(...)");
        return new b(cVarH, fVarQ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b t(b bVar) {
        c cVarF = i.f29276a.f();
        f fVarQ = f.q('U' + bVar.h().m());
        AbstractC2855l.f(fVarQ, "identifier(...)");
        return new b(cVarF, fVarQ);
    }
}
