package R6;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class d extends Event implements P6.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f10043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f10044b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(int i10, int i11, String name, String registrationName) {
        super(i10, i11);
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(registrationName, "registrationName");
        this.f10043a = name;
        this.f10044b = registrationName;
    }

    @Override // P6.b
    public String a() {
        return this.f10044b;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.Event
    protected WritableMap getEventData() {
        return Arguments.createMap();
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return this.f10043a;
    }
}
