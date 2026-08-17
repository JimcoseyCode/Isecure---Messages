package Q0;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final File a(Context context, String name) {
        AbstractC2855l.g(context, "<this>");
        AbstractC2855l.g(name, "name");
        return M0.a.a(context, name + ".preferences_pb");
    }
}
