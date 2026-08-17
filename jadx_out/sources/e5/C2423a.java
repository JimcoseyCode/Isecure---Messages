package e5;

import android.graphics.Typeface;

/* JADX INFO: renamed from: e5.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2423a extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Typeface f25904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC0257a f25905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f25906c;

    /* JADX INFO: renamed from: e5.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface InterfaceC0257a {
        void a(Typeface typeface);
    }

    public C2423a(InterfaceC0257a interfaceC0257a, Typeface typeface) {
        this.f25904a = typeface;
        this.f25905b = interfaceC0257a;
    }

    private void d(Typeface typeface) {
        if (this.f25906c) {
            return;
        }
        this.f25905b.a(typeface);
    }

    @Override // e5.g
    public void a(int i10) {
        d(this.f25904a);
    }

    @Override // e5.g
    public void b(Typeface typeface, boolean z10) {
        d(typeface);
    }

    public void c() {
        this.f25906c = true;
    }
}
