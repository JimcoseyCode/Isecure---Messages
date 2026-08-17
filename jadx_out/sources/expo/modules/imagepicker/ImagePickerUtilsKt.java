package expo.modules.imagepicker;

import P8.q;
import R8.AbstractC1443x0;
import android.content.ClipData;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.webkit.MimeTypeMap;
import androidx.core.content.FileProvider;
import com.facebook.react.modules.dialog.AlertFragment;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.core.utilities.FileUtilities;
import i7.C2735B;
import i7.t;
import j7.AbstractC2800q;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC2855l;
import t7.AbstractC3375b;
import t7.AbstractC3376c;
import t7.j;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a\u001f\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a!\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0019\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u001b\u0010\u0011\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001b\u0010\u0013\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0013\u0010\u0012\u001a\u0013\u0010\u0015\u001a\u00020\u0014*\u00020\u0000H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0013\u0010\u0017\u001a\u00020\u0002*\u00020\u0014H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0013\u0010\u0017\u001a\u00020\u0002*\u00020\u0002H\u0000¢\u0006\u0004\b\u0017\u0010\u000e\u001a\u001d\u0010\u001a\u001a\u0004\u0018\u00010\u0019*\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0013\u0010\u0015\u001a\u00020\u0014*\u00020\u0002H\u0000¢\u0006\u0004\b\u0015\u0010\u001c\u001a\u001b\u0010 \u001a\u00020\u001e*\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001eH\u0000¢\u0006\u0004\b \u0010!\u001a\u0019\u0010$\u001a\b\u0012\u0004\u0012\u00020\b0#*\u00020\"H\u0000¢\u0006\u0004\b$\u0010%\u001a(\u0010)\u001a\u00020(2\u0006\u0010&\u001a\u00020\b2\u0006\u0010'\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0080@¢\u0006\u0004\b)\u0010*\u001a(\u0010+\u001a\u00020(2\u0006\u0010&\u001a\u00020\b2\u0006\u0010'\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0080@¢\u0006\u0004\b+\u0010*\u001a\u0015\u0010,\u001a\u0004\u0018\u00010\u0002*\u00020\bH\u0000¢\u0006\u0004\b,\u0010-\"\u001b\u00103\u001a\b\u0012\u0004\u0012\u0002000/*\u00020.8F¢\u0006\u0006\u001a\u0004\b1\u00102\"\u0018\u00105\u001a\u000204*\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b5\u00106\"\u0018\u00107\u001a\u000204*\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b7\u00106\"\u0018\u00108\u001a\u000204*\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b8\u00106¨\u00069"}, d2 = {"Ljava/io/File;", "cacheDir", PointerEventHelper.POINTER_TYPE_UNKNOWN, "extension", "createOutputFile", "(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;", "Landroid/content/ContentResolver;", "contentResolver", "Landroid/net/Uri;", "uri", "getType", "(Landroid/content/ContentResolver;Landroid/net/Uri;)Ljava/lang/String;", "url", "getTypeFromFileUrl", "(Ljava/lang/String;)Ljava/lang/String;", "Landroid/content/Context;", "context", "getContentUri", "(Ljava/io/File;Landroid/content/Context;)Landroid/net/Uri;", "toContentUri", "Landroid/graphics/Bitmap$CompressFormat;", "toBitmapCompressFormat", "(Ljava/io/File;)Landroid/graphics/Bitmap$CompressFormat;", "toImageFileExtension", "(Landroid/graphics/Bitmap$CompressFormat;)Ljava/lang/String;", "Lexpo/modules/imagepicker/MediaType;", "toMediaType", "(Landroid/net/Uri;Landroid/content/ContentResolver;)Lexpo/modules/imagepicker/MediaType;", "(Ljava/lang/String;)Landroid/graphics/Bitmap$CompressFormat;", "Landroid/media/MediaMetadataRetriever;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "key", "extractInt", "(Landroid/media/MediaMetadataRetriever;I)I", "Landroid/content/Intent;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getAllDataUris", "(Landroid/content/Intent;)Ljava/util/List;", "sourceUri", "targetFile", "Li7/B;", "copyFile", "(Landroid/net/Uri;Ljava/io/File;Landroid/content/ContentResolver;Ln7/f;)Ljava/lang/Object;", "copyExifData", "getMediaStoreAssetId", "(Landroid/net/Uri;)Ljava/lang/String;", "Landroid/content/ClipData;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Landroid/content/ClipData$Item;", "getItems", "(Landroid/content/ClipData;)Ljava/lang/Iterable;", AlertFragment.ARG_ITEMS, PointerEventHelper.POINTER_TYPE_UNKNOWN, "isMediaProviderUri", "(Landroid/net/Uri;)Z", "isDownloadsProviderUri", "isMediaStoreAssetUri", "expo-image-picker_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ImagePickerUtilsKt {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Bitmap.CompressFormat.values().length];
            try {
                iArr[Bitmap.CompressFormat.PNG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Bitmap.CompressFormat.JPEG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final Object copyExifData(final Uri uri, final File file, final ContentResolver contentResolver, n7.f fVar) {
        return AbstractC1443x0.c(null, new InterfaceC3487a() { // from class: expo.modules.imagepicker.f
            @Override // w7.InterfaceC3487a
            public final Object invoke() {
                return ImagePickerUtilsKt.copyExifData$lambda$15(file, uri, contentResolver);
            }
        }, fVar, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B copyExifData$lambda$15(File file, Uri uri, ContentResolver contentResolver) throws FailedToWriteFileException, FailedToReadFileException, IOException {
        if (uri.compareTo(Uri.fromFile(file)) == 0) {
            return C2735B.f28704a;
        }
        List listM = AbstractC2800q.m("ImageLength", "ImageWidth", "PixelXDimension", "PixelYDimension", "Orientation");
        try {
            InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                throw new FailedToReadFileException(C0.a.a(uri), null, 2, null);
            }
            try {
                X0.a aVar = new X0.a(inputStreamOpenInputStream);
                X0.a aVar2 = new X0.a(file);
                Iterable<Pair<String, String>> exif_tags = ImagePickerConstants.INSTANCE.getEXIF_TAGS();
                ArrayList arrayList = new ArrayList();
                for (Pair<String, String> pair : exif_tags) {
                    if (!listM.contains((String) pair.getSecond())) {
                        arrayList.add(pair);
                    }
                }
                ArrayList arrayList2 = new ArrayList(AbstractC2800q.u(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str = (String) ((Pair) it.next()).getSecond();
                    arrayList2.add(t.a(str, aVar.k(str)));
                }
                ArrayList<Pair> arrayList3 = new ArrayList();
                for (Object obj : arrayList2) {
                    if (((String) ((Pair) obj).getSecond()) != null) {
                        arrayList3.add(obj);
                    }
                }
                for (Pair pair2 : arrayList3) {
                    aVar2.f0((String) pair2.getFirst(), (String) pair2.getSecond());
                }
                try {
                    aVar2.a0();
                    C2735B c2735b = C2735B.f28704a;
                    AbstractC3376c.a(inputStreamOpenInputStream, null);
                    return C2735B.f28704a;
                } catch (IOException e10) {
                    throw new FailedToWriteExifDataToFileException(file, e10);
                }
            } finally {
            }
        } catch (FileNotFoundException e11) {
            throw new FailedToWriteFileException(file, e11);
        }
    }

    public static final Object copyFile(final Uri uri, final File file, final ContentResolver contentResolver, n7.f fVar) {
        return AbstractC1443x0.c(null, new InterfaceC3487a() { // from class: expo.modules.imagepicker.d
            @Override // w7.InterfaceC3487a
            public final Object invoke() {
                return ImagePickerUtilsKt.copyFile$lambda$9(file, uri, contentResolver);
            }
        }, fVar, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B copyFile$lambda$9(File file, Uri uri, ContentResolver contentResolver) throws FailedToWriteFileException, FailedToReadFileException, IOException {
        if (uri.compareTo(Uri.fromFile(file)) == 0) {
            return C2735B.f28704a;
        }
        try {
            InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                throw new FailedToReadFileException(C0.a.a(uri), null, 2, null);
            }
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    AbstractC3375b.b(inputStreamOpenInputStream, fileOutputStream, 0, 2, null);
                    C2735B c2735b = C2735B.f28704a;
                    AbstractC3376c.a(fileOutputStream, null);
                    AbstractC3376c.a(inputStreamOpenInputStream, null);
                    return c2735b;
                } finally {
                }
            } finally {
            }
        } catch (FileNotFoundException e10) {
            throw new FailedToWriteFileException(file, e10);
        }
    }

    public static final File createOutputFile(File cacheDir, String extension) throws IOException, FailedToCreateFileException {
        AbstractC2855l.g(cacheDir, "cacheDir");
        AbstractC2855l.g(extension, "extension");
        String strGenerateOutputPath = FileUtilities.generateOutputPath(cacheDir, ImagePickerConstants.CACHE_DIR_NAME, extension);
        try {
            File file = new File(strGenerateOutputPath);
            file.createNewFile();
            return file;
        } catch (IOException e10) {
            AbstractC2855l.d(strGenerateOutputPath);
            throw new FailedToCreateFileException(strGenerateOutputPath, e10);
        }
    }

    public static final int extractInt(MediaMetadataRetriever mediaMetadataRetriever, int i10) throws FailedToExtractVideoMetadataException {
        AbstractC2855l.g(mediaMetadataRetriever, "<this>");
        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(i10);
        if (strExtractMetadata != null) {
            return Integer.parseInt(strExtractMetadata);
        }
        throw new FailedToExtractVideoMetadataException(null, null, 3, null);
    }

    public static final List<Uri> getAllDataUris(Intent intent) {
        Iterable<ClipData.Item> items;
        AbstractC2855l.g(intent, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Uri data = intent.getData();
        if (data != null) {
            linkedHashSet.add(data);
        }
        ClipData clipData = intent.getClipData();
        if (clipData != null && (items = getItems(clipData)) != null) {
            ArrayList arrayList = new ArrayList(AbstractC2800q.u(items, 10));
            Iterator<ClipData.Item> it = items.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getUri());
            }
            linkedHashSet.addAll(arrayList);
        }
        return AbstractC2800q.P0(linkedHashSet);
    }

    public static final Uri getContentUri(File file, Context context) {
        AbstractC2855l.g(file, "<this>");
        AbstractC2855l.g(context, "context");
        Uri uriForFile = FileProvider.getUriForFile(context, context.getPackageName() + ".ImagePickerFileProvider", file);
        AbstractC2855l.f(uriForFile, "getUriForFile(...)");
        return uriForFile;
    }

    public static final Iterable<ClipData.Item> getItems(ClipData clipData) {
        AbstractC2855l.g(clipData, "<this>");
        return new ImagePickerUtilsKt$items$1(clipData);
    }

    public static final String getMediaStoreAssetId(Uri uri) {
        AbstractC2855l.g(uri, "<this>");
        if (!isMediaStoreAssetUri(uri)) {
            return null;
        }
        String documentId = DocumentsContract.getDocumentId(uri);
        AbstractC2855l.d(documentId);
        return q.P(documentId, ':', false, 2, null) ? (String) q.F0(documentId, new char[]{':'}, false, 0, 6, null).get(1) : documentId;
    }

    public static final String getType(final ContentResolver contentResolver, final Uri uri) {
        AbstractC2855l.g(contentResolver, "contentResolver");
        AbstractC2855l.g(uri, "uri");
        InterfaceC3487a interfaceC3487a = new InterfaceC3487a() { // from class: expo.modules.imagepicker.e
            @Override // w7.InterfaceC3487a
            public final Object invoke() {
                return ImagePickerUtilsKt.getType$lambda$2(contentResolver, uri);
            }
        };
        String type = contentResolver.getType(uri);
        if (type != null) {
            return type;
        }
        String str = (String) interfaceC3487a.invoke();
        if (str != null) {
            return str;
        }
        String string = uri.toString();
        AbstractC2855l.f(string, "toString(...)");
        return getTypeFromFileUrl(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getType$lambda$2(ContentResolver contentResolver, Uri uri) throws IOException {
        int columnIndex;
        Cursor cursorQuery = contentResolver.query(uri, (String[]) AbstractC2800q.e("mime_type").toArray(new String[0]), null, null, null);
        if (cursorQuery == null) {
            return null;
        }
        try {
            String string = (!cursorQuery.moveToFirst() || (columnIndex = cursorQuery.getColumnIndex("mime_type")) == -1 || cursorQuery.isNull(columnIndex)) ? null : cursorQuery.getString(columnIndex);
            AbstractC3376c.a(cursorQuery, null);
            return string;
        } finally {
        }
    }

    private static final String getTypeFromFileUrl(String str) {
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        if (fileExtensionFromUrl != null) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
        }
        return null;
    }

    public static final boolean isDownloadsProviderUri(Uri uri) {
        AbstractC2855l.g(uri, "<this>");
        return AbstractC2855l.b(uri.getAuthority(), "com.android.providers.downloads.documents");
    }

    public static final boolean isMediaProviderUri(Uri uri) {
        AbstractC2855l.g(uri, "<this>");
        return AbstractC2855l.b(uri.getAuthority(), "com.android.providers.media.documents");
    }

    public static final boolean isMediaStoreAssetUri(Uri uri) {
        AbstractC2855l.g(uri, "<this>");
        if (isMediaProviderUri(uri)) {
            return true;
        }
        if (isDownloadsProviderUri(uri)) {
            String documentId = DocumentsContract.getDocumentId(uri);
            AbstractC2855l.f(documentId, "getDocumentId(...)");
            if (q.K(documentId, "msf:", false, 2, null)) {
                return true;
            }
        }
        return false;
    }

    public static final Bitmap.CompressFormat toBitmapCompressFormat(File file) {
        AbstractC2855l.g(file, "<this>");
        return q.v(j.y(file), "png", true) ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
    }

    public static final Uri toContentUri(File file, Context context) {
        AbstractC2855l.g(file, "<this>");
        AbstractC2855l.g(context, "context");
        try {
            return getContentUri(file, context);
        } catch (Exception unused) {
            Uri uriFromFile = Uri.fromFile(file);
            AbstractC2855l.d(uriFromFile);
            return uriFromFile;
        }
    }

    public static final String toImageFileExtension(Bitmap.CompressFormat compressFormat) {
        AbstractC2855l.g(compressFormat, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$0[compressFormat.ordinal()];
        if (i10 == 1) {
            return ".png";
        }
        if (i10 == 2) {
            return ".jpeg";
        }
        throw new RuntimeException("Compress format not supported '" + compressFormat.name() + "'");
    }

    public static final MediaType toMediaType(Uri uri, ContentResolver contentResolver) {
        AbstractC2855l.g(uri, "<this>");
        AbstractC2855l.g(contentResolver, "contentResolver");
        String type = getType(contentResolver, uri);
        if (type != null && q.Q(type, "image/", false, 2, null)) {
            return MediaType.IMAGE;
        }
        if (type == null || !q.Q(type, "video/", false, 2, null)) {
            return null;
        }
        return MediaType.VIDEO;
    }

    public static final Bitmap.CompressFormat toBitmapCompressFormat(String str) {
        AbstractC2855l.g(str, "<this>");
        if (!q.v(str, "png", true) && !q.v(str, "gif", true) && !q.v(str, "bmp", true) && !q.v(str, "webp", true)) {
            q.v(str, "jpeg", true);
            return Bitmap.CompressFormat.JPEG;
        }
        return Bitmap.CompressFormat.PNG;
    }

    public static final String toImageFileExtension(String str) {
        AbstractC2855l.g(str, "<this>");
        if (q.v(str, "png", true)) {
            return ".png";
        }
        if (q.v(str, "gif", true)) {
            return ".gif";
        }
        if (q.v(str, "bmp", true)) {
            return ".bmp";
        }
        if (q.v(str, "webp", true)) {
            return ".webp";
        }
        q.v(str, "jpeg", true);
        return ".jpeg";
    }
}
