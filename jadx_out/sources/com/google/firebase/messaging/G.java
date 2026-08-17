package com.google.firebase.messaging;

import A5.j;
import P4.AbstractC1378l;
import P4.AbstractC1381o;
import P4.InterfaceC1369c;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import expo.modules.interfaces.permissions.PermissionsResponse;
import f1.ExecutorC2595b;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import n5.C2970e;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2970e f24141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final L f24142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.cloudmessaging.a f24143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C5.b f24144d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C5.b f24145e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final D5.e f24146f;

    G(C2970e c2970e, L l10, C5.b bVar, C5.b bVar2, D5.e eVar) {
        this(c2970e, l10, new com.google.android.gms.cloudmessaging.a(c2970e.j()), bVar, bVar2, eVar);
    }

    public static /* synthetic */ String a(G g10, AbstractC1378l abstractC1378l) {
        g10.getClass();
        return g10.h((Bundle) abstractC1378l.m(IOException.class));
    }

    private static String b(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    private AbstractC1378l d(AbstractC1378l abstractC1378l) {
        return abstractC1378l.i(new ExecutorC2595b(), new InterfaceC1369c() { // from class: com.google.firebase.messaging.F
            @Override // P4.InterfaceC1369c
            public final Object a(AbstractC1378l abstractC1378l2) {
                return G.a(this.f24120a, abstractC1378l2);
            }
        });
    }

    private String e() {
        try {
            return b(MessageDigest.getInstance("SHA-1").digest(this.f24141a.l().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    private String h(Bundle bundle) throws IOException {
        if (bundle == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String string = bundle.getString("registration_id");
        if (string != null) {
            return string;
        }
        String string2 = bundle.getString("unregistered");
        if (string2 != null) {
            return string2;
        }
        String string3 = bundle.getString("error");
        if ("RST".equals(string3)) {
            throw new IOException("INSTANCE_ID_RESET");
        }
        if (string3 != null) {
            throw new IOException(string3);
        }
        bundle.toString();
        new Throwable();
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    static boolean i(String str) {
        return "SERVICE_NOT_AVAILABLE".equals(str) || "INTERNAL_SERVER_ERROR".equals(str) || "InternalServerError".equals(str);
    }

    private void j(String str, String str2, Bundle bundle) {
        j.a aVarB;
        bundle.putString(PermissionsResponse.SCOPE_KEY, str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        bundle.putString("gmp_app_id", this.f24141a.m().c());
        bundle.putString("gmsv", Integer.toString(this.f24142b.d()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f24142b.a());
        bundle.putString("app_ver_name", this.f24142b.b());
        bundle.putString("firebase-app-name-hash", e());
        try {
            String strB = ((com.google.firebase.installations.g) AbstractC1381o.a(this.f24146f.a(false))).b();
            if (!TextUtils.isEmpty(strB)) {
                bundle.putString("Goog-Firebase-Installations-Auth", strB);
            }
        } catch (InterruptedException | ExecutionException unused) {
        }
        bundle.putString("appid", (String) AbstractC1381o.a(this.f24146f.getId()));
        bundle.putString("cliv", "fcm-25.0.1");
        A5.j jVar = (A5.j) this.f24145e.get();
        K5.i iVar = (K5.i) this.f24144d.get();
        if (jVar == null || iVar == null || (aVarB = jVar.b("fire-iid")) == j.a.NONE) {
            return;
        }
        bundle.putString("Firebase-Client-Log-Type", Integer.toString(aVarB.j()));
        bundle.putString("Firebase-Client", iVar.a());
    }

    private AbstractC1378l l(String str, String str2, Bundle bundle) {
        try {
            j(str, str2, bundle);
            return this.f24143c.c(bundle);
        } catch (InterruptedException | ExecutionException e10) {
            return AbstractC1381o.e(e10);
        }
    }

    AbstractC1378l c() {
        Bundle bundle = new Bundle();
        bundle.putString("delete", "1");
        return d(l(L.c(this.f24141a), "*", bundle));
    }

    AbstractC1378l f() {
        return this.f24143c.a();
    }

    AbstractC1378l g() {
        return d(l(L.c(this.f24141a), "*", new Bundle()));
    }

    AbstractC1378l k(boolean z10) {
        return this.f24143c.d(z10);
    }

    AbstractC1378l m(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        return d(l(str, "/topics/" + str2, bundle));
    }

    AbstractC1378l n(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        bundle.putString("delete", "1");
        return d(l(str, "/topics/" + str2, bundle));
    }

    G(C2970e c2970e, L l10, com.google.android.gms.cloudmessaging.a aVar, C5.b bVar, C5.b bVar2, D5.e eVar) {
        this.f24141a = c2970e;
        this.f24142b = l10;
        this.f24143c = aVar;
        this.f24144d = bVar;
        this.f24145e = bVar2;
        this.f24146f = eVar;
    }
}
