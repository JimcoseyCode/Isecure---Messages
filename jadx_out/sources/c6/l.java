package c6;

import H4.AbstractC0784f;
import H4.AbstractC0787i;
import H4.C0786h;
import P4.AbstractC1381o;
import P4.InterfaceC1373g;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import r4.AbstractC3268i;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class l {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final AbstractC0787i f18860A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private static final AbstractC0787i f18861B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Feature[] f18862a = new Feature[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Feature f18863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Feature f18864c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Feature f18865d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Feature f18866e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Feature f18867f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Feature f18868g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Feature f18869h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Feature f18870i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Feature f18871j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Feature f18872k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Feature f18873l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Feature f18874m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Feature f18875n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Feature f18876o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Feature f18877p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Feature f18878q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Feature f18879r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Feature f18880s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Feature f18881t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Feature f18882u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Feature f18883v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Feature f18884w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Feature f18885x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final Feature f18886y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final Feature f18887z;

    static {
        Feature feature = new Feature("vision.barcode", 1L);
        f18863b = feature;
        Feature feature2 = new Feature("vision.custom.ica", 1L);
        f18864c = feature2;
        Feature feature3 = new Feature("vision.face", 1L);
        f18865d = feature3;
        Feature feature4 = new Feature("vision.ica", 1L);
        f18866e = feature4;
        Feature feature5 = new Feature("vision.ocr", 1L);
        f18867f = feature5;
        f18868g = new Feature("mlkit.ocr.chinese", 1L);
        f18869h = new Feature("mlkit.ocr.common", 1L);
        f18870i = new Feature("mlkit.ocr.devanagari", 1L);
        f18871j = new Feature("mlkit.ocr.japanese", 1L);
        f18872k = new Feature("mlkit.ocr.korean", 1L);
        Feature feature6 = new Feature("mlkit.langid", 1L);
        f18873l = feature6;
        Feature feature7 = new Feature("mlkit.nlclassifier", 1L);
        f18874m = feature7;
        Feature feature8 = new Feature("tflite_dynamite", 1L);
        f18875n = feature8;
        Feature feature9 = new Feature("mlkit.barcode.ui", 1L);
        f18876o = feature9;
        Feature feature10 = new Feature("mlkit.smartreply", 1L);
        f18877p = feature10;
        f18878q = new Feature("mlkit.image.caption", 1L);
        f18879r = new Feature("mlkit.docscan.detect", 1L);
        f18880s = new Feature("mlkit.docscan.crop", 1L);
        f18881t = new Feature("mlkit.docscan.enhance", 1L);
        f18882u = new Feature("mlkit.docscan.ui", 1L);
        f18883v = new Feature("mlkit.docscan.stain", 1L);
        f18884w = new Feature("mlkit.docscan.shadow", 1L);
        f18885x = new Feature("mlkit.quality.aesthetic", 1L);
        f18886y = new Feature("mlkit.quality.technical", 1L);
        f18887z = new Feature("mlkit.segmentation.subject", 1L);
        C0786h c0786h = new C0786h();
        c0786h.a("barcode", feature);
        c0786h.a("custom_ica", feature2);
        c0786h.a("face", feature3);
        c0786h.a("ica", feature4);
        c0786h.a("ocr", feature5);
        c0786h.a("langid", feature6);
        c0786h.a("nlclassifier", feature7);
        c0786h.a("tflite_dynamite", feature8);
        c0786h.a("barcode_ui", feature9);
        c0786h.a("smart_reply", feature10);
        f18860A = c0786h.b();
        C0786h c0786h2 = new C0786h();
        c0786h2.a("com.google.android.gms.vision.barcode", feature);
        c0786h2.a("com.google.android.gms.vision.custom.ica", feature2);
        c0786h2.a("com.google.android.gms.vision.face", feature3);
        c0786h2.a("com.google.android.gms.vision.ica", feature4);
        c0786h2.a("com.google.android.gms.vision.ocr", feature5);
        c0786h2.a("com.google.android.gms.mlkit.langid", feature6);
        c0786h2.a("com.google.android.gms.mlkit.nlclassifier", feature7);
        c0786h2.a("com.google.android.gms.tflite_dynamite", feature8);
        c0786h2.a("com.google.android.gms.mlkit_smartreply", feature10);
        f18861B = c0786h2.b();
    }

    public static boolean a(Context context, List list) throws Throwable {
        if (com.google.android.gms.common.b.f().a(context) >= 221500000) {
            return b(context, f(f18861B, list));
        }
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                DynamiteModule.d(context, DynamiteModule.f21390b, (String) it.next());
            }
            return true;
        } catch (DynamiteModule.a unused) {
            return false;
        }
    }

    public static boolean b(Context context, final Feature[] featureArr) {
        try {
            return ((ModuleAvailabilityResponse) AbstractC1381o.a(u4.b.a(context).b(new o4.g() { // from class: c6.C
                @Override // o4.g
                public final Feature[] d() {
                    Feature[] featureArr2 = l.f18862a;
                    return featureArr;
                }
            }).e(new InterfaceC1373g() { // from class: c6.D
                @Override // P4.InterfaceC1373g
                public final void onFailure(Exception exc) {
                }
            }))).e();
        } catch (InterruptedException | ExecutionException unused) {
            return false;
        }
    }

    public static void c(Context context, String str) {
        d(context, AbstractC0784f.t(str));
    }

    public static void d(Context context, List list) {
        if (com.google.android.gms.common.b.f().a(context) >= 221500000) {
            e(context, f(f18860A, list));
            return;
        }
        Intent intent = new Intent();
        intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
        intent.setAction("com.google.android.gms.vision.DEPENDENCY");
        intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", TextUtils.join(",", list));
        intent.putExtra("requester_app_package", context.getApplicationInfo().packageName);
        context.sendBroadcast(intent);
    }

    public static void e(Context context, final Feature[] featureArr) {
        u4.b.a(context).c(u4.d.d().a(new o4.g() { // from class: c6.A
            @Override // o4.g
            public final Feature[] d() {
                Feature[] featureArr2 = l.f18862a;
                return featureArr;
            }
        }).b()).e(new InterfaceC1373g() { // from class: c6.B
            @Override // P4.InterfaceC1373g
            public final void onFailure(Exception exc) {
            }
        });
    }

    private static Feature[] f(Map map, List list) {
        Feature[] featureArr = new Feature[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            featureArr[i10] = (Feature) AbstractC3268i.k((Feature) map.get(list.get(i10)));
        }
        return featureArr;
    }
}
