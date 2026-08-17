package androidx.lifecycle;

import android.os.Bundle;
import h1.AbstractC2694c;
import h1.AbstractC2701j;
import h1.C2697f;
import i7.AbstractC2746i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC2855l;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class N implements C2697f.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2697f f17546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f17547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bundle f17548c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f17549d;

    public N(C2697f savedStateRegistry, final W viewModelStoreOwner) {
        AbstractC2855l.g(savedStateRegistry, "savedStateRegistry");
        AbstractC2855l.g(viewModelStoreOwner, "viewModelStoreOwner");
        this.f17546a = savedStateRegistry;
        this.f17549d = AbstractC2746i.b(new InterfaceC3487a() { // from class: androidx.lifecycle.M
            @Override // w7.InterfaceC3487a
            public final Object invoke() {
                return N.f(viewModelStoreOwner);
            }
        });
    }

    private final O d() {
        return (O) this.f17549d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final O f(W w10) {
        return L.e(w10);
    }

    @Override // h1.C2697f.b
    public Bundle a() {
        Pair[] pairArr;
        Map mapI = j7.K.i();
        if (mapI.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(mapI.size());
            for (Map.Entry entry : mapI.entrySet()) {
                arrayList.add(i7.t.a((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleA = D0.c.a((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        Bundle bundleA2 = AbstractC2701j.a(bundleA);
        Bundle bundle = this.f17548c;
        if (bundle != null) {
            AbstractC2701j.b(bundleA2, bundle);
        }
        for (Map.Entry entry2 : d().e().entrySet()) {
            String str = (String) entry2.getKey();
            Bundle bundleA3 = ((I) entry2.getValue()).a().a();
            if (!AbstractC2694c.f(AbstractC2694c.a(bundleA3))) {
                AbstractC2701j.c(bundleA2, str, bundleA3);
            }
        }
        this.f17547b = false;
        return bundleA;
    }

    public final Bundle c(String key) {
        Pair[] pairArr;
        AbstractC2855l.g(key, "key");
        e();
        Bundle bundle = this.f17548c;
        if (bundle == null || !AbstractC2694c.b(AbstractC2694c.a(bundle), key)) {
            return null;
        }
        Bundle bundleD = AbstractC2694c.d(AbstractC2694c.a(bundle), key);
        if (bundleD == null) {
            Map mapI = j7.K.i();
            if (mapI.isEmpty()) {
                pairArr = new Pair[0];
            } else {
                ArrayList arrayList = new ArrayList(mapI.size());
                for (Map.Entry entry : mapI.entrySet()) {
                    arrayList.add(i7.t.a((String) entry.getKey(), entry.getValue()));
                }
                pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
            }
            bundleD = D0.c.a((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
            AbstractC2701j.a(bundleD);
        }
        AbstractC2701j.e(AbstractC2701j.a(bundle), key);
        if (AbstractC2694c.f(AbstractC2694c.a(bundle))) {
            this.f17548c = null;
        }
        return bundleD;
    }

    public final void e() {
        Pair[] pairArr;
        if (this.f17547b) {
            return;
        }
        Bundle bundleA = this.f17546a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Map mapI = j7.K.i();
        if (mapI.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(mapI.size());
            for (Map.Entry entry : mapI.entrySet()) {
                arrayList.add(i7.t.a((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleA2 = D0.c.a((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        Bundle bundleA3 = AbstractC2701j.a(bundleA2);
        Bundle bundle = this.f17548c;
        if (bundle != null) {
            AbstractC2701j.b(bundleA3, bundle);
        }
        if (bundleA != null) {
            AbstractC2701j.b(bundleA3, bundleA);
        }
        this.f17548c = bundleA2;
        this.f17547b = true;
        d();
    }
}
