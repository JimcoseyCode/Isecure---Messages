package com.google.firebase;

import R8.AbstractC1433s0;
import R8.J;
import androidx.annotation.Keep;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.google.firebase.components.ComponentRegistrar;
import j7.AbstractC2800q;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import p5.InterfaceC3080a;
import q5.C3119c;
import q5.D;
import q5.InterfaceC3120d;
import q5.g;
import q5.q;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/google/firebase/FirebaseCommonKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lq5/c;", "getComponents", "()Ljava/util/List;", "com.google.firebase-firebase-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f24016a = new a();

        @Override // q5.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final J a(InterfaceC3120d interfaceC3120d) {
            Object objE = interfaceC3120d.e(D.a(InterfaceC3080a.class, Executor.class));
            AbstractC2855l.f(objE, "get(...)");
            return AbstractC1433s0.a((Executor) objE);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f24017a = new b();

        @Override // q5.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final J a(InterfaceC3120d interfaceC3120d) {
            Object objE = interfaceC3120d.e(D.a(p5.c.class, Executor.class));
            AbstractC2855l.f(objE, "get(...)");
            return AbstractC1433s0.a((Executor) objE);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class c implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f24018a = new c();

        @Override // q5.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final J a(InterfaceC3120d interfaceC3120d) {
            Object objE = interfaceC3120d.e(D.a(p5.b.class, Executor.class));
            AbstractC2855l.f(objE, "get(...)");
            return AbstractC1433s0.a((Executor) objE);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class d implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f24019a = new d();

        @Override // q5.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final J a(InterfaceC3120d interfaceC3120d) {
            Object objE = interfaceC3120d.e(D.a(p5.d.class, Executor.class));
            AbstractC2855l.f(objE, "get(...)");
            return AbstractC1433s0.a((Executor) objE);
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C3119c> getComponents() {
        C3119c c3119cD = C3119c.e(D.a(InterfaceC3080a.class, J.class)).b(q.k(D.a(InterfaceC3080a.class, Executor.class))).e(a.f24016a).d();
        AbstractC2855l.f(c3119cD, "build(...)");
        C3119c c3119cD2 = C3119c.e(D.a(p5.c.class, J.class)).b(q.k(D.a(p5.c.class, Executor.class))).e(b.f24017a).d();
        AbstractC2855l.f(c3119cD2, "build(...)");
        C3119c c3119cD3 = C3119c.e(D.a(p5.b.class, J.class)).b(q.k(D.a(p5.b.class, Executor.class))).e(c.f24018a).d();
        AbstractC2855l.f(c3119cD3, "build(...)");
        C3119c c3119cD4 = C3119c.e(D.a(p5.d.class, J.class)).b(q.k(D.a(p5.d.class, Executor.class))).e(d.f24019a).d();
        AbstractC2855l.f(c3119cD4, "build(...)");
        return AbstractC2800q.m(c3119cD, c3119cD2, c3119cD3, c3119cD4);
    }
}
