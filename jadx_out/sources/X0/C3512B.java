package x0;

import E0.h;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.text.TextUtils;
import java.io.IOException;

/* JADX INFO: renamed from: x0.B, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C3512B extends C3511A {
    private static Typeface o(String str) {
        Typeface typefaceCreate = Typeface.create(str, 0);
        Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
        if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
            return null;
        }
        return typefaceCreate;
    }

    @Override // x0.C3511A
    protected Font m(h.b bVar) {
        Typeface typefaceO;
        Font fontJ;
        String strC = bVar.c();
        if (strC == null || (typefaceO = o(strC)) == null || (fontJ = v.j(typefaceO)) == null) {
            return null;
        }
        if (TextUtils.isEmpty(bVar.f())) {
            return fontJ;
        }
        try {
            return new Font.Builder(fontJ).setFontVariationSettings(bVar.f()).build();
        } catch (IOException unused) {
            return null;
        }
    }
}
