package g0;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: g0.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2643i extends AutoCloseable {
    MediaCodec.BufferInfo O();

    boolean T();

    ByteBuffer a();

    @Override // java.lang.AutoCloseable
    void close();

    long o0();

    long size();
}
