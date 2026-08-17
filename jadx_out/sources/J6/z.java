package J6;

import android.view.MotionEvent;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class z {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f6795f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double f6796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f6797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f6798c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final double f6799d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final double f6800e;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Pair b(double d10, double d11) {
            double dAtan;
            double dAtan2;
            if (d10 < 1.0E-9d) {
                dAtan = 1.5707963267948966d;
                double d12 = (d11 < 1.0E-9d || Math.abs(d11 - 6.283185307179586d) < 1.0E-9d) ? 1.5707963267948966d : 0.0d;
                double d13 = d11 - 1.5707963267948966d;
                double d14 = Math.abs(d13) < 1.0E-9d ? 1.5707963267948966d : 0.0d;
                double d15 = d11 - 3.141592653589793d;
                dAtan2 = -1.5707963267948966d;
                if (Math.abs(d15) < 1.0E-9d) {
                    d12 = -1.5707963267948966d;
                }
                double d16 = d11 - 4.71238898038469d;
                if (Math.abs(d16) < 1.0E-9d) {
                    d14 = -1.5707963267948966d;
                }
                if (d11 > 1.0E-9d && Math.abs(d13) < 1.0E-9d) {
                    d14 = 1.5707963267948966d;
                    d12 = 1.5707963267948966d;
                }
                if (Math.abs(d13) > 1.0E-9d && Math.abs(d15) < 1.0E-9d) {
                    d14 = 1.5707963267948966d;
                    d12 = -1.5707963267948966d;
                }
                if (Math.abs(d15) > 1.0E-9d && Math.abs(d16) < 1.0E-9d) {
                    d14 = -1.5707963267948966d;
                    d12 = -1.5707963267948966d;
                }
                if (Math.abs(d16) <= 1.0E-9d || Math.abs(d11 - 6.283185307179586d) >= 1.0E-9d) {
                    dAtan2 = d14;
                    dAtan = d12;
                }
            } else {
                double dTan = Math.tan(d10);
                dAtan = Math.atan(Math.cos(d11) / dTan);
                dAtan2 = Math.atan(Math.sin(d11) / dTan);
            }
            return new Pair(Double.valueOf(Math.rint(dAtan * 57.29577951308232d)), Double.valueOf(Math.rint(dAtan2 * 57.29577951308232d)));
        }

        public final z a(MotionEvent event) {
            AbstractC2855l.g(event, "event");
            double axisValue = 1.5707963267948966d - ((double) event.getAxisValue(25));
            double pressure = event.getPressure(0);
            double orientation = (((double) event.getOrientation(0)) + 1.5707963267948966d) % 6.283185307179586d;
            if (orientation != 0.0d && Math.signum(orientation) != Math.signum(6.283185307179586d)) {
                orientation += 6.283185307179586d;
            }
            double d10 = orientation;
            Pair pairB = b(axisValue, d10);
            return new z(((Number) pairB.c()).doubleValue(), ((Number) pairB.d()).doubleValue(), axisValue, d10, pressure);
        }

        private a() {
        }
    }

    public z(double d10, double d11, double d12, double d13, double d14) {
        this.f6796a = d10;
        this.f6797b = d11;
        this.f6798c = d12;
        this.f6799d = d13;
        this.f6800e = d14;
    }

    public final double a() {
        return this.f6800e;
    }

    public final ReadableMap b() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("tiltX", this.f6796a);
        writableMapCreateMap.putDouble("tiltY", this.f6797b);
        writableMapCreateMap.putDouble("altitudeAngle", this.f6798c);
        writableMapCreateMap.putDouble("azimuthAngle", this.f6799d);
        writableMapCreateMap.putDouble("pressure", this.f6800e);
        return writableMapCreateMap;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return Double.compare(this.f6796a, zVar.f6796a) == 0 && Double.compare(this.f6797b, zVar.f6797b) == 0 && Double.compare(this.f6798c, zVar.f6798c) == 0 && Double.compare(this.f6799d, zVar.f6799d) == 0 && Double.compare(this.f6800e, zVar.f6800e) == 0;
    }

    public int hashCode() {
        return (((((((Double.hashCode(this.f6796a) * 31) + Double.hashCode(this.f6797b)) * 31) + Double.hashCode(this.f6798c)) * 31) + Double.hashCode(this.f6799d)) * 31) + Double.hashCode(this.f6800e);
    }

    public String toString() {
        return "StylusData(tiltX=" + this.f6796a + ", tiltY=" + this.f6797b + ", altitudeAngle=" + this.f6798c + ", azimuthAngle=" + this.f6799d + ", pressure=" + this.f6800e + ")";
    }

    public /* synthetic */ z(double d10, double d11, double d12, double d13, double d14, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0.0d : d10, (i10 & 2) != 0 ? 0.0d : d11, (i10 & 4) != 0 ? 0.0d : d12, (i10 & 8) != 0 ? 0.0d : d13, (i10 & 16) != 0 ? -1.0d : d14);
    }
}
