package O7;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C implements B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f8330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f8331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f8332c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set f8333d;

    public C(List allDependencies, Set modulesWhoseInternalsAreVisible, List directExpectedByDependencies, Set allExpectedByDependencies) {
        AbstractC2855l.g(allDependencies, "allDependencies");
        AbstractC2855l.g(modulesWhoseInternalsAreVisible, "modulesWhoseInternalsAreVisible");
        AbstractC2855l.g(directExpectedByDependencies, "directExpectedByDependencies");
        AbstractC2855l.g(allExpectedByDependencies, "allExpectedByDependencies");
        this.f8330a = allDependencies;
        this.f8331b = modulesWhoseInternalsAreVisible;
        this.f8332c = directExpectedByDependencies;
        this.f8333d = allExpectedByDependencies;
    }

    @Override // O7.B
    public List a() {
        return this.f8330a;
    }

    @Override // O7.B
    public Set b() {
        return this.f8331b;
    }

    @Override // O7.B
    public List c() {
        return this.f8332c;
    }
}
