package com.facebook.react.views.text;

import I0.A;
import I0.z;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.AbstractC1658a0;
import com.facebook.react.R;
import com.facebook.react.uimanager.ReactAccessibilityDelegate;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.views.text.internal.span.ReactClickableSpan;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import j7.AbstractC2793j;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l7.AbstractC2884a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 =2\u00020\u0001:\u0002=>B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010!\u001a\u00020\u00172\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060\u001fH\u0014¢\u0006\u0004\b!\u0010\"J\u001f\u0010&\u001a\u00020\u00062\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#H\u0014¢\u0006\u0004\b&\u0010'J7\u0010-\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010(2\u0006\u0010)\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00062\u000e\u0010,\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010+H\u0004¢\u0006\u0004\b-\u0010.J\u001f\u00102\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u00022\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b2\u00103J\u001f\u00105\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u00104\u001a\u000200H\u0014¢\u0006\u0004\b5\u00106J\u0019\u00108\u001a\u0004\u0018\u0001072\u0006\u0010/\u001a\u00020\u0002H\u0016¢\u0006\u0004\b8\u00109R\u0018\u0010;\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006?"}, d2 = {"Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate;", "Lcom/facebook/react/uimanager/ReactAccessibilityDelegate;", "Landroid/view/View;", "view", PointerEventHelper.POINTER_TYPE_UNKNOWN, "originalFocus", PointerEventHelper.POINTER_TYPE_UNKNOWN, "originalImportantForAccessibility", "<init>", "(Landroid/view/View;ZI)V", "Landroid/text/Layout;", "getLayoutFromHost", "()Landroid/text/Layout;", "Landroid/text/Spanned;", "getSpannedFromHost", "()Landroid/text/Spanned;", "Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate$AccessibilityLinks$AccessibleLink;", "accessibleLink", "Landroid/graphics/Rect;", "getBoundsInParent", "(Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate$AccessibilityLinks$AccessibleLink;)Landroid/graphics/Rect;", "virtualViewId", "hasFocus", "Li7/B;", "onVirtualViewKeyboardFocusChanged", "(IZ)V", "action", "Landroid/os/Bundle;", "arguments", "onPerformActionForVirtualView", "(IILandroid/os/Bundle;)Z", PointerEventHelper.POINTER_TYPE_UNKNOWN, "virtualViewIds", "getVisibleVirtualViews", "(Ljava/util/List;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "x", "y", "getVirtualViewAt", "(FF)I", "T", ViewProps.START, ViewProps.END, "Ljava/lang/Class;", "classType", "getFirstSpan", "(IILjava/lang/Class;)Ljava/lang/Object;", "host", "LI0/z;", "info", "onInitializeAccessibilityNodeInfo", "(Landroid/view/View;LI0/z;)V", "node", "onPopulateNodeForVirtualView", "(ILI0/z;)V", "LI0/A;", "getAccessibilityNodeProvider", "(Landroid/view/View;)LI0/A;", "Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate$AccessibilityLinks;", "accessibilityLinks", "Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate$AccessibilityLinks;", "Companion", "AccessibilityLinks", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactTextViewAccessibilityDelegate extends ReactAccessibilityDelegate {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private AccessibilityLinks accessibilityLinks;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u000bJ\u0018\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bJ\u0006\u0010\u000f\u001a\u00020\u000bR\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate$AccessibilityLinks;", PointerEventHelper.POINTER_TYPE_UNKNOWN, ReactTextInputShadowNode.PROP_TEXT, "Landroid/text/Spanned;", "<init>", "(Landroid/text/Spanned;)V", "links", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate$AccessibilityLinks$AccessibleLink;", "getLinkById", "id", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getLinkBySpanPos", ViewProps.START, ViewProps.END, "size", "AccessibleLink", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AccessibilityLinks {
        private final List<AccessibleLink> links;

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000f¨\u0006\u0016"}, d2 = {"Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate$AccessibilityLinks$AccessibleLink;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "description", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getDescription", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", ViewProps.START, PointerEventHelper.POINTER_TYPE_UNKNOWN, "getStart", "()I", "setStart", "(I)V", ViewProps.END, "getEnd", "setEnd", "id", "getId", "setId", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class AccessibleLink {
            private String description;
            private int end;
            private int id;
            private int start;

            public final String getDescription() {
                return this.description;
            }

            public final int getEnd() {
                return this.end;
            }

            public final int getId() {
                return this.id;
            }

            public final int getStart() {
                return this.start;
            }

            public final void setDescription(String str) {
                this.description = str;
            }

            public final void setEnd(int i10) {
                this.end = i10;
            }

            public final void setId(int i10) {
                this.id = i10;
            }

            public final void setStart(int i10) {
                this.start = i10;
            }
        }

        public AccessibilityLinks(final Spanned text) {
            AbstractC2855l.g(text, "text");
            ArrayList arrayList = new ArrayList();
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) text.getSpans(0, text.length(), ClickableSpan.class);
            AbstractC2855l.d(clickableSpanArr);
            if (clickableSpanArr.length > 1) {
                AbstractC2793j.v(clickableSpanArr, new Comparator() { // from class: com.facebook.react.views.text.ReactTextViewAccessibilityDelegate$AccessibilityLinks$special$$inlined$sortBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t10, T t11) {
                        return AbstractC2884a.a(Integer.valueOf(text.getSpanStart((ClickableSpan) t10)), Integer.valueOf(text.getSpanStart((ClickableSpan) t11)));
                    }
                });
            }
            int length = clickableSpanArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                ClickableSpan clickableSpan = clickableSpanArr[i10];
                int spanStart = text.getSpanStart(clickableSpan);
                int spanEnd = text.getSpanEnd(clickableSpan);
                if (spanStart != spanEnd && spanStart >= 0 && spanEnd >= 0 && spanStart <= text.length() && spanEnd <= text.length()) {
                    AccessibleLink accessibleLink = new AccessibleLink();
                    accessibleLink.setDescription(text.subSequence(spanStart, spanEnd).toString());
                    accessibleLink.setStart(spanStart);
                    accessibleLink.setEnd(spanEnd);
                    accessibleLink.setId(i10);
                    arrayList.add(accessibleLink);
                }
            }
            this.links = arrayList;
        }

        public final AccessibleLink getLinkById(int id) {
            for (AccessibleLink accessibleLink : this.links) {
                if (accessibleLink.getId() == id) {
                    return accessibleLink;
                }
            }
            return null;
        }

        public final AccessibleLink getLinkBySpanPos(int start, int end) {
            for (AccessibleLink accessibleLink : this.links) {
                if (accessibleLink.getStart() == start && accessibleLink.getEnd() == end) {
                    return accessibleLink;
                }
            }
            return null;
        }

        public final int size() {
            return this.links.size();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "Landroid/view/View;", "view", PointerEventHelper.POINTER_TYPE_UNKNOWN, "originalFocus", PointerEventHelper.POINTER_TYPE_UNKNOWN, "originalImportantForAccessibility", "Li7/B;", "setDelegate", "(Landroid/view/View;ZI)V", "resetDelegate", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void resetDelegate(View view, boolean originalFocus, int originalImportantForAccessibility) {
            AbstractC2855l.g(view, "view");
            AbstractC1658a0.k0(view, new ReactTextViewAccessibilityDelegate(view, originalFocus, originalImportantForAccessibility));
        }

        public final void setDelegate(View view, boolean originalFocus, int originalImportantForAccessibility) {
            AbstractC2855l.g(view, "view");
            if (AbstractC1658a0.M(view)) {
                return;
            }
            if (view.getTag(R.id.accessibility_role) == null && view.getTag(R.id.accessibility_state) == null && view.getTag(R.id.accessibility_actions) == null && view.getTag(R.id.react_test_id) == null && view.getTag(R.id.accessibility_collection_item) == null && view.getTag(R.id.accessibility_links) == null && view.getTag(R.id.role) == null) {
                return;
            }
            AbstractC1658a0.k0(view, new ReactTextViewAccessibilityDelegate(view, originalFocus, originalImportantForAccessibility));
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactTextViewAccessibilityDelegate(View view, boolean z10, int i10) {
        super(view, z10, i10);
        AbstractC2855l.g(view, "view");
        this.accessibilityLinks = (AccessibilityLinks) getHostView().getTag(R.id.accessibility_links);
    }

    private final Rect getBoundsInParent(AccessibilityLinks.AccessibleLink accessibleLink) {
        if (!(getHostView() instanceof TextView) && !(getHostView() instanceof PreparedLayoutTextView)) {
            return new Rect(0, 0, getHostView().getWidth(), getHostView().getHeight());
        }
        Layout layoutFromHost = getLayoutFromHost();
        if (layoutFromHost == null) {
            return new Rect(0, 0, getHostView().getWidth(), getHostView().getHeight());
        }
        int start = accessibleLink.getStart();
        int end = accessibleLink.getEnd();
        int lineForOffset = layoutFromHost.getLineForOffset(start);
        int lineEnd = layoutFromHost.getLineEnd(lineForOffset);
        int lineForOffset2 = layoutFromHost.getLineForOffset(end);
        int lineEnd2 = layoutFromHost.getLineEnd(lineForOffset2);
        if (start > lineEnd || end > lineEnd2) {
            return null;
        }
        Rect rect = new Rect();
        double primaryHorizontal = layoutFromHost.getPrimaryHorizontal(start);
        boolean z10 = lineForOffset != lineForOffset2;
        layoutFromHost.getLineBounds(lineForOffset, rect);
        int scrollY = getHostView().getScrollY() + getHostView().getPaddingTop();
        rect.top += scrollY;
        rect.bottom += scrollY;
        rect.left = (int) (((double) rect.left) + ((primaryHorizontal + ((double) getHostView().getPaddingLeft())) - ((double) getHostView().getScrollX())));
        if (z10) {
            return new Rect(rect.left, rect.top, rect.right, rect.bottom);
        }
        return new Rect(rect.left, rect.top, (int) layoutFromHost.getPrimaryHorizontal(end), rect.bottom);
    }

    private final Layout getLayoutFromHost() {
        if (!(getHostView() instanceof PreparedLayoutTextView)) {
            if (!(getHostView() instanceof TextView)) {
                return null;
            }
            View hostView = getHostView();
            AbstractC2855l.e(hostView, "null cannot be cast to non-null type android.widget.TextView");
            return ((TextView) hostView).getLayout();
        }
        View hostView2 = getHostView();
        AbstractC2855l.e(hostView2, "null cannot be cast to non-null type com.facebook.react.views.text.PreparedLayoutTextView");
        PreparedLayout preparedLayout = ((PreparedLayoutTextView) hostView2).getPreparedLayout();
        if (preparedLayout != null) {
            return preparedLayout.getLayout();
        }
        return null;
    }

    private final Spanned getSpannedFromHost() {
        Layout layout;
        View hostView = getHostView();
        if (hostView instanceof PreparedLayoutTextView) {
            PreparedLayout preparedLayout = ((PreparedLayoutTextView) hostView).getPreparedLayout();
            CharSequence text = (preparedLayout == null || (layout = preparedLayout.getLayout()) == null) ? null : layout.getText();
            if (text instanceof Spanned) {
                return (Spanned) text;
            }
            return null;
        }
        if (hostView instanceof TextView) {
            CharSequence text2 = ((TextView) hostView).getText();
            if (text2 instanceof Spanned) {
                return (Spanned) text2;
            }
        }
        return null;
    }

    @Override // com.facebook.react.uimanager.ReactAccessibilityDelegate, androidx.customview.widget.a, androidx.core.view.C1657a
    public A getAccessibilityNodeProvider(View host) {
        AbstractC2855l.g(host, "host");
        if (this.accessibilityLinks != null) {
            return superGetAccessibilityNodeProvider(host);
        }
        return null;
    }

    protected final <T> T getFirstSpan(int start, int end, Class<T> classType) {
        Spanned spannedFromHost = getSpannedFromHost();
        if (spannedFromHost == null) {
            return null;
        }
        Object[] spans = spannedFromHost.getSpans(start, end, classType);
        AbstractC2855l.d(spans);
        if (spans.length == 0) {
            return null;
        }
        return (T) spans[0];
    }

    @Override // com.facebook.react.uimanager.ReactAccessibilityDelegate, androidx.customview.widget.a
    protected int getVirtualViewAt(float x10, float y10) {
        Spanned spannedFromHost;
        AccessibilityLinks.AccessibleLink linkBySpanPos;
        AccessibilityLinks accessibilityLinks = this.accessibilityLinks;
        if (accessibilityLinks != null && accessibilityLinks.size() != 0 && ((getHostView() instanceof TextView) || (getHostView() instanceof PreparedLayoutTextView))) {
            float paddingLeft = (x10 - getHostView().getPaddingLeft()) + getHostView().getScrollX();
            float paddingTop = (y10 - getHostView().getPaddingTop()) + getHostView().getScrollY();
            Layout layoutFromHost = getLayoutFromHost();
            if (layoutFromHost == null) {
                return androidx.customview.widget.a.INVALID_ID;
            }
            int offsetForHorizontal = layoutFromHost.getOffsetForHorizontal(layoutFromHost.getLineForVertical((int) paddingTop), paddingLeft);
            ClickableSpan clickableSpan = (ClickableSpan) getFirstSpan(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (clickableSpan != null && (spannedFromHost = getSpannedFromHost()) != null && (linkBySpanPos = accessibilityLinks.getLinkBySpanPos(spannedFromHost.getSpanStart(clickableSpan), spannedFromHost.getSpanEnd(clickableSpan))) != null) {
                return linkBySpanPos.getId();
            }
        }
        return androidx.customview.widget.a.INVALID_ID;
    }

    @Override // com.facebook.react.uimanager.ReactAccessibilityDelegate, androidx.customview.widget.a
    protected void getVisibleVirtualViews(List<Integer> virtualViewIds) {
        AbstractC2855l.g(virtualViewIds, "virtualViewIds");
        AccessibilityLinks accessibilityLinks = this.accessibilityLinks;
        if (accessibilityLinks == null) {
            return;
        }
        int size = accessibilityLinks.size();
        for (int i10 = 0; i10 < size; i10++) {
            virtualViewIds.add(Integer.valueOf(i10));
        }
    }

    @Override // com.facebook.react.uimanager.ReactAccessibilityDelegate, androidx.customview.widget.a, androidx.core.view.C1657a
    public void onInitializeAccessibilityNodeInfo(View host, z info) {
        AbstractC2855l.g(host, "host");
        AbstractC2855l.g(info, "info");
        super.onInitializeAccessibilityNodeInfo(host, info);
        if (host instanceof PreparedLayoutTextView) {
            info.X0(((PreparedLayoutTextView) host).getText());
        }
    }

    @Override // com.facebook.react.uimanager.ReactAccessibilityDelegate, androidx.customview.widget.a
    protected boolean onPerformActionForVirtualView(int virtualViewId, int action, Bundle arguments) {
        AccessibilityLinks.AccessibleLink linkById;
        ClickableSpan clickableSpan;
        AccessibilityLinks accessibilityLinks = this.accessibilityLinks;
        if (accessibilityLinks == null || accessibilityLinks == null || (linkById = accessibilityLinks.getLinkById(virtualViewId)) == null || (clickableSpan = (ClickableSpan) getFirstSpan(linkById.getStart(), linkById.getEnd(), ClickableSpan.class)) == null || action != 16) {
            return false;
        }
        clickableSpan.onClick(getHostView());
        return true;
    }

    @Override // com.facebook.react.uimanager.ReactAccessibilityDelegate, androidx.customview.widget.a
    protected void onPopulateNodeForVirtualView(int virtualViewId, z node) {
        AbstractC2855l.g(node, "node");
        AccessibilityLinks accessibilityLinks = this.accessibilityLinks;
        if (accessibilityLinks == null) {
            node.A0(PointerEventHelper.POINTER_TYPE_UNKNOWN);
            node.s0(new Rect(0, 0, 1, 1));
            return;
        }
        AccessibilityLinks.AccessibleLink linkById = accessibilityLinks.getLinkById(virtualViewId);
        if (linkById == null) {
            node.A0(PointerEventHelper.POINTER_TYPE_UNKNOWN);
            node.s0(new Rect(0, 0, 1, 1));
            return;
        }
        Rect boundsInParent = getBoundsInParent(linkById);
        if (boundsInParent == null) {
            node.A0(PointerEventHelper.POINTER_TYPE_UNKNOWN);
            node.s0(new Rect(0, 0, 1, 1));
            return;
        }
        node.A0(linkById.getDescription());
        node.a(16);
        node.s0(boundsInParent);
        node.P0(getHostView().getResources().getString(R.string.link_description));
        node.w0(ReactAccessibilityDelegate.AccessibilityRole.INSTANCE.getValue(ReactAccessibilityDelegate.AccessibilityRole.BUTTON));
    }

    @Override // androidx.customview.widget.a
    protected void onVirtualViewKeyboardFocusChanged(int virtualViewId, boolean hasFocus) {
        AccessibilityLinks.AccessibleLink linkById;
        ClickableSpan clickableSpan;
        AccessibilityLinks accessibilityLinks = this.accessibilityLinks;
        if (accessibilityLinks == null || accessibilityLinks == null || (linkById = accessibilityLinks.getLinkById(virtualViewId)) == null || (clickableSpan = (ClickableSpan) getFirstSpan(linkById.getStart(), linkById.getEnd(), ClickableSpan.class)) == null) {
            return;
        }
        if ((clickableSpan instanceof ReactClickableSpan) && (getHostView() instanceof TextView)) {
            ReactClickableSpan reactClickableSpan = (ReactClickableSpan) clickableSpan;
            reactClickableSpan.setKeyboardFocused(hasFocus);
            View hostView = getHostView();
            AbstractC2855l.e(hostView, "null cannot be cast to non-null type android.widget.TextView");
            reactClickableSpan.setFocusBgColor(((TextView) hostView).getHighlightColor());
            getHostView().invalidate();
            return;
        }
        if (getHostView() instanceof PreparedLayoutTextView) {
            if (hasFocus) {
                View hostView2 = getHostView();
                AbstractC2855l.e(hostView2, "null cannot be cast to non-null type com.facebook.react.views.text.PreparedLayoutTextView");
                ((PreparedLayoutTextView) hostView2).setSelection(linkById.getStart(), linkById.getEnd());
            } else {
                View hostView3 = getHostView();
                AbstractC2855l.e(hostView3, "null cannot be cast to non-null type com.facebook.react.views.text.PreparedLayoutTextView");
                ((PreparedLayoutTextView) hostView3).clearSelection();
            }
        }
    }
}
