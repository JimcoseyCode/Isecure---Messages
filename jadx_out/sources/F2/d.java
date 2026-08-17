package F2;

import F2.a;
import d2.AbstractC2325a;
import g2.AbstractC2662a;
import kotlin.jvm.internal.AbstractC2855l;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f1814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class f1815b = d.class;

    public d(int i10) {
        this.f1814a = i10;
    }

    @Override // F2.a
    public void a(int i10, int i11, InterfaceC3487a interfaceC3487a) {
        a.C0040a.d(this, i10, i11, interfaceC3487a);
    }

    @Override // F2.a
    public AbstractC2662a b(int i10, int i11, int i12) {
        return a.C0040a.b(this, i10, i11, i12);
    }

    @Override // F2.a
    public void c() {
        a.C0040a.a(this);
    }

    @Override // F2.a
    public void d(b bitmapFramePreparer, D2.b bitmapFrameCache, C2.a animationBackend, int i10, InterfaceC3487a interfaceC3487a) {
        AbstractC2855l.g(bitmapFramePreparer, "bitmapFramePreparer");
        AbstractC2855l.g(bitmapFrameCache, "bitmapFrameCache");
        AbstractC2855l.g(animationBackend, "animationBackend");
        int i11 = this.f1814a;
        int i12 = 1;
        if (1 <= i11) {
            while (true) {
                int iA = (i10 + i12) % animationBackend.a();
                if (AbstractC2325a.w(2)) {
                    AbstractC2325a.z(this.f1815b, "Preparing frame %d, last drawn: %d", Integer.valueOf(iA), Integer.valueOf(i10));
                }
                if (!bitmapFramePreparer.a(bitmapFrameCache, animationBackend, iA)) {
                    return;
                }
                if (i12 == i11) {
                    break;
                } else {
                    i12++;
                }
            }
        }
        if (interfaceC3487a != null) {
            interfaceC3487a.invoke();
        }
    }

    @Override // F2.a
    public void onStop() {
        a.C0040a.c(this);
    }
}
