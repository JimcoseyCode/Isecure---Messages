package g0;

import android.media.MediaCodecInfo;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h0 implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediaCodecInfo f28056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final MediaCodecInfo.CodecCapabilities f28057b;

    h0(MediaCodecInfo mediaCodecInfo, String str) throws l0 {
        this.f28056a = mediaCodecInfo;
        try {
            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
            Objects.requireNonNull(capabilitiesForType);
            this.f28057b = capabilitiesForType;
        } catch (RuntimeException e10) {
            throw new l0("Unable to get CodecCapabilities for mime: " + str, e10);
        }
    }
}
