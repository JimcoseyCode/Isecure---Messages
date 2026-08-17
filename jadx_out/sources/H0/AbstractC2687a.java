package h0;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.util.LruCache;
import g0.InterfaceC2648n;
import g0.l0;
import java.io.IOException;

/* JADX INFO: renamed from: h0.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2687a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final LruCache f28250a = new LruCache(10);

    public static MediaCodec a(InterfaceC2648n interfaceC2648n) {
        return b(interfaceC2648n.getMimeType());
    }

    private static MediaCodec b(String str) throws l0 {
        try {
            return MediaCodec.createEncoderByType(str);
        } catch (IOException | IllegalArgumentException e10) {
            throw new l0(e10);
        }
    }

    public static MediaCodecInfo c(String str) throws Throwable {
        MediaCodecInfo mediaCodecInfo;
        MediaCodec mediaCodecB;
        LruCache lruCache = f28250a;
        synchronized (lruCache) {
            mediaCodecInfo = (MediaCodecInfo) lruCache.get(str);
        }
        if (mediaCodecInfo != null) {
            return mediaCodecInfo;
        }
        try {
            mediaCodecB = b(str);
            try {
                MediaCodecInfo codecInfo = mediaCodecB.getCodecInfo();
                synchronized (lruCache) {
                    lruCache.put(str, codecInfo);
                }
                mediaCodecB.release();
                return codecInfo;
            } catch (Throwable th) {
                th = th;
                if (mediaCodecB != null) {
                    mediaCodecB.release();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            mediaCodecB = null;
        }
    }
}
