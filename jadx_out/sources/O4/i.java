package o4;

import com.google.android.gms.common.Feature;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends UnsupportedOperationException {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Feature f30498g;

    public i(Feature feature) {
        this.f30498g = feature;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return "Missing ".concat(String.valueOf(this.f30498g));
    }
}
