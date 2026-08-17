package com.facebook.react.common;

import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"MIN_TIME_BETWEEN_SAMPLES_NS", PointerEventHelper.POINTER_TYPE_UNKNOWN, "SHAKING_WINDOW_NS", PointerEventHelper.POINTER_TYPE_UNKNOWN, "REQUIRED_FORCE", "ReactAndroid_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ShakeDetectorKt {
    private static final long MIN_TIME_BETWEEN_SAMPLES_NS = TimeUnit.NANOSECONDS.convert(20, TimeUnit.MILLISECONDS);
    private static final float REQUIRED_FORCE = 13.042845f;
    private static final float SHAKING_WINDOW_NS;

    static {
        SHAKING_WINDOW_NS = r0.convert(3L, TimeUnit.SECONDS);
    }
}
