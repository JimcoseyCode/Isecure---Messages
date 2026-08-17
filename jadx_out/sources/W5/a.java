package W5;

import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements T5.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f12124a = Logger.getLogger(a.class.getName());

    @Override // T5.b
    public InputStream a(String str) {
        InputStream resourceAsStream = a.class.getResourceAsStream(str);
        if (resourceAsStream == null) {
            f12124a.log(Level.WARNING, String.format("File %s not found", str));
        }
        return resourceAsStream;
    }
}
