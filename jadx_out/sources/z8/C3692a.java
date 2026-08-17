package z8;

import P8.q;
import g8.AbstractC2684b;
import kotlin.jvm.internal.AbstractC2855l;
import m8.AbstractC2950i;
import m8.C2948g;
import x8.AbstractC3555a;

/* JADX INFO: renamed from: z8.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3692a extends AbstractC3555a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C3692a f34292r = new C3692a();

    /* JADX WARN: Illegal instructions before constructor call */
    private C3692a() {
        C2948g c2948gD = C2948g.d();
        AbstractC2684b.a(c2948gD);
        AbstractC2855l.f(c2948gD, "apply(...)");
        AbstractC2950i.f packageFqName = AbstractC2684b.f28235a;
        AbstractC2855l.f(packageFqName, "packageFqName");
        AbstractC2950i.f constructorAnnotation = AbstractC2684b.f28237c;
        AbstractC2855l.f(constructorAnnotation, "constructorAnnotation");
        AbstractC2950i.f classAnnotation = AbstractC2684b.f28236b;
        AbstractC2855l.f(classAnnotation, "classAnnotation");
        AbstractC2950i.f functionAnnotation = AbstractC2684b.f28238d;
        AbstractC2855l.f(functionAnnotation, "functionAnnotation");
        AbstractC2950i.f propertyAnnotation = AbstractC2684b.f28239e;
        AbstractC2855l.f(propertyAnnotation, "propertyAnnotation");
        AbstractC2950i.f propertyGetterAnnotation = AbstractC2684b.f28240f;
        AbstractC2855l.f(propertyGetterAnnotation, "propertyGetterAnnotation");
        AbstractC2950i.f propertySetterAnnotation = AbstractC2684b.f28241g;
        AbstractC2855l.f(propertySetterAnnotation, "propertySetterAnnotation");
        AbstractC2950i.f enumEntryAnnotation = AbstractC2684b.f28243i;
        AbstractC2855l.f(enumEntryAnnotation, "enumEntryAnnotation");
        AbstractC2950i.f compileTimeValue = AbstractC2684b.f28242h;
        AbstractC2855l.f(compileTimeValue, "compileTimeValue");
        AbstractC2950i.f parameterAnnotation = AbstractC2684b.f28244j;
        AbstractC2855l.f(parameterAnnotation, "parameterAnnotation");
        AbstractC2950i.f typeAnnotation = AbstractC2684b.f28245k;
        AbstractC2855l.f(typeAnnotation, "typeAnnotation");
        AbstractC2950i.f typeParameterAnnotation = AbstractC2684b.f28246l;
        AbstractC2855l.f(typeParameterAnnotation, "typeParameterAnnotation");
        super(c2948gD, packageFqName, constructorAnnotation, classAnnotation, functionAnnotation, null, propertyAnnotation, propertyGetterAnnotation, propertySetterAnnotation, null, null, null, enumEntryAnnotation, compileTimeValue, parameterAnnotation, typeAnnotation, typeParameterAnnotation);
    }

    private final String s(k8.c cVar) {
        if (cVar.d()) {
            return "default-package";
        }
        String strJ = cVar.g().j();
        AbstractC2855l.f(strJ, "asString(...)");
        return strJ;
    }

    public final String q(k8.c fqName) {
        AbstractC2855l.g(fqName, "fqName");
        return s(fqName) + ".kotlin_builtins";
    }

    public final String r(k8.c fqName) {
        AbstractC2855l.g(fqName, "fqName");
        StringBuilder sb = new StringBuilder();
        String strB = fqName.b();
        AbstractC2855l.f(strB, "asString(...)");
        sb.append(q.D(strB, '.', '/', false, 4, null));
        sb.append('/');
        sb.append(q(fqName));
        return sb.toString();
    }
}
