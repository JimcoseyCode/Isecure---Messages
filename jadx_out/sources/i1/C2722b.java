package i1;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1764k;
import androidx.lifecycle.InterfaceC1768o;
import androidx.lifecycle.r;
import h1.AbstractC2694c;
import h1.AbstractC2701j;
import h1.C2697f;
import h1.InterfaceC2700i;
import i7.C2735B;
import i7.t;
import j7.K;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w7.InterfaceC3487a;

/* JADX INFO: renamed from: i1.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C2722b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final a f28677i = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC2700i f28678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3487a f28679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C2723c f28680c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f28681d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f28682e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Bundle f28683f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f28684g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f28685h;

    /* JADX INFO: renamed from: i1.b$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C2722b(InterfaceC2700i owner, InterfaceC3487a onAttach) {
        AbstractC2855l.g(owner, "owner");
        AbstractC2855l.g(onAttach, "onAttach");
        this.f28678a = owner;
        this.f28679b = onAttach;
        this.f28680c = new C2723c();
        this.f28681d = new LinkedHashMap();
        this.f28685h = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(C2722b c2722b, r rVar, AbstractC1764k.a event) {
        AbstractC2855l.g(rVar, "<unused var>");
        AbstractC2855l.g(event, "event");
        if (event == AbstractC1764k.a.ON_START) {
            c2722b.f28685h = true;
        } else if (event == AbstractC1764k.a.ON_STOP) {
            c2722b.f28685h = false;
        }
    }

    public final Bundle c(String key) {
        AbstractC2855l.g(key, "key");
        if (!this.f28684g) {
            throw new IllegalStateException("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
        }
        Bundle bundle = this.f28683f;
        if (bundle == null) {
            return null;
        }
        Bundle bundleA = AbstractC2694c.a(bundle);
        Bundle bundleC = AbstractC2694c.b(bundleA, key) ? AbstractC2694c.c(bundleA, key) : null;
        AbstractC2701j.e(AbstractC2701j.a(bundle), key);
        if (AbstractC2694c.f(AbstractC2694c.a(bundle))) {
            this.f28683f = null;
        }
        return bundleC;
    }

    public final C2697f.b d(String key) {
        C2697f.b bVar;
        AbstractC2855l.g(key, "key");
        synchronized (this.f28680c) {
            Iterator it = this.f28681d.entrySet().iterator();
            do {
                bVar = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                C2697f.b bVar2 = (C2697f.b) entry.getValue();
                if (AbstractC2855l.b(str, key)) {
                    bVar = bVar2;
                }
            } while (bVar == null);
        }
        return bVar;
    }

    public final boolean e() {
        return this.f28685h;
    }

    public final void f() {
        if (this.f28678a.getLifecycle().b() != AbstractC1764k.b.f17591h) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        if (this.f28682e) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        this.f28679b.invoke();
        this.f28678a.getLifecycle().a(new InterfaceC1768o() { // from class: i1.a
            @Override // androidx.lifecycle.InterfaceC1768o
            public final void k(r rVar, AbstractC1764k.a aVar) {
                C2722b.g(this.f28676g, rVar, aVar);
            }
        });
        this.f28682e = true;
    }

    public final void h(Bundle bundle) {
        if (!this.f28682e) {
            f();
        }
        if (this.f28678a.getLifecycle().b().j(AbstractC1764k.b.f17593j)) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + this.f28678a.getLifecycle().b()).toString());
        }
        if (this.f28684g) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        Bundle bundleC = null;
        if (bundle != null) {
            Bundle bundleA = AbstractC2694c.a(bundle);
            if (AbstractC2694c.b(bundleA, "androidx.lifecycle.BundlableSavedStateRegistry.key")) {
                bundleC = AbstractC2694c.c(bundleA, "androidx.lifecycle.BundlableSavedStateRegistry.key");
            }
        }
        this.f28683f = bundleC;
        this.f28684g = true;
    }

    public final void i(Bundle outBundle) {
        Pair[] pairArr;
        AbstractC2855l.g(outBundle, "outBundle");
        Map mapI = K.i();
        if (mapI.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(mapI.size());
            for (Map.Entry entry : mapI.entrySet()) {
                arrayList.add(t.a((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleA = D0.c.a((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        Bundle bundleA2 = AbstractC2701j.a(bundleA);
        Bundle bundle = this.f28683f;
        if (bundle != null) {
            AbstractC2701j.b(bundleA2, bundle);
        }
        synchronized (this.f28680c) {
            try {
                for (Map.Entry entry2 : this.f28681d.entrySet()) {
                    AbstractC2701j.c(bundleA2, (String) entry2.getKey(), ((C2697f.b) entry2.getValue()).a());
                }
                C2735B c2735b = C2735B.f28704a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (AbstractC2694c.f(AbstractC2694c.a(bundleA))) {
            return;
        }
        AbstractC2701j.c(AbstractC2701j.a(outBundle), "androidx.lifecycle.BundlableSavedStateRegistry.key", bundleA);
    }

    public final void j(String key, C2697f.b provider) {
        AbstractC2855l.g(key, "key");
        AbstractC2855l.g(provider, "provider");
        synchronized (this.f28680c) {
            if (this.f28681d.containsKey(key)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            this.f28681d.put(key, provider);
            C2735B c2735b = C2735B.f28704a;
        }
    }
}
