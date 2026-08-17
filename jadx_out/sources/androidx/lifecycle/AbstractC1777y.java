package androidx.lifecycle;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: androidx.lifecycle.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1777y extends A {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private m.b f17638l = new m.b();

    /* JADX INFO: renamed from: androidx.lifecycle.y$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class a implements B {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final AbstractC1776x f17639a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final B f17640b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f17641c = -1;

        a(AbstractC1776x abstractC1776x, B b10) {
            this.f17639a = abstractC1776x;
            this.f17640b = b10;
        }

        void a() {
            this.f17639a.i(this);
        }

        void b() {
            this.f17639a.m(this);
        }

        @Override // androidx.lifecycle.B
        public void onChanged(Object obj) {
            if (this.f17641c != this.f17639a.f()) {
                this.f17641c = this.f17639a.f();
                this.f17640b.onChanged(obj);
            }
        }
    }

    @Override // androidx.lifecycle.AbstractC1776x
    protected void j() {
        Iterator it = this.f17638l.iterator();
        while (it.hasNext()) {
            ((a) ((Map.Entry) it.next()).getValue()).a();
        }
    }

    @Override // androidx.lifecycle.AbstractC1776x
    protected void k() {
        Iterator it = this.f17638l.iterator();
        while (it.hasNext()) {
            ((a) ((Map.Entry) it.next()).getValue()).b();
        }
    }

    public void o(AbstractC1776x abstractC1776x, B b10) {
        if (abstractC1776x == null) {
            throw new NullPointerException("source cannot be null");
        }
        a aVar = new a(abstractC1776x, b10);
        a aVar2 = (a) this.f17638l.s(abstractC1776x, aVar);
        if (aVar2 != null && aVar2.f17640b != b10) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        }
        if (aVar2 == null && g()) {
            aVar.a();
        }
    }

    public void p(AbstractC1776x abstractC1776x) {
        a aVar = (a) this.f17638l.t(abstractC1776x);
        if (aVar != null) {
            aVar.b();
        }
    }
}
