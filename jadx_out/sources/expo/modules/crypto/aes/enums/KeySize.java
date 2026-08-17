package expo.modules.crypto.aes.enums;

import com.facebook.imageutils.JfifUtil;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.crypto.aes.InvalidKeyLengthException;
import expo.modules.kotlin.types.Enumerable;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p7.AbstractC3083a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\f\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\r\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\u000f"}, d2 = {"Lexpo/modules/crypto/aes/enums/KeySize;", "Lexpo/modules/kotlin/types/Enumerable;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "bitSize", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "(Ljava/lang/String;II)V", "getBitSize", "()I", "AES128", "AES192", "AES256", "byteSize", "getByteSize", "Companion", "expo-crypto_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class KeySize implements Enumerable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ KeySize[] $VALUES;
    public static final KeySize AES128 = new KeySize("AES128", 0, IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
    public static final KeySize AES192 = new KeySize("AES192", 1, JfifUtil.MARKER_SOFn);
    public static final KeySize AES256 = new KeySize("AES256", 2, 256);

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int bitSize;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lexpo/modules/crypto/aes/enums/KeySize$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "fromByteLength", "Lexpo/modules/crypto/aes/enums/KeySize;", "byteLen", PointerEventHelper.POINTER_TYPE_UNKNOWN, "expo-crypto_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KeySize fromByteLength(int byteLen) throws InvalidKeyLengthException {
            Object next;
            Iterator<E> it = KeySize.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((KeySize) next).getByteSize() == byteLen) {
                    break;
                }
            }
            KeySize keySize = (KeySize) next;
            if (keySize != null) {
                return keySize;
            }
            throw new InvalidKeyLengthException(byteLen);
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ KeySize[] $values() {
        return new KeySize[]{AES128, AES192, AES256};
    }

    static {
        KeySize[] keySizeArr$values = $values();
        $VALUES = keySizeArr$values;
        $ENTRIES = AbstractC3083a.a(keySizeArr$values);
        INSTANCE = new Companion(null);
    }

    private KeySize(String str, int i10, int i11) {
        this.bitSize = i11;
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static KeySize valueOf(String str) {
        return (KeySize) Enum.valueOf(KeySize.class, str);
    }

    public static KeySize[] values() {
        return (KeySize[]) $VALUES.clone();
    }

    public final int getBitSize() {
        return this.bitSize;
    }

    public final int getByteSize() {
        return this.bitSize / 8;
    }
}
