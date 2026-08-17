package com.th3rdwave.safeareacontext;

import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f25500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l f25501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l f25502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final l f25503d;

    public m(l top, l right, l bottom, l left) {
        AbstractC2855l.g(top, "top");
        AbstractC2855l.g(right, "right");
        AbstractC2855l.g(bottom, "bottom");
        AbstractC2855l.g(left, "left");
        this.f25500a = top;
        this.f25501b = right;
        this.f25502c = bottom;
        this.f25503d = left;
    }

    public final l a() {
        return this.f25502c;
    }

    public final l b() {
        return this.f25503d;
    }

    public final l c() {
        return this.f25501b;
    }

    public final l d() {
        return this.f25500a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f25500a == mVar.f25500a && this.f25501b == mVar.f25501b && this.f25502c == mVar.f25502c && this.f25503d == mVar.f25503d;
    }

    public int hashCode() {
        return (((((this.f25500a.hashCode() * 31) + this.f25501b.hashCode()) * 31) + this.f25502c.hashCode()) * 31) + this.f25503d.hashCode();
    }

    public String toString() {
        return "SafeAreaViewEdges(top=" + this.f25500a + ", right=" + this.f25501b + ", bottom=" + this.f25502c + ", left=" + this.f25503d + ")";
    }
}
