package E2;

import android.graphics.Bitmap;
import g2.AbstractC2662a;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements D2.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f1080c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f1081a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AbstractC2662a f1082b;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final synchronized void f() {
        AbstractC2662a.B(this.f1082b);
        this.f1082b = null;
        this.f1081a = -1;
    }

    @Override // D2.b
    public synchronized AbstractC2662a a(int i10, int i11, int i12) {
        try {
        } finally {
            f();
        }
        return AbstractC2662a.r(this.f1082b);
    }

    @Override // D2.b
    public void b(int i10, AbstractC2662a bitmapReference, int i11) {
        AbstractC2855l.g(bitmapReference, "bitmapReference");
    }

    @Override // D2.b
    public synchronized void c(int i10, AbstractC2662a bitmapReference, int i11) {
        try {
            AbstractC2855l.g(bitmapReference, "bitmapReference");
            if (this.f1082b != null) {
                Object objJ = bitmapReference.J();
                AbstractC2662a abstractC2662a = this.f1082b;
                if (AbstractC2855l.b(objJ, abstractC2662a != null ? (Bitmap) abstractC2662a.J() : null)) {
                    return;
                }
            }
            AbstractC2662a.B(this.f1082b);
            this.f1082b = AbstractC2662a.r(bitmapReference);
            this.f1081a = i10;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // D2.b
    public synchronized void clear() {
        f();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0011  */
    @Override // D2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized boolean contains(int i10) {
        boolean z10;
        if (i10 == this.f1081a) {
            z10 = AbstractC2662a.d0(this.f1082b);
        }
        return z10;
    }

    @Override // D2.b
    public synchronized AbstractC2662a d(int i10) {
        return this.f1081a == i10 ? AbstractC2662a.r(this.f1082b) : null;
    }

    @Override // D2.b
    public synchronized AbstractC2662a e(int i10) {
        return AbstractC2662a.r(this.f1082b);
    }
}
