package g3;

import android.graphics.Bitmap;
import com.facebook.imageutils.BitmapUtil;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f28175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f28176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f28177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f28178d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final g2.h f28179e;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements g2.h {
        a() {
        }

        @Override // g2.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void release(Bitmap bitmap) {
            try {
                g.this.a(bitmap);
            } finally {
                bitmap.recycle();
            }
        }
    }

    public g(int i10, int i11) {
        c2.k.b(Boolean.valueOf(i10 > 0));
        c2.k.b(Boolean.valueOf(i11 > 0));
        this.f28177c = i10;
        this.f28178d = i11;
        this.f28179e = new a();
    }

    public synchronized void a(Bitmap bitmap) {
        int sizeInBytes = BitmapUtil.getSizeInBytes(bitmap);
        c2.k.c(this.f28175a > 0, "No bitmaps registered.");
        long j10 = sizeInBytes;
        c2.k.d(j10 <= this.f28176b, "Bitmap size bigger than the total registered size: %d, %d", Integer.valueOf(sizeInBytes), Long.valueOf(this.f28176b));
        this.f28176b -= j10;
        this.f28175a--;
    }

    public synchronized int b() {
        return this.f28175a;
    }

    public synchronized int c() {
        return this.f28177c;
    }

    public synchronized int d() {
        return this.f28178d;
    }

    public g2.h e() {
        return this.f28179e;
    }

    public synchronized long f() {
        return this.f28176b;
    }

    public synchronized boolean g(Bitmap bitmap) {
        int sizeInBytes = BitmapUtil.getSizeInBytes(bitmap);
        int i10 = this.f28175a;
        if (i10 < this.f28177c) {
            long j10 = this.f28176b;
            long j11 = sizeInBytes;
            if (j10 + j11 <= this.f28178d) {
                this.f28175a = i10 + 1;
                this.f28176b = j10 + j11;
                return true;
            }
        }
        return false;
    }
}
