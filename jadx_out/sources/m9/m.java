package m9;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.ViewDefaults;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f30004c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f30005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f30006b = new int[10];

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final int a(int i10) {
        return this.f30006b[i10];
    }

    public final int b() {
        if ((this.f30005a & 2) != 0) {
            return this.f30006b[1];
        }
        return -1;
    }

    public final int c() {
        if ((this.f30005a & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
            return this.f30006b[7];
        }
        return 65535;
    }

    public final int d() {
        return (this.f30005a & 16) != 0 ? this.f30006b[4] : ViewDefaults.NUMBER_OF_LINES;
    }

    public final int e(int i10) {
        return (this.f30005a & 32) != 0 ? this.f30006b[5] : i10;
    }

    public final boolean f(int i10) {
        return ((1 << i10) & this.f30005a) != 0;
    }

    public final void g(m other) {
        AbstractC2855l.g(other, "other");
        for (int i10 = 0; i10 < 10; i10++) {
            if (other.f(i10)) {
                h(i10, other.a(i10));
            }
        }
    }

    public final m h(int i10, int i11) {
        if (i10 >= 0) {
            int[] iArr = this.f30006b;
            if (i10 < iArr.length) {
                this.f30005a = (1 << i10) | this.f30005a;
                iArr[i10] = i11;
            }
        }
        return this;
    }

    public final int i() {
        return Integer.bitCount(this.f30005a);
    }
}
