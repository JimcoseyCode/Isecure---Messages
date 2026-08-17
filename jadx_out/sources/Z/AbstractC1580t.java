package Z;

import android.net.Uri;

/* JADX INFO: renamed from: Z.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1580t {
    static AbstractC1580t b(Uri uri) {
        H0.g.h(uri, "OutputUri cannot be null.");
        return new C1569h(uri);
    }

    public abstract Uri a();
}
