package I0;

import I0.C;
import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import v0.AbstractC3415c;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class z {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f3852d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AccessibilityNodeInfo f3853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3854b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f3855c = -1;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class a {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public static final a f3856A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public static final a f3857B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public static final a f3858C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final a f3859D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public static final a f3860E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public static final a f3861F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        public static final a f3862G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        public static final a f3863H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public static final a f3864I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        public static final a f3865J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        public static final a f3866K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public static final a f3867L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        public static final a f3868M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        public static final a f3869N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final a f3870O;

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        public static final a f3871P;

        /* JADX INFO: renamed from: Q, reason: collision with root package name */
        public static final a f3872Q;

        /* JADX INFO: renamed from: R, reason: collision with root package name */
        public static final a f3873R;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        public static final a f3874S;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        public static final a f3875T;

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        public static final a f3876U;

        /* JADX INFO: renamed from: V, reason: collision with root package name */
        public static final a f3877V;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f3878e = new a(1, null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f3879f = new a(2, null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f3880g = new a(4, null);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final a f3881h = new a(8, null);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final a f3882i = new a(16, null);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final a f3883j = new a(32, null);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final a f3884k = new a(64, null);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final a f3885l = new a(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT, null);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final a f3886m = new a(256, (CharSequence) null, C.b.class);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final a f3887n = new a(IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING, (CharSequence) null, C.b.class);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final a f3888o = new a(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET, (CharSequence) null, C.c.class);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final a f3889p = new a(2048, (CharSequence) null, C.c.class);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final a f3890q = new a(4096, null);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final a f3891r = new a(8192, null);

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final a f3892s = new a(16384, null);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final a f3893t = new a(32768, null);

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final a f3894u = new a(65536, null);

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final a f3895v = new a(131072, (CharSequence) null, C.g.class);

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final a f3896w = new a(262144, null);

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final a f3897x = new a(524288, null);

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final a f3898y = new a(1048576, null);

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final a f3899z = new a(2097152, (CharSequence) null, C.h.class);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f3900a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f3901b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Class f3902c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        protected final C f3903d;

        static {
            int i10 = Build.VERSION.SDK_INT;
            f3856A = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
            f3857B = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, C.e.class);
            f3858C = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
            f3859D = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
            f3860E = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
            f3861F = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
            f3862G = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
            f3863H = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
            f3864I = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
            f3865J = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
            f3866K = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
            f3867L = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, C.f.class);
            f3868M = new a(i10 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, C.d.class);
            f3869N = new a(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
            f3870O = new a(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
            f3871P = new a(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
            f3872Q = new a(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
            f3873R = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
            f3874S = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
            f3875T = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
            f3876U = new a(i10 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
            f3877V = new a(i10 >= 34 ? d.a() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
        }

        public a(int i10, CharSequence charSequence) {
            this(null, i10, charSequence, null, null);
        }

        public a a(CharSequence charSequence, C c10) {
            return new a(null, this.f3901b, charSequence, c10, this.f3902c);
        }

        public int b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f3900a).getId();
        }

        public CharSequence c() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f3900a).getLabel();
        }

        public boolean d(View view, Bundle bundle) {
            if (this.f3903d == null) {
                return false;
            }
            Class cls = this.f3902c;
            if (cls != null) {
                try {
                    android.support.v4.media.session.b.a(cls.getDeclaredConstructor(null).newInstance(null));
                    throw null;
                } catch (Exception unused) {
                    Class cls2 = this.f3902c;
                    if (cls2 != null) {
                        cls2.getName();
                    }
                }
            }
            return this.f3903d.a(view, null);
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            Object obj2 = this.f3900a;
            return obj2 == null ? aVar.f3900a == null : obj2.equals(aVar.f3900a);
        }

        public int hashCode() {
            Object obj = this.f3900a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AccessibilityActionCompat: ");
            String strJ = z.j(this.f3901b);
            if (strJ.equals("ACTION_UNKNOWN") && c() != null) {
                strJ = c().toString();
            }
            sb.append(strJ);
            return sb.toString();
        }

        public a(int i10, CharSequence charSequence, C c10) {
            this(null, i10, charSequence, c10, null);
        }

        a(Object obj) {
            this(obj, 0, null, null, null);
        }

        private a(int i10, CharSequence charSequence, Class cls) {
            this(null, i10, charSequence, null, cls);
        }

        a(Object obj, int i10, CharSequence charSequence, C c10, Class cls) {
            this.f3901b = i10;
            this.f3903d = c10;
            if (obj == null) {
                this.f3900a = new AccessibilityNodeInfo.AccessibilityAction(i10, charSequence);
            } else {
                this.f3900a = obj;
            }
            this.f3902c = cls;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class b {
        public static CharSequence a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getStateDescription();
        }

        public static void b(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setStateDescription(charSequence);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class c {
        public static String a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getUniqueId();
        }

        public static boolean b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isTextSelectable();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class d {
        public static AccessibilityNodeInfo.AccessibilityAction a() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
        }

        public static void b(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.getBoundsInWindow(rect);
        }

        public static CharSequence c(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getContainerTitle();
        }

        public static boolean d(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isAccessibilityDataSensitive();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class e {
        /* JADX INFO: Access modifiers changed from: private */
        public static int b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getChecked();
        }

        public static int c(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getExpandedState();
        }

        public static CharSequence d(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getSupplementalDescription();
        }

        public static boolean e(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isFieldRequired();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f3904a;

        f(Object obj) {
            this.f3904a = obj;
        }

        public static f a(int i10, int i11, boolean z10) {
            return new f(AccessibilityNodeInfo.CollectionInfo.obtain(i10, i11, z10));
        }

        public static f b(int i10, int i11, boolean z10, int i12) {
            return new f(AccessibilityNodeInfo.CollectionInfo.obtain(i10, i11, z10, i12));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f3905a;

        g(Object obj) {
            this.f3905a = obj;
        }

        public static g a(int i10, int i11, int i12, int i13, boolean z10) {
            return new g(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, z10));
        }

        public static g b(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
            return new g(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, z10, z11));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f3906a;

        h(Object obj) {
            this.f3906a = obj;
        }

        public static h d(int i10, float f10, float f11, float f12) {
            return new h(AccessibilityNodeInfo.RangeInfo.obtain(i10, f10, f11, f12));
        }

        public float a() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f3906a).getCurrent();
        }

        public float b() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f3906a).getMax();
        }

        public float c() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f3906a).getMin();
        }
    }

    private z(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f3853a = accessibilityNodeInfo;
    }

    private SparseArray D(View view) {
        SparseArray sparseArrayG = G(view);
        if (sparseArrayG != null) {
            return sparseArrayG;
        }
        SparseArray sparseArray = new SparseArray();
        view.setTag(AbstractC3415c.f32784I, sparseArray);
        return sparseArray;
    }

    private SparseArray G(View view) {
        return (SparseArray) view.getTag(AbstractC3415c.f32784I);
    }

    private boolean N() {
        return !h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    private int O(ClickableSpan clickableSpan, SparseArray sparseArray) {
        if (sparseArray != null) {
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray.valueAt(i10)).get())) {
                    return sparseArray.keyAt(i10);
                }
            }
        }
        int i11 = f3852d;
        f3852d = i11 + 1;
        return i11;
    }

    public static z d1(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new z(accessibilityNodeInfo);
    }

    private void e(ClickableSpan clickableSpan, Spanned spanned, int i10) {
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i10));
    }

    private void g() {
        this.f3853a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        this.f3853a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        this.f3853a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        this.f3853a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
    }

    private List h(String str) {
        ArrayList<Integer> integerArrayList = this.f3853a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.f3853a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    static String j(int i10) {
        if (i10 == 1) {
            return "ACTION_FOCUS";
        }
        if (i10 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i10) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case IntBufferBatchMountItem.INSTRUCTION_UPDATE_PROPS /* 32 */:
                return "ACTION_LONG_CLICK";
            case IntBufferBatchMountItem.INSTRUCTION_UPDATE_STATE /* 64 */:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT /* 128 */:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING /* 512 */:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET /* 1024 */:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            case R.id.accessibilityActionScrollInDirection:
                return "ACTION_SCROLL_IN_DIRECTION";
            default:
                switch (i10) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i10) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i10) {
                                    case R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case R.id.accessibilityActionDragStart:
                                        return "ACTION_DRAG_START";
                                    case R.id.accessibilityActionDragDrop:
                                        return "ACTION_DRAG_DROP";
                                    case R.id.accessibilityActionDragCancel:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    public static z j0() {
        return d1(AccessibilityNodeInfo.obtain());
    }

    public static z k0(z zVar) {
        return d1(AccessibilityNodeInfo.obtain(zVar.f3853a));
    }

    private boolean l(int i10) {
        Bundle bundleA = A();
        return bundleA != null && (bundleA.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i10) == i10;
    }

    public static z l0(View view) {
        return d1(AccessibilityNodeInfo.obtain(view));
    }

    private void p0(View view) {
        SparseArray sparseArrayG = G(view);
        if (sparseArrayG != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < sparseArrayG.size(); i10++) {
                if (((WeakReference) sparseArrayG.valueAt(i10)).get() == null) {
                    arrayList.add(Integer.valueOf(i10));
                }
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                sparseArrayG.remove(((Integer) arrayList.get(i11)).intValue());
            }
        }
    }

    private String q() {
        int iP = p();
        return iP == 1 ? "TRUE" : iP == 2 ? "PARTIAL" : "FALSE";
    }

    private void r0(int i10, boolean z10) {
        Bundle bundleA = A();
        if (bundleA != null) {
            int i11 = bundleA.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i10);
            if (!z10) {
                i10 = 0;
            }
            bundleA.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i10 | i11);
        }
    }

    public static ClickableSpan[] t(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    static String z(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? "UNKNOWN" : "FULL" : "PARTIAL" : "COLLAPSED" : "UNDEFINED";
    }

    public Bundle A() {
        return this.f3853a.getExtras();
    }

    public void A0(CharSequence charSequence) {
        this.f3853a.setContentDescription(charSequence);
    }

    public CharSequence B() {
        return Build.VERSION.SDK_INT >= 26 ? this.f3853a.getHintText() : this.f3853a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY");
    }

    public void B0(boolean z10) {
        this.f3853a.setEnabled(z10);
    }

    public int C() {
        return this.f3853a.getMaxTextLength();
    }

    public void C0(CharSequence charSequence) {
        this.f3853a.setError(charSequence);
    }

    public void D0(boolean z10) {
        this.f3853a.setFocusable(z10);
    }

    public CharSequence E() {
        return this.f3853a.getPackageName();
    }

    public void E0(boolean z10) {
        this.f3853a.setFocused(z10);
    }

    public h F() {
        AccessibilityNodeInfo.RangeInfo rangeInfo = this.f3853a.getRangeInfo();
        if (rangeInfo != null) {
            return new h(rangeInfo);
        }
        return null;
    }

    public void F0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f3853a.setHeading(z10);
        } else {
            r0(2, z10);
        }
    }

    public void G0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f3853a.setHintText(charSequence);
        } else {
            this.f3853a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    public CharSequence H() {
        return Build.VERSION.SDK_INT >= 30 ? b.a(this.f3853a) : this.f3853a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
    }

    public void H0(View view) {
        this.f3853a.setLabelFor(view);
    }

    public CharSequence I() {
        return Build.VERSION.SDK_INT >= 36 ? e.d(this.f3853a) : this.f3853a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.SUPPLEMENTAL_DESCRIPTION_KEY");
    }

    public void I0(View view) {
        this.f3853a.setLabeledBy(view);
    }

    public CharSequence J() {
        if (!N()) {
            return this.f3853a.getText();
        }
        List listH = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List listH2 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List listH3 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List listH4 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f3853a.getText(), 0, this.f3853a.getText().length()));
        for (int i10 = 0; i10 < listH.size(); i10++) {
            spannableString.setSpan(new C0804a(((Integer) listH4.get(i10)).intValue(), this, A().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) listH.get(i10)).intValue(), ((Integer) listH2.get(i10)).intValue(), ((Integer) listH3.get(i10)).intValue());
        }
        return spannableString;
    }

    public void J0(int i10) {
        this.f3853a.setMaxTextLength(i10);
    }

    public CharSequence K() {
        return Build.VERSION.SDK_INT >= 28 ? this.f3853a.getTooltipText() : this.f3853a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY");
    }

    public void K0(CharSequence charSequence) {
        this.f3853a.setPackageName(charSequence);
    }

    public String L() {
        return Build.VERSION.SDK_INT >= 33 ? c.a(this.f3853a) : this.f3853a.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
    }

    public void L0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f3853a.setPaneTitle(charSequence);
        } else {
            this.f3853a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public String M() {
        return this.f3853a.getViewIdResourceName();
    }

    public void M0(View view) {
        this.f3854b = -1;
        this.f3853a.setParent(view);
    }

    public void N0(View view, int i10) {
        this.f3854b = i10;
        this.f3853a.setParent(view, i10);
    }

    public void O0(h hVar) {
        this.f3853a.setRangeInfo((AccessibilityNodeInfo.RangeInfo) hVar.f3906a);
    }

    public boolean P() {
        return Build.VERSION.SDK_INT >= 34 ? d.d(this.f3853a) : l(64);
    }

    public void P0(CharSequence charSequence) {
        this.f3853a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
    }

    public boolean Q() {
        return this.f3853a.isAccessibilityFocused();
    }

    public void Q0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f3853a.setScreenReaderFocusable(z10);
        } else {
            r0(1, z10);
        }
    }

    public boolean R() {
        return this.f3853a.isCheckable();
    }

    public void R0(boolean z10) {
        this.f3853a.setScrollable(z10);
    }

    public boolean S() {
        return this.f3853a.isChecked();
    }

    public void S0(boolean z10) {
        this.f3853a.setSelected(z10);
    }

    public boolean T() {
        return this.f3853a.isClickable();
    }

    public void T0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f3853a.setShowingHintText(z10);
        } else {
            r0(4, z10);
        }
    }

    public boolean U() {
        return this.f3853a.isContextClickable();
    }

    public void U0(View view) {
        this.f3855c = -1;
        this.f3853a.setSource(view);
    }

    public boolean V() {
        return this.f3853a.isEnabled();
    }

    public void V0(View view, int i10) {
        this.f3855c = i10;
        this.f3853a.setSource(view, i10);
    }

    public boolean W() {
        return Build.VERSION.SDK_INT >= 36 ? e.e(this.f3853a) : this.f3853a.getExtras().getBoolean("androidx.view.accessibility.AccessibilityNodeInfoCompat.IS_REQUIRED_KEY");
    }

    public void W0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            b.b(this.f3853a, charSequence);
        } else {
            this.f3853a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public boolean X() {
        return this.f3853a.isFocusable();
    }

    public void X0(CharSequence charSequence) {
        this.f3853a.setText(charSequence);
    }

    public boolean Y() {
        return this.f3853a.isFocused();
    }

    public void Y0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f3853a.setTooltipText(charSequence);
        } else {
            this.f3853a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY", charSequence);
        }
    }

    public boolean Z() {
        return l(67108864);
    }

    public void Z0(View view) {
        this.f3853a.setTraversalAfter(view);
    }

    public void a(int i10) {
        this.f3853a.addAction(i10);
    }

    public boolean a0() {
        return this.f3853a.isImportantForAccessibility();
    }

    public void a1(String str) {
        this.f3853a.setViewIdResourceName(str);
    }

    public void b(a aVar) {
        this.f3853a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f3900a);
    }

    public boolean b0() {
        return this.f3853a.isLongClickable();
    }

    public void b1(boolean z10) {
        this.f3853a.setVisibleToUser(z10);
    }

    public void c(View view) {
        this.f3853a.addChild(view);
    }

    public boolean c0() {
        return this.f3853a.isPassword();
    }

    public AccessibilityNodeInfo c1() {
        return this.f3853a;
    }

    public void d(View view, int i10) {
        this.f3853a.addChild(view, i10);
    }

    public boolean d0() {
        return Build.VERSION.SDK_INT >= 28 ? this.f3853a.isScreenReaderFocusable() : l(1);
    }

    public boolean e0() {
        return this.f3853a.isScrollable();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f3853a;
        if (accessibilityNodeInfo == null) {
            if (zVar.f3853a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(zVar.f3853a)) {
            return false;
        }
        return this.f3855c == zVar.f3855c && this.f3854b == zVar.f3854b;
    }

    public void f(CharSequence charSequence, View view) {
        if (Build.VERSION.SDK_INT < 26) {
            g();
            p0(view);
            ClickableSpan[] clickableSpanArrT = t(charSequence);
            if (clickableSpanArrT == null || clickableSpanArrT.length <= 0) {
                return;
            }
            A().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", AbstractC3415c.f32796a);
            SparseArray sparseArrayD = D(view);
            for (int i10 = 0; i10 < clickableSpanArrT.length; i10++) {
                int iO = O(clickableSpanArrT[i10], sparseArrayD);
                sparseArrayD.put(iO, new WeakReference(clickableSpanArrT[i10]));
                e(clickableSpanArrT[i10], (Spanned) charSequence, iO);
            }
        }
    }

    public boolean f0() {
        return this.f3853a.isSelected();
    }

    public boolean g0() {
        return Build.VERSION.SDK_INT >= 26 ? this.f3853a.isShowingHintText() : l(4);
    }

    public boolean h0() {
        return Build.VERSION.SDK_INT >= 33 ? c.b(this.f3853a) : l(8388608);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f3853a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public List i() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f3853a.getActionList();
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new a(actionList.get(i10)));
        }
        return arrayList;
    }

    public boolean i0() {
        return this.f3853a.isVisibleToUser();
    }

    public int k() {
        return this.f3853a.getActions();
    }

    public void m(Rect rect) {
        this.f3853a.getBoundsInParent(rect);
    }

    public boolean m0(int i10, Bundle bundle) {
        return this.f3853a.performAction(i10, bundle);
    }

    public void n(Rect rect) {
        this.f3853a.getBoundsInScreen(rect);
    }

    public void o(Rect rect) {
        if (Build.VERSION.SDK_INT >= 34) {
            d.b(this.f3853a, rect);
            return;
        }
        Rect rect2 = (Rect) this.f3853a.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
        if (rect2 != null) {
            rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
    }

    public boolean o0(a aVar) {
        return this.f3853a.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f3900a);
    }

    public int p() {
        return Build.VERSION.SDK_INT >= 36 ? e.b(this.f3853a) : this.f3853a.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.CHECKED_KEY", this.f3853a.isChecked() ? 1 : 0);
    }

    public void q0(boolean z10) {
        this.f3853a.setAccessibilityFocused(z10);
    }

    public int r() {
        return this.f3853a.getChildCount();
    }

    public CharSequence s() {
        return this.f3853a.getClassName();
    }

    public void s0(Rect rect) {
        this.f3853a.setBoundsInParent(rect);
    }

    public void t0(Rect rect) {
        this.f3853a.setBoundsInScreen(rect);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        m(rect);
        sb.append("; boundsInParent: " + rect);
        n(rect);
        sb.append("; boundsInScreen: " + rect);
        o(rect);
        sb.append("; boundsInWindow: " + rect);
        sb.append("; packageName: ");
        sb.append(E());
        sb.append("; className: ");
        sb.append(s());
        sb.append("; text: ");
        sb.append(J());
        sb.append("; error: ");
        sb.append(x());
        sb.append("; maxTextLength: ");
        sb.append(C());
        sb.append("; stateDescription: ");
        sb.append(H());
        sb.append("; contentDescription: ");
        sb.append(w());
        sb.append("; supplementalDescription: ");
        sb.append(I());
        sb.append("; tooltipText: ");
        sb.append(K());
        sb.append("; viewIdResName: ");
        sb.append(M());
        sb.append("; uniqueId: ");
        sb.append(L());
        sb.append("; checkable: ");
        sb.append(R());
        sb.append("; checked: ");
        sb.append(q());
        sb.append("; fieldRequired: ");
        sb.append(W());
        sb.append("; focusable: ");
        sb.append(X());
        sb.append("; focused: ");
        sb.append(Y());
        sb.append("; selected: ");
        sb.append(f0());
        sb.append("; clickable: ");
        sb.append(T());
        sb.append("; longClickable: ");
        sb.append(b0());
        sb.append("; contextClickable: ");
        sb.append(U());
        sb.append("; expandedState: ");
        sb.append(z(y()));
        sb.append("; enabled: ");
        sb.append(V());
        sb.append("; password: ");
        sb.append(c0());
        sb.append("; scrollable: " + e0());
        sb.append("; containerTitle: ");
        sb.append(v());
        sb.append("; granularScrollingSupported: ");
        sb.append(Z());
        sb.append("; importantForAccessibility: ");
        sb.append(a0());
        sb.append("; visible: ");
        sb.append(i0());
        sb.append("; isTextSelectable: ");
        sb.append(h0());
        sb.append("; accessibilityDataSensitive: ");
        sb.append(P());
        sb.append("; [");
        List listI = i();
        for (int i10 = 0; i10 < listI.size(); i10++) {
            a aVar = (a) listI.get(i10);
            String strJ = j(aVar.b());
            if (strJ.equals("ACTION_UNKNOWN") && aVar.c() != null) {
                strJ = aVar.c().toString();
            }
            sb.append(strJ);
            if (i10 != listI.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public f u() {
        AccessibilityNodeInfo.CollectionInfo collectionInfo = this.f3853a.getCollectionInfo();
        if (collectionInfo != null) {
            return new f(collectionInfo);
        }
        return null;
    }

    public void u0(boolean z10) {
        this.f3853a.setCheckable(z10);
    }

    public CharSequence v() {
        return Build.VERSION.SDK_INT >= 34 ? d.c(this.f3853a) : this.f3853a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY");
    }

    public void v0(boolean z10) {
        this.f3853a.setChecked(z10);
    }

    public CharSequence w() {
        return this.f3853a.getContentDescription();
    }

    public void w0(CharSequence charSequence) {
        this.f3853a.setClassName(charSequence);
    }

    public CharSequence x() {
        return this.f3853a.getError();
    }

    public void x0(boolean z10) {
        this.f3853a.setClickable(z10);
    }

    public int y() {
        return Build.VERSION.SDK_INT >= 36 ? e.c(this.f3853a) : this.f3853a.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.EXPANDED_STATE_KEY", 0);
    }

    public void y0(Object obj) {
        this.f3853a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((f) obj).f3904a);
    }

    public void z0(Object obj) {
        this.f3853a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((g) obj).f3905a);
    }

    public void n0() {
    }
}
