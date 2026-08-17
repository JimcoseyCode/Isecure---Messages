package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1764k;
import androidx.lifecycle.U;
import d1.AbstractC2320a;
import h1.C2697f;
import h1.InterfaceC2700i;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC2320a.c f17542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC2320a.c f17543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AbstractC2320a.c f17544c;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a implements U.c {
        a() {
        }

        @Override // androidx.lifecycle.U.c
        public T c(C7.d modelClass, AbstractC2320a extras) {
            AbstractC2855l.g(modelClass, "modelClass");
            AbstractC2855l.g(extras, "extras");
            return new O();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b implements AbstractC2320a.c {
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class c implements AbstractC2320a.c {
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class d implements AbstractC2320a.c {
    }

    static {
        AbstractC2320a.C0246a c0246a = AbstractC2320a.f25549b;
        f17542a = new b();
        f17543b = new c();
        f17544c = new d();
    }

    public static final I a(AbstractC2320a abstractC2320a) {
        AbstractC2855l.g(abstractC2320a, "<this>");
        InterfaceC2700i interfaceC2700i = (InterfaceC2700i) abstractC2320a.a(f17542a);
        if (interfaceC2700i == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        W w10 = (W) abstractC2320a.a(f17543b);
        if (w10 == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) abstractC2320a.a(f17544c);
        String str = (String) abstractC2320a.a(U.f17560c);
        if (str != null) {
            return b(interfaceC2700i, w10, str, bundle);
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
    }

    private static final I b(InterfaceC2700i interfaceC2700i, W w10, String str, Bundle bundle) {
        N nD = d(interfaceC2700i);
        O oE = e(w10);
        I i10 = (I) oE.e().get(str);
        if (i10 != null) {
            return i10;
        }
        I iA = I.f17535c.a(nD.c(str), bundle);
        oE.e().put(str, iA);
        return iA;
    }

    public static final void c(InterfaceC2700i interfaceC2700i) {
        AbstractC2855l.g(interfaceC2700i, "<this>");
        AbstractC1764k.b bVarB = interfaceC2700i.getLifecycle().b();
        if (bVarB != AbstractC1764k.b.f17591h && bVarB != AbstractC1764k.b.f17592i) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (interfaceC2700i.getSavedStateRegistry().b("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            N n10 = new N(interfaceC2700i.getSavedStateRegistry(), (W) interfaceC2700i);
            interfaceC2700i.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider", n10);
            interfaceC2700i.getLifecycle().a(new J(n10));
        }
    }

    public static final N d(InterfaceC2700i interfaceC2700i) {
        AbstractC2855l.g(interfaceC2700i, "<this>");
        C2697f.b bVarB = interfaceC2700i.getSavedStateRegistry().b("androidx.lifecycle.internal.SavedStateHandlesProvider");
        N n10 = bVarB instanceof N ? (N) bVarB : null;
        if (n10 != null) {
            return n10;
        }
        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    }

    public static final O e(W w10) {
        AbstractC2855l.g(w10, "<this>");
        return (O) U.b.b(U.f17559b, w10, new a(), null, 4, null).c("androidx.lifecycle.internal.SavedStateHandlesVM", kotlin.jvm.internal.D.b(O.class));
    }
}
