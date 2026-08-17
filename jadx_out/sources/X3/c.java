package X3;

import android.content.Context;
import g4.InterfaceC2673a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class c extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f12461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC2673a f12462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC2673a f12463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f12464d;

    c(Context context, InterfaceC2673a interfaceC2673a, InterfaceC2673a interfaceC2673a2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f12461a = context;
        if (interfaceC2673a == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f12462b = interfaceC2673a;
        if (interfaceC2673a2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f12463c = interfaceC2673a2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f12464d = str;
    }

    @Override // X3.h
    public Context b() {
        return this.f12461a;
    }

    @Override // X3.h
    public String c() {
        return this.f12464d;
    }

    @Override // X3.h
    public InterfaceC2673a d() {
        return this.f12463c;
    }

    @Override // X3.h
    public InterfaceC2673a e() {
        return this.f12462b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f12461a.equals(hVar.b()) && this.f12462b.equals(hVar.e()) && this.f12463c.equals(hVar.d()) && this.f12464d.equals(hVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f12461a.hashCode() ^ 1000003) * 1000003) ^ this.f12462b.hashCode()) * 1000003) ^ this.f12463c.hashCode()) * 1000003) ^ this.f12464d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f12461a + ", wallClock=" + this.f12462b + ", monotonicClock=" + this.f12463c + ", backendName=" + this.f12464d + "}";
    }
}
