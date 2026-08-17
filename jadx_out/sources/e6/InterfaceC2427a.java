package e6;

import P4.AbstractC1378l;
import androidx.lifecycle.AbstractC1764k;
import androidx.lifecycle.C;
import androidx.lifecycle.InterfaceC1770q;
import java.io.Closeable;
import k6.C2831a;
import o4.g;

/* JADX INFO: renamed from: e6.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC2427a extends Closeable, InterfaceC1770q, g {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    @C(AbstractC1764k.a.ON_DESTROY)
    void close();

    AbstractC1378l s0(C2831a c2831a);
}
