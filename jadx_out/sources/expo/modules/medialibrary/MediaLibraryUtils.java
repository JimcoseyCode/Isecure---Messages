package expo.modules.medialibrary;

import P8.q;
import R8.AbstractC1413i;
import R8.C1404d0;
import R8.D0;
import R8.N;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.facebook.react.uimanager.events.PointerEventHelper;
import i7.AbstractC2753p;
import i7.C2735B;
import i7.C2752o;
import j7.AbstractC2793j;
import j7.T;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import o7.AbstractC3016b;
import t7.AbstractC3376c;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001;B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000e2\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0015J6\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00042\u0012\u0010\u0019\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0018H\u0086@¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\u00042\u0010\u0010\u001d\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\u0018¢\u0006\u0004\b\u001e\u0010\u001fJ3\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!2\u0006\u0010\t\u001a\u00020\b2\u0016\u0010 \u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\u0018\"\u0004\u0018\u00010\u0004¢\u0006\u0004\b#\u0010$J\u001f\u0010)\u001a\u0004\u0018\u00010\u00042\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J)\u0010+\u001a\b\u0012\u0004\u0012\u00020'0!2\u0006\u0010\t\u001a\u00020\b2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u0018¢\u0006\u0004\b+\u0010$J\u0017\u0010-\u001a\u00020'2\b\u0010,\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b-\u0010.J\u001f\u00100\u001a\u00020\u00042\b\u0010,\u001a\u0004\u0018\u00010\u00042\u0006\u0010/\u001a\u00020\u001a¢\u0006\u0004\b0\u00101J!\u00102\u001a\u00020\u00112\b\u0010,\u001a\u0004\u0018\u00010\u00042\u0006\u0010/\u001a\u00020\u001aH\u0007¢\u0006\u0004\b2\u00103J\u001d\u00105\u001a\u00020\u001a2\u0006\u0010\t\u001a\u00020\b2\u0006\u00104\u001a\u00020\u0004¢\u0006\u0004\b5\u00106JD\u00109\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010'0\u000e2\u0006\u0010\t\u001a\u00020\b2\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u00040\u00182\u000e\u00108\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0018H\u0086@¢\u0006\u0004\b9\u0010:¨\u0006<"}, d2 = {"Lexpo/modules/medialibrary/MediaLibraryUtils;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "url", "getMimeTypeFromFileUrl", "(Ljava/lang/String;)Ljava/lang/String;", "Landroid/content/Context;", "context", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getManifestPermissions", "(Landroid/content/Context;)Ljava/util/Set;", "name", "Lkotlin/Pair;", "getFileNameAndExtension", "(Ljava/lang/String;)Lkotlin/Pair;", "Ljava/io/File;", "src", "destDir", "safeMoveFile", "(Ljava/io/File;Ljava/io/File;)Ljava/io/File;", "safeCopyFile", "selection", PointerEventHelper.POINTER_TYPE_UNKNOWN, "selectionArgs", PointerEventHelper.POINTER_TYPE_UNKNOWN, "deleteAssets", "(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/String;Ln7/f;)Ljava/lang/Object;", "assetIds", "queryPlaceholdersFor", "([Ljava/lang/String;)Ljava/lang/String;", "assetsId", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/medialibrary/MediaLibraryUtils$AssetFile;", "getAssetsById", "(Landroid/content/Context;[Ljava/lang/String;)Ljava/util/List;", "Landroid/content/ContentResolver;", "contentResolver", "Landroid/net/Uri;", "uri", "getMimeType", "(Landroid/content/ContentResolver;Landroid/net/Uri;)Ljava/lang/String;", "getAssetsUris", "mimeType", "mimeTypeToExternalUri", "(Ljava/lang/String;)Landroid/net/Uri;", "useCameraDir", "getRelativePathForAssetType", "(Ljava/lang/String;Z)Ljava/lang/String;", "getEnvDirectoryForAssetType", "(Ljava/lang/String;Z)Ljava/io/File;", "permission", "hasManifestPermission", "(Landroid/content/Context;Ljava/lang/String;)Z", "paths", "mimeTypes", "scanFile", "(Landroid/content/Context;[Ljava/lang/String;[Ljava/lang/String;Ln7/f;)Ljava/lang/Object;", "AssetFile", "expo-media-library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MediaLibraryUtils {
    public static final MediaLibraryUtils INSTANCE = new MediaLibraryUtils();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lexpo/modules/medialibrary/MediaLibraryUtils$AssetFile;", "Ljava/io/File;", "pathname", PointerEventHelper.POINTER_TYPE_UNKNOWN, "assetId", "mimeType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAssetId", "()Ljava/lang/String;", "getMimeType", "expo-media-library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AssetFile extends File {
        private final String assetId;
        private final String mimeType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AssetFile(String pathname, String assetId, String mimeType) {
            super(pathname);
            AbstractC2855l.g(pathname, "pathname");
            AbstractC2855l.g(assetId, "assetId");
            AbstractC2855l.g(mimeType, "mimeType");
            this.assetId = assetId;
            this.mimeType = mimeType;
        }

        public final String getAssetId() {
            return this.assetId;
        }

        public final String getMimeType() {
            return this.mimeType;
        }
    }

    /* JADX INFO: renamed from: expo.modules.medialibrary.MediaLibraryUtils$deleteAssets$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.medialibrary.MediaLibraryUtils$deleteAssets$2", f = "MediaLibraryUtils.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LR8/N;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<anonymous>", "(LR8/N;)Z"}, k = 3, mv = {2, 1, 0})
    static final class AnonymousClass2 extends l implements Function2 {
        final /* synthetic */ Context $context;
        final /* synthetic */ String $selection;
        final /* synthetic */ String[] $selectionArgs;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Context context, String str, String[] strArr, n7.f fVar) {
            super(2, fVar);
            this.$context = context;
            this.$selection = str;
            this.$selectionArgs = strArr;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$context, this.$selection, this.$selectionArgs, fVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, n7.f fVar) {
            return ((AnonymousClass2) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws UnableToDeleteException {
            AbstractC3016b.e();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(obj);
            N n10 = (N) this.L$0;
            try {
                Cursor cursorQuery = this.$context.getContentResolver().query(MediaLibraryConstantsKt.getEXTERNAL_CONTENT_URI(), new String[]{"_id", "_data"}, this.$selection, this.$selectionArgs, null);
                Context context = this.$context;
                try {
                    if (cursorQuery == null) {
                        throw new AssetFileException("Could not delete assets. Cursor is null.");
                    }
                    while (cursorQuery.moveToNext()) {
                        D0.g(n10.i());
                        if (Build.VERSION.SDK_INT >= 30) {
                            Uri uriWithAppendedId = ContentUris.withAppendedId(MediaLibraryConstantsKt.getEXTERNAL_CONTENT_URI(), cursorQuery.getLong(cursorQuery.getColumnIndex("_id")));
                            AbstractC2855l.f(uriWithAppendedId, "withAppendedId(...)");
                            if (context.getContentResolver().delete(uriWithAppendedId, null) == 0) {
                                throw new AssetFileException("Could not delete file.");
                            }
                        } else {
                            String string = cursorQuery.getString(cursorQuery.getColumnIndex("_data"));
                            if (!new File(string).delete()) {
                                throw new AssetFileException("Could not delete file.");
                            }
                            kotlin.coroutines.jvm.internal.b.c(context.getContentResolver().delete(MediaLibraryConstantsKt.getEXTERNAL_CONTENT_URI(), "_data=?", new String[]{string}));
                        }
                    }
                    C2735B c2735b = C2735B.f28704a;
                    AbstractC3376c.a(cursorQuery, null);
                    return kotlin.coroutines.jvm.internal.b.a(true);
                } finally {
                }
            } catch (SecurityException e10) {
                throw new UnableToDeleteException("Could not delete asset: need WRITE_EXTERNAL_STORAGE permission.", e10);
            } catch (Exception e11) {
                throw new UnableToDeleteException("Could not delete file: " + e11.getMessage(), e11);
            }
        }
    }

    private MediaLibraryUtils() {
    }

    private final Set<String> getManifestPermissions(Context context) {
        Set<String> setI0;
        PackageManager packageManager = context.getPackageManager();
        AbstractC2855l.f(packageManager, "getPackageManager(...)");
        try {
            String[] strArr = packageManager.getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
            if (strArr != null && (setI0 = AbstractC2793j.I0(strArr)) != null) {
                return setI0;
            }
            return T.e();
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            return T.e();
        }
    }

    private final String getMimeTypeFromFileUrl(String url) {
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(url);
        if (fileExtensionFromUrl == null) {
            return null;
        }
        return MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
    }

    public final Object deleteAssets(Context context, String str, String[] strArr, n7.f fVar) {
        return AbstractC1413i.g(C1404d0.b(), new AnonymousClass2(context, str, strArr, null), fVar);
    }

    public final List<AssetFile> getAssetsById(Context context, String... assetsId) throws IOException {
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(assetsId, "assetsId");
        Cursor cursorQuery = context.getContentResolver().query(MediaLibraryConstantsKt.getEXTERNAL_CONTENT_URI(), new String[]{"_id", "_data", "bucket_id", "mime_type"}, "_id IN ( " + queryPlaceholdersFor(assetsId) + " )", assetsId, null);
        try {
            if (cursorQuery == null) {
                throw new AssetFileException("Could not get assets. Query returns null.");
            }
            if (cursorQuery.getCount() != assetsId.length) {
                throw new AssetFileException("Could not get all of the requested assets");
            }
            ArrayList arrayList = new ArrayList();
            while (cursorQuery.moveToNext()) {
                String string = cursorQuery.getString(cursorQuery.getColumnIndex("_data"));
                int columnIndex = cursorQuery.getColumnIndex("_id");
                int columnIndex2 = cursorQuery.getColumnIndex("mime_type");
                AbstractC2855l.d(string);
                String string2 = cursorQuery.getString(columnIndex);
                AbstractC2855l.f(string2, "getString(...)");
                String string3 = cursorQuery.getString(columnIndex2);
                AbstractC2855l.f(string3, "getString(...)");
                AssetFile assetFile = new AssetFile(string, string2, string3);
                if (!assetFile.exists() || !assetFile.isFile()) {
                    throw new AssetFileException("Path " + string + " does not exist or isn't file.");
                }
                arrayList.add(assetFile);
            }
            AbstractC3376c.a(cursorQuery, null);
            return arrayList;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC3376c.a(cursorQuery, th);
                throw th2;
            }
        }
    }

    public final List<Uri> getAssetsUris(Context context, String[] assetsId) throws IOException {
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(assetsId, "assetsId");
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = context.getContentResolver().query(MediaLibraryConstantsKt.getEXTERNAL_CONTENT_URI(), new String[]{"_id", "mime_type"}, "_id IN (" + TextUtils.join(",", assetsId) + " )", null, null);
        if (cursorQuery == null) {
            return arrayList;
        }
        while (cursorQuery.moveToNext()) {
            try {
                int columnIndex = cursorQuery.getColumnIndex("_id");
                Uri uriWithAppendedId = ContentUris.withAppendedId(INSTANCE.mimeTypeToExternalUri(cursorQuery.getString(cursorQuery.getColumnIndex("mime_type"))), cursorQuery.getLong(columnIndex));
                AbstractC2855l.f(uriWithAppendedId, "withAppendedId(...)");
                arrayList.add(uriWithAppendedId);
            } finally {
            }
        }
        C2735B c2735b = C2735B.f28704a;
        AbstractC3376c.a(cursorQuery, null);
        return arrayList;
    }

    public final File getEnvDirectoryForAssetType(String mimeType, boolean useCameraDir) {
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(getRelativePathForAssetType(mimeType, useCameraDir));
        AbstractC2855l.f(externalStoragePublicDirectory, "getExternalStoragePublicDirectory(...)");
        return externalStoragePublicDirectory;
    }

    public final Pair<String, String> getFileNameAndExtension(String name) {
        AbstractC2855l.g(name, "name");
        Integer numValueOf = Integer.valueOf(q.j0(name, ".", 0, false, 6, null));
        if (numValueOf.intValue() == -1) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : name.length();
        String strSubstring = name.substring(iIntValue);
        AbstractC2855l.f(strSubstring, "substring(...)");
        String strSubstring2 = name.substring(0, iIntValue);
        AbstractC2855l.f(strSubstring2, "substring(...)");
        return new Pair<>(strSubstring2, strSubstring);
    }

    public final String getMimeType(ContentResolver contentResolver, Uri uri) {
        AbstractC2855l.g(contentResolver, "contentResolver");
        AbstractC2855l.g(uri, "uri");
        String type = contentResolver.getType(uri);
        if (type != null) {
            return type;
        }
        String string = uri.toString();
        AbstractC2855l.f(string, "toString(...)");
        return getMimeTypeFromFileUrl(string);
    }

    public final String getRelativePathForAssetType(String mimeType, boolean useCameraDir) {
        if ((mimeType != null && q.Q(mimeType, "image", false, 2, null)) || (mimeType != null && q.Q(mimeType, "video", false, 2, null))) {
            if (useCameraDir) {
                String DIRECTORY_DCIM = Environment.DIRECTORY_DCIM;
                AbstractC2855l.f(DIRECTORY_DCIM, "DIRECTORY_DCIM");
                return DIRECTORY_DCIM;
            }
            String DIRECTORY_PICTURES = Environment.DIRECTORY_PICTURES;
            AbstractC2855l.f(DIRECTORY_PICTURES, "DIRECTORY_PICTURES");
            return DIRECTORY_PICTURES;
        }
        if (mimeType != null && q.Q(mimeType, "audio", false, 2, null)) {
            String DIRECTORY_MUSIC = Environment.DIRECTORY_MUSIC;
            AbstractC2855l.f(DIRECTORY_MUSIC, "DIRECTORY_MUSIC");
            return DIRECTORY_MUSIC;
        }
        if (useCameraDir) {
            String DIRECTORY_DCIM2 = Environment.DIRECTORY_DCIM;
            AbstractC2855l.f(DIRECTORY_DCIM2, "DIRECTORY_DCIM");
            return DIRECTORY_DCIM2;
        }
        String DIRECTORY_PICTURES2 = Environment.DIRECTORY_PICTURES;
        AbstractC2855l.f(DIRECTORY_PICTURES2, "DIRECTORY_PICTURES");
        return DIRECTORY_PICTURES2;
    }

    public final boolean hasManifestPermission(Context context, String permission) {
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(permission, "permission");
        return getManifestPermissions(context).contains(permission);
    }

    public final Uri mimeTypeToExternalUri(String mimeType) {
        if (mimeType == null) {
            Uri EXTERNAL_CONTENT_URI = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            AbstractC2855l.f(EXTERNAL_CONTENT_URI, "EXTERNAL_CONTENT_URI");
            return EXTERNAL_CONTENT_URI;
        }
        if (q.Q(mimeType, "image", false, 2, null)) {
            Uri EXTERNAL_CONTENT_URI2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            AbstractC2855l.f(EXTERNAL_CONTENT_URI2, "EXTERNAL_CONTENT_URI");
            return EXTERNAL_CONTENT_URI2;
        }
        if (q.Q(mimeType, "video", false, 2, null)) {
            Uri EXTERNAL_CONTENT_URI3 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
            AbstractC2855l.f(EXTERNAL_CONTENT_URI3, "EXTERNAL_CONTENT_URI");
            return EXTERNAL_CONTENT_URI3;
        }
        if (!q.Q(mimeType, "audio", false, 2, null)) {
            return MediaLibraryConstantsKt.getEXTERNAL_CONTENT_URI();
        }
        Uri EXTERNAL_CONTENT_URI4 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
        AbstractC2855l.f(EXTERNAL_CONTENT_URI4, "EXTERNAL_CONTENT_URI");
        return EXTERNAL_CONTENT_URI4;
    }

    public final String queryPlaceholdersFor(String[] assetIds) {
        AbstractC2855l.g(assetIds, "assetIds");
        String[] strArr = new String[assetIds.length];
        AbstractC2793j.r(strArr, "?", 0, 0, 6, null);
        return AbstractC2793j.a0(strArr, ",", null, null, 0, null, null, 62, null);
    }

    public final File safeCopyFile(File src, File destDir) throws IOException {
        AbstractC2855l.g(src, "src");
        AbstractC2855l.g(destDir, "destDir");
        File file = new File(destDir, src.getName());
        String name = src.getName();
        AbstractC2855l.f(name, "getName(...)");
        Pair<String, String> fileNameAndExtension = getFileNameAndExtension(name);
        String str = (String) fileNameAndExtension.getFirst();
        String str2 = (String) fileNameAndExtension.getSecond();
        int i10 = 0;
        while (file.exists()) {
            file = new File(destDir, str + "_" + i10 + str2);
            i10++;
            if (i10 > 32767) {
                throw new IOException("File name suffix limit reached (32767)");
            }
        }
        FileChannel channel = new FileInputStream(src).getChannel();
        try {
            FileChannel channel2 = new FileOutputStream(file).getChannel();
            try {
                if (channel.transferTo(0L, channel.size(), channel2) == channel.size()) {
                    AbstractC3376c.a(channel2, null);
                    AbstractC3376c.a(channel, null);
                    return file;
                }
                file.delete();
                throw new IOException("Could not save file to " + destDir + " Not enough space.");
            } finally {
            }
        } finally {
        }
    }

    public final File safeMoveFile(File src, File destDir) throws IOException {
        AbstractC2855l.g(src, "src");
        AbstractC2855l.g(destDir, "destDir");
        File fileSafeCopyFile = safeCopyFile(src, destDir);
        src.delete();
        return fileSafeCopyFile;
    }

    public final Object scanFile(Context context, String[] strArr, String[] strArr2, n7.f fVar) {
        final n7.l lVar = new n7.l(AbstractC3016b.c(fVar));
        MediaScannerConnection.scanFile(context, strArr, strArr2, new MediaScannerConnection.OnScanCompletedListener() { // from class: expo.modules.medialibrary.MediaLibraryUtils$scanFile$2$1
            @Override // android.media.MediaScannerConnection.OnScanCompletedListener
            public final void onScanCompleted(String path, Uri uri) {
                AbstractC2855l.g(path, "path");
                n7.f fVar2 = lVar;
                C2752o.a aVar = C2752o.f28721h;
                fVar2.resumeWith(C2752o.b(new Pair(path, uri)));
            }
        });
        Object objA = lVar.a();
        if (objA == AbstractC3016b.e()) {
            h.c(fVar);
        }
        return objA;
    }
}
