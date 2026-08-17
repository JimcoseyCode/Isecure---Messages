package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.U;
import d1.AbstractC2320a;
import h1.C2697f;
import h1.InterfaceC2700i;
import java.lang.reflect.Constructor;
import kotlin.jvm.internal.AbstractC2855l;
import v7.AbstractC3430a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class P extends U.e implements U.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Application f17551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final U.c f17552c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Bundle f17553d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AbstractC1764k f17554e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C2697f f17555f;

    public P(Application application, InterfaceC2700i owner, Bundle bundle) {
        AbstractC2855l.g(owner, "owner");
        this.f17555f = owner.getSavedStateRegistry();
        this.f17554e = owner.getLifecycle();
        this.f17553d = bundle;
        this.f17551b = application;
        this.f17552c = application != null ? U.a.f17562f.a(application) : new U.a();
    }

    @Override // androidx.lifecycle.U.c
    public T a(Class modelClass) {
        AbstractC2855l.g(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            return e(canonicalName, modelClass);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.U.c
    public T b(Class modelClass, AbstractC2320a extras) {
        AbstractC2855l.g(modelClass, "modelClass");
        AbstractC2855l.g(extras, "extras");
        String str = (String) extras.a(U.f17560c);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (extras.a(L.f17542a) == null || extras.a(L.f17543b) == null) {
            if (this.f17554e != null) {
                return e(str, modelClass);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) extras.a(U.a.f17564h);
        boolean zIsAssignableFrom = AbstractC1754a.class.isAssignableFrom(modelClass);
        Constructor constructorC = (!zIsAssignableFrom || application == null) ? Q.c(modelClass, Q.f17557b) : Q.c(modelClass, Q.f17556a);
        return constructorC == null ? this.f17552c.b(modelClass, extras) : (!zIsAssignableFrom || application == null) ? Q.d(modelClass, constructorC, L.a(extras)) : Q.d(modelClass, constructorC, application, L.a(extras));
    }

    @Override // androidx.lifecycle.U.c
    public T c(C7.d modelClass, AbstractC2320a extras) {
        AbstractC2855l.g(modelClass, "modelClass");
        AbstractC2855l.g(extras, "extras");
        return b(AbstractC3430a.b(modelClass), extras);
    }

    @Override // androidx.lifecycle.U.e
    public void d(T viewModel) {
        AbstractC2855l.g(viewModel, "viewModel");
        if (this.f17554e != null) {
            C2697f c2697f = this.f17555f;
            AbstractC2855l.d(c2697f);
            AbstractC1764k abstractC1764k = this.f17554e;
            AbstractC2855l.d(abstractC1764k);
            C1763j.a(viewModel, c2697f, abstractC1764k);
        }
    }

    public final T e(String key, Class modelClass) {
        T tD;
        Application application;
        AbstractC2855l.g(key, "key");
        AbstractC2855l.g(modelClass, "modelClass");
        AbstractC1764k abstractC1764k = this.f17554e;
        if (abstractC1764k == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = AbstractC1754a.class.isAssignableFrom(modelClass);
        Constructor constructorC = (!zIsAssignableFrom || this.f17551b == null) ? Q.c(modelClass, Q.f17557b) : Q.c(modelClass, Q.f17556a);
        if (constructorC == null) {
            return this.f17551b != null ? this.f17552c.a(modelClass) : U.d.f17568b.a().a(modelClass);
        }
        C2697f c2697f = this.f17555f;
        AbstractC2855l.d(c2697f);
        K kB = C1763j.b(c2697f, abstractC1764k, key, this.f17553d);
        if (!zIsAssignableFrom || (application = this.f17551b) == null) {
            tD = Q.d(modelClass, constructorC, kB.m());
        } else {
            AbstractC2855l.d(application);
            tD = Q.d(modelClass, constructorC, application, kB.m());
        }
        tD.a("androidx.lifecycle.savedstate.vm.tag", kB);
        return tD;
    }
}
