package b0;

import F.InterfaceC0513v0;
import F.InterfaceC0515w0;
import Z.AbstractC1582v;
import Z.C1576o;
import android.util.Size;
import g0.s0;
import h0.AbstractC2688b;
import h0.AbstractC2689c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import y.C3563H;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class h implements InterfaceC0513v0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC0513v0 f18627c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set f18628d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set f18629e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Set f18630f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final s0.a f18631g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map f18632h = new HashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map f18633i = new HashMap();

    public h(InterfaceC0513v0 interfaceC0513v0, Collection collection, Collection collection2, Collection collection3, s0.a aVar) {
        c(collection2);
        this.f18627c = interfaceC0513v0;
        this.f18628d = new HashSet(collection);
        this.f18630f = new HashSet(collection2);
        this.f18629e = new HashSet(collection3);
        this.f18631g = aVar;
    }

    private static void c(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C3563H c3563h = (C3563H) it.next();
            if (!c3563h.e()) {
                throw new IllegalArgumentException("Contains non-fully specified DynamicRange: " + c3563h);
            }
        }
    }

    private InterfaceC0515w0 d(AbstractC1582v.b bVar) {
        i iVarC;
        H0.g.a(this.f18628d.contains(bVar));
        InterfaceC0515w0 interfaceC0515w0B = this.f18627c.b(bVar.e(1));
        for (Size size : bVar.f()) {
            if (this.f18629e.contains(size)) {
                TreeMap treeMap = new TreeMap(new H.e());
                ArrayList arrayList = new ArrayList();
                for (C3563H c3563h : this.f18630f) {
                    if (!i(interfaceC0515w0B, c3563h) && (iVarC = f(c3563h).c(size)) != null) {
                        InterfaceC0515w0.c cVarK = iVarC.k();
                        s0 s0VarA = this.f18631g.a(cVarK.i());
                        if (s0VarA != null && s0VarA.a(size.getWidth(), size.getHeight())) {
                            treeMap.put(cVarK.k(), iVarC);
                            arrayList.add(AbstractC2689c.a(cVarK, size, s0VarA.c()));
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    InterfaceC0515w0 interfaceC0515w0 = (InterfaceC0515w0) O.d.a(size, treeMap);
                    Objects.requireNonNull(interfaceC0515w0);
                    InterfaceC0515w0 interfaceC0515w02 = interfaceC0515w0;
                    return InterfaceC0515w0.b.h(interfaceC0515w02.a(), interfaceC0515w02.b(), interfaceC0515w02.c(), arrayList);
                }
            }
        }
        return null;
    }

    private AbstractC1582v.b e(int i10) {
        Iterator it = this.f18628d.iterator();
        while (it.hasNext()) {
            AbstractC1582v.b bVar = (AbstractC1582v.b) ((AbstractC1582v) it.next());
            if (bVar.e(1) == i10) {
                return bVar;
            }
        }
        return null;
    }

    private C1576o f(C3563H c3563h) {
        if (this.f18633i.containsKey(c3563h)) {
            C1576o c1576o = (C1576o) this.f18633i.get(c3563h);
            Objects.requireNonNull(c1576o);
            return c1576o;
        }
        C1576o c1576o2 = new C1576o(new e(this.f18627c, c3563h), 1);
        this.f18633i.put(c3563h, c1576o2);
        return c1576o2;
    }

    private InterfaceC0515w0 g(int i10) {
        if (this.f18632h.containsKey(Integer.valueOf(i10))) {
            return (InterfaceC0515w0) this.f18632h.get(Integer.valueOf(i10));
        }
        InterfaceC0515w0 interfaceC0515w0B = this.f18627c.b(i10);
        AbstractC1582v.b bVarE = e(i10);
        if (bVarE != null && !h(interfaceC0515w0B)) {
            interfaceC0515w0B = j(interfaceC0515w0B, d(bVarE));
        }
        this.f18632h.put(Integer.valueOf(i10), interfaceC0515w0B);
        return interfaceC0515w0B;
    }

    private boolean h(InterfaceC0515w0 interfaceC0515w0) {
        if (interfaceC0515w0 == null) {
            return false;
        }
        Iterator it = this.f18630f.iterator();
        while (it.hasNext()) {
            if (!i(interfaceC0515w0, (C3563H) it.next())) {
                return false;
            }
        }
        return true;
    }

    private static boolean i(InterfaceC0515w0 interfaceC0515w0, C3563H c3563h) {
        if (interfaceC0515w0 == null) {
            return false;
        }
        Iterator it = interfaceC0515w0.d().iterator();
        while (it.hasNext()) {
            if (AbstractC2688b.f((InterfaceC0515w0.c) it.next(), c3563h)) {
                return true;
            }
        }
        return false;
    }

    private static InterfaceC0515w0 j(InterfaceC0515w0 interfaceC0515w0, InterfaceC0515w0 interfaceC0515w02) {
        if (interfaceC0515w0 == null && interfaceC0515w02 == null) {
            return null;
        }
        int iA = interfaceC0515w0 != null ? interfaceC0515w0.a() : interfaceC0515w02.a();
        int iB = interfaceC0515w0 != null ? interfaceC0515w0.b() : interfaceC0515w02.b();
        List listC = interfaceC0515w0 != null ? interfaceC0515w0.c() : interfaceC0515w02.c();
        ArrayList arrayList = new ArrayList();
        if (interfaceC0515w0 != null) {
            arrayList.addAll(interfaceC0515w0.d());
        }
        if (interfaceC0515w02 != null) {
            arrayList.addAll(interfaceC0515w02.d());
        }
        return InterfaceC0515w0.b.h(iA, iB, listC, arrayList);
    }

    @Override // F.InterfaceC0513v0
    public boolean a(int i10) {
        return g(i10) != null;
    }

    @Override // F.InterfaceC0513v0
    public InterfaceC0515w0 b(int i10) {
        return g(i10);
    }
}
