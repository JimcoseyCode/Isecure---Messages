package c8;

import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: c8.Y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1891Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1912j0 f18948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f18949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f18950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C1891Y f18951d;

    public C1891Y(C1912j0 c1912j0, List parametersInfo, String str) {
        AbstractC2855l.g(parametersInfo, "parametersInfo");
        this.f18948a = c1912j0;
        this.f18949b = parametersInfo;
        this.f18950c = str;
        C1891Y c1891y = null;
        if (str != null) {
            C1912j0 c1912j0A = c1912j0 != null ? c1912j0.a() : null;
            ArrayList arrayList = new ArrayList(AbstractC2800q.u(parametersInfo, 10));
            Iterator it = parametersInfo.iterator();
            while (it.hasNext()) {
                C1912j0 c1912j02 = (C1912j0) it.next();
                arrayList.add(c1912j02 != null ? c1912j02.a() : null);
            }
            c1891y = new C1891Y(c1912j0A, arrayList, null);
        }
        this.f18951d = c1891y;
    }

    public final String a() {
        return this.f18950c;
    }

    public final List b() {
        return this.f18949b;
    }

    public final C1912j0 c() {
        return this.f18948a;
    }

    public final C1891Y d() {
        return this.f18951d;
    }
}
