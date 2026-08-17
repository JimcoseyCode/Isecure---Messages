package expo.modules.fetch;

import R8.AbstractC1417k;
import R8.C1404d0;
import R8.N;
import com.facebook.react.uimanager.events.PointerEventHelper;
import e9.D;
import e9.E;
import e9.InterfaceC2437e;
import e9.InterfaceC2438f;
import e9.t;
import expo.modules.core.logging.LoggerUtilsKt;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.sharedobjects.SharedObject;
import i7.AbstractC2753p;
import i7.C2735B;
import j7.AbstractC2793j;
import j7.AbstractC2800q;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import o7.AbstractC3016b;
import t9.j;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 T2\u00020\u00012\u00020\u0002:\u0001TB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00020\f2\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\"\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0016¢\u0006\u0004\b\u001f\u0010\u001aJ\r\u0010 \u001a\u00020\u0016¢\u0006\u0004\b \u0010\u001aJ/\u0010%\u001a\u00020\u00162\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\n0!2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00160#¢\u0006\u0004\b%\u0010&J\u001f\u0010+\u001a\u00020\u00162\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u001f\u0010-\u001a\u00020\u00162\u0006\u0010(\u001a\u00020'2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010/R\u0017\u00101\u001a\u0002008\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R*\u00106\u001a\u00020\n2\u0006\u00105\u001a\u00020\n8B@BX\u0082\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R*\u0010>\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f0#j\u0002`=0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R(\u0010@\u001a\u0004\u0018\u00010\u00112\b\u00105\u001a\u0004\u0018\u00010\u00118\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR4\u0010F\u001a\n\u0018\u00010Dj\u0004\u0018\u0001`E2\u000e\u00105\u001a\n\u0018\u00010Dj\u0004\u0018\u0001`E8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR$\u0010K\u001a\u0004\u0018\u00010J8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u0011\u0010S\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bQ\u0010R¨\u0006U"}, d2 = {"Lexpo/modules/fetch/NativeResponse;", "Lexpo/modules/kotlin/sharedobjects/SharedObject;", "Le9/f;", "Lexpo/modules/kotlin/AppContext;", "appContext", "LR8/N;", "coroutineScope", "<init>", "(Lexpo/modules/kotlin/AppContext;LR8/N;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/fetch/ResponseState;", "validStates", PointerEventHelper.POINTER_TYPE_UNKNOWN, "isInvalidState", "([Lexpo/modules/fetch/ResponseState;)Z", "Le9/D;", "response", "Lexpo/modules/fetch/NativeResponseInit;", "createResponseInit", "(Le9/D;)Lexpo/modules/fetch/NativeResponseInit;", "Lt9/j;", "stream", "Li7/B;", "pumpResponseBodyStream", "(Lt9/j;)V", "deallocate", "()V", "onStarted", PointerEventHelper.POINTER_TYPE_UNKNOWN, "startStreaming", "()[B", "cancelStreaming", "emitRequestCanceled", PointerEventHelper.POINTER_TYPE_UNKNOWN, "states", "Lkotlin/Function1;", "callback", "waitForStates", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "Le9/e;", "call", "Ljava/io/IOException;", "e", "onFailure", "(Le9/e;Ljava/io/IOException;)V", "onResponse", "(Le9/e;Le9/D;)V", "LR8/N;", "Lexpo/modules/fetch/ResponseSink;", "sink", "Lexpo/modules/fetch/ResponseSink;", "getSink", "()Lexpo/modules/fetch/ResponseSink;", "value", "state", "Lexpo/modules/fetch/ResponseState;", "getState", "()Lexpo/modules/fetch/ResponseState;", "setState", "(Lexpo/modules/fetch/ResponseState;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/fetch/StateChangeListener;", "stateChangeOnceListeners", "Ljava/util/List;", "responseInit", "Lexpo/modules/fetch/NativeResponseInit;", "getResponseInit", "()Lexpo/modules/fetch/NativeResponseInit;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "error", "Ljava/lang/Exception;", "getError", "()Ljava/lang/Exception;", "Lexpo/modules/fetch/NativeRequestRedirect;", "redirectMode", "Lexpo/modules/fetch/NativeRequestRedirect;", "getRedirectMode", "()Lexpo/modules/fetch/NativeRequestRedirect;", "setRedirectMode", "(Lexpo/modules/fetch/NativeRequestRedirect;)V", "getBodyUsed", "()Z", "bodyUsed", "Companion", "expo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NativeResponse extends SharedObject implements InterfaceC2438f {
    private static final String TAG = NativeResponse.class.getSimpleName();
    private final N coroutineScope;
    private Exception error;
    private NativeRequestRedirect redirectMode;
    private NativeResponseInit responseInit;
    private final ResponseSink sink;
    private ResponseState state;
    private final List<Function1> stateChangeOnceListeners;

    /* JADX INFO: renamed from: expo.modules.fetch.NativeResponse$onResponse$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @kotlin.coroutines.jvm.internal.f(c = "expo.modules.fetch.NativeResponse$onResponse$1", f = "NativeResponse.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LR8/N;", "Li7/B;", "<anonymous>", "(LR8/N;)V"}, k = 3, mv = {2, 1, 0})
    static final class AnonymousClass1 extends l implements Function2 {
        final /* synthetic */ D $response;
        int label;
        final /* synthetic */ NativeResponse this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(D d10, NativeResponse nativeResponse, n7.f fVar) {
            super(2, fVar);
            this.$response = d10;
            this.this$0 = nativeResponse;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            return new AnonymousClass1(this.$response, this.this$0, fVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, n7.f fVar) {
            return ((AnonymousClass1) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            j jVarSource;
            AbstractC3016b.e();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(obj);
            E eR = this.$response.r();
            if (eR == null || (jVarSource = eR.source()) == null) {
                return C2735B.f28704a;
            }
            this.this$0.pumpResponseBodyStream(jVarSource);
            this.$response.close();
            if (this.this$0.getState() == ResponseState.BODY_STREAMING_STARTED) {
                this.this$0.emit("didComplete", new Object[0]);
            }
            this.this$0.setState(ResponseState.BODY_COMPLETED);
            this.this$0.emit("readyForJSFinalization", new Object[0]);
            return C2735B.f28704a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeResponse(AppContext appContext, N coroutineScope) {
        super(appContext);
        AbstractC2855l.g(appContext, "appContext");
        AbstractC2855l.g(coroutineScope, "coroutineScope");
        this.coroutineScope = coroutineScope;
        this.sink = new ResponseSink();
        this.state = ResponseState.INITIALIZED;
        this.stateChangeOnceListeners = new ArrayList();
    }

    private final NativeResponseInit createResponseInit(D response) {
        int I9 = response.I();
        String strL0 = response.l0();
        t<Pair> tVarG0 = response.g0();
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(tVarG0, 10));
        for (Pair pair : tVarG0) {
            arrayList.add(i7.t.a(pair.c(), pair.d()));
        }
        return new NativeResponseInit(arrayList, I9, strL0, response.D0().p().toString(), response.i0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ResponseState getState() {
        ResponseState responseState;
        synchronized (this) {
            responseState = this.state;
        }
        return responseState;
    }

    private final boolean isInvalidState(ResponseState... validStates) {
        if (AbstractC2793j.B(validStates, getState())) {
            return false;
        }
        AbstractC2793j.a0(validStates, ",", null, null, 0, null, new Function1() { // from class: expo.modules.fetch.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeResponse.isInvalidState$lambda$3((ResponseState) obj);
            }
        }, 30, null);
        getState().getIntValue();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence isInvalidState$lambda$3(ResponseState it) {
        AbstractC2855l.g(it, "it");
        return String.valueOf(it.getIntValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void pumpResponseBodyStream(j stream) {
        while (!stream.D()) {
            try {
                ResponseState responseState = ResponseState.RESPONSE_RECEIVED;
                ResponseState responseState2 = ResponseState.BODY_STREAMING_STARTED;
                if (isInvalidState(responseState, responseState2, ResponseState.BODY_STREAMING_CANCELED)) {
                    return;
                }
                if (getState() == responseState) {
                    this.sink.appendBufferBody$expo_release(stream.c().C());
                } else if (getState() != responseState2) {
                    return;
                } else {
                    emit("didReceiveResponseData", stream.c().C());
                }
            } catch (IOException e10) {
                this.error = e10;
                if (getState() == ResponseState.BODY_STREAMING_STARTED) {
                    emit("didFailWithError", LoggerUtilsKt.localizedMessageWithCauseLocalizedMessage(e10));
                }
                setState(ResponseState.ERROR_RECEIVED);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setState(ResponseState responseState) {
        synchronized (this) {
            this.state = responseState;
            C2735B c2735b = C2735B.f28704a;
        }
        AbstractC1417k.d(this.coroutineScope, null, null, new NativeResponse$state$3(this, responseState, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean waitForStates$lambda$2(List list, Function1 function1, ResponseState newState) {
        AbstractC2855l.g(newState, "newState");
        if (!list.contains(newState)) {
            return false;
        }
        function1.invoke(newState);
        return true;
    }

    public final void cancelStreaming() {
        if (isInvalidState(ResponseState.BODY_STREAMING_STARTED)) {
            return;
        }
        setState(ResponseState.BODY_STREAMING_CANCELED);
    }

    @Override // expo.modules.kotlin.sharedobjects.SharedObject
    public void deallocate() {
        this.sink.finalize(false);
        super.deallocate();
    }

    public final void emitRequestCanceled() {
        FetchRequestCanceledException fetchRequestCanceledException = new FetchRequestCanceledException();
        this.error = fetchRequestCanceledException;
        if (getState() == ResponseState.BODY_STREAMING_STARTED) {
            emit("didFailWithError", LoggerUtilsKt.localizedMessageWithCauseLocalizedMessage(fetchRequestCanceledException));
        }
        setState(ResponseState.ERROR_RECEIVED);
    }

    public final boolean getBodyUsed() {
        return this.sink.getBodyUsed();
    }

    public final Exception getError() {
        return this.error;
    }

    public final NativeRequestRedirect getRedirectMode() {
        return this.redirectMode;
    }

    public final NativeResponseInit getResponseInit() {
        return this.responseInit;
    }

    public final ResponseSink getSink() {
        return this.sink;
    }

    @Override // e9.InterfaceC2438f
    public void onFailure(InterfaceC2437e call, IOException e10) {
        AbstractC2855l.g(call, "call");
        AbstractC2855l.g(e10, "e");
        if (AbstractC2855l.b(e10.getMessage(), "Canceled")) {
            return;
        }
        ResponseState responseState = ResponseState.STARTED;
        ResponseState responseState2 = ResponseState.RESPONSE_RECEIVED;
        ResponseState responseState3 = ResponseState.BODY_STREAMING_STARTED;
        if (isInvalidState(responseState, responseState2, responseState3, ResponseState.BODY_STREAMING_CANCELED)) {
            return;
        }
        if (getState() == responseState3) {
            emit("didFailWithError", LoggerUtilsKt.localizedMessageWithCauseLocalizedMessage(e10));
        }
        this.error = e10;
        setState(ResponseState.ERROR_RECEIVED);
        emit("readyForJSFinalization", new Object[0]);
    }

    @Override // e9.InterfaceC2438f
    public void onResponse(InterfaceC2437e call, D response) {
        AbstractC2855l.g(call, "call");
        AbstractC2855l.g(response, "response");
        if (!response.i0() || this.redirectMode != NativeRequestRedirect.ERROR) {
            this.responseInit = createResponseInit(response);
            setState(ResponseState.RESPONSE_RECEIVED);
            AbstractC1417k.d(this.coroutineScope, C1404d0.b(), null, new AnonymousClass1(response, this, null), 2, null);
            return;
        }
        response.close();
        FetchRedirectException fetchRedirectException = new FetchRedirectException();
        this.error = fetchRedirectException;
        if (getState() == ResponseState.BODY_STREAMING_STARTED) {
            emit("didFailWithError", LoggerUtilsKt.localizedMessageWithCauseLocalizedMessage(fetchRedirectException));
        }
        setState(ResponseState.ERROR_RECEIVED);
        emit("readyForJSFinalization", new Object[0]);
    }

    public final void onStarted() {
        if (isInvalidState(ResponseState.INITIALIZED)) {
            return;
        }
        setState(ResponseState.STARTED);
    }

    public final void setRedirectMode(NativeRequestRedirect nativeRequestRedirect) {
        this.redirectMode = nativeRequestRedirect;
    }

    public final byte[] startStreaming() {
        ResponseState responseState = ResponseState.RESPONSE_RECEIVED;
        ResponseState responseState2 = ResponseState.BODY_COMPLETED;
        if (isInvalidState(responseState, responseState2)) {
            return null;
        }
        if (getState() == responseState) {
            setState(ResponseState.BODY_STREAMING_STARTED);
            emit("didReceiveResponseData", this.sink.finalize(false).array());
        } else if (getState() == responseState2) {
            return this.sink.finalize(false).array();
        }
        return null;
    }

    public final void waitForStates(final List<? extends ResponseState> states, final Function1 callback) {
        AbstractC2855l.g(states, "states");
        AbstractC2855l.g(callback, "callback");
        if (states.contains(getState())) {
            callback.invoke(getState());
        } else {
            this.stateChangeOnceListeners.add(new Function1() { // from class: expo.modules.fetch.f
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(NativeResponse.waitForStates$lambda$2(states, callback, (ResponseState) obj));
                }
            });
        }
    }
}
