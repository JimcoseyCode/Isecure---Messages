package E2;

import android.util.SparseArray;
import d2.AbstractC2325a;
import d3.f;
import d3.o;
import g2.AbstractC2662a;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements D2.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f1074e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Class f1075f = b.class;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T2.c f1076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f1077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SparseArray f1078c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AbstractC2662a f1079d;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final AbstractC2662a c(AbstractC2662a abstractC2662a) {
            f fVarF0 = f.f0(abstractC2662a, o.f25593d, 0);
            AbstractC2855l.f(fVarF0, "of(...)");
            return AbstractC2662a.g0(fVarF0);
        }

        public final AbstractC2662a b(AbstractC2662a abstractC2662a) {
            try {
                if (AbstractC2662a.d0(abstractC2662a)) {
                    AbstractC2855l.d(abstractC2662a);
                    if (abstractC2662a.J() instanceof f) {
                        Object objJ = abstractC2662a.J();
                        AbstractC2855l.e(objJ, "null cannot be cast to non-null type com.facebook.imagepipeline.image.CloseableStaticBitmap");
                        return ((f) objJ).y();
                    }
                }
                AbstractC2662a.B(abstractC2662a);
                return null;
            } finally {
                AbstractC2662a.B(abstractC2662a);
            }
        }

        private a() {
        }
    }

    public b(T2.c animatedFrameCache, boolean z10) {
        AbstractC2855l.g(animatedFrameCache, "animatedFrameCache");
        this.f1076a = animatedFrameCache;
        this.f1077b = z10;
        this.f1078c = new SparseArray();
    }

    private final synchronized void f(int i10) {
        AbstractC2662a abstractC2662a = (AbstractC2662a) this.f1078c.get(i10);
        if (abstractC2662a != null) {
            this.f1078c.delete(i10);
            AbstractC2662a.B(abstractC2662a);
            AbstractC2325a.z(f1075f, "removePreparedReference(%d) removed. Pending frames: %s", Integer.valueOf(i10), this.f1078c);
        }
    }

    @Override // D2.b
    public synchronized AbstractC2662a a(int i10, int i11, int i12) {
        if (!this.f1077b) {
            return null;
        }
        return f1074e.b(this.f1076a.d());
    }

    @Override // D2.b
    public synchronized void b(int i10, AbstractC2662a bitmapReference, int i11) {
        AbstractC2855l.g(bitmapReference, "bitmapReference");
        try {
            AbstractC2662a abstractC2662aC = f1074e.c(bitmapReference);
            if (abstractC2662aC == null) {
                AbstractC2662a.B(abstractC2662aC);
                return;
            }
            AbstractC2662a abstractC2662aA = this.f1076a.a(i10, abstractC2662aC);
            if (AbstractC2662a.d0(abstractC2662aA)) {
                AbstractC2662a.B((AbstractC2662a) this.f1078c.get(i10));
                this.f1078c.put(i10, abstractC2662aA);
                AbstractC2325a.z(f1075f, "cachePreparedFrame(%d) cached. Pending frames: %s", Integer.valueOf(i10), this.f1078c);
            }
            AbstractC2662a.B(abstractC2662aC);
        } catch (Throwable th) {
            AbstractC2662a.B(null);
            throw th;
        }
    }

    @Override // D2.b
    public synchronized void c(int i10, AbstractC2662a bitmapReference, int i11) {
        AbstractC2855l.g(bitmapReference, "bitmapReference");
        f(i10);
        AbstractC2662a abstractC2662aC = null;
        try {
            abstractC2662aC = f1074e.c(bitmapReference);
            if (abstractC2662aC != null) {
                AbstractC2662a.B(this.f1079d);
                this.f1079d = this.f1076a.a(i10, abstractC2662aC);
            }
        } finally {
            AbstractC2662a.B(abstractC2662aC);
        }
    }

    @Override // D2.b
    public synchronized void clear() {
        try {
            AbstractC2662a.B(this.f1079d);
            this.f1079d = null;
            int size = this.f1078c.size();
            for (int i10 = 0; i10 < size; i10++) {
                AbstractC2662a.B((AbstractC2662a) this.f1078c.valueAt(i10));
            }
            this.f1078c.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // D2.b
    public synchronized boolean contains(int i10) {
        return this.f1076a.b(i10);
    }

    @Override // D2.b
    public synchronized AbstractC2662a d(int i10) {
        return f1074e.b(this.f1076a.c(i10));
    }

    @Override // D2.b
    public synchronized AbstractC2662a e(int i10) {
        return f1074e.b(AbstractC2662a.r(this.f1079d));
    }
}
