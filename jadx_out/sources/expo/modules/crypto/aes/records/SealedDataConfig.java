package expo.modules.crypto.aes.records;

import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.records.Field;
import expo.modules.kotlin.records.Record;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\u0017"}, d2 = {"Lexpo/modules/crypto/aes/records/SealedDataConfig;", "Lexpo/modules/kotlin/records/Record;", "ivLength", PointerEventHelper.POINTER_TYPE_UNKNOWN, "tagLength", "<init>", "(II)V", "getIvLength$annotations", "()V", "getIvLength", "()I", "getTagLength$annotations", "getTagLength", "component1", "component2", "copy", "equals", PointerEventHelper.POINTER_TYPE_UNKNOWN, "other", PointerEventHelper.POINTER_TYPE_UNKNOWN, "hashCode", "toString", PointerEventHelper.POINTER_TYPE_UNKNOWN, "expo-crypto_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class SealedDataConfig implements Record {
    private final int ivLength;
    private final int tagLength;

    /* JADX WARN: Illegal instructions before constructor call */
    public SealedDataConfig() {
        int i10 = 0;
        this(i10, i10, 3, null);
    }

    public static /* synthetic */ SealedDataConfig copy$default(SealedDataConfig sealedDataConfig, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = sealedDataConfig.ivLength;
        }
        if ((i12 & 2) != 0) {
            i11 = sealedDataConfig.tagLength;
        }
        return sealedDataConfig.copy(i10, i11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getIvLength() {
        return this.ivLength;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTagLength() {
        return this.tagLength;
    }

    public final SealedDataConfig copy(int ivLength, int tagLength) {
        return new SealedDataConfig(ivLength, tagLength);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SealedDataConfig)) {
            return false;
        }
        SealedDataConfig sealedDataConfig = (SealedDataConfig) other;
        return this.ivLength == sealedDataConfig.ivLength && this.tagLength == sealedDataConfig.tagLength;
    }

    public final int getIvLength() {
        return this.ivLength;
    }

    public final int getTagLength() {
        return this.tagLength;
    }

    public int hashCode() {
        return (Integer.hashCode(this.ivLength) * 31) + Integer.hashCode(this.tagLength);
    }

    public String toString() {
        return "SealedDataConfig(ivLength=" + this.ivLength + ", tagLength=" + this.tagLength + ")";
    }

    public SealedDataConfig(int i10, int i11) {
        this.ivLength = i10;
        this.tagLength = i11;
    }

    public /* synthetic */ SealedDataConfig(int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 12 : i10, (i12 & 2) != 0 ? 16 : i11);
    }

    @Field
    public static /* synthetic */ void getIvLength$annotations() {
    }

    @Field
    public static /* synthetic */ void getTagLength$annotations() {
    }
}
