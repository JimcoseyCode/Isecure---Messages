package o;

import java.util.Arrays;

/* JADX INFO: renamed from: o.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class C2995c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f30223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CharSequence f30224b;

    C2995c(int i10, CharSequence charSequence) {
        this.f30223a = i10;
        this.f30224b = charSequence;
    }

    private static String a(CharSequence charSequence) {
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    private boolean d(CharSequence charSequence) {
        String strA = a(this.f30224b);
        String strA2 = a(charSequence);
        if (strA == null && strA2 == null) {
            return true;
        }
        return strA != null && strA.equals(strA2);
    }

    int b() {
        return this.f30223a;
    }

    CharSequence c() {
        return this.f30224b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C2995c) {
            C2995c c2995c = (C2995c) obj;
            if (this.f30223a == c2995c.f30223a && d(c2995c.f30224b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f30223a), a(this.f30224b)});
    }
}
