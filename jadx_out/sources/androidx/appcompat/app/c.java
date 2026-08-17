package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;
import f.AbstractC2568a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class c extends r implements DialogInterface {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final AlertController f14122l;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AlertController.b f14123a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f14124b;

        public a(Context context) {
            this(context, c.j(context, 0));
        }

        public c a() {
            c cVar = new c(this.f14123a.f13979a, this.f14124b);
            this.f14123a.a(cVar.f14122l);
            cVar.setCancelable(this.f14123a.f13996r);
            if (this.f14123a.f13996r) {
                cVar.setCanceledOnTouchOutside(true);
            }
            cVar.setOnCancelListener(this.f14123a.f13997s);
            cVar.setOnDismissListener(this.f14123a.f13998t);
            DialogInterface.OnKeyListener onKeyListener = this.f14123a.f13999u;
            if (onKeyListener != null) {
                cVar.setOnKeyListener(onKeyListener);
            }
            return cVar;
        }

        public Context b() {
            return this.f14123a.f13979a;
        }

        public a c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f14123a;
            bVar.f14001w = listAdapter;
            bVar.f14002x = onClickListener;
            return this;
        }

        public a d(boolean z10) {
            this.f14123a.f13996r = z10;
            return this;
        }

        public a e(View view) {
            this.f14123a.f13985g = view;
            return this;
        }

        public a f(Drawable drawable) {
            this.f14123a.f13982d = drawable;
            return this;
        }

        public a g(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f14123a;
            bVar.f14000v = charSequenceArr;
            bVar.f14002x = onClickListener;
            return this;
        }

        public a h(CharSequence charSequence) {
            this.f14123a.f13986h = charSequence;
            return this;
        }

        public a i(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f14123a;
            bVar.f13990l = charSequence;
            bVar.f13992n = onClickListener;
            return this;
        }

        public a j(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f14123a;
            bVar.f13993o = charSequence;
            bVar.f13995q = onClickListener;
            return this;
        }

        public a k(DialogInterface.OnKeyListener onKeyListener) {
            this.f14123a.f13999u = onKeyListener;
            return this;
        }

        public a l(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f14123a;
            bVar.f13987i = charSequence;
            bVar.f13989k = onClickListener;
            return this;
        }

        public a m(ListAdapter listAdapter, int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f14123a;
            bVar.f14001w = listAdapter;
            bVar.f14002x = onClickListener;
            bVar.f13972I = i10;
            bVar.f13971H = true;
            return this;
        }

        public a n(int i10) {
            AlertController.b bVar = this.f14123a;
            bVar.f13984f = bVar.f13979a.getText(i10);
            return this;
        }

        public a o(CharSequence charSequence) {
            this.f14123a.f13984f = charSequence;
            return this;
        }

        public a p(View view) {
            AlertController.b bVar = this.f14123a;
            bVar.f14004z = view;
            bVar.f14003y = 0;
            bVar.f13968E = false;
            return this;
        }

        public c q() {
            c cVarA = a();
            cVarA.show();
            return cVarA;
        }

        public a(Context context, int i10) {
            this.f14123a = new AlertController.b(new ContextThemeWrapper(context, c.j(context, i10)));
            this.f14124b = i10;
        }
    }

    protected c(Context context, int i10) {
        super(context, j(context, i10));
        this.f14122l = new AlertController(getContext(), this, getWindow());
    }

    static int j(Context context, int i10) {
        if (((i10 >>> 24) & 255) >= 1) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(AbstractC2568a.f26740l, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView i() {
        return this.f14122l.d();
    }

    @Override // androidx.appcompat.app.r, androidx.activity.DialogC1623w, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f14122l.e();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (this.f14122l.f(i10, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (this.f14122l.g(i10, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i10, keyEvent);
    }

    @Override // androidx.appcompat.app.r, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f14122l.p(charSequence);
    }
}
