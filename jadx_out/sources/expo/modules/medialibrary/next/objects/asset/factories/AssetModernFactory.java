package expo.modules.medialibrary.next.objects.asset.factories;

import R8.AbstractC1413i;
import R8.C1404d0;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.medialibrary.next.exceptions.ContentResolverNotObtainedException;
import expo.modules.medialibrary.next.extensions.WeakReferenceExtensionsKt;
import expo.modules.medialibrary.next.objects.asset.Asset;
import expo.modules.medialibrary.next.objects.asset.delegates.AssetDelegate;
import expo.modules.medialibrary.next.objects.asset.delegates.AssetModernDelegate;
import expo.modules.medialibrary.next.objects.asset.deleters.AssetDeleter;
import expo.modules.medialibrary.next.permissions.MediaStorePermissionsDelegate;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import n7.f;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\"\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096@¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010!R\"\u0010$\u001a\u0010\u0012\f\u0012\n #*\u0004\u0018\u00010\u00060\u00060\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020&8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lexpo/modules/medialibrary/next/objects/asset/factories/AssetModernFactory;", "Lexpo/modules/medialibrary/next/objects/asset/factories/AssetFactory;", "Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetDeleter;", "assetDeleter", "Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate;", "mediaStorePermissionsDelegate", "Landroid/content/Context;", "context", "<init>", "(Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetDeleter;Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate;Landroid/content/Context;)V", "Landroid/net/Uri;", "contentUri", "Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetDelegate;", "createAssetDelegate", "(Landroid/net/Uri;)Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetDelegate;", "filePath", "Lexpo/modules/medialibrary/next/objects/wrappers/RelativePath;", "relativePath", PointerEventHelper.POINTER_TYPE_UNKNOWN, "forceUniqueName", "Lexpo/modules/medialibrary/next/objects/asset/Asset;", "createAssetInternal-7lvfX64", "(Landroid/net/Uri;Ljava/lang/String;ZLn7/f;)Ljava/lang/Object;", "createAssetInternal", "create", "(Landroid/net/Uri;)Lexpo/modules/medialibrary/next/objects/asset/Asset;", "create-BuevYFM", "(Landroid/net/Uri;Ljava/lang/String;Ln7/f;)Ljava/lang/Object;", "Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetDeleter;", "getAssetDeleter", "()Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetDeleter;", "Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate;", "getMediaStorePermissionsDelegate", "()Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate;", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "contextRef", "Ljava/lang/ref/WeakReference;", "Landroid/content/ContentResolver;", "getContentResolver", "()Landroid/content/ContentResolver;", "contentResolver", "expo-media-library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AssetModernFactory implements AssetFactory {
    private final AssetDeleter assetDeleter;
    private final WeakReference<Context> contextRef;
    private final MediaStorePermissionsDelegate mediaStorePermissionsDelegate;

    public AssetModernFactory(AssetDeleter assetDeleter, MediaStorePermissionsDelegate mediaStorePermissionsDelegate, Context context) {
        AbstractC2855l.g(assetDeleter, "assetDeleter");
        AbstractC2855l.g(mediaStorePermissionsDelegate, "mediaStorePermissionsDelegate");
        AbstractC2855l.g(context, "context");
        this.assetDeleter = assetDeleter;
        this.mediaStorePermissionsDelegate = mediaStorePermissionsDelegate;
        this.contextRef = new WeakReference<>(context);
    }

    private final AssetDelegate createAssetDelegate(Uri contentUri) {
        return new AssetModernDelegate(contentUri, this.assetDeleter, this.mediaStorePermissionsDelegate, WeakReferenceExtensionsKt.getOrThrow(this.contextRef));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: createAssetInternal-7lvfX64, reason: not valid java name */
    public final Object m293createAssetInternal7lvfX64(Uri uri, String str, boolean z10, f fVar) {
        return AbstractC1413i.g(C1404d0.b(), new AssetModernFactory$createAssetInternal$2(this, uri, z10, str, null), fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ContentResolver getContentResolver() throws ContentResolverNotObtainedException {
        ContentResolver contentResolver = WeakReferenceExtensionsKt.getOrThrow(this.contextRef).getContentResolver();
        if (contentResolver != null) {
            return contentResolver;
        }
        throw new ContentResolverNotObtainedException(null, 1, null);
    }

    @Override // expo.modules.medialibrary.next.objects.asset.factories.AssetFactory
    public Asset create(Uri contentUri) {
        AbstractC2855l.g(contentUri, "contentUri");
        return new Asset(createAssetDelegate(contentUri));
    }

    @Override // expo.modules.medialibrary.next.objects.asset.factories.AssetFactory
    /* JADX INFO: renamed from: create-BuevYFM */
    public Object mo289createBuevYFM(Uri uri, String str, f fVar) {
        return m293createAssetInternal7lvfX64(uri, str, false, fVar);
    }

    public final AssetDeleter getAssetDeleter() {
        return this.assetDeleter;
    }

    public final MediaStorePermissionsDelegate getMediaStorePermissionsDelegate() {
        return this.mediaStorePermissionsDelegate;
    }
}
