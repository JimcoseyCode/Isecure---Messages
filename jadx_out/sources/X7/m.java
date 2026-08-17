package X7;

import L7.InterfaceC1288m;
import L7.m0;
import Y7.c0;
import b8.y;
import b8.z;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class m implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f12547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC1288m f12548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f12549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f12550d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final B8.h f12551e;

    public m(k c10, InterfaceC1288m containingDeclaration, z typeParameterOwner, int i10) {
        AbstractC2855l.g(c10, "c");
        AbstractC2855l.g(containingDeclaration, "containingDeclaration");
        AbstractC2855l.g(typeParameterOwner, "typeParameterOwner");
        this.f12547a = c10;
        this.f12548b = containingDeclaration;
        this.f12549c = i10;
        this.f12550d = M8.a.d(typeParameterOwner.getTypeParameters());
        this.f12551e = c10.e().i(new l(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c0 c(m mVar, y typeParameter) {
        AbstractC2855l.g(typeParameter, "typeParameter");
        Integer num = (Integer) mVar.f12550d.get(typeParameter);
        if (num == null) {
            return null;
        }
        return new c0(c.k(c.d(mVar.f12547a, mVar), mVar.f12548b.getAnnotations()), typeParameter, mVar.f12549c + num.intValue(), mVar.f12548b);
    }

    @Override // X7.p
    public m0 a(y javaTypeParameter) {
        AbstractC2855l.g(javaTypeParameter, "javaTypeParameter");
        c0 c0Var = (c0) this.f12551e.invoke(javaTypeParameter);
        return c0Var != null ? c0Var : this.f12547a.f().a(javaTypeParameter);
    }
}
