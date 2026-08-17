package com.github.penfeizhou.animation.decode;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.github.penfeizhou.animation.io.Reader;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final Rect f20849u = new Rect();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f20850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final P3.b f20851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f20852c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f20855f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Set f20857h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f20858i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Runnable f20859j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected int f20860k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Set f20861l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Object f20862m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected Map f20863n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected ByteBuffer f20864o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected volatile Rect f20865p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private com.github.penfeizhou.animation.io.e f20866q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Reader f20867r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f20868s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private volatile k f20869t;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected List f20853d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected int f20854e = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Integer f20856g = null;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.f20858i.get()) {
                return;
            }
            if (!b.this.q()) {
                b.this.U();
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jT = b.this.T();
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            b.this.f20852c.removeCallbacks(b.this.f20859j);
            b.this.f20852c.postDelayed(this, Math.max(0L, jT - jCurrentTimeMillis2));
            for (j jVar : b.this.f20857h) {
                ByteBuffer byteBuffer = b.this.f20864o;
                if (byteBuffer != null) {
                    jVar.a(byteBuffer);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.github.penfeizhou.animation.decode.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class RunnableC0219b implements Runnable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ j f20871g;

        RunnableC0219b(j jVar) {
            this.f20871g = jVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.f20857h.add(this.f20871g);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class c implements Runnable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ j f20873g;

        c(j jVar) {
            this.f20873g = jVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.f20857h.remove(this.f20873g);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.f20857h.size() == 0) {
                b.this.U();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class e implements Runnable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Thread f20876g;

        e(Thread thread) {
            this.f20876g = thread;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    if (b.this.f20865p == null) {
                        if (b.this.f20867r == null) {
                            b bVar = b.this;
                            bVar.f20867r = bVar.A(bVar.f20851b.a());
                        } else {
                            b.this.f20867r.reset();
                        }
                        b bVar2 = b.this;
                        bVar2.D(bVar2.K(bVar2.f20867r));
                    }
                } catch (Throwable th) {
                    LockSupport.unpark(this.f20876g);
                    throw th;
                }
            } catch (Exception e10) {
                e = e10;
                e.printStackTrace();
                b.this.f20865p = b.f20849u;
            } catch (OutOfMemoryError e11) {
                e = e11;
                e.printStackTrace();
                b.this.f20865p = b.f20849u;
            }
            LockSupport.unpark(this.f20876g);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.E();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.F();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.f20855f = 0;
            b bVar = b.this;
            bVar.f20854e = -1;
            bVar.f20868s = false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class i implements Runnable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f20881g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f20882h;

        i(int i10, boolean z10) {
            this.f20881g = i10;
            this.f20882h = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.F();
            try {
                b bVar = b.this;
                bVar.f20860k = this.f20881g;
                bVar.D(bVar.K(bVar.A(bVar.f20851b.a())));
                if (this.f20882h) {
                    b.this.E();
                }
            } catch (IOException e10) {
                e10.printStackTrace();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface j {
        void a(ByteBuffer byteBuffer);

        void b();

        void onStart();
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private enum k {
        IDLE,
        RUNNING,
        INITIALIZING,
        FINISHING
    }

    public b(P3.b bVar, j jVar) {
        HashSet hashSet = new HashSet();
        this.f20857h = hashSet;
        this.f20858i = new AtomicBoolean(true);
        this.f20859j = new a();
        this.f20860k = 1;
        this.f20861l = new HashSet();
        this.f20862m = new Object();
        this.f20863n = new WeakHashMap();
        this.f20866q = C();
        this.f20867r = null;
        this.f20868s = false;
        this.f20869t = k.IDLE;
        this.f20851b = bVar;
        if (jVar != null) {
            hashSet.add(jVar);
        }
        int iA = K3.a.b().a();
        this.f20850a = iA;
        this.f20852c = new Handler(K3.a.b().c(iA));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D(Rect rect) {
        this.f20865p = rect;
        long jWidth = ((long) rect.width()) * ((long) rect.height());
        int i10 = this.f20860k;
        long j10 = ((jWidth / (((long) i10) * ((long) i10))) + 1) * 4;
        try {
            this.f20864o = ByteBuffer.allocate((int) j10);
            if (this.f20866q == null) {
                this.f20866q = C();
            }
        } catch (OutOfMemoryError e10) {
            String.format("OutOfMemoryError in FrameSeqDecoder: Buffer needed: %.2fMB (%,d bytes)", Double.valueOf(j10 / 1048576.0d), Long.valueOf(j10));
            this.f20864o = null;
            this.f20865p = f20849u;
            throw e10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E() {
        this.f20858i.compareAndSet(true, false);
        System.currentTimeMillis();
        try {
            if (w() == 0) {
                try {
                    Reader reader = this.f20867r;
                    if (reader == null) {
                        this.f20867r = A(this.f20851b.a());
                    } else {
                        reader.reset();
                    }
                    D(K(this.f20867r));
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            r();
            System.currentTimeMillis();
            this.f20869t = k.RUNNING;
            if (z() != 0 && this.f20868s) {
                r();
                return;
            }
            this.f20854e = -1;
            this.f20852c.removeCallbacks(this.f20859j);
            this.f20859j.run();
            Iterator it = this.f20857h.iterator();
            while (it.hasNext()) {
                ((j) it.next()).onStart();
            }
        } catch (Throwable th2) {
            r();
            System.currentTimeMillis();
            this.f20869t = k.RUNNING;
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F() {
        this.f20852c.removeCallbacks(this.f20859j);
        this.f20853d.clear();
        synchronized (this.f20862m) {
            try {
                for (Bitmap bitmap : this.f20861l) {
                    if (bitmap != null && !bitmap.isRecycled()) {
                        bitmap.recycle();
                    }
                }
                this.f20861l.clear();
            } finally {
            }
        }
        if (this.f20864o != null) {
            this.f20864o = null;
        }
        this.f20863n.clear();
        try {
            Reader reader = this.f20867r;
            if (reader != null) {
                reader.close();
                this.f20867r = null;
            }
            com.github.penfeizhou.animation.io.e eVar = this.f20866q;
            if (eVar != null) {
                eVar.close();
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        }
        M();
        this.f20869t = k.IDLE;
        Iterator it = this.f20857h.iterator();
        while (it.hasNext()) {
            ((j) it.next()).b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long T() {
        int i10 = this.f20854e + 1;
        this.f20854e = i10;
        if (i10 >= w()) {
            this.f20854e = 0;
            this.f20855f++;
        }
        com.github.penfeizhou.animation.decode.a aVarU = u(this.f20854e);
        if (aVarU == null) {
            return 0L;
        }
        O(aVarU);
        return aVarU.frameDuration;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean q() {
        if (!H() || w() == 0) {
            return false;
        }
        if (z() <= 0 || this.f20855f < z() - 1) {
            return true;
        }
        if (this.f20855f == z() - 1 && this.f20854e < w() - 1) {
            return true;
        }
        this.f20868s = true;
        return false;
    }

    private String r() {
        return PointerEventHelper.POINTER_TYPE_UNKNOWN;
    }

    private int z() {
        Integer num = this.f20856g;
        return num != null ? num.intValue() : x();
    }

    protected abstract Reader A(Reader reader);

    public int B() {
        return this.f20860k;
    }

    protected abstract com.github.penfeizhou.animation.io.e C();

    public boolean G() {
        return this.f20858i.get();
    }

    public boolean H() {
        return this.f20869t == k.RUNNING || this.f20869t == k.INITIALIZING;
    }

    protected Bitmap I(int i10, int i11) {
        synchronized (this.f20862m) {
            try {
                Iterator it = this.f20861l.iterator();
                Bitmap bitmapCreateBitmap = null;
                while (it.hasNext()) {
                    int i12 = i10 * i11 * 4;
                    Bitmap bitmap = (Bitmap) it.next();
                    if (bitmap != null && bitmap.getAllocationByteCount() >= i12) {
                        it.remove();
                        if (bitmap.getWidth() != i10 || bitmap.getHeight() != i11) {
                            if (i10 > 0 && i11 > 0) {
                                bitmap.reconfigure(i10, i11, Bitmap.Config.ARGB_8888);
                            }
                        }
                        bitmap.eraseColor(0);
                        return bitmap;
                    }
                    bitmapCreateBitmap = bitmap;
                }
                if (i10 <= 0 || i11 <= 0) {
                    return null;
                }
                try {
                    try {
                        bitmapCreateBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                } catch (OutOfMemoryError e11) {
                    e11.printStackTrace();
                }
                return bitmapCreateBitmap;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void J() {
        this.f20852c.removeCallbacks(this.f20859j);
        this.f20858i.compareAndSet(false, true);
    }

    protected abstract Rect K(Reader reader);

    protected void L(Bitmap bitmap) {
        synchronized (this.f20862m) {
            if (bitmap != null) {
                try {
                    this.f20861l.add(bitmap);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    protected abstract void M();

    public void N(j jVar) {
        this.f20852c.post(new c(jVar));
    }

    protected abstract void O(com.github.penfeizhou.animation.decode.a aVar);

    public void P() {
        this.f20852c.post(new h());
    }

    public void Q() {
        this.f20858i.compareAndSet(true, false);
        this.f20852c.removeCallbacks(this.f20859j);
        this.f20852c.post(this.f20859j);
    }

    public int R(int i10, int i11) {
        int iT = t(i10, i11);
        if (iT != B()) {
            boolean zH = H();
            this.f20852c.removeCallbacks(this.f20859j);
            this.f20852c.post(new i(iT, zH));
        }
        return iT;
    }

    public void S() {
        if (this.f20865p == f20849u) {
            return;
        }
        if (this.f20869t != k.RUNNING) {
            k kVar = this.f20869t;
            k kVar2 = k.INITIALIZING;
            if (kVar != kVar2) {
                if (this.f20869t == k.FINISHING) {
                    r();
                    Objects.toString(this.f20869t);
                }
                this.f20869t = kVar2;
                if (Looper.myLooper() == this.f20852c.getLooper()) {
                    E();
                    return;
                } else {
                    this.f20852c.post(new f());
                    return;
                }
            }
        }
        r();
    }

    public void U() {
        if (this.f20865p == f20849u) {
            return;
        }
        k kVar = this.f20869t;
        k kVar2 = k.FINISHING;
        if (kVar == kVar2 || this.f20869t == k.IDLE) {
            r();
            return;
        }
        if (this.f20869t == k.INITIALIZING) {
            r();
            Objects.toString(this.f20869t);
        }
        this.f20869t = kVar2;
        if (Looper.myLooper() == this.f20852c.getLooper()) {
            F();
        } else {
            this.f20852c.post(new g());
        }
    }

    public void V() {
        this.f20852c.post(new d());
    }

    public void p(j jVar) {
        this.f20852c.post(new RunnableC0219b(jVar));
    }

    public Rect s() {
        if (this.f20865p == null) {
            k kVar = k.IDLE;
            Thread threadCurrentThread = Thread.currentThread();
            this.f20852c.post(new e(threadCurrentThread));
            LockSupport.park(threadCurrentThread);
        }
        return this.f20865p == null ? f20849u : this.f20865p;
    }

    protected int t(int i10, int i11) {
        int i12 = 1;
        if (i10 != 0 && i11 != 0) {
            int iMin = Math.min(s().width() / i10, s().height() / i11);
            while (true) {
                int i13 = i12 * 2;
                if (i13 > iMin) {
                    break;
                }
                i12 = i13;
            }
        }
        return i12;
    }

    public com.github.penfeizhou.animation.decode.a u(int i10) {
        if (i10 < 0 || i10 >= this.f20853d.size()) {
            return null;
        }
        return (com.github.penfeizhou.animation.decode.a) this.f20853d.get(i10);
    }

    public Bitmap v(int i10) throws IOException {
        if (this.f20869t != k.IDLE) {
            r();
            return null;
        }
        this.f20869t = k.RUNNING;
        this.f20858i.compareAndSet(true, false);
        if (this.f20853d.size() == 0) {
            Reader reader = this.f20867r;
            if (reader == null) {
                this.f20867r = A(this.f20851b.a());
            } else {
                reader.reset();
            }
            D(K(this.f20867r));
        }
        if (i10 < 0) {
            i10 += this.f20853d.size();
        }
        int i11 = i10 >= 0 ? i10 : 0;
        this.f20854e = -1;
        while (this.f20854e < i11 && q()) {
            T();
        }
        this.f20864o.rewind();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(s().width() / B(), s().height() / B(), Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.copyPixelsFromBuffer(this.f20864o);
        F();
        return bitmapCreateBitmap;
    }

    public int w() {
        return this.f20853d.size();
    }

    protected abstract int x();

    public int y() {
        int iCapacity;
        synchronized (this.f20862m) {
            try {
                iCapacity = 0;
                for (Bitmap bitmap : this.f20861l) {
                    if (!bitmap.isRecycled()) {
                        iCapacity += bitmap.getAllocationByteCount();
                    }
                }
                ByteBuffer byteBuffer = this.f20864o;
                if (byteBuffer != null) {
                    iCapacity += byteBuffer.capacity();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iCapacity;
    }
}
