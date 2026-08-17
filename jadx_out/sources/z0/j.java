package Z0;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends l {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Fragment f13551h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f13552i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Fragment fragment, Fragment targetFragment, int i10) {
        super(fragment, "Attempting to set target fragment " + targetFragment + " with request code " + i10 + " for fragment " + fragment);
        AbstractC2855l.g(fragment, "fragment");
        AbstractC2855l.g(targetFragment, "targetFragment");
        this.f13551h = targetFragment;
        this.f13552i = i10;
    }
}
