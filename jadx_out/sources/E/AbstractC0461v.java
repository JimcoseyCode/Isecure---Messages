package E;

import android.net.Uri;
import java.io.File;
import java.io.IOException;
import y.V;

/* JADX INFO: renamed from: E.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0461v {
    private static Uri a(File file, V.g gVar) {
        throw null;
    }

    static File b(V.g gVar) {
        throw null;
    }

    private static boolean c(V.g gVar) {
        throw null;
    }

    private static boolean d(V.g gVar) {
        throw null;
    }

    private static boolean e(V.g gVar) {
        throw null;
    }

    static Uri f(File file, V.g gVar) {
        Uri uriA = null;
        try {
            try {
                if (d(gVar)) {
                    uriA = a(file, gVar);
                } else if (e(gVar) || c(gVar)) {
                    throw null;
                }
                file.delete();
                return uriA;
            } catch (IOException unused) {
                throw new y.X(1, "Failed to write to OutputStream.", null);
            }
        } catch (Throwable th) {
            file.delete();
            throw th;
        }
    }

    static void g(File file, H.g gVar, V.g gVar2, int i10) {
        try {
            H.g gVarE = H.g.e(file);
            gVar.d(gVarE);
            if (gVarE.n() == 0 && i10 != 0) {
                gVarE.u(i10);
            }
            throw null;
        } catch (IOException e10) {
            throw new y.X(1, "Failed to update Exif data", e10);
        }
    }
}
