package com.facebook.react.modules.blob;

import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.facebook.fbreact.specs.NativeBlobModuleSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapBuilder;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.network.NetworkingModule;
import com.facebook.react.modules.websocket.WebSocketModule;
import com.facebook.react.uimanager.events.PointerEventHelper;
import e9.C;
import e9.x;
import expo.modules.notifications.service.NotificationsService;
import i7.C2735B;
import i7.t;
import j7.K;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.A;
import kotlin.jvm.internal.AbstractC2855l;
import t7.AbstractC3376c;
import t9.k;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@ReactModule(name = "BlobModule")
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0004;>AD\b\u0007\u0018\u0000 K2\u00020\u0001:\u0001KB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\rJ\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00160\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u000b¢\u0006\u0004\b\u001a\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u000bH\u0007¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u0004\u0018\u00010\b2\u0006\u0010#\u001a\u00020\u0006¢\u0006\u0004\b$\u0010\nJ)\u0010$\u001a\u0004\u0018\u00010\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u000b2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020%¢\u0006\u0004\b$\u0010(J\u0017\u0010$\u001a\u0004\u0018\u00010\b2\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b$\u0010+J\u000f\u0010,\u001a\u00020\u0012H\u0016¢\u0006\u0004\b,\u0010\u0014J\u0017\u0010.\u001a\u00020\u00122\u0006\u0010-\u001a\u00020\u000eH\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\u00122\u0006\u0010-\u001a\u00020\u000eH\u0016¢\u0006\u0004\b0\u0010/J\u001f\u00101\u001a\u00020\u00122\u0006\u0010*\u001a\u00020)2\u0006\u0010-\u001a\u00020\u000eH\u0016¢\u0006\u0004\b1\u00102J\u001f\u00105\u001a\u00020\u00122\u0006\u00104\u001a\u0002032\u0006\u0010\u001c\u001a\u00020\u000bH\u0016¢\u0006\u0004\b5\u00106J\u0017\u00107\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u000bH\u0016¢\u0006\u0004\b7\u0010\"R \u00109\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010E\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010J\u001a\u0004\u0018\u00010G8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bH\u0010I¨\u0006L"}, d2 = {"Lcom/facebook/react/modules/blob/BlobModule;", "Lcom/facebook/fbreact/specs/NativeBlobModuleSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Landroid/net/Uri;", "contentUri", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getBytesFromUri", "(Landroid/net/Uri;)[B", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getNameFromUri", "(Landroid/net/Uri;)Ljava/lang/String;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getLastModifiedFromUri", "(Landroid/net/Uri;)D", "getMimeTypeFromUri", "Li7/B;", "initialize", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "getTypedExportedConstants", "()Ljava/util/Map;", "data", "store", "([B)Ljava/lang/String;", "blobId", "([BLjava/lang/String;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getLengthOfBlob", "(Ljava/lang/String;)J", "remove", "(Ljava/lang/String;)V", "uri", "resolve", PointerEventHelper.POINTER_TYPE_UNKNOWN, "offset", "size", "(Ljava/lang/String;II)[B", "Lcom/facebook/react/bridge/ReadableMap;", "blob", "(Lcom/facebook/react/bridge/ReadableMap;)[B", "addNetworkingHandler", "idDouble", "addWebSocketHandler", "(D)V", "removeWebSocketHandler", "sendOverSocket", "(Lcom/facebook/react/bridge/ReadableMap;D)V", "Lcom/facebook/react/bridge/ReadableArray;", "parts", "createFromParts", "(Lcom/facebook/react/bridge/ReadableArray;Ljava/lang/String;)V", "release", "Ljava/util/HashMap;", "blobs", "Ljava/util/HashMap;", "com/facebook/react/modules/blob/BlobModule$webSocketContentHandler$1", "webSocketContentHandler", "Lcom/facebook/react/modules/blob/BlobModule$webSocketContentHandler$1;", "com/facebook/react/modules/blob/BlobModule$networkingUriHandler$1", "networkingUriHandler", "Lcom/facebook/react/modules/blob/BlobModule$networkingUriHandler$1;", "com/facebook/react/modules/blob/BlobModule$networkingRequestBodyHandler$1", "networkingRequestBodyHandler", "Lcom/facebook/react/modules/blob/BlobModule$networkingRequestBodyHandler$1;", "com/facebook/react/modules/blob/BlobModule$networkingResponseHandler$1", "networkingResponseHandler", "Lcom/facebook/react/modules/blob/BlobModule$networkingResponseHandler$1;", "Lcom/facebook/react/modules/websocket/WebSocketModule;", "getWebSocketModule", "()Lcom/facebook/react/modules/websocket/WebSocketModule;", "webSocketModule", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BlobModule extends NativeBlobModuleSpec {
    public static final String NAME = "BlobModule";
    private final HashMap<String, byte[]> blobs;
    private final BlobModule$networkingRequestBodyHandler$1 networkingRequestBodyHandler;
    private final BlobModule$networkingResponseHandler$1 networkingResponseHandler;
    private final BlobModule$networkingUriHandler$1 networkingUriHandler;
    private final BlobModule$webSocketContentHandler$1 webSocketContentHandler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.facebook.react.modules.blob.BlobModule$webSocketContentHandler$1] */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.facebook.react.modules.blob.BlobModule$networkingUriHandler$1] */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.facebook.react.modules.blob.BlobModule$networkingRequestBodyHandler$1] */
    /* JADX WARN: Type inference failed for: r2v5, types: [com.facebook.react.modules.blob.BlobModule$networkingResponseHandler$1] */
    public BlobModule(ReactApplicationContext reactContext) {
        super(reactContext);
        AbstractC2855l.g(reactContext, "reactContext");
        this.blobs = new HashMap<>();
        this.webSocketContentHandler = new WebSocketModule.ContentHandler() { // from class: com.facebook.react.modules.blob.BlobModule$webSocketContentHandler$1
            @Override // com.facebook.react.modules.websocket.WebSocketModule.ContentHandler
            public void onMessage(String text, WritableMap params) {
                AbstractC2855l.g(text, "text");
                AbstractC2855l.g(params, "params");
                params.putString("data", text);
            }

            @Override // com.facebook.react.modules.websocket.WebSocketModule.ContentHandler
            public void onMessage(k byteString, WritableMap params) {
                AbstractC2855l.g(byteString, "byteString");
                AbstractC2855l.g(params, "params");
                byte[] bArrH = byteString.H();
                BlobModule blobModule = this.this$0;
                WritableMap writableMapCreateMap = Arguments.createMap();
                ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
                readableMapBuilder.put("blobId", blobModule.store(bArrH));
                readableMapBuilder.put("offset", 0);
                readableMapBuilder.put("size", bArrH.length);
                params.putMap("data", writableMapCreateMap);
                params.putString(NotificationsService.EVENT_TYPE_KEY, "blob");
            }
        };
        this.networkingUriHandler = new NetworkingModule.UriHandler() { // from class: com.facebook.react.modules.blob.BlobModule$networkingUriHandler$1
            @Override // com.facebook.react.modules.network.NetworkingModule.UriHandler
            public Pair<WritableMap, byte[]> fetch(Uri uri) throws IOException {
                AbstractC2855l.g(uri, "uri");
                byte[] bytesFromUri = this.this$0.getBytesFromUri(uri);
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putString("blobId", this.this$0.store(bytesFromUri));
                writableMapCreateMap.putInt("offset", 0);
                writableMapCreateMap.putInt("size", bytesFromUri.length);
                writableMapCreateMap.putString(NotificationsService.EVENT_TYPE_KEY, this.this$0.getMimeTypeFromUri(uri));
                writableMapCreateMap.putString("name", this.this$0.getNameFromUri(uri));
                writableMapCreateMap.putDouble("lastModified", this.this$0.getLastModifiedFromUri(uri));
                return t.a(writableMapCreateMap, bytesFromUri);
            }

            @Override // com.facebook.react.modules.network.NetworkingModule.UriHandler
            public boolean supports(Uri uri, String responseType) {
                AbstractC2855l.g(uri, "uri");
                AbstractC2855l.g(responseType, "responseType");
                String scheme = uri.getScheme();
                return (AbstractC2855l.b(scheme, "http") || AbstractC2855l.b(scheme, "https") || !AbstractC2855l.b(responseType, "blob")) ? false : true;
            }
        };
        this.networkingRequestBodyHandler = new NetworkingModule.RequestBodyHandler() { // from class: com.facebook.react.modules.blob.BlobModule$networkingRequestBodyHandler$1
            @Override // com.facebook.react.modules.network.NetworkingModule.RequestBodyHandler
            public boolean supports(ReadableMap map) {
                AbstractC2855l.g(map, "map");
                return map.hasKey("blob");
            }

            @Override // com.facebook.react.modules.network.NetworkingModule.RequestBodyHandler
            public C toRequestBody(ReadableMap map, String contentType) {
                String string;
                AbstractC2855l.g(map, "map");
                if (map.hasKey(NotificationsService.EVENT_TYPE_KEY) && (string = map.getString(NotificationsService.EVENT_TYPE_KEY)) != null && string.length() != 0) {
                    contentType = map.getString(NotificationsService.EVENT_TYPE_KEY);
                }
                if (contentType == null) {
                    contentType = "application/octet-stream";
                }
                ReadableMap map2 = map.getMap("blob");
                if (map2 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                byte[] bArrResolve = this.this$0.resolve(map2.getString("blobId"), map2.getInt("offset"), map2.getInt("size"));
                if (bArrResolve != null) {
                    return C.a.i(C.Companion, x.f26347g.a(contentType), bArrResolve, 0, 0, 12, null);
                }
                throw new IllegalStateException("Required value was null.");
            }
        };
        this.networkingResponseHandler = new NetworkingModule.ResponseHandler() { // from class: com.facebook.react.modules.blob.BlobModule$networkingResponseHandler$1
            @Override // com.facebook.react.modules.network.NetworkingModule.ResponseHandler
            public boolean supports(String responseType) {
                AbstractC2855l.g(responseType, "responseType");
                return AbstractC2855l.b(responseType, "blob");
            }

            @Override // com.facebook.react.modules.network.NetworkingModule.ResponseHandler
            public WritableMap toResponseData(byte[] data) {
                AbstractC2855l.g(data, "data");
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putString("blobId", this.this$0.store(data));
                writableMapCreateMap.putInt("offset", 0);
                writableMapCreateMap.putInt("size", data.length);
                return writableMapCreateMap;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] getBytesFromUri(Uri contentUri) throws IOException {
        InputStream inputStreamOpenInputStream = getReactApplicationContext().getContentResolver().openInputStream(contentUri);
        if (inputStreamOpenInputStream == null) {
            throw new FileNotFoundException("File not found for " + contentUri);
        }
        try {
            byte[] bArr = new byte[Math.max(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET, inputStreamOpenInputStream.available())];
            A a10 = new A();
            byte[] bArr2 = new byte[IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int i10 = 0;
            while (true) {
                int i11 = inputStreamOpenInputStream.read(bArr);
                a10.f29369g = i11;
                if (i11 == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr2, 0, i10);
                i10 = a10.f29369g;
                byte[] bArr3 = bArr2;
                bArr2 = bArr;
                bArr = bArr3;
            }
            if (byteArrayOutputStream.size() == 0 && bArr2.length == i10) {
                inputStreamOpenInputStream.close();
                return bArr2;
            }
            byteArrayOutputStream.write(bArr2, 0, i10);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            AbstractC2855l.f(byteArray, "toByteArray(...)");
            inputStreamOpenInputStream.close();
            return byteArray;
        } catch (Throwable th) {
            inputStreamOpenInputStream.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final double getLastModifiedFromUri(Uri contentUri) {
        if (AbstractC2855l.b(contentUri.getScheme(), "file")) {
            return new File(contentUri.toString()).lastModified();
        }
        return 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getMimeTypeFromUri(Uri contentUri) {
        String fileExtensionFromUrl;
        String type = getReactApplicationContext().getContentResolver().getType(contentUri);
        if (type == null && (fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(contentUri.getPath())) != null) {
            type = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
        }
        return type == null ? PointerEventHelper.POINTER_TYPE_UNKNOWN : type;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getNameFromUri(Uri contentUri) throws IOException {
        if (AbstractC2855l.b(contentUri.getScheme(), "file")) {
            return contentUri.getLastPathSegment();
        }
        Cursor cursorQuery = getReactApplicationContext().getContentResolver().query(contentUri, new String[]{"_display_name"}, null, null, null);
        if (cursorQuery != null) {
            try {
                if (cursorQuery.moveToFirst()) {
                    String string = cursorQuery.getString(0);
                    AbstractC3376c.a(cursorQuery, null);
                    return string;
                }
                C2735B c2735b = C2735B.f28704a;
                AbstractC3376c.a(cursorQuery, null);
            } finally {
            }
        }
        return contentUri.getLastPathSegment();
    }

    private final WebSocketModule getWebSocketModule() {
        return (WebSocketModule) getReactApplicationContext().getNativeModule(WebSocketModule.class);
    }

    @Override // com.facebook.fbreact.specs.NativeBlobModuleSpec
    public void addNetworkingHandler() {
        NativeModule nativeModule = getReactApplicationContext().getNativeModule((Class<NativeModule>) NetworkingModule.class);
        if (nativeModule == null) {
            throw new IllegalStateException("Required value was null.");
        }
        NetworkingModule networkingModule = (NetworkingModule) nativeModule;
        networkingModule.addUriHandler$ReactAndroid_release(this.networkingUriHandler);
        networkingModule.addRequestBodyHandler$ReactAndroid_release(this.networkingRequestBodyHandler);
        networkingModule.addResponseHandler$ReactAndroid_release(this.networkingResponseHandler);
    }

    @Override // com.facebook.fbreact.specs.NativeBlobModuleSpec
    public void addWebSocketHandler(double idDouble) {
        int i10 = (int) idDouble;
        WebSocketModule webSocketModule = getWebSocketModule();
        if (webSocketModule != null) {
            webSocketModule.setContentHandler(i10, this.webSocketContentHandler);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeBlobModuleSpec
    public void createFromParts(ReadableArray parts, String blobId) {
        AbstractC2855l.g(parts, "parts");
        AbstractC2855l.g(blobId, "blobId");
        ArrayList arrayList = new ArrayList(parts.size());
        int size = parts.size();
        int length = 0;
        for (int i10 = 0; i10 < size; i10++) {
            ReadableMap map = parts.getMap(i10);
            if (map == null) {
                throw new IllegalStateException("Required value was null.");
            }
            String string = map.getString(NotificationsService.EVENT_TYPE_KEY);
            if (string == null) {
                throw new IllegalStateException("Required value was null.");
            }
            if (AbstractC2855l.b(string, "blob")) {
                ReadableMap map2 = map.getMap("data");
                if (map2 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                length += map2.getInt("size");
                byte[] bArrResolve = resolve(map2);
                if (bArrResolve == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                arrayList.add(i10, bArrResolve);
            } else {
                if (!AbstractC2855l.b(string, "string")) {
                    throw new IllegalArgumentException("Invalid type for blob: " + map.getString(NotificationsService.EVENT_TYPE_KEY));
                }
                String string2 = map.getString("data");
                if (string2 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                Charset charsetForName = Charset.forName("UTF-8");
                AbstractC2855l.f(charsetForName, "forName(...)");
                byte[] bytes = string2.getBytes(charsetForName);
                AbstractC2855l.f(bytes, "getBytes(...)");
                length += bytes.length;
                arrayList.add(i10, bytes);
            }
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        Iterator it = arrayList.iterator();
        AbstractC2855l.f(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            AbstractC2855l.f(next, "next(...)");
            byteBufferAllocate.put((byte[]) next);
        }
        byte[] bArrArray = byteBufferAllocate.array();
        AbstractC2855l.f(bArrArray, "array(...)");
        store(bArrArray, blobId);
    }

    public final long getLengthOfBlob(String blobId) {
        long length;
        AbstractC2855l.g(blobId, "blobId");
        synchronized (this.blobs) {
            length = this.blobs.get(blobId) != null ? r4.length : 0L;
        }
        return length;
    }

    @Override // com.facebook.fbreact.specs.NativeBlobModuleSpec
    public Map<String, Object> getTypedExportedConstants() {
        Resources resources = getReactApplicationContext().getResources();
        int identifier = resources.getIdentifier("blob_provider_authority", "string", getReactApplicationContext().getPackageName());
        return identifier == 0 ? K.i() : K.l(t.a("BLOB_URI_SCHEME", "content"), t.a("BLOB_URI_HOST", resources.getString(identifier)));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        AbstractC2855l.f(reactApplicationContext, "getReactApplicationContext(...)");
        BlobCollector.install(reactApplicationContext, this);
    }

    @Override // com.facebook.fbreact.specs.NativeBlobModuleSpec
    public void release(String blobId) {
        AbstractC2855l.g(blobId, "blobId");
        remove(blobId);
    }

    public final void remove(String blobId) {
        AbstractC2855l.g(blobId, "blobId");
        synchronized (this.blobs) {
            this.blobs.remove(blobId);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeBlobModuleSpec
    public void removeWebSocketHandler(double idDouble) {
        int i10 = (int) idDouble;
        WebSocketModule webSocketModule = getWebSocketModule();
        if (webSocketModule != null) {
            webSocketModule.setContentHandler(i10, null);
        }
    }

    public final byte[] resolve(Uri uri) {
        AbstractC2855l.g(uri, "uri");
        String lastPathSegment = uri.getLastPathSegment();
        String queryParameter = uri.getQueryParameter("offset");
        int i10 = queryParameter != null ? Integer.parseInt(queryParameter) : 0;
        String queryParameter2 = uri.getQueryParameter("size");
        return resolve(lastPathSegment, i10, queryParameter2 != null ? Integer.parseInt(queryParameter2) : -1);
    }

    @Override // com.facebook.fbreact.specs.NativeBlobModuleSpec
    public void sendOverSocket(ReadableMap blob, double idDouble) {
        byte[] bArrResolve;
        AbstractC2855l.g(blob, "blob");
        int i10 = (int) idDouble;
        WebSocketModule webSocketModule = getWebSocketModule();
        if (webSocketModule == null || (bArrResolve = resolve(blob.getString("blobId"), blob.getInt("offset"), blob.getInt("size"))) == null) {
            return;
        }
        k.a aVar = k.f32603j;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrResolve);
        AbstractC2855l.f(byteBufferWrap, "wrap(...)");
        webSocketModule.sendBinary(aVar.c(byteBufferWrap), i10);
    }

    public final String store(byte[] data) {
        AbstractC2855l.g(data, "data");
        String string = UUID.randomUUID().toString();
        AbstractC2855l.f(string, "toString(...)");
        store(data, string);
        return string;
    }

    public final void store(byte[] data, String blobId) {
        AbstractC2855l.g(data, "data");
        AbstractC2855l.g(blobId, "blobId");
        synchronized (this.blobs) {
            this.blobs.put(blobId, data);
            C2735B c2735b = C2735B.f28704a;
        }
    }

    public final byte[] resolve(String blobId, int offset, int size) {
        synchronized (this.blobs) {
            try {
                byte[] bArr = this.blobs.get(blobId);
                if (bArr == null) {
                    return null;
                }
                if (size == -1) {
                    size = bArr.length - offset;
                }
                if (offset <= 0 && size == bArr.length) {
                    return bArr;
                }
                return Arrays.copyOfRange(bArr, offset, size + offset);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final byte[] resolve(ReadableMap blob) {
        AbstractC2855l.g(blob, "blob");
        return resolve(blob.getString("blobId"), blob.getInt("offset"), blob.getInt("size"));
    }
}
