package U7;

import java.util.EnumMap;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EnumMap f11384a;

    public E(EnumMap defaultQualifiers) {
        AbstractC2855l.g(defaultQualifiers, "defaultQualifiers");
        this.f11384a = defaultQualifiers;
    }

    public final w a(EnumC1475c enumC1475c) {
        return (w) this.f11384a.get(enumC1475c);
    }

    public final EnumMap b() {
        return this.f11384a;
    }
}
