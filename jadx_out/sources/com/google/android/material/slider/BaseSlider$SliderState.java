package com.google.android.material.slider;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
class BaseSlider$SliderState extends View.BaseSavedState {
    public static final Parcelable.Creator<BaseSlider$SliderState> CREATOR = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    float f23680g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    float f23681h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    ArrayList f23682i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    float f23683j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    boolean f23684k;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BaseSlider$SliderState createFromParcel(Parcel parcel) {
            return new BaseSlider$SliderState(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BaseSlider$SliderState[] newArray(int i10) {
            return new BaseSlider$SliderState[i10];
        }
    }

    /* synthetic */ BaseSlider$SliderState(Parcel parcel, com.google.android.material.slider.a aVar) {
        this(parcel);
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeFloat(this.f23680g);
        parcel.writeFloat(this.f23681h);
        parcel.writeList(this.f23682i);
        parcel.writeFloat(this.f23683j);
        parcel.writeBooleanArray(new boolean[]{this.f23684k});
    }

    private BaseSlider$SliderState(Parcel parcel) {
        super(parcel);
        this.f23680g = parcel.readFloat();
        this.f23681h = parcel.readFloat();
        ArrayList arrayList = new ArrayList();
        this.f23682i = arrayList;
        parcel.readList(arrayList, Float.class.getClassLoader());
        this.f23683j = parcel.readFloat();
        this.f23684k = parcel.createBooleanArray()[0];
    }
}
