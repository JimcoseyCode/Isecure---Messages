package t8;

import L7.InterfaceC1280e;
import O7.K;
import X7.k;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: t8.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3378a implements InterfaceC3383f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f32524b;

    public C3378a(List inner) {
        AbstractC2855l.g(inner, "inner");
        this.f32524b = inner;
    }

    @Override // t8.InterfaceC3383f
    public K a(InterfaceC1280e thisDescriptor, K propertyDescriptor, k c10) {
        AbstractC2855l.g(thisDescriptor, "thisDescriptor");
        AbstractC2855l.g(propertyDescriptor, "propertyDescriptor");
        AbstractC2855l.g(c10, "c");
        Iterator it = this.f32524b.iterator();
        while (it.hasNext()) {
            propertyDescriptor = ((InterfaceC3383f) it.next()).a(thisDescriptor, propertyDescriptor, c10);
        }
        return propertyDescriptor;
    }

    @Override // t8.InterfaceC3383f
    public List b(InterfaceC1280e thisDescriptor, k c10) {
        AbstractC2855l.g(thisDescriptor, "thisDescriptor");
        AbstractC2855l.g(c10, "c");
        List list = this.f32524b;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC2800q.A(arrayList, ((InterfaceC3383f) it.next()).b(thisDescriptor, c10));
        }
        return arrayList;
    }

    @Override // t8.InterfaceC3383f
    public void c(InterfaceC1280e thisDescriptor, k8.f name, Collection result, k c10) {
        AbstractC2855l.g(thisDescriptor, "thisDescriptor");
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(result, "result");
        AbstractC2855l.g(c10, "c");
        Iterator it = this.f32524b.iterator();
        while (it.hasNext()) {
            ((InterfaceC3383f) it.next()).c(thisDescriptor, name, result, c10);
        }
    }

    @Override // t8.InterfaceC3383f
    public List d(InterfaceC1280e thisDescriptor, k c10) {
        AbstractC2855l.g(thisDescriptor, "thisDescriptor");
        AbstractC2855l.g(c10, "c");
        List list = this.f32524b;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC2800q.A(arrayList, ((InterfaceC3383f) it.next()).d(thisDescriptor, c10));
        }
        return arrayList;
    }

    @Override // t8.InterfaceC3383f
    public List e(InterfaceC1280e thisDescriptor, k c10) {
        AbstractC2855l.g(thisDescriptor, "thisDescriptor");
        AbstractC2855l.g(c10, "c");
        List list = this.f32524b;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC2800q.A(arrayList, ((InterfaceC3383f) it.next()).e(thisDescriptor, c10));
        }
        return arrayList;
    }

    @Override // t8.InterfaceC3383f
    public void f(InterfaceC1280e thisDescriptor, List result, k c10) {
        AbstractC2855l.g(thisDescriptor, "thisDescriptor");
        AbstractC2855l.g(result, "result");
        AbstractC2855l.g(c10, "c");
        Iterator it = this.f32524b.iterator();
        while (it.hasNext()) {
            ((InterfaceC3383f) it.next()).f(thisDescriptor, result, c10);
        }
    }

    @Override // t8.InterfaceC3383f
    public void g(InterfaceC1280e thisDescriptor, k8.f name, List result, k c10) {
        AbstractC2855l.g(thisDescriptor, "thisDescriptor");
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(result, "result");
        AbstractC2855l.g(c10, "c");
        Iterator it = this.f32524b.iterator();
        while (it.hasNext()) {
            ((InterfaceC3383f) it.next()).g(thisDescriptor, name, result, c10);
        }
    }

    @Override // t8.InterfaceC3383f
    public void h(InterfaceC1280e thisDescriptor, k8.f name, Collection result, k c10) {
        AbstractC2855l.g(thisDescriptor, "thisDescriptor");
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(result, "result");
        AbstractC2855l.g(c10, "c");
        Iterator it = this.f32524b.iterator();
        while (it.hasNext()) {
            ((InterfaceC3383f) it.next()).h(thisDescriptor, name, result, c10);
        }
    }
}
