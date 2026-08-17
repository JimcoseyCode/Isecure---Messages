package e9;

import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import j7.AbstractC2793j;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC2845b;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x7.InterfaceC3550a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class t implements Iterable, InterfaceC3550a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f26320h = new b(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String[] f26321g;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f26322a = new ArrayList(20);

        public final a a(String name, String value) {
            AbstractC2855l.g(name, "name");
            AbstractC2855l.g(value, "value");
            b bVar = t.f26320h;
            bVar.e(name);
            bVar.f(value, name);
            c(name, value);
            return this;
        }

        public final a b(String line) {
            AbstractC2855l.g(line, "line");
            int iC0 = P8.q.c0(line, ':', 1, false, 4, null);
            if (iC0 != -1) {
                String strSubstring = line.substring(0, iC0);
                AbstractC2855l.f(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                String strSubstring2 = line.substring(iC0 + 1);
                AbstractC2855l.f(strSubstring2, "(this as java.lang.String).substring(startIndex)");
                c(strSubstring, strSubstring2);
                return this;
            }
            if (line.charAt(0) != ':') {
                c(PointerEventHelper.POINTER_TYPE_UNKNOWN, line);
                return this;
            }
            String strSubstring3 = line.substring(1);
            AbstractC2855l.f(strSubstring3, "(this as java.lang.String).substring(startIndex)");
            c(PointerEventHelper.POINTER_TYPE_UNKNOWN, strSubstring3);
            return this;
        }

        public final a c(String name, String value) {
            AbstractC2855l.g(name, "name");
            AbstractC2855l.g(value, "value");
            this.f26322a.add(name);
            this.f26322a.add(P8.q.c1(value).toString());
            return this;
        }

        public final a d(String name, String value) {
            AbstractC2855l.g(name, "name");
            AbstractC2855l.g(value, "value");
            t.f26320h.e(name);
            c(name, value);
            return this;
        }

        public final t e() {
            Object[] array = this.f26322a.toArray(new String[0]);
            if (array != null) {
                return new t((String[]) array, null);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }

        public final String f(String name) {
            AbstractC2855l.g(name, "name");
            B7.a aVarO = B7.d.o(B7.d.n(this.f26322a.size() - 2, 0), 2);
            int iD = aVarO.d();
            int iO = aVarO.o();
            int iP = aVarO.p();
            if (iP >= 0) {
                if (iD > iO) {
                    return null;
                }
            } else if (iD < iO) {
                return null;
            }
            while (!P8.q.x(name, (String) this.f26322a.get(iD), true)) {
                if (iD == iO) {
                    return null;
                }
                iD += iP;
            }
            return (String) this.f26322a.get(iD + 1);
        }

        public final List g() {
            return this.f26322a;
        }

        public final a h(String name) {
            AbstractC2855l.g(name, "name");
            int i10 = 0;
            while (i10 < this.f26322a.size()) {
                if (P8.q.x(name, (String) this.f26322a.get(i10), true)) {
                    this.f26322a.remove(i10);
                    this.f26322a.remove(i10);
                    i10 -= 2;
                }
                i10 += 2;
            }
            return this;
        }

        public final a i(String name, String value) {
            AbstractC2855l.g(name, "name");
            AbstractC2855l.g(value, "value");
            b bVar = t.f26320h;
            bVar.e(name);
            bVar.f(value, name);
            h(name);
            c(name, value);
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b {
        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void e(String str) {
            if (!(str.length() > 0)) {
                throw new IllegalArgumentException("name is empty");
            }
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = str.charAt(i10);
                if (!('!' <= cCharAt && '~' >= cCharAt)) {
                    throw new IllegalArgumentException(f9.c.q("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i10), str).toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void f(String str, String str2) {
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = str.charAt(i10);
                if (!(cCharAt == '\t' || (' ' <= cCharAt && '~' >= cCharAt))) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(f9.c.q("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i10), str2));
                    sb.append(f9.c.E(str2) ? PointerEventHelper.POINTER_TYPE_UNKNOWN : ": " + str);
                    throw new IllegalArgumentException(sb.toString().toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String g(String[] strArr, String str) {
            B7.a aVarO = B7.d.o(B7.d.n(strArr.length - 2, 0), 2);
            int iD = aVarO.d();
            int iO = aVarO.o();
            int iP = aVarO.p();
            if (iP >= 0) {
                if (iD > iO) {
                    return null;
                }
            } else if (iD < iO) {
                return null;
            }
            while (!P8.q.x(str, strArr[iD], true)) {
                if (iD == iO) {
                    return null;
                }
                iD += iP;
            }
            return strArr[iD + 1];
        }

        public final t a(Map headers) {
            AbstractC2855l.g(headers, "headers");
            return h(headers);
        }

        public final t h(Map toHeaders) {
            AbstractC2855l.g(toHeaders, "$this$toHeaders");
            String[] strArr = new String[toHeaders.size() * 2];
            int i10 = 0;
            for (Map.Entry entry : toHeaders.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                if (str == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                }
                String string = P8.q.c1(str).toString();
                if (str2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                }
                String string2 = P8.q.c1(str2).toString();
                e(string);
                f(string2, string);
                strArr[i10] = string;
                strArr[i10 + 1] = string2;
                i10 += 2;
            }
            return new t(strArr, null);
        }

        public final t i(String... namesAndValues) throws CloneNotSupportedException {
            AbstractC2855l.g(namesAndValues, "namesAndValues");
            if (!(namesAndValues.length % 2 == 0)) {
                throw new IllegalArgumentException("Expected alternating header names and values");
            }
            Object objClone = namesAndValues.clone();
            if (objClone == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            }
            String[] strArr = (String[]) objClone;
            int length = strArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                String str = strArr[i10];
                if (!(str != null)) {
                    throw new IllegalArgumentException("Headers cannot be null");
                }
                if (str == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                }
                strArr[i10] = P8.q.c1(str).toString();
            }
            B7.a aVarO = B7.d.o(AbstractC2793j.I(strArr), 2);
            int iD = aVarO.d();
            int iO = aVarO.o();
            int iP = aVarO.p();
            if (iP < 0 ? iD >= iO : iD <= iO) {
                while (true) {
                    String str2 = strArr[iD];
                    String str3 = strArr[iD + 1];
                    e(str2);
                    f(str3, str2);
                    if (iD == iO) {
                        break;
                    }
                    iD += iP;
                }
            }
            return new t(strArr, null);
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private t(String[] strArr) {
        this.f26321g = strArr;
    }

    public final int d() {
        return size();
    }

    public boolean equals(Object obj) {
        return (obj instanceof t) && Arrays.equals(this.f26321g, ((t) obj).f26321g);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f26321g);
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        int size = size();
        Pair[] pairArr = new Pair[size];
        for (int i10 = 0; i10 < size; i10++) {
            pairArr[i10] = i7.t.a(p(i10), s(i10));
        }
        return AbstractC2845b.a(pairArr);
    }

    public final String o(String name) {
        AbstractC2855l.g(name, "name");
        return f26320h.g(this.f26321g, name);
    }

    public final String p(int i10) {
        return this.f26321g[i10 * 2];
    }

    public final Set q() {
        TreeSet treeSet = new TreeSet(P8.q.y(kotlin.jvm.internal.H.f29375a));
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            treeSet.add(p(i10));
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(treeSet);
        AbstractC2855l.f(setUnmodifiableSet, "Collections.unmodifiableSet(result)");
        return setUnmodifiableSet;
    }

    public final a r() {
        a aVar = new a();
        AbstractC2800q.B(aVar.g(), this.f26321g);
        return aVar;
    }

    public final String s(int i10) {
        return this.f26321g[(i10 * 2) + 1];
    }

    public final int size() {
        return this.f26321g.length / 2;
    }

    public final List t(String name) {
        AbstractC2855l.g(name, "name");
        int size = size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            if (P8.q.x(name, p(i10), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(s(i10));
            }
        }
        if (arrayList == null) {
            return AbstractC2800q.j();
        }
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        AbstractC2855l.f(listUnmodifiableList, "Collections.unmodifiableList(result)");
        return listUnmodifiableList;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            String strP = p(i10);
            String strS = s(i10);
            sb.append(strP);
            sb.append(": ");
            if (f9.c.E(strP)) {
                strS = "██";
            }
            sb.append(strS);
            sb.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        }
        String string = sb.toString();
        AbstractC2855l.f(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public /* synthetic */ t(String[] strArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(strArr);
    }
}
