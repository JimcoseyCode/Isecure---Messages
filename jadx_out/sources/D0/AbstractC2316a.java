package d0;

import android.media.AudioFormat;
import android.media.AudioRecord;

/* JADX INFO: renamed from: d0.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2316a {
    public static AudioRecord a(AudioRecord.Builder builder) {
        return builder.build();
    }

    public static AudioRecord.Builder b() {
        return new AudioRecord.Builder();
    }

    public static void c(AudioRecord.Builder builder, AudioFormat audioFormat) {
        builder.setAudioFormat(audioFormat);
    }

    public static void d(AudioRecord.Builder builder, int i10) {
        builder.setAudioSource(i10);
    }

    public static void e(AudioRecord.Builder builder, int i10) {
        builder.setBufferSizeInBytes(i10);
    }
}
