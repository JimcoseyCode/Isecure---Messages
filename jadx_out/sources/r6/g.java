package r6;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import kotlin.jvm.internal.AbstractC2855l;
import w7.r;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EditText f31968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r f31969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f31970c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f31971d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f31972e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ViewTreeObserver.OnPreDrawListener f31973f;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a implements ViewTreeObserver.OnPreDrawListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            int paddingTop;
            int paddingTop2;
            Drawable textCursorDrawable;
            int selectionStart = g.this.f31968a.getSelectionStart();
            int selectionEnd = g.this.f31968a.getSelectionEnd();
            int height = g.this.f31968a.getHeight();
            EditText editText = g.this.f31968a;
            Layout layout = editText.getLayout();
            if (layout == null) {
                return true;
            }
            if (g.this.f31970c != selectionStart || g.this.f31971d != selectionEnd || g.this.f31972e != height) {
                g.this.f31970c = selectionStart;
                g.this.f31971d = selectionEnd;
                g.this.f31972e = height;
                int iMin = Math.min(selectionStart, selectionEnd);
                int iMax = Math.max(selectionStart, selectionEnd);
                int lineTop = layout.getLineTop(layout.getLineForOffset(iMin));
                int height2 = layout.getHeight();
                int intrinsicWidth = 0;
                if (Build.VERSION.SDK_INT >= 29 && (textCursorDrawable = editText.getTextCursorDrawable()) != null) {
                    intrinsicWidth = textCursorDrawable.getIntrinsicWidth();
                }
                int gravity = g.this.f31968a.getGravity() & 112;
                int paddingTop3 = g.this.f31968a.getPaddingTop() + g.this.f31968a.getPaddingBottom();
                int lineHeight = g.this.f31968a.getLineHeight() / 2;
                int i10 = height - paddingTop3;
                if (height2 > i10) {
                    paddingTop = g.this.f31968a.getPaddingTop();
                } else if (gravity == 16) {
                    paddingTop = ((i10 - height2) / 2) + g.this.f31968a.getPaddingTop();
                } else if (gravity != 80) {
                    paddingTop = g.this.f31968a.getPaddingTop();
                } else {
                    paddingTop2 = g.this.f31968a.getPaddingTop() + (i10 - height2) + lineHeight;
                    float primaryHorizontal = layout.getPrimaryHorizontal(iMin);
                    float scrollY = (lineTop + paddingTop2) - editText.getScrollY();
                    int lineForOffset = layout.getLineForOffset(iMax);
                    g.this.f31969b.m(Integer.valueOf(selectionStart), Integer.valueOf(selectionEnd), Double.valueOf(AbstractC3277f.a(primaryHorizontal)), Double.valueOf(AbstractC3277f.a(scrollY)), Double.valueOf(AbstractC3277f.a(layout.getPrimaryHorizontal(iMax) + intrinsicWidth)), Double.valueOf(AbstractC3277f.a((layout.getLineBottom(lineForOffset) + paddingTop2) - editText.getScrollY())));
                }
                paddingTop2 = paddingTop + lineHeight;
                float primaryHorizontal2 = layout.getPrimaryHorizontal(iMin);
                float scrollY2 = (lineTop + paddingTop2) - editText.getScrollY();
                int lineForOffset2 = layout.getLineForOffset(iMax);
                g.this.f31969b.m(Integer.valueOf(selectionStart), Integer.valueOf(selectionEnd), Double.valueOf(AbstractC3277f.a(primaryHorizontal2)), Double.valueOf(AbstractC3277f.a(scrollY2)), Double.valueOf(AbstractC3277f.a(layout.getPrimaryHorizontal(iMax) + intrinsicWidth)), Double.valueOf(AbstractC3277f.a((layout.getLineBottom(lineForOffset2) + paddingTop2) - editText.getScrollY())));
            }
            return true;
        }
    }

    public g(EditText editText, r action) {
        AbstractC2855l.g(editText, "editText");
        AbstractC2855l.g(action, "action");
        this.f31968a = editText;
        this.f31969b = action;
        this.f31970c = -1;
        this.f31971d = -1;
        this.f31972e = -1;
        this.f31973f = new a();
    }

    public final void i() {
        this.f31968a.getViewTreeObserver().removeOnPreDrawListener(this.f31973f);
    }

    public final void j() {
        this.f31968a.getViewTreeObserver().addOnPreDrawListener(this.f31973f);
    }
}
