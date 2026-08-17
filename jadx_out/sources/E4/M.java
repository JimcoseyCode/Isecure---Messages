package e4;

import W3.i;
import Z3.a;
import Z3.c;
import a4.AbstractC1595a;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import f4.C2612a;
import f4.InterfaceC2613b;
import g4.InterfaceC2673a;
import h4.AbstractC2704a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.inject.Provider;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class M implements InterfaceC2405d, InterfaceC2613b, InterfaceC2404c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final U3.c f25839l = U3.c.b("proto");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final U f25840g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final InterfaceC2673a f25841h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final InterfaceC2673a f25842i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final AbstractC2406e f25843j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Provider f25844k;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    interface b {
        Object apply(Object obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f25845a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final String f25846b;

        private c(String str, String str2) {
            this.f25845a = str;
            this.f25846b = str2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    interface d {
        Object a();
    }

    M(InterfaceC2673a interfaceC2673a, InterfaceC2673a interfaceC2673a2, AbstractC2406e abstractC2406e, U u10, Provider provider) {
        this.f25840g = u10;
        this.f25841h = interfaceC2673a;
        this.f25842i = interfaceC2673a2;
        this.f25843j = abstractC2406e;
        this.f25844k = provider;
    }

    public static /* synthetic */ List A(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(W3.o.a().b(cursor.getString(1)).d(AbstractC2704a.b(cursor.getInt(2))).c(d1(cursor.getString(3))).a());
        }
        return arrayList;
    }

    public static /* synthetic */ Object A0(Map map, Cursor cursor) {
        while (true) {
            if (!cursor.moveToNext()) {
                return null;
            }
            long j10 = cursor.getLong(0);
            Set hashSet = (Set) map.get(Long.valueOf(j10));
            if (hashSet == null) {
                hashSet = new HashSet();
                map.put(Long.valueOf(j10), hashSet);
            }
            hashSet.add(new c(cursor.getString(1), cursor.getString(2)));
        }
    }

    public static /* synthetic */ Object B(M m10, Cursor cursor) {
        m10.getClass();
        while (cursor.moveToNext()) {
            m10.k(cursor.getInt(0), c.b.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    public static /* synthetic */ Integer D0(final M m10, long j10, SQLiteDatabase sQLiteDatabase) {
        m10.getClass();
        String[] strArr = {String.valueOf(j10)};
        j1(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new b() { // from class: e4.s
            @Override // e4.M.b
            public final Object apply(Object obj) {
                return M.J(this.f25894a, (Cursor) obj);
            }
        });
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    public static /* synthetic */ SQLiteDatabase I(Throwable th) {
        throw new C2612a("Timed out while trying to open db.", th);
    }

    public static /* synthetic */ Object J(M m10, Cursor cursor) {
        m10.getClass();
        while (cursor.moveToNext()) {
            m10.k(cursor.getInt(0), c.b.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    public static /* synthetic */ Object J0(M m10, List list, W3.o oVar, Cursor cursor) {
        m10.getClass();
        while (cursor.moveToNext()) {
            long j10 = cursor.getLong(0);
            boolean z10 = cursor.getInt(7) != 0;
            i.a aVarK = W3.i.a().j(cursor.getString(1)).i(cursor.getLong(2)).k(cursor.getLong(3));
            if (z10) {
                aVarK.h(new W3.h(h1(cursor.getString(4)), cursor.getBlob(5)));
            } else {
                aVarK.h(new W3.h(h1(cursor.getString(4)), m10.f1(j10)));
            }
            if (!cursor.isNull(6)) {
                aVarK.g(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(AbstractC2412k.a(j10, oVar, aVarK.d()));
        }
        return null;
    }

    public static /* synthetic */ Object K0(M m10, SQLiteDatabase sQLiteDatabase) {
        m10.getClass();
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + m10.f25841h.a()).execute();
        return null;
    }

    public static /* synthetic */ Z3.a L0(final M m10, String str, final Map map, final a.C0139a c0139a, SQLiteDatabase sQLiteDatabase) {
        m10.getClass();
        return (Z3.a) j1(sQLiteDatabase.rawQuery(str, new String[0]), new b() { // from class: e4.A
            @Override // e4.M.b
            public final Object apply(Object obj) {
                return M.i0(this.f25825a, map, c0139a, (Cursor) obj);
            }
        });
    }

    public static /* synthetic */ Object M(final M m10, String str, String str2, SQLiteDatabase sQLiteDatabase) {
        m10.getClass();
        sQLiteDatabase.compileStatement(str).execute();
        j1(sQLiteDatabase.rawQuery(str2, null), new b() { // from class: e4.v
            @Override // e4.M.b
            public final Object apply(Object obj) {
                return M.B(this.f25899a, (Cursor) obj);
            }
        });
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    public static /* synthetic */ Long M0(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    public static /* synthetic */ Z3.f N0(final long j10, SQLiteDatabase sQLiteDatabase) {
        return (Z3.f) j1(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new b() { // from class: e4.D
            @Override // e4.M.b
            public final Object apply(Object obj) {
                return M.r(j10, (Cursor) obj);
            }
        });
    }

    private c.b O0(int i10) {
        c.b bVar = c.b.REASON_UNKNOWN;
        if (i10 == bVar.a()) {
            return bVar;
        }
        c.b bVar2 = c.b.MESSAGE_TOO_OLD;
        if (i10 == bVar2.a()) {
            return bVar2;
        }
        c.b bVar3 = c.b.CACHE_FULL;
        if (i10 == bVar3.a()) {
            return bVar3;
        }
        c.b bVar4 = c.b.PAYLOAD_TOO_BIG;
        if (i10 == bVar4.a()) {
            return bVar4;
        }
        c.b bVar5 = c.b.MAX_RETRIES_REACHED;
        if (i10 == bVar5.a()) {
            return bVar5;
        }
        c.b bVar6 = c.b.INVALID_PAYLOD;
        if (i10 == bVar6.a()) {
            return bVar6;
        }
        c.b bVar7 = c.b.SERVER_ERROR;
        if (i10 == bVar7.a()) {
            return bVar7;
        }
        AbstractC1595a.b("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i10));
        return bVar;
    }

    private void P0(final SQLiteDatabase sQLiteDatabase) {
        g1(new d() { // from class: e4.l
            @Override // e4.M.d
            public final Object a() {
                return M.t0(sQLiteDatabase);
            }
        }, new b() { // from class: e4.w
            @Override // e4.M.b
            public final Object apply(Object obj) {
                return M.w0((Throwable) obj);
            }
        });
    }

    private long Q0(SQLiteDatabase sQLiteDatabase, W3.o oVar) {
        Long lX0 = X0(sQLiteDatabase, oVar);
        if (lX0 != null) {
            return lX0.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", oVar.b());
        contentValues.put("priority", Integer.valueOf(AbstractC2704a.a(oVar.d())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (oVar.c() != null) {
            contentValues.put("extras", Base64.encodeToString(oVar.c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    private Z3.b T0() {
        return Z3.b.b().b(Z3.e.c().b(R0()).c(AbstractC2406e.f25878a.f()).a()).a();
    }

    private long U0() {
        return S0().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    private long V0() {
        return S0().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    public static /* synthetic */ Boolean W(M m10, W3.o oVar, SQLiteDatabase sQLiteDatabase) {
        Long lX0 = m10.X0(sQLiteDatabase, oVar);
        return lX0 == null ? Boolean.FALSE : (Boolean) j1(m10.S0().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lX0.toString()}), new b() { // from class: e4.u
            @Override // e4.M.b
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            }
        });
    }

    private Z3.f W0() {
        final long jA = this.f25841h.a();
        return (Z3.f) Y0(new b() { // from class: e4.C
            @Override // e4.M.b
            public final Object apply(Object obj) {
                return M.N0(jA, (SQLiteDatabase) obj);
            }
        });
    }

    public static /* synthetic */ Object X(long j10, W3.o oVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j10));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{oVar.b(), String.valueOf(AbstractC2704a.a(oVar.d()))}) < 1) {
            contentValues.put("backend_name", oVar.b());
            contentValues.put("priority", Integer.valueOf(AbstractC2704a.a(oVar.d())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    private Long X0(SQLiteDatabase sQLiteDatabase, W3.o oVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(oVar.b(), String.valueOf(AbstractC2704a.a(oVar.d()))));
        if (oVar.c() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(oVar.c(), 0));
        } else {
            sb.append(" and extras is null");
        }
        return (Long) j1(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new b() { // from class: e4.n
            @Override // e4.M.b
            public final Object apply(Object obj) {
                return M.u0((Cursor) obj);
            }
        });
    }

    private boolean Z0() {
        return U0() * V0() >= this.f25843j.f();
    }

    private List a1(List list, Map map) {
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            AbstractC2412k abstractC2412k = (AbstractC2412k) listIterator.next();
            if (map.containsKey(Long.valueOf(abstractC2412k.c()))) {
                i.a aVarL = abstractC2412k.b().l();
                for (c cVar : (Set) map.get(Long.valueOf(abstractC2412k.c()))) {
                    aVarL.c(cVar.f25845a, cVar.f25846b);
                }
                listIterator.set(AbstractC2412k.a(abstractC2412k.c(), abstractC2412k.d(), aVarL.d()));
            }
        }
        return list;
    }

    private List b1(SQLiteDatabase sQLiteDatabase, final W3.o oVar, int i10) {
        final ArrayList arrayList = new ArrayList();
        Long lX0 = X0(sQLiteDatabase, oVar);
        if (lX0 == null) {
            return arrayList;
        }
        j1(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{lX0.toString()}, null, null, null, String.valueOf(i10)), new b() { // from class: e4.x
            @Override // e4.M.b
            public final Object apply(Object obj) {
                return M.J0(this.f25900a, arrayList, oVar, (Cursor) obj);
            }
        });
        return arrayList;
    }

    private Map c1(SQLiteDatabase sQLiteDatabase, List list) {
        final HashMap map = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i10 = 0; i10 < list.size(); i10++) {
            sb.append(((AbstractC2412k) list.get(i10)).c());
            if (i10 < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        j1(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null), new b() { // from class: e4.z
            @Override // e4.M.b
            public final Object apply(Object obj) {
                return M.A0(map, (Cursor) obj);
            }
        });
        return map;
    }

    public static /* synthetic */ byte[] d0(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int length = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            length += blob.length;
        }
        byte[] bArr = new byte[length];
        int length2 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            byte[] bArr2 = (byte[]) arrayList.get(i10);
            System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
            length2 += bArr2.length;
        }
        return bArr;
    }

    private static byte[] d1(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    private void e1(a.C0139a c0139a, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            c0139a.a(Z3.d.c().c((String) entry.getKey()).b((List) entry.getValue()).a());
        }
    }

    private byte[] f1(long j10) {
        return (byte[]) j1(S0().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j10)}, null, null, "sequence_num"), new b() { // from class: e4.B
            @Override // e4.M.b
            public final Object apply(Object obj) {
                return M.d0((Cursor) obj);
            }
        });
    }

    public static /* synthetic */ List g0(SQLiteDatabase sQLiteDatabase) {
        return (List) j1(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new b() { // from class: e4.K
            @Override // e4.M.b
            public final Object apply(Object obj) {
                return M.A((Cursor) obj);
            }
        });
    }

    private Object g1(d dVar, b bVar) {
        long jA = this.f25842i.a();
        while (true) {
            try {
                return dVar.a();
            } catch (SQLiteDatabaseLockedException e10) {
                if (this.f25842i.a() >= ((long) this.f25843j.b()) + jA) {
                    return bVar.apply(e10);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    private static U3.c h1(String str) {
        return str == null ? f25839l : U3.c.b(str);
    }

    public static /* synthetic */ Z3.a i0(M m10, Map map, a.C0139a c0139a, Cursor cursor) {
        m10.getClass();
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            c.b bVarO0 = m10.O0(cursor.getInt(1));
            long j10 = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(Z3.c.c().c(bVarO0).b(j10).a());
        }
        m10.e1(c0139a, map);
        c0139a.e(m10.W0());
        c0139a.d(m10.T0());
        c0139a.c((String) m10.f25844k.get());
        return c0139a.b();
    }

    private static String i1(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((AbstractC2412k) it.next()).c());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    static Object j1(Cursor cursor, b bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public static /* synthetic */ Long l0(M m10, W3.i iVar, W3.o oVar, SQLiteDatabase sQLiteDatabase) {
        if (m10.Z0()) {
            m10.k(1L, c.b.CACHE_FULL, iVar.j());
            return -1L;
        }
        long jQ0 = m10.Q0(sQLiteDatabase, oVar);
        int iE = m10.f25843j.e();
        byte[] bArrA = iVar.e().a();
        boolean z10 = bArrA.length <= iE;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(jQ0));
        contentValues.put("transport_name", iVar.j());
        contentValues.put("timestamp_ms", Long.valueOf(iVar.f()));
        contentValues.put("uptime_ms", Long.valueOf(iVar.k()));
        contentValues.put("payload_encoding", iVar.e().b().a());
        contentValues.put("code", iVar.d());
        contentValues.put("num_attempts", (Integer) 0);
        contentValues.put("inline", Boolean.valueOf(z10));
        contentValues.put("payload", z10 ? bArrA : new byte[0]);
        long jInsert = sQLiteDatabase.insert("events", null, contentValues);
        if (!z10) {
            int iCeil = (int) Math.ceil(((double) bArrA.length) / ((double) iE));
            for (int i10 = 1; i10 <= iCeil; i10++) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrA, (i10 - 1) * iE, Math.min(i10 * iE, bArrA.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(jInsert));
                contentValues2.put("sequence_num", Integer.valueOf(i10));
                contentValues2.put("bytes", bArrCopyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues2);
            }
        }
        for (Map.Entry entry : iVar.i().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(jInsert));
            contentValues3.put("name", (String) entry.getKey());
            contentValues3.put("value", (String) entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        return Long.valueOf(jInsert);
    }

    public static /* synthetic */ Z3.f r(long j10, Cursor cursor) {
        cursor.moveToNext();
        return Z3.f.c().c(cursor.getLong(0)).b(j10).a();
    }

    public static /* synthetic */ List s(M m10, W3.o oVar, SQLiteDatabase sQLiteDatabase) {
        List listB1 = m10.b1(sQLiteDatabase, oVar, m10.f25843j.d());
        for (U3.e eVar : U3.e.values()) {
            if (eVar != oVar.d()) {
                int iD = m10.f25843j.d() - listB1.size();
                if (iD <= 0) {
                    break;
                }
                listB1.addAll(m10.b1(sQLiteDatabase, oVar.f(eVar), iD));
            }
        }
        return m10.a1(listB1, m10.c1(sQLiteDatabase, listB1));
    }

    public static /* synthetic */ Object t0(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        return null;
    }

    public static /* synthetic */ Long u0(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return null;
    }

    public static /* synthetic */ Object w0(Throwable th) {
        throw new C2612a("Timed out while trying to acquire the lock.", th);
    }

    public static /* synthetic */ Object y0(String str, c.b bVar, long j10, SQLiteDatabase sQLiteDatabase) {
        if (((Boolean) j1(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.a())}), new b() { // from class: e4.y
            @Override // e4.M.b
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Cursor) obj).getCount() > 0);
            }
        })).booleanValue()) {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j10 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.a())});
            return null;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("log_source", str);
        contentValues.put("reason", Integer.valueOf(bVar.a()));
        contentValues.put("events_dropped_count", Long.valueOf(j10));
        sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        return null;
    }

    @Override // e4.InterfaceC2405d
    public Iterable H() {
        return (Iterable) Y0(new b() { // from class: e4.G
            @Override // e4.M.b
            public final Object apply(Object obj) {
                return M.g0((SQLiteDatabase) obj);
            }
        });
    }

    @Override // e4.InterfaceC2405d
    public Iterable N(final W3.o oVar) {
        return (Iterable) Y0(new b() { // from class: e4.m
            @Override // e4.M.b
            public final Object apply(Object obj) {
                return M.s(this.f25884a, oVar, (SQLiteDatabase) obj);
            }
        });
    }

    long R0() {
        return U0() * V0();
    }

    SQLiteDatabase S0() {
        final U u10 = this.f25840g;
        Objects.requireNonNull(u10);
        return (SQLiteDatabase) g1(new d() { // from class: e4.E
            @Override // e4.M.d
            public final Object a() {
                return u10.getWritableDatabase();
            }
        }, new b() { // from class: e4.F
            @Override // e4.M.b
            public final Object apply(Object obj) {
                return M.I((Throwable) obj);
            }
        });
    }

    Object Y0(b bVar) {
        SQLiteDatabase sQLiteDatabaseS0 = S0();
        sQLiteDatabaseS0.beginTransaction();
        try {
            Object objApply = bVar.apply(sQLiteDatabaseS0);
            sQLiteDatabaseS0.setTransactionSuccessful();
            return objApply;
        } finally {
            sQLiteDatabaseS0.endTransaction();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f25840g.close();
    }

    @Override // e4.InterfaceC2404c
    public void d() {
        Y0(new b() { // from class: e4.q
            @Override // e4.M.b
            public final Object apply(Object obj) {
                return M.K0(this.f25890a, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // f4.InterfaceC2613b
    public Object e(InterfaceC2613b.a aVar) {
        SQLiteDatabase sQLiteDatabaseS0 = S0();
        P0(sQLiteDatabaseS0);
        try {
            Object objExecute = aVar.execute();
            sQLiteDatabaseS0.setTransactionSuccessful();
            return objExecute;
        } finally {
            sQLiteDatabaseS0.endTransaction();
        }
    }

    @Override // e4.InterfaceC2405d
    public int f() {
        final long jA = this.f25841h.a() - this.f25843j.c();
        return ((Integer) Y0(new b() { // from class: e4.J
            @Override // e4.M.b
            public final Object apply(Object obj) {
                return M.D0(this.f25834a, jA, (SQLiteDatabase) obj);
            }
        })).intValue();
    }

    @Override // e4.InterfaceC2404c
    public void k(final long j10, final c.b bVar, final String str) {
        Y0(new b() { // from class: e4.r
            @Override // e4.M.b
            public final Object apply(Object obj) {
                return M.y0(str, bVar, j10, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // e4.InterfaceC2404c
    public Z3.a m() {
        final a.C0139a c0139aE = Z3.a.e();
        final HashMap map = new HashMap();
        final String str = "SELECT log_source, reason, events_dropped_count FROM log_event_dropped";
        return (Z3.a) Y0(new b() { // from class: e4.t
            @Override // e4.M.b
            public final Object apply(Object obj) {
                return M.L0(this.f25895a, str, map, c0139aE, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // e4.InterfaceC2405d
    public AbstractC2412k n(final W3.o oVar, final W3.i iVar) {
        AbstractC1595a.c("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", oVar.d(), iVar.j(), oVar.b());
        long jLongValue = ((Long) Y0(new b() { // from class: e4.I
            @Override // e4.M.b
            public final Object apply(Object obj) {
                return M.l0(this.f25831a, iVar, oVar, (SQLiteDatabase) obj);
            }
        })).longValue();
        if (jLongValue < 1) {
            return null;
        }
        return AbstractC2412k.a(jLongValue, oVar, iVar);
    }

    @Override // e4.InterfaceC2405d
    public void q(Iterable iterable) {
        if (iterable.iterator().hasNext()) {
            S0().compileStatement("DELETE FROM events WHERE _id in " + i1(iterable)).execute();
        }
    }

    @Override // e4.InterfaceC2405d
    public boolean v0(final W3.o oVar) {
        return ((Boolean) Y0(new b() { // from class: e4.o
            @Override // e4.M.b
            public final Object apply(Object obj) {
                return M.W(this.f25886a, oVar, (SQLiteDatabase) obj);
            }
        })).booleanValue();
    }

    @Override // e4.InterfaceC2405d
    public void x0(final W3.o oVar, final long j10) {
        Y0(new b() { // from class: e4.p
            @Override // e4.M.b
            public final Object apply(Object obj) {
                return M.X(j10, oVar, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // e4.InterfaceC2405d
    public long z(W3.o oVar) {
        return ((Long) j1(S0().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{oVar.b(), String.valueOf(AbstractC2704a.a(oVar.d()))}), new b() { // from class: e4.H
            @Override // e4.M.b
            public final Object apply(Object obj) {
                return M.M0((Cursor) obj);
            }
        })).longValue();
    }

    @Override // e4.InterfaceC2405d
    public void z0(Iterable iterable) {
        if (iterable.iterator().hasNext()) {
            final String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + i1(iterable);
            final String str2 = "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name";
            Y0(new b() { // from class: e4.L
                @Override // e4.M.b
                public final Object apply(Object obj) {
                    return M.M(this.f25836a, str, str2, (SQLiteDatabase) obj);
                }
            });
        }
    }
}
