package expo.modules.kotlin.devtools;

import R8.C1425o;
import com.facebook.react.uimanager.events.PointerEventHelper;
import e9.B;
import e9.t;
import e9.z;
import i7.C2735B;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.AbstractC2854k;
import kotlin.jvm.internal.AbstractC2855l;
import m0.C2892a;
import n7.f;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001c\u0010\t\u001a\u00020\b*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0086H¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Le9/t;", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "toSingleMap", "(Le9/t;)Ljava/util/Map;", "Le9/B;", "Le9/z;", "okHttpClient", "Le9/D;", "await", "(Le9/B;Le9/z;Ln7/f;)Ljava/lang/Object;", "expo-modules-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class OkHttpExtensionsKt {
    public static final Object await(B b10, z zVar, f fVar) {
        C1425o c1425o = new C1425o(AbstractC3016b.c(fVar), 1);
        c1425o.F();
        zVar.a(b10).t0(new OkHttpExtensionsKt$await$2$responseCallback$1(c1425o));
        Object objZ = c1425o.z();
        if (objZ == AbstractC3016b.e()) {
            h.c(fVar);
        }
        return objZ;
    }

    private static final Object await$$forInline(B b10, z zVar, f fVar) {
        AbstractC2854k.c(0);
        C1425o c1425o = new C1425o(AbstractC3016b.c(fVar), 1);
        c1425o.F();
        zVar.a(b10).t0(new OkHttpExtensionsKt$await$2$responseCallback$1(c1425o));
        C2735B c2735b = C2735B.f28704a;
        Object objZ = c1425o.z();
        if (objZ == AbstractC3016b.e()) {
            h.c(fVar);
        }
        AbstractC2854k.c(1);
        return objZ;
    }

    public static final Map<String, String> toSingleMap(t tVar) {
        AbstractC2855l.g(tVar, "<this>");
        C2892a c2892a = new C2892a();
        for (String str : tVar.q()) {
            c2892a.put(str, tVar.o(str));
        }
        return c2892a;
    }
}
