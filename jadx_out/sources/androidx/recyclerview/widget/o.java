package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final b f18193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    a f18194b = new a();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f18195a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f18196b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f18197c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f18198d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f18199e;

        a() {
        }

        void a(int i10) {
            this.f18195a = i10 | this.f18195a;
        }

        boolean b() {
            int i10 = this.f18195a;
            if ((i10 & 7) != 0 && (i10 & c(this.f18198d, this.f18196b)) == 0) {
                return false;
            }
            int i11 = this.f18195a;
            if ((i11 & 112) != 0 && (i11 & (c(this.f18198d, this.f18197c) << 4)) == 0) {
                return false;
            }
            int i12 = this.f18195a;
            if ((i12 & 1792) != 0 && (i12 & (c(this.f18199e, this.f18196b) << 8)) == 0) {
                return false;
            }
            int i13 = this.f18195a;
            return (i13 & 28672) == 0 || (i13 & (c(this.f18199e, this.f18197c) << 12)) != 0;
        }

        int c(int i10, int i11) {
            if (i10 > i11) {
                return 1;
            }
            return i10 == i11 ? 2 : 4;
        }

        void d() {
            this.f18195a = 0;
        }

        void e(int i10, int i11, int i12, int i13) {
            this.f18196b = i10;
            this.f18197c = i11;
            this.f18198d = i12;
            this.f18199e = i13;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    interface b {
        int a(View view);

        int b();

        int c();

        int d(View view);

        View getChildAt(int i10);
    }

    o(b bVar) {
        this.f18193a = bVar;
    }

    View a(int i10, int i11, int i12, int i13) {
        int iB = this.f18193a.b();
        int iC = this.f18193a.c();
        int i14 = i11 > i10 ? 1 : -1;
        View view = null;
        while (i10 != i11) {
            View childAt = this.f18193a.getChildAt(i10);
            this.f18194b.e(iB, iC, this.f18193a.a(childAt), this.f18193a.d(childAt));
            if (i12 != 0) {
                this.f18194b.d();
                this.f18194b.a(i12);
                if (this.f18194b.b()) {
                    return childAt;
                }
            }
            if (i13 != 0) {
                this.f18194b.d();
                this.f18194b.a(i13);
                if (this.f18194b.b()) {
                    view = childAt;
                }
            }
            i10 += i14;
        }
        return view;
    }

    boolean b(View view, int i10) {
        this.f18194b.e(this.f18193a.b(), this.f18193a.c(), this.f18193a.a(view), this.f18193a.d(view));
        if (i10 == 0) {
            return false;
        }
        this.f18194b.d();
        this.f18194b.a(i10);
        return this.f18194b.b();
    }
}
