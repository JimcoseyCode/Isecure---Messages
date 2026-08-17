package L7;

import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1284i f7306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f7307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final X f7308c;

    public X(InterfaceC1284i classifierDescriptor, List arguments, X x10) {
        AbstractC2855l.g(classifierDescriptor, "classifierDescriptor");
        AbstractC2855l.g(arguments, "arguments");
        this.f7306a = classifierDescriptor;
        this.f7307b = arguments;
        this.f7308c = x10;
    }

    public final List a() {
        return this.f7307b;
    }

    public final InterfaceC1284i b() {
        return this.f7306a;
    }

    public final X c() {
        return this.f7308c;
    }
}
