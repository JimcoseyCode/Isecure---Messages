package H1;

import com.bumptech.glide.load.resource.bitmap.C1937g;
import s1.InterfaceC3316a;
import x1.v;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements v1.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y1.d f3683a;

    public h(y1.d dVar) {
        this.f3683a = dVar;
    }

    @Override // v1.j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public v decode(InterfaceC3316a interfaceC3316a, int i10, int i11, v1.h hVar) {
        return C1937g.d(interfaceC3316a.c(), this.f3683a);
    }

    @Override // v1.j
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean handles(InterfaceC3316a interfaceC3316a, v1.h hVar) {
        return true;
    }
}
