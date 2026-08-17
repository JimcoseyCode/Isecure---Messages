package expo.modules.crypto.aes.records;

import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.crypto.aes.enums.DataFormat;
import expo.modules.kotlin.records.Field;
import expo.modules.kotlin.records.Record;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lexpo/modules/crypto/aes/records/CiphertextOptions;", "Lexpo/modules/kotlin/records/Record;", "includeTag", PointerEventHelper.POINTER_TYPE_UNKNOWN, "outputFormat", "Lexpo/modules/crypto/aes/enums/DataFormat;", "<init>", "(ZLexpo/modules/crypto/aes/enums/DataFormat;)V", "getIncludeTag$annotations", "()V", "getIncludeTag", "()Z", "getOutputFormat$annotations", "getOutputFormat", "()Lexpo/modules/crypto/aes/enums/DataFormat;", "component1", "component2", "copy", "equals", "other", PointerEventHelper.POINTER_TYPE_UNKNOWN, "hashCode", PointerEventHelper.POINTER_TYPE_UNKNOWN, "toString", PointerEventHelper.POINTER_TYPE_UNKNOWN, "expo-crypto_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class CiphertextOptions implements Record {
    private final boolean includeTag;
    private final DataFormat outputFormat;

    /* JADX WARN: Multi-variable type inference failed */
    public CiphertextOptions() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ CiphertextOptions copy$default(CiphertextOptions ciphertextOptions, boolean z10, DataFormat dataFormat, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = ciphertextOptions.includeTag;
        }
        if ((i10 & 2) != 0) {
            dataFormat = ciphertextOptions.outputFormat;
        }
        return ciphertextOptions.copy(z10, dataFormat);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIncludeTag() {
        return this.includeTag;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final DataFormat getOutputFormat() {
        return this.outputFormat;
    }

    public final CiphertextOptions copy(boolean includeTag, DataFormat outputFormat) {
        AbstractC2855l.g(outputFormat, "outputFormat");
        return new CiphertextOptions(includeTag, outputFormat);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CiphertextOptions)) {
            return false;
        }
        CiphertextOptions ciphertextOptions = (CiphertextOptions) other;
        return this.includeTag == ciphertextOptions.includeTag && this.outputFormat == ciphertextOptions.outputFormat;
    }

    public final boolean getIncludeTag() {
        return this.includeTag;
    }

    public final DataFormat getOutputFormat() {
        return this.outputFormat;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.includeTag) * 31) + this.outputFormat.hashCode();
    }

    public String toString() {
        return "CiphertextOptions(includeTag=" + this.includeTag + ", outputFormat=" + this.outputFormat + ")";
    }

    public CiphertextOptions(boolean z10, DataFormat outputFormat) {
        AbstractC2855l.g(outputFormat, "outputFormat");
        this.includeTag = z10;
        this.outputFormat = outputFormat;
    }

    public /* synthetic */ CiphertextOptions(boolean z10, DataFormat dataFormat, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? DataFormat.BYTES : dataFormat);
    }

    @Field
    public static /* synthetic */ void getIncludeTag$annotations() {
    }

    @Field
    public static /* synthetic */ void getOutputFormat$annotations() {
    }
}
