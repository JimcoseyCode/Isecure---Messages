package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.facebook.react.views.text.TextAttributeProps;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C0 extends B0 {
    C0() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.B0
    final void a(Object obj) {
        ((M0) obj).zzb.g();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.B0
    final void b(InterfaceC2163m2 interfaceC2163m2, Map.Entry entry) {
        N0 n02 = (N0) entry.getKey();
        EnumC2153k2 enumC2153k2 = EnumC2153k2.f22371h;
        switch (n02.f22289h.ordinal()) {
            case 0:
                interfaceC2163m2.t(n02.f22288g, ((Double) entry.getValue()).doubleValue());
                break;
            case 1:
                interfaceC2163m2.y(n02.f22288g, ((Float) entry.getValue()).floatValue());
                break;
            case 2:
                interfaceC2163m2.h(n02.f22288g, ((Long) entry.getValue()).longValue());
                break;
            case 3:
                interfaceC2163m2.I(n02.f22288g, ((Long) entry.getValue()).longValue());
                break;
            case 4:
                interfaceC2163m2.q(n02.f22288g, ((Integer) entry.getValue()).intValue());
                break;
            case 5:
                interfaceC2163m2.G(n02.f22288g, ((Long) entry.getValue()).longValue());
                break;
            case 6:
                interfaceC2163m2.e(n02.f22288g, ((Integer) entry.getValue()).intValue());
                break;
            case 7:
                interfaceC2163m2.f(n02.f22288g, ((Boolean) entry.getValue()).booleanValue());
                break;
            case 8:
                interfaceC2163m2.b(n02.f22288g, (String) entry.getValue());
                break;
            case 9:
                interfaceC2163m2.x(n02.f22288g, entry.getValue(), C2216y1.a().b(entry.getValue().getClass()));
                break;
            case 10:
                interfaceC2163m2.g(n02.f22288g, entry.getValue(), C2216y1.a().b(entry.getValue().getClass()));
                break;
            case 11:
                interfaceC2163m2.s(n02.f22288g, (AbstractC2171o0) entry.getValue());
                break;
            case 12:
                interfaceC2163m2.c(n02.f22288g, ((Integer) entry.getValue()).intValue());
                break;
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                interfaceC2163m2.q(n02.f22288g, ((Integer) entry.getValue()).intValue());
                break;
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                interfaceC2163m2.B(n02.f22288g, ((Integer) entry.getValue()).intValue());
                break;
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                interfaceC2163m2.n(n02.f22288g, ((Long) entry.getValue()).longValue());
                break;
            case 16:
                interfaceC2163m2.F(n02.f22288g, ((Integer) entry.getValue()).intValue());
                break;
            case 17:
                interfaceC2163m2.u(n02.f22288g, ((Long) entry.getValue()).longValue());
                break;
        }
    }
}
