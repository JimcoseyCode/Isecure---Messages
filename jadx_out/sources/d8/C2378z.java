package d8;

import A8.InterfaceC0398s;
import L7.i0;
import kotlin.jvm.internal.AbstractC2855l;
import y8.C3662y;

/* JADX INFO: renamed from: d8.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2378z implements InterfaceC0398s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC2376x f25794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C3662y f25795c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f25796d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final A8.r f25797e;

    public C2378z(InterfaceC2376x binaryClass, C3662y c3662y, boolean z10, A8.r abiStability) {
        AbstractC2855l.g(binaryClass, "binaryClass");
        AbstractC2855l.g(abiStability, "abiStability");
        this.f25794b = binaryClass;
        this.f25795c = c3662y;
        this.f25796d = z10;
        this.f25797e = abiStability;
    }

    @Override // L7.h0
    public i0 a() {
        i0 NO_SOURCE_FILE = i0.f7336a;
        AbstractC2855l.f(NO_SOURCE_FILE, "NO_SOURCE_FILE");
        return NO_SOURCE_FILE;
    }

    @Override // A8.InterfaceC0398s
    public String c() {
        return "Class '" + this.f25794b.c().a().b() + '\'';
    }

    public final InterfaceC2376x d() {
        return this.f25794b;
    }

    public String toString() {
        return C2378z.class.getSimpleName() + ": " + this.f25794b;
    }
}
