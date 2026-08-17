package com.facebook.react.uimanager.util;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.R;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\n\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002$%B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\b\u0010\rJ\u0017\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0010\u0010\u000fJ%\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0019\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\n0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R&\u0010\"\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00130!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lcom/facebook/react/uimanager/util/ReactFindViewUtil;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "Landroid/view/View;", "root", PointerEventHelper.POINTER_TYPE_UNKNOWN, "nativeId", "findView", "(Landroid/view/View;Ljava/lang/String;)Landroid/view/View;", "Lcom/facebook/react/uimanager/util/ReactFindViewUtil$OnViewFoundListener;", "onViewFoundListener", "Li7/B;", "(Landroid/view/View;Lcom/facebook/react/uimanager/util/ReactFindViewUtil$OnViewFoundListener;)V", "addViewListener", "(Lcom/facebook/react/uimanager/util/ReactFindViewUtil$OnViewFoundListener;)V", "removeViewListener", "Lcom/facebook/react/uimanager/util/ReactFindViewUtil$OnMultipleViewsFoundListener;", "listener", PointerEventHelper.POINTER_TYPE_UNKNOWN, "ids", "addViewsListener", "(Lcom/facebook/react/uimanager/util/ReactFindViewUtil$OnMultipleViewsFoundListener;Ljava/util/Set;)V", "removeViewsListener", "(Lcom/facebook/react/uimanager/util/ReactFindViewUtil$OnMultipleViewsFoundListener;)V", "view", "notifyViewRendered", "(Landroid/view/View;)V", "getNativeId", "(Landroid/view/View;)Ljava/lang/String;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "onViewFoundListeners", "Ljava/util/List;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "onMultipleViewsFoundListener", "Ljava/util/Map;", "OnViewFoundListener", "OnMultipleViewsFoundListener", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactFindViewUtil {
    public static final ReactFindViewUtil INSTANCE = new ReactFindViewUtil();
    private static final List<OnViewFoundListener> onViewFoundListeners = new ArrayList();
    private static final Map<OnMultipleViewsFoundListener, Set<String>> onMultipleViewsFoundListener = new HashMap();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/uimanager/util/ReactFindViewUtil$OnMultipleViewsFoundListener;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Landroid/view/View;", "view", PointerEventHelper.POINTER_TYPE_UNKNOWN, "nativeId", "Li7/B;", "onViewFound", "(Landroid/view/View;Ljava/lang/String;)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnMultipleViewsFoundListener {
        void onViewFound(View view, String nativeId);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/uimanager/util/ReactFindViewUtil$OnViewFoundListener;", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "getNativeId", "()Ljava/lang/String;", "Landroid/view/View;", "view", "Li7/B;", "onViewFound", "(Landroid/view/View;)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnViewFoundListener {
        String getNativeId();

        void onViewFound(View view);
    }

    private ReactFindViewUtil() {
    }

    public static final void addViewListener(OnViewFoundListener onViewFoundListener) {
        AbstractC2855l.g(onViewFoundListener, "onViewFoundListener");
        onViewFoundListeners.add(onViewFoundListener);
    }

    public static final void addViewsListener(OnMultipleViewsFoundListener listener, Set<String> ids) {
        AbstractC2855l.g(listener, "listener");
        AbstractC2855l.g(ids, "ids");
        onMultipleViewsFoundListener.put(listener, ids);
    }

    public static final View findView(View root, String nativeId) {
        AbstractC2855l.g(root, "root");
        AbstractC2855l.g(nativeId, "nativeId");
        if (AbstractC2855l.b(INSTANCE.getNativeId(root), nativeId)) {
            return root;
        }
        if (!(root instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) root;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            AbstractC2855l.f(childAt, "getChildAt(...)");
            View viewFindView = findView(childAt, nativeId);
            if (viewFindView != null) {
                return viewFindView;
            }
        }
        return null;
    }

    private final String getNativeId(View view) {
        Object tag = view.getTag(R.id.view_tag_native_id);
        if (tag instanceof String) {
            return (String) tag;
        }
        return null;
    }

    public static final void notifyViewRendered(View view) {
        AbstractC2855l.g(view, "view");
        String nativeId = INSTANCE.getNativeId(view);
        if (nativeId == null) {
            return;
        }
        Iterator<OnViewFoundListener> it = onViewFoundListeners.iterator();
        while (it.hasNext()) {
            OnViewFoundListener next = it.next();
            if (AbstractC2855l.b(nativeId, next.getNativeId())) {
                next.onViewFound(view);
                it.remove();
            }
        }
        for (Map.Entry<OnMultipleViewsFoundListener, Set<String>> entry : onMultipleViewsFoundListener.entrySet()) {
            OnMultipleViewsFoundListener key = entry.getKey();
            if (entry.getValue().contains(nativeId)) {
                key.onViewFound(view, nativeId);
            }
        }
    }

    public static final void removeViewListener(OnViewFoundListener onViewFoundListener) {
        AbstractC2855l.g(onViewFoundListener, "onViewFoundListener");
        onViewFoundListeners.remove(onViewFoundListener);
    }

    public static final void removeViewsListener(OnMultipleViewsFoundListener listener) {
        AbstractC2855l.g(listener, "listener");
        onMultipleViewsFoundListener.remove(listener);
    }

    public static final void findView(View root, OnViewFoundListener onViewFoundListener) {
        AbstractC2855l.g(root, "root");
        AbstractC2855l.g(onViewFoundListener, "onViewFoundListener");
        View viewFindView = findView(root, onViewFoundListener.getNativeId());
        if (viewFindView != null) {
            onViewFoundListener.onViewFound(viewFindView);
        }
        addViewListener(onViewFoundListener);
    }
}
