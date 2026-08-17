package expo.modules.medialibrary.albums;

import R8.AbstractC1413i;
import R8.C1404d0;
import R8.D0;
import R8.N;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.medialibrary.AlbumException;
import expo.modules.medialibrary.AssetFileException;
import expo.modules.medialibrary.MediaLibraryUtils;
import expo.modules.medialibrary.UnableToLoadException;
import expo.modules.medialibrary.assets.CreateAssetWithAlbumFile;
import i7.AbstractC2753p;
import i7.C2735B;
import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a2\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0086@¢\u0006\u0004\b\b\u0010\t\u001a*\u0010\f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0086@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroid/content/Context;", "context", PointerEventHelper.POINTER_TYPE_UNKNOWN, "albumName", "assetId", PointerEventHelper.POINTER_TYPE_UNKNOWN, "copyAsset", "Landroid/os/Bundle;", "createAlbum", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLn7/f;)Ljava/lang/Object;", "Landroid/net/Uri;", "assetUri", "createAlbumWithInitialFileUri", "(Landroid/content/Context;Ljava/lang/String;Landroid/net/Uri;Ln7/f;)Ljava/lang/Object;", "expo-media-library_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class CreateAlbumKt {

    /* JADX INFO: renamed from: expo.modules.medialibrary.albums.CreateAlbumKt$createAlbum$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.medialibrary.albums.CreateAlbumKt$createAlbum$2", f = "CreateAlbum.kt", l = {IntBufferBatchMountItem.INSTRUCTION_UPDATE_PROPS, 39}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LR8/N;", "Landroid/os/Bundle;", "<anonymous>", "(LR8/N;)Landroid/os/Bundle;"}, k = 3, mv = {2, 1, 0})
    static final class AnonymousClass2 extends l implements Function2 {
        final /* synthetic */ String $albumName;
        final /* synthetic */ String $assetId;
        final /* synthetic */ Context $context;
        final /* synthetic */ boolean $copyAsset;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(boolean z10, Context context, String str, String str2, n7.f fVar) {
            super(2, fVar);
            this.$copyAsset = z10;
            this.$context = context;
            this.$assetId = str;
            this.$albumName = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$copyAsset, this.$context, this.$assetId, this.$albumName, fVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, n7.f fVar) {
            return ((AnonymousClass2) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x00ab, code lost:
        
            if (r10 == r0) goto L29;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws UnableToLoadException, AlbumException {
            N n10;
            Object objE = AbstractC3016b.e();
            int i10 = this.label;
            try {
                if (i10 == 0) {
                    AbstractC2753p.b(obj);
                    n10 = (N) this.L$0;
                    AssetFileStrategy copyStrategy = this.$copyAsset ? AssetFileStrategy.INSTANCE.getCopyStrategy() : AssetFileStrategy.INSTANCE.getMoveStrategy();
                    MediaLibraryUtils mediaLibraryUtils = MediaLibraryUtils.INSTANCE;
                    MediaLibraryUtils.AssetFile assetFile = mediaLibraryUtils.getAssetsById(this.$context, this.$assetId).get(0);
                    File fileApply = copyStrategy.apply(assetFile, AlbumUtilsKt.createAlbumFile(assetFile.getMimeType(), this.$albumName), this.$context);
                    D0.g(n10.i());
                    Context context = this.$context;
                    String[] strArr = {fileApply.getPath()};
                    this.L$0 = n10;
                    this.label = 1;
                    obj = mediaLibraryUtils.scanFile(context, strArr, null, this);
                    if (obj == objE) {
                    }
                    return objE;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2753p.b(obj);
                    return (Bundle) obj;
                }
                n10 = (N) this.L$0;
                AbstractC2753p.b(obj);
                Pair pair = (Pair) obj;
                String str = (String) pair.getFirst();
                Uri uri = (Uri) pair.getSecond();
                D0.g(n10.i());
                if (uri == null) {
                    throw new AlbumException("Could not add image to album.");
                }
                String[] strArr2 = {str};
                Context context2 = this.$context;
                this.L$0 = null;
                this.label = 2;
                obj = AlbumUtilsKt.queryAlbum(context2, "_data=?", strArr2, this);
            } catch (IOException e10) {
                throw new UnableToLoadException("Could not read file or parse EXIF tags: " + e10.getMessage(), e10);
            } catch (SecurityException e11) {
                throw new UnableToLoadException("Could not create album: need WRITE_EXTERNAL_STORAGE permission: " + e11.getMessage(), e11);
            }
        }
    }

    /* JADX INFO: renamed from: expo.modules.medialibrary.albums.CreateAlbumKt$createAlbumWithInitialFileUri$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.medialibrary.albums.CreateAlbumKt", f = "CreateAlbum.kt", l = {IntBufferBatchMountItem.INSTRUCTION_UPDATE_STATE, 65}, m = "createAlbumWithInitialFileUri")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class AnonymousClass1 extends d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(n7.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= androidx.customview.widget.a.INVALID_ID;
            return CreateAlbumKt.createAlbumWithInitialFileUri(null, null, null, this);
        }
    }

    public static final Object createAlbum(Context context, String str, String str2, boolean z10, n7.f fVar) {
        return AbstractC1413i.g(C1404d0.b(), new AnonymousClass2(z10, context, str2, str, null), fVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object createAlbumWithInitialFileUri(Context context, String str, Uri uri, n7.f fVar) throws AlbumException, AssetFileException {
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
        Object obj = anonymousClass1.result;
        Object objE = AbstractC3016b.e();
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            AbstractC2753p.b(obj);
            MediaLibraryUtils mediaLibraryUtils = MediaLibraryUtils.INSTANCE;
            ContentResolver contentResolver = context.getContentResolver();
            AbstractC2855l.f(contentResolver, "getContentResolver(...)");
            String mimeType = mediaLibraryUtils.getMimeType(contentResolver, uri);
            if (mimeType == null) {
                throw new AlbumException("Failed to create album: could not determine MIME type of the asset with uri: `" + uri + "`.");
            }
            String path = uri.getPath();
            if (path == null) {
                throw new AlbumException("Failed to create album: could not determine path of the asset with uri: `" + uri + "`.");
            }
            File fileCreateAlbumFile = AlbumUtilsKt.createAlbumFile(mimeType, str);
            if (!new File(path).exists()) {
                throw new AlbumException("Failed to create album: the local media file with uri: `" + uri + "` does not exist.");
            }
            String string = uri.toString();
            AbstractC2855l.f(string, "toString(...)");
            CreateAssetWithAlbumFile createAssetWithAlbumFile = new CreateAssetWithAlbumFile(context, string, false, fileCreateAlbumFile);
            anonymousClass1.L$0 = context;
            anonymousClass1.L$1 = str;
            anonymousClass1.label = 1;
            if (createAssetWithAlbumFile.execute(anonymousClass1) != objE) {
            }
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(obj);
            return obj;
        }
        str = (String) anonymousClass1.L$1;
        context = (Context) anonymousClass1.L$0;
        AbstractC2753p.b(obj);
        anonymousClass1.L$0 = null;
        anonymousClass1.L$1 = null;
        anonymousClass1.label = 2;
        Object album = GetAlbumKt.getAlbum(context, str, anonymousClass1);
        return album == objE ? objE : album;
    }
}
