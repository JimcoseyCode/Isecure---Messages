package M3;

import com.github.penfeizhou.animation.gif.io.GifReader;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class e implements b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f7459c = new e(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f7460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f7461b;

    public e(int i10) {
        this.f7460a = i10;
    }

    public static e c(GifReader gifReader) throws IOException {
        int iPeek = gifReader.peek() & 255;
        if (iPeek == 0) {
            return f7459c;
        }
        e eVar = new e(iPeek);
        eVar.f7461b = gifReader.position();
        eVar.a(gifReader);
        return eVar;
    }

    @Override // M3.b
    public void a(GifReader gifReader) throws IOException {
        gifReader.skip(this.f7460a);
    }

    public boolean b() {
        return this == f7459c;
    }
}
