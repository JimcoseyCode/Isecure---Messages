package m9;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.ViewDefaults;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.interfaces.permissions.PermissionsResponse;
import j7.AbstractC2793j;
import j7.AbstractC2800q;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t9.C3391h;
import t9.F;
import t9.s;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final c[] f29804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f29805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f29806c;

    static {
        d dVar = new d();
        f29806c = dVar;
        c cVar = new c(c.f29799i, PointerEventHelper.POINTER_TYPE_UNKNOWN);
        t9.k kVar = c.f29796f;
        c cVar2 = new c(kVar, "GET");
        c cVar3 = new c(kVar, "POST");
        t9.k kVar2 = c.f29797g;
        c cVar4 = new c(kVar2, "/");
        c cVar5 = new c(kVar2, "/index.html");
        t9.k kVar3 = c.f29798h;
        c cVar6 = new c(kVar3, "http");
        c cVar7 = new c(kVar3, "https");
        t9.k kVar4 = c.f29795e;
        f29804a = new c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, new c(kVar4, "200"), new c(kVar4, "204"), new c(kVar4, "206"), new c(kVar4, "304"), new c(kVar4, "400"), new c(kVar4, "404"), new c(kVar4, "500"), new c("accept-charset", PointerEventHelper.POINTER_TYPE_UNKNOWN), new c("accept-encoding", "gzip, deflate"), new c("accept-language", PointerEventHelper.POINTER_TYPE_UNKNOWN), new c("accept-ranges", PointerEventHelper.POINTER_TYPE_UNKNOWN), new c("accept", PointerEventHelper.POINTER_TYPE_UNKNOWN), new c("access-control-allow-origin", PointerEventHelper.POINTER_TYPE_UNKNOWN), new c("age", PointerEventHelper.POINTER_TYPE_UNKNOWN), new c("allow", PointerEventHelper.POINTER_TYPE_UNKNOWN), new c("authorization", PointerEventHelper.POINTER_TYPE_UNKNOWN), new c("cache-control", PointerEventHelper.POINTER_TYPE_UNKNOWN), new c("content-disposition", PointerEventHelper.POINTER_TYPE_UNKNOWN), new c("content-encoding", PointerEventHelper.POINTER_TYPE_UNKNOWN), new c("content-language", PointerEventHelper.POINTER_TYPE_UNKNOWN), new c("content-length", PointerEventHelper.POINTER_TYPE_UNKNOWN), new c("content-location", PointerEventHelper.POINTER_TYPE_UNKNOWN), new c("content-range", PointerEventHelper.POINTER_TYPE_UNKNOWN), new c("content-type", PointerEventHelper.POINTER_TYPE_UNKNOWN), new c("cookie", PointerEventHelper.POINTER_TYPE_UNKNOWN), new c("date", PointerEventHelper.POINTER_TYPE_UNKNOWN), new c("etag", PointerEventHelper.POINTER_TYPE_UNKNOWN), new c("expect", PointerEventHelper.POINTER_TYPE_UNKNOWN), new c(PermissionsResponse.EXPIRES_KEY, PointerEventHelper.POINTER_TYPE_UNKNOWN), new c("from", PointerEventHelper.POINTER_TYPE_UNKNOWN), new c("host", PointerEventHelper.POINTER_TYPE_UNKNOWN), new c("if-match", PointerEventHelper.POINTER_TYPE_UNKNOWN), new c("if-modified-since", PointerEventHelper.POINTER_TYPE_UNKNOWN), new c("if-none-match", PointerEventHelper.POINTER_TYPE_UNKNOWN), new c("if-range", PointerEventHelper.POINTER_TYPE_UNKNOWN), new c("if-unmodified-since", PointerEventHelper.POINTER_TYPE_UNKNOWN), new c("last-modified", PointerEventHelper.POINTER_TYPE_UNKNOWN), new c("link", PointerEventHelper.POINTER_TYPE_UNKNOWN), new c("location", PointerEventHelper.POINTER_TYPE_UNKNOWN), new c("max-forwards", PointerEventHelper.POINTER_TYPE_UNKNOWN), new c("proxy-authenticate", PointerEventHelper.POINTER_TYPE_UNKNOWN), new c("proxy-authorization", PointerEventHelper.POINTER_TYPE_UNKNOWN), new c("range", PointerEventHelper.POINTER_TYPE_UNKNOWN), new c("referer", PointerEventHelper.POINTER_TYPE_UNKNOWN), new c("refresh", PointerEventHelper.POINTER_TYPE_UNKNOWN), new c("retry-after", PointerEventHelper.POINTER_TYPE_UNKNOWN), new c("server", PointerEventHelper.POINTER_TYPE_UNKNOWN), new c("set-cookie", PointerEventHelper.POINTER_TYPE_UNKNOWN), new c("strict-transport-security", PointerEventHelper.POINTER_TYPE_UNKNOWN), new c("transfer-encoding", PointerEventHelper.POINTER_TYPE_UNKNOWN), new c("user-agent", PointerEventHelper.POINTER_TYPE_UNKNOWN), new c("vary", PointerEventHelper.POINTER_TYPE_UNKNOWN), new c("via", PointerEventHelper.POINTER_TYPE_UNKNOWN), new c("www-authenticate", PointerEventHelper.POINTER_TYPE_UNKNOWN)};
        f29805b = dVar.d();
    }

    private d() {
    }

    private final Map d() {
        c[] cVarArr = f29804a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(cVarArr.length);
        int length = cVarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            c[] cVarArr2 = f29804a;
            if (!linkedHashMap.containsKey(cVarArr2[i10].f29802b)) {
                linkedHashMap.put(cVarArr2[i10].f29802b, Integer.valueOf(i10));
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        AbstractC2855l.f(mapUnmodifiableMap, "Collections.unmodifiableMap(result)");
        return mapUnmodifiableMap;
    }

    public final t9.k a(t9.k name) throws IOException {
        AbstractC2855l.g(name, "name");
        int iE = name.E();
        for (int i10 = 0; i10 < iE; i10++) {
            byte b10 = (byte) 65;
            byte b11 = (byte) 90;
            byte bP = name.p(i10);
            if (b10 <= bP && b11 >= bP) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + name.I());
            }
        }
        return name;
    }

    public final Map b() {
        return f29805b;
    }

    public final c[] c() {
        return f29804a;
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f29807a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final t9.j f29808b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public c[] f29809c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f29810d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f29811e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f29812f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f29813g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f29814h;

        public a(F source, int i10, int i11) {
            AbstractC2855l.g(source, "source");
            this.f29813g = i10;
            this.f29814h = i11;
            this.f29807a = new ArrayList();
            this.f29808b = s.d(source);
            this.f29809c = new c[8];
            this.f29810d = r2.length - 1;
        }

        private final void a() {
            int i10 = this.f29814h;
            int i11 = this.f29812f;
            if (i10 < i11) {
                if (i10 == 0) {
                    b();
                } else {
                    d(i11 - i10);
                }
            }
        }

        private final void b() {
            AbstractC2793j.r(this.f29809c, null, 0, 0, 6, null);
            this.f29810d = this.f29809c.length - 1;
            this.f29811e = 0;
            this.f29812f = 0;
        }

        private final int c(int i10) {
            return this.f29810d + 1 + i10;
        }

        private final int d(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f29809c.length;
                while (true) {
                    length--;
                    i11 = this.f29810d;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    c cVar = this.f29809c[length];
                    AbstractC2855l.d(cVar);
                    int i13 = cVar.f29801a;
                    i10 -= i13;
                    this.f29812f -= i13;
                    this.f29811e--;
                    i12++;
                }
                c[] cVarArr = this.f29809c;
                System.arraycopy(cVarArr, i11 + 1, cVarArr, i11 + 1 + i12, this.f29811e);
                this.f29810d += i12;
            }
            return i12;
        }

        private final t9.k f(int i10) throws IOException {
            if (h(i10)) {
                return d.f29806c.c()[i10].f29802b;
            }
            int iC = c(i10 - d.f29806c.c().length);
            if (iC >= 0) {
                c[] cVarArr = this.f29809c;
                if (iC < cVarArr.length) {
                    c cVar = cVarArr[iC];
                    AbstractC2855l.d(cVar);
                    return cVar.f29802b;
                }
            }
            throw new IOException("Header index too large " + (i10 + 1));
        }

        private final void g(int i10, c cVar) {
            this.f29807a.add(cVar);
            int i11 = cVar.f29801a;
            if (i10 != -1) {
                c cVar2 = this.f29809c[c(i10)];
                AbstractC2855l.d(cVar2);
                i11 -= cVar2.f29801a;
            }
            int i12 = this.f29814h;
            if (i11 > i12) {
                b();
                return;
            }
            int iD = d((this.f29812f + i11) - i12);
            if (i10 == -1) {
                int i13 = this.f29811e + 1;
                c[] cVarArr = this.f29809c;
                if (i13 > cVarArr.length) {
                    c[] cVarArr2 = new c[cVarArr.length * 2];
                    System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                    this.f29810d = this.f29809c.length - 1;
                    this.f29809c = cVarArr2;
                }
                int i14 = this.f29810d;
                this.f29810d = i14 - 1;
                this.f29809c[i14] = cVar;
                this.f29811e++;
            } else {
                this.f29809c[i10 + c(i10) + iD] = cVar;
            }
            this.f29812f += i11;
        }

        private final boolean h(int i10) {
            return i10 >= 0 && i10 <= d.f29806c.c().length - 1;
        }

        private final int i() {
            return f9.c.b(this.f29808b.readByte(), 255);
        }

        private final void l(int i10) throws IOException {
            if (h(i10)) {
                this.f29807a.add(d.f29806c.c()[i10]);
                return;
            }
            int iC = c(i10 - d.f29806c.c().length);
            if (iC >= 0) {
                c[] cVarArr = this.f29809c;
                if (iC < cVarArr.length) {
                    List list = this.f29807a;
                    c cVar = cVarArr[iC];
                    AbstractC2855l.d(cVar);
                    list.add(cVar);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i10 + 1));
        }

        private final void n(int i10) {
            g(-1, new c(f(i10), j()));
        }

        private final void o() {
            g(-1, new c(d.f29806c.a(j()), j()));
        }

        private final void p(int i10) throws IOException {
            this.f29807a.add(new c(f(i10), j()));
        }

        private final void q() throws IOException {
            this.f29807a.add(new c(d.f29806c.a(j()), j()));
        }

        public final List e() {
            List listP0 = AbstractC2800q.P0(this.f29807a);
            this.f29807a.clear();
            return listP0;
        }

        public final t9.k j() {
            int i10 = i();
            boolean z10 = (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128;
            long jM = m(i10, 127);
            if (!z10) {
                return this.f29808b.t(jM);
            }
            C3391h c3391h = new C3391h();
            k.f29998d.b(this.f29808b, jM, c3391h);
            return c3391h.c0();
        }

        public final void k() throws IOException {
            while (!this.f29808b.D()) {
                int iB = f9.c.b(this.f29808b.readByte(), 255);
                if (iB == 128) {
                    throw new IOException("index == 0");
                }
                if ((iB & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128) {
                    l(m(iB, 127) - 1);
                } else if (iB == 64) {
                    o();
                } else if ((iB & 64) == 64) {
                    n(m(iB, 63) - 1);
                } else if ((iB & 32) == 32) {
                    int iM = m(iB, 31);
                    this.f29814h = iM;
                    if (iM < 0 || iM > this.f29813g) {
                        throw new IOException("Invalid dynamic table size update " + this.f29814h);
                    }
                    a();
                } else if (iB == 16 || iB == 0) {
                    q();
                } else {
                    p(m(iB, 15) - 1);
                }
            }
        }

        public final int m(int i10, int i11) {
            int i12 = i10 & i11;
            if (i12 < i11) {
                return i12;
            }
            int i13 = 0;
            while (true) {
                int i14 = i();
                if ((i14 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 0) {
                    return i11 + (i14 << i13);
                }
                i11 += (i14 & 127) << i13;
                i13 += 7;
            }
        }

        public /* synthetic */ a(F f10, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(f10, i10, (i12 & 4) != 0 ? i10 : i11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f29815a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f29816b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f29817c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public c[] f29818d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f29819e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f29820f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f29821g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f29822h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final boolean f29823i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final C3391h f29824j;

        public b(int i10, boolean z10, C3391h out) {
            AbstractC2855l.g(out, "out");
            this.f29822h = i10;
            this.f29823i = z10;
            this.f29824j = out;
            this.f29815a = ViewDefaults.NUMBER_OF_LINES;
            this.f29817c = i10;
            this.f29818d = new c[8];
            this.f29819e = r2.length - 1;
        }

        private final void a() {
            int i10 = this.f29817c;
            int i11 = this.f29821g;
            if (i10 < i11) {
                if (i10 == 0) {
                    b();
                } else {
                    c(i11 - i10);
                }
            }
        }

        private final void b() {
            AbstractC2793j.r(this.f29818d, null, 0, 0, 6, null);
            this.f29819e = this.f29818d.length - 1;
            this.f29820f = 0;
            this.f29821g = 0;
        }

        private final int c(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f29818d.length;
                while (true) {
                    length--;
                    i11 = this.f29819e;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    c cVar = this.f29818d[length];
                    AbstractC2855l.d(cVar);
                    i10 -= cVar.f29801a;
                    int i13 = this.f29821g;
                    c cVar2 = this.f29818d[length];
                    AbstractC2855l.d(cVar2);
                    this.f29821g = i13 - cVar2.f29801a;
                    this.f29820f--;
                    i12++;
                }
                c[] cVarArr = this.f29818d;
                System.arraycopy(cVarArr, i11 + 1, cVarArr, i11 + 1 + i12, this.f29820f);
                c[] cVarArr2 = this.f29818d;
                int i14 = this.f29819e;
                Arrays.fill(cVarArr2, i14 + 1, i14 + 1 + i12, (Object) null);
                this.f29819e += i12;
            }
            return i12;
        }

        private final void d(c cVar) {
            int i10 = cVar.f29801a;
            int i11 = this.f29817c;
            if (i10 > i11) {
                b();
                return;
            }
            c((this.f29821g + i10) - i11);
            int i12 = this.f29820f + 1;
            c[] cVarArr = this.f29818d;
            if (i12 > cVarArr.length) {
                c[] cVarArr2 = new c[cVarArr.length * 2];
                System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                this.f29819e = this.f29818d.length - 1;
                this.f29818d = cVarArr2;
            }
            int i13 = this.f29819e;
            this.f29819e = i13 - 1;
            this.f29818d[i13] = cVar;
            this.f29820f++;
            this.f29821g += i10;
        }

        public final void e(int i10) {
            this.f29822h = i10;
            int iMin = Math.min(i10, 16384);
            int i11 = this.f29817c;
            if (i11 == iMin) {
                return;
            }
            if (iMin < i11) {
                this.f29815a = Math.min(this.f29815a, iMin);
            }
            this.f29816b = true;
            this.f29817c = iMin;
            a();
        }

        public final void f(t9.k data) {
            AbstractC2855l.g(data, "data");
            if (this.f29823i) {
                k kVar = k.f29998d;
                if (kVar.d(data) < data.E()) {
                    C3391h c3391h = new C3391h();
                    kVar.c(data, c3391h);
                    t9.k kVarC0 = c3391h.c0();
                    h(kVarC0.E(), 127, IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                    this.f29824j.S(kVarC0);
                    return;
                }
            }
            h(data.E(), 127, 0);
            this.f29824j.S(data);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void g(List headerBlock) {
            int length;
            int length2;
            AbstractC2855l.g(headerBlock, "headerBlock");
            if (this.f29816b) {
                int i10 = this.f29815a;
                if (i10 < this.f29817c) {
                    h(i10, 31, 32);
                }
                this.f29816b = false;
                this.f29815a = ViewDefaults.NUMBER_OF_LINES;
                h(this.f29817c, 31, 32);
            }
            int size = headerBlock.size();
            for (int i11 = 0; i11 < size; i11++) {
                c cVar = (c) headerBlock.get(i11);
                t9.k kVarG = cVar.f29802b.G();
                t9.k kVar = cVar.f29803c;
                d dVar = d.f29806c;
                Integer num = (Integer) dVar.b().get(kVarG);
                if (num != null) {
                    int iIntValue = num.intValue();
                    length2 = iIntValue + 1;
                    if (2 <= length2 && 7 >= length2) {
                        if (AbstractC2855l.b(dVar.c()[iIntValue].f29803c, kVar)) {
                            length = length2;
                        } else if (AbstractC2855l.b(dVar.c()[length2].f29803c, kVar)) {
                            length = length2;
                            length2 = iIntValue + 2;
                        } else {
                            length = length2;
                            length2 = -1;
                        }
                    }
                } else {
                    length = -1;
                    length2 = -1;
                }
                if (length2 == -1) {
                    int i12 = this.f29819e + 1;
                    int length3 = this.f29818d.length;
                    while (true) {
                        if (i12 >= length3) {
                            break;
                        }
                        c cVar2 = this.f29818d[i12];
                        AbstractC2855l.d(cVar2);
                        if (AbstractC2855l.b(cVar2.f29802b, kVarG)) {
                            c cVar3 = this.f29818d[i12];
                            AbstractC2855l.d(cVar3);
                            if (AbstractC2855l.b(cVar3.f29803c, kVar)) {
                                length2 = d.f29806c.c().length + (i12 - this.f29819e);
                                break;
                            } else if (length == -1) {
                                length = (i12 - this.f29819e) + d.f29806c.c().length;
                            }
                        }
                        i12++;
                    }
                }
                if (length2 != -1) {
                    h(length2, 127, IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                } else if (length == -1) {
                    this.f29824j.writeByte(64);
                    f(kVarG);
                    f(kVar);
                    d(cVar);
                } else if (!kVarG.F(c.f29794d) || AbstractC2855l.b(c.f29799i, kVarG)) {
                    h(length, 63, 64);
                    f(kVar);
                    d(cVar);
                } else {
                    h(length, 15, 0);
                    f(kVar);
                }
            }
        }

        public final void h(int i10, int i11, int i12) {
            if (i10 < i11) {
                this.f29824j.writeByte(i10 | i12);
                return;
            }
            this.f29824j.writeByte(i12 | i11);
            int i13 = i10 - i11;
            while (i13 >= 128) {
                this.f29824j.writeByte(128 | (i13 & 127));
                i13 >>>= 7;
            }
            this.f29824j.writeByte(i13);
        }

        public /* synthetic */ b(int i10, boolean z10, C3391h c3391h, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? 4096 : i10, (i11 & 2) != 0 ? true : z10, c3391h);
        }
    }
}
