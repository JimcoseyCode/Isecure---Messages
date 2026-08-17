package k3;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.os.Build;
import d2.AbstractC2325a;
import d3.k;
import java.io.OutputStream;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f29120d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f29121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f29122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f29123c = "SimpleImageTranscoder";

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Bitmap.CompressFormat b(Q2.c cVar) {
            return cVar == null ? Bitmap.CompressFormat.JPEG : cVar == Q2.b.f9065b ? Bitmap.CompressFormat.JPEG : cVar == Q2.b.f9066c ? Bitmap.CompressFormat.PNG : Q2.b.a(cVar) ? Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.JPEG;
        }

        private a() {
        }
    }

    public g(boolean z10, int i10) {
        this.f29121a = z10;
        this.f29122b = i10;
    }

    private final int e(k kVar, X2.h hVar, X2.g gVar) {
        if (this.f29121a) {
            return C2827a.b(hVar, gVar, kVar, this.f29122b);
        }
        return 1;
    }

    @Override // k3.c
    public String a() {
        return this.f29123c;
    }

    @Override // k3.c
    public boolean b(k encodedImage, X2.h hVar, X2.g gVar) {
        AbstractC2855l.g(encodedImage, "encodedImage");
        if (hVar == null) {
            hVar = X2.h.f12449c.a();
        }
        return this.f29121a && C2827a.b(hVar, gVar, encodedImage, this.f29122b) > 1;
    }

    @Override // k3.c
    public b c(k encodedImage, OutputStream outputStream, X2.h hVar, X2.g gVar, Q2.c cVar, Integer num, ColorSpace colorSpace) throws Throwable {
        Bitmap bitmapCreateBitmap;
        AbstractC2855l.g(encodedImage, "encodedImage");
        AbstractC2855l.g(outputStream, "outputStream");
        Integer num2 = num == null ? 85 : num;
        X2.h hVarA = hVar == null ? X2.h.f12449c.a() : hVar;
        int iE = e(encodedImage, hVarA, gVar);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = iE;
        if (colorSpace != null && Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = colorSpace;
        }
        try {
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(encodedImage.J(), null, options);
            if (bitmapDecodeStream == null) {
                AbstractC2325a.m("SimpleImageTranscoder", "Couldn't decode the EncodedImage InputStream ! ");
                return new b(2);
            }
            Matrix matrixG = e.g(encodedImage, hVarA);
            if (matrixG != null) {
                try {
                    bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeStream, 0, 0, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight(), matrixG, false);
                } catch (OutOfMemoryError e10) {
                    e = e10;
                    bitmapCreateBitmap = bitmapDecodeStream;
                    AbstractC2325a.n("SimpleImageTranscoder", "Out-Of-Memory during transcode", e);
                    b bVar = new b(2);
                    bitmapCreateBitmap.recycle();
                    bitmapDecodeStream.recycle();
                    return bVar;
                } catch (Throwable th) {
                    th = th;
                    bitmapCreateBitmap = bitmapDecodeStream;
                    bitmapCreateBitmap.recycle();
                    bitmapDecodeStream.recycle();
                    throw th;
                }
            } else {
                bitmapCreateBitmap = bitmapDecodeStream;
            }
            try {
                try {
                    bitmapCreateBitmap.compress(f29120d.b(cVar), num2.intValue(), outputStream);
                    b bVar2 = new b(iE > 1 ? 0 : 1);
                    bitmapCreateBitmap.recycle();
                    bitmapDecodeStream.recycle();
                    return bVar2;
                } catch (OutOfMemoryError e11) {
                    e = e11;
                    AbstractC2325a.n("SimpleImageTranscoder", "Out-Of-Memory during transcode", e);
                    b bVar3 = new b(2);
                    bitmapCreateBitmap.recycle();
                    bitmapDecodeStream.recycle();
                    return bVar3;
                }
            } catch (Throwable th2) {
                th = th2;
                bitmapCreateBitmap.recycle();
                bitmapDecodeStream.recycle();
                throw th;
            }
        } catch (OutOfMemoryError e12) {
            AbstractC2325a.n("SimpleImageTranscoder", "Out-Of-Memory during transcode", e12);
            return new b(2);
        }
    }

    @Override // k3.c
    public boolean d(Q2.c imageFormat) {
        AbstractC2855l.g(imageFormat, "imageFormat");
        return imageFormat == Q2.b.f9075l || imageFormat == Q2.b.f9065b;
    }
}
