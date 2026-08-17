package androidx.appcompat.view;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.core.view.AbstractC1682m0;
import androidx.core.view.C1678k0;
import androidx.core.view.InterfaceC1680l0;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Interpolator f14258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    InterfaceC1680l0 f14259d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f14260e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f14257b = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AbstractC1682m0 f14261f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final ArrayList f14256a = new ArrayList();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a extends AbstractC1682m0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f14262a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f14263b = 0;

        a() {
        }

        @Override // androidx.core.view.InterfaceC1680l0
        public void b(View view) {
            int i10 = this.f14263b + 1;
            this.f14263b = i10;
            if (i10 == h.this.f14256a.size()) {
                InterfaceC1680l0 interfaceC1680l0 = h.this.f14259d;
                if (interfaceC1680l0 != null) {
                    interfaceC1680l0.b(null);
                }
                d();
            }
        }

        @Override // androidx.core.view.AbstractC1682m0, androidx.core.view.InterfaceC1680l0
        public void c(View view) {
            if (this.f14262a) {
                return;
            }
            this.f14262a = true;
            InterfaceC1680l0 interfaceC1680l0 = h.this.f14259d;
            if (interfaceC1680l0 != null) {
                interfaceC1680l0.c(null);
            }
        }

        void d() {
            this.f14263b = 0;
            this.f14262a = false;
            h.this.b();
        }
    }

    public void a() {
        if (this.f14260e) {
            Iterator it = this.f14256a.iterator();
            while (it.hasNext()) {
                ((C1678k0) it.next()).c();
            }
            this.f14260e = false;
        }
    }

    void b() {
        this.f14260e = false;
    }

    public h c(C1678k0 c1678k0) {
        if (!this.f14260e) {
            this.f14256a.add(c1678k0);
        }
        return this;
    }

    public h d(C1678k0 c1678k0, C1678k0 c1678k02) {
        this.f14256a.add(c1678k0);
        c1678k02.i(c1678k0.d());
        this.f14256a.add(c1678k02);
        return this;
    }

    public h e(long j10) {
        if (!this.f14260e) {
            this.f14257b = j10;
        }
        return this;
    }

    public h f(Interpolator interpolator) {
        if (!this.f14260e) {
            this.f14258c = interpolator;
        }
        return this;
    }

    public h g(InterfaceC1680l0 interfaceC1680l0) {
        if (!this.f14260e) {
            this.f14259d = interfaceC1680l0;
        }
        return this;
    }

    public void h() {
        if (this.f14260e) {
            return;
        }
        for (C1678k0 c1678k0 : this.f14256a) {
            long j10 = this.f14257b;
            if (j10 >= 0) {
                c1678k0.e(j10);
            }
            Interpolator interpolator = this.f14258c;
            if (interpolator != null) {
                c1678k0.f(interpolator);
            }
            if (this.f14259d != null) {
                c1678k0.g(this.f14261f);
            }
            c1678k0.k();
        }
        this.f14260e = true;
    }
}
