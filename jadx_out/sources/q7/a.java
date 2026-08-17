package Q7;

import O7.C1337p;
import d8.AbstractC2375w;
import d8.C2366n;
import d8.InterfaceC2376x;
import e8.C2431a;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import k8.b;
import kotlin.jvm.internal.AbstractC2855l;
import t8.C3381d;
import v8.C3433b;
import v8.InterfaceC3442k;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2366n f9860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f9861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ConcurrentHashMap f9862c;

    public a(C2366n resolver, g kotlinClassFinder) {
        AbstractC2855l.g(resolver, "resolver");
        AbstractC2855l.g(kotlinClassFinder, "kotlinClassFinder");
        this.f9860a = resolver;
        this.f9861b = kotlinClassFinder;
        this.f9862c = new ConcurrentHashMap();
    }

    public final InterfaceC3442k a(f fileClass) {
        Collection collectionE;
        AbstractC2855l.g(fileClass, "fileClass");
        ConcurrentHashMap concurrentHashMap = this.f9862c;
        k8.b bVarC = fileClass.c();
        Object obj = concurrentHashMap.get(bVarC);
        if (obj == null) {
            k8.c cVarF = fileClass.c().f();
            if (fileClass.a().c() == C2431a.EnumC0258a.f25958n) {
                List<String> listF = fileClass.a().f();
                collectionE = new ArrayList();
                for (String str : listF) {
                    b.a aVar = k8.b.f29200d;
                    k8.c cVarE = C3381d.d(str).e();
                    AbstractC2855l.f(cVarE, "getFqNameForTopLevelClassMaybeWithDollars(...)");
                    InterfaceC2376x interfaceC2376xB = AbstractC2375w.b(this.f9861b, aVar.c(cVarE), M8.c.a(this.f9860a.f().g()));
                    if (interfaceC2376xB != null) {
                        collectionE.add(interfaceC2376xB);
                    }
                }
            } else {
                collectionE = AbstractC2800q.e(fileClass);
            }
            C1337p c1337p = new C1337p(this.f9860a.f().q(), cVarF);
            ArrayList arrayList = new ArrayList();
            Iterator it = collectionE.iterator();
            while (it.hasNext()) {
                InterfaceC3442k interfaceC3442kC = this.f9860a.c(c1337p, (InterfaceC2376x) it.next());
                if (interfaceC3442kC != null) {
                    arrayList.add(interfaceC3442kC);
                }
            }
            List listP0 = AbstractC2800q.P0(arrayList);
            InterfaceC3442k interfaceC3442kA = C3433b.f32949d.a("package " + cVarF + " (" + fileClass + ')', listP0);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(bVarC, interfaceC3442kA);
            obj = objPutIfAbsent == null ? interfaceC3442kA : objPutIfAbsent;
        }
        AbstractC2855l.f(obj, "getOrPut(...)");
        return (InterfaceC3442k) obj;
    }
}
