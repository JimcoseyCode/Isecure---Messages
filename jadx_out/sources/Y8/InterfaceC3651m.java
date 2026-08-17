package y8;

import L7.InterfaceC1300z;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: y8.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC3651m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f34104a = a.f34105a;

    /* JADX INFO: renamed from: y8.m$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f34105a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final InterfaceC3651m f34106b = new C0376a();

        /* JADX INFO: renamed from: y8.m$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class C0376a implements InterfaceC3651m {
            C0376a() {
            }

            @Override // y8.InterfaceC3651m
            public Pair a(f8.i proto, InterfaceC1300z ownerFunction, h8.g typeTable, X typeDeserializer) {
                AbstractC2855l.g(proto, "proto");
                AbstractC2855l.g(ownerFunction, "ownerFunction");
                AbstractC2855l.g(typeTable, "typeTable");
                AbstractC2855l.g(typeDeserializer, "typeDeserializer");
                return null;
            }
        }

        private a() {
        }

        public final InterfaceC3651m a() {
            return f34106b;
        }
    }

    Pair a(f8.i iVar, InterfaceC1300z interfaceC1300z, h8.g gVar, X x10);
}
