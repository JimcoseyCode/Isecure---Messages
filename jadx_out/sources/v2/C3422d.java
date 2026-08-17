package v2;

/* JADX INFO: renamed from: v2.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C3422d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f32929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f32930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f32931c;

    public C3422d() {
        a();
    }

    public void a() {
        this.f32929a = false;
        this.f32930b = 4;
        c();
    }

    public void b() {
        this.f32931c++;
    }

    public void c() {
        this.f32931c = 0;
    }

    public void d(boolean z10) {
        this.f32929a = z10;
    }

    public boolean e() {
        return this.f32929a && this.f32931c < this.f32930b;
    }
}
