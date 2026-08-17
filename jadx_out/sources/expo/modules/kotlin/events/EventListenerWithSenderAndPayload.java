package expo.modules.kotlin.events;

import expo.modules.notifications.notifications.presentation.builders.ExpoNotificationBuilder;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B)\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u0001¢\u0006\u0004\b\r\u0010\u000eR)\u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lexpo/modules/kotlin/events/EventListenerWithSenderAndPayload;", "Sender", "Payload", "Lexpo/modules/kotlin/events/EventListener;", "Lexpo/modules/kotlin/events/EventName;", "eventName", "Lkotlin/Function2;", "Li7/B;", ExpoNotificationBuilder.EXTRAS_BODY_KEY, "<init>", "(Lexpo/modules/kotlin/events/EventName;Lkotlin/jvm/functions/Function2;)V", "sender", "payload", "call", "(Ljava/lang/Object;Ljava/lang/Object;)V", "Lkotlin/jvm/functions/Function2;", "getBody", "()Lkotlin/jvm/functions/Function2;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class EventListenerWithSenderAndPayload<Sender, Payload> extends EventListener {
    private final Function2 body;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventListenerWithSenderAndPayload(EventName eventName, Function2 body) {
        super(eventName, null);
        AbstractC2855l.g(eventName, "eventName");
        AbstractC2855l.g(body, "body");
        this.body = body;
    }

    public final void call(Sender sender, Payload payload) {
        this.body.invoke(sender, payload);
    }

    public final Function2 getBody() {
        return this.body;
    }
}
