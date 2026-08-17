package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1764k;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC1752u f17348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ClassLoader f17349b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f17351d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f17352e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f17353f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f17354g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f17355h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    boolean f17356i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    String f17358k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f17359l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    CharSequence f17360m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f17361n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    CharSequence f17362o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    ArrayList f17363p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    ArrayList f17364q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    ArrayList f17366s;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    ArrayList f17350c = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    boolean f17357j = true;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    boolean f17365r = false;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f17367a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Fragment f17368b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f17369c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f17370d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f17371e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f17372f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f17373g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        AbstractC1764k.b f17374h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        AbstractC1764k.b f17375i;

        a() {
        }

        a(int i10, Fragment fragment) {
            this.f17367a = i10;
            this.f17368b = fragment;
            this.f17369c = false;
            AbstractC1764k.b bVar = AbstractC1764k.b.f17594k;
            this.f17374h = bVar;
            this.f17375i = bVar;
        }

        a(int i10, Fragment fragment, boolean z10) {
            this.f17367a = i10;
            this.f17368b = fragment;
            this.f17369c = z10;
            AbstractC1764k.b bVar = AbstractC1764k.b.f17594k;
            this.f17374h = bVar;
            this.f17375i = bVar;
        }
    }

    I(AbstractC1752u abstractC1752u, ClassLoader classLoader) {
        this.f17348a = abstractC1752u;
        this.f17349b = classLoader;
    }

    public I b(int i10, Fragment fragment) {
        m(i10, fragment, null, 1);
        return this;
    }

    public I c(int i10, Fragment fragment, String str) {
        m(i10, fragment, str, 1);
        return this;
    }

    I d(ViewGroup viewGroup, Fragment fragment, String str) {
        fragment.mContainer = viewGroup;
        return c(viewGroup.getId(), fragment, str);
    }

    public I e(Fragment fragment, String str) {
        m(0, fragment, str, 1);
        return this;
    }

    void f(a aVar) {
        this.f17350c.add(aVar);
        aVar.f17370d = this.f17351d;
        aVar.f17371e = this.f17352e;
        aVar.f17372f = this.f17353f;
        aVar.f17373g = this.f17354g;
    }

    public I g(String str) {
        if (!this.f17357j) {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.f17356i = true;
        this.f17358k = str;
        return this;
    }

    public abstract int h();

    public abstract int i();

    public abstract void j();

    public abstract void k();

    public I l() {
        if (this.f17356i) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f17357j = false;
        return this;
    }

    void m(int i10, Fragment fragment, String str, int i11) {
        String str2 = fragment.mPreviousWho;
        if (str2 != null) {
            Z0.c.f(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = fragment.mTag;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.mTag + " now " + str);
            }
            fragment.mTag = str;
        }
        if (i10 != 0) {
            if (i10 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i12 = fragment.mFragmentId;
            if (i12 != 0 && i12 != i10) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i10);
            }
            fragment.mFragmentId = i10;
            fragment.mContainerId = i10;
        }
        f(new a(i11, fragment));
    }

    public I n(Fragment fragment) {
        f(new a(3, fragment));
        return this;
    }

    public I o(int i10, Fragment fragment) {
        return p(i10, fragment, null);
    }

    public I p(int i10, Fragment fragment, String str) {
        if (i10 == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        m(i10, fragment, str, 2);
        return this;
    }

    public I q(Runnable runnable) {
        l();
        if (this.f17366s == null) {
            this.f17366s = new ArrayList();
        }
        this.f17366s.add(runnable);
        return this;
    }

    public I r(int i10, int i11) {
        return s(i10, i11, 0, 0);
    }

    public I s(int i10, int i11, int i12, int i13) {
        this.f17351d = i10;
        this.f17352e = i11;
        this.f17353f = i12;
        this.f17354g = i13;
        return this;
    }

    public I t(Fragment fragment) {
        f(new a(8, fragment));
        return this;
    }

    public I u(boolean z10) {
        this.f17365r = z10;
        return this;
    }
}
