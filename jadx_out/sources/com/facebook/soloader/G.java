package com.facebook.soloader;

import android.content.Context;
import android.os.Parcel;
import com.facebook.react.uimanager.ViewDefaults;
import java.io.Closeable;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class G extends C2095f implements InterfaceC2091b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final Context f20648d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String[] f20649e;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements FilenameFilter {
        a() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return (str.equals("dso_state") || str.equals("dso_lock") || str.equals("dso_deps")) ? false : true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b implements Runnable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f20651g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ File f20652h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ n f20653i;

        b(boolean z10, File file, n nVar) {
            this.f20651g = z10;
            this.f20652h = file;
            this.f20653i = nVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            p.f("fb-UnpackingSoSource", "starting syncer worker");
            try {
                try {
                    if (this.f20651g) {
                        SysUtil.f(G.this.f20685a);
                    }
                    G.u(this.f20652h, (byte) 1, this.f20651g);
                    p.f("fb-UnpackingSoSource", "releasing dso store lock for " + G.this.f20685a + " (from syncer thread)");
                    this.f20653i.close();
                } catch (Throwable th) {
                    p.f("fb-UnpackingSoSource", "releasing dso store lock for " + G.this.f20685a + " (from syncer thread)");
                    this.f20653i.close();
                    throw th;
                }
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class c {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f20655g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f20656h;

        public c(String str, String str2) {
            this.f20655g = str;
            this.f20656h = str2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    protected static final class d implements Closeable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final c f20657g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final InputStream f20658h;

        public d(c cVar, InputStream inputStream) {
            this.f20657g = cVar;
            this.f20658h = inputStream;
        }

        public int available() {
            return this.f20658h.available();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f20658h.close();
        }

        public c e() {
            return this.f20657g;
        }
    }

    protected G(Context context, String str, boolean z10) {
        super(p(context, str), z10 ? 1 : 0);
        this.f20648d = context;
    }

    private void j() throws IOException {
        File[] fileArrListFiles = this.f20685a.listFiles(new a());
        if (fileArrListFiles == null) {
            throw new IOException("unable to list directory " + this.f20685a);
        }
        for (File file : fileArrListFiles) {
            p.f("fb-UnpackingSoSource", "Deleting " + file);
            SysUtil.c(file);
        }
    }

    private static boolean m(int i10) {
        return (i10 & 2) != 0;
    }

    public static File p(Context context, String str) {
        return new File(context.getApplicationInfo().dataDir + "/" + str);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean r(n nVar, int i10) throws IOException {
        byte b10;
        RandomAccessFile randomAccessFile;
        File file = new File(this.f20685a, "dso_state");
        byte[] bArrN = n();
        if (m(i10) || k(bArrN)) {
            b10 = 0;
        } else {
            randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                if (randomAccessFile.length() == 1) {
                    try {
                        b10 = randomAccessFile.readByte();
                    } catch (IOException e10) {
                        p.f("fb-UnpackingSoSource", "dso store " + this.f20685a + " regeneration interrupted: " + e10.getMessage());
                    }
                    if (b10 == 1) {
                        p.f("fb-UnpackingSoSource", "dso store " + this.f20685a + " regeneration not needed: state file clean");
                    } else {
                        b10 = 0;
                    }
                    randomAccessFile.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (b10 == 1) {
            return false;
        }
        boolean z10 = (i10 & 4) == 0;
        p.f("fb-UnpackingSoSource", "so store dirty: regenerating");
        u(file, (byte) 0, z10);
        j();
        e eVarQ = q();
        try {
            eVarQ.k(this.f20685a);
            eVarQ.close();
            randomAccessFile = new RandomAccessFile(new File(this.f20685a, "dso_deps"), "rw");
            try {
                randomAccessFile.write(bArrN);
                randomAccessFile.setLength(randomAccessFile.getFilePointer());
                randomAccessFile.close();
                b bVar = new b(z10, file, nVar);
                if (s(i10)) {
                    new Thread(bVar, "SoSync:" + this.f20685a.getName()).start();
                } else {
                    bVar.run();
                }
                return true;
            } finally {
                try {
                    randomAccessFile.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
        } catch (Throwable th3) {
            if (eVarQ != null) {
                try {
                    eVarQ.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    private static boolean s(int i10) {
        return (i10 & 1) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void u(File file, byte b10, boolean z10) throws IOException {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                randomAccessFile.seek(0L);
                randomAccessFile.write(b10);
                randomAccessFile.setLength(randomAccessFile.getFilePointer());
                if (z10) {
                    randomAccessFile.getFD().sync();
                }
                randomAccessFile.close();
            } finally {
            }
        } catch (SyncFailedException e10) {
            p.h("fb-UnpackingSoSource", "state file sync failed", e10);
        }
    }

    @Override // com.facebook.soloader.InterfaceC2091b
    public void a() throws Throwable {
        try {
            n nVarI = SysUtil.i(this.f20685a, new File(this.f20685a, "dso_lock"));
            if (nVarI != null) {
                nVarI.close();
            }
        } catch (Exception e10) {
            p.c("fb-UnpackingSoSource", "Encountered exception during wait for unpacking trying to acquire file lock for " + getClass().getName() + " (" + this.f20685a + "): ", e10);
        }
    }

    @Override // com.facebook.soloader.E
    public void e(int i10) throws IOException {
        SysUtil.m(this.f20685a);
        if (!this.f20685a.canWrite() && !this.f20685a.setWritable(true)) {
            throw new IOException("error adding " + this.f20685a.getCanonicalPath() + " write permission");
        }
        n nVar = null;
        try {
            try {
                n nVarI = SysUtil.i(this.f20685a, new File(this.f20685a, "dso_lock"));
                try {
                    p.f("fb-UnpackingSoSource", "locked dso store " + this.f20685a);
                    if (!this.f20685a.canWrite() && !this.f20685a.setWritable(true)) {
                        throw new IOException("error adding " + this.f20685a.getCanonicalPath() + " write permission");
                    }
                    if (!r(nVarI, i10)) {
                        p.d("fb-UnpackingSoSource", "dso store is up-to-date: " + this.f20685a);
                        nVar = nVarI;
                    }
                    if (nVar != null) {
                        p.f("fb-UnpackingSoSource", "releasing dso store lock for " + this.f20685a);
                        nVar.close();
                    } else {
                        p.f("fb-UnpackingSoSource", "not releasing dso store lock for " + this.f20685a + " (syncer thread started)");
                    }
                    if (!this.f20685a.canWrite() || this.f20685a.setWritable(false)) {
                        return;
                    }
                    throw new IOException("error removing " + this.f20685a.getCanonicalPath() + " write permission");
                } catch (Throwable th) {
                    th = th;
                    nVar = nVarI;
                    if (nVar != null) {
                        p.f("fb-UnpackingSoSource", "releasing dso store lock for " + this.f20685a);
                        nVar.close();
                    } else {
                        p.f("fb-UnpackingSoSource", "not releasing dso store lock for " + this.f20685a + " (syncer thread started)");
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                if (!this.f20685a.canWrite() || this.f20685a.setWritable(false)) {
                    throw th2;
                }
                throw new IOException("error removing " + this.f20685a.getCanonicalPath() + " write permission");
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    protected boolean k(byte[] bArr) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(new File(this.f20685a, "dso_deps"), "rw");
            try {
                if (randomAccessFile.length() != 0) {
                    int length = (int) randomAccessFile.length();
                    byte[] bArr2 = new byte[length];
                    if (randomAccessFile.read(bArr2) == length) {
                        boolean zL = l(bArr2, bArr);
                        randomAccessFile.close();
                        return zL;
                    }
                    p.f("fb-UnpackingSoSource", "short read of so store deps file: marking unclean");
                }
                randomAccessFile.close();
                return true;
            } finally {
            }
        } catch (IOException e10) {
            p.h("fb-UnpackingSoSource", "failed to compare whether deps changed", e10);
            return true;
        }
    }

    protected boolean l(byte[] bArr, byte[] bArr2) {
        return !Arrays.equals(bArr, bArr2);
    }

    protected byte[] n() {
        Parcel parcelObtain = Parcel.obtain();
        e eVarQ = q();
        try {
            c[] cVarArrE = eVarQ.e();
            parcelObtain.writeInt(cVarArrE.length);
            for (c cVar : cVarArrE) {
                parcelObtain.writeString(cVar.f20655g);
                parcelObtain.writeString(cVar.f20656h);
            }
            eVarQ.close();
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            return bArrMarshall;
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

    public c[] o() {
        e eVarQ = q();
        try {
            c[] cVarArrE = eVarQ.e();
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

    protected abstract e q();

    public void t(String[] strArr) {
        this.f20649e = strArr;
    }

    protected G(Context context, String str) {
        this(context, str, true);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    protected static abstract class e implements Closeable {
        protected e() {
        }

        public void d(d dVar, byte[] bArr, File file) {
            p.d("fb-UnpackingSoSource", "extracting DSO " + dVar.e().f20655g);
            File file2 = new File(file, dVar.e().f20655g);
            try {
                try {
                    RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rw");
                    try {
                        int iAvailable = dVar.available();
                        if (iAvailable > 1) {
                            SysUtil.d(randomAccessFile.getFD(), iAvailable);
                        }
                        SysUtil.a(randomAccessFile, dVar.f20658h, ViewDefaults.NUMBER_OF_LINES, bArr);
                        randomAccessFile.setLength(randomAccessFile.getFilePointer());
                        if (file2.setExecutable(true, false)) {
                            randomAccessFile.close();
                        } else {
                            throw new IOException("cannot make file executable: " + file2);
                        }
                    } finally {
                    }
                } catch (IOException e10) {
                    p.b("fb-UnpackingSoSource", "error extracting dso  " + file2 + " due to: " + e10);
                    SysUtil.c(file2);
                    throw e10;
                }
            } finally {
                if (file2.exists() && !file2.setWritable(false)) {
                    p.b("SoLoader", "Error removing " + file2 + " write permission from directory " + file + " (writable: " + file.canWrite() + ")");
                }
            }
        }

        public abstract c[] e();

        public abstract void k(File file);

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }
}
