package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k4.C2828a;
import o4.C3008a;
import s4.AbstractC3325b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class GoogleSignInOptions extends AbstractSafeParcelable implements C3008a.d, ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final GoogleSignInOptions f20937r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final GoogleSignInOptions f20938s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Scope f20939t = new Scope("profile");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Scope f20940u = new Scope("email");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Scope f20941v = new Scope("openid");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Scope f20942w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Scope f20943x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final Comparator f20944y;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final int f20945g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ArrayList f20946h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Account f20947i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f20948j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f20949k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f20950l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f20951m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f20952n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ArrayList f20953o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f20954p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Map f20955q;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f20957b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f20958c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f20959d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f20960e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Account f20961f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f20962g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private String f20964i;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Set f20956a = new HashSet();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Map f20963h = new HashMap();

        public GoogleSignInOptions a() {
            if (this.f20956a.contains(GoogleSignInOptions.f20943x)) {
                Set set = this.f20956a;
                Scope scope = GoogleSignInOptions.f20942w;
                if (set.contains(scope)) {
                    this.f20956a.remove(scope);
                }
            }
            if (this.f20959d && (this.f20961f == null || !this.f20956a.isEmpty())) {
                b();
            }
            return new GoogleSignInOptions(new ArrayList(this.f20956a), this.f20961f, this.f20959d, this.f20957b, this.f20958c, this.f20960e, this.f20962g, this.f20963h, this.f20964i);
        }

        public a b() {
            this.f20956a.add(GoogleSignInOptions.f20941v);
            return this;
        }

        public a c() {
            this.f20956a.add(GoogleSignInOptions.f20939t);
            return this;
        }

        public a d(Scope scope, Scope... scopeArr) {
            this.f20956a.add(scope);
            this.f20956a.addAll(Arrays.asList(scopeArr));
            return this;
        }
    }

    static {
        Scope scope = new Scope("https://www.googleapis.com/auth/games_lite");
        f20942w = scope;
        f20943x = new Scope("https://www.googleapis.com/auth/games");
        a aVar = new a();
        aVar.b();
        aVar.c();
        f20937r = aVar.a();
        a aVar2 = new a();
        aVar2.d(scope, new Scope[0]);
        f20938s = aVar2.a();
        CREATOR = new c();
        f20944y = new b();
    }

    private static Map D0(List list) {
        HashMap map = new HashMap();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                GoogleSignInOptionsExtensionParcelable googleSignInOptionsExtensionParcelable = (GoogleSignInOptionsExtensionParcelable) it.next();
                map.put(Integer.valueOf(googleSignInOptionsExtensionParcelable.e()), googleSignInOptionsExtensionParcelable);
            }
        }
        return map;
    }

    public boolean A0() {
        return this.f20949k;
    }

    public String X() {
        return this.f20954p;
    }

    public Account e() {
        return this.f20947i;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0052 A[Catch: ClassCastException -> 0x0090, TryCatch #0 {ClassCastException -> 0x0090, blocks: (B:5:0x0004, B:7:0x000e, B:10:0x0018, B:12:0x0028, B:15:0x0035, B:17:0x0039, B:22:0x004a, B:24:0x0052, B:30:0x006a, B:32:0x0072, B:34:0x007a, B:36:0x0082, B:27:0x005d, B:20:0x0040), top: B:42:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005d A[Catch: ClassCastException -> 0x0090, TryCatch #0 {ClassCastException -> 0x0090, blocks: (B:5:0x0004, B:7:0x000e, B:10:0x0018, B:12:0x0028, B:15:0x0035, B:17:0x0039, B:22:0x004a, B:24:0x0052, B:30:0x006a, B:32:0x0072, B:34:0x007a, B:36:0x0082, B:27:0x005d, B:20:0x0040), top: B:42:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
            if (this.f20953o.isEmpty() && googleSignInOptions.f20953o.isEmpty() && this.f20946h.size() == googleSignInOptions.k0().size() && this.f20946h.containsAll(googleSignInOptions.k0())) {
                Account account = this.f20947i;
                if (account == null) {
                    if (googleSignInOptions.e() == null) {
                        if (TextUtils.isEmpty(this.f20951m)) {
                            if (this.f20951m.equals(googleSignInOptions.l0())) {
                                if (this.f20950l == googleSignInOptions.t0()) {
                                    if (!TextUtils.equals(this.f20954p, googleSignInOptions.X())) {
                                    }
                                }
                            }
                        } else if (TextUtils.isEmpty(googleSignInOptions.l0())) {
                            if (this.f20950l == googleSignInOptions.t0() && this.f20948j == googleSignInOptions.u0() && this.f20949k == googleSignInOptions.A0()) {
                                if (!TextUtils.equals(this.f20954p, googleSignInOptions.X())) {
                                    return true;
                                }
                            }
                        }
                    }
                } else if (account.equals(googleSignInOptions.e())) {
                    if (TextUtils.isEmpty(this.f20951m)) {
                    }
                }
            }
        } catch (ClassCastException unused) {
        }
        return false;
    }

    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f20946h;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(((Scope) arrayList2.get(i10)).e());
        }
        Collections.sort(arrayList);
        C2828a c2828a = new C2828a();
        c2828a.a(arrayList);
        c2828a.a(this.f20947i);
        c2828a.a(this.f20951m);
        c2828a.c(this.f20950l);
        c2828a.c(this.f20948j);
        c2828a.c(this.f20949k);
        c2828a.a(this.f20954p);
        return c2828a.b();
    }

    public ArrayList k0() {
        return new ArrayList(this.f20946h);
    }

    public String l0() {
        return this.f20951m;
    }

    public ArrayList s() {
        return this.f20953o;
    }

    public boolean t0() {
        return this.f20950l;
    }

    public boolean u0() {
        return this.f20948j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f20945g;
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.j(parcel, 1, i11);
        AbstractC3325b.t(parcel, 2, k0(), false);
        AbstractC3325b.o(parcel, 3, e(), i10, false);
        AbstractC3325b.c(parcel, 4, u0());
        AbstractC3325b.c(parcel, 5, A0());
        AbstractC3325b.c(parcel, 6, t0());
        AbstractC3325b.p(parcel, 7, l0(), false);
        AbstractC3325b.p(parcel, 8, this.f20952n, false);
        AbstractC3325b.t(parcel, 9, s(), false);
        AbstractC3325b.p(parcel, 10, X(), false);
        AbstractC3325b.b(parcel, iA);
    }

    GoogleSignInOptions(int i10, ArrayList arrayList, Account account, boolean z10, boolean z11, boolean z12, String str, String str2, ArrayList arrayList2, String str3) {
        this(i10, arrayList, account, z10, z11, z12, str, str2, D0(arrayList2), str3);
    }

    private GoogleSignInOptions(int i10, ArrayList arrayList, Account account, boolean z10, boolean z11, boolean z12, String str, String str2, Map map, String str3) {
        this.f20945g = i10;
        this.f20946h = arrayList;
        this.f20947i = account;
        this.f20948j = z10;
        this.f20949k = z11;
        this.f20950l = z12;
        this.f20951m = str;
        this.f20952n = str2;
        this.f20953o = new ArrayList(map.values());
        this.f20955q = map;
        this.f20954p = str3;
    }
}
