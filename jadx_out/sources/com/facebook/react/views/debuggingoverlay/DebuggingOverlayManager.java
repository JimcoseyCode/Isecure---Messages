package com.facebook.react.views.debuggingoverlay;

import android.graphics.RectF;
import com.facebook.react.bridge.NoSuchKeyException;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UnexpectedNativeTypeException;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.viewmanagers.DebuggingOverlayManagerDelegate;
import com.facebook.react.viewmanagers.DebuggingOverlayManagerInterface;
import i7.C2735B;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@ReactModule(name = DebuggingOverlayManager.REACT_CLASS)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u001cB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/facebook/react/views/debuggingoverlay/DebuggingOverlayManager;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Lcom/facebook/react/views/debuggingoverlay/DebuggingOverlay;", "Lcom/facebook/react/viewmanagers/DebuggingOverlayManagerInterface;", "<init>", "()V", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "getDelegate", "()Lcom/facebook/react/uimanager/ViewManagerDelegate;", "view", "Lcom/facebook/react/bridge/ReadableArray;", "updates", "Li7/B;", "highlightTraceUpdates", "(Lcom/facebook/react/views/debuggingoverlay/DebuggingOverlay;Lcom/facebook/react/bridge/ReadableArray;)V", "elements", "highlightElements", "clearElementsHighlights", "(Lcom/facebook/react/views/debuggingoverlay/DebuggingOverlay;)V", "Lcom/facebook/react/uimanager/ThemedReactContext;", "context", "createViewInstance", "(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/facebook/react/views/debuggingoverlay/DebuggingOverlay;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getName", "()Ljava/lang/String;", "delegate", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DebuggingOverlayManager extends SimpleViewManager<DebuggingOverlay> implements DebuggingOverlayManagerInterface<DebuggingOverlay> {
    public static final String REACT_CLASS = "DebuggingOverlay";
    private final ViewManagerDelegate<DebuggingOverlay> delegate = new DebuggingOverlayManagerDelegate(this);

    @Override // com.facebook.react.uimanager.ViewManager
    protected ViewManagerDelegate<DebuggingOverlay> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.viewmanagers.DebuggingOverlayManagerInterface
    public void clearElementsHighlights(DebuggingOverlay view) {
        AbstractC2855l.g(view, "view");
        view.clearElementsHighlights();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public DebuggingOverlay createViewInstance(ThemedReactContext context) {
        AbstractC2855l.g(context, "context");
        return new DebuggingOverlay(context);
    }

    @Override // com.facebook.react.viewmanagers.DebuggingOverlayManagerInterface
    public void highlightElements(DebuggingOverlay view, ReadableArray elements) throws Exception {
        AbstractC2855l.g(view, "view");
        AbstractC2855l.g(elements, "elements");
        ArrayList arrayList = new ArrayList();
        int size = elements.size();
        boolean z10 = true;
        for (int i10 = 0; i10 < size; i10++) {
            ReadableMap map = elements.getMap(i10);
            if (map != null) {
                try {
                    float f10 = (float) map.getDouble("x");
                    float f11 = (float) map.getDouble("y");
                    float f12 = (float) (((double) f10) + map.getDouble("width"));
                    float f13 = (float) (((double) f11) + map.getDouble("height"));
                    PixelUtil pixelUtil = PixelUtil.INSTANCE;
                    arrayList.add(new RectF(pixelUtil.dpToPx(f10), pixelUtil.dpToPx(f11), pixelUtil.dpToPx(f12), pixelUtil.dpToPx(f13)));
                } catch (Exception e10) {
                    if (!(e10 instanceof NoSuchKeyException) && !(e10 instanceof UnexpectedNativeTypeException)) {
                        throw e10;
                    }
                    ReactSoftExceptionLogger.logSoftException(REACT_CLASS, new ReactNoCrashSoftException("Unexpected payload for highlighting elements: every element should have x, y, width, height fields"));
                    C2735B c2735b = C2735B.f28704a;
                    z10 = false;
                }
            }
        }
        if (z10) {
            view.setHighlightedElementsRectangles(arrayList);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a3, code lost:
    
        if (r5 == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a5, code lost:
    
        r20.setTraceUpdates(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a8, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
    
        return;
     */
    @Override // com.facebook.react.viewmanagers.DebuggingOverlayManagerInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void highlightTraceUpdates(DebuggingOverlay view, ReadableArray updates) throws Exception {
        boolean z10;
        AbstractC2855l.g(view, "view");
        AbstractC2855l.g(updates, "updates");
        ArrayList arrayList = new ArrayList();
        int size = updates.size();
        boolean z11 = true;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                z10 = z11;
                break;
            }
            ReadableMap map = updates.getMap(i10);
            if (map != null) {
                ReadableMap map2 = map.getMap("rectangle");
                if (map2 == null) {
                    ReactSoftExceptionLogger.logSoftException(REACT_CLASS, new ReactNoCrashSoftException("Unexpected payload for highlighting trace updates: rectangle field is null"));
                    z10 = false;
                    break;
                }
                int i11 = map.getInt("id");
                int i12 = map.getInt(ViewProps.COLOR);
                try {
                    float f10 = (float) map2.getDouble("x");
                    float f11 = (float) map2.getDouble("y");
                    float f12 = (float) (((double) f10) + map2.getDouble("width"));
                    float f13 = (float) (((double) f11) + map2.getDouble("height"));
                    PixelUtil pixelUtil = PixelUtil.INSTANCE;
                    arrayList.add(new TraceUpdate(i11, new RectF(pixelUtil.dpToPx(f10), pixelUtil.dpToPx(f11), pixelUtil.dpToPx(f12), pixelUtil.dpToPx(f13)), i12));
                } catch (Exception e10) {
                    if (!(e10 instanceof NoSuchKeyException) && !(e10 instanceof UnexpectedNativeTypeException)) {
                        throw e10;
                    }
                    ReactSoftExceptionLogger.logSoftException(REACT_CLASS, new ReactNoCrashSoftException("Unexpected payload for highlighting trace updates: rectangle field should have x, y, width, height fields"));
                    C2735B c2735b = C2735B.f28704a;
                    z11 = false;
                }
            }
            i10++;
        }
    }
}
