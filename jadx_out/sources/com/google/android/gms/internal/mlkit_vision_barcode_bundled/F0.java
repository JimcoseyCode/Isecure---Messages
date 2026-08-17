package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.facebook.react.views.text.TextAttributeProps;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class F0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final F0 f21668d = new F0(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final T1 f21669a = new M1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f21670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f21671c;

    private F0() {
    }

    public static int a(E0 e02, Object obj) {
        int iQ;
        int iA;
        EnumC2153k2 enumC2153k2B = e02.b();
        int iZza = e02.zza();
        e02.l();
        int iA2 = AbstractC2207w0.a(iZza << 3);
        if (enumC2153k2B == EnumC2153k2.f22380q) {
            byte[] bArr = X0.f22317b;
            iA2 += iA2;
        }
        EnumC2158l2 enumC2158l2 = EnumC2158l2.INT;
        int iB = 4;
        switch (enumC2153k2B.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                iB = 8;
                return iA2 + iB;
            case 1:
                ((Float) obj).getClass();
                return iA2 + iB;
            case 2:
                iB = AbstractC2207w0.b(((Long) obj).longValue());
                return iA2 + iB;
            case 3:
                iB = AbstractC2207w0.b(((Long) obj).longValue());
                return iA2 + iB;
            case 4:
                iB = AbstractC2207w0.b(((Integer) obj).intValue());
                return iA2 + iB;
            case 5:
                ((Long) obj).getClass();
                iB = 8;
                return iA2 + iB;
            case 6:
                ((Integer) obj).getClass();
                return iA2 + iB;
            case 7:
                ((Boolean) obj).getClass();
                iB = 1;
                return iA2 + iB;
            case 8:
                if (!(obj instanceof AbstractC2171o0)) {
                    iB = AbstractC2207w0.C((String) obj);
                    return iA2 + iB;
                }
                iQ = ((AbstractC2171o0) obj).q();
                iA = AbstractC2207w0.a(iQ);
                iB = iA + iQ;
                return iA2 + iB;
            case 9:
                iB = ((InterfaceC2186r1) obj).a();
                return iA2 + iB;
            case 10:
                iB = AbstractC2207w0.A((InterfaceC2186r1) obj);
                return iA2 + iB;
            case 11:
                if (obj instanceof AbstractC2171o0) {
                    iQ = ((AbstractC2171o0) obj).q();
                    iA = AbstractC2207w0.a(iQ);
                } else {
                    iQ = ((byte[]) obj).length;
                    iA = AbstractC2207w0.a(iQ);
                }
                iB = iA + iQ;
                return iA2 + iB;
            case 12:
                iB = AbstractC2207w0.a(((Integer) obj).intValue());
                return iA2 + iB;
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                iB = obj instanceof R0 ? AbstractC2207w0.b(((R0) obj).zza()) : AbstractC2207w0.b(((Integer) obj).intValue());
                return iA2 + iB;
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                ((Integer) obj).getClass();
                return iA2 + iB;
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                ((Long) obj).getClass();
                iB = 8;
                return iA2 + iB;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                iB = AbstractC2207w0.a((iIntValue >> 31) ^ (iIntValue + iIntValue));
                return iA2 + iB;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                iB = AbstractC2207w0.b((jLongValue >> 63) ^ (jLongValue + jLongValue));
                return iA2 + iB;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static F0 d() {
        return f21668d;
    }

    private static Object l(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    private final void m(Map.Entry entry) {
        E0 e02 = (E0) entry.getKey();
        Object value = entry.getValue();
        e02.l();
        if (e02.f() != EnumC2158l2.MESSAGE) {
            this.f21669a.put(e02, l(value));
            return;
        }
        Object objE = e(e02);
        if (objE == null) {
            this.f21669a.put(e02, l(value));
        } else {
            this.f21669a.put(e02, e02.n(((InterfaceC2186r1) objE).f(), (InterfaceC2186r1) value).k0());
        }
    }

    private static boolean n(Map.Entry entry) {
        E0 e02 = (E0) entry.getKey();
        if (e02.f() != EnumC2158l2.MESSAGE) {
            return true;
        }
        e02.l();
        Object value = entry.getValue();
        if (value instanceof InterfaceC2191s1) {
            return ((InterfaceC2191s1) value).e();
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int o(Map.Entry entry) {
        E0 e02 = (E0) entry.getKey();
        Object value = entry.getValue();
        if (e02.f() != EnumC2158l2.MESSAGE) {
            return a(e02, value);
        }
        e02.l();
        e02.e();
        int iZza = ((E0) entry.getKey()).zza();
        int iA = AbstractC2207w0.a(8);
        return iA + iA + AbstractC2207w0.a(16) + AbstractC2207w0.a(iZza) + AbstractC2207w0.a(24) + AbstractC2207w0.A((InterfaceC2186r1) value);
    }

    public final int b() {
        int iC = this.f21669a.c();
        int iO = 0;
        for (int i10 = 0; i10 < iC; i10++) {
            iO += o(this.f21669a.g(i10));
        }
        Iterator it = this.f21669a.d().iterator();
        while (it.hasNext()) {
            iO += o((Map.Entry) it.next());
        }
        return iO;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final F0 clone() {
        F0 f02 = new F0();
        int iC = this.f21669a.c();
        for (int i10 = 0; i10 < iC; i10++) {
            Map.Entry entryG = this.f21669a.g(i10);
            f02.i((E0) ((N1) entryG).h(), entryG.getValue());
        }
        for (Map.Entry entry : this.f21669a.d()) {
            f02.i((E0) entry.getKey(), entry.getValue());
        }
        f02.f21671c = this.f21671c;
        return f02;
    }

    public final Object e(E0 e02) {
        return this.f21669a.get(e02);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof F0) {
            return this.f21669a.equals(((F0) obj).f21669a);
        }
        return false;
    }

    public final Iterator f() {
        return this.f21669a.isEmpty() ? Collections.emptyIterator() : this.f21671c ? new C2112c1(this.f21669a.entrySet().iterator()) : this.f21669a.entrySet().iterator();
    }

    public final void g() {
        if (this.f21670b) {
            return;
        }
        int iC = this.f21669a.c();
        for (int i10 = 0; i10 < iC; i10++) {
            Map.Entry entryG = this.f21669a.g(i10);
            if (entryG.getValue() instanceof P0) {
                ((P0) entryG.getValue()).w();
            }
        }
        this.f21669a.a();
        this.f21670b = true;
    }

    public final void h(F0 f02) {
        int iC = f02.f21669a.c();
        for (int i10 = 0; i10 < iC; i10++) {
            m(f02.f21669a.g(i10));
        }
        Iterator it = f02.f21669a.d().iterator();
        while (it.hasNext()) {
            m((Map.Entry) it.next());
        }
    }

    public final int hashCode() {
        return this.f21669a.hashCode();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        if ((r4 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.R0) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        if ((r4 instanceof byte[]) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0044, code lost:
    
        if (r0 == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        if ((r4 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2186r1) != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(E0 e02, Object obj) {
        boolean z10;
        e02.l();
        e02.b();
        byte[] bArr = X0.f22317b;
        obj.getClass();
        EnumC2153k2 enumC2153k2 = EnumC2153k2.f22371h;
        EnumC2158l2 enumC2158l2 = EnumC2158l2.INT;
        switch (r0.h()) {
            case INT:
                z10 = obj instanceof Integer;
                break;
            case LONG:
                z10 = obj instanceof Long;
                break;
            case FLOAT:
                z10 = obj instanceof Float;
                break;
            case DOUBLE:
                z10 = obj instanceof Double;
                break;
            case BOOLEAN:
                z10 = obj instanceof Boolean;
                break;
            case STRING:
                z10 = obj instanceof String;
                break;
            case BYTE_STRING:
                if (!(obj instanceof AbstractC2171o0)) {
                    break;
                }
                this.f21669a.put(e02, obj);
                return;
            case ENUM:
                if (!(obj instanceof Integer)) {
                    break;
                }
                this.f21669a.put(e02, obj);
                return;
            case MESSAGE:
                break;
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(e02.zza()), e02.b().h(), obj.getClass().getName()));
        }
    }

    public final boolean j() {
        return this.f21670b;
    }

    public final boolean k() {
        int iC = this.f21669a.c();
        for (int i10 = 0; i10 < iC; i10++) {
            if (!n(this.f21669a.g(i10))) {
                return false;
            }
        }
        Iterator it = this.f21669a.d().iterator();
        while (it.hasNext()) {
            if (!n((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    private F0(boolean z10) {
        g();
        g();
    }
}
