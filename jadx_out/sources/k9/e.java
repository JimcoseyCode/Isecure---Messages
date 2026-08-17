package k9;

import P8.q;
import e9.C2440h;
import e9.D;
import e9.m;
import e9.n;
import e9.t;
import e9.u;
import j7.K;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2855l;
import t9.C3391h;
import t9.k;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final t9.k f29338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final t9.k f29339b;

    static {
        k.a aVar = t9.k.f32603j;
        f29338a = aVar.g("\"\\");
        f29339b = aVar.g("\t ,=");
    }

    public static final List a(t parseChallenges, String headerName) {
        AbstractC2855l.g(parseChallenges, "$this$parseChallenges");
        AbstractC2855l.g(headerName, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = parseChallenges.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (q.x(headerName, parseChallenges.p(i10), true)) {
                try {
                    c(new C3391h().V(parseChallenges.s(i10)), arrayList);
                } catch (EOFException e10) {
                    o9.j.f30594c.g().k("Unable to parse challenge", 5, e10);
                }
            }
        }
        return arrayList;
    }

    public static final boolean b(D promisesBody) {
        AbstractC2855l.g(promisesBody, "$this$promisesBody");
        if (AbstractC2855l.b(promisesBody.D0().l(), "HEAD")) {
            return false;
        }
        int I9 = promisesBody.I();
        return (((I9 >= 100 && I9 < 200) || I9 == 204 || I9 == 304) && f9.c.s(promisesBody) == -1 && !q.x("chunked", D.d0(promisesBody, "Transfer-Encoding", null, 2, null), true)) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0087, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0087, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void c(C3391h c3391h, List list) throws EOFException {
        String strE;
        int I9;
        LinkedHashMap linkedHashMap;
        while (true) {
            String strE2 = null;
            while (true) {
                if (strE2 == null) {
                    g(c3391h);
                    strE2 = e(c3391h);
                    if (strE2 == null) {
                        return;
                    }
                }
                boolean zG = g(c3391h);
                strE = e(c3391h);
                if (strE == null) {
                    if (c3391h.D()) {
                        list.add(new C2440h(strE2, K.i()));
                        return;
                    }
                    return;
                }
                byte b10 = (byte) 61;
                I9 = f9.c.I(c3391h, b10);
                boolean zG2 = g(c3391h);
                if (zG || (!zG2 && !c3391h.D())) {
                    linkedHashMap = new LinkedHashMap();
                    int I10 = I9 + f9.c.I(c3391h, b10);
                    while (true) {
                        if (strE == null) {
                            strE = e(c3391h);
                            if (g(c3391h)) {
                                break;
                            }
                            I10 = f9.c.I(c3391h, b10);
                            if (I10 != 0) {
                                break;
                            }
                            if (I10 > 1 || g(c3391h)) {
                                return;
                            }
                            String strD = h(c3391h, (byte) 34) ? d(c3391h) : e(c3391h);
                            if (strD == null || ((String) linkedHashMap.put(strE, strD)) != null) {
                                return;
                            }
                            if (!g(c3391h) && !c3391h.D()) {
                                return;
                            } else {
                                strE = null;
                            }
                        } else if (I10 != 0) {
                        }
                    }
                }
                list.add(new C2440h(strE2, linkedHashMap));
                strE2 = strE;
            }
            Map mapSingletonMap = Collections.singletonMap(null, strE + q.A("=", I9));
            AbstractC2855l.f(mapSingletonMap, "Collections.singletonMap…ek + \"=\".repeat(eqCount))");
            list.add(new C2440h(strE2, mapSingletonMap));
        }
    }

    private static final String d(C3391h c3391h) throws EOFException {
        byte b10 = (byte) 34;
        if (!(c3391h.readByte() == b10)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        C3391h c3391h2 = new C3391h();
        while (true) {
            long jI0 = c3391h.i0(f29338a);
            if (jI0 == -1) {
                return null;
            }
            if (c3391h.M(jI0) == b10) {
                c3391h2.write(c3391h, jI0);
                c3391h.readByte();
                return c3391h2.q0();
            }
            if (c3391h.size() == jI0 + 1) {
                return null;
            }
            c3391h2.write(c3391h, jI0);
            c3391h.readByte();
            c3391h2.write(c3391h, 1L);
        }
    }

    private static final String e(C3391h c3391h) {
        long jI0 = c3391h.i0(f29339b);
        if (jI0 == -1) {
            jI0 = c3391h.size();
        }
        if (jI0 != 0) {
            return c3391h.N0(jI0);
        }
        return null;
    }

    public static final void f(n receiveHeaders, u url, t headers) {
        AbstractC2855l.g(receiveHeaders, "$this$receiveHeaders");
        AbstractC2855l.g(url, "url");
        AbstractC2855l.g(headers, "headers");
        if (receiveHeaders == n.f26298a) {
            return;
        }
        List listE = m.f26279n.e(url, headers);
        if (listE.isEmpty()) {
            return;
        }
        receiveHeaders.saveFromResponse(url, listE);
    }

    private static final boolean g(C3391h c3391h) throws EOFException {
        boolean z10 = false;
        while (!c3391h.D()) {
            byte bM = c3391h.M(0L);
            if (bM == 9 || bM == 32) {
                c3391h.readByte();
            } else {
                if (bM != 44) {
                    break;
                }
                c3391h.readByte();
                z10 = true;
            }
        }
        return z10;
    }

    private static final boolean h(C3391h c3391h, byte b10) {
        return !c3391h.D() && c3391h.M(0L) == b10;
    }
}
