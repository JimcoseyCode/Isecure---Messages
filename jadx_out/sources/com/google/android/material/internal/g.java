package com.google.android.material.internal;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import com.facebook.react.uimanager.ViewDefaults;
import com.facebook.react.uimanager.events.PointerEventHelper;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final int f23458o = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CharSequence f23459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TextPaint f23460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f23461c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f23463e;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f23470l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private h f23472n;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f23462d = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Layout.Alignment f23464f = Layout.Alignment.ALIGN_NORMAL;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f23465g = ViewDefaults.NUMBER_OF_LINES;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f23466h = 0.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f23467i = 1.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f23468j = f23458o;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f23469k = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private TextUtils.TruncateAt f23471m = null;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class a extends Exception {
    }

    private g(CharSequence charSequence, TextPaint textPaint, int i10) {
        this.f23459a = charSequence;
        this.f23460b = textPaint;
        this.f23461c = i10;
        this.f23463e = charSequence.length();
    }

    public static g b(CharSequence charSequence, TextPaint textPaint, int i10) {
        return new g(charSequence, textPaint, i10);
    }

    public StaticLayout a() {
        if (this.f23459a == null) {
            this.f23459a = PointerEventHelper.POINTER_TYPE_UNKNOWN;
        }
        int iMax = Math.max(0, this.f23461c);
        CharSequence charSequenceEllipsize = this.f23459a;
        if (this.f23465g == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.f23460b, iMax, this.f23471m);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f23463e);
        this.f23463e = iMin;
        if (this.f23470l && this.f23465g == 1) {
            this.f23464f = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, this.f23462d, iMin, this.f23460b, iMax);
        builderObtain.setAlignment(this.f23464f);
        builderObtain.setIncludePad(this.f23469k);
        builderObtain.setTextDirection(this.f23470l ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f23471m;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f23465g);
        float f10 = this.f23466h;
        if (f10 != 0.0f || this.f23467i != 1.0f) {
            builderObtain.setLineSpacing(f10, this.f23467i);
        }
        if (this.f23465g > 1) {
            builderObtain.setHyphenationFrequency(this.f23468j);
        }
        h hVar = this.f23472n;
        if (hVar != null) {
            hVar.a(builderObtain);
        }
        return builderObtain.build();
    }

    public g c(Layout.Alignment alignment) {
        this.f23464f = alignment;
        return this;
    }

    public g d(TextUtils.TruncateAt truncateAt) {
        this.f23471m = truncateAt;
        return this;
    }

    public g e(int i10) {
        this.f23468j = i10;
        return this;
    }

    public g f(boolean z10) {
        this.f23469k = z10;
        return this;
    }

    public g g(boolean z10) {
        this.f23470l = z10;
        return this;
    }

    public g h(float f10, float f11) {
        this.f23466h = f10;
        this.f23467i = f11;
        return this;
    }

    public g i(int i10) {
        this.f23465g = i10;
        return this;
    }

    public g j(h hVar) {
        this.f23472n = hVar;
        return this;
    }
}
