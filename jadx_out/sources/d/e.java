package d;

import O8.l;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import androidx.lifecycle.AbstractC1764k;
import androidx.lifecycle.InterfaceC1768o;
import androidx.lifecycle.r;
import e.AbstractC2379a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.I;
import w7.InterfaceC3487a;
import z7.AbstractC3691c;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final b f25519h = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f25520a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f25521b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f25522c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f25523d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient Map f25524e = new LinkedHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f25525f = new LinkedHashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Bundle f25526g = new Bundle();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InterfaceC2313a f25527a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AbstractC2379a f25528b;

        public a(InterfaceC2313a callback, AbstractC2379a contract) {
            AbstractC2855l.g(callback, "callback");
            AbstractC2855l.g(contract, "contract");
            this.f25527a = callback;
            this.f25528b = contract;
        }

        public final InterfaceC2313a a() {
            return this.f25527a;
        }

        public final AbstractC2379a b() {
            return this.f25528b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AbstractC1764k f25529a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f25530b;

        public c(AbstractC1764k lifecycle) {
            AbstractC2855l.g(lifecycle, "lifecycle");
            this.f25529a = lifecycle;
            this.f25530b = new ArrayList();
        }

        public final void a(InterfaceC1768o observer) {
            AbstractC2855l.g(observer, "observer");
            this.f25529a.a(observer);
            this.f25530b.add(observer);
        }

        public final void b() {
            Iterator it = this.f25530b.iterator();
            while (it.hasNext()) {
                this.f25529a.d((InterfaceC1768o) it.next());
            }
            this.f25530b.clear();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class d extends AbstractC2314b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f25532b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC2379a f25533c;

        d(String str, AbstractC2379a abstractC2379a) {
            this.f25532b = str;
            this.f25533c = abstractC2379a;
        }

        @Override // d.AbstractC2314b
        public void b(Object obj, androidx.core.app.c cVar) throws Exception {
            Object obj2 = e.this.f25521b.get(this.f25532b);
            AbstractC2379a abstractC2379a = this.f25533c;
            if (obj2 != null) {
                int iIntValue = ((Number) obj2).intValue();
                e.this.f25523d.add(this.f25532b);
                try {
                    e.this.k(iIntValue, this.f25533c, obj, cVar);
                    return;
                } catch (Exception e10) {
                    e.this.f25523d.remove(this.f25532b);
                    throw e10;
                }
            }
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + abstractC2379a + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }

        @Override // d.AbstractC2314b
        public void c() {
            e.this.r(this.f25532b);
        }
    }

    /* JADX INFO: renamed from: d.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class C0245e extends AbstractC2314b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f25535b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC2379a f25536c;

        C0245e(String str, AbstractC2379a abstractC2379a) {
            this.f25535b = str;
            this.f25536c = abstractC2379a;
        }

        @Override // d.AbstractC2314b
        public void b(Object obj, androidx.core.app.c cVar) throws Exception {
            Object obj2 = e.this.f25521b.get(this.f25535b);
            AbstractC2379a abstractC2379a = this.f25536c;
            if (obj2 != null) {
                int iIntValue = ((Number) obj2).intValue();
                e.this.f25523d.add(this.f25535b);
                try {
                    e.this.k(iIntValue, this.f25536c, obj, cVar);
                    return;
                } catch (Exception e10) {
                    e.this.f25523d.remove(this.f25535b);
                    throw e10;
                }
            }
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + abstractC2379a + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }

        @Override // d.AbstractC2314b
        public void c() {
            e.this.r(this.f25535b);
        }
    }

    private final void e(int i10, String str) {
        this.f25520a.put(Integer.valueOf(i10), str);
        this.f25521b.put(str, Integer.valueOf(i10));
    }

    private final void h(String str, int i10, Intent intent, a aVar) {
        if ((aVar != null ? aVar.a() : null) == null || !this.f25523d.contains(str)) {
            this.f25525f.remove(str);
            this.f25526g.putParcelable(str, new ActivityResult(i10, intent));
        } else {
            aVar.a().onActivityResult(aVar.b().c(i10, intent));
            this.f25523d.remove(str);
        }
    }

    private final int i() {
        for (Number number : l.o(new InterfaceC3487a() { // from class: d.d
            @Override // w7.InterfaceC3487a
            public final Object invoke() {
                return e.j();
            }
        })) {
            if (!this.f25520a.containsKey(Integer.valueOf(number.intValue()))) {
                return number.intValue();
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer j() {
        return Integer.valueOf(AbstractC3691c.f34289g.b(2147418112) + 65536);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(e eVar, String str, InterfaceC2313a interfaceC2313a, AbstractC2379a abstractC2379a, r rVar, AbstractC1764k.a event) {
        AbstractC2855l.g(rVar, "<unused var>");
        AbstractC2855l.g(event, "event");
        if (AbstractC1764k.a.ON_START != event) {
            if (AbstractC1764k.a.ON_STOP == event) {
                eVar.f25524e.remove(str);
                return;
            } else {
                if (AbstractC1764k.a.ON_DESTROY == event) {
                    eVar.r(str);
                    return;
                }
                return;
            }
        }
        eVar.f25524e.put(str, new a(interfaceC2313a, abstractC2379a));
        if (eVar.f25525f.containsKey(str)) {
            Object obj = eVar.f25525f.get(str);
            eVar.f25525f.remove(str);
            interfaceC2313a.onActivityResult(obj);
        }
        ActivityResult activityResult = (ActivityResult) D0.b.a(eVar.f25526g, str, ActivityResult.class);
        if (activityResult != null) {
            eVar.f25526g.remove(str);
            interfaceC2313a.onActivityResult(abstractC2379a.c(activityResult.getResultCode(), activityResult.getData()));
        }
    }

    private final void q(String str) {
        if (((Integer) this.f25521b.get(str)) != null) {
            return;
        }
        e(i(), str);
    }

    public final boolean f(int i10, int i11, Intent intent) {
        String str = (String) this.f25520a.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        h(str, i11, intent, (a) this.f25524e.get(str));
        return true;
    }

    public final boolean g(int i10, Object obj) {
        String str = (String) this.f25520a.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        a aVar = (a) this.f25524e.get(str);
        if ((aVar != null ? aVar.a() : null) == null) {
            this.f25526g.remove(str);
            this.f25525f.put(str, obj);
            return true;
        }
        InterfaceC2313a interfaceC2313aA = aVar.a();
        AbstractC2855l.e(interfaceC2313aA, "null cannot be cast to non-null type androidx.activity.result.ActivityResultCallback<O of androidx.activity.result.ActivityResultRegistry.dispatchResult>");
        if (!this.f25523d.remove(str)) {
            return true;
        }
        interfaceC2313aA.onActivityResult(obj);
        return true;
    }

    public abstract void k(int i10, AbstractC2379a abstractC2379a, Object obj, androidx.core.app.c cVar);

    public final void l(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
        if (stringArrayList2 != null) {
            this.f25523d.addAll(stringArrayList2);
        }
        Bundle bundle2 = bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
        if (bundle2 != null) {
            this.f25526g.putAll(bundle2);
        }
        int size = stringArrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            String str = stringArrayList.get(i10);
            if (this.f25521b.containsKey(str)) {
                Integer num = (Integer) this.f25521b.remove(str);
                if (!this.f25526g.containsKey(str)) {
                    I.c(this.f25520a).remove(num);
                }
            }
            Integer num2 = integerArrayList.get(i10);
            AbstractC2855l.f(num2, "get(...)");
            int iIntValue = num2.intValue();
            String str2 = stringArrayList.get(i10);
            AbstractC2855l.f(str2, "get(...)");
            e(iIntValue, str2);
        }
    }

    public final void m(Bundle outState) {
        AbstractC2855l.g(outState, "outState");
        outState.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(this.f25521b.values()));
        outState.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(this.f25521b.keySet()));
        outState.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.f25523d));
        outState.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(this.f25526g));
    }

    public final AbstractC2314b n(final String key, r lifecycleOwner, final AbstractC2379a contract, final InterfaceC2313a callback) {
        AbstractC2855l.g(key, "key");
        AbstractC2855l.g(lifecycleOwner, "lifecycleOwner");
        AbstractC2855l.g(contract, "contract");
        AbstractC2855l.g(callback, "callback");
        AbstractC1764k lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.b().j(AbstractC1764k.b.f17593j)) {
            throw new IllegalStateException(("LifecycleOwner " + lifecycleOwner + " is attempting to register while current state is " + lifecycle.b() + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        q(key);
        c cVar = (c) this.f25522c.get(key);
        if (cVar == null) {
            cVar = new c(lifecycle);
        }
        cVar.a(new InterfaceC1768o() { // from class: d.c
            @Override // androidx.lifecycle.InterfaceC1768o
            public final void k(r rVar, AbstractC1764k.a aVar) {
                e.p(this.f25515g, key, callback, contract, rVar, aVar);
            }
        });
        this.f25522c.put(key, cVar);
        return new d(key, contract);
    }

    public final AbstractC2314b o(String key, AbstractC2379a contract, InterfaceC2313a callback) {
        AbstractC2855l.g(key, "key");
        AbstractC2855l.g(contract, "contract");
        AbstractC2855l.g(callback, "callback");
        q(key);
        this.f25524e.put(key, new a(callback, contract));
        if (this.f25525f.containsKey(key)) {
            Object obj = this.f25525f.get(key);
            this.f25525f.remove(key);
            callback.onActivityResult(obj);
        }
        ActivityResult activityResult = (ActivityResult) D0.b.a(this.f25526g, key, ActivityResult.class);
        if (activityResult != null) {
            this.f25526g.remove(key);
            callback.onActivityResult(contract.c(activityResult.getResultCode(), activityResult.getData()));
        }
        return new C0245e(key, contract);
    }

    public final void r(String key) {
        Integer num;
        AbstractC2855l.g(key, "key");
        if (!this.f25523d.contains(key) && (num = (Integer) this.f25521b.remove(key)) != null) {
            this.f25520a.remove(num);
        }
        this.f25524e.remove(key);
        if (this.f25525f.containsKey(key)) {
            Objects.toString(this.f25525f.get(key));
            this.f25525f.remove(key);
        }
        if (this.f25526g.containsKey(key)) {
            Objects.toString((ActivityResult) D0.b.a(this.f25526g, key, ActivityResult.class));
            this.f25526g.remove(key);
        }
        c cVar = (c) this.f25522c.get(key);
        if (cVar != null) {
            cVar.b();
            this.f25522c.remove(key);
        }
    }
}
