package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import x7.InterfaceC3550a;

/* JADX INFO: renamed from: androidx.core.view.g0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1670g0 {

    /* JADX INFO: renamed from: androidx.core.view.g0$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a implements O8.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f16553a;

        a(ViewGroup viewGroup) {
            this.f16553a = viewGroup;
        }

        @Override // O8.i
        public Iterator iterator() {
            return AbstractC1670g0.c(this.f16553a);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.g0$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class b implements Function1 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final b f16554g = new b();

        b() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Iterator invoke(View view) {
            O8.i iVarA;
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup == null || (iVarA = AbstractC1670g0.a(viewGroup)) == null) {
                return null;
            }
            return iVarA.iterator();
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.g0$c */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class c implements Iterator, InterfaceC3550a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f16555g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ ViewGroup f16556h;

        c(ViewGroup viewGroup) {
            this.f16556h = viewGroup;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public View next() {
            ViewGroup viewGroup = this.f16556h;
            int i10 = this.f16555g;
            this.f16555g = i10 + 1;
            View childAt = viewGroup.getChildAt(i10);
            if (childAt != null) {
                return childAt;
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f16555g < this.f16556h.getChildCount();
        }

        @Override // java.util.Iterator
        public void remove() {
            ViewGroup viewGroup = this.f16556h;
            int i10 = this.f16555g - 1;
            this.f16555g = i10;
            viewGroup.removeViewAt(i10);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.g0$d */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class d implements O8.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f16557a;

        public d(ViewGroup viewGroup) {
            this.f16557a = viewGroup;
        }

        @Override // O8.i
        public Iterator iterator() {
            return new W(AbstractC1670g0.a(this.f16557a).iterator(), b.f16554g);
        }
    }

    public static final O8.i a(ViewGroup viewGroup) {
        return new a(viewGroup);
    }

    public static final O8.i b(ViewGroup viewGroup) {
        return new d(viewGroup);
    }

    public static final Iterator c(ViewGroup viewGroup) {
        return new c(viewGroup);
    }
}
