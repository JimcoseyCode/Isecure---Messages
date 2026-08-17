package t7;

import java.io.File;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class n extends m {
    public static h o(File file, i direction) {
        AbstractC2855l.g(file, "<this>");
        AbstractC2855l.g(direction, "direction");
        return new h(file, direction);
    }

    public static final h p(File file) {
        AbstractC2855l.g(file, "<this>");
        return o(file, i.f32510h);
    }

    public static final h q(File file) {
        AbstractC2855l.g(file, "<this>");
        return o(file, i.f32509g);
    }
}
