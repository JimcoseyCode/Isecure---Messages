package expo.modules.medialibrary.next.extensions.resolver;

import android.database.Cursor;
import com.facebook.react.uimanager.events.PointerEventHelper;
import i7.C2750m;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u000b\u001a\u00020\n*\u00020\u00072\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u000fR\u0018\u0010\u001a\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u000f¨\u0006\u001c"}, d2 = {"Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreItemBuilder;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreItem;", "build", "()Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreItem;", "Landroid/database/Cursor;", "Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;", "property", "Li7/B;", "set", "(Landroid/database/Cursor;Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "displayName", "Ljava/lang/String;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "height", "Ljava/lang/Integer;", "width", PointerEventHelper.POINTER_TYPE_UNKNOWN, "dateTaken", "Ljava/lang/Long;", "dateModified", "duration", "data", "bucketId", "Companion", "expo-media-library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AssetMediaStoreItemBuilder {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private String bucketId;
    private String data;
    private Long dateModified;
    private Long dateTaken;
    private String displayName;
    private Long duration;
    private Integer height;
    private Integer width;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreItemBuilder$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "buildAssetMediaStoreItem", "Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreItem;", "Landroid/database/Cursor;", "includeDuration", PointerEventHelper.POINTER_TYPE_UNKNOWN, "expo-media-library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AssetMediaStoreItem buildAssetMediaStoreItem(Cursor cursor, boolean z10) {
            AbstractC2855l.g(cursor, "<this>");
            AssetMediaStoreItemBuilder assetMediaStoreItemBuilder = new AssetMediaStoreItemBuilder();
            AssetMediaStoreProperty[] assetMediaStorePropertyArrValues = AssetMediaStoreProperty.values();
            ArrayList arrayList = new ArrayList();
            for (AssetMediaStoreProperty assetMediaStoreProperty : assetMediaStorePropertyArrValues) {
                if (z10 || assetMediaStoreProperty != AssetMediaStoreProperty.Duration) {
                    arrayList.add(assetMediaStoreProperty);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                assetMediaStoreItemBuilder.set(cursor, (AssetMediaStoreProperty) it.next());
            }
            return assetMediaStoreItemBuilder.build();
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AssetMediaStoreProperty.values().length];
            try {
                iArr[AssetMediaStoreProperty.Data.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AssetMediaStoreProperty.DisplayName.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AssetMediaStoreProperty.Height.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AssetMediaStoreProperty.Width.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AssetMediaStoreProperty.DateTaken.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AssetMediaStoreProperty.DateModified.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AssetMediaStoreProperty.Duration.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[AssetMediaStoreProperty.BucketId.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final AssetMediaStoreItem build() {
        return new AssetMediaStoreItem(this.displayName, this.height, this.width, this.dateTaken, this.dateModified, this.duration, this.data, this.bucketId);
    }

    public final void set(Cursor cursor, AssetMediaStoreProperty property) {
        AbstractC2855l.g(cursor, "<this>");
        AbstractC2855l.g(property, "property");
        switch (WhenMappings.$EnumSwitchMapping$0[property.ordinal()]) {
            case 1:
                this.data = property.getString(cursor);
                return;
            case 2:
                this.displayName = property.getString(cursor);
                return;
            case 3:
                this.height = property.getInt(cursor);
                return;
            case 4:
                this.width = property.getInt(cursor);
                return;
            case 5:
                this.dateTaken = property.getLong(cursor);
                return;
            case 6:
                this.dateModified = property.getLong(cursor);
                return;
            case 7:
                this.duration = property.getLong(cursor);
                return;
            case 8:
                this.bucketId = property.getString(cursor);
                return;
            default:
                throw new C2750m();
        }
    }
}
