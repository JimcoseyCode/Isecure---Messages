package com.facebook.react.uimanager;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.uimanager.events.PointerEventHelper;
import d2.AbstractC2325a;
import expo.modules.notifications.service.NotificationsService;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ\u000e\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003J\t\u0010\r\u001a\u00020\u0003HÂ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/facebook/react/uimanager/LengthPercentage;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "value", PointerEventHelper.POINTER_TYPE_UNKNOWN, NotificationsService.EVENT_TYPE_KEY, "Lcom/facebook/react/uimanager/LengthPercentageType;", "<init>", "(FLcom/facebook/react/uimanager/LengthPercentageType;)V", "()V", "getType", "()Lcom/facebook/react/uimanager/LengthPercentageType;", "resolve", "referenceLength", "component1", "component2", "copy", "equals", PointerEventHelper.POINTER_TYPE_UNKNOWN, "other", "hashCode", PointerEventHelper.POINTER_TYPE_UNKNOWN, "toString", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class LengthPercentage {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final LengthPercentageType type;
    private final float value;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, d2 = {"Lcom/facebook/react/uimanager/LengthPercentage$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "setFromDynamic", "Lcom/facebook/react/uimanager/LengthPercentage;", "dynamic", "Lcom/facebook/react/bridge/Dynamic;", "allowNegative", PointerEventHelper.POINTER_TYPE_UNKNOWN, "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ReadableType.values().length];
                try {
                    iArr[ReadableType.Number.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ReadableType.String.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ LengthPercentage setFromDynamic$default(Companion companion, Dynamic dynamic, boolean z10, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return companion.setFromDynamic(dynamic, z10);
        }

        public final LengthPercentage setFromDynamic(Dynamic dynamic, boolean allowNegative) {
            AbstractC2855l.g(dynamic, "dynamic");
            int i10 = WhenMappings.$EnumSwitchMapping$0[dynamic.getType().ordinal()];
            if (i10 == 1) {
                double dAsDouble = dynamic.asDouble();
                if (dAsDouble >= 0.0d || allowNegative) {
                    return new LengthPercentage((float) dAsDouble, LengthPercentageType.POINT);
                }
                return null;
            }
            if (i10 != 2) {
                AbstractC2325a.I(ReactConstants.TAG, "Unsupported type for radius property: " + dynamic.getType());
                return null;
            }
            String strAsString = dynamic.asString();
            if (strAsString == null || !P8.q.w(strAsString, "%", false, 2, null)) {
                AbstractC2325a.I(ReactConstants.TAG, "Invalid string value: " + strAsString);
                return null;
            }
            try {
                String strSubstring = strAsString.substring(0, strAsString.length() - 1);
                AbstractC2855l.f(strSubstring, "substring(...)");
                float f10 = Float.parseFloat(strSubstring);
                if (f10 >= 0.0f || allowNegative) {
                    return new LengthPercentage(f10, LengthPercentageType.PERCENT);
                }
                return null;
            } catch (NumberFormatException unused) {
                AbstractC2325a.I(ReactConstants.TAG, "Invalid percentage format: " + strAsString);
                return null;
            }
        }

        private Companion() {
        }
    }

    public LengthPercentage(float f10, LengthPercentageType type) {
        AbstractC2855l.g(type, "type");
        this.value = f10;
        this.type = type;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final float getValue() {
        return this.value;
    }

    public static /* synthetic */ LengthPercentage copy$default(LengthPercentage lengthPercentage, float f10, LengthPercentageType lengthPercentageType, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = lengthPercentage.value;
        }
        if ((i10 & 2) != 0) {
            lengthPercentageType = lengthPercentage.type;
        }
        return lengthPercentage.copy(f10, lengthPercentageType);
    }

    public static final LengthPercentage setFromDynamic(Dynamic dynamic, boolean z10) {
        return INSTANCE.setFromDynamic(dynamic, z10);
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final LengthPercentageType getType() {
        return this.type;
    }

    public final LengthPercentage copy(float value, LengthPercentageType type) {
        AbstractC2855l.g(type, "type");
        return new LengthPercentage(value, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LengthPercentage)) {
            return false;
        }
        LengthPercentage lengthPercentage = (LengthPercentage) other;
        return Float.compare(this.value, lengthPercentage.value) == 0 && this.type == lengthPercentage.type;
    }

    public final LengthPercentageType getType() {
        return this.type;
    }

    public int hashCode() {
        return (Float.hashCode(this.value) * 31) + this.type.hashCode();
    }

    public final float resolve(float referenceLength) {
        return this.type == LengthPercentageType.PERCENT ? (this.value / 100) * referenceLength : this.value;
    }

    public String toString() {
        return "LengthPercentage(value=" + this.value + ", type=" + this.type + ")";
    }

    public LengthPercentage() {
        this(0.0f, LengthPercentageType.POINT);
    }
}
