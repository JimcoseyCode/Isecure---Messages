package com.facebook.react.devsupport.inspector;

import P8.q;
import com.facebook.react.modules.network.OkHttpClientProvider;
import com.facebook.react.uimanager.events.PointerEventHelper;
import e9.z;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\u0007R\u001a\u0010\f\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/facebook/react/devsupport/inspector/DevSupportHttpClient;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "host", "httpScheme$ReactAndroid_release", "(Ljava/lang/String;)Ljava/lang/String;", "httpScheme", "wsScheme$ReactAndroid_release", "wsScheme", "Le9/z;", "httpClient", "Le9/z;", "getHttpClient$ReactAndroid_release", "()Le9/z;", "websocketClient", "getWebsocketClient$ReactAndroid_release", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DevSupportHttpClient {
    public static final DevSupportHttpClient INSTANCE = new DevSupportHttpClient();
    private static final z httpClient;
    private static final z websocketClient;

    static {
        z.a aVarC = OkHttpClientProvider.getOkHttpClient().C();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        z zVarC = aVarC.f(5L, timeUnit).Q(0L, TimeUnit.MILLISECONDS).P(0L, TimeUnit.MINUTES).c();
        httpClient = zVarC;
        websocketClient = zVarC.C().f(10L, timeUnit).Q(10L, timeUnit).c();
    }

    private DevSupportHttpClient() {
    }

    public final z getHttpClient$ReactAndroid_release() {
        return httpClient;
    }

    public final z getWebsocketClient$ReactAndroid_release() {
        return websocketClient;
    }

    public final String httpScheme$ReactAndroid_release(String host) {
        AbstractC2855l.g(host, "host");
        return q.w(host, ":443", false, 2, null) ? "https" : "http";
    }

    public final String wsScheme$ReactAndroid_release(String host) {
        AbstractC2855l.g(host, "host");
        return q.w(host, ":443", false, 2, null) ? "wss" : "ws";
    }
}
