package p4;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import m0.C2892a;

/* JADX INFO: renamed from: p4.A, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class FragmentC3051A extends Fragment implements InterfaceC3058e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final WeakHashMap f30622j = new WeakHashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map f30623g = Collections.synchronizedMap(new C2892a());

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f30624h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Bundle f30625i;

    public static FragmentC3051A d(Activity activity) {
        FragmentC3051A fragmentC3051A;
        WeakHashMap weakHashMap = f30622j;
        WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
        if (weakReference != null && (fragmentC3051A = (FragmentC3051A) weakReference.get()) != null) {
            return fragmentC3051A;
        }
        try {
            FragmentC3051A fragmentC3051A2 = (FragmentC3051A) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (fragmentC3051A2 == null || fragmentC3051A2.isRemoving()) {
                fragmentC3051A2 = new FragmentC3051A();
                activity.getFragmentManager().beginTransaction().add(fragmentC3051A2, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap.put(activity, new WeakReference(fragmentC3051A2));
            return fragmentC3051A2;
        } catch (ClassCastException e10) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e10);
        }
    }

    @Override // p4.InterfaceC3058e
    public final void a(String str, LifecycleCallback lifecycleCallback) {
        if (this.f30623g.containsKey(str)) {
            throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
        }
        this.f30623g.put(str, lifecycleCallback);
        if (this.f30624h > 0) {
            new F4.e(Looper.getMainLooper()).post(new RunnableC3079z(this, lifecycleCallback, str));
        }
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.f30623g.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // p4.InterfaceC3058e
    public final LifecycleCallback g(String str, Class cls) {
        return (LifecycleCallback) cls.cast(this.f30623g.get(str));
    }

    @Override // p4.InterfaceC3058e
    public final Activity h() {
        return getActivity();
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        Iterator it = this.f30623g.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).e(i10, i11, intent);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f30624h = 1;
        this.f30625i = bundle;
        for (Map.Entry entry : this.f30623g.entrySet()) {
            ((LifecycleCallback) entry.getValue()).f(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f30624h = 5;
        Iterator it = this.f30623g.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).g();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f30624h = 3;
        Iterator it = this.f30623g.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).h();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.f30623g.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).i(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f30624h = 2;
        Iterator it = this.f30623g.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).j();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f30624h = 4;
        Iterator it = this.f30623g.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).k();
        }
    }
}
