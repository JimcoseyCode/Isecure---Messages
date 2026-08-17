package y8;

import h8.InterfaceC2710c;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;
import m8.AbstractC2950i;
import x8.AbstractC3555a;
import y8.N;

/* JADX INFO: renamed from: y8.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3639a implements InterfaceC3646h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC3555a f34076a;

    /* JADX INFO: renamed from: y8.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public /* synthetic */ class C0375a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f34077a;

        static {
            int[] iArr = new int[EnumC3642d.values().length];
            try {
                iArr[EnumC3642d.PROPERTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3642d.PROPERTY_GETTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC3642d.PROPERTY_SETTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f34077a = iArr;
        }
    }

    public AbstractC3639a(AbstractC3555a protocol) {
        AbstractC2855l.g(protocol, "protocol");
        this.f34076a = protocol;
    }

    @Override // y8.InterfaceC3646h
    public List a(N container, f8.n proto) {
        AbstractC2855l.g(container, "container");
        AbstractC2855l.g(proto, "proto");
        AbstractC2950i.f fVarK = this.f34076a.k();
        List listJ = fVarK != null ? (List) proto.t(fVarK) : null;
        if (listJ == null) {
            listJ = AbstractC2800q.j();
        }
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(listJ, 10));
        Iterator it = listJ.iterator();
        while (it.hasNext()) {
            arrayList.add(c((f8.b) it.next(), container.b()));
        }
        return arrayList;
    }

    @Override // y8.InterfaceC3646h
    public List b(N container, f8.n proto) {
        AbstractC2855l.g(container, "container");
        AbstractC2855l.g(proto, "proto");
        AbstractC2950i.f fVarJ = this.f34076a.j();
        List listJ = fVarJ != null ? (List) proto.t(fVarJ) : null;
        if (listJ == null) {
            listJ = AbstractC2800q.j();
        }
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(listJ, 10));
        Iterator it = listJ.iterator();
        while (it.hasNext()) {
            arrayList.add(c((f8.b) it.next(), container.b()));
        }
        return arrayList;
    }

    @Override // y8.InterfaceC3646h
    public List d(N.a container) {
        AbstractC2855l.g(container, "container");
        List listJ = (List) container.f().t(this.f34076a.a());
        if (listJ == null) {
            listJ = AbstractC2800q.j();
        }
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(listJ, 10));
        Iterator it = listJ.iterator();
        while (it.hasNext()) {
            arrayList.add(c((f8.b) it.next(), container.b()));
        }
        return arrayList;
    }

    @Override // y8.InterfaceC3646h
    public List e(N container, m8.p proto, EnumC3642d kind) {
        List listJ;
        AbstractC2855l.g(container, "container");
        AbstractC2855l.g(proto, "proto");
        AbstractC2855l.g(kind, "kind");
        if (proto instanceof f8.d) {
            listJ = (List) ((f8.d) proto).t(this.f34076a.c());
        } else if (proto instanceof f8.i) {
            listJ = (List) ((f8.i) proto).t(this.f34076a.f());
        } else {
            if (!(proto instanceof f8.n)) {
                throw new IllegalStateException(("Unknown message: " + proto).toString());
            }
            int i10 = C0375a.f34077a[kind.ordinal()];
            if (i10 == 1) {
                listJ = (List) ((f8.n) proto).t(this.f34076a.i());
            } else if (i10 == 2) {
                listJ = (List) ((f8.n) proto).t(this.f34076a.m());
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException("Unsupported callable kind with property proto");
                }
                listJ = (List) ((f8.n) proto).t(this.f34076a.n());
            }
        }
        if (listJ == null) {
            listJ = AbstractC2800q.j();
        }
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(listJ, 10));
        Iterator it = listJ.iterator();
        while (it.hasNext()) {
            arrayList.add(c((f8.b) it.next(), container.b()));
        }
        return arrayList;
    }

    @Override // y8.InterfaceC3646h
    public List f(f8.s proto, InterfaceC2710c nameResolver) {
        AbstractC2855l.g(proto, "proto");
        AbstractC2855l.g(nameResolver, "nameResolver");
        List listJ = (List) proto.t(this.f34076a.p());
        if (listJ == null) {
            listJ = AbstractC2800q.j();
        }
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(listJ, 10));
        Iterator it = listJ.iterator();
        while (it.hasNext()) {
            arrayList.add(c((f8.b) it.next(), nameResolver));
        }
        return arrayList;
    }

    @Override // y8.InterfaceC3646h
    public List h(N container, m8.p callableProto, EnumC3642d kind, int i10, f8.u proto) {
        AbstractC2855l.g(container, "container");
        AbstractC2855l.g(callableProto, "callableProto");
        AbstractC2855l.g(kind, "kind");
        AbstractC2855l.g(proto, "proto");
        List listJ = (List) proto.t(this.f34076a.h());
        if (listJ == null) {
            listJ = AbstractC2800q.j();
        }
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(listJ, 10));
        Iterator it = listJ.iterator();
        while (it.hasNext()) {
            arrayList.add(c((f8.b) it.next(), container.b()));
        }
        return arrayList;
    }

    @Override // y8.InterfaceC3646h
    public List i(N container, m8.p proto, EnumC3642d kind) {
        AbstractC2855l.g(container, "container");
        AbstractC2855l.g(proto, "proto");
        AbstractC2855l.g(kind, "kind");
        List listJ = null;
        if (proto instanceof f8.i) {
            AbstractC2950i.f fVarG = this.f34076a.g();
            if (fVarG != null) {
                listJ = (List) ((f8.i) proto).t(fVarG);
            }
        } else {
            if (!(proto instanceof f8.n)) {
                throw new IllegalStateException(("Unknown message: " + proto).toString());
            }
            int i10 = C0375a.f34077a[kind.ordinal()];
            if (i10 != 1 && i10 != 2 && i10 != 3) {
                throw new IllegalStateException(("Unsupported callable kind with property proto for receiver annotations: " + kind).toString());
            }
            AbstractC2950i.f fVarL = this.f34076a.l();
            if (fVarL != null) {
                listJ = (List) ((f8.n) proto).t(fVarL);
            }
        }
        if (listJ == null) {
            listJ = AbstractC2800q.j();
        }
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(listJ, 10));
        Iterator it = listJ.iterator();
        while (it.hasNext()) {
            arrayList.add(c((f8.b) it.next(), container.b()));
        }
        return arrayList;
    }

    @Override // y8.InterfaceC3646h
    public List j(f8.q proto, InterfaceC2710c nameResolver) {
        AbstractC2855l.g(proto, "proto");
        AbstractC2855l.g(nameResolver, "nameResolver");
        List listJ = (List) proto.t(this.f34076a.o());
        if (listJ == null) {
            listJ = AbstractC2800q.j();
        }
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(listJ, 10));
        Iterator it = listJ.iterator();
        while (it.hasNext()) {
            arrayList.add(c((f8.b) it.next(), nameResolver));
        }
        return arrayList;
    }

    @Override // y8.InterfaceC3646h
    public List k(N container, f8.g proto) {
        AbstractC2855l.g(container, "container");
        AbstractC2855l.g(proto, "proto");
        List listJ = (List) proto.t(this.f34076a.d());
        if (listJ == null) {
            listJ = AbstractC2800q.j();
        }
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(listJ, 10));
        Iterator it = listJ.iterator();
        while (it.hasNext()) {
            arrayList.add(c((f8.b) it.next(), container.b()));
        }
        return arrayList;
    }

    protected final AbstractC3555a m() {
        return this.f34076a;
    }
}
