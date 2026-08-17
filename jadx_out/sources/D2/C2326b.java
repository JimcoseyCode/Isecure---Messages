package d2;

import android.util.Log;
import com.facebook.react.uimanager.events.PointerEventHelper;

/* JADX INFO: renamed from: d2.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C2326b implements InterfaceC2327c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C2326b f25558c = new C2326b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f25559a = "unknown";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f25560b = 5;

    private C2326b() {
    }

    public static C2326b l() {
        return f25558c;
    }

    private static String m(String str, Throwable th) {
        return str + '\n' + n(th);
    }

    private static String n(Throwable th) {
        return th == null ? PointerEventHelper.POINTER_TYPE_UNKNOWN : Log.getStackTraceString(th);
    }

    private String o(String str) {
        if (this.f25559a == null) {
            return str;
        }
        return this.f25559a + ":" + str;
    }

    private void p(int i10, String str, String str2) {
        Log.println(i10, o(str), str2);
    }

    private void q(int i10, String str, String str2, Throwable th) {
        Log.println(i10, o(str), m(str2, th));
    }

    @Override // d2.InterfaceC2327c
    public void a(String str, String str2, Throwable th) {
        q(6, str, str2, th);
    }

    @Override // d2.InterfaceC2327c
    public void b(String str, String str2) {
        p(5, str, str2);
    }

    @Override // d2.InterfaceC2327c
    public void c(String str, String str2, Throwable th) {
        q(5, str, str2, th);
    }

    @Override // d2.InterfaceC2327c
    public void d(String str, String str2) {
        p(6, str, str2);
    }

    @Override // d2.InterfaceC2327c
    public void e(String str, String str2) {
        p(2, str, str2);
    }

    @Override // d2.InterfaceC2327c
    public void f(String str, String str2) {
        p(6, str, str2);
    }

    @Override // d2.InterfaceC2327c
    public void g(String str, String str2, Throwable th) {
        q(6, str, str2, th);
    }

    @Override // d2.InterfaceC2327c
    public void h(String str, String str2) {
        p(3, str, str2);
    }

    @Override // d2.InterfaceC2327c
    public void i(String str, String str2, Throwable th) {
        q(3, str, str2, th);
    }

    @Override // d2.InterfaceC2327c
    public boolean j(int i10) {
        return this.f25560b <= i10;
    }

    @Override // d2.InterfaceC2327c
    public void k(String str, String str2) {
        p(4, str, str2);
    }
}
