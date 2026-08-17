package J6;

import J6.AbstractC1274d;
import android.content.Context;
import android.view.MotionEvent;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class p extends AbstractC1274d {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a extends AbstractC1274d.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Class f6682b = p.class;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f6683c = "ManualGestureHandler";

        @Override // J6.AbstractC1274d.c
        public String d() {
            return this.f6683c;
        }

        @Override // J6.AbstractC1274d.c
        public Class e() {
            return this.f6682b;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // J6.AbstractC1274d.c
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public p a(Context context) {
            return new p();
        }

        @Override // J6.AbstractC1274d.c
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public K6.e c(p handler) {
            AbstractC2855l.g(handler, "handler");
            return new K6.e(handler);
        }
    }

    @Override // J6.AbstractC1274d
    protected void l0(MotionEvent event, MotionEvent sourceEvent) {
        AbstractC2855l.g(event, "event");
        AbstractC2855l.g(sourceEvent, "sourceEvent");
        if (S() == 0) {
            p();
        }
    }
}
