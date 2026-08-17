package expo.modules.kotlin.devtools;

import P8.q;
import com.facebook.react.uimanager.events.PointerEventHelper;
import e9.D;
import e9.E;
import j7.AbstractC2800q;
import java.io.EOFException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import t9.C3391h;
import t9.j;
import t9.p;
import t9.s;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a#\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\t\"\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f\"\u001a\u0010\u000e\u001a\u00020\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Le9/D;", "response", PointerEventHelper.POINTER_TYPE_UNKNOWN, "byteCount", "Le9/E;", "peekResponseBody", "(Le9/D;J)Le9/E;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "shouldParseBody", "(Le9/D;)Z", PointerEventHelper.POINTER_TYPE_UNKNOWN, "TAG", "Ljava/lang/String;", "Lexpo/modules/kotlin/devtools/ExpoNetworkInspectOkHttpInterceptorsDelegate;", "delegate", "Lexpo/modules/kotlin/devtools/ExpoNetworkInspectOkHttpInterceptorsDelegate;", "getDelegate", "()Lexpo/modules/kotlin/devtools/ExpoNetworkInspectOkHttpInterceptorsDelegate;", "expo-modules-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ExpoNetworkInspectOkHttpInterceptorsKt {
    private static final String TAG = "ExpoNetworkInspector";
    private static final ExpoNetworkInspectOkHttpInterceptorsDelegate delegate = ExpoRequestCdpInterceptor.INSTANCE;

    public static final ExpoNetworkInspectOkHttpInterceptorsDelegate getDelegate() {
        return delegate;
    }

    public static final E peekResponseBody(D response, long j10) throws EOFException {
        AbstractC2855l.g(response, "response");
        E eR = response.r();
        if (eR == null) {
            return null;
        }
        j jVarPeek = eR.source().peek();
        try {
            if (jVarPeek.e0(1 + j10)) {
                return null;
            }
        } catch (IOException unused) {
        }
        if (q.x(D.d0(response, "Content-Encoding", null, 2, null), "gzip", true)) {
            jVarPeek = s.d(new p(jVarPeek));
            jVarPeek.e0(j10);
        }
        C3391h c3391h = new C3391h();
        c3391h.T0(jVarPeek, Math.min(j10, jVarPeek.c().size()));
        return E.Companion.f(c3391h, eR.contentType(), c3391h.size());
    }

    public static /* synthetic */ E peekResponseBody$default(D d10, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = ExpoNetworkInspectOkHttpNetworkInterceptor.MAX_BODY_SIZE;
        }
        return peekResponseBody(d10, j10);
    }

    public static final boolean shouldParseBody(D response) {
        AbstractC2855l.g(response, "response");
        List listM = AbstractC2800q.m("text/event-stream", "text/x-component", "audio", "video");
        String strD0 = D.d0(response, "Content-Type", null, 2, null);
        String str = PointerEventHelper.POINTER_TYPE_UNKNOWN;
        if (strD0 == null) {
            strD0 = PointerEventHelper.POINTER_TYPE_UNKNOWN;
        }
        if (listM == null || !listM.isEmpty()) {
            Iterator it = listM.iterator();
            while (it.hasNext()) {
                if (q.K(strD0, (String) it.next(), false, 2, null)) {
                    return false;
                }
            }
        }
        String strH = response.D0().h("Accept");
        if (strH != null) {
            str = strH;
        }
        if (listM == null || !listM.isEmpty()) {
            Iterator it2 = listM.iterator();
            while (it2.hasNext()) {
                if (q.K(str, (String) it2.next(), false, 2, null)) {
                    return false;
                }
            }
        }
        if (q.x("chunked", D.d0(response, "Transfer-Encoding", null, 2, null), true)) {
            return false;
        }
        String strD02 = D.d0(response, "Content-Length", null, 2, null);
        long j10 = strD02 != null ? Long.parseLong(strD02) : -1L;
        return j10 < 1 || j10 <= ExpoNetworkInspectOkHttpNetworkInterceptor.MAX_BODY_SIZE;
    }
}
