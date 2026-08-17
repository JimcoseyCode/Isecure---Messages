package g0;

import F.v1;
import android.media.MediaFormat;
import android.util.Size;
import g0.C2638d;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q0 implements InterfaceC2648n {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static abstract class a {
        a() {
        }

        public abstract q0 a();

        public abstract a b(int i10);

        public abstract a c(int i10);

        public abstract a d(int i10);

        public abstract a e(r0 r0Var);

        public abstract a f(int i10);

        public abstract a g(int i10);

        public abstract a h(v1 v1Var);

        public abstract a i(String str);

        public abstract a j(int i10);

        public abstract a k(Size size);
    }

    q0() {
    }

    public static a c() {
        return new C2638d.b().j(-1).g(1).d(2130708361).e(r0.f28081a);
    }

    @Override // g0.InterfaceC2648n
    public MediaFormat a() {
        Size sizeK = k();
        MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(getMimeType(), sizeK.getWidth(), sizeK.getHeight());
        mediaFormatCreateVideoFormat.setInteger("color-format", f());
        mediaFormatCreateVideoFormat.setInteger("bitrate", d());
        mediaFormatCreateVideoFormat.setInteger("frame-rate", h());
        if (h() != e()) {
            mediaFormatCreateVideoFormat.setInteger("operating-rate", e());
            mediaFormatCreateVideoFormat.setInteger("priority", 0);
        }
        mediaFormatCreateVideoFormat.setInteger("i-frame-interval", i());
        if (j() != -1) {
            mediaFormatCreateVideoFormat.setInteger("profile", j());
        }
        r0 r0VarG = g();
        if (r0VarG.c() != 0) {
            mediaFormatCreateVideoFormat.setInteger("color-standard", r0VarG.c());
        }
        if (r0VarG.d() != 0) {
            mediaFormatCreateVideoFormat.setInteger("color-transfer", r0VarG.d());
        }
        if (r0VarG.b() != 0) {
            mediaFormatCreateVideoFormat.setInteger("color-range", r0VarG.b());
        }
        return mediaFormatCreateVideoFormat;
    }

    @Override // g0.InterfaceC2648n
    public abstract v1 b();

    public abstract int d();

    public abstract int e();

    public abstract int f();

    public abstract r0 g();

    @Override // g0.InterfaceC2648n
    public abstract String getMimeType();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract Size k();

    public abstract a l();
}
