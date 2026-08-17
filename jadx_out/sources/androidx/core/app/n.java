package androidx.core.app;

import android.os.Bundle;
import androidx.core.app.l;
import androidx.core.graphics.drawable.IconCompat;
import com.facebook.react.modules.dialog.AlertFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f16388a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f16389b = new Object();

    static Bundle a(l.a aVar) {
        Bundle bundle = new Bundle();
        IconCompat iconCompatD = aVar.d();
        bundle.putInt("icon", iconCompatD != null ? iconCompatD.e() : 0);
        bundle.putCharSequence(AlertFragment.ARG_TITLE, aVar.h());
        bundle.putParcelable("actionIntent", aVar.a());
        Bundle bundle2 = aVar.c() != null ? new Bundle(aVar.c()) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray("remoteInputs", c(aVar.e()));
        bundle.putBoolean("showsUserInterface", aVar.g());
        bundle.putInt("semanticAction", aVar.f());
        return bundle;
    }

    private static Bundle b(t tVar) {
        Bundle bundle = new Bundle();
        bundle.putString("resultKey", tVar.n());
        bundle.putCharSequence("label", tVar.m());
        bundle.putCharSequenceArray("choices", tVar.g());
        bundle.putBoolean("allowFreeFormInput", tVar.e());
        bundle.putBundle("extras", tVar.l());
        Set setF = tVar.f();
        if (setF != null && !setF.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<>(setF.size());
            Iterator it = setF.iterator();
            while (it.hasNext()) {
                arrayList.add((String) it.next());
            }
            bundle.putStringArrayList("allowedDataTypes", arrayList);
        }
        return bundle;
    }

    private static Bundle[] c(t[] tVarArr) {
        if (tVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[tVarArr.length];
        for (int i10 = 0; i10 < tVarArr.length; i10++) {
            bundleArr[i10] = b(tVarArr[i10]);
        }
        return bundleArr;
    }
}
