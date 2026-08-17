package com.facebook.react.views.text.internal.span;

import android.content.res.AssetManager;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import com.facebook.react.common.assets.ReactFontManager;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.views.text.ReactTypefaceUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u0000 \u001f2\u00020\u00012\u00020\u0002:\u0001\u001fB3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0019R\u0011\u0010\u001c\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001e\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001b¨\u0006 "}, d2 = {"Lcom/facebook/react/views/text/internal/span/CustomStyleSpan;", "Landroid/text/style/MetricAffectingSpan;", "Lcom/facebook/react/views/text/internal/span/ReactSpan;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "privateStyle", "privateWeight", PointerEventHelper.POINTER_TYPE_UNKNOWN, "fontFeatureSettings", ViewProps.FONT_FAMILY, "Landroid/content/res/AssetManager;", "assetManager", "<init>", "(IILjava/lang/String;Ljava/lang/String;Landroid/content/res/AssetManager;)V", "Landroid/text/TextPaint;", "ds", "Li7/B;", "updateDrawState", "(Landroid/text/TextPaint;)V", "paint", "updateMeasureState", "I", "Ljava/lang/String;", "getFontFeatureSettings", "()Ljava/lang/String;", "getFontFamily", "Landroid/content/res/AssetManager;", "getStyle", "()I", "style", "getWeight", "weight", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CustomStyleSpan extends MetricAffectingSpan implements ReactSpan {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final AssetManager assetManager;
    private final String fontFamily;
    private final String fontFeatureSettings;
    private final int privateStyle;
    private final int privateWeight;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/facebook/react/views/text/internal/span/CustomStyleSpan$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "Landroid/graphics/Paint;", "paint", PointerEventHelper.POINTER_TYPE_UNKNOWN, "style", "weight", PointerEventHelper.POINTER_TYPE_UNKNOWN, "fontFeatureSettingsParam", "family", "Landroid/content/res/AssetManager;", "assetManager", "Li7/B;", "apply", "(Landroid/graphics/Paint;IILjava/lang/String;Ljava/lang/String;Landroid/content/res/AssetManager;)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void apply(Paint paint, int style, int weight, String fontFeatureSettingsParam, String family, AssetManager assetManager) {
            Typeface typefaceApplyStyles = ReactTypefaceUtils.applyStyles(paint.getTypeface(), style, weight, family, assetManager);
            paint.setFontFeatureSettings(fontFeatureSettingsParam);
            paint.setTypeface(typefaceApplyStyles);
            paint.setSubpixelText(true);
            if (ReactNativeFeatureFlags.enableAndroidLinearText()) {
                paint.setLinearText(true);
            }
        }

        private Companion() {
        }
    }

    public CustomStyleSpan(int i10, int i11, String str, String str2, AssetManager assetManager) {
        AbstractC2855l.g(assetManager, "assetManager");
        this.privateStyle = i10;
        this.privateWeight = i11;
        this.fontFeatureSettings = str;
        this.fontFamily = str2;
        this.assetManager = assetManager;
    }

    public final String getFontFamily() {
        return this.fontFamily;
    }

    public final String getFontFeatureSettings() {
        return this.fontFeatureSettings;
    }

    public final int getStyle() {
        int i10 = this.privateStyle;
        if (i10 == -1) {
            return 0;
        }
        return i10;
    }

    public final int getWeight() {
        int i10 = this.privateWeight;
        return i10 == -1 ? ReactFontManager.TypefaceStyle.NORMAL : i10;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint ds) {
        AbstractC2855l.g(ds, "ds");
        INSTANCE.apply(ds, this.privateStyle, this.privateWeight, this.fontFeatureSettings, this.fontFamily, this.assetManager);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint paint) {
        AbstractC2855l.g(paint, "paint");
        INSTANCE.apply(paint, this.privateStyle, this.privateWeight, this.fontFeatureSettings, this.fontFamily, this.assetManager);
    }
}
