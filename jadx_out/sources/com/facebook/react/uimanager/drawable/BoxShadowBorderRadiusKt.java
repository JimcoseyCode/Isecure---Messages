package com.facebook.react.uimanager.drawable;

import B7.d;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000¨\u0006\u0004"}, d2 = {"adjustRadiusForSpread", PointerEventHelper.POINTER_TYPE_UNKNOWN, "radius", "spread", "ReactAndroid_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class BoxShadowBorderRadiusKt {
    public static final float adjustRadiusForSpread(float f10, float f11) {
        float fPow;
        if (f10 < Math.abs(f11)) {
            fPow = 1 + ((float) Math.pow((f10 / Math.abs(f11)) - r0, 3));
        } else {
            fPow = 1.0f;
        }
        return d.c(f10 + (f11 * fPow), 0.0f);
    }
}
