package f9;

import P8.q;
import java.net.IDN;
import java.net.InetAddress;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC2855l;
import t9.C3391h;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a {
    private static final boolean a(String str) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (AbstractC2855l.i(cCharAt, 31) <= 0 || AbstractC2855l.i(cCharAt, 127) >= 0 || q.c0(" #%/:?@[\\]", cCharAt, 0, false, 6, null) != -1) {
                return true;
            }
        }
        return false;
    }

    private static final boolean b(String str, int i10, int i11, byte[] bArr, int i12) {
        int i13 = i12;
        while (i10 < i11) {
            if (i13 == bArr.length) {
                return false;
            }
            if (i13 != i12) {
                if (str.charAt(i10) != '.') {
                    return false;
                }
                i10++;
            }
            int i14 = i10;
            int i15 = 0;
            while (i14 < i11) {
                char cCharAt = str.charAt(i14);
                if (AbstractC2855l.i(cCharAt, 48) < 0 || AbstractC2855l.i(cCharAt, 57) > 0) {
                    break;
                }
                if ((i15 == 0 && i10 != i14) || (i15 = ((i15 * 10) + cCharAt) - 48) > 255) {
                    return false;
                }
                i14++;
            }
            if (i14 - i10 == 0) {
                return false;
            }
            bArr[i13] = (byte) i15;
            i13++;
            i10 = i14;
        }
        return i13 == i12 + 4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0092, code lost:
    
        if (r11 == 16) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0094, code lost:
    
        if (r12 != (-1)) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0096, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0097, code lost:
    
        r0 = r11 - r12;
        java.lang.System.arraycopy(r8, r12, r8, 16 - r0, r0);
        java.util.Arrays.fill(r8, r12, (16 - r11) + r12, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a8, code lost:
    
        return java.net.InetAddress.getByAddress(r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final InetAddress c(String str, int i10, int i11) {
        String str2;
        int i12;
        byte[] bArr = new byte[16];
        int i13 = i10;
        int i14 = 0;
        int i15 = -1;
        int i16 = -1;
        while (true) {
            if (i13 < i11) {
                if (i14 != 16) {
                    int i17 = i13 + 2;
                    if (i17 <= i11 && q.J(str, "::", i13, false, 4, null)) {
                        if (i15 == -1) {
                            i14 += 2;
                            if (i17 != i11) {
                                str2 = str;
                                i15 = i14;
                                i16 = i17;
                                int i18 = 0;
                                i13 = i16;
                                while (i13 < i11) {
                                }
                                i12 = i13 - i16;
                                if (i12 == 0) {
                                    break;
                                }
                                break;
                                break;
                            }
                            i15 = i14;
                            break;
                        }
                        return null;
                    }
                    if (i14 != 0) {
                        if (q.J(str, ":", i13, false, 4, null)) {
                            i13++;
                        } else {
                            if (!q.J(str, ".", i13, false, 4, null) || !b(str, i16, i11, bArr, i14 - 2)) {
                                return null;
                            }
                            i14 += 2;
                        }
                    }
                    str2 = str;
                    i16 = i13;
                    int i182 = 0;
                    i13 = i16;
                    while (i13 < i11) {
                        int iF = c.F(str2.charAt(i13));
                        if (iF == -1) {
                            break;
                        }
                        i182 = (i182 << 4) + iF;
                        i13++;
                    }
                    i12 = i13 - i16;
                    if (i12 == 0 || i12 > 4) {
                        break;
                    }
                    int i19 = i14 + 1;
                    bArr[i14] = (byte) ((i182 >>> 8) & 255);
                    i14 += 2;
                    bArr[i19] = (byte) (i182 & 255);
                } else {
                    return null;
                }
            } else {
                break;
            }
        }
        return null;
    }

    private static final String d(byte[] bArr) {
        int i10 = -1;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < bArr.length) {
            int i14 = i12;
            while (i14 < 16 && bArr[i14] == 0 && bArr[i14 + 1] == 0) {
                i14 += 2;
            }
            int i15 = i14 - i12;
            if (i15 > i13 && i15 >= 4) {
                i10 = i12;
                i13 = i15;
            }
            i12 = i14 + 2;
        }
        C3391h c3391h = new C3391h();
        while (i11 < bArr.length) {
            if (i11 == i10) {
                c3391h.writeByte(58);
                i11 += i13;
                if (i11 == 16) {
                    c3391h.writeByte(58);
                }
            } else {
                if (i11 > 0) {
                    c3391h.writeByte(58);
                }
                c3391h.a0((c.b(bArr[i11], 255) << 8) | c.b(bArr[i11 + 1], 255));
                i11 += 2;
            }
        }
        return c3391h.q0();
    }

    public static final String e(String toCanonicalHost) {
        AbstractC2855l.g(toCanonicalHost, "$this$toCanonicalHost");
        if (!q.Q(toCanonicalHost, ":", false, 2, null)) {
            try {
                String ascii = IDN.toASCII(toCanonicalHost);
                AbstractC2855l.f(ascii, "IDN.toASCII(host)");
                Locale locale = Locale.US;
                AbstractC2855l.f(locale, "Locale.US");
                if (ascii == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                String lowerCase = ascii.toLowerCase(locale);
                AbstractC2855l.f(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                if (lowerCase.length() == 0 || a(lowerCase)) {
                    return null;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress inetAddressC = (q.K(toCanonicalHost, "[", false, 2, null) && q.w(toCanonicalHost, "]", false, 2, null)) ? c(toCanonicalHost, 1, toCanonicalHost.length() - 1) : c(toCanonicalHost, 0, toCanonicalHost.length());
        if (inetAddressC == null) {
            return null;
        }
        byte[] address = inetAddressC.getAddress();
        if (address.length == 16) {
            AbstractC2855l.f(address, "address");
            return d(address);
        }
        if (address.length == 4) {
            return inetAddressC.getHostAddress();
        }
        throw new AssertionError("Invalid IPv6 address: '" + toCanonicalHost + '\'');
    }
}
