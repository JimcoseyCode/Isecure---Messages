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
public final class m extends Event {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f24956d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final H0.f f24957e = new H0.f(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private K6.b f24958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f24959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f24960c;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final WritableMap a(K6.b dataBuilder, int i10, int i11) {
            AbstractC2855l.g(dataBuilder, "dataBuilder");
            WritableMap writableMapCreateMap = Arguments.createMap();
            dataBuilder.a(writableMapCreateMap);
            writableMapCreateMap.putInt("state", i10);
            writableMapCreateMap.putInt("oldState", i11);
            return writableMapCreateMap;
        }

        public final m b(AbstractC1274d handler, int i10, int i11, K6.b dataBuilder) {
            AbstractC2855l.g(handler, "handler");
            AbstractC2855l.g(dataBuilder, "dataBuilder");
            m mVar = (m) m.f24957e.acquire();
            if (mVar == null) {
                mVar = new m(null);
            }
            mVar.c(handler, i10, i11, dataBuilder);
            return mVar;
        }

        private a() {
        }
    }

    public /* synthetic */ m(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(AbstractC1274d abstractC1274d, int i10, int i11, K6.b bVar) {
        View viewW = abstractC1274d.W();
        AbstractC2855l.d(viewW);
        super.init(UIManagerHelper.getSurfaceId(viewW), viewW.getId());
        this.f24958a = bVar;
        this.f24959b = i10;
        this.f24960c = i11;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public boolean canCoalesce() {
        return false;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.Event
    /* JADX INFO: renamed from: getEventData */
    protected WritableMap getAccessibilityEventData() {
        a aVar = f24956d;
        K6.b bVar = this.f24958a;
        AbstractC2855l.d(bVar);
        return aVar.a(bVar, this.f24959b, this.f24960c);
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return "onGestureHandlerStateChange";
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void onDispose() {
        this.f24958a = null;
        this.f24959b = 0;
        this.f24960c = 0;
        f24957e.release(this);
    }

    private m() {
    }
}
