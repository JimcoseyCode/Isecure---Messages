package U5;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f11353a;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private LinkedHashMap f11354a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f11355b;

        /* JADX INFO: renamed from: U5.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class C0117a extends LinkedHashMap {
            C0117a(int i10, float f10, boolean z10) {
                super(i10, f10, z10);
            }

            @Override // java.util.LinkedHashMap
            protected boolean removeEldestEntry(Map.Entry entry) {
                return size() > a.this.f11355b;
            }
        }

        public a(int i10) {
            this.f11355b = i10;
            this.f11354a = new C0117a(((i10 * 4) / 3) + 1, 0.75f, true);
        }

        public synchronized Object b(Object obj) {
            return this.f11354a.get(obj);
        }

        public synchronized void c(Object obj, Object obj2) {
            this.f11354a.put(obj, obj2);
        }
    }

    public d(int i10) {
        this.f11353a = new a(i10);
    }

    public Pattern a(String str) {
        Pattern pattern = (Pattern) this.f11353a.b(str);
        if (pattern != null) {
            return pattern;
        }
        Pattern patternCompile = Pattern.compile(str);
        this.f11353a.c(str, patternCompile);
        return patternCompile;
    }
}
