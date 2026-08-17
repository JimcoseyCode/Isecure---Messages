package expo.modules.kotlin.devtools;

import e9.B;
import e9.D;
import e9.E;
import e9.v;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lexpo/modules/kotlin/devtools/ExpoNetworkInspectOkHttpNetworkInterceptor;", "Le9/v;", "<init>", "()V", "Le9/v$a;", "chain", "Le9/D;", "intercept", "(Le9/v$a;)Le9/D;", "Companion", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ExpoNetworkInspectOkHttpNetworkInterceptor implements v {
    public static final long MAX_BODY_SIZE = 1048576;

    @Override // e9.v
    public D intercept(v.a chain) {
        String strValueOf;
        AbstractC2855l.g(chain, "chain");
        B bD = chain.d();
        D dA = chain.a(bD);
        try {
            RedirectResponse redirectResponse = (RedirectResponse) bD.o(RedirectResponse.class);
            if (redirectResponse == null || (strValueOf = redirectResponse.getRequestId()) == null) {
                strValueOf = String.valueOf(bD.hashCode());
            }
            ExpoNetworkInspectOkHttpInterceptorsKt.getDelegate().willSendRequest(strValueOf, bD, redirectResponse != null ? redirectResponse.getPriorResponse() : null);
            if (dA.i0()) {
                RedirectResponse redirectResponse2 = (RedirectResponse) dA.D0().o(RedirectResponse.class);
                if (redirectResponse2 != null) {
                    redirectResponse2.setRequestId(strValueOf);
                    redirectResponse2.setPriorResponse(dA);
                    return dA;
                }
            } else {
                E ePeekResponseBody$default = ExpoNetworkInspectOkHttpInterceptorsKt.shouldParseBody(dA) ? ExpoNetworkInspectOkHttpInterceptorsKt.peekResponseBody$default(dA, 0L, 2, null) : null;
                ExpoNetworkInspectOkHttpInterceptorsKt.getDelegate().didReceiveResponse(strValueOf, bD, dA, ePeekResponseBody$default);
                if (ePeekResponseBody$default != null) {
                    ePeekResponseBody$default.close();
                }
            }
        } catch (Exception unused) {
        }
        return dA;
    }
}
