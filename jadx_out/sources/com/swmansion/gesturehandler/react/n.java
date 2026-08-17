package com.swmansion.gesturehandler.react;

import J6.AbstractC1274d;
import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.Event;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class n extends Event {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f24961c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final H0.f f24962d = new H0.f(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WritableMap f24963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private short f24964b;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final WritableMap a(AbstractC1274d handler) {
            AbstractC2855l.g(handler, "handler");
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putInt("handlerTag", handler.T());
            writableMapCreateMap.putInt("state", handler.S());
            writableMapCreateMap.putInt("numberOfTouches", handler.V());
            writableMapCreateMap.putInt("eventType", handler.U());
            writableMapCreateMap.putInt("pointerType", handler.Q());
            WritableArray writableArrayT = handler.t();
            if (writableArrayT != null) {
                writableMapCreateMap.putArray("changedTouches", writableArrayT);
            }
            WritableArray writableArrayS = handler.s();
            if (writableArrayS != null) {
                writableMapCreateMap.putArray("allTouches", writableArrayS);
            }
            if (handler.a0() && handler.S() == 4) {
                writableMapCreateMap.putInt("state", 2);
            }
            return writableMapCreateMap;
        }

        public final n b(AbstractC1274d handler) {
            AbstractC2855l.g(handler, "handler");
            n nVar = (n) n.f24962d.acquire();
            if (nVar == null) {
                nVar = new n(null);
            }
            nVar.c(handler);
            return nVar;
        }

        private a() {
        }
    }

    public /* synthetic */ n(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(AbstractC1274d abstractC1274d) {
        View viewW = abstractC1274d.W();
        AbstractC2855l.d(viewW);
        super.init(UIManagerHelper.getSurfaceId(viewW), viewW.getId());
        this.f24963a = f24961c.a(abstractC1274d);
        this.f24964b = abstractC1274d.I();
    }

    @Override // com.facebook.react.uimanager.events.Event
    public boolean canCoalesce() {
        return true;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public short getCoalescingKey() {
        return this.f24964b;
    }

    @Override // com.facebook.react.uimanager.events.Event
    /* JADX INFO: renamed from: getEventData */
    protected WritableMap getAccessibilityEventData() {
        return this.f24963a;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return "onGestureHandlerEvent";
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void onDispose() {
        this.f24963a = null;
        f24962d.release(this);
    }

    private n() {
    }
}
