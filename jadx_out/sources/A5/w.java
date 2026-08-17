package A5;

import R0.f;
import android.content.Context;
import android.os.Build;
import com.facebook.react.uimanager.events.PointerEventHelper;
import i7.C2735B;
import java.text.SimpleDateFormat;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import s5.AbstractC3329d;
import s5.C3328c;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
class w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final f.a f82b = R0.i.f("fire-global");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final f.a f83c = R0.i.f("fire-count");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final f.a f84d = R0.i.g("last-used-date");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3328c f85a;

    public w(Context context, String str) {
        this.f85a = new C3328c(context, "FirebaseHeartBeat" + str);
    }

    public static /* synthetic */ C2735B a(long j10, R0.c cVar) {
        cVar.i(f82b, Long.valueOf(j10));
        return null;
    }

    public static /* synthetic */ C2735B b(w wVar, String str, String str2, f.a aVar, R0.c cVar) {
        wVar.getClass();
        f.a aVar2 = f84d;
        if (((String) AbstractC3329d.a(cVar, aVar2, PointerEventHelper.POINTER_TYPE_UNKNOWN)).equals(str)) {
            f.a aVarI = wVar.i(cVar, str);
            if (aVarI == null || aVarI.a().equals(str2)) {
                return null;
            }
            wVar.q(cVar, aVar, str);
            return null;
        }
        f.a aVar3 = f83c;
        long jLongValue = ((Long) AbstractC3329d.a(cVar, aVar3, 0L)).longValue();
        if (jLongValue + 1 == 30) {
            jLongValue = wVar.e(cVar);
        }
        HashSet hashSet = new HashSet((Collection) AbstractC3329d.a(cVar, aVar, new HashSet()));
        hashSet.add(str);
        cVar.i(aVar, hashSet);
        cVar.i(aVar3, Long.valueOf(jLongValue + 1));
        cVar.i(aVar2, str);
        return null;
    }

    public static /* synthetic */ C2735B c(w wVar, R0.c cVar) {
        wVar.getClass();
        long j10 = 0;
        for (Map.Entry entry : cVar.a().entrySet()) {
            if (entry.getValue() instanceof Set) {
                f.a aVar = (f.a) entry.getKey();
                Set set = (Set) entry.getValue();
                String strH = wVar.h(System.currentTimeMillis());
                if (set.contains(strH)) {
                    cVar.i(aVar, r.a(new Object[]{strH}));
                    j10++;
                } else {
                    cVar.h(aVar);
                }
            }
        }
        if (j10 == 0) {
            cVar.h(f83c);
            return null;
        }
        cVar.i(f83c, Long.valueOf(j10));
        return null;
    }

    public static /* synthetic */ C2735B d(w wVar, String str, R0.c cVar) {
        wVar.getClass();
        cVar.i(f84d, str);
        wVar.l(cVar, str);
        return null;
    }

    private synchronized long e(R0.c cVar) {
        long j10;
        try {
            long jLongValue = ((Long) AbstractC3329d.a(cVar, f83c, 0L)).longValue();
            String strA = PointerEventHelper.POINTER_TYPE_UNKNOWN;
            Set hashSet = new HashSet();
            String str = null;
            for (Map.Entry entry : cVar.a().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Set<String> set = (Set) entry.getValue();
                    for (String str2 : set) {
                        if (str == null || str.compareTo(str2) > 0) {
                            strA = ((f.a) entry.getKey()).a();
                            hashSet = set;
                            str = str2;
                        }
                    }
                }
            }
            HashSet hashSet2 = new HashSet(hashSet);
            hashSet2.remove(str);
            cVar.i(R0.i.h(strA), hashSet2);
            j10 = jLongValue - 1;
            cVar.i(f83c, Long.valueOf(j10));
        } catch (Throwable th) {
            throw th;
        }
        return j10;
    }

    private synchronized String h(long j10) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new Date(j10).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j10));
    }

    private synchronized f.a i(R0.c cVar, String str) {
        for (Map.Entry entry : cVar.a().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return R0.i.h(((f.a) entry.getKey()).a());
                    }
                }
            }
        }
        return null;
    }

    private synchronized void l(R0.c cVar, String str) {
        try {
            f.a aVarI = i(cVar, str);
            if (aVarI == null) {
                return;
            }
            HashSet hashSet = new HashSet((Collection) AbstractC3329d.a(cVar, aVarI, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                cVar.h(aVarI);
            } else {
                cVar.i(aVarI, hashSet);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized void q(R0.c cVar, f.a aVar, String str) {
        l(cVar, str);
        HashSet hashSet = new HashSet((Collection) AbstractC3329d.a(cVar, aVar, new HashSet()));
        hashSet.add(str);
        cVar.i(aVar, hashSet);
    }

    synchronized void f() {
        this.f85a.g(new Function1() { // from class: A5.v
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return w.c(this.f81g, (R0.c) obj);
            }
        });
    }

    synchronized List g() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            String strH = h(System.currentTimeMillis());
            for (Map.Entry entry : this.f85a.h().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(strH);
                    if (!hashSet.isEmpty()) {
                        arrayList.add(x.a(((f.a) entry.getKey()).a(), new ArrayList(hashSet)));
                    }
                }
            }
            p(System.currentTimeMillis());
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    synchronized boolean j(long j10, long j11) {
        return h(j10).equals(h(j11));
    }

    synchronized void k() {
        final String strH = h(System.currentTimeMillis());
        this.f85a.g(new Function1() { // from class: A5.s
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return w.d(this.f74g, strH, (R0.c) obj);
            }
        });
    }

    synchronized boolean m(long j10) {
        return n(f82b, j10);
    }

    synchronized boolean n(f.a aVar, long j10) {
        if (j(((Long) this.f85a.j(aVar, -1L)).longValue(), j10)) {
            return false;
        }
        this.f85a.k(aVar, Long.valueOf(j10));
        return true;
    }

    synchronized void o(long j10, final String str) {
        final String strH = h(j10);
        final f.a aVarH = R0.i.h(str);
        this.f85a.g(new Function1() { // from class: A5.u
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return w.b(this.f77g, strH, str, aVarH, (R0.c) obj);
            }
        });
    }

    synchronized void p(final long j10) {
        this.f85a.g(new Function1() { // from class: A5.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return w.a(j10, (R0.c) obj);
            }
        });
    }
}
