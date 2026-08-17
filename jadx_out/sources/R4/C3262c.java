package r4;

import android.accounts.Account;
import android.view.View;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: r4.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C3262c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Account f31908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f31909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f31910c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f31911d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f31912e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final View f31913f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f31914g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f31915h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final M4.a f31916i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Integer f31917j;

    /* JADX INFO: renamed from: r4.c$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Account f31918a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private m0.b f31919b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f31920c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f31921d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final M4.a f31922e = M4.a.f7486p;

        public C3262c a() {
            return new C3262c(this.f31918a, this.f31919b, null, 0, null, this.f31920c, this.f31921d, this.f31922e, false);
        }

        public a b(String str) {
            this.f31920c = str;
            return this;
        }

        public final a c(Collection collection) {
            if (this.f31919b == null) {
                this.f31919b = new m0.b();
            }
            this.f31919b.addAll(collection);
            return this;
        }

        public final a d(Account account) {
            this.f31918a = account;
            return this;
        }

        public final a e(String str) {
            this.f31921d = str;
            return this;
        }
    }

    public C3262c(Account account, Set set, Map map, int i10, View view, String str, String str2, M4.a aVar, boolean z10) {
        this.f31908a = account;
        Set setUnmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.f31909b = setUnmodifiableSet;
        map = map == null ? Collections.EMPTY_MAP : map;
        this.f31911d = map;
        this.f31913f = view;
        this.f31912e = i10;
        this.f31914g = str;
        this.f31915h = str2;
        this.f31916i = aVar == null ? M4.a.f7486p : aVar;
        HashSet hashSet = new HashSet(setUnmodifiableSet);
        Iterator it = map.values().iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
        this.f31910c = Collections.unmodifiableSet(hashSet);
    }

    public Account a() {
        return this.f31908a;
    }

    public Account b() {
        Account account = this.f31908a;
        return account != null ? account : new Account("<<default account>>", "com.google");
    }

    public Set c() {
        return this.f31910c;
    }

    public String d() {
        return this.f31914g;
    }

    public Set e() {
        return this.f31909b;
    }

    public final M4.a f() {
        return this.f31916i;
    }

    public final Integer g() {
        return this.f31917j;
    }

    public final String h() {
        return this.f31915h;
    }

    public final void i(Integer num) {
        this.f31917j = num;
    }
}
