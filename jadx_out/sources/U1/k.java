package U1;

import U1.b;
import U1.e;
import U1.g;
import android.graphics.Matrix;
import android.util.Xml;
import com.facebook.hermes.intl.Constants;
import com.facebook.react.common.assets.ReactFontManager;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.drawable.OutsetBoxShadowDrawableKt;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.views.image.ReactImageView;
import com.facebook.react.views.text.TextAttributeProps;
import expo.modules.kotlin.devtools.ExpoNetworkInspectOkHttpNetworkInterceptor;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.ext.DefaultHandler2;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f11194d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private U1.g f11191a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private g.J f11192b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f11193c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f11195e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private h f11196f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private StringBuilder f11197g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f11198h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private StringBuilder f11199i = null;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f11200a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f11201b;

        static {
            int[] iArr = new int[g.values().length];
            f11201b = iArr;
            try {
                iArr[g.x.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11201b[g.y.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11201b[g.width.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11201b[g.height.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11201b[g.version.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11201b[g.href.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f11201b[g.preserveAspectRatio.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f11201b[g.d.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f11201b[g.pathLength.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f11201b[g.rx.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f11201b[g.ry.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f11201b[g.cx.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f11201b[g.cy.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f11201b[g.r.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f11201b[g.x1.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f11201b[g.y1.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f11201b[g.x2.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f11201b[g.y2.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f11201b[g.dx.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f11201b[g.dy.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f11201b[g.requiredFeatures.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f11201b[g.requiredExtensions.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f11201b[g.systemLanguage.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f11201b[g.requiredFormats.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f11201b[g.requiredFonts.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f11201b[g.refX.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f11201b[g.refY.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f11201b[g.markerWidth.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f11201b[g.markerHeight.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f11201b[g.markerUnits.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f11201b[g.orient.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f11201b[g.gradientUnits.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f11201b[g.gradientTransform.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f11201b[g.spreadMethod.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f11201b[g.fx.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f11201b[g.fy.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f11201b[g.offset.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f11201b[g.clipPathUnits.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                f11201b[g.startOffset.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f11201b[g.patternUnits.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                f11201b[g.patternContentUnits.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                f11201b[g.patternTransform.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                f11201b[g.maskUnits.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                f11201b[g.maskContentUnits.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                f11201b[g.style.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                f11201b[g.CLASS.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                f11201b[g.fill.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                f11201b[g.fill_rule.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                f11201b[g.fill_opacity.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                f11201b[g.stroke.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                f11201b[g.stroke_opacity.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                f11201b[g.stroke_width.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                f11201b[g.stroke_linecap.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                f11201b[g.stroke_linejoin.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                f11201b[g.stroke_miterlimit.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                f11201b[g.stroke_dasharray.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                f11201b[g.stroke_dashoffset.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                f11201b[g.opacity.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                f11201b[g.color.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                f11201b[g.font.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                f11201b[g.font_family.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                f11201b[g.font_size.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                f11201b[g.font_weight.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                f11201b[g.font_style.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                f11201b[g.text_decoration.ordinal()] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                f11201b[g.direction.ordinal()] = 66;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                f11201b[g.text_anchor.ordinal()] = 67;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                f11201b[g.overflow.ordinal()] = 68;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                f11201b[g.marker.ordinal()] = 69;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                f11201b[g.marker_start.ordinal()] = 70;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                f11201b[g.marker_mid.ordinal()] = 71;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                f11201b[g.marker_end.ordinal()] = 72;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                f11201b[g.display.ordinal()] = 73;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                f11201b[g.visibility.ordinal()] = 74;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                f11201b[g.stop_color.ordinal()] = 75;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                f11201b[g.stop_opacity.ordinal()] = 76;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                f11201b[g.clip.ordinal()] = 77;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                f11201b[g.clip_path.ordinal()] = 78;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                f11201b[g.clip_rule.ordinal()] = 79;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                f11201b[g.mask.ordinal()] = 80;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                f11201b[g.solid_color.ordinal()] = 81;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                f11201b[g.solid_opacity.ordinal()] = 82;
            } catch (NoSuchFieldError unused82) {
            }
            try {
                f11201b[g.viewport_fill.ordinal()] = 83;
            } catch (NoSuchFieldError unused83) {
            }
            try {
                f11201b[g.viewport_fill_opacity.ordinal()] = 84;
            } catch (NoSuchFieldError unused84) {
            }
            try {
                f11201b[g.vector_effect.ordinal()] = 85;
            } catch (NoSuchFieldError unused85) {
            }
            try {
                f11201b[g.image_rendering.ordinal()] = 86;
            } catch (NoSuchFieldError unused86) {
            }
            try {
                f11201b[g.viewBox.ordinal()] = 87;
            } catch (NoSuchFieldError unused87) {
            }
            try {
                f11201b[g.type.ordinal()] = 88;
            } catch (NoSuchFieldError unused88) {
            }
            try {
                f11201b[g.media.ordinal()] = 89;
            } catch (NoSuchFieldError unused89) {
            }
            int[] iArr2 = new int[h.values().length];
            f11200a = iArr2;
            try {
                iArr2[h.svg.ordinal()] = 1;
            } catch (NoSuchFieldError unused90) {
            }
            try {
                f11200a[h.g.ordinal()] = 2;
            } catch (NoSuchFieldError unused91) {
            }
            try {
                f11200a[h.a.ordinal()] = 3;
            } catch (NoSuchFieldError unused92) {
            }
            try {
                f11200a[h.defs.ordinal()] = 4;
            } catch (NoSuchFieldError unused93) {
            }
            try {
                f11200a[h.use.ordinal()] = 5;
            } catch (NoSuchFieldError unused94) {
            }
            try {
                f11200a[h.path.ordinal()] = 6;
            } catch (NoSuchFieldError unused95) {
            }
            try {
                f11200a[h.rect.ordinal()] = 7;
            } catch (NoSuchFieldError unused96) {
            }
            try {
                f11200a[h.circle.ordinal()] = 8;
            } catch (NoSuchFieldError unused97) {
            }
            try {
                f11200a[h.ellipse.ordinal()] = 9;
            } catch (NoSuchFieldError unused98) {
            }
            try {
                f11200a[h.line.ordinal()] = 10;
            } catch (NoSuchFieldError unused99) {
            }
            try {
                f11200a[h.polyline.ordinal()] = 11;
            } catch (NoSuchFieldError unused100) {
            }
            try {
                f11200a[h.polygon.ordinal()] = 12;
            } catch (NoSuchFieldError unused101) {
            }
            try {
                f11200a[h.text.ordinal()] = 13;
            } catch (NoSuchFieldError unused102) {
            }
            try {
                f11200a[h.tspan.ordinal()] = 14;
            } catch (NoSuchFieldError unused103) {
            }
            try {
                f11200a[h.tref.ordinal()] = 15;
            } catch (NoSuchFieldError unused104) {
            }
            try {
                f11200a[h.SWITCH.ordinal()] = 16;
            } catch (NoSuchFieldError unused105) {
            }
            try {
                f11200a[h.symbol.ordinal()] = 17;
            } catch (NoSuchFieldError unused106) {
            }
            try {
                f11200a[h.marker.ordinal()] = 18;
            } catch (NoSuchFieldError unused107) {
            }
            try {
                f11200a[h.linearGradient.ordinal()] = 19;
            } catch (NoSuchFieldError unused108) {
            }
            try {
                f11200a[h.radialGradient.ordinal()] = 20;
            } catch (NoSuchFieldError unused109) {
            }
            try {
                f11200a[h.stop.ordinal()] = 21;
            } catch (NoSuchFieldError unused110) {
            }
            try {
                f11200a[h.title.ordinal()] = 22;
            } catch (NoSuchFieldError unused111) {
            }
            try {
                f11200a[h.desc.ordinal()] = 23;
            } catch (NoSuchFieldError unused112) {
            }
            try {
                f11200a[h.clipPath.ordinal()] = 24;
            } catch (NoSuchFieldError unused113) {
            }
            try {
                f11200a[h.textPath.ordinal()] = 25;
            } catch (NoSuchFieldError unused114) {
            }
            try {
                f11200a[h.pattern.ordinal()] = 26;
            } catch (NoSuchFieldError unused115) {
            }
            try {
                f11200a[h.image.ordinal()] = 27;
            } catch (NoSuchFieldError unused116) {
            }
            try {
                f11200a[h.view.ordinal()] = 28;
            } catch (NoSuchFieldError unused117) {
            }
            try {
                f11200a[h.mask.ordinal()] = 29;
            } catch (NoSuchFieldError unused118) {
            }
            try {
                f11200a[h.style.ordinal()] = 30;
            } catch (NoSuchFieldError unused119) {
            }
            try {
                f11200a[h.solidColor.ordinal()] = 31;
            } catch (NoSuchFieldError unused120) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Map f11202a;

        static {
            HashMap map = new HashMap(10);
            f11202a = map;
            map.put("none", e.a.none);
            map.put("xMinYMin", e.a.xMinYMin);
            map.put("xMidYMin", e.a.xMidYMin);
            map.put("xMaxYMin", e.a.xMaxYMin);
            map.put("xMinYMid", e.a.xMinYMid);
            map.put("xMidYMid", e.a.xMidYMid);
            map.put("xMaxYMid", e.a.xMaxYMid);
            map.put("xMinYMax", e.a.xMinYMax);
            map.put("xMidYMax", e.a.xMidYMax);
            map.put("xMaxYMax", e.a.xMaxYMax);
        }

        static e.a a(String str) {
            return (e.a) f11202a.get(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Map f11203a;

        static {
            HashMap map = new HashMap(47);
            f11203a = map;
            map.put("aliceblue", -984833);
            map.put("antiquewhite", -332841);
            map.put("aqua", -16711681);
            map.put("aquamarine", -8388652);
            map.put("azure", -983041);
            map.put("beige", -657956);
            map.put("bisque", -6972);
            map.put("black", -16777216);
            map.put("blanchedalmond", -5171);
            map.put("blue", -16776961);
            map.put("blueviolet", -7722014);
            map.put("brown", -5952982);
            map.put("burlywood", -2180985);
            map.put("cadetblue", -10510688);
            map.put("chartreuse", -8388864);
            map.put("chocolate", -2987746);
            map.put("coral", -32944);
            map.put("cornflowerblue", -10185235);
            map.put("cornsilk", -1828);
            map.put("crimson", -2354116);
            map.put("cyan", -16711681);
            map.put("darkblue", -16777077);
            map.put("darkcyan", -16741493);
            map.put("darkgoldenrod", -4684277);
            map.put("darkgray", -5658199);
            map.put("darkgreen", -16751616);
            map.put("darkgrey", -5658199);
            map.put("darkkhaki", -4343957);
            map.put("darkmagenta", -7667573);
            map.put("darkolivegreen", -11179217);
            map.put("darkorange", -29696);
            map.put("darkorchid", -6737204);
            map.put("darkred", -7667712);
            map.put("darksalmon", -1468806);
            map.put("darkseagreen", -7357297);
            map.put("darkslateblue", -12042869);
            map.put("darkslategray", -13676721);
            map.put("darkslategrey", -13676721);
            map.put("darkturquoise", -16724271);
            map.put("darkviolet", -7077677);
            map.put("deeppink", -60269);
            map.put("deepskyblue", -16728065);
            map.put("dimgray", -9868951);
            map.put("dimgrey", -9868951);
            map.put("dodgerblue", -14774017);
            map.put("firebrick", -5103070);
            map.put("floralwhite", -1296);
            map.put("forestgreen", -14513374);
            map.put("fuchsia", -65281);
            map.put("gainsboro", -2302756);
            map.put("ghostwhite", -460545);
            map.put("gold", -10496);
            map.put("goldenrod", -2448096);
            map.put("gray", -8355712);
            map.put("green", -16744448);
            map.put("greenyellow", -5374161);
            map.put("grey", -8355712);
            map.put("honeydew", -983056);
            map.put("hotpink", -38476);
            map.put("indianred", -3318692);
            map.put("indigo", -11861886);
            map.put("ivory", -16);
            map.put("khaki", -989556);
            map.put("lavender", -1644806);
            map.put("lavenderblush", -3851);
            map.put("lawngreen", -8586240);
            map.put("lemonchiffon", -1331);
            map.put("lightblue", -5383962);
            map.put("lightcoral", -1015680);
            map.put("lightcyan", -2031617);
            map.put("lightgoldenrodyellow", -329006);
            map.put("lightgray", -2894893);
            map.put("lightgreen", -7278960);
            map.put("lightgrey", -2894893);
            map.put("lightpink", -18751);
            map.put("lightsalmon", -24454);
            map.put("lightseagreen", -14634326);
            map.put("lightskyblue", -7876870);
            map.put("lightslategray", -8943463);
            map.put("lightslategrey", -8943463);
            map.put("lightsteelblue", -5192482);
            map.put("lightyellow", -32);
            map.put("lime", -16711936);
            map.put("limegreen", -13447886);
            map.put("linen", -331546);
            map.put("magenta", -65281);
            map.put("maroon", -8388608);
            map.put("mediumaquamarine", -10039894);
            map.put("mediumblue", -16777011);
            map.put("mediumorchid", -4565549);
            map.put("mediumpurple", -7114533);
            map.put("mediumseagreen", -12799119);
            map.put("mediumslateblue", -8689426);
            map.put("mediumspringgreen", -16713062);
            map.put("mediumturquoise", -12004916);
            map.put("mediumvioletred", -3730043);
            map.put("midnightblue", -15132304);
            map.put("mintcream", -655366);
            map.put("mistyrose", -6943);
            map.put("moccasin", -6987);
            map.put("navajowhite", -8531);
            map.put("navy", -16777088);
            map.put("oldlace", -133658);
            map.put("olive", -8355840);
            map.put("olivedrab", -9728477);
            map.put("orange", -23296);
            map.put("orangered", -47872);
            map.put("orchid", -2461482);
            map.put("palegoldenrod", -1120086);
            map.put("palegreen", -6751336);
            map.put("paleturquoise", -5247250);
            map.put("palevioletred", -2396013);
            map.put("papayawhip", -4139);
            map.put("peachpuff", -9543);
            map.put("peru", -3308225);
            map.put("pink", -16181);
            map.put("plum", -2252579);
            map.put("powderblue", -5185306);
            map.put("purple", -8388480);
            map.put("rebeccapurple", -10079335);
            map.put("red", -65536);
            map.put("rosybrown", -4419697);
            map.put("royalblue", -12490271);
            map.put("saddlebrown", -7650029);
            map.put("salmon", -360334);
            map.put("sandybrown", -744352);
            map.put("seagreen", -13726889);
            map.put("seashell", -2578);
            map.put("sienna", -6270419);
            map.put("silver", -4144960);
            map.put("skyblue", -7876885);
            map.put("slateblue", -9807155);
            map.put("slategray", -9404272);
            map.put("slategrey", -9404272);
            map.put("snow", -1286);
            map.put("springgreen", -16711809);
            map.put("steelblue", -12156236);
            map.put("tan", -2968436);
            map.put("teal", -16744320);
            map.put("thistle", -2572328);
            map.put("tomato", -40121);
            map.put("turquoise", -12525360);
            map.put("violet", -1146130);
            map.put("wheat", -663885);
            map.put("white", -1);
            map.put("whitesmoke", -657931);
            map.put("yellow", -256);
            map.put("yellowgreen", -6632142);
            map.put("transparent", 0);
        }

        static Integer a(String str) {
            return (Integer) f11203a.get(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Map f11204a;

        static {
            HashMap map = new HashMap(9);
            f11204a = map;
            g.d0 d0Var = g.d0.pt;
            map.put("xx-small", new g.C1462p(0.694f, d0Var));
            map.put("x-small", new g.C1462p(0.833f, d0Var));
            map.put("small", new g.C1462p(10.0f, d0Var));
            map.put("medium", new g.C1462p(12.0f, d0Var));
            map.put("large", new g.C1462p(14.4f, d0Var));
            map.put("x-large", new g.C1462p(17.3f, d0Var));
            map.put("xx-large", new g.C1462p(20.7f, d0Var));
            g.d0 d0Var2 = g.d0.percent;
            map.put("smaller", new g.C1462p(83.33f, d0Var2));
            map.put("larger", new g.C1462p(120.0f, d0Var2));
        }

        static g.C1462p a(String str) {
            return (g.C1462p) f11204a.get(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Map f11205a;

        static {
            HashMap map = new HashMap(13);
            f11205a = map;
            Integer numValueOf = Integer.valueOf(ReactFontManager.TypefaceStyle.NORMAL);
            map.put("normal", numValueOf);
            Integer numValueOf2 = Integer.valueOf(ReactFontManager.TypefaceStyle.BOLD);
            map.put("bold", numValueOf2);
            map.put("bolder", 1);
            map.put("lighter", -1);
            map.put("100", 100);
            map.put("200", 200);
            map.put("300", Integer.valueOf(ReactImageView.REMOTE_IMAGE_FADE_DURATION_MS));
            map.put("400", numValueOf);
            map.put("500", 500);
            map.put("600", 600);
            map.put("700", numValueOf2);
            map.put("800", 800);
            map.put("900", 900);
        }

        static Integer a(String str) {
            return (Integer) f11205a.get(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class f extends DefaultHandler2 {
        private f() {
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void characters(char[] cArr, int i10, int i11) {
            k.this.c1(new String(cArr, i10, i11));
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endDocument() {
            k.this.o();
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endElement(String str, String str2, String str3) {
            k.this.p(str, str2, str3);
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void processingInstruction(String str, String str2) {
            k.this.r(str, k.this.x0(new i(str2)));
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startDocument() {
            k.this.W0();
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startElement(String str, String str2, String str3, Attributes attributes) throws U1.j {
            k.this.X0(str, str2, str3, attributes);
        }

        /* synthetic */ f(k kVar, a aVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private enum g {
        CLASS,
        clip,
        clip_path,
        clipPathUnits,
        clip_rule,
        color,
        cx,
        cy,
        direction,
        dx,
        dy,
        fx,
        fy,
        d,
        display,
        fill,
        fill_rule,
        fill_opacity,
        font,
        font_family,
        font_size,
        font_weight,
        font_style,
        gradientTransform,
        gradientUnits,
        height,
        href,
        image_rendering,
        marker,
        marker_start,
        marker_mid,
        marker_end,
        markerHeight,
        markerUnits,
        markerWidth,
        mask,
        maskContentUnits,
        maskUnits,
        media,
        offset,
        opacity,
        orient,
        overflow,
        pathLength,
        patternContentUnits,
        patternTransform,
        patternUnits,
        points,
        preserveAspectRatio,
        r,
        refX,
        refY,
        requiredFeatures,
        requiredExtensions,
        requiredFormats,
        requiredFonts,
        rx,
        ry,
        solid_color,
        solid_opacity,
        spreadMethod,
        startOffset,
        stop_color,
        stop_opacity,
        stroke,
        stroke_dasharray,
        stroke_dashoffset,
        stroke_linecap,
        stroke_linejoin,
        stroke_miterlimit,
        stroke_opacity,
        stroke_width,
        style,
        systemLanguage,
        text_anchor,
        text_decoration,
        transform,
        type,
        vector_effect,
        version,
        viewBox,
        width,
        x,
        y,
        x1,
        y1,
        x2,
        y2,
        viewport_fill,
        viewport_fill_opacity,
        visibility,
        UNSUPPORTED;


        /* JADX INFO: renamed from: U0, reason: collision with root package name */
        private static final Map f11248U0 = new HashMap();

        static {
            for (g gVar : values()) {
                if (gVar == CLASS) {
                    f11248U0.put("class", gVar);
                } else if (gVar != UNSUPPORTED) {
                    f11248U0.put(gVar.name().replace('_', '-'), gVar);
                }
            }
        }

        public static g h(String str) {
            g gVar = (g) f11248U0.get(str);
            return gVar != null ? gVar : UNSUPPORTED;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private enum h {
        svg,
        a,
        circle,
        clipPath,
        defs,
        desc,
        ellipse,
        g,
        image,
        line,
        linearGradient,
        marker,
        mask,
        path,
        pattern,
        polygon,
        polyline,
        radialGradient,
        rect,
        solidColor,
        stop,
        style,
        SWITCH,
        symbol,
        text,
        textPath,
        title,
        tref,
        tspan,
        use,
        view,
        UNSUPPORTED;


        /* JADX INFO: renamed from: M, reason: collision with root package name */
        private static final Map f11313M = new HashMap();

        static {
            for (h hVar : values()) {
                if (hVar == SWITCH) {
                    f11313M.put("switch", hVar);
                } else if (hVar != UNSUPPORTED) {
                    f11313M.put(hVar.name(), hVar);
                }
            }
        }

        public static h h(String str) {
            h hVar = (h) f11313M.get(str);
            return hVar != null ? hVar : UNSUPPORTED;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f11335a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f11337c;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f11336b = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private U1.d f11338d = new U1.d();

        i(String str) {
            this.f11337c = 0;
            String strTrim = str.trim();
            this.f11335a = strTrim;
            this.f11337c = strTrim.length();
        }

        void A() {
            while (true) {
                int i10 = this.f11336b;
                if (i10 >= this.f11337c || !k(this.f11335a.charAt(i10))) {
                    return;
                } else {
                    this.f11336b++;
                }
            }
        }

        int a() {
            int i10 = this.f11336b;
            int i11 = this.f11337c;
            if (i10 == i11) {
                return -1;
            }
            int i12 = i10 + 1;
            this.f11336b = i12;
            if (i12 < i11) {
                return this.f11335a.charAt(i12);
            }
            return -1;
        }

        String b() {
            int i10 = this.f11336b;
            while (!h() && !k(this.f11335a.charAt(this.f11336b))) {
                this.f11336b++;
            }
            String strSubstring = this.f11335a.substring(i10, this.f11336b);
            this.f11336b = i10;
            return strSubstring;
        }

        Boolean c(Object obj) {
            if (obj == null) {
                return null;
            }
            z();
            return m();
        }

        float d(float f10) {
            if (Float.isNaN(f10)) {
                return Float.NaN;
            }
            z();
            return n();
        }

        float e(Boolean bool) {
            if (bool == null) {
                return Float.NaN;
            }
            z();
            return n();
        }

        boolean f(char c10) {
            int i10 = this.f11336b;
            boolean z10 = i10 < this.f11337c && this.f11335a.charAt(i10) == c10;
            if (z10) {
                this.f11336b++;
            }
            return z10;
        }

        boolean g(String str) {
            int length = str.length();
            int i10 = this.f11336b;
            boolean z10 = i10 <= this.f11337c - length && this.f11335a.substring(i10, i10 + length).equals(str);
            if (z10) {
                this.f11336b += length;
            }
            return z10;
        }

        boolean h() {
            return this.f11336b == this.f11337c;
        }

        boolean i() {
            int i10 = this.f11336b;
            if (i10 == this.f11337c) {
                return false;
            }
            char cCharAt = this.f11335a.charAt(i10);
            if (cCharAt < 'a' || cCharAt > 'z') {
                return cCharAt >= 'A' && cCharAt <= 'Z';
            }
            return true;
        }

        boolean j(int i10) {
            return i10 == 10 || i10 == 13;
        }

        boolean k(int i10) {
            return i10 == 32 || i10 == 10 || i10 == 13 || i10 == 9;
        }

        Integer l() {
            int i10 = this.f11336b;
            if (i10 == this.f11337c) {
                return null;
            }
            String str = this.f11335a;
            this.f11336b = i10 + 1;
            return Integer.valueOf(str.charAt(i10));
        }

        Boolean m() {
            int i10 = this.f11336b;
            if (i10 == this.f11337c) {
                return null;
            }
            char cCharAt = this.f11335a.charAt(i10);
            if (cCharAt != '0' && cCharAt != '1') {
                return null;
            }
            this.f11336b++;
            return Boolean.valueOf(cCharAt == '1');
        }

        float n() {
            float fB = this.f11338d.b(this.f11335a, this.f11336b, this.f11337c);
            if (!Float.isNaN(fB)) {
                this.f11336b = this.f11338d.a();
            }
            return fB;
        }

        String o() {
            if (h()) {
                return null;
            }
            int i10 = this.f11336b;
            int iCharAt = this.f11335a.charAt(i10);
            while (true) {
                if ((iCharAt < 97 || iCharAt > 122) && (iCharAt < 65 || iCharAt > 90)) {
                    break;
                }
                iCharAt = a();
            }
            int i11 = this.f11336b;
            while (k(iCharAt)) {
                iCharAt = a();
            }
            if (iCharAt == 40) {
                this.f11336b++;
                return this.f11335a.substring(i10, i11);
            }
            this.f11336b = i10;
            return null;
        }

        g.C1462p p() {
            float fN = n();
            if (Float.isNaN(fN)) {
                return null;
            }
            g.d0 d0VarV = v();
            return d0VarV == null ? new g.C1462p(fN, g.d0.px) : new g.C1462p(fN, d0VarV);
        }

        String q() {
            if (h()) {
                return null;
            }
            int i10 = this.f11336b;
            char cCharAt = this.f11335a.charAt(i10);
            if (cCharAt != '\'' && cCharAt != '\"') {
                return null;
            }
            int iA = a();
            while (iA != -1 && iA != cCharAt) {
                iA = a();
            }
            if (iA == -1) {
                this.f11336b = i10;
                return null;
            }
            int i11 = this.f11336b;
            this.f11336b = i11 + 1;
            return this.f11335a.substring(i10 + 1, i11);
        }

        String r() {
            return t(' ', false);
        }

        String s(char c10) {
            return t(c10, false);
        }

        String t(char c10, boolean z10) {
            if (h()) {
                return null;
            }
            char cCharAt = this.f11335a.charAt(this.f11336b);
            if ((!z10 && k(cCharAt)) || cCharAt == c10) {
                return null;
            }
            int i10 = this.f11336b;
            int iA = a();
            while (iA != -1 && iA != c10 && (z10 || !k(iA))) {
                iA = a();
            }
            return this.f11335a.substring(i10, this.f11336b);
        }

        String u(char c10) {
            return t(c10, true);
        }

        g.d0 v() {
            if (h()) {
                return null;
            }
            if (this.f11335a.charAt(this.f11336b) == '%') {
                this.f11336b++;
                return g.d0.percent;
            }
            int i10 = this.f11336b;
            if (i10 > this.f11337c - 2) {
                return null;
            }
            try {
                g.d0 d0VarValueOf = g.d0.valueOf(this.f11335a.substring(i10, i10 + 2).toLowerCase(Locale.US));
                this.f11336b += 2;
                return d0VarValueOf;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        String w() {
            if (h()) {
                return null;
            }
            int i10 = this.f11336b;
            char cCharAt = this.f11335a.charAt(i10);
            if ((cCharAt < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z')) {
                this.f11336b = i10;
                return null;
            }
            int iA = a();
            while (true) {
                if ((iA < 65 || iA > 90) && (iA < 97 || iA > 122)) {
                    break;
                }
                iA = a();
            }
            return this.f11335a.substring(i10, this.f11336b);
        }

        float x() {
            z();
            float fB = this.f11338d.b(this.f11335a, this.f11336b, this.f11337c);
            if (!Float.isNaN(fB)) {
                this.f11336b = this.f11338d.a();
            }
            return fB;
        }

        String y() {
            if (h()) {
                return null;
            }
            int i10 = this.f11336b;
            this.f11336b = this.f11337c;
            return this.f11335a.substring(i10);
        }

        boolean z() {
            A();
            int i10 = this.f11336b;
            if (i10 == this.f11337c || this.f11335a.charAt(i10) != ',') {
                return false;
            }
            this.f11336b++;
            A();
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class j implements Attributes {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private XmlPullParser f11339a;

        public j(XmlPullParser xmlPullParser) {
            this.f11339a = xmlPullParser;
        }

        @Override // org.xml.sax.Attributes
        public int getIndex(String str, String str2) {
            return -1;
        }

        @Override // org.xml.sax.Attributes
        public int getLength() {
            return this.f11339a.getAttributeCount();
        }

        @Override // org.xml.sax.Attributes
        public String getLocalName(int i10) {
            return this.f11339a.getAttributeName(i10);
        }

        @Override // org.xml.sax.Attributes
        public String getQName(int i10) {
            String attributeName = this.f11339a.getAttributeName(i10);
            if (this.f11339a.getAttributePrefix(i10) == null) {
                return attributeName;
            }
            return this.f11339a.getAttributePrefix(i10) + ':' + attributeName;
        }

        @Override // org.xml.sax.Attributes
        public String getType(int i10) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getURI(int i10) {
            return this.f11339a.getAttributeNamespace(i10);
        }

        @Override // org.xml.sax.Attributes
        public String getValue(int i10) {
            return this.f11339a.getAttributeValue(i10);
        }

        @Override // org.xml.sax.Attributes
        public int getIndex(String str) {
            return -1;
        }

        @Override // org.xml.sax.Attributes
        public String getType(String str, String str2) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getValue(String str, String str2) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getType(String str) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getValue(String str) {
            return null;
        }
    }

    k() {
    }

    private void A(g.C1451d c1451d, Attributes attributes) throws U1.j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            switch (a.f11201b[g.h(attributes.getLocalName(i10)).ordinal()]) {
                case 12:
                    c1451d.f11056o = o0(strTrim);
                    break;
                case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                    c1451d.f11057p = o0(strTrim);
                    break;
                case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                    g.C1462p c1462pO0 = o0(strTrim);
                    c1451d.f11058q = c1462pO0;
                    if (c1462pO0.h()) {
                        throw new U1.j("Invalid <circle> element. r cannot be negative");
                    }
                    break;
                    break;
            }
        }
    }

    private static Set A0(String str) {
        i iVar = new i(str);
        HashSet hashSet = new HashSet();
        while (!iVar.h()) {
            hashSet.add(iVar.r());
            iVar.A();
        }
        return hashSet;
    }

    private void B(g.C1452e c1452e, Attributes attributes) throws U1.j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            if (a.f11201b[g.h(attributes.getLocalName(i10)).ordinal()] == 38) {
                if ("objectBoundingBox".equals(strTrim)) {
                    c1452e.f11069p = Boolean.FALSE;
                } else {
                    if (!"userSpaceOnUse".equals(strTrim)) {
                        throw new U1.j("Invalid value for attribute clipPathUnits");
                    }
                    c1452e.f11069p = Boolean.TRUE;
                }
            }
        }
    }

    private static g.C1462p[] B0(String str) {
        g.C1462p c1462pP;
        i iVar = new i(str);
        iVar.A();
        if (iVar.h() || (c1462pP = iVar.p()) == null || c1462pP.h()) {
            return null;
        }
        float fA = c1462pP.a();
        ArrayList arrayList = new ArrayList();
        arrayList.add(c1462pP);
        while (!iVar.h()) {
            iVar.z();
            g.C1462p c1462pP2 = iVar.p();
            if (c1462pP2 == null || c1462pP2.h()) {
                return null;
            }
            arrayList.add(c1462pP2);
            fA += c1462pP2.a();
        }
        if (fA == 0.0f) {
            return null;
        }
        return (g.C1462p[]) arrayList.toArray(new g.C1462p[arrayList.size()]);
    }

    private void C(g.G g10, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            switch (a.f11201b[g.h(attributes.getLocalName(i10)).ordinal()]) {
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DY /* 21 */:
                    g10.h(z0(strTrim));
                    break;
                case TextAttributeProps.TA_KEY_IS_HIGHLIGHTED /* 22 */:
                    g10.j(strTrim);
                    break;
                case TextAttributeProps.TA_KEY_LAYOUT_DIRECTION /* 23 */:
                    g10.l(F0(strTrim));
                    break;
                case TextAttributeProps.TA_KEY_ACCESSIBILITY_ROLE /* 24 */:
                    g10.d(A0(strTrim));
                    break;
                case TextAttributeProps.TA_KEY_LINE_BREAK_STRATEGY /* 25 */:
                    List listI0 = i0(strTrim);
                    g10.f(listI0 != null ? new HashSet(listI0) : new HashSet(0));
                    break;
            }
        }
    }

    private static g.E.c C0(String str) {
        if ("butt".equals(str)) {
            return g.E.c.Butt;
        }
        if ("round".equals(str)) {
            return g.E.c.Round;
        }
        if ("square".equals(str)) {
            return g.E.c.Square;
        }
        return null;
    }

    private void D(g.L l10, Attributes attributes) throws U1.j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String qName = attributes.getQName(i10);
            if (qName.equals("id") || qName.equals("xml:id")) {
                l10.f11016c = attributes.getValue(i10).trim();
                return;
            }
            if (qName.equals("xml:space")) {
                String strTrim = attributes.getValue(i10).trim();
                if (Constants.COLLATION_DEFAULT.equals(strTrim)) {
                    l10.f11017d = Boolean.FALSE;
                    return;
                } else {
                    if ("preserve".equals(strTrim)) {
                        l10.f11017d = Boolean.TRUE;
                        return;
                    }
                    throw new U1.j("Invalid value for \"xml:space\" attribute: " + strTrim);
                }
            }
        }
    }

    private static g.E.d D0(String str) {
        if ("miter".equals(str)) {
            return g.E.d.Miter;
        }
        if ("round".equals(str)) {
            return g.E.d.Round;
        }
        if ("bevel".equals(str)) {
            return g.E.d.Bevel;
        }
        return null;
    }

    private void E(g.C1455i c1455i, Attributes attributes) throws U1.j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            switch (a.f11201b[g.h(attributes.getLocalName(i10)).ordinal()]) {
                case 10:
                    g.C1462p c1462pO0 = o0(strTrim);
                    c1455i.f11081q = c1462pO0;
                    if (c1462pO0.h()) {
                        throw new U1.j("Invalid <ellipse> element. rx cannot be negative");
                    }
                    break;
                    break;
                case 11:
                    g.C1462p c1462pO02 = o0(strTrim);
                    c1455i.f11082r = c1462pO02;
                    if (c1462pO02.h()) {
                        throw new U1.j("Invalid <ellipse> element. ry cannot be negative");
                    }
                    break;
                    break;
                case 12:
                    c1455i.f11079o = o0(strTrim);
                    break;
                case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                    c1455i.f11080p = o0(strTrim);
                    break;
            }
        }
    }

    private static void E0(g.L l10, String str) {
        i iVar = new i(str.replaceAll("/\\*.*?\\*/", PointerEventHelper.POINTER_TYPE_UNKNOWN));
        while (true) {
            String strS = iVar.s(':');
            iVar.A();
            if (!iVar.f(':')) {
                return;
            }
            iVar.A();
            String strU = iVar.u(';');
            if (strU == null) {
                return;
            }
            iVar.A();
            if (iVar.h() || iVar.f(';')) {
                if (l10.f11019f == null) {
                    l10.f11019f = new g.E();
                }
                S0(l10.f11019f, strS, strU);
                iVar.A();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x008c, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void F(g.AbstractC1456j abstractC1456j, Attributes attributes) throws U1.j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f11201b[g.h(attributes.getLocalName(i10)).ordinal()];
            if (i11 != 6) {
                switch (i11) {
                    case IntBufferBatchMountItem.INSTRUCTION_UPDATE_PROPS /* 32 */:
                        if (!"objectBoundingBox".equals(strTrim)) {
                            if (!"userSpaceOnUse".equals(strTrim)) {
                                throw new U1.j("Invalid value for attribute gradientUnits");
                            }
                            abstractC1456j.f11084i = Boolean.TRUE;
                        } else {
                            abstractC1456j.f11084i = Boolean.FALSE;
                        }
                        break;
                    case 33:
                        abstractC1456j.f11085j = J0(strTrim);
                        break;
                    case 34:
                        try {
                            abstractC1456j.f11086k = g.EnumC1457k.valueOf(strTrim);
                        } catch (IllegalArgumentException unused) {
                            throw new U1.j("Invalid spreadMethod attribute. \"" + strTrim + "\" is not a valid value.");
                        }
                        break;
                }
            } else if (PointerEventHelper.POINTER_TYPE_UNKNOWN.equals(attributes.getURI(i10)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i10))) {
                abstractC1456j.f11087l = strTrim;
            }
        }
    }

    private static Set F0(String str) {
        i iVar = new i(str);
        HashSet hashSet = new HashSet();
        while (!iVar.h()) {
            String strR = iVar.r();
            int iIndexOf = strR.indexOf(45);
            if (iIndexOf != -1) {
                strR = strR.substring(0, iIndexOf);
            }
            hashSet.add(new Locale(strR, PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN).getLanguage());
            iVar.A();
        }
        return hashSet;
    }

    private void G(g.C1461o c1461o, Attributes attributes) throws U1.j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f11201b[g.h(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 1) {
                c1461o.f11095q = o0(strTrim);
            } else if (i11 == 2) {
                c1461o.f11096r = o0(strTrim);
            } else if (i11 == 3) {
                g.C1462p c1462pO0 = o0(strTrim);
                c1461o.f11097s = c1462pO0;
                if (c1462pO0.h()) {
                    throw new U1.j("Invalid <use> element. width cannot be negative");
                }
            } else if (i11 == 4) {
                g.C1462p c1462pO02 = o0(strTrim);
                c1461o.f11098t = c1462pO02;
                if (c1462pO02.h()) {
                    throw new U1.j("Invalid <use> element. height cannot be negative");
                }
            } else if (i11 != 6) {
                if (i11 == 7) {
                    w0(c1461o, strTrim);
                }
            } else if (PointerEventHelper.POINTER_TYPE_UNKNOWN.equals(attributes.getURI(i10)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i10))) {
                c1461o.f11094p = strTrim;
            }
        }
    }

    private static g.E.f G0(String str) {
        str.getClass();
        switch (str) {
            case "middle":
                return g.E.f.Middle;
            case "end":
                return g.E.f.End;
            case "start":
                return g.E.f.Start;
            default:
                return null;
        }
    }

    private void H(g.C1463q c1463q, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            switch (a.f11201b[g.h(attributes.getLocalName(i10)).ordinal()]) {
                case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                    c1463q.f11102o = o0(strTrim);
                    break;
                case 16:
                    c1463q.f11103p = o0(strTrim);
                    break;
                case 17:
                    c1463q.f11104q = o0(strTrim);
                    break;
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
                    c1463q.f11105r = o0(strTrim);
                    break;
            }
        }
    }

    private static g.E.EnumC0113g H0(String str) {
        str.getClass();
        switch (str) {
            case "line-through":
                return g.E.EnumC0113g.LineThrough;
            case "underline":
                return g.E.EnumC0113g.Underline;
            case "none":
                return g.E.EnumC0113g.None;
            case "blink":
                return g.E.EnumC0113g.Blink;
            case "overline":
                return g.E.EnumC0113g.Overline;
            default:
                return null;
        }
    }

    private void I(g.M m10, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            switch (a.f11201b[g.h(attributes.getLocalName(i10)).ordinal()]) {
                case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                    m10.f11021m = o0(strTrim);
                    break;
                case 16:
                    m10.f11022n = o0(strTrim);
                    break;
                case 17:
                    m10.f11023o = o0(strTrim);
                    break;
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
                    m10.f11024p = o0(strTrim);
                    break;
            }
        }
    }

    private static g.E.h I0(String str) {
        str.getClass();
        if (str.equals("ltr")) {
            return g.E.h.LTR;
        }
        if (str.equals("rtl")) {
            return g.E.h.RTL;
        }
        return null;
    }

    private void J(g.C1464r c1464r, Attributes attributes) throws U1.j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            switch (a.f11201b[g.h(attributes.getLocalName(i10)).ordinal()]) {
                case TextAttributeProps.TA_KEY_ROLE /* 26 */:
                    c1464r.f11107r = o0(strTrim);
                    break;
                case TextAttributeProps.TA_KEY_TEXT_TRANSFORM /* 27 */:
                    c1464r.f11108s = o0(strTrim);
                    break;
                case OutsetBoxShadowDrawableKt.MIN_OUTSET_BOX_SHADOW_SDK_VERSION /* 28 */:
                    g.C1462p c1462pO0 = o0(strTrim);
                    c1464r.f11109t = c1462pO0;
                    if (c1462pO0.h()) {
                        throw new U1.j("Invalid <marker> element. markerWidth cannot be negative");
                    }
                    break;
                    break;
                case 29:
                    g.C1462p c1462pO02 = o0(strTrim);
                    c1464r.f11110u = c1462pO02;
                    if (c1462pO02.h()) {
                        throw new U1.j("Invalid <marker> element. markerHeight cannot be negative");
                    }
                    break;
                    break;
                case 30:
                    if (!"strokeWidth".equals(strTrim)) {
                        if (!"userSpaceOnUse".equals(strTrim)) {
                            throw new U1.j("Invalid value for attribute markerUnits");
                        }
                        c1464r.f11106q = true;
                    } else {
                        c1464r.f11106q = false;
                    }
                    break;
                case 31:
                    if ("auto".equals(strTrim)) {
                        c1464r.f11111v = Float.valueOf(Float.NaN);
                    } else {
                        c1464r.f11111v = Float.valueOf(f0(strTrim));
                    }
                    break;
            }
        }
    }

    private Matrix J0(String str) throws U1.j {
        Matrix matrix = new Matrix();
        i iVar = new i(str);
        iVar.A();
        while (!iVar.h()) {
            String strO = iVar.o();
            if (strO == null) {
                throw new U1.j("Bad transform function encountered in transform list: " + str);
            }
            switch (strO) {
                case "matrix":
                    iVar.A();
                    float fN = iVar.n();
                    iVar.z();
                    float fN2 = iVar.n();
                    iVar.z();
                    float fN3 = iVar.n();
                    iVar.z();
                    float fN4 = iVar.n();
                    iVar.z();
                    float fN5 = iVar.n();
                    iVar.z();
                    float fN6 = iVar.n();
                    iVar.A();
                    if (Float.isNaN(fN6) || !iVar.f(')')) {
                        throw new U1.j("Invalid transform list: " + str);
                    }
                    Matrix matrix2 = new Matrix();
                    matrix2.setValues(new float[]{fN, fN3, fN5, fN2, fN4, fN6, 0.0f, 0.0f, 1.0f});
                    matrix.preConcat(matrix2);
                    break;
                    break;
                case "rotate":
                    iVar.A();
                    float fN7 = iVar.n();
                    float fX = iVar.x();
                    float fX2 = iVar.x();
                    iVar.A();
                    if (Float.isNaN(fN7) || !iVar.f(')')) {
                        throw new U1.j("Invalid transform list: " + str);
                    }
                    if (Float.isNaN(fX)) {
                        matrix.preRotate(fN7);
                    } else {
                        if (Float.isNaN(fX2)) {
                            throw new U1.j("Invalid transform list: " + str);
                        }
                        matrix.preRotate(fN7, fX, fX2);
                    }
                    break;
                    break;
                case "scale":
                    iVar.A();
                    float fN8 = iVar.n();
                    float fX3 = iVar.x();
                    iVar.A();
                    if (Float.isNaN(fN8) || !iVar.f(')')) {
                        throw new U1.j("Invalid transform list: " + str);
                    }
                    if (!Float.isNaN(fX3)) {
                        matrix.preScale(fN8, fX3);
                    } else {
                        matrix.preScale(fN8, fN8);
                    }
                    break;
                    break;
                case "skewX":
                    iVar.A();
                    float fN9 = iVar.n();
                    iVar.A();
                    if (Float.isNaN(fN9) || !iVar.f(')')) {
                        throw new U1.j("Invalid transform list: " + str);
                    }
                    matrix.preSkew((float) Math.tan(Math.toRadians(fN9)), 0.0f);
                    break;
                    break;
                case "skewY":
                    iVar.A();
                    float fN10 = iVar.n();
                    iVar.A();
                    if (Float.isNaN(fN10) || !iVar.f(')')) {
                        throw new U1.j("Invalid transform list: " + str);
                    }
                    matrix.preSkew(0.0f, (float) Math.tan(Math.toRadians(fN10)));
                    break;
                    break;
                case "translate":
                    iVar.A();
                    float fN11 = iVar.n();
                    float fX4 = iVar.x();
                    iVar.A();
                    if (Float.isNaN(fN11) || !iVar.f(')')) {
                        throw new U1.j("Invalid transform list: " + str);
                    }
                    if (!Float.isNaN(fX4)) {
                        matrix.preTranslate(fN11, fX4);
                    } else {
                        matrix.preTranslate(fN11, 0.0f);
                    }
                    break;
                    break;
                default:
                    throw new U1.j("Invalid transform list fn: " + strO + ")");
            }
            if (iVar.h()) {
                return matrix;
            }
            iVar.z();
        }
        return matrix;
    }

    private void K(g.C1465s c1465s, Attributes attributes) throws U1.j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f11201b[g.h(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 1) {
                c1465s.f11114q = o0(strTrim);
            } else if (i11 == 2) {
                c1465s.f11115r = o0(strTrim);
            } else if (i11 == 3) {
                g.C1462p c1462pO0 = o0(strTrim);
                c1465s.f11116s = c1462pO0;
                if (c1462pO0.h()) {
                    throw new U1.j("Invalid <mask> element. width cannot be negative");
                }
            } else if (i11 == 4) {
                g.C1462p c1462pO02 = o0(strTrim);
                c1465s.f11117t = c1462pO02;
                if (c1462pO02.h()) {
                    throw new U1.j("Invalid <mask> element. height cannot be negative");
                }
            } else if (i11 != 43) {
                if (i11 != 44) {
                    continue;
                } else if ("objectBoundingBox".equals(strTrim)) {
                    c1465s.f11113p = Boolean.FALSE;
                } else {
                    if (!"userSpaceOnUse".equals(strTrim)) {
                        throw new U1.j("Invalid value for attribute maskContentUnits");
                    }
                    c1465s.f11113p = Boolean.TRUE;
                }
            } else if ("objectBoundingBox".equals(strTrim)) {
                c1465s.f11112o = Boolean.FALSE;
            } else {
                if (!"userSpaceOnUse".equals(strTrim)) {
                    throw new U1.j("Invalid value for attribute maskUnits");
                }
                c1465s.f11112o = Boolean.TRUE;
            }
        }
    }

    private void K0(InputStream inputStream) throws U1.j {
        try {
            SAXParserFactory sAXParserFactoryNewInstance = SAXParserFactory.newInstance();
            sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-general-entities", false);
            sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            XMLReader xMLReader = sAXParserFactoryNewInstance.newSAXParser().getXMLReader();
            f fVar = new f(this, null);
            xMLReader.setContentHandler(fVar);
            xMLReader.setProperty("http://xml.org/sax/properties/lexical-handler", fVar);
            xMLReader.parse(new InputSource(inputStream));
        } catch (IOException e10) {
            throw new U1.j("Stream error", e10);
        } catch (ParserConfigurationException e11) {
            throw new U1.j("XML parser problem", e11);
        } catch (SAXException e12) {
            throw new U1.j("SVG parse error", e12);
        }
    }

    private void L(g.C1468v c1468v, Attributes attributes) throws U1.j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f11201b[g.h(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 8) {
                c1468v.f11120o = u0(strTrim);
            } else if (i11 != 9) {
                continue;
            } else {
                Float fValueOf = Float.valueOf(f0(strTrim));
                c1468v.f11121p = fValueOf;
                if (fValueOf.floatValue() < 0.0f) {
                    throw new U1.j("Invalid <path> element. pathLength cannot be negative");
                }
            }
        }
    }

    private void L0(InputStream inputStream, boolean z10) throws U1.j {
        try {
            try {
                XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                j jVar = new j(xmlPullParserNewPullParser);
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-docdecl", false);
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
                xmlPullParserNewPullParser.setInput(inputStream, null);
                for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.nextToken()) {
                    if (eventType == 0) {
                        W0();
                    } else if (eventType == 8) {
                        xmlPullParserNewPullParser.getText();
                        i iVar = new i(xmlPullParserNewPullParser.getText());
                        r(iVar.r(), x0(iVar));
                    } else if (eventType == 10) {
                        if (z10 && this.f11191a.m() == null && xmlPullParserNewPullParser.getText().contains("<!ENTITY ")) {
                            try {
                                inputStream.reset();
                                K0(inputStream);
                                return;
                            } catch (IOException unused) {
                                return;
                            }
                        }
                    } else if (eventType == 2) {
                        String name = xmlPullParserNewPullParser.getName();
                        if (xmlPullParserNewPullParser.getPrefix() != null) {
                            name = xmlPullParserNewPullParser.getPrefix() + ':' + name;
                        }
                        X0(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name, jVar);
                    } else if (eventType == 3) {
                        String name2 = xmlPullParserNewPullParser.getName();
                        if (xmlPullParserNewPullParser.getPrefix() != null) {
                            name2 = xmlPullParserNewPullParser.getPrefix() + ':' + name2;
                        }
                        p(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name2);
                    } else if (eventType == 4) {
                        int[] iArr = new int[2];
                        e1(xmlPullParserNewPullParser.getTextCharacters(iArr), iArr[0], iArr[1]);
                    } else if (eventType == 5) {
                        c1(xmlPullParserNewPullParser.getText());
                    }
                }
                o();
            } catch (IOException e10) {
                throw new U1.j("Stream error", e10);
            }
        } catch (XmlPullParserException e11) {
            throw new U1.j("XML parser problem", e11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00cf, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void M(g.C1471y c1471y, Attributes attributes) throws U1.j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f11201b[g.h(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 1) {
                c1471y.f11129t = o0(strTrim);
            } else if (i11 == 2) {
                c1471y.f11130u = o0(strTrim);
            } else if (i11 == 3) {
                g.C1462p c1462pO0 = o0(strTrim);
                c1471y.f11131v = c1462pO0;
                if (c1462pO0.h()) {
                    throw new U1.j("Invalid <pattern> element. width cannot be negative");
                }
            } else if (i11 == 4) {
                g.C1462p c1462pO02 = o0(strTrim);
                c1471y.f11132w = c1462pO02;
                if (c1462pO02.h()) {
                    throw new U1.j("Invalid <pattern> element. height cannot be negative");
                }
            } else if (i11 != 6) {
                switch (i11) {
                    case 40:
                        if (!"objectBoundingBox".equals(strTrim)) {
                            if (!"userSpaceOnUse".equals(strTrim)) {
                                throw new U1.j("Invalid value for attribute patternUnits");
                            }
                            c1471y.f11126q = Boolean.TRUE;
                        } else {
                            c1471y.f11126q = Boolean.FALSE;
                        }
                        break;
                    case 41:
                        if (!"objectBoundingBox".equals(strTrim)) {
                            if (!"userSpaceOnUse".equals(strTrim)) {
                                throw new U1.j("Invalid value for attribute patternContentUnits");
                            }
                            c1471y.f11127r = Boolean.TRUE;
                        } else {
                            c1471y.f11127r = Boolean.FALSE;
                        }
                        break;
                    case 42:
                        c1471y.f11128s = J0(strTrim);
                        break;
                }
            } else if (PointerEventHelper.POINTER_TYPE_UNKNOWN.equals(attributes.getURI(i10)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i10))) {
                c1471y.f11133x = strTrim;
            }
        }
    }

    private static g.E.i M0(String str) {
        str.getClass();
        if (str.equals("none")) {
            return g.E.i.None;
        }
        if (str.equals("non-scaling-stroke")) {
            return g.E.i.NonScalingStroke;
        }
        return null;
    }

    private void N(g.C1472z c1472z, Attributes attributes, String str) throws U1.j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            if (g.h(attributes.getLocalName(i10)) == g.points) {
                i iVar = new i(attributes.getValue(i10));
                ArrayList arrayList = new ArrayList();
                iVar.A();
                while (!iVar.h()) {
                    float fN = iVar.n();
                    if (Float.isNaN(fN)) {
                        throw new U1.j("Invalid <" + str + "> points attribute. Non-coordinate content found in list.");
                    }
                    iVar.z();
                    float fN2 = iVar.n();
                    if (Float.isNaN(fN2)) {
                        throw new U1.j("Invalid <" + str + "> points attribute. There should be an even number of coordinates.");
                    }
                    iVar.z();
                    arrayList.add(Float.valueOf(fN));
                    arrayList.add(Float.valueOf(fN2));
                }
                c1472z.f11134o = new float[arrayList.size()];
                Iterator it = arrayList.iterator();
                int i11 = 0;
                while (it.hasNext()) {
                    c1472z.f11134o[i11] = ((Float) it.next()).floatValue();
                    i11++;
                }
            }
        }
    }

    private static g.C1449b N0(String str) throws U1.j {
        i iVar = new i(str);
        iVar.A();
        float fN = iVar.n();
        iVar.z();
        float fN2 = iVar.n();
        iVar.z();
        float fN3 = iVar.n();
        iVar.z();
        float fN4 = iVar.n();
        if (Float.isNaN(fN) || Float.isNaN(fN2) || Float.isNaN(fN3) || Float.isNaN(fN4)) {
            throw new U1.j("Invalid viewBox definition - should have four numbers");
        }
        if (fN3 < 0.0f) {
            throw new U1.j("Invalid viewBox. width cannot be negative");
        }
        if (fN4 >= 0.0f) {
            return new g.C1449b(fN, fN2, fN3, fN4);
        }
        throw new U1.j("Invalid viewBox. height cannot be negative");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005b, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void O(g.Q q10, Attributes attributes) throws U1.j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f11201b[g.h(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 35) {
                q10.f11031p = o0(strTrim);
            } else if (i11 != 36) {
                switch (i11) {
                    case 12:
                        q10.f11028m = o0(strTrim);
                        break;
                    case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                        q10.f11029n = o0(strTrim);
                        break;
                    case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                        g.C1462p c1462pO0 = o0(strTrim);
                        q10.f11030o = c1462pO0;
                        if (c1462pO0.h()) {
                            throw new U1.j("Invalid <radialGradient> element. r cannot be negative");
                        }
                        break;
                        break;
                }
            } else {
                q10.f11032q = o0(strTrim);
            }
        }
    }

    private void O0(Attributes attributes) throws U1.j {
        l("<path>", new Object[0]);
        if (this.f11192b == null) {
            throw new U1.j("Invalid document. Root element must be <svg>");
        }
        g.C1468v c1468v = new g.C1468v();
        c1468v.f11025a = this.f11191a;
        c1468v.f11026b = this.f11192b;
        D(c1468v, attributes);
        S(c1468v, attributes);
        W(c1468v, attributes);
        C(c1468v, attributes);
        L(c1468v, attributes);
        this.f11192b.a(c1468v);
    }

    private void P(g.B b10, Attributes attributes) throws U1.j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f11201b[g.h(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 1) {
                b10.f10918o = o0(strTrim);
            } else if (i11 == 2) {
                b10.f10919p = o0(strTrim);
            } else if (i11 == 3) {
                g.C1462p c1462pO0 = o0(strTrim);
                b10.f10920q = c1462pO0;
                if (c1462pO0.h()) {
                    throw new U1.j("Invalid <rect> element. width cannot be negative");
                }
            } else if (i11 == 4) {
                g.C1462p c1462pO02 = o0(strTrim);
                b10.f10921r = c1462pO02;
                if (c1462pO02.h()) {
                    throw new U1.j("Invalid <rect> element. height cannot be negative");
                }
            } else if (i11 == 10) {
                g.C1462p c1462pO03 = o0(strTrim);
                b10.f10922s = c1462pO03;
                if (c1462pO03.h()) {
                    throw new U1.j("Invalid <rect> element. rx cannot be negative");
                }
            } else if (i11 != 11) {
                continue;
            } else {
                g.C1462p c1462pO04 = o0(strTrim);
                b10.f10923t = c1462pO04;
                if (c1462pO04.h()) {
                    throw new U1.j("Invalid <rect> element. ry cannot be negative");
                }
            }
        }
    }

    private void P0(Attributes attributes) throws U1.j {
        l("<pattern>", new Object[0]);
        if (this.f11192b == null) {
            throw new U1.j("Invalid document. Root element must be <svg>");
        }
        g.C1471y c1471y = new g.C1471y();
        c1471y.f11025a = this.f11191a;
        c1471y.f11026b = this.f11192b;
        D(c1471y, attributes);
        S(c1471y, attributes);
        C(c1471y, attributes);
        Y(c1471y, attributes);
        M(c1471y, attributes);
        this.f11192b.a(c1471y);
        this.f11192b = c1471y;
    }

    private void Q(g.F f10, Attributes attributes) throws U1.j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f11201b[g.h(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 1) {
                f10.f10999q = o0(strTrim);
            } else if (i11 == 2) {
                f10.f11000r = o0(strTrim);
            } else if (i11 == 3) {
                g.C1462p c1462pO0 = o0(strTrim);
                f10.f11001s = c1462pO0;
                if (c1462pO0.h()) {
                    throw new U1.j("Invalid <svg> element. width cannot be negative");
                }
            } else if (i11 == 4) {
                g.C1462p c1462pO02 = o0(strTrim);
                f10.f11002t = c1462pO02;
                if (c1462pO02.h()) {
                    throw new U1.j("Invalid <svg> element. height cannot be negative");
                }
            } else if (i11 == 5) {
                f10.f11003u = strTrim;
            }
        }
    }

    private void Q0(Attributes attributes) throws U1.j {
        l("<polygon>", new Object[0]);
        if (this.f11192b == null) {
            throw new U1.j("Invalid document. Root element must be <svg>");
        }
        g.C1472z a10 = new g.A();
        a10.f11025a = this.f11191a;
        a10.f11026b = this.f11192b;
        D(a10, attributes);
        S(a10, attributes);
        W(a10, attributes);
        C(a10, attributes);
        N(a10, attributes, "polygon");
        this.f11192b.a(a10);
    }

    private void R(g.D d10, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            if (a.f11201b[g.h(attributes.getLocalName(i10)).ordinal()] == 37) {
                d10.f10924h = n0(strTrim);
            }
        }
    }

    private void R0(Attributes attributes) throws U1.j {
        l("<polyline>", new Object[0]);
        if (this.f11192b == null) {
            throw new U1.j("Invalid document. Root element must be <svg>");
        }
        g.C1472z c1472z = new g.C1472z();
        c1472z.f11025a = this.f11191a;
        c1472z.f11026b = this.f11192b;
        D(c1472z, attributes);
        S(c1472z, attributes);
        W(c1472z, attributes);
        C(c1472z, attributes);
        N(c1472z, attributes, "polyline");
        this.f11192b.a(c1472z);
    }

    private void S(g.L l10, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            if (strTrim.length() != 0) {
                int i11 = a.f11201b[g.h(attributes.getLocalName(i10)).ordinal()];
                if (i11 == 45) {
                    E0(l10, strTrim);
                } else if (i11 != 46) {
                    if (l10.f11018e == null) {
                        l10.f11018e = new g.E();
                    }
                    S0(l10.f11018e, attributes.getLocalName(i10), attributes.getValue(i10).trim());
                } else {
                    l10.f11020g = U1.b.f(strTrim);
                }
            }
        }
    }

    static void S0(g.E e10, String str, String str2) {
        if (str2.length() == 0 || str2.equals("inherit")) {
            return;
        }
        try {
            switch (a.f11201b[g.h(str).ordinal()]) {
                case 47:
                    g.O oT0 = t0(str2);
                    e10.f10945h = oT0;
                    if (oT0 != null) {
                        e10.f10944g |= 1;
                    }
                    break;
                case 48:
                    g.E.a aVarE0 = e0(str2);
                    e10.f10946i = aVarE0;
                    if (aVarE0 != null) {
                        e10.f10944g |= 2;
                    }
                    break;
                case 49:
                    Float fR0 = r0(str2);
                    e10.f10947j = fR0;
                    if (fR0 != null) {
                        e10.f10944g |= 4;
                    }
                    break;
                case 50:
                    g.O oT02 = t0(str2);
                    e10.f10948k = oT02;
                    if (oT02 != null) {
                        e10.f10944g |= 8;
                    }
                    break;
                case 51:
                    Float fR02 = r0(str2);
                    e10.f10949l = fR02;
                    if (fR02 != null) {
                        e10.f10944g |= 16;
                    }
                    break;
                case 52:
                    e10.f10950m = o0(str2);
                    e10.f10944g |= 32;
                    break;
                case 53:
                    g.E.c cVarC0 = C0(str2);
                    e10.f10951n = cVarC0;
                    if (cVarC0 != null) {
                        e10.f10944g |= 64;
                    }
                    break;
                case 54:
                    g.E.d dVarD0 = D0(str2);
                    e10.f10952o = dVarD0;
                    if (dVarD0 != null) {
                        e10.f10944g |= 128;
                    }
                    break;
                case 55:
                    e10.f10953p = Float.valueOf(f0(str2));
                    e10.f10944g |= 256;
                    break;
                case 56:
                    if (!"none".equals(str2)) {
                        g.C1462p[] c1462pArrB0 = B0(str2);
                        e10.f10954q = c1462pArrB0;
                        if (c1462pArrB0 != null) {
                            e10.f10944g |= 512;
                        }
                    } else {
                        e10.f10954q = null;
                        e10.f10944g |= 512;
                    }
                    break;
                case 57:
                    e10.f10955r = o0(str2);
                    e10.f10944g |= 1024;
                    break;
                case 58:
                    e10.f10956s = r0(str2);
                    e10.f10944g |= 2048;
                    break;
                case 59:
                    e10.f10957t = b0(str2);
                    e10.f10944g |= 4096;
                    break;
                case 60:
                    h0(e10, str2);
                    break;
                case 61:
                    List listI0 = i0(str2);
                    e10.f10958u = listI0;
                    if (listI0 != null) {
                        e10.f10944g |= 8192;
                    }
                    break;
                case 62:
                    g.C1462p c1462pJ0 = j0(str2);
                    e10.f10959v = c1462pJ0;
                    if (c1462pJ0 != null) {
                        e10.f10944g |= 16384;
                    }
                    break;
                case 63:
                    Integer numL0 = l0(str2);
                    e10.f10960w = numL0;
                    if (numL0 != null) {
                        e10.f10944g |= 32768;
                    }
                    break;
                case IntBufferBatchMountItem.INSTRUCTION_UPDATE_STATE /* 64 */:
                    g.E.b bVarK0 = k0(str2);
                    e10.f10961x = bVarK0;
                    if (bVarK0 != null) {
                        e10.f10944g |= 65536;
                    }
                    break;
                case 65:
                    g.E.EnumC0113g enumC0113gH0 = H0(str2);
                    e10.f10962y = enumC0113gH0;
                    if (enumC0113gH0 != null) {
                        e10.f10944g |= 131072;
                    }
                    break;
                case 66:
                    g.E.h hVarI0 = I0(str2);
                    e10.f10963z = hVarI0;
                    if (hVarI0 != null) {
                        e10.f10944g |= 68719476736L;
                    }
                    break;
                case 67:
                    g.E.f fVarG0 = G0(str2);
                    e10.f10925A = fVarG0;
                    if (fVarG0 != null) {
                        e10.f10944g |= 262144;
                    }
                    break;
                case 68:
                    Boolean boolS0 = s0(str2);
                    e10.f10926B = boolS0;
                    if (boolS0 != null) {
                        e10.f10944g |= 524288;
                    }
                    break;
                case 69:
                    String strM0 = m0(str2, str);
                    e10.f10928D = strM0;
                    e10.f10929E = strM0;
                    e10.f10930F = strM0;
                    e10.f10944g |= 14680064;
                    break;
                case 70:
                    e10.f10928D = m0(str2, str);
                    e10.f10944g |= 2097152;
                    break;
                case 71:
                    e10.f10929E = m0(str2, str);
                    e10.f10944g |= 4194304;
                    break;
                case 72:
                    e10.f10930F = m0(str2, str);
                    e10.f10944g |= 8388608;
                    break;
                case 73:
                    if (str2.indexOf(124) < 0) {
                        if ("|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|".contains('|' + str2 + '|')) {
                            e10.f10931G = Boolean.valueOf(!str2.equals("none"));
                            e10.f10944g |= 16777216;
                            break;
                        }
                    }
                    break;
                case 74:
                    if (str2.indexOf(124) < 0) {
                        if ("|visible|hidden|collapse|".contains('|' + str2 + '|')) {
                            e10.f10932H = Boolean.valueOf(str2.equals(ViewProps.VISIBLE));
                            e10.f10944g |= 33554432;
                            break;
                        }
                    }
                    break;
                case 75:
                    if (str2.equals("currentColor")) {
                        e10.f10933I = g.C0114g.a();
                    } else {
                        try {
                            e10.f10933I = b0(str2);
                        } catch (U1.j e11) {
                            e11.getMessage();
                            return;
                        }
                    }
                    e10.f10944g |= 67108864;
                    break;
                case 76:
                    e10.f10934J = r0(str2);
                    e10.f10944g |= 134217728;
                    break;
                case 77:
                    g.C1450c c1450cA0 = a0(str2);
                    e10.f10927C = c1450cA0;
                    if (c1450cA0 != null) {
                        e10.f10944g |= ExpoNetworkInspectOkHttpNetworkInterceptor.MAX_BODY_SIZE;
                    }
                    break;
                case 78:
                    e10.f10935K = m0(str2, str);
                    e10.f10944g |= 268435456;
                    break;
                case 79:
                    e10.f10936L = e0(str2);
                    e10.f10944g |= 536870912;
                    break;
                case 80:
                    e10.f10937M = m0(str2, str);
                    e10.f10944g |= 1073741824;
                    break;
                case 81:
                    if (str2.equals("currentColor")) {
                        e10.f10938N = g.C0114g.a();
                    } else {
                        try {
                            e10.f10938N = b0(str2);
                        } catch (U1.j e12) {
                            e12.getMessage();
                            return;
                        }
                    }
                    e10.f10944g |= 2147483648L;
                    break;
                case 82:
                    e10.f10939O = r0(str2);
                    e10.f10944g |= 4294967296L;
                    break;
                case 83:
                    if (str2.equals("currentColor")) {
                        e10.f10940P = g.C0114g.a();
                    } else {
                        try {
                            e10.f10940P = b0(str2);
                        } catch (U1.j e13) {
                            e13.getMessage();
                            return;
                        }
                    }
                    e10.f10944g |= 8589934592L;
                    break;
                case 84:
                    e10.f10941Q = r0(str2);
                    e10.f10944g |= 17179869184L;
                    break;
                case 85:
                    g.E.i iVarM0 = M0(str2);
                    e10.f10942R = iVarM0;
                    if (iVarM0 != null) {
                        e10.f10944g |= 34359738368L;
                    }
                    break;
                case 86:
                    g.E.e eVarY0 = y0(str2);
                    e10.f10943S = eVarY0;
                    if (eVarY0 != null) {
                        e10.f10944g |= 137438953472L;
                    }
                    break;
            }
        } catch (U1.j unused) {
        }
    }

    private void T(g.U u10, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            if (a.f11201b[g.h(attributes.getLocalName(i10)).ordinal()] == 6 && (PointerEventHelper.POINTER_TYPE_UNKNOWN.equals(attributes.getURI(i10)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i10)))) {
                u10.f11034o = strTrim;
            }
        }
    }

    private void T0(Attributes attributes) throws U1.j {
        l("<radialGradient>", new Object[0]);
        if (this.f11192b == null) {
            throw new U1.j("Invalid document. Root element must be <svg>");
        }
        g.Q q10 = new g.Q();
        q10.f11025a = this.f11191a;
        q10.f11026b = this.f11192b;
        D(q10, attributes);
        S(q10, attributes);
        F(q10, attributes);
        O(q10, attributes);
        this.f11192b.a(q10);
        this.f11192b = q10;
    }

    private void U(g.Z z10, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f11201b[g.h(attributes.getLocalName(i10)).ordinal()];
            if (i11 != 6) {
                if (i11 == 39) {
                    z10.f11039p = o0(strTrim);
                }
            } else if (PointerEventHelper.POINTER_TYPE_UNKNOWN.equals(attributes.getURI(i10)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i10))) {
                z10.f11038o = strTrim;
            }
        }
    }

    private void U0(Attributes attributes) throws U1.j {
        l("<rect>", new Object[0]);
        if (this.f11192b == null) {
            throw new U1.j("Invalid document. Root element must be <svg>");
        }
        g.B b10 = new g.B();
        b10.f11025a = this.f11191a;
        b10.f11026b = this.f11192b;
        D(b10, attributes);
        S(b10, attributes);
        W(b10, attributes);
        C(b10, attributes);
        P(b10, attributes);
        this.f11192b.a(b10);
    }

    private void V(g.a0 a0Var, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f11201b[g.h(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 1) {
                a0Var.f11042o = p0(strTrim);
            } else if (i11 == 2) {
                a0Var.f11043p = p0(strTrim);
            } else if (i11 == 19) {
                a0Var.f11044q = p0(strTrim);
            } else if (i11 == 20) {
                a0Var.f11045r = p0(strTrim);
            }
        }
    }

    private void V0(Attributes attributes) throws U1.j {
        l("<solidColor>", new Object[0]);
        if (this.f11192b == null) {
            throw new U1.j("Invalid document. Root element must be <svg>");
        }
        g.C c10 = new g.C();
        c10.f11025a = this.f11191a;
        c10.f11026b = this.f11192b;
        D(c10, attributes);
        S(c10, attributes);
        this.f11192b.a(c10);
        this.f11192b = c10;
    }

    private void W(g.InterfaceC1460n interfaceC1460n, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            if (g.h(attributes.getLocalName(i10)) == g.transform) {
                interfaceC1460n.k(J0(attributes.getValue(i10)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W0() {
        this.f11191a = new U1.g();
    }

    private void X(g.e0 e0Var, Attributes attributes) throws U1.j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f11201b[g.h(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 1) {
                e0Var.f11071q = o0(strTrim);
            } else if (i11 == 2) {
                e0Var.f11072r = o0(strTrim);
            } else if (i11 == 3) {
                g.C1462p c1462pO0 = o0(strTrim);
                e0Var.f11073s = c1462pO0;
                if (c1462pO0.h()) {
                    throw new U1.j("Invalid <use> element. width cannot be negative");
                }
            } else if (i11 == 4) {
                g.C1462p c1462pO02 = o0(strTrim);
                e0Var.f11074t = c1462pO02;
                if (c1462pO02.h()) {
                    throw new U1.j("Invalid <use> element. height cannot be negative");
                }
            } else if (i11 == 6 && (PointerEventHelper.POINTER_TYPE_UNKNOWN.equals(attributes.getURI(i10)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i10)))) {
                e0Var.f11070p = strTrim;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X0(String str, String str2, String str3, Attributes attributes) throws U1.j {
        if (this.f11193c) {
            this.f11194d++;
        }
        if ("http://www.w3.org/2000/svg".equals(str) || PointerEventHelper.POINTER_TYPE_UNKNOWN.equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            h hVarH = h.h(str2);
            switch (a.f11200a[hVarH.ordinal()]) {
                case 1:
                    a1(attributes);
                    break;
                case 2:
                case 3:
                    q(attributes);
                    break;
                case 4:
                    m(attributes);
                    break;
                case 5:
                    i1(attributes);
                    break;
                case 6:
                    O0(attributes);
                    break;
                case 7:
                    U0(attributes);
                    break;
                case 8:
                    i(attributes);
                    break;
                case 9:
                    n(attributes);
                    break;
                case 10:
                    v(attributes);
                    break;
                case 11:
                    R0(attributes);
                    break;
                case 12:
                    Q0(attributes);
                    break;
                case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                    d1(attributes);
                    break;
                case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                    h1(attributes);
                    break;
                case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                    g1(attributes);
                    break;
                case 16:
                    k1(attributes);
                    break;
                case 17:
                    b1(attributes);
                    break;
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
                    x(attributes);
                    break;
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
                    w(attributes);
                    break;
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DX /* 20 */:
                    T0(attributes);
                    break;
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DY /* 21 */:
                    Y0(attributes);
                    break;
                case TextAttributeProps.TA_KEY_IS_HIGHLIGHTED /* 22 */:
                case TextAttributeProps.TA_KEY_LAYOUT_DIRECTION /* 23 */:
                    this.f11195e = true;
                    this.f11196f = hVarH;
                    break;
                case TextAttributeProps.TA_KEY_ACCESSIBILITY_ROLE /* 24 */:
                    k(attributes);
                    break;
                case TextAttributeProps.TA_KEY_LINE_BREAK_STRATEGY /* 25 */:
                    f1(attributes);
                    break;
                case TextAttributeProps.TA_KEY_ROLE /* 26 */:
                    P0(attributes);
                    break;
                case TextAttributeProps.TA_KEY_TEXT_TRANSFORM /* 27 */:
                    u(attributes);
                    break;
                case OutsetBoxShadowDrawableKt.MIN_OUTSET_BOX_SHADOW_SDK_VERSION /* 28 */:
                    j1(attributes);
                    break;
                case 29:
                    y(attributes);
                    break;
                case 30:
                    Z0(attributes);
                    break;
                case 31:
                    V0(attributes);
                    break;
                default:
                    this.f11193c = true;
                    this.f11194d = 1;
                    break;
            }
        }
    }

    private void Y(g.R r10, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f11201b[g.h(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 7) {
                w0(r10, strTrim);
            } else if (i11 == 87) {
                r10.f11033p = N0(strTrim);
            }
        }
    }

    private void Y0(Attributes attributes) throws U1.j {
        l("<stop>", new Object[0]);
        g.J j10 = this.f11192b;
        if (j10 == null) {
            throw new U1.j("Invalid document. Root element must be <svg>");
        }
        if (!(j10 instanceof g.AbstractC1456j)) {
            throw new U1.j("Invalid document. <stop> elements are only valid inside <linearGradient> or <radialGradient> elements.");
        }
        g.D d10 = new g.D();
        d10.f11025a = this.f11191a;
        d10.f11026b = this.f11192b;
        D(d10, attributes);
        S(d10, attributes);
        R(d10, attributes);
        this.f11192b.a(d10);
        this.f11192b = d10;
    }

    private void Z(String str) {
        this.f11191a.a(new U1.b(b.f.screen, b.u.Document).d(str));
    }

    private void Z0(Attributes attributes) throws U1.j {
        l("<style>", new Object[0]);
        if (this.f11192b == null) {
            throw new U1.j("Invalid document. Root element must be <svg>");
        }
        String str = "all";
        boolean zEquals = true;
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f11201b[g.h(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 88) {
                zEquals = strTrim.equals("text/css");
            } else if (i11 == 89) {
                str = strTrim;
            }
        }
        if (zEquals && U1.b.b(str, b.f.screen)) {
            this.f11198h = true;
        } else {
            this.f11193c = true;
            this.f11194d = 1;
        }
    }

    private static g.C1450c a0(String str) {
        if ("auto".equals(str) || !str.startsWith("rect(")) {
            return null;
        }
        i iVar = new i(str.substring(5));
        iVar.A();
        g.C1462p c1462pQ0 = q0(iVar);
        iVar.z();
        g.C1462p c1462pQ02 = q0(iVar);
        iVar.z();
        g.C1462p c1462pQ03 = q0(iVar);
        iVar.z();
        g.C1462p c1462pQ04 = q0(iVar);
        iVar.A();
        if (iVar.f(')') || iVar.h()) {
            return new g.C1450c(c1462pQ0, c1462pQ02, c1462pQ03, c1462pQ04);
        }
        return null;
    }

    private void a1(Attributes attributes) throws U1.j {
        l("<svg>", new Object[0]);
        g.F f10 = new g.F();
        f10.f11025a = this.f11191a;
        f10.f11026b = this.f11192b;
        D(f10, attributes);
        S(f10, attributes);
        C(f10, attributes);
        Y(f10, attributes);
        Q(f10, attributes);
        g.J j10 = this.f11192b;
        if (j10 == null) {
            this.f11191a.w(f10);
        } else {
            j10.a(f10);
        }
        this.f11192b = f10;
    }

    private static g.C1453f b0(String str) throws U1.j {
        if (str.charAt(0) == '#') {
            U1.c cVarB = U1.c.b(str, 1, str.length());
            if (cVarB == null) {
                throw new U1.j("Bad hex colour value: " + str);
            }
            int iA = cVarB.a();
            if (iA == 4) {
                int iD = cVarB.d();
                int i10 = iD & 3840;
                int i11 = iD & 240;
                int i12 = iD & 15;
                return new g.C1453f(i12 | (i10 << 8) | (-16777216) | (i10 << 12) | (i11 << 8) | (i11 << 4) | (i12 << 4));
            }
            if (iA == 5) {
                int iD2 = cVarB.d();
                int i13 = 61440 & iD2;
                int i14 = iD2 & 3840;
                int i15 = iD2 & 240;
                int i16 = iD2 & 15;
                return new g.C1453f((i16 << 24) | (i16 << 28) | (i13 << 8) | (i13 << 4) | (i14 << 4) | i14 | i15 | (i15 >> 4));
            }
            if (iA == 7) {
                return new g.C1453f(cVarB.d() | (-16777216));
            }
            if (iA == 9) {
                return new g.C1453f((cVarB.d() >>> 8) | (cVarB.d() << 24));
            }
            throw new U1.j("Bad hex colour value: " + str);
        }
        String lowerCase = str.toLowerCase(Locale.US);
        boolean zStartsWith = lowerCase.startsWith("rgba(");
        if (!zStartsWith && !lowerCase.startsWith("rgb(")) {
            boolean zStartsWith2 = lowerCase.startsWith("hsla(");
            if (!zStartsWith2 && !lowerCase.startsWith("hsl(")) {
                return c0(lowerCase);
            }
            i iVar = new i(str.substring(zStartsWith2 ? 5 : 4));
            iVar.A();
            float fN = iVar.n();
            float fD = iVar.d(fN);
            if (!Float.isNaN(fD)) {
                iVar.f('%');
            }
            float fD2 = iVar.d(fD);
            if (!Float.isNaN(fD2)) {
                iVar.f('%');
            }
            if (!zStartsWith2) {
                iVar.A();
                if (!Float.isNaN(fD2) && iVar.f(')')) {
                    return new g.C1453f(s(fN, fD, fD2) | (-16777216));
                }
                throw new U1.j("Bad hsl() colour value: " + str);
            }
            float fD3 = iVar.d(fD2);
            iVar.A();
            if (!Float.isNaN(fD3) && iVar.f(')')) {
                return new g.C1453f((j(fD3 * 256.0f) << 24) | s(fN, fD, fD2));
            }
            throw new U1.j("Bad hsla() colour value: " + str);
        }
        i iVar2 = new i(str.substring(zStartsWith ? 5 : 4));
        iVar2.A();
        float fN2 = iVar2.n();
        if (!Float.isNaN(fN2) && iVar2.f('%')) {
            fN2 = (fN2 * 256.0f) / 100.0f;
        }
        float fD4 = iVar2.d(fN2);
        if (!Float.isNaN(fD4) && iVar2.f('%')) {
            fD4 = (fD4 * 256.0f) / 100.0f;
        }
        float fD5 = iVar2.d(fD4);
        if (!Float.isNaN(fD5) && iVar2.f('%')) {
            fD5 = (fD5 * 256.0f) / 100.0f;
        }
        if (!zStartsWith) {
            iVar2.A();
            if (!Float.isNaN(fD5) && iVar2.f(')')) {
                return new g.C1453f((j(fN2) << 16) | (-16777216) | (j(fD4) << 8) | j(fD5));
            }
            throw new U1.j("Bad rgb() colour value: " + str);
        }
        float fD6 = iVar2.d(fD5);
        iVar2.A();
        if (!Float.isNaN(fD6) && iVar2.f(')')) {
            return new g.C1453f((j(fD6 * 256.0f) << 24) | (j(fN2) << 16) | (j(fD4) << 8) | j(fD5));
        }
        throw new U1.j("Bad rgba() colour value: " + str);
    }

    private void b1(Attributes attributes) throws U1.j {
        l("<symbol>", new Object[0]);
        if (this.f11192b == null) {
            throw new U1.j("Invalid document. Root element must be <svg>");
        }
        g.R t10 = new g.T();
        t10.f11025a = this.f11191a;
        t10.f11026b = this.f11192b;
        D(t10, attributes);
        S(t10, attributes);
        C(t10, attributes);
        Y(t10, attributes);
        this.f11192b.a(t10);
        this.f11192b = t10;
    }

    private static g.C1453f c0(String str) throws U1.j {
        Integer numA = c.a(str);
        if (numA != null) {
            return new g.C1453f(numA.intValue());
        }
        throw new U1.j("Invalid colour keyword: " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c1(String str) {
        if (this.f11193c) {
            return;
        }
        if (this.f11195e) {
            if (this.f11197g == null) {
                this.f11197g = new StringBuilder(str.length());
            }
            this.f11197g.append(str);
        } else if (this.f11198h) {
            if (this.f11199i == null) {
                this.f11199i = new StringBuilder(str.length());
            }
            this.f11199i.append(str);
        } else if (this.f11192b instanceof g.Y) {
            h(str);
        }
    }

    private static g.O d0(String str) {
        str.getClass();
        if (str.equals("none")) {
            return g.C1453f.f11076i;
        }
        if (str.equals("currentColor")) {
            return g.C0114g.a();
        }
        try {
            return b0(str);
        } catch (U1.j unused) {
            return null;
        }
    }

    private void d1(Attributes attributes) throws U1.j {
        l("<text>", new Object[0]);
        if (this.f11192b == null) {
            throw new U1.j("Invalid document. Root element must be <svg>");
        }
        g.W w10 = new g.W();
        w10.f11025a = this.f11191a;
        w10.f11026b = this.f11192b;
        D(w10, attributes);
        S(w10, attributes);
        W(w10, attributes);
        C(w10, attributes);
        V(w10, attributes);
        this.f11192b.a(w10);
        this.f11192b = w10;
    }

    private static g.E.a e0(String str) {
        if ("nonzero".equals(str)) {
            return g.E.a.NonZero;
        }
        if ("evenodd".equals(str)) {
            return g.E.a.EvenOdd;
        }
        return null;
    }

    private void e1(char[] cArr, int i10, int i11) {
        if (this.f11193c) {
            return;
        }
        if (this.f11195e) {
            if (this.f11197g == null) {
                this.f11197g = new StringBuilder(i11);
            }
            this.f11197g.append(cArr, i10, i11);
        } else if (this.f11198h) {
            if (this.f11199i == null) {
                this.f11199i = new StringBuilder(i11);
            }
            this.f11199i.append(cArr, i10, i11);
        } else if (this.f11192b instanceof g.Y) {
            h(new String(cArr, i10, i11));
        }
    }

    private static float f0(String str) throws U1.j {
        int length = str.length();
        if (length != 0) {
            return g0(str, 0, length);
        }
        throw new U1.j("Invalid float value (empty string)");
    }

    private void f1(Attributes attributes) throws U1.j {
        l("<textPath>", new Object[0]);
        if (this.f11192b == null) {
            throw new U1.j("Invalid document. Root element must be <svg>");
        }
        g.Z z10 = new g.Z();
        z10.f11025a = this.f11191a;
        z10.f11026b = this.f11192b;
        D(z10, attributes);
        S(z10, attributes);
        C(z10, attributes);
        U(z10, attributes);
        this.f11192b.a(z10);
        this.f11192b = z10;
        g.J j10 = z10.f11026b;
        if (j10 instanceof g.b0) {
            z10.p((g.b0) j10);
        } else {
            z10.p(((g.X) j10).g());
        }
    }

    private static float g0(String str, int i10, int i11) throws U1.j {
        float fB = new U1.d().b(str, i10, i11);
        if (!Float.isNaN(fB)) {
            return fB;
        }
        throw new U1.j("Invalid float value: " + str);
    }

    private void g1(Attributes attributes) throws U1.j {
        l("<tref>", new Object[0]);
        g.J j10 = this.f11192b;
        if (j10 == null) {
            throw new U1.j("Invalid document. Root element must be <svg>");
        }
        if (!(j10 instanceof g.Y)) {
            throw new U1.j("Invalid document. <tref> elements are only valid inside <text> or <tspan> elements.");
        }
        g.U u10 = new g.U();
        u10.f11025a = this.f11191a;
        u10.f11026b = this.f11192b;
        D(u10, attributes);
        S(u10, attributes);
        C(u10, attributes);
        T(u10, attributes);
        this.f11192b.a(u10);
        g.J j11 = u10.f11026b;
        if (j11 instanceof g.b0) {
            u10.p((g.b0) j11);
        } else {
            u10.p(((g.X) j11).g());
        }
    }

    private void h(String str) {
        g.H h10 = (g.H) this.f11192b;
        int size = h10.f11004i.size();
        g.N n10 = size == 0 ? null : (g.N) h10.f11004i.get(size - 1);
        if (!(n10 instanceof g.c0)) {
            this.f11192b.a(new g.c0(str));
            return;
        }
        StringBuilder sb = new StringBuilder();
        g.c0 c0Var = (g.c0) n10;
        sb.append(c0Var.f11054c);
        sb.append(str);
        c0Var.f11054c = sb.toString();
    }

    private static void h0(g.E e10, String str) {
        String strS;
        if ("|caption|icon|menu|message-box|small-caption|status-bar|".contains('|' + str + '|')) {
            i iVar = new i(str);
            Integer numA = null;
            g.E.b bVarK0 = null;
            String str2 = null;
            while (true) {
                strS = iVar.s('/');
                iVar.A();
                if (strS != null) {
                    if (numA != null && bVarK0 != null) {
                        break;
                    }
                    if (!strS.equals("normal") && (numA != null || (numA = e.a(strS)) == null)) {
                        if (bVarK0 != null || (bVarK0 = k0(strS)) == null) {
                            if (str2 != null || !strS.equals("small-caps")) {
                                break;
                            } else {
                                str2 = strS;
                            }
                        }
                    }
                } else {
                    return;
                }
            }
            g.C1462p c1462pJ0 = j0(strS);
            if (iVar.f('/')) {
                iVar.A();
                String strR = iVar.r();
                if (strR != null) {
                    try {
                        o0(strR);
                    } catch (U1.j unused) {
                        return;
                    }
                }
                iVar.A();
            }
            e10.f10958u = i0(iVar.y());
            e10.f10959v = c1462pJ0;
            e10.f10960w = Integer.valueOf(numA == null ? ReactFontManager.TypefaceStyle.NORMAL : numA.intValue());
            if (bVarK0 == null) {
                bVarK0 = g.E.b.Normal;
            }
            e10.f10961x = bVarK0;
            e10.f10944g |= 122880;
        }
    }

    private void h1(Attributes attributes) throws U1.j {
        l("<tspan>", new Object[0]);
        g.J j10 = this.f11192b;
        if (j10 == null) {
            throw new U1.j("Invalid document. Root element must be <svg>");
        }
        if (!(j10 instanceof g.Y)) {
            throw new U1.j("Invalid document. <tspan> elements are only valid inside <text> or other <tspan> elements.");
        }
        g.V v10 = new g.V();
        v10.f11025a = this.f11191a;
        v10.f11026b = this.f11192b;
        D(v10, attributes);
        S(v10, attributes);
        C(v10, attributes);
        V(v10, attributes);
        this.f11192b.a(v10);
        this.f11192b = v10;
        g.J j11 = v10.f11026b;
        if (j11 instanceof g.b0) {
            v10.p((g.b0) j11);
        } else {
            v10.p(((g.X) j11).g());
        }
    }

    private void i(Attributes attributes) throws U1.j {
        l("<circle>", new Object[0]);
        if (this.f11192b == null) {
            throw new U1.j("Invalid document. Root element must be <svg>");
        }
        g.C1451d c1451d = new g.C1451d();
        c1451d.f11025a = this.f11191a;
        c1451d.f11026b = this.f11192b;
        D(c1451d, attributes);
        S(c1451d, attributes);
        W(c1451d, attributes);
        C(c1451d, attributes);
        A(c1451d, attributes);
        this.f11192b.a(c1451d);
    }

    private static List i0(String str) {
        i iVar = new i(str);
        ArrayList arrayList = null;
        do {
            String strQ = iVar.q();
            if (strQ == null) {
                strQ = iVar.u(',');
            }
            if (strQ == null) {
                return arrayList;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(strQ);
            iVar.z();
        } while (!iVar.h());
        return arrayList;
    }

    private void i1(Attributes attributes) throws U1.j {
        l("<use>", new Object[0]);
        if (this.f11192b == null) {
            throw new U1.j("Invalid document. Root element must be <svg>");
        }
        g.e0 e0Var = new g.e0();
        e0Var.f11025a = this.f11191a;
        e0Var.f11026b = this.f11192b;
        D(e0Var, attributes);
        S(e0Var, attributes);
        W(e0Var, attributes);
        C(e0Var, attributes);
        X(e0Var, attributes);
        this.f11192b.a(e0Var);
        this.f11192b = e0Var;
    }

    private static int j(float f10) {
        if (f10 < 0.0f) {
            return 0;
        }
        if (f10 > 255.0f) {
            return 255;
        }
        return Math.round(f10);
    }

    private static g.C1462p j0(String str) {
        try {
            g.C1462p c1462pA = d.a(str);
            return c1462pA == null ? o0(str) : c1462pA;
        } catch (U1.j unused) {
            return null;
        }
    }

    private void j1(Attributes attributes) throws U1.j {
        l("<view>", new Object[0]);
        if (this.f11192b == null) {
            throw new U1.j("Invalid document. Root element must be <svg>");
        }
        g.R f0Var = new g.f0();
        f0Var.f11025a = this.f11191a;
        f0Var.f11026b = this.f11192b;
        D(f0Var, attributes);
        C(f0Var, attributes);
        Y(f0Var, attributes);
        this.f11192b.a(f0Var);
        this.f11192b = f0Var;
    }

    private void k(Attributes attributes) throws U1.j {
        l("<clipPath>", new Object[0]);
        if (this.f11192b == null) {
            throw new U1.j("Invalid document. Root element must be <svg>");
        }
        g.C1452e c1452e = new g.C1452e();
        c1452e.f11025a = this.f11191a;
        c1452e.f11026b = this.f11192b;
        D(c1452e, attributes);
        S(c1452e, attributes);
        W(c1452e, attributes);
        C(c1452e, attributes);
        B(c1452e, attributes);
        this.f11192b.a(c1452e);
        this.f11192b = c1452e;
    }

    private static g.E.b k0(String str) {
        str.getClass();
        switch (str) {
            case "oblique":
                return g.E.b.Oblique;
            case "italic":
                return g.E.b.Italic;
            case "normal":
                return g.E.b.Normal;
            default:
                return null;
        }
    }

    private void k1(Attributes attributes) throws U1.j {
        l("<switch>", new Object[0]);
        if (this.f11192b == null) {
            throw new U1.j("Invalid document. Root element must be <svg>");
        }
        g.S s10 = new g.S();
        s10.f11025a = this.f11191a;
        s10.f11026b = this.f11192b;
        D(s10, attributes);
        S(s10, attributes);
        W(s10, attributes);
        C(s10, attributes);
        this.f11192b.a(s10);
        this.f11192b = s10;
    }

    private static Integer l0(String str) {
        return e.a(str);
    }

    private void m(Attributes attributes) throws U1.j {
        l("<defs>", new Object[0]);
        if (this.f11192b == null) {
            throw new U1.j("Invalid document. Root element must be <svg>");
        }
        g.C1454h c1454h = new g.C1454h();
        c1454h.f11025a = this.f11191a;
        c1454h.f11026b = this.f11192b;
        D(c1454h, attributes);
        S(c1454h, attributes);
        W(c1454h, attributes);
        this.f11192b.a(c1454h);
        this.f11192b = c1454h;
    }

    private static String m0(String str, String str2) {
        if (!str.equals("none") && str.startsWith("url(")) {
            return str.endsWith(")") ? str.substring(4, str.length() - 1).trim() : str.substring(4).trim();
        }
        return null;
    }

    private void n(Attributes attributes) throws U1.j {
        l("<ellipse>", new Object[0]);
        if (this.f11192b == null) {
            throw new U1.j("Invalid document. Root element must be <svg>");
        }
        g.C1455i c1455i = new g.C1455i();
        c1455i.f11025a = this.f11191a;
        c1455i.f11026b = this.f11192b;
        D(c1455i, attributes);
        S(c1455i, attributes);
        W(c1455i, attributes);
        C(c1455i, attributes);
        E(c1455i, attributes);
        this.f11192b.a(c1455i);
    }

    private Float n0(String str) throws U1.j {
        if (str.length() == 0) {
            throw new U1.j("Invalid offset value in <stop> (empty string)");
        }
        int length = str.length();
        boolean z10 = true;
        if (str.charAt(str.length() - 1) == '%') {
            length--;
        } else {
            z10 = false;
        }
        try {
            float fG0 = g0(str, 0, length);
            float f10 = 100.0f;
            if (z10) {
                fG0 /= 100.0f;
            }
            if (fG0 < 0.0f) {
                f10 = 0.0f;
            } else if (fG0 <= 100.0f) {
                f10 = fG0;
            }
            return Float.valueOf(f10);
        } catch (NumberFormatException e10) {
            throw new U1.j("Invalid offset value in <stop>: " + str, e10);
        }
    }

    static g.C1462p o0(String str) throws U1.j {
        if (str.length() == 0) {
            throw new U1.j("Invalid length value (empty string)");
        }
        int length = str.length();
        g.d0 d0VarValueOf = g.d0.px;
        char cCharAt = str.charAt(length - 1);
        if (cCharAt == '%') {
            length--;
            d0VarValueOf = g.d0.percent;
        } else if (length > 2 && Character.isLetter(cCharAt) && Character.isLetter(str.charAt(length - 2))) {
            length -= 2;
            try {
                d0VarValueOf = g.d0.valueOf(str.substring(length).toLowerCase(Locale.US));
            } catch (IllegalArgumentException unused) {
                throw new U1.j("Invalid length unit specifier: " + str);
            }
        }
        try {
            return new g.C1462p(g0(str, 0, length), d0VarValueOf);
        } catch (NumberFormatException e10) {
            throw new U1.j("Invalid length value: " + str, e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(String str, String str2, String str3) {
        if (this.f11193c) {
            int i10 = this.f11194d - 1;
            this.f11194d = i10;
            if (i10 == 0) {
                this.f11193c = false;
                return;
            }
        }
        if ("http://www.w3.org/2000/svg".equals(str) || PointerEventHelper.POINTER_TYPE_UNKNOWN.equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            int i11 = a.f11200a[h.h(str2).ordinal()];
            if (i11 != 1 && i11 != 2 && i11 != 4 && i11 != 5 && i11 != 13 && i11 != 14) {
                switch (i11) {
                    case TextAttributeProps.TA_KEY_IS_HIGHLIGHTED /* 22 */:
                    case TextAttributeProps.TA_KEY_LAYOUT_DIRECTION /* 23 */:
                        this.f11195e = false;
                        StringBuilder sb = this.f11197g;
                        if (sb != null) {
                            h hVar = this.f11196f;
                            if (hVar == h.title) {
                                this.f11191a.x(sb.toString());
                            } else if (hVar == h.desc) {
                                this.f11191a.s(sb.toString());
                            }
                            this.f11197g.setLength(0);
                        }
                        break;
                    case 30:
                        StringBuilder sb2 = this.f11199i;
                        if (sb2 != null) {
                            this.f11198h = false;
                            Z(sb2.toString());
                            this.f11199i.setLength(0);
                        }
                        break;
                }
                return;
            }
            this.f11192b = ((g.N) this.f11192b).f11026b;
        }
    }

    private static List p0(String str) throws U1.j {
        if (str.length() == 0) {
            throw new U1.j("Invalid length list (empty string)");
        }
        ArrayList arrayList = new ArrayList(1);
        i iVar = new i(str);
        iVar.A();
        while (!iVar.h()) {
            float fN = iVar.n();
            if (Float.isNaN(fN)) {
                throw new U1.j("Invalid length list value: " + iVar.b());
            }
            g.d0 d0VarV = iVar.v();
            if (d0VarV == null) {
                d0VarV = g.d0.px;
            }
            arrayList.add(new g.C1462p(fN, d0VarV));
            iVar.z();
        }
        return arrayList;
    }

    private void q(Attributes attributes) throws U1.j {
        l("<g>", new Object[0]);
        if (this.f11192b == null) {
            throw new U1.j("Invalid document. Root element must be <svg>");
        }
        g.C1459m c1459m = new g.C1459m();
        c1459m.f11025a = this.f11191a;
        c1459m.f11026b = this.f11192b;
        D(c1459m, attributes);
        S(c1459m, attributes);
        W(c1459m, attributes);
        C(c1459m, attributes);
        this.f11192b.a(c1459m);
        this.f11192b = c1459m;
    }

    private static g.C1462p q0(i iVar) {
        return iVar.g("auto") ? new g.C1462p(0.0f) : iVar.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r(String str, Map map) {
        if (str.equals("xml-stylesheet")) {
            U1.g.k();
        }
    }

    private static Float r0(String str) {
        try {
            float fF0 = f0(str);
            float f10 = 0.0f;
            if (fF0 < 0.0f) {
                fF0 = f10;
            } else {
                f10 = 1.0f;
                if (fF0 > 1.0f) {
                    fF0 = f10;
                }
            }
            return Float.valueOf(fF0);
        } catch (U1.j unused) {
            return null;
        }
    }

    private static int s(float f10, float f11, float f12) {
        float f13 = f10 % 360.0f;
        if (f10 < 0.0f) {
            f13 += 360.0f;
        }
        float f14 = f13 / 60.0f;
        float f15 = f11 / 100.0f;
        float f16 = f12 / 100.0f;
        if (f15 < 0.0f) {
            f15 = 0.0f;
        } else if (f15 > 1.0f) {
            f15 = 1.0f;
        }
        float f17 = f16 >= 0.0f ? f16 > 1.0f ? 1.0f : f16 : 0.0f;
        float f18 = f17 <= 0.5f ? (f15 + 1.0f) * f17 : (f17 + f15) - (f15 * f17);
        float f19 = (f17 * 2.0f) - f18;
        return j(t(f19, f18, f14 - 2.0f) * 256.0f) | (j(t(f19, f18, f14 + 2.0f) * 256.0f) << 16) | (j(t(f19, f18, f14) * 256.0f) << 8);
    }

    private static Boolean s0(String str) {
        str.getClass();
        switch (str) {
            case "hidden":
            case "scroll":
                return Boolean.FALSE;
            case "auto":
            case "visible":
                return Boolean.TRUE;
            default:
                return null;
        }
    }

    private static float t(float f10, float f11, float f12) {
        float f13;
        if (f12 < 0.0f) {
            f12 += 6.0f;
        }
        if (f12 >= 6.0f) {
            f12 -= 6.0f;
        }
        if (f12 < 1.0f) {
            f13 = (f11 - f10) * f12;
        } else {
            if (f12 < 3.0f) {
                return f11;
            }
            if (f12 >= 4.0f) {
                return f10;
            }
            f13 = (f11 - f10) * (4.0f - f12);
        }
        return f13 + f10;
    }

    private static g.O t0(String str) {
        if (!str.startsWith("url(")) {
            return d0(str);
        }
        int iIndexOf = str.indexOf(")");
        if (iIndexOf == -1) {
            return new g.C1467u(str.substring(4).trim(), null);
        }
        String strTrim = str.substring(4, iIndexOf).trim();
        String strTrim2 = str.substring(iIndexOf + 1).trim();
        return new g.C1467u(strTrim, strTrim2.length() > 0 ? d0(strTrim2) : null);
    }

    private void u(Attributes attributes) throws U1.j {
        l("<image>", new Object[0]);
        if (this.f11192b == null) {
            throw new U1.j("Invalid document. Root element must be <svg>");
        }
        g.C1461o c1461o = new g.C1461o();
        c1461o.f11025a = this.f11191a;
        c1461o.f11026b = this.f11192b;
        D(c1461o, attributes);
        S(c1461o, attributes);
        W(c1461o, attributes);
        C(c1461o, attributes);
        G(c1461o, attributes);
        this.f11192b.a(c1461o);
        this.f11192b = c1461o;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01b6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static g.C1469w u0(String str) {
        float f10;
        float f11;
        float f12;
        i iVar = new i(str);
        g.C1469w c1469w = new g.C1469w();
        if (!iVar.h()) {
            int iIntValue = iVar.l().intValue();
            int i10 = 109;
            if (iIntValue == 77 || iIntValue == 109) {
                int iIntValue2 = iIntValue;
                float f13 = 0.0f;
                float fN = 0.0f;
                float f14 = 0.0f;
                float fD = 0.0f;
                float f15 = 0.0f;
                float f16 = 0.0f;
                while (true) {
                    iVar.A();
                    switch (iIntValue2) {
                        case 65:
                        case 97:
                            float f17 = f13;
                            float fN2 = iVar.n();
                            float fD2 = iVar.d(fN2);
                            float f18 = f14;
                            float fD3 = iVar.d(fD2);
                            Boolean boolC = iVar.c(Float.valueOf(fD3));
                            Boolean boolC2 = iVar.c(boolC);
                            float fE = iVar.e(boolC2);
                            float fD4 = iVar.d(fE);
                            if (!Float.isNaN(fD4) && fN2 >= 0.0f && fD2 >= 0.0f) {
                                if (iIntValue2 == 97) {
                                    fE += f17;
                                    fD4 += f18;
                                }
                                boolean zBooleanValue = boolC.booleanValue();
                                boolean zBooleanValue2 = boolC2.booleanValue();
                                float f19 = fE;
                                float f20 = fD4;
                                c1469w.d(fN2, fD2, fD3, zBooleanValue, zBooleanValue2, f19, f20);
                                f13 = f19;
                                fN = f13;
                                f14 = f20;
                                fD = f14;
                                iVar.z();
                                if (iVar.h()) {
                                    if (iVar.i()) {
                                        iIntValue2 = iVar.l().intValue();
                                    }
                                    i10 = 109;
                                }
                            }
                            break;
                        case 67:
                        case 99:
                            float fN3 = iVar.n();
                            float fD5 = iVar.d(fN3);
                            float fD6 = iVar.d(fD5);
                            float fD7 = iVar.d(fD6);
                            float fD8 = iVar.d(fD7);
                            float fD9 = iVar.d(fD8);
                            if (Float.isNaN(fD9)) {
                                break;
                            } else {
                                if (iIntValue2 == 99) {
                                    fD8 += f13;
                                    fD9 += f14;
                                    fN3 += f13;
                                    fD5 += f14;
                                    fD6 += f13;
                                    fD7 += f14;
                                }
                                float f21 = fN3;
                                float f22 = fD5;
                                f10 = fD6;
                                fD = fD7;
                                f11 = fD8;
                                f12 = fD9;
                                c1469w.c(f21, f22, f10, fD, f11, f12);
                                fN = f10;
                                f13 = f11;
                                f14 = f12;
                                iVar.z();
                                if (iVar.h()) {
                                }
                            }
                            break;
                        case 72:
                        case 104:
                            float fN4 = iVar.n();
                            if (Float.isNaN(fN4)) {
                                break;
                            } else {
                                if (iIntValue2 == 104) {
                                    fN4 += f13;
                                }
                                f13 = fN4;
                                c1469w.e(f13, f14);
                                fN = f13;
                                iVar.z();
                                if (iVar.h()) {
                                }
                            }
                            break;
                        case 76:
                        case 108:
                            float fN5 = iVar.n();
                            float fD10 = iVar.d(fN5);
                            if (Float.isNaN(fD10)) {
                                break;
                            } else {
                                if (iIntValue2 == 108) {
                                    fN5 += f13;
                                    fD10 += f14;
                                }
                                f13 = fN5;
                                f14 = fD10;
                                c1469w.e(f13, f14);
                                fN = f13;
                                fD = f14;
                                iVar.z();
                                if (iVar.h()) {
                                }
                            }
                            break;
                        case 77:
                        case 109:
                            float fN6 = iVar.n();
                            float fD11 = iVar.d(fN6);
                            if (Float.isNaN(fD11)) {
                                break;
                            } else {
                                if (iIntValue2 == i10 && !c1469w.i()) {
                                    fN6 += f13;
                                    fD11 += f14;
                                }
                                f13 = fN6;
                                f14 = fD11;
                                c1469w.b(f13, f14);
                                fN = f13;
                                f15 = fN;
                                fD = f14;
                                f16 = fD;
                                iIntValue2 = iIntValue2 != i10 ? 76 : 108;
                                iVar.z();
                                if (iVar.h()) {
                                }
                            }
                            break;
                        case 81:
                        case 113:
                            fN = iVar.n();
                            fD = iVar.d(fN);
                            float fD12 = iVar.d(fD);
                            float fD13 = iVar.d(fD12);
                            if (Float.isNaN(fD13)) {
                                break;
                            } else {
                                if (iIntValue2 == 113) {
                                    fD12 += f13;
                                    fD13 += f14;
                                    fN += f13;
                                    fD += f14;
                                }
                                f13 = fD12;
                                f14 = fD13;
                                c1469w.a(fN, fD, f13, f14);
                                iVar.z();
                                if (iVar.h()) {
                                }
                            }
                            break;
                        case 83:
                        case 115:
                            float f23 = (f13 * 2.0f) - fN;
                            float f24 = (2.0f * f14) - fD;
                            float fN7 = iVar.n();
                            float fD14 = iVar.d(fN7);
                            float fD15 = iVar.d(fD14);
                            float fD16 = iVar.d(fD15);
                            if (Float.isNaN(fD16)) {
                                break;
                            } else {
                                if (iIntValue2 == 115) {
                                    fD15 += f13;
                                    fD16 += f14;
                                    fN7 += f13;
                                    fD14 += f14;
                                }
                                f10 = fN7;
                                fD = fD14;
                                f11 = fD15;
                                f12 = fD16;
                                c1469w.c(f23, f24, f10, fD, f11, f12);
                                fN = f10;
                                f13 = f11;
                                f14 = f12;
                                iVar.z();
                                if (iVar.h()) {
                                }
                            }
                            break;
                        case 84:
                        case 116:
                            fN = (f13 * 2.0f) - fN;
                            fD = (2.0f * f14) - fD;
                            float fN8 = iVar.n();
                            float fD17 = iVar.d(fN8);
                            if (Float.isNaN(fD17)) {
                                break;
                            } else {
                                if (iIntValue2 == 116) {
                                    fN8 += f13;
                                    fD17 += f14;
                                }
                                f13 = fN8;
                                f14 = fD17;
                                c1469w.a(fN, fD, f13, f14);
                                iVar.z();
                                if (iVar.h()) {
                                }
                            }
                            break;
                        case 86:
                        case 118:
                            float fN9 = iVar.n();
                            if (Float.isNaN(fN9)) {
                                break;
                            } else {
                                if (iIntValue2 == 118) {
                                    fN9 += f14;
                                }
                                f14 = fN9;
                                c1469w.e(f13, f14);
                                fD = f14;
                                iVar.z();
                                if (iVar.h()) {
                                }
                            }
                            break;
                        case 90:
                        case 122:
                            c1469w.close();
                            f13 = f15;
                            fN = f13;
                            f14 = f16;
                            fD = f14;
                            iVar.z();
                            if (iVar.h()) {
                            }
                            break;
                    }
                    return c1469w;
                }
            }
        }
        return c1469w;
    }

    private void v(Attributes attributes) throws U1.j {
        l("<line>", new Object[0]);
        if (this.f11192b == null) {
            throw new U1.j("Invalid document. Root element must be <svg>");
        }
        g.C1463q c1463q = new g.C1463q();
        c1463q.f11025a = this.f11191a;
        c1463q.f11026b = this.f11192b;
        D(c1463q, attributes);
        S(c1463q, attributes);
        W(c1463q, attributes);
        C(c1463q, attributes);
        H(c1463q, attributes);
        this.f11192b.a(c1463q);
    }

    static U1.e v0(String str) throws U1.j {
        e.b bVar;
        i iVar = new i(str);
        iVar.A();
        String strR = iVar.r();
        if ("defer".equals(strR)) {
            iVar.A();
            strR = iVar.r();
        }
        e.a aVarA = b.a(strR);
        iVar.A();
        if (iVar.h()) {
            bVar = null;
        } else {
            String strR2 = iVar.r();
            strR2.getClass();
            if (strR2.equals("meet")) {
                bVar = e.b.meet;
            } else {
                if (!strR2.equals("slice")) {
                    throw new U1.j("Invalid preserveAspectRatio definition: " + str);
                }
                bVar = e.b.slice;
            }
        }
        return new U1.e(aVarA, bVar);
    }

    private void w(Attributes attributes) throws U1.j {
        l("<linearGradient>", new Object[0]);
        if (this.f11192b == null) {
            throw new U1.j("Invalid document. Root element must be <svg>");
        }
        g.M m10 = new g.M();
        m10.f11025a = this.f11191a;
        m10.f11026b = this.f11192b;
        D(m10, attributes);
        S(m10, attributes);
        F(m10, attributes);
        I(m10, attributes);
        this.f11192b.a(m10);
        this.f11192b = m10;
    }

    private static void w0(g.P p10, String str) {
        p10.f11027o = v0(str);
    }

    private void x(Attributes attributes) throws U1.j {
        l("<marker>", new Object[0]);
        if (this.f11192b == null) {
            throw new U1.j("Invalid document. Root element must be <svg>");
        }
        g.C1464r c1464r = new g.C1464r();
        c1464r.f11025a = this.f11191a;
        c1464r.f11026b = this.f11192b;
        D(c1464r, attributes);
        S(c1464r, attributes);
        C(c1464r, attributes);
        Y(c1464r, attributes);
        J(c1464r, attributes);
        this.f11192b.a(c1464r);
        this.f11192b = c1464r;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map x0(i iVar) {
        HashMap map = new HashMap();
        iVar.A();
        String strS = iVar.s('=');
        while (strS != null) {
            iVar.f('=');
            map.put(strS, iVar.q());
            iVar.A();
            strS = iVar.s('=');
        }
        return map;
    }

    private void y(Attributes attributes) throws U1.j {
        l("<mask>", new Object[0]);
        if (this.f11192b == null) {
            throw new U1.j("Invalid document. Root element must be <svg>");
        }
        g.C1465s c1465s = new g.C1465s();
        c1465s.f11025a = this.f11191a;
        c1465s.f11026b = this.f11192b;
        D(c1465s, attributes);
        S(c1465s, attributes);
        C(c1465s, attributes);
        K(c1465s, attributes);
        this.f11192b.a(c1465s);
        this.f11192b = c1465s;
    }

    private static g.E.e y0(String str) {
        str.getClass();
        switch (str) {
            case "optimizeQuality":
                return g.E.e.optimizeQuality;
            case "auto":
                return g.E.e.auto;
            case "optimizeSpeed":
                return g.E.e.optimizeSpeed;
            default:
                return null;
        }
    }

    private static Set z0(String str) {
        i iVar = new i(str);
        HashSet hashSet = new HashSet();
        while (!iVar.h()) {
            String strR = iVar.r();
            if (strR.startsWith("http://www.w3.org/TR/SVG11/feature#")) {
                hashSet.add(strR.substring(35));
            } else {
                hashSet.add("UNSUPPORTED");
            }
            iVar.A();
        }
        return hashSet;
    }

    U1.g z(InputStream inputStream, boolean z10) {
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream);
        }
        try {
            inputStream.mark(3);
            int i10 = inputStream.read() + (inputStream.read() << 8);
            inputStream.reset();
            if (i10 == 35615) {
                inputStream = new BufferedInputStream(new GZIPInputStream(inputStream));
            }
        } catch (IOException unused) {
        }
        try {
            inputStream.mark(4096);
            L0(inputStream, z10);
            return this.f11191a;
        } finally {
            try {
                inputStream.close();
            } catch (IOException unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
    }

    private void l(String str, Object... objArr) {
    }
}
