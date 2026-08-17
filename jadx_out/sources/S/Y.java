package s;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class Y extends Z {
    Y(StreamConfigurationMap streamConfigurationMap) {
        super(streamConfigurationMap);
    }

    @Override // s.X.a
    public long e(int i10, Size size) {
        return this.f32030a.getOutputMinFrameDuration(i10, size);
    }

    @Override // s.X.a
    public Size[] f(int i10) {
        return this.f32030a.getOutputSizes(i10);
    }
}
