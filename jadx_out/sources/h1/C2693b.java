package h1;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1764k;
import androidx.lifecycle.InterfaceC1768o;
import androidx.lifecycle.r;
import h1.C2697f;
import i7.t;
import j7.AbstractC2800q;
import j7.K;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: h1.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C2693b implements InterfaceC1768o {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f28258h = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC2700i f28259g;

    /* JADX INFO: renamed from: h1.b$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: h1.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class C0284b implements C2697f.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Set f28260a;

        public C0284b(C2697f registry) {
            AbstractC2855l.g(registry, "registry");
            this.f28260a = new LinkedHashSet();
            registry.c("androidx.savedstate.Restarter", this);
        }

        @Override // h1.C2697f.b
        public Bundle a() {
            Pair[] pairArr;
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
            AbstractC2701j.d(AbstractC2701j.a(bundleA), "classes_to_restore", AbstractC2800q.P0(this.f28260a));
            return bundleA;
        }

        public final void b(String className) {
            AbstractC2855l.g(className, "className");
            this.f28260a.add(className);
        }
    }

    public C2693b(InterfaceC2700i owner) {
        AbstractC2855l.g(owner, "owner");
        this.f28259g = owner;
    }

    private final void a(String str) {
        try {
            Class<? extends U> clsAsSubclass = Class.forName(str, false, C2693b.class.getClassLoader()).asSubclass(C2697f.a.class);
            AbstractC2855l.d(clsAsSubclass);
            try {
                Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                try {
                    Object objNewInstance = declaredConstructor.newInstance(null);
                    AbstractC2855l.d(objNewInstance);
                    ((C2697f.a) objNewInstance).a(this.f28259g);
                } catch (Exception e10) {
                    throw new RuntimeException("Failed to instantiate " + str, e10);
                }
            } catch (NoSuchMethodException e11) {
                throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e11);
            }
        } catch (ClassNotFoundException e12) {
            throw new RuntimeException("Class " + str + " wasn't found", e12);
        }
    }

    @Override // androidx.lifecycle.InterfaceC1768o
    public void k(r source, AbstractC1764k.a event) {
        AbstractC2855l.g(source, "source");
        AbstractC2855l.g(event, "event");
        if (event != AbstractC1764k.a.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        source.getLifecycle().d(this);
        Bundle bundleA = this.f28259g.getSavedStateRegistry().a("androidx.savedstate.Restarter");
        if (bundleA == null) {
            return;
        }
        List listE = AbstractC2694c.e(AbstractC2694c.a(bundleA), "classes_to_restore");
        if (listE == null) {
            throw new IllegalStateException("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        Iterator it = listE.iterator();
        while (it.hasNext()) {
            a((String) it.next());
        }
    }
}
