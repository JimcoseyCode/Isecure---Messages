package O7;

import L7.InterfaceC1280e;
import L7.InterfaceC1288m;
import w8.C3499e;
import w8.InterfaceC3501g;

/* JADX INFO: renamed from: O7.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class C1340t extends AbstractC1324c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final InterfaceC1280e f8550i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final C3499e f8551j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1340t(InterfaceC1280e interfaceC1280e) {
        super(M7.h.f7570a.b());
        if (interfaceC1280e == null) {
            G(0);
        }
        this.f8550i = interfaceC1280e;
        this.f8551j = new C3499e(interfaceC1280e, null);
    }

    private static /* synthetic */ void G(int i10) {
        String str = (i10 == 1 || i10 == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 1 || i10 == 2) ? 2 : 3];
        if (i10 == 1 || i10 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else if (i10 != 3) {
            objArr[0] = "descriptor";
        } else {
            objArr[0] = "newOwner";
        }
        if (i10 == 1) {
            objArr[1] = "getValue";
        } else if (i10 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "copy";
            }
        }
        String str2 = String.format(str, objArr);
        if (i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // L7.InterfaceC1288m
    public InterfaceC1288m b() {
        InterfaceC1280e interfaceC1280e = this.f8550i;
        if (interfaceC1280e == null) {
            G(2);
        }
        return interfaceC1280e;
    }

    @Override // L7.c0
    public InterfaceC3501g getValue() {
        C3499e c3499e = this.f8551j;
        if (c3499e == null) {
            G(1);
        }
        return c3499e;
    }

    @Override // O7.AbstractC1334m
    public String toString() {
        return "class " + this.f8550i.getName() + "::this";
    }
}
