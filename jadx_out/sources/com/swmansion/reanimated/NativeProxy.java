package com.swmansion.reanimated;

import android.os.SystemClock;
import android.provider.Settings;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.devsupport.interfaces.DevOptionHandler;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.turbomodule.core.CallInvokerHolderImpl;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.soloader.SoLoader;
import com.swmansion.gesturehandler.react.RNGestureHandlerModule;
import com.swmansion.reanimated.keyboard.KeyboardAnimationManager;
import com.swmansion.reanimated.keyboard.KeyboardWorkletWrapper;
import com.swmansion.reanimated.nativeProxy.AnimationFrameCallback;
import com.swmansion.reanimated.nativeProxy.EventHandler;
import com.swmansion.reanimated.nativeProxy.SensorSetter;
import com.swmansion.reanimated.sensor.ReanimatedSensorContainer;
import com.swmansion.reanimated.sensor.ReanimatedSensorType;
import com.swmansion.worklets.JSCallInvokerResolver;
import com.swmansion.worklets.WorkletsModule;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import q3.InterfaceC3112a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class NativeProxy {
    private static final int CMD_BACKGROUND_COLOR = 15;
    private static final int CMD_BORDER_BOTTOM_COLOR = 42;
    private static final int CMD_BORDER_BOTTOM_END_RADIUS = 28;
    private static final int CMD_BORDER_BOTTOM_LEFT_RADIUS = 25;
    private static final int CMD_BORDER_BOTTOM_RIGHT_RADIUS = 26;
    private static final int CMD_BORDER_BOTTOM_START_RADIUS = 27;
    private static final int CMD_BORDER_COLOR = 40;
    private static final int CMD_BORDER_END_COLOR = 46;
    private static final int CMD_BORDER_END_END_RADIUS = 32;
    private static final int CMD_BORDER_END_START_RADIUS = 31;
    private static final int CMD_BORDER_LEFT_COLOR = 43;
    private static final int CMD_BORDER_RADIUS = 20;
    private static final int CMD_BORDER_RIGHT_COLOR = 44;
    private static final int CMD_BORDER_START_COLOR = 45;
    private static final int CMD_BORDER_START_END_RADIUS = 30;
    private static final int CMD_BORDER_START_START_RADIUS = 29;
    private static final int CMD_BORDER_TOP_COLOR = 41;
    private static final int CMD_BORDER_TOP_END_RADIUS = 24;
    private static final int CMD_BORDER_TOP_LEFT_RADIUS = 21;
    private static final int CMD_BORDER_TOP_RIGHT_RADIUS = 22;
    private static final int CMD_BORDER_TOP_START_RADIUS = 23;
    private static final int CMD_COLOR = 16;
    private static final int CMD_ELEVATION = 11;
    private static final int CMD_END_OF_TRANSFORM = 3;
    private static final int CMD_END_OF_VIEW = 4;
    private static final int CMD_OPACITY = 10;
    private static final int CMD_SHADOW_OPACITY = 13;
    private static final int CMD_SHADOW_RADIUS = 14;
    private static final int CMD_START_OF_TRANSFORM = 2;
    private static final int CMD_START_OF_VIEW = 1;
    private static final int CMD_TINT_COLOR = 17;
    private static final int CMD_TRANSFORM_MATRIX = 111;
    private static final int CMD_TRANSFORM_PERSPECTIVE = 112;
    private static final int CMD_TRANSFORM_ROTATE = 105;
    private static final int CMD_TRANSFORM_ROTATE_X = 106;
    private static final int CMD_TRANSFORM_ROTATE_Y = 107;
    private static final int CMD_TRANSFORM_ROTATE_Z = 108;
    private static final int CMD_TRANSFORM_SCALE = 102;
    private static final int CMD_TRANSFORM_SCALE_X = 103;
    private static final int CMD_TRANSFORM_SCALE_Y = 104;
    private static final int CMD_TRANSFORM_SKEW_X = 109;
    private static final int CMD_TRANSFORM_SKEW_Y = 110;
    private static final int CMD_TRANSFORM_TRANSLATE_X = 100;
    private static final int CMD_TRANSFORM_TRANSLATE_Y = 101;
    private static final int CMD_UNIT_DEG = 200;
    private static final int CMD_UNIT_PERCENT = 203;
    private static final int CMD_UNIT_PX = 202;
    private static final int CMD_UNIT_RAD = 201;
    private static final int CMD_Z_INDEX = 12;
    private final H6.a gestureHandlerStateManager;
    private final KeyboardAnimationManager keyboardAnimationManager;
    protected final WeakReference<ReactApplicationContext> mContext;
    protected final FabricUIManager mFabricUIManager;

    @InterfaceC3112a
    private final HybridData mHybridData;
    protected NodesManager mNodesManager;
    protected final WorkletsModule mWorkletsModule;
    private final ReanimatedSensorContainer reanimatedSensorContainer;
    private Long firstUptime = Long.valueOf(SystemClock.uptimeMillis());
    private boolean slowAnimationsEnabled = false;
    private final int ANIMATIONS_DRAG_FACTOR = 10;
    protected String cppVersion = null;
    private final AtomicBoolean mInvalidated = new AtomicBoolean(false);

    static {
        SoLoader.t("reanimated");
    }

    public NativeProxy(ReactApplicationContext reactApplicationContext, WorkletsModule workletsModule, NodesManager nodesManager) {
        H6.a aVar = null;
        reactApplicationContext.assertOnJSQueueThread();
        this.mWorkletsModule = workletsModule;
        WeakReference<ReactApplicationContext> weakReference = new WeakReference<>(reactApplicationContext);
        this.mContext = weakReference;
        this.reanimatedSensorContainer = new ReanimatedSensorContainer(weakReference);
        this.keyboardAnimationManager = new KeyboardAnimationManager(weakReference);
        addDevMenuOption();
        try {
            RNGestureHandlerModule.Companion aVar2 = RNGestureHandlerModule.INSTANCE;
            aVar = (H6.a) reactApplicationContext.getNativeModule(RNGestureHandlerModule.class);
        } catch (ClassCastException | ClassNotFoundException unused) {
        }
        this.gestureHandlerStateManager = aVar;
        this.mNodesManager = nodesManager;
        FabricUIManager fabricUIManager = (FabricUIManager) UIManagerHelper.getUIManager(reactApplicationContext, 2);
        this.mFabricUIManager = fabricUIManager;
        CallInvokerHolderImpl jSCallInvokerHolder = JSCallInvokerResolver.getJSCallInvokerHolder(reactApplicationContext);
        JavaScriptContextHolder javaScriptContextHolder = reactApplicationContext.getJavaScriptContextHolder();
        Objects.requireNonNull(javaScriptContextHolder);
        this.mHybridData = initHybrid(workletsModule, javaScriptContextHolder.getContext(), jSCallInvokerHolder, fabricUIManager);
    }

    private void addDevMenuOption() {
        DevMenuUtils.addDevMenuOption(this.mContext.get(), new DevOptionHandler() { // from class: com.swmansion.reanimated.a
            @Override // com.facebook.react.devsupport.interfaces.DevOptionHandler
            public final void onOptionSelected() {
                this.f24966a.toggleSlowAnimations();
            }
        });
    }

    private static String commandToString(int i10) {
        switch (i10) {
            case 10:
                return ViewProps.OPACITY;
            case 11:
                return ViewProps.ELEVATION;
            case 12:
                return ViewProps.Z_INDEX;
            case 13:
                return "shadowOpacity";
            case 14:
                return "shadowRadius";
            case 15:
                return ViewProps.BACKGROUND_COLOR;
            case 16:
                return ViewProps.COLOR;
            case CMD_TINT_COLOR /* 17 */:
                return "tintColor";
            default:
                switch (i10) {
                    case 20:
                        return ViewProps.BORDER_RADIUS;
                    case 21:
                        return ViewProps.BORDER_TOP_LEFT_RADIUS;
                    case 22:
                        return ViewProps.BORDER_TOP_RIGHT_RADIUS;
                    case 23:
                        return ViewProps.BORDER_TOP_START_RADIUS;
                    case 24:
                        return ViewProps.BORDER_TOP_END_RADIUS;
                    case 25:
                        return ViewProps.BORDER_BOTTOM_LEFT_RADIUS;
                    case 26:
                        return ViewProps.BORDER_BOTTOM_RIGHT_RADIUS;
                    case 27:
                        return ViewProps.BORDER_BOTTOM_START_RADIUS;
                    case 28:
                        return ViewProps.BORDER_BOTTOM_END_RADIUS;
                    case 29:
                        return ViewProps.BORDER_START_START_RADIUS;
                    case CMD_BORDER_START_END_RADIUS /* 30 */:
                        return ViewProps.BORDER_START_END_RADIUS;
                    case CMD_BORDER_END_START_RADIUS /* 31 */:
                        return ViewProps.BORDER_END_START_RADIUS;
                    case 32:
                        return ViewProps.BORDER_END_END_RADIUS;
                    default:
                        switch (i10) {
                            case CMD_BORDER_COLOR /* 40 */:
                                return ViewProps.BORDER_COLOR;
                            case CMD_BORDER_TOP_COLOR /* 41 */:
                                return ViewProps.BORDER_TOP_COLOR;
                            case CMD_BORDER_BOTTOM_COLOR /* 42 */:
                                return ViewProps.BORDER_BOTTOM_COLOR;
                            case CMD_BORDER_LEFT_COLOR /* 43 */:
                                return ViewProps.BORDER_LEFT_COLOR;
                            case CMD_BORDER_RIGHT_COLOR /* 44 */:
                                return ViewProps.BORDER_RIGHT_COLOR;
                            case 45:
                                return ViewProps.BORDER_START_COLOR;
                            case CMD_BORDER_END_COLOR /* 46 */:
                                return ViewProps.BORDER_END_COLOR;
                            default:
                                throw new RuntimeException("Unknown command: " + i10);
                        }
                }
        }
    }

    private native HybridData initHybrid(WorkletsModule workletsModule, long j10, CallInvokerHolderImpl callInvokerHolderImpl, FabricUIManager fabricUIManager);

    private native void invalidateCpp();

    /* JADX INFO: Access modifiers changed from: private */
    public void toggleSlowAnimations() {
        boolean z10 = this.slowAnimationsEnabled;
        this.slowAnimationsEnabled = !z10;
        if (!z10) {
            this.firstUptime = Long.valueOf(SystemClock.uptimeMillis());
        }
        this.mNodesManager.enableSlowAnimations(this.slowAnimationsEnabled, 10);
        this.mWorkletsModule.toggleSlowAnimations();
    }

    private static String transformCommandToString(int i10) {
        switch (i10) {
            case CMD_TRANSFORM_TRANSLATE_X /* 100 */:
                return ViewProps.TRANSLATE_X;
            case 101:
                return ViewProps.TRANSLATE_Y;
            case CMD_TRANSFORM_SCALE /* 102 */:
                return "scale";
            case CMD_TRANSFORM_SCALE_X /* 103 */:
                return ViewProps.SCALE_X;
            case CMD_TRANSFORM_SCALE_Y /* 104 */:
                return ViewProps.SCALE_Y;
            case CMD_TRANSFORM_ROTATE /* 105 */:
                return "rotate";
            case CMD_TRANSFORM_ROTATE_X /* 106 */:
                return "rotateX";
            case CMD_TRANSFORM_ROTATE_Y /* 107 */:
                return "rotateY";
            case CMD_TRANSFORM_ROTATE_Z /* 108 */:
                return "rotateZ";
            case CMD_TRANSFORM_SKEW_X /* 109 */:
                return "skewX";
            case CMD_TRANSFORM_SKEW_Y /* 110 */:
                return "skewY";
            case CMD_TRANSFORM_MATRIX /* 111 */:
                return "matrix";
            case CMD_TRANSFORM_PERSPECTIVE /* 112 */:
                return "perspective";
            default:
                throw new RuntimeException("Unknown transform command: " + i10);
        }
    }

    protected void checkCppVersion() {
        if (this.cppVersion == null) {
            throw new RuntimeException("[Reanimated] Java side failed to resolve C++ code version. See https://docs.swmansion.com/react-native-reanimated/docs/guides/troubleshooting#java-side-failed-to-resolve-c-code-version for more information.");
        }
        String reanimatedJavaVersion = getReanimatedJavaVersion();
        if (this.cppVersion.equals(reanimatedJavaVersion)) {
            return;
        }
        throw new RuntimeException("[Reanimated] Mismatch between Java code version and C++ code version (" + reanimatedJavaVersion + " vs. " + this.cppVersion + " respectively). See https://docs.swmansion.com/react-native-reanimated/docs/guides/troubleshooting#mismatch-between-java-code-version-and-c-code-version for more information.");
    }

    @InterfaceC3112a
    public long getAnimationTimestamp() {
        return this.slowAnimationsEnabled ? this.firstUptime.longValue() + ((SystemClock.uptimeMillis() - this.firstUptime.longValue()) / 10) : SystemClock.uptimeMillis();
    }

    protected HybridData getHybridData() {
        return this.mHybridData;
    }

    @InterfaceC3112a
    public boolean getIsReducedMotion() {
        String string = Settings.Global.getString(this.mContext.get().getContentResolver(), "transition_animation_scale");
        return (string != null ? Float.parseFloat(string) : 1.0f) == 0.0f;
    }

    @InterfaceC3112a
    public String getReanimatedJavaVersion() {
        return BuildConfig.REANIMATED_VERSION_JAVA;
    }

    protected native void installJSIBindings();

    protected void invalidate() {
        HybridData hybridData;
        if (this.mInvalidated.getAndSet(true) || (hybridData = this.mHybridData) == null || !hybridData.isValid()) {
            return;
        }
        invalidateCpp();
    }

    public native boolean isAnyHandlerWaitingForEvent(String str, int i10);

    @InterfaceC3112a
    void maybeFlushUIUpdatesQueue() {
        UiThreadUtil.assertOnUiThread();
        if (this.mNodesManager.isAnimationRunning()) {
            return;
        }
        this.mNodesManager.performOperations(false);
    }

    public native void performOperations(boolean z10);

    @InterfaceC3112a
    public boolean preserveMountedTags(int[] iArr) {
        if (!UiThreadUtil.isOnUiThread()) {
            return false;
        }
        for (int i10 = 0; i10 < iArr.length; i10++) {
            if (this.mFabricUIManager.resolveView(iArr[i10]) == null) {
                iArr[i10] = -1;
            }
        }
        return true;
    }

    @InterfaceC3112a
    public void registerEventHandler(EventHandler eventHandler) {
        eventHandler.mCustomEventNamesResolver = this.mNodesManager.getEventNameResolver();
        this.mNodesManager.registerEventHandler(eventHandler);
    }

    @InterfaceC3112a
    public int registerSensor(int i10, int i11, SensorSetter sensorSetter) {
        return this.reanimatedSensorContainer.registerSensor(ReanimatedSensorType.getInstanceById(i10), i11, sensorSetter);
    }

    @InterfaceC3112a
    public void requestRender(AnimationFrameCallback animationFrameCallback) {
        UiThreadUtil.assertOnUiThread();
        this.mNodesManager.postOnAnimation(animationFrameCallback);
    }

    @InterfaceC3112a
    protected void setCppVersion(String str) {
        this.cppVersion = str;
    }

    @InterfaceC3112a
    public void setGestureState(int i10, int i11) {
        H6.a aVar = this.gestureHandlerStateManager;
        if (aVar != null) {
            aVar.setGestureHandlerState(i10, i11);
        }
    }

    @InterfaceC3112a
    public int subscribeForKeyboardEvents(KeyboardWorkletWrapper keyboardWorkletWrapper, boolean z10, boolean z11) {
        return this.keyboardAnimationManager.subscribeForKeyboardUpdates(keyboardWorkletWrapper, z10, z11);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Iterator, java.util.PrimitiveIterator$OfInt] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.PrimitiveIterator$OfDouble] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @InterfaceC3112a
    public void synchronouslyUpdateUIProps(int[] iArr, double[] dArr) {
        String str;
        ?? it = Arrays.stream(iArr).iterator();
        ?? it2 = Arrays.stream(dArr).iterator();
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        int iNextInt = -1;
        while (it.hasNext()) {
            int iNextInt2 = it.nextInt();
            if (iNextInt2 == 1) {
                iNextInt = it.nextInt();
                javaOnlyMap = new JavaOnlyMap();
            } else if (iNextInt2 == 2) {
                JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
                while (true) {
                    int iNextInt3 = it.nextInt();
                    if (iNextInt3 == 3) {
                        javaOnlyMap.putArray(ViewProps.TRANSFORM, javaOnlyArray);
                    } else {
                        String strTransformCommandToString = transformCommandToString(iNextInt3);
                        switch (iNextInt3) {
                            case CMD_TRANSFORM_TRANSLATE_X /* 100 */:
                            case 101:
                                double dNextDouble = it2.nextDouble();
                                int iNextInt4 = it.nextInt();
                                if (iNextInt4 != CMD_UNIT_PX) {
                                    if (iNextInt4 != CMD_UNIT_PERCENT) {
                                        throw new RuntimeException("Unknown unit command");
                                    }
                                    javaOnlyArray.pushMap(JavaOnlyMap.of(strTransformCommandToString, dNextDouble + "%"));
                                } else {
                                    javaOnlyArray.pushMap(JavaOnlyMap.of(strTransformCommandToString, Double.valueOf(dNextDouble)));
                                }
                                break;
                            case CMD_TRANSFORM_SCALE /* 102 */:
                            case CMD_TRANSFORM_SCALE_X /* 103 */:
                            case CMD_TRANSFORM_SCALE_Y /* 104 */:
                            case CMD_TRANSFORM_PERSPECTIVE /* 112 */:
                                javaOnlyArray.pushMap(JavaOnlyMap.of(strTransformCommandToString, Double.valueOf(it2.nextDouble())));
                                break;
                            case CMD_TRANSFORM_ROTATE /* 105 */:
                            case CMD_TRANSFORM_ROTATE_X /* 106 */:
                            case CMD_TRANSFORM_ROTATE_Y /* 107 */:
                            case CMD_TRANSFORM_ROTATE_Z /* 108 */:
                            case CMD_TRANSFORM_SKEW_X /* 109 */:
                            case CMD_TRANSFORM_SKEW_Y /* 110 */:
                                double dNextDouble2 = it2.nextDouble();
                                int iNextInt5 = it.nextInt();
                                if (iNextInt5 == CMD_UNIT_DEG) {
                                    str = "deg";
                                } else {
                                    if (iNextInt5 != CMD_UNIT_RAD) {
                                        throw new RuntimeException("Unknown unit command");
                                    }
                                    str = "rad";
                                }
                                javaOnlyArray.pushMap(JavaOnlyMap.of(strTransformCommandToString, dNextDouble2 + str));
                                break;
                            case CMD_TRANSFORM_MATRIX /* 111 */:
                                int iNextInt6 = it.nextInt();
                                JavaOnlyArray javaOnlyArray2 = new JavaOnlyArray();
                                for (int i10 = 0; i10 < iNextInt6; i10++) {
                                    javaOnlyArray2.pushDouble(it2.nextDouble());
                                }
                                javaOnlyArray.pushMap(JavaOnlyMap.of(strTransformCommandToString, javaOnlyArray2));
                                break;
                            default:
                                throw new RuntimeException("Unknown transform type: " + iNextInt3);
                        }
                    }
                }
            } else if (iNextInt2 != 4) {
                switch (iNextInt2) {
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                        javaOnlyMap.putDouble(commandToString(iNextInt2), it2.nextDouble());
                        break;
                    default:
                        switch (iNextInt2) {
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case CMD_BORDER_START_END_RADIUS /* 30 */:
                            case CMD_BORDER_END_START_RADIUS /* 31 */:
                            case 32:
                                String strCommandToString = commandToString(iNextInt2);
                                double dNextDouble3 = it2.nextDouble();
                                int iNextInt7 = it.nextInt();
                                if (iNextInt7 == CMD_UNIT_PX) {
                                    javaOnlyMap.putDouble(strCommandToString, dNextDouble3);
                                } else {
                                    if (iNextInt7 != CMD_UNIT_PERCENT) {
                                        throw new RuntimeException("Unknown unit command");
                                    }
                                    javaOnlyMap.putString(strCommandToString, dNextDouble3 + "%");
                                }
                                break;
                            default:
                                switch (iNextInt2) {
                                    case CMD_BORDER_COLOR /* 40 */:
                                    case CMD_BORDER_TOP_COLOR /* 41 */:
                                    case CMD_BORDER_BOTTOM_COLOR /* 42 */:
                                    case CMD_BORDER_LEFT_COLOR /* 43 */:
                                    case CMD_BORDER_RIGHT_COLOR /* 44 */:
                                    case 45:
                                    case CMD_BORDER_END_COLOR /* 46 */:
                                        break;
                                    default:
                                        throw new RuntimeException("Unexcepted command: " + iNextInt2);
                                }
                                break;
                        }
                    case 15:
                    case 16:
                    case CMD_TINT_COLOR /* 17 */:
                        javaOnlyMap.putInt(commandToString(iNextInt2), it.nextInt());
                        break;
                }
            } else {
                this.mFabricUIManager.synchronouslyUpdateViewOnUIThread(iNextInt, javaOnlyMap);
            }
        }
    }

    @InterfaceC3112a
    public void unregisterSensor(int i10) {
        this.reanimatedSensorContainer.unregisterSensor(i10);
    }

    @InterfaceC3112a
    public void unsubscribeFromKeyboardEvents(int i10) {
        this.keyboardAnimationManager.unsubscribeFromKeyboardUpdates(i10);
    }
}
