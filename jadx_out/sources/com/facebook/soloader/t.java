package com.facebook.soloader;

import android.os.StrictMode;
import com.facebook.soloader.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import z3.AbstractC3674b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f20713a = 3;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f20714b = 3;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile boolean f20716d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static byte[] f20717e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static List f20718f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static Map f20719g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile boolean f20720h = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f20715c = 3 + 3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final ReentrantReadWriteLock f20721i = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final HashSet f20722j = new a();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a extends HashSet {
        a() {
            add("libEGL.so");
            add("libGLESv2.so");
            add("libGLESv3.so");
            add("libOpenSLES.so");
            add("libandroid.so");
            add("libc.so");
            add("libdl.so");
            add("libjnigraphics.so");
            add("liblog.so");
            add("libm.so");
            add("libstdc++.so");
            add("libz.so");
        }
    }

    private static String[] a(String str) {
        if (f20716d) {
            return i(str);
        }
        if (!f20720h) {
            return null;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f20721i;
        reentrantReadWriteLock.readLock().lock();
        try {
            String[] strArrI = i(str);
            reentrantReadWriteLock.readLock().unlock();
            return strArrI;
        } catch (Throwable th) {
            f20721i.readLock().unlock();
            throw th;
        }
    }

    public static String[] b(String str, h hVar) {
        boolean z10 = SoLoader.f20659a;
        if (z10) {
            Api18TraceUtils.a("soloader.NativeDeps.getDependencies[", str, "]");
        }
        AbstractC3674b.b();
        try {
            try {
                try {
                    String[] strArrA = a(str);
                    if (strArrA != null) {
                        AbstractC3674b.a(null);
                        if (z10) {
                            Api18TraceUtils.b();
                        }
                        return strArrA;
                    }
                    String[] strArrA2 = s.a(hVar);
                    AbstractC3674b.a(null);
                    if (z10) {
                        Api18TraceUtils.b();
                    }
                    return strArrA2;
                } catch (Error | RuntimeException e10) {
                    throw e10;
                }
            } catch (s.a e11) {
                throw D.b(str, e11);
            }
        } catch (Throwable th) {
            AbstractC3674b.a(null);
            if (SoLoader.f20659a) {
                Api18TraceUtils.b();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003e, code lost:
    
        if (r2 == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0040, code lost:
    
        r6 = d(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0044, code lost:
    
        if (r6 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0046, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0047, code lost:
    
        r0.add(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004e, code lost:
    
        if (r0.isEmpty() == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0050, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005d, code lost:
    
        return (java.lang.String[]) r0.toArray(new java.lang.String[r0.size()]);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String[] c(int i10, int i11) {
        byte b10;
        ArrayList arrayList = new ArrayList();
        int i12 = (i10 + i11) - f20715c;
        int i13 = 0;
        boolean z10 = false;
        while (true) {
            byte[] bArr = f20717e;
            if (i12 >= bArr.length || (b10 = bArr[i12]) == 10) {
                break;
            }
            if (b10 == 32) {
                if (z10) {
                    String strD = d(i13);
                    if (strD == null) {
                        return null;
                    }
                    arrayList.add(strD);
                    i13 = 0;
                    z10 = false;
                } else {
                    continue;
                }
            } else {
                if (b10 < 48 || b10 > 57) {
                    break;
                }
                i13 = (i13 * 10) + (b10 - 48);
                z10 = true;
            }
            i12++;
        }
        return null;
    }

    private static String d(int i10) {
        if (i10 >= f20718f.size()) {
            return null;
        }
        int iIntValue = ((Integer) f20718f.get(i10)).intValue();
        int i11 = iIntValue;
        while (true) {
            byte[] bArr = f20717e;
            if (i11 >= bArr.length || bArr[i11] <= 32) {
                break;
            }
            i11++;
        }
        int i12 = (i11 - iIntValue) + f20715c;
        char[] cArr = new char[i12];
        cArr[0] = 'l';
        cArr[1] = 'i';
        cArr[2] = 'b';
        for (int i13 = 0; i13 < i12 - f20715c; i13++) {
            cArr[f20713a + i13] = (char) f20717e[iIntValue + i13];
        }
        cArr[i12 - 3] = '.';
        cArr[i12 - 2] = 's';
        cArr[i12 - 1] = 'o';
        return new String(cArr);
    }

    private static int e(String str) {
        List list = (List) f20719g.get(Integer.valueOf(f(str)));
        if (list == null) {
            return -1;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            if (g(str, iIntValue)) {
                return iIntValue;
            }
        }
        return -1;
    }

    private static int f(String str) {
        int iCodePointAt = 5381;
        for (int i10 = f20713a; i10 < str.length() - f20714b; i10++) {
            iCodePointAt = str.codePointAt(i10) + (iCodePointAt << 5) + iCodePointAt;
        }
        return iCodePointAt;
    }

    private static boolean g(String str, int i10) {
        int i11;
        int i12 = f20713a;
        while (true) {
            int length = str.length();
            i11 = f20714b;
            if (i12 >= length - i11 || i10 >= f20717e.length || (str.codePointAt(i12) & 255) != f20717e[i10]) {
                break;
            }
            i12++;
            i10++;
        }
        return i12 == str.length() - i11;
    }

    public static void h(String str, h hVar, int i10, StrictMode.ThreadPolicy threadPolicy) {
        String[] strArrB = b(str, hVar);
        p.a("SoLoader", "Loading " + str + "'s dependencies: " + Arrays.toString(strArrB));
        for (String str2 : strArrB) {
            if (!str2.startsWith("/") && !f20722j.contains(str2)) {
                SoLoader.s(str2, i10, threadPolicy);
            }
        }
    }

    static String[] i(String str) {
        int iE;
        if (f20716d && str.length() > f20715c && (iE = e(str)) != -1) {
            return c(iE, str.length());
        }
        return null;
    }
}
