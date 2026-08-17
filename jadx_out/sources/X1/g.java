package X1;

import W1.a;
import W1.c;
import X1.f;
import d2.AbstractC2325a;
import h2.C2702a;
import j2.C2766d;
import j2.InterfaceC2763a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class g implements k, Z1.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Class f12363r = g.class;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final long f12364s = TimeUnit.HOURS.toMillis(2);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final long f12365t = TimeUnit.MINUTES.toMillis(30);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f12366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f12367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CountDownLatch f12368c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f12369d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final W1.c f12370e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final Set f12371f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f12372g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f12373h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final C2702a f12374i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final f f12375j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final j f12376k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final W1.a f12377l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f12378m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final b f12379n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final InterfaceC2763a f12380o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Object f12381p = new Object();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f12382q;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (g.this.f12381p) {
                g.this.p();
            }
            g.this.f12382q = true;
            g.this.f12368c.countDown();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f12384a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f12385b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f12386c = -1;

        b() {
        }

        public synchronized long a() {
            return this.f12386c;
        }

        public synchronized long b() {
            return this.f12385b;
        }

        public synchronized void c(long j10, long j11) {
            if (this.f12384a) {
                this.f12385b += j10;
                this.f12386c += j11;
            }
        }

        public synchronized boolean d() {
            return this.f12384a;
        }

        public synchronized void e() {
            this.f12384a = false;
            this.f12386c = -1L;
            this.f12385b = -1L;
        }

        public synchronized void f(long j10, long j11) {
            this.f12386c = j11;
            this.f12385b = j10;
            this.f12384a = true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f12387a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f12388b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f12389c;

        public c(long j10, long j11, long j12) {
            this.f12387a = j10;
            this.f12388b = j11;
            this.f12389c = j12;
        }
    }

    public g(f fVar, j jVar, c cVar, W1.c cVar2, W1.a aVar, Z1.b bVar, Executor executor, boolean z10) {
        this.f12366a = cVar.f12388b;
        long j10 = cVar.f12389c;
        this.f12367b = j10;
        this.f12369d = j10;
        this.f12374i = C2702a.d();
        this.f12375j = fVar;
        this.f12376k = jVar;
        this.f12372g = -1L;
        this.f12370e = cVar2;
        this.f12373h = cVar.f12387a;
        this.f12377l = aVar;
        this.f12379n = new b();
        this.f12380o = C2766d.a();
        this.f12378m = z10;
        this.f12371f = new HashSet();
        if (bVar != null) {
            bVar.a(this);
        }
        if (!z10) {
            this.f12368c = new CountDownLatch(0);
        } else {
            this.f12368c = new CountDownLatch(1);
            executor.execute(new a());
        }
    }

    private V1.a l(f.b bVar, W1.d dVar, String str) {
        V1.a aVarG;
        synchronized (this.f12381p) {
            aVarG = bVar.g(dVar);
            this.f12371f.add(str);
            this.f12379n.c(aVarG.size(), 1L);
        }
        return aVarG;
    }

    private void m(long j10, c.a aVar) throws IOException {
        try {
            Collection<f.a> collectionN = n(this.f12375j.g());
            long jB = this.f12379n.b();
            long j11 = jB - j10;
            int i10 = 0;
            long j12 = 0;
            for (f.a aVar2 : collectionN) {
                if (j12 > j11) {
                    break;
                }
                long jH = this.f12375j.h(aVar2);
                this.f12371f.remove(aVar2.getId());
                if (jH > 0) {
                    i10++;
                    j12 += jH;
                    l lVarE = l.a().j(aVar2.getId()).g(aVar).i(jH).f(jB - j12).e(j10);
                    W1.c cVar = this.f12370e;
                    if (cVar != null) {
                        cVar.h(lVarE);
                    }
                    lVarE.b();
                }
            }
            this.f12379n.c(-j12, -i10);
            this.f12375j.b();
        } catch (IOException e10) {
            this.f12377l.a(a.EnumC0127a.EVICTION, f12363r, "evictAboveSize: " + e10.getMessage(), e10);
            throw e10;
        }
    }

    private Collection n(Collection collection) {
        long jNow = this.f12380o.now() + f12364s;
        ArrayList arrayList = new ArrayList(collection.size());
        ArrayList arrayList2 = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            f.a aVar = (f.a) it.next();
            if (aVar.a() > jNow) {
                arrayList.add(aVar);
            } else {
                arrayList2.add(aVar);
            }
        }
        Collections.sort(arrayList2, this.f12376k.get());
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    private void o() {
        synchronized (this.f12381p) {
            try {
                boolean zP = p();
                s();
                long jB = this.f12379n.b();
                if (jB > this.f12369d && !zP) {
                    this.f12379n.e();
                    p();
                }
                long j10 = this.f12369d;
                if (jB > j10) {
                    m((j10 * 9) / 10, c.a.CACHE_FULL);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean p() {
        long jNow = this.f12380o.now();
        if (this.f12379n.d()) {
            long j10 = this.f12372g;
            if (j10 != -1 && jNow - j10 <= f12365t) {
                return false;
            }
        }
        return q();
    }

    private boolean q() {
        boolean z10;
        long j10;
        long jNow = this.f12380o.now();
        long j11 = f12364s + jNow;
        Set hashSet = (this.f12378m && this.f12371f.isEmpty()) ? this.f12371f : this.f12378m ? new HashSet() : null;
        try {
            long jB = 0;
            long jMax = -1;
            int iB = 0;
            boolean z11 = false;
            int i10 = 0;
            int i11 = 0;
            z10 = false;
            for (f.a aVar : this.f12375j.g()) {
                try {
                    i10++;
                    jB += aVar.b();
                    if (aVar.a() > j11) {
                        i11++;
                        iB = (int) (((long) iB) + aVar.b());
                        j10 = j11;
                        jMax = Math.max(aVar.a() - jNow, jMax);
                        z11 = true;
                    } else {
                        j10 = j11;
                        if (this.f12378m) {
                            c2.k.g(hashSet);
                            hashSet.add(aVar.getId());
                        }
                    }
                    j11 = j10;
                } catch (IOException e10) {
                    e = e10;
                    this.f12377l.a(a.EnumC0127a.GENERIC_IO, f12363r, "calcFileCacheSize: " + e.getMessage(), e);
                    return z10;
                }
            }
            if (z11) {
                this.f12377l.a(a.EnumC0127a.READ_INVALID_ENTRY, f12363r, "Future timestamp found in " + i11 + " files , with a total size of " + iB + " bytes, and a maximum time delta of " + jMax + "ms", null);
            }
            long j12 = i10;
            if (this.f12379n.a() != j12 || this.f12379n.b() != jB) {
                if (this.f12378m && this.f12371f != hashSet) {
                    c2.k.g(hashSet);
                    this.f12371f.clear();
                    this.f12371f.addAll(hashSet);
                }
                this.f12379n.f(jB, j12);
            }
            this.f12372g = jNow;
            return true;
        } catch (IOException e11) {
            e = e11;
            z10 = false;
        }
    }

    private f.b r(String str, W1.d dVar) {
        o();
        return this.f12375j.c(str, dVar);
    }

    private void s() {
        if (this.f12374i.f(this.f12375j.isExternal() ? C2702a.EnumC0285a.EXTERNAL : C2702a.EnumC0285a.INTERNAL, this.f12367b - this.f12379n.b())) {
            this.f12369d = this.f12366a;
        } else {
            this.f12369d = this.f12367b;
        }
    }

    @Override // X1.k
    public void a() {
        synchronized (this.f12381p) {
            try {
                this.f12375j.a();
                this.f12371f.clear();
                W1.c cVar = this.f12370e;
                if (cVar != null) {
                    cVar.b();
                }
            } catch (IOException | NullPointerException e10) {
                this.f12377l.a(a.EnumC0127a.EVICTION, f12363r, "clearAll: " + e10.getMessage(), e10);
            }
            this.f12379n.e();
        }
    }

    @Override // X1.k
    public V1.a b(W1.d dVar) {
        V1.a aVarF;
        l lVarD = l.a().d(dVar);
        try {
            synchronized (this.f12381p) {
                try {
                    List listB = W1.e.b(dVar);
                    String str = null;
                    aVarF = null;
                    for (int i10 = 0; i10 < listB.size(); i10++) {
                        str = (String) listB.get(i10);
                        lVarD.j(str);
                        aVarF = this.f12375j.f(str, dVar);
                        if (aVarF != null) {
                            break;
                        }
                    }
                    if (aVarF == null) {
                        W1.c cVar = this.f12370e;
                        if (cVar != null) {
                            cVar.c(lVarD);
                        }
                        this.f12371f.remove(str);
                    } else {
                        c2.k.g(str);
                        W1.c cVar2 = this.f12370e;
                        if (cVar2 != null) {
                            cVar2.f(lVarD);
                        }
                        this.f12371f.add(str);
                    }
                } finally {
                }
            }
            return aVarF;
        } catch (IOException e10) {
            this.f12377l.a(a.EnumC0127a.GENERIC_IO, f12363r, "getResource", e10);
            lVarD.h(e10);
            W1.c cVar3 = this.f12370e;
            if (cVar3 != null) {
                cVar3.d(lVarD);
            }
            return null;
        } finally {
            lVarD.b();
        }
    }

    @Override // X1.k
    public void c(W1.d dVar) {
        synchronized (this.f12381p) {
            try {
                List listB = W1.e.b(dVar);
                for (int i10 = 0; i10 < listB.size(); i10++) {
                    String str = (String) listB.get(i10);
                    this.f12375j.remove(str);
                    this.f12371f.remove(str);
                }
            } catch (IOException e10) {
                this.f12377l.a(a.EnumC0127a.DELETE_FILE, f12363r, "delete: " + e10.getMessage(), e10);
            }
        }
    }

    @Override // X1.k
    public boolean d(W1.d dVar) {
        synchronized (this.f12381p) {
            if (e(dVar)) {
                return true;
            }
            try {
                List listB = W1.e.b(dVar);
                for (int i10 = 0; i10 < listB.size(); i10++) {
                    String str = (String) listB.get(i10);
                    if (this.f12375j.e(str, dVar)) {
                        this.f12371f.add(str);
                        return true;
                    }
                }
                return false;
            } catch (IOException unused) {
                return false;
            }
        }
    }

    @Override // X1.k
    public boolean e(W1.d dVar) {
        synchronized (this.f12381p) {
            try {
                List listB = W1.e.b(dVar);
                for (int i10 = 0; i10 < listB.size(); i10++) {
                    if (this.f12371f.contains((String) listB.get(i10))) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // X1.k
    public boolean f(W1.d dVar) throws Throwable {
        String str;
        IOException e10;
        String str2 = null;
        try {
            try {
                synchronized (this.f12381p) {
                    try {
                        List listB = W1.e.b(dVar);
                        int i10 = 0;
                        while (i10 < listB.size()) {
                            String str3 = (String) listB.get(i10);
                            if (this.f12375j.d(str3, dVar)) {
                                this.f12371f.add(str3);
                                return true;
                            }
                            i10++;
                            str2 = str3;
                        }
                        return false;
                    } catch (Throwable th) {
                        str = str2;
                        th = th;
                        try {
                            throw th;
                        } catch (IOException e11) {
                            e10 = e11;
                            l lVarH = l.a().d(dVar).j(str).h(e10);
                            W1.c cVar = this.f12370e;
                            if (cVar != null) {
                                cVar.d(lVarH);
                            }
                            lVarH.b();
                            return false;
                        }
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e12) {
            str = null;
            e10 = e12;
        }
    }

    @Override // X1.k
    public V1.a g(W1.d dVar, W1.j jVar) {
        String strA;
        l lVarD = l.a().d(dVar);
        W1.c cVar = this.f12370e;
        if (cVar != null) {
            cVar.a(lVarD);
        }
        synchronized (this.f12381p) {
            strA = W1.e.a(dVar);
        }
        lVarD.j(strA);
        try {
            try {
                f.b bVarR = r(strA, dVar);
                try {
                    bVarR.h(jVar, dVar);
                    V1.a aVarL = l(bVarR, dVar, strA);
                    lVarD.i(aVarL.size()).f(this.f12379n.b());
                    W1.c cVar2 = this.f12370e;
                    if (cVar2 != null) {
                        cVar2.g(lVarD);
                    }
                    return aVarL;
                } finally {
                    if (!bVarR.f()) {
                        AbstractC2325a.i(f12363r, "Failed to delete temp file");
                    }
                }
            } catch (IOException e10) {
                lVarD.h(e10);
                W1.c cVar3 = this.f12370e;
                if (cVar3 != null) {
                    cVar3.e(lVarD);
                }
                AbstractC2325a.j(f12363r, "Failed inserting a file into the cache", e10);
                throw e10;
            }
        } finally {
            lVarD.b();
        }
    }
}
