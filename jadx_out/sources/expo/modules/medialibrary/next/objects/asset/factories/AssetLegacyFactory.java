package expo.modules.medialibrary.next.objects.asset.factories;

import C0.a;
import R8.AbstractC1413i;
import R8.C1404d0;
import R8.N;
import R8.O;
import android.content.ContentResolver;
import android.content.Context;
import android.media.MediaScannerConnection;
import android.net.Uri;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.exception.Exceptions;
import expo.modules.medialibrary.next.exceptions.AssetCouldNotBeCreated;
import expo.modules.medialibrary.next.exceptions.ContentResolverNotObtainedException;
import expo.modules.medialibrary.next.exceptions.PermissionException;
import expo.modules.medialibrary.next.extensions.FileExtensionsKt;
import expo.modules.medialibrary.next.extensions.WeakReferenceExtensionsKt;
import expo.modules.medialibrary.next.objects.asset.Asset;
import expo.modules.medialibrary.next.objects.asset.delegates.AssetDelegate;
import expo.modules.medialibrary.next.objects.asset.delegates.AssetLegacyDelegate;
import expo.modules.medialibrary.next.objects.asset.deleters.AssetDeleter;
import expo.modules.medialibrary.next.objects.wrappers.MimeType;
import expo.modules.medialibrary.next.objects.wrappers.RelativePath;
import expo.modules.medialibrary.next.permissions.SystemPermissionsDelegate;
import i7.AbstractC2753p;
import i7.C2735B;
import i7.C2752o;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014JD\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010\n0\u001a2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016H\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\"\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096@¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010'R\"\u0010*\u001a\u0010\u0012\f\u0012\n )*\u0004\u0018\u00010\u00060\u00060(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010/\u001a\u00020,8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00060"}, d2 = {"Lexpo/modules/medialibrary/next/objects/asset/factories/AssetLegacyFactory;", "Lexpo/modules/medialibrary/next/objects/asset/factories/AssetFactory;", "Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetDeleter;", "assetDeleter", "Lexpo/modules/medialibrary/next/permissions/SystemPermissionsDelegate;", "systemPermissionsDelegate", "Landroid/content/Context;", "context", "<init>", "(Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetDeleter;Lexpo/modules/medialibrary/next/permissions/SystemPermissionsDelegate;Landroid/content/Context;)V", "Landroid/net/Uri;", "contentUri", "Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetDelegate;", "createAssetDelegate", "(Landroid/net/Uri;)Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetDelegate;", "filePath", "Lexpo/modules/medialibrary/next/objects/wrappers/RelativePath;", "relativePath", "Ljava/io/File;", "createDestinationDirectory-mc4yU64", "(Landroid/net/Uri;Ljava/lang/String;)Ljava/io/File;", "createDestinationDirectory", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "paths", "mimeTypes", "Lkotlin/Pair;", "scanFile", "(Landroid/content/Context;[Ljava/lang/String;[Ljava/lang/String;Ln7/f;)Ljava/lang/Object;", "Lexpo/modules/medialibrary/next/objects/asset/Asset;", "create", "(Landroid/net/Uri;)Lexpo/modules/medialibrary/next/objects/asset/Asset;", "create-BuevYFM", "(Landroid/net/Uri;Ljava/lang/String;Ln7/f;)Ljava/lang/Object;", "Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetDeleter;", "getAssetDeleter", "()Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetDeleter;", "Lexpo/modules/medialibrary/next/permissions/SystemPermissionsDelegate;", "getSystemPermissionsDelegate", "()Lexpo/modules/medialibrary/next/permissions/SystemPermissionsDelegate;", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "contextRef", "Ljava/lang/ref/WeakReference;", "Landroid/content/ContentResolver;", "getContentResolver", "()Landroid/content/ContentResolver;", "contentResolver", "expo-media-library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AssetLegacyFactory implements AssetFactory {
    private final AssetDeleter assetDeleter;
    private final WeakReference<Context> contextRef;
    private final SystemPermissionsDelegate systemPermissionsDelegate;

    /* JADX INFO: renamed from: expo.modules.medialibrary.next.objects.asset.factories.AssetLegacyFactory$create$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.medialibrary.next.objects.asset.factories.AssetLegacyFactory$create$2", f = "AssetLegacyFactory.kt", l = {56}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LR8/N;", "Lexpo/modules/medialibrary/next/objects/asset/Asset;", "<anonymous>", "(LR8/N;)Lexpo/modules/medialibrary/next/objects/asset/Asset;"}, k = 3, mv = {2, 1, 0})
    static final class AnonymousClass2 extends l implements Function2 {
        final /* synthetic */ Uri $filePath;
        final /* synthetic */ String $relativePath;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Uri uri, String str, n7.f fVar) {
            super(2, fVar);
            this.$filePath = uri;
            this.$relativePath = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            AnonymousClass2 anonymousClass2 = AssetLegacyFactory.this.new AnonymousClass2(this.$filePath, this.$relativePath, fVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, n7.f fVar) {
            return ((AnonymousClass2) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws PermissionException, IOException, AssetCouldNotBeCreated, Exceptions.ReactContextLost {
            N n10;
            Object objE = AbstractC3016b.e();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC2753p.b(obj);
                N n11 = (N) this.L$0;
                AssetLegacyFactory.this.getSystemPermissionsDelegate().requireWritePermissions();
                File fileSafeCopy = FileExtensionsKt.safeCopy(a.a(this.$filePath), AssetLegacyFactory.this.m291createDestinationDirectorymc4yU64(this.$filePath, this.$relativePath));
                AssetLegacyFactory assetLegacyFactory = AssetLegacyFactory.this;
                Context orThrow = WeakReferenceExtensionsKt.getOrThrow(assetLegacyFactory.contextRef);
                String[] strArr = {fileSafeCopy.toString()};
                this.L$0 = n11;
                this.label = 1;
                Object objScanFile = assetLegacyFactory.scanFile(orThrow, strArr, null, this);
                if (objScanFile == objE) {
                    return objE;
                }
                n10 = n11;
                obj = objScanFile;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                n10 = (N) this.L$0;
                AbstractC2753p.b(obj);
            }
            Uri uri = (Uri) ((Pair) obj).getSecond();
            O.d(n10);
            if (uri != null) {
                return AssetLegacyFactory.this.create(uri);
            }
            throw new AssetCouldNotBeCreated("Failed to create asset: could not add asset to MediaStore", null, 2, null);
        }
    }

    public AssetLegacyFactory(AssetDeleter assetDeleter, SystemPermissionsDelegate systemPermissionsDelegate, Context context) {
        AbstractC2855l.g(assetDeleter, "assetDeleter");
        AbstractC2855l.g(systemPermissionsDelegate, "systemPermissionsDelegate");
        AbstractC2855l.g(context, "context");
        this.assetDeleter = assetDeleter;
        this.systemPermissionsDelegate = systemPermissionsDelegate;
        this.contextRef = new WeakReference<>(context);
    }

    private final AssetDelegate createAssetDelegate(Uri contentUri) {
        return new AssetLegacyDelegate(contentUri, this.assetDeleter, this.systemPermissionsDelegate, WeakReferenceExtensionsKt.getOrThrow(this.contextRef));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: createDestinationDirectory-mc4yU64, reason: not valid java name */
    public final File m291createDestinationDirectorymc4yU64(Uri filePath, String relativePath) {
        File fileM300externalStorageAssetDirectoryimpl;
        if (relativePath != null) {
            fileM300externalStorageAssetDirectoryimpl = new File(RelativePath.m316toFilePathimpl(relativePath));
        } else {
            String type = getContentResolver().getType(filePath);
            fileM300externalStorageAssetDirectoryimpl = MimeType.m300externalStorageAssetDirectoryimpl(type != null ? MimeType.m297constructorimpl(type) : MimeType.INSTANCE.m310fromdctPOJs(filePath));
        }
        fileM300externalStorageAssetDirectoryimpl.mkdirs();
        return fileM300externalStorageAssetDirectoryimpl;
    }

    private final ContentResolver getContentResolver() throws ContentResolverNotObtainedException {
        ContentResolver contentResolver = WeakReferenceExtensionsKt.getOrThrow(this.contextRef).getContentResolver();
        if (contentResolver != null) {
            return contentResolver;
        }
        throw new ContentResolverNotObtainedException(null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object scanFile(Context context, String[] strArr, String[] strArr2, n7.f fVar) {
        final n7.l lVar = new n7.l(AbstractC3016b.c(fVar));
        MediaScannerConnection.scanFile(context, strArr, strArr2, new MediaScannerConnection.OnScanCompletedListener() { // from class: expo.modules.medialibrary.next.objects.asset.factories.AssetLegacyFactory$scanFile$2$1
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

    @Override // expo.modules.medialibrary.next.objects.asset.factories.AssetFactory
    public Asset create(Uri contentUri) {
        AbstractC2855l.g(contentUri, "contentUri");
        return new Asset(createAssetDelegate(contentUri));
    }

    @Override // expo.modules.medialibrary.next.objects.asset.factories.AssetFactory
    /* JADX INFO: renamed from: create-BuevYFM */
    public Object mo289createBuevYFM(Uri uri, String str, n7.f fVar) {
        return AbstractC1413i.g(C1404d0.b(), new AnonymousClass2(uri, str, null), fVar);
    }

    public final AssetDeleter getAssetDeleter() {
        return this.assetDeleter;
    }

    public final SystemPermissionsDelegate getSystemPermissionsDelegate() {
        return this.systemPermissionsDelegate;
    }
}
