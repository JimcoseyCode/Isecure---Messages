package h1;

import android.os.Bundle;
import h1.C2693b;
import i1.C2722b;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: h1.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C2697f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2722b f28261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C2693b.C0284b f28262b;

    /* JADX INFO: renamed from: h1.f$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface a {
        void a(InterfaceC2700i interfaceC2700i);
    }

    /* JADX INFO: renamed from: h1.f$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface b {
        Bundle a();
    }

    public C2697f(C2722b impl) {
        AbstractC2855l.g(impl, "impl");
        this.f28261a = impl;
    }

    public final Bundle a(String key) {
        AbstractC2855l.g(key, "key");
        return this.f28261a.c(key);
    }

    public final b b(String key) {
        AbstractC2855l.g(key, "key");
        return this.f28261a.d(key);
    }

    public final void c(String key, b provider) {
        AbstractC2855l.g(key, "key");
        AbstractC2855l.g(provider, "provider");
        this.f28261a.j(key, provider);
    }

    public final void d(Class clazz) {
        AbstractC2855l.g(clazz, "clazz");
        if (!this.f28261a.e()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        C2693b.C0284b c0284b = this.f28262b;
        if (c0284b == null) {
            c0284b = new C2693b.C0284b(this);
        }
        this.f28262b = c0284b;
        try {
            clazz.getDeclaredConstructor(null);
            C2693b.C0284b c0284b2 = this.f28262b;
            if (c0284b2 != null) {
                String name = clazz.getName();
                AbstractC2855l.f(name, "getName(...)");
                c0284b2.b(name);
            }
        } catch (NoSuchMethodException e10) {
            throw new IllegalArgumentException("Class " + clazz.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
        }
    }
}
