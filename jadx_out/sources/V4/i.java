package v4;

import P4.C1379m;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import p4.AbstractC3064k;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class i extends AbstractBinderC3425a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ C1379m f32942c;

    i(com.google.android.gms.common.moduleinstall.internal.c cVar, C1379m c1379m) {
        this.f32942c = c1379m;
    }

    @Override // v4.AbstractBinderC3425a, v4.e
    public final void p(Status status, ModuleAvailabilityResponse moduleAvailabilityResponse) {
        AbstractC3064k.a(status, moduleAvailabilityResponse, this.f32942c);
    }
}
