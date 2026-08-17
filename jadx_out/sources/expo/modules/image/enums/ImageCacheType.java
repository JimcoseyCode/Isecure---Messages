package expo.modules.image.enums;

import com.facebook.react.uimanager.events.PointerEventHelper;
import j7.AbstractC2793j;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p7.AbstractC3083a;
import v1.EnumC3417a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u001d\b\u0002\u0012\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lexpo/modules/image/enums/ImageCacheType;", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lv1/a;", "dataSources", "<init>", "(Ljava/lang/String;I[Lv1/a;)V", "[Lv1/a;", "Companion", "NONE", "DISK", "MEMORY", "expo-image_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ImageCacheType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ImageCacheType[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final EnumC3417a[] dataSources;
    public static final ImageCacheType NONE = new ImageCacheType("NONE", 0, EnumC3417a.LOCAL, EnumC3417a.REMOTE);
    public static final ImageCacheType DISK = new ImageCacheType("DISK", 1, EnumC3417a.DATA_DISK_CACHE, EnumC3417a.RESOURCE_DISK_CACHE);
    public static final ImageCacheType MEMORY = new ImageCacheType("MEMORY", 2, EnumC3417a.MEMORY_CACHE);

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lexpo/modules/image/enums/ImageCacheType$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "Lv1/a;", "value", "Lexpo/modules/image/enums/ImageCacheType;", "fromNativeValue", "(Lv1/a;)Lexpo/modules/image/enums/ImageCacheType;", "expo-image_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ImageCacheType fromNativeValue(EnumC3417a value) {
            Object next;
            AbstractC2855l.g(value, "value");
            Iterator<E> it = ImageCacheType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (AbstractC2793j.B(((ImageCacheType) next).dataSources, value)) {
                    break;
                }
            }
            ImageCacheType imageCacheType = (ImageCacheType) next;
            return imageCacheType == null ? ImageCacheType.NONE : imageCacheType;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ ImageCacheType[] $values() {
        return new ImageCacheType[]{NONE, DISK, MEMORY};
    }

    static {
        ImageCacheType[] imageCacheTypeArr$values = $values();
        $VALUES = imageCacheTypeArr$values;
        $ENTRIES = AbstractC3083a.a(imageCacheTypeArr$values);
        INSTANCE = new Companion(null);
    }

    private ImageCacheType(String str, int i10, EnumC3417a... enumC3417aArr) {
        this.dataSources = enumC3417aArr;
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static ImageCacheType valueOf(String str) {
        return (ImageCacheType) Enum.valueOf(ImageCacheType.class, str);
    }

    public static ImageCacheType[] values() {
        return (ImageCacheType[]) $VALUES.clone();
    }
}
