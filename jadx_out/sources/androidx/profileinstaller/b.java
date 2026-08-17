package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.profileinstaller.f;
import com.facebook.react.uimanager.drawable.OutsetBoxShadowDrawableKt;
import com.facebook.react.views.text.TextAttributeProps;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AssetManager f17658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f17659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f.c f17660c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final File f17662e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f17663f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f17664g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f17665h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private c[] f17667j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private byte[] f17668k;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f17666i = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f17661d = d();

    public b(AssetManager assetManager, Executor executor, f.c cVar, String str, String str2, String str3, File file) {
        this.f17658a = assetManager;
        this.f17659b = executor;
        this.f17660c = cVar;
        this.f17663f = str;
        this.f17664g = str2;
        this.f17665h = str3;
        this.f17662e = file;
    }

    private b b(c[] cVarArr, byte[] bArr) {
        InputStream inputStreamG;
        try {
            inputStreamG = g(this.f17658a, this.f17665h);
        } catch (FileNotFoundException e10) {
            this.f17660c.b(9, e10);
        } catch (IOException e11) {
            this.f17660c.b(7, e11);
        } catch (IllegalStateException e12) {
            this.f17667j = null;
            this.f17660c.b(8, e12);
        }
        if (inputStreamG == null) {
            if (inputStreamG != null) {
                inputStreamG.close();
            }
            return null;
        }
        try {
            this.f17667j = g.r(inputStreamG, g.p(inputStreamG, g.f17688b), bArr, cVarArr);
            inputStreamG.close();
            return this;
        } catch (Throwable th) {
            try {
                inputStreamG.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private void c() {
        if (!this.f17666i) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    private static byte[] d() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            return i.f17700a;
        }
        switch (i10) {
            case TextAttributeProps.TA_KEY_ACCESSIBILITY_ROLE /* 24 */:
            case TextAttributeProps.TA_KEY_LINE_BREAK_STRATEGY /* 25 */:
                return i.f17704e;
            case TextAttributeProps.TA_KEY_ROLE /* 26 */:
                return i.f17703d;
            case TextAttributeProps.TA_KEY_TEXT_TRANSFORM /* 27 */:
                return i.f17702c;
            case OutsetBoxShadowDrawableKt.MIN_OUTSET_BOX_SHADOW_SDK_VERSION /* 28 */:
            case 29:
            case 30:
                return i.f17701b;
            default:
                return null;
        }
    }

    private InputStream f(AssetManager assetManager) {
        try {
            return g(assetManager, this.f17664g);
        } catch (FileNotFoundException e10) {
            this.f17660c.b(6, e10);
            return null;
        } catch (IOException e11) {
            this.f17660c.b(7, e11);
            return null;
        }
    }

    private InputStream g(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e10) {
            String message = e10.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f17660c.a(5, null);
            }
            return null;
        }
    }

    private c[] i(InputStream inputStream) {
        try {
            try {
                try {
                    c[] cVarArrX = g.x(inputStream, g.p(inputStream, g.f17687a), this.f17663f);
                    try {
                        inputStream.close();
                        return cVarArrX;
                    } catch (IOException e10) {
                        this.f17660c.b(7, e10);
                        return cVarArrX;
                    }
                } catch (IllegalStateException e11) {
                    this.f17660c.b(8, e11);
                    return null;
                }
            } catch (IOException e12) {
                this.f17660c.b(7, e12);
                return null;
            }
        } finally {
            try {
                inputStream.close();
            } catch (IOException e13) {
                this.f17660c.b(7, e13);
            }
        }
    }

    private static boolean j() {
        int i10 = Build.VERSION.SDK_INT;
        return i10 >= 31 || i10 == 24 || i10 == 25;
    }

    private void k(final int i10, final Object obj) {
        this.f17659b.execute(new Runnable() { // from class: f1.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f27209g.f17660c.b(i10, obj);
            }
        });
    }

    public boolean e() {
        if (this.f17661d == null) {
            k(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        if (!this.f17662e.exists()) {
            try {
                if (!this.f17662e.createNewFile()) {
                    k(4, null);
                    return false;
                }
            } catch (IOException unused) {
                k(4, null);
                return false;
            }
        } else if (!this.f17662e.canWrite()) {
            k(4, null);
            return false;
        }
        this.f17666i = true;
        return true;
    }

    public b h() {
        b bVarB;
        c();
        if (this.f17661d != null) {
            InputStream inputStreamF = f(this.f17658a);
            if (inputStreamF != null) {
                this.f17667j = i(inputStreamF);
            }
            c[] cVarArr = this.f17667j;
            if (cVarArr != null && j() && (bVarB = b(cVarArr, this.f17661d)) != null) {
                return bVarB;
            }
        }
        return this;
    }

    public b l() {
        ByteArrayOutputStream byteArrayOutputStream;
        c[] cVarArr = this.f17667j;
        byte[] bArr = this.f17661d;
        if (cVarArr != null && bArr != null) {
            c();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    g.F(byteArrayOutputStream, bArr);
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e10) {
                this.f17660c.b(7, e10);
            } catch (IllegalStateException e11) {
                this.f17660c.b(8, e11);
            }
            if (!g.C(byteArrayOutputStream, bArr, cVarArr)) {
                this.f17660c.b(5, null);
                this.f17667j = null;
                byteArrayOutputStream.close();
                return this;
            }
            this.f17668k = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            this.f17667j = null;
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean m() {
        byte[] bArr = this.f17668k;
        if (bArr == null) {
            return false;
        }
        c();
        try {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(this.f17662e);
                    try {
                        FileChannel channel = fileOutputStream.getChannel();
                        try {
                            FileLock fileLockTryLock = channel.tryLock();
                            try {
                                d.l(byteArrayInputStream, fileOutputStream, fileLockTryLock);
                                k(1, null);
                                if (fileLockTryLock != null) {
                                    fileLockTryLock.close();
                                }
                                channel.close();
                                fileOutputStream.close();
                                byteArrayInputStream.close();
                                return true;
                            } finally {
                            }
                        } finally {
                        }
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (FileNotFoundException e10) {
                k(6, e10);
                return false;
            } catch (IOException e11) {
                k(7, e11);
                return false;
            }
        } finally {
            this.f17668k = null;
            this.f17667j = null;
        }
    }
}
