package com.th3rdwave.safeareacontext;

import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f25504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f25505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m f25506c;

    public n(a insets, o mode, m edges) {
        AbstractC2855l.g(insets, "insets");
        AbstractC2855l.g(mode, "mode");
        AbstractC2855l.g(edges, "edges");
        this.f25504a = insets;
        this.f25505b = mode;
        this.f25506c = edges;
    }

    public final m a() {
        return this.f25506c;
    }

    public final a b() {
        return this.f25504a;
    }

    public final o c() {
        return this.f25505b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return AbstractC2855l.b(this.f25504a, nVar.f25504a) && this.f25505b == nVar.f25505b && AbstractC2855l.b(this.f25506c, nVar.f25506c);
    }

    public int hashCode() {
        return (((this.f25504a.hashCode() * 31) + this.f25505b.hashCode()) * 31) + this.f25506c.hashCode();
    }

    public String toString() {
        return "SafeAreaViewLocalData(insets=" + this.f25504a + ", mode=" + this.f25505b + ", edges=" + this.f25506c + ")";
    }
}
