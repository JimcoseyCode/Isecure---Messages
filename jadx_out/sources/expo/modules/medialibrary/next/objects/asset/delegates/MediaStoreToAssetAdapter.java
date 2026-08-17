package expo.modules.medialibrary.next.objects.asset.delegates;

import R8.AbstractC1413i;
import R8.C1404d0;
import R8.N;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.net.Uri;
import com.facebook.react.uimanager.drawable.OutsetBoxShadowDrawableKt;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.medialibrary.next.exceptions.ContentResolverNotObtainedException;
import expo.modules.medialibrary.next.extensions.WeakReferenceExtensionsKt;
import expo.modules.medialibrary.next.extensions.resolver.AssetExtensionsKt;
import expo.modules.medialibrary.next.objects.wrappers.MediaType;
import i7.AbstractC2753p;
import i7.C2735B;
import java.io.File;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JD\u0010\r\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u001e\u0010\f\u001a\u001a\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nH\u0082@¢\u0006\u0004\b\r\u0010\u000eJ,\u0010\u0011\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00060\nH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J$\u0010\u0014\u001a\u0004\u0018\u00010\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u0017\u001a\u0004\u0018\u00010\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u0017\u0010\u0015J\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00182\b\u0010\u001c\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001d\u0010\u001bJ\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00182\b\u0010\u001e\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001f\u0010\u001bJ\u0019\u0010\"\u001a\u0004\u0018\u00010\b2\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#R\"\u0010&\u001a\u0010\u0012\f\u0012\n %*\u0004\u0018\u00010\u00020\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020(8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "mediaStoreDimension", "Landroid/net/Uri;", "contentUri", "Lkotlin/Function1;", "Ln7/f;", "fallback", "transformDimension", "(Ljava/lang/Integer;Landroid/net/Uri;Lkotlin/jvm/functions/Function1;Ln7/f;)Ljava/lang/Object;", "Landroid/graphics/BitmapFactory$Options;", "extract", "downloadBitmapAndGet", "(Landroid/net/Uri;Lkotlin/jvm/functions/Function1;Ln7/f;)Ljava/lang/Object;", "mediaStoreHeight", "transformHeight", "(Ljava/lang/Integer;Landroid/net/Uri;Ln7/f;)Ljava/lang/Object;", "mediaStoreWidth", "transformWidth", PointerEventHelper.POINTER_TYPE_UNKNOWN, "mediaStoreDateTaken", "transformCreationTime", "(Ljava/lang/Long;)Ljava/lang/Long;", "mediaStoreDuration", "transformDuration", "mediaStoreDateModified", "transformModificationTime", PointerEventHelper.POINTER_TYPE_UNKNOWN, "mediaStoreData", "transformUri", "(Ljava/lang/String;)Landroid/net/Uri;", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "contextRef", "Ljava/lang/ref/WeakReference;", "Landroid/content/ContentResolver;", "getContentResolver", "()Landroid/content/ContentResolver;", "contentResolver", "expo-media-library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MediaStoreToAssetAdapter {
    private final WeakReference<Context> contextRef;

    /* JADX INFO: renamed from: expo.modules.medialibrary.next.objects.asset.delegates.MediaStoreToAssetAdapter$downloadBitmapAndGet$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.medialibrary.next.objects.asset.delegates.MediaStoreToAssetAdapter$downloadBitmapAndGet$2", f = "MediaStoreToAssetAdapter.kt", l = {56}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LR8/N;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<anonymous>", "(LR8/N;)I"}, k = 3, mv = {2, 1, 0})
    static final class AnonymousClass2 extends l implements Function2 {
        final /* synthetic */ Uri $contentUri;
        final /* synthetic */ Function1 $extract;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Uri uri, Function1 function1, n7.f fVar) {
            super(2, fVar);
            this.$contentUri = uri;
            this.$extract = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            return MediaStoreToAssetAdapter.this.new AnonymousClass2(this.$contentUri, this.$extract, fVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, n7.f fVar) {
            return ((AnonymousClass2) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws ContentResolverNotObtainedException {
            BitmapFactory.Options options;
            Object objE = AbstractC3016b.e();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC2753p.b(obj);
                BitmapFactory.Options options2 = new BitmapFactory.Options();
                options2.inJustDecodeBounds = true;
                ContentResolver contentResolver = MediaStoreToAssetAdapter.this.getContentResolver();
                Uri uri = this.$contentUri;
                this.L$0 = options2;
                this.label = 1;
                Object objQueryAssetData = AssetExtensionsKt.queryAssetData(contentResolver, uri, this);
                if (objQueryAssetData == objE) {
                    return objE;
                }
                options = options2;
                obj = objQueryAssetData;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                options = (BitmapFactory.Options) this.L$0;
                AbstractC2753p.b(obj);
            }
            BitmapFactory.decodeFile((String) obj, options);
            return this.$extract.invoke(options);
        }
    }

    /* JADX INFO: renamed from: expo.modules.medialibrary.next.objects.asset.delegates.MediaStoreToAssetAdapter$transformHeight$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.medialibrary.next.objects.asset.delegates.MediaStoreToAssetAdapter$transformHeight$2", f = "MediaStoreToAssetAdapter.kt", l = {OutsetBoxShadowDrawableKt.MIN_OUTSET_BOX_SHADOW_SDK_VERSION}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", PointerEventHelper.POINTER_TYPE_UNKNOWN}, k = 3, mv = {2, 1, 0}, xi = 48)
    static final class C25602 extends l implements Function1 {
        final /* synthetic */ Uri $contentUri;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C25602(Uri uri, n7.f fVar) {
            super(1, fVar);
            this.$contentUri = uri;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(n7.f fVar) {
            return MediaStoreToAssetAdapter.this.new C25602(this.$contentUri, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC3016b.e();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC2753p.b(obj);
                return obj;
            }
            AbstractC2753p.b(obj);
            MediaStoreToAssetAdapter mediaStoreToAssetAdapter = MediaStoreToAssetAdapter.this;
            Uri uri = this.$contentUri;
            Function1 function1 = new Function1() { // from class: expo.modules.medialibrary.next.objects.asset.delegates.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return Integer.valueOf(((BitmapFactory.Options) obj2).outHeight);
                }
            };
            this.label = 1;
            Object objDownloadBitmapAndGet = mediaStoreToAssetAdapter.downloadBitmapAndGet(uri, function1, this);
            return objDownloadBitmapAndGet == objE ? objE : objDownloadBitmapAndGet;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(n7.f fVar) {
            return ((C25602) create(fVar)).invokeSuspend(C2735B.f28704a);
        }
    }

    /* JADX INFO: renamed from: expo.modules.medialibrary.next.objects.asset.delegates.MediaStoreToAssetAdapter$transformWidth$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.medialibrary.next.objects.asset.delegates.MediaStoreToAssetAdapter$transformWidth$2", f = "MediaStoreToAssetAdapter.kt", l = {34}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", PointerEventHelper.POINTER_TYPE_UNKNOWN}, k = 3, mv = {2, 1, 0}, xi = 48)
    static final class C25612 extends l implements Function1 {
        final /* synthetic */ Uri $contentUri;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C25612(Uri uri, n7.f fVar) {
            super(1, fVar);
            this.$contentUri = uri;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(n7.f fVar) {
            return MediaStoreToAssetAdapter.this.new C25612(this.$contentUri, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC3016b.e();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC2753p.b(obj);
                return obj;
            }
            AbstractC2753p.b(obj);
            MediaStoreToAssetAdapter mediaStoreToAssetAdapter = MediaStoreToAssetAdapter.this;
            Uri uri = this.$contentUri;
            Function1 function1 = new Function1() { // from class: expo.modules.medialibrary.next.objects.asset.delegates.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return Integer.valueOf(((BitmapFactory.Options) obj2).outWidth);
                }
            };
            this.label = 1;
            Object objDownloadBitmapAndGet = mediaStoreToAssetAdapter.downloadBitmapAndGet(uri, function1, this);
            return objDownloadBitmapAndGet == objE ? objE : objDownloadBitmapAndGet;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(n7.f fVar) {
            return ((C25612) create(fVar)).invokeSuspend(C2735B.f28704a);
        }
    }

    public MediaStoreToAssetAdapter(Context context) {
        AbstractC2855l.g(context, "context");
        this.contextRef = new WeakReference<>(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object downloadBitmapAndGet(Uri uri, Function1 function1, n7.f fVar) {
        return AbstractC1413i.g(C1404d0.b(), new AnonymousClass2(uri, function1, null), fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ContentResolver getContentResolver() throws ContentResolverNotObtainedException {
        ContentResolver contentResolver = WeakReferenceExtensionsKt.getOrThrow(this.contextRef).getContentResolver();
        if (contentResolver != null) {
            return contentResolver;
        }
        throw new ContentResolverNotObtainedException(null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object transformDimension(Integer num, Uri uri, Function1 function1, n7.f fVar) {
        if (MediaType.INSTANCE.fromContentUri(uri) == MediaType.IMAGE && (num == null || num.intValue() <= 0)) {
            return function1.invoke(fVar);
        }
        if (num == null || num.intValue() <= 0) {
            return null;
        }
        return num;
    }

    public final Long transformCreationTime(Long mediaStoreDateTaken) {
        if (mediaStoreDateTaken != null && mediaStoreDateTaken.longValue() == 0) {
            return null;
        }
        return mediaStoreDateTaken;
    }

    public final Long transformDuration(Long mediaStoreDuration) {
        if (mediaStoreDuration != null && mediaStoreDuration.longValue() == 0) {
            return null;
        }
        return mediaStoreDuration;
    }

    public final Object transformHeight(Integer num, Uri uri, n7.f fVar) {
        return transformDimension(num, uri, new C25602(uri, null), fVar);
    }

    public final Long transformModificationTime(Long mediaStoreDateModified) {
        if (mediaStoreDateModified != null) {
            if (mediaStoreDateModified.longValue() == 0) {
                mediaStoreDateModified = null;
            }
            if (mediaStoreDateModified != null) {
                return Long.valueOf(Q8.a.v(Q8.c.j(mediaStoreDateModified.longValue(), Q8.d.f9889k)));
            }
        }
        return null;
    }

    public final Uri transformUri(String mediaStoreData) {
        if (mediaStoreData != null) {
            return Uri.fromFile(new File(mediaStoreData));
        }
        return null;
    }

    public final Object transformWidth(Integer num, Uri uri, n7.f fVar) {
        return transformDimension(num, uri, new C25612(uri, null), fVar);
    }
}
