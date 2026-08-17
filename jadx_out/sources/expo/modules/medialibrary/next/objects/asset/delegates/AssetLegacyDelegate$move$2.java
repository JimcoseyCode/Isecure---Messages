package expo.modules.medialibrary.next.objects.asset.delegates;

import R8.N;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import expo.modules.kotlin.exception.Exceptions;
import expo.modules.medialibrary.next.exceptions.AssetCouldNotBeCreated;
import expo.modules.medialibrary.next.exceptions.AssetPropertyNotFoundException;
import expo.modules.medialibrary.next.exceptions.ContentResolverNotObtainedException;
import expo.modules.medialibrary.next.exceptions.PermissionException;
import expo.modules.medialibrary.next.extensions.ContextExtensionsKt;
import expo.modules.medialibrary.next.extensions.FileExtensionsKt;
import expo.modules.medialibrary.next.extensions.WeakReferenceExtensionsKt;
import expo.modules.medialibrary.next.extensions.resolver.AssetExtensionsKt;
import expo.modules.medialibrary.next.objects.wrappers.RelativePath;
import i7.AbstractC2753p;
import i7.C2735B;
import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@f(c = "expo.modules.medialibrary.next.objects.asset.delegates.AssetLegacyDelegate$move$2", f = "AssetLegacyDelegate.kt", l = {185, 189}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LR8/N;", "Li7/B;", "<anonymous>", "(LR8/N;)V"}, k = 3, mv = {2, 1, 0})
final class AssetLegacyDelegate$move$2 extends l implements Function2 {
    final /* synthetic */ String $relativePath;
    int label;
    final /* synthetic */ AssetLegacyDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AssetLegacyDelegate$move$2(AssetLegacyDelegate assetLegacyDelegate, String str, n7.f fVar) {
        super(2, fVar);
        this.this$0 = assetLegacyDelegate;
        this.$relativePath = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final n7.f create(Object obj, n7.f fVar) {
        return new AssetLegacyDelegate$move$2(this.this$0, this.$relativePath, fVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(N n10, n7.f fVar) {
        return ((AssetLegacyDelegate$move$2) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007a, code lost:
    
        if (r7 == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws PermissionException, AssetPropertyNotFoundException, ContentResolverNotObtainedException, IOException, AssetCouldNotBeCreated, Exceptions.ReactContextLost {
        Object objE = AbstractC3016b.e();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC2753p.b(obj);
            this.this$0.getSystemPermissionsDelegate().requireWritePermissions();
            ContentResolver contentResolver = this.this$0.getContentResolver();
            Uri contentUri = this.this$0.getContentUri();
            this.label = 1;
            obj = AssetExtensionsKt.queryAssetData(contentResolver, contentUri, this);
            if (obj != objE) {
            }
            return objE;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(obj);
            Uri uri = (Uri) ((Pair) obj).getSecond();
            AssetLegacyDelegate assetLegacyDelegate = this.this$0;
            if (uri == null) {
                throw new AssetCouldNotBeCreated("Could not create a new asset while moving the old one", null, 2, null);
            }
            assetLegacyDelegate.contentUri = uri;
            return C2735B.f28704a;
        }
        AbstractC2753p.b(obj);
        String str = (String) obj;
        if (str == null) {
            throw new AssetPropertyNotFoundException("Asset path", null, 2, null);
        }
        File fileSafeMove = FileExtensionsKt.safeMove(new File(str), new File(RelativePath.m316toFilePathimpl(this.$relativePath)));
        AssetExtensionsKt.deleteBy(this.this$0.getContentResolver(), str);
        Context orThrow = WeakReferenceExtensionsKt.getOrThrow(this.this$0.contextRef);
        String path = fileSafeMove.getPath();
        AbstractC2855l.f(path, "getPath(...)");
        this.label = 2;
        obj = ContextExtensionsKt.scanFile(orThrow, path, null, this);
    }
}
