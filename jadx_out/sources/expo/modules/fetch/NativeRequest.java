package expo.modules.fetch;

import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.PointerEventHelper;
import e9.B;
import e9.C;
import e9.InterfaceC2437e;
import e9.n;
import e9.t;
import e9.x;
import e9.z;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.sharedobjects.SharedObject;
import j7.AbstractC2793j;
import java.net.URL;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lexpo/modules/fetch/NativeRequest;", "Lexpo/modules/kotlin/sharedobjects/SharedObject;", "Lexpo/modules/kotlin/AppContext;", "appContext", "Lexpo/modules/fetch/NativeResponse;", "response", "<init>", "(Lexpo/modules/kotlin/AppContext;Lexpo/modules/fetch/NativeResponse;)V", "Le9/z;", "client", "Ljava/net/URL;", "url", "Lexpo/modules/fetch/NativeRequestInit;", "requestInit", PointerEventHelper.POINTER_TYPE_UNKNOWN, "requestBody", "Li7/B;", ViewProps.START, "(Le9/z;Ljava/net/URL;Lexpo/modules/fetch/NativeRequestInit;[B)V", "cancel", "()V", "Lexpo/modules/fetch/NativeResponse;", "getResponse$expo_release", "()Lexpo/modules/fetch/NativeResponse;", "Lexpo/modules/fetch/RequestHolder;", "requestHolder", "Lexpo/modules/fetch/RequestHolder;", "Le9/e;", "task", "Le9/e;", "expo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NativeRequest extends SharedObject {
    private final RequestHolder requestHolder;
    private final NativeResponse response;
    private InterfaceC2437e task;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeRequest(AppContext appContext, NativeResponse response) {
        super(appContext);
        AbstractC2855l.g(appContext, "appContext");
        AbstractC2855l.g(response, "response");
        this.response = response;
        this.requestHolder = new RequestHolder(null);
    }

    public final void cancel() {
        InterfaceC2437e interfaceC2437e = this.task;
        if (interfaceC2437e == null) {
            return;
        }
        interfaceC2437e.cancel();
        this.response.emitRequestCanceled();
    }

    /* JADX INFO: renamed from: getResponse$expo_release, reason: from getter */
    public final NativeResponse getResponse() {
        return this.response;
    }

    public final void start(z client, URL url, NativeRequestInit requestInit, byte[] requestBody) {
        C cK;
        AbstractC2855l.g(client, "client");
        AbstractC2855l.g(url, "url");
        AbstractC2855l.g(requestInit, "requestInit");
        z.a aVarC = client.C();
        if (requestInit.getCredentials() != NativeRequestCredentials.INCLUDE) {
            aVarC.g(n.f26298a);
        }
        if (requestInit.getRedirect() != NativeRequestRedirect.FOLLOW) {
            aVarC.i(false);
            aVarC.j(false);
        }
        z zVarC = aVarC.c();
        this.response.setRedirectMode(requestInit.getRedirect());
        t headers = RequestUtilsKt.toHeaders(requestInit.getHeaders());
        String strO = headers.o("Content-Type");
        x xVarC = strO != null ? x.f26347g.c(strO) : null;
        if (requestBody == null || (cK = C.a.k(C.Companion, requestBody, xVarC, 0, 0, 6, null)) == null) {
            cK = AbstractC2793j.B(NativeRequestKt.getMETHODS_REQUIRING_BODY(), requestInit.getMethod()) ? C.a.k(C.Companion, new byte[]{0}, xVarC, 0, 0, 6, null) : null;
        }
        B b10 = new B.a().f(headers).g(requestInit.getMethod(), cK).n(OkHttpFileUrlInterceptor.INSTANCE.handleFileUrl(url)).b();
        this.requestHolder.setRequest(b10);
        InterfaceC2437e interfaceC2437eA = zVarC.a(b10);
        this.task = interfaceC2437eA;
        if (interfaceC2437eA != null) {
            interfaceC2437eA.t0(this.response);
        }
        this.response.onStarted();
    }
}
