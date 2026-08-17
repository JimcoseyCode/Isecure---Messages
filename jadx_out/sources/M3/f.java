package M3;

import M3.h;
import com.github.penfeizhou.animation.gif.io.GifReader;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f implements b {
    public static f b(GifReader gifReader) throws IOException {
        byte bPeek = gifReader.peek();
        if (bPeek == -7) {
            return new i();
        }
        if (bPeek == 1) {
            return new l();
        }
        if (bPeek == -2) {
            return new d();
        }
        if (bPeek == -1) {
            return new a();
        }
        throw new h.a();
    }
}
