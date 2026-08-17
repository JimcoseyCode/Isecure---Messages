package X2;

import c2.k;
import com.facebook.react.uimanager.ViewDefaults;
import com.facebook.react.uimanager.events.PointerEventHelper;
import i7.AbstractC2746i;
import java.util.Arrays;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.H;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f12409c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Lazy f12410d = AbstractC2746i.b(new InterfaceC3487a() { // from class: X2.a
        @Override // w7.InterfaceC3487a
        public final Object invoke() {
            return b.e();
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12412b;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Pattern d() {
            Object value = b.f12410d.getValue();
            AbstractC2855l.f(value, "getValue(...)");
            return (Pattern) value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String f(int i10) {
            return i10 == Integer.MAX_VALUE ? PointerEventHelper.POINTER_TYPE_UNKNOWN : String.valueOf(i10);
        }

        public final b b(int i10) {
            k.b(Boolean.valueOf(i10 >= 0));
            return new b(i10, ViewDefaults.NUMBER_OF_LINES);
        }

        public final b c(String str) {
            if (str == null) {
                return null;
            }
            try {
                String[] strArrSplit = d().split(str);
                k.b(Boolean.valueOf(strArrSplit.length == 4));
                k.b(Boolean.valueOf(AbstractC2855l.b(strArrSplit[0], "bytes")));
                String str2 = strArrSplit[1];
                AbstractC2855l.f(str2, "get(...)");
                int i10 = Integer.parseInt(str2);
                String str3 = strArrSplit[2];
                AbstractC2855l.f(str3, "get(...)");
                int i11 = Integer.parseInt(str3);
                String str4 = strArrSplit[3];
                AbstractC2855l.f(str4, "get(...)");
                int i12 = Integer.parseInt(str4);
                k.b(Boolean.valueOf(i11 > i10));
                k.b(Boolean.valueOf(i12 > i11));
                return i11 < i12 - 1 ? new b(i10, i11) : new b(i10, ViewDefaults.NUMBER_OF_LINES);
            } catch (IllegalArgumentException e10) {
                H h10 = H.f29375a;
                String str5 = String.format(null, "Invalid Content-Range header value: \"%s\"", Arrays.copyOf(new Object[]{str}, 1));
                AbstractC2855l.f(str5, "format(...)");
                throw new IllegalArgumentException(str5, e10);
            }
        }

        public final b e(int i10) {
            k.b(Boolean.valueOf(i10 > 0));
            return new b(0, i10);
        }

        private a() {
        }
    }

    public b(int i10, int i11) {
        this.f12411a = i10;
        this.f12412b = i11;
    }

    public static final b d(int i10) {
        return f12409c.b(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pattern e() {
        return Pattern.compile("[-/ ]");
    }

    public static final b g(int i10) {
        return f12409c.e(i10);
    }

    public final boolean c(b bVar) {
        return bVar != null && this.f12411a <= bVar.f12411a && bVar.f12412b <= this.f12412b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AbstractC2855l.b(b.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC2855l.e(obj, "null cannot be cast to non-null type com.facebook.imagepipeline.common.BytesRange");
        b bVar = (b) obj;
        return this.f12411a == bVar.f12411a && this.f12412b == bVar.f12412b;
    }

    public final String f() {
        H h10 = H.f29375a;
        a aVar = f12409c;
        String str = String.format(null, "bytes=%s-%s", Arrays.copyOf(new Object[]{aVar.f(this.f12411a), aVar.f(this.f12412b)}, 2));
        AbstractC2855l.f(str, "format(...)");
        return str;
    }

    public int hashCode() {
        return (this.f12411a * 31) + this.f12412b;
    }

    public String toString() {
        H h10 = H.f29375a;
        a aVar = f12409c;
        String str = String.format(null, "%s-%s", Arrays.copyOf(new Object[]{aVar.f(this.f12411a), aVar.f(this.f12412b)}, 2));
        AbstractC2855l.f(str, "format(...)");
        return str;
    }
}
