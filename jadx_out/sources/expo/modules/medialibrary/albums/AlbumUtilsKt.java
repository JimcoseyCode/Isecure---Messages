package expo.modules.medialibrary.albums;

import R8.AbstractC1413i;
import R8.C1404d0;
import R8.D0;
import R8.N;
import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import com.facebook.react.modules.dialog.AlertFragment;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.medialibrary.AlbumException;
import expo.modules.medialibrary.AssetFileException;
import expo.modules.medialibrary.MediaLibraryConstantsKt;
import expo.modules.medialibrary.MediaLibraryException;
import expo.modules.medialibrary.MediaLibraryUtils;
import expo.modules.medialibrary.UnableToLoadException;
import i7.AbstractC2753p;
import i7.C2735B;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import o7.AbstractC3016b;
import t7.AbstractC3376c;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a2\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004H\u0086@¢\u0006\u0004\b\u0007\u0010\b\u001a3\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u0004\"\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a0\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0080@¢\u0006\u0004\b\u000e\u0010\b\u001a\"\u0010\u0010\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0002H\u0080@¢\u0006\u0004\b\u0010\u0010\u0011\u001a\"\u0010\u0013\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0002H\u0080@¢\u0006\u0004\b\u0013\u0010\u0011\u001a \u0010\u0014\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0002H\u0080@¢\u0006\u0004\b\u0014\u0010\u0011\u001a\u001f\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroid/content/Context;", "context", PointerEventHelper.POINTER_TYPE_UNKNOWN, "selection", PointerEventHelper.POINTER_TYPE_UNKNOWN, "selectionArgs", "Landroid/os/Bundle;", "queryAlbum", "(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/String;Ln7/f;)Ljava/lang/Object;", "albumIds", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getAssetsInAlbums", "(Landroid/content/Context;[Ljava/lang/String;)Ljava/util/List;", "Ljava/io/File;", "getFileOrNullByContextResolver", "albumName", "getAlbumFileByNameOrNull", "(Landroid/content/Context;Ljava/lang/String;Ln7/f;)Ljava/lang/Object;", "albumId", "getAlbumFileOrNull", "getAlbumFile", "mimeType", "createAlbumFile", "(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;", "expo-media-library_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class AlbumUtilsKt {

    /* JADX INFO: renamed from: expo.modules.medialibrary.albums.AlbumUtilsKt$getAlbumFile$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.medialibrary.albums.AlbumUtilsKt", f = "AlbumUtils.kt", l = {133}, m = "getAlbumFile")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class AnonymousClass1 extends d {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(n7.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= androidx.customview.widget.a.INVALID_ID;
            return AlbumUtilsKt.getAlbumFile(null, null, this);
        }
    }

    /* JADX INFO: renamed from: expo.modules.medialibrary.albums.AlbumUtilsKt$getFileOrNullByContextResolver$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.medialibrary.albums.AlbumUtilsKt$getFileOrNullByContextResolver$2", f = "AlbumUtils.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LR8/N;", "Ljava/io/File;", "<anonymous>", "(LR8/N;)Ljava/io/File;"}, k = 3, mv = {2, 1, 0})
    static final class AnonymousClass2 extends l implements Function2 {
        final /* synthetic */ Context $context;
        final /* synthetic */ String $selection;
        final /* synthetic */ String[] $selectionArgs;
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
            return new AnonymousClass2(this.$context, this.$selection, this.$selectionArgs, fVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, n7.f fVar) {
            return ((AnonymousClass2) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws IOException {
            AbstractC3016b.e();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(obj);
            Cursor cursorQuery = this.$context.getContentResolver().query(MediaLibraryConstantsKt.getEXTERNAL_CONTENT_URI(), new String[]{"_data"}, this.$selection, this.$selectionArgs, null);
            try {
                if (cursorQuery == null) {
                    throw new AlbumException("Could not get album. Query returns null.");
                }
                if (cursorQuery.getCount() == 0) {
                    AbstractC3376c.a(cursorQuery, null);
                    return null;
                }
                cursorQuery.moveToNext();
                File file = new File(cursorQuery.getString(cursorQuery.getColumnIndex("_data")));
                if (!file.isFile() && !file.isDirectory()) {
                    throw new MediaLibraryException();
                }
                String parent = file.getParent();
                AbstractC2855l.d(parent);
                File file2 = new File(parent);
                AbstractC3376c.a(cursorQuery, null);
                return file2;
            } finally {
            }
        }
    }

    /* JADX INFO: renamed from: expo.modules.medialibrary.albums.AlbumUtilsKt$queryAlbum$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.medialibrary.albums.AlbumUtilsKt$queryAlbum$2", f = "AlbumUtils.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LR8/N;", "Landroid/os/Bundle;", "<anonymous>", "(LR8/N;)Landroid/os/Bundle;"}, k = 3, mv = {2, 1, 0})
    static final class C25232 extends l implements Function2 {
        final /* synthetic */ Context $context;
        final /* synthetic */ String $selection;
        final /* synthetic */ String[] $selectionArgs;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C25232(Context context, String str, String[] strArr, n7.f fVar) {
            super(2, fVar);
            this.$context = context;
            this.$selection = str;
            this.$selectionArgs = strArr;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            C25232 c25232 = new C25232(this.$context, this.$selection, this.$selectionArgs, fVar);
            c25232.L$0 = obj;
            return c25232;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, n7.f fVar) {
            return ((C25232) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws UnableToLoadException, IOException {
            AbstractC3016b.e();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(obj);
            N n10 = (N) this.L$0;
            try {
                Cursor cursorQuery = this.$context.getContentResolver().query(MediaLibraryConstantsKt.getEXTERNAL_CONTENT_URI(), new String[]{"bucket_id", "bucket_display_name"}, this.$selection, this.$selectionArgs, "bucket_display_name");
                try {
                    D0.g(n10.i());
                    if (cursorQuery == null) {
                        throw new AlbumException("Could not get album. Query is incorrect.");
                    }
                    if (!cursorQuery.moveToNext()) {
                        AbstractC3376c.a(cursorQuery, null);
                        return null;
                    }
                    int columnIndex = cursorQuery.getColumnIndex("bucket_id");
                    int columnIndex2 = cursorQuery.getColumnIndex("bucket_display_name");
                    Bundle bundle = new Bundle();
                    bundle.putString("id", cursorQuery.getString(columnIndex));
                    bundle.putString(AlertFragment.ARG_TITLE, cursorQuery.getString(columnIndex2));
                    bundle.putInt("assetCount", cursorQuery.getCount());
                    AbstractC3376c.a(cursorQuery, null);
                    return bundle;
                } finally {
                }
            } catch (IllegalArgumentException e10) {
                throw new UnableToLoadException("Could not get album: " + e10.getMessage(), e10);
            } catch (SecurityException e11) {
                throw new UnableToLoadException("Could not get albums: need READ_EXTERNAL_STORAGE permission " + e11.getMessage(), e11);
            }
        }
    }

    public static final File createAlbumFile(String mimeType, String albumName) throws AlbumException, AssetFileException {
        AbstractC2855l.g(mimeType, "mimeType");
        AbstractC2855l.g(albumName, "albumName");
        File envDirectoryForAssetType = MediaLibraryUtils.INSTANCE.getEnvDirectoryForAssetType(mimeType, false);
        if (envDirectoryForAssetType == null) {
            throw new AssetFileException("Could not guess asset type.");
        }
        File file = new File(envDirectoryForAssetType.getPath(), albumName);
        if (!file.exists() && !file.mkdirs()) {
            file = null;
        }
        if (file != null) {
            return file;
        }
        throw new AlbumException("Could not create album directory.");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object getAlbumFile(Context context, String str, n7.f fVar) throws AlbumException {
        AnonymousClass1 anonymousClass1;
        if (fVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) fVar;
            int i10 = anonymousClass1.label;
            if ((i10 & androidx.customview.widget.a.INVALID_ID) != 0) {
                anonymousClass1.label = i10 - androidx.customview.widget.a.INVALID_ID;
            } else {
                anonymousClass1 = new AnonymousClass1(fVar);
            }
        }
        Object albumFileOrNull = anonymousClass1.result;
        Object objE = AbstractC3016b.e();
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            AbstractC2753p.b(albumFileOrNull);
            anonymousClass1.label = 1;
            albumFileOrNull = getAlbumFileOrNull(context, str, anonymousClass1);
            if (albumFileOrNull == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(albumFileOrNull);
        }
        File file = (File) albumFileOrNull;
        if (file != null) {
            return file;
        }
        throw new AlbumException("Could not get album. Query returns null.");
    }

    public static final Object getAlbumFileByNameOrNull(Context context, String str, n7.f fVar) {
        return getFileOrNullByContextResolver(context, "media_type != 0 AND bucket_display_name=?", new String[]{str}, fVar);
    }

    public static final Object getAlbumFileOrNull(Context context, String str, n7.f fVar) {
        return getFileOrNullByContextResolver(context, "bucket_id=?", new String[]{str}, fVar);
    }

    public static final List<String> getAssetsInAlbums(Context context, String... albumIds) throws IOException {
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(albumIds, "albumIds");
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = context.getContentResolver().query(MediaLibraryConstantsKt.getEXTERNAL_CONTENT_URI(), new String[]{"_id"}, "bucket_id IN (" + MediaLibraryUtils.INSTANCE.queryPlaceholdersFor(albumIds) + " )", albumIds, null);
        if (cursorQuery == null) {
            AbstractC3376c.a(cursorQuery, null);
            return arrayList;
        }
        while (cursorQuery.moveToNext()) {
            try {
                String string = cursorQuery.getString(cursorQuery.getColumnIndex("_id"));
                AbstractC2855l.d(string);
                arrayList.add(string);
            } finally {
            }
        }
        C2735B c2735b = C2735B.f28704a;
        AbstractC3376c.a(cursorQuery, null);
        return arrayList;
    }

    public static final Object getFileOrNullByContextResolver(Context context, String str, String[] strArr, n7.f fVar) {
        return AbstractC1413i.g(C1404d0.b(), new AnonymousClass2(context, str, strArr, null), fVar);
    }

    public static final Object queryAlbum(Context context, String str, String[] strArr, n7.f fVar) {
        return AbstractC1413i.g(C1404d0.b(), new C25232(context, str, strArr, null), fVar);
    }
}
