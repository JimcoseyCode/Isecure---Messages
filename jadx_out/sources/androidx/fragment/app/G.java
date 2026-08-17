package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.AbstractC1658a0;
import androidx.fragment.app.Q;
import androidx.lifecycle.AbstractC1764k;
import androidx.lifecycle.W;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x f17336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final H f17337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Fragment f17338c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f17339d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f17340e = -1;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f17343a;

        static {
            int[] iArr = new int[AbstractC1764k.b.values().length];
            f17343a = iArr;
            try {
                iArr[AbstractC1764k.b.f17594k.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17343a[AbstractC1764k.b.f17593j.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17343a[AbstractC1764k.b.f17592i.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17343a[AbstractC1764k.b.f17591h.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    G(x xVar, H h10, Fragment fragment) {
        this.f17336a = xVar;
        this.f17337b = h10;
        this.f17338c = fragment;
    }

    private boolean l(View view) {
        if (view == this.f17338c.mView) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f17338c.mView) {
                return true;
            }
        }
        return false;
    }

    void a() {
        if (FragmentManager.J0(3)) {
            Objects.toString(this.f17338c);
        }
        Bundle bundle = this.f17338c.mSavedFragmentState;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        this.f17338c.performActivityCreated(bundle2);
        this.f17336a.a(this.f17338c, bundle2, false);
    }

    void b() {
        Fragment fragmentM0 = FragmentManager.m0(this.f17338c.mContainer);
        Fragment parentFragment = this.f17338c.getParentFragment();
        if (fragmentM0 != null && !fragmentM0.equals(parentFragment)) {
            Fragment fragment = this.f17338c;
            Z0.c.o(fragment, fragmentM0, fragment.mContainerId);
        }
        int iJ = this.f17337b.j(this.f17338c);
        Fragment fragment2 = this.f17338c;
        fragment2.mContainer.addView(fragment2.mView, iJ);
    }

    void c() {
        if (FragmentManager.J0(3)) {
            Objects.toString(this.f17338c);
        }
        Fragment fragment = this.f17338c;
        Fragment fragment2 = fragment.mTarget;
        G gN = null;
        if (fragment2 != null) {
            G gN2 = this.f17337b.n(fragment2.mWho);
            if (gN2 == null) {
                throw new IllegalStateException("Fragment " + this.f17338c + " declared target fragment " + this.f17338c.mTarget + " that does not belong to this FragmentManager!");
            }
            Fragment fragment3 = this.f17338c;
            fragment3.mTargetWho = fragment3.mTarget.mWho;
            fragment3.mTarget = null;
            gN = gN2;
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (gN = this.f17337b.n(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f17338c + " declared target fragment " + this.f17338c.mTargetWho + " that does not belong to this FragmentManager!");
            }
        }
        if (gN != null) {
            gN.m();
        }
        Fragment fragment4 = this.f17338c;
        fragment4.mHost = fragment4.mFragmentManager.w0();
        Fragment fragment5 = this.f17338c;
        fragment5.mParentFragment = fragment5.mFragmentManager.z0();
        this.f17336a.g(this.f17338c, false);
        this.f17338c.performAttach();
        this.f17336a.b(this.f17338c, false);
    }

    int d() {
        Fragment fragment = this.f17338c;
        if (fragment.mFragmentManager == null) {
            return fragment.mState;
        }
        int iMin = this.f17340e;
        int i10 = b.f17343a[fragment.mMaxState.ordinal()];
        if (i10 != 1) {
            iMin = i10 != 2 ? i10 != 3 ? i10 != 4 ? Math.min(iMin, -1) : Math.min(iMin, 0) : Math.min(iMin, 1) : Math.min(iMin, 5);
        }
        Fragment fragment2 = this.f17338c;
        if (fragment2.mFromLayout) {
            if (fragment2.mInLayout) {
                iMin = Math.max(this.f17340e, 2);
                View view = this.f17338c.mView;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f17340e < 4 ? Math.min(iMin, fragment2.mState) : Math.min(iMin, 1);
            }
        }
        if (!this.f17338c.mAdded) {
            iMin = Math.min(iMin, 1);
        }
        Fragment fragment3 = this.f17338c;
        ViewGroup viewGroup = fragment3.mContainer;
        Q.c.a aVarP = viewGroup != null ? Q.r(viewGroup, fragment3.getParentFragmentManager()).p(this) : null;
        if (aVarP == Q.c.a.ADDING) {
            iMin = Math.min(iMin, 6);
        } else if (aVarP == Q.c.a.REMOVING) {
            iMin = Math.max(iMin, 3);
        } else {
            Fragment fragment4 = this.f17338c;
            if (fragment4.mRemoving) {
                iMin = fragment4.isInBackStack() ? Math.min(iMin, 1) : Math.min(iMin, -1);
            }
        }
        Fragment fragment5 = this.f17338c;
        if (fragment5.mDeferStart && fragment5.mState < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (FragmentManager.J0(2)) {
            Objects.toString(this.f17338c);
        }
        return iMin;
    }

    void e() {
        if (FragmentManager.J0(3)) {
            Objects.toString(this.f17338c);
        }
        Bundle bundle = this.f17338c.mSavedFragmentState;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        Fragment fragment = this.f17338c;
        if (fragment.mIsCreated) {
            fragment.mState = 1;
            fragment.restoreChildFragmentState();
        } else {
            this.f17336a.h(fragment, bundle2, false);
            this.f17338c.performCreate(bundle2);
            this.f17336a.c(this.f17338c, bundle2, false);
        }
    }

    void f() {
        String resourceName;
        if (this.f17338c.mFromLayout) {
            return;
        }
        if (FragmentManager.J0(3)) {
            Objects.toString(this.f17338c);
        }
        Bundle bundle = this.f17338c.mSavedFragmentState;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterPerformGetLayoutInflater = this.f17338c.performGetLayoutInflater(bundle2);
        Fragment fragment = this.f17338c;
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i10 = fragment.mContainerId;
            if (i10 != 0) {
                if (i10 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + this.f17338c + " for a container view with no id");
                }
                viewGroup = (ViewGroup) fragment.mFragmentManager.s0().c(this.f17338c.mContainerId);
                if (viewGroup == null) {
                    Fragment fragment2 = this.f17338c;
                    if (!fragment2.mRestored) {
                        try {
                            resourceName = fragment2.getResources().getResourceName(this.f17338c.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f17338c.mContainerId) + " (" + resourceName + ") for fragment " + this.f17338c);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    Z0.c.n(this.f17338c, viewGroup);
                }
            }
        }
        Fragment fragment3 = this.f17338c;
        fragment3.mContainer = viewGroup;
        fragment3.performCreateView(layoutInflaterPerformGetLayoutInflater, viewGroup, bundle2);
        if (this.f17338c.mView != null) {
            if (FragmentManager.J0(3)) {
                Objects.toString(this.f17338c);
            }
            this.f17338c.mView.setSaveFromParentEnabled(false);
            Fragment fragment4 = this.f17338c;
            fragment4.mView.setTag(Y0.b.f12601a, fragment4);
            if (viewGroup != null) {
                b();
            }
            Fragment fragment5 = this.f17338c;
            if (fragment5.mHidden) {
                fragment5.mView.setVisibility(8);
            }
            if (AbstractC1658a0.P(this.f17338c.mView)) {
                AbstractC1658a0.h0(this.f17338c.mView);
            } else {
                View view = this.f17338c.mView;
                view.addOnAttachStateChangeListener(new a(view));
            }
            this.f17338c.performViewCreated();
            x xVar = this.f17336a;
            Fragment fragment6 = this.f17338c;
            xVar.m(fragment6, fragment6.mView, bundle2, false);
            int visibility = this.f17338c.mView.getVisibility();
            this.f17338c.setPostOnViewCreatedAlpha(this.f17338c.mView.getAlpha());
            Fragment fragment7 = this.f17338c;
            if (fragment7.mContainer != null && visibility == 0) {
                View viewFindFocus = fragment7.mView.findFocus();
                if (viewFindFocus != null) {
                    this.f17338c.setFocusedView(viewFindFocus);
                    if (FragmentManager.J0(2)) {
                        viewFindFocus.toString();
                        Objects.toString(this.f17338c);
                    }
                }
                this.f17338c.mView.setAlpha(0.0f);
            }
        }
        this.f17338c.mState = 2;
    }

    void g() {
        Fragment fragmentF;
        if (FragmentManager.J0(3)) {
            Objects.toString(this.f17338c);
        }
        Fragment fragment = this.f17338c;
        boolean zIsChangingConfigurations = true;
        boolean z10 = fragment.mRemoving && !fragment.isInBackStack();
        if (z10) {
            Fragment fragment2 = this.f17338c;
            if (!fragment2.mBeingSaved) {
                this.f17337b.B(fragment2.mWho, null);
            }
        }
        if (!z10 && !this.f17337b.p().q(this.f17338c)) {
            String str = this.f17338c.mTargetWho;
            if (str != null && (fragmentF = this.f17337b.f(str)) != null && fragmentF.mRetainInstance) {
                this.f17338c.mTarget = fragmentF;
            }
            this.f17338c.mState = 0;
            return;
        }
        AbstractC1753v abstractC1753v = this.f17338c.mHost;
        if (abstractC1753v instanceof W) {
            zIsChangingConfigurations = this.f17337b.p().n();
        } else if (abstractC1753v.f() instanceof Activity) {
            zIsChangingConfigurations = true ^ ((Activity) abstractC1753v.f()).isChangingConfigurations();
        }
        if ((z10 && !this.f17338c.mBeingSaved) || zIsChangingConfigurations) {
            this.f17337b.p().f(this.f17338c);
        }
        this.f17338c.performDestroy();
        this.f17336a.d(this.f17338c, false);
        for (G g10 : this.f17337b.k()) {
            if (g10 != null) {
                Fragment fragmentK = g10.k();
                if (this.f17338c.mWho.equals(fragmentK.mTargetWho)) {
                    fragmentK.mTarget = this.f17338c;
                    fragmentK.mTargetWho = null;
                }
            }
        }
        Fragment fragment3 = this.f17338c;
        String str2 = fragment3.mTargetWho;
        if (str2 != null) {
            fragment3.mTarget = this.f17337b.f(str2);
        }
        this.f17337b.s(this);
    }

    void h() {
        View view;
        if (FragmentManager.J0(3)) {
            Objects.toString(this.f17338c);
        }
        Fragment fragment = this.f17338c;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && (view = fragment.mView) != null) {
            viewGroup.removeView(view);
        }
        this.f17338c.performDestroyView();
        this.f17336a.n(this.f17338c, false);
        Fragment fragment2 = this.f17338c;
        fragment2.mContainer = null;
        fragment2.mView = null;
        fragment2.mViewLifecycleOwner = null;
        fragment2.mViewLifecycleOwnerLiveData.n(null);
        this.f17338c.mInLayout = false;
    }

    void i() {
        if (FragmentManager.J0(3)) {
            Objects.toString(this.f17338c);
        }
        this.f17338c.performDetach();
        this.f17336a.e(this.f17338c, false);
        Fragment fragment = this.f17338c;
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if ((!fragment.mRemoving || fragment.isInBackStack()) && !this.f17337b.p().q(this.f17338c)) {
            return;
        }
        if (FragmentManager.J0(3)) {
            Objects.toString(this.f17338c);
        }
        this.f17338c.initState();
    }

    void j() {
        Fragment fragment = this.f17338c;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (FragmentManager.J0(3)) {
                Objects.toString(this.f17338c);
            }
            Bundle bundle = this.f17338c.mSavedFragmentState;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            Fragment fragment2 = this.f17338c;
            fragment2.performCreateView(fragment2.performGetLayoutInflater(bundle2), null, bundle2);
            View view = this.f17338c.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f17338c;
                fragment3.mView.setTag(Y0.b.f12601a, fragment3);
                Fragment fragment4 = this.f17338c;
                if (fragment4.mHidden) {
                    fragment4.mView.setVisibility(8);
                }
                this.f17338c.performViewCreated();
                x xVar = this.f17336a;
                Fragment fragment5 = this.f17338c;
                xVar.m(fragment5, fragment5.mView, bundle2, false);
                this.f17338c.mState = 2;
            }
        }
    }

    Fragment k() {
        return this.f17338c;
    }

    void m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.f17339d) {
            if (FragmentManager.J0(2)) {
                Objects.toString(k());
                return;
            }
            return;
        }
        try {
            this.f17339d = true;
            boolean z10 = false;
            while (true) {
                int iD = d();
                Fragment fragment = this.f17338c;
                int i10 = fragment.mState;
                if (iD == i10) {
                    if (!z10 && i10 == -1 && fragment.mRemoving && !fragment.isInBackStack() && !this.f17338c.mBeingSaved) {
                        if (FragmentManager.J0(3)) {
                            Objects.toString(this.f17338c);
                        }
                        this.f17337b.p().f(this.f17338c);
                        this.f17337b.s(this);
                        if (FragmentManager.J0(3)) {
                            Objects.toString(this.f17338c);
                        }
                        this.f17338c.initState();
                    }
                    Fragment fragment2 = this.f17338c;
                    if (fragment2.mHiddenChanged) {
                        if (fragment2.mView != null && (viewGroup = fragment2.mContainer) != null) {
                            Q qR = Q.r(viewGroup, fragment2.getParentFragmentManager());
                            if (this.f17338c.mHidden) {
                                qR.g(this);
                            } else {
                                qR.i(this);
                            }
                        }
                        Fragment fragment3 = this.f17338c;
                        FragmentManager fragmentManager = fragment3.mFragmentManager;
                        if (fragmentManager != null) {
                            fragmentManager.H0(fragment3);
                        }
                        Fragment fragment4 = this.f17338c;
                        fragment4.mHiddenChanged = false;
                        fragment4.onHiddenChanged(fragment4.mHidden);
                        this.f17338c.mChildFragmentManager.I();
                    }
                    this.f17339d = false;
                    return;
                }
                if (iD <= i10) {
                    switch (i10 - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            if (fragment.mBeingSaved && this.f17337b.q(fragment.mWho) == null) {
                                this.f17337b.B(this.f17338c.mWho, q());
                            }
                            g();
                            break;
                        case 1:
                            h();
                            this.f17338c.mState = 1;
                            break;
                        case 2:
                            fragment.mInLayout = false;
                            fragment.mState = 2;
                            break;
                        case 3:
                            if (FragmentManager.J0(3)) {
                                Objects.toString(this.f17338c);
                            }
                            Fragment fragment5 = this.f17338c;
                            if (fragment5.mBeingSaved) {
                                this.f17337b.B(fragment5.mWho, q());
                            } else if (fragment5.mView != null && fragment5.mSavedViewState == null) {
                                r();
                            }
                            Fragment fragment6 = this.f17338c;
                            if (fragment6.mView != null && (viewGroup2 = fragment6.mContainer) != null) {
                                Q.r(viewGroup2, fragment6.getParentFragmentManager()).h(this);
                            }
                            this.f17338c.mState = 3;
                            break;
                        case 4:
                            u();
                            break;
                        case 5:
                            fragment.mState = 5;
                            break;
                        case 6:
                            n();
                            break;
                    }
                } else {
                    switch (i10 + 1) {
                        case 0:
                            c();
                            break;
                        case 1:
                            e();
                            break;
                        case 2:
                            j();
                            f();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            if (fragment.mView != null && (viewGroup3 = fragment.mContainer) != null) {
                                Q.r(viewGroup3, fragment.getParentFragmentManager()).f(Q.c.b.k(this.f17338c.mView.getVisibility()), this);
                            }
                            this.f17338c.mState = 4;
                            break;
                        case 5:
                            t();
                            break;
                        case 6:
                            fragment.mState = 6;
                            break;
                        case 7:
                            p();
                            break;
                    }
                }
                z10 = true;
            }
        } catch (Throwable th) {
            this.f17339d = false;
            throw th;
        }
    }

    void n() {
        if (FragmentManager.J0(3)) {
            Objects.toString(this.f17338c);
        }
        this.f17338c.performPause();
        this.f17336a.f(this.f17338c, false);
    }

    void o(ClassLoader classLoader) {
        Bundle bundle = this.f17338c.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (this.f17338c.mSavedFragmentState.getBundle("savedInstanceState") == null) {
            this.f17338c.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
        }
        Fragment fragment = this.f17338c;
        fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("viewState");
        Fragment fragment2 = this.f17338c;
        fragment2.mSavedViewRegistryState = fragment2.mSavedFragmentState.getBundle("viewRegistryState");
        FragmentState fragmentState = (FragmentState) this.f17338c.mSavedFragmentState.getParcelable("state");
        if (fragmentState != null) {
            Fragment fragment3 = this.f17338c;
            fragment3.mTargetWho = fragmentState.f17332r;
            fragment3.mTargetRequestCode = fragmentState.f17333s;
            Boolean bool = fragment3.mSavedUserVisibleHint;
            if (bool != null) {
                fragment3.mUserVisibleHint = bool.booleanValue();
                this.f17338c.mSavedUserVisibleHint = null;
            } else {
                fragment3.mUserVisibleHint = fragmentState.f17334t;
            }
        }
        Fragment fragment4 = this.f17338c;
        if (fragment4.mUserVisibleHint) {
            return;
        }
        fragment4.mDeferStart = true;
    }

    void p() {
        if (FragmentManager.J0(3)) {
            Objects.toString(this.f17338c);
        }
        View focusedView = this.f17338c.getFocusedView();
        if (focusedView != null && l(focusedView)) {
            focusedView.requestFocus();
            if (FragmentManager.J0(2)) {
                focusedView.toString();
                Objects.toString(this.f17338c);
                Objects.toString(this.f17338c.mView.findFocus());
            }
        }
        this.f17338c.setFocusedView(null);
        this.f17338c.performResume();
        this.f17336a.i(this.f17338c, false);
        this.f17337b.B(this.f17338c.mWho, null);
        Fragment fragment = this.f17338c;
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    Bundle q() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        Fragment fragment = this.f17338c;
        if (fragment.mState == -1 && (bundle = fragment.mSavedFragmentState) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new FragmentState(this.f17338c));
        if (this.f17338c.mState > -1) {
            Bundle bundle3 = new Bundle();
            this.f17338c.performSaveInstanceState(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.f17336a.j(this.f17338c, bundle3, false);
            Bundle bundle4 = new Bundle();
            this.f17338c.mSavedStateRegistryController.e(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle bundleL1 = this.f17338c.mChildFragmentManager.l1();
            if (!bundleL1.isEmpty()) {
                bundle2.putBundle("childFragmentManager", bundleL1);
            }
            if (this.f17338c.mView != null) {
                r();
            }
            SparseArray<Parcelable> sparseArray = this.f17338c.mSavedViewState;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = this.f17338c.mSavedViewRegistryState;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = this.f17338c.mArguments;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    void r() {
        if (this.f17338c.mView == null) {
            return;
        }
        if (FragmentManager.J0(2)) {
            Objects.toString(this.f17338c);
            Objects.toString(this.f17338c.mView);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f17338c.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f17338c.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.f17338c.mViewLifecycleOwner.e(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.f17338c.mSavedViewRegistryState = bundle;
    }

    void s(int i10) {
        this.f17340e = i10;
    }

    void t() {
        if (FragmentManager.J0(3)) {
            Objects.toString(this.f17338c);
        }
        this.f17338c.performStart();
        this.f17336a.k(this.f17338c, false);
    }

    void u() {
        if (FragmentManager.J0(3)) {
            Objects.toString(this.f17338c);
        }
        this.f17338c.performStop();
        this.f17336a.l(this.f17338c, false);
    }

    G(x xVar, H h10, ClassLoader classLoader, AbstractC1752u abstractC1752u, Bundle bundle) {
        this.f17336a = xVar;
        this.f17337b = h10;
        Fragment fragmentA = ((FragmentState) bundle.getParcelable("state")).a(abstractC1752u, classLoader);
        this.f17338c = fragmentA;
        fragmentA.mSavedFragmentState = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        fragmentA.setArguments(bundle2);
        if (FragmentManager.J0(2)) {
            Objects.toString(fragmentA);
        }
    }

    G(x xVar, H h10, Fragment fragment, Bundle bundle) {
        this.f17336a = xVar;
        this.f17337b = h10;
        this.f17338c = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        fragment.mSavedFragmentState = bundle;
        fragment.mArguments = bundle.getBundle("arguments");
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ View f17341g;

        a(View view) {
            this.f17341g = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f17341g.removeOnAttachStateChangeListener(this);
            AbstractC1658a0.h0(this.f17341g);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }
}
