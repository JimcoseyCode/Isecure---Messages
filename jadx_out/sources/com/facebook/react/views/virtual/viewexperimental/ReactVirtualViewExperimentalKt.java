package com.facebook.react.views.virtual.viewexperimental;

import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0004"}, d2 = {"DEBUG_TAG", PointerEventHelper.POINTER_TYPE_UNKNOWN, "IS_DEBUG_BUILD", PointerEventHelper.POINTER_TYPE_UNKNOWN, "ReactAndroid_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ReactVirtualViewExperimentalKt {
    private static final String DEBUG_TAG = "ReactVirtualViewExperimental";
    private static final boolean IS_DEBUG_BUILD;

    static {
        IS_DEBUG_BUILD = ReactBuildConfig.DEBUG || ReactBuildConfig.IS_INTERNAL_BUILD || ReactBuildConfig.ENABLE_PERFETTO;
    }
}
