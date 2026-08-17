package com.facebook.react.modules.fresco;

import android.net.Uri;
import android.os.SystemClock;
import com.facebook.imagepipeline.backends.okhttp3.b;
import com.facebook.imagepipeline.producers.X;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.uimanager.ViewDefaults;
import com.facebook.react.uimanager.events.PointerEventHelper;
import e9.B;
import e9.C2436d;
import e9.t;
import e9.z;
import i7.C2750m;
import j7.K;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/facebook/react/modules/fresco/ReactOkHttpNetworkFetcher;", "Lcom/facebook/imagepipeline/backends/okhttp3/b;", "Le9/z;", "okHttpClient", "<init>", "(Le9/z;)V", "Lcom/facebook/react/bridge/ReadableMap;", "readableMap", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "getHeaders", "(Lcom/facebook/react/bridge/ReadableMap;)Ljava/util/Map;", "Lcom/facebook/imagepipeline/backends/okhttp3/b$b;", "fetchState", "Lcom/facebook/imagepipeline/producers/X$a;", "callback", "Li7/B;", "fetch", "(Lcom/facebook/imagepipeline/backends/okhttp3/b$b;Lcom/facebook/imagepipeline/producers/X$a;)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactOkHttpNetworkFetcher extends b {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ImageCacheControl.values().length];
            try {
                iArr[ImageCacheControl.RELOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImageCacheControl.FORCE_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ImageCacheControl.ONLY_IF_CACHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ImageCacheControl.DEFAULT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactOkHttpNetworkFetcher(z okHttpClient) {
        super(okHttpClient);
        AbstractC2855l.g(okHttpClient, "okHttpClient");
    }

    private final Map<String, String> getHeaders(ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
        HashMap map = new HashMap();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            String string = readableMap.getString(strNextKey);
            if (string != null) {
                map.put(strNextKey, string);
            }
        }
        return map;
    }

    @Override // com.facebook.imagepipeline.backends.okhttp3.b, com.facebook.imagepipeline.producers.X
    public void fetch(b.C0211b fetchState, X.a callback) {
        Map<String, String> mapI;
        AbstractC2855l.g(fetchState, "fetchState");
        AbstractC2855l.g(callback, "callback");
        fetchState.f19852f = SystemClock.elapsedRealtime();
        Uri uriG = fetchState.g();
        AbstractC2855l.f(uriG, "getUri(...)");
        C2436d.a aVar = new C2436d.a();
        if (fetchState.b().e() instanceof ReactNetworkImageRequest) {
            com.facebook.imagepipeline.request.b bVarE = fetchState.b().e();
            AbstractC2855l.e(bVarE, "null cannot be cast to non-null type com.facebook.react.modules.fresco.ReactNetworkImageRequest");
            ReactNetworkImageRequest reactNetworkImageRequest = (ReactNetworkImageRequest) bVarE;
            mapI = getHeaders(reactNetworkImageRequest.getHeaders());
            int i10 = WhenMappings.$EnumSwitchMapping$0[reactNetworkImageRequest.getCacheControl().ordinal()];
            if (i10 == 1) {
                aVar.e().d();
            } else if (i10 == 2) {
                aVar.c(ViewDefaults.NUMBER_OF_LINES, TimeUnit.SECONDS);
            } else if (i10 == 3) {
                aVar.f().c(ViewDefaults.NUMBER_OF_LINES, TimeUnit.SECONDS);
            } else {
                if (i10 != 4) {
                    throw new C2750m();
                }
                aVar.e();
            }
        } else {
            aVar.e();
            mapI = null;
        }
        t.b bVar = t.f26320h;
        if (mapI == null) {
            mapI = K.i();
        }
        B.a aVarC = new B.a().f(bVar.a(mapI)).c(aVar.a());
        String string = uriG.toString();
        AbstractC2855l.f(string, "toString(...)");
        fetchWithRequest(fetchState, callback, aVarC.m(string).d().b());
    }
}
