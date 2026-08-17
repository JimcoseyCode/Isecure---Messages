package j8;

import com.facebook.react.uimanager.events.PointerEventHelper;
import f8.l;
import f8.n;
import f8.q;
import f8.u;
import h8.AbstractC2709b;
import h8.InterfaceC2710c;
import i8.AbstractC2757a;
import j7.AbstractC2800q;
import j8.AbstractC2809d;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC2855l;
import m8.AbstractC2950i;
import m8.C2948g;

/* JADX INFO: renamed from: j8.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2814i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2814i f28956a = new C2814i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final C2948g f28957b;

    static {
        C2948g c2948gD = C2948g.d();
        AbstractC2757a.a(c2948gD);
        AbstractC2855l.f(c2948gD, "apply(...)");
        f28957b = c2948gD;
    }

    private C2814i() {
    }

    public static /* synthetic */ AbstractC2809d.a d(C2814i c2814i, n nVar, InterfaceC2710c interfaceC2710c, h8.g gVar, boolean z10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = true;
        }
        return c2814i.c(nVar, interfaceC2710c, gVar, z10);
    }

    public static final boolean f(n proto) {
        AbstractC2855l.g(proto, "proto");
        AbstractC2709b.C0287b c0287bA = C2808c.f28934a.a();
        Object objT = proto.t(AbstractC2757a.f28748e);
        AbstractC2855l.f(objT, "getExtension(...)");
        Boolean boolD = c0287bA.d(((Number) objT).intValue());
        AbstractC2855l.f(boolD, "get(...)");
        return boolD.booleanValue();
    }

    private final String g(q qVar, InterfaceC2710c interfaceC2710c) {
        if (qVar.k0()) {
            return C2807b.b(interfaceC2710c.a(qVar.V()));
        }
        return null;
    }

    public static final Pair h(byte[] bytes, String[] strings) {
        AbstractC2855l.g(bytes, "bytes");
        AbstractC2855l.g(strings, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        return new Pair(f28956a.k(byteArrayInputStream, strings), f8.c.w1(byteArrayInputStream, f28957b));
    }

    public static final Pair i(String[] data, String[] strings) {
        AbstractC2855l.g(data, "data");
        AbstractC2855l.g(strings, "strings");
        byte[] bArrE = AbstractC2806a.e(data);
        AbstractC2855l.f(bArrE, "decodeBytes(...)");
        return h(bArrE, strings);
    }

    public static final Pair j(String[] data, String[] strings) {
        AbstractC2855l.g(data, "data");
        AbstractC2855l.g(strings, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(AbstractC2806a.e(data));
        return new Pair(f28956a.k(byteArrayInputStream, strings), f8.i.E0(byteArrayInputStream, f28957b));
    }

    private final C2811f k(InputStream inputStream, String[] strArr) {
        AbstractC2757a.e eVarC = AbstractC2757a.e.C(inputStream, f28957b);
        AbstractC2855l.f(eVarC, "parseDelimitedFrom(...)");
        return new C2811f(eVarC, strArr);
    }

    public static final Pair l(byte[] bytes, String[] strings) {
        AbstractC2855l.g(bytes, "bytes");
        AbstractC2855l.g(strings, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        return new Pair(f28956a.k(byteArrayInputStream, strings), l.c0(byteArrayInputStream, f28957b));
    }

    public static final Pair m(String[] data, String[] strings) {
        AbstractC2855l.g(data, "data");
        AbstractC2855l.g(strings, "strings");
        byte[] bArrE = AbstractC2806a.e(data);
        AbstractC2855l.f(bArrE, "decodeBytes(...)");
        return l(bArrE, strings);
    }

    public final C2948g a() {
        return f28957b;
    }

    public final AbstractC2809d.b b(f8.d proto, InterfaceC2710c nameResolver, h8.g typeTable) {
        String strO0;
        AbstractC2855l.g(proto, "proto");
        AbstractC2855l.g(nameResolver, "nameResolver");
        AbstractC2855l.g(typeTable, "typeTable");
        AbstractC2950i.f constructorSignature = AbstractC2757a.f28744a;
        AbstractC2855l.f(constructorSignature, "constructorSignature");
        AbstractC2757a.c cVar = (AbstractC2757a.c) h8.e.a(proto, constructorSignature);
        String string = (cVar == null || !cVar.y()) ? "<init>" : nameResolver.getString(cVar.w());
        if (cVar == null || !cVar.x()) {
            List<u> listL = proto.L();
            AbstractC2855l.f(listL, "getValueParameterList(...)");
            ArrayList arrayList = new ArrayList(AbstractC2800q.u(listL, 10));
            for (u uVar : listL) {
                C2814i c2814i = f28956a;
                AbstractC2855l.d(uVar);
                String strG = c2814i.g(h8.f.q(uVar, typeTable), nameResolver);
                if (strG == null) {
                    return null;
                }
                arrayList.add(strG);
            }
            strO0 = AbstractC2800q.o0(arrayList, PointerEventHelper.POINTER_TYPE_UNKNOWN, "(", ")V", 0, null, null, 56, null);
        } else {
            strO0 = nameResolver.getString(cVar.v());
        }
        return new AbstractC2809d.b(string, strO0);
    }

    public final AbstractC2809d.a c(n proto, InterfaceC2710c nameResolver, h8.g typeTable, boolean z10) {
        String strG;
        AbstractC2855l.g(proto, "proto");
        AbstractC2855l.g(nameResolver, "nameResolver");
        AbstractC2855l.g(typeTable, "typeTable");
        AbstractC2950i.f propertySignature = AbstractC2757a.f28747d;
        AbstractC2855l.f(propertySignature, "propertySignature");
        AbstractC2757a.d dVar = (AbstractC2757a.d) h8.e.a(proto, propertySignature);
        if (dVar == null) {
            return null;
        }
        AbstractC2757a.b bVarZ = dVar.E() ? dVar.z() : null;
        if (bVarZ == null && z10) {
            return null;
        }
        int iB0 = (bVarZ == null || !bVarZ.y()) ? proto.b0() : bVarZ.w();
        if (bVarZ == null || !bVarZ.x()) {
            strG = g(h8.f.n(proto, typeTable), nameResolver);
            if (strG == null) {
                return null;
            }
        } else {
            strG = nameResolver.getString(bVarZ.v());
        }
        return new AbstractC2809d.a(nameResolver.getString(iB0), strG);
    }

    public final AbstractC2809d.b e(f8.i proto, InterfaceC2710c nameResolver, h8.g typeTable) {
        String string;
        AbstractC2855l.g(proto, "proto");
        AbstractC2855l.g(nameResolver, "nameResolver");
        AbstractC2855l.g(typeTable, "typeTable");
        AbstractC2950i.f methodSignature = AbstractC2757a.f28745b;
        AbstractC2855l.f(methodSignature, "methodSignature");
        AbstractC2757a.c cVar = (AbstractC2757a.c) h8.e.a(proto, methodSignature);
        int iC0 = (cVar == null || !cVar.y()) ? proto.c0() : cVar.w();
        if (cVar == null || !cVar.x()) {
            List listN = AbstractC2800q.n(h8.f.k(proto, typeTable));
            List<u> listP0 = proto.p0();
            AbstractC2855l.f(listP0, "getValueParameterList(...)");
            ArrayList arrayList = new ArrayList(AbstractC2800q.u(listP0, 10));
            for (u uVar : listP0) {
                AbstractC2855l.d(uVar);
                arrayList.add(h8.f.q(uVar, typeTable));
            }
            List listZ0 = AbstractC2800q.z0(listN, arrayList);
            ArrayList arrayList2 = new ArrayList(AbstractC2800q.u(listZ0, 10));
            Iterator it = listZ0.iterator();
            while (it.hasNext()) {
                String strG = f28956a.g((q) it.next(), nameResolver);
                if (strG == null) {
                    return null;
                }
                arrayList2.add(strG);
            }
            String strG2 = g(h8.f.m(proto, typeTable), nameResolver);
            if (strG2 == null) {
                return null;
            }
            string = AbstractC2800q.o0(arrayList2, PointerEventHelper.POINTER_TYPE_UNKNOWN, "(", ")", 0, null, null, 56, null) + strG2;
        } else {
            string = nameResolver.getString(cVar.v());
        }
        return new AbstractC2809d.b(nameResolver.getString(iC0), string);
    }
}
