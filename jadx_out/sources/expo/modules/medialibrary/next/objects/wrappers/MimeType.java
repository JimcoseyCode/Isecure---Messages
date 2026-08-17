package expo.modules.medialibrary.next.objects.wrappers;

import P8.o;
import P8.q;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.webkit.MimeTypeMap;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.medialibrary.next.extensions.resolver.AlbumExtensionsKt;
import expo.modules.notifications.service.NotificationsService;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087@\u0018\u0000 *2\u00020\u0001:\u0001*B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u000fJ\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u000fJ\r\u0010\u0014\u001a\u00020\u0003¢\u0006\u0004\b\u0015\u0010\u0005J\r\u0010\u0016\u001a\u00020\u0003¢\u0006\u0004\b\u0017\u0010\u0005J\r\u0010\u0018\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010 \u001a\u00020\r2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b)\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\b\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0013\u0010\n\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005\u0088\u0001\u0002¨\u0006+"}, d2 = {"Lexpo/modules/medialibrary/next/objects/wrappers/MimeType;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "value", PointerEventHelper.POINTER_TYPE_UNKNOWN, "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getValue", "()Ljava/lang/String;", NotificationsService.EVENT_TYPE_KEY, "getType-impl", "subType", "getSubType-impl", "isImage", PointerEventHelper.POINTER_TYPE_UNKNOWN, "isImage-impl", "(Ljava/lang/String;)Z", "isVideo", "isVideo-impl", "isAudio", "isAudio-impl", "assetRootDirectory", "assetRootDirectory-impl", "albumRootDirectory", "albumRootDirectory-impl", "externalStorageAssetDirectory", "Ljava/io/File;", "externalStorageAssetDirectory-impl", "(Ljava/lang/String;)Ljava/io/File;", "mediaCollectionUri", "Landroid/net/Uri;", "mediaCollectionUri-impl", "(Ljava/lang/String;)Landroid/net/Uri;", "equals", "other", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", PointerEventHelper.POINTER_TYPE_UNKNOWN, "hashCode-impl", "(Ljava/lang/String;)I", "toString", "toString-impl", "Companion", "expo-media-library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MimeType {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String value;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lexpo/modules/medialibrary/next/objects/wrappers/MimeType$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "from", "Lexpo/modules/medialibrary/next/objects/wrappers/MimeType;", "fileUri", "Landroid/net/Uri;", "from-dctPOJs", "(Landroid/net/Uri;)Ljava/lang/String;", "expo-media-library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: from-dctPOJs, reason: not valid java name */
        public final String m310fromdctPOJs(Uri fileUri) {
            AbstractC2855l.g(fileUri, "fileUri");
            String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(fileUri.toString());
            if (fileExtensionFromUrl == null) {
                return MimeType.m297constructorimpl(null);
            }
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
            return mimeTypeFromExtension == null ? MimeType.m297constructorimpl(null) : MimeType.m297constructorimpl(mimeTypeFromExtension);
        }

        private Companion() {
        }
    }

    private /* synthetic */ MimeType(String str) {
        this.value = str;
    }

    /* JADX INFO: renamed from: albumRootDirectory-impl, reason: not valid java name */
    public static final String m294albumRootDirectoryimpl(String str) {
        if (str == null) {
            String DIRECTORY_PICTURES = Environment.DIRECTORY_PICTURES;
            AbstractC2855l.f(DIRECTORY_PICTURES, "DIRECTORY_PICTURES");
            return DIRECTORY_PICTURES;
        }
        if (m305isImageimpl(str) || m306isVideoimpl(str)) {
            String DIRECTORY_PICTURES2 = Environment.DIRECTORY_PICTURES;
            AbstractC2855l.f(DIRECTORY_PICTURES2, "DIRECTORY_PICTURES");
            return DIRECTORY_PICTURES2;
        }
        if (m304isAudioimpl(str)) {
            String DIRECTORY_MUSIC = Environment.DIRECTORY_MUSIC;
            AbstractC2855l.f(DIRECTORY_MUSIC, "DIRECTORY_MUSIC");
            return DIRECTORY_MUSIC;
        }
        String DIRECTORY_PICTURES3 = Environment.DIRECTORY_PICTURES;
        AbstractC2855l.f(DIRECTORY_PICTURES3, "DIRECTORY_PICTURES");
        return DIRECTORY_PICTURES3;
    }

    /* JADX INFO: renamed from: assetRootDirectory-impl, reason: not valid java name */
    public static final String m295assetRootDirectoryimpl(String str) {
        if (str == null) {
            String DIRECTORY_DCIM = Environment.DIRECTORY_DCIM;
            AbstractC2855l.f(DIRECTORY_DCIM, "DIRECTORY_DCIM");
            return DIRECTORY_DCIM;
        }
        if (m305isImageimpl(str) || m306isVideoimpl(str)) {
            String DIRECTORY_DCIM2 = Environment.DIRECTORY_DCIM;
            AbstractC2855l.f(DIRECTORY_DCIM2, "DIRECTORY_DCIM");
            return DIRECTORY_DCIM2;
        }
        if (m304isAudioimpl(str)) {
            String DIRECTORY_MUSIC = Environment.DIRECTORY_MUSIC;
            AbstractC2855l.f(DIRECTORY_MUSIC, "DIRECTORY_MUSIC");
            return DIRECTORY_MUSIC;
        }
        String DIRECTORY_DCIM3 = Environment.DIRECTORY_DCIM;
        AbstractC2855l.f(DIRECTORY_DCIM3, "DIRECTORY_DCIM");
        return DIRECTORY_DCIM3;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ MimeType m296boximpl(String str) {
        return new MimeType(str);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static String m297constructorimpl(String str) {
        if (str == null || new o("^[\\w-]+/([\\w-]+)*$").d(str)) {
            return str;
        }
        throw new IllegalArgumentException(("Invalid MIME type: " + str).toString());
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m298equalsimpl(String str, Object obj) {
        return (obj instanceof MimeType) && AbstractC2855l.b(str, ((MimeType) obj).m309unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m299equalsimpl0(String str, String str2) {
        return AbstractC2855l.b(str, str2);
    }

    /* JADX INFO: renamed from: externalStorageAssetDirectory-impl, reason: not valid java name */
    public static final File m300externalStorageAssetDirectoryimpl(String str) {
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(m295assetRootDirectoryimpl(str));
        AbstractC2855l.f(externalStoragePublicDirectory, "getExternalStoragePublicDirectory(...)");
        return externalStoragePublicDirectory;
    }

    /* JADX INFO: renamed from: getSubType-impl, reason: not valid java name */
    public static final String m301getSubTypeimpl(String str) {
        if (str != null) {
            return q.O0(str, '/', null, 2, null);
        }
        return null;
    }

    /* JADX INFO: renamed from: getType-impl, reason: not valid java name */
    public static final String m302getTypeimpl(String str) {
        if (str != null) {
            return q.W0(str, '/', null, 2, null);
        }
        return null;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m303hashCodeimpl(String str) {
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    /* JADX INFO: renamed from: isAudio-impl, reason: not valid java name */
    public static final boolean m304isAudioimpl(String str) {
        return AbstractC2855l.b(m302getTypeimpl(str), "audio");
    }

    /* JADX INFO: renamed from: isImage-impl, reason: not valid java name */
    public static final boolean m305isImageimpl(String str) {
        return AbstractC2855l.b(m302getTypeimpl(str), "image");
    }

    /* JADX INFO: renamed from: isVideo-impl, reason: not valid java name */
    public static final boolean m306isVideoimpl(String str) {
        return AbstractC2855l.b(m302getTypeimpl(str), "video");
    }

    /* JADX INFO: renamed from: mediaCollectionUri-impl, reason: not valid java name */
    public static final Uri m307mediaCollectionUriimpl(String str) {
        if (str == null) {
            return AlbumExtensionsKt.getEXTERNAL_CONTENT_URI();
        }
        if (m305isImageimpl(str)) {
            Uri EXTERNAL_CONTENT_URI = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            AbstractC2855l.f(EXTERNAL_CONTENT_URI, "EXTERNAL_CONTENT_URI");
            return EXTERNAL_CONTENT_URI;
        }
        if (m306isVideoimpl(str)) {
            Uri EXTERNAL_CONTENT_URI2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
            AbstractC2855l.f(EXTERNAL_CONTENT_URI2, "EXTERNAL_CONTENT_URI");
            return EXTERNAL_CONTENT_URI2;
        }
        if (!m304isAudioimpl(str)) {
            return AlbumExtensionsKt.getEXTERNAL_CONTENT_URI();
        }
        Uri EXTERNAL_CONTENT_URI3 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
        AbstractC2855l.f(EXTERNAL_CONTENT_URI3, "EXTERNAL_CONTENT_URI");
        return EXTERNAL_CONTENT_URI3;
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m308toStringimpl(String str) {
        return "MimeType(value=" + str + ")";
    }

    public boolean equals(Object obj) {
        return m298equalsimpl(this.value, obj);
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return m303hashCodeimpl(this.value);
    }

    public String toString() {
        return m308toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m309unboximpl() {
        return this.value;
    }
}
