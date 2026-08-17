package d8;

import L7.h0;
import L7.i0;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: d8.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2377y implements h0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Y7.D f25793b;

    public C2377y(Y7.D packageFragment) {
        AbstractC2855l.g(packageFragment, "packageFragment");
        this.f25793b = packageFragment;
    }

    @Override // L7.h0
    public i0 a() {
        i0 NO_SOURCE_FILE = i0.f7336a;
        AbstractC2855l.f(NO_SOURCE_FILE, "NO_SOURCE_FILE");
        return NO_SOURCE_FILE;
    }

    public String toString() {
        return this.f25793b + ": " + this.f25793b.L0().keySet();
    }
}
