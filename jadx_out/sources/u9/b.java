package u9;

import i7.C2735B;
import kotlin.jvm.internal.AbstractC2855l;
import t9.C3391h;
import t9.k;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f32734a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x010c, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x01ac, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x005d, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x009d, code lost:
    
        return -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int c(byte[] bArr, int i10) {
        byte b10;
        int i11;
        int length = bArr.length;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        loop0: while (true) {
            if (i12 >= length) {
                break;
            }
            byte b11 = bArr[i12];
            if (b11 >= 0) {
                int i15 = i14 + 1;
                if (i14 != i10) {
                    if ((b11 != 10 && b11 != 13 && ((b11 >= 0 && b11 < 32) || (127 <= b11 && b11 < 160))) || b11 == 65533) {
                        break;
                    }
                    i13 += b11 < 65536 ? 1 : 2;
                    i12++;
                    while (true) {
                        i14 = i15;
                        if (i12 < length && (b10 = bArr[i12]) >= 0) {
                            i12++;
                            i15 = i14 + 1;
                            if (i14 != i10) {
                                if ((b10 != 10 && b10 != 13 && ((b10 >= 0 && b10 < 32) || (127 <= b10 && b10 < 160))) || b10 == 65533) {
                                    break loop0;
                                }
                                i13 += b10 < 65536 ? 1 : 2;
                            } else {
                                return i13;
                            }
                        } else {
                            break;
                        }
                    }
                } else {
                    break;
                }
            } else if ((b11 >> 5) == -2) {
                int i16 = i12 + 1;
                if (length <= i16) {
                    if (i14 == i10) {
                        break;
                    }
                    return -1;
                }
                byte b12 = bArr[i16];
                if ((b12 & 192) != 128) {
                    if (i14 == i10) {
                        break;
                    }
                    return -1;
                }
                int i17 = (b11 << 6) ^ (b12 ^ 3968);
                if (i17 >= 128) {
                    int i18 = i14 + 1;
                    if (i14 != i10) {
                        if ((i17 != 10 && i17 != 13 && ((i17 >= 0 && i17 < 32) || (127 <= i17 && i17 < 160))) || i17 == 65533) {
                            break;
                        }
                        i13 += i17 < 65536 ? 1 : 2;
                        C2735B c2735b = C2735B.f28704a;
                        i12 += 2;
                        i14 = i18;
                    } else {
                        break;
                    }
                } else {
                    if (i14 == i10) {
                        break;
                    }
                    return -1;
                }
            } else if ((b11 >> 4) == -2) {
                int i19 = i12 + 2;
                if (length <= i19) {
                    if (i14 == i10) {
                        break;
                    }
                    return -1;
                }
                byte b13 = bArr[i12 + 1];
                if ((b13 & 192) != 128) {
                    if (i14 == i10) {
                        break;
                    }
                    return -1;
                }
                byte b14 = bArr[i19];
                if ((b14 & 192) != 128) {
                    if (i14 == i10) {
                        break;
                    }
                    return -1;
                }
                int i20 = (b11 << 12) ^ ((b14 ^ (-123008)) ^ (b13 << 6));
                if (i20 < 2048) {
                    if (i14 == i10) {
                        break;
                    }
                    return -1;
                }
                if (55296 <= i20 && i20 < 57344) {
                    if (i14 == i10) {
                        break;
                    }
                    return -1;
                }
                i11 = i14 + 1;
                if (i14 != i10) {
                    if ((i20 != 10 && i20 != 13 && ((i20 >= 0 && i20 < 32) || (127 <= i20 && i20 < 160))) || i20 == 65533) {
                        break;
                    }
                    i13 += i20 < 65536 ? 1 : 2;
                    C2735B c2735b2 = C2735B.f28704a;
                    i12 += 3;
                    i14 = i11;
                } else {
                    break;
                }
            } else {
                if ((b11 >> 3) != -2) {
                    if (i14 == i10) {
                        break;
                    }
                    return -1;
                }
                int i21 = i12 + 3;
                if (length <= i21) {
                    if (i14 == i10) {
                        break;
                    }
                    return -1;
                }
                byte b15 = bArr[i12 + 1];
                if ((b15 & 192) != 128) {
                    if (i14 == i10) {
                        break;
                    }
                    return -1;
                }
                byte b16 = bArr[i12 + 2];
                if ((b16 & 192) != 128) {
                    if (i14 == i10) {
                        break;
                    }
                    return -1;
                }
                byte b17 = bArr[i21];
                if ((b17 & 192) != 128) {
                    if (i14 == i10) {
                        break;
                    }
                    return -1;
                }
                int i22 = (b11 << 18) ^ (((b17 ^ 3678080) ^ (b16 << 6)) ^ (b15 << 12));
                if (i22 > 1114111) {
                    if (i14 == i10) {
                        break;
                    }
                    return -1;
                }
                if (55296 <= i22 && i22 < 57344) {
                    if (i14 == i10) {
                        break;
                    }
                    return -1;
                }
                if (i22 >= 65536) {
                    i11 = i14 + 1;
                    if (i14 != i10) {
                        if ((i22 != 10 && i22 != 13 && ((i22 >= 0 && i22 < 32) || (127 <= i22 && i22 < 160))) || i22 == 65533) {
                            break;
                        }
                        i13 += i22 < 65536 ? 1 : 2;
                        C2735B c2735b3 = C2735B.f28704a;
                        i12 += 4;
                        i14 = i11;
                    } else {
                        break;
                    }
                } else {
                    if (i14 == i10) {
                        break;
                    }
                    return -1;
                }
            }
        }
        return -1;
    }

    public static final void d(k kVar, C3391h buffer, int i10, int i11) {
        AbstractC2855l.g(kVar, "<this>");
        AbstractC2855l.g(buffer, "buffer");
        buffer.write(kVar.q(), i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(char c10) {
        if ('0' <= c10 && c10 < ':') {
            return c10 - '0';
        }
        if ('a' <= c10 && c10 < 'g') {
            return c10 - 'W';
        }
        if ('A' <= c10 && c10 < 'G') {
            return c10 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c10);
    }

    public static final char[] f() {
        return f32734a;
    }
}
