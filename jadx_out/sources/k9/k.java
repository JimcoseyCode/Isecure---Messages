package k9;

import P8.q;
import com.facebook.react.uimanager.events.PointerEventHelper;
import e9.A;
import java.net.ProtocolException;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f29356d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A f29357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f29358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f29359c;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        private a() {
        }

        public final k a(String statusLine) throws ProtocolException {
            A a10;
            int i10;
            String strSubstring;
            AbstractC2855l.g(statusLine, "statusLine");
            if (q.K(statusLine, "HTTP/1.", false, 2, null)) {
                i10 = 9;
                if (statusLine.length() < 9 || statusLine.charAt(8) != ' ') {
                    throw new ProtocolException("Unexpected status line: " + statusLine);
                }
                int iCharAt = statusLine.charAt(7) - '0';
                if (iCharAt == 0) {
                    a10 = A.HTTP_1_0;
                } else {
                    if (iCharAt != 1) {
                        throw new ProtocolException("Unexpected status line: " + statusLine);
                    }
                    a10 = A.HTTP_1_1;
                }
            } else {
                if (!q.K(statusLine, "ICY ", false, 2, null)) {
                    throw new ProtocolException("Unexpected status line: " + statusLine);
                }
                a10 = A.HTTP_1_0;
                i10 = 4;
            }
            int i11 = i10 + 3;
            if (statusLine.length() < i11) {
                throw new ProtocolException("Unexpected status line: " + statusLine);
            }
            try {
                String strSubstring2 = statusLine.substring(i10, i11);
                AbstractC2855l.f(strSubstring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                int i12 = Integer.parseInt(strSubstring2);
                if (statusLine.length() <= i11) {
                    strSubstring = PointerEventHelper.POINTER_TYPE_UNKNOWN;
                } else {
                    if (statusLine.charAt(i11) != ' ') {
                        throw new ProtocolException("Unexpected status line: " + statusLine);
                    }
                    strSubstring = statusLine.substring(i10 + 4);
                    AbstractC2855l.f(strSubstring, "(this as java.lang.String).substring(startIndex)");
                }
                return new k(a10, i12, strSubstring);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: " + statusLine);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public k(A protocol, int i10, String message) {
        AbstractC2855l.g(protocol, "protocol");
        AbstractC2855l.g(message, "message");
        this.f29357a = protocol;
        this.f29358b = i10;
        this.f29359c = message;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f29357a == A.HTTP_1_0) {
            sb.append("HTTP/1.0");
        } else {
            sb.append("HTTP/1.1");
        }
        sb.append(' ');
        sb.append(this.f29358b);
        sb.append(' ');
        sb.append(this.f29359c);
        String string = sb.toString();
        AbstractC2855l.f(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
