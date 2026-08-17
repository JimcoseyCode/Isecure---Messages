package N5;

import java.io.ObjectStreamException;
import java.math.BigDecimal;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends Number {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f8119g;

    public g(String str) {
        this.f8119g = str;
    }

    private Object writeReplace() throws ObjectStreamException {
        return new BigDecimal(this.f8119g);
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return Double.parseDouble(this.f8119g);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        String str = this.f8119g;
        String str2 = ((g) obj).f8119g;
        return str == str2 || str.equals(str2);
    }

    @Override // java.lang.Number
    public float floatValue() {
        return Float.parseFloat(this.f8119g);
    }

    public int hashCode() {
        return this.f8119g.hashCode();
    }

    @Override // java.lang.Number
    public int intValue() {
        try {
            try {
                return Integer.parseInt(this.f8119g);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(this.f8119g);
            }
        } catch (NumberFormatException unused2) {
            return new BigDecimal(this.f8119g).intValue();
        }
    }

    @Override // java.lang.Number
    public long longValue() {
        try {
            return Long.parseLong(this.f8119g);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f8119g).longValue();
        }
    }

    public String toString() {
        return this.f8119g;
    }
}
