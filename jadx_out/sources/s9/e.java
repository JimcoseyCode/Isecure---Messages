package s9;

import P8.q;
import e9.t;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f32398g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f32399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f32400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f32401c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f32402d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f32403e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f32404f;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        private a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x008c A[PHI: r7 r9
          0x008c: PHI (r7v7 java.lang.Integer) = (r7v5 java.lang.Integer), (r7v5 java.lang.Integer), (r7v8 java.lang.Integer) binds: [B:47:0x00bb, B:44:0x00b2, B:27:0x008a] A[DONT_GENERATE, DONT_INLINE]
          0x008c: PHI (r9v8 java.lang.Integer) = (r9v5 java.lang.Integer), (r9v6 java.lang.Integer), (r9v5 java.lang.Integer) binds: [B:47:0x00bb, B:44:0x00b2, B:27:0x008a] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final e a(t responseHeaders) {
            AbstractC2855l.g(responseHeaders, "responseHeaders");
            int size = responseHeaders.size();
            boolean z10 = false;
            Integer num = null;
            boolean z11 = false;
            Integer num2 = null;
            boolean z12 = false;
            boolean z13 = false;
            for (int i10 = 0; i10 < size; i10++) {
                if (q.x(responseHeaders.p(i10), "Sec-WebSocket-Extensions", true)) {
                    String strS = responseHeaders.s(i10);
                    int i11 = 0;
                    while (i11 < strS.length()) {
                        int i12 = i11;
                        int iO = f9.c.o(strS, ',', i12, 0, 4, null);
                        int iM = f9.c.m(strS, ';', i12, iO);
                        String strV = f9.c.V(strS, i12, iM);
                        int i13 = iM + 1;
                        if (q.x(strV, "permessage-deflate", true)) {
                            if (z10) {
                                z13 = true;
                            }
                            while (i13 < iO) {
                                int iM2 = f9.c.m(strS, ';', i13, iO);
                                int iM3 = f9.c.m(strS, '=', i13, iM2);
                                String strV2 = f9.c.V(strS, i13, iM3);
                                String strY0 = iM3 < iM2 ? q.y0(f9.c.V(strS, iM3 + 1, iM2), "\"") : null;
                                int i14 = iM2 + 1;
                                if (q.x(strV2, "client_max_window_bits", true)) {
                                    if (num != null) {
                                        z13 = true;
                                    }
                                    Integer numN = strY0 != null ? q.n(strY0) : null;
                                    num = numN;
                                    if (numN == null) {
                                        z13 = true;
                                    }
                                } else if (q.x(strV2, "client_no_context_takeover", true)) {
                                    if (z11) {
                                        z13 = true;
                                    }
                                    if (strY0 != null) {
                                        z13 = true;
                                    }
                                    z11 = true;
                                } else if (q.x(strV2, "server_max_window_bits", true)) {
                                    if (num2 != null) {
                                        z13 = true;
                                    }
                                    Integer numN2 = strY0 != null ? q.n(strY0) : null;
                                    num2 = numN2;
                                    if (numN2 == null) {
                                    }
                                } else if (q.x(strV2, "server_no_context_takeover", true)) {
                                    if (z12) {
                                        z13 = true;
                                    }
                                    if (strY0 != null) {
                                        z13 = true;
                                    }
                                    z12 = true;
                                }
                                i13 = i14;
                            }
                            z10 = true;
                        } else {
                            z13 = true;
                        }
                        i11 = i13;
                    }
                }
            }
            return new e(z10, num, z11, num2, z12, z13);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public e(boolean z10, Integer num, boolean z11, Integer num2, boolean z12, boolean z13) {
        this.f32399a = z10;
        this.f32400b = num;
        this.f32401c = z11;
        this.f32402d = num2;
        this.f32403e = z12;
        this.f32404f = z13;
    }

    public final boolean a(boolean z10) {
        return z10 ? this.f32401c : this.f32403e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f32399a == eVar.f32399a && AbstractC2855l.b(this.f32400b, eVar.f32400b) && this.f32401c == eVar.f32401c && AbstractC2855l.b(this.f32402d, eVar.f32402d) && this.f32403e == eVar.f32403e && this.f32404f == eVar.f32404f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v9 */
    public int hashCode() {
        boolean z10 = this.f32399a;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int i10 = r02 * 31;
        Integer num = this.f32400b;
        int iHashCode = (i10 + (num != null ? num.hashCode() : 0)) * 31;
        boolean z11 = this.f32401c;
        ?? r22 = z11;
        if (z11) {
            r22 = 1;
        }
        int i11 = (iHashCode + r22) * 31;
        Integer num2 = this.f32402d;
        int iHashCode2 = (i11 + (num2 != null ? num2.hashCode() : 0)) * 31;
        boolean z12 = this.f32403e;
        ?? r23 = z12;
        if (z12) {
            r23 = 1;
        }
        int i12 = (iHashCode2 + r23) * 31;
        boolean z13 = this.f32404f;
        return i12 + (z13 ? 1 : z13);
    }

    public String toString() {
        return "WebSocketExtensions(perMessageDeflate=" + this.f32399a + ", clientMaxWindowBits=" + this.f32400b + ", clientNoContextTakeover=" + this.f32401c + ", serverMaxWindowBits=" + this.f32402d + ", serverNoContextTakeover=" + this.f32403e + ", unknownValues=" + this.f32404f + ")";
    }
}
