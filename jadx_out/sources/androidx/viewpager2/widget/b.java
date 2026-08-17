package androidx.viewpager2.widget;

import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class b extends ViewPager2.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f18586a;

    b(int i10) {
        this.f18586a = new ArrayList(i10);
    }

    private void e(ConcurrentModificationException concurrentModificationException) {
        throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.i
    public void a(int i10) {
        try {
            Iterator it = this.f18586a.iterator();
            while (it.hasNext()) {
                ((ViewPager2.i) it.next()).a(i10);
            }
        } catch (ConcurrentModificationException e10) {
            e(e10);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.i
    public void b(int i10, float f10, int i11) {
        try {
            Iterator it = this.f18586a.iterator();
            while (it.hasNext()) {
                ((ViewPager2.i) it.next()).b(i10, f10, i11);
            }
        } catch (ConcurrentModificationException e10) {
            e(e10);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.i
    public void c(int i10) {
        try {
            Iterator it = this.f18586a.iterator();
            while (it.hasNext()) {
                ((ViewPager2.i) it.next()).c(i10);
            }
        } catch (ConcurrentModificationException e10) {
            e(e10);
        }
    }

    void d(ViewPager2.i iVar) {
        this.f18586a.add(iVar);
    }
}
