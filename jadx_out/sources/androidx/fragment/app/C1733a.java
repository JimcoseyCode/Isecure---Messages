package androidx.fragment.app;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.I;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: renamed from: androidx.fragment.app.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C1733a extends I implements FragmentManager.l {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final FragmentManager f17441t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    boolean f17442u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    int f17443v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    boolean f17444w;

    C1733a(FragmentManager fragmentManager) {
        super(fragmentManager.u0(), fragmentManager.w0() != null ? fragmentManager.w0().f().getClassLoader() : null);
        this.f17443v = -1;
        this.f17444w = false;
        this.f17441t = fragmentManager;
    }

    void A() {
        for (int size = this.f17350c.size() - 1; size >= 0; size--) {
            I.a aVar = (I.a) this.f17350c.get(size);
            Fragment fragment = aVar.f17368b;
            if (fragment != null) {
                fragment.mBeingSaved = this.f17444w;
                fragment.setPopDirection(true);
                fragment.setNextTransition(FragmentManager.k1(this.f17355h));
                fragment.setSharedElementNames(this.f17364q, this.f17363p);
            }
            switch (aVar.f17367a) {
                case 1:
                    fragment.setAnimations(aVar.f17370d, aVar.f17371e, aVar.f17372f, aVar.f17373g);
                    this.f17441t.n1(fragment, true);
                    this.f17441t.e1(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f17367a);
                case 3:
                    fragment.setAnimations(aVar.f17370d, aVar.f17371e, aVar.f17372f, aVar.f17373g);
                    this.f17441t.h(fragment);
                    break;
                case 4:
                    fragment.setAnimations(aVar.f17370d, aVar.f17371e, aVar.f17372f, aVar.f17373g);
                    this.f17441t.r1(fragment);
                    break;
                case 5:
                    fragment.setAnimations(aVar.f17370d, aVar.f17371e, aVar.f17372f, aVar.f17373g);
                    this.f17441t.n1(fragment, true);
                    this.f17441t.G0(fragment);
                    break;
                case 6:
                    fragment.setAnimations(aVar.f17370d, aVar.f17371e, aVar.f17372f, aVar.f17373g);
                    this.f17441t.n(fragment);
                    break;
                case 7:
                    fragment.setAnimations(aVar.f17370d, aVar.f17371e, aVar.f17372f, aVar.f17373g);
                    this.f17441t.n1(fragment, true);
                    this.f17441t.w(fragment);
                    break;
                case 8:
                    this.f17441t.p1(null);
                    break;
                case 9:
                    this.f17441t.p1(fragment);
                    break;
                case 10:
                    this.f17441t.o1(fragment, aVar.f17374h);
                    break;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    Fragment B(ArrayList arrayList, Fragment fragment) {
        Fragment fragment2 = fragment;
        int i10 = 0;
        while (i10 < this.f17350c.size()) {
            I.a aVar = (I.a) this.f17350c.get(i10);
            int i11 = aVar.f17367a;
            if (i11 == 1) {
                arrayList.add(aVar.f17368b);
            } else if (i11 == 2) {
                Fragment fragment3 = aVar.f17368b;
                int i12 = fragment3.mContainerId;
                boolean z10 = false;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    Fragment fragment4 = (Fragment) arrayList.get(size);
                    if (fragment4.mContainerId == i12) {
                        if (fragment4 == fragment3) {
                            z10 = true;
                        } else {
                            if (fragment4 == fragment2) {
                                this.f17350c.add(i10, new I.a(9, fragment4, true));
                                i10++;
                                fragment2 = null;
                            }
                            I.a aVar2 = new I.a(3, fragment4, true);
                            aVar2.f17370d = aVar.f17370d;
                            aVar2.f17372f = aVar.f17372f;
                            aVar2.f17371e = aVar.f17371e;
                            aVar2.f17373g = aVar.f17373g;
                            this.f17350c.add(i10, aVar2);
                            arrayList.remove(fragment4);
                            i10++;
                        }
                    }
                }
                if (z10) {
                    this.f17350c.remove(i10);
                    i10--;
                } else {
                    aVar.f17367a = 1;
                    aVar.f17369c = true;
                    arrayList.add(fragment3);
                }
            } else if (i11 == 3 || i11 == 6) {
                arrayList.remove(aVar.f17368b);
                Fragment fragment5 = aVar.f17368b;
                if (fragment5 == fragment2) {
                    this.f17350c.add(i10, new I.a(9, fragment5));
                    i10++;
                    fragment2 = null;
                }
            } else if (i11 != 7) {
                if (i11 == 8) {
                    this.f17350c.add(i10, new I.a(9, fragment2, true));
                    aVar.f17369c = true;
                    i10++;
                    fragment2 = aVar.f17368b;
                }
            }
            i10++;
        }
        return fragment2;
    }

    public String C() {
        return this.f17358k;
    }

    public void D() {
        if (this.f17366s != null) {
            for (int i10 = 0; i10 < this.f17366s.size(); i10++) {
                ((Runnable) this.f17366s.get(i10)).run();
            }
            this.f17366s = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    Fragment E(ArrayList arrayList, Fragment fragment) {
        for (int size = this.f17350c.size() - 1; size >= 0; size--) {
            I.a aVar = (I.a) this.f17350c.get(size);
            int i10 = aVar.f17367a;
            if (i10 == 1) {
                arrayList.remove(aVar.f17368b);
            } else if (i10 != 3) {
                switch (i10) {
                    case 6:
                        arrayList.add(aVar.f17368b);
                        break;
                    case 8:
                        fragment = null;
                        break;
                    case 9:
                        fragment = aVar.f17368b;
                        break;
                    case 10:
                        aVar.f17375i = aVar.f17374h;
                        break;
                }
            }
        }
        return fragment;
    }

    @Override // androidx.fragment.app.FragmentManager.l
    public boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (FragmentManager.J0(2)) {
            toString();
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f17356i) {
            return true;
        }
        this.f17441t.g(this);
        return true;
    }

    @Override // androidx.fragment.app.I
    public int h() {
        return w(false);
    }

    @Override // androidx.fragment.app.I
    public int i() {
        return w(true);
    }

    @Override // androidx.fragment.app.I
    public void j() {
        l();
        this.f17441t.b0(this, false);
    }

    @Override // androidx.fragment.app.I
    public void k() {
        l();
        this.f17441t.b0(this, true);
    }

    @Override // androidx.fragment.app.I
    void m(int i10, Fragment fragment, String str, int i11) {
        super.m(i10, fragment, str, i11);
        fragment.mFragmentManager = this.f17441t;
    }

    @Override // androidx.fragment.app.I
    public I n(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f17441t) {
            return super.n(fragment);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.I
    public I t(Fragment fragment) {
        FragmentManager fragmentManager;
        if (fragment == null || (fragmentManager = fragment.mFragmentManager) == null || fragmentManager == this.f17441t) {
            return super.t(fragment);
        }
        throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f17443v >= 0) {
            sb.append(" #");
            sb.append(this.f17443v);
        }
        if (this.f17358k != null) {
            sb.append(" ");
            sb.append(this.f17358k);
        }
        sb.append("}");
        return sb.toString();
    }

    void v(int i10) {
        if (this.f17356i) {
            if (FragmentManager.J0(2)) {
                toString();
            }
            int size = this.f17350c.size();
            for (int i11 = 0; i11 < size; i11++) {
                I.a aVar = (I.a) this.f17350c.get(i11);
                Fragment fragment = aVar.f17368b;
                if (fragment != null) {
                    fragment.mBackStackNesting += i10;
                    if (FragmentManager.J0(2)) {
                        Objects.toString(aVar.f17368b);
                        int i12 = aVar.f17368b.mBackStackNesting;
                    }
                }
            }
        }
    }

    int w(boolean z10) {
        if (this.f17442u) {
            throw new IllegalStateException("commit already called");
        }
        if (FragmentManager.J0(2)) {
            toString();
            PrintWriter printWriter = new PrintWriter(new N("FragmentManager"));
            x("  ", printWriter);
            printWriter.close();
        }
        this.f17442u = true;
        if (this.f17356i) {
            this.f17443v = this.f17441t.l();
        } else {
            this.f17443v = -1;
        }
        this.f17441t.Y(this, z10);
        return this.f17443v;
    }

    public void x(String str, PrintWriter printWriter) {
        y(str, printWriter, true);
    }

    public void y(String str, PrintWriter printWriter, boolean z10) {
        String str2;
        if (z10) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f17358k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f17443v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f17442u);
            if (this.f17355h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f17355h));
            }
            if (this.f17351d != 0 || this.f17352e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f17351d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f17352e));
            }
            if (this.f17353f != 0 || this.f17354g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f17353f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f17354g));
            }
            if (this.f17359l != 0 || this.f17360m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f17359l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f17360m);
            }
            if (this.f17361n != 0 || this.f17362o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f17361n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f17362o);
            }
        }
        if (this.f17350c.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f17350c.size();
        for (int i10 = 0; i10 < size; i10++) {
            I.a aVar = (I.a) this.f17350c.get(i10);
            switch (aVar.f17367a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + aVar.f17367a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i10);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f17368b);
            if (z10) {
                if (aVar.f17370d != 0 || aVar.f17371e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f17370d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f17371e));
                }
                if (aVar.f17372f != 0 || aVar.f17373g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f17372f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f17373g));
                }
            }
        }
    }

    void z() {
        int size = this.f17350c.size();
        for (int i10 = 0; i10 < size; i10++) {
            I.a aVar = (I.a) this.f17350c.get(i10);
            Fragment fragment = aVar.f17368b;
            if (fragment != null) {
                fragment.mBeingSaved = this.f17444w;
                fragment.setPopDirection(false);
                fragment.setNextTransition(this.f17355h);
                fragment.setSharedElementNames(this.f17363p, this.f17364q);
            }
            switch (aVar.f17367a) {
                case 1:
                    fragment.setAnimations(aVar.f17370d, aVar.f17371e, aVar.f17372f, aVar.f17373g);
                    this.f17441t.n1(fragment, false);
                    this.f17441t.h(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f17367a);
                case 3:
                    fragment.setAnimations(aVar.f17370d, aVar.f17371e, aVar.f17372f, aVar.f17373g);
                    this.f17441t.e1(fragment);
                    break;
                case 4:
                    fragment.setAnimations(aVar.f17370d, aVar.f17371e, aVar.f17372f, aVar.f17373g);
                    this.f17441t.G0(fragment);
                    break;
                case 5:
                    fragment.setAnimations(aVar.f17370d, aVar.f17371e, aVar.f17372f, aVar.f17373g);
                    this.f17441t.n1(fragment, false);
                    this.f17441t.r1(fragment);
                    break;
                case 6:
                    fragment.setAnimations(aVar.f17370d, aVar.f17371e, aVar.f17372f, aVar.f17373g);
                    this.f17441t.w(fragment);
                    break;
                case 7:
                    fragment.setAnimations(aVar.f17370d, aVar.f17371e, aVar.f17372f, aVar.f17373g);
                    this.f17441t.n1(fragment, false);
                    this.f17441t.n(fragment);
                    break;
                case 8:
                    this.f17441t.p1(fragment);
                    break;
                case 9:
                    this.f17441t.p1(null);
                    break;
                case 10:
                    this.f17441t.o1(fragment, aVar.f17375i);
                    break;
            }
        }
    }
}
