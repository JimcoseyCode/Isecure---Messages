package T5;

import T5.d;
import T5.j;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    static final String f10437A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    static final Pattern f10438B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private static final String f10439C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final String f10440D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final String f10441E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static final String f10442F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    static final Pattern f10443G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private static final Pattern f10444H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private static final Pattern f10445I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    static final Pattern f10446J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private static final Pattern f10447K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private static final Pattern f10448L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private static e f10449M;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Logger f10450h = Logger.getLogger(e.class.getName());

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Map f10451i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Set f10452j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Set f10453k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Map f10454l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Map f10455m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Map f10456n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Map f10457o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final Pattern f10458p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f10459q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    static final Pattern f10460r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Pattern f10461s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Pattern f10462t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final Pattern f10463u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    static final Pattern f10464v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    static final Pattern f10465w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final Pattern f10466x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f10467y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f10468z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final X5.h f10469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f10470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final U5.b f10471c = U5.c.b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set f10472d = new HashSet(35);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final U5.d f10473e = new U5.d(100);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Set f10474f = new HashSet(320);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Set f10475g = new HashSet();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f10476a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f10477b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f10478c;

        static {
            int[] iArr = new int[d.values().length];
            f10478c = iArr;
            try {
                iArr[d.PREMIUM_RATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10478c[d.TOLL_FREE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10478c[d.MOBILE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10478c[d.FIXED_LINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10478c[d.FIXED_LINE_OR_MOBILE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10478c[d.SHARED_COST.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f10478c[d.VOIP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f10478c[d.PERSONAL_NUMBER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f10478c[d.PAGER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f10478c[d.UAN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f10478c[d.VOICEMAIL.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            int[] iArr2 = new int[c.values().length];
            f10477b = iArr2;
            try {
                iArr2[c.E164.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f10477b[c.INTERNATIONAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f10477b[c.RFC3966.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f10477b[c.NATIONAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused15) {
            }
            int[] iArr3 = new int[j.a.values().length];
            f10476a = iArr3;
            try {
                iArr3[j.a.FROM_NUMBER_WITH_PLUS_SIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f10476a[j.a.FROM_NUMBER_WITH_IDD.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f10476a[j.a.FROM_NUMBER_WITHOUT_PLUS_SIGN.ordinal()] = 3;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f10476a[j.a.FROM_DEFAULT_COUNTRY.ordinal()] = 4;
            } catch (NoSuchFieldError unused19) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public enum b {
        NOT_A_NUMBER,
        NO_MATCH,
        SHORT_NSN_MATCH,
        NSN_MATCH,
        EXACT_MATCH
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public enum c {
        E164,
        INTERNATIONAL,
        NATIONAL,
        RFC3966
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public enum d {
        FIXED_LINE,
        MOBILE,
        FIXED_LINE_OR_MOBILE,
        TOLL_FREE,
        PREMIUM_RATE,
        SHARED_COST,
        VOIP,
        PERSONAL_NUMBER,
        PAGER,
        UAN,
        VOICEMAIL,
        UNKNOWN
    }

    /* JADX INFO: renamed from: T5.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public enum EnumC0109e {
        IS_POSSIBLE,
        IS_POSSIBLE_LOCAL_ONLY,
        INVALID_COUNTRY_CODE,
        TOO_SHORT,
        INVALID_LENGTH,
        TOO_LONG
    }

    static {
        HashMap map = new HashMap();
        map.put(54, "9");
        f10451i = Collections.unmodifiableMap(map);
        HashSet hashSet = new HashSet();
        hashSet.add(86);
        f10452j = Collections.unmodifiableSet(hashSet);
        HashSet hashSet2 = new HashSet();
        hashSet2.add(52);
        hashSet2.add(54);
        hashSet2.add(55);
        hashSet2.add(62);
        hashSet2.addAll(hashSet);
        f10453k = Collections.unmodifiableSet(hashSet2);
        HashMap map2 = new HashMap();
        map2.put('0', '0');
        map2.put('1', '1');
        map2.put('2', '2');
        map2.put('3', '3');
        map2.put('4', '4');
        map2.put('5', '5');
        map2.put('6', '6');
        map2.put('7', '7');
        map2.put('8', '8');
        map2.put('9', '9');
        HashMap map3 = new HashMap(40);
        map3.put('A', '2');
        map3.put('B', '2');
        map3.put('C', '2');
        map3.put('D', '3');
        map3.put('E', '3');
        map3.put('F', '3');
        map3.put('G', '4');
        map3.put('H', '4');
        map3.put('I', '4');
        map3.put('J', '5');
        map3.put('K', '5');
        map3.put('L', '5');
        map3.put('M', '6');
        map3.put('N', '6');
        map3.put('O', '6');
        map3.put('P', '7');
        map3.put('Q', '7');
        map3.put('R', '7');
        map3.put('S', '7');
        map3.put('T', '8');
        map3.put('U', '8');
        map3.put('V', '8');
        map3.put('W', '9');
        map3.put('X', '9');
        map3.put('Y', '9');
        map3.put('Z', '9');
        Map mapUnmodifiableMap = Collections.unmodifiableMap(map3);
        f10455m = mapUnmodifiableMap;
        HashMap map4 = new HashMap(100);
        map4.putAll(mapUnmodifiableMap);
        map4.putAll(map2);
        f10456n = Collections.unmodifiableMap(map4);
        HashMap map5 = new HashMap();
        map5.putAll(map2);
        map5.put('+', '+');
        map5.put('*', '*');
        map5.put('#', '#');
        f10454l = Collections.unmodifiableMap(map5);
        HashMap map6 = new HashMap();
        for (Character ch : mapUnmodifiableMap.keySet()) {
            map6.put(Character.valueOf(Character.toLowerCase(ch.charValue())), ch);
            map6.put(ch, ch);
        }
        map6.putAll(map2);
        map6.put('-', '-');
        map6.put((char) 65293, '-');
        map6.put((char) 8208, '-');
        map6.put((char) 8209, '-');
        map6.put((char) 8210, '-');
        map6.put((char) 8211, '-');
        map6.put((char) 8212, '-');
        map6.put((char) 8213, '-');
        map6.put((char) 8722, '-');
        map6.put('/', '/');
        map6.put((char) 65295, '/');
        map6.put(' ', ' ');
        map6.put((char) 12288, ' ');
        map6.put((char) 8288, ' ');
        map6.put('.', '.');
        map6.put((char) 65294, '.');
        f10457o = Collections.unmodifiableMap(map6);
        f10458p = Pattern.compile("[\\d]+(?:[~⁓∼～][\\d]+)?");
        StringBuilder sb = new StringBuilder();
        Map map7 = f10455m;
        sb.append(Arrays.toString(map7.keySet().toArray()).replaceAll("[, \\[\\]]", PointerEventHelper.POINTER_TYPE_UNKNOWN));
        sb.append(Arrays.toString(map7.keySet().toArray()).toLowerCase().replaceAll("[, \\[\\]]", PointerEventHelper.POINTER_TYPE_UNKNOWN));
        String string = sb.toString();
        f10459q = string;
        f10460r = Pattern.compile("[+＋]+");
        f10461s = Pattern.compile("[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]+");
        f10462t = Pattern.compile("(\\p{Nd})");
        f10463u = Pattern.compile("[+＋\\p{Nd}]");
        f10464v = Pattern.compile("[\\\\/] *x");
        f10465w = Pattern.compile("[[\\P{N}&&\\P{L}]&&[^#]]+$");
        f10466x = Pattern.compile("(?:.*?[A-Za-z]){3}.*");
        String str = "\\p{Nd}{2}|[+＋]*+(?:[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～*]*\\p{Nd}){3,}[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～*" + string + "\\p{Nd}]*";
        f10467y = str;
        String strE = e(true);
        f10468z = strE;
        f10437A = e(false);
        f10438B = Pattern.compile("^\\+(\\p{Nd}|[\\-\\.\\(\\)]?)*\\p{Nd}(\\p{Nd}|[\\-\\.\\(\\)]?)*$");
        String str2 = string + "\\p{Nd}";
        f10439C = str2;
        String str3 = "[" + str2 + "]+((\\-)*[" + str2 + "])*";
        f10440D = str3;
        String str4 = "[" + string + "]+((\\-)*[" + str2 + "])*";
        f10441E = str4;
        String str5 = "^(" + str3 + "\\.)*" + str4 + "\\.?$";
        f10442F = str5;
        f10443G = Pattern.compile(str5);
        f10444H = Pattern.compile("(?:" + strE + ")$", 66);
        f10445I = Pattern.compile(str + "(?:" + strE + ")?", 66);
        f10446J = Pattern.compile("(\\D+)");
        f10447K = Pattern.compile("(\\$\\d)");
        f10448L = Pattern.compile("\\(?\\$1\\)?");
        f10449M = null;
    }

    e(X5.h hVar, Map map) {
        this.f10469a = hVar;
        this.f10470b = map;
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            if (list.size() == 1 && "001".equals(list.get(0))) {
                this.f10475g.add(entry.getKey());
            } else {
                this.f10474f.addAll(list);
            }
        }
        if (this.f10474f.remove("001")) {
            f10450h.log(Level.WARNING, "invalid metadata (country calling code was mapped to the non-geo entity as well as specific region(s))");
        }
        this.f10472d.addAll((Collection) map.get(1));
    }

    private String C(j jVar, List list) {
        String strX = x(jVar);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            g gVarV = v(str);
            if (gVarV.x()) {
                if (this.f10473e.a(gVarV.h()).matcher(strX).lookingAt()) {
                    return str;
                }
            } else if (z(strX, gVarV) != d.UNKNOWN) {
                return str;
            }
        }
        return null;
    }

    private boolean D(int i10) {
        return this.f10470b.containsKey(Integer.valueOf(i10));
    }

    private boolean E(j jVar, j jVar2) {
        String strValueOf = String.valueOf(jVar.f());
        String strValueOf2 = String.valueOf(jVar2.f());
        return strValueOf.endsWith(strValueOf2) || strValueOf2.endsWith(strValueOf);
    }

    private boolean J(String str) {
        if (str == null) {
            return true;
        }
        if (str.length() == 0) {
            return false;
        }
        return f10438B.matcher(str).matches() || f10443G.matcher(str).matches();
    }

    private boolean M(String str) {
        return str != null && this.f10474f.contains(str);
    }

    static boolean N(CharSequence charSequence) {
        if (charSequence.length() < 2) {
            return false;
        }
        return f10445I.matcher(charSequence).matches();
    }

    private void O(j jVar, g gVar, c cVar, StringBuilder sb) {
        if (!jVar.l() || jVar.e().length() <= 0) {
            return;
        }
        if (cVar == c.RFC3966) {
            sb.append(";ext=");
            sb.append(jVar.e());
        } else if (gVar.y()) {
            sb.append(gVar.p());
            sb.append(jVar.e());
        } else {
            sb.append(" ext. ");
            sb.append(jVar.e());
        }
    }

    static StringBuilder T(StringBuilder sb) {
        if (f10466x.matcher(sb).matches()) {
            sb.replace(0, sb.length(), W(sb, f10456n, true));
            return sb;
        }
        sb.replace(0, sb.length(), V(sb));
        return sb;
    }

    static StringBuilder U(CharSequence charSequence, boolean z10) {
        StringBuilder sb = new StringBuilder(charSequence.length());
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            int iDigit = Character.digit(cCharAt, 10);
            if (iDigit != -1) {
                sb.append(iDigit);
            } else if (z10) {
                sb.append(cCharAt);
            }
        }
        return sb;
    }

    public static String V(CharSequence charSequence) {
        return U(charSequence, false).toString();
    }

    private static String W(CharSequence charSequence, Map map, boolean z10) {
        StringBuilder sb = new StringBuilder(charSequence.length());
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            Character ch = (Character) map.get(Character.valueOf(Character.toUpperCase(cCharAt)));
            if (ch != null) {
                sb.append(ch);
            } else if (!z10) {
                sb.append(cCharAt);
            }
        }
        return sb.toString();
    }

    private void Z(CharSequence charSequence, String str, boolean z10, boolean z11, j jVar) throws T5.d {
        int iP;
        if (charSequence == null) {
            throw new T5.d(d.a.NOT_A_NUMBER, "The phone number supplied was null.");
        }
        if (charSequence.length() > 250) {
            throw new T5.d(d.a.TOO_LONG, "The string supplied was too long to parse.");
        }
        StringBuilder sb = new StringBuilder();
        String string = charSequence.toString();
        a(string, sb);
        if (!N(sb)) {
            throw new T5.d(d.a.NOT_A_NUMBER, "The string supplied did not seem to be a phone number.");
        }
        if (z11 && !b(sb, str)) {
            throw new T5.d(d.a.INVALID_COUNTRY_CODE, "Missing or invalid default region.");
        }
        if (z10) {
            jVar.y(string);
        }
        String strQ = Q(sb);
        if (strQ.length() > 0) {
            jVar.t(strQ);
        }
        g gVarV = v(str);
        StringBuilder sb2 = new StringBuilder();
        boolean z12 = z10;
        j jVar2 = jVar;
        try {
            iP = P(sb, gVarV, sb2, z12, jVar2);
        } catch (T5.d e10) {
            Matcher matcher = f10460r.matcher(sb);
            if (e10.a() != d.a.INVALID_COUNTRY_CODE || !matcher.lookingAt()) {
                throw new T5.d(e10.a(), e10.getMessage());
            }
            iP = P(sb.substring(matcher.end()), gVarV, sb2, z12, jVar2);
            gVarV = gVarV;
            sb2 = sb2;
            z12 = z12;
            jVar2 = jVar2;
            if (iP == 0) {
                throw new T5.d(d.a.INVALID_COUNTRY_CODE, "Could not interpret numbers after plus-sign.");
            }
        }
        if (iP != 0) {
            String strA = A(iP);
            if (!strA.equals(str)) {
                gVarV = w(iP, strA);
            }
        } else {
            sb2.append((CharSequence) T(sb));
            if (str != null) {
                jVar2.r(gVarV.a());
            } else if (z12) {
                jVar2.a();
            }
        }
        if (sb2.length() < 2) {
            throw new T5.d(d.a.TOO_SHORT_NSN, "The string supplied is too short to be a phone number.");
        }
        if (gVarV != null) {
            StringBuilder sb3 = new StringBuilder();
            StringBuilder sb4 = new StringBuilder(sb2);
            S(sb4, gVarV, sb3);
            EnumC0109e enumC0109eE0 = e0(sb4, gVarV);
            if (enumC0109eE0 != EnumC0109e.TOO_SHORT && enumC0109eE0 != EnumC0109e.IS_POSSIBLE_LOCAL_ONLY && enumC0109eE0 != EnumC0109e.INVALID_LENGTH) {
                if (z12 && sb3.length() > 0) {
                    jVar2.x(sb3.toString());
                }
                sb2 = sb4;
            }
        }
        int length = sb2.length();
        if (length < 2) {
            throw new T5.d(d.a.TOO_SHORT_NSN, "The string supplied is too short to be a phone number.");
        }
        if (length > 17) {
            throw new T5.d(d.a.TOO_LONG, "The string supplied is too long to be a phone number.");
        }
        d0(sb2, jVar2);
        jVar2.v(Long.parseLong(sb2.toString()));
    }

    private void a(String str, StringBuilder sb) throws T5.d {
        int iIndexOf = str.indexOf(";phone-context=");
        String strL = l(str, iIndexOf);
        if (!J(strL)) {
            throw new T5.d(d.a.NOT_A_NUMBER, "The phone-context value is invalid.");
        }
        if (strL != null) {
            if (strL.charAt(0) == '+') {
                sb.append(strL);
            }
            int iIndexOf2 = str.indexOf("tel:");
            sb.append(str.substring(iIndexOf2 >= 0 ? iIndexOf2 + 4 : 0, iIndexOf));
        } else {
            sb.append(m(str));
        }
        int iIndexOf3 = sb.indexOf(";isub=");
        if (iIndexOf3 > 0) {
            sb.delete(iIndexOf3, sb.length());
        }
    }

    private boolean a0(Pattern pattern, StringBuilder sb) {
        Matcher matcher = pattern.matcher(sb);
        if (!matcher.lookingAt()) {
            return false;
        }
        int iEnd = matcher.end();
        Matcher matcher2 = f10462t.matcher(sb.substring(iEnd));
        if (matcher2.find() && V(matcher2.group(1)).equals("0")) {
            return false;
        }
        sb.delete(0, iEnd);
        return true;
    }

    private boolean b(CharSequence charSequence, String str) {
        if (M(str)) {
            return true;
        }
        return (charSequence == null || charSequence.length() == 0 || !f10460r.matcher(charSequence).lookingAt()) ? false : true;
    }

    private void b0(int i10, c cVar, StringBuilder sb) {
        int i11 = a.f10477b[cVar.ordinal()];
        if (i11 == 1) {
            sb.insert(0, i10).insert(0, '+');
        } else if (i11 == 2) {
            sb.insert(0, " ").insert(0, i10).insert(0, '+');
        } else {
            if (i11 != 3) {
                return;
            }
            sb.insert(0, "-").insert(0, i10).insert(0, '+').insert(0, "tel:");
        }
    }

    static synchronized void c0(e eVar) {
        f10449M = eVar;
    }

    private static j d(j jVar) {
        j jVar2 = new j();
        jVar2.r(jVar.c());
        jVar2.v(jVar.f());
        if (jVar.e().length() > 0) {
            jVar2.t(jVar.e());
        }
        if (jVar.q()) {
            jVar2.u(true);
            jVar2.w(jVar.g());
        }
        return jVar2;
    }

    static void d0(CharSequence charSequence, j jVar) {
        if (charSequence.length() <= 1 || charSequence.charAt(0) != '0') {
            return;
        }
        jVar.u(true);
        int i10 = 1;
        while (i10 < charSequence.length() - 1 && charSequence.charAt(i10) == '0') {
            i10++;
        }
        if (i10 != 1) {
            jVar.w(i10);
        }
    }

    private static String e(boolean z10) {
        String str = (";ext=" + j(20)) + "|" + ("[  \\t,]*(?:e?xt(?:ensi(?:ó?|ó))?n?|ｅ?ｘｔｎ?|доб|anexo)[:\\.．]?[  \\t,-]*" + j(20) + "#?") + "|" + ("[  \\t,]*(?:[xｘ#＃~～]|int|ｉｎｔ)[:\\.．]?[  \\t,-]*" + j(9) + "#?") + "|" + ("[- ]+" + j(6) + "#");
        if (!z10) {
            return str;
        }
        return str + "|" + ("[  \\t]*(?:,{2}|;)[:\\.．]?[  \\t,-]*" + j(15) + "#?") + "|" + ("[  \\t]*(?:,)+[:\\.．]?[  \\t,-]*" + j(9) + "#?");
    }

    private EnumC0109e e0(CharSequence charSequence, g gVar) {
        return f0(charSequence, gVar, d.UNKNOWN);
    }

    public static e f(T5.b bVar) {
        if (bVar != null) {
            return g(new X5.i(V5.a.a().d(), bVar, V5.a.a().c()));
        }
        throw new IllegalArgumentException("metadataLoader could not be null.");
    }

    private EnumC0109e f0(CharSequence charSequence, g gVar, d dVar) {
        i iVarY = y(gVar, dVar);
        List listD = iVarY.d().isEmpty() ? gVar.c().d() : iVarY.d();
        List listF = iVarY.f();
        if (dVar == d.FIXED_LINE_OR_MOBILE) {
            if (!h(y(gVar, d.FIXED_LINE))) {
                return f0(charSequence, gVar, d.MOBILE);
            }
            i iVarY2 = y(gVar, d.MOBILE);
            if (h(iVarY2)) {
                ArrayList arrayList = new ArrayList(listD);
                arrayList.addAll(iVarY2.c() == 0 ? gVar.c().d() : iVarY2.d());
                Collections.sort(arrayList);
                if (listF.isEmpty()) {
                    listF = iVarY2.f();
                } else {
                    ArrayList arrayList2 = new ArrayList(listF);
                    arrayList2.addAll(iVarY2.f());
                    Collections.sort(arrayList2);
                    listF = arrayList2;
                }
                listD = arrayList;
            }
        }
        if (((Integer) listD.get(0)).intValue() == -1) {
            return EnumC0109e.INVALID_LENGTH;
        }
        int length = charSequence.length();
        if (listF.contains(Integer.valueOf(length))) {
            return EnumC0109e.IS_POSSIBLE_LOCAL_ONLY;
        }
        int iIntValue = ((Integer) listD.get(0)).intValue();
        return iIntValue == length ? EnumC0109e.IS_POSSIBLE : iIntValue > length ? EnumC0109e.TOO_SHORT : ((Integer) listD.get(listD.size() - 1)).intValue() < length ? EnumC0109e.TOO_LONG : listD.subList(1, listD.size()).contains(Integer.valueOf(length)) ? EnumC0109e.IS_POSSIBLE : EnumC0109e.INVALID_LENGTH;
    }

    private static e g(X5.h hVar) {
        if (hVar != null) {
            return new e(hVar, T5.a.a());
        }
        throw new IllegalArgumentException("metadataSource could not be null.");
    }

    private static boolean h(i iVar) {
        return (iVar.c() == 1 && iVar.b(0) == -1) ? false : true;
    }

    private static void i(g gVar, String str) {
        if (gVar == null) {
            throw new T5.c(str);
        }
    }

    private static String j(int i10) {
        return "(\\p{Nd}{1," + i10 + "})";
    }

    private String l(String str, int i10) {
        if (i10 == -1) {
            return null;
        }
        int i11 = i10 + 15;
        if (i11 >= str.length()) {
            return PointerEventHelper.POINTER_TYPE_UNKNOWN;
        }
        int iIndexOf = str.indexOf(59, i11);
        return iIndexOf != -1 ? str.substring(i11, iIndexOf) : str.substring(i11);
    }

    static CharSequence m(CharSequence charSequence) {
        Matcher matcher = f10463u.matcher(charSequence);
        if (!matcher.find()) {
            return PointerEventHelper.POINTER_TYPE_UNKNOWN;
        }
        CharSequence charSequenceSubSequence = charSequence.subSequence(matcher.start(), charSequence.length());
        Matcher matcher2 = f10465w.matcher(charSequenceSubSequence);
        if (matcher2.find()) {
            charSequenceSubSequence = charSequenceSubSequence.subSequence(0, matcher2.start());
        }
        Matcher matcher3 = f10464v.matcher(charSequenceSubSequence);
        return matcher3.find() ? charSequenceSubSequence.subSequence(0, matcher3.start()) : charSequenceSubSequence;
    }

    private String p(String str, g gVar, c cVar) {
        return q(str, gVar, cVar, null);
    }

    private String q(String str, g gVar, c cVar, CharSequence charSequence) {
        f fVarC = c((gVar.g().size() == 0 || cVar == c.NATIONAL) ? gVar.m() : gVar.g(), str);
        return fVarC == null ? str : r(str, fVarC, cVar, charSequence);
    }

    private String r(String str, f fVar, c cVar, CharSequence charSequence) {
        String strReplaceAll;
        String format = fVar.getFormat();
        Matcher matcher = this.f10473e.a(fVar.e()).matcher(str);
        c cVar2 = c.NATIONAL;
        if (cVar != cVar2 || charSequence == null || charSequence.length() <= 0 || fVar.a().length() <= 0) {
            String strD = fVar.d();
            strReplaceAll = (cVar != cVar2 || strD == null || strD.length() <= 0) ? matcher.replaceAll(format) : matcher.replaceAll(f10447K.matcher(format).replaceFirst(strD));
        } else {
            strReplaceAll = matcher.replaceAll(f10447K.matcher(format).replaceFirst(fVar.a().replace("$CC", charSequence)));
        }
        if (cVar != c.RFC3966) {
            return strReplaceAll;
        }
        Matcher matcher2 = f10461s.matcher(strReplaceAll);
        if (matcher2.lookingAt()) {
            strReplaceAll = matcher2.replaceFirst(PointerEventHelper.POINTER_TYPE_UNKNOWN);
        }
        return matcher2.reset(strReplaceAll).replaceAll("-");
    }

    private int s(String str) {
        g gVarV = v(str);
        if (gVarV != null) {
            return gVarV.a();
        }
        throw new IllegalArgumentException("Invalid region code: " + str);
    }

    public static synchronized e t() {
        try {
            if (f10449M == null) {
                c0(f(V5.a.a().b()));
            }
        } catch (Throwable th) {
            throw th;
        }
        return f10449M;
    }

    private g w(int i10, String str) {
        return "001".equals(str) ? u(i10) : v(str);
    }

    private d z(String str, g gVar) {
        return !I(str, gVar.c()) ? d.UNKNOWN : I(str, gVar.q()) ? d.PREMIUM_RATE : I(str, gVar.t()) ? d.TOLL_FREE : I(str, gVar.s()) ? d.SHARED_COST : I(str, gVar.w()) ? d.VOIP : I(str, gVar.o()) ? d.PERSONAL_NUMBER : I(str, gVar.n()) ? d.PAGER : I(str, gVar.u()) ? d.UAN : I(str, gVar.v()) ? d.VOICEMAIL : I(str, gVar.b()) ? gVar.r() ? d.FIXED_LINE_OR_MOBILE : I(str, gVar.i()) ? d.FIXED_LINE_OR_MOBILE : d.FIXED_LINE : (gVar.r() || !I(str, gVar.i())) ? d.UNKNOWN : d.MOBILE;
    }

    public String A(int i10) {
        List list = (List) this.f10470b.get(Integer.valueOf(i10));
        return list == null ? "ZZ" : (String) list.get(0);
    }

    public String B(j jVar) {
        int iC = jVar.c();
        List list = (List) this.f10470b.get(Integer.valueOf(iC));
        if (list != null) {
            return list.size() == 1 ? (String) list.get(0) : C(jVar, list);
        }
        f10450h.log(Level.INFO, "Missing/invalid country_code (" + iC + ")");
        return null;
    }

    public b F(j jVar, j jVar2) {
        j jVarD = d(jVar);
        j jVarD2 = d(jVar2);
        if (jVarD.l() && jVarD2.l() && !jVarD.e().equals(jVarD2.e())) {
            return b.NO_MATCH;
        }
        int iC = jVarD.c();
        int iC2 = jVarD2.c();
        if (iC != 0 && iC2 != 0) {
            return jVarD.b(jVarD2) ? b.EXACT_MATCH : (iC == iC2 && E(jVarD, jVarD2)) ? b.SHORT_NSN_MATCH : b.NO_MATCH;
        }
        jVarD.r(iC2);
        return jVarD.b(jVarD2) ? b.NSN_MATCH : E(jVarD, jVarD2) ? b.SHORT_NSN_MATCH : b.NO_MATCH;
    }

    public b G(j jVar, CharSequence charSequence) {
        try {
            return F(jVar, X(charSequence, "ZZ"));
        } catch (T5.d e10) {
            if (e10.a() == d.a.INVALID_COUNTRY_CODE) {
                String strA = A(jVar.c());
                try {
                    if (!strA.equals("ZZ")) {
                        b bVarF = F(jVar, X(charSequence, strA));
                        return bVarF == b.EXACT_MATCH ? b.NSN_MATCH : bVarF;
                    }
                    j jVar2 = new j();
                    try {
                        Z(charSequence, null, false, false, jVar2);
                        return F(jVar, jVar2);
                    } catch (T5.d unused) {
                        return b.NOT_A_NUMBER;
                    }
                } catch (T5.d unused2) {
                    return b.NOT_A_NUMBER;
                }
            }
            return b.NOT_A_NUMBER;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b H(CharSequence charSequence, CharSequence charSequence2) {
        j jVar;
        j jVar2;
        try {
            return G(X(charSequence, "ZZ"), charSequence2);
        } catch (T5.d e10) {
            if (e10.a() == d.a.INVALID_COUNTRY_CODE) {
                try {
                    return G(X(charSequence2, "ZZ"), charSequence);
                } catch (T5.d e11) {
                    if (e11.a() == d.a.INVALID_COUNTRY_CODE) {
                        try {
                            jVar = new j();
                            jVar2 = new j();
                            try {
                                Z(charSequence, null, false, false, jVar);
                            } catch (T5.d unused) {
                            }
                        } catch (T5.d unused2) {
                            return b.NOT_A_NUMBER;
                        }
                        try {
                            Z(charSequence2, null, false, false, jVar2);
                            return F(jVar, jVar2);
                        } catch (T5.d unused3) {
                            return b.NOT_A_NUMBER;
                        }
                    }
                    return b.NOT_A_NUMBER;
                }
            }
            return b.NOT_A_NUMBER;
        }
    }

    boolean I(String str, i iVar) {
        int length = str.length();
        List listD = iVar.d();
        if (listD.size() <= 0 || listD.contains(Integer.valueOf(length))) {
            return this.f10471c.a(str, iVar, false);
        }
        return false;
    }

    public boolean K(j jVar) {
        return L(jVar, B(jVar));
    }

    public boolean L(j jVar, String str) {
        int iC = jVar.c();
        g gVarW = w(iC, str);
        return gVarW != null && ("001".equals(str) || iC == s(str)) && z(x(jVar), gVarW) != d.UNKNOWN;
    }

    int P(CharSequence charSequence, g gVar, StringBuilder sb, boolean z10, j jVar) throws T5.d {
        if (charSequence.length() == 0) {
            return 0;
        }
        StringBuilder sb2 = new StringBuilder(charSequence);
        j.a aVarR = R(sb2, gVar != null ? gVar.e() : "NonMatch");
        if (z10) {
            jVar.s(aVarR);
        }
        if (aVarR != j.a.FROM_DEFAULT_COUNTRY) {
            if (sb2.length() <= 2) {
                throw new T5.d(d.a.TOO_SHORT_AFTER_IDD, "Phone number had an IDD, but after this was not long enough to be a viable phone number.");
            }
            int iK = k(sb2, sb);
            if (iK == 0) {
                throw new T5.d(d.a.INVALID_COUNTRY_CODE, "Country calling code supplied was not recognised.");
            }
            jVar.r(iK);
            return iK;
        }
        if (gVar != null) {
            int iA = gVar.a();
            String strValueOf = String.valueOf(iA);
            String string = sb2.toString();
            if (string.startsWith(strValueOf)) {
                StringBuilder sb3 = new StringBuilder(string.substring(strValueOf.length()));
                i iVarC = gVar.c();
                S(sb3, gVar, null);
                if ((!this.f10471c.a(sb2, iVarC, false) && this.f10471c.a(sb3, iVarC, false)) || e0(sb2, gVar) == EnumC0109e.TOO_LONG) {
                    sb.append((CharSequence) sb3);
                    if (z10) {
                        jVar.s(j.a.FROM_NUMBER_WITHOUT_PLUS_SIGN);
                    }
                    jVar.r(iA);
                    return iA;
                }
            }
        }
        jVar.r(0);
        return 0;
    }

    String Q(StringBuilder sb) {
        Matcher matcher = f10444H.matcher(sb);
        if (!matcher.find() || !N(sb.substring(0, matcher.start()))) {
            return PointerEventHelper.POINTER_TYPE_UNKNOWN;
        }
        int iGroupCount = matcher.groupCount();
        for (int i10 = 1; i10 <= iGroupCount; i10++) {
            if (matcher.group(i10) != null) {
                String strGroup = matcher.group(i10);
                sb.delete(matcher.start(), sb.length());
                return strGroup;
            }
        }
        return PointerEventHelper.POINTER_TYPE_UNKNOWN;
    }

    j.a R(StringBuilder sb, String str) {
        if (sb.length() == 0) {
            return j.a.FROM_DEFAULT_COUNTRY;
        }
        Matcher matcher = f10460r.matcher(sb);
        if (matcher.lookingAt()) {
            sb.delete(0, matcher.end());
            T(sb);
            return j.a.FROM_NUMBER_WITH_PLUS_SIGN;
        }
        Pattern patternA = this.f10473e.a(str);
        T(sb);
        return a0(patternA, sb) ? j.a.FROM_NUMBER_WITH_IDD : j.a.FROM_DEFAULT_COUNTRY;
    }

    boolean S(StringBuilder sb, g gVar, StringBuilder sb2) {
        int length = sb.length();
        String strJ = gVar.j();
        if (length != 0 && strJ.length() != 0) {
            Matcher matcher = this.f10473e.a(strJ).matcher(sb);
            if (matcher.lookingAt()) {
                i iVarC = gVar.c();
                boolean zA = this.f10471c.a(sb, iVarC, false);
                int iGroupCount = matcher.groupCount();
                String strK = gVar.k();
                if (strK == null || strK.length() == 0 || matcher.group(iGroupCount) == null) {
                    if (zA && !this.f10471c.a(sb.substring(matcher.end()), iVarC, false)) {
                        return false;
                    }
                    if (sb2 != null && iGroupCount > 0 && matcher.group(iGroupCount) != null) {
                        sb2.append(matcher.group(1));
                    }
                    sb.delete(0, matcher.end());
                    return true;
                }
                StringBuilder sb3 = new StringBuilder(sb);
                sb3.replace(0, length, matcher.replaceFirst(strK));
                if (zA && !this.f10471c.a(sb3.toString(), iVarC, false)) {
                    return false;
                }
                if (sb2 != null && iGroupCount > 1) {
                    sb2.append(matcher.group(1));
                }
                sb.replace(0, sb.length(), sb3.toString());
                return true;
            }
        }
        return false;
    }

    public j X(CharSequence charSequence, String str) throws T5.d {
        j jVar = new j();
        Y(charSequence, str, jVar);
        return jVar;
    }

    public void Y(CharSequence charSequence, String str, j jVar) throws T5.d {
        Z(charSequence, str, false, true, jVar);
    }

    f c(List list, String str) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            int iC = fVar.c();
            if (iC == 0 || this.f10473e.a(fVar.b(iC - 1)).matcher(str).lookingAt()) {
                if (this.f10473e.a(fVar.e()).matcher(str).matches()) {
                    return fVar;
                }
            }
        }
        return null;
    }

    int k(StringBuilder sb, StringBuilder sb2) {
        if (sb.length() != 0 && sb.charAt(0) != '0') {
            int length = sb.length();
            for (int i10 = 1; i10 <= 3 && i10 <= length; i10++) {
                int i11 = Integer.parseInt(sb.substring(0, i10));
                if (this.f10470b.containsKey(Integer.valueOf(i11))) {
                    sb2.append(sb.substring(i10));
                    return i11;
                }
            }
        }
        return 0;
    }

    public String n(j jVar, c cVar) {
        if (jVar.f() == 0) {
            String strI = jVar.i();
            if (strI.length() > 0 || !jVar.j()) {
                return strI;
            }
        }
        StringBuilder sb = new StringBuilder(20);
        o(jVar, cVar, sb);
        return sb.toString();
    }

    public void o(j jVar, c cVar, StringBuilder sb) {
        sb.setLength(0);
        int iC = jVar.c();
        String strX = x(jVar);
        c cVar2 = c.E164;
        if (cVar == cVar2) {
            sb.append(strX);
            b0(iC, cVar2, sb);
        } else {
            if (!D(iC)) {
                sb.append(strX);
                return;
            }
            g gVarW = w(iC, A(iC));
            sb.append(p(strX, gVarW, cVar));
            O(jVar, gVarW, cVar, sb);
            b0(iC, cVar, sb);
        }
    }

    g u(int i10) {
        if (!this.f10475g.contains(Integer.valueOf(i10))) {
            return null;
        }
        g gVarA = this.f10469a.a(i10);
        i(gVarA, "Missing metadata for country code " + i10);
        return gVarA;
    }

    g v(String str) {
        if (!M(str)) {
            return null;
        }
        g gVarB = this.f10469a.b(str);
        i(gVarB, "Missing metadata for region code " + str);
        return gVarB;
    }

    public String x(j jVar) {
        StringBuilder sb = new StringBuilder();
        if (jVar.q() && jVar.g() > 0) {
            char[] cArr = new char[jVar.g()];
            Arrays.fill(cArr, '0');
            sb.append(new String(cArr));
        }
        sb.append(jVar.f());
        return sb.toString();
    }

    i y(g gVar, d dVar) {
        switch (a.f10478c[dVar.ordinal()]) {
            case 1:
                return gVar.q();
            case 2:
                return gVar.t();
            case 3:
                return gVar.i();
            case 4:
            case 5:
                return gVar.b();
            case 6:
                return gVar.s();
            case 7:
                return gVar.w();
            case 8:
                return gVar.o();
            case 9:
                return gVar.n();
            case 10:
                return gVar.u();
            case 11:
                return gVar.v();
            default:
                return gVar.c();
        }
    }
}
