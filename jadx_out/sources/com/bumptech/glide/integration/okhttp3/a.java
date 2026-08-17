package com.bumptech.glide.integration.okhttp3;

import B1.h;
import B1.n;
import B1.o;
import B1.r;
import e9.InterfaceC2437e;
import e9.z;
import u1.C3399a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class a implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC2437e.a f19102a;

    /* JADX INFO: renamed from: com.bumptech.glide.integration.okhttp3.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class C0204a implements o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static volatile InterfaceC2437e.a f19103b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InterfaceC2437e.a f19104a;

        public C0204a() {
            this(a());
        }

        private static InterfaceC2437e.a a() {
            if (f19103b == null) {
                synchronized (C0204a.class) {
                    try {
                        if (f19103b == null) {
                            f19103b = new z();
                        }
                    } finally {
                    }
                }
            }
            return f19103b;
        }

        @Override // B1.o
        public n build(r rVar) {
            return new a(this.f19104a);
        }

        public C0204a(InterfaceC2437e.a aVar) {
            this.f19104a = aVar;
        }

        @Override // B1.o
        public void teardown() {
        }
    }

    public a(InterfaceC2437e.a aVar) {
        this.f19102a = aVar;
    }

    @Override // B1.n
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public n.a buildLoadData(h hVar, int i10, int i11, v1.h hVar2) {
        return new n.a(hVar, new C3399a(this.f19102a, hVar));
    }

    @Override // B1.n
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean handles(h hVar) {
        return true;
    }
}
