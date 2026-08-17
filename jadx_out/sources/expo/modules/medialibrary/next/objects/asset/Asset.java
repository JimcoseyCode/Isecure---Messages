package expo.modules.medialibrary.next.objects.asset;

import R8.AbstractC1413i;
import R8.C1404d0;
import R8.N;
import android.net.Uri;
import androidx.customview.widget.a;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.sharedobjects.SharedObject;
import expo.modules.medialibrary.next.objects.asset.delegates.AssetDelegate;
import expo.modules.medialibrary.next.objects.wrappers.MimeType;
import i7.AbstractC2753p;
import i7.C2735B;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0086@¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0086@¢\u0006\u0004\b\t\u0010\bJ\u0010\u0010\u000b\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u000b\u0010\bJ\u0010\u0010\r\u001a\u00020\fH\u0086@¢\u0006\u0004\b\r\u0010\bJ\u0010\u0010\u000e\u001a\u00020\fH\u0086@¢\u0006\u0004\b\u000e\u0010\bJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0086@¢\u0006\u0004\b\u0010\u0010\bJ\u0010\u0010\u0012\u001a\u00020\u0011H\u0086@¢\u0006\u0004\b\u0012\u0010\bJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0006H\u0086@¢\u0006\u0004\b\u0013\u0010\bJ\u0010\u0010\u0015\u001a\u00020\u0014H\u0086@¢\u0006\u0004\b\u0015\u0010\bJ\u0010\u0010\u0017\u001a\u00020\u0016H\u0086@¢\u0006\u0004\b\u0017\u0010\bJ\u0010\u0010\u001a\u001a\u00020\u0018H\u0086@¢\u0006\u0004\b\u0019\u0010\bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0086@¢\u0006\u0004\b\u001c\u0010\bJ\u0010\u0010\u001e\u001a\u00020\u001dH\u0086@¢\u0006\u0004\b\u001e\u0010\bJ\u0018\u0010$\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001fH\u0086@¢\u0006\u0004\b\"\u0010#J\u0018\u0010&\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001fH\u0086@¢\u0006\u0004\b%\u0010#J\u0010\u0010'\u001a\u00020!H\u0086@¢\u0006\u0004\b'\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010*R\u0011\u0010-\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lexpo/modules/medialibrary/next/objects/asset/Asset;", "Lexpo/modules/kotlin/sharedobjects/SharedObject;", "Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetDelegate;", "assetDelegate", "<init>", "(Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetDelegate;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getCreationTime", "(Ln7/f;)Ljava/lang/Object;", "getDuration", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getFilename", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getHeight", "getWidth", "Lexpo/modules/medialibrary/next/records/Shape;", "getShape", "Lexpo/modules/medialibrary/next/objects/wrappers/MediaType;", "getMediaType", "getModificationTime", "Landroid/net/Uri;", "getUri", "Lexpo/modules/medialibrary/next/records/AssetInfo;", "getInfo", "Lexpo/modules/medialibrary/next/objects/wrappers/MimeType;", "getMimeType-dctPOJs", "getMimeType", "Lexpo/modules/medialibrary/next/records/Location;", "getLocation", "Landroid/os/Bundle;", "getExif", "Lexpo/modules/medialibrary/next/objects/wrappers/RelativePath;", "relativePath", "Li7/B;", "move-dXLngQ8", "(Ljava/lang/String;Ln7/f;)Ljava/lang/Object;", "move", "copy-dXLngQ8", "copy", "delete", "Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetDelegate;", "getAssetDelegate", "()Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetDelegate;", "getContentUri", "()Landroid/net/Uri;", "contentUri", "expo-media-library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Asset extends SharedObject {
    private final AssetDelegate assetDelegate;

    /* JADX INFO: renamed from: expo.modules.medialibrary.next.objects.asset.Asset$delete$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.medialibrary.next.objects.asset.Asset$delete$2", f = "Asset.kt", l = {67}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LR8/N;", "Li7/B;", "<anonymous>", "(LR8/N;)V"}, k = 3, mv = {2, 1, 0})
    static final class AnonymousClass2 extends l implements Function2 {
        int label;

        AnonymousClass2(n7.f fVar) {
            super(2, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            return Asset.this.new AnonymousClass2(fVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, n7.f fVar) {
            return ((AnonymousClass2) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC3016b.e();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC2753p.b(obj);
                AssetDelegate assetDelegate = Asset.this.getAssetDelegate();
                this.label = 1;
                if (assetDelegate.delete(this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC2753p.b(obj);
            }
            return C2735B.f28704a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Asset(AssetDelegate assetDelegate) {
        super(null, 1, 0 == true ? 1 : 0);
        AbstractC2855l.g(assetDelegate, "assetDelegate");
        this.assetDelegate = assetDelegate;
    }

    /* JADX INFO: renamed from: copy-dXLngQ8, reason: not valid java name */
    public final Object m281copydXLngQ8(String str, n7.f fVar) {
        return AbstractC1413i.g(C1404d0.b(), new Asset$copy$2(this, str, null), fVar);
    }

    public final Object delete(n7.f fVar) {
        Object objG = AbstractC1413i.g(C1404d0.b(), new AnonymousClass2(null), fVar);
        return objG == AbstractC3016b.e() ? objG : C2735B.f28704a;
    }

    public final AssetDelegate getAssetDelegate() {
        return this.assetDelegate;
    }

    public final Uri getContentUri() {
        return this.assetDelegate.getContentUri();
    }

    public final Object getCreationTime(n7.f fVar) {
        return this.assetDelegate.getCreationTime(fVar);
    }

    public final Object getDuration(n7.f fVar) {
        return this.assetDelegate.getDuration(fVar);
    }

    public final Object getExif(n7.f fVar) {
        return this.assetDelegate.getExif(fVar);
    }

    public final Object getFilename(n7.f fVar) {
        return this.assetDelegate.getFilename(fVar);
    }

    public final Object getHeight(n7.f fVar) {
        return this.assetDelegate.getHeight(fVar);
    }

    public final Object getInfo(n7.f fVar) {
        return this.assetDelegate.getInfo(fVar);
    }

    public final Object getLocation(n7.f fVar) {
        return this.assetDelegate.getLocation(fVar);
    }

    public final Object getMediaType(n7.f fVar) {
        return this.assetDelegate.getMediaType(fVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: getMimeType-dctPOJs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m282getMimeTypedctPOJs(n7.f fVar) {
        Asset$getMimeType$1 asset$getMimeType$1;
        Object objMo285getMimeTypedctPOJs;
        if (fVar instanceof Asset$getMimeType$1) {
            asset$getMimeType$1 = (Asset$getMimeType$1) fVar;
            int i10 = asset$getMimeType$1.label;
            if ((i10 & a.INVALID_ID) != 0) {
                asset$getMimeType$1.label = i10 - a.INVALID_ID;
            } else {
                asset$getMimeType$1 = new Asset$getMimeType$1(this, fVar);
            }
        }
        Object obj = asset$getMimeType$1.result;
        Object objE = AbstractC3016b.e();
        int i11 = asset$getMimeType$1.label;
        if (i11 == 0) {
            AbstractC2753p.b(obj);
            AssetDelegate assetDelegate = this.assetDelegate;
            asset$getMimeType$1.label = 1;
            objMo285getMimeTypedctPOJs = assetDelegate.mo285getMimeTypedctPOJs(asset$getMimeType$1);
            if (objMo285getMimeTypedctPOJs == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(obj);
            objMo285getMimeTypedctPOJs = ((MimeType) obj).m309unboximpl();
        }
        return (String) objMo285getMimeTypedctPOJs;
    }

    public final Object getModificationTime(n7.f fVar) {
        return this.assetDelegate.getModificationTime(fVar);
    }

    public final Object getShape(n7.f fVar) {
        return this.assetDelegate.getShape(fVar);
    }

    public final Object getUri(n7.f fVar) {
        return this.assetDelegate.getUri(fVar);
    }

    public final Object getWidth(n7.f fVar) {
        return this.assetDelegate.getWidth(fVar);
    }

    /* JADX INFO: renamed from: move-dXLngQ8, reason: not valid java name */
    public final Object m283movedXLngQ8(String str, n7.f fVar) {
        Object objG = AbstractC1413i.g(C1404d0.b(), new Asset$move$2(this, str, null), fVar);
        return objG == AbstractC3016b.e() ? objG : C2735B.f28704a;
    }
}
