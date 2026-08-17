package n5;

import r4.AbstractC3268i;

/* JADX INFO: renamed from: n5.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2975j extends Exception {
    protected AbstractC2975j() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2975j(String str) {
        super(str);
        AbstractC3268i.f(str, "Detail message must not be empty");
    }
}
