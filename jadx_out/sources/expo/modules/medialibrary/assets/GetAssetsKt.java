package expo.modules.medialibrary.assets;

import R8.D0;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Parcelable;
import expo.modules.medialibrary.AssetQueryException;
import expo.modules.medialibrary.AssetsOptions;
import expo.modules.medialibrary.MediaLibraryConstantsKt;
import expo.modules.medialibrary.PermissionsException;
import expo.modules.medialibrary.UnableToLoadException;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import n7.f;
import t7.AbstractC3376c;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroid/content/Context;", "context", "Lexpo/modules/medialibrary/AssetsOptions;", "assetOptions", "Landroid/os/Bundle;", "getAssets", "(Landroid/content/Context;Lexpo/modules/medialibrary/AssetsOptions;Ln7/f;)Ljava/lang/Object;", "expo-media-library_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class GetAssetsKt {
    public static final Object getAssets(Context context, AssetsOptions assetsOptions, f fVar) throws Exception {
        Throwable unableToLoadException;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            GetAssetsQuery queryFromOptions = GetAssetsQueryKt.getQueryFromOptions(assetsOptions);
            String selection = queryFromOptions.getSelection();
            String order = queryFromOptions.getOrder();
            double limit = queryFromOptions.getLimit();
            int offset = queryFromOptions.getOffset();
            Cursor cursorQuery = contentResolver.query(MediaLibraryConstantsKt.getEXTERNAL_CONTENT_URI(), MediaLibraryConstantsKt.getASSET_PROJECTION(), selection, null, order);
            try {
                D0.g(fVar.getContext());
                if (cursorQuery == null) {
                    throw new AssetQueryException();
                }
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                AbstractC2855l.d(contentResolver);
                int i10 = (int) limit;
                Boolean resolveWithFullInfo = assetsOptions.getResolveWithFullInfo();
                AssetUtilsKt.putAssetsInfo(contentResolver, cursorQuery, arrayList, i10, offset, resolveWithFullInfo != null ? resolveWithFullInfo.booleanValue() : false);
                Bundle bundle = new Bundle();
                bundle.putParcelableArrayList("assets", arrayList);
                bundle.putBoolean("hasNextPage", !cursorQuery.isAfterLast());
                bundle.putString("endCursor", String.valueOf(cursorQuery.getPosition()));
                bundle.putInt("totalCount", cursorQuery.getCount());
                AbstractC3376c.a(cursorQuery, null);
                return bundle;
            } finally {
            }
        } catch (Exception e10) {
            if (e10 instanceof SecurityException) {
                unableToLoadException = new UnableToLoadException("Could not get asset: need read_external_storage permission", e10);
            } else if (e10 instanceof IOException) {
                unableToLoadException = new UnableToLoadException("Could not read file: " + e10.getMessage(), e10);
            } else if (e10 instanceof IllegalArgumentException) {
                String message = e10.getMessage();
                if (message == null) {
                    message = "Invalid MediaType " + e10.getMessage();
                }
                unableToLoadException = new UnableToLoadException(message, e10);
            } else {
                if (!(e10 instanceof UnsupportedOperationException)) {
                    throw e10;
                }
                String message2 = e10.getMessage();
                if (message2 == null) {
                    message2 = "Permission denied: " + e10.getMessage();
                }
                unableToLoadException = new PermissionsException(message2);
            }
            throw unableToLoadException;
        }
    }
}
