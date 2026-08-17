package expo.modules.medialibrary.assets;

import P8.q;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.medialibrary.AssetsOptions;
import expo.modules.medialibrary.MediaType;
import expo.modules.medialibrary.SortBy;
import i7.AbstractC2753p;
import i7.C2752o;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0002\u001a\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005\u001a\u0014\u0010\u000b\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\r¨\u0006\u000e"}, d2 = {"getQueryFromOptions", "Lexpo/modules/medialibrary/assets/GetAssetsQuery;", "input", "Lexpo/modules/medialibrary/AssetsOptions;", "createSelectionString", PointerEventHelper.POINTER_TYPE_UNKNOWN, "parseMediaType", PointerEventHelper.POINTER_TYPE_UNKNOWN, "mediaTypeName", "parseSortByKey", "key", "convertOrderDescriptors", "orderDescriptor", PointerEventHelper.POINTER_TYPE_UNKNOWN, "expo-media-library_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class GetAssetsQueryKt {
    public static final String convertOrderDescriptors(List<String> orderDescriptor) throws IllegalArgumentException {
        AbstractC2855l.g(orderDescriptor, "orderDescriptor");
        ArrayList arrayList = new ArrayList(20);
        Iterator<String> it = orderDescriptor.iterator();
        while (it.hasNext()) {
            List listG0 = q.G0(it.next(), new String[]{" "}, false, 0, 6, null);
            if (listG0.size() != 2) {
                throw new IllegalArgumentException("Array sortBy in assetsOptions has invalid layout.");
            }
            arrayList.add(parseSortByKey((String) listG0.get(0)) + " " + ((String) listG0.get(1)));
        }
        return AbstractC2800q.o0(arrayList, ",", null, null, 0, null, null, 62, null);
    }

    private static final String createSelectionString(AssetsOptions assetsOptions) throws IllegalArgumentException {
        StringBuilder sb = new StringBuilder();
        if (assetsOptions.getAlbum() != null) {
            sb.append("bucket_id = " + assetsOptions.getAlbum());
            sb.append(" AND ");
        }
        List<String> mediaType = assetsOptions.getMediaType();
        if (mediaType.isEmpty() || mediaType.contains(MediaType.ALL.getApiName())) {
            sb.append("media_type != 0");
        } else {
            ArrayList arrayList = new ArrayList(AbstractC2800q.u(mediaType, 10));
            Iterator<T> it = mediaType.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(parseMediaType((String) it.next())));
            }
            sb.append("media_type IN (" + AbstractC2800q.o0(arrayList, ",", null, null, 0, null, null, 62, null) + ")");
        }
        Double createdAfter = assetsOptions.getCreatedAfter();
        if (createdAfter != null) {
            sb.append(" AND datetaken > " + ((long) createdAfter.doubleValue()));
        }
        Double createdBefore = assetsOptions.getCreatedBefore();
        if (createdBefore != null) {
            sb.append(" AND datetaken < " + ((long) createdBefore.doubleValue()));
        }
        String string = sb.toString();
        AbstractC2855l.f(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final GetAssetsQuery getQueryFromOptions(AssetsOptions input) throws IllegalArgumentException {
        Object objB;
        int iIntValue;
        AbstractC2855l.g(input, "input");
        double first = input.getFirst();
        String after = input.getAfter();
        if (after != null) {
            try {
                C2752o.a aVar = C2752o.f28721h;
                objB = C2752o.b(Integer.valueOf(Integer.parseInt(after)));
            } catch (Throwable th) {
                C2752o.a aVar2 = C2752o.f28721h;
                objB = C2752o.b(AbstractC2753p.a(th));
            }
            if (C2752o.f(objB)) {
                objB = null;
            }
            Integer num = (Integer) objB;
            iIntValue = num != null ? num.intValue() : 0;
        }
        return new GetAssetsQuery(createSelectionString(input), !input.getSortBy().isEmpty() ? convertOrderDescriptors(input.getSortBy()) : "bucket_display_name", first, iIntValue);
    }

    private static final int parseMediaType(String str) throws IllegalArgumentException {
        MediaType mediaTypeFromApiName = MediaType.INSTANCE.fromApiName(str);
        Integer mediaColumn = mediaTypeFromApiName != null ? mediaTypeFromApiName.getMediaColumn() : null;
        if (mediaColumn != null) {
            return mediaColumn.intValue();
        }
        throw new IllegalArgumentException("MediaType " + str + " is not supported!");
    }

    public static final String parseSortByKey(String key) throws IllegalArgumentException {
        AbstractC2855l.g(key, "key");
        SortBy sortByFromKeyName = SortBy.INSTANCE.fromKeyName(key);
        String mediaColumnName = sortByFromKeyName != null ? sortByFromKeyName.getMediaColumnName() : null;
        if (mediaColumnName != null) {
            return mediaColumnName;
        }
        throw new IllegalArgumentException("SortBy key " + key + " is not supported!");
    }
}
