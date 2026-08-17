package expo.modules.image;

import N1.c;
import Q1.k;
import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 22\u00020\u0001:\u000232B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001e\u0010\u001dJ\r\u0010\u001f\u001a\u00020\n¢\u0006\u0004\b\u001f\u0010\u0019R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010 R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001a0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\"\u0010$\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u00101\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u0010.¨\u00064"}, d2 = {"Lexpo/modules/image/SizeDeterminer;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Ljava/lang/ref/WeakReference;", "Lexpo/modules/image/ExpoImageViewWrapper;", "imageViewHolder", "<init>", "(Ljava/lang/ref/WeakReference;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "width", "height", "Li7/B;", "notifyCbs", "(II)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "isViewStateAndSizeValid", "(II)Z", "viewSize", "paramSize", "paddingSize", "getTargetDimen", "(III)I", "size", "isDimensionValid", "(I)Z", "checkCurrentDimens", "()V", "LN1/c;", "cb", "getSize", "(LN1/c;)V", "removeCallback", "clearCallbacksAndListener", "Ljava/lang/ref/WeakReference;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "cbs", "Ljava/util/List;", "waitForLayout", "Z", "getWaitForLayout", "()Z", "setWaitForLayout", "(Z)V", "Lexpo/modules/image/SizeDeterminer$SizeDeterminerLayoutListener;", "layoutListener", "Lexpo/modules/image/SizeDeterminer$SizeDeterminerLayoutListener;", "getTargetHeight", "()I", "targetHeight", "getTargetWidth", "targetWidth", "Companion", "SizeDeterminerLayoutListener", "expo-image_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SizeDeterminer {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int PENDING_SIZE = 0;
    private static Integer maxDisplayLength;
    private final List<c> cbs;
    private final WeakReference<ExpoImageViewWrapper> imageViewHolder;
    private SizeDeterminerLayoutListener layoutListener;
    private boolean waitForLayout;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R(\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0002\u0010\f\u0012\u0004\b\u0007\u0010\u0003\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lexpo/modules/image/SizeDeterminer$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "PENDING_SIZE", PointerEventHelper.POINTER_TYPE_UNKNOWN, "maxDisplayLength", "getMaxDisplayLength$annotations", "getMaxDisplayLength", "()Ljava/lang/Integer;", "setMaxDisplayLength", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "context", "Landroid/content/Context;", "expo-image_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Integer getMaxDisplayLength() {
            return SizeDeterminer.maxDisplayLength;
        }

        public final void setMaxDisplayLength(Integer num) {
            SizeDeterminer.maxDisplayLength = num;
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int getMaxDisplayLength(Context context) {
            if (getMaxDisplayLength() == null) {
                Object systemService = context.getSystemService("window");
                AbstractC2855l.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                Display defaultDisplay = ((WindowManager) k.e((WindowManager) systemService)).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                setMaxDisplayLength(Integer.valueOf(Math.max(point.x, point.y)));
            }
            Integer maxDisplayLength = getMaxDisplayLength();
            AbstractC2855l.d(maxDisplayLength);
            return maxDisplayLength.intValue();
        }

        public static /* synthetic */ void getMaxDisplayLength$annotations() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lexpo/modules/image/SizeDeterminer$SizeDeterminerLayoutListener;", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "sizeDeterminer", "Lexpo/modules/image/SizeDeterminer;", "<init>", "(Lexpo/modules/image/SizeDeterminer;)V", "sizeDeterminerRef", "Ljava/lang/ref/WeakReference;", "onPreDraw", PointerEventHelper.POINTER_TYPE_UNKNOWN, "expo-image_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class SizeDeterminerLayoutListener implements ViewTreeObserver.OnPreDrawListener {
        private final WeakReference<SizeDeterminer> sizeDeterminerRef;

        public SizeDeterminerLayoutListener(SizeDeterminer sizeDeterminer) {
            AbstractC2855l.g(sizeDeterminer, "sizeDeterminer");
            this.sizeDeterminerRef = new WeakReference<>(sizeDeterminer);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            SizeDeterminer sizeDeterminer = this.sizeDeterminerRef.get();
            if (sizeDeterminer == null) {
                return true;
            }
            sizeDeterminer.checkCurrentDimens();
            return true;
        }
    }

    public SizeDeterminer(WeakReference<ExpoImageViewWrapper> imageViewHolder) {
        AbstractC2855l.g(imageViewHolder, "imageViewHolder");
        this.imageViewHolder = imageViewHolder;
        this.cbs = new ArrayList();
    }

    private final int getTargetDimen(int viewSize, int paramSize, int paddingSize) {
        ExpoImageViewWrapper expoImageViewWrapper = this.imageViewHolder.get();
        if (expoImageViewWrapper == null) {
            return androidx.customview.widget.a.INVALID_ID;
        }
        int i10 = paramSize - paddingSize;
        if (i10 > 0) {
            return i10;
        }
        if (this.waitForLayout && expoImageViewWrapper.isLayoutRequested()) {
            return 0;
        }
        int i11 = viewSize - paddingSize;
        if (i11 > 0) {
            return i11;
        }
        if (expoImageViewWrapper.isLayoutRequested() || paramSize != -2) {
            return 0;
        }
        Companion companion = INSTANCE;
        Context context = expoImageViewWrapper.getContext();
        AbstractC2855l.f(context, "getContext(...)");
        return companion.getMaxDisplayLength(context);
    }

    private final int getTargetHeight() {
        ExpoImageViewWrapper expoImageViewWrapper = this.imageViewHolder.get();
        if (expoImageViewWrapper == null) {
            return androidx.customview.widget.a.INVALID_ID;
        }
        int paddingTop = expoImageViewWrapper.getPaddingTop() + expoImageViewWrapper.getPaddingBottom();
        ViewGroup.LayoutParams layoutParams = expoImageViewWrapper.getLayoutParams();
        return getTargetDimen(expoImageViewWrapper.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
    }

    private final int getTargetWidth() {
        ExpoImageViewWrapper expoImageViewWrapper = this.imageViewHolder.get();
        if (expoImageViewWrapper == null) {
            return androidx.customview.widget.a.INVALID_ID;
        }
        int paddingLeft = expoImageViewWrapper.getPaddingLeft() + expoImageViewWrapper.getPaddingRight();
        ViewGroup.LayoutParams layoutParams = expoImageViewWrapper.getLayoutParams();
        return getTargetDimen(expoImageViewWrapper.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
    }

    private final boolean isDimensionValid(int size) {
        return size > 0 || size == Integer.MIN_VALUE;
    }

    private final boolean isViewStateAndSizeValid(int width, int height) {
        return isDimensionValid(width) && isDimensionValid(height);
    }

    private final void notifyCbs(int width, int height) {
        Iterator it = new ArrayList(this.cbs).iterator();
        AbstractC2855l.f(it, "iterator(...)");
        while (it.hasNext()) {
            ((c) it.next()).c(width, height);
        }
    }

    public final void checkCurrentDimens() {
        if (this.cbs.isEmpty()) {
            return;
        }
        int targetWidth = getTargetWidth();
        int targetHeight = getTargetHeight();
        if (isViewStateAndSizeValid(targetWidth, targetHeight)) {
            notifyCbs(targetWidth, targetHeight);
            clearCallbacksAndListener();
        }
    }

    public final void clearCallbacksAndListener() {
        ExpoImageViewWrapper expoImageViewWrapper = this.imageViewHolder.get();
        ViewTreeObserver viewTreeObserver = expoImageViewWrapper != null ? expoImageViewWrapper.getViewTreeObserver() : null;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.layoutListener);
        }
        this.layoutListener = null;
        this.cbs.clear();
    }

    public final void getSize(c cb) {
        AbstractC2855l.g(cb, "cb");
        ExpoImageViewWrapper expoImageViewWrapper = this.imageViewHolder.get();
        if (expoImageViewWrapper == null) {
            return;
        }
        int targetWidth = getTargetWidth();
        int targetHeight = getTargetHeight();
        if (isViewStateAndSizeValid(targetWidth, targetHeight)) {
            cb.c(targetWidth, targetHeight);
            return;
        }
        if (!this.cbs.contains(cb)) {
            this.cbs.add(cb);
        }
        if (this.layoutListener == null) {
            ViewTreeObserver viewTreeObserver = expoImageViewWrapper.getViewTreeObserver();
            SizeDeterminerLayoutListener sizeDeterminerLayoutListener = new SizeDeterminerLayoutListener(this);
            this.layoutListener = sizeDeterminerLayoutListener;
            viewTreeObserver.addOnPreDrawListener(sizeDeterminerLayoutListener);
        }
    }

    public final boolean getWaitForLayout() {
        return this.waitForLayout;
    }

    public final void removeCallback(c cb) {
        AbstractC2855l.g(cb, "cb");
        this.cbs.remove(cb);
    }

    public final void setWaitForLayout(boolean z10) {
        this.waitForLayout = z10;
    }
}
