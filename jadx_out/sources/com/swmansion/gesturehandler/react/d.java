package com.swmansion.gesturehandler.react;

import J6.AbstractC1274d;
import J6.r;
import android.view.MotionEvent;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.swmansion.gesturehandler.react.c;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class d implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReactApplicationContext f24930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final I6.i f24931b;

    public d(ReactApplicationContext reactApplicationContext) {
        AbstractC2855l.g(reactApplicationContext, "reactApplicationContext");
        this.f24930a = reactApplicationContext;
        this.f24931b = new I6.i();
    }

    private final void d(AbstractC1274d abstractC1274d) {
        AbstractC1274d.c cVarA;
        if (abstractC1274d.T() < 0 || abstractC1274d.S() != 4 || (cVarA = e.f24932a.a(abstractC1274d)) == null) {
            return;
        }
        int iF = abstractC1274d.F();
        if (iF == 1) {
            i(c.a.c(c.f24925d, abstractC1274d, cVarA.c(abstractC1274d), false, 4, null));
            return;
        }
        if (iF == 2) {
            h(c.f24925d.b(abstractC1274d, cVarA.c(abstractC1274d), true));
        } else if (iF == 3) {
            g("onGestureHandlerEvent", c.f24925d.a(cVarA.c(abstractC1274d)));
        } else {
            if (iF != 4) {
                return;
            }
            g("onGestureHandlerEvent", c.f24925d.a(cVarA.c(abstractC1274d)));
        }
    }

    private final void e(AbstractC1274d abstractC1274d, int i10, int i11) {
        AbstractC1274d.c cVarA;
        if (abstractC1274d.T() >= 0 && (cVarA = e.f24932a.a(abstractC1274d)) != null) {
            int iF = abstractC1274d.F();
            if (iF == 1) {
                i(m.f24956d.b(abstractC1274d, i10, i11, cVarA.c(abstractC1274d)));
                return;
            }
            if (iF == 2 || iF == 3) {
                g("onGestureHandlerStateChange", m.f24956d.a(cVarA.c(abstractC1274d), i10, i11));
            } else {
                if (iF != 4) {
                    return;
                }
                g("onGestureHandlerStateChange", m.f24956d.a(cVarA.c(abstractC1274d), i10, i11));
            }
        }
    }

    private final void f(AbstractC1274d abstractC1274d) {
        if (abstractC1274d.T() < 0) {
            return;
        }
        if (abstractC1274d.S() == 2 || abstractC1274d.S() == 4 || abstractC1274d.S() == 0 || abstractC1274d.W() != null) {
            int iF = abstractC1274d.F();
            if (iF == 1) {
                i(n.f24961c.b(abstractC1274d));
            } else {
                if (iF != 4) {
                    return;
                }
                g("onGestureHandlerEvent", n.f24961c.a(abstractC1274d));
            }
        }
    }

    private final void g(String str, WritableMap writableMap) {
        a.a(this.f24930a).emit(str, writableMap);
    }

    private final void h(c cVar) {
        I6.h.a(this.f24930a, cVar);
    }

    private final void i(Event event) {
        this.f24931b.a(event, this.f24930a);
    }

    @Override // J6.r
    public void a(AbstractC1274d handler) {
        AbstractC2855l.g(handler, "handler");
        f(handler);
    }

    @Override // J6.r
    public void b(AbstractC1274d handler, MotionEvent event) {
        AbstractC2855l.g(handler, "handler");
        AbstractC2855l.g(event, "event");
        d(handler);
    }

    @Override // J6.r
    public void c(AbstractC1274d handler, int i10, int i11) {
        AbstractC2855l.g(handler, "handler");
        e(handler, i10, i11);
    }
}
