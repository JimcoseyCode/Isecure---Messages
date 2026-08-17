package com.facebook.react.uimanager;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.events.PointerEventHelper;
import i7.C2735B;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B'\b\u0016\u0012\u001c\u0010\t\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0006\b\u0000\u0012\u00020\b\u0012\u0006\b\u0000\u0012\u00020\b0\u00070\u0006¢\u0006\u0004\b\u0004\u0010\nB'\b\u0016\u0012\u001c\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020\f\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0007\u0018\u00010\u000b¢\u0006\u0004\b\u0004\u0010\u000eJ!\u0010\u0010\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00072\u0006\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0012\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00072\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0011J!\u0010\u0013\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00072\u0006\u0010\u000f\u001a\u00020\fH\u0001¢\u0006\u0004\b\u0013\u0010\u0011J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001c\u0010\u0018J\u0017\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0016H\u0017¢\u0006\u0004\b!\u0010\u001aR(\u0010#\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00070\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010%¨\u0006&"}, d2 = {"Lcom/facebook/react/uimanager/ViewManagerRegistry;", "Landroid/content/ComponentCallbacks2;", "Lcom/facebook/react/uimanager/ViewManagerResolver;", "viewManagerResolver", "<init>", "(Lcom/facebook/react/uimanager/ViewManagerResolver;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/react/uimanager/ViewManager;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "viewManagerList", "(Ljava/util/List;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "viewManagerMap", "(Ljava/util/Map;)V", "className", "getViewManagerFromResolver", "(Ljava/lang/String;)Lcom/facebook/react/uimanager/ViewManager;", "get", "getViewManagerIfExists", PointerEventHelper.POINTER_TYPE_UNKNOWN, "surfaceId", "Li7/B;", "onSurfaceStopped", "(I)V", "invalidate", "()V", "level", "onTrimMemory", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "onLowMemory", PointerEventHelper.POINTER_TYPE_UNKNOWN, "viewManagersMap", "Ljava/util/Map;", "Lcom/facebook/react/uimanager/ViewManagerResolver;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ViewManagerRegistry implements ComponentCallbacks2 {
    private final ViewManagerResolver viewManagerResolver;
    private final Map<String, ViewManager<?, ?>> viewManagersMap;

    public ViewManagerRegistry(ViewManagerResolver viewManagerResolver) {
        AbstractC2855l.g(viewManagerResolver, "viewManagerResolver");
        this.viewManagersMap = new LinkedHashMap();
        this.viewManagerResolver = viewManagerResolver;
    }

    private final ViewManager<?, ?> getViewManagerFromResolver(String className) {
        ViewManagerResolver viewManagerResolver = this.viewManagerResolver;
        ViewManager<?, ?> viewManager = viewManagerResolver != null ? viewManagerResolver.getViewManager(className) : null;
        if (viewManager != null) {
            this.viewManagersMap.put(className, viewManager);
        }
        return viewManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B invalidate$lambda$9(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((ViewManager) it.next()).invalidate();
        }
        return C2735B.f28704a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B onSurfaceStopped$lambda$6(List list, int i10) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((ViewManager) it.next()).onSurfaceStopped(i10);
        }
        return C2735B.f28704a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B onTrimMemory$lambda$12(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((ViewManager) it.next()).trimMemory();
        }
        return C2735B.f28704a;
    }

    public final synchronized ViewManager<?, ?> get(String className) {
        try {
            AbstractC2855l.g(className, "className");
            ViewManager<?, ?> viewManager = this.viewManagersMap.get(className);
            if (viewManager != null) {
                return viewManager;
            }
            String str = "RCT" + className;
            ViewManager<?, ?> viewManager2 = this.viewManagersMap.get(str);
            if (viewManager2 != null) {
                return viewManager2;
            }
            if (this.viewManagerResolver == null) {
                throw new IllegalViewOperationException("No ViewManager found for class " + className);
            }
            ViewManager<?, ?> viewManagerFromResolver = getViewManagerFromResolver(className);
            if (viewManagerFromResolver != null) {
                return viewManagerFromResolver;
            }
            ViewManager<?, ?> viewManagerFromResolver2 = getViewManagerFromResolver(str);
            if (viewManagerFromResolver2 != null) {
                return viewManagerFromResolver2;
            }
            throw new IllegalViewOperationException("Can't find ViewManager '" + className + "' nor '" + str + "' in ViewManagerRegistry, existing names are: " + this.viewManagerResolver.getViewManagerNames());
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized ViewManager<?, ?> getViewManagerIfExists(String className) {
        AbstractC2855l.g(className, "className");
        ViewManager<?, ?> viewManager = this.viewManagersMap.get(className);
        if (viewManager != null) {
            return viewManager;
        }
        return this.viewManagerResolver != null ? getViewManagerFromResolver(className) : null;
    }

    public final void invalidate() {
        final ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.viewManagersMap.values());
        }
        final InterfaceC3487a interfaceC3487a = new InterfaceC3487a() { // from class: com.facebook.react.uimanager.M
            @Override // w7.InterfaceC3487a
            public final Object invoke() {
                return ViewManagerRegistry.invalidate$lambda$9(arrayList);
            }
        };
        if (UiThreadUtil.isOnUiThread()) {
            interfaceC3487a.invoke();
        } else {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.uimanager.N
                @Override // java.lang.Runnable
                public final void run() {
                    interfaceC3487a.invoke();
                }
            });
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        AbstractC2855l.g(newConfig, "newConfig");
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        onTrimMemory(40);
    }

    public final void onSurfaceStopped(final int surfaceId) {
        final ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.viewManagersMap.values());
        }
        final InterfaceC3487a interfaceC3487a = new InterfaceC3487a() { // from class: com.facebook.react.uimanager.Q
            @Override // w7.InterfaceC3487a
            public final Object invoke() {
                return ViewManagerRegistry.onSurfaceStopped$lambda$6(arrayList, surfaceId);
            }
        };
        if (UiThreadUtil.isOnUiThread()) {
            interfaceC3487a.invoke();
        } else {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.uimanager.S
                @Override // java.lang.Runnable
                public final void run() {
                    interfaceC3487a.invoke();
                }
            });
        }
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int level) {
        final ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.viewManagersMap.values());
        }
        final InterfaceC3487a interfaceC3487a = new InterfaceC3487a() { // from class: com.facebook.react.uimanager.O
            @Override // w7.InterfaceC3487a
            public final Object invoke() {
                return ViewManagerRegistry.onTrimMemory$lambda$12(arrayList);
            }
        };
        if (UiThreadUtil.isOnUiThread()) {
            interfaceC3487a.invoke();
        } else {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.uimanager.P
                @Override // java.lang.Runnable
                public final void run() {
                    interfaceC3487a.invoke();
                }
            });
        }
    }

    public ViewManagerRegistry(List<? extends ViewManager> viewManagerList) {
        AbstractC2855l.g(viewManagerList, "viewManagerList");
        LinkedHashMap linkedHashMap = new LinkedHashMap(B7.d.d(j7.K.e(AbstractC2800q.u(viewManagerList, 10)), 16));
        for (Object obj : viewManagerList) {
            linkedHashMap.put(((ViewManager) obj).getName(), obj);
        }
        this.viewManagersMap = j7.K.w(linkedHashMap);
        this.viewManagerResolver = null;
    }

    public ViewManagerRegistry(Map<String, ? extends ViewManager<?, ?>> map) {
        Map<String, ViewManager<?, ?>> mapW;
        this.viewManagersMap = (map == null || (mapW = j7.K.w(map)) == null) ? new LinkedHashMap<>() : mapW;
        this.viewManagerResolver = null;
    }
}
