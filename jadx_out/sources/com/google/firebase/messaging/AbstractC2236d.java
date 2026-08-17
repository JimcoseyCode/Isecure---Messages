package com.google.firebase.messaging;

import android.R;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.app.l;
import com.facebook.hermes.intl.Constants;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.google.firebase.messaging.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2236d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicInteger f24238a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* JADX INFO: renamed from: com.google.firebase.messaging.d$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l.e f24239a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f24240b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f24241c;

        a(l.e eVar, String str, int i10) {
            this.f24239a = eVar;
            this.f24240b = str;
            this.f24241c = i10;
        }
    }

    private static PendingIntent a(Context context, M m10, String str, PackageManager packageManager) {
        Intent intentF = f(str, m10, packageManager);
        if (intentF == null) {
            return null;
        }
        intentF.addFlags(67108864);
        intentF.putExtras(m10.y());
        if (q(m10)) {
            intentF.putExtra("gcm.n.analytics_data", m10.x());
        }
        return PendingIntent.getActivity(context, g(), intentF, l(1073741824));
    }

    private static PendingIntent b(Context context, Context context2, M m10) {
        if (q(m10)) {
            return c(context, context2, new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(m10.x()));
        }
        return null;
    }

    private static PendingIntent c(Context context, Context context2, Intent intent) {
        return PendingIntent.getBroadcast(context, g(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(context2.getPackageName()).putExtra("wrapped_intent", intent), l(1073741824));
    }

    public static a d(Context context, Context context2, M m10, String str, Bundle bundle) {
        String packageName = context2.getPackageName();
        Resources resources = context2.getResources();
        PackageManager packageManager = context2.getPackageManager();
        l.e eVar = new l.e(context2, str);
        String strN = m10.n(resources, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(strN)) {
            eVar.l(strN);
        }
        String strN2 = m10.n(resources, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(strN2)) {
            eVar.k(strN2);
            eVar.A(new l.c().h(strN2));
        }
        eVar.y(m(packageManager, resources, packageName, m10.p("gcm.n.icon"), bundle));
        Uri uriN = n(packageName, m10, resources);
        if (uriN != null) {
            eVar.z(uriN);
        }
        eVar.j(a(context, m10, packageName, packageManager));
        PendingIntent pendingIntentB = b(context, context2, m10);
        if (pendingIntentB != null) {
            eVar.n(pendingIntentB);
        }
        Integer numH = h(context2, m10.p("gcm.n.color"), bundle);
        if (numH != null) {
            eVar.i(numH.intValue());
        }
        eVar.g(!m10.a("gcm.n.sticky"));
        eVar.s(m10.a("gcm.n.local_only"));
        String strP = m10.p("gcm.n.ticker");
        if (strP != null) {
            eVar.C(strP);
        }
        Integer numM = m10.m();
        if (numM != null) {
            eVar.v(numM.intValue());
        }
        Integer numR = m10.r();
        if (numR != null) {
            eVar.E(numR.intValue());
        }
        Integer numL = m10.l();
        if (numL != null) {
            eVar.t(numL.intValue());
        }
        Long lJ = m10.j("gcm.n.event_time");
        if (lJ != null) {
            eVar.w(true);
            eVar.F(lJ.longValue());
        }
        long[] jArrQ = m10.q();
        if (jArrQ != null) {
            eVar.D(jArrQ);
        }
        int[] iArrE = m10.e();
        if (iArrE != null) {
            eVar.r(iArrE[0], iArrE[1], iArrE[2]);
        }
        eVar.m(i(m10));
        return new a(eVar, o(m10), 0);
    }

    static a e(Context context, M m10) {
        Bundle bundleJ = j(context.getPackageManager(), context.getPackageName());
        return d(context, context, m10, k(context, m10.k(), bundleJ), bundleJ);
    }

    private static Intent f(String str, M m10, PackageManager packageManager) {
        String strP = m10.p("gcm.n.click_action");
        if (!TextUtils.isEmpty(strP)) {
            Intent intent = new Intent(strP);
            intent.setPackage(str);
            intent.setFlags(268435456);
            return intent;
        }
        Uri uriF = m10.f();
        if (uriF == null) {
            return packageManager.getLaunchIntentForPackage(str);
        }
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setPackage(str);
        intent2.setData(uriF);
        return intent2;
    }

    private static int g() {
        return f24238a.incrementAndGet();
    }

    private static Integer h(Context context, String str, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
            }
        }
        int i10 = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i10 == 0) {
            return null;
        }
        try {
            return Integer.valueOf(androidx.core.content.a.c(context, i10));
        } catch (Resources.NotFoundException unused2) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    private static int i(M m10) {
        boolean zA = m10.a("gcm.n.default_sound");
        ?? r02 = zA;
        if (m10.a("gcm.n.default_vibrate_timings")) {
            r02 = (zA ? 1 : 0) | 2;
        }
        return m10.a("gcm.n.default_light_settings") ? r02 | 4 : r02;
    }

    private static Bundle j(PackageManager packageManager, String str) {
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
            if (applicationInfo != null) {
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    return bundle;
                }
            }
        } catch (PackageManager.NameNotFoundException e10) {
            e10.toString();
        }
        return Bundle.EMPTY;
    }

    public static String k(Context context, String str, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion < 26) {
                return null;
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (!TextUtils.isEmpty(str) && notificationManager.getNotificationChannel(str) != null) {
                return str;
            }
            String string = bundle.getString("com.google.firebase.messaging.default_notification_channel_id");
            if (!TextUtils.isEmpty(string) && notificationManager.getNotificationChannel(string) != null) {
                return string;
            }
            if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                int identifier = context.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", context.getPackageName());
                notificationManager.createNotificationChannel(n4.f.a("fcm_fallback_notification_channel", identifier == 0 ? "Misc" : context.getString(identifier), 3));
            }
            return "fcm_fallback_notification_channel";
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private static int l(int i10) {
        return i10 | 67108864;
    }

    private static int m(PackageManager packageManager, Resources resources, String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str2)) {
            int identifier = resources.getIdentifier(str2, "drawable", str);
            if (identifier != 0 && p(resources, identifier)) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str2, "mipmap", str);
            if (identifier2 != 0 && p(resources, identifier2)) {
                return identifier2;
            }
        }
        int i10 = bundle.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i10 == 0 || !p(resources, i10)) {
            try {
                i10 = packageManager.getApplicationInfo(str, 0).icon;
            } catch (PackageManager.NameNotFoundException e10) {
                e10.toString();
            }
        }
        return (i10 == 0 || !p(resources, i10)) ? R.drawable.sym_def_app_icon : i10;
    }

    private static Uri n(String str, M m10, Resources resources) {
        String strO = m10.o();
        if (TextUtils.isEmpty(strO)) {
            return null;
        }
        if (Constants.COLLATION_DEFAULT.equals(strO) || resources.getIdentifier(strO, "raw", str) == 0) {
            return RingtoneManager.getDefaultUri(2);
        }
        return Uri.parse("android.resource://" + str + "/raw/" + strO);
    }

    private static String o(M m10) {
        String strP = m10.p("gcm.n.tag");
        if (!TextUtils.isEmpty(strP)) {
            return strP;
        }
        return "FCM-Notification:" + SystemClock.uptimeMillis();
    }

    private static boolean p(Resources resources, int i10) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            return !AbstractC2235c.a(resources.getDrawable(i10, null));
        } catch (Resources.NotFoundException unused) {
            return false;
        }
    }

    static boolean q(M m10) {
        return m10.a("google.c.a.e");
    }
}
