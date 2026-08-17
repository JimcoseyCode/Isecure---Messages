package com.facebook.react;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractActivityC1749q;
import androidx.fragment.app.Fragment;
import com.facebook.react.internal.featureflags.ReactNativeNewArchitectureFeatureFlags;
import com.facebook.react.modules.core.PermissionAwareActivity;
import com.facebook.react.modules.core.PermissionListener;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 I2\u00020\u00012\u00020\u0002:\u0002JIB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ-\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0004J\u000f\u0010\u0012\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0004J\u000f\u0010\u0013\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0004J)\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010!\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J-\u0010(\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#2\u0006\u0010'\u001a\u00020&H\u0017¢\u0006\u0004\b(\u0010)J'\u0010-\u001a\u00020\u00142\u0006\u0010*\u001a\u00020$2\u0006\u0010+\u001a\u00020\u00142\u0006\u0010,\u001a\u00020\u0014H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u00142\u0006\u0010*\u001a\u00020$H\u0016¢\u0006\u0004\b/\u00100J/\u00103\u001a\u00020\u00072\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#2\u0006\u0010\u0015\u001a\u00020\u00142\b\u00102\u001a\u0004\u0018\u000101H\u0016¢\u0006\u0004\b3\u00104R\"\u00106\u001a\u0002058\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u0016\u0010<\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010>\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u001c\u0010D\u001a\u0004\u0018\u00010@8TX\u0095\u0004¢\u0006\f\u0012\u0004\bC\u0010\u0004\u001a\u0004\bA\u0010BR\u0016\u0010H\u001a\u0004\u0018\u00010E8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bF\u0010G¨\u0006K"}, d2 = {"Lcom/facebook/react/ReactFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/facebook/react/modules/core/PermissionAwareActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Li7/B;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onResume", "onPause", "onDestroy", PointerEventHelper.POINTER_TYPE_UNKNOWN, "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "onBackPressed", "()Z", "keyCode", "Landroid/view/KeyEvent;", "event", "onKeyUp", "(ILandroid/view/KeyEvent;)Z", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "permissions", PointerEventHelper.POINTER_TYPE_UNKNOWN, "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "permission", "pid", "uid", "checkPermission", "(Ljava/lang/String;II)I", "checkSelfPermission", "(Ljava/lang/String;)I", "Lcom/facebook/react/modules/core/PermissionListener;", "listener", "requestPermissions", "([Ljava/lang/String;ILcom/facebook/react/modules/core/PermissionListener;)V", "Lcom/facebook/react/ReactDelegate;", "reactDelegate", "Lcom/facebook/react/ReactDelegate;", "getReactDelegate", "()Lcom/facebook/react/ReactDelegate;", "setReactDelegate", "(Lcom/facebook/react/ReactDelegate;)V", "disableHostLifecycleEvents", "Z", "permissionListener", "Lcom/facebook/react/modules/core/PermissionListener;", "Lcom/facebook/react/ReactNativeHost;", "getReactNativeHost", "()Lcom/facebook/react/ReactNativeHost;", "getReactNativeHost$annotations", "reactNativeHost", "Lcom/facebook/react/ReactHost;", "getReactHost", "()Lcom/facebook/react/ReactHost;", "reactHost", "Companion", "Builder", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class ReactFragment extends Fragment implements PermissionAwareActivity {
    protected static final String ARG_COMPONENT_NAME = "arg_component_name";
    protected static final String ARG_DISABLE_HOST_LIFECYCLE_EVENTS = "arg_disable_host_lifecycle_events";
    protected static final String ARG_FABRIC_ENABLED = "arg_fabric_enabled";
    protected static final String ARG_LAUNCH_OPTIONS = "arg_launch_options";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private boolean disableHostLifecycleEvents;
    private PermissionListener permissionListener;
    protected ReactDelegate reactDelegate;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\u0016\u001a\u00020\u0017J\u0010\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0011H\u0007R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/facebook/react/ReactFragment$Builder;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "componentName", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getComponentName", "()Ljava/lang/String;", "setComponentName", "(Ljava/lang/String;)V", "launchOptions", "Landroid/os/Bundle;", "getLaunchOptions", "()Landroid/os/Bundle;", "setLaunchOptions", "(Landroid/os/Bundle;)V", "fabricEnabled", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getFabricEnabled", "()Z", "setFabricEnabled", "(Z)V", "build", "Lcom/facebook/react/ReactFragment;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {
        private String componentName;
        private boolean fabricEnabled;
        private Bundle launchOptions;

        public final ReactFragment build() {
            return ReactFragment.INSTANCE.newInstance(this.componentName, this.launchOptions, this.fabricEnabled);
        }

        public final String getComponentName() {
            return this.componentName;
        }

        public final boolean getFabricEnabled() {
            return this.fabricEnabled;
        }

        public final Bundle getLaunchOptions() {
            return this.launchOptions;
        }

        /* JADX INFO: renamed from: setComponentName, reason: collision with other method in class */
        public final void m2setComponentName(String str) {
            this.componentName = str;
        }

        /* JADX INFO: renamed from: setFabricEnabled, reason: collision with other method in class */
        public final void m3setFabricEnabled(boolean z10) {
            this.fabricEnabled = z10;
        }

        /* JADX INFO: renamed from: setLaunchOptions, reason: collision with other method in class */
        public final void m4setLaunchOptions(Bundle bundle) {
            this.launchOptions = bundle;
        }

        public final Builder setComponentName(String componentName) {
            AbstractC2855l.g(componentName, "componentName");
            this.componentName = componentName;
            return this;
        }

        public final Builder setFabricEnabled(boolean fabricEnabled) {
            this.fabricEnabled = fabricEnabled;
            return this;
        }

        public final Builder setLaunchOptions(Bundle launchOptions) {
            AbstractC2855l.g(launchOptions, "launchOptions");
            this.launchOptions = launchOptions;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0084T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0084T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0084T¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\u00020\u00058\u0004X\u0085T¢\u0006\b\n\u0000\u0012\u0004\b\t\u0010\u0003¨\u0006\u0011"}, d2 = {"Lcom/facebook/react/ReactFragment$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "ARG_COMPONENT_NAME", PointerEventHelper.POINTER_TYPE_UNKNOWN, "ARG_LAUNCH_OPTIONS", "ARG_FABRIC_ENABLED", "ARG_DISABLE_HOST_LIFECYCLE_EVENTS", "getARG_DISABLE_HOST_LIFECYCLE_EVENTS$annotations", "newInstance", "Lcom/facebook/react/ReactFragment;", "componentName", "launchOptions", "Landroid/os/Bundle;", "fabricEnabled", PointerEventHelper.POINTER_TYPE_UNKNOWN, "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ReactFragment newInstance(String componentName, Bundle launchOptions, boolean fabricEnabled) {
            Bundle bundle = new Bundle();
            bundle.putString(ReactFragment.ARG_COMPONENT_NAME, componentName);
            bundle.putBundle(ReactFragment.ARG_LAUNCH_OPTIONS, launchOptions);
            bundle.putBoolean(ReactFragment.ARG_FABRIC_ENABLED, fabricEnabled);
            ReactFragment reactFragment = new ReactFragment();
            reactFragment.setArguments(bundle);
            return reactFragment;
        }

        private Companion() {
        }

        protected static /* synthetic */ void getARG_DISABLE_HOST_LIFECYCLE_EVENTS$annotations() {
        }
    }

    @Override // com.facebook.react.modules.core.PermissionAwareActivity
    public int checkPermission(String permission, int pid, int uid) {
        AbstractC2855l.g(permission, "permission");
        AbstractActivityC1749q activity = getActivity();
        if (activity != null) {
            return activity.checkPermission(permission, pid, uid);
        }
        return 0;
    }

    @Override // com.facebook.react.modules.core.PermissionAwareActivity
    public int checkSelfPermission(String permission) {
        AbstractC2855l.g(permission, "permission");
        AbstractActivityC1749q activity = getActivity();
        if (activity != null) {
            return activity.checkSelfPermission(permission);
        }
        return 0;
    }

    protected final ReactDelegate getReactDelegate() {
        ReactDelegate reactDelegate = this.reactDelegate;
        if (reactDelegate != null) {
            return reactDelegate;
        }
        AbstractC2855l.y("reactDelegate");
        return null;
    }

    protected ReactHost getReactHost() {
        AbstractActivityC1749q activity = getActivity();
        ReactApplication reactApplication = (ReactApplication) (activity != null ? activity.getApplication() : null);
        if (reactApplication != null) {
            return reactApplication.getReactHost();
        }
        return null;
    }

    protected ReactNativeHost getReactNativeHost() {
        AbstractActivityC1749q activity = getActivity();
        ReactApplication reactApplication = (ReactApplication) (activity != null ? activity.getApplication() : null);
        if (reactApplication != null) {
            return reactApplication.getReactNativeHost();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        getReactDelegate().onActivityResult(requestCode, resultCode, data, false);
    }

    public boolean onBackPressed() {
        return getReactDelegate().onBackPressed();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        boolean z10;
        String str;
        Bundle bundle;
        ReactDelegate reactDelegate;
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString(ARG_COMPONENT_NAME);
            Bundle bundle2 = arguments.getBundle(ARG_LAUNCH_OPTIONS);
            z10 = arguments.getBoolean(ARG_FABRIC_ENABLED);
            this.disableHostLifecycleEvents = arguments.getBoolean(ARG_DISABLE_HOST_LIFECYCLE_EVENTS);
            str = string;
            bundle = bundle2;
        } else {
            z10 = false;
            str = null;
            bundle = null;
        }
        boolean z11 = z10;
        if (str == null) {
            throw new IllegalStateException("Cannot loadApp if component name is null");
        }
        if (ReactNativeNewArchitectureFeatureFlags.enableBridgelessArchitecture()) {
            AbstractActivityC1749q abstractActivityC1749qRequireActivity = requireActivity();
            AbstractC2855l.f(abstractActivityC1749qRequireActivity, "requireActivity(...)");
            reactDelegate = new ReactDelegate(abstractActivityC1749qRequireActivity, getReactHost(), str, bundle);
        } else {
            AbstractActivityC1749q abstractActivityC1749qRequireActivity2 = requireActivity();
            AbstractC2855l.f(abstractActivityC1749qRequireActivity2, "requireActivity(...)");
            reactDelegate = new ReactDelegate(abstractActivityC1749qRequireActivity2, getReactNativeHost(), str, bundle, z11);
        }
        setReactDelegate(reactDelegate);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC2855l.g(inflater, "inflater");
        getReactDelegate().loadApp();
        return getReactDelegate().getReactRootView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        if (this.disableHostLifecycleEvents) {
            getReactDelegate().unloadApp();
        } else {
            getReactDelegate().onHostDestroy();
        }
    }

    public boolean onKeyUp(int keyCode, KeyEvent event) {
        AbstractC2855l.g(event, "event");
        return getReactDelegate().shouldShowDevMenuOrReload(keyCode, event);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        if (this.disableHostLifecycleEvents) {
            return;
        }
        getReactDelegate().onHostPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        AbstractC2855l.g(permissions, "permissions");
        AbstractC2855l.g(grantResults, "grantResults");
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        PermissionListener permissionListener = this.permissionListener;
        if (permissionListener == null || !permissionListener.onRequestPermissionsResult(requestCode, permissions, grantResults)) {
            return;
        }
        this.permissionListener = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.disableHostLifecycleEvents) {
            return;
        }
        getReactDelegate().onHostResume();
    }

    @Override // com.facebook.react.modules.core.PermissionAwareActivity
    public void requestPermissions(String[] permissions, int requestCode, PermissionListener listener) {
        AbstractC2855l.g(permissions, "permissions");
        this.permissionListener = listener;
        requestPermissions(permissions, requestCode);
    }

    protected final void setReactDelegate(ReactDelegate reactDelegate) {
        AbstractC2855l.g(reactDelegate, "<set-?>");
        this.reactDelegate = reactDelegate;
    }

    protected static /* synthetic */ void getReactNativeHost$annotations() {
    }
}
