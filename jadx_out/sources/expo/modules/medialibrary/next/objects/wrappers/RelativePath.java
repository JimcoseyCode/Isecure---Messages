package expo.modules.medialibrary.next.objects.wrappers;

import P8.o;
import android.os.Environment;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0016"}, d2 = {"Lexpo/modules/medialibrary/next/objects/wrappers/RelativePath;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "value", PointerEventHelper.POINTER_TYPE_UNKNOWN, "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "toFilePath", "toFilePath-impl", "equals", PointerEventHelper.POINTER_TYPE_UNKNOWN, "other", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", PointerEventHelper.POINTER_TYPE_UNKNOWN, "hashCode-impl", "(Ljava/lang/String;)I", "toString", "toString-impl", "Companion", "expo-media-library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RelativePath {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String value;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lexpo/modules/medialibrary/next/objects/wrappers/RelativePath$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "create", "Lexpo/modules/medialibrary/next/objects/wrappers/RelativePath;", "mimeType", "Lexpo/modules/medialibrary/next/objects/wrappers/MimeType;", "albumName", PointerEventHelper.POINTER_TYPE_UNKNOWN, "create-wht0CjE", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "expo-media-library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: create-wht0CjE$default, reason: not valid java name */
        public static /* synthetic */ String m319createwht0CjE$default(Companion companion, String str, String str2, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                str2 = null;
            }
            return companion.m320createwht0CjE(str, str2);
        }

        /* JADX INFO: renamed from: create-wht0CjE, reason: not valid java name */
        public final String m320createwht0CjE(String mimeType, String albumName) {
            if (albumName == null) {
                return RelativePath.m312constructorimpl(MimeType.m295assetRootDirectoryimpl(mimeType) + "/");
            }
            return RelativePath.m312constructorimpl(MimeType.m294albumRootDirectoryimpl(mimeType) + "/" + albumName + "/");
        }

        private Companion() {
        }
    }

    private /* synthetic */ RelativePath(String str) {
        this.value = str;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ RelativePath m311boximpl(String str) {
        return new RelativePath(str);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static String m312constructorimpl(String value) {
        AbstractC2855l.g(value, "value");
        if (new o("^[\\w -]+(/[\\w -]+)*/$").d(value)) {
            return value;
        }
        throw new IllegalArgumentException(("Invalid relative path: " + value).toString());
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m313equalsimpl(String str, Object obj) {
        return (obj instanceof RelativePath) && AbstractC2855l.b(str, ((RelativePath) obj).m318unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m314equalsimpl0(String str, String str2) {
        return AbstractC2855l.b(str, str2);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m315hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* JADX INFO: renamed from: toFilePath-impl, reason: not valid java name */
    public static final String m316toFilePathimpl(String str) {
        return Environment.getExternalStorageDirectory().getAbsolutePath() + "/" + str + "/";
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m317toStringimpl(String str) {
        return "RelativePath(value=" + str + ")";
    }

    public boolean equals(Object obj) {
        return m313equalsimpl(this.value, obj);
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return m315hashCodeimpl(this.value);
    }

    public String toString() {
        return m317toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m318unboximpl() {
        return this.value;
    }
}
