package R0;

import N0.A;
import N0.C1304d;
import Q0.f;
import Q0.g;
import Q0.h;
import R0.f;
import androidx.datastore.preferences.protobuf.AbstractC1713f;
import androidx.datastore.preferences.protobuf.AbstractC1726t;
import i7.C2735B;
import i7.C2750m;
import j7.AbstractC2800q;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f9949a = new h();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9950a;

        static {
            int[] iArr = new int[h.b.values().length];
            try {
                iArr[h.b.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h.b.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[h.b.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[h.b.INTEGER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[h.b.LONG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[h.b.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[h.b.STRING_SET.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[h.b.BYTES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[h.b.VALUE_NOT_SET.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f9950a = iArr;
        }
    }

    private h() {
    }

    private final void d(String str, Q0.h hVar, c cVar) throws C1304d {
        h.b bVarG0 = hVar.g0();
        switch (bVarG0 == null ? -1 : a.f9950a[bVarG0.ordinal()]) {
            case -1:
                throw new C1304d("Value case is null.", null, 2, null);
            case 0:
            default:
                throw new C2750m();
            case 1:
                cVar.i(i.a(str), Boolean.valueOf(hVar.W()));
                return;
            case 2:
                cVar.i(i.d(str), Float.valueOf(hVar.b0()));
                return;
            case 3:
                cVar.i(i.c(str), Double.valueOf(hVar.a0()));
                return;
            case 4:
                cVar.i(i.e(str), Integer.valueOf(hVar.c0()));
                return;
            case 5:
                cVar.i(i.f(str), Long.valueOf(hVar.d0()));
                return;
            case 6:
                f.a aVarG = i.g(str);
                String strE0 = hVar.e0();
                AbstractC2855l.f(strE0, "value.string");
                cVar.i(aVarG, strE0);
                return;
            case 7:
                f.a aVarH = i.h(str);
                List listS = hVar.f0().S();
                AbstractC2855l.f(listS, "value.stringSet.stringsList");
                cVar.i(aVarH, AbstractC2800q.T0(listS));
                return;
            case 8:
                f.a aVarB = i.b(str);
                byte[] bArrA = hVar.Y().A();
                AbstractC2855l.f(bArrA, "value.bytes.toByteArray()");
                cVar.i(aVarB, bArrA);
                return;
            case 9:
                throw new C1304d("Value not set.", null, 2, null);
        }
    }

    private final Q0.h f(Object obj) {
        if (obj instanceof Boolean) {
            AbstractC1726t abstractC1726tI = Q0.h.h0().q(((Boolean) obj).booleanValue()).i();
            AbstractC2855l.f(abstractC1726tI, "newBuilder().setBoolean(value).build()");
            return (Q0.h) abstractC1726tI;
        }
        if (obj instanceof Float) {
            AbstractC1726t abstractC1726tI2 = Q0.h.h0().u(((Number) obj).floatValue()).i();
            AbstractC2855l.f(abstractC1726tI2, "newBuilder().setFloat(value).build()");
            return (Q0.h) abstractC1726tI2;
        }
        if (obj instanceof Double) {
            AbstractC1726t abstractC1726tI3 = Q0.h.h0().t(((Number) obj).doubleValue()).i();
            AbstractC2855l.f(abstractC1726tI3, "newBuilder().setDouble(value).build()");
            return (Q0.h) abstractC1726tI3;
        }
        if (obj instanceof Integer) {
            AbstractC1726t abstractC1726tI4 = Q0.h.h0().v(((Number) obj).intValue()).i();
            AbstractC2855l.f(abstractC1726tI4, "newBuilder().setInteger(value).build()");
            return (Q0.h) abstractC1726tI4;
        }
        if (obj instanceof Long) {
            AbstractC1726t abstractC1726tI5 = Q0.h.h0().w(((Number) obj).longValue()).i();
            AbstractC2855l.f(abstractC1726tI5, "newBuilder().setLong(value).build()");
            return (Q0.h) abstractC1726tI5;
        }
        if (obj instanceof String) {
            AbstractC1726t abstractC1726tI6 = Q0.h.h0().x((String) obj).i();
            AbstractC2855l.f(abstractC1726tI6, "newBuilder().setString(value).build()");
            return (Q0.h) abstractC1726tI6;
        }
        if (obj instanceof Set) {
            h.a aVarH0 = Q0.h.h0();
            g.a aVarT = Q0.g.T();
            AbstractC2855l.e(obj, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
            AbstractC1726t abstractC1726tI7 = aVarH0.y(aVarT.q((Set) obj)).i();
            AbstractC2855l.f(abstractC1726tI7, "newBuilder()\n           …                 .build()");
            return (Q0.h) abstractC1726tI7;
        }
        if (obj instanceof byte[]) {
            AbstractC1726t abstractC1726tI8 = Q0.h.h0().r(AbstractC1713f.r((byte[]) obj)).i();
            AbstractC2855l.f(abstractC1726tI8, "newBuilder().setBytes(By….copyFrom(value)).build()");
            return (Q0.h) abstractC1726tI8;
        }
        throw new IllegalStateException("PreferencesSerializer does not support type: " + obj.getClass().getName());
    }

    @Override // N0.A
    public Object b(InputStream inputStream, n7.f fVar) throws C1304d {
        Q0.f fVarA = Q0.d.f8991a.a(inputStream);
        c cVarB = g.b(new f.b[0]);
        Map mapQ = fVarA.Q();
        AbstractC2855l.f(mapQ, "preferencesProto.preferencesMap");
        for (Map.Entry entry : mapQ.entrySet()) {
            String name = (String) entry.getKey();
            Q0.h value = (Q0.h) entry.getValue();
            h hVar = f9949a;
            AbstractC2855l.f(name, "name");
            AbstractC2855l.f(value, "value");
            hVar.d(name, value, cVarB);
        }
        return cVarB.d();
    }

    @Override // N0.A
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public f a() {
        return g.a();
    }

    @Override // N0.A
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Object c(f fVar, OutputStream outputStream, n7.f fVar2) {
        Map mapA = fVar.a();
        f.a aVarT = Q0.f.T();
        for (Map.Entry entry : mapA.entrySet()) {
            aVarT.q(((f.a) entry.getKey()).a(), f(entry.getValue()));
        }
        ((Q0.f) aVarT.i()).h(outputStream);
        return C2735B.f28704a;
    }
}
