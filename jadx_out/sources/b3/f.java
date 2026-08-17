package b3;

import c2.AbstractC1841b;
import c2.k;
import c2.p;
import f2.C2606g;
import f2.InterfaceC2600a;
import java.io.IOException;
import java.io.InputStream;
import k2.AbstractC2826d;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f18655g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final InterfaceC2600a f18656h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f18651c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f18650b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f18652d = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f18654f = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f18653e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f18649a = 0;

    public f(InterfaceC2600a interfaceC2600a) {
        this.f18656h = (InterfaceC2600a) k.g(interfaceC2600a);
    }

    private boolean a(InputStream inputStream) throws Throwable {
        int i10;
        int i11 = this.f18653e;
        while (this.f18649a != 6 && (i10 = inputStream.read()) != -1) {
            try {
                int i12 = this.f18651c;
                this.f18651c = i12 + 1;
                if (this.f18655g) {
                    this.f18649a = 6;
                    this.f18655g = false;
                    return false;
                }
                int i13 = this.f18649a;
                if (i13 != 0) {
                    if (i13 != 1) {
                        if (i13 != 2) {
                            if (i13 != 3) {
                                if (i13 == 4) {
                                    this.f18649a = 5;
                                } else if (i13 != 5) {
                                    k.i(false);
                                } else {
                                    int i14 = ((this.f18650b << 8) + i10) - 2;
                                    AbstractC2826d.a(inputStream, i14);
                                    this.f18651c += i14;
                                    this.f18649a = 2;
                                }
                            } else if (i10 == 255) {
                                this.f18649a = 3;
                            } else if (i10 == 0) {
                                this.f18649a = 2;
                            } else if (i10 == 217) {
                                this.f18655g = true;
                                f(i12 - 1);
                                this.f18649a = 2;
                            } else {
                                if (i10 == 218) {
                                    f(i12 - 1);
                                }
                                if (b(i10)) {
                                    this.f18649a = 4;
                                } else {
                                    this.f18649a = 2;
                                }
                            }
                        } else if (i10 == 255) {
                            this.f18649a = 3;
                        }
                    } else if (i10 == 216) {
                        this.f18649a = 2;
                    } else {
                        this.f18649a = 6;
                    }
                } else if (i10 == 255) {
                    this.f18649a = 1;
                } else {
                    this.f18649a = 6;
                }
                this.f18650b = i10;
            } catch (IOException e10) {
                p.a(e10);
            }
            return (this.f18649a == 6 || this.f18653e == i11) ? false : true;
        }
        if (this.f18649a == 6) {
            return false;
        }
    }

    private static boolean b(int i10) {
        if (i10 == 1) {
            return false;
        }
        return ((i10 >= 208 && i10 <= 215) || i10 == 217 || i10 == 216) ? false : true;
    }

    private void f(int i10) {
        int i11 = this.f18652d;
        if (i11 > 0) {
            this.f18654f = i10;
        }
        this.f18652d = i11 + 1;
        this.f18653e = i11;
    }

    public int c() {
        return this.f18654f;
    }

    public int d() {
        return this.f18653e;
    }

    public boolean e() {
        return this.f18655g;
    }

    public boolean g(d3.k kVar) {
        if (this.f18649a == 6 || kVar.X() <= this.f18651c) {
            return false;
        }
        C2606g c2606g = new C2606g(kVar.M(), (byte[]) this.f18656h.get(16384), this.f18656h);
        try {
            AbstractC2826d.a(c2606g, this.f18651c);
            return a(c2606g);
        } catch (IOException e10) {
            p.a(e10);
            return false;
        } finally {
            AbstractC1841b.b(c2606g);
        }
    }
}
