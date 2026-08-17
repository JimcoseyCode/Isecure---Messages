package com.swmansion.gesturehandler.react;

import J6.AbstractC1274d;
import J6.B;
import J6.C1272b;
import J6.m;
import J6.o;
import J6.p;
import J6.q;
import J6.t;
import J6.u;
import J6.x;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f24932a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AbstractC1274d.c[] f24933b = {new q.d(), new B.b(), new o.b(), new t.b(), new u.a(), new x.b(), new C1272b.C0059b(), new p.a(), new m.b()};

    private e() {
    }

    public final AbstractC1274d.c a(AbstractC1274d handler) {
        AbstractC2855l.g(handler, "handler");
        for (AbstractC1274d.c cVar : f24933b) {
            if (AbstractC2855l.b(cVar.e(), handler.getClass())) {
                return cVar;
            }
        }
        return null;
    }

    public final AbstractC1274d.c b(String handlerName) {
        AbstractC2855l.g(handlerName, "handlerName");
        for (AbstractC1274d.c cVar : f24933b) {
            if (AbstractC2855l.b(cVar.d(), handlerName)) {
                return cVar;
            }
        }
        return null;
    }
}
