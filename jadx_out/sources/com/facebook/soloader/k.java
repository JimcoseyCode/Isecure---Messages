package com.facebook.soloader;

import android.content.Context;
import com.facebook.soloader.G;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends G {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private final class a extends G.e {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final b[] f20697g;

        /* JADX WARN: Code restructure failed: missing block: B:29:0x00f7, code lost:
        
            throw new java.lang.RuntimeException("illegal line in exopackage metadata: [" + r12 + "]");
         */
        /* JADX WARN: Removed duplicated region for block: B:6:0x004c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        a(G g10) throws IOException {
            BufferedReader bufferedReader;
            File file;
            File file2;
            File file3 = new File("/data/local/tmp/exopackage/" + k.this.f20648d.getPackageName() + "/native-libs/");
            ArrayList arrayList = new ArrayList();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            String[] strArrJ = SysUtil.j();
            int length = strArrJ.length;
            int i10 = 0;
            int i11 = 0;
            loop0: while (i11 < length) {
                String str = strArrJ[i11];
                File file4 = new File(file3, str);
                if (file4.isDirectory()) {
                    linkedHashSet.add(str);
                    File file5 = new File(file4, "metadata.txt");
                    if (file5.isFile()) {
                        FileReader fileReader = new FileReader(file5);
                        try {
                            bufferedReader = new BufferedReader(fileReader);
                        } finally {
                        }
                        while (true) {
                            try {
                                String line = bufferedReader.readLine();
                                if (line == null) {
                                    file = file3;
                                    bufferedReader.close();
                                    fileReader.close();
                                    break;
                                }
                                if (line.length() != 0) {
                                    int iIndexOf = line.indexOf(32);
                                    if (iIndexOf == -1) {
                                        break loop0;
                                    }
                                    String str2 = line.substring(i10, iIndexOf) + ".so";
                                    int size = arrayList.size();
                                    while (true) {
                                        if (i10 >= size) {
                                            file2 = file3;
                                            String strSubstring = line.substring(iIndexOf + 1);
                                            arrayList.add(new b(str2, strSubstring.substring(strSubstring.indexOf(45), strSubstring.indexOf(".so")), new File(file4, strSubstring)));
                                            break;
                                        } else {
                                            file2 = file3;
                                            if (((b) arrayList.get(i10)).f20655g.equals(str2)) {
                                                break;
                                            }
                                            i10++;
                                            file3 = file2;
                                        }
                                    }
                                    file3 = file2;
                                    i10 = 0;
                                }
                            } catch (Throwable th) {
                                try {
                                    bufferedReader.close();
                                    throw th;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                    throw th;
                                }
                            }
                        }
                    }
                } else {
                    file = file3;
                }
                i11++;
                file3 = file;
                i10 = 0;
            }
            g10.t((String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]));
            this.f20697g = (b[]) arrayList.toArray(new b[arrayList.size()]);
        }

        @Override // com.facebook.soloader.G.e
        public G.c[] e() {
            return this.f20697g;
        }

        @Override // com.facebook.soloader.G.e
        public void k(File file) throws IOException {
            byte[] bArr = new byte[32768];
            for (b bVar : this.f20697g) {
                FileInputStream fileInputStream = new FileInputStream(bVar.f20699i);
                try {
                    G.d dVar = new G.d(bVar, fileInputStream);
                    fileInputStream = null;
                    try {
                        d(dVar, bArr, file);
                        dVar.close();
                    } finally {
                    }
                } catch (Throwable th) {
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class b extends G.c {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final File f20699i;

        b(String str, String str2, File file) {
            super(str, str2);
            this.f20699i = file;
        }
    }

    public k(Context context, String str) {
        super(context, str);
    }

    @Override // com.facebook.soloader.C2095f, com.facebook.soloader.E
    public String c() {
        return "ExoSoSource";
    }

    @Override // com.facebook.soloader.G
    protected G.e q() {
        return new a(this);
    }
}
