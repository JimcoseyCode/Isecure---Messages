package expo.modules.kotlin.types;

import com.facebook.imageutils.JfifUtil;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.events.PointerEventHelper;
import i7.t;
import j7.K;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0000\" \u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"namedColors", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "expo-modules-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ColorTypeConverterKt {
    private static final Map<String, List<Float>> namedColors;

    static {
        Pair pairA = t.a("aliceblue", new Integer[]{240, 248, 255, 255});
        Pair pairA2 = t.a("antiquewhite", new Integer[]{250, 235, Integer.valueOf(JfifUtil.MARKER_RST7), 255});
        Pair pairA3 = t.a("aqua", new Integer[]{0, 255, 255, 255});
        Pair pairA4 = t.a("aquamarine", new Integer[]{127, 255, 212, 255});
        Pair pairA5 = t.a("azure", new Integer[]{240, 255, 255, 255});
        Pair pairA6 = t.a("beige", new Integer[]{245, 245, 220, 255});
        Pair pairA7 = t.a("bisque", new Integer[]{255, 228, 196, 255});
        Pair pairA8 = t.a("black", new Integer[]{0, 0, 0, 255});
        Pair pairA9 = t.a("blanchedalmond", new Integer[]{255, 235, 205, 255});
        Pair pairA10 = t.a("blue", new Integer[]{0, 0, 255, 255});
        Pair pairA11 = t.a("blueviolet", new Integer[]{138, 43, 226, 255});
        Pair pairA12 = t.a("brown", new Integer[]{165, 42, 42, 255});
        Pair pairA13 = t.a("burlywood", new Integer[]{222, 184, 135, 255});
        Pair pairA14 = t.a("cadetblue", new Integer[]{95, 158, 160, 255});
        Pair pairA15 = t.a("chartreuse", new Integer[]{127, 255, 0, 255});
        Pair pairA16 = t.a("chocolate", new Integer[]{210, 105, 30, 255});
        Pair pairA17 = t.a("coral", new Integer[]{255, 127, 80, 255});
        Pair pairA18 = t.a("cornflowerblue", new Integer[]{100, 149, 237, 255});
        Pair pairA19 = t.a("cornsilk", new Integer[]{255, 248, 220, 255});
        Pair pairA20 = t.a("crimson", new Integer[]{220, 20, 60, 255});
        Pair pairA21 = t.a("cyan", new Integer[]{0, 255, 255, 255});
        Pair pairA22 = t.a("darkblue", new Integer[]{0, 0, 139, 255});
        Pair pairA23 = t.a("darkcyan", new Integer[]{0, 139, 139, 255});
        Pair pairA24 = t.a("darkgoldenrod", new Integer[]{184, 134, 11, 255});
        Pair pairA25 = t.a("darkgray", new Integer[]{169, 169, 169, 255});
        Pair pairA26 = t.a("darkgreen", new Integer[]{0, 100, 0, 255});
        Pair pairA27 = t.a("darkgrey", new Integer[]{169, 169, 169, 255});
        Pair pairA28 = t.a("darkkhaki", new Integer[]{189, 183, 107, 255});
        Pair pairA29 = t.a("darkmagenta", new Integer[]{139, 0, 139, 255});
        Pair pairA30 = t.a("darkolivegreen", new Integer[]{85, 107, 47, 255});
        Pair pairA31 = t.a("darkorange", new Integer[]{255, 140, 0, 255});
        Pair pairA32 = t.a("darkorchid", new Integer[]{153, 50, 204, 255});
        Pair pairA33 = t.a("darkred", new Integer[]{139, 0, 0, 255});
        Pair pairA34 = t.a("darksalmon", new Integer[]{233, 150, 122, 255});
        Pair pairA35 = t.a("darkseagreen", new Integer[]{143, 188, 143, 255});
        Pair pairA36 = t.a("darkslateblue", new Integer[]{72, 61, 139, 255});
        Pair pairA37 = t.a("darkslategray", new Integer[]{47, 79, 79, 255});
        Pair pairA38 = t.a("darkslategrey", new Integer[]{47, 79, 79, 255});
        Pair pairA39 = t.a("darkturquoise", new Integer[]{0, 206, 209, 255});
        Pair pairA40 = t.a("darkviolet", new Integer[]{148, 0, 211, 255});
        Pair pairA41 = t.a("deeppink", new Integer[]{255, 20, 147, 255});
        Pair pairA42 = t.a("deepskyblue", new Integer[]{0, 191, 255, 255});
        Pair pairA43 = t.a("dimgray", new Integer[]{105, 105, 105, 255});
        Pair pairA44 = t.a("dimgrey", new Integer[]{105, 105, 105, 255});
        Pair pairA45 = t.a("dodgerblue", new Integer[]{30, 144, 255, 255});
        Pair pairA46 = t.a("firebrick", new Integer[]{178, 34, 34, 255});
        Pair pairA47 = t.a("floralwhite", new Integer[]{255, 250, 240, 255});
        Pair pairA48 = t.a("forestgreen", new Integer[]{34, 139, 34, 255});
        Pair pairA49 = t.a("fuchsia", new Integer[]{255, 0, 255, 255});
        Pair pairA50 = t.a("gainsboro", new Integer[]{220, 220, 220, 255});
        Pair pairA51 = t.a("ghostwhite", new Integer[]{248, 248, 255, 255});
        Pair pairA52 = t.a("gold", new Integer[]{255, Integer.valueOf(JfifUtil.MARKER_RST7), 0, 255});
        Pair pairA53 = t.a("goldenrod", new Integer[]{Integer.valueOf(JfifUtil.MARKER_SOS), 165, 32, 255});
        Integer numValueOf = Integer.valueOf(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        Map mapL = K.l(pairA, pairA2, pairA3, pairA4, pairA5, pairA6, pairA7, pairA8, pairA9, pairA10, pairA11, pairA12, pairA13, pairA14, pairA15, pairA16, pairA17, pairA18, pairA19, pairA20, pairA21, pairA22, pairA23, pairA24, pairA25, pairA26, pairA27, pairA28, pairA29, pairA30, pairA31, pairA32, pairA33, pairA34, pairA35, pairA36, pairA37, pairA38, pairA39, pairA40, pairA41, pairA42, pairA43, pairA44, pairA45, pairA46, pairA47, pairA48, pairA49, pairA50, pairA51, pairA52, pairA53, t.a("gray", new Integer[]{numValueOf, numValueOf, numValueOf, 255}), t.a("green", new Integer[]{0, numValueOf, 0, 255}), t.a("greenyellow", new Integer[]{173, 255, 47, 255}), t.a("grey", new Integer[]{numValueOf, numValueOf, numValueOf, 255}), t.a("honeydew", new Integer[]{240, 255, 240, 255}), t.a("hotpink", new Integer[]{255, 105, 180, 255}), t.a("indianred", new Integer[]{205, 92, 92, 255}), t.a("indigo", new Integer[]{75, 0, 130, 255}), t.a("ivory", new Integer[]{255, 255, 240, 255}), t.a("khaki", new Integer[]{240, 230, 140, 255}), t.a("lavender", new Integer[]{230, 230, 250, 255}), t.a("lavenderblush", new Integer[]{255, 240, 245, 255}), t.a("lawngreen", new Integer[]{124, 252, 0, 255}), t.a("lemonchiffon", new Integer[]{255, 250, 205, 255}), t.a("lightblue", new Integer[]{173, Integer.valueOf(JfifUtil.MARKER_SOI), 230, 255}), t.a("lightcoral", new Integer[]{240, numValueOf, numValueOf, 255}), t.a("lightcyan", new Integer[]{224, 255, 255, 255}), t.a("lightgoldenrodyellow", new Integer[]{250, 250, 210, 255}), t.a("lightgray", new Integer[]{211, 211, 211, 255}), t.a("lightgreen", new Integer[]{144, 238, 144, 255}), t.a("lightgrey", new Integer[]{211, 211, 211, 255}), t.a("lightpink", new Integer[]{255, 182, 193, 255}), t.a("lightsalmon", new Integer[]{255, 160, 122, 255}), t.a("lightseagreen", new Integer[]{32, 178, 170, 255}), t.a("lightskyblue", new Integer[]{135, 206, 250, 255}), t.a("lightslategray", new Integer[]{119, 136, 153, 255}), t.a("lightslategrey", new Integer[]{119, 136, 153, 255}), t.a("lightsteelblue", new Integer[]{176, 196, 222, 255}), t.a("lightyellow", new Integer[]{255, 255, 224, 255}), t.a("lime", new Integer[]{0, 255, 0, 255}), t.a("limegreen", new Integer[]{50, 205, 50, 255}), t.a("linen", new Integer[]{250, 240, 230, 255}), t.a("magenta", new Integer[]{255, 0, 255, 255}), t.a("maroon", new Integer[]{numValueOf, 0, 0, 255}), t.a("mediumaquamarine", new Integer[]{102, 205, 170, 255}), t.a("mediumblue", new Integer[]{0, 0, 205, 255}), t.a("mediumorchid", new Integer[]{186, 85, 211, 255}), t.a("mediumpurple", new Integer[]{147, 112, 219, 255}), t.a("mediumseagreen", new Integer[]{60, 179, 113, 255}), t.a("mediumslateblue", new Integer[]{123, 104, 238, 255}), t.a("mediumspringgreen", new Integer[]{0, 250, 154, 255}), t.a("mediumturquoise", new Integer[]{72, 209, 204, 255}), t.a("mediumvioletred", new Integer[]{199, 21, 133, 255}), t.a("midnightblue", new Integer[]{25, 25, 112, 255}), t.a("mintcream", new Integer[]{245, 255, 250, 255}), t.a("mistyrose", new Integer[]{255, 228, Integer.valueOf(JfifUtil.MARKER_APP1), 255}), t.a("moccasin", new Integer[]{255, 228, 181, 255}), t.a("navajowhite", new Integer[]{255, 222, 173, 255}), t.a("navy", new Integer[]{0, 0, numValueOf, 255}), t.a("oldlace", new Integer[]{253, 245, 230, 255}), t.a("olive", new Integer[]{numValueOf, numValueOf, 0, 255}), t.a("olivedrab", new Integer[]{107, 142, 35, 255}), t.a("orange", new Integer[]{255, 165, 0, 255}), t.a("orangered", new Integer[]{255, 69, 0, 255}), t.a("orchid", new Integer[]{Integer.valueOf(JfifUtil.MARKER_SOS), 112, 214, 255}), t.a("palegoldenrod", new Integer[]{238, 232, 170, 255}), t.a("palegreen", new Integer[]{152, 251, 152, 255}), t.a("paleturquoise", new Integer[]{175, 238, 238, 255}), t.a("palevioletred", new Integer[]{219, 112, 147, 255}), t.a("papayawhip", new Integer[]{255, 239, 213, 255}), t.a("peachpuff", new Integer[]{255, Integer.valueOf(JfifUtil.MARKER_SOS), 185, 255}), t.a("peru", new Integer[]{205, 133, 63, 255}), t.a("pink", new Integer[]{255, Integer.valueOf(JfifUtil.MARKER_SOFn), 203, 255}), t.a("plum", new Integer[]{221, 160, 221, 255}), t.a("powderblue", new Integer[]{176, 224, 230, 255}), t.a("purple", new Integer[]{numValueOf, 0, numValueOf, 255}), t.a("rebeccapurple", new Integer[]{102, 51, 153, 255}), t.a("red", new Integer[]{255, 0, 0, 255}), t.a("rosybrown", new Integer[]{188, 143, 143, 255}), t.a("royalblue", new Integer[]{65, 105, Integer.valueOf(JfifUtil.MARKER_APP1), 255}), t.a("saddlebrown", new Integer[]{139, 69, 19, 255}), t.a("salmon", new Integer[]{250, numValueOf, 114, 255}), t.a("sandybrown", new Integer[]{244, 164, 96, 255}), t.a("seagreen", new Integer[]{46, 139, 87, 255}), t.a("seashell", new Integer[]{255, 245, 238, 255}), t.a("sienna", new Integer[]{160, 82, 45, 255}), t.a("silver", new Integer[]{Integer.valueOf(JfifUtil.MARKER_SOFn), Integer.valueOf(JfifUtil.MARKER_SOFn), Integer.valueOf(JfifUtil.MARKER_SOFn), 255}), t.a("skyblue", new Integer[]{135, 206, 235, 255}), t.a("slateblue", new Integer[]{106, 90, 205, 255}), t.a("slategray", new Integer[]{112, numValueOf, 144, 255}), t.a("slategrey", new Integer[]{112, numValueOf, 144, 255}), t.a("snow", new Integer[]{255, 250, 250, 255}), t.a("springgreen", new Integer[]{0, 255, 127, 255}), t.a("steelblue", new Integer[]{70, 130, 180, 255}), t.a("tan", new Integer[]{210, 180, 140, 255}), t.a("teal", new Integer[]{0, numValueOf, numValueOf, 255}), t.a("thistle", new Integer[]{Integer.valueOf(JfifUtil.MARKER_SOI), 191, Integer.valueOf(JfifUtil.MARKER_SOI), 255}), t.a("tomato", new Integer[]{255, 99, 71, 255}), t.a("transparent", new Integer[]{0, 0, 0, 0}), t.a("turquoise", new Integer[]{64, 224, Integer.valueOf(JfifUtil.MARKER_RST0), 255}), t.a("violet", new Integer[]{238, 130, 238, 255}), t.a("wheat", new Integer[]{245, 222, 179, 255}), t.a("white", new Integer[]{255, 255, 255, 255}), t.a("whitesmoke", new Integer[]{245, 245, 245, 255}), t.a("yellow", new Integer[]{255, 255, 0, 255}), t.a("yellowgreen", new Integer[]{154, 205, 50, 255}));
        LinkedHashMap linkedHashMap = new LinkedHashMap(K.e(mapL.size()));
        for (Map.Entry entry : mapL.entrySet()) {
            Object key = entry.getKey();
            Integer[] numArr = (Integer[]) entry.getValue();
            ArrayList arrayList = new ArrayList(numArr.length);
            for (Integer num : numArr) {
                arrayList.add(Float.valueOf(num.intValue() / 255.0f));
            }
            linkedHashMap.put(key, arrayList);
        }
        namedColors = linkedHashMap;
    }
}
