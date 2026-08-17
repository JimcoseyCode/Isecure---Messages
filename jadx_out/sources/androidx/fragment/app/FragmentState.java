package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.AbstractC1764k;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final String f17321g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final String f17322h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final boolean f17323i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final int f17324j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final int f17325k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final String f17326l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final boolean f17327m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final boolean f17328n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final boolean f17329o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final boolean f17330p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final int f17331q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final String f17332r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    final int f17333s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final boolean f17334t;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FragmentState createFromParcel(Parcel parcel) {
            return new FragmentState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public FragmentState[] newArray(int i10) {
            return new FragmentState[i10];
        }
    }

    FragmentState(Fragment fragment) {
        this.f17321g = fragment.getClass().getName();
        this.f17322h = fragment.mWho;
        this.f17323i = fragment.mFromLayout;
        this.f17324j = fragment.mFragmentId;
        this.f17325k = fragment.mContainerId;
        this.f17326l = fragment.mTag;
        this.f17327m = fragment.mRetainInstance;
        this.f17328n = fragment.mRemoving;
        this.f17329o = fragment.mDetached;
        this.f17330p = fragment.mHidden;
        this.f17331q = fragment.mMaxState.ordinal();
        this.f17332r = fragment.mTargetWho;
        this.f17333s = fragment.mTargetRequestCode;
        this.f17334t = fragment.mUserVisibleHint;
    }

    Fragment a(AbstractC1752u abstractC1752u, ClassLoader classLoader) {
        Fragment fragmentA = abstractC1752u.a(classLoader, this.f17321g);
        fragmentA.mWho = this.f17322h;
        fragmentA.mFromLayout = this.f17323i;
        fragmentA.mRestored = true;
        fragmentA.mFragmentId = this.f17324j;
        fragmentA.mContainerId = this.f17325k;
        fragmentA.mTag = this.f17326l;
        fragmentA.mRetainInstance = this.f17327m;
        fragmentA.mRemoving = this.f17328n;
        fragmentA.mDetached = this.f17329o;
        fragmentA.mHidden = this.f17330p;
        fragmentA.mMaxState = AbstractC1764k.b.values()[this.f17331q];
        fragmentA.mTargetWho = this.f17332r;
        fragmentA.mTargetRequestCode = this.f17333s;
        fragmentA.mUserVisibleHint = this.f17334t;
        return fragmentA;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        sb.append("FragmentState{");
        sb.append(this.f17321g);
        sb.append(" (");
        sb.append(this.f17322h);
        sb.append(")}:");
        if (this.f17323i) {
            sb.append(" fromLayout");
        }
        if (this.f17325k != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f17325k));
        }
        String str = this.f17326l;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f17326l);
        }
        if (this.f17327m) {
            sb.append(" retainInstance");
        }
        if (this.f17328n) {
            sb.append(" removing");
        }
        if (this.f17329o) {
            sb.append(" detached");
        }
        if (this.f17330p) {
            sb.append(" hidden");
        }
        if (this.f17332r != null) {
            sb.append(" targetWho=");
            sb.append(this.f17332r);
            sb.append(" targetRequestCode=");
            sb.append(this.f17333s);
        }
        if (this.f17334t) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f17321g);
        parcel.writeString(this.f17322h);
        parcel.writeInt(this.f17323i ? 1 : 0);
        parcel.writeInt(this.f17324j);
        parcel.writeInt(this.f17325k);
        parcel.writeString(this.f17326l);
        parcel.writeInt(this.f17327m ? 1 : 0);
        parcel.writeInt(this.f17328n ? 1 : 0);
        parcel.writeInt(this.f17329o ? 1 : 0);
        parcel.writeInt(this.f17330p ? 1 : 0);
        parcel.writeInt(this.f17331q);
        parcel.writeString(this.f17332r);
        parcel.writeInt(this.f17333s);
        parcel.writeInt(this.f17334t ? 1 : 0);
    }

    FragmentState(Parcel parcel) {
        this.f17321g = parcel.readString();
        this.f17322h = parcel.readString();
        this.f17323i = parcel.readInt() != 0;
        this.f17324j = parcel.readInt();
        this.f17325k = parcel.readInt();
        this.f17326l = parcel.readString();
        this.f17327m = parcel.readInt() != 0;
        this.f17328n = parcel.readInt() != 0;
        this.f17329o = parcel.readInt() != 0;
        this.f17330p = parcel.readInt() != 0;
        this.f17331q = parcel.readInt();
        this.f17332r = parcel.readString();
        this.f17333s = parcel.readInt();
        this.f17334t = parcel.readInt() != 0;
    }
}
