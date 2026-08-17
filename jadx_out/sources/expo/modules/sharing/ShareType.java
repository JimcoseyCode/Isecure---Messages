package expo.modules.sharing;

import P8.q;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import expo.modules.kotlin.types.Enumerable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p7.AbstractC3083a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, d2 = {"Lexpo/modules/sharing/ShareType;", "Lexpo/modules/kotlin/types/Enumerable;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "value", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "Text", "Url", "Audio", "Image", "Video", "File", "Companion", "expo-sharing_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ShareType implements Enumerable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ShareType[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String value;
    public static final ShareType Text = new ShareType("Text", 0, ReactTextInputShadowNode.PROP_TEXT);
    public static final ShareType Url = new ShareType("Url", 1, "url");
    public static final ShareType Audio = new ShareType("Audio", 2, "audio");
    public static final ShareType Image = new ShareType("Image", 3, "image");
    public static final ShareType Video = new ShareType("Video", 4, "video");
    public static final ShareType File = new ShareType("File", 5, "file");

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lexpo/modules/sharing/ShareType$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "fromMimeType", "Lexpo/modules/sharing/ShareType;", "mimeType", PointerEventHelper.POINTER_TYPE_UNKNOWN, "expo-sharing_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ShareType fromMimeType(String mimeType) {
            AbstractC2855l.g(mimeType, "mimeType");
            return q.K(mimeType, "image/", false, 2, null) ? ShareType.Image : q.K(mimeType, "video/", false, 2, null) ? ShareType.Video : q.K(mimeType, "audio/", false, 2, null) ? ShareType.Audio : q.K(mimeType, "text/", false, 2, null) ? ShareType.Text : ShareType.File;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ ShareType[] $values() {
        return new ShareType[]{Text, Url, Audio, Image, Video, File};
    }

    static {
        ShareType[] shareTypeArr$values = $values();
        $VALUES = shareTypeArr$values;
        $ENTRIES = AbstractC3083a.a(shareTypeArr$values);
        INSTANCE = new Companion(null);
    }

    private ShareType(String str, int i10, String str2) {
        this.value = str2;
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static ShareType valueOf(String str) {
        return (ShareType) Enum.valueOf(ShareType.class, str);
    }

    public static ShareType[] values() {
        return (ShareType[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
