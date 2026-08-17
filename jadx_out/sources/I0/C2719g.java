package i0;

import android.util.Range;
import android.util.Size;
import androidx.camera.video.internal.compat.quirk.MediaCodecInfoReportIncorrectInfoQuirk;
import g0.s0;
import java.util.HashSet;
import java.util.Set;
import y.AbstractC3583h0;

/* JADX INFO: renamed from: i0.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C2719g implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s0 f28666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Range f28667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Range f28668c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set f28669d;

    private C2719g(s0 s0Var) {
        HashSet hashSet = new HashSet();
        this.f28669d = hashSet;
        this.f28666a = s0Var;
        int iB = s0Var.b();
        this.f28667b = Range.create(Integer.valueOf(iB), Integer.valueOf(((int) Math.ceil(4096.0d / ((double) iB))) * iB));
        int iG = s0Var.g();
        this.f28668c = Range.create(Integer.valueOf(iG), Integer.valueOf(((int) Math.ceil(2160.0d / ((double) iG))) * iG));
        hashSet.addAll(MediaCodecInfoReportIncorrectInfoQuirk.g());
    }

    private void k(Size size) {
        this.f28669d.add(size);
    }

    public static s0 l(s0 s0Var, Size size) {
        if (!(s0Var instanceof C2719g)) {
            if (androidx.camera.video.internal.compat.quirk.a.b(MediaCodecInfoReportIncorrectInfoQuirk.class) != null) {
                s0Var = new C2719g(s0Var);
            } else if (size != null && !s0Var.a(size.getWidth(), size.getHeight())) {
                AbstractC3583h0.l("VideoEncoderInfoWrapper", String.format("Detected that the device does not support a size %s that should be valid in widths/heights = %s/%s", size, s0Var.h(), s0Var.j()));
                s0Var = new C2719g(s0Var);
            }
        }
        if (size != null && (s0Var instanceof C2719g)) {
            ((C2719g) s0Var).k(size);
        }
        return s0Var;
    }

    @Override // g0.s0
    public int b() {
        return this.f28666a.b();
    }

    @Override // g0.s0
    public Range c() {
        return this.f28666a.c();
    }

    @Override // g0.s0
    public boolean d() {
        return this.f28666a.d();
    }

    @Override // g0.s0
    public Range e(int i10) {
        H0.g.b(this.f28668c.contains(Integer.valueOf(i10)) && i10 % this.f28666a.g() == 0, "Not supported height: " + i10 + " which is not in " + this.f28668c + " or can not be divided by alignment " + this.f28666a.g());
        return this.f28667b;
    }

    @Override // g0.s0
    public Range f(int i10) {
        H0.g.b(this.f28667b.contains(Integer.valueOf(i10)) && i10 % this.f28666a.b() == 0, "Not supported width: " + i10 + " which is not in " + this.f28667b + " or can not be divided by alignment " + this.f28666a.b());
        return this.f28668c;
    }

    @Override // g0.s0
    public int g() {
        return this.f28666a.g();
    }

    @Override // g0.s0
    public Range h() {
        return this.f28667b;
    }

    @Override // g0.s0
    public boolean i(int i10, int i11) {
        if (this.f28666a.i(i10, i11)) {
            return true;
        }
        for (Size size : this.f28669d) {
            if (size.getWidth() == i10 && size.getHeight() == i11) {
                return true;
            }
        }
        return this.f28667b.contains(Integer.valueOf(i10)) && this.f28668c.contains(Integer.valueOf(i11)) && i10 % this.f28666a.b() == 0 && i11 % this.f28666a.g() == 0;
    }

    @Override // g0.s0
    public Range j() {
        return this.f28668c;
    }
}
