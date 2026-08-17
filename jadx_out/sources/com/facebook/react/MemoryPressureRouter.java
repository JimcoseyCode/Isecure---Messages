package com.facebook.react;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import com.facebook.react.bridge.MemoryPressureListener;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\u0005J\u0015\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\nJ\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\f0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/facebook/react/MemoryPressureRouter;", "Landroid/content/ComponentCallbacks2;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "level", "Li7/B;", "dispatchMemoryPressure", "(I)V", "destroy", "Lcom/facebook/react/bridge/MemoryPressureListener;", "listener", "addMemoryPressureListener", "(Lcom/facebook/react/bridge/MemoryPressureListener;)V", "removeMemoryPressureListener", "onTrimMemory", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "onLowMemory", "()V", "Ljava/util/concurrent/CopyOnWriteArrayList;", "listeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MemoryPressureRouter implements ComponentCallbacks2 {
    private final CopyOnWriteArrayList<MemoryPressureListener> listeners;

    public MemoryPressureRouter(Context context) {
        AbstractC2855l.g(context, "context");
        this.listeners = new CopyOnWriteArrayList<>();
        context.getApplicationContext().registerComponentCallbacks(this);
    }

    private final void dispatchMemoryPressure(int level) {
        Iterator<MemoryPressureListener> it = this.listeners.iterator();
        AbstractC2855l.f(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().handleMemoryPressure(level);
        }
    }

    public final void addMemoryPressureListener(MemoryPressureListener listener) {
        AbstractC2855l.g(listener, "listener");
        if (this.listeners.contains(listener)) {
            return;
        }
        this.listeners.add(listener);
    }

    public final void destroy(Context context) {
        AbstractC2855l.g(context, "context");
        context.getApplicationContext().unregisterComponentCallbacks(this);
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        AbstractC2855l.g(newConfig, "newConfig");
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int level) {
        dispatchMemoryPressure(level);
    }

    public final void removeMemoryPressureListener(MemoryPressureListener listener) {
        AbstractC2855l.g(listener, "listener");
        this.listeners.remove(listener);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }
}
