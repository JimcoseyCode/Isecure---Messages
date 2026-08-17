package com.facebook.soloader;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.ClosedByInterruptException;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    protected static class a extends UnsatisfiedLinkError {
        a(String str) {
            super(str);
        }
    }

    public static String[] a(h hVar) {
        return hVar instanceof i ? c((i) hVar) : b(hVar);
    }

    private static String[] b(h hVar) {
        long j10;
        long jF;
        long jG;
        long jG2;
        long jG3;
        long j11;
        long jG4;
        long j12;
        long jD;
        long j13;
        long jD2;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        long jG5 = g(hVar, byteBufferAllocate, 0L);
        if (jG5 != 1179403647) {
            throw new a("file is not ELF: magic is 0x" + Long.toHexString(jG5) + ", it should be " + Long.toHexString(1179403647L));
        }
        boolean z10 = h(hVar, byteBufferAllocate, 4L) == 1;
        long j14 = 5;
        if (h(hVar, byteBufferAllocate, 5L) == 2) {
            byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        }
        long jG6 = z10 ? g(hVar, byteBufferAllocate, 28L) : d(hVar, byteBufferAllocate, 32L);
        if (z10) {
            j10 = 44;
            jF = f(hVar, byteBufferAllocate, 44L);
        } else {
            j10 = 44;
            jF = f(hVar, byteBufferAllocate, 56L);
        }
        int iF = f(hVar, byteBufferAllocate, z10 ? 42L : 54L);
        boolean z11 = z10;
        long j15 = 40;
        if (jF == 65535) {
            long jG7 = z11 ? g(hVar, byteBufferAllocate, 32L) : d(hVar, byteBufferAllocate, 40L);
            jF = z11 ? g(hVar, byteBufferAllocate, jG7 + 28) : g(hVar, byteBufferAllocate, jG7 + j10);
        }
        long j16 = jG6;
        long j17 = 0;
        while (true) {
            if (j17 >= jF) {
                jG = 0;
                break;
            }
            if ((z11 ? g(hVar, byteBufferAllocate, j16) : g(hVar, byteBufferAllocate, j16)) == 2) {
                jG = z11 ? g(hVar, byteBufferAllocate, j16 + 4) : d(hVar, byteBufferAllocate, j16 + 8);
            } else {
                j16 += (long) iF;
                j17++;
                j15 = j15;
            }
        }
        long j18 = j15;
        if (jG == 0) {
            throw new a("ELF file does not contain dynamic linking information");
        }
        long j19 = jG;
        long jG8 = 0;
        int i10 = 0;
        while (true) {
            long jG9 = z11 ? g(hVar, byteBufferAllocate, j19) : d(hVar, byteBufferAllocate, j19);
            long j20 = j14;
            if (jG9 == 1) {
                if (i10 == Integer.MAX_VALUE) {
                    throw new a("malformed DT_NEEDED section");
                }
                i10++;
            } else if (jG9 == j20) {
                jG8 = z11 ? g(hVar, byteBufferAllocate, j19 + 4) : d(hVar, byteBufferAllocate, j19 + 8);
            }
            j19 += z11 ? 8L : 16L;
            if (jG9 == 0) {
                if (jG8 == 0) {
                    throw new a("Dynamic section string-table not found");
                }
                int i11 = 0;
                while (true) {
                    if (i11 >= jF) {
                        jG2 = 0;
                        break;
                    }
                    if (z11) {
                        j11 = jG6;
                        jG4 = g(hVar, byteBufferAllocate, j11);
                    } else {
                        j11 = jG6;
                        jG4 = g(hVar, byteBufferAllocate, j11);
                    }
                    if (jG4 == 1) {
                        if (z11) {
                            j12 = jF;
                            jD = g(hVar, byteBufferAllocate, j11 + 8);
                        } else {
                            j12 = jF;
                            jD = d(hVar, byteBufferAllocate, j11 + 16);
                        }
                        if (z11) {
                            j13 = jD;
                            jD2 = g(hVar, byteBufferAllocate, j11 + 20);
                        } else {
                            j13 = jD;
                            jD2 = d(hVar, byteBufferAllocate, j11 + j18);
                        }
                        if (j13 <= jG8 && jG8 < j13 + jD2) {
                            jG2 = (z11 ? g(hVar, byteBufferAllocate, j11 + 4) : d(hVar, byteBufferAllocate, j11 + 8)) + (jG8 - j13);
                        }
                    } else {
                        j12 = jF;
                    }
                    jG6 = j11 + ((long) iF);
                    i11++;
                    jF = j12;
                }
                if (jG2 == 0) {
                    throw new a("did not find file offset of DT_STRTAB table");
                }
                String[] strArr = new String[i10];
                int i12 = 0;
                do {
                    jG3 = z11 ? g(hVar, byteBufferAllocate, jG) : d(hVar, byteBufferAllocate, jG);
                    if (jG3 == 1) {
                        strArr[i12] = e(hVar, byteBufferAllocate, (z11 ? g(hVar, byteBufferAllocate, jG + 4) : d(hVar, byteBufferAllocate, jG + 8)) + jG2);
                        if (i12 == Integer.MAX_VALUE) {
                            throw new a("malformed DT_NEEDED section");
                        }
                        i12++;
                    }
                    jG += z11 ? 8L : 16L;
                } while (jG3 != 0);
                if (i12 == i10) {
                    return strArr;
                }
                throw new a("malformed DT_NEEDED section");
            }
            j14 = j20;
        }
    }

    private static String[] c(i iVar) throws ClosedByInterruptException {
        int i10 = 0;
        while (true) {
            try {
                return b(iVar);
            } catch (ClosedByInterruptException e10) {
                i10++;
                if (i10 > 4) {
                    throw e10;
                }
                Thread.interrupted();
                p.c("MinElf", "retrying extract_DT_NEEDED due to ClosedByInterruptException", e10);
                iVar.d();
            }
        }
    }

    private static long d(h hVar, ByteBuffer byteBuffer, long j10) {
        i(hVar, byteBuffer, 8, j10);
        return byteBuffer.getLong();
    }

    private static String e(h hVar, ByteBuffer byteBuffer, long j10) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            long j11 = 1 + j10;
            short sH = h(hVar, byteBuffer, j10);
            if (sH == 0) {
                return sb.toString();
            }
            sb.append((char) sH);
            j10 = j11;
        }
    }

    private static int f(h hVar, ByteBuffer byteBuffer, long j10) {
        i(hVar, byteBuffer, 2, j10);
        return byteBuffer.getShort() & 65535;
    }

    private static long g(h hVar, ByteBuffer byteBuffer, long j10) {
        i(hVar, byteBuffer, 4, j10);
        return ((long) byteBuffer.getInt()) & 4294967295L;
    }

    private static short h(h hVar, ByteBuffer byteBuffer, long j10) {
        i(hVar, byteBuffer, 1, j10);
        return (short) (byteBuffer.get() & 255);
    }

    private static void i(h hVar, ByteBuffer byteBuffer, int i10, long j10) {
        int iR;
        byteBuffer.position(0);
        byteBuffer.limit(i10);
        while (byteBuffer.remaining() > 0 && (iR = hVar.R(byteBuffer, j10)) != -1) {
            j10 += (long) iR;
        }
        if (byteBuffer.remaining() > 0) {
            throw new a("ELF file truncated");
        }
        byteBuffer.position(0);
    }
}
