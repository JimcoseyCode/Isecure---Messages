package com.facebook.react.uimanager;

import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0007J!\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0002\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/facebook/react/uimanager/FloatUtil;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "EPSILON", PointerEventHelper.POINTER_TYPE_UNKNOWN, "floatsEqual", PointerEventHelper.POINTER_TYPE_UNKNOWN, "f1", "f2", "(Ljava/lang/Float;Ljava/lang/Float;)Z", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FloatUtil {
    private static final float EPSILON = 1.0E-5f;
    public static final FloatUtil INSTANCE = new FloatUtil();

    private FloatUtil() {
    }

    public static final boolean floatsEqual(float f12, float f22) {
        return (Float.isNaN(f12) || Float.isNaN(f22)) ? Float.isNaN(f12) && Float.isNaN(f22) : Math.abs(f22 - f12) < EPSILON;
    }

    public static final boolean floatsEqual(Float f12, Float f22) {
        if (f12 == null) {
            return f22 == null;
        }
        if (f22 == null) {
            return false;
        }
        return floatsEqual(f12.floatValue(), f22.floatValue());
    }
}
