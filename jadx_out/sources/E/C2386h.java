package e;

import android.content.Context;
import android.content.Intent;
import e.AbstractC2379a;
import i7.t;
import j7.AbstractC2793j;
import j7.AbstractC2800q;
import j7.K;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: e.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C2386h extends AbstractC2379a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f25810a = new a(null);

    /* JADX INFO: renamed from: e.h$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Intent a(String[] input) {
            AbstractC2855l.g(input, "input");
            Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", input);
            AbstractC2855l.f(intentPutExtra, "putExtra(...)");
            return intentPutExtra;
        }

        private a() {
        }
    }

    @Override // e.AbstractC2379a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, String[] input) {
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(input, "input");
        return f25810a.a(input);
    }

    @Override // e.AbstractC2379a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public AbstractC2379a.C0253a b(Context context, String[] input) {
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(input, "input");
        if (input.length == 0) {
            return new AbstractC2379a.C0253a(K.i());
        }
        for (String str : input) {
            if (androidx.core.content.a.a(context, str) != 0) {
                return null;
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(B7.d.d(K.e(input.length), 16));
        for (String str2 : input) {
            Pair pairA = t.a(str2, Boolean.TRUE);
            linkedHashMap.put(pairA.c(), pairA.d());
        }
        return new AbstractC2379a.C0253a(linkedHashMap);
    }

    @Override // e.AbstractC2379a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Map c(int i10, Intent intent) {
        if (i10 != -1) {
            return K.i();
        }
        if (intent == null) {
            return K.i();
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return K.i();
        }
        ArrayList arrayList = new ArrayList(intArrayExtra.length);
        for (int i11 : intArrayExtra) {
            arrayList.add(Boolean.valueOf(i11 == 0));
        }
        return K.r(AbstractC2800q.X0(AbstractC2793j.D(stringArrayExtra), arrayList));
    }
}
