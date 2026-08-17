package com.facebook.soloader;

import android.content.Context;
import android.os.Parcel;
import android.os.StrictMode;
import com.facebook.soloader.G;
import com.facebook.soloader.m;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: com.facebook.soloader.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C2092c extends G implements w {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ArrayList f20676f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected boolean f20677g;

    /* JADX INFO: renamed from: com.facebook.soloader.c$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    protected class a extends G.e {
        protected a() {
        }

        @Override // com.facebook.soloader.G.e
        public G.c[] e() {
            ArrayList arrayList = new ArrayList();
            Iterator it = C2092c.this.f20676f.iterator();
            while (it.hasNext()) {
                G.e eVarQ = ((m) it.next()).q();
                try {
                    arrayList.addAll(Arrays.asList(eVarQ.e()));
                    eVarQ.close();
                } catch (Throwable th) {
                    if (eVarQ != null) {
                        try {
                            eVarQ.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
            return (G.c[]) arrayList.toArray(new G.c[arrayList.size()]);
        }

        @Override // com.facebook.soloader.G.e
        public void k(File file) throws IOException {
            Iterator it = C2092c.this.f20676f.iterator();
            while (it.hasNext()) {
                m.b bVar = (m.b) ((m) it.next()).q();
                try {
                    bVar.k(file);
                    bVar.close();
                } catch (Throwable th) {
                    if (bVar != null) {
                        try {
                            bVar.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
        }
    }

    public C2092c(Context context, String str, boolean z10) {
        super(context, str, z10);
        ArrayList arrayList = new ArrayList();
        this.f20676f = arrayList;
        this.f20677g = false;
        arrayList.add(new m(context, str, new File(context.getApplicationInfo().sourceDir), "^lib/([^/]+)/([^/]+\\.so)$"));
        w(context, str);
    }

    private void w(Context context, String str) {
        if (context.getApplicationInfo().splitSourceDirs == null) {
            return;
        }
        try {
            for (String str2 : context.getApplicationInfo().splitSourceDirs) {
                m mVar = new m(context, str, new File(str2), "^lib/([^/]+)/([^/]+\\.so)$");
                if (mVar.v()) {
                    p.g("BackupSoSource", "adding backup source from split: " + mVar.toString());
                    this.f20676f.add(mVar);
                }
            }
        } catch (IOException e10) {
            p.h("BackupSoSource", "failed to read split apks", e10);
        }
    }

    @Override // com.facebook.soloader.w
    public E b(Context context) {
        C2092c c2092c = new C2092c(context, this.f20685a.getName());
        try {
            c2092c.e(0);
            return c2092c;
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // com.facebook.soloader.C2095f, com.facebook.soloader.E
    public String c() {
        return "BackupSoSource";
    }

    @Override // com.facebook.soloader.C2095f, com.facebook.soloader.E
    public int d(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        if (this.f20677g) {
            return super.d(str, i10, threadPolicy);
        }
        return 0;
    }

    @Override // com.facebook.soloader.G, com.facebook.soloader.E
    public void e(int i10) throws IOException {
        if ((i10 & 8) != 0) {
            return;
        }
        super.e(i10);
        this.f20677g = true;
    }

    @Override // com.facebook.soloader.G
    protected byte[] n() {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeByte((byte) 3);
            parcelObtain.writeInt(SysUtil.g(this.f20648d));
            parcelObtain.writeInt(this.f20676f.size());
            Iterator it = this.f20676f.iterator();
            while (it.hasNext()) {
                parcelObtain.writeByteArray(((m) it.next()).n());
            }
            String str = this.f20648d.getApplicationInfo().sourceDir;
            if (str == null) {
                parcelObtain.writeByte((byte) 1);
                byte[] bArrMarshall = parcelObtain.marshall();
                parcelObtain.recycle();
                return bArrMarshall;
            }
            File canonicalFile = new File(str).getCanonicalFile();
            if (!canonicalFile.exists()) {
                parcelObtain.writeByte((byte) 1);
                byte[] bArrMarshall2 = parcelObtain.marshall();
                parcelObtain.recycle();
                return bArrMarshall2;
            }
            parcelObtain.writeByte((byte) 2);
            parcelObtain.writeString(canonicalFile.getPath());
            parcelObtain.writeLong(canonicalFile.lastModified());
            byte[] bArrMarshall3 = parcelObtain.marshall();
            parcelObtain.recycle();
            return bArrMarshall3;
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // com.facebook.soloader.G
    public G.c[] o() {
        G.e eVarQ = ((m) this.f20676f.get(0)).q();
        try {
            G.c[] cVarArrE = eVarQ.e();
            eVarQ.close();
            return cVarArrE;
        } catch (Throwable th) {
            if (eVarQ != null) {
                try {
                    eVarQ.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // com.facebook.soloader.G
    protected G.e q() {
        return new a();
    }

    @Override // com.facebook.soloader.C2095f, com.facebook.soloader.E
    public String toString() {
        String name;
        try {
            name = String.valueOf(this.f20685a.getCanonicalPath());
        } catch (IOException unused) {
            name = this.f20685a.getName();
        }
        return c() + "[root = " + name + " flags = " + this.f20686b + " apks = " + this.f20676f.toString() + "]";
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003a, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
    
        com.facebook.soloader.p.b("SoLoader", "Found " + r9 + " in " + c());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean x(String str, int i10) throws IOException {
        boolean z10;
        G.e eVarQ = q();
        try {
            G.c[] cVarArrE = eVarQ.e();
            int length = cVarArrE.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    z10 = false;
                    break;
                }
                if (cVarArrE[i11].f20655g.equals(str)) {
                    break;
                }
                i11++;
            }
            eVarQ.close();
            if (!z10) {
                return false;
            }
            p.b("SoLoader", "Preparing " + c());
            e(i10);
            return true;
        } catch (Throwable th) {
            if (eVarQ != null) {
                try {
                    eVarQ.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public C2092c(Context context, String str) {
        this(context, str, true);
    }
}
