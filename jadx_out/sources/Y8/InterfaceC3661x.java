package y8;

import C8.AbstractC0407d0;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: y8.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC3661x {

    /* JADX INFO: renamed from: y8.x$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a implements InterfaceC3661x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f34150a = new a();

        private a() {
        }

        @Override // y8.InterfaceC3661x
        public C8.S a(f8.q proto, String flexibleId, AbstractC0407d0 lowerBound, AbstractC0407d0 upperBound) {
            AbstractC2855l.g(proto, "proto");
            AbstractC2855l.g(flexibleId, "flexibleId");
            AbstractC2855l.g(lowerBound, "lowerBound");
            AbstractC2855l.g(upperBound, "upperBound");
            throw new IllegalArgumentException("This method should not be used.");
        }
    }

    C8.S a(f8.q qVar, String str, AbstractC0407d0 abstractC0407d0, AbstractC0407d0 abstractC0407d02);
}
