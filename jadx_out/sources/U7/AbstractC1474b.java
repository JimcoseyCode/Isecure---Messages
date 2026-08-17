package U7;

import I7.o;
import c8.C1915l;
import c8.EnumC1909i;
import c8.EnumC1913k;
import j7.AbstractC2793j;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: U7.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1474b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f11495c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map f11496d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final D f11497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap f11498b;

    /* JADX INFO: renamed from: U7.b$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (EnumC1475c enumC1475c : EnumC1475c.values()) {
            String strJ = enumC1475c.j();
            if (linkedHashMap.get(strJ) == null) {
                linkedHashMap.put(strJ, enumC1475c);
            }
        }
        f11496d = linkedHashMap;
    }

    public AbstractC1474b(D javaTypeEnhancementState) {
        AbstractC2855l.g(javaTypeEnhancementState, "javaTypeEnhancementState");
        this.f11497a = javaTypeEnhancementState;
        this.f11498b = new ConcurrentHashMap();
    }

    private final Set b(Set set) {
        return set.contains(EnumC1475c.f11502k) ? j7.T.k(j7.T.j(AbstractC2793j.I0(EnumC1475c.values()), EnumC1475c.f11503l), set) : set;
    }

    private final w e(Object obj) {
        C1915l c1915lI;
        w wVarU = u(obj);
        if (wVarU != null) {
            return wVarU;
        }
        Pair pairW = w(obj);
        if (pairW == null) {
            return null;
        }
        Object first = pairW.getFirst();
        Set set = (Set) pairW.getSecond();
        O oT = t(obj);
        if (oT == null) {
            oT = s(first);
        }
        if (oT.k() || (c1915lI = i(first, C1473a.f11494g)) == null) {
            return null;
        }
        return new w(C1915l.b(c1915lI, null, oT.m(), 1, null), set, false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(Object extractNullability) {
        AbstractC2855l.g(extractNullability, "$this$extractNullability");
        return false;
    }

    private final C1915l i(Object obj, Function1 function1) {
        C1915l c1915lQ;
        C1915l c1915lQ2 = q(obj, ((Boolean) function1.invoke(obj)).booleanValue());
        if (c1915lQ2 != null) {
            return c1915lQ2;
        }
        Object objV = v(obj);
        if (objV == null) {
            return null;
        }
        O oS = s(obj);
        if (oS.k() || (c1915lQ = q(objV, ((Boolean) function1.invoke(objV)).booleanValue())) == null) {
            return null;
        }
        return C1915l.b(c1915lQ, null, oS.m(), 1, null);
    }

    private final Object j(Object obj, k8.c cVar) {
        for (Object obj2 : m(obj)) {
            if (AbstractC2855l.b(k(obj2), cVar)) {
                return obj2;
            }
        }
        return null;
    }

    private final boolean n(Object obj, k8.c cVar) {
        Iterable iterableM = m(obj);
        if ((iterableM instanceof Collection) && ((Collection) iterableM).isEmpty()) {
            return false;
        }
        Iterator it = iterableM.iterator();
        while (it.hasNext()) {
            if (AbstractC2855l.b(k(it.next()), cVar)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0067, code lost:
    
        if (r6.equals("ALWAYS") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007c, code lost:
    
        if (r6.equals("NEVER") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0085, code lost:
    
        if (r6.equals("MAYBE") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0088, code lost:
    
        r6 = c8.EnumC1913k.f19006h;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final C1915l q(Object obj, boolean z10) {
        EnumC1913k enumC1913k;
        k8.c cVarK = k(obj);
        if (cVarK == null) {
            return null;
        }
        O o10 = (O) this.f11497a.c().invoke(cVarK);
        if (o10.k()) {
            return null;
        }
        if (J.m().contains(cVarK)) {
            enumC1913k = EnumC1913k.f19007i;
        } else if (J.n().contains(cVarK)) {
            enumC1913k = EnumC1913k.f19006h;
        } else if (J.b().contains(cVarK)) {
            enumC1913k = EnumC1913k.f19005g;
        } else {
            if (!AbstractC2855l.b(cVarK, J.c())) {
                return null;
            }
            String str = (String) AbstractC2800q.f0(c(obj, false));
            if (str != null) {
                switch (str.hashCode()) {
                    case 73135176:
                        break;
                    case 74175084:
                        break;
                    case 433141802:
                        if (str.equals("UNKNOWN")) {
                            enumC1913k = EnumC1913k.f19005g;
                        }
                        break;
                    case 1933739535:
                        break;
                }
                return null;
            }
            enumC1913k = EnumC1913k.f19007i;
        }
        return new C1915l(enumC1913k, o10.m() || z10);
    }

    private final O r(Object obj) {
        k8.c cVarK = k(obj);
        return (cVarK == null || !x.b().containsKey(cVarK)) ? s(obj) : (O) this.f11497a.c().invoke(cVarK);
    }

    private final O s(Object obj) {
        O oT = t(obj);
        return oT != null ? oT : this.f11497a.d().c();
    }

    private final O t(Object obj) {
        Iterable iterableC;
        String str;
        O o10 = (O) this.f11497a.d().e().get(k(obj));
        if (o10 != null) {
            return o10;
        }
        Object objJ = j(obj, J.p());
        if (objJ == null || (iterableC = c(objJ, false)) == null || (str = (String) AbstractC2800q.f0(iterableC)) == null) {
            return null;
        }
        O oD = this.f11497a.d().d();
        if (oD != null) {
            return oD;
        }
        int iHashCode = str.hashCode();
        if (iHashCode != -2137067054) {
            if (iHashCode != -1838656823) {
                if (iHashCode == 2656902 && str.equals("WARN")) {
                    return O.f11453j;
                }
            } else if (str.equals("STRICT")) {
                return O.f11454k;
            }
        } else if (str.equals("IGNORE")) {
            return O.f11452i;
        }
        return null;
    }

    private final w u(Object obj) {
        w wVar;
        if (this.f11497a.b() || (wVar = (w) x.a().get(k(obj))) == null) {
            return null;
        }
        O oR = r(obj);
        if (oR == O.f11452i) {
            oR = null;
        }
        if (oR == null) {
            return null;
        }
        return w.b(wVar, C1915l.b(wVar.d(), null, oR.m(), 1, null), null, false, 6, null);
    }

    private final Pair w(Object obj) {
        Object objJ;
        Object next;
        if (this.f11497a.d().f() || (objJ = j(obj, J.g())) == null) {
            return null;
        }
        Iterator it = m(obj).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (v(next) != null) {
                break;
            }
        }
        if (next == null) {
            return null;
        }
        Iterable iterableC = c(objJ, true);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it2 = iterableC.iterator();
        while (it2.hasNext()) {
            EnumC1475c enumC1475c = (EnumC1475c) f11496d.get((String) it2.next());
            if (enumC1475c != null) {
                linkedHashSet.add(enumC1475c);
            }
        }
        return new Pair(next, b(linkedHashSet));
    }

    protected abstract Iterable c(Object obj, boolean z10);

    public final E d(E e10, Iterable annotations) {
        EnumMap enumMapB;
        AbstractC2855l.g(annotations, "annotations");
        if (!this.f11497a.b()) {
            ArrayList<w> arrayList = new ArrayList();
            Iterator it = annotations.iterator();
            while (it.hasNext()) {
                w wVarE = e(it.next());
                if (wVarE != null) {
                    arrayList.add(wVarE);
                }
            }
            if (!arrayList.isEmpty()) {
                EnumMap enumMap = new EnumMap(EnumC1475c.class);
                for (w wVar : arrayList) {
                    for (EnumC1475c enumC1475c : wVar.e()) {
                        if (enumMap.containsKey(enumC1475c) && o()) {
                            w wVar2 = (w) enumMap.get(enumC1475c);
                            if (wVar2 != null) {
                                C1915l c1915lD = wVar2.d();
                                C1915l c1915lD2 = wVar.d();
                                if (!AbstractC2855l.b(c1915lD2, c1915lD) && (!c1915lD2.d() || c1915lD.d())) {
                                    wVar2 = (c1915lD2.d() || !c1915lD.d()) ? null : wVar;
                                }
                                enumMap.put(enumC1475c, wVar2);
                            }
                        } else {
                            enumMap.put(enumC1475c, wVar);
                        }
                    }
                }
                EnumMap enumMap2 = (e10 == null || (enumMapB = e10.b()) == null) ? new EnumMap(EnumC1475c.class) : new EnumMap(enumMapB);
                boolean z10 = false;
                for (Map.Entry entry : enumMap.entrySet()) {
                    EnumC1475c enumC1475c2 = (EnumC1475c) entry.getKey();
                    w wVar3 = (w) entry.getValue();
                    if (wVar3 != null) {
                        enumMap2.put(enumC1475c2, wVar3);
                        z10 = true;
                    }
                }
                if (z10) {
                    return new E(enumMap2);
                }
            }
        }
        return e10;
    }

    public final EnumC1909i g(Iterable annotations) {
        EnumC1909i enumC1909i;
        AbstractC2855l.g(annotations, "annotations");
        Iterator it = annotations.iterator();
        EnumC1909i enumC1909i2 = null;
        while (it.hasNext()) {
            k8.c cVarK = k(it.next());
            if (AbstractC2800q.X(J.o(), cVarK)) {
                enumC1909i = EnumC1909i.f18999g;
            } else if (AbstractC2800q.X(J.l(), cVarK)) {
                enumC1909i = EnumC1909i.f19000h;
            } else {
                continue;
            }
            if (enumC1909i2 != null && enumC1909i2 != enumC1909i) {
                return null;
            }
            enumC1909i2 = enumC1909i;
        }
        return enumC1909i2;
    }

    public final C1915l h(Iterable annotations, Function1 forceWarning) {
        AbstractC2855l.g(annotations, "annotations");
        AbstractC2855l.g(forceWarning, "forceWarning");
        Iterator it = annotations.iterator();
        C1915l c1915l = null;
        while (it.hasNext()) {
            C1915l c1915lI = i(it.next(), forceWarning);
            if (c1915l != null) {
                if (c1915lI != null && !AbstractC2855l.b(c1915lI, c1915l) && (!c1915lI.d() || c1915l.d())) {
                    if (c1915lI.d() || !c1915l.d()) {
                        return null;
                    }
                }
            }
            c1915l = c1915lI;
        }
        return c1915l;
    }

    protected abstract k8.c k(Object obj);

    protected abstract Object l(Object obj);

    protected abstract Iterable m(Object obj);

    public abstract boolean o();

    public final boolean p(Object annotation) {
        AbstractC2855l.g(annotation, "annotation");
        Object objJ = j(annotation, o.a.f5156H);
        if (objJ == null) {
            return false;
        }
        Iterable iterableC = c(objJ, false);
        if ((iterableC instanceof Collection) && ((Collection) iterableC).isEmpty()) {
            return false;
        }
        Iterator it = iterableC.iterator();
        while (it.hasNext()) {
            if (AbstractC2855l.b((String) it.next(), "TYPE")) {
                return true;
            }
        }
        return false;
    }

    public final Object v(Object annotation) {
        Object objV;
        AbstractC2855l.g(annotation, "annotation");
        if (this.f11497a.d().f()) {
            return null;
        }
        if (AbstractC2800q.X(J.a(), k(annotation)) || n(annotation, J.f())) {
            return annotation;
        }
        if (!n(annotation, J.h())) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = this.f11498b;
        Object objL = l(annotation);
        Object obj = concurrentHashMap.get(objL);
        if (obj != null) {
            return obj;
        }
        Iterator it = m(annotation).iterator();
        while (true) {
            if (!it.hasNext()) {
                objV = null;
                break;
            }
            objV = v(it.next());
            if (objV != null) {
                break;
            }
        }
        if (objV == null) {
            return null;
        }
        Object objPutIfAbsent = concurrentHashMap.putIfAbsent(objL, objV);
        return objPutIfAbsent == null ? objV : objPutIfAbsent;
    }
}
