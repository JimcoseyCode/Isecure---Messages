package E5;

import android.content.SharedPreferences;
import android.util.Base64;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import n5.C2970e;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f1101c = {"*", "FCM", "GCM", PointerEventHelper.POINTER_TYPE_UNKNOWN};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f1102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f1103b;

    public b(C2970e c2970e) {
        this.f1102a = c2970e.j().getSharedPreferences("com.google.android.gms.appid", 0);
        this.f1103b = b(c2970e);
    }

    private String a(String str, String str2) {
        return "|T|" + str + "|" + str2;
    }

    private static String b(C2970e c2970e) {
        String strD = c2970e.m().d();
        if (strD != null) {
            return strD;
        }
        String strC = c2970e.m().c();
        if (!strC.startsWith("1:") && !strC.startsWith("2:")) {
            return strC;
        }
        String[] strArrSplit = strC.split(":");
        if (strArrSplit.length != 4) {
            return null;
        }
        String str = strArrSplit[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    private static String c(PublicKey publicKey) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            bArrDigest[0] = (byte) (((bArrDigest[0] & 15) + 112) & 255);
            return Base64.encodeToString(bArrDigest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    private String d(String str) {
        try {
            return new JSONObject(str).getString("token");
        } catch (JSONException unused) {
            return null;
        }
    }

    private PublicKey e(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e10) {
            e10.toString();
            return null;
        }
    }

    private String g() {
        String string;
        synchronized (this.f1102a) {
            string = this.f1102a.getString("|S|id", null);
        }
        return string;
    }

    private String h() {
        synchronized (this.f1102a) {
            try {
                String string = this.f1102a.getString("|S||P|", null);
                if (string == null) {
                    return null;
                }
                PublicKey publicKeyE = e(string);
                if (publicKeyE == null) {
                    return null;
                }
                return c(publicKeyE);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String f() {
        synchronized (this.f1102a) {
            try {
                String strG = g();
                if (strG != null) {
                    return strG;
                }
                return h();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String i() {
        synchronized (this.f1102a) {
            try {
                for (String str : f1101c) {
                    String string = this.f1102a.getString(a(this.f1103b, str), null);
                    if (string != null && !string.isEmpty()) {
                        if (string.startsWith("{")) {
                            string = d(string);
                        }
                        return string;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
