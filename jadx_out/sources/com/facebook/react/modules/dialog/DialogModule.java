package com.facebook.react.modules.dialog;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.AbstractActivityC1749q;
import androidx.fragment.app.FragmentManager;
import com.facebook.fbreact.specs.NativeDialogManagerAndroidSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.PointerEventHelper;
import d2.AbstractC2325a;
import i7.t;
import j7.K;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@ReactModule(name = "DialogManagerAndroid")
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 !2\u00020\u00012\u00020\u0002:\u0003\"#!B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u000eJ'\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0019\u0010\u000eR\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010 \u001a\b\u0018\u00010\u001dR\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006$"}, d2 = {"Lcom/facebook/react/modules/dialog/DialogModule;", "Lcom/facebook/fbreact/specs/NativeDialogManagerAndroidSpec;", "Lcom/facebook/react/bridge/LifecycleEventListener;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "getTypedExportedConstants", "()Ljava/util/Map;", "Li7/B;", "initialize", "()V", "onHostPause", "onHostDestroy", "onHostResume", "Lcom/facebook/react/bridge/ReadableMap;", "options", "Lcom/facebook/react/bridge/Callback;", "errorCallback", "actionCallback", "showAlert", "(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Callback;Lcom/facebook/react/bridge/Callback;)V", "invalidate", PointerEventHelper.POINTER_TYPE_UNKNOWN, "isInForeground", "Z", "Lcom/facebook/react/modules/dialog/DialogModule$FragmentManagerHelper;", "getFragmentManagerHelper", "()Lcom/facebook/react/modules/dialog/DialogModule$FragmentManagerHelper;", "fragmentManagerHelper", "Companion", "FragmentManagerHelper", "AlertFragmentListener", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DialogModule extends NativeDialogManagerAndroidSpec implements LifecycleEventListener {
    public static final String FRAGMENT_TAG = "com.facebook.catalyst.react.dialog.DialogModule";
    private static final String KEY_CANCELABLE = "cancelable";
    private static final String KEY_ITEMS = "items";
    private static final String KEY_MESSAGE = "message";
    private static final String KEY_TITLE = "title";
    public static final String NAME = "DialogManagerAndroid";
    private boolean isInForeground;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String ACTION_BUTTON_CLICKED = "buttonClicked";
    public static final String ACTION_DISMISSED = "dismissed";
    private static final String KEY_BUTTON_POSITIVE = "buttonPositive";
    private static final String KEY_BUTTON_NEGATIVE = "buttonNegative";
    private static final String KEY_BUTTON_NEUTRAL = "buttonNeutral";
    private static final Map<String, Object> CONSTANTS = K.l(t.a(ACTION_BUTTON_CLICKED, ACTION_BUTTON_CLICKED), t.a(ACTION_DISMISSED, ACTION_DISMISSED), t.a(KEY_BUTTON_POSITIVE, -1), t.a(KEY_BUTTON_NEGATIVE, -2), t.a(KEY_BUTTON_NEUTRAL, -3));

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0080\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/facebook/react/modules/dialog/DialogModule$AlertFragmentListener;", "Landroid/content/DialogInterface$OnClickListener;", "Landroid/content/DialogInterface$OnDismissListener;", "Lcom/facebook/react/bridge/Callback;", "callback", "<init>", "(Lcom/facebook/react/modules/dialog/DialogModule;Lcom/facebook/react/bridge/Callback;)V", "Landroid/content/DialogInterface;", "dialog", PointerEventHelper.POINTER_TYPE_UNKNOWN, "which", "Li7/B;", ViewProps.ON_CLICK, "(Landroid/content/DialogInterface;I)V", "onDismiss", "(Landroid/content/DialogInterface;)V", "Lcom/facebook/react/bridge/Callback;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "callbackConsumed", "Z", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class AlertFragmentListener implements DialogInterface.OnClickListener, DialogInterface.OnDismissListener {
        private final Callback callback;
        private boolean callbackConsumed;
        final /* synthetic */ DialogModule this$0;

        public AlertFragmentListener(DialogModule dialogModule, Callback callback) {
            AbstractC2855l.g(callback, "callback");
            this.this$0 = dialogModule;
            this.callback = callback;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialog, int which) {
            AbstractC2855l.g(dialog, "dialog");
            if (this.callbackConsumed || !this.this$0.getReactApplicationContext().hasActiveReactInstance()) {
                return;
            }
            this.callback.invoke(DialogModule.ACTION_BUTTON_CLICKED, Integer.valueOf(which));
            this.callbackConsumed = true;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialog) {
            if (this.callbackConsumed || !this.this$0.getReactApplicationContext().hasActiveReactInstance()) {
                return;
            }
            this.callback.invoke(DialogModule.ACTION_DISMISSED);
            this.callbackConsumed = true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010$\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\u00020\u00058\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0003R\u0016\u0010\b\u001a\u00020\u00058\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\t\u0010\u0003R\u0016\u0010\n\u001a\u00020\u00058\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u000b\u0010\u0003R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/facebook/react/modules/dialog/DialogModule$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "NAME", PointerEventHelper.POINTER_TYPE_UNKNOWN, "FRAGMENT_TAG", "getFRAGMENT_TAG$ReactAndroid_release$annotations", "ACTION_BUTTON_CLICKED", "getACTION_BUTTON_CLICKED$ReactAndroid_release$annotations", "ACTION_DISMISSED", "getACTION_DISMISSED$ReactAndroid_release$annotations", "KEY_TITLE", "KEY_MESSAGE", "KEY_BUTTON_POSITIVE", "KEY_BUTTON_NEGATIVE", "KEY_BUTTON_NEUTRAL", "KEY_ITEMS", "KEY_CANCELABLE", "CONSTANTS", PointerEventHelper.POINTER_TYPE_UNKNOWN, "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getACTION_BUTTON_CLICKED$ReactAndroid_release$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getACTION_DISMISSED$ReactAndroid_release$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getFRAGMENT_TAG$ReactAndroid_release$annotations() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ\u001f\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/facebook/react/modules/dialog/DialogModule$FragmentManagerHelper;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "<init>", "(Lcom/facebook/react/modules/dialog/DialogModule;Landroidx/fragment/app/FragmentManager;)V", "Li7/B;", "showPendingAlert", "()V", "dismissExisting", "Landroid/os/Bundle;", "arguments", "Lcom/facebook/react/bridge/Callback;", "actionCallback", "showNewAlert", "(Landroid/os/Bundle;Lcom/facebook/react/bridge/Callback;)V", "Landroidx/fragment/app/FragmentManager;", "Lcom/facebook/react/modules/dialog/AlertFragment;", "fragmentToShow", "Lcom/facebook/react/modules/dialog/AlertFragment;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    final class FragmentManagerHelper {
        private final FragmentManager fragmentManager;
        private AlertFragment fragmentToShow;
        final /* synthetic */ DialogModule this$0;

        public FragmentManagerHelper(DialogModule dialogModule, FragmentManager fragmentManager) {
            AbstractC2855l.g(fragmentManager, "fragmentManager");
            this.this$0 = dialogModule;
            this.fragmentManager = fragmentManager;
        }

        public final void dismissExisting() {
            AlertFragment alertFragment;
            if (this.this$0.isInForeground && (alertFragment = (AlertFragment) this.fragmentManager.j0(DialogModule.FRAGMENT_TAG)) != null && alertFragment.isResumed()) {
                alertFragment.dismiss();
            }
        }

        public final void showNewAlert(Bundle arguments, Callback actionCallback) {
            AbstractC2855l.g(arguments, "arguments");
            UiThreadUtil.assertOnUiThread();
            dismissExisting();
            AlertFragment alertFragment = new AlertFragment(actionCallback != null ? new AlertFragmentListener(this.this$0, actionCallback) : null, arguments);
            if (!this.this$0.isInForeground || this.fragmentManager.Q0()) {
                this.fragmentToShow = alertFragment;
                return;
            }
            if (arguments.containsKey(DialogModule.KEY_CANCELABLE)) {
                alertFragment.setCancelable(arguments.getBoolean(DialogModule.KEY_CANCELABLE));
            }
            alertFragment.show(this.fragmentManager, DialogModule.FRAGMENT_TAG);
        }

        public final void showPendingAlert() {
            UiThreadUtil.assertOnUiThread();
            SoftAssertions.assertCondition(this.this$0.isInForeground, "showPendingAlert() called in background");
            AlertFragment alertFragment = this.fragmentToShow;
            if (alertFragment == null) {
                return;
            }
            dismissExisting();
            alertFragment.show(this.fragmentManager, DialogModule.FRAGMENT_TAG);
            this.fragmentToShow = null;
        }
    }

    public DialogModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private final FragmentManagerHelper getFragmentManagerHelper() {
        Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        if (!(currentActivity instanceof AbstractActivityC1749q)) {
            return null;
        }
        FragmentManager supportFragmentManager = ((AbstractActivityC1749q) currentActivity).getSupportFragmentManager();
        AbstractC2855l.f(supportFragmentManager, "getSupportFragmentManager(...)");
        return new FragmentManagerHelper(this, supportFragmentManager);
    }

    @Override // com.facebook.fbreact.specs.NativeDialogManagerAndroidSpec
    public Map<String, Object> getTypedExportedConstants() {
        return CONSTANTS;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        getReactApplicationContext().addLifecycleEventListener(this);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        getReactApplicationContext().removeLifecycleEventListener(this);
        super.invalidate();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        this.isInForeground = false;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        this.isInForeground = true;
        FragmentManagerHelper fragmentManagerHelper = getFragmentManagerHelper();
        if (fragmentManagerHelper != null) {
            fragmentManagerHelper.showPendingAlert();
        } else {
            AbstractC2325a.E(DialogModule.class, "onHostResume called but no FragmentManager found");
        }
    }

    @Override // com.facebook.fbreact.specs.NativeDialogManagerAndroidSpec
    public void showAlert(ReadableMap options, Callback errorCallback, final Callback actionCallback) {
        AbstractC2855l.g(options, "options");
        AbstractC2855l.g(errorCallback, "errorCallback");
        AbstractC2855l.g(actionCallback, "actionCallback");
        final FragmentManagerHelper fragmentManagerHelper = getFragmentManagerHelper();
        if (fragmentManagerHelper == null) {
            errorCallback.invoke("Tried to show an alert while not attached to an Activity");
            return;
        }
        final Bundle bundle = new Bundle();
        if (options.hasKey("title")) {
            bundle.putString("title", options.getString("title"));
        }
        if (options.hasKey("message")) {
            bundle.putString("message", options.getString("message"));
        }
        if (options.hasKey(KEY_BUTTON_POSITIVE)) {
            bundle.putString(AlertFragment.ARG_BUTTON_POSITIVE, options.getString(KEY_BUTTON_POSITIVE));
        }
        if (options.hasKey(KEY_BUTTON_NEGATIVE)) {
            bundle.putString(AlertFragment.ARG_BUTTON_NEGATIVE, options.getString(KEY_BUTTON_NEGATIVE));
        }
        if (options.hasKey(KEY_BUTTON_NEUTRAL)) {
            bundle.putString(AlertFragment.ARG_BUTTON_NEUTRAL, options.getString(KEY_BUTTON_NEUTRAL));
        }
        if (options.hasKey("items")) {
            ReadableArray array = options.getArray("items");
            if (array == null) {
                throw new IllegalStateException("Required value was null.");
            }
            CharSequence[] charSequenceArr = new CharSequence[array.size()];
            int size = array.size();
            for (int i10 = 0; i10 < size; i10++) {
                charSequenceArr[i10] = array.getString(i10);
            }
            bundle.putCharSequenceArray("items", charSequenceArr);
        }
        if (options.hasKey(KEY_CANCELABLE)) {
            bundle.putBoolean(KEY_CANCELABLE, options.getBoolean(KEY_CANCELABLE));
        }
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.modules.dialog.b
            @Override // java.lang.Runnable
            public final void run() {
                fragmentManagerHelper.showNewAlert(bundle, actionCallback);
            }
        });
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }
}
