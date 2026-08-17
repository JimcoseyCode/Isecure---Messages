package U;

import android.text.TextUtils;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.math.BigInteger;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h implements Comparable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final h f10721g = k(1, 0, 0, PointerEventHelper.POINTER_TYPE_UNKNOWN);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final h f10722h = k(1, 1, 0, PointerEventHelper.POINTER_TYPE_UNKNOWN);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final h f10723i = k(1, 2, 0, PointerEventHelper.POINTER_TYPE_UNKNOWN);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final h f10724j = k(1, 3, 0, PointerEventHelper.POINTER_TYPE_UNKNOWN);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final h f10725k = k(1, 4, 0, PointerEventHelper.POINTER_TYPE_UNKNOWN);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final h f10726l = k(1, 5, 0, PointerEventHelper.POINTER_TYPE_UNKNOWN);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Pattern f10727m = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:\\-(.+))?");

    h() {
    }

    public static h k(int i10, int i11, int i12, String str) {
        return new a(i10, i11, i12, str);
    }

    private static BigInteger m(h hVar) {
        return BigInteger.valueOf(hVar.q()).shiftLeft(32).or(BigInteger.valueOf(hVar.r())).shiftLeft(32).or(BigInteger.valueOf(hVar.s()));
    }

    public static h t(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Matcher matcher = f10727m.matcher(str);
        if (matcher.matches()) {
            return k(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)), Integer.parseInt(matcher.group(3)), matcher.group(4) != null ? matcher.group(4) : PointerEventHelper.POINTER_TYPE_UNKNOWN);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Integer.valueOf(q()).equals(Integer.valueOf(hVar.q())) && Integer.valueOf(r()).equals(Integer.valueOf(hVar.r())) && Integer.valueOf(s()).equals(Integer.valueOf(hVar.s()));
    }

    public int h(int i10, int i11) {
        return q() == i10 ? Integer.compare(r(), i11) : Integer.compare(q(), i10);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(q()), Integer.valueOf(r()), Integer.valueOf(s()));
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public int compareTo(h hVar) {
        return m(this).compareTo(m(hVar));
    }

    abstract String p();

    public abstract int q();

    abstract int r();

    abstract int s();

    public final String toString() {
        StringBuilder sb = new StringBuilder(q() + "." + r() + "." + s());
        if (!TextUtils.isEmpty(p())) {
            sb.append("-" + p());
        }
        return sb.toString();
    }
}
