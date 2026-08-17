package com.google.firebase.installations;

import com.facebook.react.uimanager.events.PointerEventHelper;
import com.google.firebase.installations.g;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class a extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f24078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f24079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f24080c;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class b extends g.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f24081a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Long f24082b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Long f24083c;

        b() {
        }

        @Override // com.google.firebase.installations.g.a
        public g a() {
            String str = this.f24081a;
            String str2 = PointerEventHelper.POINTER_TYPE_UNKNOWN;
            if (str == null) {
                str2 = PointerEventHelper.POINTER_TYPE_UNKNOWN + " token";
            }
            if (this.f24082b == null) {
                str2 = str2 + " tokenExpirationTimestamp";
            }
            if (this.f24083c == null) {
                str2 = str2 + " tokenCreationTimestamp";
            }
            if (str2.isEmpty()) {
                return new a(this.f24081a, this.f24082b.longValue(), this.f24083c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        @Override // com.google.firebase.installations.g.a
        public g.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null token");
            }
            this.f24081a = str;
            return this;
        }

        @Override // com.google.firebase.installations.g.a
        public g.a c(long j10) {
            this.f24083c = Long.valueOf(j10);
            return this;
        }

        @Override // com.google.firebase.installations.g.a
        public g.a d(long j10) {
            this.f24082b = Long.valueOf(j10);
            return this;
        }
    }

    @Override // com.google.firebase.installations.g
    public String b() {
        return this.f24078a;
    }

    @Override // com.google.firebase.installations.g
    public long c() {
        return this.f24080c;
    }

    @Override // com.google.firebase.installations.g
    public long d() {
        return this.f24079b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.f24078a.equals(gVar.b()) && this.f24079b == gVar.d() && this.f24080c == gVar.c()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f24078a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f24079b;
        long j11 = this.f24080c;
        return ((iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f24078a + ", tokenExpirationTimestamp=" + this.f24079b + ", tokenCreationTimestamp=" + this.f24080c + "}";
    }

    private a(String str, long j10, long j11) {
        this.f24078a = str;
        this.f24079b = j10;
        this.f24080c = j11;
    }
}
