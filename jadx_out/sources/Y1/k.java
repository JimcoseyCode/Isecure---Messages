package y1;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class k implements d {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Bitmap.Config f33904k = Bitmap.Config.ARGB_8888;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f33905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f33906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f33907c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f33908d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f33909e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f33910f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f33911g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f33912h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f33913i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f33914j;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private interface a {
        void a(Bitmap bitmap);

        void b(Bitmap bitmap);
    }

    k(long j10, l lVar, Set set) {
        this.f33907c = j10;
        this.f33909e = j10;
        this.f33905a = lVar;
        this.f33906b = set;
        this.f33908d = new b();
    }

    private static void f(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
            throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
        }
    }

    private static Bitmap g(int i10, int i11, Bitmap.Config config) {
        if (config == null) {
            config = f33904k;
        }
        return Bitmap.createBitmap(i10, i11, config);
    }

    private void h() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            i();
        }
    }

    private void i() {
        Objects.toString(this.f33905a);
    }

    private void j() {
        q(this.f33909e);
    }

    private static Set k() {
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i10 = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i10 >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    private static l l() {
        return new n();
    }

    private synchronized Bitmap m(int i10, int i11, Bitmap.Config config) {
        Bitmap bitmapD;
        try {
            f(config);
            bitmapD = this.f33905a.d(i10, i11, config != null ? config : f33904k);
            if (bitmapD == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    this.f33905a.a(i10, i11, config);
                }
                this.f33912h++;
            } else {
                this.f33911g++;
                this.f33910f -= (long) this.f33905a.b(bitmapD);
                this.f33908d.a(bitmapD);
                p(bitmapD);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                this.f33905a.a(i10, i11, config);
            }
            h();
        } catch (Throwable th) {
            throw th;
        }
        return bitmapD;
    }

    private static void o(Bitmap bitmap) {
        bitmap.setPremultiplied(true);
    }

    private static void p(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        o(bitmap);
    }

    private synchronized void q(long j10) {
        while (this.f33910f > j10) {
            try {
                Bitmap bitmapRemoveLast = this.f33905a.removeLast();
                if (bitmapRemoveLast == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        i();
                    }
                    this.f33910f = 0L;
                    return;
                } else {
                    this.f33908d.a(bitmapRemoveLast);
                    this.f33910f -= (long) this.f33905a.b(bitmapRemoveLast);
                    this.f33914j++;
                    if (Log.isLoggable("LruBitmapPool", 3)) {
                        this.f33905a.e(bitmapRemoveLast);
                    }
                    h();
                    bitmapRemoveLast.recycle();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // y1.d
    public void a(int i10) {
        if (i10 >= 40 || i10 >= 20) {
            b();
        } else if (i10 >= 20 || i10 == 15) {
            q(n() / 2);
        }
    }

    @Override // y1.d
    public void b() {
        q(0L);
    }

    @Override // y1.d
    public synchronized void c(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable() && this.f33905a.b(bitmap) <= this.f33909e && this.f33906b.contains(bitmap.getConfig())) {
                int iB = this.f33905a.b(bitmap);
                this.f33905a.c(bitmap);
                this.f33908d.b(bitmap);
                this.f33913i++;
                this.f33910f += (long) iB;
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    this.f33905a.e(bitmap);
                }
                h();
                j();
                return;
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                this.f33905a.e(bitmap);
                bitmap.isMutable();
                this.f33906b.contains(bitmap.getConfig());
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // y1.d
    public Bitmap d(int i10, int i11, Bitmap.Config config) {
        Bitmap bitmapM = m(i10, i11, config);
        if (bitmapM == null) {
            return g(i10, i11, config);
        }
        bitmapM.eraseColor(0);
        return bitmapM;
    }

    @Override // y1.d
    public Bitmap e(int i10, int i11, Bitmap.Config config) {
        Bitmap bitmapM = m(i10, i11, config);
        return bitmapM == null ? g(i10, i11, config) : bitmapM;
    }

    public long n() {
        return this.f33909e;
    }

    public k(long j10) {
        this(j10, l(), k());
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class b implements a {
        b() {
        }

        @Override // y1.k.a
        public void a(Bitmap bitmap) {
        }

        @Override // y1.k.a
        public void b(Bitmap bitmap) {
        }
    }
}
