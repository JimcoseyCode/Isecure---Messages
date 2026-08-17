package O5;

import com.google.gson.n;
import com.google.gson.o;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class j extends n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o f8256b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DateFormat f8257a = new SimpleDateFormat("hh:mm:ss a");

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements o {
        a() {
        }

        @Override // com.google.gson.o
        public n a(com.google.gson.d dVar, R5.a aVar) {
            if (aVar.c() == Time.class) {
                return new j();
            }
            return null;
        }
    }

    @Override // com.google.gson.n
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public synchronized Time b(S5.a aVar) {
        if (aVar.D0() == S5.b.NULL) {
            aVar.u0();
            return null;
        }
        try {
            return new Time(this.f8257a.parse(aVar.y0()).getTime());
        } catch (ParseException e10) {
            throw new com.google.gson.l(e10);
        }
    }

    @Override // com.google.gson.n
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public synchronized void d(S5.c cVar, Time time) {
        cVar.K0(time == null ? null : this.f8257a.format((Date) time));
    }
}
