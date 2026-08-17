package r;

import F.AbstractC0481f;
import F.E1;
import F.InterfaceC0490j0;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC2855l;
import q.C3091a;
import r.C3171f2;
import y.AbstractC3583h0;

/* JADX INFO: renamed from: r.b2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C3155b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3155b2 f31218a = new C3155b2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final InterfaceC0490j0.a f31219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map f31220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map f31221d;

    static {
        Class cls = Long.TYPE;
        AbstractC2855l.d(cls);
        InterfaceC0490j0.a aVarA = InterfaceC0490j0.a.a("camera2.streamSpec.streamUseCase", cls);
        AbstractC2855l.f(aVarA, "create(...)");
        f31219b = aVarA;
        Map mapC = j7.K.c();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            E1.b bVar = E1.b.PREVIEW;
            E1.b bVar2 = E1.b.METERING_REPEATING;
            E1.b bVar3 = E1.b.IMAGE_ANALYSIS;
            mapC.put(4L, j7.T.h(bVar, bVar2, bVar3));
            mapC.put(1L, j7.T.h(bVar, bVar2, bVar3));
            mapC.put(2L, j7.T.d(E1.b.IMAGE_CAPTURE));
            mapC.put(3L, j7.T.d(E1.b.VIDEO_CAPTURE));
        }
        f31220c = j7.K.b(mapC);
        Map mapC2 = j7.K.c();
        if (i10 >= 33) {
            E1.b bVar4 = E1.b.PREVIEW;
            E1.b bVar5 = E1.b.IMAGE_CAPTURE;
            E1.b bVar6 = E1.b.VIDEO_CAPTURE;
            mapC2.put(4L, j7.T.h(bVar4, bVar5, bVar6));
            mapC2.put(3L, j7.T.h(bVar4, bVar6));
        }
        f31221d = j7.K.b(mapC2);
    }

    private C3155b2() {
    }

    public static final boolean a(Map surfaceConfigIndexAttachedSurfaceInfoMap, Map surfaceConfigIndexUseCaseConfigMap, List surfaceConfigsWithStreamUseCase) {
        List listJ;
        AbstractC2855l.g(surfaceConfigIndexAttachedSurfaceInfoMap, "surfaceConfigIndexAttachedSurfaceInfoMap");
        AbstractC2855l.g(surfaceConfigIndexUseCaseConfigMap, "surfaceConfigIndexUseCaseConfigMap");
        AbstractC2855l.g(surfaceConfigsWithStreamUseCase, "surfaceConfigsWithStreamUseCase");
        int size = surfaceConfigsWithStreamUseCase.size();
        for (int i10 = 0; i10 < size; i10++) {
            long j10 = ((F.r1) surfaceConfigsWithStreamUseCase.get(i10)).i().j();
            if (surfaceConfigIndexAttachedSurfaceInfoMap.containsKey(Integer.valueOf(i10))) {
                AbstractC0481f abstractC0481f = (AbstractC0481f) surfaceConfigIndexAttachedSurfaceInfoMap.get(Integer.valueOf(i10));
                C3155b2 c3155b2 = f31218a;
                AbstractC2855l.d(abstractC0481f);
                E1.b bVar = abstractC0481f.b().size() == 1 ? (E1.b) abstractC0481f.b().get(0) : E1.b.STREAM_SHARING;
                AbstractC2855l.d(bVar);
                List listB = abstractC0481f.b();
                AbstractC2855l.f(listB, "getCaptureTypes(...)");
                if (!c3155b2.g(bVar, j10, listB)) {
                    return false;
                }
            } else {
                if (!surfaceConfigIndexUseCaseConfigMap.containsKey(Integer.valueOf(i10))) {
                    throw new AssertionError("SurfaceConfig does not map to any use case");
                }
                Object obj = surfaceConfigIndexUseCaseConfigMap.get(Integer.valueOf(i10));
                AbstractC2855l.d(obj);
                F.D1 d12 = (F.D1) obj;
                C3155b2 c3155b22 = f31218a;
                E1.b bVarG = d12.G();
                AbstractC2855l.f(bVarG, "getCaptureType(...)");
                if (d12.G() == E1.b.STREAM_SHARING) {
                    listJ = ((T.i) d12).f0();
                    AbstractC2855l.f(listJ, "getCaptureTypes(...)");
                } else {
                    listJ = AbstractC2800q.j();
                }
                if (!c3155b22.g(bVarG, j10, listJ)) {
                    return false;
                }
            }
        }
        return true;
    }

    private final boolean b(Set set, Set set2) {
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            if (!set.contains(Long.valueOf(((Number) it.next()).longValue()))) {
                return false;
            }
        }
        return true;
    }

    public static final boolean c(s.E characteristicsCompat, List surfaceConfigs) {
        long[] jArr;
        AbstractC2855l.g(characteristicsCompat, "characteristicsCompat");
        AbstractC2855l.g(surfaceConfigs, "surfaceConfigs");
        if (Build.VERSION.SDK_INT < 33 || (jArr = (long[]) characteristicsCompat.a(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES)) == null || jArr.length == 0) {
            return false;
        }
        HashSet hashSet = new HashSet();
        for (long j10 : jArr) {
            hashSet.add(Long.valueOf(j10));
        }
        Iterator it = surfaceConfigs.iterator();
        while (it.hasNext()) {
            if (!hashSet.contains(Long.valueOf(((F.r1) it.next()).i().j()))) {
                return false;
            }
        }
        return true;
    }

    public static final boolean d(List attachedSurfaces, List newUseCaseConfigs) {
        AbstractC2855l.g(attachedSurfaces, "attachedSurfaces");
        AbstractC2855l.g(newUseCaseConfigs, "newUseCaseConfigs");
        Iterator it = attachedSurfaces.iterator();
        while (it.hasNext()) {
            AbstractC0481f abstractC0481f = (AbstractC0481f) it.next();
            List listB = abstractC0481f.b();
            AbstractC2855l.f(listB, "getCaptureTypes(...)");
            E1.b bVar = (E1.b) listB.get(0);
            C3155b2 c3155b2 = f31218a;
            InterfaceC0490j0 interfaceC0490j0E = abstractC0481f.e();
            AbstractC2855l.d(interfaceC0490j0E);
            AbstractC2855l.d(bVar);
            if (c3155b2.j(interfaceC0490j0E, bVar)) {
                return true;
            }
        }
        Iterator it2 = newUseCaseConfigs.iterator();
        while (it2.hasNext()) {
            F.D1 d12 = (F.D1) it2.next();
            C3155b2 c3155b22 = f31218a;
            E1.b bVarG = d12.G();
            AbstractC2855l.f(bVarG, "getCaptureType(...)");
            if (c3155b22.j(d12, bVarG)) {
                return true;
            }
        }
        return false;
    }

    public static final C3091a e(F.D1 useCaseConfig) {
        AbstractC2855l.g(useCaseConfig, "useCaseConfig");
        F.S0 s0I0 = F.S0.i0();
        AbstractC2855l.f(s0I0, "create(...)");
        InterfaceC0490j0.a aVar = C3091a.f30708R;
        if (useCaseConfig.b(aVar)) {
            s0I0.X(aVar, useCaseConfig.d(aVar));
        }
        InterfaceC0490j0.a aVar2 = F.D1.f1301E;
        if (useCaseConfig.b(aVar2)) {
            s0I0.X(aVar2, useCaseConfig.d(aVar2));
        }
        InterfaceC0490j0.a aVar3 = F.C0.f1272Q;
        if (useCaseConfig.b(aVar3)) {
            s0I0.X(aVar3, useCaseConfig.d(aVar3));
        }
        InterfaceC0490j0.a aVar4 = F.D0.f1294j;
        if (useCaseConfig.b(aVar4)) {
            s0I0.X(aVar4, useCaseConfig.d(aVar4));
        }
        return new C3091a(s0I0);
    }

    private final InterfaceC0490j0 f(InterfaceC0490j0 interfaceC0490j0, Long l10) {
        InterfaceC0490j0.a aVar = f31219b;
        if (interfaceC0490j0.b(aVar) && AbstractC2855l.b(interfaceC0490j0.d(aVar), l10)) {
            return null;
        }
        F.S0 s0J0 = F.S0.j0(interfaceC0490j0);
        AbstractC2855l.f(s0J0, "from(...)");
        s0J0.X(aVar, l10);
        return new C3091a(s0J0);
    }

    private final boolean g(E1.b bVar, long j10, List list) {
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        if (bVar != E1.b.STREAM_SHARING) {
            Map map = f31220c;
            if (map.containsKey(Long.valueOf(j10))) {
                Object obj = map.get(Long.valueOf(j10));
                AbstractC2855l.d(obj);
                if (((Set) obj).contains(bVar)) {
                    return true;
                }
            }
            return false;
        }
        Map map2 = f31221d;
        if (!map2.containsKey(Long.valueOf(j10))) {
            return false;
        }
        Object obj2 = map2.get(Long.valueOf(j10));
        AbstractC2855l.d(obj2);
        Set set = (Set) obj2;
        if (list.size() != set.size()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!set.contains((E1.b) it.next())) {
                return false;
            }
        }
        return true;
    }

    public static final boolean h(s.E characteristicsCompat) {
        long[] jArr;
        AbstractC2855l.g(characteristicsCompat, "characteristicsCompat");
        return (Build.VERSION.SDK_INT < 33 || (jArr = (long[]) characteristicsCompat.a(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES)) == null || jArr.length == 0) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean i(List list, List list2, Set set) {
        boolean z10;
        boolean z11;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = list.iterator();
        if (it.hasNext()) {
            AbstractC0481f abstractC0481f = (AbstractC0481f) it.next();
            InterfaceC0490j0 interfaceC0490j0E = abstractC0481f.e();
            AbstractC2855l.d(interfaceC0490j0E);
            InterfaceC0490j0.a aVar = C3091a.f30708R;
            if (interfaceC0490j0E.b(aVar)) {
                InterfaceC0490j0 interfaceC0490j0E2 = abstractC0481f.e();
                AbstractC2855l.d(interfaceC0490j0E2);
                Object objD = interfaceC0490j0E2.d(aVar);
                AbstractC2855l.d(objD);
                if (((Number) objD).longValue() != 0) {
                    z10 = true;
                    z11 = false;
                }
            } else {
                z11 = true;
                z10 = false;
            }
        } else {
            z10 = false;
            z11 = false;
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            F.D1 d12 = (F.D1) it2.next();
            InterfaceC0490j0.a aVar2 = C3091a.f30708R;
            if (d12.b(aVar2)) {
                Object objD2 = d12.d(aVar2);
                AbstractC2855l.d(objD2);
                long jLongValue = ((Number) objD2).longValue();
                if (jLongValue != 0) {
                    if (z11) {
                        o();
                    }
                    linkedHashSet.add(Long.valueOf(jLongValue));
                    z10 = true;
                } else if (z10) {
                    o();
                }
            } else if (z10) {
                o();
            }
            z11 = true;
        }
        return !z11 && b(set, linkedHashSet);
    }

    private final boolean j(InterfaceC0490j0 interfaceC0490j0, E1.b bVar) {
        Object objF = interfaceC0490j0.f(F.D1.f1301E, Boolean.FALSE);
        AbstractC2855l.d(objF);
        if (((Boolean) objF).booleanValue()) {
            return false;
        }
        InterfaceC0490j0.a aVar = F.C0.f1272Q;
        if (!interfaceC0490j0.b(aVar)) {
            return false;
        }
        Object objD = interfaceC0490j0.d(aVar);
        AbstractC2855l.d(objD);
        return s2.b(bVar, ((Number) objD).intValue()) == 5;
    }

    public static final boolean k(s.E characteristicsCompat, List attachedSurfaces, Map suggestedStreamSpecMap, Map attachedSurfaceStreamSpecMap) {
        AbstractC2855l.g(characteristicsCompat, "characteristicsCompat");
        AbstractC2855l.g(attachedSurfaces, "attachedSurfaces");
        AbstractC2855l.g(suggestedStreamSpecMap, "suggestedStreamSpecMap");
        AbstractC2855l.g(attachedSurfaceStreamSpecMap, "attachedSurfaceStreamSpecMap");
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        ArrayList<F.D1> arrayList = new ArrayList(suggestedStreamSpecMap.keySet());
        Iterator it = attachedSurfaces.iterator();
        while (it.hasNext()) {
            H0.g.g(((AbstractC0481f) it.next()).e());
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            H0.g.g(((F.o1) H0.g.g(suggestedStreamSpecMap.get((F.D1) it2.next()))).d());
        }
        long[] jArr = (long[]) characteristicsCompat.a(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES);
        if (jArr != null && jArr.length != 0) {
            HashSet hashSet = new HashSet();
            for (long j10 : jArr) {
                hashSet.add(Long.valueOf(j10));
            }
            if (f31218a.i(attachedSurfaces, arrayList, hashSet)) {
                Iterator it3 = attachedSurfaces.iterator();
                while (it3.hasNext()) {
                    AbstractC0481f abstractC0481f = (AbstractC0481f) it3.next();
                    InterfaceC0490j0 interfaceC0490j0E = abstractC0481f.e();
                    C3155b2 c3155b2 = f31218a;
                    AbstractC2855l.d(interfaceC0490j0E);
                    InterfaceC0490j0 interfaceC0490j0F = c3155b2.f(interfaceC0490j0E, (Long) interfaceC0490j0E.d(C3091a.f30708R));
                    if (interfaceC0490j0F != null) {
                        attachedSurfaceStreamSpecMap.put(abstractC0481f, abstractC0481f.k(interfaceC0490j0F));
                    }
                }
                for (F.D1 d12 : arrayList) {
                    F.o1 o1Var = (F.o1) suggestedStreamSpecMap.get(d12);
                    AbstractC2855l.d(o1Var);
                    InterfaceC0490j0 interfaceC0490j0D = o1Var.d();
                    C3155b2 c3155b22 = f31218a;
                    AbstractC2855l.d(interfaceC0490j0D);
                    InterfaceC0490j0 interfaceC0490j0F2 = c3155b22.f(interfaceC0490j0D, (Long) interfaceC0490j0D.d(C3091a.f30708R));
                    if (interfaceC0490j0F2 != null) {
                        suggestedStreamSpecMap.put(d12, o1Var.i().d(interfaceC0490j0F2).a());
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static final void l(Map suggestedStreamSpecMap, Map attachedSurfaceStreamSpecMap, Map surfaceConfigIndexAttachedSurfaceInfoMap, Map surfaceConfigIndexUseCaseConfigMap, List surfaceConfigsWithStreamUseCase) {
        AbstractC2855l.g(suggestedStreamSpecMap, "suggestedStreamSpecMap");
        AbstractC2855l.g(attachedSurfaceStreamSpecMap, "attachedSurfaceStreamSpecMap");
        AbstractC2855l.g(surfaceConfigIndexAttachedSurfaceInfoMap, "surfaceConfigIndexAttachedSurfaceInfoMap");
        AbstractC2855l.g(surfaceConfigIndexUseCaseConfigMap, "surfaceConfigIndexUseCaseConfigMap");
        AbstractC2855l.g(surfaceConfigsWithStreamUseCase, "surfaceConfigsWithStreamUseCase");
        int size = surfaceConfigsWithStreamUseCase.size();
        for (int i10 = 0; i10 < size; i10++) {
            long j10 = ((F.r1) surfaceConfigsWithStreamUseCase.get(i10)).i().j();
            if (surfaceConfigIndexAttachedSurfaceInfoMap.containsKey(Integer.valueOf(i10))) {
                AbstractC0481f abstractC0481f = (AbstractC0481f) surfaceConfigIndexAttachedSurfaceInfoMap.get(Integer.valueOf(i10));
                AbstractC2855l.d(abstractC0481f);
                InterfaceC0490j0 interfaceC0490j0E = abstractC0481f.e();
                C3155b2 c3155b2 = f31218a;
                AbstractC2855l.d(interfaceC0490j0E);
                InterfaceC0490j0 interfaceC0490j0F = c3155b2.f(interfaceC0490j0E, Long.valueOf(j10));
                if (interfaceC0490j0F != null) {
                    attachedSurfaceStreamSpecMap.put(abstractC0481f, abstractC0481f.k(interfaceC0490j0F));
                }
            } else {
                if (!surfaceConfigIndexUseCaseConfigMap.containsKey(Integer.valueOf(i10))) {
                    throw new AssertionError("SurfaceConfig does not map to any use case");
                }
                Object obj = surfaceConfigIndexUseCaseConfigMap.get(Integer.valueOf(i10));
                AbstractC2855l.d(obj);
                F.D1 d12 = (F.D1) obj;
                F.o1 o1Var = (F.o1) suggestedStreamSpecMap.get(d12);
                AbstractC2855l.d(o1Var);
                InterfaceC0490j0 interfaceC0490j0D = o1Var.d();
                C3155b2 c3155b22 = f31218a;
                AbstractC2855l.d(interfaceC0490j0D);
                InterfaceC0490j0 interfaceC0490j0F2 = c3155b22.f(interfaceC0490j0D, Long.valueOf(j10));
                if (interfaceC0490j0F2 != null) {
                    F.o1 o1VarA = o1Var.i().d(interfaceC0490j0F2).a();
                    AbstractC2855l.f(o1VarA, "build(...)");
                    suggestedStreamSpecMap.put(d12, o1VarA);
                }
            }
        }
    }

    public static final void m(Collection sessionConfigs, Collection useCaseConfigs, Map streamUseCaseMap) {
        AbstractC2855l.g(sessionConfigs, "sessionConfigs");
        AbstractC2855l.g(useCaseConfigs, "useCaseConfigs");
        AbstractC2855l.g(streamUseCaseMap, "streamUseCaseMap");
        ArrayList arrayList = new ArrayList(useCaseConfigs);
        Iterator it = sessionConfigs.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            F.k1 k1Var = (F.k1) it.next();
            InterfaceC0490j0 interfaceC0490j0G = k1Var.g();
            InterfaceC0490j0.a aVar = f31219b;
            if (interfaceC0490j0G.b(aVar) && k1Var.o().size() != 1) {
                kotlin.jvm.internal.H h10 = kotlin.jvm.internal.H.f29375a;
                String str = String.format("SessionConfig has stream use case but also contains %d surfaces, abort populateSurfaceToStreamUseCaseMapping().", Arrays.copyOf(new Object[]{Integer.valueOf(k1Var.o().size())}, 1));
                AbstractC2855l.f(str, "format(...)");
                AbstractC3583h0.c("StreamUseCaseUtil", str);
                return;
            }
            if (k1Var.g().b(aVar)) {
                Iterator it2 = sessionConfigs.iterator();
                int i10 = 0;
                while (it2.hasNext()) {
                    F.k1 k1Var2 = (F.k1) it2.next();
                    if (((F.D1) arrayList.get(i10)).G() == E1.b.METERING_REPEATING) {
                        AbstractC2855l.f(k1Var2.o(), "getSurfaces(...)");
                        H0.g.j(!r4.isEmpty(), "MeteringRepeating should contain a surface");
                        streamUseCaseMap.put(k1Var2.o().get(0), 1L);
                    } else {
                        InterfaceC0490j0 interfaceC0490j0G2 = k1Var2.g();
                        InterfaceC0490j0.a aVar2 = f31219b;
                        if (interfaceC0490j0G2.b(aVar2)) {
                            List listO = k1Var2.o();
                            AbstractC2855l.f(listO, "getSurfaces(...)");
                            if (!listO.isEmpty()) {
                                Object obj = k1Var2.o().get(0);
                                Object objD = k1Var2.g().d(aVar2);
                                AbstractC2855l.d(objD);
                                streamUseCaseMap.put(obj, objD);
                            }
                        }
                    }
                    i10++;
                }
            }
        }
        AbstractC3583h0.a("StreamUseCaseUtil", "populateSurfaceToStreamUseCaseMapping() - streamUseCaseMap = " + streamUseCaseMap);
    }

    public static final boolean n(C3171f2.d featureSettings) {
        AbstractC2855l.g(featureSettings, "featureSettings");
        return featureSettings.a() == 0 && featureSettings.b() == 8 && !featureSettings.f();
    }

    private final void o() {
        throw new IllegalArgumentException("Either all use cases must have non-default stream use case assigned or none should have it");
    }
}
