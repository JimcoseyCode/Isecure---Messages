package androidx.camera.extensions.internal.sessionprocessor;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f15278a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LongSparseArray f15279b = new LongSparseArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Map f15280c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final LongSparseArray f15281d = new LongSparseArray();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    a f15282e;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    interface a {
    }

    c() {
    }

    private void a(LongSparseArray longSparseArray, long j10, Object obj) {
        List arrayList = (List) longSparseArray.get(j10);
        if (arrayList == null) {
            arrayList = new ArrayList();
            longSparseArray.put(j10, arrayList);
        }
        arrayList.add(obj);
    }

    private long f(TotalCaptureResult totalCaptureResult) {
        Long l10 = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP);
        if (l10 != null) {
            return l10.longValue();
        }
        return -1L;
    }

    private void h() {
        synchronized (this.f15278a) {
            try {
                int size = this.f15279b.size() - 1;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    List list = (List) this.f15279b.valueAt(size);
                    if (!list.isEmpty()) {
                        TotalCaptureResult totalCaptureResult = (TotalCaptureResult) list.get(0);
                        long jF = f(totalCaptureResult);
                        H0.g.i(jF == this.f15279b.keyAt(size));
                        List list2 = (List) this.f15281d.get(jF);
                        if (list2 != null && !list2.isEmpty()) {
                            android.support.v4.media.session.b.a(list2.get(0));
                            i(this.f15281d, jF, null);
                            list.remove(totalCaptureResult);
                            if (list.isEmpty()) {
                                this.f15279b.removeAt(size);
                            }
                        }
                    }
                    size--;
                }
                j();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void i(LongSparseArray longSparseArray, long j10, Object obj) {
        List list = (List) longSparseArray.get(j10);
        if (list != null) {
            list.remove(obj);
            if (list.isEmpty()) {
                longSparseArray.remove(j10);
            }
        }
    }

    private void j() {
        synchronized (this.f15278a) {
            try {
                if (this.f15281d.size() != 0 && this.f15279b.size() != 0) {
                    long jKeyAt = this.f15281d.keyAt(0);
                    Long lValueOf = Long.valueOf(jKeyAt);
                    long jKeyAt2 = this.f15279b.keyAt(0);
                    H0.g.a(!Long.valueOf(jKeyAt2).equals(lValueOf));
                    if (jKeyAt2 > jKeyAt) {
                        for (int size = this.f15281d.size() - 1; size >= 0; size--) {
                            if (this.f15281d.keyAt(size) < jKeyAt2) {
                                Iterator it = ((List) this.f15281d.valueAt(size)).iterator();
                                if (it.hasNext()) {
                                    android.support.v4.media.session.b.a(it.next());
                                    throw null;
                                }
                                this.f15281d.removeAt(size);
                            }
                        }
                    } else {
                        for (int size2 = this.f15279b.size() - 1; size2 >= 0; size2--) {
                            if (this.f15279b.keyAt(size2) < jKeyAt) {
                                this.f15279b.removeAt(size2);
                            }
                        }
                    }
                }
            } finally {
            }
        }
    }

    void b(TotalCaptureResult totalCaptureResult) {
        c(totalCaptureResult, 0);
    }

    void c(TotalCaptureResult totalCaptureResult, int i10) {
        synchronized (this.f15278a) {
            try {
                long jF = f(totalCaptureResult);
                if (jF == -1) {
                    return;
                }
                a(this.f15279b, jF, totalCaptureResult);
                this.f15280c.put(totalCaptureResult, Integer.valueOf(i10));
                h();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void d() {
        synchronized (this.f15278a) {
            try {
                this.f15279b.clear();
                for (int i10 = 0; i10 < this.f15281d.size(); i10++) {
                    Iterator it = ((List) this.f15281d.get(this.f15281d.keyAt(i10))).iterator();
                    if (it.hasNext()) {
                        android.support.v4.media.session.b.a(it.next());
                        throw null;
                    }
                }
                this.f15281d.clear();
                this.f15280c.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void e() {
        synchronized (this.f15278a) {
            this.f15282e = null;
        }
    }

    void g(d dVar) {
        synchronized (this.f15278a) {
            a(this.f15281d, dVar.get().getTimestamp(), dVar);
        }
        h();
    }

    void k(a aVar) {
        synchronized (this.f15278a) {
            this.f15282e = aVar;
        }
    }
}
