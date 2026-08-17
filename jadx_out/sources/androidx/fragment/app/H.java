package androidx.fragment.app;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f17344a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap f17345b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap f17346c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private E f17347d;

    H() {
    }

    void A(E e10) {
        this.f17347d = e10;
    }

    Bundle B(String str, Bundle bundle) {
        return bundle != null ? (Bundle) this.f17346c.put(str, bundle) : (Bundle) this.f17346c.remove(str);
    }

    void a(Fragment fragment) {
        if (this.f17344a.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.f17344a) {
            this.f17344a.add(fragment);
        }
        fragment.mAdded = true;
    }

    void b() {
        this.f17345b.values().removeAll(Collections.singleton(null));
    }

    boolean c(String str) {
        return this.f17345b.get(str) != null;
    }

    void d(int i10) {
        for (G g10 : this.f17345b.values()) {
            if (g10 != null) {
                g10.s(i10);
            }
        }
    }

    void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.f17345b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (G g10 : this.f17345b.values()) {
                printWriter.print(str);
                if (g10 != null) {
                    Fragment fragmentK = g10.k();
                    printWriter.println(fragmentK);
                    fragmentK.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f17344a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i10 = 0; i10 < size; i10++) {
                Fragment fragment = (Fragment) this.f17344a.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
    }

    Fragment f(String str) {
        G g10 = (G) this.f17345b.get(str);
        if (g10 != null) {
            return g10.k();
        }
        return null;
    }

    Fragment g(int i10) {
        for (int size = this.f17344a.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) this.f17344a.get(size);
            if (fragment != null && fragment.mFragmentId == i10) {
                return fragment;
            }
        }
        for (G g10 : this.f17345b.values()) {
            if (g10 != null) {
                Fragment fragmentK = g10.k();
                if (fragmentK.mFragmentId == i10) {
                    return fragmentK;
                }
            }
        }
        return null;
    }

    Fragment h(String str) {
        if (str != null) {
            for (int size = this.f17344a.size() - 1; size >= 0; size--) {
                Fragment fragment = (Fragment) this.f17344a.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (G g10 : this.f17345b.values()) {
            if (g10 != null) {
                Fragment fragmentK = g10.k();
                if (str.equals(fragmentK.mTag)) {
                    return fragmentK;
                }
            }
        }
        return null;
    }

    Fragment i(String str) {
        Fragment fragmentFindFragmentByWho;
        for (G g10 : this.f17345b.values()) {
            if (g10 != null && (fragmentFindFragmentByWho = g10.k().findFragmentByWho(str)) != null) {
                return fragmentFindFragmentByWho;
            }
        }
        return null;
    }

    int j(Fragment fragment) {
        View view;
        View view2;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup == null) {
            return -1;
        }
        int iIndexOf = this.f17344a.indexOf(fragment);
        for (int i10 = iIndexOf - 1; i10 >= 0; i10--) {
            Fragment fragment2 = (Fragment) this.f17344a.get(i10);
            if (fragment2.mContainer == viewGroup && (view2 = fragment2.mView) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            iIndexOf++;
            if (iIndexOf >= this.f17344a.size()) {
                return -1;
            }
            Fragment fragment3 = (Fragment) this.f17344a.get(iIndexOf);
            if (fragment3.mContainer == viewGroup && (view = fragment3.mView) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    List k() {
        ArrayList arrayList = new ArrayList();
        for (G g10 : this.f17345b.values()) {
            if (g10 != null) {
                arrayList.add(g10);
            }
        }
        return arrayList;
    }

    List l() {
        ArrayList arrayList = new ArrayList();
        for (G g10 : this.f17345b.values()) {
            if (g10 != null) {
                arrayList.add(g10.k());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    HashMap m() {
        return this.f17346c;
    }

    G n(String str) {
        return (G) this.f17345b.get(str);
    }

    List o() {
        ArrayList arrayList;
        if (this.f17344a.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.f17344a) {
            arrayList = new ArrayList(this.f17344a);
        }
        return arrayList;
    }

    E p() {
        return this.f17347d;
    }

    Bundle q(String str) {
        return (Bundle) this.f17346c.get(str);
    }

    void r(G g10) {
        Fragment fragmentK = g10.k();
        if (c(fragmentK.mWho)) {
            return;
        }
        this.f17345b.put(fragmentK.mWho, g10);
        if (fragmentK.mRetainInstanceChangedWhileDetached) {
            if (fragmentK.mRetainInstance) {
                this.f17347d.e(fragmentK);
            } else {
                this.f17347d.o(fragmentK);
            }
            fragmentK.mRetainInstanceChangedWhileDetached = false;
        }
        if (FragmentManager.J0(2)) {
            fragmentK.toString();
        }
    }

    void s(G g10) {
        Fragment fragmentK = g10.k();
        if (fragmentK.mRetainInstance) {
            this.f17347d.o(fragmentK);
        }
        if (this.f17345b.get(fragmentK.mWho) == g10 && ((G) this.f17345b.put(fragmentK.mWho, null)) != null && FragmentManager.J0(2)) {
            fragmentK.toString();
        }
    }

    void t() {
        Iterator it = this.f17344a.iterator();
        while (it.hasNext()) {
            G g10 = (G) this.f17345b.get(((Fragment) it.next()).mWho);
            if (g10 != null) {
                g10.m();
            }
        }
        for (G g11 : this.f17345b.values()) {
            if (g11 != null) {
                g11.m();
                Fragment fragmentK = g11.k();
                if (fragmentK.mRemoving && !fragmentK.isInBackStack()) {
                    if (fragmentK.mBeingSaved && !this.f17346c.containsKey(fragmentK.mWho)) {
                        B(fragmentK.mWho, g11.q());
                    }
                    s(g11);
                }
            }
        }
    }

    void u(Fragment fragment) {
        synchronized (this.f17344a) {
            this.f17344a.remove(fragment);
        }
        fragment.mAdded = false;
    }

    void v() {
        this.f17345b.clear();
    }

    void w(List list) {
        this.f17344a.clear();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                Fragment fragmentF = f(str);
                if (fragmentF == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
                if (FragmentManager.J0(2)) {
                    fragmentF.toString();
                }
                a(fragmentF);
            }
        }
    }

    void x(HashMap map) {
        this.f17346c.clear();
        this.f17346c.putAll(map);
    }

    ArrayList y() {
        ArrayList arrayList = new ArrayList(this.f17345b.size());
        for (G g10 : this.f17345b.values()) {
            if (g10 != null) {
                Fragment fragmentK = g10.k();
                B(fragmentK.mWho, g10.q());
                arrayList.add(fragmentK.mWho);
                if (FragmentManager.J0(2)) {
                    fragmentK.toString();
                    Objects.toString(fragmentK.mSavedFragmentState);
                }
            }
        }
        return arrayList;
    }

    ArrayList z() {
        synchronized (this.f17344a) {
            try {
                if (this.f17344a.isEmpty()) {
                    return null;
                }
                ArrayList arrayList = new ArrayList(this.f17344a.size());
                for (Fragment fragment : this.f17344a) {
                    arrayList.add(fragment.mWho);
                    if (FragmentManager.J0(2)) {
                        fragment.toString();
                    }
                }
                return arrayList;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
