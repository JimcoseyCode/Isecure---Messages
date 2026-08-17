package com.facebook.imagepipeline.memory;

import c2.k;
import f2.InterfaceC2603d;
import g2.AbstractC2662a;
import g3.E;
import g3.F;
import g3.z;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g2.h f19884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final b f19885b;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements g2.h {
        a() {
        }

        @Override // g2.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void release(byte[] bArr) {
            d.this.b(bArr);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class b extends e {
        public b(InterfaceC2603d interfaceC2603d, E e10, F f10) {
            super(interfaceC2603d, e10, f10);
        }

        @Override // com.facebook.imagepipeline.memory.a
        com.facebook.imagepipeline.memory.b x(int i10) {
            return new h(p(i10), this.f19869c.f28171g, 0);
        }
    }

    public d(InterfaceC2603d interfaceC2603d, E e10) {
        k.b(Boolean.valueOf(e10.f28171g > 0));
        this.f19885b = new b(interfaceC2603d, e10, z.h());
        this.f19884a = new a();
    }

    public AbstractC2662a a(int i10) {
        return AbstractC2662a.w0((byte[]) this.f19885b.get(i10), this.f19884a);
    }

    public void b(byte[] bArr) {
        this.f19885b.release(bArr);
    }
}
