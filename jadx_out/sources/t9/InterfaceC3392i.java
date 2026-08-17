package t9;

import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: renamed from: t9.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC3392i extends D, WritableByteChannel {
    InterfaceC3392i C0(long j10);

    OutputStream E0();

    long G(F f10);

    InterfaceC3392i K();

    InterfaceC3392i S(k kVar);

    InterfaceC3392i V(String str);

    InterfaceC3392i a0(long j10);

    C3391h c();

    @Override // t9.D, java.io.Flushable
    void flush();

    InterfaceC3392i write(byte[] bArr);

    InterfaceC3392i write(byte[] bArr, int i10, int i11);

    InterfaceC3392i writeByte(int i10);

    InterfaceC3392i writeInt(int i10);

    InterfaceC3392i writeShort(int i10);

    InterfaceC3392i x();
}
