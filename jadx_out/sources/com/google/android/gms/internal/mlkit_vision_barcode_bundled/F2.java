package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.facebook.react.uimanager.drawable.OutsetBoxShadowDrawableKt;
import com.facebook.react.views.text.TextAttributeProps;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class F2 implements T0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final T0 f21672a = new F2();

    private F2() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.T0
    public final boolean a(int i10) {
        switch (i10) {
            case 17:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DY /* 21 */:
            case TextAttributeProps.TA_KEY_IS_HIGHLIGHTED /* 22 */:
            case TextAttributeProps.TA_KEY_LAYOUT_DIRECTION /* 23 */:
            case TextAttributeProps.TA_KEY_ACCESSIBILITY_ROLE /* 24 */:
            case TextAttributeProps.TA_KEY_LINE_BREAK_STRATEGY /* 25 */:
            case TextAttributeProps.TA_KEY_ROLE /* 26 */:
            case TextAttributeProps.TA_KEY_TEXT_TRANSFORM /* 27 */:
            case OutsetBoxShadowDrawableKt.MIN_OUTSET_BOX_SHADOW_SDK_VERSION /* 28 */:
                return true;
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DX /* 20 */:
            default:
                return false;
        }
    }
}
