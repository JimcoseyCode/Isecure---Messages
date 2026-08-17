package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C1728v extends IOException {
    private static final long serialVersionUID = -1616151763072450476L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private J f17045g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f17046h;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.v$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class a extends C1728v {
        private static final long serialVersionUID = 3283890091615336259L;

        public a(String str) {
            super(str);
        }
    }

    public C1728v(String str) {
        super(str);
        this.f17045g = null;
    }

    static C1728v b() {
        return new C1728v("Protocol message end-group tag did not match expected tag.");
    }

    static C1728v c() {
        return new C1728v("Protocol message contained an invalid tag (zero).");
    }

    static C1728v d() {
        return new C1728v("Protocol message had invalid UTF-8.");
    }

    static a e() {
        return new a("Protocol message tag had invalid wire type.");
    }

    static C1728v f() {
        return new C1728v("CodedInputStream encountered a malformed varint.");
    }

    static C1728v g() {
        return new C1728v("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static C1728v h() {
        return new C1728v("Failed to parse the message.");
    }

    static C1728v i() {
        return new C1728v("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    static C1728v l() {
        return new C1728v("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static C1728v m() {
        return new C1728v("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    boolean a() {
        return this.f17046h;
    }

    void j() {
        this.f17046h = true;
    }

    public C1728v k(J j10) {
        this.f17045g = j10;
        return this;
    }

    public C1728v(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.f17045g = null;
    }
}
