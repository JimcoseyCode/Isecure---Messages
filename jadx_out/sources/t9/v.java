package t9;

import j7.AbstractC2787d;
import j7.AbstractC2793j;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class v extends AbstractC2787d implements RandomAccess {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f32624j = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final k[] f32625h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int[] f32626i;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void a(long j10, C3391h c3391h, int i10, List list, int i11, int i12, List list2) {
            int i13;
            int i14;
            int i15;
            long j11;
            int i16 = i10;
            if (i11 >= i12) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            for (int i17 = i11; i17 < i12; i17++) {
                if (((k) list.get(i17)).E() < i16) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
            k kVar = (k) list.get(i11);
            k kVar2 = (k) list.get(i12 - 1);
            if (i16 == kVar.E()) {
                int iIntValue = ((Number) list2.get(i11)).intValue();
                int i18 = i11 + 1;
                k kVar3 = (k) list.get(i18);
                i13 = i18;
                i14 = iIntValue;
                kVar = kVar3;
            } else {
                i13 = i11;
                i14 = -1;
            }
            if (kVar.p(i16) == kVar2.p(i16)) {
                int iMin = Math.min(kVar.E(), kVar2.E());
                int i19 = 0;
                for (int i20 = i16; i20 < iMin && kVar.p(i20) == kVar2.p(i20); i20++) {
                    i19++;
                }
                long jC = j10 + c(c3391h) + ((long) 2) + ((long) i19) + 1;
                c3391h.writeInt(-i19);
                c3391h.writeInt(i14);
                int i21 = i16 + i19;
                while (i16 < i21) {
                    c3391h.writeInt(kVar.p(i16) & 255);
                    i16++;
                }
                if (i13 + 1 == i12) {
                    if (i21 != ((k) list.get(i13)).E()) {
                        throw new IllegalStateException("Check failed.");
                    }
                    c3391h.writeInt(((Number) list2.get(i13)).intValue());
                    return;
                } else {
                    C3391h c3391h2 = new C3391h();
                    c3391h.writeInt(((int) (c(c3391h2) + jC)) * (-1));
                    a(jC, c3391h2, i21, list, i13, i12, list2);
                    c3391h.G(c3391h2);
                    return;
                }
            }
            int i22 = 1;
            for (int i23 = i13 + 1; i23 < i12; i23++) {
                if (((k) list.get(i23 - 1)).p(i16) != ((k) list.get(i23)).p(i16)) {
                    i22++;
                }
            }
            long jC2 = j10 + c(c3391h) + ((long) 2) + ((long) (i22 * 2));
            c3391h.writeInt(i22);
            c3391h.writeInt(i14);
            for (int i24 = i13; i24 < i12; i24++) {
                byte bP = ((k) list.get(i24)).p(i16);
                if (i24 == i13 || bP != ((k) list.get(i24 - 1)).p(i16)) {
                    c3391h.writeInt(bP & 255);
                }
            }
            C3391h c3391h3 = new C3391h();
            while (i13 < i12) {
                byte bP2 = ((k) list.get(i13)).p(i16);
                int i25 = i13 + 1;
                int i26 = i25;
                while (true) {
                    if (i26 >= i12) {
                        i15 = i12;
                        break;
                    } else {
                        if (bP2 != ((k) list.get(i26)).p(i16)) {
                            i15 = i26;
                            break;
                        }
                        i26++;
                    }
                }
                if (i25 == i15 && i16 + 1 == ((k) list.get(i13)).E()) {
                    c3391h.writeInt(((Number) list2.get(i13)).intValue());
                    j11 = jC2;
                } else {
                    c3391h.writeInt(((int) (c(c3391h3) + jC2)) * (-1));
                    j11 = jC2;
                    a(j11, c3391h3, i16 + 1, list, i13, i15, list2);
                }
                jC2 = j11;
                i13 = i15;
            }
            c3391h.G(c3391h3);
        }

        static /* synthetic */ void b(a aVar, long j10, C3391h c3391h, int i10, List list, int i11, int i12, List list2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                j10 = 0;
            }
            aVar.a(j10, c3391h, (i13 & 4) != 0 ? 0 : i10, list, (i13 & 16) != 0 ? 0 : i11, (i13 & 32) != 0 ? list.size() : i12, list2);
        }

        private final long c(C3391h c3391h) {
            return c3391h.size() / ((long) 4);
        }

        /* JADX WARN: Code restructure failed: missing block: B:44:0x00d6, code lost:
        
            continue;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final v d(k... byteStrings) {
            AbstractC2855l.g(byteStrings, "byteStrings");
            DefaultConstructorMarker defaultConstructorMarker = null;
            int i10 = 0;
            if (byteStrings.length == 0) {
                return new v(new k[0], new int[]{0, -1}, defaultConstructorMarker);
            }
            List listE0 = AbstractC2793j.E0(byteStrings);
            AbstractC2800q.x(listE0);
            ArrayList arrayList = new ArrayList(byteStrings.length);
            for (k kVar : byteStrings) {
                arrayList.add(-1);
            }
            Integer[] numArr = (Integer[]) arrayList.toArray(new Integer[0]);
            List listP = AbstractC2800q.p(Arrays.copyOf(numArr, numArr.length));
            int length = byteStrings.length;
            int i11 = 0;
            int i12 = 0;
            while (i11 < length) {
                listP.set(AbstractC2800q.i(listE0, byteStrings[i11], 0, 0, 6, null), Integer.valueOf(i12));
                i11++;
                i12++;
            }
            if (((k) listE0.get(0)).E() <= 0) {
                throw new IllegalArgumentException("the empty byte string is not a supported option");
            }
            int i13 = 0;
            while (i13 < listE0.size()) {
                k kVar2 = (k) listE0.get(i13);
                int i14 = i13 + 1;
                int i15 = i14;
                while (i15 < listE0.size()) {
                    k kVar3 = (k) listE0.get(i15);
                    if (kVar3.F(kVar2)) {
                        if (kVar3.E() == kVar2.E()) {
                            throw new IllegalArgumentException(("duplicate option: " + kVar3).toString());
                        }
                        if (((Number) listP.get(i15)).intValue() > ((Number) listP.get(i13)).intValue()) {
                            listE0.remove(i15);
                            listP.remove(i15);
                        } else {
                            i15++;
                        }
                    }
                }
                i13 = i14;
            }
            C3391h c3391h = new C3391h();
            b(this, 0L, c3391h, 0, listE0, 0, 0, listP, 53, null);
            int[] iArr = new int[(int) c(c3391h)];
            while (!c3391h.D()) {
                iArr[i10] = c3391h.readInt();
                i10++;
            }
            Object[] objArrCopyOf = Arrays.copyOf(byteStrings, byteStrings.length);
            AbstractC2855l.f(objArrCopyOf, "copyOf(this, size)");
            return new v((k[]) objArrCopyOf, iArr, defaultConstructorMarker);
        }

        private a() {
        }
    }

    public /* synthetic */ v(k[] kVarArr, int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(kVarArr, iArr);
    }

    @Override // j7.AbstractC2785b, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof k) {
            return q((k) obj);
        }
        return false;
    }

    @Override // j7.AbstractC2787d, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof k) {
            return u((k) obj);
        }
        return -1;
    }

    @Override // j7.AbstractC2787d, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof k) {
            return v((k) obj);
        }
        return -1;
    }

    @Override // j7.AbstractC2785b
    public int o() {
        return this.f32625h.length;
    }

    public /* bridge */ boolean q(k kVar) {
        return super.contains(kVar);
    }

    @Override // j7.AbstractC2787d, java.util.List
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public k get(int i10) {
        return this.f32625h[i10];
    }

    public final k[] s() {
        return this.f32625h;
    }

    public final int[] t() {
        return this.f32626i;
    }

    public /* bridge */ int u(k kVar) {
        return super.indexOf(kVar);
    }

    public /* bridge */ int v(k kVar) {
        return super.lastIndexOf(kVar);
    }

    private v(k[] kVarArr, int[] iArr) {
        this.f32625h = kVarArr;
        this.f32626i = iArr;
    }
}
