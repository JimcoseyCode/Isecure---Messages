package com.swmansion.rnscreens.gamma.tabs;

import com.facebook.react.bridge.ReactContext;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends P6.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f25203e = new a(null);

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ReactContext reactContext, int i10) {
        super(reactContext, i10);
        AbstractC2855l.g(reactContext, "reactContext");
    }

    public final void a() {
        d.b(g(), "onDidDisappear");
        e().dispatchEvent(new S6.b(f(), g()));
    }

    public final void b() {
        d.b(g(), "onDidAppear");
        e().dispatchEvent(new S6.a(f(), g()));
    }

    public final void c() {
        d.b(g(), "onWillAppear");
        e().dispatchEvent(new S6.c(f(), g()));
    }

    public final void d() {
        d.b(g(), "onWillDisappear");
        e().dispatchEvent(new S6.d(f(), g()));
    }
}
