package com.facebook.react.views.text;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u0012J-\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u0013J%\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0019\u0010\u001cJ%\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\f¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 ¨\u0006\""}, d2 = {"Lcom/facebook/react/views/text/ReactFontManager;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/react/common/assets/ReactFontManager;", "delegate", "<init>", "(Lcom/facebook/react/common/assets/ReactFontManager;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "fontFamilyName", PointerEventHelper.POINTER_TYPE_UNKNOWN, "style", "Landroid/content/res/AssetManager;", "assetManager", "Landroid/graphics/Typeface;", "getTypeface", "(Ljava/lang/String;ILandroid/content/res/AssetManager;)Landroid/graphics/Typeface;", "weight", PointerEventHelper.POINTER_TYPE_UNKNOWN, "italic", "(Ljava/lang/String;IZLandroid/content/res/AssetManager;)Landroid/graphics/Typeface;", "(Ljava/lang/String;IILandroid/content/res/AssetManager;)Landroid/graphics/Typeface;", "Landroid/content/Context;", "context", ViewProps.FONT_FAMILY, "fontId", "Li7/B;", "addCustomFont", "(Landroid/content/Context;Ljava/lang/String;I)V", "font", "(Ljava/lang/String;Landroid/graphics/Typeface;)V", "typeface", "setTypeface", "(Ljava/lang/String;ILandroid/graphics/Typeface;)V", "Lcom/facebook/react/common/assets/ReactFontManager;", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactFontManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static ReactFontManager instance;
    private final com.facebook.react.common.assets.ReactFontManager delegate;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0005H\u0007R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/facebook/react/views/text/ReactFontManager$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "instance", "Lcom/facebook/react/views/text/ReactFontManager;", "getInstance", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ReactFontManager getInstance() {
            ReactFontManager reactFontManager = ReactFontManager.instance;
            if (reactFontManager != null) {
                return reactFontManager;
            }
            ReactFontManager reactFontManager2 = new ReactFontManager(com.facebook.react.common.assets.ReactFontManager.INSTANCE.getInstance(), null);
            ReactFontManager.instance = reactFontManager2;
            return reactFontManager2;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ReactFontManager(com.facebook.react.common.assets.ReactFontManager reactFontManager, DefaultConstructorMarker defaultConstructorMarker) {
        this(reactFontManager);
    }

    public static final ReactFontManager getInstance() {
        return INSTANCE.getInstance();
    }

    public final void addCustomFont(Context context, String fontFamily, int fontId) {
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(fontFamily, "fontFamily");
        this.delegate.addCustomFont(context, fontFamily, fontId);
    }

    public final Typeface getTypeface(String fontFamilyName, int style, AssetManager assetManager) {
        AbstractC2855l.g(fontFamilyName, "fontFamilyName");
        AbstractC2855l.g(assetManager, "assetManager");
        return this.delegate.getTypeface(fontFamilyName, style, assetManager);
    }

    public final void setTypeface(String fontFamilyName, int style, Typeface typeface) {
        AbstractC2855l.g(fontFamilyName, "fontFamilyName");
        AbstractC2855l.g(typeface, "typeface");
        this.delegate.setTypeface(fontFamilyName, style, typeface);
    }

    private ReactFontManager(com.facebook.react.common.assets.ReactFontManager reactFontManager) {
        this.delegate = reactFontManager;
    }

    public final void addCustomFont(String fontFamily, Typeface font) {
        AbstractC2855l.g(fontFamily, "fontFamily");
        this.delegate.addCustomFont(fontFamily, font);
    }

    public final Typeface getTypeface(String fontFamilyName, int weight, boolean italic, AssetManager assetManager) {
        AbstractC2855l.g(fontFamilyName, "fontFamilyName");
        AbstractC2855l.g(assetManager, "assetManager");
        return this.delegate.getTypeface(fontFamilyName, weight, italic, assetManager);
    }

    public final Typeface getTypeface(String fontFamilyName, int style, int weight, AssetManager assetManager) {
        AbstractC2855l.g(fontFamilyName, "fontFamilyName");
        AbstractC2855l.g(assetManager, "assetManager");
        return this.delegate.getTypeface(fontFamilyName, style, weight, assetManager);
    }
}
