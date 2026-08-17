package com.facebook.yoga;

import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class YogaValue {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f20746c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final YogaValue f20747d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final YogaValue f20748e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final YogaValue f20749f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f20750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f20751b;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final YogaValue a(String str) {
            if (str == null) {
                return null;
            }
            if (AbstractC2855l.b("undefined", str)) {
                return YogaValue.f20747d;
            }
            if (AbstractC2855l.b("auto", str)) {
                return YogaValue.f20749f;
            }
            if (!P8.q.w(str, "%", false, 2, null)) {
                return new YogaValue(Float.parseFloat(str), w.POINT);
            }
            String strSubstring = str.substring(0, str.length() - 1);
            AbstractC2855l.f(strSubstring, "substring(...)");
            return new YogaValue(Float.parseFloat(strSubstring), w.PERCENT);
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20752a;

        static {
            int[] iArr = new int[w.values().length];
            try {
                iArr[w.UNDEFINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[w.POINT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[w.PERCENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[w.AUTO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f20752a = iArr;
        }
    }

    static {
        float f10 = g.f20769b;
        f20747d = new YogaValue(f10, w.UNDEFINED);
        f20748e = new YogaValue(0.0f, w.POINT);
        f20749f = new YogaValue(f10, w.AUTO);
    }

    public YogaValue(float f10, w unit) {
        AbstractC2855l.g(unit, "unit");
        this.f20750a = f10;
        this.f20751b = unit;
    }

    public boolean equals(Object obj) {
        if (obj instanceof YogaValue) {
            w wVar = this.f20751b;
            YogaValue yogaValue = (YogaValue) obj;
            if (wVar == yogaValue.f20751b) {
                return wVar == w.UNDEFINED || wVar == w.AUTO || Float.compare(this.f20750a, yogaValue.f20750a) == 0;
            }
        }
        return false;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f20750a) + this.f20751b.k();
    }

    public String toString() {
        int i10 = b.f20752a[this.f20751b.ordinal()];
        if (i10 == 1) {
            return "undefined";
        }
        if (i10 == 2) {
            return String.valueOf(this.f20750a);
        }
        if (i10 != 3) {
            if (i10 == 4) {
                return "auto";
            }
            throw new IllegalStateException();
        }
        return this.f20750a + "%";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public YogaValue(float f10, int i10) {
        w wVarJ = w.j(i10);
        AbstractC2855l.f(wVarJ, "fromInt(...)");
        this(f10, wVarJ);
    }
}
