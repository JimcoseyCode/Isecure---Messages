package expo.modules.securestore.encryptors;

import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import p7.AbstractC3083a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lexpo/modules/securestore/encryptors/KeyPurpose;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "(Ljava/lang/String;I)V", "ENCRYPT", "DECRYPT", "expo-secure-store_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class KeyPurpose {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ KeyPurpose[] $VALUES;
    public static final KeyPurpose ENCRYPT = new KeyPurpose("ENCRYPT", 0);
    public static final KeyPurpose DECRYPT = new KeyPurpose("DECRYPT", 1);

    private static final /* synthetic */ KeyPurpose[] $values() {
        return new KeyPurpose[]{ENCRYPT, DECRYPT};
    }

    static {
        KeyPurpose[] keyPurposeArr$values = $values();
        $VALUES = keyPurposeArr$values;
        $ENTRIES = AbstractC3083a.a(keyPurposeArr$values);
    }

    private KeyPurpose(String str, int i10) {
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static KeyPurpose valueOf(String str) {
        return (KeyPurpose) Enum.valueOf(KeyPurpose.class, str);
    }

    public static KeyPurpose[] values() {
        return (KeyPurpose[]) $VALUES.clone();
    }
}
