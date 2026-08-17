package i7;

import java.io.Serializable;
import kotlin.Lazy;

/* JADX INFO: renamed from: i7.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2741d implements Lazy, Serializable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f28707g;

    public C2741d(Object obj) {
        this.f28707g = obj;
    }

    @Override // kotlin.Lazy
    public boolean e() {
        return true;
    }

    @Override // kotlin.Lazy
    public Object getValue() {
        return this.f28707g;
    }

    public String toString() {
        return String.valueOf(getValue());
    }
}
