package s8;

import L7.InterfaceC1277b;
import M8.b;

/* JADX INFO: renamed from: s8.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
class C3338c implements b.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f32328a;

    public C3338c(boolean z10) {
        this.f32328a = z10;
    }

    @Override // M8.b.c
    public Iterable a(Object obj) {
        return AbstractC3340e.j(this.f32328a, (InterfaceC1277b) obj);
    }
}
