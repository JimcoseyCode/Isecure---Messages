package P8;

import P8.l;
import P8.m;
import com.facebook.react.uimanager.events.PointerEventHelper;
import j7.AbstractC2785b;
import j7.AbstractC2787d;
import j7.AbstractC2800q;
import java.util.Iterator;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class m implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Matcher f8915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CharSequence f8916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k f8917c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List f8918d;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a extends AbstractC2787d {
        a() {
        }

        @Override // j7.AbstractC2785b, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof String) {
                return q((String) obj);
            }
            return false;
        }

        @Override // j7.AbstractC2787d, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof String) {
                return s((String) obj);
            }
            return -1;
        }

        @Override // j7.AbstractC2787d, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof String) {
                return t((String) obj);
            }
            return -1;
        }

        @Override // j7.AbstractC2785b
        public int o() {
            return m.this.d().groupCount() + 1;
        }

        public /* bridge */ boolean q(String str) {
            return super.contains(str);
        }

        @Override // j7.AbstractC2787d, java.util.List
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public String get(int i10) {
            String strGroup = m.this.d().group(i10);
            return strGroup == null ? PointerEventHelper.POINTER_TYPE_UNKNOWN : strGroup;
        }

        public /* bridge */ int s(String str) {
            return super.indexOf(str);
        }

        public /* bridge */ int t(String str) {
            return super.lastIndexOf(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b extends AbstractC2785b implements k {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final j t(b bVar, int i10) {
            return bVar.s(i10);
        }

        @Override // j7.AbstractC2785b, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj == null ? true : obj instanceof j) {
                return r((j) obj);
            }
            return false;
        }

        @Override // j7.AbstractC2785b, java.util.Collection
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return O8.l.J(AbstractC2800q.V(AbstractC2800q.k(this)), new Function1() { // from class: P8.n
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return m.b.t(this.f8921g, ((Integer) obj).intValue());
                }
            }).iterator();
        }

        @Override // j7.AbstractC2785b
        public int o() {
            return m.this.d().groupCount() + 1;
        }

        public /* bridge */ boolean r(j jVar) {
            return super.contains(jVar);
        }

        public j s(int i10) {
            B7.c cVarF = p.f(m.this.d(), i10);
            if (cVarF.t().intValue() < 0) {
                return null;
            }
            String strGroup = m.this.d().group(i10);
            AbstractC2855l.f(strGroup, "group(...)");
            return new j(strGroup, cVarF);
        }
    }

    public m(Matcher matcher, CharSequence input) {
        AbstractC2855l.g(matcher, "matcher");
        AbstractC2855l.g(input, "input");
        this.f8915a = matcher;
        this.f8916b = input;
        this.f8917c = new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MatchResult d() {
        return this.f8915a;
    }

    @Override // P8.l
    public l.b a() {
        return l.a.a(this);
    }

    @Override // P8.l
    public List b() {
        if (this.f8918d == null) {
            this.f8918d = new a();
        }
        List list = this.f8918d;
        AbstractC2855l.d(list);
        return list;
    }
}
