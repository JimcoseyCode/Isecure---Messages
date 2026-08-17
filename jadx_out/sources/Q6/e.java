package Q6;

import android.content.Context;
import android.graphics.drawable.Drawable;
import g.AbstractC2619a;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class e {
    public static final Drawable a(Context context, String str) {
        AbstractC2855l.g(context, "context");
        if (str == null) {
            return null;
        }
        int identifier = context.getResources().getIdentifier(str, "drawable", context.getPackageName());
        if (identifier > 0) {
            return AbstractC2619a.b(context, identifier);
        }
        int identifier2 = context.getResources().getIdentifier(str, "drawable", "android");
        if (identifier2 > 0) {
            return AbstractC2619a.b(context, identifier2);
        }
        return null;
    }
}
