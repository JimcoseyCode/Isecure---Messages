package L7;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class I extends r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f7290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f7291b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(List underlyingPropertyNamesToTypes) {
        super(null);
        AbstractC2855l.g(underlyingPropertyNamesToTypes, "underlyingPropertyNamesToTypes");
        this.f7290a = underlyingPropertyNamesToTypes;
        Map mapR = j7.K.r(c());
        if (mapR.size() != c().size()) {
            throw new IllegalArgumentException("Some properties have the same names");
        }
        this.f7291b = mapR;
    }

    @Override // L7.r0
    public boolean a(k8.f name) {
        AbstractC2855l.g(name, "name");
        return this.f7291b.containsKey(name);
    }

    public List c() {
        return this.f7290a;
    }

    public String toString() {
        return "MultiFieldValueClassRepresentation(underlyingPropertyNamesToTypes=" + c() + ')';
    }
}
