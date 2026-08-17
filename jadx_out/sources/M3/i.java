package M3;

import M3.h;
import com.github.penfeizhou.animation.gif.io.GifReader;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class i extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f7468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte f7469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7470c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7471d;

    @Override // M3.b
    public void a(GifReader gifReader) throws h.a {
        this.f7468a = gifReader.peek() & 255;
        this.f7469b = gifReader.peek();
        this.f7470c = gifReader.readUInt16();
        this.f7471d = gifReader.peek() & 255;
        if (gifReader.peek() != 0) {
            throw new h.a();
        }
    }

    public int c() {
        return (this.f7469b >> 2) & 7;
    }

    public boolean d() {
        return (this.f7469b & 1) == 1;
    }
}
