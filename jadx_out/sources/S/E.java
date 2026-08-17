package s;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class E {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f31992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f31993c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f31991a = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private X f31994d = null;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface a {
        CameraCharacteristics a();

        Object b(CameraCharacteristics.Key key);
    }

    private E(CameraCharacteristics cameraCharacteristics, String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f31992b = new C3311z(cameraCharacteristics);
        } else {
            this.f31992b = new C3283A(cameraCharacteristics);
        }
        this.f31993c = str;
    }

    private boolean f() {
        Boolean bool = (Boolean) a(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        return bool != null && bool.booleanValue();
    }

    private boolean g(CameraCharacteristics.Key key) {
        return key.equals(CameraCharacteristics.SENSOR_ORIENTATION);
    }

    public static E k(CameraCharacteristics cameraCharacteristics, String str) {
        return new E(cameraCharacteristics, str);
    }

    public Object a(CameraCharacteristics.Key key) {
        if (g(key)) {
            return this.f31992b.b(key);
        }
        synchronized (this) {
            try {
                Object obj = this.f31991a.get(key);
                if (obj != null) {
                    return obj;
                }
                Object objB = this.f31992b.b(key);
                if (objB != null) {
                    this.f31991a.put(key, objB);
                }
                return objB;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String b() {
        return this.f31993c;
    }

    public int c() {
        Integer num = (!f() || Build.VERSION.SDK_INT < 35) ? null : (Integer) a(CameraCharacteristics.FLASH_TORCH_STRENGTH_DEFAULT_LEVEL);
        if (num == null) {
            return 1;
        }
        return num.intValue();
    }

    public int d() {
        Integer num = (!f() || Build.VERSION.SDK_INT < 35) ? null : (Integer) a(CameraCharacteristics.FLASH_TORCH_STRENGTH_MAX_LEVEL);
        if (num == null) {
            return 1;
        }
        return num.intValue();
    }

    public X e() {
        if (this.f31994d == null) {
            try {
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                if (streamConfigurationMap == null) {
                    throw new IllegalArgumentException("StreamConfigurationMap is null!");
                }
                this.f31994d = X.i(streamConfigurationMap, new v.n(this.f31993c));
            } catch (AssertionError | NullPointerException e10) {
                throw new IllegalArgumentException(e10.getMessage());
            }
        }
        return this.f31994d;
    }

    public boolean h() {
        return f() && Build.VERSION.SDK_INT >= 35 && d() > 1;
    }

    public boolean i() {
        int[] iArr;
        if (Build.VERSION.SDK_INT >= 34 && (iArr = (int[]) this.f31992b.b(CameraCharacteristics.CONTROL_AVAILABLE_SETTINGS_OVERRIDES)) != null) {
            for (int i10 : iArr) {
                if (i10 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public CameraCharacteristics j() {
        return this.f31992b.a();
    }
}
