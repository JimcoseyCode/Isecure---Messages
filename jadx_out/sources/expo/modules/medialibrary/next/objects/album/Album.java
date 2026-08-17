package expo.modules.medialibrary.next.objects.album;

import P8.q;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import androidx.customview.widget.a;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.sharedobjects.SharedObject;
import expo.modules.medialibrary.next.exceptions.AlbumPropertyNotFoundException;
import expo.modules.medialibrary.next.exceptions.ContentResolverNotObtainedException;
import expo.modules.medialibrary.next.extensions.WeakReferenceExtensionsKt;
import expo.modules.medialibrary.next.extensions.resolver.AlbumExtensionsKt;
import expo.modules.medialibrary.next.objects.asset.Asset;
import expo.modules.medialibrary.next.objects.asset.deleters.AssetDeleter;
import expo.modules.medialibrary.next.objects.asset.factories.AssetFactory;
import expo.modules.medialibrary.next.objects.wrappers.RelativePath;
import i7.AbstractC2753p;
import i7.C2735B;
import j7.AbstractC2800q;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.AbstractC2855l;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\rH\u0086@¢\u0006\u0004\b\u0013\u0010\u0012J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0086@¢\u0006\u0004\b\u0017\u0010\u0012J\u0010\u0010\u0019\u001a\u00020\u0018H\u0086@¢\u0006\u0004\b\u0019\u0010\u0012J\u0018\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0016H\u0086@¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010%R\"\u0010(\u001a\u0010\u0012\f\u0012\n '*\u0004\u0018\u00010\b0\b0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020*8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lexpo/modules/medialibrary/next/objects/album/Album;", "Lexpo/modules/kotlin/sharedobjects/SharedObject;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "id", "Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetDeleter;", "assetDeleter", "Lexpo/modules/medialibrary/next/objects/asset/factories/AssetFactory;", "assetFactory", "Landroid/content/Context;", "context", "<init>", "(Ljava/lang/String;Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetDeleter;Lexpo/modules/medialibrary/next/objects/asset/factories/AssetFactory;Landroid/content/Context;)V", "filePath", "Lexpo/modules/medialibrary/next/objects/wrappers/RelativePath;", "createRelativePathFrom-MwbCjzw", "(Ljava/lang/String;)Ljava/lang/String;", "createRelativePathFrom", "getTitle", "(Ln7/f;)Ljava/lang/Object;", "getRelativePath-MwbCjzw", "getRelativePath", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/medialibrary/next/objects/asset/Asset;", "getAssets", "Li7/B;", "delete", "asset", "add", "(Lexpo/modules/medialibrary/next/objects/asset/Asset;Ln7/f;)Ljava/lang/Object;", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetDeleter;", "getAssetDeleter", "()Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetDeleter;", "Lexpo/modules/medialibrary/next/objects/asset/factories/AssetFactory;", "getAssetFactory", "()Lexpo/modules/medialibrary/next/objects/asset/factories/AssetFactory;", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "contextRef", "Ljava/lang/ref/WeakReference;", "Landroid/content/ContentResolver;", "getContentResolver", "()Landroid/content/ContentResolver;", "contentResolver", "expo-media-library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Album extends SharedObject {
    private final AssetDeleter assetDeleter;
    private final AssetFactory assetFactory;
    private final WeakReference<Context> contextRef;
    private final String id;

    /* JADX INFO: renamed from: expo.modules.medialibrary.next.objects.album.Album$add$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.medialibrary.next.objects.album.Album", f = "Album.kt", l = {69, 69}, m = "add")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class AnonymousClass1 extends d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(n7.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= a.INVALID_ID;
            return Album.this.add(null, this);
        }
    }

    /* JADX INFO: renamed from: expo.modules.medialibrary.next.objects.album.Album$delete$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.medialibrary.next.objects.album.Album", f = "Album.kt", l = {65, IntBufferBatchMountItem.INSTRUCTION_UPDATE_STATE}, m = "delete")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class C25371 extends d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C25371(n7.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= a.INVALID_ID;
            return Album.this.delete(this);
        }
    }

    /* JADX INFO: renamed from: expo.modules.medialibrary.next.objects.album.Album$getAssets$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.medialibrary.next.objects.album.Album", f = "Album.kt", l = {60}, m = "getAssets")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class C25381 extends d {
        int label;
        /* synthetic */ Object result;

        C25381(n7.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= a.INVALID_ID;
            return Album.this.getAssets(this);
        }
    }

    /* JADX INFO: renamed from: expo.modules.medialibrary.next.objects.album.Album$getTitle$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.medialibrary.next.objects.album.Album", f = "Album.kt", l = {35}, m = "getTitle")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class C25391 extends d {
        int label;
        /* synthetic */ Object result;

        C25391(n7.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= a.INVALID_ID;
            return Album.this.getTitle(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Album(String id, AssetDeleter assetDeleter, AssetFactory assetFactory, Context context) {
        super(null, 1, null);
        AbstractC2855l.g(id, "id");
        AbstractC2855l.g(assetDeleter, "assetDeleter");
        AbstractC2855l.g(assetFactory, "assetFactory");
        AbstractC2855l.g(context, "context");
        this.id = id;
        this.assetDeleter = assetDeleter;
        this.assetFactory = assetFactory;
        this.contextRef = new WeakReference<>(context);
    }

    /* JADX INFO: renamed from: createRelativePathFrom-MwbCjzw, reason: not valid java name */
    private final String m274createRelativePathFromMwbCjzw(String filePath) throws AlbumPropertyNotFoundException {
        String parent = new File(filePath).getParent();
        if (parent == null) {
            throw new AlbumPropertyNotFoundException("Could get a relative path for the album", null, 2, null);
        }
        String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
        AbstractC2855l.d(absolutePath);
        return RelativePath.m312constructorimpl(q.d1(q.w0(parent, absolutePath), '/') + "/");
    }

    private final ContentResolver getContentResolver() throws ContentResolverNotObtainedException {
        ContentResolver contentResolver = WeakReferenceExtensionsKt.getOrThrow(this.contextRef).getContentResolver();
        if (contentResolver != null) {
            return contentResolver;
        }
        throw new ContentResolverNotObtainedException(null, 1, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        if (r6.m283movedXLngQ8((java.lang.String) r7, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object add(Asset asset, n7.f fVar) throws AlbumPropertyNotFoundException, ContentResolverNotObtainedException {
        AnonymousClass1 anonymousClass1;
        Object objM275getRelativePathMwbCjzw;
        if (fVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) fVar;
            int i10 = anonymousClass1.label;
            if ((i10 & a.INVALID_ID) != 0) {
                anonymousClass1.label = i10 - a.INVALID_ID;
            } else {
                anonymousClass1 = new AnonymousClass1(fVar);
            }
        }
        Object obj = anonymousClass1.result;
        Object objE = AbstractC3016b.e();
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            AbstractC2753p.b(obj);
            anonymousClass1.L$0 = asset;
            anonymousClass1.label = 1;
            objM275getRelativePathMwbCjzw = m275getRelativePathMwbCjzw(anonymousClass1);
            if (objM275getRelativePathMwbCjzw != objE) {
            }
            return objE;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(obj);
            return C2735B.f28704a;
        }
        asset = (Asset) anonymousClass1.L$0;
        AbstractC2753p.b(obj);
        objM275getRelativePathMwbCjzw = ((RelativePath) obj).m318unboximpl();
        anonymousClass1.L$0 = null;
        anonymousClass1.label = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x007a, code lost:
    
        if (r2.delete(r4, r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object delete(n7.f fVar) throws ContentResolverNotObtainedException {
        C25371 c25371;
        AssetDeleter assetDeleter;
        if (fVar instanceof C25371) {
            c25371 = (C25371) fVar;
            int i10 = c25371.label;
            if ((i10 & a.INVALID_ID) != 0) {
                c25371.label = i10 - a.INVALID_ID;
            } else {
                c25371 = new C25371(fVar);
            }
        }
        Object assets = c25371.result;
        Object objE = AbstractC3016b.e();
        int i11 = c25371.label;
        if (i11 == 0) {
            AbstractC2753p.b(assets);
            assetDeleter = this.assetDeleter;
            c25371.L$0 = assetDeleter;
            c25371.label = 1;
            assets = getAssets(c25371);
            if (assets != objE) {
            }
            return objE;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(assets);
            return C2735B.f28704a;
        }
        assetDeleter = (AssetDeleter) c25371.L$0;
        AbstractC2753p.b(assets);
        Iterable iterable = (Iterable) assets;
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((Asset) it.next()).getContentUri());
        }
        c25371.L$0 = null;
        c25371.label = 2;
    }

    public final AssetDeleter getAssetDeleter() {
        return this.assetDeleter;
    }

    public final AssetFactory getAssetFactory() {
        return this.assetFactory;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getAssets(n7.f fVar) throws ContentResolverNotObtainedException {
        C25381 c25381;
        if (fVar instanceof C25381) {
            c25381 = (C25381) fVar;
            int i10 = c25381.label;
            if ((i10 & a.INVALID_ID) != 0) {
                c25381.label = i10 - a.INVALID_ID;
            } else {
                c25381 = new C25381(fVar);
            }
        }
        Object objQueryAlbumAssetsContentUris = c25381.result;
        Object objE = AbstractC3016b.e();
        int i11 = c25381.label;
        if (i11 == 0) {
            AbstractC2753p.b(objQueryAlbumAssetsContentUris);
            ContentResolver contentResolver = getContentResolver();
            String str = this.id;
            c25381.label = 1;
            objQueryAlbumAssetsContentUris = AlbumExtensionsKt.queryAlbumAssetsContentUris(contentResolver, str, c25381);
            if (objQueryAlbumAssetsContentUris == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(objQueryAlbumAssetsContentUris);
        }
        Iterable iterable = (Iterable) objQueryAlbumAssetsContentUris;
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(this.assetFactory.create((Uri) it.next()));
        }
        return arrayList;
    }

    public final String getId() {
        return this.id;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005c, code lost:
    
        if (r9 == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008a, code lost:
    
        if (r9 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: getRelativePath-MwbCjzw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m275getRelativePathMwbCjzw(n7.f fVar) throws AlbumPropertyNotFoundException, ContentResolverNotObtainedException {
        Album$getRelativePath$1 album$getRelativePath$1;
        Object objQueryAlbumRelativePath;
        if (fVar instanceof Album$getRelativePath$1) {
            album$getRelativePath$1 = (Album$getRelativePath$1) fVar;
            int i10 = album$getRelativePath$1.label;
            if ((i10 & a.INVALID_ID) != 0) {
                album$getRelativePath$1.label = i10 - a.INVALID_ID;
            } else {
                album$getRelativePath$1 = new Album$getRelativePath$1(this, fVar);
            }
        }
        Object objQueryAlbumFilepath = album$getRelativePath$1.result;
        Object objE = AbstractC3016b.e();
        int i11 = album$getRelativePath$1.label;
        if (i11 == 0) {
            AbstractC2753p.b(objQueryAlbumFilepath);
            if (Build.VERSION.SDK_INT >= 29) {
                ContentResolver contentResolver = getContentResolver();
                String str = this.id;
                album$getRelativePath$1.label = 1;
                objQueryAlbumRelativePath = AlbumExtensionsKt.queryAlbumRelativePath(contentResolver, str, album$getRelativePath$1);
            } else {
                ContentResolver contentResolver2 = getContentResolver();
                String str2 = this.id;
                album$getRelativePath$1.label = 2;
                objQueryAlbumFilepath = AlbumExtensionsKt.queryAlbumFilepath(contentResolver2, str2, album$getRelativePath$1);
            }
            return objE;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(objQueryAlbumFilepath);
            String str3 = (String) objQueryAlbumFilepath;
            if (str3 != null) {
                return m274createRelativePathFromMwbCjzw(str3);
            }
            throw new AlbumPropertyNotFoundException("Album with ID=" + this.id + " does not exist in MediaStore", null, 2, null);
        }
        AbstractC2753p.b(objQueryAlbumFilepath);
        RelativePath relativePath = (RelativePath) objQueryAlbumFilepath;
        objQueryAlbumRelativePath = relativePath != null ? relativePath.m318unboximpl() : null;
        String str4 = (String) objQueryAlbumRelativePath;
        if (str4 != null) {
            return str4;
        }
        throw new AlbumPropertyNotFoundException("Album with ID=" + this.id + " does not exist in MediaStore", null, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getTitle(n7.f fVar) throws AlbumPropertyNotFoundException, ContentResolverNotObtainedException {
        C25391 c25391;
        if (fVar instanceof C25391) {
            c25391 = (C25391) fVar;
            int i10 = c25391.label;
            if ((i10 & a.INVALID_ID) != 0) {
                c25391.label = i10 - a.INVALID_ID;
            } else {
                c25391 = new C25391(fVar);
            }
        }
        Object objQueryAlbumTitle = c25391.result;
        Object objE = AbstractC3016b.e();
        int i11 = c25391.label;
        if (i11 == 0) {
            AbstractC2753p.b(objQueryAlbumTitle);
            ContentResolver contentResolver = getContentResolver();
            String str = this.id;
            c25391.label = 1;
            objQueryAlbumTitle = AlbumExtensionsKt.queryAlbumTitle(contentResolver, str, c25391);
            if (objQueryAlbumTitle == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(objQueryAlbumTitle);
        }
        String str2 = (String) objQueryAlbumTitle;
        if (str2 != null) {
            return str2;
        }
        throw new AlbumPropertyNotFoundException("Album with ID=" + this.id + " does not exist in MediaStore", null, 2, null);
    }
}
