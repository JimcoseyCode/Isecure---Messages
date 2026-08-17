package expo.modules.medialibrary.next.objects.query;

import Q8.c;
import Q8.d;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.types.Either;
import expo.modules.medialibrary.next.objects.wrappers.MediaType;
import expo.modules.medialibrary.next.records.AssetField;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lexpo/modules/medialibrary/next/objects/query/MediaStoreQueryFormatter;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "Companion", "expo-media-library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MediaStoreQueryFormatter {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tJ\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u000bJ\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\n¨\u0006\f"}, d2 = {"Lexpo/modules/medialibrary/next/objects/query/MediaStoreQueryFormatter$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "parse", PointerEventHelper.POINTER_TYPE_UNKNOWN, "field", "Lexpo/modules/medialibrary/next/records/AssetField;", "value", "Lexpo/modules/kotlin/types/Either;", "Lexpo/modules/medialibrary/next/objects/wrappers/MediaType;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "expo-media-library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String parse(AssetField field, Either<MediaType, Long> value) {
            AbstractC2855l.g(field, "field");
            AbstractC2855l.g(value, "value");
            return value.isFirstType(D.b(MediaType.class)) ? parse(value.getFirstType(D.b(MediaType.class))) : parse(field, value.getSecondType(D.b(Long.TYPE)).longValue());
        }

        private Companion() {
        }

        public final String parse(AssetField field, long value) {
            AbstractC2855l.g(field, "field");
            if (field == AssetField.MODIFICATION_TIME) {
                return String.valueOf(Q8.a.x(c.j(value, d.f9888j)));
            }
            return String.valueOf(value);
        }

        public final String parse(MediaType value) {
            AbstractC2855l.g(value, "value");
            return String.valueOf(value.toMediaStoreValue());
        }
    }
}
