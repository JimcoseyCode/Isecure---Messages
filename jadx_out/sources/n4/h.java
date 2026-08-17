package n4;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1743k;
import androidx.fragment.app.FragmentManager;
import r4.AbstractC3268i;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class h extends DialogInterfaceOnCancelListenerC1743k {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Dialog f30025g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private DialogInterface.OnCancelListener f30026h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Dialog f30027i;

    public static h y(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        h hVar = new h();
        Dialog dialog2 = (Dialog) AbstractC3268i.l(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        hVar.f30025g = dialog2;
        if (onCancelListener != null) {
            hVar.f30026h = onCancelListener;
        }
        return hVar;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1743k, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f30026h;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1743k
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f30025g;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f30027i == null) {
            this.f30027i = new AlertDialog.Builder((Context) AbstractC3268i.k(getContext())).create();
        }
        return this.f30027i;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1743k
    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
