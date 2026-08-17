package Z0;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends m {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Fragment f13556h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f13557i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Fragment fragment, Fragment expectedParentFragment, int i10) {
        super(fragment, "Attempting to nest fragment " + fragment + " within the view of parent fragment " + expectedParentFragment + " via container with ID " + i10 + " without using parent's childFragmentManager");
        AbstractC2855l.g(fragment, "fragment");
        AbstractC2855l.g(expectedParentFragment, "expectedParentFragment");
        this.f13556h = expectedParentFragment;
        this.f13557i = i10;
    }
}
