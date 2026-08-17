package com.swmansion.gesturehandler.react;

import J6.AbstractC1274d;
import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.Event;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends Event {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f24925d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final H0.f f24926e = new H0.f(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private K6.b f24927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private short f24928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f24929c;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ c c(a aVar, AbstractC1274d abstractC1274d, K6.b bVar, boolean z10, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                z10 = false;
            }
            return aVar.b(abstractC1274d, bVar, z10);
        }

        public final WritableMap a(K6.b dataBuilder) {
            AbstractC2855l.g(dataBuilder, "dataBuilder");
            WritableMap writableMapCreateMap = Arguments.createMap();
            dataBuilder.a(writableMapCreateMap);
            return writableMapCreateMap;
        }

        public final c b(AbstractC1274d handler, K6.b dataBuilder, boolean z10) {
            AbstractC2855l.g(handler, "handler");
            AbstractC2855l.g(dataBuilder, "dataBuilder");
            c cVar = (c) c.f24926e.acquire();
            if (cVar == null) {
                cVar = new c(null);
            }
            cVar.c(handler, dataBuilder, z10);
            return cVar;
        }

        private a() {
        }
    }

    public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(AbstractC1274d abstractC1274d, K6.b bVar, boolean z10) {
        View viewW = abstractC1274d.W();
        AbstractC2855l.d(viewW);
        super.init(UIManagerHelper.getSurfaceId(viewW), viewW.getId());
        this.f24927a = bVar;
        this.f24929c = z10;
        this.f24928b = abstractC1274d.I();
    }

    @Override // com.facebook.react.uimanager.events.Event
    public boolean canCoalesce() {
        return true;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public short getCoalescingKey() {
        return this.f24928b;
    }

    @Override // com.facebook.react.uimanager.events.Event
    /* JADX INFO: renamed from: getEventData */
    protected WritableMap getAccessibilityEventData() {
        a aVar = f24925d;
        K6.b bVar = this.f24927a;
        AbstractC2855l.d(bVar);
        return aVar.a(bVar);
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return this.f24929c ? "topGestureHandlerEvent" : "onGestureHandlerEvent";
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void onDispose() {
        this.f24927a = null;
        f24926e.release(this);
    }

    private c() {
    }
}
