package d3;

import android.graphics.Bitmap;
import com.facebook.imageutils.BitmapUtil;
import g2.AbstractC2662a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class b extends AbstractC2328a implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static boolean f25564o = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private AbstractC2662a f25565j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile Bitmap f25566k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final p f25567l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f25568m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f25569n;

    protected b(Bitmap bitmap, g2.h hVar, p pVar, int i10, int i11) {
        this.f25566k = (Bitmap) c2.k.g(bitmap);
        this.f25565j = AbstractC2662a.w0(this.f25566k, (g2.h) c2.k.g(hVar));
        this.f25567l = pVar;
        this.f25568m = i10;
        this.f25569n = i11;
    }

    private synchronized AbstractC2662a g0() {
        AbstractC2662a abstractC2662a;
        abstractC2662a = this.f25565j;
        this.f25565j = null;
        this.f25566k = null;
        return abstractC2662a;
    }

    private static int i0(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getHeight();
    }

    private static int k0(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getWidth();
    }

    public static boolean l0() {
        return f25564o;
    }

    @Override // d3.f
    public int F() {
        return this.f25568m;
    }

    @Override // d3.f
    public int I0() {
        return this.f25569n;
    }

    @Override // d3.AbstractC2328a, d3.e
    public p Z() {
        return this.f25567l;
    }

    @Override // d3.e, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        AbstractC2662a abstractC2662aG0 = g0();
        if (abstractC2662aG0 != null) {
            abstractC2662aG0.close();
        }
    }

    @Override // d3.e, d3.m
    public int getHeight() {
        int i10;
        return (this.f25568m % 180 != 0 || (i10 = this.f25569n) == 5 || i10 == 7) ? k0(this.f25566k) : i0(this.f25566k);
    }

    @Override // d3.e, d3.m
    public int getWidth() {
        int i10;
        return (this.f25568m % 180 != 0 || (i10 = this.f25569n) == 5 || i10 == 7) ? i0(this.f25566k) : k0(this.f25566k);
    }

    @Override // d3.d
    public Bitmap h0() {
        return this.f25566k;
    }

    @Override // d3.e
    public synchronized boolean isClosed() {
        return this.f25565j == null;
    }

    @Override // d3.e
    public int l() {
        return BitmapUtil.getSizeInBytes(this.f25566k);
    }

    @Override // d3.f
    public synchronized AbstractC2662a y() {
        return AbstractC2662a.r(this.f25565j);
    }

    protected b(AbstractC2662a abstractC2662a, p pVar, int i10, int i11) {
        AbstractC2662a abstractC2662a2 = (AbstractC2662a) c2.k.g(abstractC2662a.m());
        this.f25565j = abstractC2662a2;
        this.f25566k = (Bitmap) abstractC2662a2.J();
        this.f25567l = pVar;
        this.f25568m = i10;
        this.f25569n = i11;
    }
}
