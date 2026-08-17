package z2;

import android.R;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import c2.k;
import com.facebook.drawee.drawable.q;
import com.facebook.react.views.image.ReactImageView;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: z2.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C3670b {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final q f34224t = q.f19814h;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final q f34225u = q.f19815i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Resources f34226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f34227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f34228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Drawable f34229d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private q f34230e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Drawable f34231f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private q f34232g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Drawable f34233h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private q f34234i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Drawable f34235j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private q f34236k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private q f34237l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Matrix f34238m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private PointF f34239n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ColorFilter f34240o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Drawable f34241p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private List f34242q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Drawable f34243r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private e f34244s;

    public C3670b(Resources resources) {
        this.f34226a = resources;
        t();
    }

    private void K() {
        List list = this.f34242q;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                k.g((Drawable) it.next());
            }
        }
    }

    private void t() {
        this.f34227b = ReactImageView.REMOTE_IMAGE_FADE_DURATION_MS;
        this.f34228c = 0.0f;
        this.f34229d = null;
        q qVar = f34224t;
        this.f34230e = qVar;
        this.f34231f = null;
        this.f34232g = qVar;
        this.f34233h = null;
        this.f34234i = qVar;
        this.f34235j = null;
        this.f34236k = qVar;
        this.f34237l = f34225u;
        this.f34238m = null;
        this.f34239n = null;
        this.f34240o = null;
        this.f34241p = null;
        this.f34242q = null;
        this.f34243r = null;
        this.f34244s = null;
    }

    public static C3670b u(Resources resources) {
        return new C3670b(resources);
    }

    public C3670b A(q qVar) {
        this.f34234i = qVar;
        return this;
    }

    public C3670b B(Drawable drawable) {
        if (drawable == null) {
            this.f34242q = null;
            return this;
        }
        this.f34242q = Arrays.asList(drawable);
        return this;
    }

    public C3670b C(Drawable drawable) {
        this.f34229d = drawable;
        return this;
    }

    public C3670b D(q qVar) {
        this.f34230e = qVar;
        return this;
    }

    public C3670b E(Drawable drawable) {
        if (drawable == null) {
            this.f34243r = null;
            return this;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, drawable);
        this.f34243r = stateListDrawable;
        return this;
    }

    public C3670b F(Drawable drawable) {
        this.f34235j = drawable;
        return this;
    }

    public C3670b G(q qVar) {
        this.f34236k = qVar;
        return this;
    }

    public C3670b H(Drawable drawable) {
        this.f34231f = drawable;
        return this;
    }

    public C3670b I(q qVar) {
        this.f34232g = qVar;
        return this;
    }

    public C3670b J(e eVar) {
        this.f34244s = eVar;
        return this;
    }

    public C3669a a() {
        K();
        return new C3669a(this);
    }

    public ColorFilter b() {
        return this.f34240o;
    }

    public PointF c() {
        return this.f34239n;
    }

    public q d() {
        return this.f34237l;
    }

    public Drawable e() {
        return this.f34241p;
    }

    public float f() {
        return this.f34228c;
    }

    public int g() {
        return this.f34227b;
    }

    public Drawable h() {
        return this.f34233h;
    }

    public q i() {
        return this.f34234i;
    }

    public List j() {
        return this.f34242q;
    }

    public Drawable k() {
        return this.f34229d;
    }

    public q l() {
        return this.f34230e;
    }

    public Drawable m() {
        return this.f34243r;
    }

    public Drawable n() {
        return this.f34235j;
    }

    public q o() {
        return this.f34236k;
    }

    public Resources p() {
        return this.f34226a;
    }

    public Drawable q() {
        return this.f34231f;
    }

    public q r() {
        return this.f34232g;
    }

    public e s() {
        return this.f34244s;
    }

    public C3670b v(q qVar) {
        this.f34237l = qVar;
        this.f34238m = null;
        return this;
    }

    public C3670b w(Drawable drawable) {
        this.f34241p = drawable;
        return this;
    }

    public C3670b x(float f10) {
        this.f34228c = f10;
        return this;
    }

    public C3670b y(int i10) {
        this.f34227b = i10;
        return this;
    }

    public C3670b z(Drawable drawable) {
        this.f34233h = drawable;
        return this;
    }
}
