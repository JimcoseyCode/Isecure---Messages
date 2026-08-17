package expo.modules.medialibrary.next.objects.asset.deleters;

import R8.AbstractC1407f;
import R8.AbstractC1413i;
import R8.AbstractC1417k;
import R8.C1404d0;
import R8.N;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.medialibrary.AssetFileException;
import expo.modules.medialibrary.next.exceptions.AssetPropertyNotFoundException;
import expo.modules.medialibrary.next.exceptions.ContentResolverNotObtainedException;
import expo.modules.medialibrary.next.exceptions.PermissionException;
import expo.modules.medialibrary.next.extensions.WeakReferenceExtensionsKt;
import expo.modules.medialibrary.next.extensions.resolver.AssetExtensionsKt;
import expo.modules.medialibrary.next.permissions.SystemPermissionsDelegate;
import i7.AbstractC2753p;
import i7.C2735B;
import j7.AbstractC2800q;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\rH\u0096@¢\u0006\u0004\b\u000b\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\u0015\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00040\u00040\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetLegacyDeleter;", "Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetDeleter;", "Lexpo/modules/medialibrary/next/permissions/SystemPermissionsDelegate;", "systemPermissionsDelegate", "Landroid/content/Context;", "context", "<init>", "(Lexpo/modules/medialibrary/next/permissions/SystemPermissionsDelegate;Landroid/content/Context;)V", "Landroid/net/Uri;", "contentUri", "Li7/B;", "delete", "(Landroid/net/Uri;Ln7/f;)Ljava/lang/Object;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "contentUris", "(Ljava/util/List;Ln7/f;)Ljava/lang/Object;", "Lexpo/modules/medialibrary/next/permissions/SystemPermissionsDelegate;", "getSystemPermissionsDelegate", "()Lexpo/modules/medialibrary/next/permissions/SystemPermissionsDelegate;", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "contextRef", "Ljava/lang/ref/WeakReference;", "Landroid/content/ContentResolver;", "getContentResolver", "()Landroid/content/ContentResolver;", "contentResolver", "expo-media-library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AssetLegacyDeleter implements AssetDeleter {
    private final WeakReference<Context> contextRef;
    private final SystemPermissionsDelegate systemPermissionsDelegate;

    /* JADX INFO: renamed from: expo.modules.medialibrary.next.objects.asset.deleters.AssetLegacyDeleter$delete$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.medialibrary.next.objects.asset.deleters.AssetLegacyDeleter$delete$2", f = "AssetLegacyDeleter.kt", l = {34}, m = "invokeSuspend")
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
            return AssetLegacyDeleter.this.new AnonymousClass2(this.$contentUri, fVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, n7.f fVar) {
            return ((AnonymousClass2) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws PermissionException, AssetPropertyNotFoundException, ContentResolverNotObtainedException, AssetFileException {
            Object objE = AbstractC3016b.e();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC2753p.b(obj);
                AssetLegacyDeleter.this.getSystemPermissionsDelegate().requireWritePermissions();
                ContentResolver contentResolver = AssetLegacyDeleter.this.getContentResolver();
                Uri uri = this.$contentUri;
                this.label = 1;
                obj = AssetExtensionsKt.queryAssetData(contentResolver, uri, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC2753p.b(obj);
            }
            String str = (String) obj;
            if (str == null) {
                throw new AssetPropertyNotFoundException("Uri", null, 2, null);
            }
            if (!new File(str).delete()) {
                throw new AssetFileException("Could not delete a file.");
            }
            AssetLegacyDeleter.this.getContentResolver().delete(this.$contentUri, null, null);
            return C2735B.f28704a;
        }
    }

    /* JADX INFO: renamed from: expo.modules.medialibrary.next.objects.asset.deleters.AssetLegacyDeleter$delete$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.medialibrary.next.objects.asset.deleters.AssetLegacyDeleter$delete$4", f = "AssetLegacyDeleter.kt", l = {49}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LR8/N;", "Li7/B;", "<anonymous>", "(LR8/N;)V"}, k = 3, mv = {2, 1, 0})
    static final class AnonymousClass4 extends l implements Function2 {
        final /* synthetic */ List<Uri> $contentUris;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AssetLegacyDeleter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass4(List<? extends Uri> list, AssetLegacyDeleter assetLegacyDeleter, n7.f fVar) {
            super(2, fVar);
            this.$contentUris = list;
            this.this$0 = assetLegacyDeleter;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$contentUris, this.this$0, fVar);
            anonymousClass4.L$0 = obj;
            return anonymousClass4;
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
                N n10 = (N) this.L$0;
                List<Uri> list = this.$contentUris;
                AssetLegacyDeleter assetLegacyDeleter = this.this$0;
                ArrayList arrayList = new ArrayList(AbstractC2800q.u(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(AbstractC1417k.b(n10, null, null, new AssetLegacyDeleter$delete$4$1$1(assetLegacyDeleter, (Uri) it.next(), null), 3, null));
                }
                this.label = 1;
                if (AbstractC1407f.a(arrayList, this) == objE) {
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

    public AssetLegacyDeleter(SystemPermissionsDelegate systemPermissionsDelegate, Context context) {
        AbstractC2855l.g(systemPermissionsDelegate, "systemPermissionsDelegate");
        AbstractC2855l.g(context, "context");
        this.systemPermissionsDelegate = systemPermissionsDelegate;
        this.contextRef = new WeakReference<>(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ContentResolver getContentResolver() throws ContentResolverNotObtainedException {
        ContentResolver contentResolver = WeakReferenceExtensionsKt.getOrThrow(this.contextRef).getContentResolver();
        if (contentResolver != null) {
            return contentResolver;
        }
        throw new ContentResolverNotObtainedException(null, 1, null);
    }

    @Override // expo.modules.medialibrary.next.objects.asset.deleters.AssetDeleter
    public Object delete(Uri uri, n7.f fVar) {
        Object objG = AbstractC1413i.g(C1404d0.b(), new AnonymousClass2(uri, null), fVar);
        return objG == AbstractC3016b.e() ? objG : C2735B.f28704a;
    }

    public final SystemPermissionsDelegate getSystemPermissionsDelegate() {
        return this.systemPermissionsDelegate;
    }

    @Override // expo.modules.medialibrary.next.objects.asset.deleters.AssetDeleter
    public Object delete(List<? extends Uri> list, n7.f fVar) {
        Object objG = AbstractC1413i.g(C1404d0.b(), new AnonymousClass4(list, this, null), fVar);
        return objG == AbstractC3016b.e() ? objG : C2735B.f28704a;
    }
}
