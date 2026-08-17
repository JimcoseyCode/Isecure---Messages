package h1;

import android.os.Bundle;
import i7.C2742e;
import j7.K;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: h1.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2694c {
    public static Bundle a(Bundle source) {
        AbstractC2855l.g(source, "source");
        return source;
    }

    public static final boolean b(Bundle bundle, String key) {
        AbstractC2855l.g(key, "key");
        return bundle.containsKey(key);
    }

    public static final Bundle c(Bundle bundle, String key) {
        AbstractC2855l.g(key, "key");
        Bundle bundle2 = bundle.getBundle(key);
        if (bundle2 != null) {
            return bundle2;
        }
        AbstractC2695d.a(key);
        throw new C2742e();
    }

    public static final Bundle d(Bundle bundle, String key) {
        AbstractC2855l.g(key, "key");
        return bundle.getBundle(key);
    }

    public static final List e(Bundle bundle, String key) {
        AbstractC2855l.g(key, "key");
        return bundle.getStringArrayList(key);
    }

    public static final boolean f(Bundle bundle) {
        return bundle.isEmpty();
    }

    public static final Map g(Bundle bundle) {
        Map mapD = K.d(bundle.size());
        for (String str : bundle.keySet()) {
            AbstractC2855l.d(str);
            mapD.put(str, bundle.get(str));
        }
        return K.b(mapD);
    }
}
