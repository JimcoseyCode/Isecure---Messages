package expo.modules.medialibrary.next.extensions.resolver;

import R8.N;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import expo.modules.medialibrary.next.exceptions.AssetCouldNotBeCreated;
import expo.modules.medialibrary.next.objects.wrappers.MimeType;
import i7.AbstractC2753p;
import i7.C2735B;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@f(c = "expo.modules.medialibrary.next.extensions.resolver.AssetExtensionsKt$insertPendingAsset$2", f = "AssetExtensions.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LR8/N;", "Landroid/net/Uri;", "<anonymous>", "(LR8/N;)Landroid/net/Uri;"}, k = 3, mv = {2, 1, 0})
final class AssetExtensionsKt$insertPendingAsset$2 extends l implements Function2 {
    final /* synthetic */ String $displayName;
    final /* synthetic */ String $mimeType;
    final /* synthetic */ String $relativePath;
    final /* synthetic */ ContentResolver $this_insertPendingAsset;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AssetExtensionsKt$insertPendingAsset$2(String str, ContentResolver contentResolver, String str2, String str3, n7.f fVar) {
        super(2, fVar);
        this.$mimeType = str;
        this.$this_insertPendingAsset = contentResolver;
        this.$displayName = str2;
        this.$relativePath = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final n7.f create(Object obj, n7.f fVar) {
        return new AssetExtensionsKt$insertPendingAsset$2(this.$mimeType, this.$this_insertPendingAsset, this.$displayName, this.$relativePath, fVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(N n10, n7.f fVar) {
        return ((AssetExtensionsKt$insertPendingAsset$2) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws AssetCouldNotBeCreated {
        AbstractC3016b.e();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC2753p.b(obj);
        ContentValues contentValues = new ContentValues();
        String str = this.$displayName;
        String str2 = this.$mimeType;
        String str3 = this.$relativePath;
        contentValues.put("_display_name", str);
        contentValues.put("mime_type", str2);
        contentValues.put("relative_path", str3);
        contentValues.put("is_pending", b.c(1));
        Uri uriInsert = this.$this_insertPendingAsset.insert(MimeType.m307mediaCollectionUriimpl(this.$mimeType), contentValues);
        if (uriInsert != null) {
            return uriInsert;
        }
        throw new AssetCouldNotBeCreated("Failed to create asset: contentResolver.insert() returned null.", null, 2, null);
    }
}
