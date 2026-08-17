package s;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Range;
import android.util.Size;
import java.util.HashMap;
import java.util.Map;
import y.AbstractC3583h0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f32025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v.n f32026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f32027c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f32028d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f32029e = new HashMap();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    interface a {
        StreamConfigurationMap a();

        Range[] b(Size size);

        Size[] c(int i10);

        Size[] d(Range range);

        long e(int i10, Size size);

        Size[] f(int i10);

        int[] g();

        Size[] h();
    }

    private X(StreamConfigurationMap streamConfigurationMap, v.n nVar) {
        this.f32025a = new Y(streamConfigurationMap);
        this.f32026b = nVar;
    }

    static X i(StreamConfigurationMap streamConfigurationMap, v.n nVar) {
        return new X(streamConfigurationMap, nVar);
    }

    public Size[] a(int i10) {
        if (this.f32028d.containsKey(Integer.valueOf(i10))) {
            if (((Size[]) this.f32028d.get(Integer.valueOf(i10))) == null) {
                return null;
            }
            return (Size[]) ((Size[]) this.f32028d.get(Integer.valueOf(i10))).clone();
        }
        Size[] sizeArrC = this.f32025a.c(i10);
        if (sizeArrC != null && sizeArrC.length > 0) {
            sizeArrC = this.f32026b.b(sizeArrC, i10);
        }
        this.f32028d.put(Integer.valueOf(i10), sizeArrC);
        if (sizeArrC != null) {
            return (Size[]) sizeArrC.clone();
        }
        return null;
    }

    public Range[] b(Size size) {
        return this.f32025a.b(size);
    }

    public Size[] c() {
        return this.f32025a.h();
    }

    public Size[] d(Range range) {
        return this.f32025a.d(range);
    }

    public int[] e() {
        int[] iArrG = this.f32025a.g();
        if (iArrG == null) {
            return null;
        }
        return (int[]) iArrG.clone();
    }

    public long f(int i10, Size size) {
        try {
            return this.f32025a.e(i10, size);
        } catch (RuntimeException e10) {
            AbstractC3583h0.m("StreamConfigurationMapCompat", "Failed to get min frame duration for format = " + i10 + " and size = " + size, e10);
            return 0L;
        }
    }

    public Size[] g(int i10) {
        Size[] sizeArrF = null;
        if (this.f32027c.containsKey(Integer.valueOf(i10))) {
            if (((Size[]) this.f32027c.get(Integer.valueOf(i10))) == null) {
                return null;
            }
            return (Size[]) ((Size[]) this.f32027c.get(Integer.valueOf(i10))).clone();
        }
        try {
            sizeArrF = this.f32025a.f(i10);
        } catch (Throwable th) {
            AbstractC3583h0.m("StreamConfigurationMapCompat", "Failed to get output sizes for " + i10, th);
        }
        if (sizeArrF != null && sizeArrF.length != 0) {
            Size[] sizeArrB = this.f32026b.b(sizeArrF, i10);
            this.f32027c.put(Integer.valueOf(i10), sizeArrB);
            return (Size[]) sizeArrB.clone();
        }
        AbstractC3583h0.l("StreamConfigurationMapCompat", "Retrieved output sizes array is null or empty for format " + i10);
        return sizeArrF;
    }

    public StreamConfigurationMap h() {
        return this.f32025a.a();
    }
}
