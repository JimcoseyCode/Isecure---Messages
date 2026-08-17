package X5;

import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class j implements l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f12495b = Pattern.compile("^[\\p{L}\\p{N}]+$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f12496a;

    public j(String str) {
        this.f12496a = str + "_";
    }

    @Override // X5.l
    public String a(Object obj) {
        String string = obj.toString();
        if (f12495b.matcher(string).matches()) {
            return this.f12496a + obj;
        }
        throw new IllegalArgumentException("Invalid key: " + string);
    }
}
