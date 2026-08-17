package com.facebook.react.common.assets;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.os.Build;
import android.util.SparseArray;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w0.AbstractC3461h;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 &2\u00020\u0001:\u0003'&(B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\u0010J/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\u0014J%\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u001a\u0010\u001dJ'\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u001f\u0010 R \u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\"0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R \u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010$¨\u0006)"}, d2 = {"Lcom/facebook/react/common/assets/ReactFontManager;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "fontFamilyName", PointerEventHelper.POINTER_TYPE_UNKNOWN, "style", "Landroid/content/res/AssetManager;", "assetManager", "Landroid/graphics/Typeface;", "getTypeface", "(Ljava/lang/String;ILandroid/content/res/AssetManager;)Landroid/graphics/Typeface;", "weight", PointerEventHelper.POINTER_TYPE_UNKNOWN, "italic", "(Ljava/lang/String;IZLandroid/content/res/AssetManager;)Landroid/graphics/Typeface;", "(Ljava/lang/String;IILandroid/content/res/AssetManager;)Landroid/graphics/Typeface;", "Lcom/facebook/react/common/assets/ReactFontManager$TypefaceStyle;", "typefaceStyle", "(Ljava/lang/String;Lcom/facebook/react/common/assets/ReactFontManager$TypefaceStyle;Landroid/content/res/AssetManager;)Landroid/graphics/Typeface;", "Landroid/content/Context;", "context", ViewProps.FONT_FAMILY, "fontId", "Li7/B;", "addCustomFont", "(Landroid/content/Context;Ljava/lang/String;I)V", "font", "(Ljava/lang/String;Landroid/graphics/Typeface;)V", "typeface", "setTypeface", "(Ljava/lang/String;ILandroid/graphics/Typeface;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/react/common/assets/ReactFontManager$AssetFontFamily;", "fontCache", "Ljava/util/Map;", "customTypefaceCache", "Companion", "TypefaceStyle", "AssetFontFamily", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactFontManager {
    private static final String FONTS_ASSET_PATH = "fonts/";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String[] EXTENSIONS = {PointerEventHelper.POINTER_TYPE_UNKNOWN, "_bold", "_italic", "_bold_italic"};
    private static final String[] FILE_EXTENSIONS = {".ttf", ".otf"};
    private static final ReactFontManager _instance = new ReactFontManager();
    private final Map<String, AssetFontFamily> fontCache = new LinkedHashMap();
    private final Map<String, Typeface> customTypefaceCache = new LinkedHashMap();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/facebook/react/common/assets/ReactFontManager$AssetFontFamily;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "style", "Landroid/graphics/Typeface;", "getTypefaceForStyle", "(I)Landroid/graphics/Typeface;", "typeface", "Li7/B;", "setTypefaceForStyle", "(ILandroid/graphics/Typeface;)V", "Landroid/util/SparseArray;", "typefaceSparseArray", "Landroid/util/SparseArray;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class AssetFontFamily {
        private final SparseArray<Typeface> typefaceSparseArray = new SparseArray<>(4);

        public final Typeface getTypefaceForStyle(int style) {
            return this.typefaceSparseArray.get(style);
        }

        public final void setTypefaceForStyle(int style, Typeface typeface) {
            this.typefaceSparseArray.put(style, typeface);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\u000bH\u0007J\"\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0002R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u000e\u0010\t\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/facebook/react/common/assets/ReactFontManager$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "EXTENSIONS", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "[Ljava/lang/String;", "FILE_EXTENSIONS", "FONTS_ASSET_PATH", "_instance", "Lcom/facebook/react/common/assets/ReactFontManager;", "getInstance", "createAssetTypeface", "Landroid/graphics/Typeface;", "fontFamilyName", "style", PointerEventHelper.POINTER_TYPE_UNKNOWN, "assetManager", "Landroid/content/res/AssetManager;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Typeface createAssetTypeface(String fontFamilyName, int style, AssetManager assetManager) {
            if (assetManager != null) {
                String str = ReactFontManager.EXTENSIONS[style];
                for (String str2 : ReactFontManager.FILE_EXTENSIONS) {
                    try {
                        Typeface typefaceCreateFromAsset = Typeface.createFromAsset(assetManager, ReactFontManager.FONTS_ASSET_PATH + fontFamilyName + str + str2);
                        AbstractC2855l.f(typefaceCreateFromAsset, "createFromAsset(...)");
                        return typefaceCreateFromAsset;
                    } catch (RuntimeException unused) {
                    }
                }
            }
            Typeface typefaceCreate = Typeface.create(fontFamilyName, style);
            AbstractC2855l.f(typefaceCreate, "create(...)");
            return typefaceCreate;
        }

        public final ReactFontManager getInstance() {
            return ReactFontManager._instance;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u001b\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\tJ\u0010\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/facebook/react/common/assets/ReactFontManager$TypefaceStyle;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "weight", PointerEventHelper.POINTER_TYPE_UNKNOWN, "italic", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "(IZ)V", "style", "(II)V", "nearestStyle", "getNearestStyle", "()I", "apply", "Landroid/graphics/Typeface;", "typeface", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TypefaceStyle {
        public static final int BOLD = 700;
        public static final int NORMAL = 400;
        private final boolean italic;
        private final int weight;

        public TypefaceStyle(int i10) {
            this(i10, 0, 2, null);
        }

        public final Typeface apply(Typeface typeface) {
            if (Build.VERSION.SDK_INT < 28) {
                Typeface typefaceCreate = Typeface.create(typeface, getNearestStyle());
                AbstractC2855l.d(typefaceCreate);
                return typefaceCreate;
            }
            Typeface typefaceCreate2 = Typeface.create(typeface, this.weight, this.italic);
            AbstractC2855l.d(typefaceCreate2);
            return typefaceCreate2;
        }

        public final int getNearestStyle() {
            return this.weight < 700 ? this.italic ? 2 : 0 : this.italic ? 3 : 1;
        }

        public TypefaceStyle(int i10, boolean z10) {
            this.italic = z10;
            this.weight = i10 == -1 ? NORMAL : i10;
        }

        public /* synthetic */ TypefaceStyle(int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10, (i12 & 2) != 0 ? -1 : i11);
        }

        public TypefaceStyle(int i10, int i11) {
            i10 = i10 == -1 ? 0 : i10;
            this.italic = (i10 & 2) != 0;
            this.weight = i11 == -1 ? (i10 & 1) != 0 ? BOLD : NORMAL : i11;
        }
    }

    public static final ReactFontManager getInstance() {
        return INSTANCE.getInstance();
    }

    public final void addCustomFont(Context context, String fontFamily, int fontId) {
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(fontFamily, "fontFamily");
        addCustomFont(fontFamily, AbstractC3461h.h(context, fontId));
    }

    public final Typeface getTypeface(String fontFamilyName, int style, AssetManager assetManager) {
        AbstractC2855l.g(fontFamilyName, "fontFamilyName");
        return getTypeface(fontFamilyName, new TypefaceStyle(style, 0, 2, null), assetManager);
    }

    public final void setTypeface(String fontFamilyName, int style, Typeface typeface) {
        AbstractC2855l.g(fontFamilyName, "fontFamilyName");
        if (typeface != null) {
            Map<String, AssetFontFamily> map = this.fontCache;
            AssetFontFamily assetFontFamily = map.get(fontFamilyName);
            if (assetFontFamily == null) {
                assetFontFamily = new AssetFontFamily();
                map.put(fontFamilyName, assetFontFamily);
            }
            assetFontFamily.setTypefaceForStyle(style, typeface);
        }
    }

    public final void addCustomFont(String fontFamily, Typeface font) {
        AbstractC2855l.g(fontFamily, "fontFamily");
        if (font != null) {
            this.customTypefaceCache.put(fontFamily, font);
        }
    }

    public final Typeface getTypeface(String fontFamilyName, int weight, boolean italic, AssetManager assetManager) {
        AbstractC2855l.g(fontFamilyName, "fontFamilyName");
        return getTypeface(fontFamilyName, new TypefaceStyle(weight, italic), assetManager);
    }

    public final Typeface getTypeface(String fontFamilyName, int style, int weight, AssetManager assetManager) {
        AbstractC2855l.g(fontFamilyName, "fontFamilyName");
        return getTypeface(fontFamilyName, new TypefaceStyle(style, weight), assetManager);
    }

    public final Typeface getTypeface(String fontFamilyName, TypefaceStyle typefaceStyle, AssetManager assetManager) {
        AbstractC2855l.g(fontFamilyName, "fontFamilyName");
        AbstractC2855l.g(typefaceStyle, "typefaceStyle");
        if (this.customTypefaceCache.containsKey(fontFamilyName)) {
            return typefaceStyle.apply(this.customTypefaceCache.get(fontFamilyName));
        }
        Map<String, AssetFontFamily> map = this.fontCache;
        AssetFontFamily assetFontFamily = map.get(fontFamilyName);
        if (assetFontFamily == null) {
            assetFontFamily = new AssetFontFamily();
            map.put(fontFamilyName, assetFontFamily);
        }
        AssetFontFamily assetFontFamily2 = assetFontFamily;
        int nearestStyle = typefaceStyle.getNearestStyle();
        Typeface typefaceForStyle = assetFontFamily2.getTypefaceForStyle(nearestStyle);
        if (typefaceForStyle != null) {
            return typefaceForStyle;
        }
        Typeface typefaceCreateAssetTypeface = INSTANCE.createAssetTypeface(fontFamilyName, nearestStyle, assetManager);
        assetFontFamily2.setTypefaceForStyle(nearestStyle, typefaceCreateAssetTypeface);
        return typefaceCreateAssetTypeface;
    }
}
