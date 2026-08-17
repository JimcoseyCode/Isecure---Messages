package I2;

import D2.c;
import T2.d;
import android.graphics.Bitmap;
import android.graphics.Rect;
import d2.AbstractC2325a;
import g2.AbstractC2662a;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f3919f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Class f3920g = b.class;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final D2.b f3921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private R2.a f3922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f3923c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f3924d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d.b f3925e;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: I2.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class C0053b implements d.b {
        C0053b() {
        }

        @Override // T2.d.b
        public void a(int i10, Bitmap bitmap) {
            AbstractC2855l.g(bitmap, "bitmap");
        }

        @Override // T2.d.b
        public AbstractC2662a b(int i10) {
            return b.this.f3921a.d(i10);
        }
    }

    public b(D2.b bitmapFrameCache, R2.a animatedDrawableBackend, boolean z10) {
        AbstractC2855l.g(bitmapFrameCache, "bitmapFrameCache");
        AbstractC2855l.g(animatedDrawableBackend, "animatedDrawableBackend");
        this.f3921a = bitmapFrameCache;
        this.f3922b = animatedDrawableBackend;
        this.f3923c = z10;
        C0053b c0053b = new C0053b();
        this.f3925e = c0053b;
        this.f3924d = new d(this.f3922b, z10, c0053b);
    }

    @Override // D2.c
    public boolean a(int i10, Bitmap targetBitmap) {
        AbstractC2855l.g(targetBitmap, "targetBitmap");
        try {
            this.f3924d.h(i10, targetBitmap);
            return true;
        } catch (IllegalStateException e10) {
            AbstractC2325a.l(f3920g, e10, "Rendering of frame unsuccessful. Frame number: %d", Integer.valueOf(i10));
            return false;
        }
    }

    @Override // D2.c
    public int c() {
        return this.f3922b.getHeight();
    }

    @Override // D2.c
    public void d(Rect rect) {
        R2.a aVarG = this.f3922b.g(rect);
        AbstractC2855l.f(aVarG, "forNewBounds(...)");
        if (aVarG != this.f3922b) {
            this.f3922b = aVarG;
            this.f3924d = new d(aVarG, this.f3923c, this.f3925e);
        }
    }

    @Override // D2.c
    public int e() {
        return this.f3922b.getWidth();
    }
}
