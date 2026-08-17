package d4;

import g4.InterfaceC2673a;
import java.util.Map;

/* JADX INFO: renamed from: d4.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C2330b extends AbstractC2334f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC2673a f25597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f25598b;

    C2330b(InterfaceC2673a interfaceC2673a, Map map) {
        if (interfaceC2673a == null) {
            throw new NullPointerException("Null clock");
        }
        this.f25597a = interfaceC2673a;
        if (map == null) {
            throw new NullPointerException("Null values");
        }
        this.f25598b = map;
    }

    @Override // d4.AbstractC2334f
    InterfaceC2673a e() {
        return this.f25597a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2334f) {
            AbstractC2334f abstractC2334f = (AbstractC2334f) obj;
            if (this.f25597a.equals(abstractC2334f.e()) && this.f25598b.equals(abstractC2334f.h())) {
                return true;
            }
        }
        return false;
    }

    @Override // d4.AbstractC2334f
    Map h() {
        return this.f25598b;
    }

    public int hashCode() {
        return ((this.f25597a.hashCode() ^ 1000003) * 1000003) ^ this.f25598b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f25597a + ", values=" + this.f25598b + "}";
    }
}
