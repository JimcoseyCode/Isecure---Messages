package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1764k;
import h1.C2697f;
import h1.InterfaceC2700i;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: androidx.lifecycle.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C1763j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1763j f17584a = new C1763j();

    /* JADX INFO: renamed from: androidx.lifecycle.j$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a implements C2697f.a {
        @Override // h1.C2697f.a
        public void a(InterfaceC2700i owner) {
            AbstractC2855l.g(owner, "owner");
            if (!(owner instanceof W)) {
                throw new IllegalStateException(("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: " + owner).toString());
            }
            V viewModelStore = ((W) owner).getViewModelStore();
            C2697f savedStateRegistry = owner.getSavedStateRegistry();
            Iterator it = viewModelStore.c().iterator();
            while (it.hasNext()) {
                T tB = viewModelStore.b((String) it.next());
                if (tB != null) {
                    C1763j.a(tB, savedStateRegistry, owner.getLifecycle());
                }
            }
            if (viewModelStore.c().isEmpty()) {
                return;
            }
            savedStateRegistry.d(a.class);
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.j$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b implements InterfaceC1768o {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ AbstractC1764k f17585g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ C2697f f17586h;

        b(AbstractC1764k abstractC1764k, C2697f c2697f) {
            this.f17585g = abstractC1764k;
            this.f17586h = c2697f;
        }

        @Override // androidx.lifecycle.InterfaceC1768o
        public void k(r source, AbstractC1764k.a event) {
            AbstractC2855l.g(source, "source");
            AbstractC2855l.g(event, "event");
            if (event == AbstractC1764k.a.ON_START) {
                this.f17585g.d(this);
                this.f17586h.d(a.class);
            }
        }
    }

    private C1763j() {
    }

    public static final void a(T viewModel, C2697f registry, AbstractC1764k lifecycle) {
        AbstractC2855l.g(viewModel, "viewModel");
        AbstractC2855l.g(registry, "registry");
        AbstractC2855l.g(lifecycle, "lifecycle");
        K k10 = (K) viewModel.c("androidx.lifecycle.savedstate.vm.tag");
        if (k10 == null || k10.r()) {
            return;
        }
        k10.d(registry, lifecycle);
        f17584a.c(registry, lifecycle);
    }

    public static final K b(C2697f registry, AbstractC1764k lifecycle, String str, Bundle bundle) {
        AbstractC2855l.g(registry, "registry");
        AbstractC2855l.g(lifecycle, "lifecycle");
        AbstractC2855l.d(str);
        K k10 = new K(str, I.f17535c.a(registry.a(str), bundle));
        k10.d(registry, lifecycle);
        f17584a.c(registry, lifecycle);
        return k10;
    }

    private final void c(C2697f c2697f, AbstractC1764k abstractC1764k) {
        AbstractC1764k.b bVarB = abstractC1764k.b();
        if (bVarB == AbstractC1764k.b.f17591h || bVarB.j(AbstractC1764k.b.f17593j)) {
            c2697f.d(a.class);
        } else {
            abstractC1764k.a(new b(abstractC1764k, c2697f));
        }
    }
}
