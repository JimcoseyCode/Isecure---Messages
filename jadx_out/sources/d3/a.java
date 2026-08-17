package D3;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.github.penfeizhou.animation.decode.b;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends Drawable implements Animatable, b.j {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Paint f773g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.github.penfeizhou.animation.decode.b f774h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final DrawFilter f775i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Matrix f776j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Set f777k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Bitmap f778l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Handler f779m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Runnable f780n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f781o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Set f782p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f783q;

    /* JADX INFO: renamed from: D3.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class HandlerC0030a extends Handler {
        HandlerC0030a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                Iterator it = new ArrayList(a.this.f777k).iterator();
                while (it.hasNext()) {
                    ((androidx.vectordrawable.graphics.drawable.b) it.next()).c(a.this);
                }
            } else {
                if (i10 != 2) {
                    return;
                }
                Iterator it2 = new ArrayList(a.this.f777k).iterator();
                while (it2.hasNext()) {
                    ((androidx.vectordrawable.graphics.drawable.b) it2.next()).b(a.this);
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.invalidateSelf();
        }
    }

    public a(com.github.penfeizhou.animation.decode.b bVar) {
        Paint paint = new Paint();
        this.f773g = paint;
        this.f775i = new PaintFlagsDrawFilter(0, 3);
        this.f776j = new Matrix();
        this.f777k = new HashSet();
        this.f779m = new HandlerC0030a(Looper.getMainLooper());
        this.f780n = new b();
        this.f781o = true;
        this.f782p = new HashSet();
        this.f783q = false;
        paint.setAntiAlias(true);
        this.f774h = bVar;
    }

    private void e() {
        ArrayList arrayList = new ArrayList();
        Drawable.Callback callback = getCallback();
        boolean z10 = false;
        for (WeakReference weakReference : new HashSet(this.f782p)) {
            Drawable.Callback callback2 = (Drawable.Callback) weakReference.get();
            if (callback2 == null) {
                arrayList.add(weakReference);
            } else if (callback2 == callback) {
                z10 = true;
            } else {
                callback2.invalidateDrawable(this);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f782p.remove((WeakReference) it.next());
        }
        if (z10) {
            return;
        }
        this.f782p.add(new WeakReference(callback));
    }

    private void f() {
        this.f774h.p(this);
        if (this.f781o) {
            this.f774h.S();
        } else {
            if (this.f774h.H()) {
                return;
            }
            this.f774h.S();
        }
    }

    private void g() {
        this.f774h.N(this);
        if (this.f781o) {
            this.f774h.U();
        } else {
            this.f774h.V();
        }
    }

    @Override // com.github.penfeizhou.animation.decode.b.j
    public void a(ByteBuffer byteBuffer) {
        if (isRunning()) {
            Bitmap bitmap = this.f778l;
            if (bitmap == null || bitmap.isRecycled()) {
                this.f778l = Bitmap.createBitmap(this.f774h.s().width() / this.f774h.B(), this.f774h.s().height() / this.f774h.B(), Bitmap.Config.ARGB_8888);
            }
            byteBuffer.rewind();
            if (byteBuffer.remaining() < this.f778l.getByteCount()) {
                return;
            }
            this.f778l.copyPixelsFromBuffer(byteBuffer);
            this.f779m.post(this.f780n);
        }
    }

    @Override // com.github.penfeizhou.animation.decode.b.j
    public void b() {
        Message.obtain(this.f779m, 2).sendToTarget();
    }

    public int d() {
        int iY = this.f774h.y();
        Bitmap bitmap = this.f778l;
        if (bitmap != null && !bitmap.isRecycled()) {
            iY += this.f778l.getAllocationByteCount();
        }
        return Math.max(1, iY);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Bitmap bitmap = this.f778l;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        canvas.setDrawFilter(this.f775i);
        canvas.drawBitmap(this.f778l, this.f776j, this.f773g);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.Callback getCallback() {
        return super.getCallback();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.f783q) {
            return -1;
        }
        try {
            return this.f774h.s().height();
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.f783q) {
            return -1;
        }
        try {
            return this.f774h.s().width();
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public boolean h() {
        return this.f774h.G();
    }

    public void i() {
        this.f774h.J();
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        super.invalidateSelf();
        Iterator it = new HashSet(this.f782p).iterator();
        while (it.hasNext()) {
            Drawable.Callback callback = (Drawable.Callback) ((WeakReference) it.next()).get();
            if (callback != null && callback != getCallback()) {
                callback.invalidateDrawable(this);
            }
        }
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f774h.H();
    }

    public void j() {
        this.f774h.Q();
    }

    public void k(boolean z10) {
        this.f781o = z10;
    }

    public void l(boolean z10) {
        this.f783q = z10;
    }

    @Override // com.github.penfeizhou.animation.decode.b.j
    public void onStart() {
        Message.obtain(this.f779m, 1).sendToTarget();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f773g.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        int iB = this.f774h.B();
        int iR = this.f774h.R(getBounds().width(), getBounds().height());
        float f10 = iR;
        this.f776j.setScale(((getBounds().width() * 1.0f) * f10) / this.f774h.s().width(), ((getBounds().height() * 1.0f) * f10) / this.f774h.s().height());
        if (iR != iB) {
            this.f778l = Bitmap.createBitmap(this.f774h.s().width() / iR, this.f774h.s().height() / iR, Bitmap.Config.ARGB_8888);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f773g.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        e();
        if (this.f781o) {
            if (z10) {
                if (!isRunning()) {
                    f();
                }
            } else if (isRunning()) {
                g();
            }
        }
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        if (this.f774h.H()) {
            this.f774h.U();
        }
        this.f774h.P();
        f();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        g();
    }
}
