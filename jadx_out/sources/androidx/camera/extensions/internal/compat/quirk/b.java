package androidx.camera.extensions.internal.compat.quirk;

import F.C0474c1;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    static List a(C0474c1 c0474c1) {
        ArrayList arrayList = new ArrayList();
        if (c0474c1.a(ExtensionDisabledQuirk.class, ExtensionDisabledQuirk.k())) {
            arrayList.add(new ExtensionDisabledQuirk());
        }
        if (c0474c1.a(CrashWhenOnDisableTooSoon.class, CrashWhenOnDisableTooSoon.g())) {
            arrayList.add(new CrashWhenOnDisableTooSoon());
        }
        if (c0474c1.a(GetAvailableKeysNeedsOnInit.class, GetAvailableKeysNeedsOnInit.g())) {
            arrayList.add(new GetAvailableKeysNeedsOnInit());
        }
        if (c0474c1.a(CaptureOutputSurfaceOccupiedQuirk.class, CaptureOutputSurfaceOccupiedQuirk.g())) {
            arrayList.add(new CaptureOutputSurfaceOccupiedQuirk());
        }
        if (c0474c1.a(EnsurePostviewFormatEquivalenceQuirk.class, EnsurePostviewFormatEquivalenceQuirk.g())) {
            arrayList.add(new EnsurePostviewFormatEquivalenceQuirk());
        }
        if (c0474c1.a(AvoidPostviewAvailabilityCheckQuirk.class, AvoidPostviewAvailabilityCheckQuirk.g())) {
            arrayList.add(new AvoidPostviewAvailabilityCheckQuirk());
        }
        if (c0474c1.a(AvoidCaptureProcessProgressAvailabilityCheckQuirk.class, AvoidCaptureProcessProgressAvailabilityCheckQuirk.g())) {
            arrayList.add(new AvoidCaptureProcessProgressAvailabilityCheckQuirk());
        }
        return arrayList;
    }
}
