package h3;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import android.os.Build;
import c2.k;
import com.facebook.imagepipeline.platform.PreverificationHelper;
import d2.AbstractC2325a;
import f2.C2601b;
import g2.AbstractC2662a;
import g2.h;
import g3.i;
import g3.r;
import i2.C2724a;
import i2.C2725b;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b implements d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Class f28279f = b.class;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final byte[] f28280g = {-1, -39};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f28281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f28282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f28283c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final PreverificationHelper f28284d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final H0.e f28285e;

    public b(i iVar, H0.e eVar, f fVar) {
        this.f28284d = Build.VERSION.SDK_INT >= 26 ? new PreverificationHelper() : null;
        this.f28281a = iVar;
        if (iVar instanceof r) {
            this.f28282b = fVar.a();
            this.f28283c = fVar.b();
        }
        this.f28285e = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c7 A[Catch: all -> 0x00a3, RuntimeException -> 0x00a6, IllegalArgumentException -> 0x00a8, TRY_LEAVE, TryCatch #8 {IllegalArgumentException -> 0x00a8, RuntimeException -> 0x00a6, blocks: (B:36:0x007d, B:39:0x0087, B:49:0x009f, B:68:0x00c7, B:64:0x00c0, B:65:0x00c3, B:62:0x00ba), top: B:98:0x007d, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f1  */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private AbstractC2662a c(InputStream inputStream, BitmapFactory.Options options, Rect rect, ColorSpace colorSpace) {
        Bitmap bitmap;
        ByteBuffer byteBufferAllocate;
        Bitmap bitmapDecodeStream;
        BitmapRegionDecoder bitmapRegionDecoderNewInstance;
        PreverificationHelper preverificationHelper;
        k.g(inputStream);
        int i10 = options.outWidth;
        int iHeight = options.outHeight;
        ?? r02 = i10;
        if (rect != null) {
            int iWidth = rect.width() / options.inSampleSize;
            iHeight = rect.height() / options.inSampleSize;
            r02 = iWidth;
        }
        int i11 = Build.VERSION.SDK_INT;
        boolean z10 = i11 >= 26 && (preverificationHelper = this.f28284d) != null && preverificationHelper.shouldUseHardwareBitmapConfig(options.inPreferredConfig);
        BitmapRegionDecoder bitmapRegionDecoder = 0;
        try {
            try {
                if (rect != null || !z10) {
                    if (rect != null && z10) {
                        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                    }
                    if (!this.f28282b) {
                        Bitmap bitmap2 = (Bitmap) this.f28281a.get(d(r02, iHeight, options));
                        bitmap = bitmap2;
                        if (bitmap2 == null) {
                            throw new NullPointerException("BitmapPool.get returned null");
                        }
                    }
                    options.inBitmap = bitmap;
                    if (i11 >= 26) {
                        if (colorSpace == null) {
                            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
                        }
                        options.inPreferredColorSpace = colorSpace;
                    }
                    byteBufferAllocate = (ByteBuffer) this.f28285e.acquire();
                    if (byteBufferAllocate == null) {
                        byteBufferAllocate = ByteBuffer.allocate(C2601b.c());
                    }
                    options.inTempStorage = byteBufferAllocate.array();
                    if (rect != null || bitmap == 0) {
                        bitmapDecodeStream = null;
                    } else {
                        Bitmap.Config config = options.inPreferredConfig;
                        try {
                            if (config != null) {
                                try {
                                    bitmap.reconfigure(r02, iHeight, config);
                                    bitmapRegionDecoderNewInstance = BitmapRegionDecoder.newInstance(inputStream, true);
                                    if (bitmapRegionDecoderNewInstance != null) {
                                        try {
                                            bitmapDecodeStream = bitmapRegionDecoderNewInstance.decodeRegion(rect, options);
                                        } catch (IOException unused) {
                                            AbstractC2325a.k(f28279f, "Could not decode region %s, decoding full bitmap instead.", rect);
                                            if (bitmapRegionDecoderNewInstance != null) {
                                                bitmapRegionDecoderNewInstance.recycle();
                                            }
                                            bitmapDecodeStream = null;
                                        }
                                    } else {
                                        bitmapDecodeStream = null;
                                    }
                                    if (bitmapRegionDecoderNewInstance != null) {
                                        bitmapRegionDecoderNewInstance.recycle();
                                    }
                                } catch (IOException unused2) {
                                    bitmapRegionDecoderNewInstance = null;
                                } catch (Throwable th) {
                                    th = th;
                                    if (bitmapRegionDecoder != 0) {
                                        bitmapRegionDecoder.recycle();
                                    }
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            bitmapRegionDecoder = r02;
                        }
                    }
                    if (bitmapDecodeStream == null) {
                        bitmapDecodeStream = BitmapFactory.decodeStream(inputStream, null, options);
                    }
                    this.f28285e.release(byteBufferAllocate);
                    if (bitmap != 0 || bitmap == bitmapDecodeStream) {
                        return !this.f28283c ? AbstractC2662a.w0(bitmapDecodeStream, a.f28286a) : AbstractC2662a.w0(bitmapDecodeStream, this.f28281a);
                    }
                    this.f28281a.release(bitmap);
                    if (bitmapDecodeStream != null) {
                        bitmapDecodeStream.recycle();
                    }
                    throw new IllegalStateException();
                }
                options.inMutable = false;
                options.inTempStorage = byteBufferAllocate.array();
                if (rect != null) {
                    bitmapDecodeStream = null;
                }
                if (bitmapDecodeStream == null) {
                }
                this.f28285e.release(byteBufferAllocate);
                if (bitmap != 0) {
                }
                if (!this.f28283c) {
                }
            } catch (Throwable th3) {
                this.f28285e.release(byteBufferAllocate);
                throw th3;
            }
        } catch (IllegalArgumentException e10) {
            if (bitmap != 0) {
                this.f28281a.release(bitmap);
            }
            try {
                inputStream.reset();
                Bitmap bitmapDecodeStream2 = BitmapFactory.decodeStream(inputStream);
                if (bitmapDecodeStream2 == null) {
                    throw e10;
                }
                AbstractC2662a abstractC2662aW0 = AbstractC2662a.w0(bitmapDecodeStream2, V2.f.a());
                this.f28285e.release(byteBufferAllocate);
                return abstractC2662aW0;
            } catch (IOException unused3) {
                throw e10;
            }
        } catch (RuntimeException e11) {
            if (bitmap != 0) {
                this.f28281a.release(bitmap);
            }
            throw e11;
        }
        bitmap = 0;
        options.inBitmap = bitmap;
        if (i11 >= 26) {
        }
        byteBufferAllocate = (ByteBuffer) this.f28285e.acquire();
        if (byteBufferAllocate == null) {
        }
    }

    private static BitmapFactory.Options e(d3.k kVar, Bitmap.Config config, boolean z10) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = kVar.W();
        options.inJustDecodeBounds = true;
        options.inDither = true;
        boolean z11 = Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE;
        if (!z11) {
            options.inPreferredConfig = config;
        }
        options.inMutable = true;
        if (!z10) {
            BitmapFactory.decodeStream(kVar.J(), null, options);
            if (options.outWidth == -1 || options.outHeight == -1) {
                throw new IllegalArgumentException();
            }
        }
        if (z11) {
            options.inPreferredConfig = config;
        }
        options.inJustDecodeBounds = false;
        return options;
    }

    @Override // h3.d
    public AbstractC2662a a(d3.k kVar, Bitmap.Config config, Rect rect, int i10, ColorSpace colorSpace) {
        boolean zK0 = kVar.k0(i10);
        BitmapFactory.Options optionsE = e(kVar, config, this.f28282b);
        InputStream inputStreamJ = kVar.J();
        k.g(inputStreamJ);
        if (kVar.X() > i10) {
            inputStreamJ = new C2724a(inputStreamJ, i10);
        }
        if (!zK0) {
            inputStreamJ = new C2725b(inputStreamJ, f28280g);
        }
        boolean z10 = optionsE.inPreferredConfig != Bitmap.Config.ARGB_8888;
        try {
            try {
                AbstractC2662a abstractC2662aC = c(inputStreamJ, optionsE, rect, colorSpace);
                try {
                    inputStreamJ.close();
                    return abstractC2662aC;
                } catch (IOException e10) {
                    e10.printStackTrace();
                    return abstractC2662aC;
                }
            } finally {
            }
        } catch (RuntimeException e11) {
            if (!z10) {
                throw e11;
            }
            AbstractC2662a abstractC2662aA = a(kVar, Bitmap.Config.ARGB_8888, rect, i10, colorSpace);
            try {
                inputStreamJ.close();
            } catch (IOException e12) {
                e12.printStackTrace();
            }
            return abstractC2662aA;
        }
    }

    @Override // h3.d
    public AbstractC2662a b(d3.k kVar, Bitmap.Config config, Rect rect, ColorSpace colorSpace) {
        BitmapFactory.Options optionsE = e(kVar, config, this.f28282b);
        boolean z10 = optionsE.inPreferredConfig != Bitmap.Config.ARGB_8888;
        try {
            return c((InputStream) k.g(kVar.J()), optionsE, rect, colorSpace);
        } catch (RuntimeException e10) {
            if (z10) {
                return b(kVar, Bitmap.Config.ARGB_8888, rect, colorSpace);
            }
            throw e10;
        }
    }

    public abstract int d(int i10, int i11, BitmapFactory.Options options);

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class a implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final a f28286a = new a();

        private a() {
        }

        @Override // g2.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void release(Bitmap bitmap) {
        }
    }
}
