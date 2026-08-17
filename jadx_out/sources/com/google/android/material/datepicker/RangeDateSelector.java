package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
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
public class RangeDateSelector implements DateSelector<H0.d> {
    public static final Parcelable.Creator<RangeDateSelector> CREATOR = new c();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private CharSequence f23166g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f23167h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f23168i = " ";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Long f23169j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Long f23170k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Long f23171l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Long f23172m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private SimpleDateFormat f23173n;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a extends e {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ TextInputLayout f23174o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ TextInputLayout f23175p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ r f23176q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, r rVar) {
            super(str, dateFormat, textInputLayout, calendarConstraints);
            this.f23174o = textInputLayout2;
            this.f23175p = textInputLayout3;
            this.f23176q = rVar;
        }

        @Override // com.google.android.material.datepicker.e
        void d() {
            RangeDateSelector.this.f23171l = null;
            RangeDateSelector.this.l(this.f23174o, this.f23175p, this.f23176q);
        }

        @Override // com.google.android.material.datepicker.e
        void e(Long l10) {
            RangeDateSelector.this.f23171l = l10;
            RangeDateSelector.this.l(this.f23174o, this.f23175p, this.f23176q);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b extends e {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ TextInputLayout f23178o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ TextInputLayout f23179p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ r f23180q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, r rVar) {
            super(str, dateFormat, textInputLayout, calendarConstraints);
            this.f23178o = textInputLayout2;
            this.f23179p = textInputLayout3;
            this.f23180q = rVar;
        }

        @Override // com.google.android.material.datepicker.e
        void d() {
            RangeDateSelector.this.f23172m = null;
            RangeDateSelector.this.l(this.f23178o, this.f23179p, this.f23180q);
        }

        @Override // com.google.android.material.datepicker.e
        void e(Long l10) {
            RangeDateSelector.this.f23172m = l10;
            RangeDateSelector.this.l(this.f23178o, this.f23179p, this.f23180q);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class c implements Parcelable.Creator {
        c() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public RangeDateSelector createFromParcel(Parcel parcel) {
            RangeDateSelector rangeDateSelector = new RangeDateSelector();
            rangeDateSelector.f23169j = (Long) parcel.readValue(Long.class.getClassLoader());
            rangeDateSelector.f23170k = (Long) parcel.readValue(Long.class.getClassLoader());
            return rangeDateSelector;
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public RangeDateSelector[] newArray(int i10) {
            return new RangeDateSelector[i10];
        }
    }

    private void f(TextInputLayout textInputLayout, TextInputLayout textInputLayout2) {
        if (textInputLayout.getError() != null && this.f23167h.contentEquals(textInputLayout.getError())) {
            textInputLayout.setError(null);
        }
        if (textInputLayout2.getError() == null || !" ".contentEquals(textInputLayout2.getError())) {
            return;
        }
        textInputLayout2.setError(null);
    }

    private boolean h(long j10, long j11) {
        return j10 <= j11;
    }

    private void i(TextInputLayout textInputLayout, TextInputLayout textInputLayout2) {
        textInputLayout.setError(this.f23167h);
        textInputLayout2.setError(" ");
    }

    private void j(TextInputLayout textInputLayout, TextInputLayout textInputLayout2) {
        if (!TextUtils.isEmpty(textInputLayout.getError())) {
            this.f23166g = textInputLayout.getError();
        } else if (TextUtils.isEmpty(textInputLayout2.getError())) {
            this.f23166g = null;
        } else {
            this.f23166g = textInputLayout2.getError();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(TextInputLayout textInputLayout, TextInputLayout textInputLayout2, r rVar) {
        Long l10 = this.f23171l;
        if (l10 == null || this.f23172m == null) {
            f(textInputLayout, textInputLayout2);
            rVar.a();
        } else if (h(l10.longValue(), this.f23172m.longValue())) {
            this.f23169j = this.f23171l;
            this.f23170k = this.f23172m;
            rVar.b(i0());
        } else {
            i(textInputLayout, textInputLayout2);
            rVar.a();
        }
        j(textInputLayout, textInputLayout2);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public View A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, CalendarConstraints calendarConstraints, r rVar) {
        View viewInflate = layoutInflater.inflate(Q4.g.f9350w, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) viewInflate.findViewById(Q4.e.f9276F);
        TextInputLayout textInputLayout2 = (TextInputLayout) viewInflate.findViewById(Q4.e.f9275E);
        EditText editText = textInputLayout.getEditText();
        EditText editText2 = textInputLayout2.getEditText();
        Integer numF = X4.a.f(viewInflate.getContext(), Q4.a.f9168t);
        if (numF != null) {
            editText.setHintTextColor(numF.intValue());
            editText2.setHintTextColor(numF.intValue());
        }
        if (com.google.android.material.internal.e.b()) {
            editText.setInputType(17);
            editText2.setInputType(17);
        }
        this.f23167h = viewInflate.getResources().getString(Q4.i.f9352A);
        SimpleDateFormat simpleDateFormatF = this.f23173n;
        boolean z10 = simpleDateFormatF != null;
        if (!z10) {
            simpleDateFormatF = v.f();
        }
        SimpleDateFormat simpleDateFormat = simpleDateFormatF;
        Long l10 = this.f23169j;
        if (l10 != null) {
            editText.setText(simpleDateFormat.format(l10));
            this.f23171l = this.f23169j;
        }
        Long l11 = this.f23170k;
        if (l11 != null) {
            editText2.setText(simpleDateFormat.format(l11));
            this.f23172m = this.f23170k;
        }
        String pattern = z10 ? simpleDateFormat.toPattern() : v.g(viewInflate.getResources(), simpleDateFormat);
        textInputLayout.setPlaceholderText(pattern);
        textInputLayout2.setPlaceholderText(pattern);
        editText.addTextChangedListener(new a(pattern, simpleDateFormat, textInputLayout, calendarConstraints, textInputLayout, textInputLayout2, rVar));
        editText2.addTextChangedListener(new b(pattern, simpleDateFormat, textInputLayout2, calendarConstraints, textInputLayout, textInputLayout2, rVar));
        if (!DateSelector.y0(viewInflate.getContext())) {
            DateSelector.r(editText, editText2);
        }
        return viewInflate;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public String I(Context context) {
        Resources resources = context.getResources();
        H0.d dVarA = h.a(this.f23169j, this.f23170k);
        Object obj = dVarA.f3634a;
        String string = obj == null ? resources.getString(Q4.i.f9391s) : (String) obj;
        Object obj2 = dVarA.f3635b;
        return resources.getString(Q4.i.f9389q, string, obj2 == null ? resources.getString(Q4.i.f9391s) : (String) obj2);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int M(Context context) {
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        return AbstractC2424b.f(context, Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels) > resources.getDimensionPixelSize(Q4.c.f9223e0) ? Q4.a.f9147i0 : Q4.a.f9143g0, n.class.getCanonicalName());
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public boolean d0() {
        Long l10 = this.f23169j;
        return (l10 == null || this.f23170k == null || !h(l10.longValue(), this.f23170k.longValue())) ? false : true;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public H0.d i0() {
        return new H0.d(this.f23169j, this.f23170k);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public Collection g0() {
        ArrayList arrayList = new ArrayList();
        Long l10 = this.f23169j;
        if (l10 != null) {
            arrayList.add(l10);
        }
        Long l11 = this.f23170k;
        if (l11 != null) {
            arrayList.add(l11);
        }
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public String k(Context context) {
        Resources resources = context.getResources();
        Long l10 = this.f23169j;
        if (l10 == null && this.f23170k == null) {
            return resources.getString(Q4.i.f9359H);
        }
        Long l11 = this.f23170k;
        if (l11 == null) {
            return resources.getString(Q4.i.f9357F, h.c(l10.longValue()));
        }
        if (l10 == null) {
            return resources.getString(Q4.i.f9356E, h.c(l11.longValue()));
        }
        H0.d dVarA = h.a(l10, l11);
        return resources.getString(Q4.i.f9358G, dVarA.f3634a, dVarA.f3635b);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public Collection m() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new H0.d(this.f23169j, this.f23170k));
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void w0(long j10) {
        Long l10 = this.f23169j;
        if (l10 == null) {
            this.f23169j = Long.valueOf(j10);
        } else if (this.f23170k == null && h(l10.longValue(), j10)) {
            this.f23170k = Long.valueOf(j10);
        } else {
            this.f23170k = null;
            this.f23169j = Long.valueOf(j10);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeValue(this.f23169j);
        parcel.writeValue(this.f23170k);
    }
}
