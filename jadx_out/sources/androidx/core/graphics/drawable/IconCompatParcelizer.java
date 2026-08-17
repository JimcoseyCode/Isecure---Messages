package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.versionedparcelable.a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f16435a = aVar.p(iconCompat.f16435a, 1);
        iconCompat.f16437c = aVar.j(iconCompat.f16437c, 2);
        iconCompat.f16438d = aVar.r(iconCompat.f16438d, 3);
        iconCompat.f16439e = aVar.p(iconCompat.f16439e, 4);
        iconCompat.f16440f = aVar.p(iconCompat.f16440f, 5);
        iconCompat.f16441g = (ColorStateList) aVar.r(iconCompat.f16441g, 6);
        iconCompat.f16443i = aVar.t(iconCompat.f16443i, 7);
        iconCompat.f16444j = aVar.t(iconCompat.f16444j, 8);
        iconCompat.j();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.x(true, true);
        iconCompat.k(aVar.f());
        int i10 = iconCompat.f16435a;
        if (-1 != i10) {
            aVar.F(i10, 1);
        }
        byte[] bArr = iconCompat.f16437c;
        if (bArr != null) {
            aVar.B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f16438d;
        if (parcelable != null) {
            aVar.H(parcelable, 3);
        }
        int i11 = iconCompat.f16439e;
        if (i11 != 0) {
            aVar.F(i11, 4);
        }
        int i12 = iconCompat.f16440f;
        if (i12 != 0) {
            aVar.F(i12, 5);
        }
        ColorStateList colorStateList = iconCompat.f16441g;
        if (colorStateList != null) {
            aVar.H(colorStateList, 6);
        }
        String str = iconCompat.f16443i;
        if (str != null) {
            aVar.J(str, 7);
        }
        String str2 = iconCompat.f16444j;
        if (str2 != null) {
            aVar.J(str2, 8);
        }
    }
}
