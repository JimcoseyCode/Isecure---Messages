package com.facebook.react.devsupport.inspector;

import P8.C1385d;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.events.PointerEventHelper;
import e9.B;
import e9.D;
import e9.E;
import e9.InterfaceC2437e;
import e9.InterfaceC2438f;
import e9.t;
import i7.C2735B;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import t7.AbstractC3376c;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/facebook/react/devsupport/inspector/InspectorNetworkHelper;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "url", "Lcom/facebook/react/devsupport/inspector/InspectorNetworkRequestListener;", "listener", "Li7/B;", "loadNetworkResource", "(Ljava/lang/String;Lcom/facebook/react/devsupport/inspector/InspectorNetworkRequestListener;)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InspectorNetworkHelper {
    public static final InspectorNetworkHelper INSTANCE = new InspectorNetworkHelper();

    private InspectorNetworkHelper() {
    }

    public static final void loadNetworkResource(String url, final InspectorNetworkRequestListener listener) {
        AbstractC2855l.g(url, "url");
        AbstractC2855l.g(listener, "listener");
        try {
            DevSupportHttpClient.INSTANCE.getHttpClient$ReactAndroid_release().a(new B.a().m(url).b()).t0(new InterfaceC2438f() { // from class: com.facebook.react.devsupport.inspector.InspectorNetworkHelper.loadNetworkResource.1
                @Override // e9.InterfaceC2438f
                public void onFailure(InterfaceC2437e call, IOException e10) {
                    AbstractC2855l.g(call, "call");
                    AbstractC2855l.g(e10, "e");
                    if (call.s()) {
                        return;
                    }
                    listener.onError(e10.getMessage());
                }

                @Override // e9.InterfaceC2438f
                public void onResponse(InterfaceC2437e call, D response) {
                    InputStream inputStreamByteStream;
                    byte[] bArr;
                    AbstractC2855l.g(call, "call");
                    AbstractC2855l.g(response, "response");
                    t tVarK = response.k();
                    HashMap map = new HashMap();
                    for (String str : tVarK.q()) {
                        map.put(str, tVarK.o(str));
                    }
                    listener.onHeaders(response.e(), map);
                    try {
                        E eD = response.d();
                        InspectorNetworkRequestListener inspectorNetworkRequestListener = listener;
                        if (eD != null) {
                            try {
                                inputStreamByteStream = eD.byteStream();
                                bArr = new byte[IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET];
                            } finally {
                            }
                            while (true) {
                                try {
                                    int i10 = inputStreamByteStream.read(bArr);
                                    if (i10 == -1) {
                                        break;
                                    } else {
                                        inspectorNetworkRequestListener.onData(new String(bArr, 0, i10, C1385d.f8858b));
                                    }
                                } finally {
                                }
                            }
                            C2735B c2735b = C2735B.f28704a;
                            AbstractC3376c.a(inputStreamByteStream, null);
                        }
                        inspectorNetworkRequestListener.onCompletion();
                        C2735B c2735b2 = C2735B.f28704a;
                        AbstractC3376c.a(eD, null);
                    } catch (IOException e10) {
                        listener.onError(e10.getMessage());
                    }
                }
            });
        } catch (IllegalArgumentException unused) {
            listener.onError("Not a valid URL: " + url);
        }
    }
}
