package androidx.emoji2.text;

import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j extends ReplacementSpan {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final p f17144h;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Paint.FontMetricsInt f17143g = new Paint.FontMetricsInt();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private short f17145i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private short f17146j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f17147k = 1.0f;

    j(p pVar) {
        H0.g.h(pVar, "rasterizer cannot be null");
        this.f17144h = pVar;
    }

    public final p a() {
        return this.f17144h;
    }

    final int b() {
        return this.f17145i;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f17143g);
        Paint.FontMetricsInt fontMetricsInt2 = this.f17143g;
        this.f17147k = (Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f) / this.f17144h.e();
        this.f17146j = (short) (this.f17144h.e() * this.f17147k);
        short sI = (short) (this.f17144h.i() * this.f17147k);
        this.f17145i = sI;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f17143g;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return sI;
    }
}
