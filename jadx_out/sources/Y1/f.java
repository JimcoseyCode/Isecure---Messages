package y1;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements InterfaceC3609a {
    @Override // y1.InterfaceC3609a
    public String a() {
        return "ByteArrayPool";
    }

    @Override // y1.InterfaceC3609a
    public int b() {
        return 1;
    }

    @Override // y1.InterfaceC3609a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public int c(byte[] bArr) {
        return bArr.length;
    }

    @Override // y1.InterfaceC3609a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public byte[] newArray(int i10) {
        return new byte[i10];
    }
}
