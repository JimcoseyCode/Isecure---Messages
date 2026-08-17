package e9;

import java.io.IOException;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public enum A {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");


    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f25990o = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f25991g;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        private a() {
        }

        public final A a(String protocol) throws IOException {
            AbstractC2855l.g(protocol, "protocol");
            A a10 = A.HTTP_1_0;
            if (AbstractC2855l.b(protocol, a10.f25991g)) {
                return a10;
            }
            A a11 = A.HTTP_1_1;
            if (AbstractC2855l.b(protocol, a11.f25991g)) {
                return a11;
            }
            A a12 = A.H2_PRIOR_KNOWLEDGE;
            if (AbstractC2855l.b(protocol, a12.f25991g)) {
                return a12;
            }
            A a13 = A.HTTP_2;
            if (AbstractC2855l.b(protocol, a13.f25991g)) {
                return a13;
            }
            A a14 = A.SPDY_3;
            if (AbstractC2855l.b(protocol, a14.f25991g)) {
                return a14;
            }
            A a15 = A.QUIC;
            if (AbstractC2855l.b(protocol, a15.f25991g)) {
                return a15;
            }
            throw new IOException("Unexpected protocol: " + protocol);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    A(String str) {
        this.f25991g = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f25991g;
    }
}
