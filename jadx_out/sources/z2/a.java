package Z2;

import c2.k;
import com.facebook.imagepipeline.producers.AbstractC1967c;
import com.facebook.imagepipeline.producers.InterfaceC1978n;
import com.facebook.imagepipeline.producers.d0;
import com.facebook.imagepipeline.producers.e0;
import com.facebook.imagepipeline.producers.l0;
import f3.InterfaceC2610d;
import i7.C2735B;
import j3.C2768b;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2855l;
import m2.AbstractC2894a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends AbstractC2894a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final l0 f13559h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final InterfaceC2610d f13560i;

    /* JADX INFO: renamed from: Z2.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class C0138a extends AbstractC1967c {
        C0138a() {
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC1967c
        protected void f() {
            a.this.B();
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC1967c
        protected void g(Throwable throwable) {
            AbstractC2855l.g(throwable, "throwable");
            a.this.C(throwable);
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC1967c
        protected void h(Object obj, int i10) {
            a aVar = a.this;
            aVar.D(obj, i10, aVar.A());
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC1967c
        protected void i(float f10) {
            a.this.q(f10);
        }
    }

    protected a(d0 producer, l0 settableProducerContext, InterfaceC2610d requestListener) {
        AbstractC2855l.g(producer, "producer");
        AbstractC2855l.g(settableProducerContext, "settableProducerContext");
        AbstractC2855l.g(requestListener, "requestListener");
        this.f13559h = settableProducerContext;
        this.f13560i = requestListener;
        if (!C2768b.d()) {
            m(settableProducerContext.getExtras());
            if (C2768b.d()) {
                C2768b.a("AbstractProducerToDataSourceAdapter()->onRequestStart");
                try {
                    requestListener.b(settableProducerContext);
                    C2735B c2735b = C2735B.f28704a;
                } finally {
                }
            } else {
                requestListener.b(settableProducerContext);
            }
            if (!C2768b.d()) {
                producer.b(y(), settableProducerContext);
                return;
            }
            C2768b.a("AbstractProducerToDataSourceAdapter()->produceResult");
            try {
                producer.b(y(), settableProducerContext);
                C2735B c2735b2 = C2735B.f28704a;
                return;
            } finally {
            }
        }
        C2768b.a("AbstractProducerToDataSourceAdapter()");
        try {
            m(settableProducerContext.getExtras());
            if (C2768b.d()) {
                C2768b.a("AbstractProducerToDataSourceAdapter()->onRequestStart");
                try {
                    requestListener.b(settableProducerContext);
                    C2735B c2735b3 = C2735B.f28704a;
                    C2768b.b();
                } finally {
                }
            } else {
                requestListener.b(settableProducerContext);
            }
            if (C2768b.d()) {
                C2768b.a("AbstractProducerToDataSourceAdapter()->produceResult");
                try {
                    producer.b(y(), settableProducerContext);
                    C2735B c2735b4 = C2735B.f28704a;
                    C2768b.b();
                } finally {
                }
            } else {
                producer.b(y(), settableProducerContext);
            }
            C2735B c2735b5 = C2735B.f28704a;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void B() {
        k.i(i());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C(Throwable th) {
        if (super.o(th, z(this.f13559h))) {
            this.f13560i.h(this.f13559h, th);
        }
    }

    private final InterfaceC1978n y() {
        return new C0138a();
    }

    public final l0 A() {
        return this.f13559h;
    }

    protected void D(Object obj, int i10, e0 producerContext) {
        AbstractC2855l.g(producerContext, "producerContext");
        boolean zD = AbstractC1967c.d(i10);
        if (super.s(obj, zD, z(producerContext)) && zD) {
            this.f13560i.f(this.f13559h);
        }
    }

    @Override // m2.AbstractC2894a, m2.c
    public boolean close() {
        if (!super.close()) {
            return false;
        }
        if (super.isFinished()) {
            return true;
        }
        this.f13560i.i(this.f13559h);
        this.f13559h.g();
        return true;
    }

    protected final Map z(e0 producerContext) {
        AbstractC2855l.g(producerContext, "producerContext");
        return producerContext.getExtras();
    }
}
