package M3;

import com.github.penfeizhou.animation.gif.io.GifReader;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class a extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7455a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f7456b;

    @Override // M3.b
    public void a(GifReader gifReader) throws IOException {
        byte bPeek = gifReader.peek();
        StringBuilder sb = new StringBuilder();
        for (int i10 = 0; i10 < bPeek; i10++) {
            sb.append((char) gifReader.peek());
        }
        String string = sb.toString();
        this.f7456b = string;
        if (!"NETSCAPE2.0".equals(string)) {
            while (!e.c(gifReader).b()) {
            }
            return;
        }
        if ((gifReader.peek() & 255) == 3 && (gifReader.peek() & 255) == 1) {
            this.f7455a = gifReader.readUInt16();
        }
        while (!e.c(gifReader).b()) {
        }
    }
}
