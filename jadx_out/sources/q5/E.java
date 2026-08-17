package q5;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import z5.InterfaceC3678c;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class E implements InterfaceC3120d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f30758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f30759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f30760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set f30761d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set f30762e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Set f30763f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC3120d f30764g;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class a implements InterfaceC3678c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Set f30765a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final InterfaceC3678c f30766b;

        public a(Set set, InterfaceC3678c interfaceC3678c) {
            this.f30765a = set;
            this.f30766b = interfaceC3678c;
        }
    }

    E(C3119c c3119c, InterfaceC3120d interfaceC3120d) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (q qVar : c3119c.g()) {
            if (qVar.d()) {
                if (qVar.f()) {
                    hashSet4.add(qVar.b());
                } else {
                    hashSet.add(qVar.b());
                }
            } else if (qVar.c()) {
                hashSet3.add(qVar.b());
            } else if (qVar.f()) {
                hashSet5.add(qVar.b());
            } else {
                hashSet2.add(qVar.b());
            }
        }
        if (!c3119c.k().isEmpty()) {
            hashSet.add(D.b(InterfaceC3678c.class));
        }
        this.f30758a = Collections.unmodifiableSet(hashSet);
        this.f30759b = Collections.unmodifiableSet(hashSet2);
        this.f30760c = Collections.unmodifiableSet(hashSet3);
        this.f30761d = Collections.unmodifiableSet(hashSet4);
        this.f30762e = Collections.unmodifiableSet(hashSet5);
        this.f30763f = c3119c.k();
        this.f30764g = interfaceC3120d;
    }

    @Override // q5.InterfaceC3120d
    public Object a(Class cls) {
        if (!this.f30758a.contains(D.b(cls))) {
            throw new s(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        Object objA = this.f30764g.a(cls);
        return !cls.equals(InterfaceC3678c.class) ? objA : new a(this.f30763f, (InterfaceC3678c) objA);
    }

    @Override // q5.InterfaceC3120d
    public Set b(D d10) {
        if (this.f30761d.contains(d10)) {
            return this.f30764g.b(d10);
        }
        throw new s(String.format("Attempting to request an undeclared dependency Set<%s>.", d10));
    }

    @Override // q5.InterfaceC3120d
    public C5.b c(Class cls) {
        return f(D.b(cls));
    }

    @Override // q5.InterfaceC3120d
    public C5.b d(D d10) {
        if (this.f30762e.contains(d10)) {
            return this.f30764g.d(d10);
        }
        throw new s(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", d10));
    }

    @Override // q5.InterfaceC3120d
    public Object e(D d10) {
        if (this.f30758a.contains(d10)) {
            return this.f30764g.e(d10);
        }
        throw new s(String.format("Attempting to request an undeclared dependency %s.", d10));
    }

    @Override // q5.InterfaceC3120d
    public C5.b f(D d10) {
        if (this.f30759b.contains(d10)) {
            return this.f30764g.f(d10);
        }
        throw new s(String.format("Attempting to request an undeclared dependency Provider<%s>.", d10));
    }
}
