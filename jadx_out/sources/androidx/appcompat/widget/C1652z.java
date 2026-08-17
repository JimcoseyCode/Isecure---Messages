package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* JADX INFO: renamed from: androidx.appcompat.widget.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C1652z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private TextView f15096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TextClassifier f15097b;

    /* JADX INFO: renamed from: androidx.appcompat.widget.z$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class a {
        static TextClassifier a(TextView textView) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
            return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
        }
    }

    C1652z(TextView textView) {
        this.f15096a = (TextView) H0.g.g(textView);
    }

    public TextClassifier a() {
        TextClassifier textClassifier = this.f15097b;
        return textClassifier == null ? a.a(this.f15096a) : textClassifier;
    }

    public void b(TextClassifier textClassifier) {
        this.f15097b = textClassifier;
    }
}
