package expo.modules.crypto;

import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.types.Enumerable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import p7.AbstractC3083a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lexpo/modules/crypto/DigestAlgorithm;", "Lexpo/modules/kotlin/types/Enumerable;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "value", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "MD5", "SHA1", "SHA256", "SHA384", "SHA512", "expo-crypto_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DigestAlgorithm implements Enumerable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DigestAlgorithm[] $VALUES;
    public static final DigestAlgorithm MD5 = new DigestAlgorithm("MD5", 0, "MD5");
    public static final DigestAlgorithm SHA1 = new DigestAlgorithm("SHA1", 1, "SHA-1");
    public static final DigestAlgorithm SHA256 = new DigestAlgorithm("SHA256", 2, "SHA-256");
    public static final DigestAlgorithm SHA384 = new DigestAlgorithm("SHA384", 3, "SHA-384");
    public static final DigestAlgorithm SHA512 = new DigestAlgorithm("SHA512", 4, "SHA-512");
    private final String value;

    private static final /* synthetic */ DigestAlgorithm[] $values() {
        return new DigestAlgorithm[]{MD5, SHA1, SHA256, SHA384, SHA512};
    }

    static {
        DigestAlgorithm[] digestAlgorithmArr$values = $values();
        $VALUES = digestAlgorithmArr$values;
        $ENTRIES = AbstractC3083a.a(digestAlgorithmArr$values);
    }

    private DigestAlgorithm(String str, int i10, String str2) {
        this.value = str2;
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static DigestAlgorithm valueOf(String str) {
        return (DigestAlgorithm) Enum.valueOf(DigestAlgorithm.class, str);
    }

    public static DigestAlgorithm[] values() {
        return (DigestAlgorithm[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
