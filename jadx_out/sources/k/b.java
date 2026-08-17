package K;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2855l;
import y.J0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Collection f6958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Collection f6959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f6960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f6961d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f6962e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final T.g f6963f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final J0 f6964g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map f6965h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final l f6966i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final l f6967j;

    public b(Collection appUseCases, Collection cameraUseCases, List cameraUseCasesToAttach, List cameraUseCasesToKeep, List cameraUseCasesToDetach, T.g gVar, J0 j02, Map useCaseConfigs, l primaryStreamSpecResult, l lVar) {
        AbstractC2855l.g(appUseCases, "appUseCases");
        AbstractC2855l.g(cameraUseCases, "cameraUseCases");
        AbstractC2855l.g(cameraUseCasesToAttach, "cameraUseCasesToAttach");
        AbstractC2855l.g(cameraUseCasesToKeep, "cameraUseCasesToKeep");
        AbstractC2855l.g(cameraUseCasesToDetach, "cameraUseCasesToDetach");
        AbstractC2855l.g(useCaseConfigs, "useCaseConfigs");
        AbstractC2855l.g(primaryStreamSpecResult, "primaryStreamSpecResult");
        this.f6958a = appUseCases;
        this.f6959b = cameraUseCases;
        this.f6960c = cameraUseCasesToAttach;
        this.f6961d = cameraUseCasesToKeep;
        this.f6962e = cameraUseCasesToDetach;
        this.f6963f = gVar;
        this.f6964g = j02;
        this.f6965h = useCaseConfigs;
        this.f6966i = primaryStreamSpecResult;
        this.f6967j = lVar;
    }

    public final Collection a() {
        return this.f6958a;
    }

    public final Collection b() {
        return this.f6959b;
    }

    public final List c() {
        return this.f6960c;
    }

    public final List d() {
        return this.f6962e;
    }

    public final List e() {
        return this.f6961d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return AbstractC2855l.b(this.f6958a, bVar.f6958a) && AbstractC2855l.b(this.f6959b, bVar.f6959b) && AbstractC2855l.b(this.f6960c, bVar.f6960c) && AbstractC2855l.b(this.f6961d, bVar.f6961d) && AbstractC2855l.b(this.f6962e, bVar.f6962e) && AbstractC2855l.b(this.f6963f, bVar.f6963f) && AbstractC2855l.b(this.f6964g, bVar.f6964g) && AbstractC2855l.b(this.f6965h, bVar.f6965h) && AbstractC2855l.b(this.f6966i, bVar.f6966i) && AbstractC2855l.b(this.f6967j, bVar.f6967j);
    }

    public final J0 f() {
        return this.f6964g;
    }

    public final l g() {
        return this.f6966i;
    }

    public final l h() {
        return this.f6967j;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.f6958a.hashCode() * 31) + this.f6959b.hashCode()) * 31) + this.f6960c.hashCode()) * 31) + this.f6961d.hashCode()) * 31) + this.f6962e.hashCode()) * 31;
        T.g gVar = this.f6963f;
        int iHashCode2 = (iHashCode + (gVar == null ? 0 : gVar.hashCode())) * 31;
        J0 j02 = this.f6964g;
        int iHashCode3 = (((((iHashCode2 + (j02 == null ? 0 : j02.hashCode())) * 31) + this.f6965h.hashCode()) * 31) + this.f6966i.hashCode()) * 31;
        l lVar = this.f6967j;
        return iHashCode3 + (lVar != null ? lVar.hashCode() : 0);
    }

    public final T.g i() {
        return this.f6963f;
    }

    public final Map j() {
        return this.f6965h;
    }

    public String toString() {
        return "CalculatedUseCaseInfo(appUseCases=" + this.f6958a + ", cameraUseCases=" + this.f6959b + ", cameraUseCasesToAttach=" + this.f6960c + ", cameraUseCasesToKeep=" + this.f6961d + ", cameraUseCasesToDetach=" + this.f6962e + ", streamSharing=" + this.f6963f + ", placeholderForExtensions=" + this.f6964g + ", useCaseConfigs=" + this.f6965h + ", primaryStreamSpecResult=" + this.f6966i + ", secondaryStreamSpecResult=" + this.f6967j + ')';
    }
}
