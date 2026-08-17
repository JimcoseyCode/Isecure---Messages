package com.facebook.react.uimanager.style;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \u00052\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/facebook/react/uimanager/style/BackgroundSize;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "LengthPercentageAuto", "Companion", "Lcom/facebook/react/uimanager/style/BackgroundSize$LengthPercentageAuto;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class BackgroundSize {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lcom/facebook/react/uimanager/style/BackgroundSize$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "parse", "Lcom/facebook/react/uimanager/style/BackgroundSize;", "backgroundSizeValue", "Lcom/facebook/react/bridge/Dynamic;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ReadableType.values().length];
                try {
                    iArr[ReadableType.Map.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final BackgroundSize parse(Dynamic backgroundSizeValue) {
            ReadableMap readableMapAsMap;
            BackgroundSizeLengthPercentage backgroundSizeLengthPercentage;
            if (backgroundSizeValue == null) {
                return null;
            }
            if (WhenMappings.$EnumSwitchMapping$0[backgroundSizeValue.getType().ordinal()] != 1 || (readableMapAsMap = backgroundSizeValue.asMap()) == null || (backgroundSizeLengthPercentage = BackgroundSizeLengthPercentage.INSTANCE.parse(readableMapAsMap)) == null) {
                return null;
            }
            return new LengthPercentageAuto(backgroundSizeLengthPercentage);
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/facebook/react/uimanager/style/BackgroundSize$LengthPercentageAuto;", "Lcom/facebook/react/uimanager/style/BackgroundSize;", "lengthPercentage", "Lcom/facebook/react/uimanager/style/BackgroundSizeLengthPercentage;", "<init>", "(Lcom/facebook/react/uimanager/style/BackgroundSizeLengthPercentage;)V", "getLengthPercentage", "()Lcom/facebook/react/uimanager/style/BackgroundSizeLengthPercentage;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LengthPercentageAuto extends BackgroundSize {
        private final BackgroundSizeLengthPercentage lengthPercentage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LengthPercentageAuto(BackgroundSizeLengthPercentage lengthPercentage) {
            super(null);
            AbstractC2855l.g(lengthPercentage, "lengthPercentage");
            this.lengthPercentage = lengthPercentage;
        }

        public final BackgroundSizeLengthPercentage getLengthPercentage() {
            return this.lengthPercentage;
        }
    }

    public /* synthetic */ BackgroundSize(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private BackgroundSize() {
    }
}
