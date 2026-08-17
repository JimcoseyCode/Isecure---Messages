package expo.modules.font;

import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.records.Field;
import expo.modules.kotlin.records.Record;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0014J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J8\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\bHÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u0015\u0012\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\f\u001a\u0004\b\u0017\u0010\u0018¨\u0006%"}, d2 = {"Lexpo/modules/font/RenderToImageOptions;", "Lexpo/modules/kotlin/records/Record;", ViewProps.FONT_FAMILY, PointerEventHelper.POINTER_TYPE_UNKNOWN, "size", PointerEventHelper.POINTER_TYPE_UNKNOWN, ViewProps.LINE_HEIGHT, ViewProps.COLOR, PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "(Ljava/lang/String;FLjava/lang/Float;I)V", "getFontFamily$annotations", "()V", "getFontFamily", "()Ljava/lang/String;", "getSize$annotations", "getSize", "()F", "getLineHeight$annotations", "getLineHeight", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getColor$annotations", "getColor", "()I", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;FLjava/lang/Float;I)Lexpo/modules/font/RenderToImageOptions;", "equals", PointerEventHelper.POINTER_TYPE_UNKNOWN, "other", PointerEventHelper.POINTER_TYPE_UNKNOWN, "hashCode", "toString", "expo-font_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class RenderToImageOptions implements Record {
    private final int color;
    private final String fontFamily;
    private final Float lineHeight;
    private final float size;

    public RenderToImageOptions() {
        this(null, 0.0f, null, 0, 15, null);
    }

    public static /* synthetic */ RenderToImageOptions copy$default(RenderToImageOptions renderToImageOptions, String str, float f10, Float f11, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = renderToImageOptions.fontFamily;
        }
        if ((i11 & 2) != 0) {
            f10 = renderToImageOptions.size;
        }
        if ((i11 & 4) != 0) {
            f11 = renderToImageOptions.lineHeight;
        }
        if ((i11 & 8) != 0) {
            i10 = renderToImageOptions.color;
        }
        return renderToImageOptions.copy(str, f10, f11, i10);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFontFamily() {
        return this.fontFamily;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Float getLineHeight() {
        return this.lineHeight;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getColor() {
        return this.color;
    }

    public final RenderToImageOptions copy(String fontFamily, float size, Float lineHeight, int color) {
        AbstractC2855l.g(fontFamily, "fontFamily");
        return new RenderToImageOptions(fontFamily, size, lineHeight, color);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RenderToImageOptions)) {
            return false;
        }
        RenderToImageOptions renderToImageOptions = (RenderToImageOptions) other;
        return AbstractC2855l.b(this.fontFamily, renderToImageOptions.fontFamily) && Float.compare(this.size, renderToImageOptions.size) == 0 && AbstractC2855l.b(this.lineHeight, renderToImageOptions.lineHeight) && this.color == renderToImageOptions.color;
    }

    public final int getColor() {
        return this.color;
    }

    public final String getFontFamily() {
        return this.fontFamily;
    }

    public final Float getLineHeight() {
        return this.lineHeight;
    }

    public final float getSize() {
        return this.size;
    }

    public int hashCode() {
        int iHashCode = ((this.fontFamily.hashCode() * 31) + Float.hashCode(this.size)) * 31;
        Float f10 = this.lineHeight;
        return ((iHashCode + (f10 == null ? 0 : f10.hashCode())) * 31) + Integer.hashCode(this.color);
    }

    public String toString() {
        return "RenderToImageOptions(fontFamily=" + this.fontFamily + ", size=" + this.size + ", lineHeight=" + this.lineHeight + ", color=" + this.color + ")";
    }

    public RenderToImageOptions(String fontFamily, float f10, Float f11, int i10) {
        AbstractC2855l.g(fontFamily, "fontFamily");
        this.fontFamily = fontFamily;
        this.size = f10;
        this.lineHeight = f11;
        this.color = i10;
    }

    public /* synthetic */ RenderToImageOptions(String str, float f10, Float f11, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? PointerEventHelper.POINTER_TYPE_UNKNOWN : str, (i11 & 2) != 0 ? 24.0f : f10, (i11 & 4) != 0 ? null : f11, (i11 & 8) != 0 ? -16777216 : i10);
    }

    @Field
    public static /* synthetic */ void getColor$annotations() {
    }

    @Field
    public static /* synthetic */ void getFontFamily$annotations() {
    }

    @Field
    public static /* synthetic */ void getLineHeight$annotations() {
    }

    @Field
    public static /* synthetic */ void getSize$annotations() {
    }
}
