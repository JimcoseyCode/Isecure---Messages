package com.swmansion.rnscreens.gamma.tabs;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.view.A;
import androidx.core.view.AbstractC1670g0;
import com.facebook.react.common.assets.ReactFontManager;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.events.PointerEventHelper;
import f.AbstractC2568a;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.appcompat.view.d f25267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.material.bottomnavigation.c f25268b;

    public p(androidx.appcompat.view.d context, com.google.android.material.bottomnavigation.c bottomNavigationView) {
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(bottomNavigationView, "bottomNavigationView");
        this.f25267a = context;
        this.f25268b = bottomNavigationView;
    }

    private final int a(int i10) {
        TypedValue typedValue = new TypedValue();
        this.f25267a.getTheme().resolveAttribute(i10, typedValue, true);
        return typedValue.data;
    }

    public final void b(MenuItem menuItem, a tabScreen) {
        AbstractC2855l.g(menuItem, "menuItem");
        AbstractC2855l.g(tabScreen, "tabScreen");
        Menu menu = this.f25268b.getMenu();
        AbstractC2855l.f(menu, "getMenu(...)");
        int iE = O8.l.E(A.a(menu), menuItem);
        String badgeValue = tabScreen.getBadgeValue();
        if (badgeValue == null) {
            com.google.android.material.badge.a aVarD = this.f25268b.d(iE);
            if (aVarD != null) {
                aVarD.X(false);
                return;
            }
            return;
        }
        Integer numN = P8.q.n(badgeValue);
        com.google.android.material.badge.a aVarE = this.f25268b.e(iE);
        AbstractC2855l.f(aVarE, "getOrCreateBadge(...)");
        aVarE.X(true);
        aVarE.f();
        aVarE.e();
        if (numN != null) {
            aVarE.V(numN.intValue());
        } else if (!AbstractC2855l.b(badgeValue, PointerEventHelper.POINTER_TYPE_UNKNOWN)) {
            aVarE.W(badgeValue);
        }
        Integer tabBarItemBadgeTextColor = tabScreen.getTabBarItemBadgeTextColor();
        aVarE.U(tabBarItemBadgeTextColor != null ? tabBarItemBadgeTextColor.intValue() : a(Q4.a.f9144h));
        Integer tabBarItemBadgeBackgroundColor = tabScreen.getTabBarItemBadgeBackgroundColor();
        aVarE.S(tabBarItemBadgeBackgroundColor != null ? tabBarItemBadgeBackgroundColor.intValue() : a(AbstractC2568a.f26750v));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(l tabsHost) {
        int iIntValue;
        Integer numN;
        float dimension;
        float dimension2;
        AbstractC2855l.g(tabsHost, "tabsHost");
        View childAt = this.f25268b.getChildAt(0);
        AbstractC2855l.e(childAt, "null cannot be cast to non-null type android.view.ViewGroup");
        for (View view : AbstractC1670g0.a((ViewGroup) childAt)) {
            TextView textView = (TextView) view.findViewById(Q4.e.f9284N);
            TextView textView2 = (TextView) view.findViewById(Q4.e.f9285O);
            boolean zB = AbstractC2855l.b(tabsHost.getTabBarItemTitleFontStyle(), "italic");
            if (AbstractC2855l.b(tabsHost.getTabBarItemTitleFontWeight(), "bold")) {
                iIntValue = ReactFontManager.TypefaceStyle.BOLD;
            } else {
                String tabBarItemTitleFontWeight = tabsHost.getTabBarItemTitleFontWeight();
                iIntValue = (tabBarItemTitleFontWeight == null || (numN = P8.q.n(tabBarItemTitleFontWeight)) == null) ? ReactFontManager.TypefaceStyle.NORMAL : numN.intValue();
            }
            ReactFontManager companion = ReactFontManager.INSTANCE.getInstance();
            String tabBarItemTitleFontFamily = tabsHost.getTabBarItemTitleFontFamily();
            if (tabBarItemTitleFontFamily == null) {
                tabBarItemTitleFontFamily = PointerEventHelper.POINTER_TYPE_UNKNOWN;
            }
            Typeface typeface = companion.getTypeface(tabBarItemTitleFontFamily, iIntValue, zB, this.f25267a.getAssets());
            Float tabBarItemTitleFontSize = tabsHost.getTabBarItemTitleFontSize();
            if (tabBarItemTitleFontSize == null) {
                dimension = this.f25267a.getResources().getDimension(Q4.c.f9230i);
            } else {
                if (tabBarItemTitleFontSize.floatValue() <= 0.0f) {
                    tabBarItemTitleFontSize = null;
                }
                if (tabBarItemTitleFontSize != null) {
                    dimension = PixelUtil.toPixelFromSP$default(tabBarItemTitleFontSize.floatValue(), 0.0f, 2, null);
                }
            }
            Float tabBarItemTitleFontSizeActive = tabsHost.getTabBarItemTitleFontSizeActive();
            if (tabBarItemTitleFontSizeActive == null) {
                dimension2 = this.f25267a.getResources().getDimension(Q4.c.f9230i);
            } else {
                if (tabBarItemTitleFontSizeActive.floatValue() <= 0.0f) {
                    tabBarItemTitleFontSizeActive = null;
                }
                if (tabBarItemTitleFontSizeActive != null) {
                    dimension2 = PixelUtil.toPixelFromSP$default(tabBarItemTitleFontSizeActive.floatValue(), 0.0f, 2, null);
                }
            }
            textView2.setTextSize(0, dimension);
            textView2.setTypeface(typeface);
            textView.setTextSize(0, dimension2);
            textView.setTypeface(typeface);
        }
    }

    public final void d(MenuItem menuItem, a tabScreen) {
        AbstractC2855l.g(menuItem, "menuItem");
        AbstractC2855l.g(tabScreen, "tabScreen");
        if (!AbstractC2855l.b(menuItem.getTitle(), tabScreen.getTabTitle())) {
            menuItem.setTitle(tabScreen.getTabTitle());
        }
        if (AbstractC2855l.b(menuItem.getIcon(), tabScreen.getIcon())) {
            return;
        }
        menuItem.setIcon(tabScreen.getIcon());
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(l tabsHost) {
        AbstractC2855l.g(tabsHost, "tabsHost");
        int i10 = 0;
        this.f25268b.setVisibility(!tabsHost.getTabBarHidden() ? 0 : 8);
        com.google.android.material.bottomnavigation.c cVar = this.f25268b;
        Integer tabBarBackgroundColor = tabsHost.getTabBarBackgroundColor();
        cVar.setBackgroundColor(tabBarBackgroundColor != null ? tabBarBackgroundColor.intValue() : a(Q4.a.f9113L));
        int[][] iArr = {new int[]{-16842912}, new int[]{R.attr.state_checked}};
        Integer tabBarItemTitleFontColor = tabsHost.getTabBarItemTitleFontColor();
        int iIntValue = tabBarItemTitleFontColor != null ? tabBarItemTitleFontColor.intValue() : a(Q4.a.f9168t);
        Integer tabBarItemTitleFontColorActive = tabsHost.getTabBarItemTitleFontColorActive();
        this.f25268b.setItemTextColor(new ColorStateList(iArr, new int[]{iIntValue, (tabBarItemTitleFontColorActive == null && (tabBarItemTitleFontColorActive = tabsHost.getTabBarItemTitleFontColor()) == null) ? a(Q4.a.f9101F) : tabBarItemTitleFontColorActive.intValue()}));
        Integer tabBarItemIconColor = tabsHost.getTabBarItemIconColor();
        int iIntValue2 = tabBarItemIconColor != null ? tabBarItemIconColor.intValue() : a(Q4.a.f9168t);
        Integer tabBarItemIconColorActive = tabsHost.getTabBarItemIconColorActive();
        this.f25268b.setItemIconTintList(new ColorStateList(iArr, new int[]{iIntValue2, (tabBarItemIconColorActive == null && (tabBarItemIconColorActive = tabsHost.getTabBarItemIconColor()) == null) ? a(Q4.a.f9158o) : tabBarItemIconColorActive.intValue()}));
        String tabBarItemLabelVisibilityMode = tabsHost.getTabBarItemLabelVisibilityMode();
        if (tabBarItemLabelVisibilityMode == null) {
            i10 = -1;
        } else {
            int iHashCode = tabBarItemLabelVisibilityMode.hashCode();
            if (iHashCode != -63201645) {
                if (iHashCode != 1191572123) {
                    if (iHashCode == 1648599514 && tabBarItemLabelVisibilityMode.equals("unlabeled")) {
                        i10 = 2;
                    }
                } else if (!tabBarItemLabelVisibilityMode.equals("selected")) {
                }
            } else if (tabBarItemLabelVisibilityMode.equals("labeled")) {
                i10 = 1;
            }
        }
        this.f25268b.setLabelVisibilityMode(i10);
        Integer tabBarItemRippleColor = tabsHost.getTabBarItemRippleColor();
        this.f25268b.setItemRippleColor(ColorStateList.valueOf(tabBarItemRippleColor != null ? tabBarItemRippleColor.intValue() : a(Q4.a.f9137d0)));
        Integer tabBarItemActiveIndicatorColor = tabsHost.getTabBarItemActiveIndicatorColor();
        int iIntValue3 = tabBarItemActiveIndicatorColor != null ? tabBarItemActiveIndicatorColor.intValue() : a(Q4.a.f9103G);
        this.f25268b.setItemActiveIndicatorEnabled(tabsHost.y());
        this.f25268b.setItemActiveIndicatorColor(ColorStateList.valueOf(iIntValue3));
    }
}
