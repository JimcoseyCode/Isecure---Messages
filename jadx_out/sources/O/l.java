package o;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.c;
import androidx.fragment.app.AbstractActivityC1749q;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1743k;
import androidx.lifecycle.B;
import androidx.lifecycle.U;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class l extends DialogInterfaceOnCancelListenerC1743k {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final Handler f30304g = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Runnable f30305h = new a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    g f30306i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f30307j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f30308k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ImageView f30309l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    TextView f30310m;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            l.this.C();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b implements DialogInterface.OnClickListener {
        b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            l.this.f30306i.Y(true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class c implements B {
        c() {
        }

        @Override // androidx.lifecycle.B
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(Integer num) {
            l lVar = l.this;
            lVar.f30304g.removeCallbacks(lVar.f30305h);
            l.this.E(num.intValue());
            l.this.F(num.intValue());
            l lVar2 = l.this;
            lVar2.f30304g.postDelayed(lVar2.f30305h, 2000L);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class d implements B {
        d() {
        }

        @Override // androidx.lifecycle.B
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(CharSequence charSequence) {
            l lVar = l.this;
            lVar.f30304g.removeCallbacks(lVar.f30305h);
            l.this.G(charSequence);
            l lVar2 = l.this;
            lVar2.f30304g.postDelayed(lVar2.f30305h, 2000L);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class e {
        static void a(Drawable drawable) {
            if (drawable instanceof AnimatedVectorDrawable) {
                ((AnimatedVectorDrawable) drawable).start();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class f {
        static int a() {
            return p.f30320a;
        }
    }

    private int A(int i10) {
        Context context = getContext();
        AbstractActivityC1749q activity = getActivity();
        if (context == null || activity == null) {
            return 0;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i10, typedValue, true);
        TypedArray typedArrayObtainStyledAttributes = activity.obtainStyledAttributes(typedValue.data, new int[]{i10});
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return color;
    }

    static l B() {
        return new l();
    }

    private boolean D(int i10, int i11) {
        if (i10 == 0 && i11 == 1) {
            return false;
        }
        if (i10 == 1 && i11 == 2) {
            return true;
        }
        return i10 == 2 && i11 == 1;
    }

    private void y() {
        AbstractActivityC1749q activity = getActivity();
        if (activity == null) {
            return;
        }
        g gVar = (g) new U(activity).b(g.class);
        this.f30306i = gVar;
        gVar.r().h(this, new c());
        this.f30306i.p().h(this, new d());
    }

    private Drawable z(int i10, int i11) {
        int i12;
        Context context = getContext();
        if (context == null) {
            return null;
        }
        if (i10 == 0 && i11 == 1) {
            i12 = r.f30323b;
        } else if (i10 == 1 && i11 == 2) {
            i12 = r.f30322a;
        } else if (i10 == 2 && i11 == 1) {
            i12 = r.f30323b;
        } else {
            if (i10 != 1 || i11 != 3) {
                return null;
            }
            i12 = r.f30323b;
        }
        return androidx.core.content.a.e(context, i12);
    }

    void C() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        this.f30306i.W(1);
        this.f30306i.U(context.getString(u.f30331c));
    }

    void E(int i10) {
        int iQ;
        Drawable drawableZ;
        if (this.f30309l == null || (drawableZ = z((iQ = this.f30306i.q()), i10)) == null) {
            return;
        }
        this.f30309l.setImageDrawable(drawableZ);
        if (D(iQ, i10)) {
            e.a(drawableZ);
        }
        this.f30306i.V(i10);
    }

    void F(int i10) {
        TextView textView = this.f30310m;
        if (textView != null) {
            textView.setTextColor(i10 == 2 ? this.f30307j : this.f30308k);
        }
    }

    void G(CharSequence charSequence) {
        TextView textView = this.f30310m;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1743k, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        this.f30306i.S(true);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1743k, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        y();
        if (Build.VERSION.SDK_INT >= 26) {
            this.f30307j = A(f.a());
        } else {
            Context context = getContext();
            this.f30307j = context != null ? androidx.core.content.a.c(context, q.f30321a) : 0;
        }
        this.f30308k = A(R.attr.textColorSecondary);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1743k
    public Dialog onCreateDialog(Bundle bundle) {
        c.a aVar = new c.a(requireContext());
        aVar.o(this.f30306i.w());
        View viewInflate = LayoutInflater.from(aVar.b()).inflate(t.f30328a, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(s.f30327d);
        if (textView != null) {
            CharSequence charSequenceV = this.f30306i.v();
            if (TextUtils.isEmpty(charSequenceV)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText(charSequenceV);
            }
        }
        TextView textView2 = (TextView) viewInflate.findViewById(s.f30324a);
        if (textView2 != null) {
            CharSequence charSequenceO = this.f30306i.o();
            if (TextUtils.isEmpty(charSequenceO)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setText(charSequenceO);
            }
        }
        this.f30309l = (ImageView) viewInflate.findViewById(s.f30326c);
        this.f30310m = (TextView) viewInflate.findViewById(s.f30325b);
        aVar.i(AbstractC2994b.c(this.f30306i.e()) ? getString(u.f30329a) : this.f30306i.u(), new b());
        aVar.p(viewInflate);
        androidx.appcompat.app.c cVarA = aVar.a();
        cVarA.setCanceledOnTouchOutside(false);
        return cVarA;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.f30304g.removeCallbacksAndMessages(null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f30306i.V(0);
        this.f30306i.W(1);
        this.f30306i.U(getString(u.f30331c));
    }
}
