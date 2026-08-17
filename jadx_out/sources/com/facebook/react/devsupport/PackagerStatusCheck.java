package com.facebook.react.devsupport;

import com.facebook.react.common.ReactConstants;
import com.facebook.react.devsupport.inspector.DevSupportHttpClient;
import com.facebook.react.devsupport.interfaces.PackagerStatusCallback;
import com.facebook.react.uimanager.events.PointerEventHelper;
import d2.AbstractC2325a;
import e9.B;
import e9.InterfaceC2437e;
import e9.InterfaceC2438f;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/facebook/react/devsupport/PackagerStatusCheck;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Le9/z;", "client", "<init>", "(Le9/z;)V", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "host", "Lcom/facebook/react/devsupport/interfaces/PackagerStatusCallback;", "callback", "Li7/B;", "run", "(Ljava/lang/String;Lcom/facebook/react/devsupport/interfaces/PackagerStatusCallback;)V", "Le9/z;", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PackagerStatusCheck {
    private static final Companion Companion = new Companion(null);
    private static final String PACKAGER_OK_STATUS = "packager-status:running";
    private static final String PACKAGER_STATUS_URL_TEMPLATE = "%s://%s/status";
    private final e9.z client;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/facebook/react/devsupport/PackagerStatusCheck$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "PACKAGER_OK_STATUS", PointerEventHelper.POINTER_TYPE_UNKNOWN, "PACKAGER_STATUS_URL_TEMPLATE", "createPackagerStatusURL", "host", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String createPackagerStatusURL(String host) {
            kotlin.jvm.internal.H h10 = kotlin.jvm.internal.H.f29375a;
            String str = String.format(Locale.US, PackagerStatusCheck.PACKAGER_STATUS_URL_TEMPLATE, Arrays.copyOf(new Object[]{DevSupportHttpClient.INSTANCE.httpScheme$ReactAndroid_release(host), host}, 2));
            AbstractC2855l.f(str, "format(...)");
            return str;
        }

        private Companion() {
        }
    }

    public PackagerStatusCheck(e9.z client) {
        AbstractC2855l.g(client, "client");
        this.client = client;
    }

    public final void run(String host, final PackagerStatusCallback callback) {
        AbstractC2855l.g(host, "host");
        AbstractC2855l.g(callback, "callback");
        this.client.a(new B.a().m(Companion.createPackagerStatusURL(host)).b()).t0(new InterfaceC2438f() { // from class: com.facebook.react.devsupport.PackagerStatusCheck.run.1
            @Override // e9.InterfaceC2438f
            public void onFailure(InterfaceC2437e call, IOException e10) {
                AbstractC2855l.g(call, "call");
                AbstractC2855l.g(e10, "e");
                AbstractC2325a.I(ReactConstants.TAG, "The packager does not seem to be running as we got an IOException requesting its status: " + e10.getMessage());
                callback.onPackagerStatusFetched(false);
            }

            @Override // e9.InterfaceC2438f
            public void onResponse(InterfaceC2437e call, e9.D response) throws IOException {
                AbstractC2855l.g(call, "call");
                AbstractC2855l.g(response, "response");
                if (!response.k0()) {
                    AbstractC2325a.m(ReactConstants.TAG, "Got non-success http code from packager when requesting status: " + response.e());
                    callback.onPackagerStatusFetched(false);
                    return;
                }
                e9.E eD = response.d();
                if (eD == null) {
                    AbstractC2325a.m(ReactConstants.TAG, "Got null body response from packager when requesting status");
                    callback.onPackagerStatusFetched(false);
                    return;
                }
                String strString = eD.string();
                if (AbstractC2855l.b(PackagerStatusCheck.PACKAGER_OK_STATUS, strString)) {
                    callback.onPackagerStatusFetched(true);
                    return;
                }
                AbstractC2325a.m(ReactConstants.TAG, "Got unexpected response from packager when requesting status: " + strString);
                callback.onPackagerStatusFetched(false);
            }
        });
    }

    public PackagerStatusCheck() {
        this(DevSupportHttpClient.INSTANCE.getHttpClient$ReactAndroid_release());
    }
}
