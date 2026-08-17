package com.swmansion.rnscreens;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import f.AbstractC2573f;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SearchView f25322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f25323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Drawable f25324c;

    public o0(SearchView searchView) {
        AbstractC2855l.g(searchView, "searchView");
        this.f25322a = searchView;
    }

    private final ImageView a() {
        return (ImageView) this.f25322a.findViewById(AbstractC2573f.f26864z);
    }

    private final EditText b() {
        View viewFindViewById = this.f25322a.findViewById(AbstractC2573f.f26826E);
        if (viewFindViewById instanceof EditText) {
            return (EditText) viewFindViewById;
        }
        return null;
    }

    private final ImageView c() {
        return (ImageView) this.f25322a.findViewById(AbstractC2573f.f26863y);
    }

    private final View d() {
        return this.f25322a.findViewById(AbstractC2573f.f26825D);
    }

    public final void e(Integer num) {
        if (num != null) {
            int iIntValue = num.intValue();
            c().setColorFilter(iIntValue);
            a().setColorFilter(iIntValue);
        }
    }

    public final void f(Integer num) {
        if (num != null) {
            int iIntValue = num.intValue();
            EditText editTextB = b();
            if (editTextB != null) {
                editTextB.setHintTextColor(iIntValue);
            }
        }
    }

    public final void g(String placeholder, boolean z10) {
        AbstractC2855l.g(placeholder, "placeholder");
        if (z10) {
            this.f25322a.setQueryHint(placeholder);
            return;
        }
        EditText editTextB = b();
        if (editTextB != null) {
            editTextB.setHint(placeholder);
        }
    }

    public final void h(Integer num) {
        EditText editTextB;
        ColorStateList textColors;
        Integer num2 = this.f25323b;
        if (num == null) {
            if (num2 == null || (editTextB = b()) == null) {
                return;
            }
            editTextB.setTextColor(num2.intValue());
            return;
        }
        if (num2 == null) {
            EditText editTextB2 = b();
            this.f25323b = (editTextB2 == null || (textColors = editTextB2.getTextColors()) == null) ? null : Integer.valueOf(textColors.getDefaultColor());
        }
        EditText editTextB3 = b();
        if (editTextB3 != null) {
            editTextB3.setTextColor(num.intValue());
        }
    }

    public final void i(Integer num) {
        Drawable drawable = this.f25324c;
        if (num != null) {
            if (drawable == null) {
                this.f25324c = d().getBackground();
            }
            d().setBackgroundColor(num.intValue());
        } else if (drawable != null) {
            d().setBackground(drawable);
        }
    }
}
