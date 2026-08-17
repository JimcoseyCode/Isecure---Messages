package F3;

import F3.d;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import com.github.penfeizhou.animation.decode.b;
import com.github.penfeizhou.animation.io.Reader;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class b extends com.github.penfeizhou.animation.decode.b {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private G3.b f1834v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f1835w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final Paint f1836x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final C0041b f1837y;

    /* JADX INFO: renamed from: F3.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class C0041b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        byte f1838a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Rect f1839b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        ByteBuffer f1840c;

        private C0041b() {
            this.f1839b = new Rect();
        }
    }

    public b(P3.b bVar, b.j jVar) {
        super(bVar, jVar);
        Paint paint = new Paint();
        this.f1836x = paint;
        this.f1837y = new C0041b();
        paint.setAntiAlias(true);
    }

    @Override // com.github.penfeizhou.animation.decode.b
    protected void M() {
        this.f1837y.f1840c = null;
        this.f1834v = null;
    }

    @Override // com.github.penfeizhou.animation.decode.b
    protected void O(com.github.penfeizhou.animation.decode.a aVar) {
        if (aVar == null || this.f20865p == null) {
            return;
        }
        try {
            Bitmap bitmapI = I(this.f20865p.width() / this.f20860k, this.f20865p.height() / this.f20860k);
            Canvas canvas = (Canvas) this.f20863n.get(bitmapI);
            if (canvas == null) {
                canvas = new Canvas(bitmapI);
                this.f20863n.put(bitmapI, canvas);
            }
            Canvas canvas2 = canvas;
            if (aVar instanceof c) {
                this.f20864o.rewind();
                bitmapI.copyPixelsFromBuffer(this.f20864o);
                if (this.f20854e == 0) {
                    canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
                } else {
                    canvas2.save();
                    canvas2.clipRect(this.f1837y.f1839b);
                    C0041b c0041b = this.f1837y;
                    byte b10 = c0041b.f1838a;
                    if (b10 == 1) {
                        canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
                    } else if (b10 == 2) {
                        c0041b.f1840c.rewind();
                        bitmapI.copyPixelsFromBuffer(this.f1837y.f1840c);
                    }
                    canvas2.restore();
                }
                if (((c) aVar).f1845b == 2) {
                    C0041b c0041b2 = this.f1837y;
                    if (c0041b2.f1838a != 2) {
                        c0041b2.f1840c.rewind();
                        bitmapI.copyPixelsToBuffer(this.f1837y.f1840c);
                    }
                }
                this.f1837y.f1838a = ((c) aVar).f1845b;
                canvas2.save();
                if (((c) aVar).f1844a == 0) {
                    int i10 = aVar.frameX;
                    int i11 = this.f20860k;
                    int i12 = aVar.frameY;
                    canvas2.clipRect(i10 / i11, i12 / i11, (i10 + aVar.frameWidth) / i11, (i12 + aVar.frameHeight) / i11);
                    canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
                }
                Rect rect = this.f1837y.f1839b;
                int i13 = aVar.frameX;
                int i14 = this.f20860k;
                int i15 = aVar.frameY;
                rect.set(i13 / i14, i15 / i14, (i13 + aVar.frameWidth) / i14, (i15 + aVar.frameHeight) / i14);
                canvas2.restore();
            }
            Bitmap bitmapI2 = I(aVar.frameWidth, aVar.frameHeight);
            L(aVar.draw(canvas2, this.f1836x, this.f20860k, bitmapI2, C()));
            L(bitmapI2);
            this.f20864o.rewind();
            bitmapI.copyPixelsToBuffer(this.f20864o);
            L(bitmapI);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.penfeizhou.animation.decode.b
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public G3.a A(Reader reader) {
        return new G3.a(reader);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.penfeizhou.animation.decode.b
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public G3.b C() {
        if (this.f1834v == null) {
            this.f1834v = new G3.b();
        }
        return this.f1834v;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.penfeizhou.animation.decode.b
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public Rect K(G3.a aVar) throws d.a {
        e eVar;
        boolean z10;
        List listB = d.b(aVar);
        ArrayList arrayList = new ArrayList();
        byte[] bArr = new byte[0];
        Iterator it = listB.iterator();
        c cVar = null;
        boolean z11 = false;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (!it.hasNext() || ((z10 = (eVar = (e) it.next()) instanceof i))) {
                break;
            }
            if (eVar instanceof F3.a) {
                this.f1835w = ((F3.a) eVar).f1833f;
                z11 = true;
            } else if (eVar instanceof f) {
                cVar = new c(aVar, (f) eVar);
                cVar.f1848e = arrayList;
                cVar.f1846c = bArr;
                this.f20853d.add(cVar);
            } else if (eVar instanceof g) {
                if (cVar != null) {
                    cVar.f1847d.add(eVar);
                }
            } else if (eVar instanceof h) {
                if (!z11) {
                    k kVar = new k(aVar);
                    kVar.frameWidth = i10;
                    kVar.frameHeight = i11;
                    this.f20853d.add(kVar);
                    this.f1835w = 1;
                    break;
                }
                if (cVar != null) {
                    cVar.f1847d.add(eVar);
                }
            } else if (eVar instanceof j) {
                j jVar = (j) eVar;
                i10 = jVar.f1868e;
                i11 = jVar.f1869f;
                bArr = jVar.f1870g;
            } else if (!z10) {
                arrayList.add(eVar);
            }
        }
        int i12 = i10 * i11;
        int i13 = this.f20860k;
        this.f20864o = ByteBuffer.allocate(((i12 / (i13 * i13)) + 1) * 4);
        C0041b c0041b = this.f1837y;
        int i14 = this.f20860k;
        c0041b.f1840c = ByteBuffer.allocate(((i12 / (i14 * i14)) + 1) * 4);
        return new Rect(0, 0, i10, i11);
    }

    @Override // com.github.penfeizhou.animation.decode.b
    protected int x() {
        return this.f1835w;
    }
}
