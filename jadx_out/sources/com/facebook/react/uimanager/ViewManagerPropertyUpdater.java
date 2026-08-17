package com.facebook.react.uimanager;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.ViewManagersPropertyCache;
import com.facebook.react.uimanager.events.PointerEventHelper;
import d2.AbstractC2325a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001:\u0006/01234B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003JA\u0010\u000e\u001a\u00020\u0004\"\u000e\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00010\u0006\"\b\b\u0001\u0010\t*\u00020\b2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u00012\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ;\u0010\u000e\u001a\u00020\u0004\"\b\b\u0000\u0010\t*\u00020\b2\u0010\u0010\u0011\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u00102\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u0012J/\u0010\u000e\u001a\u00020\u0004\"\u000e\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00132\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u0015JG\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0018\u0010\u0018\u001a\u0014\u0012\u0010\b\u0001\u0012\f\u0012\u0004\u0012\u00020\u0017\u0012\u0002\b\u00030\u00100\u00162\u0010\u0010\u0019\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0017\u0018\u00010\u0016H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJI\u0010 \u001a\u0018\u0012\u000e\u0012\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0010\u0012\u0004\u0012\u00028\u00000\u001f\"\b\b\u0000\u0010\t*\u00020\b2\u0018\u0010\u001e\u001a\u0014\u0012\u0010\b\u0001\u0012\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u00100\u0016H\u0002¢\u0006\u0004\b \u0010!J5\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#\"\u000e\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00132\u000e\u0010\"\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0016H\u0002¢\u0006\u0004\b$\u0010%J#\u0010'\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00072\n\u0010&\u001a\u0006\u0012\u0002\b\u00030\u0016H\u0002¢\u0006\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\u001b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010*R,\u0010,\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0016\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001f0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R(\u0010.\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030#0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010-¨\u00065"}, d2 = {"Lcom/facebook/react/uimanager/ViewManagerPropertyUpdater;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "Li7/B;", "clear", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "T", "Landroid/view/View;", "V", "delegate", "view", "Lcom/facebook/react/uimanager/ReactStylesDiffMap;", "props", "updateProps", "(Lcom/facebook/react/uimanager/ViewManagerDelegate;Landroid/view/View;Lcom/facebook/react/uimanager/ReactStylesDiffMap;)V", "Lcom/facebook/react/uimanager/ViewManager;", "manager", "(Lcom/facebook/react/uimanager/ViewManager;Landroid/view/View;Lcom/facebook/react/uimanager/ReactStylesDiffMap;)V", "Lcom/facebook/react/uimanager/ReactShadowNode;", "node", "(Lcom/facebook/react/uimanager/ReactShadowNode;Lcom/facebook/react/uimanager/ReactStylesDiffMap;)V", "Ljava/lang/Class;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "viewManagerTopClass", "shadowNodeTopClass", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "getNativeProps", "(Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/Map;", "managerClass", "Lcom/facebook/react/uimanager/ViewManagerPropertyUpdater$ViewManagerSetter;", "findManagerSetter", "(Ljava/lang/Class;)Lcom/facebook/react/uimanager/ViewManagerPropertyUpdater$ViewManagerSetter;", "nodeClass", "Lcom/facebook/react/uimanager/ViewManagerPropertyUpdater$ShadowNodeSetter;", "findNodeSetter", "(Ljava/lang/Class;)Lcom/facebook/react/uimanager/ViewManagerPropertyUpdater$ShadowNodeSetter;", "cls", "findGeneratedSetter", "(Ljava/lang/Class;)Ljava/lang/Object;", "TAG", "Ljava/lang/String;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "VIEW_MANAGER_SETTER_MAP", "Ljava/util/Map;", "SHADOW_NODE_SETTER_MAP", "Settable", "ViewManagerSetter", "ShadowNodeSetter", "FallbackViewManagerSetter", "FallbackShadowNodeSetter", "GenericViewManagerDelegate", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ViewManagerPropertyUpdater {
    private static final String TAG = "ViewManagerPropertyUpdater";
    public static final ViewManagerPropertyUpdater INSTANCE = new ViewManagerPropertyUpdater();
    private static final Map<Class<?>, ViewManagerSetter<?, ?>> VIEW_MANAGER_SETTER_MAP = new HashMap();
    private static final Map<Class<?>, ShadowNodeSetter<?>> SHADOW_NODE_SETTER_MAP = new HashMap();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\u000e\u001a\u00020\r2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0012\u001a\u00020\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/facebook/react/uimanager/ViewManagerPropertyUpdater$FallbackShadowNodeSetter;", "Lcom/facebook/react/uimanager/ViewManagerPropertyUpdater$ShadowNodeSetter;", "Lcom/facebook/react/uimanager/ReactShadowNode;", "Ljava/lang/Class;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "shadowNodeClass", "<init>", "(Ljava/lang/Class;)V", "node", PointerEventHelper.POINTER_TYPE_UNKNOWN, "name", PointerEventHelper.POINTER_TYPE_UNKNOWN, "value", "Li7/B;", "setProperty", "(Lcom/facebook/react/uimanager/ReactShadowNode;Ljava/lang/String;Ljava/lang/Object;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "props", "getProperties", "(Ljava/util/Map;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/react/uimanager/ViewManagersPropertyCache$PropSetter;", "propSetters", "Ljava/util/Map;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class FallbackShadowNodeSetter implements ShadowNodeSetter<ReactShadowNode<?>> {
        private final Map<String, ViewManagersPropertyCache.PropSetter> propSetters;

        public FallbackShadowNodeSetter(Class shadowNodeClass) {
            AbstractC2855l.g(shadowNodeClass, "shadowNodeClass");
            Map<String, ViewManagersPropertyCache.PropSetter> nativePropSettersForShadowNodeClass = ViewManagersPropertyCache.getNativePropSettersForShadowNodeClass(shadowNodeClass);
            AbstractC2855l.f(nativePropSettersForShadowNodeClass, "getNativePropSettersForShadowNodeClass(...)");
            this.propSetters = nativePropSettersForShadowNodeClass;
        }

        @Override // com.facebook.react.uimanager.ViewManagerPropertyUpdater.Settable
        public void getProperties(Map<String, String> props) {
            AbstractC2855l.g(props, "props");
            for (ViewManagersPropertyCache.PropSetter propSetter : this.propSetters.values()) {
                props.put(propSetter.getPropName(), propSetter.getPropType());
            }
        }

        @Override // com.facebook.react.uimanager.ViewManagerPropertyUpdater.ShadowNodeSetter
        public void setProperty(ReactShadowNode<?> node, String name, Object value) {
            AbstractC2855l.g(node, "node");
            AbstractC2855l.g(name, "name");
            ViewManagersPropertyCache.PropSetter propSetter = this.propSetters.get(name);
            if (propSetter != null) {
                propSetter.updateShadowNodeProp(node, value);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u0018\u0012\u000e\u0012\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00028\u00000\u0003B!\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0010\b\u0001\u0012\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u00040\u0005¢\u0006\u0004\b\u0007\u0010\bJ;\u0010\u0010\u001a\u00020\u000f2\u0010\u0010\t\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u00042\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0014\u001a\u00020\u000f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/facebook/react/uimanager/ViewManagerPropertyUpdater$FallbackViewManagerSetter;", "Landroid/view/View;", "V", "Lcom/facebook/react/uimanager/ViewManagerPropertyUpdater$ViewManagerSetter;", "Lcom/facebook/react/uimanager/ViewManager;", "Ljava/lang/Class;", "viewManagerClass", "<init>", "(Ljava/lang/Class;)V", "manager", "view", PointerEventHelper.POINTER_TYPE_UNKNOWN, "name", PointerEventHelper.POINTER_TYPE_UNKNOWN, "value", "Li7/B;", "setProperty", "(Lcom/facebook/react/uimanager/ViewManager;Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "props", "getProperties", "(Ljava/util/Map;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/react/uimanager/ViewManagersPropertyCache$PropSetter;", "propSetters", "Ljava/util/Map;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class FallbackViewManagerSetter<V extends View> implements ViewManagerSetter<ViewManager<V, ?>, V> {
        private final Map<String, ViewManagersPropertyCache.PropSetter> propSetters;

        public FallbackViewManagerSetter(Class<? extends ViewManager<V, ?>> viewManagerClass) {
            AbstractC2855l.g(viewManagerClass, "viewManagerClass");
            Map<String, ViewManagersPropertyCache.PropSetter> nativePropSettersForViewManagerClass = ViewManagersPropertyCache.getNativePropSettersForViewManagerClass(viewManagerClass);
            AbstractC2855l.f(nativePropSettersForViewManagerClass, "getNativePropSettersForViewManagerClass(...)");
            this.propSetters = nativePropSettersForViewManagerClass;
        }

        @Override // com.facebook.react.uimanager.ViewManagerPropertyUpdater.Settable
        public void getProperties(Map<String, String> props) {
            AbstractC2855l.g(props, "props");
            for (ViewManagersPropertyCache.PropSetter propSetter : this.propSetters.values()) {
                props.put(propSetter.getPropName(), propSetter.getPropType());
            }
        }

        @Override // com.facebook.react.uimanager.ViewManagerPropertyUpdater.ViewManagerSetter
        public void setProperty(ViewManager<V, ?> manager, V view, String name, Object value) {
            AbstractC2855l.g(manager, "manager");
            AbstractC2855l.g(view, "view");
            AbstractC2855l.g(name, "name");
            ViewManagersPropertyCache.PropSetter propSetter = this.propSetters.get(name);
            if (propSetter != null) {
                propSetter.updateViewProp(manager, view, value);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0019\u0012\u0010\u0010\u0005\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0013\u001a\u00020\r2\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0005\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R*\u0010\u0017\u001a\u0018\u0012\u000e\u0012\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00028\u00000\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/facebook/react/uimanager/ViewManagerPropertyUpdater$GenericViewManagerDelegate;", "Landroid/view/View;", "T", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "Lcom/facebook/react/uimanager/ViewManager;", "manager", "<init>", "(Lcom/facebook/react/uimanager/ViewManager;)V", "view", PointerEventHelper.POINTER_TYPE_UNKNOWN, "propName", PointerEventHelper.POINTER_TYPE_UNKNOWN, "value", "Li7/B;", "setProperty", "(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)V", "commandName", "Lcom/facebook/react/bridge/ReadableArray;", "args", "receiveCommand", "(Landroid/view/View;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V", "Lcom/facebook/react/uimanager/ViewManager;", "Lcom/facebook/react/uimanager/ViewManagerPropertyUpdater$ViewManagerSetter;", "setter", "Lcom/facebook/react/uimanager/ViewManagerPropertyUpdater$ViewManagerSetter;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class GenericViewManagerDelegate<T extends View> implements ViewManagerDelegate<T> {
        private final ViewManager<T, ?> manager;
        private final ViewManagerSetter<ViewManager<T, ?>, T> setter;

        public GenericViewManagerDelegate(ViewManager<T, ?> manager) {
            AbstractC2855l.g(manager, "manager");
            this.manager = manager;
            this.setter = ViewManagerPropertyUpdater.INSTANCE.findManagerSetter(manager.getClass());
        }

        @Override // com.facebook.react.uimanager.ViewManagerDelegate
        /* JADX INFO: renamed from: receiveCommand, reason: merged with bridge method [inline-methods] */
        public void kotlinCompat$receiveCommand(T view, String commandName, ReadableArray args) {
            AbstractC2855l.g(view, "view");
            AbstractC2855l.g(commandName, "commandName");
            AbstractC2855l.g(args, "args");
        }

        @Override // com.facebook.react.uimanager.ViewManagerDelegate
        /* JADX INFO: renamed from: setProperty, reason: merged with bridge method [inline-methods] */
        public void kotlinCompat$setProperty(T view, String propName, Object value) {
            AbstractC2855l.g(view, "view");
            AbstractC2855l.g(propName, "propName");
            this.setter.setProperty(this.manager, view, propName, value);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/uimanager/ViewManagerPropertyUpdater$Settable;", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "props", "Li7/B;", "getProperties", "(Ljava/util/Map;)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Settable {
        void getProperties(Map<String, String> props);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u000e\b\u0000\u0010\u0002 \u0000*\u0006\u0012\u0002\b\u00030\u00012\u00020\u0003J)\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/uimanager/ViewManagerPropertyUpdater$ShadowNodeSetter;", "Lcom/facebook/react/uimanager/ReactShadowNode;", "T", "Lcom/facebook/react/uimanager/ViewManagerPropertyUpdater$Settable;", "node", PointerEventHelper.POINTER_TYPE_UNKNOWN, "name", PointerEventHelper.POINTER_TYPE_UNKNOWN, "value", "Li7/B;", "setProperty", "(Lcom/facebook/react/uimanager/ReactShadowNode;Ljava/lang/String;Ljava/lang/Object;)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ShadowNodeSetter<T extends ReactShadowNode<?>> extends Settable {
        void setProperty(T node, String name, Object value);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0012\b\u0000\u0010\u0002*\f\u0012\u0004\u0012\u00028\u0001\u0012\u0002\b\u00030\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u00020\u0005J1\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u00012\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/uimanager/ViewManagerPropertyUpdater$ViewManagerSetter;", "Lcom/facebook/react/uimanager/ViewManager;", "T", "Landroid/view/View;", "V", "Lcom/facebook/react/uimanager/ViewManagerPropertyUpdater$Settable;", "manager", "view", PointerEventHelper.POINTER_TYPE_UNKNOWN, "name", PointerEventHelper.POINTER_TYPE_UNKNOWN, "value", "Li7/B;", "setProperty", "(Lcom/facebook/react/uimanager/ViewManager;Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ViewManagerSetter<T extends ViewManager<V, ?>, V extends View> extends Settable {
        void setProperty(T manager, V view, String name, Object value);
    }

    private ViewManagerPropertyUpdater() {
    }

    public static final void clear() {
        ViewManagersPropertyCache.clear();
        VIEW_MANAGER_SETTER_MAP.clear();
        SHADOW_NODE_SETTER_MAP.clear();
    }

    private final <T> T findGeneratedSetter(Class<?> cls) {
        String name = cls.getName();
        try {
            return (T) Class.forName(name + "$$PropsSetter").newInstance();
        } catch (ClassNotFoundException unused) {
            AbstractC2325a.I(TAG, "Could not find generated setter for " + cls);
            return null;
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Unable to instantiate methods getter for " + name, e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("Unable to instantiate methods getter for " + name, e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <V extends View> ViewManagerSetter<ViewManager<V, ?>, V> findManagerSetter(Class<? extends ViewManager<V, ?>> managerClass) {
        Map<Class<?>, ViewManagerSetter<?, ?>> map = VIEW_MANAGER_SETTER_MAP;
        ViewManagerSetter<ViewManager<V, ?>, V> fallbackViewManagerSetter = (ViewManagerSetter) map.get(managerClass);
        if (fallbackViewManagerSetter == null) {
            fallbackViewManagerSetter = (ViewManagerSetter) findGeneratedSetter(managerClass);
            if (fallbackViewManagerSetter == null) {
                fallbackViewManagerSetter = new FallbackViewManagerSetter<>(managerClass);
            }
            map.put(managerClass, fallbackViewManagerSetter);
        }
        return fallbackViewManagerSetter;
    }

    private final <T extends ReactShadowNode<T>> ShadowNodeSetter<T> findNodeSetter(Class<? extends T> nodeClass) {
        Map<Class<?>, ShadowNodeSetter<?>> map = SHADOW_NODE_SETTER_MAP;
        ShadowNodeSetter<T> fallbackShadowNodeSetter = (ShadowNodeSetter) map.get(nodeClass);
        if (fallbackShadowNodeSetter == null) {
            fallbackShadowNodeSetter = (ShadowNodeSetter) findGeneratedSetter(nodeClass);
            if (fallbackShadowNodeSetter == null) {
                AbstractC2855l.e(nodeClass, "null cannot be cast to non-null type java.lang.Class<kotlin.Nothing>");
                fallbackShadowNodeSetter = new FallbackShadowNodeSetter(nodeClass);
            }
            map.put(nodeClass, (ShadowNodeSetter<?>) fallbackShadowNodeSetter);
        }
        return fallbackShadowNodeSetter;
    }

    public static final Map<String, String> getNativeProps(Class<? extends ViewManager> viewManagerTopClass, Class shadowNodeTopClass) {
        AbstractC2855l.g(viewManagerTopClass, "viewManagerTopClass");
        HashMap map = new HashMap();
        ViewManagerPropertyUpdater viewManagerPropertyUpdater = INSTANCE;
        viewManagerPropertyUpdater.findManagerSetter(viewManagerTopClass).getProperties(map);
        if (shadowNodeTopClass != null) {
            viewManagerPropertyUpdater.findNodeSetter(shadowNodeTopClass).getProperties(map);
        }
        return map;
    }

    public static final <T extends ViewManagerDelegate<V>, V extends View> void updateProps(T delegate, V view, ReactStylesDiffMap props) {
        AbstractC2855l.g(delegate, "delegate");
        AbstractC2855l.g(view, "view");
        AbstractC2855l.g(props, "props");
        Iterator<Map.Entry<String, Object>> entryIterator = props.getBackingMap().getEntryIterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Object> next = entryIterator.next();
            delegate.kotlinCompat$setProperty(view, next.getKey(), next.getValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <V extends View> void updateProps(ViewManager<V, ?> manager, V view, ReactStylesDiffMap props) {
        AbstractC2855l.g(manager, "manager");
        AbstractC2855l.g(view, "view");
        AbstractC2855l.g(props, "props");
        ViewManagerSetter viewManagerSetterFindManagerSetter = INSTANCE.findManagerSetter(manager.getClass());
        Iterator<Map.Entry<String, Object>> entryIterator = props.getBackingMap().getEntryIterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Object> next = entryIterator.next();
            viewManagerSetterFindManagerSetter.setProperty(manager, view, next.getKey(), next.getValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends ReactShadowNode<T>> void updateProps(T node, ReactStylesDiffMap props) {
        AbstractC2855l.g(node, "node");
        AbstractC2855l.g(props, "props");
        ShadowNodeSetter shadowNodeSetterFindNodeSetter = INSTANCE.findNodeSetter(node.getClass());
        Iterator<Map.Entry<String, Object>> entryIterator = props.getBackingMap().getEntryIterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Object> next = entryIterator.next();
            shadowNodeSetterFindNodeSetter.setProperty(node, next.getKey(), next.getValue());
        }
    }
}
