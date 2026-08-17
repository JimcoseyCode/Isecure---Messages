package com.facebook.imagepipeline.backends.okhttp3;

import android.net.Uri;
import android.os.Looper;
import android.os.SystemClock;
import com.facebook.imagepipeline.backends.okhttp3.b;
import com.facebook.imagepipeline.producers.AbstractC1968d;
import com.facebook.imagepipeline.producers.AbstractC1970f;
import com.facebook.imagepipeline.producers.C;
import com.facebook.imagepipeline.producers.InterfaceC1978n;
import com.facebook.imagepipeline.producers.X;
import com.facebook.imagepipeline.producers.e0;
import e9.B;
import e9.C2436d;
import e9.D;
import e9.E;
import e9.InterfaceC2437e;
import e9.InterfaceC2438f;
import e9.z;
import i7.C2735B;
import i7.t;
import j7.K;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t7.AbstractC3376c;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class b extends AbstractC1968d {
    private static final a Companion = new a(null);
    private static final String FETCH_TIME = "fetch_time";
    private static final String IMAGE_SIZE = "image_size";
    private static final String QUEUE_TIME = "queue_time";
    private static final String TOTAL_TIME = "total_time";
    private final C2436d cacheControl;
    private final InterfaceC2437e.a callFactory;
    private final Executor cancellationExecutor;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.backends.okhttp3.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class C0211b extends C {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f19852f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f19853g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f19854h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0211b(InterfaceC1978n consumer, e0 producerContext) {
            super(consumer, producerContext);
            AbstractC2855l.g(consumer, "consumer");
            AbstractC2855l.g(producerContext, "producerContext");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class c extends AbstractC1970f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2437e f19855a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f19856b;

        c(InterfaceC2437e interfaceC2437e, b bVar) {
            this.f19855a = interfaceC2437e;
            this.f19856b = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void f(InterfaceC2437e interfaceC2437e) {
            interfaceC2437e.cancel();
        }

        @Override // com.facebook.imagepipeline.producers.f0
        public void a() {
            if (!AbstractC2855l.b(Looper.myLooper(), Looper.getMainLooper())) {
                this.f19855a.cancel();
                return;
            }
            Executor executor = this.f19856b.cancellationExecutor;
            final InterfaceC2437e interfaceC2437e = this.f19855a;
            executor.execute(new Runnable() { // from class: com.facebook.imagepipeline.backends.okhttp3.c
                @Override // java.lang.Runnable
                public final void run() {
                    b.c.f(interfaceC2437e);
                }
            });
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class d implements InterfaceC2438f {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ C0211b f19857g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ b f19858h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ X.a f19859i;

        d(C0211b c0211b, b bVar, X.a aVar) {
            this.f19857g = c0211b;
            this.f19858h = bVar;
            this.f19859i = aVar;
        }

        @Override // e9.InterfaceC2438f
        public void onFailure(InterfaceC2437e call, IOException e10) {
            AbstractC2855l.g(call, "call");
            AbstractC2855l.g(e10, "e");
            this.f19858h.a(call, e10, this.f19859i);
        }

        @Override // e9.InterfaceC2438f
        public void onResponse(InterfaceC2437e call, D response) throws IOException {
            AbstractC2855l.g(call, "call");
            AbstractC2855l.g(response, "response");
            this.f19857g.f19853g = SystemClock.elapsedRealtime();
            E eR = response.r();
            if (eR == null) {
                b bVar = this.f19858h;
                bVar.a(call, bVar.b("Response body null: " + response, response), this.f19859i);
                return;
            }
            b bVar2 = this.f19858h;
            X.a aVar = this.f19859i;
            C0211b c0211b = this.f19857g;
            try {
                try {
                    if (response.k0()) {
                        X2.b bVarC = X2.b.f12409c.c(response.W("Content-Range"));
                        if (bVarC != null && (bVarC.f12411a != 0 || bVarC.f12412b != Integer.MAX_VALUE)) {
                            c0211b.j(bVarC);
                            c0211b.i(8);
                        }
                        aVar.b(eR.byteStream(), eR.contentLength() < 0 ? 0 : (int) eR.contentLength());
                    } else {
                        bVar2.a(call, bVar2.b("Unexpected HTTP code " + response, response), aVar);
                    }
                } catch (Exception e10) {
                    bVar2.a(call, e10, aVar);
                }
                C2735B c2735b = C2735B.f28704a;
                AbstractC3376c.a(eR, null);
            } finally {
            }
        }
    }

    public /* synthetic */ b(InterfaceC2437e.a aVar, Executor executor, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, executor, (i10 & 4) != 0 ? true : z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(InterfaceC2437e interfaceC2437e, Exception exc, X.a aVar) {
        if (interfaceC2437e.s()) {
            aVar.a();
        } else {
            aVar.onFailure(exc);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IOException b(String str, D d10) {
        return new IOException(str, com.facebook.imagepipeline.backends.okhttp3.d.f19861i.a(d10));
    }

    protected void fetchWithRequest(C0211b fetchState, X.a callback, B request) {
        AbstractC2855l.g(fetchState, "fetchState");
        AbstractC2855l.g(callback, "callback");
        AbstractC2855l.g(request, "request");
        InterfaceC2437e interfaceC2437eA = this.callFactory.a(request);
        fetchState.b().k(new c(interfaceC2437eA, this));
        interfaceC2437eA.t0(new d(fetchState, this, callback));
    }

    public b(InterfaceC2437e.a callFactory, Executor cancellationExecutor, boolean z10) {
        AbstractC2855l.g(callFactory, "callFactory");
        AbstractC2855l.g(cancellationExecutor, "cancellationExecutor");
        this.callFactory = callFactory;
        this.cancellationExecutor = cancellationExecutor;
        this.cacheControl = z10 ? new C2436d.a().e().a() : null;
    }

    @Override // com.facebook.imagepipeline.producers.X
    public C0211b createFetchState(InterfaceC1978n consumer, e0 context) {
        AbstractC2855l.g(consumer, "consumer");
        AbstractC2855l.g(context, "context");
        return new C0211b(consumer, context);
    }

    @Override // com.facebook.imagepipeline.producers.X
    public void fetch(C0211b fetchState, X.a callback) {
        AbstractC2855l.g(fetchState, "fetchState");
        AbstractC2855l.g(callback, "callback");
        fetchState.f19852f = SystemClock.elapsedRealtime();
        Uri uriG = fetchState.g();
        AbstractC2855l.f(uriG, "getUri(...)");
        try {
            B.a aVarD = new B.a().m(uriG.toString()).d();
            C2436d c2436d = this.cacheControl;
            if (c2436d != null) {
                aVarD.c(c2436d);
            }
            X2.b bytesRange = fetchState.b().e().getBytesRange();
            if (bytesRange != null) {
                aVarD.a("Range", bytesRange.f());
            }
            B b10 = aVarD.b();
            AbstractC2855l.f(b10, "build(...)");
            fetchWithRequest(fetchState, callback, b10);
        } catch (Exception e10) {
            callback.onFailure(e10);
        }
    }

    @Override // com.facebook.imagepipeline.producers.X
    public Map<String, String> getExtraMap(C0211b fetchState, int i10) {
        AbstractC2855l.g(fetchState, "fetchState");
        return K.l(t.a(QUEUE_TIME, String.valueOf(fetchState.f19853g - fetchState.f19852f)), t.a(FETCH_TIME, String.valueOf(fetchState.f19854h - fetchState.f19853g)), t.a(TOTAL_TIME, String.valueOf(fetchState.f19854h - fetchState.f19852f)), t.a(IMAGE_SIZE, String.valueOf(i10)));
    }

    @Override // com.facebook.imagepipeline.producers.X
    public void onFetchCompletion(C0211b fetchState, int i10) {
        AbstractC2855l.g(fetchState, "fetchState");
        fetchState.f19854h = SystemClock.elapsedRealtime();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public b(z okHttpClient) {
        AbstractC2855l.g(okHttpClient, "okHttpClient");
        ExecutorService executorServiceC = okHttpClient.r().c();
        AbstractC2855l.f(executorServiceC, "executorService(...)");
        this(okHttpClient, executorServiceC, false, 4, null);
    }
}
