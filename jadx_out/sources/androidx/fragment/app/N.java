package androidx.fragment.app;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.io.Writer;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class N extends Writer {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f17407g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private StringBuilder f17408h = new StringBuilder(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);

    N(String str) {
        this.f17407g = str;
    }

    private void d() {
        if (this.f17408h.length() > 0) {
            this.f17408h.toString();
            StringBuilder sb = this.f17408h;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        d();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        d();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            char c10 = cArr[i10 + i12];
            if (c10 == '\n') {
                d();
            } else {
                this.f17408h.append(c10);
            }
        }
    }
}
