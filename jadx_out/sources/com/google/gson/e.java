package com.google.gson;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends f implements Iterable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f24369g = new ArrayList();

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof e) && ((e) obj).f24369g.equals(this.f24369g);
        }
        return true;
    }

    public int hashCode() {
        return this.f24369g.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.f24369g.iterator();
    }

    public void u(f fVar) {
        if (fVar == null) {
            fVar = h.f24370g;
        }
        this.f24369g.add(fVar);
    }

    public f v(int i10) {
        return (f) this.f24369g.get(i10);
    }
}
