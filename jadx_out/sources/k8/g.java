package k8;

import P8.o;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f29217a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final o f29218b = new o("[^\\p{L}\\p{Digit}]");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f29219c = "$context_receiver";

    private g() {
    }

    public static final f a(int i10) {
        f fVarQ = f.q(f29219c + '_' + i10);
        AbstractC2855l.f(fVarQ, "identifier(...)");
        return fVarQ;
    }

    public static final String b(String name) {
        AbstractC2855l.g(name, "name");
        return f29218b.e(name, "_");
    }
}
