package I4;

import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
abstract class I implements InterfaceC1016t0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private transient Set f4118g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private transient Map f4119h;

    I() {
    }

    @Override // I4.InterfaceC1016t0
    public final Set c() {
        Set set = this.f4118g;
        if (set != null) {
            return set;
        }
        Set setF = f();
        this.f4118g = setF;
        return setF;
    }

    @Override // I4.InterfaceC1016t0
    public final Map d() {
        Map map = this.f4119h;
        if (map != null) {
            return map;
        }
        Map mapE = e();
        this.f4119h = mapE;
        return mapE;
    }

    abstract Map e();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InterfaceC1016t0) {
            return d().equals(((InterfaceC1016t0) obj).d());
        }
        return false;
    }

    abstract Set f();

    public final int hashCode() {
        return d().hashCode();
    }

    public final String toString() {
        return d().toString();
    }
}
