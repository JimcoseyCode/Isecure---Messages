package androidx.core.app;

import android.app.RemoteInput;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f16415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CharSequence f16416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CharSequence[] f16417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f16418d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f16419e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Bundle f16420f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Set f16421g;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class a {
        static void a(Object obj, Intent intent, Bundle bundle) {
            RemoteInput.addResultsToIntent((RemoteInput[]) obj, intent, bundle);
        }

        public static RemoteInput b(t tVar) {
            Set setF;
            RemoteInput.Builder builderAddExtras = new RemoteInput.Builder(tVar.n()).setLabel(tVar.m()).setChoices(tVar.g()).setAllowFreeFormInput(tVar.e()).addExtras(tVar.l());
            if (Build.VERSION.SDK_INT >= 26 && (setF = tVar.f()) != null) {
                Iterator it = setF.iterator();
                while (it.hasNext()) {
                    b.c(builderAddExtras, (String) it.next(), true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                d.a(builderAddExtras, tVar.j());
            }
            return builderAddExtras.build();
        }

        static Bundle c(Intent intent) {
            return RemoteInput.getResultsFromIntent(intent);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class b {
        static void a(t tVar, Intent intent, Map map) {
            RemoteInput.addDataResultToIntent(t.c(tVar), intent, map);
        }

        static Map b(Intent intent, String str) {
            return RemoteInput.getDataResultsFromIntent(intent, str);
        }

        static RemoteInput.Builder c(RemoteInput.Builder builder, String str, boolean z10) {
            return builder.setAllowDataType(str, z10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class c {
        static int a(Intent intent) {
            return RemoteInput.getResultsSource(intent);
        }

        static void b(Intent intent, int i10) {
            RemoteInput.setResultsSource(intent, i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class d {
        static RemoteInput.Builder a(RemoteInput.Builder builder, int i10) {
            return builder.setEditChoicesBeforeSending(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f16422a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private CharSequence f16425d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private CharSequence[] f16426e;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Set f16423b = new HashSet();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Bundle f16424c = new Bundle();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f16427f = true;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f16428g = 0;

        public e(String str) {
            if (str == null) {
                throw new IllegalArgumentException("Result key can't be null");
            }
            this.f16422a = str;
        }

        public t a() {
            return new t(this.f16422a, this.f16425d, this.f16426e, this.f16427f, this.f16428g, this.f16424c, this.f16423b);
        }

        public e b(CharSequence charSequence) {
            this.f16425d = charSequence;
            return this;
        }
    }

    t(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z10, int i10, Bundle bundle, Set set) {
        this.f16415a = str;
        this.f16416b = charSequence;
        this.f16417c = charSequenceArr;
        this.f16418d = z10;
        this.f16419e = i10;
        this.f16420f = bundle;
        this.f16421g = set;
        if (j() == 2 && !e()) {
            throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }

    public static void a(t tVar, Intent intent, Map map) {
        if (Build.VERSION.SDK_INT >= 26) {
            b.a(tVar, intent, map);
            return;
        }
        Intent intentH = h(intent);
        if (intentH == null) {
            intentH = new Intent();
        }
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Uri uri = (Uri) entry.getValue();
            if (str != null) {
                Bundle bundleExtra = intentH.getBundleExtra(k(str));
                if (bundleExtra == null) {
                    bundleExtra = new Bundle();
                }
                bundleExtra.putString(tVar.n(), uri.toString());
                intentH.putExtra(k(str), bundleExtra);
            }
        }
        intent.setClipData(ClipData.newIntent("android.remoteinput.results", intentH));
    }

    public static void b(t[] tVarArr, Intent intent, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 26) {
            a.a(d(tVarArr), intent, bundle);
            return;
        }
        Bundle bundleO = o(intent);
        int iP = p(intent);
        if (bundleO != null) {
            bundleO.putAll(bundle);
            bundle = bundleO;
        }
        for (t tVar : tVarArr) {
            Map mapI = i(intent, tVar.n());
            a.a(d(new t[]{tVar}), intent, bundle);
            if (mapI != null) {
                a(tVar, intent, mapI);
            }
        }
        r(intent, iP);
    }

    static RemoteInput c(t tVar) {
        return a.b(tVar);
    }

    static RemoteInput[] d(t[] tVarArr) {
        if (tVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[tVarArr.length];
        for (int i10 = 0; i10 < tVarArr.length; i10++) {
            remoteInputArr[i10] = c(tVarArr[i10]);
        }
        return remoteInputArr;
    }

    private static Intent h(Intent intent) {
        ClipData clipData = intent.getClipData();
        if (clipData == null) {
            return null;
        }
        ClipDescription description = clipData.getDescription();
        if (description.hasMimeType("text/vnd.android.intent") && description.getLabel().toString().contentEquals("android.remoteinput.results")) {
            return clipData.getItemAt(0).getIntent();
        }
        return null;
    }

    public static Map i(Intent intent, String str) {
        String string;
        if (Build.VERSION.SDK_INT >= 26) {
            return b.b(intent, str);
        }
        Intent intentH = h(intent);
        if (intentH == null) {
            return null;
        }
        HashMap map = new HashMap();
        for (String str2 : intentH.getExtras().keySet()) {
            if (str2.startsWith("android.remoteinput.dataTypeResultsData")) {
                String strSubstring = str2.substring(39);
                if (!strSubstring.isEmpty() && (string = intentH.getBundleExtra(str2).getString(str)) != null && !string.isEmpty()) {
                    map.put(strSubstring, Uri.parse(string));
                }
            }
        }
        if (map.isEmpty()) {
            return null;
        }
        return map;
    }

    private static String k(String str) {
        return "android.remoteinput.dataTypeResultsData" + str;
    }

    public static Bundle o(Intent intent) {
        return a.c(intent);
    }

    public static int p(Intent intent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return c.a(intent);
        }
        Intent intentH = h(intent);
        if (intentH == null) {
            return 0;
        }
        return intentH.getExtras().getInt("android.remoteinput.resultsSource", 0);
    }

    public static void r(Intent intent, int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            c.b(intent, i10);
            return;
        }
        Intent intentH = h(intent);
        if (intentH == null) {
            intentH = new Intent();
        }
        intentH.putExtra("android.remoteinput.resultsSource", i10);
        intent.setClipData(ClipData.newIntent("android.remoteinput.results", intentH));
    }

    public boolean e() {
        return this.f16418d;
    }

    public Set f() {
        return this.f16421g;
    }

    public CharSequence[] g() {
        return this.f16417c;
    }

    public int j() {
        return this.f16419e;
    }

    public Bundle l() {
        return this.f16420f;
    }

    public CharSequence m() {
        return this.f16416b;
    }

    public String n() {
        return this.f16415a;
    }

    public boolean q() {
        if (e()) {
            return false;
        }
        return ((g() != null && g().length != 0) || f() == null || f().isEmpty()) ? false : true;
    }
}
