package r;

import F.AbstractC0476d0;
import F.C0473c0;
import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import s.C3294h;
import w.C3453a;
import y.AbstractC3583h0;
import y.C3559D;
import y.C3579f0;
import y.C3598s;
import y.C3600u;
import z.InterfaceC3664a;

/* JADX INFO: renamed from: r.A, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C3141A implements F.K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f30897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3664a f30898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AbstractC0476d0 f30899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C0473c0 f30900d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final s.S f30901e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C3213r1 f30902f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f30903g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final K.m f30905i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final C3559D f30906j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Q0 f30907k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final C3598s f30908l;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map f30904h = new HashMap();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Object f30909m = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private List f30910n = new ArrayList();

    public C3141A(Context context, AbstractC0476d0 abstractC0476d0, C3598s c3598s, long j10, C3559D c3559d, K.m mVar) throws C3579f0 {
        this.f30897a = context;
        this.f30899c = abstractC0476d0;
        s.S sB = s.S.b(context, abstractC0476d0.c());
        this.f30901e = sB;
        this.f30902f = C3213r1.c(context);
        C3453a c3453a = new C3453a(sB);
        this.f30898b = c3453a;
        C0473c0 c0473c0 = new C0473c0(c3453a, 1);
        this.f30900d = c0473c0;
        c3453a.e(c0473c0);
        this.f30903g = j10;
        this.f30905i = mVar;
        this.f30906j = c3559d;
        this.f30908l = c3598s;
        try {
            List listAsList = Arrays.asList(sB.d());
            this.f30907k = new Q0(listAsList, sB, abstractC0476d0.b());
            e(listAsList);
        } catch (C3294h e10) {
            throw new C3579f0(Z0.a(e10));
        }
    }

    private List g(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.equals("0") || str.equals("1")) {
                arrayList.add(str);
            } else if (W0.a(this.f30901e, str)) {
                arrayList.add(str);
            } else {
                AbstractC3583h0.a("Camera2CameraFactory", "Camera " + str + " is filtered out because its capabilities do not contain REQUEST_AVAILABLE_CAPABILITIES_BACKWARD_COMPATIBLE.");
            }
        }
        return arrayList;
    }

    @Override // F.K
    public F.V0 b() {
        return this.f30907k;
    }

    @Override // F.K
    public Set c() {
        LinkedHashSet linkedHashSet;
        synchronized (this.f30909m) {
            linkedHashSet = new LinkedHashSet(this.f30910n);
        }
        return linkedHashSet;
    }

    @Override // F.K
    public F.M d(String str) {
        synchronized (this.f30909m) {
            if (!this.f30910n.contains(str)) {
                throw new IllegalArgumentException("The given camera id is not on the available camera id list.");
            }
        }
        return new V(this.f30897a, this.f30901e, str, h(str), this.f30898b, this.f30900d, this.f30899c.b(), this.f30899c.c(), this.f30902f, this.f30903g, this.f30906j);
    }

    @Override // F.O
    public void e(List list) {
        List listG = g(X0.b(this, this.f30908l, new ArrayList(list)));
        synchronized (this.f30909m) {
            try {
                if (this.f30910n.equals(listG)) {
                    return;
                }
                AbstractC3583h0.a("Camera2CameraFactory", "Updated available camera list: " + this.f30910n + " -> " + listG);
                this.f30910n = listG;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // F.K
    public InterfaceC3664a f() {
        return this.f30898b;
    }

    C3153b0 h(String str) throws C3600u {
        try {
            C3153b0 c3153b0 = (C3153b0) this.f30904h.get(str);
            if (c3153b0 != null) {
                return c3153b0;
            }
            C3153b0 c3153b02 = new C3153b0(str, this.f30901e, this.f30905i);
            this.f30904h.put(str, c3153b02);
            return c3153b02;
        } catch (C3294h e10) {
            throw Z0.a(e10);
        }
    }

    @Override // F.K
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public s.S a() {
        return this.f30901e;
    }

    @Override // F.K
    public void shutdown() {
        this.f30898b.shutdown();
        this.f30907k.h();
    }
}
