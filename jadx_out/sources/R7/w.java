package R7;

import R7.E;
import b8.InterfaceC1830n;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class w extends y implements InterfaceC1830n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Field f10104a;

    public w(Field member) {
        AbstractC2855l.g(member, "member");
        this.f10104a = member;
    }

    @Override // b8.InterfaceC1830n
    public boolean C() {
        return O().isEnumConstant();
    }

    @Override // b8.InterfaceC1830n
    public boolean K() {
        return false;
    }

    @Override // R7.y
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public Field O() {
        return this.f10104a;
    }

    @Override // b8.InterfaceC1830n
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public E getType() {
        E.a aVar = E.f10052a;
        Type genericType = O().getGenericType();
        AbstractC2855l.f(genericType, "getGenericType(...)");
        return aVar.a(genericType);
    }
}
