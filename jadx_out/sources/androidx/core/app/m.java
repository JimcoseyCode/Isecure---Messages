package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.app.l;
import androidx.core.graphics.drawable.IconCompat;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class m implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f16379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Notification.Builder f16380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l.e f16381c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private RemoteViews f16382d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private RemoteViews f16383e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f16384f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Bundle f16385g = new Bundle();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f16386h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private RemoteViews f16387i;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class a {
        static Notification.Builder a(Notification.Builder builder, Notification.Action action) {
            return builder.addAction(action);
        }

        static Notification.Action.Builder b(Notification.Action.Builder builder, Bundle bundle) {
            return builder.addExtras(bundle);
        }

        static Notification.Action.Builder c(Notification.Action.Builder builder, RemoteInput remoteInput) {
            return builder.addRemoteInput(remoteInput);
        }

        static Notification.Action d(Notification.Action.Builder builder) {
            return builder.build();
        }

        static String e(Notification notification) {
            return notification.getGroup();
        }

        static Notification.Builder f(Notification.Builder builder, String str) {
            return builder.setGroup(str);
        }

        static Notification.Builder g(Notification.Builder builder, boolean z10) {
            return builder.setGroupSummary(z10);
        }

        static Notification.Builder h(Notification.Builder builder, boolean z10) {
            return builder.setLocalOnly(z10);
        }

        static Notification.Builder i(Notification.Builder builder, String str) {
            return builder.setSortKey(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class b {
        static Notification.Builder a(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        static Notification.Builder b(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }

        static Notification.Builder c(Notification.Builder builder, int i10) {
            return builder.setColor(i10);
        }

        static Notification.Builder d(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }

        static Notification.Builder e(Notification.Builder builder, Uri uri, Object obj) {
            return builder.setSound(uri, (AudioAttributes) obj);
        }

        static Notification.Builder f(Notification.Builder builder, int i10) {
            return builder.setVisibility(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class c {
        static Notification.Action.Builder a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        static Notification.Builder b(Notification.Builder builder, Icon icon) {
            return builder.setLargeIcon(icon);
        }

        static Notification.Builder c(Notification.Builder builder, Object obj) {
            return builder.setSmallIcon((Icon) obj);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class d {
        static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z10) {
            return builder.setAllowGeneratedReplies(z10);
        }

        static Notification.Builder b(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomBigContentView(remoteViews);
        }

        static Notification.Builder c(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomContentView(remoteViews);
        }

        static Notification.Builder d(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomHeadsUpContentView(remoteViews);
        }

        static Notification.Builder e(Notification.Builder builder, CharSequence[] charSequenceArr) {
            return builder.setRemoteInputHistory(charSequenceArr);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class e {
        static Notification.Builder a(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        static Notification.Builder b(Notification.Builder builder, int i10) {
            return builder.setBadgeIconType(i10);
        }

        static Notification.Builder c(Notification.Builder builder, boolean z10) {
            return builder.setColorized(z10);
        }

        static Notification.Builder d(Notification.Builder builder, int i10) {
            return builder.setGroupAlertBehavior(i10);
        }

        static Notification.Builder e(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSettingsText(charSequence);
        }

        static Notification.Builder f(Notification.Builder builder, String str) {
            return builder.setShortcutId(str);
        }

        static Notification.Builder g(Notification.Builder builder, long j10) {
            return builder.setTimeoutAfter(j10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class f {
        static Notification.Action.Builder a(Notification.Action.Builder builder, int i10) {
            return builder.setSemanticAction(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class g {
        static Notification.Builder a(Notification.Builder builder, boolean z10) {
            return builder.setAllowSystemGeneratedContextualActions(z10);
        }

        static Notification.Builder b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            return builder.setBubbleMetadata(bubbleMetadata);
        }

        static Notification.Action.Builder c(Notification.Action.Builder builder, boolean z10) {
            return builder.setContextual(z10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class h {
        static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z10) {
            return builder.setAuthenticationRequired(z10);
        }

        static Notification.Builder b(Notification.Builder builder, int i10) {
            return builder.setForegroundServiceBehavior(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class i {
        static Notification.Builder a(Notification.Builder builder, String str) {
            return builder.setShortCriticalText(str);
        }
    }

    m(l.e eVar) {
        int i10;
        this.f16381c = eVar;
        Context context = eVar.f16349a;
        this.f16379a = context;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f16380b = e.a(context, eVar.f16338L);
        } else {
            this.f16380b = new Notification.Builder(eVar.f16349a);
        }
        Notification notification = eVar.f16345S;
        this.f16380b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, eVar.f16358j).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(eVar.f16353e).setContentText(eVar.f16354f).setContentInfo(eVar.f16360l).setContentIntent(eVar.f16356h).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(eVar.f16357i, (notification.flags & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0).setNumber(eVar.f16361m).setProgress(eVar.f16369u, eVar.f16370v, eVar.f16371w);
        Notification.Builder builder = this.f16380b;
        IconCompat iconCompat = eVar.f16359k;
        c.b(builder, iconCompat == null ? null : iconCompat.m(context));
        this.f16380b.setSubText(eVar.f16366r).setUsesChronometer(eVar.f16364p).setPriority(eVar.f16362n);
        Iterator it = eVar.f16350b.iterator();
        while (it.hasNext()) {
            b((l.a) it.next());
        }
        Bundle bundle = eVar.f16331E;
        if (bundle != null) {
            this.f16385g.putAll(bundle);
        }
        int i11 = Build.VERSION.SDK_INT;
        this.f16382d = eVar.f16335I;
        this.f16383e = eVar.f16336J;
        this.f16380b.setShowWhen(eVar.f16363o);
        a.h(this.f16380b, eVar.f16327A);
        a.f(this.f16380b, eVar.f16372x);
        a.i(this.f16380b, eVar.f16374z);
        a.g(this.f16380b, eVar.f16373y);
        this.f16386h = eVar.f16342P;
        b.b(this.f16380b, eVar.f16330D);
        b.c(this.f16380b, eVar.f16332F);
        b.f(this.f16380b, eVar.f16333G);
        b.d(this.f16380b, eVar.f16334H);
        b.e(this.f16380b, notification.sound, notification.audioAttributes);
        List listE = i11 < 28 ? e(g(eVar.f16351c), eVar.f16348V) : eVar.f16348V;
        if (listE != null && !listE.isEmpty()) {
            Iterator it2 = listE.iterator();
            while (it2.hasNext()) {
                b.a(this.f16380b, (String) it2.next());
            }
        }
        this.f16387i = eVar.f16337K;
        if (eVar.f16352d.size() > 0) {
            Bundle bundle2 = eVar.e().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i12 = 0; i12 < eVar.f16352d.size(); i12++) {
                bundle4.putBundle(Integer.toString(i12), n.a((l.a) eVar.f16352d.get(i12)));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            eVar.e().putBundle("android.car.EXTENSIONS", bundle2);
            this.f16385g.putBundle("android.car.EXTENSIONS", bundle3);
        }
        int i13 = Build.VERSION.SDK_INT;
        Object obj = eVar.f16347U;
        if (obj != null) {
            c.c(this.f16380b, obj);
        }
        this.f16380b.setExtras(eVar.f16331E);
        d.e(this.f16380b, eVar.f16368t);
        RemoteViews remoteViews = eVar.f16335I;
        if (remoteViews != null) {
            d.c(this.f16380b, remoteViews);
        }
        RemoteViews remoteViews2 = eVar.f16336J;
        if (remoteViews2 != null) {
            d.b(this.f16380b, remoteViews2);
        }
        RemoteViews remoteViews3 = eVar.f16337K;
        if (remoteViews3 != null) {
            d.d(this.f16380b, remoteViews3);
        }
        if (i13 >= 26) {
            e.b(this.f16380b, eVar.f16339M);
            e.e(this.f16380b, eVar.f16367s);
            e.f(this.f16380b, eVar.f16340N);
            e.g(this.f16380b, eVar.f16341O);
            e.d(this.f16380b, eVar.f16342P);
            if (eVar.f16329C) {
                e.c(this.f16380b, eVar.f16328B);
            }
            if (!TextUtils.isEmpty(eVar.f16338L)) {
                this.f16380b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i13 >= 28) {
            Iterator it3 = eVar.f16351c.iterator();
            if (it3.hasNext()) {
                android.support.v4.media.session.b.a(it3.next());
                throw null;
            }
        }
        if (i13 >= 29) {
            g.a(this.f16380b, eVar.f16344R);
            g.b(this.f16380b, l.d.a(null));
        }
        if (i13 >= 31 && (i10 = eVar.f16343Q) != 0) {
            h.b(this.f16380b, i10);
        }
        if (i13 >= 36) {
            i.a(this.f16380b, eVar.f16355g);
        }
        if (eVar.f16346T) {
            if (this.f16381c.f16373y) {
                this.f16386h = 2;
            } else {
                this.f16386h = 1;
            }
            this.f16380b.setVibrate(null);
            this.f16380b.setSound(null);
            int i14 = notification.defaults & (-4);
            notification.defaults = i14;
            this.f16380b.setDefaults(i14);
            if (i13 >= 26) {
                if (TextUtils.isEmpty(this.f16381c.f16372x)) {
                    a.f(this.f16380b, "silent");
                }
                e.d(this.f16380b, this.f16386h);
            }
        }
    }

    private void b(l.a aVar) {
        IconCompat iconCompatD = aVar.d();
        Notification.Action.Builder builderA = c.a(iconCompatD != null ? iconCompatD.l() : null, aVar.h(), aVar.a());
        if (aVar.e() != null) {
            for (RemoteInput remoteInput : t.d(aVar.e())) {
                a.c(builderA, remoteInput);
            }
        }
        Bundle bundle = aVar.c() != null ? new Bundle(aVar.c()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        int i10 = Build.VERSION.SDK_INT;
        d.a(builderA, aVar.b());
        bundle.putInt("android.support.action.semanticAction", aVar.f());
        if (i10 >= 28) {
            f.a(builderA, aVar.f());
        }
        if (i10 >= 29) {
            g.c(builderA, aVar.j());
        }
        if (i10 >= 31) {
            h.a(builderA, aVar.i());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", aVar.g());
        a.b(builderA, bundle);
        a.a(this.f16380b, a.d(builderA));
    }

    private static List e(List list, List list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        m0.b bVar = new m0.b(list.size() + list2.size());
        bVar.addAll(list);
        bVar.addAll(list2);
        return new ArrayList(bVar);
    }

    private static List g(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return arrayList;
        }
        android.support.v4.media.session.b.a(it.next());
        throw null;
    }

    private void h(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -4;
    }

    @Override // androidx.core.app.k
    public Notification.Builder a() {
        return this.f16380b;
    }

    public Notification c() {
        Bundle bundleD;
        RemoteViews remoteViewsF;
        RemoteViews remoteViewsD;
        l.f fVar = this.f16381c.f16365q;
        if (fVar != null) {
            fVar.b(this);
        }
        RemoteViews remoteViewsE = fVar != null ? fVar.e(this) : null;
        Notification notificationD = d();
        if (remoteViewsE != null) {
            notificationD.contentView = remoteViewsE;
        } else {
            RemoteViews remoteViews = this.f16381c.f16335I;
            if (remoteViews != null) {
                notificationD.contentView = remoteViews;
            }
        }
        if (fVar != null && (remoteViewsD = fVar.d(this)) != null) {
            notificationD.bigContentView = remoteViewsD;
        }
        if (fVar != null && (remoteViewsF = this.f16381c.f16365q.f(this)) != null) {
            notificationD.headsUpContentView = remoteViewsF;
        }
        if (fVar != null && (bundleD = l.d(notificationD)) != null) {
            fVar.a(bundleD);
        }
        return notificationD;
    }

    protected Notification d() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f16380b.build();
        }
        Notification notificationBuild = this.f16380b.build();
        if (this.f16386h != 0) {
            if (a.e(notificationBuild) != null && (notificationBuild.flags & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 && this.f16386h == 2) {
                h(notificationBuild);
            }
            if (a.e(notificationBuild) != null && (notificationBuild.flags & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 0 && this.f16386h == 1) {
                h(notificationBuild);
            }
        }
        return notificationBuild;
    }

    Context f() {
        return this.f16379a;
    }
}
