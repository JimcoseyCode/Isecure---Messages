package t;

import android.hardware.camera2.params.InputConfiguration;
import android.os.Build;
import java.util.Objects;

/* JADX INFO: renamed from: t.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C3349i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f32441a;

    /* JADX INFO: renamed from: t.i$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InputConfiguration f32442a;

        a(Object obj) {
            this.f32442a = (InputConfiguration) obj;
        }

        @Override // t.C3349i.c
        public Object a() {
            return this.f32442a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                return Objects.equals(this.f32442a, ((c) obj).a());
            }
            return false;
        }

        public int hashCode() {
            return this.f32442a.hashCode();
        }

        public String toString() {
            return this.f32442a.toString();
        }
    }

    /* JADX INFO: renamed from: t.i$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class b extends a {
        b(Object obj) {
            super(obj);
        }
    }

    /* JADX INFO: renamed from: t.i$c */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private interface c {
        Object a();
    }

    private C3349i(c cVar) {
        this.f32441a = cVar;
    }

    public static C3349i b(Object obj) {
        if (obj == null) {
            return null;
        }
        return Build.VERSION.SDK_INT >= 31 ? new C3349i(new b(obj)) : new C3349i(new a(obj));
    }

    public Object a() {
        return this.f32441a.a();
    }

    public boolean equals(Object obj) {
        if (obj instanceof C3349i) {
            return this.f32441a.equals(((C3349i) obj).f32441a);
        }
        return false;
    }

    public int hashCode() {
        return this.f32441a.hashCode();
    }

    public String toString() {
        return this.f32441a.toString();
    }
}
