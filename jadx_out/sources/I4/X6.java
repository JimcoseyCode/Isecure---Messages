package I4;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public enum X6 implements L0 {
    FORMAT_UNKNOWN(0),
    FORMAT_CODE_128(1),
    FORMAT_CODE_39(2),
    FORMAT_CODE_93(4),
    FORMAT_CODABAR(8),
    FORMAT_DATA_MATRIX(16),
    FORMAT_EAN_13(32),
    FORMAT_EAN_8(64),
    FORMAT_ITF(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT),
    FORMAT_QR_CODE(256),
    FORMAT_UPC_A(IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING),
    FORMAT_UPC_E(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET),
    FORMAT_PDF417(2048),
    FORMAT_AZTEC(4096);


    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f4657g;

    X6(int i10) {
        this.f4657g = i10;
    }

    @Override // I4.L0
    public final int zza() {
        return this.f4657g;
    }
}
