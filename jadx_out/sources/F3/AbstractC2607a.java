package f3;

import java.util.Map;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: f3.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2607a implements InterfaceC2611e {
    @Override // com.facebook.imagepipeline.producers.h0
    public void onProducerEvent(String requestId, String producerName, String eventName) {
        AbstractC2855l.g(requestId, "requestId");
        AbstractC2855l.g(producerName, "producerName");
        AbstractC2855l.g(eventName, "eventName");
    }

    @Override // com.facebook.imagepipeline.producers.h0
    public void onProducerFinishWithCancellation(String requestId, String producerName, Map map) {
        AbstractC2855l.g(requestId, "requestId");
        AbstractC2855l.g(producerName, "producerName");
    }

    @Override // com.facebook.imagepipeline.producers.h0
    public void onProducerFinishWithFailure(String requestId, String producerName, Throwable t10, Map map) {
        AbstractC2855l.g(requestId, "requestId");
        AbstractC2855l.g(producerName, "producerName");
        AbstractC2855l.g(t10, "t");
    }

    @Override // com.facebook.imagepipeline.producers.h0
    public void onProducerFinishWithSuccess(String requestId, String producerName, Map map) {
        AbstractC2855l.g(requestId, "requestId");
        AbstractC2855l.g(producerName, "producerName");
    }

    @Override // com.facebook.imagepipeline.producers.h0
    public void onProducerStart(String requestId, String producerName) {
        AbstractC2855l.g(requestId, "requestId");
        AbstractC2855l.g(producerName, "producerName");
    }

    @Override // com.facebook.imagepipeline.producers.h0
    public void onUltimateProducerReached(String requestId, String producerName, boolean z10) {
        AbstractC2855l.g(requestId, "requestId");
        AbstractC2855l.g(producerName, "producerName");
    }

    @Override // com.facebook.imagepipeline.producers.h0
    public boolean requiresExtraMap(String requestId) {
        AbstractC2855l.g(requestId, "requestId");
        return false;
    }
}
