package J7;

import B8.n;
import J7.g;
import L7.H;
import L7.InterfaceC1280e;
import P8.q;
import j7.AbstractC2800q;
import j7.T;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements N7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f6801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final H f6802b;

    public a(n storageManager, H module) {
        AbstractC2855l.g(storageManager, "storageManager");
        AbstractC2855l.g(module, "module");
        this.f6801a = storageManager;
        this.f6802b = module;
    }

    @Override // N7.b
    public Collection a(k8.c packageFqName) {
        AbstractC2855l.g(packageFqName, "packageFqName");
        return T.e();
    }

    @Override // N7.b
    public boolean b(k8.c packageFqName, k8.f name) {
        AbstractC2855l.g(packageFqName, "packageFqName");
        AbstractC2855l.g(name, "name");
        String strJ = name.j();
        AbstractC2855l.f(strJ, "asString(...)");
        return (q.K(strJ, "Function", false, 2, null) || q.K(strJ, "KFunction", false, 2, null) || q.K(strJ, "SuspendFunction", false, 2, null) || q.K(strJ, "KSuspendFunction", false, 2, null)) && g.f6832c.a().c(packageFqName, strJ) != null;
    }

    @Override // N7.b
    public InterfaceC1280e c(k8.b classId) {
        k8.c cVarF;
        g.b bVarC;
        AbstractC2855l.g(classId, "classId");
        if (classId.i() || classId.j()) {
            return null;
        }
        String strB = classId.g().b();
        AbstractC2855l.f(strB, "asString(...)");
        if (!q.Q(strB, "Function", false, 2, null) || (bVarC = g.f6832c.a().c((cVarF = classId.f()), strB)) == null) {
            return null;
        }
        f fVarA = bVarC.a();
        int iB = bVarC.b();
        List listH = this.f6802b.e0(cVarF).H();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listH) {
            if (obj instanceof I7.c) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            it.next();
        }
        android.support.v4.media.session.b.a(AbstractC2800q.g0(arrayList2));
        return new b(this.f6801a, (I7.c) AbstractC2800q.e0(arrayList), fVarA, iB);
    }
}
