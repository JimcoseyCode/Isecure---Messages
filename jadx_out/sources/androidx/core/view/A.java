package androidx.core.view;

import android.view.Menu;
import android.view.MenuItem;
import java.util.Iterator;
import x7.InterfaceC3550a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class A {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a implements O8.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Menu f16447a;

        a(Menu menu) {
            this.f16447a = menu;
        }

        @Override // O8.i
        public Iterator iterator() {
            return A.b(this.f16447a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b implements Iterator, InterfaceC3550a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f16448g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Menu f16449h;

        b(Menu menu) {
            this.f16449h = menu;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public MenuItem next() {
            Menu menu = this.f16449h;
            int i10 = this.f16448g;
            this.f16448g = i10 + 1;
            MenuItem item = menu.getItem(i10);
            if (item != null) {
                return item;
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f16448g < this.f16449h.size();
        }

        @Override // java.util.Iterator
        public void remove() {
            Menu menu = this.f16449h;
            int i10 = this.f16448g - 1;
            this.f16448g = i10;
            MenuItem item = menu.getItem(i10);
            if (item == null) {
                throw new IndexOutOfBoundsException();
            }
            menu.removeItem(item.getItemId());
        }
    }

    public static final O8.i a(Menu menu) {
        return new a(menu);
    }

    public static final Iterator b(Menu menu) {
        return new b(menu);
    }
}
