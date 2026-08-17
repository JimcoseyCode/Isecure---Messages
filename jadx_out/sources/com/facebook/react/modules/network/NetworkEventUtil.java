package com.facebook.react.modules.network;

import android.os.Bundle;
import android.util.Base64;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArrayBuilder;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import e9.A;
import e9.B;
import e9.C;
import e9.D;
import e9.E;
import e9.t;
import i7.C2735B;
import java.net.SocketTimeoutException;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ1\u0010\u0012\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013JC\u0010\u0015\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0015\u0010\u0016J1\u0010\u0017\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0017\u0010\u0013J;\u0010\u0019\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ9\u0010\u0019\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\u0019\u0010\u001eJ=\u0010\"\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u00042\b\u0010!\u001a\u0004\u0018\u00010 H\u0007¢\u0006\u0004\b\"\u0010#J1\u0010%\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u000fH\u0007¢\u0006\u0004\b%\u0010&J;\u0010*\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010'\u001a\u0004\u0018\u00010\u00042\u0006\u0010)\u001a\u00020(H\u0007¢\u0006\u0004\b*\u0010+JE\u0010*\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\r2\b\u0010-\u001a\u0004\u0018\u00010\u001b2\b\u0010.\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b*\u0010/J#\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004012\u0006\u0010-\u001a\u000200H\u0002¢\u0006\u0004\b2\u00103¨\u00064"}, d2 = {"Lcom/facebook/react/modules/network/NetworkEventUtil;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "devToolsRequestId", "Le9/B;", "request", "Li7/B;", "onCreateRequest", "(Ljava/lang/String;Le9/B;)V", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", PointerEventHelper.POINTER_TYPE_UNKNOWN, "requestId", PointerEventHelper.POINTER_TYPE_UNKNOWN, ReactProgressBarViewManager.PROP_PROGRESS, "total", "onDataSend", "(Lcom/facebook/react/bridge/ReactApplicationContext;IJJ)V", "data", "onIncrementalDataReceived", "(Lcom/facebook/react/bridge/ReactApplicationContext;ILjava/lang/String;Ljava/lang/String;JJ)V", "onDataReceivedProgress", "responseType", "onDataReceived", "(Lcom/facebook/react/bridge/ReactApplicationContext;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/facebook/react/bridge/WritableMap;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "rawData", "(Lcom/facebook/react/bridge/ReactApplicationContext;ILjava/lang/String;Lcom/facebook/react/bridge/WritableMap;[B)V", "error", PointerEventHelper.POINTER_TYPE_UNKNOWN, "e", "onRequestError", "(Lcom/facebook/react/bridge/ReactApplicationContext;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "encodedDataLength", "onRequestSuccess", "(Lcom/facebook/react/bridge/ReactApplicationContext;ILjava/lang/String;J)V", "requestUrl", "Le9/D;", "response", "onResponseReceived", "(Lcom/facebook/react/bridge/ReactApplicationContext;ILjava/lang/String;Ljava/lang/String;Le9/D;)V", "statusCode", "headers", "url", "(Lcom/facebook/react/bridge/ReactApplicationContext;ILjava/lang/String;ILcom/facebook/react/bridge/WritableMap;Ljava/lang/String;)V", "Le9/t;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "okHttpHeadersToMap", "(Le9/t;)Ljava/util/Map;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NetworkEventUtil {
    public static final NetworkEventUtil INSTANCE = new NetworkEventUtil();

    private NetworkEventUtil() {
    }

    private final Map<String, String> okHttpHeadersToMap(t headers) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int iD = headers.d();
        for (int i10 = 0; i10 < iD; i10++) {
            String strP = headers.p(i10);
            if (linkedHashMap.containsKey(strP)) {
                linkedHashMap.put(strP, linkedHashMap.get(strP) + ", " + headers.s(i10));
            } else {
                linkedHashMap.put(strP, headers.s(i10));
            }
        }
        return linkedHashMap;
    }

    public static final void onCreateRequest(String devToolsRequestId, B request) {
        String bodyPreview;
        AbstractC2855l.g(devToolsRequestId, "devToolsRequestId");
        AbstractC2855l.g(request, "request");
        if (ReactNativeFeatureFlags.enableNetworkEventReporting()) {
            Map<String, String> mapOkHttpHeadersToMap = INSTANCE.okHttpHeadersToMap(request.b());
            boolean z10 = ReactBuildConfig.DEBUG;
            String str = PointerEventHelper.POINTER_TYPE_UNKNOWN;
            if (z10) {
                C cA = request.a();
                ProgressRequestBody progressRequestBody = cA instanceof ProgressRequestBody ? (ProgressRequestBody) cA : null;
                if (progressRequestBody == null || (bodyPreview = progressRequestBody.getBodyPreview()) == null) {
                    C cA2 = request.a();
                    String string = cA2 != null ? cA2.toString() : null;
                    if (string != null) {
                        str = string;
                    }
                } else {
                    str = bodyPreview;
                }
            }
            String str2 = str;
            String string2 = request.d().toString();
            String strC = request.c();
            C cA3 = request.a();
            InspectorNetworkReporter.reportRequestStart(devToolsRequestId, string2, strC, mapOkHttpHeadersToMap, str2, cA3 != null ? cA3.contentLength() : 0L);
            InspectorNetworkReporter.reportConnectionTiming(devToolsRequestId, mapOkHttpHeadersToMap);
        }
    }

    public static final void onDataReceived(ReactApplicationContext reactContext, int requestId, String devToolsRequestId, String data, String responseType) {
        AbstractC2855l.g(devToolsRequestId, "devToolsRequestId");
        AbstractC2855l.g(responseType, "responseType");
        if (ReactNativeFeatureFlags.enableNetworkEventReporting()) {
            InspectorNetworkReporter.maybeStoreResponseBody(devToolsRequestId, data == null ? PointerEventHelper.POINTER_TYPE_UNKNOWN : data, AbstractC2855l.b(responseType, "base64"));
        }
        if (reactContext != null) {
            WritableArray writableArrayCreateArray = Arguments.createArray();
            ReadableArrayBuilder readableArrayBuilder = new ReadableArrayBuilder(writableArrayCreateArray);
            readableArrayBuilder.add(requestId);
            readableArrayBuilder.add(data);
            C2735B c2735b = C2735B.f28704a;
            reactContext.emitDeviceEvent("didReceiveNetworkData", writableArrayCreateArray);
        }
    }

    public static final void onDataReceivedProgress(ReactApplicationContext reactContext, int requestId, long progress, long total) {
        if (reactContext != null) {
            WritableArray writableArrayCreateArray = Arguments.createArray();
            ReadableArrayBuilder readableArrayBuilder = new ReadableArrayBuilder(writableArrayCreateArray);
            readableArrayBuilder.add(requestId);
            readableArrayBuilder.add((int) progress);
            readableArrayBuilder.add((int) total);
            C2735B c2735b = C2735B.f28704a;
            reactContext.emitDeviceEvent("didReceiveNetworkDataProgress", writableArrayCreateArray);
        }
    }

    public static final void onDataSend(ReactApplicationContext reactContext, int requestId, long progress, long total) {
        if (reactContext != null) {
            WritableArray writableArrayCreateArray = Arguments.createArray();
            ReadableArrayBuilder readableArrayBuilder = new ReadableArrayBuilder(writableArrayCreateArray);
            readableArrayBuilder.add(requestId);
            readableArrayBuilder.add((int) progress);
            readableArrayBuilder.add((int) total);
            C2735B c2735b = C2735B.f28704a;
            reactContext.emitDeviceEvent("didSendNetworkData", writableArrayCreateArray);
        }
    }

    public static final void onIncrementalDataReceived(ReactApplicationContext reactContext, int requestId, String devToolsRequestId, String data, long progress, long total) {
        AbstractC2855l.g(devToolsRequestId, "devToolsRequestId");
        if (ReactNativeFeatureFlags.enableNetworkEventReporting() && data != null) {
            InspectorNetworkReporter.reportDataReceived(devToolsRequestId, data);
            InspectorNetworkReporter.maybeStoreResponseBodyIncremental(devToolsRequestId, data);
        }
        if (reactContext != null) {
            WritableArray writableArrayCreateArray = Arguments.createArray();
            ReadableArrayBuilder readableArrayBuilder = new ReadableArrayBuilder(writableArrayCreateArray);
            readableArrayBuilder.add(requestId);
            readableArrayBuilder.add(data);
            readableArrayBuilder.add((int) progress);
            readableArrayBuilder.add((int) total);
            C2735B c2735b = C2735B.f28704a;
            reactContext.emitDeviceEvent("didReceiveNetworkIncrementalData", writableArrayCreateArray);
        }
    }

    public static final void onRequestError(ReactApplicationContext reactContext, int requestId, String devToolsRequestId, String error, Throwable e10) {
        AbstractC2855l.g(devToolsRequestId, "devToolsRequestId");
        if (ReactNativeFeatureFlags.enableNetworkEventReporting()) {
            InspectorNetworkReporter.reportRequestFailed(devToolsRequestId, false);
        }
        if (reactContext != null) {
            WritableArray writableArrayCreateArray = Arguments.createArray();
            ReadableArrayBuilder readableArrayBuilder = new ReadableArrayBuilder(writableArrayCreateArray);
            readableArrayBuilder.add(requestId);
            readableArrayBuilder.add(error);
            if (AbstractC2855l.b(e10 != null ? e10.getClass() : null, SocketTimeoutException.class)) {
                readableArrayBuilder.add(true);
            }
            C2735B c2735b = C2735B.f28704a;
            reactContext.emitDeviceEvent("didCompleteNetworkResponse", writableArrayCreateArray);
        }
    }

    public static final void onRequestSuccess(ReactApplicationContext reactContext, int requestId, String devToolsRequestId, long encodedDataLength) {
        AbstractC2855l.g(devToolsRequestId, "devToolsRequestId");
        if (ReactNativeFeatureFlags.enableNetworkEventReporting()) {
            InspectorNetworkReporter.reportResponseEnd(devToolsRequestId, encodedDataLength);
        }
        if (reactContext != null) {
            WritableArray writableArrayCreateArray = Arguments.createArray();
            ReadableArrayBuilder readableArrayBuilder = new ReadableArrayBuilder(writableArrayCreateArray);
            readableArrayBuilder.add(requestId);
            readableArrayBuilder.addNull();
            C2735B c2735b = C2735B.f28704a;
            reactContext.emitDeviceEvent("didCompleteNetworkResponse", writableArrayCreateArray);
        }
    }

    public static final void onResponseReceived(ReactApplicationContext reactContext, int requestId, String devToolsRequestId, String requestUrl, D response) {
        AbstractC2855l.g(devToolsRequestId, "devToolsRequestId");
        AbstractC2855l.g(response, "response");
        Map<String, String> mapOkHttpHeadersToMap = INSTANCE.okHttpHeadersToMap(response.k());
        Bundle bundle = new Bundle();
        for (Map.Entry<String, String> entry : mapOkHttpHeadersToMap.entrySet()) {
            bundle.putString(entry.getKey(), entry.getValue());
        }
        if (ReactNativeFeatureFlags.enableNetworkEventReporting()) {
            String str = requestUrl == null ? PointerEventHelper.POINTER_TYPE_UNKNOWN : requestUrl;
            int iE = response.e();
            E eD = response.d();
            InspectorNetworkReporter.reportResponseStart(devToolsRequestId, str, iE, mapOkHttpHeadersToMap, eD != null ? eD.contentLength() : 0L);
        }
        if (reactContext != null) {
            WritableArray writableArrayCreateArray = Arguments.createArray();
            writableArrayCreateArray.pushInt(requestId);
            writableArrayCreateArray.pushInt(response.e());
            writableArrayCreateArray.pushMap(Arguments.fromBundle(bundle));
            writableArrayCreateArray.pushString(requestUrl);
            C2735B c2735b = C2735B.f28704a;
            reactContext.emitDeviceEvent("didReceiveNetworkResponse", writableArrayCreateArray);
        }
    }

    public static final void onDataReceived(ReactApplicationContext reactContext, int requestId, String devToolsRequestId, WritableMap data, byte[] rawData) {
        AbstractC2855l.g(devToolsRequestId, "devToolsRequestId");
        AbstractC2855l.g(data, "data");
        AbstractC2855l.g(rawData, "rawData");
        if (ReactNativeFeatureFlags.enableNetworkEventReporting()) {
            String strEncodeToString = Base64.encodeToString(rawData, 2);
            AbstractC2855l.f(strEncodeToString, "encodeToString(...)");
            InspectorNetworkReporter.maybeStoreResponseBody(devToolsRequestId, strEncodeToString, true);
        }
        if (reactContext != null) {
            WritableArray writableArrayCreateArray = Arguments.createArray();
            writableArrayCreateArray.pushInt(requestId);
            writableArrayCreateArray.pushMap(data);
            C2735B c2735b = C2735B.f28704a;
            reactContext.emitDeviceEvent("didReceiveNetworkData", writableArrayCreateArray);
        }
    }

    public static final void onResponseReceived(ReactApplicationContext reactContext, int requestId, String devToolsRequestId, int statusCode, WritableMap headers, String url) {
        AbstractC2855l.g(devToolsRequestId, "devToolsRequestId");
        t.a aVar = new t.a();
        if (headers != null) {
            ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = headers.keySetIterator();
            while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                String string = headers.getString(strNextKey);
                if (string != null) {
                    aVar.a(strNextKey, string);
                }
            }
        }
        onResponseReceived(reactContext, requestId, devToolsRequestId, url, new D.a().p(A.HTTP_1_1).r(new B.a().m(url == null ? PointerEventHelper.POINTER_TYPE_UNKNOWN : url).b()).k(aVar.e()).g(statusCode).m(PointerEventHelper.POINTER_TYPE_UNKNOWN).c());
    }
}
