package expo.modules.clipboard;

import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import p7.AbstractC3083a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lexpo/modules/clipboard/ContentType;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "jsName", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getJsName", "()Ljava/lang/String;", "PLAIN_TEXT", "HTML", "IMAGE", "expo-clipboard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class ContentType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ContentType[] $VALUES;
    private final String jsName;
    public static final ContentType PLAIN_TEXT = new ContentType("PLAIN_TEXT", 0, "plain-text");
    public static final ContentType HTML = new ContentType("HTML", 1, "html");
    public static final ContentType IMAGE = new ContentType("IMAGE", 2, "image");

    private static final /* synthetic */ ContentType[] $values() {
        return new ContentType[]{PLAIN_TEXT, HTML, IMAGE};
    }

    static {
        ContentType[] contentTypeArr$values = $values();
        $VALUES = contentTypeArr$values;
        $ENTRIES = AbstractC3083a.a(contentTypeArr$values);
    }

    private ContentType(String str, int i10, String str2) {
        this.jsName = str2;
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static ContentType valueOf(String str) {
        return (ContentType) Enum.valueOf(ContentType.class, str);
    }

    public static ContentType[] values() {
        return (ContentType[]) $VALUES.clone();
    }

    public final String getJsName() {
        return this.jsName;
    }
}
