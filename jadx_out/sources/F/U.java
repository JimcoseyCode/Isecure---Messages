package F;

import F.V0;
import androidx.lifecycle.AbstractC1776x;
import i7.C2735B;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import y.AbstractC3583h0;
import y.AbstractC3599t;
import y.C3596p;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class U {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f1383l = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f1384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f1385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private K f1386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Z f1387d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private V0 f1388e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final b f1389f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile List f1390g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f1391h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final CopyOnWriteArrayList f1392i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final CopyOnWriteArrayList f1393j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Map f1394k;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private final class b implements V0.a {
        public b() {
        }

        @Override // F.V0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(List list) {
            K k10;
            List listJ;
            if (U.this.f1391h.get() && (k10 = U.this.f1386c) != null) {
                if (list != null) {
                    listJ = new ArrayList(AbstractC2800q.u(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        listJ.add(((C3596p) it.next()).c());
                    }
                } else {
                    listJ = AbstractC2800q.j();
                }
                try {
                    k10.e(listJ);
                    Set<String> setC = k10.c();
                    AbstractC2855l.f(setC, "getAvailableCameraIds(...)");
                    ArrayList arrayList = new ArrayList(AbstractC2800q.u(setC, 10));
                    for (String str : setC) {
                        C3596p.a aVar = C3596p.f33816c;
                        AbstractC2855l.d(str);
                        arrayList.add(C3596p.a.d(aVar, str, null, null, 6, null));
                    }
                    U.this.p(arrayList);
                } catch (Exception e10) {
                    AbstractC3583h0.d("CameraPresencePrvdr", "CameraFactory failed to update. Triggering refresh.", e10);
                    V0 v02 = U.this.f1388e;
                    if (v02 != null) {
                        v02.d();
                    }
                }
            }
        }

        @Override // F.V0.a
        public void onError(Throwable t10) {
            AbstractC2855l.g(t10, "t");
            if (U.this.f1391h.get()) {
                AbstractC3583h0.d("CameraPresencePrvdr", "Error from source camera presence observable. Triggering refresh.", t10);
                V0 v02 = U.this.f1388e;
                if (v02 != null) {
                    v02.d();
                }
            }
        }
    }

    public U(Executor backgroundExecutor) {
        AbstractC2855l.g(backgroundExecutor, "backgroundExecutor");
        this.f1384a = backgroundExecutor;
        this.f1385b = new Object();
        this.f1389f = new b();
        this.f1390g = AbstractC2800q.j();
        this.f1391h = new AtomicBoolean(false);
        this.f1392i = new CopyOnWriteArrayList();
        this.f1393j = new CopyOnWriteArrayList();
        this.f1394k = new LinkedHashMap();
    }

    private final void j() {
        synchronized (this.f1385b) {
            if (this.f1394k.isEmpty()) {
                return;
            }
            Map mapT = j7.K.t(this.f1394k);
            this.f1394k.clear();
            C2735B c2735b = C2735B.f28704a;
            Z z10 = this.f1387d;
            if (z10 != null) {
                LinkedHashSet linkedHashSetM = z10.m();
                AbstractC2855l.f(linkedHashSetM, "getCameras(...)");
                final ArrayList arrayList = new ArrayList(AbstractC2800q.u(linkedHashSetM, 10));
                Iterator it = linkedHashSetM.iterator();
                while (it.hasNext()) {
                    arrayList.add(((M) it.next()).r());
                }
                AbstractC3583h0.a("CameraPresencePrvdr", "Clearing all " + mapT.size() + " state observers.");
                ArrayList arrayList2 = new ArrayList(mapT.size());
                for (Map.Entry entry : mapT.entrySet()) {
                    final String str = (String) entry.getKey();
                    final androidx.lifecycle.B b10 = (androidx.lifecycle.B) entry.getValue();
                    I.c.e().execute(new Runnable() { // from class: F.T
                        @Override // java.lang.Runnable
                        public final void run() {
                            U.k(arrayList, b10, str);
                        }
                    });
                    arrayList2.add(C2735B.f28704a);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(List list, androidx.lifecycle.B b10, String str) {
        Object next;
        AbstractC1776x abstractC1776xC;
        try {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (AbstractC2855l.b(((L) next).f(), str)) {
                        break;
                    }
                }
            }
            L l10 = (L) next;
            if (l10 == null || (abstractC1776xC = l10.c()) == null) {
                return;
            }
            abstractC1776xC.m(b10);
        } catch (IllegalArgumentException unused) {
        }
    }

    private final void l(String str) {
        Z z10 = this.f1387d;
        if (z10 == null) {
            return;
        }
        try {
            M mL = z10.l(str);
            AbstractC2855l.f(mL, "getCamera(...)");
            L lR = mL.r();
            AbstractC2855l.f(lR, "getCameraInfoInternal(...)");
            s(lR);
        } catch (IllegalArgumentException unused) {
            AbstractC3583h0.l("CameraPresencePrvdr", "CameraInternal not found for " + str + ". Cannot setup state observer.");
        }
    }

    private final void m(Set set) {
        Iterator it = this.f1393j.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
    }

    private final void n(Set set) {
        Iterator it = this.f1393j.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
    }

    private final void o(Set set, Set set2) {
        if (!set.isEmpty()) {
            AbstractC3583h0.e("CameraPresencePrvdr", "Notifying " + set.size() + " cameras added.");
            m(set);
        }
        if (set2.isEmpty()) {
            return;
        }
        AbstractC3583h0.e("CameraPresencePrvdr", "Notifying " + set2.size() + " cameras removed.");
        n(set2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(List list) {
        List listP0 = AbstractC2800q.P0(this.f1390g);
        if (AbstractC2855l.b(list, listP0)) {
            return;
        }
        Set setT0 = AbstractC2800q.T0(listP0);
        Set setT02 = AbstractC2800q.T0(list);
        Set setI = j7.T.i(setT02, setT0);
        Set setI2 = j7.T.i(setT0, setT02);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(AbstractC2800q.u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C3596p) it.next()).c());
        }
        try {
            Iterator it2 = setI2.iterator();
            while (it2.hasNext()) {
                q(((C3596p) it2.next()).c());
            }
            Z z10 = this.f1387d;
            if (z10 != null) {
                AbstractC3583h0.a("CameraPresencePrvdr", "Updating CameraRepository...");
                z10.d(arrayList2);
                arrayList.add(z10);
                AbstractC3583h0.a("CameraPresencePrvdr", "CameraRepository updated successfully.");
            }
            if (!this.f1392i.isEmpty()) {
                AbstractC3583h0.a("CameraPresencePrvdr", "Updating " + this.f1392i.size() + " dependent listeners...");
                for (H0 h02 : this.f1392i) {
                    h02.d(arrayList2);
                    AbstractC2855l.d(h02);
                    arrayList.add(h02);
                }
            }
            this.f1390g = list;
            Iterator it3 = setI.iterator();
            while (it3.hasNext()) {
                l(((C3596p) it3.next()).c());
            }
            o(setI, setI2);
        } catch (Exception e10) {
            AbstractC3583h0.d("CameraPresencePrvdr", "A core module failed to update. Rolling back changes.", e10);
            ArrayList arrayList3 = new ArrayList(AbstractC2800q.u(listP0, 10));
            Iterator it4 = listP0.iterator();
            while (it4.hasNext()) {
                arrayList3.add(((C3596p) it4.next()).c());
            }
            for (H0 h03 : AbstractC2800q.O(arrayList)) {
                try {
                    h03.d(arrayList3);
                } catch (Exception e11) {
                    AbstractC3583h0.d("CameraPresencePrvdr", "Failed to rollback listener: " + h03, e11);
                }
            }
            Iterator it5 = setI2.iterator();
            while (it5.hasNext()) {
                l(((C3596p) it5.next()).c());
            }
            Iterator it6 = setI.iterator();
            while (it6.hasNext()) {
                q(((C3596p) it6.next()).c());
            }
        }
    }

    private final void q(String str) {
        synchronized (this.f1385b) {
            final androidx.lifecycle.B b10 = (androidx.lifecycle.B) this.f1394k.remove(str);
            Z z10 = this.f1387d;
            if (b10 != null && z10 != null) {
                try {
                    final M mL = z10.l(str);
                    AbstractC2855l.f(mL, "getCamera(...)");
                    I.c.e().execute(new Runnable() { // from class: F.P
                        @Override // java.lang.Runnable
                        public final void run() {
                            U.r(mL, b10);
                        }
                    });
                    AbstractC3583h0.a("CameraPresencePrvdr", "Removed state observer for: " + str);
                } catch (IllegalArgumentException unused) {
                }
            }
            C2735B c2735b = C2735B.f28704a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(M m10, androidx.lifecycle.B b10) {
        m10.r().c().m(b10);
    }

    private final void s(final L l10) {
        final String strF = l10.f();
        AbstractC2855l.f(strF, "getCameraId(...)");
        if (this.f1391h.get()) {
            synchronized (this.f1385b) {
                if (this.f1394k.containsKey(strF)) {
                    return;
                }
                final androidx.lifecycle.B b10 = new androidx.lifecycle.B() { // from class: F.Q
                    @Override // androidx.lifecycle.B
                    public final void onChanged(Object obj) {
                        U.t(this.f1370a, strF, (AbstractC3599t) obj);
                    }
                };
                I.c.e().execute(new Runnable() { // from class: F.S
                    @Override // java.lang.Runnable
                    public final void run() {
                        U.u(l10, b10);
                    }
                });
                this.f1394k.put(strF, b10);
                AbstractC3583h0.a("CameraPresencePrvdr", "Registered state observer for camera: " + strF);
                C2735B c2735b = C2735B.f28704a;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(U u10, String str, AbstractC3599t abstractC3599t) {
        if (!u10.f1391h.get()) {
            AbstractC3583h0.a("CameraPresencePrvdr", "Ignore camera state change handling since already stop monitoring");
            return;
        }
        if ((abstractC3599t != null ? abstractC3599t.c() : null) == null) {
            if ((abstractC3599t != null ? abstractC3599t.d() : null) != AbstractC3599t.b.CLOSED) {
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Camera ");
        sb.append(str);
        sb.append(" state changed to ");
        sb.append(abstractC3599t.d());
        sb.append(" with error: ");
        AbstractC3599t.a aVarC = abstractC3599t.c();
        sb.append(aVarC != null ? Integer.valueOf(aVarC.d()) : null);
        sb.append(". Triggering refresh.");
        AbstractC3583h0.l("CameraPresencePrvdr", sb.toString());
        V0 v02 = u10.f1388e;
        if (v02 != null) {
            v02.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(L l10, androidx.lifecycle.B b10) {
        l10.c().i(b10);
    }

    public final void i(H0 listener) {
        AbstractC2855l.g(listener, "listener");
        this.f1392i.add(listener);
    }

    public final void v() {
        if (!this.f1391h.getAndSet(false)) {
            AbstractC3583h0.a("CameraPresencePrvdr", "Shutdown called when not monitoring. Ignoring.");
            return;
        }
        AbstractC3583h0.e("CameraPresencePrvdr", "Shutting down CameraPresenceProvider monitoring.");
        V0 v02 = this.f1388e;
        if (v02 != null) {
            v02.e(this.f1389f);
        }
        j();
        this.f1392i.clear();
        this.f1393j.clear();
        this.f1390g = AbstractC2800q.j();
        this.f1386c = null;
        this.f1387d = null;
    }

    public final void w(K cameraFactory, Z cameraRepository) {
        AbstractC2855l.g(cameraFactory, "cameraFactory");
        AbstractC2855l.g(cameraRepository, "cameraRepository");
        if (this.f1391h.compareAndSet(false, true)) {
            AbstractC3583h0.e("CameraPresencePrvdr", "Starting CameraPresenceProvider monitoring.");
            Set<String> setC = cameraFactory.c();
            AbstractC2855l.f(setC, "getAvailableCameraIds(...)");
            ArrayList arrayList = new ArrayList(AbstractC2800q.u(setC, 10));
            for (String str : setC) {
                C3596p.a aVar = C3596p.f33816c;
                AbstractC2855l.d(str);
                arrayList.add(C3596p.a.d(aVar, str, null, null, 6, null));
            }
            this.f1390g = arrayList;
            this.f1386c = cameraFactory;
            this.f1387d = cameraRepository;
            V0 v0B = cameraFactory.b();
            this.f1388e = v0B;
            if (v0B != null) {
                v0B.c(this.f1384a, this.f1389f);
            }
        }
    }
}
