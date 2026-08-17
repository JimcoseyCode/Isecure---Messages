package com.bumptech.glide.load.resource.bitmap;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1944n {
    public static final AbstractC1944n CENTER_OUTSIDE;
    public static final AbstractC1944n DEFAULT;
    static final boolean IS_BITMAP_FACTORY_SCALING_SUPPORTED;
    public static final AbstractC1944n NONE;
    public static final v1.g OPTION;
    public static final AbstractC1944n AT_LEAST = new a();
    public static final AbstractC1944n AT_MOST = new b();
    public static final AbstractC1944n FIT_CENTER = new e();
    public static final AbstractC1944n CENTER_INSIDE = new c();

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.n$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class a extends AbstractC1944n {
        a() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.AbstractC1944n
        public g getSampleSizeRounding(int i10, int i11, int i12, int i13) {
            return g.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.AbstractC1944n
        public float getScaleFactor(int i10, int i11, int i12, int i13) {
            if (Math.min(i11 / i13, i10 / i12) == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(r1);
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.n$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class b extends AbstractC1944n {
        b() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.AbstractC1944n
        public g getSampleSizeRounding(int i10, int i11, int i12, int i13) {
            return g.MEMORY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.AbstractC1944n
        public float getScaleFactor(int i10, int i11, int i12, int i13) {
            int iCeil = (int) Math.ceil(Math.max(i11 / i13, i10 / i12));
            return 1.0f / (r2 << (Math.max(1, Integer.highestOneBit(iCeil)) >= iCeil ? 0 : 1));
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.n$c */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class c extends AbstractC1944n {
        c() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.AbstractC1944n
        public g getSampleSizeRounding(int i10, int i11, int i12, int i13) {
            return getScaleFactor(i10, i11, i12, i13) == 1.0f ? g.QUALITY : AbstractC1944n.FIT_CENTER.getSampleSizeRounding(i10, i11, i12, i13);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.AbstractC1944n
        public float getScaleFactor(int i10, int i11, int i12, int i13) {
            return Math.min(1.0f, AbstractC1944n.FIT_CENTER.getScaleFactor(i10, i11, i12, i13));
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.n$d */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class d extends AbstractC1944n {
        d() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.AbstractC1944n
        public g getSampleSizeRounding(int i10, int i11, int i12, int i13) {
            return g.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.AbstractC1944n
        public float getScaleFactor(int i10, int i11, int i12, int i13) {
            return Math.max(i12 / i10, i13 / i11);
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.n$e */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class e extends AbstractC1944n {
        e() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.AbstractC1944n
        public g getSampleSizeRounding(int i10, int i11, int i12, int i13) {
            return AbstractC1944n.IS_BITMAP_FACTORY_SCALING_SUPPORTED ? g.QUALITY : g.MEMORY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.AbstractC1944n
        public float getScaleFactor(int i10, int i11, int i12, int i13) {
            if (AbstractC1944n.IS_BITMAP_FACTORY_SCALING_SUPPORTED) {
                return Math.min(i12 / i10, i13 / i11);
            }
            if (Math.max(i11 / i13, i10 / i12) == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(r2);
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.n$f */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class f extends AbstractC1944n {
        f() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.AbstractC1944n
        public g getSampleSizeRounding(int i10, int i11, int i12, int i13) {
            return g.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.AbstractC1944n
        public float getScaleFactor(int i10, int i11, int i12, int i13) {
            return 1.0f;
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.n$g */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public enum g {
        MEMORY,
        QUALITY
    }

    static {
        d dVar = new d();
        CENTER_OUTSIDE = dVar;
        NONE = new f();
        DEFAULT = dVar;
        OPTION = v1.g.f("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", dVar);
        IS_BITMAP_FACTORY_SCALING_SUPPORTED = true;
    }

    public abstract g getSampleSizeRounding(int i10, int i11, int i12, int i13);

    public abstract float getScaleFactor(int i10, int i11, int i12, int i13);
}
