package expo.modules.medialibrary.assets;

import P8.q;
import R8.AbstractC1413i;
import R8.C1404d0;
import R8.D0;
import R8.N;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import androidx.customview.widget.a;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.medialibrary.AssetException;
import expo.modules.medialibrary.AssetFileException;
import expo.modules.medialibrary.ContentEntryException;
import expo.modules.medialibrary.MediaLibraryUtils;
import expo.modules.medialibrary.UnableToLoadPermissionException;
import expo.modules.medialibrary.UnableToSaveException;
import i7.AbstractC2753p;
import i7.C2735B;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o7.AbstractC3016b;
import t7.AbstractC3376c;
import t7.j;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0003¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\fH\u0083@¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u0019\u001a\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016j\n\u0012\u0004\u0012\u00020\u0017\u0018\u0001`\u0018H\u0083@¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001b\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ$\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016j\n\u0012\u0004\u0012\u00020\u0017\u0018\u0001`\u0018H\u0086@¢\u0006\u0004\b\u001d\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001fR\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010 R\u0014\u0010!\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Landroid/content/Context;", "context", PointerEventHelper.POINTER_TYPE_UNKNOWN, "uri", PointerEventHelper.POINTER_TYPE_UNKNOWN, "resolveWithAdditionalData", "Ljava/io/File;", "albumFile", "<init>", "(Landroid/content/Context;Ljava/lang/String;ZLjava/io/File;)V", "Landroid/net/Uri;", "normalizeAssetUri", "(Ljava/lang/String;)Landroid/net/Uri;", "createContentResolverAssetEntry", "()Landroid/net/Uri;", "localFile", "assetUri", PointerEventHelper.POINTER_TYPE_UNKNOWN, "writeFileContentsToAsset", "(Ljava/io/File;Landroid/net/Uri;Ln7/f;)Ljava/lang/Object;", "Ljava/util/ArrayList;", "Landroid/os/Bundle;", "Lkotlin/collections/ArrayList;", "createAssetUsingContentResolver", "(Ln7/f;)Ljava/lang/Object;", "createAssetFileLegacy", "(Ljava/io/File;)Ljava/io/File;", "execute", "Landroid/content/Context;", "Z", "Ljava/io/File;", "mUri", "Landroid/net/Uri;", "isFileExtensionPresent", "()Z", "expo-media-library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CreateAssetWithAlbumFile {
    private final File albumFile;
    private final Context context;
    private final Uri mUri;
    private final boolean resolveWithAdditionalData;

    /* JADX INFO: renamed from: expo.modules.medialibrary.assets.CreateAssetWithAlbumFile$createAssetUsingContentResolver$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.medialibrary.assets.CreateAssetWithAlbumFile$createAssetUsingContentResolver$2", f = "CreateAsset.kt", l = {110, 116}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001j\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001`\u0003*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LR8/N;", "Ljava/util/ArrayList;", "Landroid/os/Bundle;", "Lkotlin/collections/ArrayList;", "<anonymous>", "(LR8/N;)Ljava/util/ArrayList;"}, k = 3, mv = {2, 1, 0})
    static final class AnonymousClass2 extends l implements Function2 {
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        AnonymousClass2(n7.f fVar) {
            super(2, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            AnonymousClass2 anonymousClass2 = CreateAssetWithAlbumFile.this.new AnonymousClass2(fVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, n7.f fVar) {
            return ((AnonymousClass2) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws ContentEntryException {
            Uri uriCreateContentResolverAssetEntry;
            N n10;
            Object objE = AbstractC3016b.e();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC2753p.b(obj);
                N n11 = (N) this.L$0;
                uriCreateContentResolverAssetEntry = CreateAssetWithAlbumFile.this.createContentResolverAssetEntry();
                if (uriCreateContentResolverAssetEntry == null) {
                    throw new ContentEntryException();
                }
                CreateAssetWithAlbumFile createAssetWithAlbumFile = CreateAssetWithAlbumFile.this;
                String path = CreateAssetWithAlbumFile.this.mUri.getPath();
                AbstractC2855l.d(path);
                File file = new File(path);
                this.L$0 = n11;
                this.L$1 = uriCreateContentResolverAssetEntry;
                this.label = 1;
                if (createAssetWithAlbumFile.writeFileContentsToAsset(file, uriCreateContentResolverAssetEntry, this) != objE) {
                    n10 = n11;
                }
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC2753p.b(obj);
                return obj;
            }
            uriCreateContentResolverAssetEntry = (Uri) this.L$1;
            n10 = (N) this.L$0;
            AbstractC2753p.b(obj);
            D0.g(n10.i());
            if (!CreateAssetWithAlbumFile.this.resolveWithAdditionalData) {
                return null;
            }
            String[] strArr = {String.valueOf(ContentUris.parseId(uriCreateContentResolverAssetEntry))};
            Context context = CreateAssetWithAlbumFile.this.context;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
            Object objQueryAssetInfo = AssetUtilsKt.queryAssetInfo(context, "_id=?", strArr, false, this);
            return objQueryAssetInfo == objE ? objE : objQueryAssetInfo;
        }
    }

    /* JADX INFO: renamed from: expo.modules.medialibrary.assets.CreateAssetWithAlbumFile$execute$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.medialibrary.assets.CreateAssetWithAlbumFile", f = "CreateAsset.kt", l = {146, 151, 160}, m = "execute")
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
            this.label |= a.INVALID_ID;
            return CreateAssetWithAlbumFile.this.execute(this);
        }
    }

    /* JADX INFO: renamed from: expo.modules.medialibrary.assets.CreateAssetWithAlbumFile$writeFileContentsToAsset$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.medialibrary.assets.CreateAssetWithAlbumFile$writeFileContentsToAsset$2", f = "CreateAsset.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LR8/N;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<anonymous>", "(LR8/N;)I"}, k = 3, mv = {2, 1, 0})
    static final class C25242 extends l implements Function2 {
        final /* synthetic */ Uri $assetUri;
        final /* synthetic */ File $localFile;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C25242(File file, Uri uri, n7.f fVar) {
            super(2, fVar);
            this.$localFile = file;
            this.$assetUri = uri;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            C25242 c25242 = CreateAssetWithAlbumFile.this.new C25242(this.$localFile, this.$assetUri, fVar);
            c25242.L$0 = obj;
            return c25242;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, n7.f fVar) {
            return ((C25242) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws IOException {
            AbstractC3016b.e();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(obj);
            N n10 = (N) this.L$0;
            ContentResolver contentResolver = CreateAssetWithAlbumFile.this.context.getContentResolver();
            D0.g(n10.i());
            FileChannel channel = new FileInputStream(this.$localFile).getChannel();
            Uri uri = this.$assetUri;
            try {
                OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uri);
                AbstractC2855l.e(outputStreamOpenOutputStream, "null cannot be cast to non-null type java.io.FileOutputStream");
                FileChannel channel2 = ((FileOutputStream) outputStreamOpenOutputStream).getChannel();
                try {
                    if (channel.transferTo(0L, channel.size(), channel2) == channel.size()) {
                        C2735B c2735b = C2735B.f28704a;
                        AbstractC3376c.a(channel2, null);
                        AbstractC3376c.a(channel, null);
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("is_pending", b.c(0));
                        return b.c(contentResolver.update(this.$assetUri, contentValues, null, null));
                    }
                    contentResolver.delete(uri, null, null);
                    throw new IOException("Could not save file to " + uri + " Not enough space.");
                } finally {
                }
            } finally {
            }
        }
    }

    public CreateAssetWithAlbumFile(Context context, String uri, boolean z10, File file) {
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(uri, "uri");
        this.context = context;
        this.resolveWithAdditionalData = z10;
        this.albumFile = file;
        this.mUri = normalizeAssetUri(uri);
    }

    private final File createAssetFileLegacy(File albumFile) throws IOException, AssetFileException {
        String path = this.mUri.getPath();
        AbstractC2855l.d(path);
        File file = new File(path);
        MediaLibraryUtils mediaLibraryUtils = MediaLibraryUtils.INSTANCE;
        ContentResolver contentResolver = this.context.getContentResolver();
        AbstractC2855l.f(contentResolver, "getContentResolver(...)");
        String mimeType = mediaLibraryUtils.getMimeType(contentResolver, this.mUri);
        if (mimeType == null) {
            throw new AssetFileException("Could not guess file type.");
        }
        if (albumFile == null) {
            albumFile = mediaLibraryUtils.getEnvDirectoryForAssetType(mimeType, true);
        }
        File fileSafeCopyFile = mediaLibraryUtils.safeCopyFile(file, albumFile);
        if (albumFile.exists() && fileSafeCopyFile.isFile()) {
            return fileSafeCopyFile;
        }
        throw new AssetFileException("Could not create asset record. Related file does not exist.");
    }

    static /* synthetic */ File createAssetFileLegacy$default(CreateAssetWithAlbumFile createAssetWithAlbumFile, File file, int i10, Object obj) throws IOException {
        if ((i10 & 1) != 0) {
            file = null;
        }
        return createAssetWithAlbumFile.createAssetFileLegacy(file);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object createAssetUsingContentResolver(n7.f fVar) throws IOException {
        return AbstractC1413i.g(C1404d0.b(), new AnonymousClass2(null), fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Uri createContentResolverAssetEntry() {
        String relativePathForAssetType;
        ContentResolver contentResolver = this.context.getContentResolver();
        MediaLibraryUtils mediaLibraryUtils = MediaLibraryUtils.INSTANCE;
        AbstractC2855l.d(contentResolver);
        String mimeType = mediaLibraryUtils.getMimeType(contentResolver, this.mUri);
        String lastPathSegment = this.mUri.getLastPathSegment();
        File file = this.albumFile;
        if (file != null) {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            AbstractC2855l.f(externalStorageDirectory, "getExternalStorageDirectory(...)");
            File fileB = j.B(file, externalStorageDirectory);
            if (fileB == null || (relativePathForAssetType = fileB.getPath()) == null) {
                relativePathForAssetType = mediaLibraryUtils.getRelativePathForAssetType(mimeType, true);
            }
        }
        Uri uriMimeTypeToExternalUri = mediaLibraryUtils.mimeTypeToExternalUri(mimeType);
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", lastPathSegment);
        contentValues.put("mime_type", mimeType);
        contentValues.put("relative_path", relativePathForAssetType);
        contentValues.put("is_pending", (Integer) 1);
        return contentResolver.insert(uriMimeTypeToExternalUri, contentValues);
    }

    private final boolean isFileExtensionPresent() {
        String lastPathSegment = this.mUri.getLastPathSegment();
        if (lastPathSegment != null) {
            return q.Q(lastPathSegment, ".", false, 2, null);
        }
        return false;
    }

    private final Uri normalizeAssetUri(String uri) {
        if (q.K(uri, "/", false, 2, null)) {
            Uri uriFromFile = Uri.fromFile(new File(uri));
            AbstractC2855l.d(uriFromFile);
            return uriFromFile;
        }
        Uri uri2 = Uri.parse(uri);
        AbstractC2855l.d(uri2);
        return uri2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object writeFileContentsToAsset(File file, Uri uri, n7.f fVar) throws IOException {
        return AbstractC1413i.g(C1404d0.b(), new C25242(file, uri, null), fVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object execute(n7.f fVar) throws UnableToSaveException, UnableToLoadPermissionException, IOException, AssetFileException {
        AnonymousClass1 anonymousClass1;
        if (fVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) fVar;
            int i10 = anonymousClass1.label;
            if ((i10 & a.INVALID_ID) != 0) {
                anonymousClass1.label = i10 - a.INVALID_ID;
            } else {
                anonymousClass1 = new AnonymousClass1(fVar);
            }
        }
        Object objScanFile = anonymousClass1.result;
        Object objE = AbstractC3016b.e();
        int i11 = anonymousClass1.label;
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        AbstractC2753p.b(objScanFile);
                    } else if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                AbstractC2753p.b(objScanFile);
                return objScanFile;
            }
            AbstractC2753p.b(objScanFile);
            if (!isFileExtensionPresent()) {
                throw new AssetFileException("Could not get the file's extension.");
            }
            if (Build.VERSION.SDK_INT >= 30) {
                anonymousClass1.label = 1;
                Object objCreateAssetUsingContentResolver = createAssetUsingContentResolver(anonymousClass1);
                if (objCreateAssetUsingContentResolver != objE) {
                    return objCreateAssetUsingContentResolver;
                }
            } else {
                File fileCreateAssetFileLegacy = createAssetFileLegacy(this.albumFile);
                D0.g(anonymousClass1.getContext());
                MediaLibraryUtils mediaLibraryUtils = MediaLibraryUtils.INSTANCE;
                Context context = this.context;
                String[] strArr = {fileCreateAssetFileLegacy.getPath()};
                anonymousClass1.label = 2;
                objScanFile = mediaLibraryUtils.scanFile(context, strArr, null, anonymousClass1);
                if (objScanFile == objE) {
                }
            }
            Pair pair = (Pair) objScanFile;
            String str = (String) pair.getFirst();
            Uri uri = (Uri) pair.getSecond();
            D0.g(anonymousClass1.getContext());
            if (uri == null) {
                throw new AssetException();
            }
            if (!this.resolveWithAdditionalData) {
                return null;
            }
            Context context2 = this.context;
            anonymousClass1.label = 3;
            Object objQueryAssetInfo = AssetUtilsKt.queryAssetInfo(context2, "_data=?", new String[]{str}, false, anonymousClass1);
            return objQueryAssetInfo == objE ? objE : objQueryAssetInfo;
        } catch (IOException e10) {
            throw new IOException("Unable to copy file into external storage.", e10);
        } catch (SecurityException e11) {
            throw new UnableToLoadPermissionException("Could not get asset: need READ_EXTERNAL_STORAGE permission", e11);
        } catch (Exception e12) {
            throw new UnableToSaveException("Could not create asset: " + e12.getMessage(), e12);
        }
    }

    public /* synthetic */ CreateAssetWithAlbumFile(Context context, String str, boolean z10, File file, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i10 & 4) != 0 ? true : z10, file);
    }
}
