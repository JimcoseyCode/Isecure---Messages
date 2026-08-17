package expo.modules.medialibrary.next.objects.asset.deleters;

import R8.AbstractC1413i;
import R8.C1404d0;
import R8.N;
import android.net.Uri;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.views.text.TextAttributeProps;
import expo.modules.medialibrary.next.permissions.MediaStorePermissionsDelegate;
import i7.AbstractC2753p;
import i7.C2735B;
import j7.AbstractC2800q;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0096@¢\u0006\u0004\b\t\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetModernDeleter;", "Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetDeleter;", "Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate;", "mediaStorePermissionsDelegate", "<init>", "(Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate;)V", "Landroid/net/Uri;", "contentUri", "Li7/B;", "delete", "(Landroid/net/Uri;Ln7/f;)Ljava/lang/Object;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "contentUris", "(Ljava/util/List;Ln7/f;)Ljava/lang/Object;", "Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate;", "getMediaStorePermissionsDelegate", "()Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate;", "expo-media-library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AssetModernDeleter implements AssetDeleter {
    private final MediaStorePermissionsDelegate mediaStorePermissionsDelegate;

    /* JADX INFO: renamed from: expo.modules.medialibrary.next.objects.asset.deleters.AssetModernDeleter$delete$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.medialibrary.next.objects.asset.deleters.AssetModernDeleter$delete$2", f = "AssetModernDeleter.kt", l = {TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LR8/N;", "Li7/B;", "<anonymous>", "(LR8/N;)V"}, k = 3, mv = {2, 1, 0})
    static final class AnonymousClass2 extends l implements Function2 {
        final /* synthetic */ Uri $contentUri;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Uri uri, n7.f fVar) {
            super(2, fVar);
            this.$contentUri = uri;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            return AssetModernDeleter.this.new AnonymousClass2(this.$contentUri, fVar);
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
                MediaStorePermissionsDelegate mediaStorePermissionsDelegate = AssetModernDeleter.this.getMediaStorePermissionsDelegate();
                List<? extends Uri> listE = AbstractC2800q.e(this.$contentUri);
                this.label = 1;
                if (mediaStorePermissionsDelegate.launchMediaStoreDeleteRequest(listE, this) == objE) {
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

    /* JADX INFO: renamed from: expo.modules.medialibrary.next.objects.asset.deleters.AssetModernDeleter$delete$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.medialibrary.next.objects.asset.deleters.AssetModernDeleter$delete$4", f = "AssetModernDeleter.kt", l = {TextAttributeProps.TA_KEY_IS_HIGHLIGHTED}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LR8/N;", "Li7/B;", "<anonymous>", "(LR8/N;)V"}, k = 3, mv = {2, 1, 0})
    static final class AnonymousClass4 extends l implements Function2 {
        final /* synthetic */ List<Uri> $contentUris;
        int label;
        final /* synthetic */ AssetModernDeleter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass4(List<? extends Uri> list, AssetModernDeleter assetModernDeleter, n7.f fVar) {
            super(2, fVar);
            this.$contentUris = list;
            this.this$0 = assetModernDeleter;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            return new AnonymousClass4(this.$contentUris, this.this$0, fVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, n7.f fVar) {
            return ((AnonymousClass4) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC3016b.e();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC2753p.b(obj);
                if (this.$contentUris.isEmpty()) {
                    return C2735B.f28704a;
                }
                MediaStorePermissionsDelegate mediaStorePermissionsDelegate = this.this$0.getMediaStorePermissionsDelegate();
                List<Uri> list = this.$contentUris;
                this.label = 1;
                if (mediaStorePermissionsDelegate.launchMediaStoreDeleteRequest(list, this) == objE) {
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

    public AssetModernDeleter(MediaStorePermissionsDelegate mediaStorePermissionsDelegate) {
        AbstractC2855l.g(mediaStorePermissionsDelegate, "mediaStorePermissionsDelegate");
        this.mediaStorePermissionsDelegate = mediaStorePermissionsDelegate;
    }

    @Override // expo.modules.medialibrary.next.objects.asset.deleters.AssetDeleter
    public Object delete(Uri uri, n7.f fVar) {
        Object objG = AbstractC1413i.g(C1404d0.b(), new AnonymousClass2(uri, null), fVar);
        return objG == AbstractC3016b.e() ? objG : C2735B.f28704a;
    }

    public final MediaStorePermissionsDelegate getMediaStorePermissionsDelegate() {
        return this.mediaStorePermissionsDelegate;
    }

    @Override // expo.modules.medialibrary.next.objects.asset.deleters.AssetDeleter
    public Object delete(List<? extends Uri> list, n7.f fVar) {
        Object objG = AbstractC1413i.g(C1404d0.b(), new AnonymousClass4(list, this, null), fVar);
        return objG == AbstractC3016b.e() ? objG : C2735B.f28704a;
    }
}
