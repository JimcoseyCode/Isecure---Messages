package com.facebook.react.uimanager.style;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Shader;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.FloatUtil;
import com.facebook.react.uimanager.LengthPercentage;
import com.facebook.react.uimanager.LengthPercentageType;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.PointerEventHelper;
import i7.C2750m;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p7.AbstractC3083a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 &2\u00020\u0001:\u0004&'()B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J<\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180\u001b2\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J,\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180\u001b2\u0006\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u0018H\u0002J<\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180\u001b2\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J4\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180\u001b2\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006*"}, d2 = {"Lcom/facebook/react/uimanager/style/RadialGradient;", "Lcom/facebook/react/uimanager/style/Gradient;", "shape", "Lcom/facebook/react/uimanager/style/RadialGradient$Shape;", "size", "Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize;", ViewProps.POSITION, "Lcom/facebook/react/uimanager/style/RadialGradient$Position;", "colorStops", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/react/uimanager/style/ColorStop;", "<init>", "(Lcom/facebook/react/uimanager/style/RadialGradient$Shape;Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize;Lcom/facebook/react/uimanager/style/RadialGradient$Position;Ljava/util/List;)V", "getShape", "()Lcom/facebook/react/uimanager/style/RadialGradient$Shape;", "getSize", "()Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize;", "getPosition", "()Lcom/facebook/react/uimanager/style/RadialGradient$Position;", "getColorStops", "()Ljava/util/List;", "getShader", "Landroid/graphics/Shader;", "width", PointerEventHelper.POINTER_TYPE_UNKNOWN, "height", "radiusToSide", "Lkotlin/Pair;", "centerX", "centerY", "sizeKeyword", "Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize$KeywordType;", "calculateEllipseRadius", "offsetX", "offsetY", ViewProps.ASPECT_RATIO, "radiusToCorner", "calculateRadius", "Companion", "Shape", "GradientSize", "Position", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RadialGradient implements Gradient {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final List<ColorStop> colorStops;
    private final Position position;
    private final Shape shape;
    private final GradientSize size;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/facebook/react/uimanager/style/RadialGradient$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "parse", "Lcom/facebook/react/uimanager/style/Gradient;", "gradientMap", "Lcom/facebook/react/bridge/ReadableMap;", "context", "Landroid/content/Context;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ReadableType.values().length];
                try {
                    iArr[ReadableType.String.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ReadableType.Map.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x0094  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Gradient parse(ReadableMap gradientMap, Context context) {
            GradientSize dimensions;
            Position position;
            ArrayList arrayList;
            LengthPercentage fromDynamic$default;
            LengthPercentage fromDynamic$default2;
            LengthPercentage fromDynamic$default3;
            LengthPercentage fromDynamic$default4;
            ReadableMap map;
            String string;
            ReadableMap gradientMap2 = gradientMap;
            AbstractC2855l.g(gradientMap2, "gradientMap");
            AbstractC2855l.g(context, "context");
            ReadableMap readableMap = gradientMap2.hasKey("shape") ? gradientMap2 : null;
            Shape shapeFromString = (readableMap == null || (string = readableMap.getString("shape")) == null) ? null : Shape.INSTANCE.fromString(string);
            ReadableMap readableMap2 = gradientMap2.hasKey("size") ? gradientMap2 : null;
            if (readableMap2 != null) {
                int i10 = WhenMappings.$EnumSwitchMapping$0[readableMap2.getType("size").ordinal()];
                if (i10 == 1) {
                    GradientSize.KeywordType keywordTypeFromString = GradientSize.KeywordType.INSTANCE.fromString(readableMap2.getString("size"));
                    if (keywordTypeFromString != null) {
                        dimensions = new GradientSize.Keyword(keywordTypeFromString);
                    }
                } else if (i10 == 2 && (map = readableMap2.getMap("size")) != null) {
                    if (!map.hasKey("x") || !map.hasKey("y")) {
                        map = null;
                    }
                    if (map != null) {
                        LengthPercentage.Companion companion = LengthPercentage.INSTANCE;
                        LengthPercentage fromDynamic$default5 = LengthPercentage.Companion.setFromDynamic$default(companion, map.getDynamic("x"), false, 2, null);
                        LengthPercentage fromDynamic$default6 = LengthPercentage.Companion.setFromDynamic$default(companion, map.getDynamic("y"), false, 2, null);
                        dimensions = (fromDynamic$default5 == null || fromDynamic$default6 == null) ? null : new GradientSize.Dimensions(fromDynamic$default5, fromDynamic$default6);
                    }
                }
            }
            ReadableMap readableMap3 = gradientMap2.hasKey(ViewProps.POSITION) ? gradientMap2 : null;
            if (readableMap3 != null) {
                ReadableMap map2 = readableMap3.getMap(ViewProps.POSITION);
                if (map2 == null) {
                    return null;
                }
                if (!map2.hasKey(ViewProps.TOP)) {
                    if (map2.hasKey(ViewProps.BOTTOM)) {
                        fromDynamic$default = LengthPercentage.Companion.setFromDynamic$default(LengthPercentage.INSTANCE, map2.getDynamic(ViewProps.BOTTOM), false, 2, null);
                        fromDynamic$default2 = null;
                    }
                    return null;
                }
                fromDynamic$default2 = LengthPercentage.Companion.setFromDynamic$default(LengthPercentage.INSTANCE, map2.getDynamic(ViewProps.TOP), false, 2, null);
                fromDynamic$default = null;
                if (!map2.hasKey(ViewProps.LEFT)) {
                    if (map2.hasKey(ViewProps.RIGHT)) {
                        fromDynamic$default3 = LengthPercentage.Companion.setFromDynamic$default(LengthPercentage.INSTANCE, map2.getDynamic(ViewProps.RIGHT), false, 2, null);
                        fromDynamic$default4 = null;
                    }
                    return null;
                }
                fromDynamic$default4 = LengthPercentage.Companion.setFromDynamic$default(LengthPercentage.INSTANCE, map2.getDynamic(ViewProps.LEFT), false, 2, null);
                fromDynamic$default3 = null;
                position = new Position(fromDynamic$default2, fromDynamic$default4, fromDynamic$default3, fromDynamic$default);
            } else {
                position = null;
            }
            if (!gradientMap2.hasKey("colorStops")) {
                gradientMap2 = null;
            }
            if (gradientMap2 != null) {
                ReadableArray array = gradientMap2.getArray("colorStops");
                if (array == null) {
                    return null;
                }
                arrayList = new ArrayList(array.size());
                int size = array.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ReadableMap map3 = array.getMap(i11);
                    if (map3 != null) {
                        arrayList.add(new ColorStop((!map3.hasKey(ViewProps.COLOR) || map3.isNull(ViewProps.COLOR)) ? null : map3.getType(ViewProps.COLOR) == ReadableType.Map ? ColorPropConverter.getColor(map3.getMap(ViewProps.COLOR), context) : Integer.valueOf(map3.getInt(ViewProps.COLOR)), LengthPercentage.Companion.setFromDynamic$default(LengthPercentage.INSTANCE, map3.getDynamic(ViewProps.POSITION), false, 2, null)));
                    }
                }
            } else {
                arrayList = null;
            }
            if (shapeFromString == null || dimensions == null || position == null || arrayList == null) {
                return null;
            }
            return new RadialGradient(shapeFromString, dimensions, position, arrayList);
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "Keyword", "Dimensions", "KeywordType", "Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize$Dimensions;", "Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize$Keyword;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class GradientSize {

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize$Dimensions;", "Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize;", "x", "Lcom/facebook/react/uimanager/LengthPercentage;", "y", "<init>", "(Lcom/facebook/react/uimanager/LengthPercentage;Lcom/facebook/react/uimanager/LengthPercentage;)V", "getX", "()Lcom/facebook/react/uimanager/LengthPercentage;", "getY", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Dimensions extends GradientSize {
            private final LengthPercentage x;
            private final LengthPercentage y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Dimensions(LengthPercentage x10, LengthPercentage y10) {
                super(null);
                AbstractC2855l.g(x10, "x");
                AbstractC2855l.g(y10, "y");
                this.x = x10;
                this.y = y10;
            }

            public final LengthPercentage getX() {
                return this.x;
            }

            public final LengthPercentage getY() {
                return this.y;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize$Keyword;", "Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize;", "keyword", "Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize$KeywordType;", "<init>", "(Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize$KeywordType;)V", "getKeyword", "()Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize$KeywordType;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Keyword extends GradientSize {
            private final KeywordType keyword;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Keyword(KeywordType keyword) {
                super(null);
                AbstractC2855l.g(keyword, "keyword");
                this.keyword = keyword;
            }

            public final KeywordType getKeyword() {
                return this.keyword;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize$KeywordType;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "value", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "CLOSEST_SIDE", "FARTHEST_SIDE", "CLOSEST_CORNER", "FARTHEST_CORNER", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class KeywordType {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ KeywordType[] $VALUES;

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private final String value;
            public static final KeywordType CLOSEST_SIDE = new KeywordType("CLOSEST_SIDE", 0, "closest-side");
            public static final KeywordType FARTHEST_SIDE = new KeywordType("FARTHEST_SIDE", 1, "farthest-side");
            public static final KeywordType CLOSEST_CORNER = new KeywordType("CLOSEST_CORNER", 2, "closest-corner");
            public static final KeywordType FARTHEST_CORNER = new KeywordType("FARTHEST_CORNER", 3, "farthest-corner");

            /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize$KeywordType$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "fromString", "Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize$KeywordType;", "value", PointerEventHelper.POINTER_TYPE_UNKNOWN, "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KeywordType fromString(String value) {
                    for (KeywordType keywordType : KeywordType.values()) {
                        if (AbstractC2855l.b(keywordType.getValue(), value)) {
                            return keywordType;
                        }
                    }
                    return null;
                }

                private Companion() {
                }
            }

            private static final /* synthetic */ KeywordType[] $values() {
                return new KeywordType[]{CLOSEST_SIDE, FARTHEST_SIDE, CLOSEST_CORNER, FARTHEST_CORNER};
            }

            static {
                KeywordType[] keywordTypeArr$values = $values();
                $VALUES = keywordTypeArr$values;
                $ENTRIES = AbstractC3083a.a(keywordTypeArr$values);
                INSTANCE = new Companion(null);
            }

            private KeywordType(String str, int i10, String str2) {
                this.value = str2;
            }

            public static EnumEntries getEntries() {
                return $ENTRIES;
            }

            public static KeywordType valueOf(String str) {
                return (KeywordType) Enum.valueOf(KeywordType.class, str);
            }

            public static KeywordType[] values() {
                return (KeywordType[]) $VALUES.clone();
            }

            public final String getValue() {
                return this.value;
            }
        }

        public /* synthetic */ GradientSize(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private GradientSize() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/facebook/react/uimanager/style/RadialGradient$Position;", PointerEventHelper.POINTER_TYPE_UNKNOWN, ViewProps.TOP, "Lcom/facebook/react/uimanager/LengthPercentage;", ViewProps.LEFT, ViewProps.RIGHT, ViewProps.BOTTOM, "<init>", "(Lcom/facebook/react/uimanager/LengthPercentage;Lcom/facebook/react/uimanager/LengthPercentage;Lcom/facebook/react/uimanager/LengthPercentage;Lcom/facebook/react/uimanager/LengthPercentage;)V", "getTop", "()Lcom/facebook/react/uimanager/LengthPercentage;", "getLeft", "getRight", "getBottom", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Position {
        private final LengthPercentage bottom;
        private final LengthPercentage left;
        private final LengthPercentage right;
        private final LengthPercentage top;

        public Position() {
            this(null, null, null, null, 15, null);
        }

        public final LengthPercentage getBottom() {
            return this.bottom;
        }

        public final LengthPercentage getLeft() {
            return this.left;
        }

        public final LengthPercentage getRight() {
            return this.right;
        }

        public final LengthPercentage getTop() {
            return this.top;
        }

        public Position(LengthPercentage lengthPercentage, LengthPercentage lengthPercentage2, LengthPercentage lengthPercentage3, LengthPercentage lengthPercentage4) {
            this.top = lengthPercentage;
            this.left = lengthPercentage2;
            this.right = lengthPercentage3;
            this.bottom = lengthPercentage4;
        }

        public /* synthetic */ Position(LengthPercentage lengthPercentage, LengthPercentage lengthPercentage2, LengthPercentage lengthPercentage3, LengthPercentage lengthPercentage4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : lengthPercentage, (i10 & 2) != 0 ? null : lengthPercentage2, (i10 & 4) != 0 ? null : lengthPercentage3, (i10 & 8) != 0 ? null : lengthPercentage4);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, d2 = {"Lcom/facebook/react/uimanager/style/RadialGradient$Shape;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "(Ljava/lang/String;I)V", "CIRCLE", "ELLIPSE", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Shape {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Shape[] $VALUES;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Shape CIRCLE = new Shape("CIRCLE", 0);
        public static final Shape ELLIPSE = new Shape("ELLIPSE", 1);

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/facebook/react/uimanager/style/RadialGradient$Shape$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "fromString", "Lcom/facebook/react/uimanager/style/RadialGradient$Shape;", "value", PointerEventHelper.POINTER_TYPE_UNKNOWN, "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Shape fromString(String value) {
                AbstractC2855l.g(value, "value");
                if (AbstractC2855l.b(value, "circle")) {
                    return Shape.CIRCLE;
                }
                if (AbstractC2855l.b(value, "ellipse")) {
                    return Shape.ELLIPSE;
                }
                return null;
            }

            private Companion() {
            }
        }

        private static final /* synthetic */ Shape[] $values() {
            return new Shape[]{CIRCLE, ELLIPSE};
        }

        static {
            Shape[] shapeArr$values = $values();
            $VALUES = shapeArr$values;
            $ENTRIES = AbstractC3083a.a(shapeArr$values);
            INSTANCE = new Companion(null);
        }

        private Shape(String str, int i10) {
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static Shape valueOf(String str) {
            return (Shape) Enum.valueOf(Shape.class, str);
        }

        public static Shape[] values() {
            return (Shape[]) $VALUES.clone();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GradientSize.KeywordType.values().length];
            try {
                iArr[GradientSize.KeywordType.CLOSEST_SIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GradientSize.KeywordType.FARTHEST_SIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GradientSize.KeywordType.CLOSEST_CORNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GradientSize.KeywordType.FARTHEST_CORNER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public RadialGradient(Shape shape, GradientSize size, Position position, List<ColorStop> colorStops) {
        AbstractC2855l.g(shape, "shape");
        AbstractC2855l.g(size, "size");
        AbstractC2855l.g(position, "position");
        AbstractC2855l.g(colorStops, "colorStops");
        this.shape = shape;
        this.size = size;
        this.position = position;
        this.colorStops = colorStops;
    }

    private final Pair<Float, Float> calculateEllipseRadius(float offsetX, float offsetY, float aspectRatio) {
        Float fValueOf = Float.valueOf(0.0f);
        if (aspectRatio == 0.0f || Math.abs(aspectRatio) > Float.MAX_VALUE) {
            return new Pair<>(fValueOf, fValueOf);
        }
        float fSqrt = (float) Math.sqrt((offsetX * offsetX) + (offsetY * offsetY * aspectRatio * aspectRatio));
        return new Pair<>(Float.valueOf(fSqrt), Float.valueOf(fSqrt / aspectRatio));
    }

    private final Pair<Float, Float> calculateRadius(float centerX, float centerY, float width, float height) {
        GradientSize gradientSize = this.size;
        if (gradientSize instanceof GradientSize.Keyword) {
            GradientSize.KeywordType keyword = ((GradientSize.Keyword) gradientSize).getKeyword();
            int i10 = WhenMappings.$EnumSwitchMapping$0[keyword.ordinal()];
            if (i10 == 1 || i10 == 2) {
                return radiusToSide(centerX, centerY, width, height, keyword);
            }
            if (i10 == 3 || i10 == 4) {
                return radiusToCorner(centerX, centerY, width, height, keyword);
            }
            throw new C2750m();
        }
        if (!(gradientSize instanceof GradientSize.Dimensions)) {
            return radiusToCorner(centerX, centerY, width, height, GradientSize.KeywordType.FARTHEST_CORNER);
        }
        LengthPercentageType type = ((GradientSize.Dimensions) gradientSize).getX().getType();
        LengthPercentageType lengthPercentageType = LengthPercentageType.PERCENT;
        float fResolve = type == lengthPercentageType ? ((GradientSize.Dimensions) this.size).getX().resolve(width) : PixelUtil.INSTANCE.dpToPx(((GradientSize.Dimensions) this.size).getX().resolve(width));
        float fResolve2 = ((GradientSize.Dimensions) this.size).getY().getType() == lengthPercentageType ? ((GradientSize.Dimensions) this.size).getY().resolve(height) : PixelUtil.INSTANCE.dpToPx(((GradientSize.Dimensions) this.size).getY().resolve(height));
        if (this.shape != Shape.CIRCLE) {
            return new Pair<>(Float.valueOf(fResolve), Float.valueOf(fResolve2));
        }
        float fMax = Math.max(fResolve, fResolve2);
        return new Pair<>(Float.valueOf(fMax), Float.valueOf(fMax));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Pair<Float, Float> radiusToCorner(float centerX, float centerY, float width, float height, GradientSize.KeywordType sizeKeyword) {
        Float fValueOf = Float.valueOf(0.0f);
        Pair[] pairArr = {new Pair(fValueOf, fValueOf), new Pair(Float.valueOf(width), fValueOf), new Pair(Float.valueOf(width), Float.valueOf(height)), new Pair(fValueOf, Float.valueOf(height))};
        int i10 = 0;
        double d10 = 2;
        float fSqrt = (float) Math.sqrt(((float) Math.pow(centerX - ((Number) pairArr[0].c()).floatValue(), d10)) + ((float) Math.pow(centerY - ((Number) pairArr[0].d()).floatValue(), d10)));
        boolean z10 = sizeKeyword == GradientSize.KeywordType.CLOSEST_CORNER;
        for (int i11 = 1; i11 < 4; i11++) {
            float fSqrt2 = (float) Math.sqrt(((float) Math.pow(centerX - ((Number) pairArr[i11].c()).floatValue(), d10)) + ((float) Math.pow(centerY - ((Number) pairArr[i11].d()).floatValue(), d10)));
            if (z10) {
                if (fSqrt2 < fSqrt) {
                    fSqrt = fSqrt2;
                    i10 = i11;
                }
            } else if (fSqrt2 > fSqrt) {
            }
        }
        if (this.shape == Shape.CIRCLE) {
            return new Pair<>(Float.valueOf(fSqrt), Float.valueOf(fSqrt));
        }
        Pair<Float, Float> pairRadiusToSide = radiusToSide(centerX, centerY, width, height, z10 ? GradientSize.KeywordType.CLOSEST_SIDE : GradientSize.KeywordType.FARTHEST_SIDE);
        return calculateEllipseRadius(((Number) pairArr[i10].c()).floatValue() - centerX, ((Number) pairArr[i10].d()).floatValue() - centerY, ((Number) pairRadiusToSide.c()).floatValue() / ((Number) pairRadiusToSide.d()).floatValue());
    }

    private final Pair<Float, Float> radiusToSide(float centerX, float centerY, float width, float height, GradientSize.KeywordType sizeKeyword) {
        float fMax;
        float fMax2;
        float f10 = width - centerX;
        float f11 = height - centerY;
        GradientSize.KeywordType keywordType = GradientSize.KeywordType.CLOSEST_SIDE;
        if (sizeKeyword == keywordType) {
            fMax = Math.min(centerX, f10);
            fMax2 = Math.min(centerY, f11);
        } else {
            fMax = Math.max(centerX, f10);
            fMax2 = Math.max(centerY, f11);
        }
        if (this.shape != Shape.CIRCLE) {
            return new Pair<>(Float.valueOf(fMax), Float.valueOf(fMax2));
        }
        float fMin = sizeKeyword == keywordType ? Math.min(fMax, fMax2) : Math.max(fMax, fMax2);
        return new Pair<>(Float.valueOf(fMin), Float.valueOf(fMin));
    }

    public final List<ColorStop> getColorStops() {
        return this.colorStops;
    }

    public final Position getPosition() {
        return this.position;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0111  */
    @Override // com.facebook.react.uimanager.style.Gradient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Shader getShader(float width, float height) {
        float fResolve;
        float f10;
        float fFloatValue;
        float fFloatValue2;
        android.graphics.RadialGradient radialGradient;
        float f11 = width / 2.0f;
        float fResolve2 = height / 2.0f;
        if (this.position.getTop() != null) {
            fResolve2 = this.position.getTop().getType() == LengthPercentageType.PERCENT ? this.position.getTop().resolve(height) : PixelUtil.INSTANCE.dpToPx(this.position.getTop().resolve(height));
        } else if (this.position.getBottom() != null) {
            fResolve2 = height - (this.position.getBottom().getType() == LengthPercentageType.PERCENT ? this.position.getBottom().resolve(height) : PixelUtil.INSTANCE.dpToPx(this.position.getBottom().resolve(height)));
        }
        float f12 = fResolve2;
        if (this.position.getLeft() == null) {
            if (this.position.getRight() != null) {
                fResolve = width - (this.position.getRight().getType() == LengthPercentageType.PERCENT ? this.position.getRight().resolve(width) : PixelUtil.INSTANCE.dpToPx(this.position.getRight().resolve(width)));
            }
            f10 = f11;
            Pair<Float, Float> pairCalculateRadius = calculateRadius(f10, f12, width, height);
            fFloatValue = ((Number) pairCalculateRadius.getFirst()).floatValue();
            fFloatValue2 = ((Number) pairCalculateRadius.getSecond()).floatValue();
            List<ProcessedColorStop> fixedColorStops = ColorStopUtils.INSTANCE.getFixedColorStops(this.colorStops, Math.max(fFloatValue, fFloatValue2));
            int[] iArr = new int[fixedColorStops.size()];
            float[] fArr = new float[fixedColorStops.size()];
            int i10 = 0;
            for (Object obj : fixedColorStops) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    AbstractC2800q.t();
                }
                ProcessedColorStop processedColorStop = (ProcessedColorStop) obj;
                Integer color = processedColorStop.getColor();
                if (color != null && processedColorStop.getPosition() != null) {
                    iArr[i10] = color.intValue();
                    fArr[i10] = processedColorStop.getPosition().floatValue();
                }
                i10 = i11;
            }
            radialGradient = new android.graphics.RadialGradient(f10, f12, Math.max(fFloatValue, 1.0E-5f), iArr, fArr, Shader.TileMode.CLAMP);
            if (this.shape == Shape.CIRCLE && !FloatUtil.floatsEqual(fFloatValue, fFloatValue2)) {
                Matrix matrix = new Matrix();
                matrix.setScale(1.0f, fFloatValue2 / fFloatValue, f10, f12);
                radialGradient.setLocalMatrix(matrix);
            }
            return radialGradient;
        }
        fResolve = this.position.getLeft().getType() == LengthPercentageType.PERCENT ? this.position.getLeft().resolve(width) : PixelUtil.INSTANCE.dpToPx(this.position.getLeft().resolve(width));
        f11 = fResolve;
        f10 = f11;
        Pair<Float, Float> pairCalculateRadius2 = calculateRadius(f10, f12, width, height);
        fFloatValue = ((Number) pairCalculateRadius2.getFirst()).floatValue();
        fFloatValue2 = ((Number) pairCalculateRadius2.getSecond()).floatValue();
        List<ProcessedColorStop> fixedColorStops2 = ColorStopUtils.INSTANCE.getFixedColorStops(this.colorStops, Math.max(fFloatValue, fFloatValue2));
        int[] iArr2 = new int[fixedColorStops2.size()];
        float[] fArr2 = new float[fixedColorStops2.size()];
        int i102 = 0;
        while (r0.hasNext()) {
        }
        radialGradient = new android.graphics.RadialGradient(f10, f12, Math.max(fFloatValue, 1.0E-5f), iArr2, fArr2, Shader.TileMode.CLAMP);
        if (this.shape == Shape.CIRCLE) {
            return radialGradient;
        }
        Matrix matrix2 = new Matrix();
        matrix2.setScale(1.0f, fFloatValue2 / fFloatValue, f10, f12);
        radialGradient.setLocalMatrix(matrix2);
        return radialGradient;
    }

    public final Shape getShape() {
        return this.shape;
    }

    public final GradientSize getSize() {
        return this.size;
    }
}
