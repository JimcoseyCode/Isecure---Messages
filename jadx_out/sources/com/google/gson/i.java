package com.google.gson;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class i extends f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final N5.h f24371g = new N5.h();

    public boolean A(String str) {
        return this.f24371g.containsKey(str);
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof i) && ((i) obj).f24371g.equals(this.f24371g);
        }
        return true;
    }

    public int hashCode() {
        return this.f24371g.hashCode();
    }

    public void u(String str, f fVar) {
        N5.h hVar = this.f24371g;
        if (fVar == null) {
            fVar = h.f24370g;
        }
        hVar.put(str, fVar);
    }

    public Set v() {
        return this.f24371g.entrySet();
    }

    public f w(String str) {
        return (f) this.f24371g.get(str);
    }

    public e x(String str) {
        return (e) this.f24371g.get(str);
    }

    public i y(String str) {
        return (i) this.f24371g.get(str);
    }

    public k z(String str) {
        return (k) this.f24371g.get(str);
    }
}
