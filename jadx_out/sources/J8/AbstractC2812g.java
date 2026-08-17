package j8;

import P8.q;
import com.facebook.react.uimanager.events.PointerEventHelper;
import h8.InterfaceC2710c;
import i7.C2750m;
import i8.AbstractC2757a;
import j7.AbstractC2800q;
import j7.C2783G;
import j7.K;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: j8.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2812g implements InterfaceC2710c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f28948d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f28949e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final List f28950f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Map f28951g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String[] f28952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f28953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f28954c;

    /* JADX INFO: renamed from: j8.g$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: j8.g$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28955a;

        static {
            int[] iArr = new int[AbstractC2757a.e.c.EnumC0299c.values().length];
            try {
                iArr[AbstractC2757a.e.c.EnumC0299c.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC2757a.e.c.EnumC0299c.INTERNAL_TO_CLASS_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AbstractC2757a.e.c.EnumC0299c.DESC_TO_CLASS_ID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f28955a = iArr;
        }
    }

    static {
        String strO0 = AbstractC2800q.o0(AbstractC2800q.m('k', 'o', 't', 'l', 'i', 'n'), PointerEventHelper.POINTER_TYPE_UNKNOWN, null, null, 0, null, null, 62, null);
        f28949e = strO0;
        List listM = AbstractC2800q.m(strO0 + "/Any", strO0 + "/Nothing", strO0 + "/Unit", strO0 + "/Throwable", strO0 + "/Number", strO0 + "/Byte", strO0 + "/Double", strO0 + "/Float", strO0 + "/Int", strO0 + "/Long", strO0 + "/Short", strO0 + "/Boolean", strO0 + "/Char", strO0 + "/CharSequence", strO0 + "/String", strO0 + "/Comparable", strO0 + "/Enum", strO0 + "/Array", strO0 + "/ByteArray", strO0 + "/DoubleArray", strO0 + "/FloatArray", strO0 + "/IntArray", strO0 + "/LongArray", strO0 + "/ShortArray", strO0 + "/BooleanArray", strO0 + "/CharArray", strO0 + "/Cloneable", strO0 + "/Annotation", strO0 + "/collections/Iterable", strO0 + "/collections/MutableIterable", strO0 + "/collections/Collection", strO0 + "/collections/MutableCollection", strO0 + "/collections/List", strO0 + "/collections/MutableList", strO0 + "/collections/Set", strO0 + "/collections/MutableSet", strO0 + "/collections/Map", strO0 + "/collections/MutableMap", strO0 + "/collections/Map.Entry", strO0 + "/collections/MutableMap.MutableEntry", strO0 + "/collections/Iterator", strO0 + "/collections/MutableIterator", strO0 + "/collections/ListIterator", strO0 + "/collections/MutableListIterator");
        f28950f = listM;
        Iterable<C2783G> iterableV0 = AbstractC2800q.V0(listM);
        LinkedHashMap linkedHashMap = new LinkedHashMap(B7.d.d(K.e(AbstractC2800q.u(iterableV0, 10)), 16));
        for (C2783G c2783g : iterableV0) {
            linkedHashMap.put((String) c2783g.d(), Integer.valueOf(c2783g.c()));
        }
        f28951g = linkedHashMap;
    }

    public AbstractC2812g(String[] strings, Set localNameIndices, List records) {
        AbstractC2855l.g(strings, "strings");
        AbstractC2855l.g(localNameIndices, "localNameIndices");
        AbstractC2855l.g(records, "records");
        this.f28952a = strings;
        this.f28953b = localNameIndices;
        this.f28954c = records;
    }

    @Override // h8.InterfaceC2710c
    public String a(int i10) {
        return getString(i10);
    }

    @Override // h8.InterfaceC2710c
    public boolean b(int i10) {
        return this.f28953b.contains(Integer.valueOf(i10));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    @Override // h8.InterfaceC2710c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String getString(int i10) {
        String strSubstring;
        AbstractC2757a.e.c cVar = (AbstractC2757a.e.c) this.f28954c.get(i10);
        if (cVar.O()) {
            strSubstring = cVar.H();
        } else if (cVar.M()) {
            List list = f28950f;
            int size = list.size();
            int iD = cVar.D();
            strSubstring = (iD < 0 || iD >= size) ? this.f28952a[i10] : (String) list.get(cVar.D());
        }
        if (cVar.J() >= 2) {
            List listK = cVar.K();
            AbstractC2855l.d(listK);
            Integer num = (Integer) listK.get(0);
            Integer num2 = (Integer) listK.get(1);
            if (num.intValue() >= 0 && num.intValue() <= num2.intValue() && num2.intValue() <= strSubstring.length()) {
                AbstractC2855l.d(strSubstring);
                AbstractC2855l.d(num);
                int iIntValue = num.intValue();
                AbstractC2855l.d(num2);
                strSubstring = strSubstring.substring(iIntValue, num2.intValue());
                AbstractC2855l.f(strSubstring, "substring(...)");
            }
        }
        String strD = strSubstring;
        if (cVar.F() >= 2) {
            List listG = cVar.G();
            AbstractC2855l.d(listG);
            Integer num3 = (Integer) listG.get(0);
            Integer num4 = (Integer) listG.get(1);
            AbstractC2855l.d(strD);
            strD = q.D(strD, (char) num3.intValue(), (char) num4.intValue(), false, 4, null);
        }
        String strD2 = strD;
        AbstractC2757a.e.c.EnumC0299c enumC0299cC = cVar.C();
        if (enumC0299cC == null) {
            enumC0299cC = AbstractC2757a.e.c.EnumC0299c.NONE;
        }
        int i11 = b.f28955a[enumC0299cC.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                AbstractC2855l.d(strD2);
                strD2 = q.D(strD2, '$', '.', false, 4, null);
            } else {
                if (i11 != 3) {
                    throw new C2750m();
                }
                if (strD2.length() >= 2) {
                    AbstractC2855l.d(strD2);
                    strD2 = strD2.substring(1, strD2.length() - 1);
                    AbstractC2855l.f(strD2, "substring(...)");
                }
                String str = strD2;
                AbstractC2855l.d(str);
                strD2 = q.D(str, '$', '.', false, 4, null);
            }
        }
        AbstractC2855l.d(strD2);
        return strD2;
    }
}
