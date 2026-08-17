package expo.modules.medialibrary.next.objects.asset.delegates;

import P8.q;
import R8.N;
import R8.O;
import android.content.ContentResolver;
import android.net.Uri;
import expo.modules.medialibrary.next.exceptions.AssetPropertyNotFoundException;
import expo.modules.medialibrary.next.exceptions.ContentResolverNotObtainedException;
import expo.modules.medialibrary.next.extensions.WeakReferenceExtensionsKt;
import expo.modules.medialibrary.next.extensions.resolver.AssetExtensionsKt;
import expo.modules.medialibrary.next.extensions.resolver.TransferExtensionsKt;
import expo.modules.medialibrary.next.objects.asset.Asset;
import expo.modules.medialibrary.next.objects.asset.factories.BuildUniqueDisplayNameKt;
import expo.modules.medialibrary.next.objects.wrappers.MimeType;
import i7.AbstractC2753p;
import i7.C2735B;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@f(c = "expo.modules.medialibrary.next.objects.asset.delegates.AssetModernDelegate$copyInternal$2", f = "AssetModernDelegate.kt", l = {193, 195, 199, 197, 220}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LR8/N;", "Lexpo/modules/medialibrary/next/objects/asset/Asset;", "<anonymous>", "(LR8/N;)Lexpo/modules/medialibrary/next/objects/asset/Asset;"}, k = 3, mv = {2, 1, 0})
final class AssetModernDelegate$copyInternal$2 extends l implements Function2 {
    final /* synthetic */ boolean $forceUniqueName;
    final /* synthetic */ String $relativePath;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ AssetModernDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AssetModernDelegate$copyInternal$2(boolean z10, AssetModernDelegate assetModernDelegate, String str, n7.f fVar) {
        super(2, fVar);
        this.$forceUniqueName = z10;
        this.this$0 = assetModernDelegate;
        this.$relativePath = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final n7.f create(Object obj, n7.f fVar) {
        AssetModernDelegate$copyInternal$2 assetModernDelegate$copyInternal$2 = new AssetModernDelegate$copyInternal$2(this.$forceUniqueName, this.this$0, this.$relativePath, fVar);
        assetModernDelegate$copyInternal$2.L$0 = obj;
        return assetModernDelegate$copyInternal$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(N n10, n7.f fVar) {
        return ((AssetModernDelegate$copyInternal$2) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006b, code lost:
    
        if (r11 == r0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0083, code lost:
    
        if (r11 == r0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x012a, code lost:
    
        if (r11 == r0) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c0  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws AssetPropertyNotFoundException, ContentResolverNotObtainedException, IOException {
        N n10;
        String strBuildUniqueDisplayName;
        String str;
        N n11;
        Object objM309unboximpl;
        ContentResolver contentResolver;
        N n12;
        Uri uri;
        Object objE = AbstractC3016b.e();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC2753p.b(obj);
            n10 = (N) this.L$0;
            if (this.$forceUniqueName) {
                AssetModernDelegate assetModernDelegate = this.this$0;
                this.L$0 = n10;
                this.label = 1;
                obj = assetModernDelegate.getUri(this);
            } else {
                AssetModernDelegate assetModernDelegate2 = this.this$0;
                this.L$0 = n10;
                this.label = 2;
                obj = assetModernDelegate2.getUri(this);
            }
            return objE;
        }
        if (i10 == 1) {
            n10 = (N) this.L$0;
            AbstractC2753p.b(obj);
            strBuildUniqueDisplayName = BuildUniqueDisplayNameKt.buildUniqueDisplayName((Uri) obj);
        } else if (i10 == 2) {
            n10 = (N) this.L$0;
            AbstractC2753p.b(obj);
            strBuildUniqueDisplayName = ((Uri) obj).toString();
            AbstractC2855l.d(strBuildUniqueDisplayName);
        } else {
            if (i10 == 3) {
                str = (String) this.L$2;
                contentResolver = (ContentResolver) this.L$1;
                n11 = (N) this.L$0;
                AbstractC2753p.b(obj);
                objM309unboximpl = ((MimeType) obj).m309unboximpl();
                String str2 = this.$relativePath;
                this.L$0 = n11;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 4;
                obj = AssetExtensionsKt.m271insertPendingAssetcT81_0k(contentResolver, str, (String) objM309unboximpl, str2, this);
                if (obj != objE) {
                    n12 = n11;
                    uri = (Uri) obj;
                    O.d(n12);
                    TransferExtensionsKt.copyUriContent(this.this$0.getContentResolver(), this.this$0.getContentUri(), uri);
                    O.d(n12);
                    AssetExtensionsKt.publishPendingAsset(this.this$0.getContentResolver(), uri);
                    return new Asset(new AssetModernDelegate(uri, this.this$0.getAssetDeleter(), this.this$0.getMediaStorePermissionsDelegate(), WeakReferenceExtensionsKt.getOrThrow(this.this$0.contextRef)));
                }
                return objE;
            }
            if (i10 != 4) {
                if (i10 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC2753p.b(obj);
                return (Asset) obj;
            }
            n12 = (N) this.L$0;
            AbstractC2753p.b(obj);
            uri = (Uri) obj;
            try {
                O.d(n12);
                TransferExtensionsKt.copyUriContent(this.this$0.getContentResolver(), this.this$0.getContentUri(), uri);
                O.d(n12);
                AssetExtensionsKt.publishPendingAsset(this.this$0.getContentResolver(), uri);
                return new Asset(new AssetModernDelegate(uri, this.this$0.getAssetDeleter(), this.this$0.getMediaStorePermissionsDelegate(), WeakReferenceExtensionsKt.getOrThrow(this.this$0.contextRef)));
            } catch (IllegalStateException e10) {
                this.this$0.getContentResolver().delete(uri, null, null);
                String message = e10.getMessage();
                if (message == null || !q.O(message, "Failed to build unique file", true) || this.$forceUniqueName) {
                    throw e10;
                }
                AssetModernDelegate assetModernDelegate3 = this.this$0;
                String str3 = this.$relativePath;
                this.L$0 = null;
                this.label = 5;
                obj = assetModernDelegate3.m288copyInternalvFDBtY(str3, true, this);
            }
        }
        N n13 = n10;
        str = strBuildUniqueDisplayName;
        ContentResolver contentResolver2 = this.this$0.getContentResolver();
        AssetModernDelegate assetModernDelegate4 = this.this$0;
        this.L$0 = n13;
        this.L$1 = contentResolver2;
        this.L$2 = str;
        this.label = 3;
        Object objMo285getMimeTypedctPOJs = assetModernDelegate4.mo285getMimeTypedctPOJs(this);
        if (objMo285getMimeTypedctPOJs != objE) {
            n11 = n13;
            objM309unboximpl = objMo285getMimeTypedctPOJs;
            contentResolver = contentResolver2;
            String str22 = this.$relativePath;
            this.L$0 = n11;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 4;
            obj = AssetExtensionsKt.m271insertPendingAssetcT81_0k(contentResolver, str, (String) objM309unboximpl, str22, this);
            if (obj != objE) {
            }
        }
        return objE;
    }
}
