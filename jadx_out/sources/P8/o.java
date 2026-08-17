package P8;

import j7.AbstractC2800q;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class o implements Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f8922h = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Pattern f8923g;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class b implements Serializable {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final a f8924i = new a(null);
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final String f8925g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int f8926h;

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        public b(String pattern, int i10) {
            AbstractC2855l.g(pattern, "pattern");
            this.f8925g = pattern;
            this.f8926h = i10;
        }

        private final Object readResolve() {
            Pattern patternCompile = Pattern.compile(this.f8925g, this.f8926h);
            AbstractC2855l.f(patternCompile, "compile(...)");
            return new o(patternCompile);
        }
    }

    public o(Pattern nativePattern) {
        AbstractC2855l.g(nativePattern, "nativePattern");
        this.f8923g = nativePattern;
    }

    public static /* synthetic */ l b(o oVar, CharSequence charSequence, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return oVar.a(charSequence, i10);
    }

    private final Object writeReplace() {
        String strPattern = this.f8923g.pattern();
        AbstractC2855l.f(strPattern, "pattern(...)");
        return new b(strPattern, this.f8923g.flags());
    }

    public final l a(CharSequence input, int i10) {
        AbstractC2855l.g(input, "input");
        Matcher matcher = this.f8923g.matcher(input);
        AbstractC2855l.f(matcher, "matcher(...)");
        return p.d(matcher, i10, input);
    }

    public final l c(CharSequence input) {
        AbstractC2855l.g(input, "input");
        Matcher matcher = this.f8923g.matcher(input);
        AbstractC2855l.f(matcher, "matcher(...)");
        return p.e(matcher, input);
    }

    public final boolean d(CharSequence input) {
        AbstractC2855l.g(input, "input");
        return this.f8923g.matcher(input).matches();
    }

    public final String e(CharSequence input, String replacement) {
        AbstractC2855l.g(input, "input");
        AbstractC2855l.g(replacement, "replacement");
        String strReplaceAll = this.f8923g.matcher(input).replaceAll(replacement);
        AbstractC2855l.f(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    public final List f(CharSequence input, int i10) {
        AbstractC2855l.g(input, "input");
        E.B0(i10);
        Matcher matcher = this.f8923g.matcher(input);
        if (i10 == 1 || !matcher.find()) {
            return AbstractC2800q.e(input.toString());
        }
        ArrayList arrayList = new ArrayList(i10 > 0 ? B7.d.h(i10, 10) : 10);
        int i11 = i10 - 1;
        int iEnd = 0;
        do {
            arrayList.add(input.subSequence(iEnd, matcher.start()).toString());
            iEnd = matcher.end();
            if (i11 >= 0 && arrayList.size() == i11) {
                break;
            }
        } while (matcher.find());
        arrayList.add(input.subSequence(iEnd, input.length()).toString());
        return arrayList;
    }

    public String toString() {
        String string = this.f8923g.toString();
        AbstractC2855l.f(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public o(String pattern) {
        AbstractC2855l.g(pattern, "pattern");
        Pattern patternCompile = Pattern.compile(pattern);
        AbstractC2855l.f(patternCompile, "compile(...)");
        this(patternCompile);
    }
}
