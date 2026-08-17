package com.facebook.react.devsupport;

import com.facebook.react.common.DebugServerException;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.devsupport.MultipartStreamReader;
import com.facebook.react.devsupport.interfaces.DevBundleDownloadListener;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.events.PointerEventHelper;
import d2.AbstractC2325a;
import e9.B;
import e9.InterfaceC2437e;
import e9.InterfaceC2438f;
import expo.modules.interfaces.permissions.PermissionsResponse;
import expo.modules.notifications.notifications.presentation.builders.ExpoNotificationBuilder;
import i7.C2735B;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o3.AbstractC3007a;
import org.json.JSONException;
import org.json.JSONObject;
import t7.AbstractC3376c;
import t9.AbstractC3386c;
import t9.C3391h;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 %2\u00020\u0001:\u0002&%B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JA\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013JI\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ=\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u001e\u001a\u00020\u001dH\u0007¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lcom/facebook/react/devsupport/BundleDownloader;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Le9/z;", "client", "<init>", "(Le9/z;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "url", "Le9/D;", "response", "boundary", "Ljava/io/File;", "outputFile", "Lcom/facebook/react/devsupport/BundleDownloader$BundleInfo;", "bundleInfo", "Lcom/facebook/react/devsupport/interfaces/DevBundleDownloadListener;", "callback", "Li7/B;", "processMultipartResponse", "(Ljava/lang/String;Le9/D;Ljava/lang/String;Ljava/io/File;Lcom/facebook/react/devsupport/BundleDownloader$BundleInfo;Lcom/facebook/react/devsupport/interfaces/DevBundleDownloadListener;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "statusCode", "Le9/t;", "headers", "Lt9/j;", ExpoNotificationBuilder.EXTRAS_BODY_KEY, "processBundleResult", "(Ljava/lang/String;ILe9/t;Lt9/j;Ljava/io/File;Lcom/facebook/react/devsupport/BundleDownloader$BundleInfo;Lcom/facebook/react/devsupport/interfaces/DevBundleDownloadListener;)V", "bundleURL", "Le9/B$a;", "requestBuilder", "downloadBundleFromURL", "(Lcom/facebook/react/devsupport/interfaces/DevBundleDownloadListener;Ljava/io/File;Ljava/lang/String;Lcom/facebook/react/devsupport/BundleDownloader$BundleInfo;Le9/B$a;)V", "Le9/z;", "Le9/e;", "downloadBundleFromURLCall", "Le9/e;", "Companion", "BundleInfo", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BundleDownloader {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int FILES_CHANGED_COUNT_NOT_BUILT_BY_BUNDLER = -2;
    private static final String TAG = "BundleDownloader";
    private final e9.z client;
    private InterfaceC2437e downloadBundleFromURLCall;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R$\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/facebook/react/devsupport/BundleDownloader$BundleInfo;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "_url", PointerEventHelper.POINTER_TYPE_UNKNOWN, "get_url$ReactAndroid_release", "()Ljava/lang/String;", "set_url$ReactAndroid_release", "(Ljava/lang/String;)V", "url", "getUrl", "value", PointerEventHelper.POINTER_TYPE_UNKNOWN, "filesChangedCount", "getFilesChangedCount", "()I", "setFilesChangedCount$ReactAndroid_release", "(I)V", "toJSONString", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BundleInfo {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private String _url;
        private int filesChangedCount;

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/facebook/react/devsupport/BundleDownloader$BundleInfo$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "fromJSONString", "Lcom/facebook/react/devsupport/BundleDownloader$BundleInfo;", "jsonStr", PointerEventHelper.POINTER_TYPE_UNKNOWN, "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final BundleInfo fromJSONString(String jsonStr) {
                if (jsonStr == null) {
                    return null;
                }
                try {
                    JSONObject jSONObject = new JSONObject(jsonStr);
                    BundleInfo bundleInfo = new BundleInfo();
                    bundleInfo.set_url$ReactAndroid_release(jSONObject.getString("url"));
                    bundleInfo.setFilesChangedCount$ReactAndroid_release(jSONObject.getInt("filesChangedCount"));
                    return bundleInfo;
                } catch (JSONException e10) {
                    AbstractC2325a.n(BundleDownloader.TAG, "Invalid bundle info: ", e10);
                    return null;
                }
            }

            private Companion() {
            }
        }

        public static final BundleInfo fromJSONString(String str) {
            return INSTANCE.fromJSONString(str);
        }

        public final int getFilesChangedCount() {
            return this.filesChangedCount;
        }

        public final String getUrl() {
            String str = this._url;
            return str == null ? "unknown" : str;
        }

        /* JADX INFO: renamed from: get_url$ReactAndroid_release, reason: from getter */
        public final String get_url() {
            return this._url;
        }

        public final void setFilesChangedCount$ReactAndroid_release(int i10) {
            this.filesChangedCount = i10;
        }

        public final void set_url$ReactAndroid_release(String str) {
            this._url = str;
        }

        public final String toJSONString() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", this._url);
                jSONObject.put("filesChangedCount", this.filesChangedCount);
                return jSONObject.toString();
            } catch (JSONException e10) {
                AbstractC2325a.n(BundleDownloader.TAG, "Can't serialize bundle info: ", e10);
                return null;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/facebook/react/devsupport/BundleDownloader$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "Lt9/j;", ExpoNotificationBuilder.EXTRAS_BODY_KEY, "Ljava/io/File;", "outputFile", PointerEventHelper.POINTER_TYPE_UNKNOWN, "storePlainJSInFile", "(Lt9/j;Ljava/io/File;)Z", PointerEventHelper.POINTER_TYPE_UNKNOWN, "url", "Le9/t;", "headers", "Lcom/facebook/react/devsupport/BundleDownloader$BundleInfo;", "bundleInfo", "Li7/B;", "populateBundleInfo", "(Ljava/lang/String;Le9/t;Lcom/facebook/react/devsupport/BundleDownloader$BundleInfo;)V", "TAG", "Ljava/lang/String;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "FILES_CHANGED_COUNT_NOT_BUILT_BY_BUNDLER", "I", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void populateBundleInfo(String url, e9.t headers, BundleInfo bundleInfo) {
            bundleInfo.set_url$ReactAndroid_release(url);
            String strO = headers.o("X-Metro-Files-Changed-Count");
            if (strO != null) {
                try {
                    bundleInfo.setFilesChangedCount$ReactAndroid_release(Integer.parseInt(strO));
                } catch (NumberFormatException e10) {
                    bundleInfo.setFilesChangedCount$ReactAndroid_release(BundleDownloader.FILES_CHANGED_COUNT_NOT_BUILT_BY_BUNDLER);
                    AbstractC2325a.n(BundleDownloader.TAG, "Can't populate bundle info: ", e10);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean storePlainJSInFile(t9.j body, File outputFile) throws IOException {
            t9.D dC = AbstractC3386c.a().c(outputFile);
            try {
                body.r0(dC);
                AbstractC3376c.a(dC, null);
                return true;
            } finally {
            }
        }

        private Companion() {
        }
    }

    public BundleDownloader(e9.z client) {
        AbstractC2855l.g(client, "client");
        this.client = client;
    }

    public static /* synthetic */ void downloadBundleFromURL$default(BundleDownloader bundleDownloader, DevBundleDownloadListener devBundleDownloadListener, File file, String str, BundleInfo bundleInfo, B.a aVar, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            aVar = new B.a();
        }
        bundleDownloader.downloadBundleFromURL(devBundleDownloadListener, file, str, bundleInfo, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processBundleResult(String url, int statusCode, e9.t headers, t9.j body, File outputFile, BundleInfo bundleInfo, DevBundleDownloadListener callback) throws IOException {
        if (statusCode == 200) {
            if (bundleInfo != null) {
                INSTANCE.populateBundleInfo(url, headers, bundleInfo);
            }
            File file = new File(outputFile.getPath() + ".tmp");
            if (!INSTANCE.storePlainJSInFile(body, file) || file.renameTo(outputFile)) {
                callback.onSuccess();
                return;
            }
            throw new IOException("Couldn't rename " + file + " to " + outputFile);
        }
        String strQ0 = body.q0();
        DebugServerException debugServerException = DebugServerException.INSTANCE.parse(url, strQ0);
        if (debugServerException != null) {
            callback.onFailure(debugServerException);
            return;
        }
        String str = "The development server returned response error code: " + statusCode + "\n\nURL: " + url + "\n\nBody:\n" + strQ0;
        AbstractC2855l.f(str, "toString(...)");
        callback.onFailure(new DebugServerException(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processMultipartResponse(final String url, final e9.D response, String boundary, final File outputFile, final BundleInfo bundleInfo, final DevBundleDownloadListener callback) throws IOException {
        if (response.d() == null) {
            callback.onFailure(new DebugServerException(P8.q.j("\n                    Error while reading multipart response.\n                    \n                    Response body was empty: " + response.e() + "\n                    \n                    URL: " + url + "\n                    \n                    \n                    ")));
            return;
        }
        e9.E eD = response.d();
        t9.j jVarSource = eD != null ? eD.source() : null;
        if (jVarSource == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if (new MultipartStreamReader(jVarSource, boundary).readAllParts(new MultipartStreamReader.ChunkListener() { // from class: com.facebook.react.devsupport.BundleDownloader$processMultipartResponse$completed$1
            @Override // com.facebook.react.devsupport.MultipartStreamReader.ChunkListener
            public void onChunkComplete(Map<String, String> headers, C3391h body, boolean isLastChunk) throws IOException {
                AbstractC2855l.g(headers, "headers");
                AbstractC2855l.g(body, "body");
                if (isLastChunk) {
                    int iE = response.e();
                    if (headers.containsKey("X-Http-Status")) {
                        iE = Integer.parseInt(headers.getOrDefault("X-Http-Status", "0"));
                    }
                    this.processBundleResult(url, iE, e9.t.f26320h.a(headers), body, outputFile, bundleInfo, callback);
                    return;
                }
                if (headers.containsKey("Content-Type") && AbstractC2855l.b(headers.get("Content-Type"), "application/json")) {
                    try {
                        JSONObject jSONObject = new JSONObject(body.q0());
                        callback.onProgress(jSONObject.has(PermissionsResponse.STATUS_KEY) ? jSONObject.getString(PermissionsResponse.STATUS_KEY) : "Bundling", jSONObject.has("done") ? Integer.valueOf(jSONObject.getInt("done")) : null, jSONObject.has("total") ? Integer.valueOf(jSONObject.getInt("total")) : null);
                    } catch (JSONException e10) {
                        AbstractC2325a.m(ReactConstants.TAG, "Error parsing progress JSON. " + e10);
                    }
                }
            }

            @Override // com.facebook.react.devsupport.MultipartStreamReader.ChunkListener
            public void onChunkProgress(Map<String, String> headers, long loaded, long total) {
                AbstractC2855l.g(headers, "headers");
                if (AbstractC2855l.b("application/javascript", headers.get("Content-Type"))) {
                    DevBundleDownloadListener devBundleDownloadListener = callback;
                    long j10 = IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
                    devBundleDownloadListener.onProgress("Downloading", Integer.valueOf((int) (loaded / j10)), Integer.valueOf((int) (total / j10)));
                }
            }
        })) {
            return;
        }
        callback.onFailure(new DebugServerException(P8.q.j("\n                    Error while reading multipart response.\n                    \n                    Response code: " + response.e() + "\n                    \n                    URL: " + url + "\n                    \n                    \n                    ")));
    }

    public final void downloadBundleFromURL(DevBundleDownloadListener callback, File outputFile, String str, BundleInfo bundleInfo) {
        AbstractC2855l.g(callback, "callback");
        AbstractC2855l.g(outputFile, "outputFile");
        downloadBundleFromURL$default(this, callback, outputFile, str, bundleInfo, null, 16, null);
    }

    public final void downloadBundleFromURL(final DevBundleDownloadListener callback, final File outputFile, String bundleURL, final BundleInfo bundleInfo, B.a requestBuilder) {
        AbstractC2855l.g(callback, "callback");
        AbstractC2855l.g(outputFile, "outputFile");
        AbstractC2855l.g(requestBuilder, "requestBuilder");
        if (bundleURL == null) {
            throw new IllegalStateException("Required value was null.");
        }
        InterfaceC2437e interfaceC2437eA = this.client.a(requestBuilder.m(bundleURL).a("Accept", "multipart/mixed").b());
        this.downloadBundleFromURLCall = interfaceC2437eA;
        if (interfaceC2437eA == null) {
            throw new IllegalStateException("Required value was null.");
        }
        interfaceC2437eA.t0(new InterfaceC2438f() { // from class: com.facebook.react.devsupport.BundleDownloader.downloadBundleFromURL.1
            @Override // e9.InterfaceC2438f
            public void onFailure(InterfaceC2437e call, IOException e10) {
                InterfaceC2437e interfaceC2437e;
                AbstractC2855l.g(call, "call");
                AbstractC2855l.g(e10, "e");
                if (BundleDownloader.this.downloadBundleFromURLCall == null || ((interfaceC2437e = BundleDownloader.this.downloadBundleFromURLCall) != null && interfaceC2437e.s())) {
                    BundleDownloader.this.downloadBundleFromURLCall = null;
                    return;
                }
                BundleDownloader.this.downloadBundleFromURLCall = null;
                String string = call.d().d().toString();
                callback.onFailure(DebugServerException.INSTANCE.makeGeneric(string, "Could not connect to development server.", "URL: " + string, e10));
            }

            /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
            
                if (r11.s() == true) goto L10;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r11v10 */
            /* JADX WARN: Type inference failed for: r11v15, types: [e9.D] */
            /* JADX WARN: Type inference failed for: r11v16, types: [java.io.Closeable] */
            /* JADX WARN: Type inference failed for: r11v17 */
            /* JADX WARN: Type inference failed for: r11v18 */
            /* JADX WARN: Type inference failed for: r11v19 */
            /* JADX WARN: Type inference failed for: r11v2 */
            /* JADX WARN: Type inference failed for: r11v20 */
            /* JADX WARN: Type inference failed for: r11v3, types: [java.io.Closeable] */
            /* JADX WARN: Type inference failed for: r11v4 */
            /* JADX WARN: Type inference failed for: r11v5, types: [e9.e] */
            /* JADX WARN: Type inference failed for: r11v6 */
            @Override // e9.InterfaceC2438f
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void onResponse(InterfaceC2437e call, e9.D response) throws IOException {
                ?? r11;
                Throwable th;
                ?? r112;
                ?? r113;
                AbstractC2855l.g(call, "call");
                AbstractC2855l.g(response, "response");
                BundleDownloader bundleDownloader = BundleDownloader.this;
                File file = outputFile;
                BundleInfo bundleInfo2 = bundleInfo;
                DevBundleDownloadListener devBundleDownloadListener = callback;
                try {
                    r11 = bundleDownloader.downloadBundleFromURLCall;
                    try {
                        if (r11 != 0) {
                            InterfaceC2437e interfaceC2437e = bundleDownloader.downloadBundleFromURLCall;
                            if (interfaceC2437e != null) {
                                try {
                                } catch (Throwable th2) {
                                    th = th2;
                                    r112 = response;
                                    try {
                                        throw th;
                                    } catch (Throwable th3) {
                                        AbstractC3376c.a(r112, th);
                                        throw th3;
                                    }
                                }
                            }
                            bundleDownloader.downloadBundleFromURLCall = null;
                            String string = response.m().d().toString();
                            String strD0 = e9.D.d0(response, "content-type", null, 2, null);
                            if (strD0 == null) {
                                strD0 = PointerEventHelper.POINTER_TYPE_UNKNOWN;
                            }
                            Matcher matcher = Pattern.compile("multipart/mixed;.*boundary=\"([^\"]+)\"").matcher(strD0);
                            if (strD0.length() <= 0 || !matcher.find()) {
                                r11 = response;
                                e9.E eD = r11.d();
                                if (eD != null) {
                                    try {
                                        bundleDownloader.processBundleResult(string, r11.e(), r11.k(), eD.source(), file, bundleInfo2, devBundleDownloadListener);
                                    } finally {
                                    }
                                }
                                C2735B c2735b = C2735B.f28704a;
                                AbstractC3376c.a(eD, null);
                                r113 = r11;
                            } else {
                                String str = (String) AbstractC3007a.c(matcher.group(1));
                                AbstractC2855l.d(str);
                                try {
                                    bundleDownloader.processMultipartResponse(string, response, str, file, bundleInfo2, devBundleDownloadListener);
                                    r113 = response;
                                } catch (Throwable th4) {
                                    th = th4;
                                    r11 = response;
                                    th = th;
                                    r112 = r11;
                                    throw th;
                                }
                            }
                            C2735B c2735b2 = C2735B.f28704a;
                            AbstractC3376c.a(r113, null);
                            return;
                        }
                        bundleDownloader.downloadBundleFromURLCall = null;
                        AbstractC3376c.a(response, null);
                    } catch (Throwable th5) {
                        th = th5;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    r11 = response;
                }
            }
        });
    }
}
