package com.facebook.react.modules.network;

import android.content.Context;
import com.facebook.react.uimanager.events.PointerEventHelper;
import e9.C2435c;
import e9.z;
import java.io.File;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\f\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0011\u0010\u0013J\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0011\u0010\u0016R$\u0010\u0017\u001a\u0004\u0018\u00010\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b\"\u0004\b\u001a\u0010\u001bR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010\b¨\u0006 "}, d2 = {"Lcom/facebook/react/modules/network/OkHttpClientProvider;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "Lcom/facebook/react/modules/network/OkHttpClientFactory;", "factory", "Li7/B;", "setOkHttpClientFactory", "(Lcom/facebook/react/modules/network/OkHttpClientFactory;)V", "Le9/z;", "getOkHttpClient", "()Le9/z;", "createClient", "Landroid/content/Context;", "context", "(Landroid/content/Context;)Le9/z;", "Le9/z$a;", "createClientBuilder", "()Le9/z$a;", "(Landroid/content/Context;)Le9/z$a;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "cacheSize", "(Landroid/content/Context;I)Le9/z$a;", "client", "Le9/z;", "getClient$ReactAndroid_release", "setClient$ReactAndroid_release", "(Le9/z;)V", "Lcom/facebook/react/modules/network/OkHttpClientFactory;", "getFactory$ReactAndroid_release", "()Lcom/facebook/react/modules/network/OkHttpClientFactory;", "setFactory$ReactAndroid_release", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OkHttpClientProvider {
    public static final OkHttpClientProvider INSTANCE = new OkHttpClientProvider();
    private static z client;
    private static OkHttpClientFactory factory;

    private OkHttpClientProvider() {
    }

    public static final z createClient() {
        z zVarCreateNewNetworkModuleClient;
        OkHttpClientFactory okHttpClientFactory = factory;
        return (okHttpClientFactory == null || (zVarCreateNewNetworkModuleClient = okHttpClientFactory.createNewNetworkModuleClient()) == null) ? createClientBuilder().c() : zVarCreateNewNetworkModuleClient;
    }

    public static final z.a createClientBuilder() {
        z.a aVar = new z.a();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return aVar.f(0L, timeUnit).P(0L, timeUnit).Q(0L, timeUnit).g(new ReactCookieJarContainer());
    }

    public static final z getOkHttpClient() {
        z zVar = client;
        if (zVar != null) {
            return zVar;
        }
        z zVarCreateClient = createClient();
        client = zVarCreateClient;
        return zVarCreateClient;
    }

    public static final void setOkHttpClientFactory(OkHttpClientFactory factory2) {
        factory = factory2;
    }

    public final z getClient$ReactAndroid_release() {
        return client;
    }

    public final OkHttpClientFactory getFactory$ReactAndroid_release() {
        return factory;
    }

    public final void setClient$ReactAndroid_release(z zVar) {
        client = zVar;
    }

    public final void setFactory$ReactAndroid_release(OkHttpClientFactory okHttpClientFactory) {
        factory = okHttpClientFactory;
    }

    public static final z createClient(Context context) {
        z zVarCreateNewNetworkModuleClient;
        AbstractC2855l.g(context, "context");
        OkHttpClientFactory okHttpClientFactory = factory;
        return (okHttpClientFactory == null || (zVarCreateNewNetworkModuleClient = okHttpClientFactory.createNewNetworkModuleClient()) == null) ? createClientBuilder(context).c() : zVarCreateNewNetworkModuleClient;
    }

    public static final z.a createClientBuilder(Context context) {
        AbstractC2855l.g(context, "context");
        return createClientBuilder(context, 10485760);
    }

    public static final z.a createClientBuilder(Context context, int cacheSize) {
        AbstractC2855l.g(context, "context");
        z.a aVarCreateClientBuilder = createClientBuilder();
        return cacheSize == 0 ? aVarCreateClientBuilder : aVarCreateClientBuilder.d(new C2435c(new File(context.getCacheDir(), "http-cache"), cacheSize));
    }
}
