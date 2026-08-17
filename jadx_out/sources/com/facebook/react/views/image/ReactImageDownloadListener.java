package com.facebook.react.views.image;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import com.facebook.drawee.drawable.g;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import w2.InterfaceC3471d;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\t\b\u0010\u0018\u0000 #*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0002$#B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0016\u001a\u0004\u0018\u00018\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0016\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u001b\u0010\u0015J\u001f\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010 \u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b \u0010\u001fJ\u0017\u0010!\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lcom/facebook/react/views/image/ReactImageDownloadListener;", "INFO", "Lcom/facebook/drawee/drawable/g;", "Lw2/d;", "<init>", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "loaded", "total", "Li7/B;", "onProgressChange", "(II)V", "level", PointerEventHelper.POINTER_TYPE_UNKNOWN, "onLevelChange", "(I)Z", PointerEventHelper.POINTER_TYPE_UNKNOWN, "id", PointerEventHelper.POINTER_TYPE_UNKNOWN, "callerContext", "onSubmit", "(Ljava/lang/String;Ljava/lang/Object;)V", "imageInfo", "Landroid/graphics/drawable/Animatable;", "animatable", "onFinalImageSet", "(Ljava/lang/String;Ljava/lang/Object;Landroid/graphics/drawable/Animatable;)V", "onIntermediateImageSet", PointerEventHelper.POINTER_TYPE_UNKNOWN, "throwable", "onIntermediateImageFailed", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "onFailure", "onRelease", "(Ljava/lang/String;)V", "Companion", "EmptyDrawable", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class ReactImageDownloadListener<INFO> extends g implements InterfaceC3471d {
    private static final int MAX_LEVEL = 10000;

    public ReactImageDownloadListener() {
        super(new EmptyDrawable());
    }

    @Override // w2.InterfaceC3471d
    public void onFailure(String id, Throwable throwable) {
        AbstractC2855l.g(id, "id");
        AbstractC2855l.g(throwable, "throwable");
    }

    @Override // w2.InterfaceC3471d
    public void onFinalImageSet(String id, INFO imageInfo, Animatable animatable) {
        AbstractC2855l.g(id, "id");
    }

    @Override // w2.InterfaceC3471d
    public void onIntermediateImageFailed(String id, Throwable throwable) {
        AbstractC2855l.g(id, "id");
        AbstractC2855l.g(throwable, "throwable");
    }

    @Override // w2.InterfaceC3471d
    public void onIntermediateImageSet(String id, INFO imageInfo) {
        AbstractC2855l.g(id, "id");
    }

    @Override // com.facebook.drawee.drawable.g, android.graphics.drawable.Drawable
    protected boolean onLevelChange(int level) {
        onProgressChange(level, 10000);
        return super.onLevelChange(level);
    }

    @Override // w2.InterfaceC3471d
    public void onRelease(String id) {
        AbstractC2855l.g(id, "id");
    }

    @Override // w2.InterfaceC3471d
    public void onSubmit(String id, Object callerContext) {
        AbstractC2855l.g(id, "id");
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0017¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/facebook/react/views/image/ReactImageDownloadListener$EmptyDrawable;", "Landroid/graphics/drawable/Drawable;", "<init>", "()V", "Landroid/graphics/Canvas;", "canvas", "Li7/B;", "draw", "(Landroid/graphics/Canvas;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "alpha", "setAlpha", "(I)V", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "getOpacity", "()I", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class EmptyDrawable extends Drawable {
        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            AbstractC2855l.g(canvas, "canvas");
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -1;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int alpha) {
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
        }
    }

    public void onProgressChange(int loaded, int total) {
    }
}
