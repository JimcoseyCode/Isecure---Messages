package e9;

import com.facebook.react.uimanager.events.PointerEventHelper;
import e9.m;
import j7.AbstractC2800q;
import j7.K;
import java.io.IOException;
import java.net.CookieHandler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class w implements n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CookieHandler f26344c;

    public w(CookieHandler cookieHandler) {
        AbstractC2855l.g(cookieHandler, "cookieHandler");
        this.f26344c = cookieHandler;
    }

    private final List a(u uVar, String str) {
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            int iN = f9.c.n(str, ";,", i10, length);
            int iM = f9.c.m(str, '=', i10, iN);
            String strV = f9.c.V(str, i10, iM);
            if (!P8.q.K(strV, "$", false, 2, null)) {
                String strV2 = iM < iN ? f9.c.V(str, iM + 1, iN) : PointerEventHelper.POINTER_TYPE_UNKNOWN;
                if (P8.q.K(strV2, "\"", false, 2, null) && P8.q.w(strV2, "\"", false, 2, null)) {
                    strV2 = strV2.substring(1, strV2.length() - 1);
                    AbstractC2855l.f(strV2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                }
                arrayList.add(new m.a().d(strV).e(strV2).b(uVar.h()).a());
            }
            i10 = iN + 1;
        }
        return arrayList;
    }

    @Override // e9.n
    public List loadForRequest(u url) {
        AbstractC2855l.g(url, "url");
        try {
            Map<String, List<String>> cookieHeaders = this.f26344c.get(url.q(), K.i());
            AbstractC2855l.f(cookieHeaders, "cookieHeaders");
            ArrayList arrayList = null;
            for (Map.Entry<String, List<String>> entry : cookieHeaders.entrySet()) {
                String key = entry.getKey();
                List<String> value = entry.getValue();
                if (P8.q.x("Cookie", key, true) || P8.q.x("Cookie2", key, true)) {
                    AbstractC2855l.f(value, "value");
                    if (!value.isEmpty()) {
                        for (String header : value) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            AbstractC2855l.f(header, "header");
                            arrayList.addAll(a(url, header));
                        }
                    }
                }
            }
            if (arrayList == null) {
                return AbstractC2800q.j();
            }
            List listUnmodifiableList = Collections.unmodifiableList(arrayList);
            AbstractC2855l.f(listUnmodifiableList, "Collections.unmodifiableList(cookies)");
            return listUnmodifiableList;
        } catch (IOException e10) {
            o9.j jVarG = o9.j.f30594c.g();
            StringBuilder sb = new StringBuilder();
            sb.append("Loading cookies failed for ");
            u uVarO = url.o("/...");
            AbstractC2855l.d(uVarO);
            sb.append(uVarO);
            jVarG.k(sb.toString(), 5, e10);
            return AbstractC2800q.j();
        }
    }

    @Override // e9.n
    public void saveFromResponse(u url, List cookies) {
        AbstractC2855l.g(url, "url");
        AbstractC2855l.g(cookies, "cookies");
        ArrayList arrayList = new ArrayList();
        Iterator it = cookies.iterator();
        while (it.hasNext()) {
            arrayList.add(f9.b.a((m) it.next(), true));
        }
        try {
            this.f26344c.put(url.q(), K.f(i7.t.a("Set-Cookie", arrayList)));
        } catch (IOException e10) {
            o9.j jVarG = o9.j.f30594c.g();
            StringBuilder sb = new StringBuilder();
            sb.append("Saving cookies failed for ");
            u uVarO = url.o("/...");
            AbstractC2855l.d(uVarO);
            sb.append(uVarO);
            jVarG.k(sb.toString(), 5, e10);
        }
    }
}
