package com.canhub.cropper;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.provider.MediaStore;
import androidx.activity.AbstractActivityC1618q;
import androidx.activity.result.ActivityResult;
import d.AbstractC2314b;
import d.InterfaceC2313a;
import e.C2387i;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f19624g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractActivityC1618q f19625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f19626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f19627c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List f19628d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Uri f19629e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AbstractC2314b f19630f;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface b {
        void a(Uri uri);

        void b();
    }

    public q(AbstractActivityC1618q activity, b callback) {
        AbstractC2855l.g(activity, "activity");
        AbstractC2855l.g(callback, "callback");
        this.f19625a = activity;
        this.f19626b = callback;
        String string = activity.getString(A.f19295b);
        AbstractC2855l.f(string, "getString(...)");
        this.f19627c = string;
        this.f19628d = AbstractC2800q.m("com.google.android.apps.photos", "com.google.android.apps.photosgo", "com.sec.android.gallery3d", "com.oneplus.gallery", "com.miui.gallery");
        this.f19630f = activity.registerForActivityResult(new C2387i(), new InterfaceC2313a() { // from class: com.canhub.cropper.p
            @Override // d.InterfaceC2313a
            public final void onActivityResult(Object obj) {
                q.e(this.f19623a, (ActivityResult) obj);
            }
        });
    }

    private final List b(Context context, PackageManager packageManager) {
        ArrayList arrayList = new ArrayList();
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        List<ResolveInfo> listQueryIntentActivities = Build.VERSION.SDK_INT >= 33 ? packageManager.queryIntentActivities(intent, PackageManager.ResolveInfoFlags.of(0)) : packageManager.queryIntentActivities(intent, 0);
        AbstractC2855l.d(listQueryIntentActivities);
        for (ResolveInfo resolveInfo : listQueryIntentActivities) {
            Intent intent2 = new Intent(intent);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
            intent2.setPackage(resolveInfo.activityInfo.packageName);
            if (context instanceof Activity) {
                ((Activity) context).grantUriPermission(resolveInfo.activityInfo.packageName, this.f19629e, 3);
            }
            intent2.putExtra("output", this.f19629e);
            arrayList.add(intent2);
        }
        return arrayList;
    }

    private final List c(PackageManager packageManager, String str) {
        Object next;
        ArrayList arrayList = new ArrayList();
        Intent intent = AbstractC2855l.b(str, "android.intent.action.GET_CONTENT") ? new Intent(str) : new Intent(str, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        intent.setType("image/*");
        List<ResolveInfo> listQueryIntentActivities = Build.VERSION.SDK_INT >= 33 ? packageManager.queryIntentActivities(intent, PackageManager.ResolveInfoFlags.of(0)) : packageManager.queryIntentActivities(intent, 0);
        AbstractC2855l.d(listQueryIntentActivities);
        for (ResolveInfo resolveInfo : listQueryIntentActivities) {
            Intent intent2 = new Intent(intent);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
            intent2.setPackage(resolveInfo.activityInfo.packageName);
            arrayList.add(intent2);
        }
        ArrayList arrayList2 = new ArrayList();
        for (String str2 : this.f19628d) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (AbstractC2855l.b(((Intent) next).getPackage(), str2)) {
                    break;
                }
            }
            Intent intent3 = (Intent) next;
            if (intent3 != null) {
                arrayList.remove(intent3);
                arrayList2.add(intent3);
            }
        }
        arrayList.addAll(0, arrayList2);
        return arrayList;
    }

    private final boolean d(Context context) {
        String packageName = context.getPackageName();
        try {
            String[] strArr = (Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().getPackageInfo(packageName, PackageManager.PackageInfoFlags.of(4096)) : context.getPackageManager().getPackageInfo(packageName, 4096)).requestedPermissions;
            if (strArr != null) {
                for (String str : strArr) {
                    if (str != null && P8.q.x(str, "android.permission.CAMERA", true)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(q this$0, ActivityResult activityRes) {
        Uri data;
        AbstractC2855l.g(this$0, "this$0");
        AbstractC2855l.g(activityRes, "activityRes");
        if (activityRes.getResultCode() != -1) {
            this$0.f19626b.b();
            return;
        }
        Intent data2 = activityRes.getData();
        if (data2 == null || (data = data2.getData()) == null) {
            data = this$0.f19629e;
        }
        this$0.f19626b.a(data);
    }

    private final boolean f(Context context) {
        return d(context) && context.checkSelfPermission("android.permission.CAMERA") != 0;
    }

    public final q g(String title) {
        AbstractC2855l.g(title, "title");
        this.f19627c = title;
        return this;
    }

    public final q h(List appsList) {
        AbstractC2855l.g(appsList, "appsList");
        this.f19628d = appsList;
        return this;
    }

    public final void i(boolean z10, boolean z11, Uri uri) {
        Intent intent;
        this.f19629e = uri;
        ArrayList arrayList = new ArrayList();
        PackageManager packageManager = this.f19625a.getPackageManager();
        if (!f(this.f19625a) && z10) {
            AbstractActivityC1618q abstractActivityC1618q = this.f19625a;
            AbstractC2855l.d(packageManager);
            arrayList.addAll(b(abstractActivityC1618q, packageManager));
        }
        if (z11) {
            AbstractC2855l.d(packageManager);
            List listC = c(packageManager, "android.intent.action.GET_CONTENT");
            if (listC.isEmpty()) {
                listC = c(packageManager, "android.intent.action.PICK");
            }
            arrayList.addAll(listC);
        }
        if (arrayList.isEmpty()) {
            intent = new Intent();
        } else {
            Intent intent2 = new Intent("android.intent.action.CHOOSER", MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
            if (z11) {
                intent2.setAction("android.intent.action.PICK");
                intent2.setType("image/*");
            }
            intent = intent2;
        }
        Intent intentCreateChooser = Intent.createChooser(intent, this.f19627c);
        intentCreateChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[0]));
        AbstractC2314b abstractC2314b = this.f19630f;
        AbstractC2855l.d(intentCreateChooser);
        abstractC2314b.a(intentCreateChooser);
    }
}
