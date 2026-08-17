package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.facebook.react.uimanager.ViewDefaults;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class P0 extends AbstractC2101a0 {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected X1 zzc = X1.c();

    protected static final boolean A(P0 p02, boolean z10) {
        byte bByteValue = ((Byte) p02.E(1, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zD = C2216y1.a().b(p02.getClass()).d(p02);
        if (z10) {
            p02.E(2, true != zD ? null : p02, null);
        }
        return zD;
    }

    private final int C(J1 j12) {
        return C2216y1.a().b(getClass()).g(this);
    }

    private static P0 D(P0 p02, byte[] bArr, int i10, int i11, A0 a02) throws Z0 {
        if (i11 == 0) {
            return p02;
        }
        P0 p0N = p02.n();
        try {
            J1 j1B = C2216y1.a().b(p0N.getClass());
            j1B.b(p0N, bArr, 0, i11, new C2116d0(a02));
            j1B.a(p0N);
            return p0N;
        } catch (V1 e10) {
            throw e10.a();
        } catch (Z0 e11) {
            throw e11;
        } catch (IOException e12) {
            if (e12.getCause() instanceof Z0) {
                throw ((Z0) e12.getCause());
            }
            throw new Z0(e12);
        } catch (IndexOutOfBoundsException unused) {
            throw new Z0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public static O0 l(InterfaceC2186r1 interfaceC2186r1, Object obj, InterfaceC2186r1 interfaceC2186r12, S0 s02, int i10, EnumC2153k2 enumC2153k2, Class cls) {
        return new O0(interfaceC2186r1, obj, interfaceC2186r12, new N0(null, i10, enumC2153k2, false, false), cls);
    }

    static P0 m(Class cls) {
        Map map = zzb;
        P0 p02 = (P0) map.get(cls);
        if (p02 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                p02 = (P0) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (p02 != null) {
            return p02;
        }
        P0 p03 = (P0) ((P0) AbstractC2118d2.j(cls)).E(6, null, null);
        if (p03 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, p03);
        return p03;
    }

    protected static P0 o(P0 p02, byte[] bArr, A0 a02) throws Z0 {
        P0 p0D = D(p02, bArr, 0, bArr.length, a02);
        if (p0D == null || A(p0D, true)) {
            return p0D;
        }
        throw new V1(p0D).a();
    }

    protected static U0 p() {
        return H0.p();
    }

    protected static U0 q(U0 u02) {
        int size = u02.size();
        return u02.c(size == 0 ? 10 : size + size);
    }

    protected static V0 r() {
        return Q0.p();
    }

    protected static W0 s() {
        return C2220z1.o();
    }

    protected static W0 t(W0 w02) {
        int size = w02.size();
        return w02.c(size == 0 ? 10 : size + size);
    }

    static Object u(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static Object v(InterfaceC2186r1 interfaceC2186r1, String str, Object[] objArr) {
        return new A1(interfaceC2186r1, str, objArr);
    }

    protected static void y(Class cls, P0 p02) {
        p02.x();
        zzb.put(cls, p02);
    }

    final boolean B() {
        return (this.zzd & androidx.customview.widget.a.INVALID_ID) != 0;
    }

    protected abstract Object E(int i10, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2186r1
    public final int a() {
        if (B()) {
            int iC = C(null);
            if (iC >= 0) {
                return iC;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + iC);
        }
        int i10 = this.zzd & ViewDefaults.NUMBER_OF_LINES;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int iC2 = C(null);
        if (iC2 >= 0) {
            this.zzd = (this.zzd & androidx.customview.widget.a.INVALID_ID) | iC2;
            return iC2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iC2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2186r1
    public final void b(AbstractC2207w0 abstractC2207w0) {
        C2216y1.a().b(getClass()).c(this, C2211x0.L(abstractC2207w0));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2191s1
    public final /* synthetic */ InterfaceC2186r1 c() {
        return (P0) E(6, null, null);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2101a0
    final int d(J1 j12) {
        if (B()) {
            int iG = j12.g(this);
            if (iG >= 0) {
                return iG;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + iG);
        }
        int i10 = this.zzd & ViewDefaults.NUMBER_OF_LINES;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int iG2 = j12.g(this);
        if (iG2 >= 0) {
            this.zzd = (this.zzd & androidx.customview.widget.a.INVALID_ID) | iG2;
            return iG2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iG2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2191s1
    public final boolean e() {
        return A(this, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return C2216y1.a().b(getClass()).i(this, (P0) obj);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2186r1
    public final /* synthetic */ InterfaceC2182q1 f() {
        K0 k02 = (K0) E(5, null, null);
        k02.j(this);
        return k02;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2186r1
    public final /* synthetic */ InterfaceC2182q1 g() {
        return (K0) E(5, null, null);
    }

    public final int hashCode() {
        if (B()) {
            return i();
        }
        int i10 = this.zza;
        if (i10 != 0) {
            return i10;
        }
        int i11 = i();
        this.zza = i11;
        return i11;
    }

    final int i() {
        return C2216y1.a().b(getClass()).e(this);
    }

    protected final K0 j() {
        return (K0) E(5, null, null);
    }

    public final K0 k() {
        K0 k02 = (K0) E(5, null, null);
        k02.j(this);
        return k02;
    }

    final P0 n() {
        return (P0) E(4, null, null);
    }

    public final String toString() {
        return AbstractC2196t1.a(this, super.toString());
    }

    protected final void w() {
        C2216y1.a().b(getClass()).a(this);
        x();
    }

    final void x() {
        this.zzd &= ViewDefaults.NUMBER_OF_LINES;
    }

    final void z(int i10) {
        this.zzd = (this.zzd & androidx.customview.widget.a.INVALID_ID) | ViewDefaults.NUMBER_OF_LINES;
    }
}
