package L7;

import java.util.Collection;

/* JADX INFO: renamed from: L7.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC1277b extends InterfaceC1276a, D {

    /* JADX INFO: renamed from: L7.b$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public enum a {
        DECLARATION,
        FAKE_OVERRIDE,
        DELEGATION,
        SYNTHESIZED;

        public boolean h() {
            return this != FAKE_OVERRIDE;
        }
    }

    @Override // L7.InterfaceC1276a, L7.InterfaceC1288m
    InterfaceC1277b a();

    @Override // L7.InterfaceC1276a
    Collection e();

    a getKind();

    void u0(Collection collection);

    InterfaceC1277b x(InterfaceC1288m interfaceC1288m, E e10, AbstractC1295u abstractC1295u, a aVar, boolean z10);
}
