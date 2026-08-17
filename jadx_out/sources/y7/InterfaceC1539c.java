package Y7;

import b8.InterfaceC1830n;
import j7.AbstractC2800q;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: Y7.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC1539c {

    /* JADX INFO: renamed from: Y7.c$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a implements InterfaceC1539c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f13028a = new a();

        private a() {
        }

        @Override // Y7.InterfaceC1539c
        public b8.w a(k8.f name) {
            AbstractC2855l.g(name, "name");
            return null;
        }

        @Override // Y7.InterfaceC1539c
        public Set b() {
            return j7.T.e();
        }

        @Override // Y7.InterfaceC1539c
        public InterfaceC1830n c(k8.f name) {
            AbstractC2855l.g(name, "name");
            return null;
        }

        @Override // Y7.InterfaceC1539c
        public Set d() {
            return j7.T.e();
        }

        @Override // Y7.InterfaceC1539c
        public Set e() {
            return j7.T.e();
        }

        @Override // Y7.InterfaceC1539c
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public List f(k8.f name) {
            AbstractC2855l.g(name, "name");
            return AbstractC2800q.j();
        }
    }

    b8.w a(k8.f fVar);

    Set b();

    InterfaceC1830n c(k8.f fVar);

    Set d();

    Set e();

    Collection f(k8.f fVar);
}
