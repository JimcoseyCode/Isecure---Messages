package com.bumptech.glide;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l implements Cloneable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private O1.c f19140g = O1.a.a();

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final l clone() {
        try {
            return (l) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    final O1.c b() {
        return this.f19140g;
    }

    public boolean equals(Object obj) {
        if (obj instanceof l) {
            return Q1.l.e(this.f19140g, ((l) obj).f19140g);
        }
        return false;
    }

    public int hashCode() {
        O1.c cVar = this.f19140g;
        if (cVar != null) {
            return cVar.hashCode();
        }
        return 0;
    }
}
