package U5;

import T5.i;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f11352a = new d(100);

    private c() {
    }

    public static b b() {
        return new c();
    }

    private static boolean c(CharSequence charSequence, Pattern pattern, boolean z10) {
        Matcher matcher = pattern.matcher(charSequence);
        if (!matcher.lookingAt()) {
            return false;
        }
        if (matcher.matches()) {
            return true;
        }
        return z10;
    }

    @Override // U5.b
    public boolean a(CharSequence charSequence, i iVar, boolean z10) {
        String strA = iVar.a();
        if (strA.length() == 0) {
            return false;
        }
        return c(charSequence, this.f11352a.a(strA), z10);
    }
}
