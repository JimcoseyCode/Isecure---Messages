package g0;

import android.media.MediaCodecInfo;
import android.util.Range;
import g0.s0;
import h0.AbstractC2687a;
import i0.C2719g;
import java.util.Objects;
import y.AbstractC3583h0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class u0 extends h0 implements s0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final s0.a f28089d = new s0.a() { // from class: g0.t0
        @Override // g0.s0.a
        public final s0 a(String str) {
            return u0.k(str);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MediaCodecInfo.VideoCapabilities f28090c;

    u0(MediaCodecInfo mediaCodecInfo, String str) {
        super(mediaCodecInfo, str);
        MediaCodecInfo.VideoCapabilities videoCapabilities = this.f28057b.getVideoCapabilities();
        Objects.requireNonNull(videoCapabilities);
        this.f28090c = videoCapabilities;
    }

    public static /* synthetic */ s0 k(String str) {
        try {
            return C2719g.l(new u0(AbstractC2687a.c(str), str), null);
        } catch (l0 e10) {
            AbstractC3583h0.m("VideoEncoderInfoImpl", "Unable to find a VideoEncoderInfoImpl", e10);
            return null;
        }
    }

    private static IllegalArgumentException l(Throwable th) {
        return th instanceof IllegalArgumentException ? (IllegalArgumentException) th : new IllegalArgumentException(th);
    }

    @Override // g0.s0
    public int b() {
        return this.f28090c.getWidthAlignment();
    }

    @Override // g0.s0
    public Range c() {
        return this.f28090c.getBitrateRange();
    }

    @Override // g0.s0
    public boolean d() {
        return true;
    }

    @Override // g0.s0
    public Range e(int i10) {
        try {
            return this.f28090c.getSupportedWidthsFor(i10);
        } catch (Throwable th) {
            throw l(th);
        }
    }

    @Override // g0.s0
    public Range f(int i10) {
        try {
            return this.f28090c.getSupportedHeightsFor(i10);
        } catch (Throwable th) {
            throw l(th);
        }
    }

    @Override // g0.s0
    public int g() {
        return this.f28090c.getHeightAlignment();
    }

    @Override // g0.s0
    public Range h() {
        return this.f28090c.getSupportedWidths();
    }

    @Override // g0.s0
    public boolean i(int i10, int i11) {
        return this.f28090c.isSizeSupported(i10, i11);
    }

    @Override // g0.s0
    public Range j() {
        return this.f28090c.getSupportedHeights();
    }
}
