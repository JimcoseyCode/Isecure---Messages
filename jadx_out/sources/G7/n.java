package G7;

import C8.F0;
import C8.S;
import F7.AbstractC0529d0;
import F7.j1;
import G7.i;
import L7.InterfaceC1277b;
import L7.InterfaceC1280e;
import L7.InterfaceC1283h;
import L7.InterfaceC1287l;
import L7.InterfaceC1288m;
import L7.InterfaceC1300z;
import L7.W;
import L7.c0;
import L7.t0;
import P8.q;
import R7.AbstractC1394f;
import j7.AbstractC2793j;
import j7.AbstractC2800q;
import j7.J;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC2855l;
import o7.AbstractC3016b;
import o8.AbstractC3029k;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class n implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f3527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f3528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Member f3529c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f3530d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final B7.c[] f3531e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f3532f;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final B7.c f3533a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List[] f3534b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Method f3535c;

        public a(B7.c argumentRange, List[] unboxParameters, Method method) {
            AbstractC2855l.g(argumentRange, "argumentRange");
            AbstractC2855l.g(unboxParameters, "unboxParameters");
            this.f3533a = argumentRange;
            this.f3534b = unboxParameters;
            this.f3535c = method;
        }

        public final B7.c a() {
            return this.f3533a;
        }

        public final Method b() {
            return this.f3535c;
        }

        public final List[] c() {
            return this.f3534b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Method f3536a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Method f3537b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f3538c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List f3539d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final List f3540e;

        public b(InterfaceC1300z descriptor, AbstractC0529d0 container, String constructorDesc, List originalParameters) {
            Collection collectionE;
            AbstractC2855l.g(descriptor, "descriptor");
            AbstractC2855l.g(container, "container");
            AbstractC2855l.g(constructorDesc, "constructorDesc");
            AbstractC2855l.g(originalParameters, "originalParameters");
            Method methodZ = container.z("constructor-impl", constructorDesc);
            AbstractC2855l.d(methodZ);
            this.f3536a = methodZ;
            Method methodZ2 = container.z("box-impl", q.x0(constructorDesc, "V") + AbstractC1394f.f(container.b()));
            AbstractC2855l.d(methodZ2);
            this.f3537b = methodZ2;
            ArrayList arrayList = new ArrayList(AbstractC2800q.u(originalParameters, 10));
            Iterator it = originalParameters.iterator();
            while (it.hasNext()) {
                S type = ((W) it.next()).getType();
                AbstractC2855l.f(type, "getType(...)");
                arrayList.add(o.p(F0.a(type), descriptor));
            }
            this.f3538c = arrayList;
            ArrayList arrayList2 = new ArrayList(AbstractC2800q.u(originalParameters, 10));
            int i10 = 0;
            for (Object obj : originalParameters) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    AbstractC2800q.t();
                }
                InterfaceC1283h interfaceC1283hP = ((W) obj).getType().K0().p();
                AbstractC2855l.e(interfaceC1283hP, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                InterfaceC1280e interfaceC1280e = (InterfaceC1280e) interfaceC1283hP;
                List list = (List) this.f3538c.get(i10);
                if (list != null) {
                    collectionE = new ArrayList(AbstractC2800q.u(list, 10));
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        collectionE.add(((Method) it2.next()).getReturnType());
                    }
                } else {
                    Class clsQ = j1.q(interfaceC1280e);
                    AbstractC2855l.d(clsQ);
                    collectionE = AbstractC2800q.e(clsQ);
                }
                arrayList2.add(collectionE);
                i10 = i11;
            }
            this.f3539d = arrayList2;
            this.f3540e = AbstractC2800q.w(arrayList2);
        }

        @Override // G7.h
        public List a() {
            return this.f3540e;
        }

        @Override // G7.h
        public /* bridge */ /* synthetic */ Member b() {
            return (Member) c();
        }

        public Void c() {
            return null;
        }

        @Override // G7.h
        public Object call(Object[] args) throws IllegalAccessException, InvocationTargetException {
            Collection collectionE;
            AbstractC2855l.g(args, "args");
            List<Pair> listM0 = AbstractC2793j.M0(args, this.f3538c);
            ArrayList arrayList = new ArrayList();
            for (Pair pair : listM0) {
                Object first = pair.getFirst();
                List list = (List) pair.getSecond();
                if (list != null) {
                    collectionE = new ArrayList(AbstractC2800q.u(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        collectionE.add(((Method) it.next()).invoke(first, null));
                    }
                } else {
                    collectionE = AbstractC2800q.e(first);
                }
                AbstractC2800q.A(arrayList, collectionE);
            }
            Object[] array = arrayList.toArray(new Object[0]);
            this.f3536a.invoke(null, Arrays.copyOf(array, array.length));
            return this.f3537b.invoke(null, Arrays.copyOf(array, array.length));
        }

        public final List d() {
            return this.f3539d;
        }

        @Override // G7.h
        public Type getReturnType() {
            Class<?> returnType = this.f3537b.getReturnType();
            AbstractC2855l.f(returnType, "getReturnType(...)");
            return returnType;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0079 A[LOOP:1: B:25:0x0073->B:27:0x0079, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public n(InterfaceC1277b descriptor, h oldCaller, boolean z10) {
        Class clsS;
        int i10;
        a aVar;
        S sJ;
        Iterator it;
        AbstractC2855l.g(descriptor, "descriptor");
        AbstractC2855l.g(oldCaller, "oldCaller");
        this.f3527a = z10;
        boolean z11 = false;
        if (oldCaller instanceof i.h.c) {
            c0 c0VarH0 = descriptor.h0();
            c0VarH0 = c0VarH0 == null ? descriptor.a0() : c0VarH0;
            S type = c0VarH0 != null ? c0VarH0.getType() : null;
            if (type != null && AbstractC3029k.i(type)) {
                if (z10) {
                    List listI = descriptor.i();
                    AbstractC2855l.f(listI, "getValueParameters(...)");
                    if (listI == null || !listI.isEmpty()) {
                        Iterator it2 = listI.iterator();
                        while (it2.hasNext()) {
                            if (((t0) it2.next()).q0()) {
                                List listN = o.n(F0.a(type));
                                AbstractC2855l.d(listN);
                                ArrayList arrayList = new ArrayList(AbstractC2800q.u(listN, 10));
                                it = listN.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(((Method) it.next()).invoke(((i.h.c) oldCaller).g(), null));
                                }
                                oldCaller = new i.h.d((Method) ((i.h) oldCaller).b(), arrayList.toArray(new Object[0]));
                            }
                        }
                    }
                } else {
                    List listN2 = o.n(F0.a(type));
                    AbstractC2855l.d(listN2);
                    ArrayList arrayList2 = new ArrayList(AbstractC2800q.u(listN2, 10));
                    it = listN2.iterator();
                    while (it.hasNext()) {
                    }
                    oldCaller = new i.h.d((Method) ((i.h) oldCaller).b(), arrayList2.toArray(new Object[0]));
                }
            }
        }
        this.f3528b = oldCaller;
        this.f3529c = oldCaller.b();
        S returnType = descriptor.getReturnType();
        AbstractC2855l.d(returnType);
        boolean z12 = descriptor instanceof InterfaceC1300z;
        Method methodK = ((z12 && ((InterfaceC1300z) descriptor).isSuspend() && (sJ = AbstractC3029k.j(returnType)) != null && I7.i.s0(sJ)) || (clsS = o.s(returnType)) == null) ? null : o.k(clsS, descriptor);
        if (AbstractC3029k.a(descriptor)) {
            aVar = new a(B7.c.f404k.a(), new List[0], methodK);
        } else {
            int i11 = -1;
            if (!(oldCaller instanceof i.h.c) && !(oldCaller instanceof i.h.d)) {
                if (descriptor instanceof InterfaceC1287l) {
                    if (!(oldCaller instanceof g)) {
                        i11 = 0;
                    }
                } else if (descriptor.a0() != null && !(oldCaller instanceof g)) {
                    InterfaceC1288m interfaceC1288mB = descriptor.b();
                    AbstractC2855l.f(interfaceC1288mB, "getContainingDeclaration(...)");
                    if (!AbstractC3029k.g(interfaceC1288mB)) {
                        i11 = 1;
                    }
                }
            }
            int i12 = oldCaller instanceof i.h.d ? -((i.h.d) oldCaller).h() : i11;
            List listR = o.r(descriptor, oldCaller.b(), m.f3526g);
            if (this.f3527a) {
                Iterator it3 = listR.iterator();
                int iE = 0;
                while (it3.hasNext()) {
                    iE += e((S) it3.next());
                }
                i10 = ((iE + 31) / 32) + 1;
            } else {
                i10 = 0;
            }
            int i13 = i10 + ((z12 && ((InterfaceC1300z) descriptor).isSuspend()) ? 1 : 0);
            Iterator it4 = listR.iterator();
            int iE2 = 0;
            while (it4.hasNext()) {
                iE2 += e((S) it4.next());
            }
            int i14 = iE2 + i12 + i13;
            o.g(this, i14, descriptor, this.f3527a);
            B7.c cVarP = B7.d.p(Math.max(i11, 0), listR.size() + i11);
            List[] listArr = new List[i14];
            int i15 = 0;
            while (i15 < i14) {
                listArr[i15] = (i15 > cVarP.o() || cVarP.d() > i15) ? null : o.p(F0.a((S) listR.get(i15 - i11)), descriptor);
                i15++;
            }
            aVar = new a(cVarP, listArr, methodK);
        }
        this.f3530d = aVar;
        List listC = AbstractC2800q.c();
        h hVar = this.f3528b;
        int length = hVar instanceof i.h.d ? ((i.h.d) hVar).g().length : hVar instanceof i.h.c ? 1 : 0;
        if (length > 0) {
            listC.add(B7.d.p(0, length));
        }
        List[] listArrC = aVar.c();
        int length2 = listArrC.length;
        int i16 = 0;
        while (i16 < length2) {
            List list = listArrC[i16];
            int size = (list != null ? list.size() : 1) + length;
            listC.add(B7.d.p(length, size));
            i16++;
            length = size;
        }
        this.f3531e = (B7.c[]) AbstractC2800q.a(listC).toArray(new B7.c[0]);
        Iterable iterableA = this.f3530d.a();
        if (!(iterableA instanceof Collection) || !((Collection) iterableA).isEmpty()) {
            Iterator it5 = iterableA.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    break;
                }
                List list2 = this.f3530d.c()[((J) it5).nextInt()];
                if (list2 != null && list2.size() > 1) {
                    z11 = true;
                    break;
                }
            }
        }
        this.f3532f = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(InterfaceC1280e makeKotlinParameterTypes) {
        AbstractC2855l.g(makeKotlinParameterTypes, "$this$makeKotlinParameterTypes");
        return AbstractC3029k.g(makeKotlinParameterTypes);
    }

    private static final int e(S s10) {
        List listN = o.n(F0.a(s10));
        if (listN != null) {
            return listN.size();
        }
        return 1;
    }

    @Override // G7.h
    public List a() {
        return this.f3528b.a();
    }

    @Override // G7.h
    public Member b() {
        return this.f3529c;
    }

    @Override // G7.h
    public Object call(Object[] args) throws IllegalAccessException, InvocationTargetException {
        Object objInvoke;
        Object objG;
        Object objG2;
        AbstractC2855l.g(args, "args");
        B7.c cVarA = this.f3530d.a();
        List[] listArrC = this.f3530d.c();
        Method methodB = this.f3530d.b();
        if (!cVarA.isEmpty()) {
            if (this.f3532f) {
                List listD = AbstractC2800q.d(args.length);
                int iD = cVarA.d();
                for (int i10 = 0; i10 < iD; i10++) {
                    listD.add(args[i10]);
                }
                int iD2 = cVarA.d();
                int iO = cVarA.o();
                if (iD2 <= iO) {
                    while (true) {
                        List<Method> list = listArrC[iD2];
                        Object obj = args[iD2];
                        if (list != null) {
                            for (Method method : list) {
                                if (obj != null) {
                                    objG2 = method.invoke(obj, null);
                                } else {
                                    Class<?> returnType = method.getReturnType();
                                    AbstractC2855l.f(returnType, "getReturnType(...)");
                                    objG2 = j1.g(returnType);
                                }
                                listD.add(objG2);
                            }
                        } else {
                            listD.add(obj);
                        }
                        if (iD2 == iO) {
                            break;
                        }
                        iD2++;
                    }
                }
                int iO2 = cVarA.o() + 1;
                int iK = AbstractC2793j.K(args);
                if (iO2 <= iK) {
                    while (true) {
                        listD.add(args[iO2]);
                        if (iO2 == iK) {
                            break;
                        }
                        iO2++;
                    }
                }
                args = AbstractC2800q.a(listD).toArray(new Object[0]);
            } else {
                int length = args.length;
                Object[] objArr = new Object[length];
                for (int i11 = 0; i11 < length; i11++) {
                    int iD3 = cVarA.d();
                    if (i11 > cVarA.o() || iD3 > i11) {
                        objG = args[i11];
                    } else {
                        List list2 = listArrC[i11];
                        Method method2 = list2 != null ? (Method) AbstractC2800q.C0(list2) : null;
                        objG = args[i11];
                        if (method2 != null) {
                            if (objG != null) {
                                objG = method2.invoke(objG, null);
                            } else {
                                Class<?> returnType2 = method2.getReturnType();
                                AbstractC2855l.f(returnType2, "getReturnType(...)");
                                objG = j1.g(returnType2);
                            }
                        }
                    }
                    objArr[i11] = objG;
                }
                args = objArr;
            }
        }
        Object objCall = this.f3528b.call(args);
        return (objCall == AbstractC3016b.e() || methodB == null || (objInvoke = methodB.invoke(null, objCall)) == null) ? objCall : objInvoke;
    }

    public final B7.c f(int i10) {
        if (i10 >= 0) {
            B7.c[] cVarArr = this.f3531e;
            if (i10 < cVarArr.length) {
                return cVarArr[i10];
            }
        }
        B7.c[] cVarArr2 = this.f3531e;
        if (cVarArr2.length == 0) {
            return new B7.c(i10, i10);
        }
        int length = (i10 - cVarArr2.length) + ((B7.c) AbstractC2793j.b0(cVarArr2)).o() + 1;
        return new B7.c(length, length);
    }

    @Override // G7.h
    public Type getReturnType() {
        return this.f3528b.getReturnType();
    }
}
