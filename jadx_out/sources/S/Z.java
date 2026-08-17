package s;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Range;
import android.util.Size;
import s.X;
import y.AbstractC3583h0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
abstract class Z implements X.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final StreamConfigurationMap f32030a;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class a {
        static Size[] a(StreamConfigurationMap streamConfigurationMap, int i10) {
            return streamConfigurationMap.getHighResolutionOutputSizes(i10);
        }
    }

    Z(StreamConfigurationMap streamConfigurationMap) {
        this.f32030a = streamConfigurationMap;
    }

    @Override // s.X.a
    public StreamConfigurationMap a() {
        return this.f32030a;
    }

    @Override // s.X.a
    public Range[] b(Size size) {
        return this.f32030a.getHighSpeedVideoFpsRangesFor(size);
    }

    @Override // s.X.a
    public Size[] c(int i10) {
        return a.a(this.f32030a, i10);
    }

    @Override // s.X.a
    public Size[] d(Range range) {
        return this.f32030a.getHighSpeedVideoSizesFor(range);
    }

    @Override // s.X.a
    public int[] g() {
        try {
            return this.f32030a.getOutputFormats();
        } catch (IllegalArgumentException | NullPointerException e10) {
            AbstractC3583h0.m("StreamConfigurationMapCompatBaseImpl", "Failed to get output formats from StreamConfigurationMap", e10);
            return null;
        }
    }

    @Override // s.X.a
    public Size[] h() {
        return this.f32030a.getHighSpeedVideoSizes();
    }
}
