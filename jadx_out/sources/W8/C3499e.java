package w8;

import C8.AbstractC0407d0;
import L7.InterfaceC1280e;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: w8.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class C3499e implements InterfaceC3501g, InterfaceC3502h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1280e f33173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3499e f33174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC1280e f33175c;

    public C3499e(InterfaceC1280e classDescriptor, C3499e c3499e) {
        AbstractC2855l.g(classDescriptor, "classDescriptor");
        this.f33173a = classDescriptor;
        this.f33174b = c3499e == null ? this : c3499e;
        this.f33175c = classDescriptor;
    }

    @Override // w8.InterfaceC3501g
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public AbstractC0407d0 getType() {
        AbstractC0407d0 abstractC0407d0R = this.f33173a.r();
        AbstractC2855l.f(abstractC0407d0R, "getDefaultType(...)");
        return abstractC0407d0R;
    }

    public boolean equals(Object obj) {
        InterfaceC1280e interfaceC1280e = this.f33173a;
        C3499e c3499e = obj instanceof C3499e ? (C3499e) obj : null;
        return AbstractC2855l.b(interfaceC1280e, c3499e != null ? c3499e.f33173a : null);
    }

    public int hashCode() {
        return this.f33173a.hashCode();
    }

    @Override // w8.InterfaceC3502h
    public final InterfaceC1280e q() {
        return this.f33173a;
    }

    public String toString() {
        return "Class{" + getType() + '}';
    }
}
