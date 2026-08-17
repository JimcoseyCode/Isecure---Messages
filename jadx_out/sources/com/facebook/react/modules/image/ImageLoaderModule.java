package com.facebook.react.modules.image;

import Y2.C1533t;
import a2.C1592a;
import android.net.Uri;
import android.util.SparseArray;
import com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec;
import com.facebook.imagepipeline.request.b;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapBuilder;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.fresco.ReactNetworkImageRequest;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.views.image.ReactCallerContextFactory;
import com.facebook.react.views.imagehelper.ImageSource;
import d3.e;
import g2.AbstractC2662a;
import i7.C2735B;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import m2.AbstractC2895b;
import m2.c;
import s2.AbstractC3320d;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@ReactModule(name = "ImageLoader")
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u0000 @2\u00020\u00012\u00020\u0002:\u0001@B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0005\u0010\tB!\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0005\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000f2\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0017\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001d\u001a\u00020\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ+\u0010!\u001a\u00020\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0017¢\u0006\u0004\b!\u0010\"J)\u0010%\u001a\u00020\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010$\u001a\u00020#2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020#H\u0016¢\u0006\u0004\b'\u0010(J\u001f\u0010+\u001a\u00020\u00142\u0006\u0010*\u001a\u00020)2\u0006\u0010\u001c\u001a\u00020\u001bH\u0017¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0014H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0014H\u0016¢\u0006\u0004\b/\u0010.J\u000f\u00100\u001a\u00020\u0014H\u0016¢\u0006\u0004\b0\u0010.R\u0018\u00101\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00103\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\"\u00106\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u00108R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078BX\u0082\u0004¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b9\u0010:R$\u0010\u000b\u001a\u00020\n2\u0006\u0010;\u001a\u00020\n8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?¨\u0006A"}, d2 = {"Lcom/facebook/react/modules/image/ImageLoaderModule;", "Lcom/facebook/fbreact/specs/NativeImageLoaderAndroidSpec;", "Lcom/facebook/react/bridge/LifecycleEventListener;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "callerContext", "(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/lang/Object;)V", "LY2/t;", "imagePipeline", "Lcom/facebook/react/views/image/ReactCallerContextFactory;", "callerContextFactory", "(Lcom/facebook/react/bridge/ReactApplicationContext;LY2/t;Lcom/facebook/react/views/image/ReactCallerContextFactory;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "requestId", "Lm2/c;", "Ljava/lang/Void;", "request", "Li7/B;", "registerRequest", "(ILm2/c;)V", "removeRequest", "(I)Lm2/c;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "uriString", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "getSize", "(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "Lcom/facebook/react/bridge/ReadableMap;", "headers", "getSizeWithHeaders", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "requestIdAsDouble", "prefetchImage", "(Ljava/lang/String;DLcom/facebook/react/bridge/Promise;)V", "abortRequest", "(D)V", "Lcom/facebook/react/bridge/ReadableArray;", "uris", "queryCache", "(Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/Promise;)V", "onHostResume", "()V", "onHostPause", "onHostDestroy", "_imagePipeline", "LY2/t;", "enqueuedRequestMonitor", "Ljava/lang/Object;", "Landroid/util/SparseArray;", "enqueuedRequests", "Landroid/util/SparseArray;", "Lcom/facebook/react/views/image/ReactCallerContextFactory;", "getCallerContext", "()Ljava/lang/Object;", "value", "getImagePipeline", "()LY2/t;", "setImagePipeline", "(LY2/t;)V", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ImageLoaderModule extends NativeImageLoaderAndroidSpec implements LifecycleEventListener {
    private static final String ERROR_GET_SIZE_FAILURE = "E_GET_SIZE_FAILURE";
    private static final String ERROR_INVALID_URI = "E_INVALID_URI";
    private static final String ERROR_PREFETCH_FAILURE = "E_PREFETCH_FAILURE";
    public static final String NAME = "ImageLoader";
    private C1533t _imagePipeline;
    private final Object callerContext;
    private ReactCallerContextFactory callerContextFactory;
    private final Object enqueuedRequestMonitor;
    private final SparseArray<c> enqueuedRequests;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageLoaderModule(ReactApplicationContext reactContext) {
        super(reactContext);
        AbstractC2855l.g(reactContext, "reactContext");
        this.enqueuedRequestMonitor = new Object();
        this.enqueuedRequests = new SparseArray<>();
        this.callerContext = this;
    }

    private final Object getCallerContext() {
        Object orCreateCallerContext;
        ReactCallerContextFactory reactCallerContextFactory = this.callerContextFactory;
        return (reactCallerContextFactory == null || (orCreateCallerContext = reactCallerContextFactory.getOrCreateCallerContext(PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN)) == null) ? this.callerContext : orCreateCallerContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C1533t getImagePipeline() {
        C1533t c1533t = this._imagePipeline;
        if (c1533t != null) {
            return c1533t;
        }
        C1533t c1533tA = AbstractC3320d.a();
        AbstractC2855l.f(c1533tA, "getImagePipeline(...)");
        return c1533tA;
    }

    private final void registerRequest(int requestId, c request) {
        synchronized (this.enqueuedRequestMonitor) {
            this.enqueuedRequests.put(requestId, request);
            C2735B c2735b = C2735B.f28704a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c removeRequest(int requestId) {
        c cVar;
        synchronized (this.enqueuedRequestMonitor) {
            cVar = this.enqueuedRequests.get(requestId);
            this.enqueuedRequests.remove(requestId);
        }
        return cVar;
    }

    private final void setImagePipeline(C1533t c1533t) {
        this._imagePipeline = c1533t;
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    public void abortRequest(double requestId) {
        c cVarRemoveRequest = removeRequest((int) requestId);
        if (cVarRemoveRequest != null) {
            cVarRemoveRequest.close();
        }
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    @ReactMethod
    public void getSize(String uriString, final Promise promise) {
        AbstractC2855l.g(promise, "promise");
        if (uriString == null || uriString.length() == 0) {
            promise.reject(ERROR_INVALID_URI, "Cannot get the size of an image for an empty URI");
            return;
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        AbstractC2855l.f(reactApplicationContext, "getReactApplicationContext(...)");
        b bVarA = com.facebook.imagepipeline.request.c.x(new ImageSource(reactApplicationContext, uriString, 0.0d, 0.0d, null, 28, null).getUri()).a();
        AbstractC2855l.f(bVarA, "build(...)");
        getImagePipeline().k(bVarA, getCallerContext()).c(new AbstractC2895b() { // from class: com.facebook.react.modules.image.ImageLoaderModule$getSize$dataSubscriber$1
            @Override // m2.AbstractC2895b
            protected void onFailureImpl(c dataSource) {
                AbstractC2855l.g(dataSource, "dataSource");
                promise.reject("E_GET_SIZE_FAILURE", dataSource.b());
            }

            @Override // m2.AbstractC2895b
            protected void onNewResultImpl(c dataSource) {
                AbstractC2855l.g(dataSource, "dataSource");
                if (dataSource.isFinished()) {
                    AbstractC2662a abstractC2662a = (AbstractC2662a) dataSource.getResult();
                    try {
                        if (abstractC2662a == null) {
                            promise.reject("E_GET_SIZE_FAILURE", "Failed to get the size of the image");
                            return;
                        }
                        Object objJ = abstractC2662a.J();
                        AbstractC2855l.f(objJ, "get(...)");
                        e eVar = (e) objJ;
                        WritableMap writableMapCreateMap = Arguments.createMap();
                        ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
                        readableMapBuilder.put("width", eVar.getWidth());
                        readableMapBuilder.put("height", eVar.getHeight());
                        promise.resolve(writableMapCreateMap);
                    } catch (Exception e10) {
                        promise.reject("E_GET_SIZE_FAILURE", e10);
                    } finally {
                        AbstractC2662a.B(abstractC2662a);
                    }
                }
            }
        }, C1592a.d());
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    @ReactMethod
    public void getSizeWithHeaders(String uriString, ReadableMap headers, final Promise promise) {
        AbstractC2855l.g(promise, "promise");
        if (uriString == null || uriString.length() == 0) {
            promise.reject(ERROR_INVALID_URI, "Cannot get the size of an image for an empty URI");
            return;
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        AbstractC2855l.f(reactApplicationContext, "getReactApplicationContext(...)");
        com.facebook.imagepipeline.request.c cVarX = com.facebook.imagepipeline.request.c.x(new ImageSource(reactApplicationContext, uriString, 0.0d, 0.0d, null, 28, null).getUri());
        AbstractC2855l.f(cVarX, "newBuilderWithSource(...)");
        getImagePipeline().k(ReactNetworkImageRequest.Companion.fromBuilderWithHeaders$default(ReactNetworkImageRequest.INSTANCE, cVarX, headers, null, 4, null), getCallerContext()).c(new AbstractC2895b() { // from class: com.facebook.react.modules.image.ImageLoaderModule$getSizeWithHeaders$dataSubscriber$1
            @Override // m2.AbstractC2895b
            protected void onFailureImpl(c dataSource) {
                AbstractC2855l.g(dataSource, "dataSource");
                promise.reject("E_GET_SIZE_FAILURE", dataSource.b());
            }

            @Override // m2.AbstractC2895b
            protected void onNewResultImpl(c dataSource) {
                AbstractC2855l.g(dataSource, "dataSource");
                if (dataSource.isFinished()) {
                    AbstractC2662a abstractC2662a = (AbstractC2662a) dataSource.getResult();
                    try {
                        if (abstractC2662a == null) {
                            promise.reject("E_GET_SIZE_FAILURE", "Failed to get the size of the image");
                            return;
                        }
                        Object objJ = abstractC2662a.J();
                        AbstractC2855l.f(objJ, "get(...)");
                        e eVar = (e) objJ;
                        WritableMap writableMapCreateMap = Arguments.createMap();
                        ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
                        readableMapBuilder.put("width", eVar.getWidth());
                        readableMapBuilder.put("height", eVar.getHeight());
                        promise.resolve(writableMapCreateMap);
                    } catch (Exception e10) {
                        promise.reject("E_GET_SIZE_FAILURE", e10);
                    } finally {
                        AbstractC2662a.B(abstractC2662a);
                    }
                }
            }
        }, C1592a.d());
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        synchronized (this.enqueuedRequestMonitor) {
            try {
                int size = this.enqueuedRequests.size();
                for (int i10 = 0; i10 < size; i10++) {
                    c cVarValueAt = this.enqueuedRequests.valueAt(i10);
                    AbstractC2855l.f(cVarValueAt, "valueAt(...)");
                    cVarValueAt.close();
                }
                this.enqueuedRequests.clear();
                C2735B c2735b = C2735B.f28704a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    public void prefetchImage(String uriString, double requestIdAsDouble, final Promise promise) {
        AbstractC2855l.g(promise, "promise");
        final int i10 = (int) requestIdAsDouble;
        if (uriString == null || uriString.length() == 0) {
            promise.reject(ERROR_INVALID_URI, "Cannot prefetch an image for an empty URI");
            return;
        }
        b bVarA = com.facebook.imagepipeline.request.c.x(Uri.parse(uriString)).a();
        AbstractC2855l.f(bVarA, "build(...)");
        c cVarB = getImagePipeline().B(bVarA, getCallerContext());
        AbstractC2895b abstractC2895b = new AbstractC2895b() { // from class: com.facebook.react.modules.image.ImageLoaderModule$prefetchImage$prefetchSubscriber$1
            @Override // m2.AbstractC2895b
            protected void onFailureImpl(c dataSource) {
                AbstractC2855l.g(dataSource, "dataSource");
                try {
                    this.this$0.removeRequest(i10);
                    promise.reject("E_PREFETCH_FAILURE", dataSource.b());
                } finally {
                    dataSource.close();
                }
            }

            @Override // m2.AbstractC2895b
            protected void onNewResultImpl(c dataSource) {
                AbstractC2855l.g(dataSource, "dataSource");
                if (dataSource.isFinished()) {
                    try {
                        this.this$0.removeRequest(i10);
                        promise.resolve(Boolean.TRUE);
                    } catch (Exception e10) {
                        promise.reject("E_PREFETCH_FAILURE", e10);
                    } finally {
                        dataSource.close();
                    }
                }
            }
        };
        registerRequest(i10, cVarB);
        cVarB.c(abstractC2895b, C1592a.d());
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    @ReactMethod
    public void queryCache(ReadableArray uris, Promise promise) {
        AbstractC2855l.g(uris, "uris");
        AbstractC2855l.g(promise, "promise");
        new GuardedAsyncTask<Void, Void>(this, uris, getReactApplicationContext()) { // from class: com.facebook.react.modules.image.ImageLoaderModule.queryCache.1
            final /* synthetic */ ReadableArray $uris;
            final /* synthetic */ ImageLoaderModule this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(reactApplicationContext);
                AbstractC2855l.d(reactApplicationContext);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.facebook.react.bridge.GuardedAsyncTask
            public void doInBackgroundGuarded(Void... params) {
                AbstractC2855l.g(params, "params");
                ImageLoaderModule imageLoaderModule = this.this$0;
                ReadableArray readableArray = this.$uris;
                WritableMap writableMapCreateMap = Arguments.createMap();
                ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
                C1533t imagePipeline = imageLoaderModule.getImagePipeline();
                int size = readableArray.size();
                for (int i10 = 0; i10 < size; i10++) {
                    String string = readableArray.getString(i10);
                    if (string != null && string.length() != 0) {
                        Uri uri = Uri.parse(string);
                        if (imagePipeline.t(uri)) {
                            readableMapBuilder.put(string, "memory");
                        } else if (imagePipeline.v(uri)) {
                            readableMapBuilder.put(string, "disk");
                        }
                    }
                }
                this.$promise.resolve(writableMapCreateMap);
            }
        }.executeOnExecutor(GuardedAsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageLoaderModule(ReactApplicationContext reactContext, Object obj) {
        super(reactContext);
        AbstractC2855l.g(reactContext, "reactContext");
        this.enqueuedRequestMonitor = new Object();
        this.enqueuedRequests = new SparseArray<>();
        this.callerContext = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageLoaderModule(ReactApplicationContext reactContext, C1533t imagePipeline, ReactCallerContextFactory callerContextFactory) {
        super(reactContext);
        AbstractC2855l.g(reactContext, "reactContext");
        AbstractC2855l.g(imagePipeline, "imagePipeline");
        AbstractC2855l.g(callerContextFactory, "callerContextFactory");
        this.enqueuedRequestMonitor = new Object();
        this.enqueuedRequests = new SparseArray<>();
        this.callerContextFactory = callerContextFactory;
        setImagePipeline(imagePipeline);
        this.callerContext = null;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
    }
}
