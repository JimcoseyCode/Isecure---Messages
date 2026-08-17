package n4;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import r4.AbstractC3268i;

/* JADX INFO: renamed from: n4.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class DialogFragmentC2962a extends DialogFragment {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Dialog f30021g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private DialogInterface.OnCancelListener f30022h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Dialog f30023i;

    public static DialogFragmentC2962a a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        DialogFragmentC2962a dialogFragmentC2962a = new DialogFragmentC2962a();
        Dialog dialog2 = (Dialog) AbstractC3268i.l(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        dialogFragmentC2962a.f30021g = dialog2;
        if (onCancelListener != null) {
            dialogFragmentC2962a.f30022h = onCancelListener;
        }
        return dialogFragmentC2962a;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f30022h;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f30021g;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f30023i == null) {
            this.f30023i = new AlertDialog.Builder((Context) AbstractC3268i.k(getActivity())).create();
        }
        return this.f30023i;
    }

    @Override // android.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
