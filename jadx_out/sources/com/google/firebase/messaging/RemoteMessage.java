package com.google.firebase.messaging;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.firebase.messaging.AbstractC2237e;
import expo.modules.notifications.service.NotificationsService;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoteMessage> CREATOR = new V();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Bundle f24162g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Map f24163h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private b f24164i;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f24165a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f24166b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String[] f24167c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f24168d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f24169e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final String[] f24170f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final String f24171g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final String f24172h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final String f24173i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final String f24174j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final String f24175k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final String f24176l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final String f24177m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Uri f24178n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final String f24179o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final Integer f24180p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final Integer f24181q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final Integer f24182r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final int[] f24183s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Long f24184t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private final boolean f24185u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private final boolean f24186v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private final boolean f24187w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private final boolean f24188x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private final boolean f24189y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private final long[] f24190z;

        private static String[] p(M m10, String str) {
            Object[] objArrG = m10.g(str);
            if (objArrG == null) {
                return null;
            }
            String[] strArr = new String[objArrG.length];
            for (int i10 = 0; i10 < objArrG.length; i10++) {
                strArr[i10] = String.valueOf(objArrG[i10]);
            }
            return strArr;
        }

        public Integer A() {
            return this.f24181q;
        }

        public String a() {
            return this.f24168d;
        }

        public String[] b() {
            return this.f24170f;
        }

        public String c() {
            return this.f24169e;
        }

        public String d() {
            return this.f24177m;
        }

        public String e() {
            return this.f24176l;
        }

        public String f() {
            return this.f24175k;
        }

        public boolean g() {
            return this.f24189y;
        }

        public boolean h() {
            return this.f24187w;
        }

        public boolean i() {
            return this.f24188x;
        }

        public Long j() {
            return this.f24184t;
        }

        public String k() {
            return this.f24171g;
        }

        public Uri l() {
            String str = this.f24172h;
            if (str != null) {
                return Uri.parse(str);
            }
            return null;
        }

        public int[] m() {
            return this.f24183s;
        }

        public Uri n() {
            return this.f24178n;
        }

        public boolean o() {
            return this.f24186v;
        }

        public Integer q() {
            return this.f24182r;
        }

        public Integer r() {
            return this.f24180p;
        }

        public String s() {
            return this.f24173i;
        }

        public boolean t() {
            return this.f24185u;
        }

        public String u() {
            return this.f24174j;
        }

        public String v() {
            return this.f24179o;
        }

        public String w() {
            return this.f24165a;
        }

        public String[] x() {
            return this.f24167c;
        }

        public String y() {
            return this.f24166b;
        }

        public long[] z() {
            return this.f24190z;
        }

        private b(M m10) {
            this.f24165a = m10.p("gcm.n.title");
            this.f24166b = m10.h("gcm.n.title");
            this.f24167c = p(m10, "gcm.n.title");
            this.f24168d = m10.p("gcm.n.body");
            this.f24169e = m10.h("gcm.n.body");
            this.f24170f = p(m10, "gcm.n.body");
            this.f24171g = m10.p("gcm.n.icon");
            this.f24173i = m10.o();
            this.f24174j = m10.p("gcm.n.tag");
            this.f24175k = m10.p("gcm.n.color");
            this.f24176l = m10.p("gcm.n.click_action");
            this.f24177m = m10.p("gcm.n.android_channel_id");
            this.f24178n = m10.f();
            this.f24172h = m10.p("gcm.n.image");
            this.f24179o = m10.p("gcm.n.ticker");
            this.f24180p = m10.b("gcm.n.notification_priority");
            this.f24181q = m10.b("gcm.n.visibility");
            this.f24182r = m10.b("gcm.n.notification_count");
            this.f24185u = m10.a("gcm.n.sticky");
            this.f24186v = m10.a("gcm.n.local_only");
            this.f24187w = m10.a("gcm.n.default_sound");
            this.f24188x = m10.a("gcm.n.default_vibrate_timings");
            this.f24189y = m10.a("gcm.n.default_light_settings");
            this.f24184t = m10.j("gcm.n.event_time");
            this.f24183s = m10.e();
            this.f24190z = m10.q();
        }
    }

    public RemoteMessage(Bundle bundle) {
        this.f24162g = bundle;
    }

    private int l0(String str) {
        if ("high".equals(str)) {
            return 1;
        }
        return "normal".equals(str) ? 2 : 0;
    }

    public int A0() {
        String string = this.f24162g.getString("google.original_priority");
        if (string == null) {
            string = this.f24162g.getString("google.priority");
        }
        return l0(string);
    }

    public int D0() {
        String string = this.f24162g.getString("google.delivered_priority");
        if (string == null) {
            if ("1".equals(this.f24162g.getString("google.priority_reduced"))) {
                return 2;
            }
            string = this.f24162g.getString("google.priority");
        }
        return l0(string);
    }

    public long J0() {
        Object obj = this.f24162g.get("google.sent_time");
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        if (!(obj instanceof String)) {
            return 0L;
        }
        try {
            return Long.parseLong((String) obj);
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    public String K0() {
        return this.f24162g.getString("google.to");
    }

    public int L0() {
        Object obj = this.f24162g.get("google.ttl");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public String X() {
        return this.f24162g.getString("from");
    }

    public String e() {
        return this.f24162g.getString("collapse_key");
    }

    public String k0() {
        String string = this.f24162g.getString(NotificationsService.GOOGLE_MESSAGE_ID_KEY);
        return string == null ? this.f24162g.getString("message_id") : string;
    }

    public Map s() {
        if (this.f24163h == null) {
            this.f24163h = AbstractC2237e.a.a(this.f24162g);
        }
        return this.f24163h;
    }

    public String t0() {
        return this.f24162g.getString("message_type");
    }

    public b u0() {
        if (this.f24164i == null && M.t(this.f24162g)) {
            this.f24164i = new b(new M(this.f24162g));
        }
        return this.f24164i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        V.c(this, parcel, i10);
    }
}
