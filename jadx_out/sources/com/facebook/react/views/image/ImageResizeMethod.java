package com.facebook.react.views.image;

import com.facebook.react.common.ReactConstants;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.PointerEventHelper;
import d2.AbstractC2325a;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p7.AbstractC3083a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lcom/facebook/react/views/image/ImageResizeMethod;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "(Ljava/lang/String;I)V", "AUTO", "RESIZE", "SCALE", "NONE", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ImageResizeMethod {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ImageResizeMethod[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final ImageResizeMethod AUTO = new ImageResizeMethod("AUTO", 0);
    public static final ImageResizeMethod RESIZE = new ImageResizeMethod("RESIZE", 1);
    public static final ImageResizeMethod SCALE = new ImageResizeMethod("SCALE", 2);
    public static final ImageResizeMethod NONE = new ImageResizeMethod("NONE", 3);

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/facebook/react/views/image/ImageResizeMethod$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "parse", "Lcom/facebook/react/views/image/ImageResizeMethod;", ViewProps.RESIZE_METHOD, PointerEventHelper.POINTER_TYPE_UNKNOWN, "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x003b, code lost:
        
            if (r3.equals("auto") == false) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0044, code lost:
        
            if (r3.equals(com.facebook.react.uimanager.events.PointerEventHelper.POINTER_TYPE_UNKNOWN) == false) goto L31;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final ImageResizeMethod parse(String resizeMethod) {
            if (resizeMethod != null) {
                int iHashCode = resizeMethod.hashCode();
                if (iHashCode != -934437708) {
                    if (iHashCode != 0) {
                        if (iHashCode != 3005871) {
                            if (iHashCode != 3387192) {
                                if (iHashCode == 109250890 && resizeMethod.equals("scale")) {
                                    return ImageResizeMethod.SCALE;
                                }
                            } else if (resizeMethod.equals("none")) {
                                return ImageResizeMethod.NONE;
                            }
                        }
                    }
                } else if (resizeMethod.equals("resize")) {
                    return ImageResizeMethod.RESIZE;
                }
                AbstractC2325a.I(ReactConstants.TAG, "Invalid resize method: '" + resizeMethod + "'");
                return ImageResizeMethod.AUTO;
            }
            return ImageResizeMethod.AUTO;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ ImageResizeMethod[] $values() {
        return new ImageResizeMethod[]{AUTO, RESIZE, SCALE, NONE};
    }

    static {
        ImageResizeMethod[] imageResizeMethodArr$values = $values();
        $VALUES = imageResizeMethodArr$values;
        $ENTRIES = AbstractC3083a.a(imageResizeMethodArr$values);
        INSTANCE = new Companion(null);
    }

    private ImageResizeMethod(String str, int i10) {
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static final ImageResizeMethod parse(String str) {
        return INSTANCE.parse(str);
    }

    public static ImageResizeMethod valueOf(String str) {
        return (ImageResizeMethod) Enum.valueOf(ImageResizeMethod.class, str);
    }

    public static ImageResizeMethod[] values() {
        return (ImageResizeMethod[]) $VALUES.clone();
    }
}
