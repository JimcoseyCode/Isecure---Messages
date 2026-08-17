package v5;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f32944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f32945b;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f32946a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Map f32947b = null;

        b(String str) {
            this.f32946a = str;
        }

        public c a() {
            return new c(this.f32946a, this.f32947b == null ? Collections.EMPTY_MAP : Collections.unmodifiableMap(new HashMap(this.f32947b)));
        }

        public b b(Annotation annotation) {
            if (this.f32947b == null) {
                this.f32947b = new HashMap();
            }
            this.f32947b.put(annotation.annotationType(), annotation);
            return this;
        }
    }

    public static b a(String str) {
        return new b(str);
    }

    public static c d(String str) {
        return new c(str, Collections.EMPTY_MAP);
    }

    public String b() {
        return this.f32944a;
    }

    public Annotation c(Class cls) {
        return (Annotation) this.f32945b.get(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f32944a.equals(cVar.f32944a) && this.f32945b.equals(cVar.f32945b);
    }

    public int hashCode() {
        return (this.f32944a.hashCode() * 31) + this.f32945b.hashCode();
    }

    public String toString() {
        return "FieldDescriptor{name=" + this.f32944a + ", properties=" + this.f32945b.values() + "}";
    }

    private c(String str, Map map) {
        this.f32944a = str;
        this.f32945b = map;
    }
}
