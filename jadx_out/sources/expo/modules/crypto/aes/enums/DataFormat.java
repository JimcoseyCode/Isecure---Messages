package expo.modules.crypto.aes.enums;

import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.types.Enumerable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import p7.AbstractC3083a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lexpo/modules/crypto/aes/enums/DataFormat;", "Lexpo/modules/kotlin/types/Enumerable;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "value", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "BYTES", "BASE64", "expo-crypto_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DataFormat implements Enumerable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DataFormat[] $VALUES;
    private final String value;
    public static final DataFormat BYTES = new DataFormat("BYTES", 0, "bytes");
    public static final DataFormat BASE64 = new DataFormat("BASE64", 1, "base64");

    private static final /* synthetic */ DataFormat[] $values() {
        return new DataFormat[]{BYTES, BASE64};
    }

    static {
        DataFormat[] dataFormatArr$values = $values();
        $VALUES = dataFormatArr$values;
        $ENTRIES = AbstractC3083a.a(dataFormatArr$values);
    }

    private DataFormat(String str, int i10, String str2) {
        this.value = str2;
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static DataFormat valueOf(String str) {
        return (DataFormat) Enum.valueOf(DataFormat.class, str);
    }

    public static DataFormat[] values() {
        return (DataFormat[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
