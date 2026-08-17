package K;

import F.AbstractC0481f;
import F.D1;
import F.E;
import F.E1;
import F.InterfaceC0490j0;
import F.J;
import F.L;
import F.o1;
import F.r1;
import F.t1;
import H.z;
import K.f;
import android.graphics.Rect;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import com.facebook.react.uimanager.ViewDefaults;
import j7.K;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2855l;
import y.C3563H;
import y.J0;
import y.p0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final E1 f7007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private J f7008d;

    public n(E1 useCaseConfigFactory, J j10) {
        AbstractC2855l.g(useCaseConfigFactory, "useCaseConfigFactory");
        this.f7007c = useCaseConfigFactory;
        this.f7008d = j10;
    }

    private final Pair c(int i10, L l10, List list) {
        ArrayList arrayList = new ArrayList();
        String strF = l10.f();
        AbstractC2855l.f(strF, "getCameraId(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            J0 j02 = (J0) it.next();
            o1 o1VarG = j02.g();
            if (o1VarG == null) {
                throw new IllegalArgumentException("Attached stream spec cannot be null for already attached use cases.");
            }
            J j10 = this.f7008d;
            if (j10 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            int iP = j02.p();
            Size sizeH = j02.h();
            if (sizeH == null) {
                throw new IllegalArgumentException("Attached surface resolution cannot be null for already attached use cases.");
            }
            r1 r1VarB = j10.b(i10, strF, iP, sizeH, j02.l().F());
            AbstractC2855l.f(r1VarB, "transformSurfaceConfig(...)");
            int iP2 = j02.p();
            Size sizeH2 = j02.h();
            AbstractC2855l.d(sizeH2);
            C3563H c3563hB = o1VarG.b();
            List listQ0 = T.g.q0(j02);
            InterfaceC0490j0 interfaceC0490j0D = o1VarG.d();
            int iQ = j02.l().q(0);
            Range rangeK = j02.l().K(o1.f1588a);
            if (rangeK == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            AbstractC0481f abstractC0481fA = AbstractC0481f.a(r1VarB, iP2, sizeH2, c3563hB, listQ0, interfaceC0490j0D, iQ, rangeK, j02.l().S());
            AbstractC2855l.f(abstractC0481fA, "create(...)");
            arrayList.add(abstractC0481fA);
            linkedHashMap2.put(abstractC0481fA, j02);
            linkedHashMap.put(j02, o1VarG);
        }
        return new Pair(linkedHashMap, linkedHashMap2);
    }

    private final l d(int i10, L l10, List list, Map map, Map map2, boolean z10, boolean z11) {
        int iC;
        Rect rectI;
        String strF = l10.f();
        AbstractC2855l.f(strF, "getCameraId(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (list.isEmpty()) {
            iC = ViewDefaults.NUMBER_OF_LINES;
        } else {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            try {
                rectI = l10.i();
            } catch (NullPointerException unused) {
                rectI = null;
            }
            o oVar = new o(l10, rectI != null ? z.m(rectI) : null);
            Iterator it = list.iterator();
            while (true) {
                boolean z12 = false;
                while (it.hasNext()) {
                    J0 j02 = (J0) it.next();
                    Object obj = map2.get(j02);
                    if (obj == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    f.b bVar = (f.b) obj;
                    D1 d1I = j02.I(l10, bVar.f6992a, bVar.f6993b);
                    AbstractC2855l.f(d1I, "mergeConfigs(...)");
                    linkedHashMap2.put(d1I, j02);
                    List listM = oVar.m(d1I);
                    AbstractC2855l.f(listM, "getSortedSupportedOutputSizes(...)");
                    linkedHashMap3.put(d1I, listM);
                    if ((j02 instanceof p0) || (j02 instanceof T.g)) {
                        if (d1I.Q() == 2) {
                            z12 = true;
                        }
                    }
                }
                J j10 = this.f7008d;
                if (j10 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                t1 t1VarF = j10.f(i10, strF, new ArrayList(map.keySet()), linkedHashMap3, z12, f.U(list), z10, z11);
                AbstractC2855l.f(t1VarF, "getSuggestedStreamSpecs(...)");
                Map mapA = t1VarF.a();
                Map mapB = t1VarF.b();
                iC = t1VarF.c();
                for (Map.Entry entry : linkedHashMap2.entrySet()) {
                    Object value = entry.getValue();
                    Object obj2 = mapA.get(entry.getKey());
                    if (obj2 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    linkedHashMap.put(value, obj2);
                }
                for (Map.Entry entry2 : mapB.entrySet()) {
                    if (map.containsKey(entry2.getKey())) {
                        Object obj3 = map.get(entry2.getKey());
                        if (obj3 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        linkedHashMap.put(obj3, entry2.getValue());
                    }
                }
            }
        }
        return new l(linkedHashMap, iC);
    }

    @Override // K.m
    public void a(J cameraDeviceSurfaceManager) {
        AbstractC2855l.g(cameraDeviceSurfaceManager, "cameraDeviceSurfaceManager");
        this.f7008d = cameraDeviceSurfaceManager;
    }

    @Override // K.m
    public l b(int i10, L cameraInfoInternal, List newUseCases, List attachedUseCases, E cameraConfig, int i11, Range targetFrameRate, boolean z10, boolean z11) {
        AbstractC2855l.g(cameraInfoInternal, "cameraInfoInternal");
        AbstractC2855l.g(newUseCases, "newUseCases");
        AbstractC2855l.g(attachedUseCases, "attachedUseCases");
        AbstractC2855l.g(cameraConfig, "cameraConfig");
        AbstractC2855l.g(targetFrameRate, "targetFrameRate");
        Pair pairC = c(i10, cameraInfoInternal, attachedUseCases);
        Object second = pairC.second;
        AbstractC2855l.f(second, "second");
        Map mapL = f.L(newUseCases, cameraConfig.j(), this.f7007c, i11, targetFrameRate);
        AbstractC2855l.f(mapL, "getConfigs(...)");
        l lVarD = d(i10, cameraInfoInternal, newUseCases, (Map) second, mapL, z10, z11);
        Object first = pairC.first;
        AbstractC2855l.f(first, "first");
        return new l(K.o((Map) first, lVarD.b()), lVarD.a());
    }
}
