package expo.modules.kotlin.events;

import expo.modules.notifications.notifications.presentation.builders.ExpoNotificationBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lexpo/modules/kotlin/events/BasicEventListener;", "Lexpo/modules/kotlin/events/EventListener;", "Lexpo/modules/kotlin/events/EventName;", "eventName", "Lkotlin/Function0;", "Li7/B;", ExpoNotificationBuilder.EXTRAS_BODY_KEY, "<init>", "(Lexpo/modules/kotlin/events/EventName;Lw7/a;)V", "call", "()V", "Lw7/a;", "getBody", "()Lw7/a;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BasicEventListener extends EventListener {
    private final InterfaceC3487a body;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicEventListener(EventName eventName, InterfaceC3487a body) {
        super(eventName, null);
        AbstractC2855l.g(eventName, "eventName");
        AbstractC2855l.g(body, "body");
        this.body = body;
    }

    public final void call() {
        this.body.invoke();
    }

    public final InterfaceC3487a getBody() {
        return this.body;
    }
}
