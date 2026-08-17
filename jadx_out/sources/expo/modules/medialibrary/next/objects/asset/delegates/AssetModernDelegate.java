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
import expo.modules.medialibrary.next.extensions.WeakReferenceExtensionsKt;
import expo.modules.medialibrary.next.extensions.resolver.AssetExtensionsKt;
import expo.modules.medialibrary.next.extensions.resolver.AssetMediaStoreItem;
import expo.modules.medialibrary.next.objects.asset.ExifTagsKt;
import expo.modules.medialibrary.next.objects.asset.deleters.AssetDeleter;
import expo.modules.medialibrary.next.objects.asset.factories.BuildUniqueDisplayNameKt;
import expo.modules.medialibrary.next.objects.wrappers.MediaType;
import expo.modules.medialibrary.next.objects.wrappers.MimeType;
import expo.modules.medialibrary.next.permissions.MediaStorePermissionsDelegate;
import expo.modules.medialibrary.next.records.AssetInfo;
import expo.modules.medialibrary.next.records.Location;
import expo.modules.medialibrary.next.records.Shape;
import i7.AbstractC2746i;
import i7.AbstractC2753p;
import i7.C2735B;
import j7.AbstractC2800q;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.List;
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
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0013\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0014H\u0096@¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0018H\u0096@¢\u0006\u0004\b\u0019\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u001aH\u0096@¢\u0006\u0004\b\u001b\u0010\u0016J\u0010\u0010\u001c\u001a\u00020\u001aH\u0096@¢\u0006\u0004\b\u001c\u0010\u0016J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0096@¢\u0006\u0004\b\u001e\u0010\u0016J\u0010\u0010 \u001a\u00020\u001fH\u0096@¢\u0006\u0004\b \u0010\u0016J\u0012\u0010!\u001a\u0004\u0018\u00010\u0014H\u0096@¢\u0006\u0004\b!\u0010\u0016J\u0010\u0010\"\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\"\u0010\u0016J\u0010\u0010$\u001a\u00020#H\u0096@¢\u0006\u0004\b$\u0010\u0016J\u0010\u0010'\u001a\u00020%H\u0096@¢\u0006\u0004\b&\u0010\u0016J\u0012\u0010)\u001a\u0004\u0018\u00010(H\u0096@¢\u0006\u0004\b)\u0010\u0016J\u0010\u0010+\u001a\u00020*H\u0096@¢\u0006\u0004\b+\u0010\u0016J\u0010\u0010-\u001a\u00020,H\u0096@¢\u0006\u0004\b-\u0010\u0016J\u0018\u00100\u001a\u00020,2\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b.\u0010/J\u0018\u00102\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b1\u0010/R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\b7\u00108R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00109\u001a\u0004\b:\u0010;R\"\u0010>\u001a\u0010\u0012\f\u0012\n =*\u0004\u0018\u00010\b0\b0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u001b\u0010E\u001a\u00020@8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0014\u0010I\u001a\u00020F8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bG\u0010H¨\u0006J"}, d2 = {"Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetModernDelegate;", "Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetDelegate;", "Landroid/net/Uri;", "contentUri", "Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetDeleter;", "assetDeleter", "Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate;", "mediaStorePermissionsDelegate", "Landroid/content/Context;", "context", "<init>", "(Landroid/net/Uri;Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetDeleter;Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate;Landroid/content/Context;)V", "Lexpo/modules/medialibrary/next/objects/wrappers/RelativePath;", "relativePath", PointerEventHelper.POINTER_TYPE_UNKNOWN, "forceUniqueName", "Lexpo/modules/medialibrary/next/objects/asset/Asset;", "copyInternal-v-FDBtY", "(Ljava/lang/String;ZLn7/f;)Ljava/lang/Object;", "copyInternal", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getCreationTime", "(Ln7/f;)Ljava/lang/Object;", "getDuration", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getFilename", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getHeight", "getWidth", "Lexpo/modules/medialibrary/next/records/Shape;", "getShape", "Lexpo/modules/medialibrary/next/objects/wrappers/MediaType;", "getMediaType", "getModificationTime", "getUri", "Lexpo/modules/medialibrary/next/records/AssetInfo;", "getInfo", "Lexpo/modules/medialibrary/next/objects/wrappers/MimeType;", "getMimeType-dctPOJs", "getMimeType", "Lexpo/modules/medialibrary/next/records/Location;", "getLocation", "Landroid/os/Bundle;", "getExif", "Li7/B;", "delete", "move-dXLngQ8", "(Ljava/lang/String;Ln7/f;)Ljava/lang/Object;", "move", "copy-dXLngQ8", "copy", "Landroid/net/Uri;", "getContentUri", "()Landroid/net/Uri;", "Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetDeleter;", "getAssetDeleter", "()Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetDeleter;", "Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate;", "getMediaStorePermissionsDelegate", "()Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate;", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "contextRef", "Ljava/lang/ref/WeakReference;", "Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter;", "mediaStoreToAssetAdapter$delegate", "Lkotlin/Lazy;", "getMediaStoreToAssetAdapter", "()Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter;", "mediaStoreToAssetAdapter", "Landroid/content/ContentResolver;", "getContentResolver", "()Landroid/content/ContentResolver;", "contentResolver", "expo-media-library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AssetModernDelegate implements AssetDelegate {
    private final AssetDeleter assetDeleter;
    private final Uri contentUri;
    private final WeakReference<Context> contextRef;
    private final MediaStorePermissionsDelegate mediaStorePermissionsDelegate;

    /* JADX INFO: renamed from: mediaStoreToAssetAdapter$delegate, reason: from kotlin metadata */
    private final Lazy mediaStoreToAssetAdapter;

    /* JADX INFO: renamed from: expo.modules.medialibrary.next.objects.asset.delegates.AssetModernDelegate$delete$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.medialibrary.next.objects.asset.delegates.AssetModernDelegate$delete$2", f = "AssetModernDelegate.kt", l = {170}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LR8/N;", "Li7/B;", "<anonymous>", "(LR8/N;)V"}, k = 3, mv = {2, 1, 0})
    static final class AnonymousClass2 extends l implements Function2 {
        int label;

        AnonymousClass2(n7.f fVar) {
            super(2, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            return AssetModernDelegate.this.new AnonymousClass2(fVar);
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
                AssetDeleter assetDeleter = AssetModernDelegate.this.getAssetDeleter();
                Uri contentUri = AssetModernDelegate.this.getContentUri();
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

    /* JADX INFO: renamed from: expo.modules.medialibrary.next.objects.asset.delegates.AssetModernDelegate$getCreationTime$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.medialibrary.next.objects.asset.delegates.AssetModernDelegate", f = "AssetModernDelegate.kt", l = {63}, m = "getCreationTime")
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
            return AssetModernDelegate.this.getCreationTime(this);
        }
    }

    /* JADX INFO: renamed from: expo.modules.medialibrary.next.objects.asset.delegates.AssetModernDelegate$getDuration$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.medialibrary.next.objects.asset.delegates.AssetModernDelegate", f = "AssetModernDelegate.kt", l = {68, 71}, m = "getDuration")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class C25511 extends kotlin.coroutines.jvm.internal.d {
        int label;
        /* synthetic */ Object result;

        C25511(n7.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= androidx.customview.widget.a.INVALID_ID;
            return AssetModernDelegate.this.getDuration(this);
        }
    }

    /* JADX INFO: renamed from: expo.modules.medialibrary.next.objects.asset.delegates.AssetModernDelegate$getExif$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.medialibrary.next.objects.asset.delegates.AssetModernDelegate$getExif$2", f = "AssetModernDelegate.kt", l = {149}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LR8/N;", "Landroid/os/Bundle;", "<anonymous>", "(LR8/N;)Landroid/os/Bundle;"}, k = 3, mv = {2, 1, 0})
    static final class C25522 extends l implements Function2 {
        private /* synthetic */ Object L$0;
        int label;

        C25522(n7.f fVar) {
            super(2, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            C25522 c25522 = AssetModernDelegate.this.new C25522(fVar);
            c25522.L$0 = obj;
            return c25522;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, n7.f fVar) {
            return ((C25522) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws IOException {
            N n10;
            Object objE = AbstractC3016b.e();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC2753p.b(obj);
                N n11 = (N) this.L$0;
                AssetModernDelegate assetModernDelegate = AssetModernDelegate.this;
                this.L$0 = n11;
                this.label = 1;
                Object mediaType = assetModernDelegate.getMediaType(this);
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
            InputStream inputStreamOpenInputStream = AssetModernDelegate.this.getContentResolver().openInputStream(AssetModernDelegate.this.getContentUri());
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

    /* JADX INFO: renamed from: expo.modules.medialibrary.next.objects.asset.delegates.AssetModernDelegate$getFilename$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.medialibrary.next.objects.asset.delegates.AssetModernDelegate", f = "AssetModernDelegate.kt", l = {76}, m = "getFilename")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class C25531 extends kotlin.coroutines.jvm.internal.d {
        int label;
        /* synthetic */ Object result;

        C25531(n7.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= androidx.customview.widget.a.INVALID_ID;
            return AssetModernDelegate.this.getFilename(this);
        }
    }

    /* JADX INFO: renamed from: expo.modules.medialibrary.next.objects.asset.delegates.AssetModernDelegate$getHeight$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.medialibrary.next.objects.asset.delegates.AssetModernDelegate", f = "AssetModernDelegate.kt", l = {80, 81}, m = "getHeight")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class C25541 extends kotlin.coroutines.jvm.internal.d {
        int label;
        /* synthetic */ Object result;

        C25541(n7.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= androidx.customview.widget.a.INVALID_ID;
            return AssetModernDelegate.this.getHeight(this);
        }
    }

    /* JADX INFO: renamed from: expo.modules.medialibrary.next.objects.asset.delegates.AssetModernDelegate$getInfo$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.medialibrary.next.objects.asset.delegates.AssetModernDelegate", f = "AssetModernDelegate.kt", l = {114, 116, 117, 118}, m = "getInfo")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class C25551 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C25551(n7.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= androidx.customview.widget.a.INVALID_ID;
            return AssetModernDelegate.this.getInfo(this);
        }
    }

    /* JADX INFO: renamed from: expo.modules.medialibrary.next.objects.asset.delegates.AssetModernDelegate$getModificationTime$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.medialibrary.next.objects.asset.delegates.AssetModernDelegate", f = "AssetModernDelegate.kt", l = {101}, m = "getModificationTime")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class C25561 extends kotlin.coroutines.jvm.internal.d {
        int label;
        /* synthetic */ Object result;

        C25561(n7.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= androidx.customview.widget.a.INVALID_ID;
            return AssetModernDelegate.this.getModificationTime(this);
        }
    }

    /* JADX INFO: renamed from: expo.modules.medialibrary.next.objects.asset.delegates.AssetModernDelegate$getShape$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.medialibrary.next.objects.asset.delegates.AssetModernDelegate", f = "AssetModernDelegate.kt", l = {92, 93}, m = "getShape")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class C25571 extends kotlin.coroutines.jvm.internal.d {
        int I$0;
        int label;
        /* synthetic */ Object result;

        C25571(n7.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= androidx.customview.widget.a.INVALID_ID;
            return AssetModernDelegate.this.getShape(this);
        }
    }

    /* JADX INFO: renamed from: expo.modules.medialibrary.next.objects.asset.delegates.AssetModernDelegate$getUri$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.medialibrary.next.objects.asset.delegates.AssetModernDelegate", f = "AssetModernDelegate.kt", l = {107}, m = "getUri")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class C25581 extends kotlin.coroutines.jvm.internal.d {
        int label;
        /* synthetic */ Object result;

        C25581(n7.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= androidx.customview.widget.a.INVALID_ID;
            return AssetModernDelegate.this.getUri(this);
        }
    }

    /* JADX INFO: renamed from: expo.modules.medialibrary.next.objects.asset.delegates.AssetModernDelegate$getWidth$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.medialibrary.next.objects.asset.delegates.AssetModernDelegate", f = "AssetModernDelegate.kt", l = {86, 87}, m = "getWidth")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class C25591 extends kotlin.coroutines.jvm.internal.d {
        int label;
        /* synthetic */ Object result;

        C25591(n7.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= androidx.customview.widget.a.INVALID_ID;
            return AssetModernDelegate.this.getWidth(this);
        }
    }

    public AssetModernDelegate(Uri contentUri, AssetDeleter assetDeleter, MediaStorePermissionsDelegate mediaStorePermissionsDelegate, Context context) {
        AbstractC2855l.g(contentUri, "contentUri");
        AbstractC2855l.g(assetDeleter, "assetDeleter");
        AbstractC2855l.g(mediaStorePermissionsDelegate, "mediaStorePermissionsDelegate");
        AbstractC2855l.g(context, "context");
        this.contentUri = contentUri;
        this.assetDeleter = assetDeleter;
        this.mediaStorePermissionsDelegate = mediaStorePermissionsDelegate;
        this.contextRef = new WeakReference<>(context);
        this.mediaStoreToAssetAdapter = AbstractC2746i.b(new InterfaceC3487a() { // from class: expo.modules.medialibrary.next.objects.asset.delegates.b
            @Override // w7.InterfaceC3487a
            public final Object invoke() {
                return AssetModernDelegate.mediaStoreToAssetAdapter_delegate$lambda$0(this.f26671g);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: copyInternal-v-FDBtY, reason: not valid java name */
    public final Object m288copyInternalvFDBtY(String str, boolean z10, n7.f fVar) {
        return AbstractC1413i.g(C1404d0.b(), new AssetModernDelegate$copyInternal$2(z10, this, str, null), fVar);
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
    public static final MediaStoreToAssetAdapter mediaStoreToAssetAdapter_delegate$lambda$0(AssetModernDelegate assetModernDelegate) {
        return new MediaStoreToAssetAdapter(WeakReferenceExtensionsKt.getOrThrow(assetModernDelegate.contextRef));
    }

    @Override // expo.modules.medialibrary.next.objects.asset.delegates.AssetDelegate
    /* JADX INFO: renamed from: copy-dXLngQ8 */
    public Object mo284copydXLngQ8(String str, n7.f fVar) {
        return m288copyInternalvFDBtY(str, false, fVar);
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
        C25511 c25511;
        if (fVar instanceof C25511) {
            c25511 = (C25511) fVar;
            int i10 = c25511.label;
            if ((i10 & androidx.customview.widget.a.INVALID_ID) != 0) {
                c25511.label = i10 - androidx.customview.widget.a.INVALID_ID;
            } else {
                c25511 = new C25511(fVar);
            }
        }
        Object mediaType = c25511.result;
        Object objE = AbstractC3016b.e();
        int i11 = c25511.label;
        if (i11 == 0) {
            AbstractC2753p.b(mediaType);
            c25511.label = 1;
            mediaType = getMediaType(c25511);
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
        c25511.label = 2;
        mediaType = AssetExtensionsKt.queryAssetDuration(contentResolver, contentUri, c25511);
    }

    @Override // expo.modules.medialibrary.next.objects.asset.delegates.AssetDelegate
    public Object getExif(n7.f fVar) {
        return AbstractC1413i.g(C1404d0.b(), new C25522(null), fVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // expo.modules.medialibrary.next.objects.asset.delegates.AssetDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getFilename(n7.f fVar) throws AssetPropertyNotFoundException, ContentResolverNotObtainedException {
        C25531 c25531;
        if (fVar instanceof C25531) {
            c25531 = (C25531) fVar;
            int i10 = c25531.label;
            if ((i10 & androidx.customview.widget.a.INVALID_ID) != 0) {
                c25531.label = i10 - androidx.customview.widget.a.INVALID_ID;
            } else {
                c25531 = new C25531(fVar);
            }
        }
        Object objQueryAssetDisplayName = c25531.result;
        Object objE = AbstractC3016b.e();
        int i11 = c25531.label;
        if (i11 == 0) {
            AbstractC2753p.b(objQueryAssetDisplayName);
            ContentResolver contentResolver = getContentResolver();
            Uri contentUri = getContentUri();
            c25531.label = 1;
            objQueryAssetDisplayName = AssetExtensionsKt.queryAssetDisplayName(contentResolver, contentUri, c25531);
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
        C25541 c25541;
        if (fVar instanceof C25541) {
            c25541 = (C25541) fVar;
            int i10 = c25541.label;
            if ((i10 & androidx.customview.widget.a.INVALID_ID) != 0) {
                c25541.label = i10 - androidx.customview.widget.a.INVALID_ID;
            } else {
                c25541 = new C25541(fVar);
            }
        }
        Object objQueryAssetHeight = c25541.result;
        Object objE = AbstractC3016b.e();
        int i11 = c25541.label;
        if (i11 == 0) {
            AbstractC2753p.b(objQueryAssetHeight);
            ContentResolver contentResolver = getContentResolver();
            Uri contentUri = getContentUri();
            c25541.label = 1;
            objQueryAssetHeight = AssetExtensionsKt.queryAssetHeight(contentResolver, contentUri, c25541);
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
        c25541.label = 2;
        objQueryAssetHeight = mediaStoreToAssetAdapter.transformHeight((Integer) objQueryAssetHeight, contentUri2, c25541);
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
        C25551 c25551;
        AssetMediaStoreItem assetMediaStoreItem;
        Object objTransformHeight;
        MediaType mediaType;
        Object objTransformWidth;
        Integer num;
        AssetMediaStoreItem assetMediaStoreItem2;
        MediaType mediaType2;
        String displayName;
        if (fVar instanceof C25551) {
            c25551 = (C25551) fVar;
            int i10 = c25551.label;
            if ((i10 & androidx.customview.widget.a.INVALID_ID) != 0) {
                c25551.label = i10 - androidx.customview.widget.a.INVALID_ID;
            } else {
                c25551 = new C25551(fVar);
            }
        }
        Object objQueryAssetMediaStoreItem = c25551.result;
        Object objE = AbstractC3016b.e();
        int i11 = c25551.label;
        if (i11 == 0) {
            AbstractC2753p.b(objQueryAssetMediaStoreItem);
            ContentResolver contentResolver = getContentResolver();
            Uri contentUri = getContentUri();
            c25551.label = 1;
            objQueryAssetMediaStoreItem = AssetExtensionsKt.queryAssetMediaStoreItem(contentResolver, contentUri, c25551);
            if (objQueryAssetMediaStoreItem != objE) {
            }
            return objE;
        }
        if (i11 != 1) {
            if (i11 == 2) {
                assetMediaStoreItem = (AssetMediaStoreItem) c25551.L$0;
                AbstractC2753p.b(objQueryAssetMediaStoreItem);
                MediaType mediaType3 = (MediaType) objQueryAssetMediaStoreItem;
                MediaStoreToAssetAdapter mediaStoreToAssetAdapter = getMediaStoreToAssetAdapter();
                Integer height = assetMediaStoreItem.getHeight();
                Uri contentUri2 = getContentUri();
                c25551.L$0 = assetMediaStoreItem;
                c25551.L$1 = mediaType3;
                c25551.label = 3;
                objTransformHeight = mediaStoreToAssetAdapter.transformHeight(height, contentUri2, c25551);
                if (objTransformHeight != objE) {
                    mediaType = mediaType3;
                    objQueryAssetMediaStoreItem = objTransformHeight;
                    Integer num2 = (Integer) objQueryAssetMediaStoreItem;
                    MediaStoreToAssetAdapter mediaStoreToAssetAdapter2 = getMediaStoreToAssetAdapter();
                    Integer width = assetMediaStoreItem.getWidth();
                    Uri contentUri3 = getContentUri();
                    c25551.L$0 = assetMediaStoreItem;
                    c25551.L$1 = mediaType;
                    c25551.L$2 = num2;
                    c25551.label = 4;
                    objTransformWidth = mediaStoreToAssetAdapter2.transformWidth(width, contentUri3, c25551);
                    if (objTransformWidth != objE) {
                    }
                }
                return objE;
            }
            if (i11 != 3) {
                if (i11 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                num = (Integer) c25551.L$2;
                MediaType mediaType4 = (MediaType) c25551.L$1;
                assetMediaStoreItem2 = (AssetMediaStoreItem) c25551.L$0;
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
            MediaType mediaType5 = (MediaType) c25551.L$1;
            AssetMediaStoreItem assetMediaStoreItem3 = (AssetMediaStoreItem) c25551.L$0;
            AbstractC2753p.b(objQueryAssetMediaStoreItem);
            mediaType = mediaType5;
            assetMediaStoreItem = assetMediaStoreItem3;
            Integer num22 = (Integer) objQueryAssetMediaStoreItem;
            MediaStoreToAssetAdapter mediaStoreToAssetAdapter22 = getMediaStoreToAssetAdapter();
            Integer width2 = assetMediaStoreItem.getWidth();
            Uri contentUri32 = getContentUri();
            c25551.L$0 = assetMediaStoreItem;
            c25551.L$1 = mediaType;
            c25551.L$2 = num22;
            c25551.label = 4;
            objTransformWidth = mediaStoreToAssetAdapter22.transformWidth(width2, contentUri32, c25551);
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
        c25551.L$0 = assetMediaStoreItem;
        c25551.label = 2;
        objQueryAssetMediaStoreItem = getMediaType(c25551);
        if (objQueryAssetMediaStoreItem != objE) {
            MediaType mediaType32 = (MediaType) objQueryAssetMediaStoreItem;
            MediaStoreToAssetAdapter mediaStoreToAssetAdapter3 = getMediaStoreToAssetAdapter();
            Integer height2 = assetMediaStoreItem.getHeight();
            Uri contentUri22 = getContentUri();
            c25551.L$0 = assetMediaStoreItem;
            c25551.L$1 = mediaType32;
            c25551.label = 3;
            objTransformHeight = mediaStoreToAssetAdapter3.transformHeight(height2, contentUri22, c25551);
            if (objTransformHeight != objE) {
            }
        }
        return objE;
    }

    @Override // expo.modules.medialibrary.next.objects.asset.delegates.AssetDelegate
    public Object getLocation(n7.f fVar) throws IOException {
        Location location;
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

    public final MediaStorePermissionsDelegate getMediaStorePermissionsDelegate() {
        return this.mediaStorePermissionsDelegate;
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
        AssetModernDelegate$getMimeType$1 assetModernDelegate$getMimeType$1;
        MimeType.Companion companion;
        if (fVar instanceof AssetModernDelegate$getMimeType$1) {
            assetModernDelegate$getMimeType$1 = (AssetModernDelegate$getMimeType$1) fVar;
            int i10 = assetModernDelegate$getMimeType$1.label;
            if ((i10 & androidx.customview.widget.a.INVALID_ID) != 0) {
                assetModernDelegate$getMimeType$1.label = i10 - androidx.customview.widget.a.INVALID_ID;
            } else {
                assetModernDelegate$getMimeType$1 = new AssetModernDelegate$getMimeType$1(this, fVar);
            }
        }
        Object obj = assetModernDelegate$getMimeType$1.result;
        Object objE = AbstractC3016b.e();
        int i11 = assetModernDelegate$getMimeType$1.label;
        if (i11 == 0) {
            AbstractC2753p.b(obj);
            String type = getContentResolver().getType(getContentUri());
            if (type != null) {
                return MimeType.m297constructorimpl(type);
            }
            MimeType.Companion companion2 = MimeType.INSTANCE;
            assetModernDelegate$getMimeType$1.L$0 = companion2;
            assetModernDelegate$getMimeType$1.label = 1;
            Object uri = getUri(assetModernDelegate$getMimeType$1);
            if (uri == objE) {
                return objE;
            }
            companion = companion2;
            obj = uri;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            companion = (MimeType.Companion) assetModernDelegate$getMimeType$1.L$0;
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
        C25561 c25561;
        if (fVar instanceof C25561) {
            c25561 = (C25561) fVar;
            int i10 = c25561.label;
            if ((i10 & androidx.customview.widget.a.INVALID_ID) != 0) {
                c25561.label = i10 - androidx.customview.widget.a.INVALID_ID;
            } else {
                c25561 = new C25561(fVar);
            }
        }
        Object objQueryAssetDateModified = c25561.result;
        Object objE = AbstractC3016b.e();
        int i11 = c25561.label;
        if (i11 == 0) {
            AbstractC2753p.b(objQueryAssetDateModified);
            ContentResolver contentResolver = getContentResolver();
            Uri contentUri = getContentUri();
            c25561.label = 1;
            objQueryAssetDateModified = AssetExtensionsKt.queryAssetDateModified(contentResolver, contentUri, c25561);
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
        C25571 c25571;
        int i10;
        if (fVar instanceof C25571) {
            c25571 = (C25571) fVar;
            int i11 = c25571.label;
            if ((i11 & androidx.customview.widget.a.INVALID_ID) != 0) {
                c25571.label = i11 - androidx.customview.widget.a.INVALID_ID;
            } else {
                c25571 = new C25571(fVar);
            }
        }
        Object width = c25571.result;
        Object objE = AbstractC3016b.e();
        int i12 = c25571.label;
        if (i12 == 0) {
            AbstractC2753p.b(width);
            c25571.label = 1;
            width = getWidth(c25571);
            if (width != objE) {
            }
            return objE;
        }
        if (i12 != 1) {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i10 = c25571.I$0;
            AbstractC2753p.b(width);
            int iIntValue = ((Number) width).intValue();
            Shape shape = new Shape(i10, iIntValue);
            if (i10 <= 0 && iIntValue > 0) {
                return shape;
            }
        }
        AbstractC2753p.b(width);
        int iIntValue2 = ((Number) width).intValue();
        c25571.I$0 = iIntValue2;
        c25571.label = 2;
        Object height = getHeight(c25571);
        if (height != objE) {
            i10 = iIntValue2;
            width = height;
            int iIntValue3 = ((Number) width).intValue();
            Shape shape2 = new Shape(i10, iIntValue3);
            return i10 <= 0 ? null : null;
        }
        return objE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // expo.modules.medialibrary.next.objects.asset.delegates.AssetDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getUri(n7.f fVar) throws AssetPropertyNotFoundException, ContentResolverNotObtainedException {
        C25581 c25581;
        if (fVar instanceof C25581) {
            c25581 = (C25581) fVar;
            int i10 = c25581.label;
            if ((i10 & androidx.customview.widget.a.INVALID_ID) != 0) {
                c25581.label = i10 - androidx.customview.widget.a.INVALID_ID;
            } else {
                c25581 = new C25581(fVar);
            }
        }
        Object objQueryAssetData = c25581.result;
        Object objE = AbstractC3016b.e();
        int i11 = c25581.label;
        if (i11 == 0) {
            AbstractC2753p.b(objQueryAssetData);
            ContentResolver contentResolver = getContentResolver();
            Uri contentUri = getContentUri();
            c25581.label = 1;
            objQueryAssetData = AssetExtensionsKt.queryAssetData(contentResolver, contentUri, c25581);
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
        C25591 c25591;
        if (fVar instanceof C25591) {
            c25591 = (C25591) fVar;
            int i10 = c25591.label;
            if ((i10 & androidx.customview.widget.a.INVALID_ID) != 0) {
                c25591.label = i10 - androidx.customview.widget.a.INVALID_ID;
            } else {
                c25591 = new C25591(fVar);
            }
        }
        Object objQueryAssetWidth = c25591.result;
        Object objE = AbstractC3016b.e();
        int i11 = c25591.label;
        if (i11 == 0) {
            AbstractC2753p.b(objQueryAssetWidth);
            ContentResolver contentResolver = getContentResolver();
            Uri contentUri = getContentUri();
            c25591.label = 1;
            objQueryAssetWidth = AssetExtensionsKt.queryAssetWidth(contentResolver, contentUri, c25591);
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
        c25591.label = 2;
        objQueryAssetWidth = mediaStoreToAssetAdapter.transformWidth((Integer) objQueryAssetWidth, contentUri2, c25591);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(1:(4:12|29|30|31)(2:13|14))(1:15))(3:16|(0)|28)|33|19|30|31) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
    
        r2 = r8.getMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0069, code lost:
    
        if (r2 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0073, code lost:
    
        r0.L$0 = r7;
        r0.label = 2;
        r8 = getUri(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007b, code lost:
    
        if (r8 == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0092, code lost:
    
        throw r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // expo.modules.medialibrary.next.objects.asset.delegates.AssetDelegate
    /* JADX INFO: renamed from: move-dXLngQ8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo286movedXLngQ8(String str, n7.f fVar) throws AssetPropertyNotFoundException, ContentResolverNotObtainedException {
        AssetModernDelegate$move$1 assetModernDelegate$move$1;
        if (fVar instanceof AssetModernDelegate$move$1) {
            assetModernDelegate$move$1 = (AssetModernDelegate$move$1) fVar;
            int i10 = assetModernDelegate$move$1.label;
            if ((i10 & androidx.customview.widget.a.INVALID_ID) != 0) {
                assetModernDelegate$move$1.label = i10 - androidx.customview.widget.a.INVALID_ID;
            } else {
                assetModernDelegate$move$1 = new AssetModernDelegate$move$1(this, fVar);
            }
        }
        Object uri = assetModernDelegate$move$1.result;
        Object objE = AbstractC3016b.e();
        int i11 = assetModernDelegate$move$1.label;
        if (i11 == 0) {
            AbstractC2753p.b(uri);
            MediaStorePermissionsDelegate mediaStorePermissionsDelegate = this.mediaStorePermissionsDelegate;
            List listE = AbstractC2800q.e(getContentUri());
            assetModernDelegate$move$1.L$0 = str;
            assetModernDelegate$move$1.label = 1;
            if (mediaStorePermissionsDelegate.requestMediaLibraryWritePermission(listE, assetModernDelegate$move$1) != objE) {
            }
            return objE;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) assetModernDelegate$move$1.L$0;
            AbstractC2753p.b(uri);
            AssetExtensionsKt.m273updateRelativePathAndNameSGAlvP8(getContentResolver(), getContentUri(), str, BuildUniqueDisplayNameKt.buildUniqueDisplayName((Uri) uri));
            return C2735B.f28704a;
        }
        str = (String) assetModernDelegate$move$1.L$0;
        AbstractC2753p.b(uri);
        AssetExtensionsKt.m272updateRelativePathXUFtwTY(getContentResolver(), getContentUri(), str);
        return C2735B.f28704a;
    }
}
