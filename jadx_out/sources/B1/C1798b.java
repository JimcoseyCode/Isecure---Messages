package b1;

import D0.c;
import U8.l;
import android.os.Bundle;
import h1.AbstractC2701j;
import h1.C2697f;
import i7.t;
import j7.K;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: b1.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C1798b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f18635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f18636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f18637c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f18638d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C2697f.b f18639e;

    public C1798b(Map initialState) {
        AbstractC2855l.g(initialState, "initialState");
        this.f18635a = K.w(initialState);
        this.f18636b = new LinkedHashMap();
        this.f18637c = new LinkedHashMap();
        this.f18638d = new LinkedHashMap();
        this.f18639e = new C2697f.b() { // from class: b1.a
            @Override // h1.C2697f.b
            public final Bundle a() {
                return C1798b.c(this.f18634a);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle c(C1798b c1798b) {
        Pair[] pairArr;
        for (Map.Entry entry : K.t(c1798b.f18638d).entrySet()) {
            c1798b.d((String) entry.getKey(), ((l) entry.getValue()).getValue());
        }
        for (Map.Entry entry2 : K.t(c1798b.f18636b).entrySet()) {
            c1798b.d((String) entry2.getKey(), ((C2697f.b) entry2.getValue()).a());
        }
        Map map = c1798b.f18635a;
        if (map.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry entry3 : map.entrySet()) {
                arrayList.add(t.a((String) entry3.getKey(), entry3.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleA = c.a((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        AbstractC2701j.a(bundleA);
        return bundleA;
    }

    public final C2697f.b b() {
        return this.f18639e;
    }

    public final void d(String key, Object obj) {
        AbstractC2855l.g(key, "key");
        this.f18635a.put(key, obj);
        l lVar = (l) this.f18637c.get(key);
        if (lVar != null) {
            lVar.setValue(obj);
        }
        l lVar2 = (l) this.f18638d.get(key);
        if (lVar2 != null) {
            lVar2.setValue(obj);
        }
    }

    public /* synthetic */ C1798b(Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? K.i() : map);
    }
}
