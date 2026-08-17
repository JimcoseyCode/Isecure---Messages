package com.google.android.gms.common;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.core.app.l;
import androidx.fragment.app.AbstractActivityC1749q;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.google.android.gms.common.api.GoogleApiActivity;
import expo.modules.notifications.service.NotificationsService;
import l4.AbstractC2867a;
import n4.DialogFragmentC2962a;
import p4.AbstractC3069p;
import p4.C3070q;
import p4.InterfaceC3058e;
import r4.AbstractC3268i;
import r4.v;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class a extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f21003c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Object f21001e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final a f21002f = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f21000d = b.f21112a;

    public static a m() {
        return f21002f;
    }

    @Override // com.google.android.gms.common.b
    public Intent b(Context context, int i10, String str) {
        return super.b(context, i10, str);
    }

    @Override // com.google.android.gms.common.b
    public PendingIntent c(Context context, int i10, int i11) {
        return super.c(context, i10, i11);
    }

    @Override // com.google.android.gms.common.b
    public final String e(int i10) {
        return super.e(i10);
    }

    @Override // com.google.android.gms.common.b
    public int g(Context context) {
        return super.g(context);
    }

    @Override // com.google.android.gms.common.b
    public int h(Context context, int i10) {
        return super.h(context, i10);
    }

    @Override // com.google.android.gms.common.b
    public final boolean j(int i10) {
        return super.j(i10);
    }

    public Dialog k(Activity activity, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        return p(activity, i10, v.b(activity, b(activity, i10, "d"), i11), onCancelListener, null);
    }

    public PendingIntent l(Context context, ConnectionResult connectionResult) {
        return connectionResult.k0() ? connectionResult.X() : c(context, connectionResult.e(), 0);
    }

    public boolean n(Activity activity, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogK = k(activity, i10, i11, onCancelListener);
        if (dialogK == null) {
            return false;
        }
        s(activity, dialogK, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public void o(Context context, int i10) {
        t(context, i10, null, d(context, i10, 0, "n"));
    }

    final Dialog p(Context context, int i10, v vVar, DialogInterface.OnCancelListener onCancelListener, DialogInterface.OnClickListener onClickListener) {
        if (i10 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(r4.s.c(context, i10));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String strB = r4.s.b(context, i10);
        DialogInterface.OnClickListener onClickListener2 = vVar;
        if (strB != null) {
            if (vVar == null) {
                onClickListener2 = onClickListener;
            }
            builder.setPositiveButton(strB, onClickListener2);
        }
        String strF = r4.s.f(context, i10);
        if (strF != null) {
            builder.setTitle(strF);
        }
        String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i10));
        new IllegalArgumentException();
        return builder.create();
    }

    public final Dialog q(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, R.attr.progressBarStyleLarge);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(r4.s.c(activity, 18));
        builder.setPositiveButton(PointerEventHelper.POINTER_TYPE_UNKNOWN, (DialogInterface.OnClickListener) null);
        AlertDialog alertDialogCreate = builder.create();
        s(activity, alertDialogCreate, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return alertDialogCreate;
    }

    public final C3070q r(Context context, AbstractC3069p abstractC3069p) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        C3070q c3070q = new C3070q(abstractC3069p);
        D4.g.m(context, c3070q, intentFilter);
        c3070q.a(context);
        if (i(context, "com.google.android.gms")) {
            return c3070q;
        }
        abstractC3069p.a();
        c3070q.b();
        return null;
    }

    final void s(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof AbstractActivityC1749q) {
                n4.h.y(dialog, onCancelListener).show(((AbstractActivityC1749q) activity).getSupportFragmentManager(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        DialogFragmentC2962a.a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    final void t(Context context, int i10, String str, PendingIntent pendingIntent) {
        int i11;
        String str2;
        String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i10), null);
        new IllegalArgumentException();
        if (i10 == 18) {
            u(context);
            return;
        }
        if (pendingIntent == null) {
            return;
        }
        String strE = r4.s.e(context, i10);
        String strD = r4.s.d(context, i10);
        Resources resources = context.getResources();
        NotificationManager notificationManager = (NotificationManager) AbstractC3268i.k(context.getSystemService(NotificationsService.NOTIFICATION_KEY));
        l.e eVarA = new l.e(context).s(true).g(true).l(strE).A(new l.c().h(strD));
        if (y4.g.b(context)) {
            AbstractC3268i.n(y4.l.d());
            eVarA.y(context.getApplicationInfo().icon).v(2);
            if (y4.g.c(context)) {
                eVarA.a(AbstractC2867a.f29428a, resources.getString(l4.b.f29443o), pendingIntent);
            } else {
                eVarA.j(pendingIntent);
            }
        } else {
            eVarA.y(R.drawable.stat_sys_warning).C(resources.getString(l4.b.f29436h)).F(System.currentTimeMillis()).j(pendingIntent).k(strD);
        }
        if (y4.l.g()) {
            AbstractC3268i.n(y4.l.g());
            synchronized (f21001e) {
                str2 = this.f21003c;
            }
            if (str2 == null) {
                str2 = "com.google.android.gms.availability";
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String string = context.getResources().getString(l4.b.f29435g);
                if (notificationChannel == null) {
                    notificationManager.createNotificationChannel(n4.f.a("com.google.android.gms.availability", string, 4));
                } else if (!string.contentEquals(notificationChannel.getName())) {
                    notificationChannel.setName(string);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
            }
            eVarA.h(str2);
        }
        Notification notificationD = eVarA.d();
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            d.f21116b.set(false);
            i11 = 10436;
        } else {
            i11 = 39789;
        }
        notificationManager.notify(i11, notificationD);
    }

    final void u(Context context) {
        new f(this, context).sendEmptyMessageDelayed(1, 120000L);
    }

    public final boolean v(Activity activity, InterfaceC3058e interfaceC3058e, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogP = p(activity, i10, v.c(interfaceC3058e, b(activity, i10, "d"), 2), onCancelListener, null);
        if (dialogP == null) {
            return false;
        }
        s(activity, dialogP, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public final boolean w(Context context, ConnectionResult connectionResult, int i10) {
        PendingIntent pendingIntentL;
        if (A4.b.a(context) || (pendingIntentL = l(context, connectionResult)) == null) {
            return false;
        }
        t(context, connectionResult.e(), null, PendingIntent.getActivity(context, 0, GoogleApiActivity.a(context, pendingIntentL, i10, true), D4.h.f791a | 134217728));
        return true;
    }
}
