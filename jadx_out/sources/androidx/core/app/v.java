package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class v implements Iterable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ArrayList f16429g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Context f16430h;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface a {
        Intent getSupportParentActivityIntent();
    }

    private v(Context context) {
        this.f16430h = context;
    }

    public static v q(Context context) {
        return new v(context);
    }

    public v d(Intent intent) {
        this.f16429g.add(intent);
        return this;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.f16429g.iterator();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public v o(Activity activity) {
        Intent supportParentActivityIntent = activity instanceof a ? ((a) activity).getSupportParentActivityIntent() : null;
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = j.a(activity);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(this.f16430h.getPackageManager());
            }
            p(component);
            d(supportParentActivityIntent);
        }
        return this;
    }

    public v p(ComponentName componentName) {
        int size = this.f16429g.size();
        try {
            Intent intentB = j.b(this.f16430h, componentName);
            while (intentB != null) {
                this.f16429g.add(size, intentB);
                intentB = j.b(this.f16430h, intentB.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public void r() {
        s(null);
    }

    public void s(Bundle bundle) {
        if (this.f16429g.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) this.f16429g.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (androidx.core.content.a.k(this.f16430h, intentArr, bundle)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        this.f16430h.startActivity(intent);
    }
}
