package r;

import F.AbstractC0504q0;
import F.C0486h0;
import F.k1;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.quirk.CaptureNoResponseQuirk;
import androidx.camera.core.impl.utils.SurfaceUtil;
import androidx.concurrent.futures.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import l1.AbstractC2861a;
import m5.InterfaceFutureC2904a;
import q.C3091a;
import r.InterfaceC3175g2;
import r.T0;
import r.r2;
import t.AbstractC3344d;
import t.C3346f;
import t.C3349i;
import t.C3350j;
import t.C3356p;
import v.C3409A;
import y.AbstractC3583h0;
import y.C3563H;

/* JADX INFO: renamed from: r.l1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C3194l1 implements InterfaceC3198m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Object f31376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f31377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f31378c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    InterfaceC3175g2.a f31379d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    InterfaceC3175g2 f31380e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    F.k1 f31381f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map f31382g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    List f31383h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    c f31384i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    c f31385j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    InterfaceFutureC2904a f31386k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    c.a f31387l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Map f31388m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final v.w f31389n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final C3409A f31390o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final v.t f31391p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final C3346f f31392q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final v.z f31393r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final boolean f31394s;

    /* JADX INFO: renamed from: r.l1$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b extends CameraCaptureSession.CaptureCallback {
        b() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            synchronized (C3194l1.this.f31376a) {
                try {
                    F.k1 k1Var = C3194l1.this.f31381f;
                    if (k1Var == null) {
                        return;
                    }
                    C0486h0 c0486h0K = k1Var.k();
                    AbstractC3583h0.a("CaptureSession", "Submit FLASH_MODE_OFF request");
                    C3194l1 c3194l1 = C3194l1.this;
                    c3194l1.e(Collections.singletonList(c3194l1.f31390o.a(c0486h0K)));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: r.l1$c */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    enum c {
        UNINITIALIZED,
        RELEASED,
        INITIALIZED,
        GET_SURFACE,
        RELEASING,
        CLOSED,
        OPENING,
        OPENED
    }

    /* JADX INFO: renamed from: r.l1$d */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    final class d extends InterfaceC3175g2.c {
        d() {
        }

        @Override // r.InterfaceC3175g2.c
        public void t(InterfaceC3175g2 interfaceC3175g2) {
            synchronized (C3194l1.this.f31376a) {
                try {
                    switch (C3194l1.this.f31385j) {
                        case UNINITIALIZED:
                        case INITIALIZED:
                        case GET_SURFACE:
                        case OPENED:
                            throw new IllegalStateException("onConfigureFailed() should not be possible in state: " + C3194l1.this.f31385j);
                        case RELEASED:
                            AbstractC3583h0.a("CaptureSession", "ConfigureFailed callback after change to RELEASED state");
                            break;
                        case RELEASING:
                        case CLOSED:
                        case OPENING:
                            C3194l1.this.s();
                            break;
                    }
                    AbstractC3583h0.c("CaptureSession", "CameraCaptureSession.onConfigureFailed() " + C3194l1.this.f31385j);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // r.InterfaceC3175g2.c
        public void u(InterfaceC3175g2 interfaceC3175g2) {
            synchronized (C3194l1.this.f31376a) {
                try {
                    switch (C3194l1.this.f31385j) {
                        case UNINITIALIZED:
                        case RELEASED:
                        case INITIALIZED:
                        case GET_SURFACE:
                        case OPENED:
                            throw new IllegalStateException("onConfigured() should not be possible in state: " + C3194l1.this.f31385j);
                        case RELEASING:
                            interfaceC3175g2.close();
                            break;
                        case CLOSED:
                            C3194l1.this.f31380e = interfaceC3175g2;
                            break;
                        case OPENING:
                            C3194l1.this.A(c.OPENED);
                            C3194l1.this.f31380e = interfaceC3175g2;
                            AbstractC3583h0.a("CaptureSession", "Attempting to send capture request onConfigured");
                            C3194l1 c3194l1 = C3194l1.this;
                            c3194l1.y(c3194l1.f31381f);
                            C3194l1.this.x();
                            break;
                    }
                    AbstractC3583h0.a("CaptureSession", "CameraCaptureSession.onConfigured() mState=" + C3194l1.this.f31385j);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // r.InterfaceC3175g2.c
        public void v(InterfaceC3175g2 interfaceC3175g2) {
            synchronized (C3194l1.this.f31376a) {
                try {
                    if (C3194l1.this.f31385j.ordinal() == 0) {
                        throw new IllegalStateException("onReady() should not be possible in state: " + C3194l1.this.f31385j);
                    }
                    AbstractC3583h0.a("CaptureSession", "CameraCaptureSession.onReady() " + C3194l1.this.f31385j);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // r.InterfaceC3175g2.c
        /* JADX INFO: renamed from: w */
        public void C(InterfaceC3175g2 interfaceC3175g2) {
            synchronized (C3194l1.this.f31376a) {
                try {
                    if (C3194l1.this.f31385j == c.UNINITIALIZED) {
                        throw new IllegalStateException("onSessionFinished() should not be possible in state: " + C3194l1.this.f31385j);
                    }
                    AbstractC3583h0.a("CaptureSession", "onSessionFinished()");
                    C3194l1.this.s();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    C3194l1(C3346f c3346f) {
        this(c3346f, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A(c cVar) {
        if (cVar.ordinal() > this.f31384i.ordinal()) {
            this.f31384i = cVar;
        }
        this.f31385j = cVar;
        if (!AbstractC2861a.h() || this.f31384i.ordinal() < c.GET_SURFACE.ordinal()) {
            return;
        }
        AbstractC2861a.j("CX:C2State[" + String.format("CaptureSession@%x", Integer.valueOf(hashCode())) + "]", cVar.ordinal());
    }

    public static /* synthetic */ void j(C3194l1 c3194l1) {
        synchronized (c3194l1.f31376a) {
            if (c3194l1.f31377b.isEmpty()) {
                return;
            }
            try {
                c3194l1.w(c3194l1.f31377b);
            } finally {
                c3194l1.f31377b.clear();
            }
        }
    }

    public static /* synthetic */ Object k(C3194l1 c3194l1, c.a aVar) {
        String str;
        synchronized (c3194l1.f31376a) {
            H0.g.j(c3194l1.f31387l == null, "Release completer expected to be null");
            c3194l1.f31387l = aVar;
            str = "Release[session=" + c3194l1 + "]";
        }
        return str;
    }

    public static /* synthetic */ void m(C3194l1 c3194l1, CameraCaptureSession cameraCaptureSession, int i10, boolean z10) {
        synchronized (c3194l1.f31376a) {
            try {
                if (c3194l1.f31385j == c.OPENED) {
                    c3194l1.y(c3194l1.f31381f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private int p(List list, T0 t02) {
        T0 t03 = new T0();
        Iterator it = list.iterator();
        int iG = -1;
        while (it.hasNext()) {
            CaptureRequest captureRequest = (CaptureRequest) it.next();
            InterfaceC3175g2 interfaceC3175g2 = this.f31380e;
            Objects.requireNonNull(interfaceC3175g2);
            List listL = interfaceC3175g2.l(captureRequest);
            Iterator it2 = listL.iterator();
            while (it2.hasNext()) {
                t03.a((CaptureRequest) it2.next(), Collections.singletonList(new Z1(captureRequest, t02)));
            }
            iG = this.f31380e.g(listL, t03);
        }
        return iG;
    }

    private CameraCaptureSession.CaptureCallback q(List list, CameraCaptureSession.CaptureCallback... captureCallbackArr) {
        ArrayList arrayList = new ArrayList(list.size() + captureCallbackArr.length);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC3158c1.a((F.r) it.next()));
        }
        Collections.addAll(arrayList, captureCallbackArr);
        return AbstractC3157c0.a(arrayList);
    }

    private static Map r(Map map, Map map2) {
        HashMap map3 = new HashMap();
        for (Integer num : map.keySet()) {
            num.intValue();
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            for (k1.f fVar : (List) map.get(num)) {
                SurfaceUtil.a aVarA = SurfaceUtil.a((Surface) map2.get(fVar.f()));
                if (i10 == 0) {
                    i10 = aVarA.f15194a;
                }
                AbstractC3166e1.a();
                int i11 = aVarA.f15195b;
                int i12 = aVarA.f15196c;
                String strD = fVar.d();
                Objects.requireNonNull(strD);
                arrayList.add(AbstractC3162d1.a(i11, i12, strD));
            }
            if (i10 == 0 || arrayList.isEmpty()) {
                AbstractC3583h0.c("CaptureSession", "Skips to create instances for multi-resolution output. imageFormat: " + i10 + ", streamInfos size: " + arrayList.size());
            } else {
                List listCreateInstancesForMultiResolutionOutput = OutputConfiguration.createInstancesForMultiResolutionOutput(arrayList, i10);
                if (listCreateInstancesForMultiResolutionOutput != null) {
                    for (k1.f fVar2 : (List) map.get(num)) {
                        OutputConfiguration outputConfiguration = (OutputConfiguration) listCreateInstancesForMultiResolutionOutput.remove(0);
                        outputConfiguration.addSurface((Surface) map2.get(fVar2.f()));
                        map3.put(fVar2, new C3350j(outputConfiguration));
                    }
                }
            }
        }
        return map3;
    }

    private C3350j t(k1.f fVar, Map map, String str) {
        long jLongValue;
        DynamicRangeProfiles dynamicRangeProfilesD;
        Surface surface = (Surface) map.get(fVar.f());
        H0.g.h(surface, "Surface in OutputConfig not found in configuredSurfaceMap.");
        C3350j c3350j = new C3350j(fVar.g(), surface);
        if (str != null) {
            c3350j.g(str);
        } else {
            c3350j.g(fVar.d());
        }
        if (fVar.c() == 0) {
            c3350j.f(1);
        } else if (fVar.c() == 1) {
            c3350j.f(2);
        }
        if (!fVar.e().isEmpty()) {
            c3350j.b();
            Iterator it = fVar.e().iterator();
            while (it.hasNext()) {
                Surface surface2 = (Surface) map.get((AbstractC0504q0) it.next());
                H0.g.h(surface2, "Surface in OutputConfig not found in configuredSurfaceMap.");
                c3350j.a(surface2);
            }
        }
        if (Build.VERSION.SDK_INT < 33 || (dynamicRangeProfilesD = this.f31392q.d()) == null) {
            jLongValue = 1;
        } else {
            C3563H c3563hB = fVar.b();
            Long lA = AbstractC3344d.a(c3563hB, dynamicRangeProfilesD);
            if (lA == null) {
                AbstractC3583h0.c("CaptureSession", "Requested dynamic range is not supported. Defaulting to STANDARD dynamic range profile.\nRequested dynamic range:\n  " + c3563hB);
                jLongValue = 1;
            } else {
                jLongValue = lA.longValue();
            }
        }
        c3350j.e(jLongValue);
        return c3350j;
    }

    private List u(List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C3350j c3350j = (C3350j) it.next();
            if (!arrayList.contains(c3350j.d())) {
                arrayList.add(c3350j.d());
                arrayList2.add(c3350j);
            }
        }
        return arrayList2;
    }

    private static Map v(Collection collection) {
        HashMap map = new HashMap();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            k1.f fVar = (k1.f) it.next();
            if (fVar.g() > 0 && fVar.e().isEmpty()) {
                List arrayList = (List) map.get(Integer.valueOf(fVar.g()));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map.put(Integer.valueOf(fVar.g()), arrayList);
                }
                arrayList.add(fVar);
            }
        }
        HashMap map2 = new HashMap();
        for (Integer num : map.keySet()) {
            num.intValue();
            if (((List) map.get(num)).size() >= 2) {
                map2.put(num, (List) map.get(num));
            }
        }
        return map2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InterfaceFutureC2904a z(List list, F.k1 k1Var, CameraDevice cameraDevice) {
        synchronized (this.f31376a) {
            try {
                int iOrdinal = this.f31385j.ordinal();
                if (iOrdinal == 0 || iOrdinal == 7 || iOrdinal == 2) {
                    return J.n.n(new IllegalStateException("openCaptureSession() should not be possible in state: " + this.f31385j));
                }
                if (iOrdinal != 3) {
                    return J.n.n(new CancellationException("openCaptureSession() not execute in state: " + this.f31385j));
                }
                this.f31382g.clear();
                for (int i10 = 0; i10 < list.size(); i10++) {
                    this.f31382g.put((AbstractC0504q0) this.f31383h.get(i10), (Surface) list.get(i10));
                }
                A(c.OPENING);
                AbstractC3583h0.a("CaptureSession", "Opening capture session.");
                InterfaceC3175g2.c cVarY = r2.y(this.f31378c, new r2.a(k1Var.l()));
                C3091a c3091a = new C3091a(k1Var.g());
                C0486h0.a aVarK = C0486h0.a.k(k1Var.k());
                Map map = new HashMap();
                if (this.f31394s && Build.VERSION.SDK_INT >= 35) {
                    map = r(v(k1Var.i()), this.f31382g);
                }
                ArrayList arrayList = new ArrayList();
                String strJ0 = c3091a.j0(null);
                for (k1.f fVar : k1Var.i()) {
                    C3350j c3350jT = (!this.f31394s || Build.VERSION.SDK_INT < 35) ? null : (C3350j) map.get(fVar);
                    if (c3350jT == null) {
                        c3350jT = t(fVar, this.f31382g, strJ0);
                        if (this.f31388m.containsKey(fVar.f())) {
                            c3350jT.h(((Long) this.f31388m.get(fVar.f())).longValue());
                        }
                    }
                    arrayList.add(c3350jT);
                }
                C3356p c3356pP = this.f31379d.p(k1Var.m(), u(arrayList), cVarY);
                if (k1Var.p() == 5 && k1Var.h() != null) {
                    c3356pP.f(C3349i.b(k1Var.h()));
                }
                try {
                    CaptureRequest captureRequestF = L0.f(aVarK.h(), cameraDevice, this.f31393r);
                    if (captureRequestF != null) {
                        c3356pP.g(captureRequestF);
                    }
                    return this.f31379d.o(cameraDevice, c3356pP, this.f31383h);
                } catch (CameraAccessException e10) {
                    return J.n.n(e10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // r.InterfaceC3198m1
    public InterfaceFutureC2904a a(final F.k1 k1Var, final CameraDevice cameraDevice, InterfaceC3175g2.a aVar) {
        synchronized (this.f31376a) {
            try {
                if (this.f31385j.ordinal() == 2) {
                    A(c.GET_SURFACE);
                    ArrayList arrayList = new ArrayList(k1Var.o());
                    this.f31383h = arrayList;
                    this.f31379d = aVar;
                    J.d dVarE = J.d.a(aVar.m(arrayList, 5000L)).e(new J.a() { // from class: r.i1
                        @Override // J.a
                        public final InterfaceFutureC2904a apply(Object obj) {
                            return this.f31356a.z((List) obj, k1Var, cameraDevice);
                        }
                    }, this.f31379d.b());
                    J.n.j(dVarE, new a(), this.f31379d.b());
                    return J.n.s(dVarE);
                }
                AbstractC3583h0.c("CaptureSession", "Open not allowed in state: " + this.f31385j);
                return J.n.n(new IllegalStateException("open() should not allow the state: " + this.f31385j));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // r.InterfaceC3198m1
    public void b() {
        ArrayList<C0486h0> arrayList;
        synchronized (this.f31376a) {
            try {
                if (this.f31377b.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(this.f31377b);
                    this.f31377b.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayList != null) {
            for (C0486h0 c0486h0 : arrayList) {
                Iterator it = c0486h0.c().iterator();
                while (it.hasNext()) {
                    ((F.r) it.next()).a(c0486h0.f());
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054 A[Catch: all -> 0x001a, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x000b, B:29:0x008d, B:8:0x0010, B:11:0x0016, B:17:0x0025, B:16:0x001e, B:18:0x002a, B:20:0x0054, B:21:0x0058, B:23:0x005c, B:24:0x0067, B:25:0x0069, B:27:0x006b, B:28:0x0088, B:32:0x0094, B:33:0x00ac), top: B:38:0x0003, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005c A[Catch: all -> 0x001a, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x000b, B:29:0x008d, B:8:0x0010, B:11:0x0016, B:17:0x0025, B:16:0x001e, B:18:0x002a, B:20:0x0054, B:21:0x0058, B:23:0x005c, B:24:0x0067, B:25:0x0069, B:27:0x006b, B:28:0x0088, B:32:0x0094, B:33:0x00ac), top: B:38:0x0003, inners: #0 }] */
    @Override // r.InterfaceC3198m1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InterfaceFutureC2904a c(boolean z10) {
        synchronized (this.f31376a) {
            int iOrdinal = this.f31385j.ordinal();
            if (iOrdinal == 0) {
                throw new IllegalStateException("release() should not be possible in state: " + this.f31385j);
            }
            switch (iOrdinal) {
                case 2:
                    A(c.RELEASED);
                    return J.n.p(null);
                case 3:
                    H0.g.h(this.f31379d, "The Opener shouldn't null in state:" + this.f31385j);
                    this.f31379d.stop();
                    A(c.RELEASED);
                    return J.n.p(null);
                case 4:
                    if (this.f31386k == null) {
                        this.f31386k = androidx.concurrent.futures.c.a(new c.InterfaceC0153c() { // from class: r.h1
                            @Override // androidx.concurrent.futures.c.InterfaceC0153c
                            public final Object a(c.a aVar) {
                                return C3194l1.k(this.f31352a, aVar);
                            }
                        });
                    }
                    return this.f31386k;
                case 5:
                case 7:
                    InterfaceC3175g2 interfaceC3175g2 = this.f31380e;
                    if (interfaceC3175g2 != null) {
                        if (z10) {
                            try {
                                interfaceC3175g2.a();
                            } catch (CameraAccessException e10) {
                                AbstractC3583h0.d("CaptureSession", "Unable to abort captures.", e10);
                            }
                        }
                        this.f31380e.close();
                        break;
                    }
                    A(c.RELEASING);
                    this.f31391p.g();
                    H0.g.h(this.f31379d, "The Opener shouldn't null in state:" + this.f31385j);
                    if (this.f31379d.stop()) {
                        s();
                        return J.n.p(null);
                    }
                    if (this.f31386k == null) {
                    }
                    return this.f31386k;
                case 6:
                    A(c.RELEASING);
                    this.f31391p.g();
                    H0.g.h(this.f31379d, "The Opener shouldn't null in state:" + this.f31385j);
                    if (this.f31379d.stop()) {
                    }
                    if (this.f31386k == null) {
                    }
                    return this.f31386k;
                default:
                    return J.n.p(null);
            }
        }
    }

    @Override // r.InterfaceC3198m1
    public void close() {
        synchronized (this.f31376a) {
            try {
                int iOrdinal = this.f31385j.ordinal();
                if (iOrdinal == 0) {
                    throw new IllegalStateException("close() should not be possible in state: " + this.f31385j);
                }
                if (iOrdinal == 2) {
                    A(c.RELEASED);
                } else if (iOrdinal == 3) {
                    H0.g.h(this.f31379d, "The Opener shouldn't null in state:" + this.f31385j);
                    this.f31379d.stop();
                    A(c.RELEASED);
                } else if (iOrdinal == 6 || iOrdinal == 7) {
                    H0.g.h(this.f31379d, "The Opener shouldn't null in state:" + this.f31385j);
                    this.f31379d.stop();
                    A(c.CLOSED);
                    this.f31391p.g();
                    this.f31381f = null;
                }
            } finally {
            }
        }
    }

    @Override // r.InterfaceC3198m1
    public List d() {
        List listUnmodifiableList;
        synchronized (this.f31376a) {
            listUnmodifiableList = Collections.unmodifiableList(this.f31377b);
        }
        return listUnmodifiableList;
    }

    @Override // r.InterfaceC3198m1
    public void e(List list) {
        synchronized (this.f31376a) {
            try {
                switch (this.f31385j) {
                    case UNINITIALIZED:
                        throw new IllegalStateException("issueCaptureRequests() should not be possible in state: " + this.f31385j);
                    case RELEASED:
                    case RELEASING:
                    case CLOSED:
                        throw new IllegalStateException("Cannot issue capture request on a closed/released session.");
                    case INITIALIZED:
                    case GET_SURFACE:
                    case OPENING:
                        this.f31377b.addAll(list);
                        break;
                    case OPENED:
                        this.f31377b.addAll(list);
                        x();
                        break;
                }
            } finally {
            }
        }
    }

    @Override // r.InterfaceC3198m1
    public F.k1 f() {
        F.k1 k1Var;
        synchronized (this.f31376a) {
            k1Var = this.f31381f;
        }
        return k1Var;
    }

    @Override // r.InterfaceC3198m1
    public void g(F.k1 k1Var) {
        synchronized (this.f31376a) {
            try {
                switch (this.f31385j) {
                    case UNINITIALIZED:
                        throw new IllegalStateException("setSessionConfig() should not be possible in state: " + this.f31385j);
                    case RELEASED:
                    case RELEASING:
                    case CLOSED:
                        throw new IllegalStateException("Session configuration cannot be set on a closed/released session.");
                    case INITIALIZED:
                    case GET_SURFACE:
                    case OPENING:
                        this.f31381f = k1Var;
                        break;
                    case OPENED:
                        this.f31381f = k1Var;
                        if (k1Var == null) {
                            return;
                        }
                        if (!this.f31382g.keySet().containsAll(k1Var.o())) {
                            AbstractC3583h0.c("CaptureSession", "Does not have the proper configured lists");
                            return;
                        } else {
                            AbstractC3583h0.a("CaptureSession", "Attempting to submit CaptureRequest after setting");
                            y(this.f31381f);
                        }
                        break;
                }
            } finally {
            }
        }
    }

    @Override // r.InterfaceC3198m1
    public boolean h() {
        boolean z10;
        synchronized (this.f31376a) {
            try {
                c cVar = this.f31385j;
                z10 = cVar == c.OPENED || cVar == c.OPENING;
            } finally {
            }
        }
        return z10;
    }

    @Override // r.InterfaceC3198m1
    public void i(Map map) {
        synchronized (this.f31376a) {
            this.f31388m = map;
        }
    }

    void s() {
        c cVar = this.f31385j;
        c cVar2 = c.RELEASED;
        if (cVar == cVar2) {
            AbstractC3583h0.a("CaptureSession", "Skipping finishClose due to being state RELEASED.");
            return;
        }
        A(cVar2);
        this.f31380e = null;
        c.a aVar = this.f31387l;
        if (aVar != null) {
            aVar.c(null);
            this.f31387l = null;
        }
    }

    int w(List list) {
        T0 t02;
        ArrayList arrayList;
        boolean z10;
        synchronized (this.f31376a) {
            try {
                if (this.f31385j != c.OPENED) {
                    AbstractC3583h0.a("CaptureSession", "Skipping issueBurstCaptureRequest due to session closed");
                    return -1;
                }
                if (list.isEmpty()) {
                    return -1;
                }
                try {
                    t02 = new T0();
                    arrayList = new ArrayList();
                    AbstractC3583h0.a("CaptureSession", "Issuing capture request.");
                    Iterator it = list.iterator();
                    z10 = false;
                    while (it.hasNext()) {
                        C0486h0 c0486h0 = (C0486h0) it.next();
                        if (c0486h0.i().isEmpty()) {
                            AbstractC3583h0.a("CaptureSession", "Skipping issuing empty capture request.");
                        } else {
                            Iterator it2 = c0486h0.i().iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    AbstractC0504q0 abstractC0504q0 = (AbstractC0504q0) it2.next();
                                    if (!this.f31382g.containsKey(abstractC0504q0)) {
                                        AbstractC3583h0.a("CaptureSession", "Skipping capture request with invalid surface: " + abstractC0504q0);
                                        break;
                                    }
                                } else {
                                    if (c0486h0.k() == 2) {
                                        z10 = true;
                                    }
                                    C0486h0.a aVarK = C0486h0.a.k(c0486h0);
                                    if (c0486h0.k() == 5 && c0486h0.d() != null) {
                                        aVarK.p(c0486h0.d());
                                    }
                                    F.k1 k1Var = this.f31381f;
                                    if (k1Var != null) {
                                        aVarK.e(k1Var.k().g());
                                    }
                                    aVarK.e(c0486h0.g());
                                    CaptureRequest captureRequestE = L0.e(aVarK.h(), this.f31380e.j(), this.f31382g, false, this.f31393r);
                                    if (captureRequestE == null) {
                                        AbstractC3583h0.a("CaptureSession", "Skipping issuing request without surface.");
                                        return -1;
                                    }
                                    ArrayList arrayList2 = new ArrayList();
                                    Iterator it3 = c0486h0.c().iterator();
                                    while (it3.hasNext()) {
                                        AbstractC3158c1.b((F.r) it3.next(), arrayList2);
                                    }
                                    t02.a(captureRequestE, arrayList2);
                                    arrayList.add(captureRequestE);
                                }
                            }
                        }
                    }
                } catch (CameraAccessException e10) {
                    AbstractC3583h0.c("CaptureSession", "Unable to access camera: " + e10.getMessage());
                    Thread.dumpStack();
                }
                if (arrayList.isEmpty()) {
                    AbstractC3583h0.a("CaptureSession", "Skipping issuing burst request due to no valid request elements");
                    return -1;
                }
                if (this.f31389n.a(arrayList, z10)) {
                    this.f31380e.d();
                    t02.c(new T0.a() { // from class: r.k1
                        @Override // r.T0.a
                        public final void a(CameraCaptureSession cameraCaptureSession, int i10, boolean z11) {
                            C3194l1.m(this.f31371a, cameraCaptureSession, i10, z11);
                        }
                    });
                }
                if (this.f31390o.b(arrayList, z10)) {
                    t02.a((CaptureRequest) arrayList.get(arrayList.size() - 1), Collections.singletonList(new b()));
                }
                F.k1 k1Var2 = this.f31381f;
                if (k1Var2 == null || k1Var2.m() != 1) {
                    return this.f31380e.g(arrayList, t02);
                }
                return p(arrayList, t02);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void x() {
        this.f31391p.e().h(new Runnable() { // from class: r.j1
            @Override // java.lang.Runnable
            public final void run() {
                C3194l1.j(this.f31363g);
            }
        }, I.c.b());
    }

    int y(F.k1 k1Var) {
        synchronized (this.f31376a) {
            try {
            } catch (Throwable th) {
                throw th;
            }
            if (k1Var == null) {
                AbstractC3583h0.a("CaptureSession", "Skipping issueRepeatingCaptureRequests for no configuration case.");
                return -1;
            }
            if (this.f31385j != c.OPENED) {
                AbstractC3583h0.a("CaptureSession", "Skipping issueRepeatingCaptureRequests due to session closed");
                return -1;
            }
            C0486h0 c0486h0K = k1Var.k();
            if (c0486h0K.i().isEmpty()) {
                AbstractC3583h0.a("CaptureSession", "Skipping issueRepeatingCaptureRequests for no surface.");
                try {
                    this.f31380e.d();
                } catch (CameraAccessException e10) {
                    AbstractC3583h0.c("CaptureSession", "Unable to access camera: " + e10.getMessage());
                    Thread.dumpStack();
                }
                return -1;
            }
            try {
                AbstractC3583h0.a("CaptureSession", "Issuing request for session.");
                CaptureRequest captureRequestE = L0.e(c0486h0K, this.f31380e.j(), this.f31382g, true, this.f31393r);
                if (captureRequestE == null) {
                    AbstractC3583h0.a("CaptureSession", "Skipping issuing empty request for session.");
                    return -1;
                }
                CameraCaptureSession.CaptureCallback captureCallbackD = this.f31391p.d(q(c0486h0K.c(), new CameraCaptureSession.CaptureCallback[0]));
                if (k1Var.m() != 1) {
                    return this.f31380e.k(captureRequestE, captureCallbackD);
                }
                return this.f31380e.f(this.f31380e.l(captureRequestE), captureCallbackD);
            } catch (CameraAccessException e11) {
                AbstractC3583h0.c("CaptureSession", "Unable to access camera: " + e11.getMessage());
                Thread.dumpStack();
                return -1;
            }
            throw th;
        }
    }

    C3194l1(C3346f c3346f, boolean z10) {
        this(c3346f, new F.g1(Collections.EMPTY_LIST), z10, null);
    }

    C3194l1(C3346f c3346f, F.g1 g1Var, x.i iVar) {
        this(c3346f, g1Var, false, iVar);
    }

    C3194l1(C3346f c3346f, F.g1 g1Var, boolean z10, x.i iVar) {
        this.f31376a = new Object();
        this.f31377b = new ArrayList();
        this.f31382g = new HashMap();
        this.f31383h = Collections.EMPTY_LIST;
        c cVar = c.UNINITIALIZED;
        this.f31384i = cVar;
        this.f31385j = cVar;
        this.f31388m = new HashMap();
        this.f31389n = new v.w();
        this.f31390o = new C3409A();
        A(c.INITIALIZED);
        this.f31392q = c3346f;
        this.f31378c = new d();
        this.f31391p = new v.t(g1Var.a(CaptureNoResponseQuirk.class));
        this.f31393r = new v.z(g1Var);
        this.f31394s = z10;
    }

    /* JADX INFO: renamed from: r.l1$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements J.c {
        a() {
        }

        @Override // J.c
        public void onFailure(Throwable th) {
            synchronized (C3194l1.this.f31376a) {
                try {
                    C3194l1.this.f31379d.stop();
                    int iOrdinal = C3194l1.this.f31385j.ordinal();
                    if ((iOrdinal == 4 || iOrdinal == 5 || iOrdinal == 6) && !(th instanceof CancellationException)) {
                        AbstractC3583h0.m("CaptureSession", "Opening session with fail " + C3194l1.this.f31385j, th);
                        C3194l1.this.s();
                    }
                } finally {
                }
            }
        }

        @Override // J.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r12) {
        }
    }
}
