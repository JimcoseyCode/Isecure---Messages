package expo.modules.medialibrary.next.objects.asset.delegates;

import R8.AbstractC1413i;
import R8.C1404d0;
import R8.N;
import R8.O;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.medialibrary.next.exceptions.AssetPropertyNotFoundException;
import expo.modules.medialibrary.next.exceptions.ContentResolverNotObtainedException;
import expo.modules.medialibrary.next.exceptions.PermissionException;
import expo.modules.medialibrary.next.extensions.WeakReferenceExtensionsKt;
import expo.modules.medialibrary.next.extensions.resolver.AssetExtensionsKt;
import expo.modules.medialibrary.next.extensions.resolver.AssetMediaStoreItem;
import expo.modules.medialibrary.next.objects.asset.ExifTagsKt;
import expo.modules.medialibrary.next.objects.asset.deleters.AssetDeleter;
import expo.modules.medialibrary.next.objects.wrappers.MediaType;
import expo.modules.medialibrary.next.objects.wrappers.MimeType;
import expo.modules.medialibrary.next.permissions.SystemPermissionsDelegate;
import expo.modules.medialibrary.next.records.AssetInfo;
import expo.modules.medialibrary.next.records.Location;
import expo.modules.medialibrary.next.records.Shape;
import i7.AbstractC2746i;
import i7.AbstractC2753p;
import i7.C2735B;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import o7.AbstractC3016b;
import t7.AbstractC3376c;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\fH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0096@¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u0011\u0010\u000eJ\u0010\u0010\u0013\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0013\u0010\u000eJ\u0010\u0010\u0014\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0014\u0010\u000eJ\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096@¢\u0006\u0004\b\u0016\u0010\u000eJ\u0010\u0010\u0018\u001a\u00020\u0017H\u0096@¢\u0006\u0004\b\u0018\u0010\u000eJ\u0012\u0010\u0019\u001a\u0004\u0018\u00010\fH\u0096@¢\u0006\u0004\b\u0019\u0010\u000eJ\u0010\u0010\u001a\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u001a\u0010\u000eJ\u0010\u0010\u001c\u001a\u00020\u001bH\u0096@¢\u0006\u0004\b\u001c\u0010\u000eJ\u0010\u0010\u001f\u001a\u00020\u001dH\u0096@¢\u0006\u0004\b\u001e\u0010\u000eJ\u0012\u0010!\u001a\u0004\u0018\u00010 H\u0096@¢\u0006\u0004\b!\u0010\u000eJ\u0010\u0010#\u001a\u00020\"H\u0096@¢\u0006\u0004\b#\u0010\u000eJ\u0010\u0010%\u001a\u00020$H\u0096@¢\u0006\u0004\b%\u0010\u000eJ\u0018\u0010*\u001a\u00020$2\u0006\u0010'\u001a\u00020&H\u0096@¢\u0006\u0004\b(\u0010)J\u0018\u0010-\u001a\u00020+2\u0006\u0010'\u001a\u00020&H\u0096@¢\u0006\u0004\b,\u0010)R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b2\u00103R\"\u00106\u001a\u0010\u0012\f\u0012\n 5*\u0004\u0018\u00010\b0\b048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R$\u0010\u0003\u001a\u00020\u00022\u0006\u00108\u001a\u00020\u00028\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\u0003\u00109\u001a\u0004\b:\u0010;R\u001b\u0010A\u001a\u00020<8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0014\u0010E\u001a\u00020B8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bC\u0010D¨\u0006F"}, d2 = {"Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;", "Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetDelegate;", "Landroid/net/Uri;", "contentUri", "Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetDeleter;", "assetDeleter", "Lexpo/modules/medialibrary/next/permissions/SystemPermissionsDelegate;", "systemPermissionsDelegate", "Landroid/content/Context;", "context", "<init>", "(Landroid/net/Uri;Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetDeleter;Lexpo/modules/medialibrary/next/permissions/SystemPermissionsDelegate;Landroid/content/Context;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getCreationTime", "(Ln7/f;)Ljava/lang/Object;", "getDuration", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getFilename", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getHeight", "getWidth", "Lexpo/modules/medialibrary/next/records/Shape;", "getShape", "Lexpo/modules/medialibrary/next/objects/wrappers/MediaType;", "getMediaType", "getModificationTime", "getUri", "Lexpo/modules/medialibrary/next/records/AssetInfo;", "getInfo", "Lexpo/modules/medialibrary/next/objects/wrappers/MimeType;", "getMimeType-dctPOJs", "getMimeType", "Lexpo/modules/medialibrary/next/records/Location;", "getLocation", "Landroid/os/Bundle;", "getExif", "Li7/B;", "delete", "Lexpo/modules/medialibrary/next/objects/wrappers/RelativePath;", "relativePath", "move-dXLngQ8", "(Ljava/lang/String;Ln7/f;)Ljava/lang/Object;", "move", "Lexpo/modules/medialibrary/next/objects/asset/Asset;", "copy-dXLngQ8", "copy", "Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetDeleter;", "getAssetDeleter", "()Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetDeleter;", "Lexpo/modules/medialibrary/next/permissions/SystemPermissionsDelegate;", "getSystemPermissionsDelegate", "()Lexpo/modules/medialibrary/next/permissions/SystemPermissionsDelegate;", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "contextRef", "Ljava/lang/ref/WeakReference;", "value", "Landroid/net/Uri;", "getContentUri", "()Landroid/net/Uri;", "Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter;", "mediaStoreToAssetAdapter$delegate", "Lkotlin/Lazy;", "getMediaStoreToAssetAdapter", "()Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter;", "mediaStoreToAssetAdapter", "Landroid/content/ContentResolver;", "getContentResolver", "()Landroid/content/ContentResolver;", "contentResolver", "expo-media-library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AssetLegacyDelegate implements AssetDelegate {
    private final AssetDeleter assetDeleter;
    private Uri contentUri;
    private final WeakReference<Context> contextRef;

    /* JADX INFO: renamed from: mediaStoreToAssetAdapter$delegate, reason: from kotlin metadata */
    private final Lazy mediaStoreToAssetAdapter;
    private final SystemPermissionsDelegate systemPermissionsDelegate;

    /* JADX INFO: renamed from: expo.modules.medialibrary.next.objects.asset.delegates.AssetLegacyDelegate$delete$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.medialibrary.next.objects.asset.delegates.AssetLegacyDelegate$delete$2", f = "AssetLegacyDelegate.kt", l = {180}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LR8/N;", "Li7/B;", "<anonymous>", "(LR8/N;)V"}, k = 3, mv = {2, 1, 0})
    static final class AnonymousClass2 extends l implements Function2 {
        int label;

        AnonymousClass2(n7.f fVar) {
            super(2, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            return AssetLegacyDelegate.this.new AnonymousClass2(fVar);
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
                AssetDeleter assetDeleter = AssetLegacyDelegate.this.getAssetDeleter();
                Uri contentUri = AssetLegacyDelegate.this.getContentUri();
                this.label = 1;
                if (assetDeleter.delete(contentUri, this) == objE) {
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

    /* JADX INFO: renamed from: expo.modules.medialibrary.next.objects.asset.delegates.AssetLegacyDelegate$getCreationTime$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.medialibrary.next.objects.asset.delegates.AssetLegacyDelegate", f = "AssetLegacyDelegate.kt", l = {70}, m = "getCreationTime")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(n7.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= androidx.customview.widget.a.INVALID_ID;
            return AssetLegacyDelegate.this.getCreationTime(this);
        }
    }

    /* JADX INFO: renamed from: expo.modules.medialibrary.next.objects.asset.delegates.AssetLegacyDelegate$getDuration$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.medialibrary.next.objects.asset.delegates.AssetLegacyDelegate", f = "AssetLegacyDelegate.kt", l = {75, 78}, m = "getDuration")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class C25421 extends kotlin.coroutines.jvm.internal.d {
        int label;
        /* synthetic */ Object result;

        C25421(n7.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= androidx.customview.widget.a.INVALID_ID;
            return AssetLegacyDelegate.this.getDuration(this);
        }
    }

    /* JADX INFO: renamed from: expo.modules.medialibrary.next.objects.asset.delegates.AssetLegacyDelegate$getExif$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.medialibrary.next.objects.asset.delegates.AssetLegacyDelegate$getExif$2", f = "AssetLegacyDelegate.kt", l = {159}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LR8/N;", "Landroid/os/Bundle;", "<anonymous>", "(LR8/N;)Landroid/os/Bundle;"}, k = 3, mv = {2, 1, 0})
    static final class C25432 extends l implements Function2 {
        private /* synthetic */ Object L$0;
        int label;

        C25432(n7.f fVar) {
            super(2, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            C25432 c25432 = AssetLegacyDelegate.this.new C25432(fVar);
            c25432.L$0 = obj;
            return c25432;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, n7.f fVar) {
            return ((C25432) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws PermissionException, IOException {
            N n10;
            Object objE = AbstractC3016b.e();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC2753p.b(obj);
                N n11 = (N) this.L$0;
                AssetLegacyDelegate.this.getSystemPermissionsDelegate().requireReadPermissions();
                AssetLegacyDelegate assetLegacyDelegate = AssetLegacyDelegate.this;
                this.L$0 = n11;
                this.label = 1;
                Object mediaType = assetLegacyDelegate.getMediaType(this);
                if (mediaType == objE) {
                    return objE;
                }
                n10 = n11;
                obj = mediaType;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                n10 = (N) this.L$0;
                AbstractC2753p.b(obj);
            }
            if (obj != MediaType.IMAGE) {
                return new Bundle();
            }
            Bundle bundle = new Bundle();
            InputStream inputStreamOpenInputStream = AssetLegacyDelegate.this.getContentResolver().openInputStream(AssetLegacyDelegate.this.getContentUri());
            if (inputStreamOpenInputStream == null) {
                return bundle;
            }
            try {
                O.d(n10);
                X0.a aVar = new X0.a(inputStreamOpenInputStream);
                for (String[] strArr : ExifTagsKt.getEXIF_TAGS()) {
                    String str = strArr[0];
                    String str2 = strArr[1];
                    if (aVar.k(str2) != null) {
                        int iHashCode = str.hashCode();
                        if (iHashCode != -1325958191) {
                            if (iHashCode != -891985903) {
                                if (iHashCode == 104431 && str.equals("int")) {
                                    bundle.putInt(str2, aVar.m(str2, 0));
                                }
                            } else if (str.equals("string")) {
                                bundle.putString(str2, aVar.k(str2));
                            }
                        } else if (str.equals("double")) {
                            bundle.putDouble(str2, aVar.l(str2, 0.0d));
                        }
                    }
                }
                C2735B c2735b = C2735B.f28704a;
                AbstractC3376c.a(inputStreamOpenInputStream, null);
                return bundle;
            } finally {
            }
        }
    }

    /* JADX INFO: renamed from: expo.modules.medialibrary.next.objects.asset.delegates.AssetLegacyDelegate$getFilename$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.medialibrary.next.objects.asset.delegates.AssetLegacyDelegate", f = "AssetLegacyDelegate.kt", l = {83}, m = "getFilename")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class C25441 extends kotlin.coroutines.jvm.internal.d {
        int label;
        /* synthetic */ Object result;

        C25441(n7.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= androidx.customview.widget.a.INVALID_ID;
            return AssetLegacyDelegate.this.getFilename(this);
        }
    }

    /* JADX INFO: renamed from: expo.modules.medialibrary.next.objects.asset.delegates.AssetLegacyDelegate$getHeight$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.medialibrary.next.objects.asset.delegates.AssetLegacyDelegate", f = "AssetLegacyDelegate.kt", l = {87, 88}, m = "getHeight")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class C25451 extends kotlin.coroutines.jvm.internal.d {
        int label;
        /* synthetic */ Object result;

        C25451(n7.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= androidx.customview.widget.a.INVALID_ID;
            return AssetLegacyDelegate.this.getHeight(this);
        }
    }

    /* JADX INFO: renamed from: expo.modules.medialibrary.next.objects.asset.delegates.AssetLegacyDelegate$getInfo$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.medialibrary.next.objects.asset.delegates.AssetLegacyDelegate", f = "AssetLegacyDelegate.kt", l = {121, 123, 124, 125}, m = "getInfo")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class C25461 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C25461(n7.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= androidx.customview.widget.a.INVALID_ID;
            return AssetLegacyDelegate.this.getInfo(this);
        }
    }

    /* JADX INFO: renamed from: expo.modules.medialibrary.next.objects.asset.delegates.AssetLegacyDelegate$getModificationTime$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.medialibrary.next.objects.asset.delegates.AssetLegacyDelegate", f = "AssetLegacyDelegate.kt", l = {108}, m = "getModificationTime")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class C25471 extends kotlin.coroutines.jvm.internal.d {
        int label;
        /* synthetic */ Object result;

        C25471(n7.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= androidx.customview.widget.a.INVALID_ID;
            return AssetLegacyDelegate.this.getModificationTime(this);
        }
    }

    /* JADX INFO: renamed from: expo.modules.medialibrary.next.objects.asset.delegates.AssetLegacyDelegate$getShape$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.medialibrary.next.objects.asset.delegates.AssetLegacyDelegate", f = "AssetLegacyDelegate.kt", l = {99, 100}, m = "getShape")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class C25481 extends kotlin.coroutines.jvm.internal.d {
        int I$0;
        int label;
        /* synthetic */ Object result;

        C25481(n7.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= androidx.customview.widget.a.INVALID_ID;
            return AssetLegacyDelegate.this.getShape(this);
        }
    }

    /* JADX INFO: renamed from: expo.modules.medialibrary.next.objects.asset.delegates.AssetLegacyDelegate$getUri$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.medialibrary.next.objects.asset.delegates.AssetLegacyDelegate", f = "AssetLegacyDelegate.kt", l = {114}, m = "getUri")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class C25491 extends kotlin.coroutines.jvm.internal.d {
        int label;
        /* synthetic */ Object result;

        C25491(n7.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= androidx.customview.widget.a.INVALID_ID;
            return AssetLegacyDelegate.this.getUri(this);
        }
    }

    /* JADX INFO: renamed from: expo.modules.medialibrary.next.objects.asset.delegates.AssetLegacyDelegate$getWidth$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.medialibrary.next.objects.asset.delegates.AssetLegacyDelegate", f = "AssetLegacyDelegate.kt", l = {93, 94}, m = "getWidth")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class C25501 extends kotlin.coroutines.jvm.internal.d {
        int label;
        /* synthetic */ Object result;

        C25501(n7.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= androidx.customview.widget.a.INVALID_ID;
            return AssetLegacyDelegate.this.getWidth(this);
        }
    }

    public AssetLegacyDelegate(Uri contentUri, AssetDeleter assetDeleter, SystemPermissionsDelegate systemPermissionsDelegate, Context context) {
        AbstractC2855l.g(contentUri, "contentUri");
        AbstractC2855l.g(assetDeleter, "assetDeleter");
        AbstractC2855l.g(systemPermissionsDelegate, "systemPermissionsDelegate");
        AbstractC2855l.g(context, "context");
        this.assetDeleter = assetDeleter;
        this.systemPermissionsDelegate = systemPermissionsDelegate;
        this.contextRef = new WeakReference<>(context);
        this.contentUri = contentUri;
        this.mediaStoreToAssetAdapter = AbstractC2746i.b(new InterfaceC3487a() { // from class: expo.modules.medialibrary.next.objects.asset.delegates.a
            @Override // w7.InterfaceC3487a
            public final Object invoke() {
                return AssetLegacyDelegate.mediaStoreToAssetAdapter_delegate$lambda$0(this.f26670g);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ContentResolver getContentResolver() throws ContentResolverNotObtainedException {
        ContentResolver contentResolver = WeakReferenceExtensionsKt.getOrThrow(this.contextRef).getContentResolver();
        if (contentResolver != null) {
            return contentResolver;
        }
        throw new ContentResolverNotObtainedException(null, 1, null);
    }

    private final MediaStoreToAssetAdapter getMediaStoreToAssetAdapter() {
        return (MediaStoreToAssetAdapter) this.mediaStoreToAssetAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MediaStoreToAssetAdapter mediaStoreToAssetAdapter_delegate$lambda$0(AssetLegacyDelegate assetLegacyDelegate) {
        return new MediaStoreToAssetAdapter(WeakReferenceExtensionsKt.getOrThrow(assetLegacyDelegate.contextRef));
    }

    @Override // expo.modules.medialibrary.next.objects.asset.delegates.AssetDelegate
    /* JADX INFO: renamed from: copy-dXLngQ8 */
    public Object mo284copydXLngQ8(String str, n7.f fVar) {
        return AbstractC1413i.g(C1404d0.b(), new AssetLegacyDelegate$copy$2(this, str, null), fVar);
    }

    @Override // expo.modules.medialibrary.next.objects.asset.delegates.AssetDelegate
    public Object delete(n7.f fVar) {
        Object objG = AbstractC1413i.g(C1404d0.b(), new AnonymousClass2(null), fVar);
        return objG == AbstractC3016b.e() ? objG : C2735B.f28704a;
    }

    public final AssetDeleter getAssetDeleter() {
        return this.assetDeleter;
    }

    @Override // expo.modules.medialibrary.next.objects.asset.delegates.AssetDelegate
    public Uri getContentUri() {
        return this.contentUri;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // expo.modules.medialibrary.next.objects.asset.delegates.AssetDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getCreationTime(n7.f fVar) throws ContentResolverNotObtainedException {
        AnonymousClass1 anonymousClass1;
        if (fVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) fVar;
            int i10 = anonymousClass1.label;
            if ((i10 & androidx.customview.widget.a.INVALID_ID) != 0) {
                anonymousClass1.label = i10 - androidx.customview.widget.a.INVALID_ID;
            } else {
                anonymousClass1 = new AnonymousClass1(fVar);
            }
        }
        Object objQueryAssetDateTaken = anonymousClass1.result;
        Object objE = AbstractC3016b.e();
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            AbstractC2753p.b(objQueryAssetDateTaken);
            ContentResolver contentResolver = getContentResolver();
            Uri contentUri = getContentUri();
            anonymousClass1.label = 1;
            objQueryAssetDateTaken = AssetExtensionsKt.queryAssetDateTaken(contentResolver, contentUri, anonymousClass1);
            if (objQueryAssetDateTaken == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(objQueryAssetDateTaken);
        }
        return getMediaStoreToAssetAdapter().transformCreationTime((Long) objQueryAssetDateTaken);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0058, code lost:
    
        if (r6 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // expo.modules.medialibrary.next.objects.asset.delegates.AssetDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getDuration(n7.f fVar) throws ContentResolverNotObtainedException {
        C25421 c25421;
        if (fVar instanceof C25421) {
            c25421 = (C25421) fVar;
            int i10 = c25421.label;
            if ((i10 & androidx.customview.widget.a.INVALID_ID) != 0) {
                c25421.label = i10 - androidx.customview.widget.a.INVALID_ID;
            } else {
                c25421 = new C25421(fVar);
            }
        }
        Object mediaType = c25421.result;
        Object objE = AbstractC3016b.e();
        int i11 = c25421.label;
        if (i11 == 0) {
            AbstractC2753p.b(mediaType);
            c25421.label = 1;
            mediaType = getMediaType(c25421);
            if (mediaType != objE) {
            }
            return objE;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(mediaType);
            return getMediaStoreToAssetAdapter().transformDuration((Long) mediaType);
        }
        AbstractC2753p.b(mediaType);
        if (mediaType != MediaType.VIDEO) {
            return null;
        }
        ContentResolver contentResolver = getContentResolver();
        Uri contentUri = getContentUri();
        c25421.label = 2;
        mediaType = AssetExtensionsKt.queryAssetDuration(contentResolver, contentUri, c25421);
    }

    @Override // expo.modules.medialibrary.next.objects.asset.delegates.AssetDelegate
    public Object getExif(n7.f fVar) {
        return AbstractC1413i.g(C1404d0.b(), new C25432(null), fVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // expo.modules.medialibrary.next.objects.asset.delegates.AssetDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getFilename(n7.f fVar) throws AssetPropertyNotFoundException, ContentResolverNotObtainedException {
        C25441 c25441;
        if (fVar instanceof C25441) {
            c25441 = (C25441) fVar;
            int i10 = c25441.label;
            if ((i10 & androidx.customview.widget.a.INVALID_ID) != 0) {
                c25441.label = i10 - androidx.customview.widget.a.INVALID_ID;
            } else {
                c25441 = new C25441(fVar);
            }
        }
        Object objQueryAssetDisplayName = c25441.result;
        Object objE = AbstractC3016b.e();
        int i11 = c25441.label;
        if (i11 == 0) {
            AbstractC2753p.b(objQueryAssetDisplayName);
            ContentResolver contentResolver = getContentResolver();
            Uri contentUri = getContentUri();
            c25441.label = 1;
            objQueryAssetDisplayName = AssetExtensionsKt.queryAssetDisplayName(contentResolver, contentUri, c25441);
            if (objQueryAssetDisplayName == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(objQueryAssetDisplayName);
        }
        String str = (String) objQueryAssetDisplayName;
        if (str != null) {
            return str;
        }
        throw new AssetPropertyNotFoundException("Filename", null, 2, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
    
        if (r6 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // expo.modules.medialibrary.next.objects.asset.delegates.AssetDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getHeight(n7.f fVar) throws AssetPropertyNotFoundException, ContentResolverNotObtainedException {
        C25451 c25451;
        if (fVar instanceof C25451) {
            c25451 = (C25451) fVar;
            int i10 = c25451.label;
            if ((i10 & androidx.customview.widget.a.INVALID_ID) != 0) {
                c25451.label = i10 - androidx.customview.widget.a.INVALID_ID;
            } else {
                c25451 = new C25451(fVar);
            }
        }
        Object objQueryAssetHeight = c25451.result;
        Object objE = AbstractC3016b.e();
        int i11 = c25451.label;
        if (i11 == 0) {
            AbstractC2753p.b(objQueryAssetHeight);
            ContentResolver contentResolver = getContentResolver();
            Uri contentUri = getContentUri();
            c25451.label = 1;
            objQueryAssetHeight = AssetExtensionsKt.queryAssetHeight(contentResolver, contentUri, c25451);
            if (objQueryAssetHeight != objE) {
            }
            return objE;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(objQueryAssetHeight);
            Integer num = (Integer) objQueryAssetHeight;
            if (num != null) {
                return kotlin.coroutines.jvm.internal.b.c(num.intValue());
            }
            throw new AssetPropertyNotFoundException("Height", null, 2, null);
        }
        AbstractC2753p.b(objQueryAssetHeight);
        MediaStoreToAssetAdapter mediaStoreToAssetAdapter = getMediaStoreToAssetAdapter();
        Uri contentUri2 = getContentUri();
        c25451.label = 2;
        objQueryAssetHeight = mediaStoreToAssetAdapter.transformHeight((Integer) objQueryAssetHeight, contentUri2, c25451);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // expo.modules.medialibrary.next.objects.asset.delegates.AssetDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getInfo(n7.f fVar) throws AssetPropertyNotFoundException, ContentResolverNotObtainedException {
        C25461 c25461;
        AssetMediaStoreItem assetMediaStoreItem;
        Object objTransformHeight;
        MediaType mediaType;
        Object objTransformWidth;
        Integer num;
        AssetMediaStoreItem assetMediaStoreItem2;
        MediaType mediaType2;
        String displayName;
        if (fVar instanceof C25461) {
            c25461 = (C25461) fVar;
            int i10 = c25461.label;
            if ((i10 & androidx.customview.widget.a.INVALID_ID) != 0) {
                c25461.label = i10 - androidx.customview.widget.a.INVALID_ID;
            } else {
                c25461 = new C25461(fVar);
            }
        }
        Object objQueryAssetMediaStoreItem = c25461.result;
        Object objE = AbstractC3016b.e();
        int i11 = c25461.label;
        if (i11 == 0) {
            AbstractC2753p.b(objQueryAssetMediaStoreItem);
            ContentResolver contentResolver = getContentResolver();
            Uri contentUri = getContentUri();
            c25461.label = 1;
            objQueryAssetMediaStoreItem = AssetExtensionsKt.queryAssetMediaStoreItem(contentResolver, contentUri, c25461);
            if (objQueryAssetMediaStoreItem != objE) {
            }
            return objE;
        }
        if (i11 != 1) {
            if (i11 == 2) {
                assetMediaStoreItem = (AssetMediaStoreItem) c25461.L$0;
                AbstractC2753p.b(objQueryAssetMediaStoreItem);
                MediaType mediaType3 = (MediaType) objQueryAssetMediaStoreItem;
                MediaStoreToAssetAdapter mediaStoreToAssetAdapter = getMediaStoreToAssetAdapter();
                Integer height = assetMediaStoreItem.getHeight();
                Uri contentUri2 = getContentUri();
                c25461.L$0 = assetMediaStoreItem;
                c25461.L$1 = mediaType3;
                c25461.label = 3;
                objTransformHeight = mediaStoreToAssetAdapter.transformHeight(height, contentUri2, c25461);
                if (objTransformHeight != objE) {
                    mediaType = mediaType3;
                    objQueryAssetMediaStoreItem = objTransformHeight;
                    Integer num2 = (Integer) objQueryAssetMediaStoreItem;
                    MediaStoreToAssetAdapter mediaStoreToAssetAdapter2 = getMediaStoreToAssetAdapter();
                    Integer width = assetMediaStoreItem.getWidth();
                    Uri contentUri3 = getContentUri();
                    c25461.L$0 = assetMediaStoreItem;
                    c25461.L$1 = mediaType;
                    c25461.L$2 = num2;
                    c25461.label = 4;
                    objTransformWidth = mediaStoreToAssetAdapter2.transformWidth(width, contentUri3, c25461);
                    if (objTransformWidth != objE) {
                    }
                }
                return objE;
            }
            if (i11 != 3) {
                if (i11 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                num = (Integer) c25461.L$2;
                MediaType mediaType4 = (MediaType) c25461.L$1;
                assetMediaStoreItem2 = (AssetMediaStoreItem) c25461.L$0;
                AbstractC2753p.b(objQueryAssetMediaStoreItem);
                mediaType2 = mediaType4;
                Integer num3 = (Integer) objQueryAssetMediaStoreItem;
                Uri contentUri4 = getContentUri();
                Long lTransformCreationTime = getMediaStoreToAssetAdapter().transformCreationTime(assetMediaStoreItem2.getDateTaken());
                Long lTransformModificationTime = getMediaStoreToAssetAdapter().transformModificationTime(assetMediaStoreItem2.getDateModified());
                Long lTransformDuration = getMediaStoreToAssetAdapter().transformDuration(assetMediaStoreItem2.getDuration());
                displayName = assetMediaStoreItem2.getDisplayName();
                if (displayName != null) {
                    throw new AssetPropertyNotFoundException("Filename", null, 2, null);
                }
                if (num == null) {
                    throw new AssetPropertyNotFoundException("Height", null, 2, null);
                }
                int iIntValue = num.intValue();
                if (num3 == null) {
                    throw new AssetPropertyNotFoundException("Width", null, 2, null);
                }
                int iIntValue2 = num3.intValue();
                Uri uriTransformUri = getMediaStoreToAssetAdapter().transformUri(assetMediaStoreItem2.getData());
                if (uriTransformUri != null) {
                    return new AssetInfo(contentUri4, lTransformCreationTime, lTransformDuration, displayName, iIntValue, iIntValue2, mediaType2, lTransformModificationTime, uriTransformUri);
                }
                throw new AssetPropertyNotFoundException("Uri", null, 2, null);
            }
            MediaType mediaType5 = (MediaType) c25461.L$1;
            AssetMediaStoreItem assetMediaStoreItem3 = (AssetMediaStoreItem) c25461.L$0;
            AbstractC2753p.b(objQueryAssetMediaStoreItem);
            mediaType = mediaType5;
            assetMediaStoreItem = assetMediaStoreItem3;
            Integer num22 = (Integer) objQueryAssetMediaStoreItem;
            MediaStoreToAssetAdapter mediaStoreToAssetAdapter22 = getMediaStoreToAssetAdapter();
            Integer width2 = assetMediaStoreItem.getWidth();
            Uri contentUri32 = getContentUri();
            c25461.L$0 = assetMediaStoreItem;
            c25461.L$1 = mediaType;
            c25461.L$2 = num22;
            c25461.label = 4;
            objTransformWidth = mediaStoreToAssetAdapter22.transformWidth(width2, contentUri32, c25461);
            if (objTransformWidth != objE) {
                num = num22;
                objQueryAssetMediaStoreItem = objTransformWidth;
                assetMediaStoreItem2 = assetMediaStoreItem;
                mediaType2 = mediaType;
                Integer num32 = (Integer) objQueryAssetMediaStoreItem;
                Uri contentUri42 = getContentUri();
                Long lTransformCreationTime2 = getMediaStoreToAssetAdapter().transformCreationTime(assetMediaStoreItem2.getDateTaken());
                Long lTransformModificationTime2 = getMediaStoreToAssetAdapter().transformModificationTime(assetMediaStoreItem2.getDateModified());
                Long lTransformDuration2 = getMediaStoreToAssetAdapter().transformDuration(assetMediaStoreItem2.getDuration());
                displayName = assetMediaStoreItem2.getDisplayName();
                if (displayName != null) {
                }
            }
            return objE;
        }
        AbstractC2753p.b(objQueryAssetMediaStoreItem);
        assetMediaStoreItem = (AssetMediaStoreItem) objQueryAssetMediaStoreItem;
        if (assetMediaStoreItem == null) {
            throw new AssetPropertyNotFoundException("Info", null, 2, null);
        }
        c25461.L$0 = assetMediaStoreItem;
        c25461.label = 2;
        objQueryAssetMediaStoreItem = getMediaType(c25461);
        if (objQueryAssetMediaStoreItem != objE) {
            MediaType mediaType32 = (MediaType) objQueryAssetMediaStoreItem;
            MediaStoreToAssetAdapter mediaStoreToAssetAdapter3 = getMediaStoreToAssetAdapter();
            Integer height2 = assetMediaStoreItem.getHeight();
            Uri contentUri22 = getContentUri();
            c25461.L$0 = assetMediaStoreItem;
            c25461.L$1 = mediaType32;
            c25461.label = 3;
            objTransformHeight = mediaStoreToAssetAdapter3.transformHeight(height2, contentUri22, c25461);
            if (objTransformHeight != objE) {
            }
        }
        return objE;
    }

    @Override // expo.modules.medialibrary.next.objects.asset.delegates.AssetDelegate
    public Object getLocation(n7.f fVar) throws PermissionException, IOException {
        Location location;
        this.systemPermissionsDelegate.requireReadPermissions();
        InputStream inputStreamOpenInputStream = getContentResolver().openInputStream(getContentUri());
        if (inputStreamOpenInputStream == null) {
            return null;
        }
        try {
            double[] dArrQ = new X0.a(inputStreamOpenInputStream).q();
            if (dArrQ != null) {
                location = new Location(kotlin.coroutines.jvm.internal.b.b(dArrQ[0]), kotlin.coroutines.jvm.internal.b.b(dArrQ[1]));
            } else {
                location = null;
            }
            AbstractC3376c.a(inputStreamOpenInputStream, null);
            return location;
        } finally {
        }
    }

    @Override // expo.modules.medialibrary.next.objects.asset.delegates.AssetDelegate
    public Object getMediaType(n7.f fVar) {
        return MediaType.INSTANCE.fromContentUri(getContentUri());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // expo.modules.medialibrary.next.objects.asset.delegates.AssetDelegate
    /* JADX INFO: renamed from: getMimeType-dctPOJs */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo285getMimeTypedctPOJs(n7.f fVar) {
        AssetLegacyDelegate$getMimeType$1 assetLegacyDelegate$getMimeType$1;
        MimeType.Companion companion;
        if (fVar instanceof AssetLegacyDelegate$getMimeType$1) {
            assetLegacyDelegate$getMimeType$1 = (AssetLegacyDelegate$getMimeType$1) fVar;
            int i10 = assetLegacyDelegate$getMimeType$1.label;
            if ((i10 & androidx.customview.widget.a.INVALID_ID) != 0) {
                assetLegacyDelegate$getMimeType$1.label = i10 - androidx.customview.widget.a.INVALID_ID;
            } else {
                assetLegacyDelegate$getMimeType$1 = new AssetLegacyDelegate$getMimeType$1(this, fVar);
            }
        }
        Object obj = assetLegacyDelegate$getMimeType$1.result;
        Object objE = AbstractC3016b.e();
        int i11 = assetLegacyDelegate$getMimeType$1.label;
        if (i11 == 0) {
            AbstractC2753p.b(obj);
            String type = getContentResolver().getType(getContentUri());
            if (type != null) {
                return MimeType.m297constructorimpl(type);
            }
            MimeType.Companion companion2 = MimeType.INSTANCE;
            assetLegacyDelegate$getMimeType$1.L$0 = companion2;
            assetLegacyDelegate$getMimeType$1.label = 1;
            Object uri = getUri(assetLegacyDelegate$getMimeType$1);
            if (uri == objE) {
                return objE;
            }
            companion = companion2;
            obj = uri;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            companion = (MimeType.Companion) assetLegacyDelegate$getMimeType$1.L$0;
            AbstractC2753p.b(obj);
        }
        return companion.m310fromdctPOJs((Uri) obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // expo.modules.medialibrary.next.objects.asset.delegates.AssetDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getModificationTime(n7.f fVar) throws ContentResolverNotObtainedException {
        C25471 c25471;
        if (fVar instanceof C25471) {
            c25471 = (C25471) fVar;
            int i10 = c25471.label;
            if ((i10 & androidx.customview.widget.a.INVALID_ID) != 0) {
                c25471.label = i10 - androidx.customview.widget.a.INVALID_ID;
            } else {
                c25471 = new C25471(fVar);
            }
        }
        Object objQueryAssetDateModified = c25471.result;
        Object objE = AbstractC3016b.e();
        int i11 = c25471.label;
        if (i11 == 0) {
            AbstractC2753p.b(objQueryAssetDateModified);
            ContentResolver contentResolver = getContentResolver();
            Uri contentUri = getContentUri();
            c25471.label = 1;
            objQueryAssetDateModified = AssetExtensionsKt.queryAssetDateModified(contentResolver, contentUri, c25471);
            if (objQueryAssetDateModified == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(objQueryAssetDateModified);
        }
        return getMediaStoreToAssetAdapter().transformModificationTime((Long) objQueryAssetDateModified);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // expo.modules.medialibrary.next.objects.asset.delegates.AssetDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getShape(n7.f fVar) throws AssetPropertyNotFoundException, ContentResolverNotObtainedException {
        C25481 c25481;
        int i10;
        if (fVar instanceof C25481) {
            c25481 = (C25481) fVar;
            int i11 = c25481.label;
            if ((i11 & androidx.customview.widget.a.INVALID_ID) != 0) {
                c25481.label = i11 - androidx.customview.widget.a.INVALID_ID;
            } else {
                c25481 = new C25481(fVar);
            }
        }
        Object width = c25481.result;
        Object objE = AbstractC3016b.e();
        int i12 = c25481.label;
        if (i12 == 0) {
            AbstractC2753p.b(width);
            c25481.label = 1;
            width = getWidth(c25481);
            if (width != objE) {
            }
            return objE;
        }
        if (i12 != 1) {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i10 = c25481.I$0;
            AbstractC2753p.b(width);
            int iIntValue = ((Number) width).intValue();
            Shape shape = new Shape(i10, iIntValue);
            if (i10 <= 0 && iIntValue > 0) {
                return shape;
            }
        }
        AbstractC2753p.b(width);
        int iIntValue2 = ((Number) width).intValue();
        c25481.I$0 = iIntValue2;
        c25481.label = 2;
        Object height = getHeight(c25481);
        if (height != objE) {
            i10 = iIntValue2;
            width = height;
            int iIntValue3 = ((Number) width).intValue();
            Shape shape2 = new Shape(i10, iIntValue3);
            return i10 <= 0 ? null : null;
        }
        return objE;
    }

    public final SystemPermissionsDelegate getSystemPermissionsDelegate() {
        return this.systemPermissionsDelegate;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // expo.modules.medialibrary.next.objects.asset.delegates.AssetDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getUri(n7.f fVar) throws AssetPropertyNotFoundException, ContentResolverNotObtainedException {
        C25491 c25491;
        if (fVar instanceof C25491) {
            c25491 = (C25491) fVar;
            int i10 = c25491.label;
            if ((i10 & androidx.customview.widget.a.INVALID_ID) != 0) {
                c25491.label = i10 - androidx.customview.widget.a.INVALID_ID;
            } else {
                c25491 = new C25491(fVar);
            }
        }
        Object objQueryAssetData = c25491.result;
        Object objE = AbstractC3016b.e();
        int i11 = c25491.label;
        if (i11 == 0) {
            AbstractC2753p.b(objQueryAssetData);
            ContentResolver contentResolver = getContentResolver();
            Uri contentUri = getContentUri();
            c25491.label = 1;
            objQueryAssetData = AssetExtensionsKt.queryAssetData(contentResolver, contentUri, c25491);
            if (objQueryAssetData == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(objQueryAssetData);
        }
        Uri uriTransformUri = getMediaStoreToAssetAdapter().transformUri((String) objQueryAssetData);
        if (uriTransformUri != null) {
            return uriTransformUri;
        }
        throw new AssetPropertyNotFoundException("Uri", null, 2, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
    
        if (r6 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // expo.modules.medialibrary.next.objects.asset.delegates.AssetDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getWidth(n7.f fVar) throws AssetPropertyNotFoundException, ContentResolverNotObtainedException {
        C25501 c25501;
        if (fVar instanceof C25501) {
            c25501 = (C25501) fVar;
            int i10 = c25501.label;
            if ((i10 & androidx.customview.widget.a.INVALID_ID) != 0) {
                c25501.label = i10 - androidx.customview.widget.a.INVALID_ID;
            } else {
                c25501 = new C25501(fVar);
            }
        }
        Object objQueryAssetWidth = c25501.result;
        Object objE = AbstractC3016b.e();
        int i11 = c25501.label;
        if (i11 == 0) {
            AbstractC2753p.b(objQueryAssetWidth);
            ContentResolver contentResolver = getContentResolver();
            Uri contentUri = getContentUri();
            c25501.label = 1;
            objQueryAssetWidth = AssetExtensionsKt.queryAssetWidth(contentResolver, contentUri, c25501);
            if (objQueryAssetWidth != objE) {
            }
            return objE;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(objQueryAssetWidth);
            Integer num = (Integer) objQueryAssetWidth;
            if (num != null) {
                return kotlin.coroutines.jvm.internal.b.c(num.intValue());
            }
            throw new AssetPropertyNotFoundException("Width", null, 2, null);
        }
        AbstractC2753p.b(objQueryAssetWidth);
        MediaStoreToAssetAdapter mediaStoreToAssetAdapter = getMediaStoreToAssetAdapter();
        Uri contentUri2 = getContentUri();
        c25501.label = 2;
        objQueryAssetWidth = mediaStoreToAssetAdapter.transformWidth((Integer) objQueryAssetWidth, contentUri2, c25501);
    }

    @Override // expo.modules.medialibrary.next.objects.asset.delegates.AssetDelegate
    /* JADX INFO: renamed from: move-dXLngQ8 */
    public Object mo286movedXLngQ8(String str, n7.f fVar) {
        Object objG = AbstractC1413i.g(C1404d0.b(), new AssetLegacyDelegate$move$2(this, str, null), fVar);
        return objG == AbstractC3016b.e() ? objG : C2735B.f28704a;
    }
}
