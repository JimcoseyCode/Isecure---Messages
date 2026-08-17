package e;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: e.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2379a {

    /* JADX INFO: renamed from: e.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class C0253a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f25798a;

        public C0253a(Object obj) {
            this.f25798a = obj;
        }

        public final Object a() {
            return this.f25798a;
        }
    }

    public abstract Intent a(Context context, Object obj);

    public C0253a b(Context context, Object obj) {
        AbstractC2855l.g(context, "context");
        return null;
    }

    public abstract Object c(int i10, Intent intent);
}
