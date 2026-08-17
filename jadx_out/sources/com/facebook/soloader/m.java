package com.facebook.soloader;

import android.content.Context;
import com.facebook.soloader.G;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class m extends G {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final File f20700f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final String f20701g;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    protected static final class a extends G.c implements Comparable {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final ZipEntry f20702i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final int f20703j;

        a(String str, ZipEntry zipEntry, int i10) {
            super(str, String.valueOf(zipEntry.getCrc()));
            this.f20702i = zipEntry;
            this.f20703j = i10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f20702i.equals(aVar.f20702i) && this.f20703j == aVar.f20703j) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            return this.f20655g.compareTo(aVar.f20655g);
        }

        public int hashCode() {
            return (this.f20703j * 31) + this.f20702i.hashCode();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    protected class b extends G.e {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        protected a[] f20704g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final ZipFile f20705h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final G f20706i;

        b(G g10) {
            this.f20705h = new ZipFile(m.this.f20700f);
            this.f20706i = g10;
        }

        @Override // com.facebook.soloader.G.e, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f20705h.close();
        }

        @Override // com.facebook.soloader.G.e
        public final G.c[] e() {
            return r();
        }

        @Override // com.facebook.soloader.G.e
        public void k(File file) throws IOException {
            byte[] bArr = new byte[32768];
            for (a aVar : r()) {
                InputStream inputStream = this.f20705h.getInputStream(aVar.f20702i);
                try {
                    G.d dVar = new G.d(aVar, inputStream);
                    inputStream = null;
                    try {
                        d(dVar, bArr, file);
                        dVar.close();
                    } finally {
                    }
                } catch (Throwable th) {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    throw th;
                }
            }
        }

        a[] m() {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            HashMap map = new HashMap();
            Pattern patternCompile = Pattern.compile(m.this.f20701g);
            String[] strArrJ = SysUtil.j();
            Enumeration<? extends ZipEntry> enumerationEntries = this.f20705h.entries();
            while (enumerationEntries.hasMoreElements()) {
                ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                Matcher matcher = patternCompile.matcher(zipEntryNextElement.getName());
                if (matcher.matches()) {
                    int iGroupCount = matcher.groupCount();
                    String strGroup = matcher.group(iGroupCount - 1);
                    String strGroup2 = matcher.group(iGroupCount);
                    int iE = SysUtil.e(strArrJ, strGroup);
                    if (iE >= 0) {
                        linkedHashSet.add(strGroup);
                        a aVar = (a) map.get(strGroup2);
                        if (aVar == null || iE < aVar.f20703j) {
                            map.put(strGroup2, new a(strGroup2, zipEntryNextElement, iE));
                        }
                    }
                }
            }
            this.f20706i.t((String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]));
            a[] aVarArr = (a[]) map.values().toArray(new a[map.size()]);
            Arrays.sort(aVarArr);
            return aVarArr;
        }

        a[] r() {
            a[] aVarArr = this.f20704g;
            if (aVarArr != null) {
                return aVarArr;
            }
            a[] aVarArrM = m();
            this.f20704g = aVarArrM;
            return aVarArrM;
        }
    }

    public m(Context context, String str, File file, String str2) {
        super(context, str);
        this.f20700f = file;
        this.f20701g = str2;
    }

    @Override // com.facebook.soloader.C2095f, com.facebook.soloader.E
    public String c() {
        return "ExtractFromZipSoSource";
    }

    @Override // com.facebook.soloader.G
    protected G.e q() {
        return new b(this);
    }

    @Override // com.facebook.soloader.C2095f, com.facebook.soloader.E
    public String toString() {
        try {
            return this.f20700f.getCanonicalPath();
        } catch (IOException unused) {
            return this.f20700f.getName();
        }
    }

    public boolean v() throws IOException {
        b bVar = new b(this);
        try {
            boolean z10 = bVar.m().length != 0;
            bVar.close();
            return z10;
        } catch (Throwable th) {
            try {
                bVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
