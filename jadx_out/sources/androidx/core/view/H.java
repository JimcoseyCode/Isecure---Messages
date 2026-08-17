package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f16455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f16456b;

    public H(ViewGroup viewGroup) {
    }

    public int a() {
        return this.f16455a | this.f16456b;
    }

    public void b(View view, View view2, int i10) {
        c(view, view2, i10, 0);
    }

    public void c(View view, View view2, int i10, int i11) {
        if (i11 == 1) {
            this.f16456b = i10;
        } else {
            this.f16455a = i10;
        }
    }

    public void d(View view) {
        e(view, 0);
    }

    public void e(View view, int i10) {
        if (i10 == 1) {
            this.f16456b = 0;
        } else {
            this.f16455a = 0;
        }
    }
}
