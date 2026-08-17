package X1;

import W1.c;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class l implements W1.b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Object f12398i = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static l f12399j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f12400k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private W1.d f12401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f12402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f12403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f12404d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f12405e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private IOException f12406f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private c.a f12407g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private l f12408h;

    private l() {
    }

    public static l a() {
        synchronized (f12398i) {
            try {
                l lVar = f12399j;
                if (lVar == null) {
                    return new l();
                }
                f12399j = lVar.f12408h;
                lVar.f12408h = null;
                f12400k--;
                return lVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void c() {
        this.f12401a = null;
        this.f12402b = null;
        this.f12403c = 0L;
        this.f12404d = 0L;
        this.f12405e = 0L;
        this.f12406f = null;
        this.f12407g = null;
    }

    public void b() {
        synchronized (f12398i) {
            try {
                if (f12400k < 5) {
                    c();
                    f12400k++;
                    l lVar = f12399j;
                    if (lVar != null) {
                        this.f12408h = lVar;
                    }
                    f12399j = this;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public l d(W1.d dVar) {
        this.f12401a = dVar;
        return this;
    }

    public l e(long j10) {
        this.f12404d = j10;
        return this;
    }

    public l f(long j10) {
        this.f12405e = j10;
        return this;
    }

    public l g(c.a aVar) {
        this.f12407g = aVar;
        return this;
    }

    public l h(IOException iOException) {
        this.f12406f = iOException;
        return this;
    }

    public l i(long j10) {
        this.f12403c = j10;
        return this;
    }

    public l j(String str) {
        this.f12402b = str;
        return this;
    }
}
