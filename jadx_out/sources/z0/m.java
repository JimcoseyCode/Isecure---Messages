package Z0;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m extends RuntimeException {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Fragment f13554g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Fragment fragment, String str) {
        super(str);
        AbstractC2855l.g(fragment, "fragment");
        this.f13554g = fragment;
    }

    public final Fragment a() {
        return this.f13554g;
    }
}
