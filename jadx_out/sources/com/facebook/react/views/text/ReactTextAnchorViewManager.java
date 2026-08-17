package com.facebook.react.views.text;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.common.annotations.UnstableReactNativeAPI;
import com.facebook.react.uimanager.BackgroundStyleApplicator;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.LengthPercentage;
import com.facebook.react.uimanager.LengthPercentageType;
import com.facebook.react.uimanager.ViewDefaults;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.uimanager.style.BorderRadiusProp;
import com.facebook.react.uimanager.style.BorderStyle;
import com.facebook.react.uimanager.style.LogicalEdge;
import com.facebook.react.views.text.ReactBaseTextShadowNode;
import d2.AbstractC2325a;
import expo.modules.notifications.service.NotificationsService;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b,\b'\u0018\u0000*\n\b\u0000\u0010\u0002*\u0004\u0018\u00010\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\bH\u0001¢\u0006\u0004\b\u0019\u0010\fJ\u001f\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\"\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001bH\u0001¢\u0006\u0004\b!\u0010\u001eJ!\u0010%\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00042\b\u0010#\u001a\u0004\u0018\u00010\u0013H\u0001¢\u0006\u0004\b$\u0010\u0016J\u001f\u0010(\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\bH\u0001¢\u0006\u0004\b'\u0010\fJ!\u0010,\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00042\b\u0010)\u001a\u0004\u0018\u00010\u000eH\u0001¢\u0006\u0004\b*\u0010+J!\u0010/\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00042\b\u0010-\u001a\u0004\u0018\u00010\u0013H\u0001¢\u0006\u0004\b.\u0010\u0016J'\u00104\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u000e2\u0006\u00101\u001a\u00020\u001bH\u0001¢\u0006\u0004\b2\u00103J!\u00107\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00042\b\u00105\u001a\u0004\u0018\u00010\u0013H\u0001¢\u0006\u0004\b6\u0010\u0016J'\u0010:\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u000e2\u0006\u00108\u001a\u00020\u001bH\u0001¢\u0006\u0004\b9\u00103J)\u0010=\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u000e2\b\u0010)\u001a\u0004\u0018\u00010\u000eH\u0001¢\u0006\u0004\b;\u0010<J\u001f\u0010@\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010>\u001a\u00020\bH\u0001¢\u0006\u0004\b?\u0010\fJ\u001f\u0010C\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010A\u001a\u00020\bH\u0001¢\u0006\u0004\bB\u0010\fJ!\u0010F\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00042\b\u0010D\u001a\u0004\u0018\u00010\u0013H\u0001¢\u0006\u0004\bE\u0010\u0016¨\u0006G"}, d2 = {"Lcom/facebook/react/views/text/ReactTextAnchorViewManager;", "Lcom/facebook/react/views/text/ReactBaseTextShadowNode;", "C", "Lcom/facebook/react/uimanager/BaseViewManager;", "Lcom/facebook/react/views/text/ReactTextView;", "<init>", "()V", "view", PointerEventHelper.POINTER_TYPE_UNKNOWN, "accessible", "Li7/B;", "setAccessible$ReactAndroid_release", "(Lcom/facebook/react/views/text/ReactTextView;Z)V", "setAccessible", PointerEventHelper.POINTER_TYPE_UNKNOWN, ViewProps.NUMBER_OF_LINES, "setNumberOfLines$ReactAndroid_release", "(Lcom/facebook/react/views/text/ReactTextView;I)V", "setNumberOfLines", PointerEventHelper.POINTER_TYPE_UNKNOWN, ViewProps.ELLIPSIZE_MODE, "setEllipsizeMode$ReactAndroid_release", "(Lcom/facebook/react/views/text/ReactTextView;Ljava/lang/String;)V", "setEllipsizeMode", ViewProps.ADJUSTS_FONT_SIZE_TO_FIT, "setAdjustFontSizeToFit$ReactAndroid_release", "setAdjustFontSizeToFit", PointerEventHelper.POINTER_TYPE_UNKNOWN, ViewProps.FONT_SIZE, "setFontSize$ReactAndroid_release", "(Lcom/facebook/react/views/text/ReactTextView;F)V", "setFontSize", ViewProps.LETTER_SPACING, "setLetterSpacing$ReactAndroid_release", "setLetterSpacing", ViewProps.TEXT_ALIGN_VERTICAL, "setTextAlignVertical$ReactAndroid_release", "setTextAlignVertical", "isSelectable", "setSelectable$ReactAndroid_release", "setSelectable", ViewProps.COLOR, "setSelectionColor$ReactAndroid_release", "(Lcom/facebook/react/views/text/ReactTextView;Ljava/lang/Integer;)V", "setSelectionColor", "frequency", "setAndroidHyphenationFrequency$ReactAndroid_release", "setAndroidHyphenationFrequency", "index", ViewProps.BORDER_RADIUS, "setBorderRadius$ReactAndroid_release", "(Lcom/facebook/react/views/text/ReactTextView;IF)V", "setBorderRadius", "borderStyle", "setBorderStyle$ReactAndroid_release", "setBorderStyle", "width", "setBorderWidth$ReactAndroid_release", "setBorderWidth", "setBorderColor$ReactAndroid_release", "(Lcom/facebook/react/views/text/ReactTextView;ILjava/lang/Integer;)V", "setBorderColor", "includepad", "setIncludeFontPadding$ReactAndroid_release", "setIncludeFontPadding", "disabled", "setDisabled$ReactAndroid_release", "setDisabled", NotificationsService.EVENT_TYPE_KEY, "setDataDetectorType$ReactAndroid_release", "setDataDetectorType", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@UnstableReactNativeAPI
public abstract class ReactTextAnchorViewManager<C extends ReactBaseTextShadowNode> extends BaseViewManager<ReactTextView, C> {
    @ReactProp(name = "accessible")
    public final void setAccessible$ReactAndroid_release(ReactTextView view, boolean accessible) {
        AbstractC2855l.g(view, "view");
        view.setFocusable(accessible);
    }

    @ReactProp(name = ViewProps.ADJUSTS_FONT_SIZE_TO_FIT)
    public final void setAdjustFontSizeToFit$ReactAndroid_release(ReactTextView view, boolean adjustsFontSizeToFit) {
        AbstractC2855l.g(view, "view");
        view.setAdjustFontSizeToFit(adjustsFontSizeToFit);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
    
        if (r5.equals("none") == false) goto L21;
     */
    @ReactProp(name = "android_hyphenationFrequency")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setAndroidHyphenationFrequency$ReactAndroid_release(ReactTextView view, String frequency) {
        AbstractC2855l.g(view, "view");
        if (frequency != null) {
            int iHashCode = frequency.hashCode();
            if (iHashCode != -1039745817) {
                if (iHashCode != 3154575) {
                    if (iHashCode == 3387192) {
                    }
                } else if (frequency.equals("full")) {
                    view.setHyphenationFrequency(2);
                    return;
                }
            } else if (frequency.equals("normal")) {
                view.setHyphenationFrequency(1);
                return;
            }
            AbstractC2325a.I(ReactConstants.TAG, "Invalid android_hyphenationFrequency: " + frequency);
            view.setHyphenationFrequency(0);
            return;
        }
        view.setHyphenationFrequency(0);
    }

    @ReactPropGroup(customType = "Color", names = {ViewProps.BORDER_COLOR, ViewProps.BORDER_LEFT_COLOR, ViewProps.BORDER_RIGHT_COLOR, ViewProps.BORDER_TOP_COLOR, ViewProps.BORDER_BOTTOM_COLOR})
    public final void setBorderColor$ReactAndroid_release(ReactTextView view, int index, Integer color) {
        AbstractC2855l.g(view, "view");
        BackgroundStyleApplicator.setBorderColor(view, LogicalEdge.values()[index], color);
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {ViewProps.BORDER_RADIUS, ViewProps.BORDER_TOP_LEFT_RADIUS, ViewProps.BORDER_TOP_RIGHT_RADIUS, ViewProps.BORDER_BOTTOM_RIGHT_RADIUS, ViewProps.BORDER_BOTTOM_LEFT_RADIUS})
    public final void setBorderRadius$ReactAndroid_release(ReactTextView view, int index, float borderRadius) {
        AbstractC2855l.g(view, "view");
        BackgroundStyleApplicator.setBorderRadius(view, BorderRadiusProp.values()[index], Float.isNaN(borderRadius) ? null : new LengthPercentage(borderRadius, LengthPercentageType.POINT));
    }

    @ReactProp(name = "borderStyle")
    public final void setBorderStyle$ReactAndroid_release(ReactTextView view, String borderStyle) {
        AbstractC2855l.g(view, "view");
        BackgroundStyleApplicator.setBorderStyle(view, borderStyle == null ? null : BorderStyle.INSTANCE.fromString(borderStyle));
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {ViewProps.BORDER_WIDTH, ViewProps.BORDER_LEFT_WIDTH, ViewProps.BORDER_RIGHT_WIDTH, ViewProps.BORDER_TOP_WIDTH, ViewProps.BORDER_BOTTOM_WIDTH, ViewProps.BORDER_START_WIDTH, ViewProps.BORDER_END_WIDTH})
    public final void setBorderWidth$ReactAndroid_release(ReactTextView view, int index, float width) {
        AbstractC2855l.g(view, "view");
        BackgroundStyleApplicator.setBorderWidth(view, LogicalEdge.values()[index], Float.valueOf(width));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @ReactProp(name = "dataDetectorType")
    public final void setDataDetectorType$ReactAndroid_release(ReactTextView view, String type) {
        AbstractC2855l.g(view, "view");
        if (type != null) {
            switch (type.hashCode()) {
                case -1192969641:
                    if (type.equals("phoneNumber")) {
                        view.setLinkifyMask(4);
                        return;
                    }
                    break;
                case 96673:
                    if (type.equals("all")) {
                        view.setLinkifyMask(15);
                        return;
                    }
                    break;
                case 3321850:
                    if (type.equals("link")) {
                        view.setLinkifyMask(1);
                        return;
                    }
                    break;
                case 96619420:
                    if (type.equals("email")) {
                        view.setLinkifyMask(2);
                        return;
                    }
                    break;
            }
        }
        view.setLinkifyMask(0);
    }

    @ReactProp(defaultBoolean = false, name = "disabled")
    public final void setDisabled$ReactAndroid_release(ReactTextView view, boolean disabled) {
        AbstractC2855l.g(view, "view");
        view.setEnabled(!disabled);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
    
        if (r4.equals("tail") == false) goto L22;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @ReactProp(name = ViewProps.ELLIPSIZE_MODE)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setEllipsizeMode$ReactAndroid_release(ReactTextView view, String ellipsizeMode) {
        AbstractC2855l.g(view, "view");
        if (ellipsizeMode != null) {
            switch (ellipsizeMode.hashCode()) {
                case -1074341483:
                    if (ellipsizeMode.equals("middle")) {
                        view.setEllipsizeLocation(TextUtils.TruncateAt.MIDDLE);
                    }
                    AbstractC2325a.I(ReactConstants.TAG, "Invalid ellipsizeMode: " + ellipsizeMode);
                    view.setEllipsizeLocation(TextUtils.TruncateAt.END);
                    break;
                case 3056464:
                    if (ellipsizeMode.equals("clip")) {
                        view.setEllipsizeLocation(null);
                    }
                    AbstractC2325a.I(ReactConstants.TAG, "Invalid ellipsizeMode: " + ellipsizeMode);
                    view.setEllipsizeLocation(TextUtils.TruncateAt.END);
                    break;
                case 3198432:
                    if (ellipsizeMode.equals("head")) {
                        view.setEllipsizeLocation(TextUtils.TruncateAt.START);
                    }
                    AbstractC2325a.I(ReactConstants.TAG, "Invalid ellipsizeMode: " + ellipsizeMode);
                    view.setEllipsizeLocation(TextUtils.TruncateAt.END);
                    break;
                case 3552336:
                    break;
                default:
                    AbstractC2325a.I(ReactConstants.TAG, "Invalid ellipsizeMode: " + ellipsizeMode);
                    view.setEllipsizeLocation(TextUtils.TruncateAt.END);
                    break;
            }
            return;
        }
        view.setEllipsizeLocation(TextUtils.TruncateAt.END);
    }

    @ReactProp(name = ViewProps.FONT_SIZE)
    public final void setFontSize$ReactAndroid_release(ReactTextView view, float fontSize) {
        AbstractC2855l.g(view, "view");
        view.setFontSize(fontSize);
    }

    @ReactProp(defaultBoolean = true, name = ViewProps.INCLUDE_FONT_PADDING)
    public final void setIncludeFontPadding$ReactAndroid_release(ReactTextView view, boolean includepad) {
        AbstractC2855l.g(view, "view");
        view.setIncludeFontPadding(includepad);
    }

    @ReactProp(defaultFloat = 0.0f, name = ViewProps.LETTER_SPACING)
    public final void setLetterSpacing$ReactAndroid_release(ReactTextView view, float letterSpacing) {
        AbstractC2855l.g(view, "view");
        view.setLetterSpacing(letterSpacing);
    }

    @ReactProp(defaultInt = ViewDefaults.NUMBER_OF_LINES, name = ViewProps.NUMBER_OF_LINES)
    public final void setNumberOfLines$ReactAndroid_release(ReactTextView view, int numberOfLines) {
        AbstractC2855l.g(view, "view");
        view.setNumberOfLines(numberOfLines);
    }

    @ReactProp(name = "selectable")
    public final void setSelectable$ReactAndroid_release(ReactTextView view, boolean isSelectable) {
        AbstractC2855l.g(view, "view");
        view.setTextIsSelectable(isSelectable);
    }

    @ReactProp(customType = "Color", name = "selectionColor")
    public final void setSelectionColor$ReactAndroid_release(ReactTextView view, Integer color) {
        int defaultTextColorHighlight;
        AbstractC2855l.g(view, "view");
        if (color != null) {
            defaultTextColorHighlight = color.intValue();
        } else {
            Context context = view.getContext();
            AbstractC2855l.f(context, "getContext(...)");
            defaultTextColorHighlight = DefaultStyleValuesUtil.getDefaultTextColorHighlight(context);
        }
        view.setHighlightColor(defaultTextColorHighlight);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        if (r5.equals("auto") == false) goto L22;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @ReactProp(name = ViewProps.TEXT_ALIGN_VERTICAL)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setTextAlignVertical$ReactAndroid_release(ReactTextView view, String textAlignVertical) {
        AbstractC2855l.g(view, "view");
        if (textAlignVertical != null) {
            switch (textAlignVertical.hashCode()) {
                case -1383228885:
                    if (textAlignVertical.equals(ViewProps.BOTTOM)) {
                        view.setGravityVertical(80);
                    }
                    AbstractC2325a.I(ReactConstants.TAG, "Invalid textAlignVertical: " + textAlignVertical);
                    view.setGravityVertical(0);
                    break;
                case -1364013995:
                    if (textAlignVertical.equals("center")) {
                        view.setGravityVertical(16);
                    }
                    AbstractC2325a.I(ReactConstants.TAG, "Invalid textAlignVertical: " + textAlignVertical);
                    view.setGravityVertical(0);
                    break;
                case 115029:
                    if (textAlignVertical.equals(ViewProps.TOP)) {
                        view.setGravityVertical(48);
                    }
                    AbstractC2325a.I(ReactConstants.TAG, "Invalid textAlignVertical: " + textAlignVertical);
                    view.setGravityVertical(0);
                    break;
                case 3005871:
                    break;
                default:
                    AbstractC2325a.I(ReactConstants.TAG, "Invalid textAlignVertical: " + textAlignVertical);
                    view.setGravityVertical(0);
                    break;
            }
            return;
        }
        view.setGravityVertical(0);
    }
}
