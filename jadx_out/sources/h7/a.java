package H7;

import L7.h0;
import U7.H;
import U7.I;
import d8.InterfaceC2376x;
import j7.AbstractC2800q;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import k8.b;
import k8.c;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.z;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f3801a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Set f3802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final b f3803c;

    static {
        List listM = AbstractC2800q.m(I.f11396a, I.f11407l, I.f11408m, I.f11399d, I.f11401f, I.f11404i);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        b.a aVar = b.f29200d;
        Iterator it = listM.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(aVar.c((c) it.next()));
        }
        f3802b = linkedHashSet;
        b.a aVar2 = b.f29200d;
        c REPEATABLE_ANNOTATION = I.f11405j;
        AbstractC2855l.f(REPEATABLE_ANNOTATION, "REPEATABLE_ANNOTATION");
        f3803c = aVar2.c(REPEATABLE_ANNOTATION);
    }

    private a() {
    }

    public final b a() {
        return f3803c;
    }

    public final Set b() {
        return f3802b;
    }

    public final boolean c(InterfaceC2376x klass) {
        AbstractC2855l.g(klass, "klass");
        z zVar = new z();
        klass.d(new C0051a(zVar), null);
        return zVar.f29399g;
    }

    /* JADX INFO: renamed from: H7.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class C0051a implements InterfaceC2376x.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ z f3804a;

        C0051a(z zVar) {
            this.f3804a = zVar;
        }

        @Override // d8.InterfaceC2376x.c
        public InterfaceC2376x.a c(b classId, h0 source) {
            AbstractC2855l.g(classId, "classId");
            AbstractC2855l.g(source, "source");
            if (!AbstractC2855l.b(classId, H.f11391a.a())) {
                return null;
            }
            this.f3804a.f29399g = true;
            return null;
        }

        @Override // d8.InterfaceC2376x.c
        public void a() {
        }
    }
}
