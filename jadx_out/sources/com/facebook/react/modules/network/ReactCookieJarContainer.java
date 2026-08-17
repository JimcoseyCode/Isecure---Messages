package com.facebook.react.modules.network;

import com.facebook.react.uimanager.events.PointerEventHelper;
import e9.m;
import e9.n;
import e9.t;
import e9.u;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0003J%\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/facebook/react/modules/network/ReactCookieJarContainer;", "Lcom/facebook/react/modules/network/CookieJarContainer;", "<init>", "()V", "Le9/n;", "cookieJar", "Li7/B;", "setCookieJar", "(Le9/n;)V", "removeCookieJar", "Le9/u;", "url", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Le9/m;", "cookies", "saveFromResponse", "(Le9/u;Ljava/util/List;)V", "loadForRequest", "(Le9/u;)Ljava/util/List;", "Le9/n;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactCookieJarContainer implements CookieJarContainer {
    private n cookieJar;

    @Override // com.facebook.react.modules.network.CookieJarContainer, e9.n
    public List<m> loadForRequest(u url) {
        AbstractC2855l.g(url, "url");
        n nVar = this.cookieJar;
        if (nVar == null) {
            return AbstractC2800q.j();
        }
        List<m> listLoadForRequest = nVar.loadForRequest(url);
        ArrayList arrayList = new ArrayList();
        for (m mVar : listLoadForRequest) {
            try {
                new t.a().a(mVar.a(), mVar.b());
                arrayList.add(mVar);
            } catch (IllegalArgumentException unused) {
            }
        }
        return arrayList;
    }

    @Override // com.facebook.react.modules.network.CookieJarContainer
    public void removeCookieJar() {
        this.cookieJar = null;
    }

    @Override // com.facebook.react.modules.network.CookieJarContainer, e9.n
    public void saveFromResponse(u url, List<m> cookies) {
        AbstractC2855l.g(url, "url");
        AbstractC2855l.g(cookies, "cookies");
        n nVar = this.cookieJar;
        if (nVar != null) {
            nVar.saveFromResponse(url, cookies);
        }
    }

    @Override // com.facebook.react.modules.network.CookieJarContainer
    public void setCookieJar(n cookieJar) {
        AbstractC2855l.g(cookieJar, "cookieJar");
        this.cookieJar = cookieJar;
    }
}
