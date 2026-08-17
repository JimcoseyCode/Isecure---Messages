package H1;

import D1.n;
import Q1.l;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;
import s1.InterfaceC3316a;
import v1.EnumC3418b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class a implements v1.j {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final C0050a f3637f = new C0050a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final b f3638g = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f3639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f3640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f3641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C0050a f3642d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final H1.b f3643e;

    /* JADX INFO: renamed from: H1.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class C0050a {
        C0050a() {
        }

        InterfaceC3316a a(InterfaceC3316a.InterfaceC0355a interfaceC0355a, s1.c cVar, ByteBuffer byteBuffer, int i10) {
            return new s1.e(interfaceC0355a, cVar, byteBuffer, i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Queue f3644a = l.g(0);

        b() {
        }

        synchronized s1.d a(ByteBuffer byteBuffer) {
            s1.d dVar;
            try {
                dVar = (s1.d) this.f3644a.poll();
                if (dVar == null) {
                    dVar = new s1.d();
                }
            } catch (Throwable th) {
                throw th;
            }
            return dVar.p(byteBuffer);
        }

        synchronized void b(s1.d dVar) {
            dVar.a();
            this.f3644a.offer(dVar);
        }
    }

    public a(Context context, List list, y1.d dVar, y1.b bVar) {
        this(context, list, dVar, bVar, f3638g, f3637f);
    }

    private e a(ByteBuffer byteBuffer, int i10, int i11, s1.d dVar, v1.h hVar) {
        long jB = Q1.g.b();
        try {
            s1.c cVarC = dVar.c();
            if (cVarC.b() > 0 && cVarC.c() == 0) {
                Bitmap.Config config = hVar.b(i.f3684a) == EnumC3418b.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                InterfaceC3316a interfaceC3316aA = this.f3642d.a(this.f3643e, cVarC, byteBuffer, c(cVarC, i10, i11));
                interfaceC3316aA.f(config);
                interfaceC3316aA.d();
                Bitmap bitmapC = interfaceC3316aA.c();
                if (bitmapC == null) {
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        Q1.g.a(jB);
                    }
                    return null;
                }
                e eVar = new e(new c(this.f3639a, interfaceC3316aA, n.b(), i10, i11, bitmapC));
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    Q1.g.a(jB);
                }
                return eVar;
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Q1.g.a(jB);
            }
            return null;
        } finally {
        }
    }

    private static int c(s1.c cVar, int i10, int i11) {
        int iMin = Math.min(cVar.a() / i11, cVar.d() / i10);
        int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
        if (Log.isLoggable("BufferGifDecoder", 2) && iMax > 1) {
            cVar.d();
            cVar.a();
        }
        return iMax;
    }

    @Override // v1.j
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e decode(ByteBuffer byteBuffer, int i10, int i11, v1.h hVar) {
        s1.d dVarA = this.f3641c.a(byteBuffer);
        try {
            return a(byteBuffer, i10, i11, dVarA, hVar);
        } finally {
            this.f3641c.b(dVarA);
        }
    }

    @Override // v1.j
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean handles(ByteBuffer byteBuffer, v1.h hVar) {
        return !((Boolean) hVar.b(i.f3685b)).booleanValue() && com.bumptech.glide.load.a.g(this.f3640b, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }

    a(Context context, List list, y1.d dVar, y1.b bVar, b bVar2, C0050a c0050a) {
        this.f3639a = context.getApplicationContext();
        this.f3640b = list;
        this.f3642d = c0050a;
        this.f3643e = new H1.b(dVar, bVar);
        this.f3641c = bVar2;
    }
}
