package F;

import F.M;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import l1.AbstractC2861a;
import y.AbstractC3583h0;
import y.InterfaceC3584i;
import z.InterfaceC3664a;

/* JADX INFO: renamed from: F.c0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C0473c0 implements InterfaceC3664a.InterfaceC0377a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final StringBuilder f1430a = new StringBuilder();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f1431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f1432c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC3664a f1433d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f1434e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f1435f;

    /* JADX INFO: renamed from: F.c0$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private M.a f1436a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Executor f1437b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final b f1438c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final c f1439d;

        a(M.a aVar, Executor executor, b bVar, c cVar) {
            this.f1436a = aVar;
            this.f1437b = executor;
            this.f1438c = bVar;
            this.f1439d = cVar;
        }

        M.a a() {
            return this.f1436a;
        }

        void b() {
            try {
                Executor executor = this.f1437b;
                final b bVar = this.f1438c;
                Objects.requireNonNull(bVar);
                executor.execute(new Runnable() { // from class: F.b0
                    @Override // java.lang.Runnable
                    public final void run() {
                        bVar.a();
                    }
                });
            } catch (RejectedExecutionException e10) {
                AbstractC3583h0.d("CameraStateRegistry", "Unable to notify camera to configure.", e10);
            }
        }

        void c() {
            try {
                Executor executor = this.f1437b;
                final c cVar = this.f1439d;
                Objects.requireNonNull(cVar);
                executor.execute(new Runnable() { // from class: F.a0
                    @Override // java.lang.Runnable
                    public final void run() {
                        cVar.a();
                    }
                });
            } catch (RejectedExecutionException e10) {
                AbstractC3583h0.d("CameraStateRegistry", "Unable to notify camera to open.", e10);
            }
        }

        M.a d(M.a aVar) {
            M.a aVar2 = this.f1436a;
            this.f1436a = aVar;
            return aVar2;
        }
    }

    /* JADX INFO: renamed from: F.c0$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface b {
        void a();
    }

    /* JADX INFO: renamed from: F.c0$c */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface c {
        void a();
    }

    public C0473c0(InterfaceC3664a interfaceC3664a, int i10) {
        Object obj = new Object();
        this.f1431b = obj;
        this.f1434e = new HashMap();
        this.f1432c = i10;
        synchronized (obj) {
            this.f1433d = interfaceC3664a;
            this.f1435f = this.f1432c;
        }
    }

    private a b(String str) {
        for (InterfaceC3584i interfaceC3584i : this.f1434e.keySet()) {
            if (str.equals(((L) interfaceC3584i.d()).f())) {
                return (a) this.f1434e.get(interfaceC3584i);
            }
        }
        return null;
    }

    private static boolean d(M.a aVar) {
        return aVar != null && aVar.j();
    }

    private void f() {
        if (AbstractC3583h0.f("CameraStateRegistry")) {
            this.f1430a.setLength(0);
            this.f1430a.append("Recalculating open cameras:\n");
            this.f1430a.append(String.format(Locale.US, "%-45s%-22s\n", "Camera", "State"));
            this.f1430a.append("-------------------------------------------------------------------\n");
        }
        int i10 = 0;
        for (Map.Entry entry : this.f1434e.entrySet()) {
            if (AbstractC3583h0.f("CameraStateRegistry")) {
                this.f1430a.append(String.format(Locale.US, "%-45s%-22s\n", ((InterfaceC3584i) entry.getKey()).toString(), ((a) entry.getValue()).a() != null ? ((a) entry.getValue()).a().toString() : "UNKNOWN"));
            }
            if (d(((a) entry.getValue()).a())) {
                i10++;
            }
        }
        if (AbstractC3583h0.f("CameraStateRegistry")) {
            this.f1430a.append("-------------------------------------------------------------------\n");
            this.f1430a.append(String.format(Locale.US, "Open count: %d (Max allowed: %d)", Integer.valueOf(i10), Integer.valueOf(this.f1432c)));
            AbstractC3583h0.a("CameraStateRegistry", this.f1430a.toString());
        }
        this.f1435f = Math.max(this.f1432c - i10, 0);
    }

    private static void h(InterfaceC3584i interfaceC3584i, M.a aVar) {
        if (AbstractC2861a.h()) {
            AbstractC2861a.j("CX:State[" + interfaceC3584i + "]", aVar.ordinal());
        }
    }

    private M.a k(InterfaceC3584i interfaceC3584i) {
        a aVar = (a) this.f1434e.remove(interfaceC3584i);
        if (aVar == null) {
            return null;
        }
        f();
        return aVar.a();
    }

    private M.a l(InterfaceC3584i interfaceC3584i, M.a aVar) {
        M.a aVarD = ((a) H0.g.h((a) this.f1434e.get(interfaceC3584i), "Cannot update state of camera which has not yet been registered. Register with CameraStateRegistry.registerCamera()")).d(aVar);
        M.a aVar2 = M.a.OPENING;
        if (aVar == aVar2) {
            H0.g.j(d(aVar) || aVarD == aVar2, "Cannot mark camera as opening until camera was successful at calling CameraStateRegistry.tryOpenCamera()");
        }
        if (aVarD != aVar) {
            h(interfaceC3584i, aVar);
            f();
        }
        return aVarD;
    }

    @Override // z.InterfaceC3664a.InterfaceC0377a
    public void a(int i10, int i11) {
        synchronized (this.f1431b) {
            boolean z10 = true;
            this.f1432c = i11 == 2 ? 2 : 1;
            boolean z11 = i10 != 2 && i11 == 2;
            if (i10 != 2 || i11 == 2) {
                z10 = false;
            }
            if (z11 || z10) {
                f();
            }
        }
    }

    public boolean c() {
        synchronized (this.f1431b) {
            try {
                Iterator it = this.f1434e.entrySet().iterator();
                while (it.hasNext()) {
                    if (((a) ((Map.Entry) it.next()).getValue()).a() == M.a.CLOSING) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void e(InterfaceC3584i interfaceC3584i, M.a aVar, boolean z10) {
        a aVarB;
        synchronized (this.f1431b) {
            try {
                int i10 = this.f1435f;
                if ((aVar == M.a.RELEASED ? k(interfaceC3584i) : l(interfaceC3584i, aVar)) == aVar) {
                    return;
                }
                HashMap map = null;
                if (this.f1433d.c() == 2 && aVar == M.a.CONFIGURED) {
                    String strG = this.f1433d.g(((L) interfaceC3584i.d()).f());
                    if (strG != null) {
                        aVarB = b(strG);
                    }
                } else {
                    aVarB = null;
                }
                if (i10 < 1 && this.f1435f > 0) {
                    map = new HashMap();
                    for (Map.Entry entry : this.f1434e.entrySet()) {
                        if (((a) entry.getValue()).a() == M.a.PENDING_OPEN) {
                            map.put((InterfaceC3584i) entry.getKey(), (a) entry.getValue());
                        }
                    }
                } else if (aVar == M.a.PENDING_OPEN && this.f1435f > 0) {
                    map = new HashMap();
                    map.put(interfaceC3584i, (a) this.f1434e.get(interfaceC3584i));
                }
                if (map != null && !z10) {
                    map.remove(interfaceC3584i);
                }
                if (map != null) {
                    Iterator it = map.values().iterator();
                    while (it.hasNext()) {
                        ((a) it.next()).c();
                    }
                }
                if (aVarB != null) {
                    aVarB.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void g(InterfaceC3584i interfaceC3584i, Executor executor, b bVar, c cVar) {
        synchronized (this.f1431b) {
            H0.g.j(!this.f1434e.containsKey(interfaceC3584i), "Camera is already registered: " + interfaceC3584i);
            this.f1434e.put(interfaceC3584i, new a(null, executor, bVar, cVar));
        }
    }

    public boolean i(InterfaceC3584i interfaceC3584i) {
        boolean z10;
        synchronized (this.f1431b) {
            try {
                a aVar = (a) H0.g.h((a) this.f1434e.get(interfaceC3584i), "Camera must first be registered with registerCamera()");
                z10 = false;
                if (AbstractC3583h0.f("CameraStateRegistry")) {
                    this.f1430a.setLength(0);
                    this.f1430a.append(String.format(Locale.US, "tryOpenCamera(%s) [Available Cameras: %d, Already Open: %b (Previous state: %s)]", interfaceC3584i, Integer.valueOf(this.f1435f), Boolean.valueOf(d(aVar.a())), aVar.a()));
                }
                if (this.f1435f > 0 || d(aVar.a())) {
                    M.a aVar2 = M.a.OPENING;
                    aVar.d(aVar2);
                    h(interfaceC3584i, aVar2);
                    z10 = true;
                }
                if (AbstractC3583h0.f("CameraStateRegistry")) {
                    this.f1430a.append(String.format(Locale.US, " --> %s", z10 ? "SUCCESS" : "FAIL"));
                    AbstractC3583h0.a("CameraStateRegistry", this.f1430a.toString());
                }
                if (z10) {
                    f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z10;
    }

    public boolean j(String str, String str2) {
        synchronized (this.f1431b) {
            try {
                boolean z10 = true;
                if (this.f1433d.c() != 2) {
                    return true;
                }
                a aVarB = b(str);
                M.a aVarA = aVarB != null ? aVarB.a() : null;
                a aVarB2 = str2 != null ? b(str2) : null;
                M.a aVarA2 = aVarB2 != null ? aVarB2.a() : null;
                M.a aVar = M.a.OPEN;
                boolean z11 = aVar.equals(aVarA) || M.a.CONFIGURED.equals(aVarA);
                boolean z12 = aVar.equals(aVarA2) || M.a.CONFIGURED.equals(aVarA2);
                if (!z11 || !z12) {
                    z10 = false;
                }
                return z10;
            } finally {
            }
        }
    }
}
