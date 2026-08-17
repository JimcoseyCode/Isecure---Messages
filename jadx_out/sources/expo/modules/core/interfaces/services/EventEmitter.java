package expo.modules.core.interfaces.services;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public interface EventEmitter {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static abstract class BaseEvent implements Event {
        @Override // expo.modules.core.interfaces.services.EventEmitter.Event
        public boolean canCoalesce() {
            return true;
        }

        @Override // expo.modules.core.interfaces.services.EventEmitter.Event
        public short getCoalescingKey() {
            return (short) 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface Event {
        boolean canCoalesce();

        short getCoalescingKey();

        Bundle getEventBody();

        String getEventName();
    }

    void emit(int i10, Event event);

    void emit(int i10, String str, Bundle bundle);

    void emit(String str, Bundle bundle);
}
