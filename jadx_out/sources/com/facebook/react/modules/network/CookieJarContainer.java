package com.facebook.react.modules.network;

import e9.n;
import e9.u;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H&¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/modules/network/CookieJarContainer;", "Le9/n;", "cookieJar", "Li7/B;", "setCookieJar", "(Le9/n;)V", "removeCookieJar", "()V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface CookieJarContainer extends n {
    @Override // e9.n
    /* synthetic */ List loadForRequest(u uVar);

    void removeCookieJar();

    @Override // e9.n
    /* synthetic */ void saveFromResponse(u uVar, List list);

    void setCookieJar(n cookieJar);
}
