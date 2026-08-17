package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.AbstractActivityC1618q;
import androidx.core.app.b;
import androidx.core.view.InterfaceC1698v;
import androidx.lifecycle.AbstractC1764k;
import androidx.lifecycle.C1772t;
import androidx.lifecycle.W;
import c.InterfaceC1832b;
import h1.C2697f;
import h1.InterfaceC2700i;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: renamed from: androidx.fragment.app.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC1749q extends AbstractActivityC1618q implements b.e {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    boolean mResumed;
    final C1751t mFragments = C1751t.b(new a());
    final C1772t mFragmentLifecycleRegistry = new C1772t(this);
    boolean mStopped = true;

    /* JADX INFO: renamed from: androidx.fragment.app.q$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a extends AbstractC1753v implements androidx.core.content.b, androidx.core.content.c, androidx.core.app.q, androidx.core.app.r, W, androidx.activity.V, d.f, InterfaceC2700i, F, InterfaceC1698v {
        public a() {
            super(AbstractActivityC1749q.this);
        }

        @Override // androidx.fragment.app.F
        public void a(FragmentManager fragmentManager, Fragment fragment) {
            AbstractActivityC1749q.this.onAttachFragment(fragment);
        }

        @Override // androidx.core.view.InterfaceC1698v
        public void addMenuProvider(androidx.core.view.B b10) {
            AbstractActivityC1749q.this.addMenuProvider(b10);
        }

        @Override // androidx.core.content.b
        public void addOnConfigurationChangedListener(H0.a aVar) {
            AbstractActivityC1749q.this.addOnConfigurationChangedListener(aVar);
        }

        @Override // androidx.core.app.q
        public void addOnMultiWindowModeChangedListener(H0.a aVar) {
            AbstractActivityC1749q.this.addOnMultiWindowModeChangedListener(aVar);
        }

        @Override // androidx.core.app.r
        public void addOnPictureInPictureModeChangedListener(H0.a aVar) {
            AbstractActivityC1749q.this.addOnPictureInPictureModeChangedListener(aVar);
        }

        @Override // androidx.core.content.c
        public void addOnTrimMemoryListener(H0.a aVar) {
            AbstractActivityC1749q.this.addOnTrimMemoryListener(aVar);
        }

        @Override // androidx.fragment.app.AbstractC1750s
        public View c(int i10) {
            return AbstractActivityC1749q.this.findViewById(i10);
        }

        @Override // androidx.fragment.app.AbstractC1750s
        public boolean d() {
            Window window = AbstractActivityC1749q.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // d.f
        public d.e getActivityResultRegistry() {
            return AbstractActivityC1749q.this.getActivityResultRegistry();
        }

        @Override // androidx.lifecycle.r
        public AbstractC1764k getLifecycle() {
            return AbstractActivityC1749q.this.mFragmentLifecycleRegistry;
        }

        @Override // androidx.activity.V
        public androidx.activity.T getOnBackPressedDispatcher() {
            return AbstractActivityC1749q.this.getOnBackPressedDispatcher();
        }

        @Override // h1.InterfaceC2700i
        public C2697f getSavedStateRegistry() {
            return AbstractActivityC1749q.this.getSavedStateRegistry();
        }

        @Override // androidx.lifecycle.W
        public androidx.lifecycle.V getViewModelStore() {
            return AbstractActivityC1749q.this.getViewModelStore();
        }

        @Override // androidx.fragment.app.AbstractC1753v
        public void h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            AbstractActivityC1749q.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // androidx.fragment.app.AbstractC1753v
        public LayoutInflater j() {
            return AbstractActivityC1749q.this.getLayoutInflater().cloneInContext(AbstractActivityC1749q.this);
        }

        @Override // androidx.fragment.app.AbstractC1753v
        public boolean l(String str) {
            return androidx.core.app.b.u(AbstractActivityC1749q.this, str);
        }

        @Override // androidx.fragment.app.AbstractC1753v
        public void o() {
            p();
        }

        public void p() {
            AbstractActivityC1749q.this.invalidateMenu();
        }

        @Override // androidx.fragment.app.AbstractC1753v
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public AbstractActivityC1749q i() {
            return AbstractActivityC1749q.this;
        }

        @Override // androidx.core.view.InterfaceC1698v
        public void removeMenuProvider(androidx.core.view.B b10) {
            AbstractActivityC1749q.this.removeMenuProvider(b10);
        }

        @Override // androidx.core.content.b
        public void removeOnConfigurationChangedListener(H0.a aVar) {
            AbstractActivityC1749q.this.removeOnConfigurationChangedListener(aVar);
        }

        @Override // androidx.core.app.q
        public void removeOnMultiWindowModeChangedListener(H0.a aVar) {
            AbstractActivityC1749q.this.removeOnMultiWindowModeChangedListener(aVar);
        }

        @Override // androidx.core.app.r
        public void removeOnPictureInPictureModeChangedListener(H0.a aVar) {
            AbstractActivityC1749q.this.removeOnPictureInPictureModeChangedListener(aVar);
        }

        @Override // androidx.core.content.c
        public void removeOnTrimMemoryListener(H0.a aVar) {
            AbstractActivityC1749q.this.removeOnTrimMemoryListener(aVar);
        }
    }

    public AbstractActivityC1749q() {
        G();
    }

    public static /* synthetic */ Bundle E(AbstractActivityC1749q abstractActivityC1749q) {
        abstractActivityC1749q.markFragmentsCreated();
        abstractActivityC1749q.mFragmentLifecycleRegistry.i(AbstractC1764k.a.ON_STOP);
        return new Bundle();
    }

    private void G() {
        getSavedStateRegistry().c(LIFECYCLE_TAG, new C2697f.b() { // from class: androidx.fragment.app.m
            @Override // h1.C2697f.b
            public final Bundle a() {
                return AbstractActivityC1749q.E(this.f17492a);
            }
        });
        addOnConfigurationChangedListener(new H0.a() { // from class: androidx.fragment.app.n
            @Override // H0.a
            public final void accept(Object obj) {
                this.f17493a.mFragments.m();
            }
        });
        addOnNewIntentListener(new H0.a() { // from class: androidx.fragment.app.o
            @Override // H0.a
            public final void accept(Object obj) {
                this.f17494a.mFragments.m();
            }
        });
        addOnContextAvailableListener(new InterfaceC1832b() { // from class: androidx.fragment.app.p
            @Override // c.InterfaceC1832b
            public final void a(Context context) {
                this.f17495a.mFragments.a(null);
            }
        });
    }

    private static boolean H(FragmentManager fragmentManager, AbstractC1764k.b bVar) {
        boolean zH = false;
        for (Fragment fragment : fragmentManager.v0()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    zH |= H(fragment.getChildFragmentManager(), bVar);
                }
                M m10 = fragment.mViewLifecycleOwner;
                if (m10 != null && m10.getLifecycle().b().j(AbstractC1764k.b.f17593j)) {
                    fragment.mViewLifecycleOwner.f(bVar);
                    zH = true;
                }
                if (fragment.mLifecycleRegistry.b().j(AbstractC1764k.b.f17593j)) {
                    fragment.mLifecycleRegistry.n(bVar);
                    zH = true;
                }
            }
        }
        return zH;
    }

    final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.n(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (shouldDumpInternalState(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.mCreated);
            printWriter.print(" mResumed=");
            printWriter.print(this.mResumed);
            printWriter.print(" mStopped=");
            printWriter.print(this.mStopped);
            if (getApplication() != null) {
                androidx.loader.app.a.b(this).a(str2, fileDescriptor, printWriter, strArr);
            }
            this.mFragments.l().W(str, fileDescriptor, printWriter, strArr);
        }
    }

    public FragmentManager getSupportFragmentManager() {
        return this.mFragments.l();
    }

    @Deprecated
    public androidx.loader.app.a getSupportLoaderManager() {
        return androidx.loader.app.a.b(this);
    }

    void markFragmentsCreated() {
        while (H(getSupportFragmentManager(), AbstractC1764k.b.f17592i)) {
        }
    }

    @Override // androidx.activity.AbstractActivityC1618q, android.app.Activity
    protected void onActivityResult(int i10, int i11, Intent intent) {
        this.mFragments.m();
        super.onActivityResult(i10, i11, intent);
    }

    @Override // androidx.activity.AbstractActivityC1618q, androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.i(AbstractC1764k.a.ON_CREATE);
        this.mFragments.e();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.mFragments.f();
        this.mFragmentLifecycleRegistry.i(AbstractC1764k.a.ON_DESTROY);
    }

    @Override // androidx.activity.AbstractActivityC1618q, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 6) {
            return this.mFragments.d(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.g();
        this.mFragmentLifecycleRegistry.i(AbstractC1764k.a.ON_PAUSE);
    }

    @Override // android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // androidx.activity.AbstractActivityC1618q, android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        this.mFragments.m();
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // android.app.Activity
    protected void onResume() {
        this.mFragments.m();
        super.onResume();
        this.mResumed = true;
        this.mFragments.k();
    }

    protected void onResumeFragments() {
        this.mFragmentLifecycleRegistry.i(AbstractC1764k.a.ON_RESUME);
        this.mFragments.h();
    }

    @Override // android.app.Activity
    protected void onStart() {
        this.mFragments.m();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            this.mFragments.c();
        }
        this.mFragments.k();
        this.mFragmentLifecycleRegistry.i(AbstractC1764k.a.ON_START);
        this.mFragments.i();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.m();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        this.mFragments.j();
        this.mFragmentLifecycleRegistry.i(AbstractC1764k.a.ON_STOP);
    }

    public void setEnterSharedElementCallback(androidx.core.app.u uVar) {
        androidx.core.app.b.s(this, uVar);
    }

    public void setExitSharedElementCallback(androidx.core.app.u uVar) {
        androidx.core.app.b.t(this, uVar);
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i10) {
        startActivityFromFragment(fragment, intent, i10, (Bundle) null);
    }

    @Deprecated
    public void startIntentSenderFromFragment(Fragment fragment, IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
        if (i10 == -1) {
            androidx.core.app.b.w(this, intentSender, i10, intent, i11, i12, i13, bundle);
        } else {
            fragment.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        androidx.core.app.b.o(this);
    }

    public void supportPostponeEnterTransition() {
        androidx.core.app.b.p(this);
    }

    public void supportStartPostponedEnterTransition() {
        androidx.core.app.b.x(this);
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i10, Bundle bundle) {
        if (i10 == -1) {
            androidx.core.app.b.v(this, intent, -1, bundle);
        } else {
            fragment.startActivityForResult(intent, i10, bundle);
        }
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    @Override // androidx.core.app.b.e
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i10) {
    }
}
