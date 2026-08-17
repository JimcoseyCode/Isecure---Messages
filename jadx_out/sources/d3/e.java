package d3;

import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public interface e extends Closeable, m, g2.d, M2.a {
    boolean F0();

    p Z();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    int getHeight();

    int getWidth();

    m i();

    boolean isClosed();

    int l();
}
