package G0;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l implements Spannable {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final TextPaint f2166a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final TextDirectionHeuristic f2167b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f2168c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f2169d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final PrecomputedText.Params f2170e;

        /* JADX INFO: renamed from: G0.l$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static class C0046a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final TextPaint f2171a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f2173c = 1;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f2174d = 1;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private TextDirectionHeuristic f2172b = TextDirectionHeuristics.FIRSTSTRONG_LTR;

            public C0046a(TextPaint textPaint) {
                this.f2171a = textPaint;
            }

            public a a() {
                return new a(this.f2171a, this.f2172b, this.f2173c, this.f2174d);
            }

            public C0046a b(int i10) {
                this.f2173c = i10;
                return this;
            }

            public C0046a c(int i10) {
                this.f2174d = i10;
                return this;
            }

            public C0046a d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f2172b = textDirectionHeuristic;
                return this;
            }
        }

        a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i10, int i11) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f2170e = k.a(textPaint).setBreakStrategy(i10).setHyphenationFrequency(i11).setTextDirection(textDirectionHeuristic).build();
            } else {
                this.f2170e = null;
            }
            this.f2166a = textPaint;
            this.f2167b = textDirectionHeuristic;
            this.f2168c = i10;
            this.f2169d = i11;
        }

        public boolean a(a aVar) {
            if (this.f2168c == aVar.b() && this.f2169d == aVar.c() && this.f2166a.getTextSize() == aVar.e().getTextSize() && this.f2166a.getTextScaleX() == aVar.e().getTextScaleX() && this.f2166a.getTextSkewX() == aVar.e().getTextSkewX() && this.f2166a.getLetterSpacing() == aVar.e().getLetterSpacing() && TextUtils.equals(this.f2166a.getFontFeatureSettings(), aVar.e().getFontFeatureSettings()) && this.f2166a.getFlags() == aVar.e().getFlags() && this.f2166a.getTextLocales().equals(aVar.e().getTextLocales())) {
                return this.f2166a.getTypeface() == null ? aVar.e().getTypeface() == null : this.f2166a.getTypeface().equals(aVar.e().getTypeface());
            }
            return false;
        }

        public int b() {
            return this.f2168c;
        }

        public int c() {
            return this.f2169d;
        }

        public TextDirectionHeuristic d() {
            return this.f2167b;
        }

        public TextPaint e() {
            return this.f2166a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return a(aVar) && this.f2167b == aVar.d();
        }

        public int hashCode() {
            return H0.c.b(Float.valueOf(this.f2166a.getTextSize()), Float.valueOf(this.f2166a.getTextScaleX()), Float.valueOf(this.f2166a.getTextSkewX()), Float.valueOf(this.f2166a.getLetterSpacing()), Integer.valueOf(this.f2166a.getFlags()), this.f2166a.getTextLocales(), this.f2166a.getTypeface(), Boolean.valueOf(this.f2166a.isElegantTextHeight()), this.f2167b, Integer.valueOf(this.f2168c), Integer.valueOf(this.f2169d));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{");
            sb.append("textSize=" + this.f2166a.getTextSize());
            sb.append(", textScaleX=" + this.f2166a.getTextScaleX());
            sb.append(", textSkewX=" + this.f2166a.getTextSkewX());
            int i10 = Build.VERSION.SDK_INT;
            sb.append(", letterSpacing=" + this.f2166a.getLetterSpacing());
            sb.append(", elegantTextHeight=" + this.f2166a.isElegantTextHeight());
            sb.append(", textLocale=" + this.f2166a.getTextLocales());
            sb.append(", typeface=" + this.f2166a.getTypeface());
            if (i10 >= 26) {
                sb.append(", variationSettings=" + this.f2166a.getFontVariationSettings());
            }
            sb.append(", textDir=" + this.f2167b);
            sb.append(", breakStrategy=" + this.f2168c);
            sb.append(", hyphenationFrequency=" + this.f2169d);
            sb.append("}");
            return sb.toString();
        }

        public a(PrecomputedText.Params params) {
            this.f2166a = params.getTextPaint();
            this.f2167b = params.getTextDirection();
            this.f2168c = params.getBreakStrategy();
            this.f2169d = params.getHyphenationFrequency();
            this.f2170e = Build.VERSION.SDK_INT < 29 ? null : params;
        }
    }
}
