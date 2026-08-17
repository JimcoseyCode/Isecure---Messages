package androidx.lifecycle;

import android.os.Bundle;
import b1.C1798b;
import h1.AbstractC2694c;
import h1.C2697f;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class I {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f17535c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f17536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C1798b f17537b;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final I a(Bundle bundle, Bundle bundle2) {
            if (bundle == null) {
                bundle = bundle2;
            }
            if (bundle == null) {
                return new I();
            }
            ClassLoader classLoader = I.class.getClassLoader();
            AbstractC2855l.d(classLoader);
            bundle.setClassLoader(classLoader);
            return new I(AbstractC2694c.g(AbstractC2694c.a(bundle)));
        }

        private a() {
        }
    }

    public I(Map initialState) {
        AbstractC2855l.g(initialState, "initialState");
        this.f17536a = new LinkedHashMap();
        this.f17537b = new C1798b(initialState);
    }

    public final C2697f.b a() {
        return this.f17537b.b();
    }

    public I() {
        this.f17536a = new LinkedHashMap();
        this.f17537b = new C1798b(null, 1, null);
    }
}
