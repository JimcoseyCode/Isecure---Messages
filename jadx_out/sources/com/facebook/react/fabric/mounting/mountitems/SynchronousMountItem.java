package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.fabric.mounting.MountingManager;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/facebook/react/fabric/mounting/mountitems/SynchronousMountItem;", "Lcom/facebook/react/fabric/mounting/mountitems/MountItem;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "reactTag", "Lcom/facebook/react/bridge/ReadableMap;", "props", "<init>", "(ILcom/facebook/react/bridge/ReadableMap;)V", "Lcom/facebook/react/fabric/mounting/MountingManager;", "mountingManager", "Li7/B;", "execute", "(Lcom/facebook/react/fabric/mounting/MountingManager;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "toString", "()Ljava/lang/String;", "getSurfaceId", "()I", "I", "Lcom/facebook/react/bridge/ReadableMap;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SynchronousMountItem implements MountItem {
    private final ReadableMap props;
    private final int reactTag;

    public SynchronousMountItem(int i10, ReadableMap props) {
        AbstractC2855l.g(props, "props");
        this.reactTag = i10;
        this.props = props;
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public void execute(MountingManager mountingManager) {
        AbstractC2855l.g(mountingManager, "mountingManager");
        try {
            mountingManager.storeSynchronousMountPropsOverride(this.reactTag, this.props);
            mountingManager.updatePropsSynchronously(this.reactTag, this.props);
        } catch (Exception unused) {
        }
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public int getSurfaceId() {
        return -1;
    }

    public String toString() {
        String string = FabricUIManager.IS_DEVELOPMENT_ENVIRONMENT ? this.props.toHashMap().toString() : "<hidden>";
        AbstractC2855l.d(string);
        return "SYNC UPDATE PROPS [" + this.reactTag + "]: " + string;
    }
}
