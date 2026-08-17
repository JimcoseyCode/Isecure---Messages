package x0;

import android.graphics.BlendMode;
import android.graphics.PorterDuff;
import com.facebook.react.uimanager.drawable.OutsetBoxShadowDrawableKt;
import com.facebook.react.views.text.TextAttributeProps;

/* JADX INFO: renamed from: x0.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC3515c {

    /* JADX INFO: renamed from: x0.c$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f33234a;

        static {
            int[] iArr = new int[EnumC3514b.values().length];
            f33234a = iArr;
            try {
                iArr[EnumC3514b.CLEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33234a[EnumC3514b.SRC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33234a[EnumC3514b.DST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33234a[EnumC3514b.SRC_OVER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f33234a[EnumC3514b.DST_OVER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f33234a[EnumC3514b.SRC_IN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f33234a[EnumC3514b.DST_IN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f33234a[EnumC3514b.SRC_OUT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f33234a[EnumC3514b.DST_OUT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f33234a[EnumC3514b.SRC_ATOP.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f33234a[EnumC3514b.DST_ATOP.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f33234a[EnumC3514b.XOR.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f33234a[EnumC3514b.PLUS.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f33234a[EnumC3514b.MODULATE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f33234a[EnumC3514b.SCREEN.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f33234a[EnumC3514b.OVERLAY.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f33234a[EnumC3514b.DARKEN.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f33234a[EnumC3514b.LIGHTEN.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f33234a[EnumC3514b.COLOR_DODGE.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f33234a[EnumC3514b.COLOR_BURN.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f33234a[EnumC3514b.HARD_LIGHT.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f33234a[EnumC3514b.SOFT_LIGHT.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f33234a[EnumC3514b.DIFFERENCE.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f33234a[EnumC3514b.EXCLUSION.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f33234a[EnumC3514b.MULTIPLY.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f33234a[EnumC3514b.HUE.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f33234a[EnumC3514b.SATURATION.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f33234a[EnumC3514b.COLOR.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f33234a[EnumC3514b.LUMINOSITY.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
        }
    }

    /* JADX INFO: renamed from: x0.c$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class b {
        static Object a(EnumC3514b enumC3514b) {
            switch (a.f33234a[enumC3514b.ordinal()]) {
                case 1:
                    return BlendMode.CLEAR;
                case 2:
                    return BlendMode.SRC;
                case 3:
                    return BlendMode.DST;
                case 4:
                    return BlendMode.SRC_OVER;
                case 5:
                    return BlendMode.DST_OVER;
                case 6:
                    return BlendMode.SRC_IN;
                case 7:
                    return BlendMode.DST_IN;
                case 8:
                    return BlendMode.SRC_OUT;
                case 9:
                    return BlendMode.DST_OUT;
                case 10:
                    return BlendMode.SRC_ATOP;
                case 11:
                    return BlendMode.DST_ATOP;
                case 12:
                    return BlendMode.XOR;
                case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                    return BlendMode.PLUS;
                case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                    return BlendMode.MODULATE;
                case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                    return BlendMode.SCREEN;
                case 16:
                    return BlendMode.OVERLAY;
                case 17:
                    return BlendMode.DARKEN;
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
                    return BlendMode.LIGHTEN;
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
                    return BlendMode.COLOR_DODGE;
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DX /* 20 */:
                    return BlendMode.COLOR_BURN;
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DY /* 21 */:
                    return BlendMode.HARD_LIGHT;
                case TextAttributeProps.TA_KEY_IS_HIGHLIGHTED /* 22 */:
                    return BlendMode.SOFT_LIGHT;
                case TextAttributeProps.TA_KEY_LAYOUT_DIRECTION /* 23 */:
                    return BlendMode.DIFFERENCE;
                case TextAttributeProps.TA_KEY_ACCESSIBILITY_ROLE /* 24 */:
                    return BlendMode.EXCLUSION;
                case TextAttributeProps.TA_KEY_LINE_BREAK_STRATEGY /* 25 */:
                    return BlendMode.MULTIPLY;
                case TextAttributeProps.TA_KEY_ROLE /* 26 */:
                    return BlendMode.HUE;
                case TextAttributeProps.TA_KEY_TEXT_TRANSFORM /* 27 */:
                    return BlendMode.SATURATION;
                case OutsetBoxShadowDrawableKt.MIN_OUTSET_BOX_SHADOW_SDK_VERSION /* 28 */:
                    return BlendMode.COLOR;
                case 29:
                    return BlendMode.LUMINOSITY;
                default:
                    return null;
            }
        }
    }

    static PorterDuff.Mode a(EnumC3514b enumC3514b) {
        if (enumC3514b == null) {
            return null;
        }
        switch (a.f33234a[enumC3514b.ordinal()]) {
        }
        return null;
    }
}
