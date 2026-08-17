package com.facebook.react.modules.fresco;

import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import p7.AbstractC3083a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/facebook/react/modules/fresco/ImageCacheControl;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "RELOAD", "FORCE_CACHE", "ONLY_IF_CACHED", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ImageCacheControl {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ImageCacheControl[] $VALUES;
    public static final ImageCacheControl DEFAULT = new ImageCacheControl("DEFAULT", 0);
    public static final ImageCacheControl RELOAD = new ImageCacheControl("RELOAD", 1);
    public static final ImageCacheControl FORCE_CACHE = new ImageCacheControl("FORCE_CACHE", 2);
    public static final ImageCacheControl ONLY_IF_CACHED = new ImageCacheControl("ONLY_IF_CACHED", 3);

    private static final /* synthetic */ ImageCacheControl[] $values() {
        return new ImageCacheControl[]{DEFAULT, RELOAD, FORCE_CACHE, ONLY_IF_CACHED};
    }

    static {
        ImageCacheControl[] imageCacheControlArr$values = $values();
        $VALUES = imageCacheControlArr$values;
        $ENTRIES = AbstractC3083a.a(imageCacheControlArr$values);
    }

    private ImageCacheControl(String str, int i10) {
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static ImageCacheControl valueOf(String str) {
        return (ImageCacheControl) Enum.valueOf(ImageCacheControl.class, str);
    }

    public static ImageCacheControl[] values() {
        return (ImageCacheControl[]) $VALUES.clone();
    }
}
