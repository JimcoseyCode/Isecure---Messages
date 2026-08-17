package W5;

import T5.h;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Logger f12125b = Logger.getLogger(b.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f12126a;

    private b(boolean z10) {
        this.f12126a = z10;
    }

    private void a(InputStream inputStream) {
        try {
            inputStream.close();
        } catch (IOException e10) {
            f12125b.log(Level.WARNING, "Error closing input stream (ignored)", (Throwable) e10);
        }
    }

    private List b() {
        if (this.f12126a) {
            throw new IllegalArgumentException("Source cannot be null");
        }
        return Collections.EMPTY_LIST;
    }

    public static b c() {
        return new b(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Collection d(InputStream inputStream) throws Throwable {
        Throwable th;
        IOException e10;
        if (inputStream == null) {
            return b();
        }
        try {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
                try {
                    h hVar = new h();
                    hVar.readExternal(objectInputStream);
                    if (hVar.b().isEmpty()) {
                        throw new IllegalStateException("Empty metadata");
                    }
                    List listB = hVar.b();
                    a(objectInputStream);
                    return listB;
                } catch (IOException e11) {
                    e10 = e11;
                    throw new IllegalStateException("Unable to parse metadata file", e10);
                }
            } catch (Throwable th2) {
                th = th2;
                if (0 == 0) {
                    a(null);
                } else {
                    a(inputStream);
                }
                throw th;
            }
        } catch (IOException e12) {
            e10 = e12;
        } catch (Throwable th3) {
            th = th3;
            if (0 == 0) {
            }
            throw th;
        }
    }
}
