package expo.modules.image;

import R8.AbstractC1413i;
import R8.C1404d0;
import R8.J;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.image.records.ImageLoadOptions;
import expo.modules.image.records.SourceMap;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.exception.Exceptions;
import i7.AbstractC2753p;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.AbstractC2855l;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0087@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000f¨\u0006\u0010"}, d2 = {"Lexpo/modules/image/ImageLoadTask;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/kotlin/AppContext;", "appContext", "Lexpo/modules/image/records/SourceMap;", "source", "Lexpo/modules/image/records/ImageLoadOptions;", "options", "<init>", "(Lexpo/modules/kotlin/AppContext;Lexpo/modules/image/records/SourceMap;Lexpo/modules/image/records/ImageLoadOptions;)V", "Lexpo/modules/image/Image;", "load", "(Ln7/f;)Ljava/lang/Object;", "Lexpo/modules/kotlin/AppContext;", "Lexpo/modules/image/records/SourceMap;", "Lexpo/modules/image/records/ImageLoadOptions;", "expo-image_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class ImageLoadTask {
    private final AppContext appContext;
    private final ImageLoadOptions options;
    private final SourceMap source;

    /* JADX INFO: renamed from: expo.modules.image.ImageLoadTask$load$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.image.ImageLoadTask", f = "ImageLoadTask.kt", l = {29}, m = "load")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class AnonymousClass1 extends d {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(n7.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= androidx.customview.widget.a.INVALID_ID;
            return ImageLoadTask.this.load(this);
        }
    }

    public ImageLoadTask(AppContext appContext, SourceMap source, ImageLoadOptions options) {
        AbstractC2855l.g(appContext, "appContext");
        AbstractC2855l.g(source, "source");
        AbstractC2855l.g(options, "options");
        this.appContext = appContext;
        this.source = source;
        this.options = options;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object load(n7.f fVar) {
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
        Object objG = anonymousClass1.result;
        Object objE = AbstractC3016b.e();
        int i11 = anonymousClass1.label;
        try {
            if (i11 == 0) {
                AbstractC2753p.b(objG);
                Context reactContext = this.appContext.getReactContext();
                if (reactContext == null) {
                    throw new Exceptions.ReactContextLost();
                }
                GlideModelProvider glideModelProviderCreateGlideModelProvider = this.source.createGlideModelProvider(reactContext);
                Object glideModel = glideModelProviderCreateGlideModelProvider != null ? glideModelProviderCreateGlideModelProvider.getGlideModel() : null;
                J jB = C1404d0.b();
                ImageLoadTask$load$drawable$1 imageLoadTask$load$drawable$1 = new ImageLoadTask$load$drawable$1(reactContext, glideModel, this, null);
                anonymousClass1.label = 1;
                objG = AbstractC1413i.g(jB, imageLoadTask$load$drawable$1, anonymousClass1);
                if (objG == objE) {
                    return objE;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC2753p.b(objG);
            }
            Drawable drawable = (Drawable) objG;
            if ((drawable instanceof BitmapDrawable) && this.options.getTintColor() != null) {
                ((BitmapDrawable) drawable).setTint(this.options.getTintColor().toArgb());
            }
            AbstractC2855l.d(drawable);
            return new Image(drawable);
        } catch (Exception e10) {
            throw new ImageLoadFailed(e10);
        }
    }
}
