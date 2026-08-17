package d8;

import C8.S;
import L7.AbstractC1299y;
import L7.InterfaceC1280e;
import L7.M;
import L7.h0;
import L7.t0;
import d8.InterfaceC2376x;
import h8.InterfaceC2710c;
import j7.AbstractC2800q;
import j8.C2810e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;
import q8.C3131A;
import q8.C3132B;
import q8.C3133C;
import q8.C3134D;
import q8.C3136a;
import q8.C3139d;
import y8.C3645g;

/* JADX INFO: renamed from: d8.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2360h extends AbstractC2356d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final L7.H f25731d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final M f25732e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C3645g f25733f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C2810e f25734g;

    /* JADX INFO: renamed from: d8.h$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private abstract class a implements InterfaceC2376x.a {

        /* JADX INFO: renamed from: d8.h$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class C0249a implements InterfaceC2376x.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final /* synthetic */ InterfaceC2376x.a f25736a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC2376x.a f25737b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ a f25738c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ k8.f f25739d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ ArrayList f25740e;

            C0249a(InterfaceC2376x.a aVar, a aVar2, k8.f fVar, ArrayList arrayList) {
                this.f25737b = aVar;
                this.f25738c = aVar2;
                this.f25739d = fVar;
                this.f25740e = arrayList;
                this.f25736a = aVar;
            }

            @Override // d8.InterfaceC2376x.a
            public void a() {
                this.f25737b.a();
                this.f25738c.h(this.f25739d, new C3136a((M7.c) AbstractC2800q.C0(this.f25740e)));
            }

            @Override // d8.InterfaceC2376x.a
            public void b(k8.f fVar, k8.b enumClassId, k8.f enumEntryName) {
                AbstractC2855l.g(enumClassId, "enumClassId");
                AbstractC2855l.g(enumEntryName, "enumEntryName");
                this.f25736a.b(fVar, enumClassId, enumEntryName);
            }

            @Override // d8.InterfaceC2376x.a
            public InterfaceC2376x.b c(k8.f fVar) {
                return this.f25736a.c(fVar);
            }

            @Override // d8.InterfaceC2376x.a
            public InterfaceC2376x.a d(k8.f fVar, k8.b classId) {
                AbstractC2855l.g(classId, "classId");
                return this.f25736a.d(fVar, classId);
            }

            @Override // d8.InterfaceC2376x.a
            public void e(k8.f fVar, Object obj) {
                this.f25736a.e(fVar, obj);
            }

            @Override // d8.InterfaceC2376x.a
            public void f(k8.f fVar, q8.f value) {
                AbstractC2855l.g(value, "value");
                this.f25736a.f(fVar, value);
            }
        }

        /* JADX INFO: renamed from: d8.h$a$b */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class b implements InterfaceC2376x.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final ArrayList f25741a = new ArrayList();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ C2360h f25742b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ k8.f f25743c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ a f25744d;

            /* JADX INFO: renamed from: d8.h$a$b$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
            public static final class C0250a implements InterfaceC2376x.a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final /* synthetic */ InterfaceC2376x.a f25745a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC2376x.a f25746b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ b f25747c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ ArrayList f25748d;

                C0250a(InterfaceC2376x.a aVar, b bVar, ArrayList arrayList) {
                    this.f25746b = aVar;
                    this.f25747c = bVar;
                    this.f25748d = arrayList;
                    this.f25745a = aVar;
                }

                @Override // d8.InterfaceC2376x.a
                public void a() {
                    this.f25746b.a();
                    this.f25747c.f25741a.add(new C3136a((M7.c) AbstractC2800q.C0(this.f25748d)));
                }

                @Override // d8.InterfaceC2376x.a
                public void b(k8.f fVar, k8.b enumClassId, k8.f enumEntryName) {
                    AbstractC2855l.g(enumClassId, "enumClassId");
                    AbstractC2855l.g(enumEntryName, "enumEntryName");
                    this.f25745a.b(fVar, enumClassId, enumEntryName);
                }

                @Override // d8.InterfaceC2376x.a
                public InterfaceC2376x.b c(k8.f fVar) {
                    return this.f25745a.c(fVar);
                }

                @Override // d8.InterfaceC2376x.a
                public InterfaceC2376x.a d(k8.f fVar, k8.b classId) {
                    AbstractC2855l.g(classId, "classId");
                    return this.f25745a.d(fVar, classId);
                }

                @Override // d8.InterfaceC2376x.a
                public void e(k8.f fVar, Object obj) {
                    this.f25745a.e(fVar, obj);
                }

                @Override // d8.InterfaceC2376x.a
                public void f(k8.f fVar, q8.f value) {
                    AbstractC2855l.g(value, "value");
                    this.f25745a.f(fVar, value);
                }
            }

            b(C2360h c2360h, k8.f fVar, a aVar) {
                this.f25742b = c2360h;
                this.f25743c = fVar;
                this.f25744d = aVar;
            }

            @Override // d8.InterfaceC2376x.b
            public void a() {
                this.f25744d.g(this.f25743c, this.f25741a);
            }

            @Override // d8.InterfaceC2376x.b
            public void b(k8.b enumClassId, k8.f enumEntryName) {
                AbstractC2855l.g(enumClassId, "enumClassId");
                AbstractC2855l.g(enumEntryName, "enumEntryName");
                this.f25741a.add(new q8.k(enumClassId, enumEntryName));
            }

            @Override // d8.InterfaceC2376x.b
            public InterfaceC2376x.a c(k8.b classId) {
                AbstractC2855l.g(classId, "classId");
                ArrayList arrayList = new ArrayList();
                C2360h c2360h = this.f25742b;
                h0 NO_SOURCE = h0.f7335a;
                AbstractC2855l.f(NO_SOURCE, "NO_SOURCE");
                InterfaceC2376x.a aVarX = c2360h.x(classId, NO_SOURCE, arrayList);
                AbstractC2855l.d(aVarX);
                return new C0250a(aVarX, this, arrayList);
            }

            @Override // d8.InterfaceC2376x.b
            public void d(Object obj) {
                this.f25741a.add(this.f25742b.O(this.f25743c, obj));
            }

            @Override // d8.InterfaceC2376x.b
            public void e(q8.f value) {
                AbstractC2855l.g(value, "value");
                this.f25741a.add(new q8.s(value));
            }
        }

        public a() {
        }

        @Override // d8.InterfaceC2376x.a
        public void b(k8.f fVar, k8.b enumClassId, k8.f enumEntryName) {
            AbstractC2855l.g(enumClassId, "enumClassId");
            AbstractC2855l.g(enumEntryName, "enumEntryName");
            h(fVar, new q8.k(enumClassId, enumEntryName));
        }

        @Override // d8.InterfaceC2376x.a
        public InterfaceC2376x.b c(k8.f fVar) {
            return new b(C2360h.this, fVar, this);
        }

        @Override // d8.InterfaceC2376x.a
        public InterfaceC2376x.a d(k8.f fVar, k8.b classId) {
            AbstractC2855l.g(classId, "classId");
            ArrayList arrayList = new ArrayList();
            C2360h c2360h = C2360h.this;
            h0 NO_SOURCE = h0.f7335a;
            AbstractC2855l.f(NO_SOURCE, "NO_SOURCE");
            InterfaceC2376x.a aVarX = c2360h.x(classId, NO_SOURCE, arrayList);
            AbstractC2855l.d(aVarX);
            return new C0249a(aVarX, this, fVar, arrayList);
        }

        @Override // d8.InterfaceC2376x.a
        public void e(k8.f fVar, Object obj) {
            h(fVar, C2360h.this.O(fVar, obj));
        }

        @Override // d8.InterfaceC2376x.a
        public void f(k8.f fVar, q8.f value) {
            AbstractC2855l.g(value, "value");
            h(fVar, new q8.s(value));
        }

        public abstract void g(k8.f fVar, ArrayList arrayList);

        public abstract void h(k8.f fVar, q8.g gVar);
    }

    /* JADX INFO: renamed from: d8.h$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final HashMap f25749b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC1280e f25751d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ k8.b f25752e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f25753f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ h0 f25754g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC1280e interfaceC1280e, k8.b bVar, List list, h0 h0Var) {
            super();
            this.f25751d = interfaceC1280e;
            this.f25752e = bVar;
            this.f25753f = list;
            this.f25754g = h0Var;
            this.f25749b = new HashMap();
        }

        @Override // d8.InterfaceC2376x.a
        public void a() {
            if (C2360h.this.F(this.f25752e, this.f25749b) || C2360h.this.w(this.f25752e)) {
                return;
            }
            this.f25753f.add(new M7.d(this.f25751d.r(), this.f25749b, this.f25754g));
        }

        @Override // d8.C2360h.a
        public void g(k8.f fVar, ArrayList elements) {
            AbstractC2855l.g(elements, "elements");
            if (fVar == null) {
                return;
            }
            t0 t0VarB = V7.a.b(fVar, this.f25751d);
            if (t0VarB != null) {
                HashMap map = this.f25749b;
                q8.i iVar = q8.i.f30873a;
                List listC = M8.a.c(elements);
                S type = t0VarB.getType();
                AbstractC2855l.f(type, "getType(...)");
                map.put(fVar, iVar.b(listC, type));
                return;
            }
            if (C2360h.this.w(this.f25752e) && AbstractC2855l.b(fVar.j(), "value")) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : elements) {
                    if (obj instanceof C3136a) {
                        arrayList.add(obj);
                    }
                }
                List list = this.f25753f;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    list.add((M7.c) ((C3136a) it.next()).b());
                }
            }
        }

        @Override // d8.C2360h.a
        public void h(k8.f fVar, q8.g value) {
            AbstractC2855l.g(value, "value");
            if (fVar != null) {
                this.f25749b.put(fVar, value);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2360h(L7.H module, M notFoundClasses, B8.n storageManager, InterfaceC2374v kotlinClassFinder) {
        super(storageManager, kotlinClassFinder);
        AbstractC2855l.g(module, "module");
        AbstractC2855l.g(notFoundClasses, "notFoundClasses");
        AbstractC2855l.g(storageManager, "storageManager");
        AbstractC2855l.g(kotlinClassFinder, "kotlinClassFinder");
        this.f25731d = module;
        this.f25732e = notFoundClasses;
        this.f25733f = new C3645g(module, notFoundClasses);
        this.f25734g = C2810e.f28943i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final q8.g O(k8.f fVar, Object obj) {
        q8.g gVarE = q8.i.f30873a.e(obj, this.f25731d);
        if (gVarE != null) {
            return gVarE;
        }
        return q8.l.f30876b.a("Unsupported annotation argument: " + fVar);
    }

    private final InterfaceC1280e R(k8.b bVar) {
        return AbstractC1299y.d(this.f25731d, bVar, this.f25732e);
    }

    @Override // d8.AbstractC2357e, y8.InterfaceC3646h
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public M7.c c(f8.b proto, InterfaceC2710c nameResolver) {
        AbstractC2855l.g(proto, "proto");
        AbstractC2855l.g(nameResolver, "nameResolver");
        return this.f25733f.a(proto, nameResolver);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // d8.AbstractC2356d
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public q8.g I(String desc, Object initializer) {
        AbstractC2855l.g(desc, "desc");
        AbstractC2855l.g(initializer, "initializer");
        if (P8.q.Q("ZBCS", desc, false, 2, null)) {
            int iIntValue = ((Integer) initializer).intValue();
            int iHashCode = desc.hashCode();
            if (iHashCode == 66) {
                if (desc.equals("B")) {
                    initializer = Byte.valueOf((byte) iIntValue);
                }
                throw new AssertionError(desc);
            }
            if (iHashCode == 67) {
                if (desc.equals("C")) {
                    initializer = Character.valueOf((char) iIntValue);
                }
                throw new AssertionError(desc);
            }
            if (iHashCode == 83) {
                if (desc.equals("S")) {
                    initializer = Short.valueOf((short) iIntValue);
                }
                throw new AssertionError(desc);
            }
            if (iHashCode == 90 && desc.equals("Z")) {
                initializer = Boolean.valueOf(iIntValue != 0);
            }
            throw new AssertionError(desc);
        }
        return q8.i.f30873a.e(initializer, this.f25731d);
    }

    public void S(C2810e c2810e) {
        AbstractC2855l.g(c2810e, "<set-?>");
        this.f25734g = c2810e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // d8.AbstractC2356d
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public q8.g M(q8.g constant) {
        AbstractC2855l.g(constant, "constant");
        return constant instanceof C3139d ? new C3131A(((Number) ((C3139d) constant).b()).byteValue()) : constant instanceof q8.w ? new C3134D(((Number) ((q8.w) constant).b()).shortValue()) : constant instanceof q8.n ? new C3132B(((Number) ((q8.n) constant).b()).intValue()) : constant instanceof q8.t ? new C3133C(((Number) ((q8.t) constant).b()).longValue()) : constant;
    }

    @Override // d8.AbstractC2357e
    public C2810e u() {
        return this.f25734g;
    }

    @Override // d8.AbstractC2357e
    protected InterfaceC2376x.a x(k8.b annotationClassId, h0 source, List result) {
        AbstractC2855l.g(annotationClassId, "annotationClassId");
        AbstractC2855l.g(source, "source");
        AbstractC2855l.g(result, "result");
        return new b(R(annotationClassId), annotationClassId, result, source);
    }
}
