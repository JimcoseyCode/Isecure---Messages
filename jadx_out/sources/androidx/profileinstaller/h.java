package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final androidx.concurrent.futures.f f17689a = androidx.concurrent.futures.f.D();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f17690b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static c f17691c = null;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class a {
        static PackageInfo a(PackageManager packageManager, Context context) {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f17692a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f17693b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f17694c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final long f17695d;

        b(int i10, int i11, long j10, long j11) {
            this.f17692a = i10;
            this.f17693b = i11;
            this.f17694c = j10;
            this.f17695d = j11;
        }

        static b a(File file) throws IOException {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                b bVar = new b(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return bVar;
            } finally {
            }
        }

        void b(File file) throws IOException {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f17692a);
                dataOutputStream.writeInt(this.f17693b);
                dataOutputStream.writeLong(this.f17694c);
                dataOutputStream.writeLong(this.f17695d);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof b)) {
                b bVar = (b) obj;
                if (this.f17693b == bVar.f17693b && this.f17694c == bVar.f17694c && this.f17692a == bVar.f17692a && this.f17695d == bVar.f17695d) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f17693b), Long.valueOf(this.f17694c), Integer.valueOf(this.f17692a), Long.valueOf(this.f17695d));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f17696a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f17697b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f17698c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f17699d;

        c(int i10, boolean z10, boolean z11, boolean z12) {
            this.f17696a = i10;
            this.f17698c = z11;
            this.f17697b = z10;
            this.f17699d = z12;
        }
    }

    private static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? a.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    private static c b(int i10, boolean z10, boolean z11, boolean z12) {
        c cVar = new c(i10, z10, z11, z12);
        f17691c = cVar;
        f17689a.z(cVar);
        return f17691c;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x00f6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static c c(Context context, boolean z10) {
        int i10;
        boolean z11;
        int i11;
        boolean z12;
        long length;
        boolean z13;
        File file;
        b bVarA;
        b bVar;
        int i12;
        AssetFileDescriptor assetFileDescriptorOpenFd;
        c cVar;
        if (!z10 && (cVar = f17691c) != null) {
            return cVar;
        }
        synchronized (f17690b) {
            if (z10) {
                i10 = 0;
                assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                if (assetFileDescriptorOpenFd.getLength() <= 0) {
                }
                assetFileDescriptorOpenFd.close();
                i11 = Build.VERSION.SDK_INT;
                if (i11 >= 28) {
                    File file2 = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length2 = file2.length();
                    if (file2.exists()) {
                        File file3 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                        length = file3.length();
                        if (file3.exists()) {
                            long jA = a(context);
                            file = new File(context.getFilesDir(), "profileInstalled");
                            if (file.exists()) {
                            }
                            if (bVarA == null) {
                                if (z11) {
                                }
                            }
                            if (z10) {
                                i10 = 2;
                            }
                            if (bVarA != null) {
                                i10 = 3;
                            }
                            int i13 = i10;
                            bVar = new b(1, i13, jA, length);
                            if (bVarA != null) {
                                bVar.b(file);
                            }
                            return b(i13, z12, z13, z11);
                        }
                    }
                }
                return b(262144, false, false, z11);
            }
            c cVar2 = f17691c;
            if (cVar2 != null) {
                return cVar2;
            }
            i10 = 0;
            try {
                assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                try {
                    z11 = assetFileDescriptorOpenFd.getLength() <= 0;
                    assetFileDescriptorOpenFd.close();
                } finally {
                }
            } catch (IOException unused) {
                z11 = false;
            }
            i11 = Build.VERSION.SDK_INT;
            if (i11 >= 28 && i11 != 30) {
                File file22 = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                long length22 = file22.length();
                z12 = !file22.exists() && length22 > 0;
                File file32 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                length = file32.length();
                z13 = !file32.exists() && length > 0;
                try {
                    long jA2 = a(context);
                    file = new File(context.getFilesDir(), "profileInstalled");
                    if (file.exists()) {
                        bVarA = null;
                    } else {
                        try {
                            bVarA = b.a(file);
                        } catch (IOException unused2) {
                            return b(131072, z12, z13, z11);
                        }
                    }
                    if (bVarA == null && bVarA.f17694c == jA2 && (i12 = bVarA.f17693b) != 2) {
                        i10 = i12;
                    } else if (z11) {
                        i10 = 327680;
                    } else if (z12) {
                        i10 = 1;
                    } else if (z13) {
                        i10 = 2;
                    }
                    if (z10 && z13 && i10 != 1) {
                        i10 = 2;
                    }
                    if (bVarA != null && bVarA.f17693b == 2 && i10 == 1 && length22 < bVarA.f17695d) {
                        i10 = 3;
                    }
                    int i132 = i10;
                    bVar = new b(1, i132, jA2, length);
                    if (bVarA != null || !bVarA.equals(bVar)) {
                        try {
                            bVar.b(file);
                        } catch (IOException unused3) {
                            i132 = 196608;
                        }
                    }
                    return b(i132, z12, z13, z11);
                } catch (PackageManager.NameNotFoundException unused4) {
                    return b(65536, z12, z13, z11);
                }
            }
            return b(262144, false, false, z11);
        }
    }
}
