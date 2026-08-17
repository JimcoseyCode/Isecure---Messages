package com.google.android.material.navigation;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.view.menu.m;
import com.google.android.material.internal.ParcelableSparseArray;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class NavigationBarPresenter implements androidx.appcompat.view.menu.j {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private i f23494g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f23495h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f23496i;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f23497g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        ParcelableSparseArray f23498h;

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        SavedState() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f23497g);
            parcel.writeParcelable(this.f23498h, 0);
        }

        SavedState(Parcel parcel) {
            this.f23497g = parcel.readInt();
            this.f23498h = (ParcelableSparseArray) parcel.readParcelable(getClass().getClassLoader());
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void b(boolean z10) {
        if (this.f23495h) {
            return;
        }
        if (z10) {
            this.f23494g.d();
        } else {
            this.f23494g.t();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean c() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean d(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean e(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void g(Context context, androidx.appcompat.view.menu.e eVar) {
        this.f23494g.b(eVar);
    }

    @Override // androidx.appcompat.view.menu.j
    public int getId() {
        return this.f23496i;
    }

    @Override // androidx.appcompat.view.menu.j
    public void h(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f23494g.s(savedState.f23497g);
            this.f23494g.q(com.google.android.material.badge.b.c(this.f23494g.getContext(), savedState.f23498h));
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean i(m mVar) {
        return false;
    }

    public void j(int i10) {
        this.f23496i = i10;
    }

    @Override // androidx.appcompat.view.menu.j
    public Parcelable k() {
        SavedState savedState = new SavedState();
        savedState.f23497g = this.f23494g.getSelectedItemId();
        savedState.f23498h = com.google.android.material.badge.b.d(this.f23494g.getBadgeDrawables());
        return savedState;
    }

    public void l(i iVar) {
        this.f23494g = iVar;
    }

    public void m(boolean z10) {
        this.f23495h = z10;
    }

    @Override // androidx.appcompat.view.menu.j
    public void a(androidx.appcompat.view.menu.e eVar, boolean z10) {
    }
}
