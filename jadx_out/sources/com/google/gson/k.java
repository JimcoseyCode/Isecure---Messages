package com.google.gson;

import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class k extends f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f24372g;

    public k(Boolean bool) {
        this.f24372g = N5.a.b(bool);
    }

    private static boolean y(k kVar) {
        Object obj = kVar.f24372g;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    public boolean A() {
        return this.f24372g instanceof String;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f24372g == null) {
            return kVar.f24372g == null;
        }
        if (y(this) && y(kVar)) {
            return v().longValue() == kVar.v().longValue();
        }
        Object obj2 = this.f24372g;
        if (!(obj2 instanceof Number) || !(kVar.f24372g instanceof Number)) {
            return obj2.equals(kVar.f24372g);
        }
        double dDoubleValue = v().doubleValue();
        double dDoubleValue2 = kVar.v().doubleValue();
        return dDoubleValue == dDoubleValue2 || (Double.isNaN(dDoubleValue) && Double.isNaN(dDoubleValue2));
    }

    public int hashCode() {
        long jDoubleToLongBits;
        if (this.f24372g == null) {
            return 31;
        }
        if (y(this)) {
            jDoubleToLongBits = v().longValue();
        } else {
            Object obj = this.f24372g;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(v().doubleValue());
        }
        return (int) ((jDoubleToLongBits >>> 32) ^ jDoubleToLongBits);
    }

    public boolean u() {
        return x() ? ((Boolean) this.f24372g).booleanValue() : Boolean.parseBoolean(w());
    }

    public Number v() {
        Object obj = this.f24372g;
        return obj instanceof String ? new N5.g((String) obj) : (Number) obj;
    }

    public String w() {
        return z() ? v().toString() : x() ? ((Boolean) this.f24372g).toString() : (String) this.f24372g;
    }

    public boolean x() {
        return this.f24372g instanceof Boolean;
    }

    public boolean z() {
        return this.f24372g instanceof Number;
    }

    public k(Number number) {
        this.f24372g = N5.a.b(number);
    }

    public k(String str) {
        this.f24372g = N5.a.b(str);
    }
}
