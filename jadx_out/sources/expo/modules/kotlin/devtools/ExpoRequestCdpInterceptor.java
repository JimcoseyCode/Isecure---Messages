package expo.modules.kotlin.devtools;

import R8.AbstractC1417k;
import R8.C1404d0;
import R8.N;
import R8.O;
import com.facebook.react.uimanager.events.PointerEventHelper;
import e9.B;
import e9.D;
import e9.E;
import expo.modules.kotlin.devtools.cdp.Event;
import expo.modules.kotlin.devtools.cdp.ExpoReceivedResponseBodyParams;
import expo.modules.kotlin.devtools.cdp.LoadingFinishedParams;
import expo.modules.kotlin.devtools.cdp.RequestWillBeSentExtraInfoParams;
import expo.modules.kotlin.devtools.cdp.RequestWillBeSentParams;
import expo.modules.kotlin.devtools.cdp.ResponseReceivedParams;
import expo.modules.notifications.notifications.presentation.builders.ExpoNotificationBuilder;
import i7.AbstractC2753p;
import i7.C2735B;
import java.lang.ref.WeakReference;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001#B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J1\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001bR\"\u0010\u001d\u001a\u00020\u001c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lexpo/modules/kotlin/devtools/ExpoRequestCdpInterceptor;", "Lexpo/modules/kotlin/devtools/ExpoNetworkInspectOkHttpInterceptorsDelegate;", "<init>", "()V", "Lexpo/modules/kotlin/devtools/cdp/Event;", "event", "Li7/B;", "dispatchEvent", "(Lexpo/modules/kotlin/devtools/cdp/Event;)V", "Lexpo/modules/kotlin/devtools/ExpoRequestCdpInterceptor$Delegate;", "delegate", "setDelegate", "(Lexpo/modules/kotlin/devtools/ExpoRequestCdpInterceptor$Delegate;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "requestId", "Le9/B;", "request", "Le9/D;", "redirectResponse", "willSendRequest", "(Ljava/lang/String;Le9/B;Le9/D;)V", "response", "Le9/E;", ExpoNotificationBuilder.EXTRAS_BODY_KEY, "didReceiveResponse", "(Ljava/lang/String;Le9/B;Le9/D;Le9/E;)V", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "LR8/N;", "coroutineScope", "LR8/N;", "getCoroutineScope$expo_modules_core_release", "()LR8/N;", "setCoroutineScope$expo_modules_core_release", "(LR8/N;)V", "Delegate", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ExpoRequestCdpInterceptor implements ExpoNetworkInspectOkHttpInterceptorsDelegate {
    public static final ExpoRequestCdpInterceptor INSTANCE = new ExpoRequestCdpInterceptor();
    private static WeakReference<Delegate> delegate = new WeakReference<>(null);
    private static N coroutineScope = O.a(C1404d0.a());

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lexpo/modules/kotlin/devtools/ExpoRequestCdpInterceptor$Delegate;", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "event", "Li7/B;", "dispatch", "(Ljava/lang/String;)V", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Delegate {
        void dispatch(String event);
    }

    /* JADX INFO: renamed from: expo.modules.kotlin.devtools.ExpoRequestCdpInterceptor$dispatchEvent$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.kotlin.devtools.ExpoRequestCdpInterceptor$dispatchEvent$1", f = "ExpoRequestCdpInterceptor.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LR8/N;", "Li7/B;", "<anonymous>", "(LR8/N;)V"}, k = 3, mv = {2, 1, 0})
    static final class AnonymousClass1 extends l implements Function2 {
        final /* synthetic */ Event $event;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Event event, n7.f fVar) {
            super(2, fVar);
            this.$event = event;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            return new AnonymousClass1(this.$event, fVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, n7.f fVar) {
            return ((AnonymousClass1) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC3016b.e();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(obj);
            Delegate delegate = (Delegate) ExpoRequestCdpInterceptor.delegate.get();
            if (delegate != null) {
                delegate.dispatch(this.$event.toJson());
            }
            return C2735B.f28704a;
        }
    }

    /* JADX INFO: renamed from: expo.modules.kotlin.devtools.ExpoRequestCdpInterceptor$setDelegate$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.kotlin.devtools.ExpoRequestCdpInterceptor$setDelegate$1", f = "ExpoRequestCdpInterceptor.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LR8/N;", "Li7/B;", "<anonymous>", "(LR8/N;)V"}, k = 3, mv = {2, 1, 0})
    static final class C24891 extends l implements Function2 {
        final /* synthetic */ Delegate $delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C24891(Delegate delegate, n7.f fVar) {
            super(2, fVar);
            this.$delegate = delegate;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            return new C24891(this.$delegate, fVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, n7.f fVar) {
            return ((C24891) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC3016b.e();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(obj);
            ExpoRequestCdpInterceptor expoRequestCdpInterceptor = ExpoRequestCdpInterceptor.INSTANCE;
            ExpoRequestCdpInterceptor.delegate = new WeakReference(this.$delegate);
            return C2735B.f28704a;
        }
    }

    private ExpoRequestCdpInterceptor() {
    }

    private final void dispatchEvent(Event event) {
        AbstractC1417k.d(coroutineScope, null, null, new AnonymousClass1(event, null), 3, null);
    }

    @Override // expo.modules.kotlin.devtools.ExpoNetworkInspectOkHttpInterceptorsDelegate
    public void didReceiveResponse(String requestId, B request, D response, E body) {
        AbstractC2855l.g(requestId, "requestId");
        AbstractC2855l.g(request, "request");
        AbstractC2855l.g(response, "response");
        BigDecimal scale = new BigDecimal(System.currentTimeMillis() / 1000.0d).setScale(3, RoundingMode.CEILING);
        AbstractC2855l.d(scale);
        dispatchEvent(new Event("Network.responseReceived", new ResponseReceivedParams(scale, requestId, response)));
        if (body != null) {
            dispatchEvent(new Event("Expo(Network.receivedResponseBody)", new ExpoReceivedResponseBodyParams(requestId, body)));
        }
        dispatchEvent(new Event("Network.loadingFinished", new LoadingFinishedParams(scale, requestId, response)));
    }

    public final N getCoroutineScope$expo_modules_core_release() {
        return coroutineScope;
    }

    public final void setCoroutineScope$expo_modules_core_release(N n10) {
        AbstractC2855l.g(n10, "<set-?>");
        coroutineScope = n10;
    }

    public final void setDelegate(Delegate delegate2) {
        AbstractC1417k.d(coroutineScope, null, null, new C24891(delegate2, null), 3, null);
    }

    @Override // expo.modules.kotlin.devtools.ExpoNetworkInspectOkHttpInterceptorsDelegate
    public void willSendRequest(String requestId, B request, D redirectResponse) {
        AbstractC2855l.g(requestId, "requestId");
        AbstractC2855l.g(request, "request");
        BigDecimal scale = new BigDecimal(System.currentTimeMillis() / 1000.0d).setScale(3, RoundingMode.CEILING);
        AbstractC2855l.d(scale);
        dispatchEvent(new Event("Network.requestWillBeSent", new RequestWillBeSentParams(scale, requestId, request, redirectResponse)));
        dispatchEvent(new Event("Network.requestWillBeSentExtraInfo", new RequestWillBeSentExtraInfoParams(scale, requestId, request)));
    }
}
