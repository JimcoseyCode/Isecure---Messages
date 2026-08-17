package m0;

import i7.C2735B;
import j7.AbstractC2800q;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2855l;
import n0.C2957b;
import n0.C2958c;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f29529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C2958c f29530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C2957b f29531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f29532d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f29533e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f29534f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f29535g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f29536h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f29537i;

    public h(int i10) {
        this.f29529a = i10;
        if (i10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f29530b = new C2958c(0, 0.75f);
        this.f29531c = new C2957b();
    }

    private final int e(Object obj, Object obj2) {
        int iF = f(obj, obj2);
        if (iF >= 0) {
            return iF;
        }
        throw new IllegalStateException(("Negative size: " + obj + '=' + obj2).toString());
    }

    protected Object a(Object key) {
        AbstractC2855l.g(key, "key");
        return null;
    }

    protected void b(boolean z10, Object key, Object oldValue, Object obj) {
        AbstractC2855l.g(key, "key");
        AbstractC2855l.g(oldValue, "oldValue");
    }

    public final Object c(Object key) {
        Object objD;
        AbstractC2855l.g(key, "key");
        synchronized (this.f29531c) {
            Object objA = this.f29530b.a(key);
            if (objA != null) {
                this.f29536h++;
                return objA;
            }
            this.f29537i++;
            Object objA2 = a(key);
            if (objA2 == null) {
                return null;
            }
            synchronized (this.f29531c) {
                try {
                    this.f29534f++;
                    objD = this.f29530b.d(key, objA2);
                    if (objD != null) {
                        this.f29530b.d(key, objD);
                    } else {
                        this.f29532d += e(key, objA2);
                        C2735B c2735b = C2735B.f28704a;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (objD != null) {
                b(false, key, objA2, objD);
                return objD;
            }
            g(this.f29529a);
            return objA2;
        }
    }

    public final Object d(Object key, Object value) {
        Object objD;
        AbstractC2855l.g(key, "key");
        AbstractC2855l.g(value, "value");
        synchronized (this.f29531c) {
            try {
                this.f29533e++;
                this.f29532d += e(key, value);
                objD = this.f29530b.d(key, value);
                if (objD != null) {
                    this.f29532d -= e(key, objD);
                }
                C2735B c2735b = C2735B.f28704a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (objD != null) {
            b(false, key, objD, value);
        }
        g(this.f29529a);
        return objD;
    }

    protected int f(Object key, Object value) {
        AbstractC2855l.g(key, "key");
        AbstractC2855l.g(value, "value");
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0056, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
    
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void g(int i10) {
        Object key;
        Object value;
        while (true) {
            synchronized (this.f29531c) {
                try {
                    if (this.f29532d < 0 || (this.f29530b.c() && this.f29532d != 0)) {
                        break;
                    }
                    if (this.f29532d <= i10 || this.f29530b.c()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) AbstractC2800q.f0(this.f29530b.b());
                    if (entry == null) {
                        return;
                    }
                    key = entry.getKey();
                    value = entry.getValue();
                    this.f29530b.e(key);
                    this.f29532d -= e(key, value);
                    this.f29535g++;
                } catch (Throwable th) {
                    throw th;
                }
            }
            b(true, key, value, null);
        }
    }

    public String toString() {
        String str;
        synchronized (this.f29531c) {
            try {
                int i10 = this.f29536h;
                int i11 = this.f29537i + i10;
                str = "LruCache[maxSize=" + this.f29529a + ",hits=" + this.f29536h + ",misses=" + this.f29537i + ",hitRate=" + (i11 != 0 ? (i10 * 100) / i11 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
