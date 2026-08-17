package com.facebook.react.modules.fresco;

import B3.a;
import P8.q;
import android.util.Pair;
import com.facebook.imagepipeline.request.b;
import com.facebook.react.uimanager.events.PointerEventHelper;
import f3.AbstractC2607a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ5\u0010\f\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ=\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J5\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0012\u0010\rJ'\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ/\u0010!\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b%\u0010&R\u0016\u0010(\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R,\u0010,\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00040+0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R,\u0010.\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00040+0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010-¨\u0006/"}, d2 = {"Lcom/facebook/react/modules/fresco/SystraceRequestListener;", "Lf3/a;", "<init>", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "requestId", "producerName", "Li7/B;", "onProducerStart", "(Ljava/lang/String;Ljava/lang/String;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "extraMap", "onProducerFinishWithSuccess", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "t", "onProducerFinishWithFailure", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/Map;)V", "onProducerFinishWithCancellation", "eventName", "onProducerEvent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/facebook/imagepipeline/request/b;", "request", PointerEventHelper.POINTER_TYPE_UNKNOWN, "callerContext", PointerEventHelper.POINTER_TYPE_UNKNOWN, "isPrefetch", "onRequestStart", "(Lcom/facebook/imagepipeline/request/b;Ljava/lang/Object;Ljava/lang/String;Z)V", "onRequestSuccess", "(Lcom/facebook/imagepipeline/request/b;Ljava/lang/String;Z)V", "throwable", "onRequestFailure", "(Lcom/facebook/imagepipeline/request/b;Ljava/lang/String;Ljava/lang/Throwable;Z)V", "onRequestCancellation", "(Ljava/lang/String;)V", "requiresExtraMap", "(Ljava/lang/String;)Z", PointerEventHelper.POINTER_TYPE_UNKNOWN, "currentId", "I", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Landroid/util/Pair;", "producerId", "Ljava/util/Map;", "requestsId", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SystraceRequestListener extends AbstractC2607a {
    private int currentId;
    private final Map<String, Pair<Integer, String>> producerId = new LinkedHashMap();
    private final Map<String, Pair<Integer, String>> requestsId = new LinkedHashMap();

    @Override // f3.AbstractC2607a, com.facebook.imagepipeline.producers.h0
    public void onProducerEvent(String requestId, String producerName, String eventName) {
        AbstractC2855l.g(requestId, "requestId");
        AbstractC2855l.g(producerName, "producerName");
        AbstractC2855l.g(eventName, "eventName");
        if (a.j(0L)) {
            a.n(0L, "FRESCO_PRODUCER_EVENT_" + q.D(requestId, ':', '_', false, 4, null) + "_" + q.D(producerName, ':', '_', false, 4, null) + "_" + q.D(eventName, ':', '_', false, 4, null), a.EnumC0014a.f349h);
        }
    }

    @Override // f3.AbstractC2607a, com.facebook.imagepipeline.producers.h0
    public void onProducerFinishWithCancellation(String requestId, String producerName, Map<String, String> extraMap) {
        Pair<Integer, String> pair;
        AbstractC2855l.g(requestId, "requestId");
        AbstractC2855l.g(producerName, "producerName");
        if (a.j(0L) && (pair = this.producerId.get(requestId)) != null) {
            Object second = pair.second;
            AbstractC2855l.f(second, "second");
            Object first = pair.first;
            AbstractC2855l.f(first, "first");
            a.g(0L, (String) second, ((Number) first).intValue());
            this.producerId.remove(requestId);
        }
    }

    @Override // f3.AbstractC2607a, com.facebook.imagepipeline.producers.h0
    public void onProducerFinishWithFailure(String requestId, String producerName, Throwable t10, Map<String, String> extraMap) {
        Pair<Integer, String> pair;
        AbstractC2855l.g(requestId, "requestId");
        AbstractC2855l.g(producerName, "producerName");
        AbstractC2855l.g(t10, "t");
        if (a.j(0L) && (pair = this.producerId.get(requestId)) != null) {
            Object second = pair.second;
            AbstractC2855l.f(second, "second");
            Object first = pair.first;
            AbstractC2855l.f(first, "first");
            a.g(0L, (String) second, ((Number) first).intValue());
            this.producerId.remove(requestId);
        }
    }

    @Override // f3.AbstractC2607a, com.facebook.imagepipeline.producers.h0
    public void onProducerFinishWithSuccess(String requestId, String producerName, Map<String, String> extraMap) {
        Pair<Integer, String> pair;
        AbstractC2855l.g(requestId, "requestId");
        AbstractC2855l.g(producerName, "producerName");
        if (a.j(0L) && (pair = this.producerId.get(requestId)) != null) {
            Object second = pair.second;
            AbstractC2855l.f(second, "second");
            Object first = pair.first;
            AbstractC2855l.f(first, "first");
            a.g(0L, (String) second, ((Number) first).intValue());
            this.producerId.remove(requestId);
        }
    }

    @Override // f3.AbstractC2607a, com.facebook.imagepipeline.producers.h0
    public void onProducerStart(String requestId, String producerName) {
        AbstractC2855l.g(requestId, "requestId");
        AbstractC2855l.g(producerName, "producerName");
        if (a.j(0L)) {
            Pair<Integer, String> pairCreate = Pair.create(Integer.valueOf(this.currentId), "FRESCO_PRODUCER_" + q.D(producerName, ':', '_', false, 4, null));
            Object second = pairCreate.second;
            AbstractC2855l.f(second, "second");
            a.a(0L, (String) second, this.currentId);
            this.producerId.put(requestId, pairCreate);
            this.currentId++;
        }
    }

    @Override // f3.InterfaceC2611e
    public void onRequestCancellation(String requestId) {
        Pair<Integer, String> pair;
        AbstractC2855l.g(requestId, "requestId");
        if (a.j(0L) && (pair = this.requestsId.get(requestId)) != null) {
            Object second = pair.second;
            AbstractC2855l.f(second, "second");
            Object first = pair.first;
            AbstractC2855l.f(first, "first");
            a.g(0L, (String) second, ((Number) first).intValue());
            this.requestsId.remove(requestId);
        }
    }

    @Override // f3.InterfaceC2611e
    public void onRequestFailure(b request, String requestId, Throwable throwable, boolean isPrefetch) {
        Pair<Integer, String> pair;
        AbstractC2855l.g(request, "request");
        AbstractC2855l.g(requestId, "requestId");
        AbstractC2855l.g(throwable, "throwable");
        if (a.j(0L) && (pair = this.requestsId.get(requestId)) != null) {
            Object second = pair.second;
            AbstractC2855l.f(second, "second");
            Object first = pair.first;
            AbstractC2855l.f(first, "first");
            a.g(0L, (String) second, ((Number) first).intValue());
            this.requestsId.remove(requestId);
        }
    }

    @Override // f3.InterfaceC2611e
    public void onRequestStart(b request, Object callerContext, String requestId, boolean isPrefetch) {
        AbstractC2855l.g(request, "request");
        AbstractC2855l.g(callerContext, "callerContext");
        AbstractC2855l.g(requestId, "requestId");
        if (a.j(0L)) {
            StringBuilder sb = new StringBuilder();
            sb.append("FRESCO_REQUEST_");
            String string = request.getSourceUri().toString();
            AbstractC2855l.f(string, "toString(...)");
            sb.append(q.D(string, ':', '_', false, 4, null));
            Pair<Integer, String> pairCreate = Pair.create(Integer.valueOf(this.currentId), sb.toString());
            Object second = pairCreate.second;
            AbstractC2855l.f(second, "second");
            a.a(0L, (String) second, this.currentId);
            this.requestsId.put(requestId, pairCreate);
            this.currentId++;
        }
    }

    @Override // f3.InterfaceC2611e
    public void onRequestSuccess(b request, String requestId, boolean isPrefetch) {
        Pair<Integer, String> pair;
        AbstractC2855l.g(request, "request");
        AbstractC2855l.g(requestId, "requestId");
        if (a.j(0L) && (pair = this.requestsId.get(requestId)) != null) {
            Object second = pair.second;
            AbstractC2855l.f(second, "second");
            Object first = pair.first;
            AbstractC2855l.f(first, "first");
            a.g(0L, (String) second, ((Number) first).intValue());
            this.requestsId.remove(requestId);
        }
    }

    @Override // f3.AbstractC2607a, com.facebook.imagepipeline.producers.h0
    public boolean requiresExtraMap(String requestId) {
        AbstractC2855l.g(requestId, "requestId");
        return false;
    }
}
