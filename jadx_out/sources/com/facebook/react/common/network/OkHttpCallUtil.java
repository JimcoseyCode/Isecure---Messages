package com.facebook.react.common.network;

import com.facebook.react.uimanager.events.PointerEventHelper;
import e9.InterfaceC2437e;
import e9.p;
import e9.z;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/facebook/react/common/network/OkHttpCallUtil;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "Le9/z;", "client", "tag", "Li7/B;", "cancelTag", "(Le9/z;Ljava/lang/Object;)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OkHttpCallUtil {
    public static final OkHttpCallUtil INSTANCE = new OkHttpCallUtil();

    private OkHttpCallUtil() {
    }

    public static final void cancelTag(z client, Object tag) {
        AbstractC2855l.g(client, "client");
        AbstractC2855l.g(tag, "tag");
        p pVarE = client.e();
        for (InterfaceC2437e interfaceC2437e : pVarE.i()) {
            if (AbstractC2855l.b(tag, interfaceC2437e.d().n())) {
                interfaceC2437e.cancel();
                return;
            }
        }
        for (InterfaceC2437e interfaceC2437e2 : pVarE.j()) {
            if (AbstractC2855l.b(tag, interfaceC2437e2.d().n())) {
                interfaceC2437e2.cancel();
                return;
            }
        }
    }
}
