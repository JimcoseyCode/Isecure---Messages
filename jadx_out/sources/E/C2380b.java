package e;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import e.AbstractC2379a;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: e.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C2380b extends AbstractC2379a {
    @Override // e.AbstractC2379a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, String input) {
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(input, "input");
        Intent type = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(input);
        AbstractC2855l.f(type, "setType(...)");
        return type;
    }

    @Override // e.AbstractC2379a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final AbstractC2379a.C0253a b(Context context, String input) {
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(input, "input");
        return null;
    }

    @Override // e.AbstractC2379a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Uri c(int i10, Intent intent) {
        if (i10 != -1) {
            intent = null;
        }
        if (intent != null) {
            return intent.getData();
        }
        return null;
    }
}
