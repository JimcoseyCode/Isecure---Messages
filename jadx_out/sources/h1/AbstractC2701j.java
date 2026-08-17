package h1;

import android.os.Bundle;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: h1.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2701j {
    public static Bundle a(Bundle source) {
        AbstractC2855l.g(source, "source");
        return source;
    }

    public static final void b(Bundle bundle, Bundle from) {
        AbstractC2855l.g(from, "from");
        bundle.putAll(from);
    }

    public static final void c(Bundle bundle, String key, Bundle value) {
        AbstractC2855l.g(key, "key");
        AbstractC2855l.g(value, "value");
        bundle.putBundle(key, value);
    }

    public static final void d(Bundle bundle, String key, List value) {
        AbstractC2855l.g(key, "key");
        AbstractC2855l.g(value, "value");
        bundle.putStringArrayList(key, k.a(value));
    }

    public static final void e(Bundle bundle, String key) {
        AbstractC2855l.g(key, "key");
        bundle.remove(key);
    }
}
