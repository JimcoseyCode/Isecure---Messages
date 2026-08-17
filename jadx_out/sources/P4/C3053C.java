package p4;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.AbstractActivityC1749q;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import m0.C2892a;

/* JADX INFO: renamed from: p4.C, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C3053C extends Fragment implements InterfaceC3058e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final WeakHashMap f30629j = new WeakHashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map f30630g = Collections.synchronizedMap(new C2892a());

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f30631h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Bundle f30632i;

    public static C3053C y(AbstractActivityC1749q abstractActivityC1749q) {
        C3053C c3053c;
        WeakHashMap weakHashMap = f30629j;
        WeakReference weakReference = (WeakReference) weakHashMap.get(abstractActivityC1749q);
        if (weakReference != null && (c3053c = (C3053C) weakReference.get()) != null) {
            return c3053c;
        }
        try {
            C3053C c3053c2 = (C3053C) abstractActivityC1749q.getSupportFragmentManager().j0("SupportLifecycleFragmentImpl");
            if (c3053c2 == null || c3053c2.isRemoving()) {
                c3053c2 = new C3053C();
                abstractActivityC1749q.getSupportFragmentManager().o().e(c3053c2, "SupportLifecycleFragmentImpl").i();
            }
            weakHashMap.put(abstractActivityC1749q, new WeakReference(c3053c2));
            return c3053c2;
        } catch (ClassCastException e10) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e10);
        }
    }

    @Override // p4.InterfaceC3058e
    public final void a(String str, LifecycleCallback lifecycleCallback) {
        if (this.f30630g.containsKey(str)) {
            throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
        }
        this.f30630g.put(str, lifecycleCallback);
        if (this.f30631h > 0) {
            new F4.e(Looper.getMainLooper()).post(new RunnableC3052B(this, lifecycleCallback, str));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.f30630g.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // p4.InterfaceC3058e
    public final LifecycleCallback g(String str, Class cls) {
        return (LifecycleCallback) cls.cast(this.f30630g.get(str));
    }

    @Override // p4.InterfaceC3058e
    public final /* synthetic */ Activity h() {
        return getActivity();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        Iterator it = this.f30630g.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).e(i10, i11, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f30631h = 1;
        this.f30632i = bundle;
        for (Map.Entry entry : this.f30630g.entrySet()) {
            ((LifecycleCallback) entry.getValue()).f(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f30631h = 5;
        Iterator it = this.f30630g.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).g();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f30631h = 3;
        Iterator it = this.f30630g.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).h();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.f30630g.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).i(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f30631h = 2;
        Iterator it = this.f30630g.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).j();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f30631h = 4;
        Iterator it = this.f30630g.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).k();
        }
    }
}
