package r4;

import android.content.Context;
import android.content.res.Resources;

/* JADX INFO: renamed from: r4.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C3270k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Resources f31933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f31934b;

    public C3270k(Context context) {
        AbstractC3268i.k(context);
        Resources resources = context.getResources();
        this.f31933a = resources;
        this.f31934b = resources.getResourcePackageName(n4.g.f30024a);
    }

    public String a(String str) {
        int identifier = this.f31933a.getIdentifier(str, "string", this.f31934b);
        if (identifier == 0) {
            return null;
        }
        return this.f31933a.getString(identifier);
    }
}
