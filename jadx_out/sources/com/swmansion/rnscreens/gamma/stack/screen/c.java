package com.swmansion.rnscreens.gamma.stack.screen;

import R6.e;
import R6.f;
import com.facebook.react.bridge.ReactContext;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends P6.a implements P6.c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f25175e = new a(null);

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

    @Override // P6.c
    public void a() {
        e().dispatchEvent(new R6.b(f(), g()));
    }

    @Override // P6.c
    public void b() {
        e().dispatchEvent(new R6.a(f(), g()));
    }

    @Override // P6.c
    public void c() {
        e().dispatchEvent(new e(f(), g()));
    }

    @Override // P6.c
    public void d() {
        e().dispatchEvent(new f(f(), g()));
    }

    public final void h(boolean z10) {
        e().dispatchEvent(new R6.c(f(), g(), z10));
    }
}
