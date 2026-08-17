package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: renamed from: androidx.fragment.app.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1753v extends AbstractC1750s {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Activity f17506g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Context f17507h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Handler f17508i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f17509j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final FragmentManager f17510k;

    AbstractC1753v(AbstractActivityC1749q abstractActivityC1749q) {
        this(abstractActivityC1749q, abstractActivityC1749q, new Handler(), 0);
    }

    Activity e() {
        return this.f17506g;
    }

    Context f() {
        return this.f17507h;
    }

    public Handler g() {
        return this.f17508i;
    }

    public abstract void h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract Object i();

    public abstract LayoutInflater j();

    public abstract boolean l(String str);

    public void m(Fragment fragment, Intent intent, int i10, Bundle bundle) {
        if (i10 != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        androidx.core.content.a.l(this.f17507h, intent, bundle);
    }

    public void n(Fragment fragment, IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
        if (i10 != -1) {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        androidx.core.app.b.w(this.f17506g, intentSender, i10, intent, i11, i12, i13, bundle);
    }

    public abstract void o();

    AbstractC1753v(Activity activity, Context context, Handler handler, int i10) {
        this.f17510k = new D();
        this.f17506g = activity;
        this.f17507h = (Context) H0.g.h(context, "context == null");
        this.f17508i = (Handler) H0.g.h(handler, "handler == null");
        this.f17509j = i10;
    }

    public void k(Fragment fragment, String[] strArr, int i10) {
    }
}
