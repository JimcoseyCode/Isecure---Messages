package com.facebook.react.packagerconnection;

import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import com.facebook.react.uimanager.events.PointerEventHelper;
import d2.AbstractC2325a;
import i7.C2735B;
import j7.AbstractC2800q;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.I;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00192\u00020\u0001:\u0002\u001a\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u0003R\u0016\u0010\u000f\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/facebook/react/packagerconnection/FileIoHandler;", "Ljava/lang/Runnable;", "<init>", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "filename", PointerEventHelper.POINTER_TYPE_UNKNOWN, "addOpenFile", "(Ljava/lang/String;)I", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/react/packagerconnection/RequestHandler;", "handlers", "()Ljava/util/Map;", "Li7/B;", "run", "nextHandle", "I", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/react/packagerconnection/FileIoHandler$TtlFileInputStream;", "openFiles", "Ljava/util/Map;", "requestHandlers", "Companion", "TtlFileInputStream", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FileIoHandler implements Runnable {
    private static final Companion Companion = new Companion(null);
    private static final long FILE_TTL = 30000;
    private static final String TAG;
    private final Map<String, RequestHandler> requestHandlers;
    private int nextHandle = 1;
    private final Handler handler = new Handler(Looper.getMainLooper());
    private final Map<Integer, TtlFileInputStream> openFiles = new LinkedHashMap();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/facebook/react/packagerconnection/FileIoHandler$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "TAG", PointerEventHelper.POINTER_TYPE_UNKNOWN, "FILE_TTL", PointerEventHelper.POINTER_TYPE_UNKNOWN, "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\bR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/facebook/react/packagerconnection/FileIoHandler$TtlFileInputStream;", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "path", "<init>", "(Ljava/lang/String;)V", "Li7/B;", "extendTtl", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "expiredTtl", "()Z", PointerEventHelper.POINTER_TYPE_UNKNOWN, "size", "read", "(I)Ljava/lang/String;", "close", "Ljava/io/FileInputStream;", "stream", "Ljava/io/FileInputStream;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "ttl", "J", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class TtlFileInputStream {
        private final FileInputStream stream;
        private long ttl = System.currentTimeMillis() + FileIoHandler.FILE_TTL;

        public TtlFileInputStream(String str) {
            this.stream = new FileInputStream(str);
        }

        private final void extendTtl() {
            this.ttl = System.currentTimeMillis() + FileIoHandler.FILE_TTL;
        }

        public final void close() throws IOException {
            this.stream.close();
        }

        public final boolean expiredTtl() {
            return System.currentTimeMillis() >= this.ttl;
        }

        public final String read(int size) throws IOException {
            extendTtl();
            byte[] bArr = new byte[size];
            String strEncodeToString = Base64.encodeToString(bArr, 0, this.stream.read(bArr), 0);
            AbstractC2855l.f(strEncodeToString, "encodeToString(...)");
            return strEncodeToString;
        }
    }

    static {
        String simpleName = JSPackagerClient.class.getSimpleName();
        AbstractC2855l.f(simpleName, "getSimpleName(...)");
        TAG = simpleName;
    }

    public FileIoHandler() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.requestHandlers = linkedHashMap;
        linkedHashMap.put("fopen", new RequestOnlyHandler() { // from class: com.facebook.react.packagerconnection.FileIoHandler.1
            @Override // com.facebook.react.packagerconnection.RequestOnlyHandler, com.facebook.react.packagerconnection.RequestHandler
            public void onRequest(Object params, Responder responder) {
                JSONObject jSONObject;
                AbstractC2855l.g(responder, "responder");
                Map map = FileIoHandler.this.openFiles;
                FileIoHandler fileIoHandler = FileIoHandler.this;
                synchronized (map) {
                    try {
                        try {
                            jSONObject = (JSONObject) params;
                        } catch (Exception e10) {
                            responder.error(e10.toString());
                        }
                        if (jSONObject == null) {
                            throw new Exception("params must be an object { mode: string, filename: string }");
                        }
                        String strOptString = jSONObject.optString("mode");
                        if (strOptString == null) {
                            throw new Exception("missing params.mode");
                        }
                        String strOptString2 = jSONObject.optString("filename");
                        if (strOptString2 == null) {
                            throw new Exception("missing params.filename");
                        }
                        if (!AbstractC2855l.b(strOptString, "r")) {
                            throw new IllegalArgumentException(("unsupported mode: " + strOptString).toString());
                        }
                        responder.respond(Integer.valueOf(fileIoHandler.addOpenFile(strOptString2)));
                        C2735B c2735b = C2735B.f28704a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
        linkedHashMap.put("fclose", new RequestOnlyHandler() { // from class: com.facebook.react.packagerconnection.FileIoHandler.2
            @Override // com.facebook.react.packagerconnection.RequestOnlyHandler, com.facebook.react.packagerconnection.RequestHandler
            public void onRequest(Object params, Responder responder) {
                AbstractC2855l.g(responder, "responder");
                Map map = FileIoHandler.this.openFiles;
                FileIoHandler fileIoHandler = FileIoHandler.this;
                synchronized (map) {
                    try {
                        try {
                        } catch (Exception e10) {
                            responder.error(e10.toString());
                        }
                        if (!(params instanceof Number)) {
                            throw new Exception("params must be a file handle");
                        }
                        TtlFileInputStream ttlFileInputStream = (TtlFileInputStream) fileIoHandler.openFiles.get(params);
                        if (ttlFileInputStream == null) {
                            throw new Exception("invalid file handle, it might have timed out");
                        }
                        I.c(fileIoHandler.openFiles).remove(params);
                        ttlFileInputStream.close();
                        responder.respond(PointerEventHelper.POINTER_TYPE_UNKNOWN);
                        C2735B c2735b = C2735B.f28704a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
        linkedHashMap.put("fread", new RequestOnlyHandler() { // from class: com.facebook.react.packagerconnection.FileIoHandler.3
            @Override // com.facebook.react.packagerconnection.RequestOnlyHandler, com.facebook.react.packagerconnection.RequestHandler
            public void onRequest(Object params, Responder responder) {
                JSONObject jSONObject;
                AbstractC2855l.g(responder, "responder");
                Map map = FileIoHandler.this.openFiles;
                FileIoHandler fileIoHandler = FileIoHandler.this;
                synchronized (map) {
                    try {
                        try {
                            jSONObject = (JSONObject) params;
                        } catch (Exception e10) {
                            responder.error(e10.toString());
                        }
                        if (jSONObject == null) {
                            throw new Exception("params must be an object { file: handle, size: number }");
                        }
                        int iOptInt = jSONObject.optInt("file");
                        if (iOptInt == 0) {
                            throw new Exception("invalid or missing file handle");
                        }
                        int iOptInt2 = jSONObject.optInt("size");
                        if (iOptInt2 == 0) {
                            throw new Exception("invalid or missing read size");
                        }
                        TtlFileInputStream ttlFileInputStream = (TtlFileInputStream) fileIoHandler.openFiles.get(Integer.valueOf(iOptInt));
                        if (ttlFileInputStream == null) {
                            throw new Exception("invalid file handle, it might have timed out");
                        }
                        responder.respond(ttlFileInputStream.read(iOptInt2));
                        C2735B c2735b = C2735B.f28704a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int addOpenFile(String filename) throws FileNotFoundException {
        int i10 = this.nextHandle;
        this.nextHandle = i10 + 1;
        this.openFiles.put(Integer.valueOf(i10), new TtlFileInputStream(filename));
        if (this.openFiles.size() == 1) {
            this.handler.postDelayed(this, FILE_TTL);
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean run$lambda$1$lambda$0(Map.Entry entry) {
        AbstractC2855l.g(entry, "<destruct>");
        TtlFileInputStream ttlFileInputStream = (TtlFileInputStream) entry.getValue();
        if (!ttlFileInputStream.expiredTtl()) {
            return false;
        }
        try {
            ttlFileInputStream.close();
            return true;
        } catch (IOException e10) {
            AbstractC2325a.n(TAG, "Failed to close expired file", e10);
            return true;
        }
    }

    public final Map<String, RequestHandler> handlers() {
        return this.requestHandlers;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.openFiles) {
            try {
                AbstractC2800q.F(this.openFiles.entrySet(), new Function1() { // from class: com.facebook.react.packagerconnection.a
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(FileIoHandler.run$lambda$1$lambda$0((Map.Entry) obj));
                    }
                });
                if (!this.openFiles.isEmpty()) {
                    this.handler.postDelayed(this, FILE_TTL);
                }
                C2735B c2735b = C2735B.f28704a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
