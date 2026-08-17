package m8;

import java.io.IOException;

/* JADX INFO: renamed from: m8.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class C2952k extends IOException {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private p f29696g;

    public C2952k(String str) {
        super(str);
        this.f29696g = null;
    }

    static C2952k b() {
        return new C2952k("Protocol message end-group tag did not match expected tag.");
    }

    static C2952k c() {
        return new C2952k("Protocol message contained an invalid tag (zero).");
    }

    static C2952k d() {
        return new C2952k("Protocol message had invalid UTF-8.");
    }

    static C2952k e() {
        return new C2952k("Protocol message tag had invalid wire type.");
    }

    static C2952k f() {
        return new C2952k("CodedInputStream encountered a malformed varint.");
    }

    static C2952k g() {
        return new C2952k("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static C2952k h() {
        return new C2952k("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    static C2952k j() {
        return new C2952k("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static C2952k k() {
        return new C2952k("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    public p a() {
        return this.f29696g;
    }

    public C2952k i(p pVar) {
        this.f29696g = pVar;
        return this;
    }
}
