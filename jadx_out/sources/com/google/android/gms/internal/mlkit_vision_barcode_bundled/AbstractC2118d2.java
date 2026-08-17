package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.d2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC2118d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Unsafe f22349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class f22350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f22351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final AbstractC2113c2 f22352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final boolean f22353e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final boolean f22354f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final long f22355g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final boolean f22356h;

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    static {
        boolean z10;
        boolean z11;
        AbstractC2113c2 abstractC2113c2;
        Unsafe unsafeL = l();
        f22349a = unsafeL;
        int i10 = AbstractC2111c0.f22341a;
        f22350b = Memory.class;
        Class cls = Long.TYPE;
        boolean zA = A(cls);
        f22351c = zA;
        Class cls2 = Integer.TYPE;
        boolean zA2 = A(cls2);
        AbstractC2113c2 c2103a2 = null;
        if (unsafeL != null) {
            if (zA) {
                c2103a2 = new C2108b2(unsafeL);
            } else if (zA2) {
                c2103a2 = new C2103a2(unsafeL);
            }
        }
        f22352d = c2103a2;
        if (c2103a2 == null) {
            z10 = false;
        } else {
            try {
                Class<?> cls3 = c2103a2.f22343a.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
                if (b() != null) {
                    z10 = true;
                }
            } catch (Throwable th) {
                m(th);
            }
        }
        f22353e = z10;
        AbstractC2113c2 abstractC2113c22 = f22352d;
        if (abstractC2113c22 == null) {
            z11 = false;
        } else {
            try {
                Class<?> cls4 = abstractC2113c22.f22343a.getClass();
                cls4.getMethod("objectFieldOffset", Field.class);
                cls4.getMethod("arrayBaseOffset", Class.class);
                cls4.getMethod("arrayIndexScale", Class.class);
                cls4.getMethod("getInt", Object.class, cls);
                cls4.getMethod("putInt", Object.class, cls, cls2);
                cls4.getMethod("getLong", Object.class, cls);
                cls4.getMethod("putLong", Object.class, cls, cls);
                cls4.getMethod("getObject", Object.class, cls);
                cls4.getMethod("putObject", Object.class, cls, Object.class);
                z11 = true;
            } catch (Throwable th2) {
                m(th2);
                z11 = false;
            }
        }
        f22354f = z11;
        f22355g = E(byte[].class);
        E(boolean[].class);
        a(boolean[].class);
        E(int[].class);
        a(int[].class);
        E(long[].class);
        a(long[].class);
        E(float[].class);
        a(float[].class);
        E(double[].class);
        a(double[].class);
        E(Object[].class);
        a(Object[].class);
        Field fieldB = b();
        if (fieldB != null && (abstractC2113c2 = f22352d) != null) {
            abstractC2113c2.f22343a.objectFieldOffset(fieldB);
        }
        f22356h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    static boolean A(Class cls) {
        int i10 = AbstractC2111c0.f22341a;
        try {
            Class cls2 = f22350b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    static boolean B(Object obj, long j10) {
        return f22352d.g(obj, j10);
    }

    static boolean C() {
        return f22354f;
    }

    static boolean D() {
        return f22353e;
    }

    private static int E(Class cls) {
        if (f22354f) {
            return f22352d.f22343a.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int a(Class cls) {
        if (f22354f) {
            return f22352d.f22343a.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field b() {
        int i10 = AbstractC2111c0.f22341a;
        Field fieldC = c(Buffer.class, "effectiveDirectAddress");
        if (fieldC != null) {
            return fieldC;
        }
        Field fieldC2 = c(Buffer.class, "address");
        if (fieldC2 == null || fieldC2.getType() != Long.TYPE) {
            return null;
        }
        return fieldC2;
    }

    private static Field c(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(Object obj, long j10, byte b10) {
        AbstractC2113c2 abstractC2113c2 = f22352d;
        long j11 = (-4) & j10;
        int i10 = abstractC2113c2.f22343a.getInt(obj, j11);
        int i11 = ((~((int) j10)) & 3) << 3;
        abstractC2113c2.f22343a.putInt(obj, j11, ((255 & b10) << i11) | (i10 & (~(255 << i11))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(Object obj, long j10, byte b10) {
        AbstractC2113c2 abstractC2113c2 = f22352d;
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        abstractC2113c2.f22343a.putInt(obj, j11, ((255 & b10) << i10) | (abstractC2113c2.f22343a.getInt(obj, j11) & (~(255 << i10))));
    }

    static double f(Object obj, long j10) {
        return f22352d.a(obj, j10);
    }

    static float g(Object obj, long j10) {
        return f22352d.b(obj, j10);
    }

    static int h(Object obj, long j10) {
        return f22352d.f22343a.getInt(obj, j10);
    }

    static long i(Object obj, long j10) {
        return f22352d.f22343a.getLong(obj, j10);
    }

    static Object j(Class cls) {
        try {
            return f22349a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    static Object k(Object obj, long j10) {
        return f22352d.f22343a.getObject(obj, j10);
    }

    static Unsafe l() {
        try {
            return (Unsafe) AccessController.doPrivileged(new Z1());
        } catch (Throwable unused) {
            return null;
        }
    }

    static /* bridge */ /* synthetic */ void m(Throwable th) {
        Logger.getLogger(AbstractC2118d2.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    static void r(Object obj, long j10, boolean z10) {
        f22352d.c(obj, j10, z10);
    }

    static void s(byte[] bArr, long j10, byte b10) {
        f22352d.d(bArr, f22355g + j10, b10);
    }

    static void t(Object obj, long j10, double d10) {
        f22352d.e(obj, j10, d10);
    }

    static void u(Object obj, long j10, float f10) {
        f22352d.f(obj, j10, f10);
    }

    static void v(Object obj, long j10, int i10) {
        f22352d.f22343a.putInt(obj, j10, i10);
    }

    static void w(Object obj, long j10, long j11) {
        f22352d.f22343a.putLong(obj, j10, j11);
    }

    static void x(Object obj, long j10, Object obj2) {
        f22352d.f22343a.putObject(obj, j10, obj2);
    }

    static /* bridge */ /* synthetic */ boolean y(Object obj, long j10) {
        return ((byte) ((f22352d.f22343a.getInt(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255)) != 0;
    }

    static /* bridge */ /* synthetic */ boolean z(Object obj, long j10) {
        return ((byte) ((f22352d.f22343a.getInt(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255)) != 0;
    }
}
