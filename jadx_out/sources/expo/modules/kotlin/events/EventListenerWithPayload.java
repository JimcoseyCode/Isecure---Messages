package expo.modules.kotlin.events;

import expo.modules.notifications.notifications.presentation.builders.ExpoNotificationBuilder;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\fR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lexpo/modules/kotlin/events/EventListenerWithPayload;", "Payload", "Lexpo/modules/kotlin/events/EventListener;", "Lexpo/modules/kotlin/events/EventName;", "eventName", "Lkotlin/Function1;", "Li7/B;", ExpoNotificationBuilder.EXTRAS_BODY_KEY, "<init>", "(Lexpo/modules/kotlin/events/EventName;Lkotlin/jvm/functions/Function1;)V", "sender", "call", "(Ljava/lang/Object;)V", "Lkotlin/jvm/functions/Function1;", "getBody", "()Lkotlin/jvm/functions/Function1;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class EventListenerWithPayload<Payload> extends EventListener {
    private final Function1 body;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventListenerWithPayload(EventName eventName, Function1 body) {
        super(eventName, null);
        AbstractC2855l.g(eventName, "eventName");
        AbstractC2855l.g(body, "body");
        this.body = body;
    }

    public final void call(Payload sender) {
        this.body.invoke(sender);
    }

    public final Function1 getBody() {
        return this.body;
    }
}
