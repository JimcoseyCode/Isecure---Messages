package k7;

import j7.AbstractC2787d;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x7.InterfaceC3550a;
import x7.InterfaceC3553d;

/* JADX INFO: renamed from: k7.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2836d implements Map, Serializable, InterfaceC3553d {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final a f29159t = new a(null);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final C2836d f29160u;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Object[] f29161g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Object[] f29162h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int[] f29163i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int[] f29164j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f29165k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f29166l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f29167m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f29168n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f29169o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private C2838f f29170p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private C2839g f29171q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private C2837e f29172r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f29173s;

    /* JADX INFO: renamed from: k7.d$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int c(int i10) {
            return Integer.highestOneBit(B7.d.d(i10, 1) * 3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int d(int i10) {
            return Integer.numberOfLeadingZeros(i10) + 1;
        }

        public final C2836d e() {
            return C2836d.f29160u;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: k7.d$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b extends C0307d implements Iterator, InterfaceC3550a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C2836d map) {
            super(map);
            AbstractC2855l.g(map, "map");
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public c next() {
            c();
            if (d() >= f().f29166l) {
                throw new NoSuchElementException();
            }
            int iD = d();
            i(iD + 1);
            j(iD);
            c cVar = new c(f(), e());
            g();
            return cVar;
        }

        public final void l(StringBuilder sb) {
            AbstractC2855l.g(sb, "sb");
            if (d() >= f().f29166l) {
                throw new NoSuchElementException();
            }
            int iD = d();
            i(iD + 1);
            j(iD);
            Object obj = f().f29161g[e()];
            if (obj == f()) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = f().f29162h;
            AbstractC2855l.d(objArr);
            Object obj2 = objArr[e()];
            if (obj2 == f()) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            g();
        }

        public final int m() {
            if (d() >= f().f29166l) {
                throw new NoSuchElementException();
            }
            int iD = d();
            i(iD + 1);
            j(iD);
            Object obj = f().f29161g[e()];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = f().f29162h;
            AbstractC2855l.d(objArr);
            Object obj2 = objArr[e()];
            int iHashCode2 = iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
            g();
            return iHashCode2;
        }
    }

    /* JADX INFO: renamed from: k7.d$c */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class c implements Map.Entry, InterfaceC3550a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final C2836d f29174g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int f29175h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final int f29176i;

        public c(C2836d map, int i10) {
            AbstractC2855l.g(map, "map");
            this.f29174g = map;
            this.f29175h = i10;
            this.f29176i = map.f29168n;
        }

        private final void a() {
            if (this.f29174g.f29168n != this.f29176i) {
                throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
            }
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return AbstractC2855l.b(entry.getKey(), getKey()) && AbstractC2855l.b(entry.getValue(), getValue());
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            a();
            return this.f29174g.f29161g[this.f29175h];
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            a();
            Object[] objArr = this.f29174g.f29162h;
            AbstractC2855l.d(objArr);
            return objArr[this.f29175h];
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Object key = getKey();
            int iHashCode = key != null ? key.hashCode() : 0;
            Object value = getValue();
            return iHashCode ^ (value != null ? value.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            a();
            this.f29174g.n();
            Object[] objArrL = this.f29174g.l();
            int i10 = this.f29175h;
            Object obj2 = objArrL[i10];
            objArrL[i10] = obj;
            return obj2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append('=');
            sb.append(getValue());
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: k7.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class C0307d {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final C2836d f29177g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f29178h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f29179i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f29180j;

        public C0307d(C2836d map) {
            AbstractC2855l.g(map, "map");
            this.f29177g = map;
            this.f29179i = -1;
            this.f29180j = map.f29168n;
            g();
        }

        public final void c() {
            if (this.f29177g.f29168n != this.f29180j) {
                throw new ConcurrentModificationException();
            }
        }

        public final int d() {
            return this.f29178h;
        }

        public final int e() {
            return this.f29179i;
        }

        public final C2836d f() {
            return this.f29177g;
        }

        public final void g() {
            while (this.f29178h < this.f29177g.f29166l) {
                int[] iArr = this.f29177g.f29163i;
                int i10 = this.f29178h;
                if (iArr[i10] >= 0) {
                    return;
                } else {
                    this.f29178h = i10 + 1;
                }
            }
        }

        public final boolean hasNext() {
            return this.f29178h < this.f29177g.f29166l;
        }

        public final void i(int i10) {
            this.f29178h = i10;
        }

        public final void j(int i10) {
            this.f29179i = i10;
        }

        public final void remove() {
            c();
            if (this.f29179i == -1) {
                throw new IllegalStateException("Call next() before removing element from the iterator.");
            }
            this.f29177g.n();
            this.f29177g.M(this.f29179i);
            this.f29179i = -1;
            this.f29180j = this.f29177g.f29168n;
        }
    }

    /* JADX INFO: renamed from: k7.d$e */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class e extends C0307d implements Iterator, InterfaceC3550a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C2836d map) {
            super(map);
            AbstractC2855l.g(map, "map");
        }

        @Override // java.util.Iterator
        public Object next() {
            c();
            if (d() >= f().f29166l) {
                throw new NoSuchElementException();
            }
            int iD = d();
            i(iD + 1);
            j(iD);
            Object obj = f().f29161g[e()];
            g();
            return obj;
        }
    }

    /* JADX INFO: renamed from: k7.d$f */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class f extends C0307d implements Iterator, InterfaceC3550a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(C2836d map) {
            super(map);
            AbstractC2855l.g(map, "map");
        }

        @Override // java.util.Iterator
        public Object next() {
            c();
            if (d() >= f().f29166l) {
                throw new NoSuchElementException();
            }
            int iD = d();
            i(iD + 1);
            j(iD);
            Object[] objArr = f().f29162h;
            AbstractC2855l.d(objArr);
            Object obj = objArr[e()];
            g();
            return obj;
        }
    }

    static {
        C2836d c2836d = new C2836d(0);
        c2836d.f29173s = true;
        f29160u = c2836d;
    }

    private C2836d(Object[] objArr, Object[] objArr2, int[] iArr, int[] iArr2, int i10, int i11) {
        this.f29161g = objArr;
        this.f29162h = objArr2;
        this.f29163i = iArr;
        this.f29164j = iArr2;
        this.f29165k = i10;
        this.f29166l = i11;
        this.f29167m = f29159t.d(z());
    }

    private final int D(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f29167m;
    }

    private final boolean G(Collection collection) {
        boolean z10 = false;
        if (collection.isEmpty()) {
            return false;
        }
        t(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (H((Map.Entry) it.next())) {
                z10 = true;
            }
        }
        return z10;
    }

    private final boolean H(Map.Entry entry) {
        int iK = k(entry.getKey());
        Object[] objArrL = l();
        if (iK >= 0) {
            objArrL[iK] = entry.getValue();
            return true;
        }
        int i10 = (-iK) - 1;
        if (AbstractC2855l.b(entry.getValue(), objArrL[i10])) {
            return false;
        }
        objArrL[i10] = entry.getValue();
        return true;
    }

    private final boolean I(int i10) {
        int iD = D(this.f29161g[i10]);
        int i11 = this.f29165k;
        while (true) {
            int[] iArr = this.f29164j;
            if (iArr[iD] == 0) {
                iArr[iD] = i10 + 1;
                this.f29163i[i10] = iD;
                return true;
            }
            i11--;
            if (i11 < 0) {
                return false;
            }
            iD = iD == 0 ? z() - 1 : iD - 1;
        }
    }

    private final void J() {
        this.f29168n++;
    }

    private final void K(int i10) {
        J();
        int i11 = 0;
        if (this.f29166l > size()) {
            o(false);
        }
        this.f29164j = new int[i10];
        this.f29167m = f29159t.d(i10);
        while (i11 < this.f29166l) {
            int i12 = i11 + 1;
            if (!I(i11)) {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
            i11 = i12;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M(int i10) {
        AbstractC2835c.f(this.f29161g, i10);
        Object[] objArr = this.f29162h;
        if (objArr != null) {
            AbstractC2835c.f(objArr, i10);
        }
        N(this.f29163i[i10]);
        this.f29163i[i10] = -1;
        this.f29169o = size() - 1;
        J();
    }

    private final void N(int i10) {
        int iH = B7.d.h(this.f29165k * 2, z() / 2);
        int i11 = 0;
        int i12 = i10;
        do {
            i10 = i10 == 0 ? z() - 1 : i10 - 1;
            i11++;
            if (i11 > this.f29165k) {
                this.f29164j[i12] = 0;
                return;
            }
            int[] iArr = this.f29164j;
            int i13 = iArr[i10];
            if (i13 == 0) {
                iArr[i12] = 0;
                return;
            }
            if (i13 < 0) {
                iArr[i12] = -1;
            } else {
                int i14 = i13 - 1;
                if (((D(this.f29161g[i14]) - i10) & (z() - 1)) >= i11) {
                    this.f29164j[i12] = i13;
                    this.f29163i[i14] = i12;
                }
                iH--;
            }
            i12 = i10;
            i11 = 0;
            iH--;
        } while (iH >= 0);
        this.f29164j[i12] = -1;
    }

    private final boolean Q(int i10) {
        int iX = x();
        int i11 = this.f29166l;
        int i12 = iX - i11;
        int size = i11 - size();
        return i12 < i10 && i12 + size >= i10 && size >= x() / 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] l() {
        Object[] objArr = this.f29162h;
        if (objArr != null) {
            return objArr;
        }
        Object[] objArrD = AbstractC2835c.d(x());
        this.f29162h = objArrD;
        return objArrD;
    }

    private final void o(boolean z10) {
        int i10;
        Object[] objArr = this.f29162h;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i10 = this.f29166l;
            if (i11 >= i10) {
                break;
            }
            int[] iArr = this.f29163i;
            int i13 = iArr[i11];
            if (i13 >= 0) {
                Object[] objArr2 = this.f29161g;
                objArr2[i12] = objArr2[i11];
                if (objArr != null) {
                    objArr[i12] = objArr[i11];
                }
                if (z10) {
                    iArr[i12] = i13;
                    this.f29164j[i13] = i12 + 1;
                }
                i12++;
            }
            i11++;
        }
        AbstractC2835c.g(this.f29161g, i12, i10);
        if (objArr != null) {
            AbstractC2835c.g(objArr, i12, this.f29166l);
        }
        this.f29166l = i12;
    }

    private final boolean r(Map map) {
        return size() == map.size() && p(map.entrySet());
    }

    private final void s(int i10) {
        if (i10 < 0) {
            throw new OutOfMemoryError();
        }
        if (i10 > x()) {
            int iE = AbstractC2787d.f28912g.e(x(), i10);
            this.f29161g = AbstractC2835c.e(this.f29161g, iE);
            Object[] objArr = this.f29162h;
            this.f29162h = objArr != null ? AbstractC2835c.e(objArr, iE) : null;
            int[] iArrCopyOf = Arrays.copyOf(this.f29163i, iE);
            AbstractC2855l.f(iArrCopyOf, "copyOf(...)");
            this.f29163i = iArrCopyOf;
            int iC = f29159t.c(iE);
            if (iC > z()) {
                K(iC);
            }
        }
    }

    private final void t(int i10) {
        if (Q(i10)) {
            o(true);
        } else {
            s(this.f29166l + i10);
        }
    }

    private final int v(Object obj) {
        int iD = D(obj);
        int i10 = this.f29165k;
        while (true) {
            int i11 = this.f29164j[iD];
            if (i11 == 0) {
                return -1;
            }
            if (i11 > 0) {
                int i12 = i11 - 1;
                if (AbstractC2855l.b(this.f29161g[i12], obj)) {
                    return i12;
                }
            }
            i10--;
            if (i10 < 0) {
                return -1;
            }
            iD = iD == 0 ? z() - 1 : iD - 1;
        }
    }

    private final int w(Object obj) {
        int i10 = this.f29166l;
        while (true) {
            i10--;
            if (i10 < 0) {
                return -1;
            }
            if (this.f29163i[i10] >= 0) {
                Object[] objArr = this.f29162h;
                AbstractC2855l.d(objArr);
                if (AbstractC2855l.b(objArr[i10], obj)) {
                    return i10;
                }
            }
        }
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.f29173s) {
            return new C2841i(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    private final int z() {
        return this.f29164j.length;
    }

    public Set A() {
        C2838f c2838f = this.f29170p;
        if (c2838f != null) {
            return c2838f;
        }
        C2838f c2838f2 = new C2838f(this);
        this.f29170p = c2838f2;
        return c2838f2;
    }

    public int B() {
        return this.f29169o;
    }

    public Collection C() {
        C2839g c2839g = this.f29171q;
        if (c2839g != null) {
            return c2839g;
        }
        C2839g c2839g2 = new C2839g(this);
        this.f29171q = c2839g2;
        return c2839g2;
    }

    public final boolean E() {
        return this.f29173s;
    }

    public final e F() {
        return new e(this);
    }

    public final boolean L(Map.Entry entry) {
        AbstractC2855l.g(entry, "entry");
        n();
        int iV = v(entry.getKey());
        if (iV < 0) {
            return false;
        }
        Object[] objArr = this.f29162h;
        AbstractC2855l.d(objArr);
        if (!AbstractC2855l.b(objArr[iV], entry.getValue())) {
            return false;
        }
        M(iV);
        return true;
    }

    public final boolean O(Object obj) {
        n();
        int iV = v(obj);
        if (iV < 0) {
            return false;
        }
        M(iV);
        return true;
    }

    public final boolean P(Object obj) {
        n();
        int iW = w(obj);
        if (iW < 0) {
            return false;
        }
        M(iW);
        return true;
    }

    public final f R() {
        return new f(this);
    }

    @Override // java.util.Map
    public void clear() {
        n();
        int i10 = this.f29166l - 1;
        if (i10 >= 0) {
            int i11 = 0;
            while (true) {
                int[] iArr = this.f29163i;
                int i12 = iArr[i11];
                if (i12 >= 0) {
                    this.f29164j[i12] = 0;
                    iArr[i11] = -1;
                }
                if (i11 == i10) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        AbstractC2835c.g(this.f29161g, 0, this.f29166l);
        Object[] objArr = this.f29162h;
        if (objArr != null) {
            AbstractC2835c.g(objArr, 0, this.f29166l);
        }
        this.f29169o = 0;
        this.f29166l = 0;
        J();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return v(obj) >= 0;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return w(obj) >= 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return y();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof Map) && r((Map) obj);
        }
        return true;
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        int iV = v(obj);
        if (iV < 0) {
            return null;
        }
        Object[] objArr = this.f29162h;
        AbstractC2855l.d(objArr);
        return objArr[iV];
    }

    @Override // java.util.Map
    public int hashCode() {
        b bVarU = u();
        int iM = 0;
        while (bVarU.hasNext()) {
            iM += bVarU.m();
        }
        return iM;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    public final int k(Object obj) {
        n();
        while (true) {
            int iD = D(obj);
            int iH = B7.d.h(this.f29165k * 2, z() / 2);
            int i10 = 0;
            while (true) {
                int i11 = this.f29164j[iD];
                if (i11 <= 0) {
                    if (this.f29166l < x()) {
                        int i12 = this.f29166l;
                        int i13 = i12 + 1;
                        this.f29166l = i13;
                        this.f29161g[i12] = obj;
                        this.f29163i[i12] = iD;
                        this.f29164j[iD] = i13;
                        this.f29169o = size() + 1;
                        J();
                        if (i10 > this.f29165k) {
                            this.f29165k = i10;
                        }
                        return i12;
                    }
                    t(1);
                } else {
                    if (AbstractC2855l.b(this.f29161g[i11 - 1], obj)) {
                        return -i11;
                    }
                    i10++;
                    if (i10 > iH) {
                        K(z() * 2);
                        break;
                    }
                    iD = iD == 0 ? z() - 1 : iD - 1;
                }
            }
        }
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return A();
    }

    public final Map m() {
        n();
        this.f29173s = true;
        if (size() > 0) {
            return this;
        }
        C2836d c2836d = f29160u;
        AbstractC2855l.e(c2836d, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return c2836d;
    }

    public final void n() {
        if (this.f29173s) {
            throw new UnsupportedOperationException();
        }
    }

    public final boolean p(Collection m10) {
        AbstractC2855l.g(m10, "m");
        for (Object obj : m10) {
            if (obj != null) {
                try {
                    if (!q((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        n();
        int iK = k(obj);
        Object[] objArrL = l();
        if (iK >= 0) {
            objArrL[iK] = obj2;
            return null;
        }
        int i10 = (-iK) - 1;
        Object obj3 = objArrL[i10];
        objArrL[i10] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public void putAll(Map from) {
        AbstractC2855l.g(from, "from");
        n();
        G(from.entrySet());
    }

    public final boolean q(Map.Entry entry) {
        AbstractC2855l.g(entry, "entry");
        int iV = v(entry.getKey());
        if (iV < 0) {
            return false;
        }
        Object[] objArr = this.f29162h;
        AbstractC2855l.d(objArr);
        return AbstractC2855l.b(objArr[iV], entry.getValue());
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        n();
        int iV = v(obj);
        if (iV < 0) {
            return null;
        }
        Object[] objArr = this.f29162h;
        AbstractC2855l.d(objArr);
        Object obj2 = objArr[iV];
        M(iV);
        return obj2;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return B();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((size() * 3) + 2);
        sb.append("{");
        b bVarU = u();
        int i10 = 0;
        while (bVarU.hasNext()) {
            if (i10 > 0) {
                sb.append(", ");
            }
            bVarU.l(sb);
            i10++;
        }
        sb.append("}");
        String string = sb.toString();
        AbstractC2855l.f(string, "toString(...)");
        return string;
    }

    public final b u() {
        return new b(this);
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return C();
    }

    public final int x() {
        return this.f29161g.length;
    }

    public Set y() {
        C2837e c2837e = this.f29172r;
        if (c2837e != null) {
            return c2837e;
        }
        C2837e c2837e2 = new C2837e(this);
        this.f29172r = c2837e2;
        return c2837e2;
    }

    public C2836d() {
        this(8);
    }

    public C2836d(int i10) {
        this(AbstractC2835c.d(i10), null, new int[i10], new int[f29159t.c(i10)], 2, 0);
    }
}
