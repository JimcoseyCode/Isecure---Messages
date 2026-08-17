package h6;

import I4.A9;
import I4.C0837c7;
import I4.C0852e0;
import I4.C0861e9;
import I4.C0883g9;
import I4.C1069x9;
import I4.EnumC0850d9;
import I4.InterfaceC0949m9;
import I4.InterfaceC1058w9;
import I4.K6;
import I4.L6;
import I4.M6;
import I4.N6;
import I4.X6;
import I4.Y6;
import android.util.SparseArray;
import c6.C1864i;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import e6.C2428b;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final SparseArray f28462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final SparseArray f28463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final AtomicReference f28464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map f28465d;

    static {
        SparseArray sparseArray = new SparseArray();
        f28462a = sparseArray;
        SparseArray sparseArray2 = new SparseArray();
        f28463b = sparseArray2;
        f28464c = new AtomicReference();
        sparseArray.put(-1, X6.FORMAT_UNKNOWN);
        sparseArray.put(1, X6.FORMAT_CODE_128);
        sparseArray.put(2, X6.FORMAT_CODE_39);
        sparseArray.put(4, X6.FORMAT_CODE_93);
        sparseArray.put(8, X6.FORMAT_CODABAR);
        sparseArray.put(16, X6.FORMAT_DATA_MATRIX);
        sparseArray.put(32, X6.FORMAT_EAN_13);
        sparseArray.put(64, X6.FORMAT_EAN_8);
        sparseArray.put(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT, X6.FORMAT_ITF);
        sparseArray.put(256, X6.FORMAT_QR_CODE);
        sparseArray.put(IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING, X6.FORMAT_UPC_A);
        sparseArray.put(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET, X6.FORMAT_UPC_E);
        sparseArray.put(2048, X6.FORMAT_PDF417);
        sparseArray.put(4096, X6.FORMAT_AZTEC);
        sparseArray2.put(0, Y6.TYPE_UNKNOWN);
        sparseArray2.put(1, Y6.TYPE_CONTACT_INFO);
        sparseArray2.put(2, Y6.TYPE_EMAIL);
        sparseArray2.put(3, Y6.TYPE_ISBN);
        sparseArray2.put(4, Y6.TYPE_PHONE);
        sparseArray2.put(5, Y6.TYPE_PRODUCT);
        sparseArray2.put(6, Y6.TYPE_SMS);
        sparseArray2.put(7, Y6.TYPE_TEXT);
        sparseArray2.put(8, Y6.TYPE_URL);
        sparseArray2.put(9, Y6.TYPE_WIFI);
        sparseArray2.put(10, Y6.TYPE_GEO);
        sparseArray2.put(11, Y6.TYPE_CALENDAR_EVENT);
        sparseArray2.put(12, Y6.TYPE_DRIVER_LICENSE);
        HashMap map = new HashMap();
        f28465d = map;
        map.put(1, EnumC0850d9.CODE_128);
        map.put(2, EnumC0850d9.CODE_39);
        map.put(4, EnumC0850d9.CODE_93);
        map.put(8, EnumC0850d9.CODABAR);
        map.put(16, EnumC0850d9.DATA_MATRIX);
        map.put(32, EnumC0850d9.EAN_13);
        map.put(64, EnumC0850d9.EAN_8);
        map.put(Integer.valueOf(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT), EnumC0850d9.ITF);
        map.put(256, EnumC0850d9.QR_CODE);
        map.put(Integer.valueOf(IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING), EnumC0850d9.UPC_A);
        map.put(Integer.valueOf(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET), EnumC0850d9.UPC_E);
        map.put(2048, EnumC0850d9.PDF417);
        map.put(4096, EnumC0850d9.AZTEC);
    }

    public static X6 a(int i10) {
        X6 x62 = (X6) f28462a.get(i10);
        return x62 == null ? X6.FORMAT_UNKNOWN : x62;
    }

    public static Y6 b(int i10) {
        Y6 y62 = (Y6) f28463b.get(i10);
        return y62 == null ? Y6.TYPE_UNKNOWN : y62;
    }

    public static C0883g9 c(C2428b c2428b) {
        int iA = c2428b.a();
        C0852e0 c0852e0 = new C0852e0();
        if (iA == 0) {
            c0852e0.f(f28465d.values());
        } else {
            for (Map.Entry entry : f28465d.entrySet()) {
                if ((((Integer) entry.getKey()).intValue() & iA) != 0) {
                    c0852e0.e((EnumC0850d9) entry.getValue());
                }
            }
        }
        C0861e9 c0861e9 = new C0861e9();
        c0861e9.b(c0852e0.g());
        return c0861e9.c();
    }

    public static String d() {
        return true != f() ? "play-services-mlkit-barcode-scanning" : "barcode-scanning";
    }

    static void e(C1069x9 c1069x9, final L6 l62) {
        c1069x9.f(new InterfaceC1058w9() { // from class: h6.a
            @Override // I4.InterfaceC1058w9
            public final InterfaceC0949m9 zza() {
                N6 n62 = new N6();
                K6 k62 = b.f() ? K6.TYPE_THICK : K6.TYPE_THIN;
                L6 l63 = l62;
                n62.e(k62);
                C0837c7 c0837c7 = new C0837c7();
                c0837c7.b(l63);
                n62.h(c0837c7.c());
                return A9.a(n62);
            }
        }, M6.ON_DEVICE_BARCODE_LOAD);
    }

    static boolean f() {
        AtomicReference atomicReference = f28464c;
        if (atomicReference.get() != null) {
            return ((Boolean) atomicReference.get()).booleanValue();
        }
        boolean zC = n.c(C1864i.c().b());
        atomicReference.set(Boolean.valueOf(zC));
        return zC;
    }
}
