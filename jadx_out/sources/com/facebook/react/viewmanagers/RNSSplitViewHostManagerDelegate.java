package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.RNSSplitViewHostManagerInterface;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class RNSSplitViewHostManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNSSplitViewHostManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSSplitViewHostManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* JADX INFO: renamed from: setProperty */
    public void kotlinCompat$setProperty(T t10, String str, Object obj) {
        str.getClass();
        switch (str) {
            case "preferredSplitBehavior":
                ((RNSSplitViewHostManagerInterface) this.mViewManager).setPreferredSplitBehavior(t10, (String) obj);
                break;
            case "orientation":
                ((RNSSplitViewHostManagerInterface) this.mViewManager).setOrientation(t10, (String) obj);
                break;
            case "primaryEdge":
                ((RNSSplitViewHostManagerInterface) this.mViewManager).setPrimaryEdge(t10, (String) obj);
                break;
            case "showInspector":
                ((RNSSplitViewHostManagerInterface) this.mViewManager).setShowInspector(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "showSecondaryToggleButton":
                ((RNSSplitViewHostManagerInterface) this.mViewManager).setShowSecondaryToggleButton(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "preferredDisplayMode":
                ((RNSSplitViewHostManagerInterface) this.mViewManager).setPreferredDisplayMode(t10, (String) obj);
                break;
            case "primaryBackgroundStyle":
                ((RNSSplitViewHostManagerInterface) this.mViewManager).setPrimaryBackgroundStyle(t10, (String) obj);
                break;
            case "presentsWithGesture":
                ((RNSSplitViewHostManagerInterface) this.mViewManager).setPresentsWithGesture(t10, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case "displayModeButtonVisibility":
                ((RNSSplitViewHostManagerInterface) this.mViewManager).setDisplayModeButtonVisibility(t10, (String) obj);
                break;
            case "columnMetrics":
                ((RNSSplitViewHostManagerInterface) this.mViewManager).setColumnMetrics(t10, (ReadableMap) obj);
                break;
            default:
                super.kotlinCompat$setProperty(t10, str, obj);
                break;
        }
    }
}
