package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.Q;
import androidx.core.view.AbstractC1658a0;
import androidx.core.widget.NestedScrollView;
import f.AbstractC2568a;
import f.AbstractC2573f;
import f.AbstractC2577j;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class AlertController {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    NestedScrollView f13916A;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private Drawable f13918C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private ImageView f13919D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private TextView f13920E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private TextView f13921F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private View f13922G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    ListAdapter f13923H;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private int f13925J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private int f13926K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    int f13927L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    int f13928M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    int f13929N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    int f13930O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private boolean f13931P;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    Handler f13933R;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f13935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final r f13936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Window f13937c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f13938d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CharSequence f13939e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private CharSequence f13940f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    ListView f13941g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private View f13942h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f13943i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f13944j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f13945k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f13946l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f13947m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    Button f13949o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private CharSequence f13950p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    Message f13951q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Drawable f13952r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    Button f13953s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private CharSequence f13954t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    Message f13955u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Drawable f13956v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    Button f13957w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private CharSequence f13958x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    Message f13959y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Drawable f13960z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f13948n = false;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int f13917B = 0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    int f13924I = -1;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private int f13932Q = 0;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final View.OnClickListener f13934S = new a();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class RecycleListView extends ListView {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f13961g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int f13962h;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2577j.f27046c2);
            this.f13962h = typedArrayObtainStyledAttributes.getDimensionPixelOffset(AbstractC2577j.f27051d2, -1);
            this.f13961g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(AbstractC2577j.f27056e2, -1);
        }

        public void a(boolean z10, boolean z11) {
            if (z11 && z10) {
                return;
            }
            setPadding(getPaddingLeft(), z10 ? getPaddingTop() : this.f13961g, getPaddingRight(), z11 ? getPaddingBottom() : this.f13962h);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message message;
            Message message2;
            Message message3;
            AlertController alertController = AlertController.this;
            Message messageObtain = (view != alertController.f13949o || (message3 = alertController.f13951q) == null) ? (view != alertController.f13953s || (message2 = alertController.f13955u) == null) ? (view != alertController.f13957w || (message = alertController.f13959y) == null) ? null : Message.obtain(message) : Message.obtain(message2) : Message.obtain(message3);
            if (messageObtain != null) {
                messageObtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.f13933R.obtainMessage(1, alertController2.f13936b).sendToTarget();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class b {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public int f13964A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public int f13965B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public int f13966C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public int f13967D;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public boolean[] f13969F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        public boolean f13970G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        public boolean f13971H;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        public DialogInterface.OnMultiChoiceClickListener f13973J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        public Cursor f13974K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public String f13975L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        public String f13976M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        public AdapterView.OnItemSelectedListener f13977N;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f13979a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LayoutInflater f13980b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Drawable f13982d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public CharSequence f13984f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public View f13985g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public CharSequence f13986h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public CharSequence f13987i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Drawable f13988j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public DialogInterface.OnClickListener f13989k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public CharSequence f13990l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Drawable f13991m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public DialogInterface.OnClickListener f13992n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public CharSequence f13993o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Drawable f13994p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public DialogInterface.OnClickListener f13995q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public DialogInterface.OnCancelListener f13997s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public DialogInterface.OnDismissListener f13998t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public DialogInterface.OnKeyListener f13999u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public CharSequence[] f14000v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public ListAdapter f14001w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public DialogInterface.OnClickListener f14002x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f14003y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public View f14004z;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f13981c = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f13983e = 0;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public boolean f13968E = false;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public int f13972I = -1;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public boolean f13978O = true;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public boolean f13996r = true;

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class a extends ArrayAdapter {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ RecycleListView f14005g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Context context, int i10, int i11, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i10, i11, charSequenceArr);
                this.f14005g = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i10, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i10, view, viewGroup);
                boolean[] zArr = b.this.f13969F;
                if (zArr != null && zArr[i10]) {
                    this.f14005g.setItemChecked(i10, true);
                }
                return view2;
            }
        }

        /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class C0144b extends CursorAdapter {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private final int f14007g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private final int f14008h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ RecycleListView f14009i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ AlertController f14010j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0144b(Context context, Cursor cursor, boolean z10, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z10);
                this.f14009i = recycleListView;
                this.f14010j = alertController;
                Cursor cursor2 = getCursor();
                this.f14007g = cursor2.getColumnIndexOrThrow(b.this.f13975L);
                this.f14008h = cursor2.getColumnIndexOrThrow(b.this.f13976M);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.f14007g));
                this.f14009i.setItemChecked(cursor.getPosition(), cursor.getInt(this.f14008h) == 1);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return b.this.f13980b.inflate(this.f14010j.f13928M, viewGroup, false);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class c implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ AlertController f14012g;

            c(AlertController alertController) {
                this.f14012g = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
                b.this.f14002x.onClick(this.f14012g.f13936b, i10);
                if (b.this.f13971H) {
                    return;
                }
                this.f14012g.f13936b.dismiss();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class d implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ RecycleListView f14014g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ AlertController f14015h;

            d(RecycleListView recycleListView, AlertController alertController) {
                this.f14014g = recycleListView;
                this.f14015h = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
                boolean[] zArr = b.this.f13969F;
                if (zArr != null) {
                    zArr[i10] = this.f14014g.isItemChecked(i10);
                }
                b.this.f13973J.onClick(this.f14015h.f13936b, i10, this.f14014g.isItemChecked(i10));
            }
        }

        public b(Context context) {
            this.f13979a = context;
            this.f13980b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        private void b(AlertController alertController) {
            b bVar;
            AlertController alertController2;
            ListAdapter dVar;
            RecycleListView recycleListView = (RecycleListView) this.f13980b.inflate(alertController.f13927L, (ViewGroup) null);
            if (!this.f13970G) {
                bVar = this;
                alertController2 = alertController;
                int i10 = bVar.f13971H ? alertController2.f13929N : alertController2.f13930O;
                if (bVar.f13974K != null) {
                    dVar = new SimpleCursorAdapter(bVar.f13979a, i10, bVar.f13974K, new String[]{bVar.f13975L}, new int[]{R.id.text1});
                } else {
                    dVar = bVar.f14001w;
                    if (dVar == null) {
                        dVar = new d(bVar.f13979a, i10, R.id.text1, bVar.f14000v);
                    }
                }
            } else if (this.f13974K == null) {
                bVar = this;
                dVar = bVar.new a(this.f13979a, alertController.f13928M, R.id.text1, this.f14000v, recycleListView);
                recycleListView = recycleListView;
                alertController2 = alertController;
            } else {
                bVar = this;
                alertController2 = alertController;
                dVar = bVar.new C0144b(bVar.f13979a, bVar.f13974K, false, recycleListView, alertController2);
            }
            alertController2.f13923H = dVar;
            alertController2.f13924I = bVar.f13972I;
            if (bVar.f14002x != null) {
                recycleListView.setOnItemClickListener(new c(alertController2));
            } else if (bVar.f13973J != null) {
                recycleListView.setOnItemClickListener(new d(recycleListView, alertController2));
            }
            AdapterView.OnItemSelectedListener onItemSelectedListener = bVar.f13977N;
            if (onItemSelectedListener != null) {
                recycleListView.setOnItemSelectedListener(onItemSelectedListener);
            }
            if (bVar.f13971H) {
                recycleListView.setChoiceMode(1);
            } else if (bVar.f13970G) {
                recycleListView.setChoiceMode(2);
            }
            alertController2.f13941g = recycleListView;
        }

        public void a(AlertController alertController) {
            AlertController alertController2;
            View view = this.f13985g;
            if (view != null) {
                alertController.k(view);
            } else {
                CharSequence charSequence = this.f13984f;
                if (charSequence != null) {
                    alertController.p(charSequence);
                }
                Drawable drawable = this.f13982d;
                if (drawable != null) {
                    alertController.m(drawable);
                }
                int i10 = this.f13981c;
                if (i10 != 0) {
                    alertController.l(i10);
                }
                int i11 = this.f13983e;
                if (i11 != 0) {
                    alertController.l(alertController.c(i11));
                }
            }
            CharSequence charSequence2 = this.f13986h;
            if (charSequence2 != null) {
                alertController.n(charSequence2);
            }
            CharSequence charSequence3 = this.f13987i;
            if (charSequence3 == null && this.f13988j == null) {
                alertController2 = alertController;
            } else {
                alertController.j(-1, charSequence3, this.f13989k, null, this.f13988j);
                alertController2 = alertController;
            }
            CharSequence charSequence4 = this.f13990l;
            if (charSequence4 != null || this.f13991m != null) {
                alertController2.j(-2, charSequence4, this.f13992n, null, this.f13991m);
            }
            CharSequence charSequence5 = this.f13993o;
            if (charSequence5 != null || this.f13994p != null) {
                alertController2.j(-3, charSequence5, this.f13995q, null, this.f13994p);
            }
            if (this.f14000v != null || this.f13974K != null || this.f14001w != null) {
                b(alertController2);
            }
            View view2 = this.f14004z;
            if (view2 != null) {
                if (this.f13968E) {
                    alertController2.s(view2, this.f13964A, this.f13965B, this.f13966C, this.f13967D);
                    return;
                } else {
                    alertController2.r(view2);
                    return;
                }
            }
            int i12 = this.f14003y;
            if (i12 != 0) {
                alertController2.q(i12);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class c extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference f14017a;

        public c(DialogInterface dialogInterface) {
            this.f14017a = new WeakReference(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == -3 || i10 == -2 || i10 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f14017a.get(), message.what);
            } else {
                if (i10 != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class d extends ArrayAdapter {
        public d(Context context, int i10, int i11, CharSequence[] charSequenceArr) {
            super(context, i10, i11, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, r rVar, Window window) {
        this.f13935a = context;
        this.f13936b = rVar;
        this.f13937c = window;
        this.f13933R = new c(rVar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC2577j.f26930F, AbstractC2568a.f26739k, 0);
        this.f13925J = typedArrayObtainStyledAttributes.getResourceId(AbstractC2577j.f26935G, 0);
        this.f13926K = typedArrayObtainStyledAttributes.getResourceId(AbstractC2577j.f26945I, 0);
        this.f13927L = typedArrayObtainStyledAttributes.getResourceId(AbstractC2577j.f26955K, 0);
        this.f13928M = typedArrayObtainStyledAttributes.getResourceId(AbstractC2577j.f26960L, 0);
        this.f13929N = typedArrayObtainStyledAttributes.getResourceId(AbstractC2577j.f26970N, 0);
        this.f13930O = typedArrayObtainStyledAttributes.getResourceId(AbstractC2577j.f26950J, 0);
        this.f13931P = typedArrayObtainStyledAttributes.getBoolean(AbstractC2577j.f26965M, true);
        this.f13938d = typedArrayObtainStyledAttributes.getDimensionPixelSize(AbstractC2577j.f26940H, 0);
        typedArrayObtainStyledAttributes.recycle();
        rVar.h(1);
    }

    static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    private void b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    private ViewGroup h(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    private int i() {
        int i10 = this.f13926K;
        return i10 == 0 ? this.f13925J : this.f13932Q == 1 ? i10 : this.f13925J;
    }

    private void o(ViewGroup viewGroup, View view, int i10, int i11) {
        View viewFindViewById = this.f13937c.findViewById(AbstractC2573f.f26861w);
        View viewFindViewById2 = this.f13937c.findViewById(AbstractC2573f.f26860v);
        AbstractC1658a0.y0(view, i10, i11);
        if (viewFindViewById != null) {
            viewGroup.removeView(viewFindViewById);
        }
        if (viewFindViewById2 != null) {
            viewGroup.removeView(viewFindViewById2);
        }
    }

    private void t(ViewGroup viewGroup) {
        int i10;
        Button button = (Button) viewGroup.findViewById(R.id.button1);
        this.f13949o = button;
        button.setOnClickListener(this.f13934S);
        if (TextUtils.isEmpty(this.f13950p) && this.f13952r == null) {
            this.f13949o.setVisibility(8);
            i10 = 0;
        } else {
            this.f13949o.setText(this.f13950p);
            Drawable drawable = this.f13952r;
            if (drawable != null) {
                int i11 = this.f13938d;
                drawable.setBounds(0, 0, i11, i11);
                this.f13949o.setCompoundDrawables(this.f13952r, null, null, null);
            }
            this.f13949o.setVisibility(0);
            i10 = 1;
        }
        Button button2 = (Button) viewGroup.findViewById(R.id.button2);
        this.f13953s = button2;
        button2.setOnClickListener(this.f13934S);
        if (TextUtils.isEmpty(this.f13954t) && this.f13956v == null) {
            this.f13953s.setVisibility(8);
        } else {
            this.f13953s.setText(this.f13954t);
            Drawable drawable2 = this.f13956v;
            if (drawable2 != null) {
                int i12 = this.f13938d;
                drawable2.setBounds(0, 0, i12, i12);
                this.f13953s.setCompoundDrawables(this.f13956v, null, null, null);
            }
            this.f13953s.setVisibility(0);
            i10 |= 2;
        }
        Button button3 = (Button) viewGroup.findViewById(R.id.button3);
        this.f13957w = button3;
        button3.setOnClickListener(this.f13934S);
        if (TextUtils.isEmpty(this.f13958x) && this.f13960z == null) {
            this.f13957w.setVisibility(8);
        } else {
            this.f13957w.setText(this.f13958x);
            Drawable drawable3 = this.f13960z;
            if (drawable3 != null) {
                int i13 = this.f13938d;
                drawable3.setBounds(0, 0, i13, i13);
                this.f13957w.setCompoundDrawables(this.f13960z, null, null, null);
            }
            this.f13957w.setVisibility(0);
            i10 |= 4;
        }
        if (y(this.f13935a)) {
            if (i10 == 1) {
                b(this.f13949o);
            } else if (i10 == 2) {
                b(this.f13953s);
            } else if (i10 == 4) {
                b(this.f13957w);
            }
        }
        if (i10 != 0) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    private void u(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f13937c.findViewById(AbstractC2573f.f26862x);
        this.f13916A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.f13916A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(R.id.message);
        this.f13921F = textView;
        if (textView == null) {
            return;
        }
        CharSequence charSequence = this.f13940f;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.f13916A.removeView(this.f13921F);
        if (this.f13941g == null) {
            viewGroup.setVisibility(8);
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.f13916A.getParent();
        int iIndexOfChild = viewGroup2.indexOfChild(this.f13916A);
        viewGroup2.removeViewAt(iIndexOfChild);
        viewGroup2.addView(this.f13941g, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
    }

    private void v(ViewGroup viewGroup) {
        View viewInflate = this.f13942h;
        if (viewInflate == null) {
            viewInflate = this.f13943i != 0 ? LayoutInflater.from(this.f13935a).inflate(this.f13943i, viewGroup, false) : null;
        }
        boolean z10 = viewInflate != null;
        if (!z10 || !a(viewInflate)) {
            this.f13937c.setFlags(131072, 131072);
        }
        if (!z10) {
            viewGroup.setVisibility(8);
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.f13937c.findViewById(AbstractC2573f.f26853o);
        frameLayout.addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
        if (this.f13948n) {
            frameLayout.setPadding(this.f13944j, this.f13945k, this.f13946l, this.f13947m);
        }
        if (this.f13941g != null) {
            ((LinearLayout.LayoutParams) ((Q.a) viewGroup.getLayoutParams())).weight = 0.0f;
        }
    }

    private void w(ViewGroup viewGroup) {
        if (this.f13922G != null) {
            viewGroup.addView(this.f13922G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f13937c.findViewById(AbstractC2573f.f26837P).setVisibility(8);
            return;
        }
        this.f13919D = (ImageView) this.f13937c.findViewById(R.id.icon);
        if (TextUtils.isEmpty(this.f13939e) || !this.f13931P) {
            this.f13937c.findViewById(AbstractC2573f.f26837P).setVisibility(8);
            this.f13919D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f13937c.findViewById(AbstractC2573f.f26849k);
        this.f13920E = textView;
        textView.setText(this.f13939e);
        int i10 = this.f13917B;
        if (i10 != 0) {
            this.f13919D.setImageResource(i10);
            return;
        }
        Drawable drawable = this.f13918C;
        if (drawable != null) {
            this.f13919D.setImageDrawable(drawable);
        } else {
            this.f13920E.setPadding(this.f13919D.getPaddingLeft(), this.f13919D.getPaddingTop(), this.f13919D.getPaddingRight(), this.f13919D.getPaddingBottom());
            this.f13919D.setVisibility(8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void x() {
        View viewFindViewById;
        ListAdapter listAdapter;
        View viewFindViewById2;
        View viewFindViewById3 = this.f13937c.findViewById(AbstractC2573f.f26859u);
        View viewFindViewById4 = viewFindViewById3.findViewById(AbstractC2573f.f26838Q);
        View viewFindViewById5 = viewFindViewById3.findViewById(AbstractC2573f.f26852n);
        View viewFindViewById6 = viewFindViewById3.findViewById(AbstractC2573f.f26850l);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById3.findViewById(AbstractC2573f.f26854p);
        v(viewGroup);
        View viewFindViewById7 = viewGroup.findViewById(AbstractC2573f.f26838Q);
        View viewFindViewById8 = viewGroup.findViewById(AbstractC2573f.f26852n);
        View viewFindViewById9 = viewGroup.findViewById(AbstractC2573f.f26850l);
        ViewGroup viewGroupH = h(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupH2 = h(viewFindViewById8, viewFindViewById5);
        ViewGroup viewGroupH3 = h(viewFindViewById9, viewFindViewById6);
        u(viewGroupH2);
        t(viewGroupH3);
        w(viewGroupH);
        boolean z10 = viewGroup.getVisibility() != 8;
        boolean z11 = (viewGroupH == null || viewGroupH.getVisibility() == 8) ? 0 : 1;
        boolean z12 = (viewGroupH3 == null || viewGroupH3.getVisibility() == 8) ? false : true;
        if (!z12 && viewGroupH2 != null && (viewFindViewById2 = viewGroupH2.findViewById(AbstractC2573f.f26833L)) != null) {
            viewFindViewById2.setVisibility(0);
        }
        if (z11 != 0) {
            NestedScrollView nestedScrollView = this.f13916A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View viewFindViewById10 = (this.f13940f == null && this.f13941g == null) ? null : viewGroupH.findViewById(AbstractC2573f.f26836O);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        } else if (viewGroupH2 != null && (viewFindViewById = viewGroupH2.findViewById(AbstractC2573f.f26834M)) != null) {
            viewFindViewById.setVisibility(0);
        }
        ListView listView = this.f13941g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).a(z11, z12);
        }
        if (!z10) {
            View view = this.f13941g;
            if (view == null) {
                view = this.f13916A;
            }
            if (view != null) {
                o(viewGroupH2, view, z11 | (z12 ? 2 : 0), 3);
            }
        }
        ListView listView2 = this.f13941g;
        if (listView2 == null || (listAdapter = this.f13923H) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int i10 = this.f13924I;
        if (i10 > -1) {
            listView2.setItemChecked(i10, true);
            listView2.setSelection(i10);
        }
    }

    private static boolean y(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(AbstractC2568a.f26738j, typedValue, true);
        return typedValue.data != 0;
    }

    public int c(int i10) {
        TypedValue typedValue = new TypedValue();
        this.f13935a.getTheme().resolveAttribute(i10, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView d() {
        return this.f13941g;
    }

    public void e() {
        this.f13936b.setContentView(i());
        x();
    }

    public boolean f(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f13916A;
        return nestedScrollView != null && nestedScrollView.n(keyEvent);
    }

    public boolean g(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f13916A;
        return nestedScrollView != null && nestedScrollView.n(keyEvent);
    }

    public void j(int i10, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f13933R.obtainMessage(i10, onClickListener);
        }
        if (i10 == -3) {
            this.f13958x = charSequence;
            this.f13959y = message;
            this.f13960z = drawable;
        } else if (i10 == -2) {
            this.f13954t = charSequence;
            this.f13955u = message;
            this.f13956v = drawable;
        } else {
            if (i10 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f13950p = charSequence;
            this.f13951q = message;
            this.f13952r = drawable;
        }
    }

    public void k(View view) {
        this.f13922G = view;
    }

    public void l(int i10) {
        this.f13918C = null;
        this.f13917B = i10;
        ImageView imageView = this.f13919D;
        if (imageView != null) {
            if (i10 == 0) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.f13919D.setImageResource(this.f13917B);
            }
        }
    }

    public void m(Drawable drawable) {
        this.f13918C = drawable;
        this.f13917B = 0;
        ImageView imageView = this.f13919D;
        if (imageView != null) {
            if (drawable == null) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.f13919D.setImageDrawable(drawable);
            }
        }
    }

    public void n(CharSequence charSequence) {
        this.f13940f = charSequence;
        TextView textView = this.f13921F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void p(CharSequence charSequence) {
        this.f13939e = charSequence;
        TextView textView = this.f13920E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void q(int i10) {
        this.f13942h = null;
        this.f13943i = i10;
        this.f13948n = false;
    }

    public void r(View view) {
        this.f13942h = view;
        this.f13943i = 0;
        this.f13948n = false;
    }

    public void s(View view, int i10, int i11, int i12, int i13) {
        this.f13942h = view;
        this.f13943i = 0;
        this.f13948n = true;
        this.f13944j = i10;
        this.f13945k = i11;
        this.f13946l = i12;
        this.f13947m = i13;
    }
}
