package P8;

import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class y extends x {
    public static StringBuilder m(StringBuilder sb, String... value) {
        AbstractC2855l.g(sb, "<this>");
        AbstractC2855l.g(value, "value");
        for (String str : value) {
            sb.append(str);
        }
        return sb;
    }
}
