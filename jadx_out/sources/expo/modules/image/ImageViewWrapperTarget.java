package expo.modules.image;

import M1.c;
import N1.d;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.k;
import com.bumptech.glide.request.ThumbnailRequestCoordinator;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import expo.modules.image.enums.ContentFit;
import i7.C2735B;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import l1.AbstractC2861a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00022\u0010\u0010\u0011\u001a\f\u0012\u0006\b\u0000\u0012\u00020\u0002\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\nJ\u000f\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\nJ\u000f\u0010\u0016\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\nJ\u0019\u0010\u0018\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001b\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u0019J\u0019\u0010\u001c\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u0019J\u0017\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b!\u0010 J\u0019\u0010$\u001a\u00020\b2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010%J\u0011\u0010&\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b&\u0010'J\u0015\u0010*\u001a\u00020\b2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010,R\"\u0010.\u001a\u00020-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u00104\u001a\u00020-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010/\u001a\u0004\b4\u00101\"\u0004\b5\u00103R\"\u00106\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010\u000eR\"\u0010;\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u00107\u001a\u0004\b<\u00109\"\u0004\b=\u0010\u000eR\"\u0010>\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u00107\u001a\u0004\b?\u00109\"\u0004\b@\u0010\u000eR\"\u0010A\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u00107\u001a\u0004\bB\u00109\"\u0004\bC\u0010\u000eR\u0016\u0010D\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u00107R$\u0010F\u001a\u0004\u0018\u00010E8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010LR\u0016\u0010N\u001a\u00020M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010O¨\u0006P"}, d2 = {"Lexpo/modules/image/ImageViewWrapperTarget;", "LN1/d;", "Landroid/graphics/drawable/Drawable;", "Ljava/lang/ref/WeakReference;", "Lexpo/modules/image/ExpoImageViewWrapper;", "imageViewHolder", "<init>", "(Ljava/lang/ref/WeakReference;)V", "Li7/B;", "endLoadingNewImageTraceBlock", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "newValue", "setCookie", "(I)V", "resource", "LO1/b;", "transition", "onResourceReady", "(Landroid/graphics/drawable/Drawable;LO1/b;)V", "onStart", "onStop", "onDestroy", ReactTextInputShadowNode.PROP_PLACEHOLDER, "onLoadStarted", "(Landroid/graphics/drawable/Drawable;)V", "errorDrawable", "onLoadFailed", "onLoadCleared", "LN1/c;", "cb", "getSize", "(LN1/c;)V", "removeCallback", "LM1/c;", "request", "setRequest", "(LM1/c;)V", "getRequest", "()LM1/c;", "Lcom/bumptech/glide/k;", "requestManager", "clear", "(Lcom/bumptech/glide/k;)V", "Ljava/lang/ref/WeakReference;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "hasSource", "Z", "getHasSource", "()Z", "setHasSource", "(Z)V", "isUsed", "setUsed", "sourceHeight", "I", "getSourceHeight", "()I", "setSourceHeight", "sourceWidth", "getSourceWidth", "setSourceWidth", "placeholderHeight", "getPlaceholderHeight", "setPlaceholderHeight", "placeholderWidth", "getPlaceholderWidth", "setPlaceholderWidth", "cookie", "Lexpo/modules/image/enums/ContentFit;", "placeholderContentFit", "Lexpo/modules/image/enums/ContentFit;", "getPlaceholderContentFit", "()Lexpo/modules/image/enums/ContentFit;", "setPlaceholderContentFit", "(Lexpo/modules/image/enums/ContentFit;)V", "LM1/c;", "Lexpo/modules/image/SizeDeterminer;", "sizeDeterminer", "Lexpo/modules/image/SizeDeterminer;", "expo-image_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ImageViewWrapperTarget implements d {
    private int cookie;
    private boolean hasSource;
    private final WeakReference<ExpoImageViewWrapper> imageViewHolder;
    private boolean isUsed;
    private ContentFit placeholderContentFit;
    private int placeholderHeight;
    private int placeholderWidth;
    private c request;
    private SizeDeterminer sizeDeterminer;
    private int sourceHeight;
    private int sourceWidth;

    public ImageViewWrapperTarget(WeakReference<ExpoImageViewWrapper> imageViewHolder) {
        AbstractC2855l.g(imageViewHolder, "imageViewHolder");
        this.imageViewHolder = imageViewHolder;
        this.sourceHeight = -1;
        this.sourceWidth = -1;
        this.placeholderHeight = -1;
        this.placeholderWidth = -1;
        this.cookie = -1;
        this.sizeDeterminer = new SizeDeterminer(imageViewHolder);
    }

    private final void endLoadingNewImageTraceBlock() {
        synchronized (this) {
            if (this.cookie >= 0) {
                Trace trace = Trace.INSTANCE;
                String tag = trace.getTag();
                String loadNewImageBlock = trace.getLoadNewImageBlock();
                AbstractC2861a.d("[" + tag + "] " + loadNewImageBlock, this.cookie);
                this.cookie = -1;
            }
            C2735B c2735b = C2735B.f28704a;
        }
    }

    public final void clear(k requestManager) {
        AbstractC2855l.g(requestManager, "requestManager");
        this.sizeDeterminer.clearCallbacksAndListener();
        requestManager.e(this);
    }

    public final boolean getHasSource() {
        return this.hasSource;
    }

    public final ContentFit getPlaceholderContentFit() {
        return this.placeholderContentFit;
    }

    public final int getPlaceholderHeight() {
        return this.placeholderHeight;
    }

    public final int getPlaceholderWidth() {
        return this.placeholderWidth;
    }

    @Override // N1.d
    public c getRequest() {
        return this.request;
    }

    @Override // N1.d
    public void getSize(N1.c cb) {
        AbstractC2855l.g(cb, "cb");
        if (this.imageViewHolder.get() == null) {
            cb.c(androidx.customview.widget.a.INVALID_ID, androidx.customview.widget.a.INVALID_ID);
        } else {
            this.sizeDeterminer.getSize(cb);
        }
    }

    public final int getSourceHeight() {
        return this.sourceHeight;
    }

    public final int getSourceWidth() {
        return this.sourceWidth;
    }

    /* JADX INFO: renamed from: isUsed, reason: from getter */
    public final boolean getIsUsed() {
        return this.isUsed;
    }

    @Override // N1.d
    public void onLoadFailed(Drawable errorDrawable) {
        endLoadingNewImageTraceBlock();
    }

    @Override // N1.d
    public void removeCallback(N1.c cb) {
        AbstractC2855l.g(cb, "cb");
        this.sizeDeterminer.removeCallback(cb);
    }

    public final void setCookie(int newValue) {
        endLoadingNewImageTraceBlock();
        synchronized (this) {
            this.cookie = newValue;
            C2735B c2735b = C2735B.f28704a;
        }
    }

    public final void setHasSource(boolean z10) {
        this.hasSource = z10;
    }

    public final void setPlaceholderContentFit(ContentFit contentFit) {
        this.placeholderContentFit = contentFit;
    }

    public final void setPlaceholderHeight(int i10) {
        this.placeholderHeight = i10;
    }

    public final void setPlaceholderWidth(int i10) {
        this.placeholderWidth = i10;
    }

    @Override // N1.d
    public void setRequest(c request) {
        this.request = request;
    }

    public final void setSourceHeight(int i10) {
        this.sourceHeight = i10;
    }

    public final void setSourceWidth(int i10) {
        this.sourceWidth = i10;
    }

    public final void setUsed(boolean z10) {
        this.isUsed = z10;
    }

    @Override // N1.d
    public void onResourceReady(Drawable resource, O1.b transition) {
        c privateFullRequest;
        AbstractC2855l.g(resource, "resource");
        ExpoImageViewWrapper expoImageViewWrapper = this.imageViewHolder.get();
        if (expoImageViewWrapper == null) {
            endLoadingNewImageTraceBlock();
            return;
        }
        ExpoImageViewWrapper expoImageViewWrapper2 = expoImageViewWrapper;
        c cVar = this.request;
        boolean z10 = false;
        if (cVar instanceof ThumbnailRequestCoordinator) {
            ThumbnailRequestCoordinator thumbnailRequestCoordinator = cVar instanceof ThumbnailRequestCoordinator ? (ThumbnailRequestCoordinator) cVar : null;
            if (thumbnailRequestCoordinator != null && (privateFullRequest = ThumbnailRequestCoordinatorExtensionKt.getPrivateFullRequest(thumbnailRequestCoordinator)) != null && !privateFullRequest.isComplete()) {
                z10 = true;
            }
        }
        if (!z10) {
            endLoadingNewImageTraceBlock();
        }
        expoImageViewWrapper2.onResourceReady(this, resource, z10);
    }

    @Override // J1.l
    public void onDestroy() {
    }

    @Override // J1.l
    public void onStart() {
    }

    @Override // J1.l
    public void onStop() {
    }

    @Override // N1.d
    public void onLoadCleared(Drawable placeholder) {
    }

    @Override // N1.d
    public void onLoadStarted(Drawable placeholder) {
    }
}
