package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class W implements H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final J f16794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f16795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object[] f16796c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f16797d;

    W(J j10, String str, Object[] objArr) {
        this.f16794a = j10;
        this.f16795b = str;
        this.f16796c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f16797d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char cCharAt2 = str.charAt(i12);
            if (cCharAt2 < 55296) {
                this.f16797d = i10 | (cCharAt2 << i11);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i11;
                i11 += 13;
                i12 = i13;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.H
    public boolean a() {
        return (this.f16797d & 2) == 2;
    }

    @Override // androidx.datastore.preferences.protobuf.H
    public J b() {
        return this.f16794a;
    }

    @Override // androidx.datastore.preferences.protobuf.H
    public T c() {
        int i10 = this.f16797d;
        return (i10 & 1) != 0 ? T.PROTO2 : (i10 & 4) == 4 ? T.EDITIONS : T.PROTO3;
    }

    Object[] d() {
        return this.f16796c;
    }

    String e() {
        return this.f16795b;
    }
}
