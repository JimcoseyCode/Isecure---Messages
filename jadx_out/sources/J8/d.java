package J8;

import j7.AbstractC2786c;
import j7.AbstractC2793j;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f6844i = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Object[] f6845g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f6846h;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b extends AbstractC2786c {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f6847i = -1;

        b() {
        }

        @Override // j7.AbstractC2786c
        protected void c() {
            do {
                int i10 = this.f6847i + 1;
                this.f6847i = i10;
                if (i10 >= d.this.f6845g.length) {
                    break;
                }
            } while (d.this.f6845g[this.f6847i] == null);
            if (this.f6847i >= d.this.f6845g.length) {
                d();
                return;
            }
            Object obj = d.this.f6845g[this.f6847i];
            AbstractC2855l.e(obj, "null cannot be cast to non-null type T of org.jetbrains.kotlin.util.ArrayMapImpl");
            e(obj);
        }
    }

    private d(Object[] objArr, int i10) {
        super(null);
        this.f6845g = objArr;
        this.f6846h = i10;
    }

    private final void p(int i10) {
        Object[] objArr = this.f6845g;
        if (objArr.length > i10) {
            return;
        }
        int length = objArr.length;
        do {
            length *= 2;
        } while (length <= i10);
        Object[] objArrCopyOf = Arrays.copyOf(this.f6845g, length);
        AbstractC2855l.f(objArrCopyOf, "copyOf(...)");
        this.f6845g = objArrCopyOf;
    }

    @Override // J8.c
    public int d() {
        return this.f6846h;
    }

    @Override // J8.c
    public Object get(int i10) {
        return AbstractC2793j.N(this.f6845g, i10);
    }

    @Override // J8.c, java.lang.Iterable
    public Iterator iterator() {
        return new b();
    }

    @Override // J8.c
    public void set(int i10, Object value) {
        AbstractC2855l.g(value, "value");
        p(i10);
        if (this.f6845g[i10] == null) {
            this.f6846h = d() + 1;
        }
        this.f6845g[i10] = value;
    }

    public d() {
        this(new Object[20], 0);
    }
}
