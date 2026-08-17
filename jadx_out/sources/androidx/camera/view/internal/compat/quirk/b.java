package androidx.camera.view.internal.compat.quirk;

import F.C0474c1;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    static List a(C0474c1 c0474c1) {
        ArrayList arrayList = new ArrayList();
        if (c0474c1.a(SurfaceViewStretchedQuirk.class, SurfaceViewStretchedQuirk.j())) {
            arrayList.add(new SurfaceViewStretchedQuirk());
        }
        if (c0474c1.a(SurfaceViewNotCroppedByParentQuirk.class, SurfaceViewNotCroppedByParentQuirk.g())) {
            arrayList.add(new SurfaceViewNotCroppedByParentQuirk());
        }
        return arrayList;
    }
}
