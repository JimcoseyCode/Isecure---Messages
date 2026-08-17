package x1;

import java.io.File;
import z1.InterfaceC3666a;

/* JADX INFO: renamed from: x1.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class C3521e implements InterfaceC3666a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v1.d f33289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f33290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v1.h f33291c;

    C3521e(v1.d dVar, Object obj, v1.h hVar) {
        this.f33289a = dVar;
        this.f33290b = obj;
        this.f33291c = hVar;
    }

    @Override // z1.InterfaceC3666a.b
    public boolean a(File file) {
        return this.f33289a.b(this.f33290b, file, this.f33291c);
    }
}
