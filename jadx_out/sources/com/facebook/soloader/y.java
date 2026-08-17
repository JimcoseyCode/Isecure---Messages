package com.facebook.soloader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class y implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Runtime f20723a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Method f20724b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f20725c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f20726d = null;

    private String b(String str) {
        try {
            File file = new File(str);
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int i10 = fileInputStream.read(bArr);
                    if (i10 <= 0) {
                        String str2 = String.format("%32x", new BigInteger(1, messageDigest.digest()));
                        fileInputStream.close();
                        return str2;
                    }
                    messageDigest.update(bArr, 0, i10);
                }
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException | SecurityException | NoSuchAlgorithmException e10) {
            return e10.toString();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        if (r2 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002e, code lost:
    
        com.facebook.soloader.p.b("SoFileLoaderImpl", "Error when loading library: " + r2 + ", library hash is " + b(r7) + ", LD_LIBRARY_PATH is " + r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:?, code lost:
    
        return;
     */
    @Override // com.facebook.soloader.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(String str, int i10) throws Throwable {
        Throwable th;
        Object e10;
        if (this.f20724b == null) {
            System.load(str);
            return;
        }
        String str2 = (i10 & 4) == 4 ? this.f20725c : this.f20726d;
        String str3 = null;
        try {
            try {
                try {
                    try {
                        synchronized (this.f20723a) {
                            try {
                                String str4 = (String) this.f20724b.invoke(this.f20723a, str, SoLoader.class.getClassLoader(), str2);
                                if (str4 != null) {
                                    str3 = "nativeLoad() returned error for " + str + ": " + str4;
                                    throw new C(str, str3);
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    try {
                        throw th;
                    } catch (IllegalAccessException e11) {
                        e10 = e11;
                        throw new RuntimeException("nativeLoad() error during invocation for " + str + ": " + e10);
                    } catch (IllegalArgumentException e12) {
                        e10 = e12;
                        throw new RuntimeException("nativeLoad() error during invocation for " + str + ": " + e10);
                    } catch (InvocationTargetException e13) {
                        e10 = e13;
                        throw new RuntimeException("nativeLoad() error during invocation for " + str + ": " + e10);
                    }
                } catch (Throwable th4) {
                    th = th4;
                    if (0 != 0) {
                        p.b("SoFileLoaderImpl", "Error when loading library: " + ((String) null) + ", library hash is " + b(str) + ", LD_LIBRARY_PATH is " + str2);
                    }
                    throw th;
                }
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e14) {
                e10 = e14;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }
}
