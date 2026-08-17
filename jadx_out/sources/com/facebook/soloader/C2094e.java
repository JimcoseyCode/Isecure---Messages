package com.facebook.soloader;

import android.os.StrictMode;
import com.facebook.hermes.intl.Constants;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: com.facebook.soloader.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C2094e extends E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final String f20682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected q f20683b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Set f20684c = null;

    public C2094e(String str) {
        this.f20682a = str;
    }

    static String g(String str) {
        if (Constants.SENSITIVITY_BASE.equals(str)) {
            return SoLoader.f20662d.getApplicationInfo().sourceDir;
        }
        String[] strArr = SoLoader.f20662d.getApplicationInfo().splitSourceDirs;
        if (strArr == null) {
            throw new IllegalStateException("No splits avaiable");
        }
        String str2 = "split_" + str + ".apk";
        for (String str3 : strArr) {
            if (str3.endsWith(str2)) {
                return str3;
            }
        }
        throw new IllegalStateException("Could not find " + str + " split");
    }

    @Override // com.facebook.soloader.E
    public String c() {
        return "DirectSplitSoSource";
    }

    @Override // com.facebook.soloader.E
    public int d(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        Set set = this.f20684c;
        if (set == null) {
            throw new IllegalStateException("prepare not called");
        }
        if (set.contains(str)) {
            return h(str, i10);
        }
        return 0;
    }

    @Override // com.facebook.soloader.E
    protected void e(int i10) throws IOException {
        InputStream inputStreamOpen = SoLoader.f20662d.getAssets().open(this.f20682a + ".soloader-manifest");
        try {
            this.f20683b = q.b(inputStreamOpen);
            if (inputStreamOpen != null) {
                inputStreamOpen.close();
            }
            this.f20684c = new HashSet(this.f20683b.f20712b);
        } catch (Throwable th) {
            if (inputStreamOpen != null) {
                try {
                    inputStreamOpen.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public String f(String str) {
        Set set = this.f20684c;
        if (set == null || this.f20683b == null) {
            throw new IllegalStateException("prepare not called");
        }
        if (!set.contains(str)) {
            return null;
        }
        return g(this.f20682a) + "!/lib/" + this.f20683b.f20711a + "/" + str;
    }

    protected int h(String str, int i10) {
        String strF = f(str);
        strF.getClass();
        System.load(strF);
        return 1;
    }
}
