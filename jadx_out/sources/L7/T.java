package L7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class T {
    public static final void a(O o10, k8.c fqName, Collection packageFragments) {
        AbstractC2855l.g(o10, "<this>");
        AbstractC2855l.g(fqName, "fqName");
        AbstractC2855l.g(packageFragments, "packageFragments");
        if (o10 instanceof U) {
            ((U) o10).b(fqName, packageFragments);
        } else {
            packageFragments.addAll(o10.c(fqName));
        }
    }

    public static final boolean b(O o10, k8.c fqName) {
        AbstractC2855l.g(o10, "<this>");
        AbstractC2855l.g(fqName, "fqName");
        return o10 instanceof U ? ((U) o10).a(fqName) : c(o10, fqName).isEmpty();
    }

    public static final List c(O o10, k8.c fqName) {
        AbstractC2855l.g(o10, "<this>");
        AbstractC2855l.g(fqName, "fqName");
        ArrayList arrayList = new ArrayList();
        a(o10, fqName, arrayList);
        return arrayList;
    }
}
