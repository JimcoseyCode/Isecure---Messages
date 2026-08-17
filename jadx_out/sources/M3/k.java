package M3;

import com.github.penfeizhou.animation.gif.io.GifReader;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class k implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    byte f7482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte f7483d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    byte f7484e;

    @Override // M3.b
    public void a(GifReader gifReader) {
        this.f7480a = gifReader.readUInt16();
        this.f7481b = gifReader.readUInt16();
        this.f7482c = gifReader.peek();
        this.f7483d = gifReader.peek();
        this.f7484e = gifReader.peek();
    }

    public boolean b() {
        return (this.f7482c & 128) == 128;
    }

    public int c() {
        return 2 << (this.f7482c & 7);
    }
}
