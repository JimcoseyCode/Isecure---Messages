package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.I;
import androidx.lifecycle.AbstractC1764k;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class BackStackRecordState implements Parcelable {
    public static final Parcelable.Creator<BackStackRecordState> CREATOR = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final int[] f17183g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final ArrayList f17184h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final int[] f17185i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final int[] f17186j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final int f17187k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final String f17188l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final int f17189m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final int f17190n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final CharSequence f17191o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final int f17192p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final CharSequence f17193q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final ArrayList f17194r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    final ArrayList f17195s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final boolean f17196t;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BackStackRecordState createFromParcel(Parcel parcel) {
            return new BackStackRecordState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BackStackRecordState[] newArray(int i10) {
            return new BackStackRecordState[i10];
        }
    }

    BackStackRecordState(C1733a c1733a) {
        int size = c1733a.f17350c.size();
        this.f17183g = new int[size * 6];
        if (!c1733a.f17356i) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f17184h = new ArrayList(size);
        this.f17185i = new int[size];
        this.f17186j = new int[size];
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            I.a aVar = (I.a) c1733a.f17350c.get(i11);
            int i12 = i10 + 1;
            this.f17183g[i10] = aVar.f17367a;
            ArrayList arrayList = this.f17184h;
            Fragment fragment = aVar.f17368b;
            arrayList.add(fragment != null ? fragment.mWho : null);
            int[] iArr = this.f17183g;
            iArr[i12] = aVar.f17369c ? 1 : 0;
            iArr[i10 + 2] = aVar.f17370d;
            iArr[i10 + 3] = aVar.f17371e;
            int i13 = i10 + 5;
            iArr[i10 + 4] = aVar.f17372f;
            i10 += 6;
            iArr[i13] = aVar.f17373g;
            this.f17185i[i11] = aVar.f17374h.ordinal();
            this.f17186j[i11] = aVar.f17375i.ordinal();
        }
        this.f17187k = c1733a.f17355h;
        this.f17188l = c1733a.f17358k;
        this.f17189m = c1733a.f17443v;
        this.f17190n = c1733a.f17359l;
        this.f17191o = c1733a.f17360m;
        this.f17192p = c1733a.f17361n;
        this.f17193q = c1733a.f17362o;
        this.f17194r = c1733a.f17363p;
        this.f17195s = c1733a.f17364q;
        this.f17196t = c1733a.f17365r;
    }

    private void a(C1733a c1733a) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            boolean z10 = true;
            if (i10 >= this.f17183g.length) {
                c1733a.f17355h = this.f17187k;
                c1733a.f17358k = this.f17188l;
                c1733a.f17356i = true;
                c1733a.f17359l = this.f17190n;
                c1733a.f17360m = this.f17191o;
                c1733a.f17361n = this.f17192p;
                c1733a.f17362o = this.f17193q;
                c1733a.f17363p = this.f17194r;
                c1733a.f17364q = this.f17195s;
                c1733a.f17365r = this.f17196t;
                return;
            }
            I.a aVar = new I.a();
            int i12 = i10 + 1;
            aVar.f17367a = this.f17183g[i10];
            if (FragmentManager.J0(2)) {
                Objects.toString(c1733a);
                int i13 = this.f17183g[i12];
            }
            aVar.f17374h = AbstractC1764k.b.values()[this.f17185i[i11]];
            aVar.f17375i = AbstractC1764k.b.values()[this.f17186j[i11]];
            int[] iArr = this.f17183g;
            int i14 = i10 + 2;
            if (iArr[i12] == 0) {
                z10 = false;
            }
            aVar.f17369c = z10;
            int i15 = iArr[i14];
            aVar.f17370d = i15;
            int i16 = iArr[i10 + 3];
            aVar.f17371e = i16;
            int i17 = i10 + 5;
            int i18 = iArr[i10 + 4];
            aVar.f17372f = i18;
            i10 += 6;
            int i19 = iArr[i17];
            aVar.f17373g = i19;
            c1733a.f17351d = i15;
            c1733a.f17352e = i16;
            c1733a.f17353f = i18;
            c1733a.f17354g = i19;
            c1733a.f(aVar);
            i11++;
        }
    }

    public C1733a b(FragmentManager fragmentManager) {
        C1733a c1733a = new C1733a(fragmentManager);
        a(c1733a);
        c1733a.f17443v = this.f17189m;
        for (int i10 = 0; i10 < this.f17184h.size(); i10++) {
            String str = (String) this.f17184h.get(i10);
            if (str != null) {
                ((I.a) c1733a.f17350c.get(i10)).f17368b = fragmentManager.f0(str);
            }
        }
        c1733a.v(1);
        return c1733a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeIntArray(this.f17183g);
        parcel.writeStringList(this.f17184h);
        parcel.writeIntArray(this.f17185i);
        parcel.writeIntArray(this.f17186j);
        parcel.writeInt(this.f17187k);
        parcel.writeString(this.f17188l);
        parcel.writeInt(this.f17189m);
        parcel.writeInt(this.f17190n);
        TextUtils.writeToParcel(this.f17191o, parcel, 0);
        parcel.writeInt(this.f17192p);
        TextUtils.writeToParcel(this.f17193q, parcel, 0);
        parcel.writeStringList(this.f17194r);
        parcel.writeStringList(this.f17195s);
        parcel.writeInt(this.f17196t ? 1 : 0);
    }

    BackStackRecordState(Parcel parcel) {
        this.f17183g = parcel.createIntArray();
        this.f17184h = parcel.createStringArrayList();
        this.f17185i = parcel.createIntArray();
        this.f17186j = parcel.createIntArray();
        this.f17187k = parcel.readInt();
        this.f17188l = parcel.readString();
        this.f17189m = parcel.readInt();
        this.f17190n = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f17191o = (CharSequence) creator.createFromParcel(parcel);
        this.f17192p = parcel.readInt();
        this.f17193q = (CharSequence) creator.createFromParcel(parcel);
        this.f17194r = parcel.createStringArrayList();
        this.f17195s = parcel.createStringArrayList();
        this.f17196t = parcel.readInt() != 0;
    }
}
