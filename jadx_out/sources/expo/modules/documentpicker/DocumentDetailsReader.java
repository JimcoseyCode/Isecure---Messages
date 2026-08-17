package expo.modules.documentpicker;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import t7.AbstractC3376c;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lexpo/modules/documentpicker/DocumentDetailsReader;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "read", "Lexpo/modules/documentpicker/DocumentInfo;", "uri", "Landroid/net/Uri;", "expo-document-picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DocumentDetailsReader {
    private final Context context;

    public DocumentDetailsReader(Context context) {
        AbstractC2855l.g(context, "context");
        this.context = context;
    }

    public final DocumentInfo read(Uri uri) throws IOException {
        long jCurrentTimeMillis;
        AbstractC2855l.g(uri, "uri");
        Cursor cursorQuery = this.context.getContentResolver().query(uri, null, null, null, null);
        if (cursorQuery == null) {
            throw new IOException("Failed to read document details for URI: " + uri);
        }
        try {
            cursorQuery.moveToFirst();
            String string = cursorQuery.getString(cursorQuery.getColumnIndex("_display_name"));
            int columnIndex = cursorQuery.getColumnIndex("_size");
            Long lValueOf = !cursorQuery.isNull(columnIndex) ? Long.valueOf(cursorQuery.getLong(columnIndex)) : null;
            String type = this.context.getContentResolver().getType(uri);
            try {
                int columnIndex2 = cursorQuery.getColumnIndex("last_modified");
                if (columnIndex2 == -1 || cursorQuery.isNull(columnIndex2)) {
                    String path = uri.getPath();
                    if (path == null) {
                        path = PointerEventHelper.POINTER_TYPE_UNKNOWN;
                    }
                    File file = new File(path);
                    jCurrentTimeMillis = file.exists() ? file.lastModified() : System.currentTimeMillis();
                } else {
                    jCurrentTimeMillis = cursorQuery.getLong(columnIndex2);
                }
            } catch (Exception unused) {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            AbstractC2855l.d(string);
            DocumentInfo documentInfo = new DocumentInfo(uri, string, type, lValueOf, jCurrentTimeMillis);
            AbstractC3376c.a(cursorQuery, null);
            return documentInfo;
        } finally {
        }
    }
}
