package z7;

import java.util.Random;

/* JADX INFO: renamed from: z7.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3689a extends AbstractC3691c {
    @Override // z7.AbstractC3691c
    public int b(int i10) {
        return c().nextInt(i10);
    }

    public abstract Random c();
}
