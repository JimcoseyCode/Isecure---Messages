package g0;

import android.media.MediaCodecInfo;
import java.util.Objects;

/* JADX INFO: renamed from: g0.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C2636b extends h0 implements g0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MediaCodecInfo.AudioCapabilities f28003c;

    C2636b(MediaCodecInfo mediaCodecInfo, String str) {
        super(mediaCodecInfo, str);
        MediaCodecInfo.AudioCapabilities audioCapabilities = this.f28057b.getAudioCapabilities();
        Objects.requireNonNull(audioCapabilities);
        this.f28003c = audioCapabilities;
    }
}
