package k4;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import r4.AbstractC3268i;

/* JADX INFO: renamed from: k4.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C2829b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Lock f29126c = new ReentrantLock();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static C2829b f29127d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Lock f29128a = new ReentrantLock();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SharedPreferences f29129b;

    C2829b(Context context) {
        this.f29129b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static C2829b a(Context context) {
        AbstractC3268i.k(context);
        Lock lock = f29126c;
        lock.lock();
        try {
            if (f29127d == null) {
                f29127d = new C2829b(context.getApplicationContext());
            }
            C2829b c2829b = f29127d;
            lock.unlock();
            return c2829b;
        } catch (Throwable th) {
            f29126c.unlock();
            throw th;
        }
    }

    private static final String d(String str, String str2) {
        return str + ":" + str2;
    }

    public GoogleSignInAccount b() {
        String strC;
        String strC2 = c("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(strC2) && (strC = c(d("googleSignInAccount", strC2))) != null) {
            try {
                return GoogleSignInAccount.K0(strC);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    protected final String c(String str) {
        this.f29128a.lock();
        try {
            return this.f29129b.getString(str, null);
        } finally {
            this.f29128a.unlock();
        }
    }
}
