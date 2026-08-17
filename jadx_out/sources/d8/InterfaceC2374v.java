package d8;

import b8.InterfaceC1823g;
import j8.C2810e;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import y8.InterfaceC3627A;

/* JADX INFO: renamed from: d8.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC2374v extends InterfaceC3627A {

    /* JADX INFO: renamed from: d8.v$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static abstract class a {

        /* JADX INFO: renamed from: d8.v$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class C0252a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final InterfaceC2376x f25791a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final byte[] f25792b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0252a(InterfaceC2376x kotlinJvmBinaryClass, byte[] bArr) {
                super(null);
                AbstractC2855l.g(kotlinJvmBinaryClass, "kotlinJvmBinaryClass");
                this.f25791a = kotlinJvmBinaryClass;
                this.f25792b = bArr;
            }

            public final InterfaceC2376x b() {
                return this.f25791a;
            }

            public /* synthetic */ C0252a(InterfaceC2376x interfaceC2376x, byte[] bArr, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(interfaceC2376x, (i10 & 2) != 0 ? null : bArr);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC2376x a() {
            C0252a c0252a = this instanceof C0252a ? (C0252a) this : null;
            if (c0252a != null) {
                return c0252a.b();
            }
            return null;
        }

        private a() {
        }
    }

    a a(InterfaceC1823g interfaceC1823g, C2810e c2810e);

    a c(k8.b bVar, C2810e c2810e);
}
