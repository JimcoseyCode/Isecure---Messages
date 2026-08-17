package com.facebook.react.fabric;

import com.facebook.jni.HybridClassBase;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.fabric.mounting.LayoutMetricsConversions;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0010\u0018\u0000 02\u00020\u0001:\u00010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0006H\u0082 ¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u0082 ¢\u0006\u0004\b\u0010\u0010\u0011J`\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u0012H\u0082 ¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010 \u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u0006H\u0082 ¢\u0006\u0004\b \u0010!JM\u0010$\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u0012¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020\b2\b\u0010'\u001a\u0004\u0018\u00010&H\u0086 ¢\u0006\u0004\b(\u0010)J\u0015\u0010+\u001a\u00020\b2\u0006\u0010*\u001a\u00020\u000f¢\u0006\u0004\b+\u0010,R\u0011\u0010\u0007\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b-\u0010\fR\u0011\u0010.\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b.\u0010\u0011R\u0011\u0010\u0003\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b/\u0010\u000e¨\u00061"}, d2 = {"Lcom/facebook/react/fabric/SurfaceHandlerBinding;", "Lcom/facebook/jni/HybridClassBase;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "moduleName", "<init>", "(Ljava/lang/String;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "surfaceId", "Li7/B;", "initHybrid", "(ILjava/lang/String;)V", "_getSurfaceId", "()I", "_getModuleName", "()Ljava/lang/String;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "_isRunning", "()Z", PointerEventHelper.POINTER_TYPE_UNKNOWN, ViewProps.MIN_WIDTH, ViewProps.MAX_WIDTH, ViewProps.MIN_HEIGHT, ViewProps.MAX_HEIGHT, "offsetX", "offsetY", "doLeftAndRightSwapInRTL", "isRTL", "pixelDensity", "fontScale", "setLayoutConstraintsNative", "(FFFFFFZZFF)V", "mode", "setDisplayMode", "(I)V", "widthMeasureSpec", "heightMeasureSpec", "setLayoutConstraints", "(IIIIZZFF)V", "Lcom/facebook/react/bridge/NativeMap;", "props", "setProps", "(Lcom/facebook/react/bridge/NativeMap;)V", "mountable", "setMountable", "(Z)V", "getSurfaceId", "isRunning", "getModuleName", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class SurfaceHandlerBinding extends HybridClassBase {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final int DISPLAY_MODE_HIDDEN = 2;

    @Deprecated
    public static final int DISPLAY_MODE_SUSPENDED = 1;

    @Deprecated
    public static final int DISPLAY_MODE_VISIBLE = 0;
    private static final int NO_SURFACE_ID = 0;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/facebook/react/fabric/SurfaceHandlerBinding$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "NO_SURFACE_ID", PointerEventHelper.POINTER_TYPE_UNKNOWN, "DISPLAY_MODE_VISIBLE", "DISPLAY_MODE_SUSPENDED", "DISPLAY_MODE_HIDDEN", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        FabricSoLoader.staticInit();
    }

    public SurfaceHandlerBinding(String moduleName) {
        AbstractC2855l.g(moduleName, "moduleName");
        initHybrid(0, moduleName);
    }

    private final native String _getModuleName();

    private final native int _getSurfaceId();

    private final native boolean _isRunning();

    private final native void initHybrid(int surfaceId, String moduleName);

    private final native void setDisplayMode(int mode);

    private final native void setLayoutConstraintsNative(float minWidth, float maxWidth, float minHeight, float maxHeight, float offsetX, float offsetY, boolean doLeftAndRightSwapInRTL, boolean isRTL, float pixelDensity, float fontScale);

    public final String getModuleName() {
        return _getModuleName();
    }

    public final int getSurfaceId() {
        return _getSurfaceId();
    }

    public final boolean isRunning() {
        return _isRunning();
    }

    public final void setLayoutConstraints(int widthMeasureSpec, int heightMeasureSpec, int offsetX, int offsetY, boolean doLeftAndRightSwapInRTL, boolean isRTL, float pixelDensity, float fontScale) {
        LayoutMetricsConversions.Companion companion = LayoutMetricsConversions.INSTANCE;
        setLayoutConstraintsNative(companion.getMinSize(widthMeasureSpec) / pixelDensity, companion.getMaxSize(widthMeasureSpec) / pixelDensity, companion.getMinSize(heightMeasureSpec) / pixelDensity, companion.getMaxSize(heightMeasureSpec) / pixelDensity, offsetX / pixelDensity, offsetY / pixelDensity, doLeftAndRightSwapInRTL, isRTL, pixelDensity, fontScale);
    }

    public final void setMountable(boolean mountable) {
        setDisplayMode(!mountable ? 1 : 0);
    }

    public final native void setProps(NativeMap props);
}
