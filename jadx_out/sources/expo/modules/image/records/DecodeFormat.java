package expo.modules.image.records;

import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.types.Enumerable;
import i7.C2750m;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import p7.AbstractC3083a;
import v1.EnumC3418b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lexpo/modules/image/records/DecodeFormat;", "Lexpo/modules/kotlin/types/Enumerable;", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lv1/b;", "toGlideFormat", "()Lv1/b;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "toBytes", "()I", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "ARGB_8888", "RGB_565", "expo-image_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DecodeFormat implements Enumerable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DecodeFormat[] $VALUES;
    public static final DecodeFormat ARGB_8888 = new DecodeFormat("ARGB_8888", 0, "argb");
    public static final DecodeFormat RGB_565 = new DecodeFormat("RGB_565", 1, "rgb");
    private final String value;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DecodeFormat.values().length];
            try {
                iArr[DecodeFormat.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DecodeFormat.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ DecodeFormat[] $values() {
        return new DecodeFormat[]{ARGB_8888, RGB_565};
    }

    static {
        DecodeFormat[] decodeFormatArr$values = $values();
        $VALUES = decodeFormatArr$values;
        $ENTRIES = AbstractC3083a.a(decodeFormatArr$values);
    }

    private DecodeFormat(String str, int i10, String str2) {
        this.value = str2;
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static DecodeFormat valueOf(String str) {
        return (DecodeFormat) Enum.valueOf(DecodeFormat.class, str);
    }

    public static DecodeFormat[] values() {
        return (DecodeFormat[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public final int toBytes() {
        int i10 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i10 == 1) {
            return 4;
        }
        if (i10 == 2) {
            return 2;
        }
        throw new C2750m();
    }

    public final EnumC3418b toGlideFormat() {
        int i10 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i10 == 1) {
            return EnumC3418b.PREFER_ARGB_8888;
        }
        if (i10 == 2) {
            return EnumC3418b.PREFER_RGB_565;
        }
        throw new C2750m();
    }
}
