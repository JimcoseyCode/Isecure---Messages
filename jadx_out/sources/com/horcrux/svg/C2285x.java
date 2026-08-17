package com.horcrux.svg;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.common.assets.ReactFontManager;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.views.image.ReactImageView;

/* JADX INFO: renamed from: com.horcrux.svg.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
class C2285x {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    static final C2285x f24763p = new C2285x();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final double f24764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f24765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final e0 f24766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final ReadableMap f24767d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    g0 f24768e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f24769f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final String f24770g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final String f24771h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final f0 f24772i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final h0 f24773j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final i0 f24774k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final double f24775l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final double f24776m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final double f24777n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final boolean f24778o;

    /* JADX INFO: renamed from: com.horcrux.svg.x$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final g0[] f24779a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final int[] f24780b;

        static {
            g0 g0Var = g0.w100;
            g0 g0Var2 = g0.w200;
            g0 g0Var3 = g0.w300;
            g0 g0Var4 = g0.Normal;
            g0 g0Var5 = g0.w500;
            g0 g0Var6 = g0.w600;
            g0 g0Var7 = g0.Bold;
            g0 g0Var8 = g0.w800;
            g0 g0Var9 = g0.w900;
            f24779a = new g0[]{g0Var, g0Var, g0Var2, g0Var3, g0Var4, g0Var5, g0Var6, g0Var7, g0Var8, g0Var9, g0Var9};
            f24780b = new int[]{ReactFontManager.TypefaceStyle.NORMAL, ReactFontManager.TypefaceStyle.BOLD, 100, 200, ReactImageView.REMOTE_IMAGE_FADE_DURATION_MS, ReactFontManager.TypefaceStyle.NORMAL, 500, 600, ReactFontManager.TypefaceStyle.BOLD, 800, 900};
        }

        private static int a(int i10) {
            if (i10 < 350) {
                return ReactFontManager.TypefaceStyle.NORMAL;
            }
            if (i10 < 550) {
                return ReactFontManager.TypefaceStyle.BOLD;
            }
            if (i10 < 900) {
                return 900;
            }
            return i10;
        }

        static int b(g0 g0Var, C2285x c2285x) {
            return g0Var == g0.Bolder ? a(c2285x.f24769f) : g0Var == g0.Lighter ? c(c2285x.f24769f) : f24780b[g0Var.ordinal()];
        }

        private static int c(int i10) {
            if (i10 < 100) {
                return i10;
            }
            if (i10 < 550) {
                return 100;
            }
            return i10 < 750 ? ReactFontManager.TypefaceStyle.NORMAL : ReactFontManager.TypefaceStyle.BOLD;
        }

        static g0 d(int i10) {
            return f24779a[Math.round(i10 / 100.0f)];
        }
    }

    private C2285x() {
        this.f24767d = null;
        this.f24765b = PointerEventHelper.POINTER_TYPE_UNKNOWN;
        this.f24766c = e0.normal;
        this.f24768e = g0.Normal;
        this.f24769f = ReactFontManager.TypefaceStyle.NORMAL;
        this.f24770g = PointerEventHelper.POINTER_TYPE_UNKNOWN;
        this.f24771h = PointerEventHelper.POINTER_TYPE_UNKNOWN;
        this.f24772i = f0.normal;
        this.f24773j = h0.start;
        this.f24774k = i0.None;
        this.f24778o = false;
        this.f24775l = 0.0d;
        this.f24764a = 12.0d;
        this.f24776m = 0.0d;
        this.f24777n = 0.0d;
    }

    private void a(C2285x c2285x, double d10) {
        long jRound = Math.round(d10);
        if (jRound < 1 || jRound > 1000) {
            b(c2285x);
            return;
        }
        int i10 = (int) jRound;
        this.f24769f = i10;
        this.f24768e = a.d(i10);
    }

    private void b(C2285x c2285x) {
        this.f24769f = c2285x.f24769f;
        this.f24768e = c2285x.f24768e;
    }

    private double c(ReadableMap readableMap, String str, double d10, double d11, double d12) {
        return readableMap.getType(str) == ReadableType.Number ? readableMap.getDouble(str) * d10 : M.b(readableMap.getString(str), d12, d10, d11);
    }

    C2285x(ReadableMap readableMap, C2285x c2285x, double d10) {
        String string;
        String string2;
        f0 f0VarValueOf;
        h0 h0VarValueOf;
        i0 i0VarJ;
        double dC;
        double dC2;
        double d11 = c2285x.f24764a;
        if (readableMap.hasKey(ViewProps.FONT_SIZE)) {
            this.f24764a = c(readableMap, ViewProps.FONT_SIZE, 1.0d, d11, d11);
        } else {
            this.f24764a = d11;
        }
        if (readableMap.hasKey(ViewProps.FONT_WEIGHT)) {
            if (readableMap.getType(ViewProps.FONT_WEIGHT) == ReadableType.Number) {
                a(c2285x, readableMap.getDouble(ViewProps.FONT_WEIGHT));
            } else {
                String string3 = readableMap.getString(ViewProps.FONT_WEIGHT);
                if (g0.k(string3)) {
                    int iB = a.b(g0.j(string3), c2285x);
                    this.f24769f = iB;
                    this.f24768e = a.d(iB);
                } else if (string3 != null) {
                    a(c2285x, Double.parseDouble(string3));
                } else {
                    b(c2285x);
                }
            }
        } else {
            b(c2285x);
        }
        this.f24767d = readableMap.hasKey("fontData") ? readableMap.getMap("fontData") : c2285x.f24767d;
        this.f24765b = readableMap.hasKey(ViewProps.FONT_FAMILY) ? readableMap.getString(ViewProps.FONT_FAMILY) : c2285x.f24765b;
        this.f24766c = readableMap.hasKey(ViewProps.FONT_STYLE) ? e0.valueOf(readableMap.getString(ViewProps.FONT_STYLE)) : c2285x.f24766c;
        if (readableMap.hasKey("fontFeatureSettings")) {
            string = readableMap.getString("fontFeatureSettings");
        } else {
            string = c2285x.f24770g;
        }
        this.f24770g = string;
        if (readableMap.hasKey("fontVariationSettings")) {
            string2 = readableMap.getString("fontVariationSettings");
        } else {
            string2 = c2285x.f24771h;
        }
        this.f24771h = string2;
        if (readableMap.hasKey("fontVariantLigatures")) {
            f0VarValueOf = f0.valueOf(readableMap.getString("fontVariantLigatures"));
        } else {
            f0VarValueOf = c2285x.f24772i;
        }
        this.f24772i = f0VarValueOf;
        if (readableMap.hasKey("textAnchor")) {
            h0VarValueOf = h0.valueOf(readableMap.getString("textAnchor"));
        } else {
            h0VarValueOf = c2285x.f24773j;
        }
        this.f24773j = h0VarValueOf;
        if (readableMap.hasKey("textDecoration")) {
            i0VarJ = i0.j(readableMap.getString("textDecoration"));
        } else {
            i0VarJ = c2285x.f24774k;
        }
        this.f24774k = i0VarJ;
        boolean zHasKey = readableMap.hasKey("kerning");
        this.f24778o = zHasKey || c2285x.f24778o;
        this.f24775l = zHasKey ? c(readableMap, "kerning", d10, this.f24764a, 0.0d) : c2285x.f24775l;
        if (readableMap.hasKey("wordSpacing")) {
            dC = c(readableMap, "wordSpacing", d10, this.f24764a, 0.0d);
        } else {
            dC = c2285x.f24776m;
        }
        this.f24776m = dC;
        if (readableMap.hasKey(ViewProps.LETTER_SPACING)) {
            dC2 = c(readableMap, ViewProps.LETTER_SPACING, d10, this.f24764a, 0.0d);
        } else {
            dC2 = c2285x.f24777n;
        }
        this.f24777n = dC2;
    }
}
