package E8;

import C8.S;
import C8.v0;
import L7.H;
import L7.InterfaceC1288m;
import L7.Z;
import j7.AbstractC2800q;
import j7.T;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f1253a = new l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final H f1254b = e.f1133g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f1255c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final S f1256d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final S f1257e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Z f1258f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Set f1259g;

    static {
        String str = String.format(b.f1121h.j(), Arrays.copyOf(new Object[]{"unknown class"}, 1));
        AbstractC2855l.f(str, "format(...)");
        k8.f fVarT = k8.f.t(str);
        AbstractC2855l.f(fVarT, "special(...)");
        f1255c = new a(fVarT);
        f1256d = d(k.f1167B, new String[0]);
        f1257e = d(k.f1248y0, new String[0]);
        f fVar = new f();
        f1258f = fVar;
        f1259g = T.d(fVar);
    }

    private l() {
    }

    public static final g a(h kind, boolean z10, String... formatParams) {
        AbstractC2855l.g(kind, "kind");
        AbstractC2855l.g(formatParams, "formatParams");
        return z10 ? new m(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length)) : new g(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public static final g b(h kind, String... formatParams) {
        AbstractC2855l.g(kind, "kind");
        AbstractC2855l.g(formatParams, "formatParams");
        return a(kind, false, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public static final i d(k kind, String... formatParams) {
        AbstractC2855l.g(kind, "kind");
        AbstractC2855l.g(formatParams, "formatParams");
        return f1253a.g(kind, AbstractC2800q.j(), (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public static final boolean m(InterfaceC1288m interfaceC1288m) {
        if (interfaceC1288m == null) {
            return false;
        }
        l lVar = f1253a;
        return lVar.n(interfaceC1288m) || lVar.n(interfaceC1288m.b()) || interfaceC1288m == f1254b;
    }

    private final boolean n(InterfaceC1288m interfaceC1288m) {
        return interfaceC1288m instanceof a;
    }

    public static final boolean o(S s10) {
        if (s10 == null) {
            return false;
        }
        v0 v0VarK0 = s10.K0();
        return (v0VarK0 instanceof j) && ((j) v0VarK0).a() == k.f1173E;
    }

    public final i c(k kind, v0 typeConstructor, String... formatParams) {
        AbstractC2855l.g(kind, "kind");
        AbstractC2855l.g(typeConstructor, "typeConstructor");
        AbstractC2855l.g(formatParams, "formatParams");
        return f(kind, AbstractC2800q.j(), typeConstructor, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public final j e(k kind, String... formatParams) {
        AbstractC2855l.g(kind, "kind");
        AbstractC2855l.g(formatParams, "formatParams");
        return new j(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public final i f(k kind, List arguments, v0 typeConstructor, String... formatParams) {
        AbstractC2855l.g(kind, "kind");
        AbstractC2855l.g(arguments, "arguments");
        AbstractC2855l.g(typeConstructor, "typeConstructor");
        AbstractC2855l.g(formatParams, "formatParams");
        return new i(typeConstructor, b(h.f1148n, typeConstructor.toString()), kind, arguments, false, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public final i g(k kind, List arguments, String... formatParams) {
        AbstractC2855l.g(kind, "kind");
        AbstractC2855l.g(arguments, "arguments");
        AbstractC2855l.g(formatParams, "formatParams");
        return f(kind, arguments, e(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length)), (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public final a h() {
        return f1255c;
    }

    public final H i() {
        return f1254b;
    }

    public final Set j() {
        return f1259g;
    }

    public final S k() {
        return f1257e;
    }

    public final S l() {
        return f1256d;
    }

    public final String p(S type) {
        AbstractC2855l.g(type, "type");
        H8.d.z(type);
        v0 v0VarK0 = type.K0();
        AbstractC2855l.e(v0VarK0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
        return ((j) v0VarK0).b(0);
    }
}
