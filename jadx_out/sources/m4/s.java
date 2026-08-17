package m4;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class s extends t {
    s(int i10, int i11, Bundle bundle) {
        super(i10, i11, bundle);
    }

    @Override // m4.t
    final void a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            d(null);
        } else {
            c(new u(4, "Invalid response to one way request", null));
        }
    }

    @Override // m4.t
    final boolean b() {
        return true;
    }
}
