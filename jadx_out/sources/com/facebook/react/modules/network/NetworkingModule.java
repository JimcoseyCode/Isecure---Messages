package com.facebook.react.modules.network;

import P8.C1385d;
import P8.q;
import android.content.Context;
import android.net.Uri;
import android.util.Base64;
import com.facebook.fbreact.specs.NativeNetworkingAndroidSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.network.OkHttpCallUtil;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import d2.AbstractC2325a;
import e9.A;
import e9.B;
import e9.C;
import e9.D;
import e9.E;
import e9.InterfaceC2437e;
import e9.InterfaceC2438f;
import e9.n;
import e9.t;
import e9.v;
import e9.w;
import e9.x;
import e9.y;
import e9.z;
import expo.modules.notifications.notifications.presentation.builders.ExpoNotificationBuilder;
import i7.C2735B;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t9.AbstractC3386c;
import t9.k;
import t9.p;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@ReactModule(name = "Networking")
@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\f\b\u0007\u0018\u0000 v2\u00020\u0001:\u0005wxyzvB1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fB#\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\u000eB\u0011\b\u0016\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\u000fB!\b\u0016\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\u0010B\u001b\b\u0016\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015Je\u0010#\u001a\u00020\"2\u0006\u0010\u0016\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u0004H\u0002¢\u0006\u0004\b#\u0010$J#\u0010'\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b'\u0010(J'\u0010+\u001a\u00020\"2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u00042\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\"2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\"2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b/\u0010.J\u000f\u00100\u001a\u00020\"H\u0002¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\"2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b2\u0010.J1\u00106\u001a\u0004\u0018\u0001052\u0006\u00103\u001a\u00020\u001a2\u0006\u00104\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u0004H\u0002¢\u0006\u0004\b6\u00107J%\u0010;\u001a\u0004\u0018\u00010:2\b\u00108\u001a\u0004\u0018\u00010\u001a2\b\u00109\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\"H\u0016¢\u0006\u0004\b=\u00101J\u000f\u0010>\u001a\u00020\"H\u0016¢\u0006\u0004\b>\u00101J\u0017\u0010C\u001a\u00020\"2\u0006\u0010@\u001a\u00020?H\u0000¢\u0006\u0004\bA\u0010BJ\u0017\u0010G\u001a\u00020\"2\u0006\u0010@\u001a\u00020DH\u0000¢\u0006\u0004\bE\u0010FJ\u0017\u0010K\u001a\u00020\"2\u0006\u0010@\u001a\u00020HH\u0000¢\u0006\u0004\bI\u0010JJ\u0017\u0010M\u001a\u00020\"2\u0006\u0010@\u001a\u00020?H\u0000¢\u0006\u0004\bL\u0010BJ\u0017\u0010O\u001a\u00020\"2\u0006\u0010@\u001a\u00020DH\u0000¢\u0006\u0004\bN\u0010FJ\u0017\u0010Q\u001a\u00020\"2\u0006\u0010@\u001a\u00020HH\u0000¢\u0006\u0004\bP\u0010JJ[\u0010U\u001a\u00020\"2\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010S\u001a\u00020R2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010T\u001a\u00020R2\u0006\u0010 \u001a\u00020\u001dH\u0016¢\u0006\u0004\bU\u0010VJ]\u0010W\u001a\u00020\"2\u0006\u0010\u0016\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u001dH\u0007¢\u0006\u0004\bW\u0010XJ\u0017\u0010Y\u001a\u00020\"2\u0006\u0010S\u001a\u00020RH\u0016¢\u0006\u0004\bY\u0010ZJ\u0017\u0010]\u001a\u00020\"2\u0006\u0010\\\u001a\u00020[H\u0017¢\u0006\u0004\b]\u0010^J\u0019\u0010`\u001a\u00020\"2\b\u0010_\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b`\u0010aJ\u0017\u0010c\u001a\u00020\"2\u0006\u0010b\u001a\u00020RH\u0016¢\u0006\u0004\bc\u0010ZR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010dR\u0014\u0010f\u001a\u00020e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010hR\u0018\u0010j\u001a\u0004\u0018\u00010i8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010kR\u001a\u0010m\u001a\b\u0012\u0004\u0012\u00020\u00180l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u001a\u0010p\u001a\b\u0012\u0004\u0012\u00020D0o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR\u001a\u0010r\u001a\b\u0012\u0004\u0012\u00020?0o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010qR\u001a\u0010s\u001a\b\u0012\u0004\u0012\u00020H0o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010qR\u0016\u0010t\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010u¨\u0006{"}, d2 = {"Lcom/facebook/react/modules/network/NetworkingModule;", "Lcom/facebook/fbreact/specs/NativeNetworkingAndroidSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", PointerEventHelper.POINTER_TYPE_UNKNOWN, "defaultUserAgent", "Le9/z;", "client", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/react/modules/network/NetworkInterceptorCreator;", "networkInterceptorCreators", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/lang/String;Le9/z;Ljava/util/List;)V", "context", "(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/lang/String;Le9/z;)V", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/util/List;)V", "(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/lang/String;)V", "Lcom/facebook/react/bridge/ReadableMap;", "data", "extractOrGenerateDevToolsRequestId", "(Lcom/facebook/react/bridge/ReadableMap;)Ljava/lang/String;", "method", "url", PointerEventHelper.POINTER_TYPE_UNKNOWN, "requestId", "Lcom/facebook/react/bridge/ReadableArray;", "headers", "responseType", PointerEventHelper.POINTER_TYPE_UNKNOWN, "useIncrementalUpdates", "timeout", "withCredentials", NetworkingModule.REQUEST_DATA_KEY_DEVTOOLS_REQUEST_ID, "Li7/B;", "sendRequestInternalReal", "(Ljava/lang/String;Ljava/lang/String;ILcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;ZIZLjava/lang/String;)V", "Le9/C;", "requestBody", "wrapRequestBodyWithProgressEmitter", "(Le9/C;I)Le9/C;", "Le9/E;", "responseBody", "readWithProgress", "(ILjava/lang/String;Le9/E;)V", "addRequest", "(I)V", "removeRequest", "cancelAllRequests", "()V", "cancelRequest", ExpoNotificationBuilder.EXTRAS_BODY_KEY, "contentType", "Le9/y$a;", "constructMultipartBody", "(Lcom/facebook/react/bridge/ReadableArray;Ljava/lang/String;ILjava/lang/String;)Le9/y$a;", "headersArray", "requestData", "Le9/t;", "extractHeaders", "(Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableMap;)Le9/t;", "initialize", "invalidate", "Lcom/facebook/react/modules/network/NetworkingModule$UriHandler;", "handler", "addUriHandler$ReactAndroid_release", "(Lcom/facebook/react/modules/network/NetworkingModule$UriHandler;)V", "addUriHandler", "Lcom/facebook/react/modules/network/NetworkingModule$RequestBodyHandler;", "addRequestBodyHandler$ReactAndroid_release", "(Lcom/facebook/react/modules/network/NetworkingModule$RequestBodyHandler;)V", "addRequestBodyHandler", "Lcom/facebook/react/modules/network/NetworkingModule$ResponseHandler;", "addResponseHandler$ReactAndroid_release", "(Lcom/facebook/react/modules/network/NetworkingModule$ResponseHandler;)V", "addResponseHandler", "removeUriHandler$ReactAndroid_release", "removeUriHandler", "removeRequestBodyHandler$ReactAndroid_release", "removeRequestBodyHandler", "removeResponseHandler$ReactAndroid_release", "removeResponseHandler", PointerEventHelper.POINTER_TYPE_UNKNOWN, "requestIdAsDouble", "timeoutAsDouble", "sendRequest", "(Ljava/lang/String;Ljava/lang/String;DLcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;ZDZ)V", "sendRequestInternal", "(Ljava/lang/String;Ljava/lang/String;ILcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;ZIZ)V", "abortRequest", "(D)V", "Lcom/facebook/react/bridge/Callback;", "callback", "clearCookies", "(Lcom/facebook/react/bridge/Callback;)V", "eventName", "addListener", "(Ljava/lang/String;)V", "count", "removeListeners", "Le9/z;", "Lcom/facebook/react/modules/network/ForwardingCookieHandler;", "cookieHandler", "Lcom/facebook/react/modules/network/ForwardingCookieHandler;", "Ljava/lang/String;", "Lcom/facebook/react/modules/network/CookieJarContainer;", "cookieJarContainer", "Lcom/facebook/react/modules/network/CookieJarContainer;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "requestIds", "Ljava/util/Set;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "requestBodyHandlers", "Ljava/util/List;", "uriHandlers", "responseHandlers", "shuttingDown", "Z", "Companion", "UriHandler", "RequestBodyHandler", "ResponseHandler", "CustomClientBuilder", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NetworkingModule extends NativeNetworkingAndroidSpec {
    private static final int CHUNK_TIMEOUT_NS = 100000000;
    private static final String CONTENT_ENCODING_HEADER_NAME = "content-encoding";
    private static final String CONTENT_TYPE_HEADER_NAME = "content-type";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int MAX_CHUNK_SIZE_BETWEEN_FLUSHES = 8192;
    public static final String NAME = "Networking";
    private static final String REQUEST_BODY_KEY_BASE64 = "base64";
    private static final String REQUEST_BODY_KEY_FORMDATA = "formData";
    private static final String REQUEST_BODY_KEY_STRING = "string";
    private static final String REQUEST_BODY_KEY_URI = "uri";
    private static final String REQUEST_DATA_KEY_DEVTOOLS_REQUEST_ID = "devToolsRequestId";
    private static final String TAG = "Networking";
    private static final String USER_AGENT_HEADER_NAME = "user-agent";
    private static com.facebook.react.modules.network.CustomClientBuilder customClientBuilder;
    private final z client;
    private final ForwardingCookieHandler cookieHandler;
    private CookieJarContainer cookieJarContainer;
    private final String defaultUserAgent;
    private final List<RequestBodyHandler> requestBodyHandlers;
    private final Set<Integer> requestIds;
    private final List<ResponseHandler> responseHandlers;
    private boolean shuttingDown;
    private final List<UriHandler> uriHandlers;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0015R\u0014\u0010\u001b\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0015R\u0014\u0010\u001c\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0015R\u0014\u0010\u001d\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0015R\u0014\u0010\u001e\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0015R\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010!R\u0018\u0010#\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/facebook/react/modules/network/NetworkingModule$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "Le9/z$a;", "builder", "Li7/B;", "applyCustomBuilder", "(Le9/z$a;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "now", "last", PointerEventHelper.POINTER_TYPE_UNKNOWN, "shouldDispatch", "(JJ)Z", "Lcom/facebook/react/modules/network/CustomClientBuilder;", "ccb", "setCustomClientBuilder", "(Lcom/facebook/react/modules/network/CustomClientBuilder;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "NAME", "Ljava/lang/String;", "TAG", "CONTENT_ENCODING_HEADER_NAME", "CONTENT_TYPE_HEADER_NAME", "REQUEST_BODY_KEY_STRING", "REQUEST_BODY_KEY_URI", "REQUEST_BODY_KEY_FORMDATA", "REQUEST_BODY_KEY_BASE64", "REQUEST_DATA_KEY_DEVTOOLS_REQUEST_ID", "USER_AGENT_HEADER_NAME", PointerEventHelper.POINTER_TYPE_UNKNOWN, "CHUNK_TIMEOUT_NS", "I", "MAX_CHUNK_SIZE_BETWEEN_FLUSHES", "customClientBuilder", "Lcom/facebook/react/modules/network/CustomClientBuilder;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void applyCustomBuilder(z.a builder) {
            com.facebook.react.modules.network.CustomClientBuilder customClientBuilder = NetworkingModule.customClientBuilder;
            if (customClientBuilder != null) {
                customClientBuilder.apply(builder);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean shouldDispatch(long now, long last) {
            return last + ((long) NetworkingModule.CHUNK_TIMEOUT_NS) < now;
        }

        public final void setCustomClientBuilder(com.facebook.react.modules.network.CustomClientBuilder ccb) {
            NetworkingModule.customClientBuilder = ccb;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lcom/facebook/react/modules/network/NetworkingModule$CustomClientBuilder;", "Lcom/facebook/react/modules/network/CustomClientBuilder;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface CustomClientBuilder extends com.facebook.react.modules.network.CustomClientBuilder {
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/modules/network/NetworkingModule$RequestBodyHandler;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/react/bridge/ReadableMap;", "map", PointerEventHelper.POINTER_TYPE_UNKNOWN, "supports", "(Lcom/facebook/react/bridge/ReadableMap;)Z", PointerEventHelper.POINTER_TYPE_UNKNOWN, "contentType", "Le9/C;", "toRequestBody", "(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Le9/C;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface RequestBodyHandler {
        boolean supports(ReadableMap map);

        C toRequestBody(ReadableMap map, String contentType);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/modules/network/NetworkingModule$ResponseHandler;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "supports", PointerEventHelper.POINTER_TYPE_UNKNOWN, "responseType", PointerEventHelper.POINTER_TYPE_UNKNOWN, "toResponseData", "Lcom/facebook/react/bridge/WritableMap;", "data", PointerEventHelper.POINTER_TYPE_UNKNOWN, "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ResponseHandler {
        boolean supports(String responseType);

        WritableMap toResponseData(byte[] data) throws IOException;
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\b`\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001c\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/modules/network/NetworkingModule$UriHandler;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "supports", PointerEventHelper.POINTER_TYPE_UNKNOWN, NetworkingModule.REQUEST_BODY_KEY_URI, "Landroid/net/Uri;", "responseType", PointerEventHelper.POINTER_TYPE_UNKNOWN, "fetch", "Lkotlin/Pair;", "Lcom/facebook/react/bridge/WritableMap;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface UriHandler {
        Pair<WritableMap, byte[]> fetch(Uri uri) throws IOException;

        boolean supports(Uri uri, String responseType);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkingModule(ReactApplicationContext reactContext, String str, z client, List<? extends NetworkInterceptorCreator> list) {
        super(reactContext);
        AbstractC2855l.g(reactContext, "reactContext");
        AbstractC2855l.g(client, "client");
        this.cookieHandler = new ForwardingCookieHandler();
        this.requestIds = new HashSet();
        this.requestBodyHandlers = new ArrayList();
        this.uriHandlers = new ArrayList();
        this.responseHandlers = new ArrayList();
        if (list != null) {
            z.a aVarC = client.C();
            Iterator<? extends NetworkInterceptorCreator> it = list.iterator();
            while (it.hasNext()) {
                aVarC.b(it.next().create());
            }
            client = aVarC.c();
        }
        this.client = client;
        n nVarC = client.c();
        this.cookieJarContainer = nVarC instanceof CookieJarContainer ? (CookieJarContainer) nVarC : null;
        this.defaultUserAgent = str;
    }

    private final synchronized void addRequest(int requestId) {
        this.requestIds.add(Integer.valueOf(requestId));
    }

    private final synchronized void cancelAllRequests() {
        try {
            Iterator<Integer> it = this.requestIds.iterator();
            while (it.hasNext()) {
                cancelRequest(it.next().intValue());
            }
            this.requestIds.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    private final void cancelRequest(int requestId) {
        OkHttpCallUtil.cancelTag(this.client, Integer.valueOf(requestId));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final y.a constructMultipartBody(ReadableArray body, String contentType, int requestId, String devToolsRequestId) {
        x xVarA;
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        y.a aVar = new y.a(null, 1, 0 == true ? 1 : 0);
        x xVarA2 = x.f26347g.a(contentType);
        if (xVarA2 == null) {
            NetworkEventUtil.onRequestError(reactApplicationContextIfActiveOrWarn, requestId, devToolsRequestId, "Invalid media type.", null);
            return null;
        }
        aVar.f(xVarA2);
        int size = body.size();
        for (int i10 = 0; i10 < size; i10++) {
            ReadableMap map = body.getMap(i10);
            if (map == null) {
                NetworkEventUtil.onRequestError(reactApplicationContextIfActiveOrWarn, requestId, devToolsRequestId, "Unrecognized FormData part.", null);
                return null;
            }
            t tVarExtractHeaders = extractHeaders(map.getArray("headers"), null);
            if (tVarExtractHeaders == null) {
                NetworkEventUtil.onRequestError(reactApplicationContextIfActiveOrWarn, requestId, devToolsRequestId, "Missing or invalid header format for FormData part.", null);
                return null;
            }
            String strO = tVarExtractHeaders.o(CONTENT_TYPE_HEADER_NAME);
            if (strO != null) {
                xVarA = x.f26347g.a(strO);
                tVarExtractHeaders = tVarExtractHeaders.r().h(CONTENT_TYPE_HEADER_NAME).e();
            } else {
                xVarA = null;
            }
            if (map.hasKey(REQUEST_BODY_KEY_STRING) && map.getString(REQUEST_BODY_KEY_STRING) != null) {
                String string = map.getString(REQUEST_BODY_KEY_STRING);
                if (string == null) {
                    string = PointerEventHelper.POINTER_TYPE_UNKNOWN;
                }
                aVar.c(tVarExtractHeaders, C.Companion.b(xVarA, string));
            } else if (!map.hasKey(REQUEST_BODY_KEY_URI) || map.getString(REQUEST_BODY_KEY_URI) == null) {
                NetworkEventUtil.onRequestError(reactApplicationContextIfActiveOrWarn, requestId, devToolsRequestId, "Unrecognized FormData part.", null);
                C2735B c2735b = C2735B.f28704a;
            } else {
                if (xVarA == null) {
                    NetworkEventUtil.onRequestError(reactApplicationContextIfActiveOrWarn, requestId, devToolsRequestId, "Binary FormData part needs a content-type header.", null);
                    return null;
                }
                String string2 = map.getString(REQUEST_BODY_KEY_URI);
                if (string2 == null) {
                    NetworkEventUtil.onRequestError(reactApplicationContextIfActiveOrWarn, requestId, devToolsRequestId, "Body must have a valid file uri", null);
                    return null;
                }
                ReactApplicationContext reactApplicationContext = getReactApplicationContext();
                AbstractC2855l.f(reactApplicationContext, "getReactApplicationContext(...)");
                InputStream fileInputStream = RequestBodyUtil.getFileInputStream(reactApplicationContext, string2);
                if (fileInputStream == null) {
                    NetworkEventUtil.onRequestError(reactApplicationContextIfActiveOrWarn, requestId, devToolsRequestId, "Could not retrieve file for uri " + string2, null);
                    return null;
                }
                aVar.c(tVarExtractHeaders, RequestBodyUtil.create(xVarA, fileInputStream));
            }
        }
        return aVar;
    }

    private final t extractHeaders(ReadableArray headersArray, ReadableMap requestData) {
        String str;
        if (headersArray == null) {
            return null;
        }
        t.a aVar = new t.a();
        int size = headersArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            ReadableArray array = headersArray.getArray(i10);
            if (array != null && array.size() == 2) {
                String string = array.getString(0);
                if (string != null) {
                    string = HeaderUtil.INSTANCE.stripHeaderName(string);
                }
                String string2 = array.getString(1);
                if (string != null && string2 != null) {
                    aVar.d(string, string2);
                }
            }
            return null;
        }
        if (aVar.f(USER_AGENT_HEADER_NAME) == null && (str = this.defaultUserAgent) != null) {
            aVar.a(USER_AGENT_HEADER_NAME, str);
        }
        if (requestData == null || !requestData.hasKey(REQUEST_BODY_KEY_STRING)) {
            aVar.h(CONTENT_ENCODING_HEADER_NAME);
        }
        return aVar.e();
    }

    private final String extractOrGenerateDevToolsRequestId(ReadableMap data) {
        String string = (data != null && data.hasKey(REQUEST_DATA_KEY_DEVTOOLS_REQUEST_ID) && data.getType(REQUEST_DATA_KEY_DEVTOOLS_REQUEST_ID) == ReadableType.String) ? data.getString(REQUEST_DATA_KEY_DEVTOOLS_REQUEST_ID) : null;
        if (string != null) {
            return string;
        }
        String string2 = UUID.randomUUID().toString();
        AbstractC2855l.f(string2, "toString(...)");
        return string2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void readWithProgress(int requestId, String devToolsRequestId, E responseBody) throws IOException {
        long totalBytesRead;
        Charset charsetC;
        long jContentLength = -1;
        try {
            AbstractC2855l.e(responseBody, "null cannot be cast to non-null type com.facebook.react.modules.network.ProgressResponseBody");
            ProgressResponseBody progressResponseBody = (ProgressResponseBody) responseBody;
            totalBytesRead = progressResponseBody.getTotalBytesRead();
            try {
                jContentLength = progressResponseBody.contentLength();
            } catch (ClassCastException unused) {
            }
        } catch (ClassCastException unused2) {
            totalBytesRead = -1;
        }
        long j10 = jContentLength;
        long j11 = totalBytesRead;
        if (responseBody.contentType() == null) {
            charsetC = StandardCharsets.UTF_8;
        } else {
            x xVarContentType = responseBody.contentType();
            charsetC = xVarContentType != null ? xVarContentType.c(StandardCharsets.UTF_8) : null;
            if (charsetC == null) {
                throw new IllegalStateException(("Null character set for Content-Type: " + responseBody.contentType()).toString());
            }
        }
        AbstractC2855l.d(charsetC);
        ProgressiveStringDecoder progressiveStringDecoder = new ProgressiveStringDecoder(charsetC);
        InputStream inputStreamByteStream = responseBody.byteStream();
        try {
            byte[] bArr = new byte[MAX_CHUNK_SIZE_BETWEEN_FLUSHES];
            ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
            while (true) {
                int i10 = inputStreamByteStream.read(bArr);
                if (i10 == -1) {
                    return;
                } else {
                    NetworkEventUtil.onIncrementalDataReceived(reactApplicationContextIfActiveOrWarn, requestId, devToolsRequestId, progressiveStringDecoder.decodeNext(bArr, i10), j11, j10);
                }
            }
        } finally {
            inputStreamByteStream.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void removeRequest(int requestId) {
        this.requestIds.remove(Integer.valueOf(requestId));
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x0276  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void sendRequestInternalReal(String method, final String url, final int requestId, ReadableArray headers, ReadableMap data, final String responseType, final boolean useIncrementalUpdates, int timeout, boolean withCredentials, final String devToolsRequestId) {
        String str;
        RequestBodyHandler next;
        C emptyBody;
        Charset charsetC;
        UriHandler next2;
        final ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        try {
            Uri uri = Uri.parse(url);
            Iterator<UriHandler> it = this.uriHandlers.iterator();
            do {
                boolean zHasNext = it.hasNext();
                str = PointerEventHelper.POINTER_TYPE_UNKNOWN;
                if (!zHasNext) {
                    try {
                        B.a aVar = new B.a();
                        if (url != null) {
                            str = url;
                        }
                        B.a aVarM = aVar.m(str);
                        if (requestId != 0) {
                            aVarM.k(Integer.valueOf(requestId));
                        }
                        z.a aVarC = this.client.C();
                        INSTANCE.applyCustomBuilder(aVarC);
                        if (!withCredentials) {
                            aVarC.g(n.f26298a);
                        }
                        if (useIncrementalUpdates) {
                            aVarC.b(new v() { // from class: com.facebook.react.modules.network.NetworkingModule$sendRequestInternalReal$$inlined$-addNetworkInterceptor$1
                                @Override // e9.v
                                public final D intercept(v.a chain) {
                                    AbstractC2855l.g(chain, "chain");
                                    D dA = chain.a(chain.d());
                                    E eD = dA.d();
                                    if (eD == null) {
                                        throw new IllegalStateException("Required value was null.");
                                    }
                                    final String str2 = responseType;
                                    final ReactApplicationContext reactApplicationContext = reactApplicationContextIfActiveOrWarn;
                                    final int i10 = requestId;
                                    return dA.u0().b(new ProgressResponseBody(eD, new ProgressListener() { // from class: com.facebook.react.modules.network.NetworkingModule$sendRequestInternalReal$1$responseBody$1
                                        private long last = System.nanoTime();

                                        public final long getLast() {
                                            return this.last;
                                        }

                                        @Override // com.facebook.react.modules.network.ProgressListener
                                        public void onProgress(long bytesWritten, long contentLength, boolean done) {
                                            long jNanoTime = System.nanoTime();
                                            if ((done || NetworkingModule.INSTANCE.shouldDispatch(jNanoTime, this.last)) && !AbstractC2855l.b(str2, ReactTextInputShadowNode.PROP_TEXT)) {
                                                NetworkEventUtil.onDataReceivedProgress(reactApplicationContext, i10, bytesWritten, contentLength);
                                                this.last = jNanoTime;
                                            }
                                        }

                                        public final void setLast(long j10) {
                                            this.last = j10;
                                        }
                                    })).c();
                                }
                            });
                        }
                        if (timeout != this.client.b()) {
                            aVarC.e(timeout, TimeUnit.MILLISECONDS);
                        }
                        z zVarC = aVarC.c();
                        t tVarExtractHeaders = extractHeaders(headers, data);
                        if (tVarExtractHeaders == null) {
                            NetworkEventUtil.onRequestError(reactApplicationContextIfActiveOrWarn, requestId, devToolsRequestId, "Unrecognized headers format", null);
                            return;
                        }
                        String strO = tVarExtractHeaders.o(CONTENT_TYPE_HEADER_NAME);
                        String strO2 = tVarExtractHeaders.o(CONTENT_ENCODING_HEADER_NAME);
                        aVarM.f(tVarExtractHeaders);
                        if (data != null) {
                            Iterator<RequestBodyHandler> it2 = this.requestBodyHandlers.iterator();
                            while (it2.hasNext()) {
                                next = it2.next();
                                if (next.supports(data)) {
                                    break;
                                }
                            }
                            next = null;
                        } else {
                            next = null;
                        }
                        if (data != null) {
                            Locale locale = Locale.ROOT;
                            String lowerCase = method.toLowerCase(locale);
                            AbstractC2855l.f(lowerCase, "toLowerCase(...)");
                            if (!AbstractC2855l.b(lowerCase, "get")) {
                                String lowerCase2 = method.toLowerCase(locale);
                                AbstractC2855l.f(lowerCase2, "toLowerCase(...)");
                                if (AbstractC2855l.b(lowerCase2, "head")) {
                                    emptyBody = RequestBodyUtil.getEmptyBody(method);
                                } else if (next != null) {
                                    emptyBody = next.toRequestBody(data, strO);
                                } else if (data.hasKey(REQUEST_BODY_KEY_STRING)) {
                                    if (strO == null) {
                                        NetworkEventUtil.onRequestError(reactApplicationContextIfActiveOrWarn, requestId, devToolsRequestId, "Payload is set but no content-type header specified", null);
                                        return;
                                    }
                                    String string = data.getString(REQUEST_BODY_KEY_STRING);
                                    x xVarA = x.f26347g.a(strO);
                                    if (RequestBodyUtil.isGzipEncoding(strO2)) {
                                        emptyBody = (xVarA == null || string == null) ? null : RequestBodyUtil.createGzip(xVarA, string);
                                        if (emptyBody == null) {
                                            NetworkEventUtil.onRequestError(reactApplicationContextIfActiveOrWarn, requestId, devToolsRequestId, "Failed to gzip request body", null);
                                            return;
                                        }
                                    } else {
                                        if (xVarA == null) {
                                            charsetC = StandardCharsets.UTF_8;
                                        } else {
                                            charsetC = xVarA.c(StandardCharsets.UTF_8);
                                            if (charsetC == null) {
                                                throw new IllegalStateException("Required value was null.");
                                            }
                                        }
                                        if (string == null) {
                                            NetworkEventUtil.onRequestError(reactApplicationContextIfActiveOrWarn, requestId, devToolsRequestId, "Received request but body was empty", null);
                                            return;
                                        }
                                        C.a aVar2 = C.Companion;
                                        AbstractC2855l.d(charsetC);
                                        byte[] bytes = string.getBytes(charsetC);
                                        AbstractC2855l.f(bytes, "getBytes(...)");
                                        emptyBody = C.a.i(aVar2, xVarA, bytes, 0, 0, 12, null);
                                    }
                                } else if (data.hasKey(REQUEST_BODY_KEY_BASE64)) {
                                    if (strO == null) {
                                        NetworkEventUtil.onRequestError(reactApplicationContextIfActiveOrWarn, requestId, devToolsRequestId, "Payload is set but no content-type header specified", null);
                                        return;
                                    }
                                    String string2 = data.getString(REQUEST_BODY_KEY_BASE64);
                                    if (string2 == null) {
                                        throw new IllegalStateException("Required value was null.");
                                    }
                                    x xVarA2 = x.f26347g.a(strO);
                                    if (xVarA2 == null) {
                                        NetworkEventUtil.onRequestError(reactApplicationContextIfActiveOrWarn, requestId, devToolsRequestId, "Invalid content type specified: " + strO, null);
                                        return;
                                    }
                                    k kVarA = k.f32603j.a(string2);
                                    if (kVarA == null) {
                                        NetworkEventUtil.onRequestError(reactApplicationContextIfActiveOrWarn, requestId, devToolsRequestId, "Request body base64 string was invalid", null);
                                        return;
                                    }
                                    emptyBody = C.Companion.c(xVarA2, kVarA);
                                } else if (data.hasKey(REQUEST_BODY_KEY_URI)) {
                                    if (strO == null) {
                                        NetworkEventUtil.onRequestError(reactApplicationContextIfActiveOrWarn, requestId, devToolsRequestId, "Payload is set but no content-type header specified", null);
                                        return;
                                    }
                                    String string3 = data.getString(REQUEST_BODY_KEY_URI);
                                    if (string3 == null) {
                                        NetworkEventUtil.onRequestError(reactApplicationContextIfActiveOrWarn, requestId, devToolsRequestId, "Request body URI field was set but null", null);
                                        return;
                                    }
                                    ReactApplicationContext reactApplicationContext = getReactApplicationContext();
                                    AbstractC2855l.f(reactApplicationContext, "getReactApplicationContext(...)");
                                    InputStream fileInputStream = RequestBodyUtil.getFileInputStream(reactApplicationContext, string3);
                                    if (fileInputStream == null) {
                                        NetworkEventUtil.onRequestError(reactApplicationContextIfActiveOrWarn, requestId, devToolsRequestId, "Could not retrieve file for uri " + string3, null);
                                        return;
                                    }
                                    emptyBody = RequestBodyUtil.create(x.f26347g.a(strO), fileInputStream);
                                } else if (data.hasKey(REQUEST_BODY_KEY_FORMDATA)) {
                                    if (strO == null) {
                                        strO = "multipart/form-data";
                                    }
                                    ReadableArray array = data.getArray(REQUEST_BODY_KEY_FORMDATA);
                                    if (array == null) {
                                        NetworkEventUtil.onRequestError(reactApplicationContextIfActiveOrWarn, requestId, devToolsRequestId, "Received request but form data was empty", null);
                                        return;
                                    }
                                    y.a aVarConstructMultipartBody = constructMultipartBody(array, strO, requestId, devToolsRequestId);
                                    if (aVarConstructMultipartBody == null) {
                                        return;
                                    } else {
                                        emptyBody = aVarConstructMultipartBody.e();
                                    }
                                } else {
                                    emptyBody = RequestBodyUtil.getEmptyBody(method);
                                }
                            }
                        }
                        aVarM.g(method, wrapRequestBodyWithProgressEmitter(emptyBody, requestId));
                        addRequest(requestId);
                        B b10 = aVarM.b();
                        NetworkEventUtil.onCreateRequest(devToolsRequestId, b10);
                        zVarC.a(b10).t0(new InterfaceC2438f() { // from class: com.facebook.react.modules.network.NetworkingModule.sendRequestInternalReal.2
                            @Override // e9.InterfaceC2438f
                            public void onFailure(InterfaceC2437e call, IOException e10) {
                                AbstractC2855l.g(call, "call");
                                AbstractC2855l.g(e10, "e");
                                if (NetworkingModule.this.shuttingDown) {
                                    return;
                                }
                                NetworkingModule.this.removeRequest(requestId);
                                String message = e10.getMessage();
                                if (message == null) {
                                    message = "Error while executing request: " + e10.getClass().getSimpleName();
                                }
                                NetworkEventUtil.onRequestError(reactApplicationContextIfActiveOrWarn, requestId, devToolsRequestId, message, e10);
                            }

                            @Override // e9.InterfaceC2438f
                            public void onResponse(InterfaceC2437e call, D response) throws IOException {
                                AbstractC2855l.g(call, "call");
                                AbstractC2855l.g(response, "response");
                                if (NetworkingModule.this.shuttingDown) {
                                    return;
                                }
                                NetworkingModule.this.removeRequest(requestId);
                                NetworkEventUtil.onResponseReceived(reactApplicationContextIfActiveOrWarn, requestId, devToolsRequestId, url, response);
                                try {
                                    E eD = response.d();
                                    if (eD == null) {
                                        NetworkEventUtil.onRequestError(reactApplicationContextIfActiveOrWarn, requestId, devToolsRequestId, "Response body is null", null);
                                        return;
                                    }
                                    if (q.x("gzip", D.d0(response, "Content-Encoding", null, 2, null), true)) {
                                        p pVar = new p(eD.source());
                                        String strD0 = D.d0(response, "Content-Type", null, 2, null);
                                        eD = E.Companion.a(strD0 != null ? x.f26347g.a(strD0) : null, -1L, AbstractC3386c.a().b(pVar));
                                    }
                                    if (eD == null) {
                                        throw new IllegalStateException("Required value was null.");
                                    }
                                    for (ResponseHandler responseHandler : NetworkingModule.this.responseHandlers) {
                                        if (responseHandler.supports(responseType)) {
                                            byte[] bArrBytes = eD.bytes();
                                            NetworkEventUtil.onDataReceived(reactApplicationContextIfActiveOrWarn, requestId, devToolsRequestId, responseHandler.toResponseData(bArrBytes), bArrBytes);
                                            NetworkEventUtil.onRequestSuccess(reactApplicationContextIfActiveOrWarn, requestId, devToolsRequestId, eD.contentLength());
                                            return;
                                        }
                                    }
                                    if (useIncrementalUpdates && AbstractC2855l.b(responseType, ReactTextInputShadowNode.PROP_TEXT)) {
                                        NetworkingModule.this.readWithProgress(requestId, devToolsRequestId, eD);
                                        NetworkEventUtil.onRequestSuccess(reactApplicationContextIfActiveOrWarn, requestId, devToolsRequestId, eD.contentLength());
                                        return;
                                    }
                                    String strString = PointerEventHelper.POINTER_TYPE_UNKNOWN;
                                    if (AbstractC2855l.b(responseType, ReactTextInputShadowNode.PROP_TEXT)) {
                                        try {
                                            strString = eD.string();
                                        } catch (IOException e10) {
                                            if (!q.x(response.m().c(), "HEAD", true)) {
                                                NetworkEventUtil.onRequestError(reactApplicationContextIfActiveOrWarn, requestId, devToolsRequestId, e10.getMessage(), e10);
                                            }
                                        }
                                    } else if (AbstractC2855l.b(responseType, NetworkingModule.REQUEST_BODY_KEY_BASE64)) {
                                        strString = Base64.encodeToString(eD.bytes(), 2);
                                    }
                                    NetworkEventUtil.onDataReceived(reactApplicationContextIfActiveOrWarn, requestId, devToolsRequestId, strString, responseType);
                                    NetworkEventUtil.onRequestSuccess(reactApplicationContextIfActiveOrWarn, requestId, devToolsRequestId, eD.contentLength());
                                } catch (IOException e11) {
                                    NetworkEventUtil.onRequestError(reactApplicationContextIfActiveOrWarn, requestId, devToolsRequestId, e11.getMessage(), e11);
                                }
                            }
                        });
                        return;
                    } catch (Exception e10) {
                        NetworkEventUtil.onRequestError(reactApplicationContextIfActiveOrWarn, requestId, devToolsRequestId, e10.getMessage(), e10);
                        return;
                    }
                }
                next2 = it.next();
                AbstractC2855l.d(uri);
            } while (!next2.supports(uri, responseType));
            Pair<WritableMap, byte[]> pairFetch = next2.fetch(uri);
            WritableMap writableMap = (WritableMap) pairFetch.getFirst();
            byte[] bArr = (byte[]) pairFetch.getSecond();
            byte[] bytes2 = writableMap.toString().getBytes(C1385d.f8858b);
            AbstractC2855l.f(bytes2, "getBytes(...)");
            int length = bytes2.length;
            D.a aVarP = new D.a().p(A.HTTP_1_1);
            B.a aVar3 = new B.a();
            if (url != null) {
                str = url;
            }
            NetworkEventUtil.onResponseReceived(reactApplicationContextIfActiveOrWarn, requestId, devToolsRequestId, url, aVarP.r(aVar3.m(str).b()).g(200).m("OK").c());
            NetworkEventUtil.onDataReceived(reactApplicationContextIfActiveOrWarn, requestId, devToolsRequestId, writableMap, bArr);
            NetworkEventUtil.onRequestSuccess(reactApplicationContextIfActiveOrWarn, requestId, devToolsRequestId, length);
        } catch (IOException e11) {
            NetworkEventUtil.onRequestError(reactApplicationContextIfActiveOrWarn, requestId, devToolsRequestId, e11.getMessage(), e11);
        }
    }

    public static final void setCustomClientBuilder(com.facebook.react.modules.network.CustomClientBuilder customClientBuilder2) {
        INSTANCE.setCustomClientBuilder(customClientBuilder2);
    }

    private final C wrapRequestBodyWithProgressEmitter(C requestBody, final int requestId) {
        if (requestBody == null) {
            return null;
        }
        final ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        return RequestBodyUtil.createProgressRequest(requestBody, new ProgressListener() { // from class: com.facebook.react.modules.network.NetworkingModule.wrapRequestBodyWithProgressEmitter.1
            private long last = System.nanoTime();

            public final long getLast() {
                return this.last;
            }

            @Override // com.facebook.react.modules.network.ProgressListener
            public void onProgress(long bytesWritten, long contentLength, boolean done) {
                long jNanoTime = System.nanoTime();
                if (done || NetworkingModule.INSTANCE.shouldDispatch(jNanoTime, this.last)) {
                    NetworkEventUtil.onDataSend(reactApplicationContextIfActiveOrWarn, requestId, bytesWritten, contentLength);
                    this.last = jNanoTime;
                }
            }

            public final void setLast(long j10) {
                this.last = j10;
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    public void abortRequest(double requestIdAsDouble) {
        int i10 = (int) requestIdAsDouble;
        cancelRequest(i10);
        removeRequest(i10);
    }

    public final void addRequestBodyHandler$ReactAndroid_release(RequestBodyHandler handler) {
        AbstractC2855l.g(handler, "handler");
        this.requestBodyHandlers.add(handler);
    }

    public final void addResponseHandler$ReactAndroid_release(ResponseHandler handler) {
        AbstractC2855l.g(handler, "handler");
        this.responseHandlers.add(handler);
    }

    public final void addUriHandler$ReactAndroid_release(UriHandler handler) {
        AbstractC2855l.g(handler, "handler");
        this.uriHandlers.add(handler);
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    @ReactMethod
    public void clearCookies(Callback callback) {
        AbstractC2855l.g(callback, "callback");
        this.cookieHandler.clearCookies(callback);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        CookieJarContainer cookieJarContainer = this.cookieJarContainer;
        if (cookieJarContainer != null) {
            cookieJarContainer.setCookieJar(new w(this.cookieHandler));
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        this.shuttingDown = true;
        cancelAllRequests();
        this.cookieHandler.destroy();
        CookieJarContainer cookieJarContainer = this.cookieJarContainer;
        if (cookieJarContainer != null) {
            cookieJarContainer.removeCookieJar();
        }
        this.requestBodyHandlers.clear();
        this.responseHandlers.clear();
        this.uriHandlers.clear();
    }

    public final void removeRequestBodyHandler$ReactAndroid_release(RequestBodyHandler handler) {
        AbstractC2855l.g(handler, "handler");
        this.requestBodyHandlers.remove(handler);
    }

    public final void removeResponseHandler$ReactAndroid_release(ResponseHandler handler) {
        AbstractC2855l.g(handler, "handler");
        this.responseHandlers.remove(handler);
    }

    public final void removeUriHandler$ReactAndroid_release(UriHandler handler) {
        AbstractC2855l.g(handler, "handler");
        this.uriHandlers.remove(handler);
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    public void sendRequest(String method, String url, double requestIdAsDouble, ReadableArray headers, ReadableMap data, String responseType, boolean useIncrementalUpdates, double timeoutAsDouble, boolean withCredentials) {
        AbstractC2855l.g(method, "method");
        AbstractC2855l.g(url, "url");
        AbstractC2855l.g(responseType, "responseType");
        int i10 = (int) requestIdAsDouble;
        int i11 = (int) timeoutAsDouble;
        String strExtractOrGenerateDevToolsRequestId = extractOrGenerateDevToolsRequestId(data);
        try {
            sendRequestInternalReal(method, url, i10, headers, data, responseType, useIncrementalUpdates, i11, withCredentials, strExtractOrGenerateDevToolsRequestId);
        } catch (Throwable th) {
            AbstractC2325a.n("Networking", "Failed to send url request: " + url, th);
            NetworkEventUtil.onRequestError(getReactApplicationContextIfActiveOrWarn(), i10, strExtractOrGenerateDevToolsRequestId, th.getMessage(), th);
        }
    }

    public final void sendRequestInternal(String method, String url, int requestId, ReadableArray headers, ReadableMap data, String responseType, boolean useIncrementalUpdates, int timeout, boolean withCredentials) {
        AbstractC2855l.g(method, "method");
        AbstractC2855l.g(responseType, "responseType");
        sendRequestInternalReal(method, url, requestId, headers, data, responseType, useIncrementalUpdates, timeout, withCredentials, extractOrGenerateDevToolsRequestId(data));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NetworkingModule(ReactApplicationContext context, String str, z client) {
        this(context, str, client, null);
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(client, "client");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NetworkingModule(ReactApplicationContext context) {
        AbstractC2855l.g(context, "context");
        Context applicationContext = context.getApplicationContext();
        AbstractC2855l.f(applicationContext, "getApplicationContext(...)");
        this(context, null, OkHttpClientProvider.createClient(applicationContext), null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NetworkingModule(ReactApplicationContext context, List<? extends NetworkInterceptorCreator> list) {
        AbstractC2855l.g(context, "context");
        Context applicationContext = context.getApplicationContext();
        AbstractC2855l.f(applicationContext, "getApplicationContext(...)");
        this(context, null, OkHttpClientProvider.createClient(applicationContext), list);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NetworkingModule(ReactApplicationContext context, String str) {
        AbstractC2855l.g(context, "context");
        Context applicationContext = context.getApplicationContext();
        AbstractC2855l.f(applicationContext, "getApplicationContext(...)");
        this(context, str, OkHttpClientProvider.createClient(applicationContext), null);
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    public void addListener(String eventName) {
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    public void removeListeners(double count) {
    }
}
