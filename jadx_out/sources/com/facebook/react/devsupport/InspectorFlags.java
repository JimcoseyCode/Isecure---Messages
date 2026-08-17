package com.facebook.react.devsupport;

import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.soloader.SoLoader;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\t\u0010\u0004\u001a\u00020\u0005H\u0087 J\t\u0010\u0006\u001a\u00020\u0005H\u0087 ¨\u0006\u0007"}, d2 = {"Lcom/facebook/react/devsupport/InspectorFlags;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "getFuseboxEnabled", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getIsProfilingBuild", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InspectorFlags {
    public static final InspectorFlags INSTANCE = new InspectorFlags();

    static {
        SoLoader.t("react_devsupportjni");
    }

    private InspectorFlags() {
    }

    public static final native boolean getFuseboxEnabled();

    public static final native boolean getIsProfilingBuild();
}
