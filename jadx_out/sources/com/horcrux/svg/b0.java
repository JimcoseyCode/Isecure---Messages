package com.horcrux.svg;

import android.content.res.AssetManager;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewParent;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.views.text.ReactFontManager;
import com.facebook.react.views.text.TextAttributeProps;
import java.text.Bidi;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
class b0 extends o0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final ArrayList f24581A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final AssetManager f24582B;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Path f24583w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    String f24584x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private c0 f24585y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final ArrayList f24586z;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f24587a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f24588b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f24589c;

        static {
            int[] iArr = new int[d0.values().length];
            f24589c = iArr;
            try {
                iArr[d0.baseline.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24589c[d0.textBottom.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24589c[d0.afterEdge.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24589c[d0.textAfterEdge.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24589c[d0.alphabetic.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24589c[d0.ideographic.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f24589c[d0.middle.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f24589c[d0.central.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f24589c[d0.mathematical.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f24589c[d0.hanging.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f24589c[d0.textTop.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f24589c[d0.beforeEdge.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f24589c[d0.textBeforeEdge.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f24589c[d0.bottom.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f24589c[d0.center.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f24589c[d0.top.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            int[] iArr2 = new int[j0.values().length];
            f24588b = iArr2;
            try {
                iArr2[j0.spacing.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f24588b[j0.spacingAndGlyphs.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr3 = new int[h0.values().length];
            f24587a = iArr3;
            try {
                iArr3[h0.start.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f24587a[h0.middle.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f24587a[h0.end.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
        }
    }

    public b0(ReactContext reactContext) {
        super(reactContext);
        this.f24586z = new ArrayList();
        this.f24581A = new ArrayList();
        this.f24582B = this.mContext.getResources().getAssets();
    }

    private void E(Paint paint, C2285x c2285x) {
        int i10 = Build.VERSION.SDK_INT;
        double d10 = c2285x.f24777n;
        paint.setLetterSpacing((float) (d10 / (c2285x.f24764a * ((double) this.mScale))));
        if (d10 == 0.0d && c2285x.f24772i == f0.normal) {
            paint.setFontFeatureSettings("'rlig', 'liga', 'clig', 'calt', 'locl', 'ccmp', 'mark', 'mkmk','kern', 'hlig', 'cala', " + c2285x.f24770g);
        } else {
            paint.setFontFeatureSettings("'rlig', 'liga', 'clig', 'calt', 'locl', 'ccmp', 'mark', 'mkmk','kern', 'liga' 0, 'clig' 0, 'dlig' 0, 'hlig' 0, 'cala' 0, " + c2285x.f24770g);
        }
        if (i10 >= 26) {
            paint.setFontVariationSettings("'wght' " + c2285x.f24769f + c2285x.f24771h);
        }
    }

    private void F(Paint paint, C2285x c2285x) {
        int i10 = 0;
        boolean z10 = c2285x.f24768e == g0.Bold || c2285x.f24769f >= 550;
        boolean z11 = c2285x.f24766c == e0.italic;
        if (z10 && z11) {
            i10 = 3;
        } else if (z10) {
            i10 = 1;
        } else if (z11) {
            i10 = 2;
        }
        int i11 = c2285x.f24769f;
        String str = c2285x.f24765b;
        Typeface typeface = null;
        if (str != null && str.length() > 0) {
            String str2 = "fonts/" + str + ".otf";
            String str3 = "fonts/" + str + ".ttf";
            if (Build.VERSION.SDK_INT >= 26) {
                a0.a();
                Typeface.Builder builderA = Z.a(this.f24582B, str2);
                builderA.setFontVariationSettings("'wght' " + i11 + c2285x.f24771h);
                builderA.setWeight(i11);
                builderA.setItalic(z11);
                typeface = builderA.build();
                if (typeface == null) {
                    a0.a();
                    Typeface.Builder builderA2 = Z.a(this.f24582B, str3);
                    builderA2.setFontVariationSettings("'wght' " + i11 + c2285x.f24771h);
                    builderA2.setWeight(i11);
                    builderA2.setItalic(z11);
                    typeface = builderA2.build();
                }
            } else {
                try {
                    try {
                        typeface = Typeface.create(Typeface.createFromAsset(this.f24582B, str2), i10);
                    } catch (Exception unused) {
                        typeface = Typeface.create(Typeface.createFromAsset(this.f24582B, str3), i10);
                    }
                } catch (Exception unused2) {
                }
            }
        }
        if (typeface == null) {
            try {
                typeface = ReactFontManager.getInstance().getTypeface(str, i10, this.f24582B);
            } catch (Exception unused3) {
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            typeface = Typeface.create(typeface, i11, z11);
        }
        paint.setLinearText(true);
        paint.setSubpixelText(true);
        paint.setTypeface(typeface);
        paint.setTextSize((float) (c2285x.f24764a * ((double) this.mScale)));
        paint.setLetterSpacing(0.0f);
    }

    private void G(Canvas canvas, Paint paint) {
        C2287z c2287zG = g();
        i();
        C2285x c2285xB = c2287zG.b();
        TextPaint textPaint = new TextPaint(paint);
        F(textPaint, c2285xB);
        E(textPaint, c2285xB);
        double dC = c2287zG.c();
        int i10 = a.f24587a[c2285xB.f24773j.ordinal()];
        StaticLayout staticLayoutJ = J(textPaint, i10 != 2 ? i10 != 3 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER, true, new SpannableString(this.f24584x), (int) M.a(this.f24701l, canvas.getWidth(), 0.0d, this.mScale, dC));
        int lineAscent = staticLayoutJ.getLineAscent(0);
        float fL = (float) c2287zG.l(0.0d);
        float fM = (float) (c2287zG.m() + ((double) lineAscent));
        h();
        canvas.save();
        canvas.translate(fL, fM);
        staticLayoutJ.draw(canvas);
        canvas.restore();
    }

    private double H(SVGLength sVGLength, double d10, double d11) {
        return M.a(sVGLength, d10, 0.0d, this.mScale, d11);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0295 A[PHI: r0
      0x0295: PHI (r0v9 double) = 
      (r0v8 double)
      (r0v8 double)
      (r0v8 double)
      (r0v8 double)
      (r0v8 double)
      (r0v36 double)
      (r0v37 double)
      (r0v8 double)
      (r0v8 double)
      (r0v8 double)
      (r0v42 double)
      (r0v43 double)
     binds: [B:78:0x0238, B:80:0x023e, B:82:0x024a, B:84:0x024e, B:101:0x0281, B:126:0x0301, B:115:0x02d4, B:104:0x0299, B:106:0x029f, B:108:0x02a5, B:113:0x02c1, B:102:0x0284] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02d4 A[PHI: r31
      0x02d4: PHI (r31v4 double) = (r31v3 double), (r31v3 double), (r31v5 double) binds: [B:123:0x02f3, B:125:0x02ff, B:114:0x02d2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0235  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Path I(String str, Paint paint, Canvas canvas) {
        PathMeasure pathMeasure;
        double length;
        boolean zIsClosed;
        C2287z c2287z;
        boolean z10;
        int i10;
        double d10;
        b0 b0Var;
        double d11;
        boolean z11;
        C2287z c2287z2;
        double d12;
        boolean z12;
        A a10;
        float[] fArr;
        boolean[] zArr;
        double d13;
        double d14;
        double d15;
        int i11;
        boolean z13;
        double d16;
        SVGLength sVGLength;
        d0 d0VarN;
        byte b10;
        double d17;
        int i12;
        boolean z14;
        float f10;
        boolean z15;
        double d18;
        float[] fArr2;
        Canvas canvas2;
        int i13;
        C2287z c2287z3;
        A a11;
        Matrix matrix;
        b0 b0Var2;
        Paint paint2;
        float[] fArr3;
        Path path;
        char c10;
        double d19;
        A a12;
        float f11;
        double d20;
        char c11;
        double d21;
        float[] fArr4;
        int i14;
        String str2;
        Path pathB;
        int i15;
        int i16;
        double d22;
        Paint paint3 = paint;
        Canvas canvas3 = canvas;
        int length2 = str.length();
        Path path2 = new Path();
        this.f24586z.clear();
        this.f24581A.clear();
        if (length2 != 0) {
            boolean z16 = this.f24585y != null;
            if (z16) {
                pathMeasure = new PathMeasure(this.f24585y.H(canvas3, paint3), false);
                length = pathMeasure.getLength();
                zIsClosed = length != 0.0d ? pathMeasure.isClosed() : false;
            } else {
                pathMeasure = null;
                length = 0.0d;
            }
            PathMeasure pathMeasure2 = pathMeasure;
            C2287z c2287zG = g();
            C2285x c2285xB = c2287zG.b();
            F(paint3, c2285xB);
            A a13 = new A(paint3);
            boolean[] zArr2 = new boolean[length2];
            char[] charArray = str.toCharArray();
            double d23 = c2285xB.f24775l;
            double d24 = c2285xB.f24776m;
            double d25 = c2285xB.f24777n;
            boolean z17 = c2285xB.f24778o;
            if (d25 == 0.0d) {
                c2287z = c2287zG;
                z10 = c2285xB.f24772i == f0.normal;
                i10 = Build.VERSION.SDK_INT;
                if (z10) {
                    d10 = length;
                    paint3.setFontFeatureSettings("'rlig', 'liga', 'clig', 'calt', 'locl', 'ccmp', 'mark', 'mkmk','kern', 'liga' 0, 'clig' 0, 'dlig' 0, 'hlig' 0, 'cala' 0, " + c2285xB.f24770g);
                } else {
                    StringBuilder sb = new StringBuilder();
                    d10 = length;
                    sb.append("'rlig', 'liga', 'clig', 'calt', 'locl', 'ccmp', 'mark', 'mkmk','kern', 'hlig', 'cala', ");
                    sb.append(c2285xB.f24770g);
                    paint3.setFontFeatureSettings(sb.toString());
                }
                if (i10 >= 26) {
                    paint3.setFontVariationSettings("'wght' " + c2285xB.f24769f + c2285xB.f24771h);
                }
                ReadableMap readableMap = c2285xB.f24767d;
                float[] fArr5 = new float[length2];
                paint3.getTextWidths(str, fArr5);
                h0 h0Var = c2285xB.f24773j;
                double dQ = r().q(paint3);
                double dK = K(h0Var, dQ);
                double dC = c2287z.c();
                byte b11 = -1;
                if (z16) {
                    b0Var = this;
                    d11 = dQ;
                    z11 = z17;
                    c2287z2 = c2287z;
                    d12 = dC;
                    z12 = z16;
                    a10 = a13;
                    double d26 = d10;
                    fArr = fArr5;
                    zArr = zArr2;
                    d13 = d26;
                    d14 = 0.0d;
                    d15 = dK;
                    i11 = 1;
                    z13 = false;
                } else {
                    boolean z18 = this.f24585y.E() == l0.sharp;
                    int i17 = this.f24585y.F() == m0.right ? -1 : 1;
                    d11 = dQ;
                    z11 = z17;
                    c2287z2 = c2287z;
                    double d27 = d10;
                    fArr = fArr5;
                    z12 = z16;
                    zArr = zArr2;
                    a10 = a13;
                    double dH = H(this.f24585y.G(), d27, dC);
                    b0Var = this;
                    d13 = d27;
                    double d28 = dK + dH;
                    d12 = dC;
                    if (zIsClosed) {
                        double d29 = dH + (h0Var == h0.middle ? -(d13 / 2.0d) : 0.0d);
                        d15 = d28;
                        d14 = d29;
                        z13 = z18;
                        d16 = d29 + d13;
                        i11 = i17;
                        sVGLength = b0Var.f24702m;
                        double d30 = 1.0d;
                        if (sVGLength != null) {
                            double dA = M.a(sVGLength, canvas3.getWidth(), 0.0d, b0Var.mScale, d12);
                            if (dA < 0.0d) {
                                throw new IllegalArgumentException("Negative textLength value");
                            }
                            if (a.f24588b[b0Var.f24704o.ordinal()] != 2) {
                                d25 += (dA - d11) / ((double) (length2 - 1));
                            } else {
                                d30 = dA / d11;
                            }
                        }
                        double d31 = i11;
                        boolean z19 = z13;
                        Paint.FontMetrics fontMetrics = paint3.getFontMetrics();
                        int i18 = i11;
                        double d32 = d30 * d31;
                        double d33 = fontMetrics.descent;
                        float f12 = fontMetrics.leading;
                        double d34 = d13;
                        double d35 = ((double) f12) + d33;
                        double dB = (-fontMetrics.ascent) + f12;
                        double d36 = -fontMetrics.top;
                        double d37 = d36 + d35;
                        String strO = b0Var.o();
                        d0VarN = b0Var.n();
                        if (d0VarN != null) {
                            switch (a.f24589c[d0VarN.ordinal()]) {
                                case 2:
                                case 3:
                                case 4:
                                case 6:
                                    b10 = 0;
                                    dB = -d33;
                                    break;
                                case 5:
                                    b10 = 0;
                                    dB = 0.0d;
                                    break;
                                case 7:
                                    Rect rect = new Rect();
                                    b10 = 0;
                                    paint3.getTextBounds("x", 0, 1, rect);
                                    dB = ((double) rect.height()) / 2.0d;
                                    break;
                                case 8:
                                    dB = (dB - d33) / 2.0d;
                                    b10 = 0;
                                    break;
                                case 9:
                                    d22 = 0.5d;
                                    dB *= d22;
                                    b10 = 0;
                                    break;
                                case 10:
                                    d22 = 0.8d;
                                    dB *= d22;
                                    b10 = 0;
                                    break;
                                case 11:
                                case 12:
                                case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                                    b10 = 0;
                                    break;
                                case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                                    dB = d35;
                                    b10 = 0;
                                    break;
                                case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                                    dB = d37 / 2.0d;
                                    b10 = 0;
                                    break;
                                case 16:
                                    dB = d36;
                                    b10 = 0;
                                    break;
                                default:
                                    dB = 0.0d;
                                    b10 = 0;
                                    break;
                            }
                            if (strO == null || strO.isEmpty() || (i16 = a.f24589c[d0VarN.ordinal()]) == 14 || i16 == 16) {
                                d17 = dB;
                                Matrix matrix2 = new Matrix();
                                Matrix matrix3 = new Matrix();
                                Matrix matrix4 = new Matrix();
                                float[] fArr6 = new float[9];
                                float[] fArr7 = new float[9];
                                i12 = 0;
                                while (i12 < length2) {
                                    char c12 = charArray[i12];
                                    String strValueOf = String.valueOf(c12);
                                    boolean z20 = zArr[i12];
                                    if (z20) {
                                        strValueOf = PointerEventHelper.POINTER_TYPE_UNKNOWN;
                                        z14 = false;
                                        f10 = 0.0f;
                                    } else {
                                        int i19 = i12;
                                        z14 = false;
                                        f10 = 0.0f;
                                        while (true) {
                                            int i20 = i19 + 1;
                                            if (i20 < length2 && fArr[i20] <= 0.0f) {
                                                strValueOf = strValueOf + charArray[i20];
                                                zArr[i20] = true;
                                                i19 = i20;
                                                z14 = true;
                                            }
                                        }
                                    }
                                    int i21 = i12;
                                    double dMeasureText = ((double) paint3.measureText(strValueOf)) * d30;
                                    if (!z11) {
                                        d23 = (((double) fArr[i21]) * d30) - dMeasureText;
                                    }
                                    boolean z21 = c12 == ' ';
                                    double d38 = dMeasureText + (z21 ? d24 : 0.0d) + d25;
                                    if (z20) {
                                        z15 = z21;
                                        d18 = 0.0d;
                                    } else {
                                        z15 = z21;
                                        d18 = d23 + d38;
                                    }
                                    double dL = c2287z2.l(d18);
                                    double dM = c2287z2.m();
                                    double dI = c2287z2.i();
                                    double dJ = c2287z2.j();
                                    String str3 = strValueOf;
                                    double dK2 = c2287z2.k();
                                    if (z20 || z15) {
                                        fArr2 = fArr7;
                                        canvas2 = canvas3;
                                        i13 = length2;
                                        c2287z3 = c2287z2;
                                        a11 = a10;
                                        matrix = matrix3;
                                        b0Var2 = this;
                                        paint2 = paint;
                                        fArr3 = fArr6;
                                        path = path2;
                                    } else {
                                        double d39 = dMeasureText * d31;
                                        i13 = length2;
                                        Path path3 = path2;
                                        double d40 = (d15 + ((dL + dI) * d31)) - (d38 * d31);
                                        if (z12) {
                                            c10 = c12;
                                            d19 = dK2;
                                            double d41 = d40 + d39;
                                            double d42 = d39 / 2.0d;
                                            double d43 = d40 + d42;
                                            if (d43 <= d16 && d43 >= d14) {
                                                c2287z3 = c2287z2;
                                                if (z19) {
                                                    pathMeasure2.getMatrix((float) d43, matrix3, 3);
                                                    fArr2 = fArr7;
                                                    a12 = a10;
                                                    matrix = matrix3;
                                                    d21 = d34;
                                                    c11 = 2;
                                                    fArr4 = fArr6;
                                                } else {
                                                    if (d40 < 0.0d) {
                                                        a12 = a10;
                                                        float f13 = f10;
                                                        pathMeasure2.getMatrix(f13, matrix2, 3);
                                                        matrix2.preTranslate((float) d40, f13);
                                                        i15 = 1;
                                                    } else {
                                                        a12 = a10;
                                                        i15 = 1;
                                                        pathMeasure2.getMatrix((float) d40, matrix2, 1);
                                                    }
                                                    pathMeasure2.getMatrix((float) d43, matrix3, i15);
                                                    if (d41 > d34) {
                                                        d21 = d34;
                                                        pathMeasure2.getMatrix((float) d21, matrix4, 3);
                                                        matrix4.preTranslate((float) (d41 - d21), 0.0f);
                                                    } else {
                                                        d21 = d34;
                                                        pathMeasure2.getMatrix((float) d41, matrix4, i15);
                                                    }
                                                    matrix2.getValues(fArr6);
                                                    matrix4.getValues(fArr7);
                                                    c11 = 2;
                                                    fArr2 = fArr7;
                                                    fArr4 = fArr6;
                                                    matrix = matrix3;
                                                    matrix.preRotate((float) (Math.atan2(((double) fArr7[5]) - ((double) fArr6[5]), ((double) fArr7[2]) - ((double) fArr6[2])) * 57.29577951308232d * d31));
                                                }
                                                matrix.preTranslate((float) (-d42), (float) (dJ + d17));
                                                d20 = d32;
                                                i14 = i18;
                                                matrix.preScale((float) d20, i14);
                                                f11 = 0.0f;
                                                matrix.postTranslate(0.0f, (float) dM);
                                            } else {
                                                b0Var2 = this;
                                                canvas2 = canvas;
                                                fArr2 = fArr7;
                                                fArr3 = fArr6;
                                                c2287z3 = c2287z2;
                                                a11 = a10;
                                                matrix = matrix3;
                                                path = path3;
                                                paint2 = paint;
                                            }
                                        } else {
                                            fArr2 = fArr7;
                                            c10 = c12;
                                            d19 = dK2;
                                            c2287z3 = c2287z2;
                                            a12 = a10;
                                            matrix = matrix3;
                                            f11 = f10;
                                            d20 = d32;
                                            c11 = 2;
                                            d21 = d34;
                                            fArr4 = fArr6;
                                            i14 = i18;
                                            matrix.setTranslate((float) d40, (float) (dM + dJ + d17));
                                        }
                                        matrix.preRotate((float) d19);
                                        if (z14) {
                                            pathB = new Path();
                                            d32 = d20;
                                            fArr3 = fArr4;
                                            d34 = d21;
                                            b0Var2 = this;
                                            paint2 = paint;
                                            i18 = i14;
                                            str2 = str3;
                                            paint2.getTextPath(str2, 0, str3.length(), 0.0f, 0.0f, pathB);
                                            a11 = a12;
                                        } else {
                                            b0Var2 = this;
                                            paint2 = paint;
                                            i18 = i14;
                                            d32 = d20;
                                            fArr3 = fArr4;
                                            str2 = str3;
                                            d34 = d21;
                                            a11 = a12;
                                            pathB = a11.b(c10, str2);
                                        }
                                        RectF rectF = new RectF();
                                        pathB.computeBounds(rectF, true);
                                        if (rectF.width() == f11) {
                                            canvas.save();
                                            canvas2 = canvas;
                                            canvas2.concat(matrix);
                                            b0Var2.f24586z.add(str2);
                                            b0Var2.f24581A.add(new Matrix(matrix));
                                            canvas2.drawText(str2, f11, f11, paint2);
                                            canvas2.restore();
                                            path = path3;
                                        } else {
                                            canvas2 = canvas;
                                            pathB.transform(matrix);
                                            path = path3;
                                            path.addPath(pathB);
                                        }
                                    }
                                    paint3 = paint2;
                                    path2 = path;
                                    a10 = a11;
                                    b0Var = b0Var2;
                                    fArr6 = fArr3;
                                    matrix3 = matrix;
                                    length2 = i13;
                                    c2287z2 = c2287z3;
                                    fArr7 = fArr2;
                                    canvas3 = canvas2;
                                    i12 = i21 + 1;
                                }
                            } else {
                                switch (strO.hashCode()) {
                                    case -1720785339:
                                        if (strO.equals("baseline")) {
                                            b11 = b10;
                                        }
                                        break;
                                    case 114240:
                                        if (strO.equals("sub")) {
                                            b11 = 1;
                                        }
                                        break;
                                    case 109801339:
                                        if (strO.equals("super")) {
                                            b11 = 2;
                                        }
                                        break;
                                }
                                switch (b11) {
                                    case 0:
                                        break;
                                    case 1:
                                        d17 = dB;
                                        if (readableMap != null && readableMap.hasKey("tables") && readableMap.hasKey("unitsPerEm")) {
                                            int i22 = readableMap.getInt("unitsPerEm");
                                            ReadableMap map = readableMap.getMap("tables");
                                            if (map.hasKey("os2")) {
                                                ReadableMap map2 = map.getMap("os2");
                                                dB = map2.hasKey("ySubscriptYOffset") ? d17 + (((((double) b0Var.mScale) * d12) * map2.getDouble("ySubscriptYOffset")) / ((double) i22)) : d17;
                                                d17 = dB;
                                                break;
                                            }
                                        }
                                        break;
                                    case 2:
                                        if (readableMap != null && readableMap.hasKey("tables") && readableMap.hasKey("unitsPerEm")) {
                                            int i23 = readableMap.getInt("unitsPerEm");
                                            ReadableMap map3 = readableMap.getMap("tables");
                                            if (map3.hasKey("os2")) {
                                                ReadableMap map4 = map3.getMap("os2");
                                                if (map4.hasKey("ySuperscriptYOffset")) {
                                                    dB -= ((((double) b0Var.mScale) * d12) * map4.getDouble("ySuperscriptYOffset")) / ((double) i23);
                                                }
                                            }
                                            d17 = dB;
                                        }
                                        d17 = dB;
                                        break;
                                    default:
                                        float f14 = b0Var.mScale;
                                        dB -= M.b(strO, ((double) f14) * d12, f14, d12);
                                        d17 = dB;
                                        break;
                                }
                                Matrix matrix22 = new Matrix();
                                Matrix matrix32 = new Matrix();
                                Matrix matrix42 = new Matrix();
                                float[] fArr62 = new float[9];
                                float[] fArr72 = new float[9];
                                i12 = 0;
                                while (i12 < length2) {
                                }
                            }
                        }
                    } else {
                        d14 = 0.0d;
                        d15 = d28;
                        z13 = z18;
                        i11 = i17;
                    }
                }
                d16 = d13;
                sVGLength = b0Var.f24702m;
                double d302 = 1.0d;
                if (sVGLength != null) {
                }
                double d312 = i11;
                boolean z192 = z13;
                Paint.FontMetrics fontMetrics2 = paint3.getFontMetrics();
                int i182 = i11;
                double d322 = d302 * d312;
                double d332 = fontMetrics2.descent;
                float f122 = fontMetrics2.leading;
                double d342 = d13;
                double d352 = ((double) f122) + d332;
                double dB2 = (-fontMetrics2.ascent) + f122;
                double d362 = -fontMetrics2.top;
                double d372 = d362 + d352;
                String strO2 = b0Var.o();
                d0VarN = b0Var.n();
                if (d0VarN != null) {
                }
            } else {
                c2287z = c2287zG;
            }
            i10 = Build.VERSION.SDK_INT;
            if (z10) {
            }
            if (i10 >= 26) {
            }
            ReadableMap readableMap2 = c2285xB.f24767d;
            float[] fArr52 = new float[length2];
            paint3.getTextWidths(str, fArr52);
            h0 h0Var2 = c2285xB.f24773j;
            double dQ2 = r().q(paint3);
            double dK3 = K(h0Var2, dQ2);
            double dC2 = c2287z.c();
            byte b112 = -1;
            if (z16) {
            }
            d16 = d13;
            sVGLength = b0Var.f24702m;
            double d3022 = 1.0d;
            if (sVGLength != null) {
            }
            double d3122 = i11;
            boolean z1922 = z13;
            Paint.FontMetrics fontMetrics22 = paint3.getFontMetrics();
            int i1822 = i11;
            double d3222 = d3022 * d3122;
            double d3322 = fontMetrics22.descent;
            float f1222 = fontMetrics22.leading;
            double d3422 = d13;
            double d3522 = ((double) f1222) + d3322;
            double dB22 = (-fontMetrics22.ascent) + f1222;
            double d3622 = -fontMetrics22.top;
            double d3722 = d3622 + d3522;
            String strO22 = b0Var.o();
            d0VarN = b0Var.n();
            if (d0VarN != null) {
            }
        }
        return path2;
    }

    private StaticLayout J(TextPaint textPaint, Layout.Alignment alignment, boolean z10, SpannableString spannableString, int i10) {
        return StaticLayout.Builder.obtain(spannableString, 0, spannableString.length(), textPaint, i10).setAlignment(alignment).setLineSpacing(0.0f, 1.0f).setIncludePad(z10).setBreakStrategy(1).setHyphenationFrequency(1).build();
    }

    private double K(h0 h0Var, double d10) {
        int i10 = a.f24587a[h0Var.ordinal()];
        if (i10 == 2) {
            return (-d10) / 2.0d;
        }
        if (i10 != 3) {
            return 0.0d;
        }
        return -d10;
    }

    private void M() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent.getClass() == c0.class) {
                this.f24585y = (c0) parent;
                return;
            } else {
                if (!(parent instanceof o0)) {
                    return;
                }
            }
        }
    }

    public static String N(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        Bidi bidi = new Bidi(str, -2);
        if (bidi.isLeftToRight()) {
            return str;
        }
        int runCount = bidi.getRunCount();
        byte[] bArr = new byte[runCount];
        Integer[] numArr = new Integer[runCount];
        for (int i10 = 0; i10 < runCount; i10++) {
            bArr[i10] = (byte) bidi.getRunLevel(i10);
            numArr[i10] = Integer.valueOf(i10);
        }
        Bidi.reorderVisually(bArr, 0, numArr, 0, runCount);
        StringBuilder sb = new StringBuilder();
        for (int i11 = 0; i11 < runCount; i11++) {
            int iIntValue = numArr[i11].intValue();
            int runStart = bidi.getRunStart(iIntValue);
            int runLimit = bidi.getRunLimit(iIntValue);
            if ((bArr[iIntValue] & 1) != 0) {
                while (true) {
                    runLimit--;
                    if (runLimit >= runStart) {
                        sb.append(str.charAt(runLimit));
                    }
                }
            } else {
                sb.append((CharSequence) str, runStart, runLimit);
            }
        }
        return sb.toString();
    }

    public void L(String str) {
        this.f24584x = str;
        invalidate();
    }

    @Override // com.horcrux.svg.o0, com.horcrux.svg.VirtualView
    void clearCache() {
        this.f24583w = null;
        super.clearCache();
    }

    @Override // com.horcrux.svg.o0, com.horcrux.svg.B, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    void draw(Canvas canvas, Paint paint, float f10) {
        if (this.f24584x == null) {
            clip(canvas, paint);
            c(canvas, paint, f10);
            return;
        }
        SVGLength sVGLength = this.f24701l;
        if (sVGLength != null && sVGLength.f24513a != 0.0d) {
            if (setupFillPaint(paint, this.fillOpacity * f10)) {
                G(canvas, paint);
            }
            if (setupStrokePaint(paint, f10 * this.strokeOpacity)) {
                G(canvas, paint);
                return;
            }
            return;
        }
        int size = this.f24586z.size();
        if (size > 0) {
            F(paint, g().b());
            for (int i10 = 0; i10 < size; i10++) {
                String str = (String) this.f24586z.get(i10);
                Matrix matrix = (Matrix) this.f24581A.get(i10);
                canvas.save();
                canvas.concat(matrix);
                canvas.drawText(str, 0.0f, 0.0f, paint);
                canvas.restore();
            }
        }
        d(canvas, paint, f10);
    }

    @Override // com.horcrux.svg.o0, com.horcrux.svg.B, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    Path getPath(Canvas canvas, Paint paint) {
        Path path = this.f24583w;
        if (path != null) {
            return path;
        }
        if (this.f24584x == null) {
            Path pathP = p(canvas, paint);
            this.f24583w = pathP;
            return pathP;
        }
        M();
        i();
        this.f24583w = I(N(this.f24584x), paint, canvas);
        h();
        return this.f24583w;
    }

    @Override // com.horcrux.svg.B, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    int hitTest(float[] fArr) {
        Region region;
        if (this.f24584x == null) {
            return super.hitTest(fArr);
        }
        if (this.mPath != null && this.mInvertible) {
            float[] fArr2 = new float[2];
            this.mInvMatrix.mapPoints(fArr2, fArr);
            int iRound = Math.round(fArr2[0]);
            int iRound2 = Math.round(fArr2[1]);
            initBounds();
            Region region2 = this.mRegion;
            if ((region2 != null && region2.contains(iRound, iRound2)) || ((region = this.mStrokeRegion) != null && region.contains(iRound, iRound2))) {
                if (getClipPath() == null || this.mClipRegion.contains(iRound, iRound2)) {
                    return getId();
                }
                return -1;
            }
        }
        return -1;
    }

    @Override // com.horcrux.svg.o0, com.horcrux.svg.VirtualView, android.view.View
    public void invalidate() {
        this.f24583w = null;
        super.invalidate();
    }

    @Override // com.horcrux.svg.o0
    double q(Paint paint) {
        if (!Double.isNaN(this.f24711v)) {
            return this.f24711v;
        }
        String str = this.f24584x;
        double dQ = 0.0d;
        if (str == null) {
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (childAt instanceof o0) {
                    dQ += ((o0) childAt).q(paint);
                }
            }
            this.f24711v = dQ;
            return dQ;
        }
        if (str.length() == 0) {
            this.f24711v = 0.0d;
            return 0.0d;
        }
        C2285x c2285xB = g().b();
        F(paint, c2285xB);
        E(paint, c2285xB);
        double dMeasureText = paint.measureText(str);
        this.f24711v = dMeasureText;
        return dMeasureText;
    }
}
