package expo.modules.image.events;

import M1.e;
import N1.d;
import R8.AbstractC1417k;
import R8.N;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.image.ExpoImageViewWrapper;
import expo.modules.image.enums.ImageCacheType;
import expo.modules.image.records.ImageErrorEvent;
import expo.modules.image.records.ImageLoadEvent;
import expo.modules.image.records.ImageSource;
import expo.modules.image.svg.SVGPictureDrawable;
import expo.modules.kotlin.viewevent.ViewEventCallback;
import i7.AbstractC2753p;
import i7.C2735B;
import java.lang.ref.WeakReference;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import o7.AbstractC3016b;
import v1.EnumC3417a;
import x1.q;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J9\u0010\u0010\u001a\u00020\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J=\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017¨\u0006\u0018"}, d2 = {"Lexpo/modules/image/events/GlideRequestListener;", "LM1/e;", "Landroid/graphics/drawable/Drawable;", "Ljava/lang/ref/WeakReference;", "Lexpo/modules/image/ExpoImageViewWrapper;", "expoImageViewWrapper", "<init>", "(Ljava/lang/ref/WeakReference;)V", "Lx1/q;", "e", PointerEventHelper.POINTER_TYPE_UNKNOWN, "model", "LN1/d;", "target", PointerEventHelper.POINTER_TYPE_UNKNOWN, "isFirstResource", "onLoadFailed", "(Lx1/q;Ljava/lang/Object;LN1/d;Z)Z", "resource", "Lv1/a;", "dataSource", "onResourceReady", "(Landroid/graphics/drawable/Drawable;Ljava/lang/Object;LN1/d;Lv1/a;Z)Z", "Ljava/lang/ref/WeakReference;", "expo-image_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GlideRequestListener implements e {
    private final WeakReference<ExpoImageViewWrapper> expoImageViewWrapper;

    /* JADX INFO: renamed from: expo.modules.image.events.GlideRequestListener$onResourceReady$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.image.events.GlideRequestListener$onResourceReady$1", f = "GlideRequestListener.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LR8/N;", "Li7/B;", "<anonymous>", "(LR8/N;)V"}, k = 3, mv = {2, 1, 0})
    static final class AnonymousClass1 extends l implements Function2 {
        final /* synthetic */ EnumC3417a $dataSource;
        final /* synthetic */ ExpoImageViewWrapper $imageWrapper;
        final /* synthetic */ int $intrinsicHeight;
        final /* synthetic */ int $intrinsicWidth;
        final /* synthetic */ Object $model;
        final /* synthetic */ Drawable $resource;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ExpoImageViewWrapper expoImageViewWrapper, EnumC3417a enumC3417a, Object obj, int i10, int i11, Drawable drawable, n7.f fVar) {
            super(2, fVar);
            this.$imageWrapper = expoImageViewWrapper;
            this.$dataSource = enumC3417a;
            this.$model = obj;
            this.$intrinsicWidth = i10;
            this.$intrinsicHeight = i11;
            this.$resource = drawable;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            return new AnonymousClass1(this.$imageWrapper, this.$dataSource, this.$model, this.$intrinsicWidth, this.$intrinsicHeight, this.$resource, fVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, n7.f fVar) {
            return ((AnonymousClass1) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC3016b.e();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(obj);
            ViewEventCallback<ImageLoadEvent> onLoad$expo_image_release = this.$imageWrapper.getOnLoad$expo_image_release();
            String strName = ImageCacheType.INSTANCE.fromNativeValue(this.$dataSource).name();
            Locale locale = Locale.getDefault();
            AbstractC2855l.f(locale, "getDefault(...)");
            String lowerCase = strName.toLowerCase(locale);
            AbstractC2855l.f(lowerCase, "toLowerCase(...)");
            onLoad$expo_image_release.invoke(new ImageLoadEvent(lowerCase, new ImageSource(this.$model.toString(), this.$intrinsicWidth, this.$intrinsicHeight, null, this.$resource instanceof Animatable)));
            return C2735B.f28704a;
        }
    }

    public GlideRequestListener(WeakReference<ExpoImageViewWrapper> expoImageViewWrapper) {
        AbstractC2855l.g(expoImageViewWrapper, "expoImageViewWrapper");
        this.expoImageViewWrapper = expoImageViewWrapper;
    }

    @Override // M1.e
    public boolean onLoadFailed(q e10, Object model, d target, boolean isFirstResource) {
        String strX0;
        ViewEventCallback<ImageErrorEvent> onError$expo_image_release;
        String message;
        AbstractC2855l.g(target, "target");
        if (e10 == null || (message = e10.getMessage()) == null || (strX0 = P8.q.x0(message, "\n call GlideException#logRootCauses(String) for more detail")) == null) {
            strX0 = "Unknown error";
        }
        ExpoImageViewWrapper expoImageViewWrapper = this.expoImageViewWrapper.get();
        if (expoImageViewWrapper != null && (onError$expo_image_release = expoImageViewWrapper.getOnError$expo_image_release()) != null) {
            onError$expo_image_release.invoke(new ImageErrorEvent(strX0));
        }
        if (e10 == null) {
            return false;
        }
        e10.g("ExpoImage");
        return false;
    }

    @Override // M1.e
    public boolean onResourceReady(Drawable resource, Object model, d target, EnumC3417a dataSource, boolean isFirstResource) {
        AbstractC2855l.g(resource, "resource");
        AbstractC2855l.g(model, "model");
        AbstractC2855l.g(target, "target");
        AbstractC2855l.g(dataSource, "dataSource");
        boolean z10 = resource instanceof SVGPictureDrawable;
        SVGPictureDrawable sVGPictureDrawable = z10 ? (SVGPictureDrawable) resource : null;
        int svgIntrinsicWidth = sVGPictureDrawable != null ? sVGPictureDrawable.getSvgIntrinsicWidth() : resource.getIntrinsicWidth();
        SVGPictureDrawable sVGPictureDrawable2 = z10 ? (SVGPictureDrawable) resource : null;
        int svgIntrinsicHeight = sVGPictureDrawable2 != null ? sVGPictureDrawable2.getSvgIntrinsicHeight() : resource.getIntrinsicHeight();
        ExpoImageViewWrapper expoImageViewWrapper = this.expoImageViewWrapper.get();
        if (expoImageViewWrapper == null) {
            return false;
        }
        AbstractC1417k.d(expoImageViewWrapper.getAppContext().getMainQueue(), null, null, new AnonymousClass1(expoImageViewWrapper, dataSource, model, svgIntrinsicWidth, svgIntrinsicHeight, resource, null), 3, null);
        return false;
    }
}
