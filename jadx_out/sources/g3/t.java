package g3;

import android.graphics.Bitmap;
import f2.InterfaceC2603d;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class t implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final InterfaceC2665A f28203a = new j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f28204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f28205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final F f28206d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f28207e;

    public t(int i10, int i11, F f10, InterfaceC2603d interfaceC2603d) {
        this.f28204b = i10;
        this.f28205c = i11;
        this.f28206d = f10;
        if (interfaceC2603d != null) {
            interfaceC2603d.a(this);
        }
    }

    private Bitmap g(int i10) {
        this.f28206d.a(i10);
        return Bitmap.createBitmap(1, i10, Bitmap.Config.ALPHA_8);
    }

    private synchronized void j(int i10) {
        Bitmap bitmap;
        while (this.f28207e > i10 && (bitmap = (Bitmap) this.f28203a.pop()) != null) {
            int iA = this.f28203a.a(bitmap);
            this.f28207e -= iA;
            this.f28206d.e(iA);
        }
    }

    @Override // f2.InterfaceC2605f
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public synchronized Bitmap get(int i10) {
        try {
            int i11 = this.f28207e;
            int i12 = this.f28204b;
            if (i11 > i12) {
                j(i12);
            }
            Bitmap bitmap = (Bitmap) this.f28203a.get(i10);
            if (bitmap == null) {
                return g(i10);
            }
            int iA = this.f28203a.a(bitmap);
            this.f28207e -= iA;
            this.f28206d.b(iA);
            return bitmap;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // f2.InterfaceC2605f, g2.h
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void release(Bitmap bitmap) {
        int iA = this.f28203a.a(bitmap);
        if (iA <= this.f28205c) {
            this.f28206d.g(iA);
            this.f28203a.put(bitmap);
            synchronized (this) {
                this.f28207e += iA;
            }
        }
    }
}
