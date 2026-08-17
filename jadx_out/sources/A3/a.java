package A3;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.facebook.soloader.p;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String[] f37a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f38b;

    public a(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException();
        }
        this.f37a = new String[i10];
        this.f38b = 0;
    }

    public synchronized boolean a(String str) {
        for (String str2 : this.f37a) {
            if (str.equals(str2)) {
                return false;
            }
        }
        StringBuilder sb = new StringBuilder("Recording new base apk path: ");
        sb.append(str);
        sb.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        b(sb);
        p.g("SoLoader", sb.toString());
        String[] strArr = this.f37a;
        int i10 = this.f38b;
        strArr[i10 % strArr.length] = str;
        this.f38b = i10 + 1;
        return true;
    }

    public synchronized void b(StringBuilder sb) {
        try {
            sb.append("Previously recorded ");
            sb.append(this.f38b);
            sb.append(" base apk paths.");
            if (this.f38b > 0) {
                sb.append(" Most recent ones:");
            }
            int i10 = 0;
            while (true) {
                String[] strArr = this.f37a;
                if (i10 < strArr.length) {
                    int i11 = (this.f38b - i10) - 1;
                    if (i11 >= 0) {
                        String str = strArr[i11 % strArr.length];
                        sb.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                        sb.append(str);
                        sb.append(" (");
                        sb.append(new File(str).exists() ? "exists" : "does not exist");
                        sb.append(")");
                    }
                    i10++;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized int c() {
        return this.f38b;
    }
}
