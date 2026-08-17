package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.common.mapbuffer.ReadableMapBuffer;
import com.facebook.react.fabric.mounting.MountingManager;
import com.facebook.react.fabric.mounting.SurfaceMountingManager;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/facebook/react/fabric/mounting/mountitems/PrefetchResourcesMountItem;", "Lcom/facebook/react/fabric/mounting/mountitems/MountItem;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "surfaceId", PointerEventHelper.POINTER_TYPE_UNKNOWN, "componentName", "Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;", "params", "<init>", "(ILjava/lang/String;Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;)V", "Lcom/facebook/react/fabric/mounting/MountingManager;", "mountingManager", "Li7/B;", "execute", "(Lcom/facebook/react/fabric/mounting/MountingManager;)V", "getSurfaceId", "()I", "toString", "()Ljava/lang/String;", "I", "Ljava/lang/String;", "Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PrefetchResourcesMountItem implements MountItem {
    private final String componentName;
    private final ReadableMapBuffer params;
    private final int surfaceId;

    public PrefetchResourcesMountItem(int i10, String componentName, ReadableMapBuffer params) {
        AbstractC2855l.g(componentName, "componentName");
        AbstractC2855l.g(params, "params");
        this.surfaceId = i10;
        this.componentName = componentName;
        this.params = params;
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public void execute(MountingManager mountingManager) {
        AbstractC2855l.g(mountingManager, "mountingManager");
        SurfaceMountingManager surfaceManager = mountingManager.getSurfaceManager(this.surfaceId);
        if (surfaceManager != null) {
            surfaceManager.experimental_prefetchResources(this.surfaceId, this.componentName, this.params);
        }
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public int getSurfaceId() {
        return this.surfaceId;
    }

    public String toString() {
        return "PrefetchResourcesMountItem";
    }
}
