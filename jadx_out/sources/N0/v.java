package N0;

import java.io.File;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v {
    public static final t a(File file) {
        AbstractC2855l.g(file, "file");
        String absolutePath = file.getCanonicalFile().getAbsolutePath();
        AbstractC2855l.f(absolutePath, "file.canonicalFile.absolutePath");
        return u.a(absolutePath);
    }
}
