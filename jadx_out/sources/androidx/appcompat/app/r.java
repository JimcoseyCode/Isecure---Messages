package androidx.appcompat.app;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.DialogC1623w;
import androidx.appcompat.view.b;
import androidx.core.view.AbstractC1694t;
import f.AbstractC2568a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r extends DialogC1623w implements e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private g f14145j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AbstractC1694t.a f14146k;

    public r(Context context, int i10) {
        super(context, f(context, i10));
        this.f14146k = new AbstractC1694t.a() { // from class: androidx.appcompat.app.q
            @Override // androidx.core.view.AbstractC1694t.a
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return this.f14144g.g(keyEvent);
            }
        };
        g gVarE = e();
        gVarE.P(f(context, i10));
        gVarE.z(null);
    }

    private static int f(Context context, int i10) {
        if (i10 != 0) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(AbstractC2568a.f26753y, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // androidx.activity.DialogC1623w, android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        c();
        e().e(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        e().A();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return AbstractC1694t.e(this.f14146k, getWindow().getDecorView(), this, keyEvent);
    }

    public g e() {
        if (this.f14145j == null) {
            this.f14145j = g.k(this, this);
        }
        return this.f14145j;
    }

    @Override // android.app.Dialog
    public View findViewById(int i10) {
        return e().l(i10);
    }

    boolean g(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean h(int i10) {
        return e().I(i10);
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        e().w();
    }

    @Override // androidx.activity.DialogC1623w, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        e().v();
        super.onCreate(bundle);
        e().z(bundle);
    }

    @Override // androidx.activity.DialogC1623w, android.app.Dialog
    protected void onStop() {
        super.onStop();
        e().F();
    }

    @Override // androidx.appcompat.app.e
    public androidx.appcompat.view.b onWindowStartingSupportActionMode(b.a aVar) {
        return null;
    }

    @Override // androidx.activity.DialogC1623w, android.app.Dialog
    public void setContentView(int i10) {
        c();
        e().J(i10);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        e().Q(charSequence);
    }

    @Override // androidx.activity.DialogC1623w, android.app.Dialog
    public void setContentView(View view) {
        c();
        e().K(view);
    }

    @Override // android.app.Dialog
    public void setTitle(int i10) {
        super.setTitle(i10);
        e().Q(getContext().getString(i10));
    }

    @Override // androidx.activity.DialogC1623w, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        c();
        e().L(view, layoutParams);
    }

    @Override // androidx.appcompat.app.e
    public void onSupportActionModeFinished(androidx.appcompat.view.b bVar) {
    }

    @Override // androidx.appcompat.app.e
    public void onSupportActionModeStarted(androidx.appcompat.view.b bVar) {
    }
}
