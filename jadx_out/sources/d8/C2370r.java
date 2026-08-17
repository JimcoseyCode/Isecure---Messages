package d8;

import A8.InterfaceC0398s;
import L7.i0;
import h8.InterfaceC2710c;
import i8.AbstractC2757a;
import kotlin.jvm.internal.AbstractC2855l;
import m8.AbstractC2950i;
import t8.C3381d;
import y8.C3662y;

/* JADX INFO: renamed from: d8.r, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2370r implements InterfaceC0398s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3381d f25770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C3381d f25771c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C3662y f25772d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f25773e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final A8.r f25774f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC2376x f25775g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f25776h;

    public C2370r(C3381d className, C3381d c3381d, f8.l packageProto, InterfaceC2710c nameResolver, C3662y c3662y, boolean z10, A8.r abiStability, InterfaceC2376x interfaceC2376x) {
        String string;
        AbstractC2855l.g(className, "className");
        AbstractC2855l.g(packageProto, "packageProto");
        AbstractC2855l.g(nameResolver, "nameResolver");
        AbstractC2855l.g(abiStability, "abiStability");
        this.f25770b = className;
        this.f25771c = c3381d;
        this.f25772d = c3662y;
        this.f25773e = z10;
        this.f25774f = abiStability;
        this.f25775g = interfaceC2376x;
        AbstractC2950i.f packageModuleName = AbstractC2757a.f28756m;
        AbstractC2855l.f(packageModuleName, "packageModuleName");
        Integer num = (Integer) h8.e.a(packageProto, packageModuleName);
        this.f25776h = (num == null || (string = nameResolver.getString(num.intValue())) == null) ? "main" : string;
    }

    @Override // L7.h0
    public i0 a() {
        i0 NO_SOURCE_FILE = i0.f7336a;
        AbstractC2855l.f(NO_SOURCE_FILE, "NO_SOURCE_FILE");
        return NO_SOURCE_FILE;
    }

    @Override // A8.InterfaceC0398s
    public String c() {
        return "Class '" + d().a().b() + '\'';
    }

    public final k8.b d() {
        k8.c cVarG = e().g();
        AbstractC2855l.f(cVarG, "getPackageFqName(...)");
        return new k8.b(cVarG, h());
    }

    public C3381d e() {
        return this.f25770b;
    }

    public C3381d f() {
        return this.f25771c;
    }

    public final InterfaceC2376x g() {
        return this.f25775g;
    }

    public final k8.f h() {
        String strF = e().f();
        AbstractC2855l.f(strF, "getInternalName(...)");
        k8.f fVarQ = k8.f.q(P8.q.S0(strF, '/', null, 2, null));
        AbstractC2855l.f(fVarQ, "identifier(...)");
        return fVarQ;
    }

    public String toString() {
        return C2370r.class.getSimpleName() + ": " + e();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C2370r(InterfaceC2376x kotlinClass, f8.l packageProto, InterfaceC2710c nameResolver, C3662y c3662y, boolean z10, A8.r abiStability) {
        AbstractC2855l.g(kotlinClass, "kotlinClass");
        AbstractC2855l.g(packageProto, "packageProto");
        AbstractC2855l.g(nameResolver, "nameResolver");
        AbstractC2855l.g(abiStability, "abiStability");
        C3381d c3381dB = C3381d.b(kotlinClass.c());
        AbstractC2855l.f(c3381dB, "byClassId(...)");
        String strE = kotlinClass.a().e();
        C3381d c3381dD = null;
        if (strE != null && strE.length() > 0) {
            c3381dD = C3381d.d(strE);
        }
        this(c3381dB, c3381dD, packageProto, nameResolver, c3662y, z10, abiStability, kotlinClass);
    }
}
