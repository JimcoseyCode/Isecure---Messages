package t9;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public interface j extends F, ReadableByteChannel {
    void B0(long j10);

    byte[] C();

    boolean D();

    long G0();

    int H0(v vVar);

    long L();

    String P(long j10);

    void Q(C3391h c3391h, long j10);

    String Y(Charset charset);

    C3391h c();

    k c0();

    boolean e0(long j10);

    InputStream inputStream();

    String j0();

    byte[] n0(long j10);

    j peek();

    String q0();

    long r0(D d10);

    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    long readLong();

    short readShort();

    void skip(long j10);

    k t(long j10);
}
