package androidx.fragment.app;

import Z0.c;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.core.view.InterfaceC1698v;
import androidx.fragment.app.I;
import androidx.lifecycle.AbstractC1764k;
import androidx.lifecycle.W;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.events.PointerEventHelper;
import d.AbstractC2314b;
import d.InterfaceC2313a;
import e.AbstractC2379a;
import e.C2386h;
import e.C2387i;
import h1.C2697f;
import h1.InterfaceC2700i;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class FragmentManager {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private static boolean f17252S = false;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private AbstractC2314b f17256D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private AbstractC2314b f17257E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private AbstractC2314b f17258F;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f17260H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f17261I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private boolean f17262J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private boolean f17263K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private boolean f17264L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private ArrayList f17265M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private ArrayList f17266N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private ArrayList f17267O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private E f17268P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private c.C0137c f17269Q;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f17272b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    ArrayList f17274d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ArrayList f17275e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private androidx.activity.T f17277g;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ArrayList f17283m;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private AbstractC1753v f17292v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private AbstractC1750s f17293w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Fragment f17294x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    Fragment f17295y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f17271a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final H f17273c = new H();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final w f17276f = new w(this);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final androidx.activity.L f17278h = new b(false);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicInteger f17279i = new AtomicInteger();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map f17280j = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Map f17281k = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Map f17282l = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final x f17284n = new x(this);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final CopyOnWriteArrayList f17285o = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final H0.a f17286p = new H0.a() { // from class: androidx.fragment.app.y
        @Override // H0.a
        public final void accept(Object obj) {
            FragmentManager.e(this.f17516a, (Configuration) obj);
        }
    };

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final H0.a f17287q = new H0.a() { // from class: androidx.fragment.app.z
        @Override // H0.a
        public final void accept(Object obj) {
            FragmentManager.a(this.f17517a, (Integer) obj);
        }
    };

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final H0.a f17288r = new H0.a() { // from class: androidx.fragment.app.A
        @Override // H0.a
        public final void accept(Object obj) {
            FragmentManager.d(this.f17181a, (androidx.core.app.i) obj);
        }
    };

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final H0.a f17289s = new H0.a() { // from class: androidx.fragment.app.B
        @Override // H0.a
        public final void accept(Object obj) {
            FragmentManager.c(this.f17182a, (androidx.core.app.s) obj);
        }
    };

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final androidx.core.view.B f17290t = new c();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    int f17291u = -1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private AbstractC1752u f17296z = null;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private AbstractC1752u f17253A = new d();

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private T f17254B = null;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private T f17255C = new e();

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    ArrayDeque f17259G = new ArrayDeque();

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private Runnable f17270R = new f();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements InterfaceC2313a {
        a() {
        }

        @Override // d.InterfaceC2313a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onActivityResult(Map map) {
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                iArr[i10] = ((Boolean) arrayList.get(i10)).booleanValue() ? 0 : -1;
            }
            LaunchedFragmentInfo launchedFragmentInfo = (LaunchedFragmentInfo) FragmentManager.this.f17259G.pollFirst();
            if (launchedFragmentInfo == null) {
                toString();
                return;
            }
            String str = launchedFragmentInfo.f17297g;
            int i11 = launchedFragmentInfo.f17298h;
            Fragment fragmentI = FragmentManager.this.f17273c.i(str);
            if (fragmentI == null) {
                return;
            }
            fragmentI.onRequestPermissionsResult(i11, strArr, iArr);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b extends androidx.activity.L {
        b(boolean z10) {
            super(z10);
        }

        @Override // androidx.activity.L
        public void handleOnBackPressed() {
            FragmentManager.this.F0();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class c implements androidx.core.view.B {
        c() {
        }

        @Override // androidx.core.view.B
        public boolean a(MenuItem menuItem) {
            return FragmentManager.this.J(menuItem);
        }

        @Override // androidx.core.view.B
        public void b(Menu menu) {
            FragmentManager.this.K(menu);
        }

        @Override // androidx.core.view.B
        public void c(Menu menu, MenuInflater menuInflater) {
            FragmentManager.this.C(menu, menuInflater);
        }

        @Override // androidx.core.view.B
        public void d(Menu menu) {
            FragmentManager.this.O(menu);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class d extends AbstractC1752u {
        d() {
        }

        @Override // androidx.fragment.app.AbstractC1752u
        public Fragment a(ClassLoader classLoader, String str) {
            return FragmentManager.this.w0().b(FragmentManager.this.w0().f(), str, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class e implements T {
        e() {
        }

        @Override // androidx.fragment.app.T
        public Q a(ViewGroup viewGroup) {
            return new C1741i(viewGroup);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentManager.this.a0(true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class g implements F {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Fragment f17305g;

        g(Fragment fragment) {
            this.f17305g = fragment;
        }

        @Override // androidx.fragment.app.F
        public void a(FragmentManager fragmentManager, Fragment fragment) {
            this.f17305g.onAttachFragment(fragment);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class h implements InterfaceC2313a {
        h() {
        }

        @Override // d.InterfaceC2313a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onActivityResult(ActivityResult activityResult) {
            LaunchedFragmentInfo launchedFragmentInfo = (LaunchedFragmentInfo) FragmentManager.this.f17259G.pollLast();
            if (launchedFragmentInfo == null) {
                toString();
                return;
            }
            String str = launchedFragmentInfo.f17297g;
            int i10 = launchedFragmentInfo.f17298h;
            Fragment fragmentI = FragmentManager.this.f17273c.i(str);
            if (fragmentI == null) {
                return;
            }
            fragmentI.onActivityResult(i10, activityResult.getResultCode(), activityResult.getData());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class i implements InterfaceC2313a {
        i() {
        }

        @Override // d.InterfaceC2313a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onActivityResult(ActivityResult activityResult) {
            LaunchedFragmentInfo launchedFragmentInfo = (LaunchedFragmentInfo) FragmentManager.this.f17259G.pollFirst();
            if (launchedFragmentInfo == null) {
                toString();
                return;
            }
            String str = launchedFragmentInfo.f17297g;
            int i10 = launchedFragmentInfo.f17298h;
            Fragment fragmentI = FragmentManager.this.f17273c.i(str);
            if (fragmentI == null) {
                return;
            }
            fragmentI.onActivityResult(i10, activityResult.getResultCode(), activityResult.getData());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class j extends AbstractC2379a {
        j() {
        }

        @Override // e.AbstractC2379a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(Context context, IntentSenderRequest intentSenderRequest) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent fillInIntent = intentSenderRequest.getFillInIntent();
            if (fillInIntent != null && (bundleExtra = fillInIntent.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                fillInIntent.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (fillInIntent.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    intentSenderRequest = new IntentSenderRequest.a(intentSenderRequest.getIntentSender()).b(null).c(intentSenderRequest.getFlagsValues(), intentSenderRequest.getFlagsMask()).a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest);
            if (FragmentManager.J0(2)) {
                intent.toString();
            }
            return intent;
        }

        @Override // e.AbstractC2379a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public ActivityResult c(int i10, Intent intent) {
            return new ActivityResult(i10, intent);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    interface l {
        boolean a(ArrayList arrayList, ArrayList arrayList2);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class m implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f17309a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f17310b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f17311c;

        m(String str, int i10, int i11) {
            this.f17309a = str;
            this.f17310b = i10;
            this.f17311c = i11;
        }

        @Override // androidx.fragment.app.FragmentManager.l
        public boolean a(ArrayList arrayList, ArrayList arrayList2) {
            Fragment fragment = FragmentManager.this.f17295y;
            if (fragment == null || this.f17310b >= 0 || this.f17309a != null || !fragment.getChildFragmentManager().a1()) {
                return FragmentManager.this.d1(arrayList, arrayList2, this.f17309a, this.f17310b, this.f17311c);
            }
            return false;
        }
    }

    static Fragment D0(View view) {
        Object tag = view.getTag(Y0.b.f12601a);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    public static boolean J0(int i10) {
        return f17252S || Log.isLoggable("FragmentManager", i10);
    }

    private boolean K0(Fragment fragment) {
        return (fragment.mHasMenu && fragment.mMenuVisible) || fragment.mChildFragmentManager.p();
    }

    private void L(Fragment fragment) {
        if (fragment == null || !fragment.equals(f0(fragment.mWho))) {
            return;
        }
        fragment.performPrimaryNavigationFragmentChanged();
    }

    private boolean L0() {
        Fragment fragment = this.f17294x;
        if (fragment == null) {
            return true;
        }
        return fragment.isAdded() && this.f17294x.getParentFragmentManager().L0();
    }

    private void S(int i10) {
        try {
            this.f17272b = true;
            this.f17273c.d(i10);
            U0(i10, false);
            Iterator it = t().iterator();
            while (it.hasNext()) {
                ((Q) it.next()).n();
            }
            this.f17272b = false;
            a0(true);
        } catch (Throwable th) {
            this.f17272b = false;
            throw th;
        }
    }

    private void V() {
        if (this.f17264L) {
            this.f17264L = false;
            s1();
        }
    }

    private void X() {
        Iterator it = t().iterator();
        while (it.hasNext()) {
            ((Q) it.next()).n();
        }
    }

    private void Z(boolean z10) {
        if (this.f17272b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f17292v == null) {
            if (!this.f17263K) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f17292v.g().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z10) {
            q();
        }
        if (this.f17265M == null) {
            this.f17265M = new ArrayList();
            this.f17266N = new ArrayList();
        }
    }

    public static /* synthetic */ void a(FragmentManager fragmentManager, Integer num) {
        if (fragmentManager.L0() && num.intValue() == 80) {
            fragmentManager.F(false);
        }
    }

    public static /* synthetic */ void c(FragmentManager fragmentManager, androidx.core.app.s sVar) {
        if (fragmentManager.L0()) {
            fragmentManager.N(sVar.a(), false);
        }
    }

    private static void c0(ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        while (i10 < i11) {
            C1733a c1733a = (C1733a) arrayList.get(i10);
            if (((Boolean) arrayList2.get(i10)).booleanValue()) {
                c1733a.v(-1);
                c1733a.A();
            } else {
                c1733a.v(1);
                c1733a.z();
            }
            i10++;
        }
    }

    private boolean c1(String str, int i10, int i11) {
        a0(false);
        Z(true);
        Fragment fragment = this.f17295y;
        if (fragment != null && i10 < 0 && str == null && fragment.getChildFragmentManager().a1()) {
            return true;
        }
        boolean zD1 = d1(this.f17265M, this.f17266N, str, i10, i11);
        if (zD1) {
            this.f17272b = true;
            try {
                g1(this.f17265M, this.f17266N);
            } finally {
                r();
            }
        }
        u1();
        V();
        this.f17273c.b();
        return zD1;
    }

    public static /* synthetic */ void d(FragmentManager fragmentManager, androidx.core.app.i iVar) {
        if (fragmentManager.L0()) {
            fragmentManager.G(iVar.a(), false);
        }
    }

    private void d0(ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        ArrayList arrayList3;
        boolean z10 = ((C1733a) arrayList.get(i10)).f17365r;
        ArrayList arrayList4 = this.f17267O;
        if (arrayList4 == null) {
            this.f17267O = new ArrayList();
        } else {
            arrayList4.clear();
        }
        this.f17267O.addAll(this.f17273c.o());
        Fragment fragmentA0 = A0();
        boolean z11 = false;
        for (int i12 = i10; i12 < i11; i12++) {
            C1733a c1733a = (C1733a) arrayList.get(i12);
            fragmentA0 = !((Boolean) arrayList2.get(i12)).booleanValue() ? c1733a.B(this.f17267O, fragmentA0) : c1733a.E(this.f17267O, fragmentA0);
            z11 = z11 || c1733a.f17356i;
        }
        this.f17267O.clear();
        if (!z10 && this.f17291u >= 1) {
            for (int i13 = i10; i13 < i11; i13++) {
                Iterator it = ((C1733a) arrayList.get(i13)).f17350c.iterator();
                while (it.hasNext()) {
                    Fragment fragment = ((I.a) it.next()).f17368b;
                    if (fragment != null && fragment.mFragmentManager != null) {
                        this.f17273c.r(v(fragment));
                    }
                }
            }
        }
        c0(arrayList, arrayList2, i10, i11);
        boolean zBooleanValue = ((Boolean) arrayList2.get(i11 - 1)).booleanValue();
        if (z11 && (arrayList3 = this.f17283m) != null && !arrayList3.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(o0((C1733a) it2.next()));
            }
            for (k kVar : this.f17283m) {
                Iterator it3 = linkedHashSet.iterator();
                while (it3.hasNext()) {
                    kVar.b((Fragment) it3.next(), zBooleanValue);
                }
            }
            for (k kVar2 : this.f17283m) {
                Iterator it4 = linkedHashSet.iterator();
                while (it4.hasNext()) {
                    kVar2.a((Fragment) it4.next(), zBooleanValue);
                }
            }
        }
        for (int i14 = i10; i14 < i11; i14++) {
            C1733a c1733a2 = (C1733a) arrayList.get(i14);
            if (zBooleanValue) {
                for (int size = c1733a2.f17350c.size() - 1; size >= 0; size--) {
                    Fragment fragment2 = ((I.a) c1733a2.f17350c.get(size)).f17368b;
                    if (fragment2 != null) {
                        v(fragment2).m();
                    }
                }
            } else {
                Iterator it5 = c1733a2.f17350c.iterator();
                while (it5.hasNext()) {
                    Fragment fragment3 = ((I.a) it5.next()).f17368b;
                    if (fragment3 != null) {
                        v(fragment3).m();
                    }
                }
            }
        }
        U0(this.f17291u, true);
        for (Q q10 : u(arrayList, i10, i11)) {
            q10.v(zBooleanValue);
            q10.t();
            q10.k();
        }
        while (i10 < i11) {
            C1733a c1733a3 = (C1733a) arrayList.get(i10);
            if (((Boolean) arrayList2.get(i10)).booleanValue() && c1733a3.f17443v >= 0) {
                c1733a3.f17443v = -1;
            }
            c1733a3.D();
            i10++;
        }
        if (z11) {
            i1();
        }
    }

    public static /* synthetic */ void e(FragmentManager fragmentManager, Configuration configuration) {
        if (fragmentManager.L0()) {
            fragmentManager.z(configuration, false);
        }
    }

    private int g0(String str, int i10, boolean z10) {
        ArrayList arrayList = this.f17274d;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        if (str == null && i10 < 0) {
            if (z10) {
                return 0;
            }
            return this.f17274d.size() - 1;
        }
        int size = this.f17274d.size() - 1;
        while (size >= 0) {
            C1733a c1733a = (C1733a) this.f17274d.get(size);
            if ((str != null && str.equals(c1733a.C())) || (i10 >= 0 && i10 == c1733a.f17443v)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z10) {
            if (size == this.f17274d.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            C1733a c1733a2 = (C1733a) this.f17274d.get(size - 1);
            if ((str == null || !str.equals(c1733a2.C())) && (i10 < 0 || i10 != c1733a2.f17443v)) {
                break;
            }
            size--;
        }
        return size;
    }

    private void g1(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            if (!((C1733a) arrayList.get(i10)).f17365r) {
                if (i11 != i10) {
                    d0(arrayList, arrayList2, i11, i10);
                }
                i11 = i10 + 1;
                if (((Boolean) arrayList2.get(i10)).booleanValue()) {
                    while (i11 < size && ((Boolean) arrayList2.get(i11)).booleanValue() && !((C1733a) arrayList.get(i11)).f17365r) {
                        i11++;
                    }
                }
                d0(arrayList, arrayList2, i10, i11);
                i10 = i11 - 1;
            }
            i10++;
        }
        if (i11 != size) {
            d0(arrayList, arrayList2, i11, size);
        }
    }

    public static Fragment h0(View view) {
        Fragment fragmentM0 = m0(view);
        if (fragmentM0 != null) {
            return fragmentM0;
        }
        throw new IllegalStateException("View " + view + " does not have a Fragment set");
    }

    private void i1() {
        if (this.f17283m != null) {
            for (int i10 = 0; i10 < this.f17283m.size(); i10++) {
                ((k) this.f17283m.get(i10)).onBackStackChanged();
            }
        }
    }

    static int k1(int i10) {
        if (i10 == 4097) {
            return 8194;
        }
        if (i10 == 8194) {
            return 4097;
        }
        if (i10 == 8197) {
            return 4100;
        }
        if (i10 != 4099) {
            return i10 != 4100 ? 0 : 8197;
        }
        return 4099;
    }

    static FragmentManager l0(View view) {
        AbstractActivityC1749q abstractActivityC1749q;
        Fragment fragmentM0 = m0(view);
        if (fragmentM0 != null) {
            if (fragmentM0.isAdded()) {
                return fragmentM0.getChildFragmentManager();
            }
            throw new IllegalStateException("The Fragment " + fragmentM0 + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
        Context context = view.getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                abstractActivityC1749q = null;
                break;
            }
            if (context instanceof AbstractActivityC1749q) {
                abstractActivityC1749q = (AbstractActivityC1749q) context;
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (abstractActivityC1749q != null) {
            return abstractActivityC1749q.getSupportFragmentManager();
        }
        throw new IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
    }

    static Fragment m0(View view) {
        while (view != null) {
            Fragment fragmentD0 = D0(view);
            if (fragmentD0 != null) {
                return fragmentD0;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    private void n0() {
        Iterator it = t().iterator();
        while (it.hasNext()) {
            ((Q) it.next()).o();
        }
    }

    private Set o0(C1733a c1733a) {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < c1733a.f17350c.size(); i10++) {
            Fragment fragment = ((I.a) c1733a.f17350c.get(i10)).f17368b;
            if (fragment != null && c1733a.f17356i) {
                hashSet.add(fragment);
            }
        }
        return hashSet;
    }

    private boolean p0(ArrayList arrayList, ArrayList arrayList2) {
        synchronized (this.f17271a) {
            if (this.f17271a.isEmpty()) {
                return false;
            }
            try {
                int size = this.f17271a.size();
                boolean zA = false;
                for (int i10 = 0; i10 < size; i10++) {
                    zA |= ((l) this.f17271a.get(i10)).a(arrayList, arrayList2);
                }
                return zA;
            } finally {
                this.f17271a.clear();
                this.f17292v.g().removeCallbacks(this.f17270R);
            }
        }
    }

    private void q() {
        if (Q0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private void q1(Fragment fragment) {
        ViewGroup viewGroupT0 = t0(fragment);
        if (viewGroupT0 == null || fragment.getEnterAnim() + fragment.getExitAnim() + fragment.getPopEnterAnim() + fragment.getPopExitAnim() <= 0) {
            return;
        }
        if (viewGroupT0.getTag(Y0.b.f12603c) == null) {
            viewGroupT0.setTag(Y0.b.f12603c, fragment);
        }
        ((Fragment) viewGroupT0.getTag(Y0.b.f12603c)).setPopDirection(fragment.getPopDirection());
    }

    private void r() {
        this.f17272b = false;
        this.f17266N.clear();
        this.f17265M.clear();
    }

    private E r0(Fragment fragment) {
        return this.f17268P.j(fragment);
    }

    private void s() {
        AbstractC1753v abstractC1753v = this.f17292v;
        if (abstractC1753v instanceof W ? this.f17273c.p().n() : abstractC1753v.f() instanceof Activity ? !((Activity) this.f17292v.f()).isChangingConfigurations() : true) {
            Iterator it = this.f17280j.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((BackStackState) it.next()).f17197g.iterator();
                while (it2.hasNext()) {
                    this.f17273c.p().g((String) it2.next());
                }
            }
        }
    }

    private void s1() {
        Iterator it = this.f17273c.k().iterator();
        while (it.hasNext()) {
            X0((G) it.next());
        }
    }

    private Set t() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f17273c.k().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((G) it.next()).k().mContainer;
            if (viewGroup != null) {
                hashSet.add(Q.s(viewGroup, B0()));
            }
        }
        return hashSet;
    }

    private ViewGroup t0(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId > 0 && this.f17293w.d()) {
            View viewC = this.f17293w.c(fragment.mContainerId);
            if (viewC instanceof ViewGroup) {
                return (ViewGroup) viewC;
            }
        }
        return null;
    }

    private void t1(RuntimeException runtimeException) {
        runtimeException.getMessage();
        PrintWriter printWriter = new PrintWriter(new N("FragmentManager"));
        AbstractC1753v abstractC1753v = this.f17292v;
        try {
            if (abstractC1753v != null) {
                abstractC1753v.h("  ", null, printWriter, new String[0]);
            } else {
                W("  ", null, printWriter, new String[0]);
            }
            throw runtimeException;
        } catch (Exception unused) {
            throw runtimeException;
        }
    }

    private Set u(ArrayList arrayList, int i10, int i11) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i10 < i11) {
            Iterator it = ((C1733a) arrayList.get(i10)).f17350c.iterator();
            while (it.hasNext()) {
                Fragment fragment = ((I.a) it.next()).f17368b;
                if (fragment != null && (viewGroup = fragment.mContainer) != null) {
                    hashSet.add(Q.r(viewGroup, this));
                }
            }
            i10++;
        }
        return hashSet;
    }

    private void u1() {
        synchronized (this.f17271a) {
            try {
                if (this.f17271a.isEmpty()) {
                    this.f17278h.setEnabled(q0() > 0 && O0(this.f17294x));
                } else {
                    this.f17278h.setEnabled(true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    boolean A(MenuItem menuItem) {
        if (this.f17291u < 1) {
            return false;
        }
        for (Fragment fragment : this.f17273c.o()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public Fragment A0() {
        return this.f17295y;
    }

    void B() {
        this.f17261I = false;
        this.f17262J = false;
        this.f17268P.p(false);
        S(1);
    }

    T B0() {
        T t10 = this.f17254B;
        if (t10 != null) {
            return t10;
        }
        Fragment fragment = this.f17294x;
        return fragment != null ? fragment.mFragmentManager.B0() : this.f17255C;
    }

    boolean C(Menu menu, MenuInflater menuInflater) {
        if (this.f17291u < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z10 = false;
        for (Fragment fragment : this.f17273c.o()) {
            if (fragment != null && N0(fragment) && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(fragment);
                z10 = true;
            }
        }
        if (this.f17275e != null) {
            for (int i10 = 0; i10 < this.f17275e.size(); i10++) {
                Fragment fragment2 = (Fragment) this.f17275e.get(i10);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.f17275e = arrayList;
        return z10;
    }

    public c.C0137c C0() {
        return this.f17269Q;
    }

    void D() {
        this.f17263K = true;
        a0(true);
        X();
        s();
        S(-1);
        Object obj = this.f17292v;
        if (obj instanceof androidx.core.content.c) {
            ((androidx.core.content.c) obj).removeOnTrimMemoryListener(this.f17287q);
        }
        Object obj2 = this.f17292v;
        if (obj2 instanceof androidx.core.content.b) {
            ((androidx.core.content.b) obj2).removeOnConfigurationChangedListener(this.f17286p);
        }
        Object obj3 = this.f17292v;
        if (obj3 instanceof androidx.core.app.q) {
            ((androidx.core.app.q) obj3).removeOnMultiWindowModeChangedListener(this.f17288r);
        }
        Object obj4 = this.f17292v;
        if (obj4 instanceof androidx.core.app.r) {
            ((androidx.core.app.r) obj4).removeOnPictureInPictureModeChangedListener(this.f17289s);
        }
        Object obj5 = this.f17292v;
        if ((obj5 instanceof InterfaceC1698v) && this.f17294x == null) {
            ((InterfaceC1698v) obj5).removeMenuProvider(this.f17290t);
        }
        this.f17292v = null;
        this.f17293w = null;
        this.f17294x = null;
        if (this.f17277g != null) {
            this.f17278h.remove();
            this.f17277g = null;
        }
        AbstractC2314b abstractC2314b = this.f17256D;
        if (abstractC2314b != null) {
            abstractC2314b.c();
            this.f17257E.c();
            this.f17258F.c();
        }
    }

    void E() {
        S(1);
    }

    androidx.lifecycle.V E0(Fragment fragment) {
        return this.f17268P.m(fragment);
    }

    void F(boolean z10) {
        if (z10 && (this.f17292v instanceof androidx.core.content.c)) {
            t1(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        }
        for (Fragment fragment : this.f17273c.o()) {
            if (fragment != null) {
                fragment.performLowMemory();
                if (z10) {
                    fragment.mChildFragmentManager.F(true);
                }
            }
        }
    }

    void F0() {
        a0(true);
        if (this.f17278h.isEnabled()) {
            a1();
        } else {
            this.f17277g.s();
        }
    }

    void G(boolean z10, boolean z11) {
        if (z11 && (this.f17292v instanceof androidx.core.app.q)) {
            t1(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        }
        for (Fragment fragment : this.f17273c.o()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z10);
                if (z11) {
                    fragment.mChildFragmentManager.G(z10, true);
                }
            }
        }
    }

    void G0(Fragment fragment) {
        if (J0(2)) {
            Objects.toString(fragment);
        }
        if (fragment.mHidden) {
            return;
        }
        fragment.mHidden = true;
        fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        q1(fragment);
    }

    void H(Fragment fragment) {
        Iterator it = this.f17285o.iterator();
        while (it.hasNext()) {
            ((F) it.next()).a(this, fragment);
        }
    }

    void H0(Fragment fragment) {
        if (fragment.mAdded && K0(fragment)) {
            this.f17260H = true;
        }
    }

    void I() {
        for (Fragment fragment : this.f17273c.l()) {
            if (fragment != null) {
                fragment.onHiddenChanged(fragment.isHidden());
                fragment.mChildFragmentManager.I();
            }
        }
    }

    public boolean I0() {
        return this.f17263K;
    }

    boolean J(MenuItem menuItem) {
        if (this.f17291u < 1) {
            return false;
        }
        for (Fragment fragment : this.f17273c.o()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    void K(Menu menu) {
        if (this.f17291u < 1) {
            return;
        }
        for (Fragment fragment : this.f17273c.o()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    void M() {
        S(5);
    }

    boolean M0(Fragment fragment) {
        if (fragment == null) {
            return false;
        }
        return fragment.isHidden();
    }

    void N(boolean z10, boolean z11) {
        if (z11 && (this.f17292v instanceof androidx.core.app.r)) {
            t1(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        }
        for (Fragment fragment : this.f17273c.o()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z10);
                if (z11) {
                    fragment.mChildFragmentManager.N(z10, true);
                }
            }
        }
    }

    boolean N0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.isMenuVisible();
    }

    boolean O(Menu menu) {
        boolean z10 = false;
        if (this.f17291u < 1) {
            return false;
        }
        for (Fragment fragment : this.f17273c.o()) {
            if (fragment != null && N0(fragment) && fragment.performPrepareOptionsMenu(menu)) {
                z10 = true;
            }
        }
        return z10;
    }

    boolean O0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        return fragment.equals(fragmentManager.A0()) && O0(fragmentManager.f17294x);
    }

    void P() {
        u1();
        L(this.f17295y);
    }

    boolean P0(int i10) {
        return this.f17291u >= i10;
    }

    void Q() {
        this.f17261I = false;
        this.f17262J = false;
        this.f17268P.p(false);
        S(7);
    }

    public boolean Q0() {
        return this.f17261I || this.f17262J;
    }

    void R() {
        this.f17261I = false;
        this.f17262J = false;
        this.f17268P.p(false);
        S(5);
    }

    void R0(Fragment fragment, String[] strArr, int i10) {
        if (this.f17258F == null) {
            this.f17292v.k(fragment, strArr, i10);
            return;
        }
        this.f17259G.addLast(new LaunchedFragmentInfo(fragment.mWho, i10));
        this.f17258F.a(strArr);
    }

    void S0(Fragment fragment, Intent intent, int i10, Bundle bundle) {
        if (this.f17256D == null) {
            this.f17292v.m(fragment, intent, i10, bundle);
            return;
        }
        this.f17259G.addLast(new LaunchedFragmentInfo(fragment.mWho, i10));
        if (bundle != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        this.f17256D.a(intent);
    }

    void T() {
        this.f17262J = true;
        this.f17268P.p(true);
        S(4);
    }

    void T0(Fragment fragment, IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        if (this.f17257E == null) {
            this.f17292v.n(fragment, intentSender, i10, intent, i11, i12, i13, bundle);
            return;
        }
        if (bundle != null) {
            if (intent == null) {
                intent = new Intent();
                intent.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            }
            if (J0(2)) {
                bundle.toString();
                intent.toString();
                Objects.toString(fragment);
            }
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        IntentSenderRequest intentSenderRequestA = new IntentSenderRequest.a(intentSender).b(intent).c(i12, i11).a();
        this.f17259G.addLast(new LaunchedFragmentInfo(fragment.mWho, i10));
        if (J0(2)) {
            fragment.toString();
        }
        this.f17257E.a(intentSenderRequestA);
    }

    void U() {
        S(2);
    }

    void U0(int i10, boolean z10) {
        AbstractC1753v abstractC1753v;
        if (this.f17292v == null && i10 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z10 || i10 != this.f17291u) {
            this.f17291u = i10;
            this.f17273c.t();
            s1();
            if (this.f17260H && (abstractC1753v = this.f17292v) != null && this.f17291u == 7) {
                abstractC1753v.o();
                this.f17260H = false;
            }
        }
    }

    void V0() {
        if (this.f17292v == null) {
            return;
        }
        this.f17261I = false;
        this.f17262J = false;
        this.f17268P.p(false);
        for (Fragment fragment : this.f17273c.o()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    public void W(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.f17273c.e(str, fileDescriptor, printWriter, strArr);
        ArrayList arrayList = this.f17275e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i10 = 0; i10 < size2; i10++) {
                Fragment fragment = (Fragment) this.f17275e.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
        ArrayList arrayList2 = this.f17274d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i11 = 0; i11 < size; i11++) {
                C1733a c1733a = (C1733a) this.f17274d.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(c1733a.toString());
                c1733a.x(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f17279i.get());
        synchronized (this.f17271a) {
            try {
                int size3 = this.f17271a.size();
                if (size3 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i12 = 0; i12 < size3; i12++) {
                        l lVar = (l) this.f17271a.get(i12);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i12);
                        printWriter.print(": ");
                        printWriter.println(lVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f17292v);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f17293w);
        if (this.f17294x != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f17294x);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f17291u);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f17261I);
        printWriter.print(" mStopped=");
        printWriter.print(this.f17262J);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f17263K);
        if (this.f17260H) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f17260H);
        }
    }

    void W0(FragmentContainerView fragmentContainerView) {
        View view;
        for (G g10 : this.f17273c.k()) {
            Fragment fragmentK = g10.k();
            if (fragmentK.mContainerId == fragmentContainerView.getId() && (view = fragmentK.mView) != null && view.getParent() == null) {
                fragmentK.mContainer = fragmentContainerView;
                g10.b();
            }
        }
    }

    void X0(G g10) {
        Fragment fragmentK = g10.k();
        if (fragmentK.mDeferStart) {
            if (this.f17272b) {
                this.f17264L = true;
            } else {
                fragmentK.mDeferStart = false;
                g10.m();
            }
        }
    }

    void Y(l lVar, boolean z10) {
        if (!z10) {
            if (this.f17292v == null) {
                if (!this.f17263K) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            q();
        }
        synchronized (this.f17271a) {
            try {
                if (this.f17292v == null) {
                    if (!z10) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f17271a.add(lVar);
                    m1();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void Y0(int i10, int i11, boolean z10) {
        if (i10 >= 0) {
            Y(new m(null, i10, i11), z10);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i10);
    }

    public void Z0(String str, int i10) {
        Y(new m(str, -1, i10), false);
    }

    boolean a0(boolean z10) {
        Z(z10);
        boolean z11 = false;
        while (p0(this.f17265M, this.f17266N)) {
            z11 = true;
            this.f17272b = true;
            try {
                g1(this.f17265M, this.f17266N);
            } finally {
                r();
            }
        }
        u1();
        V();
        this.f17273c.b();
        return z11;
    }

    public boolean a1() {
        return c1(null, -1, 0);
    }

    void b0(l lVar, boolean z10) {
        if (z10 && (this.f17292v == null || this.f17263K)) {
            return;
        }
        Z(z10);
        if (lVar.a(this.f17265M, this.f17266N)) {
            this.f17272b = true;
            try {
                g1(this.f17265M, this.f17266N);
            } finally {
                r();
            }
        }
        u1();
        V();
        this.f17273c.b();
    }

    public boolean b1(int i10, int i11) {
        if (i10 >= 0) {
            return c1(null, i10, i11);
        }
        throw new IllegalArgumentException("Bad id: " + i10);
    }

    boolean d1(ArrayList arrayList, ArrayList arrayList2, String str, int i10, int i11) {
        int iG0 = g0(str, i10, (i11 & 1) != 0);
        if (iG0 < 0) {
            return false;
        }
        for (int size = this.f17274d.size() - 1; size >= iG0; size--) {
            arrayList.add((C1733a) this.f17274d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public boolean e0() {
        boolean zA0 = a0(true);
        n0();
        return zA0;
    }

    void e1(Fragment fragment) {
        if (J0(2)) {
            Objects.toString(fragment);
            int i10 = fragment.mBackStackNesting;
        }
        boolean zIsInBackStack = fragment.isInBackStack();
        if (fragment.mDetached && zIsInBackStack) {
            return;
        }
        this.f17273c.u(fragment);
        if (K0(fragment)) {
            this.f17260H = true;
        }
        fragment.mRemoving = true;
        q1(fragment);
    }

    Fragment f0(String str) {
        return this.f17273c.f(str);
    }

    public void f1(k kVar) {
        ArrayList arrayList = this.f17283m;
        if (arrayList != null) {
            arrayList.remove(kVar);
        }
    }

    void g(C1733a c1733a) {
        if (this.f17274d == null) {
            this.f17274d = new ArrayList();
        }
        this.f17274d.add(c1733a);
    }

    G h(Fragment fragment) {
        String str = fragment.mPreviousWho;
        if (str != null) {
            Z0.c.f(fragment, str);
        }
        if (J0(2)) {
            fragment.toString();
        }
        G gV = v(fragment);
        fragment.mFragmentManager = this;
        this.f17273c.r(gV);
        if (!fragment.mDetached) {
            this.f17273c.a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (K0(fragment)) {
                this.f17260H = true;
            }
        }
        return gV;
    }

    void h1(Fragment fragment) {
        this.f17268P.o(fragment);
    }

    public void i(F f10) {
        this.f17285o.add(f10);
    }

    public Fragment i0(int i10) {
        return this.f17273c.g(i10);
    }

    public void j(k kVar) {
        if (this.f17283m == null) {
            this.f17283m = new ArrayList();
        }
        this.f17283m.add(kVar);
    }

    public Fragment j0(String str) {
        return this.f17273c.h(str);
    }

    void j1(Parcelable parcelable) {
        G g10;
        Bundle bundle;
        Bundle bundle2;
        if (parcelable == null) {
            return;
        }
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.f17292v.f().getClassLoader());
                this.f17281k.put(str.substring(7), bundle2);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f17292v.f().getClassLoader());
                map.put(str2.substring(9), bundle);
            }
        }
        this.f17273c.x(map);
        FragmentManagerState fragmentManagerState = (FragmentManagerState) bundle3.getParcelable("state");
        if (fragmentManagerState == null) {
            return;
        }
        this.f17273c.v();
        Iterator it = fragmentManagerState.f17313g.iterator();
        while (it.hasNext()) {
            Bundle bundleB = this.f17273c.B((String) it.next(), null);
            if (bundleB != null) {
                Fragment fragmentI = this.f17268P.i(((FragmentState) bundleB.getParcelable("state")).f17322h);
                if (fragmentI != null) {
                    if (J0(2)) {
                        fragmentI.toString();
                    }
                    g10 = new G(this.f17284n, this.f17273c, fragmentI, bundleB);
                } else {
                    g10 = new G(this.f17284n, this.f17273c, this.f17292v.f().getClassLoader(), u0(), bundleB);
                }
                Fragment fragmentK = g10.k();
                fragmentK.mSavedFragmentState = bundleB;
                fragmentK.mFragmentManager = this;
                if (J0(2)) {
                    fragmentK.toString();
                }
                g10.o(this.f17292v.f().getClassLoader());
                this.f17273c.r(g10);
                g10.s(this.f17291u);
            }
        }
        for (Fragment fragment : this.f17268P.l()) {
            if (!this.f17273c.c(fragment.mWho)) {
                if (J0(2)) {
                    fragment.toString();
                    Objects.toString(fragmentManagerState.f17313g);
                }
                this.f17268P.o(fragment);
                fragment.mFragmentManager = this;
                G g11 = new G(this.f17284n, this.f17273c, fragment);
                g11.s(1);
                g11.m();
                fragment.mRemoving = true;
                g11.m();
            }
        }
        this.f17273c.w(fragmentManagerState.f17314h);
        if (fragmentManagerState.f17315i != null) {
            this.f17274d = new ArrayList(fragmentManagerState.f17315i.length);
            int i10 = 0;
            while (true) {
                BackStackRecordState[] backStackRecordStateArr = fragmentManagerState.f17315i;
                if (i10 >= backStackRecordStateArr.length) {
                    break;
                }
                C1733a c1733aB = backStackRecordStateArr[i10].b(this);
                if (J0(2)) {
                    int i11 = c1733aB.f17443v;
                    c1733aB.toString();
                    PrintWriter printWriter = new PrintWriter(new N("FragmentManager"));
                    c1733aB.y("  ", printWriter, false);
                    printWriter.close();
                }
                this.f17274d.add(c1733aB);
                i10++;
            }
        } else {
            this.f17274d = null;
        }
        this.f17279i.set(fragmentManagerState.f17316j);
        String str3 = fragmentManagerState.f17317k;
        if (str3 != null) {
            Fragment fragmentF0 = f0(str3);
            this.f17295y = fragmentF0;
            L(fragmentF0);
        }
        ArrayList arrayList = fragmentManagerState.f17318l;
        if (arrayList != null) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                this.f17280j.put((String) arrayList.get(i12), (BackStackState) fragmentManagerState.f17319m.get(i12));
            }
        }
        this.f17259G = new ArrayDeque(fragmentManagerState.f17320n);
    }

    void k(Fragment fragment) {
        this.f17268P.e(fragment);
    }

    Fragment k0(String str) {
        return this.f17273c.i(str);
    }

    int l() {
        return this.f17279i.getAndIncrement();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Bundle l1() {
        BackStackRecordState[] backStackRecordStateArr;
        int size;
        Bundle bundle = new Bundle();
        n0();
        X();
        a0(true);
        this.f17261I = true;
        this.f17268P.p(true);
        ArrayList arrayListY = this.f17273c.y();
        HashMap mapM = this.f17273c.m();
        if (mapM.isEmpty()) {
            J0(2);
            return bundle;
        }
        ArrayList arrayListZ = this.f17273c.z();
        ArrayList arrayList = this.f17274d;
        if (arrayList == null || (size = arrayList.size()) <= 0) {
            backStackRecordStateArr = null;
        } else {
            backStackRecordStateArr = new BackStackRecordState[size];
            for (int i10 = 0; i10 < size; i10++) {
                backStackRecordStateArr[i10] = new BackStackRecordState((C1733a) this.f17274d.get(i10));
                if (J0(2)) {
                    Objects.toString(this.f17274d.get(i10));
                }
            }
        }
        FragmentManagerState fragmentManagerState = new FragmentManagerState();
        fragmentManagerState.f17313g = arrayListY;
        fragmentManagerState.f17314h = arrayListZ;
        fragmentManagerState.f17315i = backStackRecordStateArr;
        fragmentManagerState.f17316j = this.f17279i.get();
        Fragment fragment = this.f17295y;
        if (fragment != null) {
            fragmentManagerState.f17317k = fragment.mWho;
        }
        fragmentManagerState.f17318l.addAll(this.f17280j.keySet());
        fragmentManagerState.f17319m.addAll(this.f17280j.values());
        fragmentManagerState.f17320n = new ArrayList(this.f17259G);
        bundle.putParcelable("state", fragmentManagerState);
        for (String str : this.f17281k.keySet()) {
            bundle.putBundle("result_" + str, (Bundle) this.f17281k.get(str));
        }
        for (String str2 : mapM.keySet()) {
            bundle.putBundle("fragment_" + str2, (Bundle) mapM.get(str2));
        }
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    void m(AbstractC1753v abstractC1753v, AbstractC1750s abstractC1750s, Fragment fragment) {
        String str;
        if (this.f17292v != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f17292v = abstractC1753v;
        this.f17293w = abstractC1750s;
        this.f17294x = fragment;
        if (fragment != null) {
            i(new g(fragment));
        } else if (abstractC1753v instanceof F) {
            i((F) abstractC1753v);
        }
        if (this.f17294x != null) {
            u1();
        }
        if (abstractC1753v instanceof androidx.activity.V) {
            androidx.activity.V v10 = (androidx.activity.V) abstractC1753v;
            androidx.activity.T onBackPressedDispatcher = v10.getOnBackPressedDispatcher();
            this.f17277g = onBackPressedDispatcher;
            androidx.lifecycle.r rVar = v10;
            if (fragment != null) {
                rVar = fragment;
            }
            onBackPressedDispatcher.p(rVar, this.f17278h);
        }
        if (fragment != null) {
            this.f17268P = fragment.mFragmentManager.r0(fragment);
        } else if (abstractC1753v instanceof W) {
            this.f17268P = E.k(((W) abstractC1753v).getViewModelStore());
        } else {
            this.f17268P = new E(false);
        }
        this.f17268P.p(Q0());
        this.f17273c.A(this.f17268P);
        Object obj = this.f17292v;
        if ((obj instanceof InterfaceC2700i) && fragment == null) {
            C2697f savedStateRegistry = ((InterfaceC2700i) obj).getSavedStateRegistry();
            savedStateRegistry.c("android:support:fragments", new C2697f.b() { // from class: androidx.fragment.app.C
                @Override // h1.C2697f.b
                public final Bundle a() {
                    return this.f17199a.l1();
                }
            });
            Bundle bundleA = savedStateRegistry.a("android:support:fragments");
            if (bundleA != null) {
                j1(bundleA);
            }
        }
        Object obj2 = this.f17292v;
        if (obj2 instanceof d.f) {
            d.e activityResultRegistry = ((d.f) obj2).getActivityResultRegistry();
            if (fragment != null) {
                str = fragment.mWho + ":";
            } else {
                str = PointerEventHelper.POINTER_TYPE_UNKNOWN;
            }
            String str2 = "FragmentManager:" + str;
            this.f17256D = activityResultRegistry.o(str2 + "StartActivityForResult", new C2387i(), new h());
            this.f17257E = activityResultRegistry.o(str2 + "StartIntentSenderForResult", new j(), new i());
            this.f17258F = activityResultRegistry.o(str2 + "RequestPermissions", new C2386h(), new a());
        }
        Object obj3 = this.f17292v;
        if (obj3 instanceof androidx.core.content.b) {
            ((androidx.core.content.b) obj3).addOnConfigurationChangedListener(this.f17286p);
        }
        Object obj4 = this.f17292v;
        if (obj4 instanceof androidx.core.content.c) {
            ((androidx.core.content.c) obj4).addOnTrimMemoryListener(this.f17287q);
        }
        Object obj5 = this.f17292v;
        if (obj5 instanceof androidx.core.app.q) {
            ((androidx.core.app.q) obj5).addOnMultiWindowModeChangedListener(this.f17288r);
        }
        Object obj6 = this.f17292v;
        if (obj6 instanceof androidx.core.app.r) {
            ((androidx.core.app.r) obj6).addOnPictureInPictureModeChangedListener(this.f17289s);
        }
        Object obj7 = this.f17292v;
        if ((obj7 instanceof InterfaceC1698v) && fragment == null) {
            ((InterfaceC1698v) obj7).addMenuProvider(this.f17290t);
        }
    }

    void m1() {
        synchronized (this.f17271a) {
            try {
                if (this.f17271a.size() == 1) {
                    this.f17292v.g().removeCallbacks(this.f17270R);
                    this.f17292v.g().post(this.f17270R);
                    u1();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void n(Fragment fragment) {
        if (J0(2)) {
            Objects.toString(fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            this.f17273c.a(fragment);
            if (J0(2)) {
                fragment.toString();
            }
            if (K0(fragment)) {
                this.f17260H = true;
            }
        }
    }

    void n1(Fragment fragment, boolean z10) {
        ViewGroup viewGroupT0 = t0(fragment);
        if (viewGroupT0 == null || !(viewGroupT0 instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupT0).setDrawDisappearingViewsLast(!z10);
    }

    public I o() {
        return new C1733a(this);
    }

    void o1(Fragment fragment, AbstractC1764k.b bVar) {
        if (fragment.equals(f0(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = bVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    boolean p() {
        boolean zK0 = false;
        for (Fragment fragment : this.f17273c.l()) {
            if (fragment != null) {
                zK0 = K0(fragment);
            }
            if (zK0) {
                return true;
            }
        }
        return false;
    }

    void p1(Fragment fragment) {
        if (fragment == null || (fragment.equals(f0(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this))) {
            Fragment fragment2 = this.f17295y;
            this.f17295y = fragment;
            L(fragment2);
            L(this.f17295y);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public int q0() {
        ArrayList arrayList = this.f17274d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    void r1(Fragment fragment) {
        if (J0(2)) {
            Objects.toString(fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    AbstractC1750s s0() {
        return this.f17293w;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.f17294x;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f17294x)));
            sb.append("}");
        } else {
            AbstractC1753v abstractC1753v = this.f17292v;
            if (abstractC1753v != null) {
                sb.append(abstractC1753v.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f17292v)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public AbstractC1752u u0() {
        AbstractC1752u abstractC1752u = this.f17296z;
        if (abstractC1752u != null) {
            return abstractC1752u;
        }
        Fragment fragment = this.f17294x;
        return fragment != null ? fragment.mFragmentManager.u0() : this.f17253A;
    }

    G v(Fragment fragment) {
        G gN = this.f17273c.n(fragment.mWho);
        if (gN != null) {
            return gN;
        }
        G g10 = new G(this.f17284n, this.f17273c, fragment);
        g10.o(this.f17292v.f().getClassLoader());
        g10.s(this.f17291u);
        return g10;
    }

    public List v0() {
        return this.f17273c.o();
    }

    void w(Fragment fragment) {
        if (J0(2)) {
            Objects.toString(fragment);
        }
        if (fragment.mDetached) {
            return;
        }
        fragment.mDetached = true;
        if (fragment.mAdded) {
            if (J0(2)) {
                fragment.toString();
            }
            this.f17273c.u(fragment);
            if (K0(fragment)) {
                this.f17260H = true;
            }
            q1(fragment);
        }
    }

    public AbstractC1753v w0() {
        return this.f17292v;
    }

    void x() {
        this.f17261I = false;
        this.f17262J = false;
        this.f17268P.p(false);
        S(4);
    }

    LayoutInflater.Factory2 x0() {
        return this.f17276f;
    }

    void y() {
        this.f17261I = false;
        this.f17262J = false;
        this.f17268P.p(false);
        S(0);
    }

    x y0() {
        return this.f17284n;
    }

    void z(Configuration configuration, boolean z10) {
        if (z10 && (this.f17292v instanceof androidx.core.content.b)) {
            t1(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        }
        for (Fragment fragment : this.f17273c.o()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
                if (z10) {
                    fragment.mChildFragmentManager.z(configuration, true);
                }
            }
        }
    }

    Fragment z0() {
        return this.f17294x;
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class LaunchedFragmentInfo implements Parcelable {
        public static final Parcelable.Creator<LaunchedFragmentInfo> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        String f17297g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f17298h;

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public LaunchedFragmentInfo createFromParcel(Parcel parcel) {
                return new LaunchedFragmentInfo(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public LaunchedFragmentInfo[] newArray(int i10) {
                return new LaunchedFragmentInfo[i10];
            }
        }

        LaunchedFragmentInfo(String str, int i10) {
            this.f17297g = str;
            this.f17298h = i10;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f17297g);
            parcel.writeInt(this.f17298h);
        }

        LaunchedFragmentInfo(Parcel parcel) {
            this.f17297g = parcel.readString();
            this.f17298h = parcel.readInt();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface k {
        void a(Fragment fragment, boolean z10);

        void onBackStackChanged();

        default void b(Fragment fragment, boolean z10) {
        }
    }
}
