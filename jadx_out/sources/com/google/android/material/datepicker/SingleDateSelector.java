package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import e5.AbstractC2424b;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class SingleDateSelector implements DateSelector<Long> {
    public static final Parcelable.Creator<SingleDateSelector> CREATOR = new b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private CharSequence f23182g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Long f23183h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private SimpleDateFormat f23184i;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a extends e {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ r f23185o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ TextInputLayout f23186p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, r rVar, TextInputLayout textInputLayout2) {
            super(str, dateFormat, textInputLayout, calendarConstraints);
            this.f23185o = rVar;
            this.f23186p = textInputLayout2;
        }

        @Override // com.google.android.material.datepicker.e
        void d() {
            SingleDateSelector.this.f23182g = this.f23186p.getError();
            this.f23185o.a();
        }

        @Override // com.google.android.material.datepicker.e
        void e(Long l10) {
            if (l10 == null) {
                SingleDateSelector.this.d();
            } else {
                SingleDateSelector.this.w0(l10.longValue());
            }
            SingleDateSelector.this.f23182g = null;
            this.f23185o.b(SingleDateSelector.this.i0());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b implements Parcelable.Creator {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SingleDateSelector createFromParcel(Parcel parcel) {
            SingleDateSelector singleDateSelector = new SingleDateSelector();
            singleDateSelector.f23183h = (Long) parcel.readValue(Long.class.getClassLoader());
            return singleDateSelector;
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SingleDateSelector[] newArray(int i10) {
            return new SingleDateSelector[i10];
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        this.f23183h = null;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public View A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, CalendarConstraints calendarConstraints, r rVar) {
        View viewInflate = layoutInflater.inflate(Q4.g.f9349v, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) viewInflate.findViewById(Q4.e.f9274D);
        EditText editText = textInputLayout.getEditText();
        Integer numF = X4.a.f(viewInflate.getContext(), Q4.a.f9168t);
        if (numF != null) {
            editText.setHintTextColor(numF.intValue());
        }
        if (com.google.android.material.internal.e.b()) {
            editText.setInputType(17);
        }
        SimpleDateFormat simpleDateFormatF = this.f23184i;
        boolean z10 = simpleDateFormatF != null;
        if (!z10) {
            simpleDateFormatF = v.f();
        }
        SimpleDateFormat simpleDateFormat = simpleDateFormatF;
        String pattern = z10 ? simpleDateFormat.toPattern() : v.g(viewInflate.getResources(), simpleDateFormat);
        textInputLayout.setPlaceholderText(pattern);
        Long l10 = this.f23183h;
        if (l10 != null) {
            editText.setText(simpleDateFormat.format(l10));
        }
        editText.addTextChangedListener(new a(pattern, simpleDateFormat, textInputLayout, calendarConstraints, rVar, textInputLayout));
        if (!DateSelector.y0(viewInflate.getContext())) {
            DateSelector.r(editText);
        }
        return viewInflate;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public String I(Context context) {
        Resources resources = context.getResources();
        Long l10 = this.f23183h;
        return resources.getString(Q4.i.f9390r, l10 == null ? resources.getString(Q4.i.f9391s) : h.m(l10.longValue()));
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int M(Context context) {
        return AbstractC2424b.f(context, Q4.a.f9147i0, n.class.getCanonicalName());
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public boolean d0() {
        return this.f23183h != null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Long i0() {
        return this.f23183h;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public Collection g0() {
        ArrayList arrayList = new ArrayList();
        Long l10 = this.f23183h;
        if (l10 != null) {
            arrayList.add(l10);
        }
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public String k(Context context) {
        Resources resources = context.getResources();
        Long l10 = this.f23183h;
        if (l10 == null) {
            return resources.getString(Q4.i.f9393u);
        }
        return resources.getString(Q4.i.f9392t, h.m(l10.longValue()));
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public Collection m() {
        return new ArrayList();
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void w0(long j10) {
        this.f23183h = Long.valueOf(j10);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeValue(this.f23183h);
    }
}
