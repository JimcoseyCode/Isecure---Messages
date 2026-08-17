package v4;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d extends D4.b implements e {
    public d() {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks");
    }

    @Override // D4.b
    protected final boolean x(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            Status status = (Status) D4.c.a(parcel, Status.CREATOR);
            ModuleAvailabilityResponse moduleAvailabilityResponse = (ModuleAvailabilityResponse) D4.c.a(parcel, ModuleAvailabilityResponse.CREATOR);
            D4.c.b(parcel);
            p(status, moduleAvailabilityResponse);
        } else if (i10 == 2) {
            Status status2 = (Status) D4.c.a(parcel, Status.CREATOR);
            ModuleInstallResponse moduleInstallResponse = (ModuleInstallResponse) D4.c.a(parcel, ModuleInstallResponse.CREATOR);
            D4.c.b(parcel);
            o(status2, moduleInstallResponse);
        } else if (i10 == 3) {
            Status status3 = (Status) D4.c.a(parcel, Status.CREATOR);
            ModuleInstallIntentResponse moduleInstallIntentResponse = (ModuleInstallIntentResponse) D4.c.a(parcel, ModuleInstallIntentResponse.CREATOR);
            D4.c.b(parcel);
            h(status3, moduleInstallIntentResponse);
        } else {
            if (i10 != 4) {
                return false;
            }
            Status status4 = (Status) D4.c.a(parcel, Status.CREATOR);
            D4.c.b(parcel);
            t(status4);
        }
        return true;
    }
}
