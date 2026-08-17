package expo.modules.image.okhttp;

import P8.q;
import android.webkit.CookieManager;
import com.facebook.react.uimanager.events.PointerEventHelper;
import e9.m;
import e9.n;
import e9.u;
import i7.AbstractC2753p;
import i7.C2752o;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lexpo/modules/image/okhttp/SharedCookieJar;", "Le9/n;", "<init>", "()V", "Landroid/webkit/CookieManager;", "getCookieManager", "()Landroid/webkit/CookieManager;", "Le9/u;", "url", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Le9/m;", "cookies", "Li7/B;", "saveFromResponse", "(Le9/u;Ljava/util/List;)V", "loadForRequest", "(Le9/u;)Ljava/util/List;", "expo-image_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class SharedCookieJar implements n {
    public static final SharedCookieJar INSTANCE = new SharedCookieJar();

    private SharedCookieJar() {
    }

    private final CookieManager getCookieManager() {
        Object objB;
        try {
            C2752o.a aVar = C2752o.f28721h;
            objB = C2752o.b(CookieManager.getInstance());
        } catch (Throwable th) {
            C2752o.a aVar2 = C2752o.f28721h;
            objB = C2752o.b(AbstractC2753p.a(th));
        }
        if (C2752o.f(objB)) {
            objB = null;
        }
        return (CookieManager) objB;
    }

    @Override // e9.n
    public List<m> loadForRequest(u url) {
        AbstractC2855l.g(url, "url");
        CookieManager cookieManager = getCookieManager();
        if (cookieManager == null) {
            return AbstractC2800q.j();
        }
        String cookie = cookieManager.getCookie(url.toString());
        if (cookie == null) {
            return AbstractC2800q.j();
        }
        List listG0 = q.G0(cookie, new String[]{";"}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList();
        Iterator it = listG0.iterator();
        while (it.hasNext()) {
            m mVarC = m.f26279n.c(url, q.c1((String) it.next()).toString());
            if (mVarC != null) {
                arrayList.add(mVarC);
            }
        }
        return arrayList;
    }

    @Override // e9.n
    public void saveFromResponse(u url, List<m> cookies) {
        AbstractC2855l.g(url, "url");
        AbstractC2855l.g(cookies, "cookies");
        CookieManager cookieManager = getCookieManager();
        if (cookieManager == null) {
            return;
        }
        String string = url.toString();
        Iterator<m> it = cookies.iterator();
        while (it.hasNext()) {
            cookieManager.setCookie(string, it.next().toString());
        }
        cookieManager.flush();
    }
}
