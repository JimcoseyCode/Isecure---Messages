package V2;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import d3.k;
import f2.h;
import g2.AbstractC2662a;
import g3.D;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l2.InterfaceC2864a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements InterfaceC2864a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f11629c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f11630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.facebook.imagepipeline.memory.d f11631b;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final BitmapFactory.Options b(int i10, Bitmap.Config config) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inDither = true;
            options.inPreferredConfig = config;
            options.inPurgeable = true;
            options.inInputShareable = true;
            options.inSampleSize = i10;
            options.inMutable = true;
            return options;
        }

        private a() {
        }
    }

    public c(D poolFactory) {
        AbstractC2855l.g(poolFactory, "poolFactory");
        this.f11630a = new b(poolFactory.h());
        com.facebook.imagepipeline.memory.d dVarD = poolFactory.d();
        AbstractC2855l.f(dVarD, "getFlexByteArrayPool(...)");
        this.f11631b = dVarD;
    }

    @Override // l2.InterfaceC2864a
    public Bitmap a(int i10, int i11, Bitmap.Config bitmapConfig) throws Throwable {
        k kVar;
        AbstractC2855l.g(bitmapConfig, "bitmapConfig");
        AbstractC2662a abstractC2662aA = this.f11630a.a((short) i10, (short) i11);
        AbstractC2855l.f(abstractC2662aA, "generate(...)");
        try {
            kVar = new k(abstractC2662aA);
        } catch (Throwable th) {
            th = th;
            kVar = null;
        }
        try {
            kVar.M0(Q2.b.f9065b);
            BitmapFactory.Options optionsB = f11629c.b(kVar.W(), bitmapConfig);
            int size = ((h) abstractC2662aA.J()).size();
            Object objJ = abstractC2662aA.J();
            AbstractC2855l.f(objJ, "get(...)");
            AbstractC2662a abstractC2662aA2 = this.f11631b.a(size + 2);
            Object objJ2 = abstractC2662aA2.J();
            AbstractC2855l.f(objJ2, "get(...)");
            byte[] bArr = (byte[]) objJ2;
            ((h) objJ).h(0, bArr, 0, size);
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, size, optionsB);
            if (bitmapDecodeByteArray == null) {
                throw new IllegalStateException("Required value was null.");
            }
            bitmapDecodeByteArray.setHasAlpha(true);
            bitmapDecodeByteArray.eraseColor(0);
            AbstractC2662a.B(abstractC2662aA2);
            k.k(kVar);
            AbstractC2662a.B(abstractC2662aA);
            return bitmapDecodeByteArray;
        } catch (Throwable th2) {
            th = th2;
            AbstractC2662a.B(null);
            k.k(kVar);
            AbstractC2662a.B(abstractC2662aA);
            throw th;
        }
    }
}
