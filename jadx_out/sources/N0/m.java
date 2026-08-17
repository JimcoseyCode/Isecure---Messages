package N0;

import android.os.Build;
import java.io.File;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m {
    public static final boolean a(File file, File toFile) {
        AbstractC2855l.g(file, "<this>");
        AbstractC2855l.g(toFile, "toFile");
        return Build.VERSION.SDK_INT >= 26 ? C1301a.f7727a.a(file, toFile) : file.renameTo(toFile);
    }
}
