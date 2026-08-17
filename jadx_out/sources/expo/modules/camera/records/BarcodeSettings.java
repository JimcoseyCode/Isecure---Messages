package expo.modules.camera.records;

import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.records.Field;
import expo.modules.kotlin.records.Record;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lexpo/modules/camera/records/BarcodeSettings;", "Lexpo/modules/kotlin/records/Record;", "barcodeTypes", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/camera/records/BarcodeType;", "<init>", "(Ljava/util/List;)V", "getBarcodeTypes$annotations", "()V", "getBarcodeTypes", "()Ljava/util/List;", "component1", "copy", "equals", PointerEventHelper.POINTER_TYPE_UNKNOWN, "other", PointerEventHelper.POINTER_TYPE_UNKNOWN, "hashCode", PointerEventHelper.POINTER_TYPE_UNKNOWN, "toString", PointerEventHelper.POINTER_TYPE_UNKNOWN, "expo-camera_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class BarcodeSettings implements Record {
    private final List<BarcodeType> barcodeTypes;

    /* JADX WARN: Multi-variable type inference failed */
    public BarcodeSettings(List<? extends BarcodeType> barcodeTypes) {
        AbstractC2855l.g(barcodeTypes, "barcodeTypes");
        this.barcodeTypes = barcodeTypes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BarcodeSettings copy$default(BarcodeSettings barcodeSettings, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = barcodeSettings.barcodeTypes;
        }
        return barcodeSettings.copy(list);
    }

    public final List<BarcodeType> component1() {
        return this.barcodeTypes;
    }

    public final BarcodeSettings copy(List<? extends BarcodeType> barcodeTypes) {
        AbstractC2855l.g(barcodeTypes, "barcodeTypes");
        return new BarcodeSettings(barcodeTypes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BarcodeSettings) && AbstractC2855l.b(this.barcodeTypes, ((BarcodeSettings) other).barcodeTypes);
    }

    public final List<BarcodeType> getBarcodeTypes() {
        return this.barcodeTypes;
    }

    public int hashCode() {
        return this.barcodeTypes.hashCode();
    }

    public String toString() {
        return "BarcodeSettings(barcodeTypes=" + this.barcodeTypes + ")";
    }

    @Field
    public static /* synthetic */ void getBarcodeTypes$annotations() {
    }
}
