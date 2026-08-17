package h8;

import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class i {
    public static final boolean a(AbstractC2708a version) {
        AbstractC2855l.g(version, "version");
        return (version.a() == 1 && version.b() >= 4) || version.a() > 1;
    }

    public static final boolean b(AbstractC2708a version) {
        AbstractC2855l.g(version, "version");
        return a(version);
    }
}
