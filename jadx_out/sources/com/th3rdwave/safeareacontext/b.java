package com.th3rdwave.safeareacontext;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends Event {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f25475c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.th3rdwave.safeareacontext.a f25476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f25477b;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i10, int i11, com.th3rdwave.safeareacontext.a mInsets, c mFrame) {
        super(i10, i11);
        AbstractC2855l.g(mInsets, "mInsets");
        AbstractC2855l.g(mFrame, "mFrame");
        this.f25476a = mInsets;
        this.f25477b = mFrame;
    }

    @Override // com.facebook.react.uimanager.events.Event
    protected WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putMap("insets", q.b(this.f25476a));
        writableMapCreateMap.putMap("frame", q.d(this.f25477b));
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return "topInsetsChange";
    }
}
