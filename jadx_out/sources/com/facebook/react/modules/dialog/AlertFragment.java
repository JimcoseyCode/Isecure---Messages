package com.facebook.react.modules.dialog;

import I0.z;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.c;
import androidx.core.view.AbstractC1658a0;
import androidx.core.view.C1657a;
import androidx.fragment.app.AbstractActivityC1749q;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1743k;
import com.facebook.react.R;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.PointerEventHelper;
import f.AbstractC2577j;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o3.AbstractC3007a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\u0001\u0019B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B!\b\u0011\u0012\f\u0010\u0007\u001a\b\u0018\u00010\u0005R\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0003\u0010\nJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0007\u001a\b\u0018\u00010\u0005R\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/facebook/react/modules/dialog/AlertFragment;", "Landroidx/fragment/app/k;", "Landroid/content/DialogInterface$OnClickListener;", "<init>", "()V", "Lcom/facebook/react/modules/dialog/DialogModule$AlertFragmentListener;", "Lcom/facebook/react/modules/dialog/DialogModule;", "listener", "Landroid/os/Bundle;", "arguments", "(Lcom/facebook/react/modules/dialog/DialogModule$AlertFragmentListener;Landroid/os/Bundle;)V", "savedInstanceState", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "Landroid/content/DialogInterface;", "dialog", PointerEventHelper.POINTER_TYPE_UNKNOWN, "which", "Li7/B;", ViewProps.ON_CLICK, "(Landroid/content/DialogInterface;I)V", "onDismiss", "(Landroid/content/DialogInterface;)V", "Lcom/facebook/react/modules/dialog/DialogModule$AlertFragmentListener;", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AlertFragment extends DialogInterfaceOnCancelListenerC1743k implements DialogInterface.OnClickListener {
    public static final String ARG_BUTTON_NEGATIVE = "button_negative";
    public static final String ARG_BUTTON_NEUTRAL = "button_neutral";
    public static final String ARG_BUTTON_POSITIVE = "button_positive";
    public static final String ARG_ITEMS = "items";
    public static final String ARG_MESSAGE = "message";
    public static final String ARG_TITLE = "title";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final DialogModule.AlertFragmentListener listener;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0005H\u0002J \u0010\u0018\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J \u0010\u0019\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/facebook/react/modules/dialog/AlertFragment$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "ARG_TITLE", PointerEventHelper.POINTER_TYPE_UNKNOWN, "ARG_MESSAGE", "ARG_BUTTON_POSITIVE", "ARG_BUTTON_NEGATIVE", "ARG_BUTTON_NEUTRAL", "ARG_ITEMS", "createDialog", "Landroid/app/Dialog;", "activityContext", "Landroid/content/Context;", "arguments", "Landroid/os/Bundle;", "fragment", "Landroid/content/DialogInterface$OnClickListener;", "isAppCompatTheme", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getAccessibleTitle", "Landroid/view/View;", "titleText", "createAppCompatDialog", "createAppDialog", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Dialog createAppCompatDialog(Context activityContext, Bundle arguments, DialogInterface.OnClickListener fragment) {
            c.a aVar = new c.a(activityContext);
            if (arguments.containsKey(AlertFragment.ARG_TITLE)) {
                String str = (String) AbstractC3007a.c(arguments.getString(AlertFragment.ARG_TITLE));
                AbstractC2855l.d(str);
                aVar.e(getAccessibleTitle(activityContext, str));
            }
            if (arguments.containsKey(AlertFragment.ARG_BUTTON_POSITIVE)) {
                aVar.l(arguments.getString(AlertFragment.ARG_BUTTON_POSITIVE), fragment);
            }
            if (arguments.containsKey(AlertFragment.ARG_BUTTON_NEGATIVE)) {
                aVar.i(arguments.getString(AlertFragment.ARG_BUTTON_NEGATIVE), fragment);
            }
            if (arguments.containsKey(AlertFragment.ARG_BUTTON_NEUTRAL)) {
                aVar.j(arguments.getString(AlertFragment.ARG_BUTTON_NEUTRAL), fragment);
            }
            if (arguments.containsKey("message")) {
                aVar.h(arguments.getString("message"));
            }
            if (arguments.containsKey(AlertFragment.ARG_ITEMS)) {
                aVar.g(arguments.getCharSequenceArray(AlertFragment.ARG_ITEMS), fragment);
            }
            c cVarA = aVar.a();
            AbstractC2855l.f(cVarA, "create(...)");
            return cVarA;
        }

        private final Dialog createAppDialog(Context activityContext, Bundle arguments, DialogInterface.OnClickListener fragment) {
            AlertDialog.Builder builder = new AlertDialog.Builder(activityContext);
            if (arguments.containsKey(AlertFragment.ARG_TITLE)) {
                String str = (String) AbstractC3007a.c(arguments.getString(AlertFragment.ARG_TITLE));
                AbstractC2855l.d(str);
                builder.setCustomTitle(getAccessibleTitle(activityContext, str));
            }
            if (arguments.containsKey(AlertFragment.ARG_BUTTON_POSITIVE)) {
                builder.setPositiveButton(arguments.getString(AlertFragment.ARG_BUTTON_POSITIVE), fragment);
            }
            if (arguments.containsKey(AlertFragment.ARG_BUTTON_NEGATIVE)) {
                builder.setNegativeButton(arguments.getString(AlertFragment.ARG_BUTTON_NEGATIVE), fragment);
            }
            if (arguments.containsKey(AlertFragment.ARG_BUTTON_NEUTRAL)) {
                builder.setNeutralButton(arguments.getString(AlertFragment.ARG_BUTTON_NEUTRAL), fragment);
            }
            if (arguments.containsKey("message")) {
                builder.setMessage(arguments.getString("message"));
            }
            if (arguments.containsKey(AlertFragment.ARG_ITEMS)) {
                builder.setItems(arguments.getCharSequenceArray(AlertFragment.ARG_ITEMS), fragment);
            }
            AlertDialog alertDialogCreate = builder.create();
            AbstractC2855l.f(alertDialogCreate, "create(...)");
            return alertDialogCreate;
        }

        private final View getAccessibleTitle(Context activityContext, String titleText) {
            View viewInflate = LayoutInflater.from(activityContext).inflate(R.layout.alert_title_layout, (ViewGroup) null);
            AbstractC2855l.f(viewInflate, "inflate(...)");
            Object objC = AbstractC3007a.c(viewInflate.findViewById(R.id.alert_title));
            AbstractC2855l.f(objC, "assertNotNull(...)");
            final TextView textView = (TextView) objC;
            textView.setText(titleText);
            textView.setFocusable(true);
            if (Build.VERSION.SDK_INT >= 28) {
                textView.setAccessibilityHeading(true);
                return viewInflate;
            }
            AbstractC1658a0.k0(textView, new C1657a() { // from class: com.facebook.react.modules.dialog.AlertFragment$Companion$getAccessibleTitle$1
                @Override // androidx.core.view.C1657a
                public void onInitializeAccessibilityNodeInfo(View view, z info) {
                    AbstractC2855l.g(view, "view");
                    AbstractC2855l.g(info, "info");
                    super.onInitializeAccessibilityNodeInfo(textView, info);
                    info.F0(true);
                }
            });
            return viewInflate;
        }

        private final boolean isAppCompatTheme(Context activityContext) {
            TypedArray typedArrayObtainStyledAttributes = activityContext.obtainStyledAttributes(AbstractC2577j.f27154y0);
            AbstractC2855l.f(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(AbstractC2577j.f26921D0);
            typedArrayObtainStyledAttributes.recycle();
            return zHasValue;
        }

        public final Dialog createDialog(Context activityContext, Bundle arguments, DialogInterface.OnClickListener fragment) {
            AbstractC2855l.g(activityContext, "activityContext");
            AbstractC2855l.g(arguments, "arguments");
            AbstractC2855l.g(fragment, "fragment");
            return isAppCompatTheme(activityContext) ? createAppCompatDialog(activityContext, arguments, fragment) : createAppDialog(activityContext, arguments, fragment);
        }

        private Companion() {
        }
    }

    public AlertFragment() {
        this.listener = null;
    }

    public static final Dialog createDialog(Context context, Bundle bundle, DialogInterface.OnClickListener onClickListener) {
        return INSTANCE.createDialog(context, bundle, onClickListener);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialog, int which) {
        AbstractC2855l.g(dialog, "dialog");
        DialogModule.AlertFragmentListener alertFragmentListener = this.listener;
        if (alertFragmentListener != null) {
            alertFragmentListener.onClick(dialog, which);
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1743k
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Companion companion = INSTANCE;
        AbstractActivityC1749q abstractActivityC1749qRequireActivity = requireActivity();
        AbstractC2855l.f(abstractActivityC1749qRequireActivity, "requireActivity(...)");
        Bundle bundleRequireArguments = requireArguments();
        AbstractC2855l.f(bundleRequireArguments, "requireArguments(...)");
        return companion.createDialog(abstractActivityC1749qRequireActivity, bundleRequireArguments, this);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1743k, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        AbstractC2855l.g(dialog, "dialog");
        super.onDismiss(dialog);
        DialogModule.AlertFragmentListener alertFragmentListener = this.listener;
        if (alertFragmentListener != null) {
            alertFragmentListener.onDismiss(dialog);
        }
    }

    public AlertFragment(DialogModule.AlertFragmentListener alertFragmentListener, Bundle bundle) {
        this.listener = alertFragmentListener;
        setArguments(bundle);
    }
}
