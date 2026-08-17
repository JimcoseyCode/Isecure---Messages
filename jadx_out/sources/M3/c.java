package M3;

import com.github.penfeizhou.animation.gif.io.GifReader;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f7457a;

    public c(int i10) {
        this.f7457a = new int[i10];
    }

    @Override // M3.b
    public void a(GifReader gifReader) throws IOException {
        for (int i10 = 0; i10 < this.f7457a.length; i10++) {
            byte bPeek = gifReader.peek();
            byte bPeek2 = gifReader.peek();
            int i11 = (bPeek2 & 255) << 8;
            int i12 = bPeek & 255;
            this.f7457a[i10] = i12 | i11 | ((gifReader.peek() & 255) << 16) | (-16777216);
        }
    }

    public int[] b() {
        return this.f7457a;
    }
}
