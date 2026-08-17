package O5;

import com.google.gson.n;
import com.google.gson.o;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o f8220b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f8221a;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements o {
        a() {
        }

        @Override // com.google.gson.o
        public n a(com.google.gson.d dVar, R5.a aVar) {
            if (aVar.c() == Date.class) {
                return new c();
            }
            return null;
        }
    }

    public c() {
        ArrayList arrayList = new ArrayList();
        this.f8221a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (N5.e.e()) {
            arrayList.add(N5.j.c(2, 2));
        }
    }

    private synchronized Date e(String str) {
        Iterator it = this.f8221a.iterator();
        while (it.hasNext()) {
            try {
                return ((DateFormat) it.next()).parse(str);
            } catch (ParseException unused) {
            }
        }
        try {
            return P5.a.c(str, new ParsePosition(0));
        } catch (ParseException e10) {
            throw new com.google.gson.l(str, e10);
        }
    }

    @Override // com.google.gson.n
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Date b(S5.a aVar) throws IOException {
        if (aVar.D0() != S5.b.NULL) {
            return e(aVar.y0());
        }
        aVar.u0();
        return null;
    }

    @Override // com.google.gson.n
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public synchronized void d(S5.c cVar, Date date) {
        if (date == null) {
            cVar.X();
        } else {
            cVar.K0(((DateFormat) this.f8221a.get(0)).format(date));
        }
    }
}
