package M3;

import com.github.penfeizhou.animation.gif.io.GifReader;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class j implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7475d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private byte f7476e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f7477f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f7478g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f7479h;

    @Override // M3.b
    public void a(GifReader gifReader) throws IOException {
        this.f7472a = gifReader.readUInt16();
        this.f7473b = gifReader.readUInt16();
        this.f7474c = gifReader.readUInt16();
        this.f7475d = gifReader.readUInt16();
        this.f7476e = gifReader.peek();
        if (c()) {
            c cVar = new c(d());
            this.f7477f = cVar;
            cVar.a(gifReader);
        }
        this.f7478g = gifReader.peek() & 255;
        this.f7479h = gifReader.position();
        while (true) {
            if (gifReader.peek() == 0) {
                return;
            } else {
                gifReader.skip(r0 & 255);
            }
        }
    }

    public boolean b() {
        return (this.f7476e & 64) == 64;
    }

    public boolean c() {
        return (this.f7476e & 128) == 128;
    }

    public int d() {
        return 2 << (this.f7476e & 15);
    }
}
