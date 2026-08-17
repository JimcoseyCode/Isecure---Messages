package Q7;

import I7.o;
import b8.InterfaceC1823g;
import d8.InterfaceC2374v;
import j8.C2810e;
import java.io.InputStream;
import kotlin.jvm.internal.AbstractC2855l;
import z8.C3692a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class g implements InterfaceC2374v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ClassLoader f9869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z8.d f9870b;

    public g(ClassLoader classLoader) {
        AbstractC2855l.g(classLoader, "classLoader");
        this.f9869a = classLoader;
        this.f9870b = new z8.d();
    }

    private final InterfaceC2374v.a d(String str) {
        f fVarA;
        Class clsA = e.a(this.f9869a, str);
        if (clsA == null || (fVarA = f.f9866c.a(clsA)) == null) {
            return null;
        }
        return new InterfaceC2374v.a.C0252a(fVarA, null, 2, null);
    }

    @Override // d8.InterfaceC2374v
    public InterfaceC2374v.a a(InterfaceC1823g javaClass, C2810e jvmMetadataVersion) {
        String strB;
        AbstractC2855l.g(javaClass, "javaClass");
        AbstractC2855l.g(jvmMetadataVersion, "jvmMetadataVersion");
        k8.c cVarD = javaClass.d();
        if (cVarD == null || (strB = cVarD.b()) == null) {
            return null;
        }
        return d(strB);
    }

    @Override // y8.InterfaceC3627A
    public InputStream b(k8.c packageFqName) {
        AbstractC2855l.g(packageFqName, "packageFqName");
        if (packageFqName.i(o.f5141z)) {
            return this.f9870b.a(C3692a.f34292r.r(packageFqName));
        }
        return null;
    }

    @Override // d8.InterfaceC2374v
    public InterfaceC2374v.a c(k8.b classId, C2810e jvmMetadataVersion) {
        AbstractC2855l.g(classId, "classId");
        AbstractC2855l.g(jvmMetadataVersion, "jvmMetadataVersion");
        return d(h.b(classId));
    }
}
