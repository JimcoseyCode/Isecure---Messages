package s0;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import r0.AbstractC3239b;
import r0.C3242e;
import r0.C3243f;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class o {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static int f32152g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f32154b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f32156d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ArrayList f32153a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f32155c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    ArrayList f32157e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f32158f = -1;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        WeakReference f32159a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f32160b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f32161c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f32162d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f32163e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f32164f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f32165g;

        public a(C3242e c3242e, o0.d dVar, int i10) {
            this.f32159a = new WeakReference(c3242e);
            this.f32160b = dVar.x(c3242e.f31657N);
            this.f32161c = dVar.x(c3242e.f31658O);
            this.f32162d = dVar.x(c3242e.f31659P);
            this.f32163e = dVar.x(c3242e.f31660Q);
            this.f32164f = dVar.x(c3242e.f31661R);
            this.f32165g = i10;
        }
    }

    public o(int i10) {
        int i11 = f32152g;
        f32152g = i11 + 1;
        this.f32154b = i11;
        this.f32156d = i10;
    }

    private String e() {
        int i10 = this.f32156d;
        return i10 == 0 ? "Horizontal" : i10 == 1 ? "Vertical" : i10 == 2 ? "Both" : "Unknown";
    }

    private int j(o0.d dVar, ArrayList arrayList, int i10) {
        int iX;
        int iX2;
        C3243f c3243f = (C3243f) ((C3242e) arrayList.get(0)).K();
        dVar.D();
        c3243f.g(dVar, false);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((C3242e) arrayList.get(i11)).g(dVar, false);
        }
        if (i10 == 0 && c3243f.f31739U0 > 0) {
            AbstractC3239b.b(c3243f, dVar, arrayList, 0);
        }
        if (i10 == 1 && c3243f.f31740V0 > 0) {
            AbstractC3239b.b(c3243f, dVar, arrayList, 1);
        }
        try {
            dVar.z();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        this.f32157e = new ArrayList();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            this.f32157e.add(new a((C3242e) arrayList.get(i12), dVar, i10));
        }
        if (i10 == 0) {
            iX = dVar.x(c3243f.f31657N);
            iX2 = dVar.x(c3243f.f31659P);
            dVar.D();
        } else {
            iX = dVar.x(c3243f.f31658O);
            iX2 = dVar.x(c3243f.f31660Q);
            dVar.D();
        }
        return iX2 - iX;
    }

    public boolean a(C3242e c3242e) {
        if (this.f32153a.contains(c3242e)) {
            return false;
        }
        this.f32153a.add(c3242e);
        return true;
    }

    public void b(ArrayList arrayList) {
        int size = this.f32153a.size();
        if (this.f32158f != -1 && size > 0) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                o oVar = (o) arrayList.get(i10);
                if (this.f32158f == oVar.f32154b) {
                    g(this.f32156d, oVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public int c() {
        return this.f32154b;
    }

    public int d() {
        return this.f32156d;
    }

    public int f(o0.d dVar, int i10) {
        if (this.f32153a.size() == 0) {
            return 0;
        }
        return j(dVar, this.f32153a, i10);
    }

    public void g(int i10, o oVar) {
        for (C3242e c3242e : this.f32153a) {
            oVar.a(c3242e);
            if (i10 == 0) {
                c3242e.f31649G0 = oVar.c();
            } else {
                c3242e.f31651H0 = oVar.c();
            }
        }
        this.f32158f = oVar.f32154b;
    }

    public void h(boolean z10) {
        this.f32155c = z10;
    }

    public void i(int i10) {
        this.f32156d = i10;
    }

    public String toString() {
        String str = e() + " [" + this.f32154b + "] <";
        Iterator it = this.f32153a.iterator();
        while (it.hasNext()) {
            str = str + " " + ((C3242e) it.next()).t();
        }
        return str + " >";
    }
}
