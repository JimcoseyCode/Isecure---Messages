package r6;

import android.content.res.Resources;

/* JADX INFO: renamed from: r6.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3277f {
    public static final double a(float f10) {
        return f10 / Resources.getSystem().getDisplayMetrics().density;
    }

    public static final double b(float f10) {
        return f10 * Resources.getSystem().getDisplayMetrics().density;
    }
}
