package com.facebook.react.uimanager.style;

import P8.q;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.LengthPercentage;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/facebook/react/uimanager/style/BackgroundSizeLengthPercentage;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "x", "Lcom/facebook/react/uimanager/LengthPercentage;", "y", "<init>", "(Lcom/facebook/react/uimanager/LengthPercentage;Lcom/facebook/react/uimanager/LengthPercentage;)V", "getX", "()Lcom/facebook/react/uimanager/LengthPercentage;", "getY", "isXAuto", PointerEventHelper.POINTER_TYPE_UNKNOWN, "isYAuto", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BackgroundSizeLengthPercentage {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final LengthPercentage x;
    private final LengthPercentage y;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lcom/facebook/react/uimanager/style/BackgroundSizeLengthPercentage$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "parse", "Lcom/facebook/react/uimanager/style/BackgroundSizeLengthPercentage;", "backgroundSizeMap", "Lcom/facebook/react/bridge/ReadableMap;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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

        /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final BackgroundSizeLengthPercentage parse(ReadableMap backgroundSizeMap) {
            LengthPercentage fromDynamic$default;
            LengthPercentage fromDynamic$default2 = null;
            if (backgroundSizeMap == null) {
                return null;
            }
            if (!backgroundSizeMap.hasKey("x") || backgroundSizeMap.getType("x") == ReadableType.Null) {
                fromDynamic$default = null;
            } else {
                int i10 = WhenMappings.$EnumSwitchMapping$0[backgroundSizeMap.getType("x").ordinal()];
                if (i10 == 1) {
                    fromDynamic$default = LengthPercentage.Companion.setFromDynamic$default(LengthPercentage.INSTANCE, backgroundSizeMap.getDynamic("x"), false, 2, null);
                } else if (i10 == 2) {
                    String string = backgroundSizeMap.getString("x");
                    if (!AbstractC2855l.b(string, "auto") && string != null && q.w(string, "%", false, 2, null)) {
                        fromDynamic$default = LengthPercentage.Companion.setFromDynamic$default(LengthPercentage.INSTANCE, backgroundSizeMap.getDynamic("x"), false, 2, null);
                    }
                }
            }
            if (backgroundSizeMap.hasKey("y") && backgroundSizeMap.getType("y") != ReadableType.Null) {
                int i11 = WhenMappings.$EnumSwitchMapping$0[backgroundSizeMap.getType("y").ordinal()];
                if (i11 == 1) {
                    fromDynamic$default2 = LengthPercentage.Companion.setFromDynamic$default(LengthPercentage.INSTANCE, backgroundSizeMap.getDynamic("y"), false, 2, null);
                } else if (i11 == 2) {
                    String string2 = backgroundSizeMap.getString("y");
                    if (!AbstractC2855l.b(string2, "auto") && string2 != null && q.w(string2, "%", false, 2, null)) {
                        fromDynamic$default2 = LengthPercentage.Companion.setFromDynamic$default(LengthPercentage.INSTANCE, backgroundSizeMap.getDynamic("y"), false, 2, null);
                    }
                }
            }
            return new BackgroundSizeLengthPercentage(fromDynamic$default, fromDynamic$default2);
        }

        private Companion() {
        }
    }

    public BackgroundSizeLengthPercentage(LengthPercentage lengthPercentage, LengthPercentage lengthPercentage2) {
        this.x = lengthPercentage;
        this.y = lengthPercentage2;
    }

    public final LengthPercentage getX() {
        return this.x;
    }

    public final LengthPercentage getY() {
        return this.y;
    }

    public final boolean isXAuto() {
        return this.x == null;
    }

    public final boolean isYAuto() {
        return this.y == null;
    }
}
