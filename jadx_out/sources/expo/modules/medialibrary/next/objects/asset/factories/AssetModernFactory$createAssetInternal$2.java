package expo.modules.medialibrary.next.objects.asset.factories;

import P8.q;
import R8.N;
import R8.O;
import android.content.ContentResolver;
import android.net.Uri;
import expo.modules.medialibrary.next.exceptions.ContentResolverNotObtainedException;
import expo.modules.medialibrary.next.extensions.resolver.AssetExtensionsKt;
import expo.modules.medialibrary.next.extensions.resolver.TransferExtensionsKt;
import expo.modules.medialibrary.next.objects.asset.Asset;
import expo.modules.medialibrary.next.objects.wrappers.MimeType;
import expo.modules.medialibrary.next.objects.wrappers.RelativePath;
import i7.AbstractC2753p;
import i7.C2735B;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@f(c = "expo.modules.medialibrary.next.objects.asset.factories.AssetModernFactory$createAssetInternal$2", f = "AssetModernFactory.kt", l = {69, 82}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LR8/N;", "Lexpo/modules/medialibrary/next/objects/asset/Asset;", "<anonymous>", "(LR8/N;)Lexpo/modules/medialibrary/next/objects/asset/Asset;"}, k = 3, mv = {2, 1, 0})
final class AssetModernFactory$createAssetInternal$2 extends l implements Function2 {
    final /* synthetic */ Uri $filePath;
    final /* synthetic */ boolean $forceUniqueName;
    final /* synthetic */ String $relativePath;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AssetModernFactory this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AssetModernFactory$createAssetInternal$2(AssetModernFactory assetModernFactory, Uri uri, boolean z10, String str, n7.f fVar) {
        super(2, fVar);
        this.this$0 = assetModernFactory;
        this.$filePath = uri;
        this.$forceUniqueName = z10;
        this.$relativePath = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final n7.f create(Object obj, n7.f fVar) {
        AssetModernFactory$createAssetInternal$2 assetModernFactory$createAssetInternal$2 = new AssetModernFactory$createAssetInternal$2(this.this$0, this.$filePath, this.$forceUniqueName, this.$relativePath, fVar);
        assetModernFactory$createAssetInternal$2.L$0 = obj;
        return assetModernFactory$createAssetInternal$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(N n10, n7.f fVar) {
        return ((AssetModernFactory$createAssetInternal$2) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c4, code lost:
    
        if (r9 == r0) goto L38;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws ContentResolverNotObtainedException, IOException {
        N n10;
        String lastPathSegment;
        Object objE = AbstractC3016b.e();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC2753p.b(obj);
            n10 = (N) this.L$0;
            String type = this.this$0.getContentResolver().getType(this.$filePath);
            String strM297constructorimpl = type != null ? MimeType.m297constructorimpl(type) : MimeType.INSTANCE.m310fromdctPOJs(this.$filePath);
            if (this.$forceUniqueName) {
                lastPathSegment = BuildUniqueDisplayNameKt.buildUniqueDisplayName(this.$filePath);
            } else {
                lastPathSegment = this.$filePath.getLastPathSegment();
                if (lastPathSegment == null) {
                    lastPathSegment = "asset";
                }
            }
            String strM319createwht0CjE$default = this.$relativePath;
            if (strM319createwht0CjE$default == null) {
                strM319createwht0CjE$default = RelativePath.Companion.m319createwht0CjE$default(RelativePath.INSTANCE, strM297constructorimpl, null, 2, null);
            }
            ContentResolver contentResolver = this.this$0.getContentResolver();
            this.L$0 = n10;
            this.label = 1;
            obj = AssetExtensionsKt.m271insertPendingAssetcT81_0k(contentResolver, lastPathSegment, strM297constructorimpl, strM319createwht0CjE$default, this);
            if (obj != objE) {
            }
            return objE;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(obj);
            return (Asset) obj;
        }
        n10 = (N) this.L$0;
        AbstractC2753p.b(obj);
        Uri uri = (Uri) obj;
        try {
            O.d(n10);
            TransferExtensionsKt.copyUriContent(this.this$0.getContentResolver(), this.$filePath, uri);
            O.d(n10);
            AssetExtensionsKt.publishPendingAsset(this.this$0.getContentResolver(), uri);
            return this.this$0.create(uri);
        } catch (IllegalStateException e10) {
            this.this$0.getContentResolver().delete(uri, null, null);
            String message = e10.getMessage();
            if (message == null || !q.O(message, "Failed to build unique file", true) || this.$forceUniqueName) {
                throw e10;
            }
            AssetModernFactory assetModernFactory = this.this$0;
            Uri uri2 = this.$filePath;
            String str = this.$relativePath;
            this.L$0 = null;
            this.label = 2;
            obj = assetModernFactory.m293createAssetInternal7lvfX64(uri2, str, true, this);
        }
    }
}
