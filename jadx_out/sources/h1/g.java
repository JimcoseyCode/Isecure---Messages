package H1;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.k;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import s1.InterfaceC3316a;
import v1.l;
import x1.AbstractC3526j;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3316a f3660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f3661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f3662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final k f3663d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final y1.d f3664e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f3665f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f3666g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f3667h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.bumptech.glide.j f3668i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private a f3669j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f3670k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private a f3671l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Bitmap f3672m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private l f3673n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private a f3674o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f3675p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f3676q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f3677r;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class a extends N1.a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Handler f3678g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final int f3679h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final long f3680i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private Bitmap f3681j;

        a(Handler handler, int i10, long j10) {
            this.f3678g = handler;
            this.f3679h = i10;
            this.f3680i = j10;
        }

        Bitmap a() {
            return this.f3681j;
        }

        @Override // N1.d
        public void onLoadCleared(Drawable drawable) {
            this.f3681j = null;
        }

        @Override // N1.d
        public void onResourceReady(Bitmap bitmap, O1.b bVar) {
            this.f3681j = bitmap;
            this.f3678g.sendMessageAtTime(this.f3678g.obtainMessage(1, this), this.f3680i);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface b {
        void a();
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class c implements Handler.Callback {
        c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                g.this.m((a) message.obj);
                return true;
            }
            if (i10 != 2) {
                return false;
            }
            g.this.f3663d.e((a) message.obj);
            return false;
        }
    }

    g(com.bumptech.glide.b bVar, InterfaceC3316a interfaceC3316a, int i10, int i11, l lVar, Bitmap bitmap) {
        this(bVar.g(), com.bumptech.glide.b.v(bVar.i()), interfaceC3316a, null, i(com.bumptech.glide.b.v(bVar.i()), i10, i11), lVar, bitmap);
    }

    private static v1.f g() {
        return new P1.c(Double.valueOf(Math.random()));
    }

    private static com.bumptech.glide.j i(k kVar, int i10, int i11) {
        return kVar.b().a(((M1.f) ((M1.f) M1.f.h0(AbstractC3526j.f33373b).f0(true)).a0(true)).Q(i10, i11));
    }

    private void l() {
        if (!this.f3665f || this.f3666g) {
            return;
        }
        if (this.f3667h) {
            Q1.k.b(this.f3674o == null, "Pending target must be null when starting from the first frame");
            this.f3660a.g();
            this.f3667h = false;
        }
        a aVar = this.f3674o;
        if (aVar != null) {
            this.f3674o = null;
            m(aVar);
            return;
        }
        this.f3666g = true;
        long jUptimeMillis = SystemClock.uptimeMillis() + ((long) this.f3660a.e());
        this.f3660a.d();
        this.f3671l = new a(this.f3661b, this.f3660a.h(), jUptimeMillis);
        this.f3668i.a(M1.f.i0(g())).x0(this.f3660a).q0(this.f3671l);
    }

    private void n() {
        Bitmap bitmap = this.f3672m;
        if (bitmap != null) {
            this.f3664e.c(bitmap);
            this.f3672m = null;
        }
    }

    private void p() {
        if (this.f3665f) {
            return;
        }
        this.f3665f = true;
        this.f3670k = false;
        l();
    }

    private void q() {
        this.f3665f = false;
    }

    void a() {
        this.f3662c.clear();
        n();
        q();
        a aVar = this.f3669j;
        if (aVar != null) {
            this.f3663d.e(aVar);
            this.f3669j = null;
        }
        a aVar2 = this.f3671l;
        if (aVar2 != null) {
            this.f3663d.e(aVar2);
            this.f3671l = null;
        }
        a aVar3 = this.f3674o;
        if (aVar3 != null) {
            this.f3663d.e(aVar3);
            this.f3674o = null;
        }
        this.f3660a.clear();
        this.f3670k = true;
    }

    ByteBuffer b() {
        return this.f3660a.b().asReadOnlyBuffer();
    }

    Bitmap c() {
        a aVar = this.f3669j;
        return aVar != null ? aVar.a() : this.f3672m;
    }

    int d() {
        a aVar = this.f3669j;
        if (aVar != null) {
            return aVar.f3679h;
        }
        return -1;
    }

    Bitmap e() {
        return this.f3672m;
    }

    int f() {
        return this.f3660a.a();
    }

    int h() {
        return this.f3677r;
    }

    int j() {
        return this.f3660a.i() + this.f3675p;
    }

    int k() {
        return this.f3676q;
    }

    void m(a aVar) {
        this.f3666g = false;
        if (this.f3670k) {
            this.f3661b.obtainMessage(2, aVar).sendToTarget();
            return;
        }
        if (!this.f3665f) {
            if (this.f3667h) {
                this.f3661b.obtainMessage(2, aVar).sendToTarget();
                return;
            } else {
                this.f3674o = aVar;
                return;
            }
        }
        if (aVar.a() != null) {
            n();
            a aVar2 = this.f3669j;
            this.f3669j = aVar;
            for (int size = this.f3662c.size() - 1; size >= 0; size--) {
                ((b) this.f3662c.get(size)).a();
            }
            if (aVar2 != null) {
                this.f3661b.obtainMessage(2, aVar2).sendToTarget();
            }
        }
        l();
    }

    void o(l lVar, Bitmap bitmap) {
        this.f3673n = (l) Q1.k.e(lVar);
        this.f3672m = (Bitmap) Q1.k.e(bitmap);
        this.f3668i = this.f3668i.a(new M1.f().d0(lVar));
        this.f3675p = Q1.l.i(bitmap);
        this.f3676q = bitmap.getWidth();
        this.f3677r = bitmap.getHeight();
    }

    void r(b bVar) {
        if (this.f3670k) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        if (this.f3662c.contains(bVar)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean zIsEmpty = this.f3662c.isEmpty();
        this.f3662c.add(bVar);
        if (zIsEmpty) {
            p();
        }
    }

    void s(b bVar) {
        this.f3662c.remove(bVar);
        if (this.f3662c.isEmpty()) {
            q();
        }
    }

    g(y1.d dVar, k kVar, InterfaceC3316a interfaceC3316a, Handler handler, com.bumptech.glide.j jVar, l lVar, Bitmap bitmap) {
        this.f3662c = new ArrayList();
        this.f3663d = kVar;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new c()) : handler;
        this.f3664e = dVar;
        this.f3661b = handler;
        this.f3668i = jVar;
        this.f3660a = interfaceC3316a;
        o(lVar, bitmap);
    }
}
