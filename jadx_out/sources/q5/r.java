package q5;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class r extends s {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f30816g;

    public r(List list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.f30816g = list;
    }
}
