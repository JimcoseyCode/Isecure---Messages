package b9;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import c9.d;
import c9.e;
import c9.f;
import c9.g;
import c9.h;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import me.leolin.shortcutbadger.impl.AdwHomeBadger;
import me.leolin.shortcutbadger.impl.ApexHomeBadger;
import me.leolin.shortcutbadger.impl.DefaultBadger;
import me.leolin.shortcutbadger.impl.NewHtcHomeBadger;
import me.leolin.shortcutbadger.impl.NovaHomeBadger;
import me.leolin.shortcutbadger.impl.SonyHomeBadger;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List f18667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f18668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static a f18669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static ComponentName f18670d;

    static {
        LinkedList linkedList = new LinkedList();
        f18667a = linkedList;
        f18668b = new Object();
        linkedList.add(AdwHomeBadger.class);
        linkedList.add(ApexHomeBadger.class);
        linkedList.add(DefaultBadger.class);
        linkedList.add(NewHtcHomeBadger.class);
        linkedList.add(NovaHomeBadger.class);
        linkedList.add(SonyHomeBadger.class);
        linkedList.add(c9.a.class);
        linkedList.add(c9.c.class);
        linkedList.add(d.class);
        linkedList.add(e.class);
        linkedList.add(h.class);
        linkedList.add(f.class);
        linkedList.add(g.class);
        linkedList.add(c9.b.class);
    }

    public static void a(Context context, int i10) throws b {
        if (f18669c == null && !b(context)) {
            throw new b("No default launcher available");
        }
        try {
            f18669c.b(context, f18670d, i10);
        } catch (Exception e10) {
            throw new b("Unable to execute badge", e10);
        }
    }

    private static boolean b(Context context) {
        a aVar;
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage == null) {
            context.getPackageName();
            return false;
        }
        f18670d = launchIntentForPackage.getComponent();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(intent, 65536).iterator();
        while (it.hasNext()) {
            String str = it.next().activityInfo.packageName;
            Iterator it2 = f18667a.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                try {
                    aVar = (a) ((Class) it2.next()).newInstance();
                } catch (Exception unused) {
                    aVar = null;
                }
                if (aVar != null && aVar.a().contains(str)) {
                    f18669c = aVar;
                    break;
                }
            }
            if (f18669c != null) {
                break;
            }
        }
        if (f18669c != null) {
            return true;
        }
        String str2 = Build.MANUFACTURER;
        if (str2.equalsIgnoreCase("ZUK")) {
            f18669c = new h();
            return true;
        }
        if (str2.equalsIgnoreCase("OPPO")) {
            f18669c = new d();
            return true;
        }
        if (str2.equalsIgnoreCase("VIVO")) {
            f18669c = new f();
            return true;
        }
        if (str2.equalsIgnoreCase("ZTE")) {
            f18669c = new g();
            return true;
        }
        f18669c = new DefaultBadger();
        return true;
    }
}
