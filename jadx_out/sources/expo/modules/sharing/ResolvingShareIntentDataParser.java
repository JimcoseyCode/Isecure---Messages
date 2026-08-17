package expo.modules.sharing;

import P8.q;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.util.Patterns;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.notifications.service.NotificationsService;
import j7.AbstractC2800q;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t7.AbstractC3375b;
import t7.AbstractC3376c;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lexpo/modules/sharing/ResolvingShareIntentDataParser;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "Companion", "expo-sharing_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ResolvingShareIntentDataParser {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0002J&\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\nH\u0002J \u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\rH\u0002J\u001a\u0010\u0014\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u001f\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0012H\u0002¢\u0006\u0002\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\rH\u0002¨\u0006\u001c"}, d2 = {"Lexpo/modules/sharing/ResolvingShareIntentDataParser$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "parse", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/sharing/ResolvedSharePayload;", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "handleSendAction", NotificationsService.EVENT_TYPE_KEY, PointerEventHelper.POINTER_TYPE_UNKNOWN, "handleSendMultipleAction", "extractTextPayload", "resolveUri", "uri", "Landroid/net/Uri;", "mimeType", "getFileName", "resolver", "Landroid/content/ContentResolver;", "getFileSize", PointerEventHelper.POINTER_TYPE_UNKNOWN, "(Landroid/content/ContentResolver;Landroid/net/Uri;)Ljava/lang/Long;", "resolveUrlContext", "urlString", "expo-sharing_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final List<ResolvedSharePayload> extractTextPayload(Intent intent) {
            String stringExtra = intent.getStringExtra("android.intent.extra.TEXT");
            if (stringExtra == null) {
                return AbstractC2800q.j();
            }
            if (Patterns.WEB_URL.matcher(stringExtra).matches()) {
                return AbstractC2800q.e(resolveUrlContext(stringExtra));
            }
            ResolvedSharePayload resolvedSharePayload = new ResolvedSharePayload(null, null, null, null, null, null, null, null, 255, null);
            resolvedSharePayload.setValue(stringExtra);
            resolvedSharePayload.setShareType(ShareType.Text);
            resolvedSharePayload.setMimeType("text/plain");
            return AbstractC2800q.e(resolvedSharePayload);
        }

        private final String getFileName(ContentResolver resolver, Uri uri) throws IOException {
            Cursor cursorQuery = resolver.query(uri, null, null, null, null);
            String str = null;
            if (cursorQuery != null) {
                try {
                    Cursor cursor = cursorQuery.moveToFirst() ? cursorQuery : null;
                    Integer numValueOf = cursor != null ? Integer.valueOf(cursor.getColumnIndex("_display_name")) : null;
                    String string = (numValueOf == null || numValueOf.intValue() == -1) ? null : cursorQuery.getString(numValueOf.intValue());
                    AbstractC3376c.a(cursorQuery, null);
                    str = string;
                } finally {
                }
            }
            return str == null ? uri.getLastPathSegment() : str;
        }

        private final Long getFileSize(ContentResolver resolver, Uri uri) throws IOException {
            Cursor cursorQuery = resolver.query(uri, null, null, null, null);
            if (cursorQuery == null) {
                return null;
            }
            try {
                Cursor cursor = cursorQuery.moveToFirst() ? cursorQuery : null;
                Integer numValueOf = cursor != null ? Integer.valueOf(cursor.getColumnIndex("_size")) : null;
                Long lValueOf = (numValueOf == null || numValueOf.intValue() == -1) ? null : Long.valueOf(cursorQuery.getLong(numValueOf.intValue()));
                AbstractC3376c.a(cursorQuery, null);
                return lValueOf;
            } finally {
            }
        }

        private final List<ResolvedSharePayload> handleSendAction(Context context, Intent intent, String type) {
            if (AbstractC2855l.b(type, "text/plain")) {
                return extractTextPayload(intent);
            }
            Uri uri = (Uri) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("android.intent.extra.STREAM", Uri.class) : intent.getParcelableExtra("android.intent.extra.STREAM"));
            return AbstractC2800q.n(uri != null ? ResolvingShareIntentDataParser.INSTANCE.resolveUri(context, uri, type) : null);
        }

        private final List<ResolvedSharePayload> handleSendMultipleAction(Context context, Intent intent, String type) {
            ArrayList parcelableArrayListExtra = Build.VERSION.SDK_INT >= 33 ? intent.getParcelableArrayListExtra("android.intent.extra.STREAM", Uri.class) : intent.getParcelableArrayListExtra("android.intent.extra.STREAM");
            if (parcelableArrayListExtra == null) {
                return AbstractC2800q.j();
            }
            ArrayList arrayList = new ArrayList(AbstractC2800q.u(parcelableArrayListExtra, 10));
            Iterator it = parcelableArrayListExtra.iterator();
            while (it.hasNext()) {
                arrayList.add(ResolvingShareIntentDataParser.INSTANCE.resolveUri(context, (Uri) it.next(), type));
            }
            return arrayList;
        }

        private final ResolvedSharePayload resolveUri(Context context, Uri uri, String mimeType) throws IOException {
            ContentResolver contentResolver = context.getContentResolver();
            AbstractC2855l.d(contentResolver);
            String fileName = getFileName(contentResolver, uri);
            if (fileName == null) {
                fileName = "unknown";
            }
            Long fileSize = getFileSize(contentResolver, uri);
            String type = contentResolver.getType(uri);
            if (type == null) {
                type = mimeType;
            }
            ShareType shareTypeFromMimeType = ShareType.INSTANCE.fromMimeType(type);
            File file = new File(context.getCacheDir(), fileName);
            try {
                InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
                if (inputStreamOpenInputStream != null) {
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            AbstractC3375b.b(inputStreamOpenInputStream, fileOutputStream, 0, 2, null);
                            AbstractC3376c.a(fileOutputStream, null);
                            AbstractC3376c.a(inputStreamOpenInputStream, null);
                        } finally {
                        }
                    } finally {
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            ResolvedSharePayload resolvedSharePayload = new ResolvedSharePayload(null, null, null, null, null, null, null, null, 255, null);
            String string = uri.toString();
            AbstractC2855l.f(string, "toString(...)");
            resolvedSharePayload.setValue(string);
            resolvedSharePayload.setShareType(shareTypeFromMimeType);
            resolvedSharePayload.setMimeType(type);
            resolvedSharePayload.setContentUri(file.toURI().toString());
            resolvedSharePayload.setContentType(ContentType.INSTANCE.fromMimeType(type));
            resolvedSharePayload.setContentSize(fileSize);
            resolvedSharePayload.setContentMimeType(type);
            resolvedSharePayload.setOriginalName(fileName);
            return resolvedSharePayload;
        }

        private final ResolvedSharePayload resolveUrlContext(String urlString) throws FailedToResolveSharedDataException {
            int iD0;
            ResolvedSharePayload resolvedSharePayload = new ResolvedSharePayload(null, null, null, null, null, null, null, null, 255, null);
            resolvedSharePayload.setValue(urlString);
            resolvedSharePayload.setShareType(ShareType.Url);
            String str = "text/plain";
            resolvedSharePayload.setMimeType("text/plain");
            try {
                URLConnection uRLConnectionOpenConnection = new URL(urlString).openConnection();
                AbstractC2855l.e(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setInstanceFollowRedirects(true);
                httpURLConnection.setConnectTimeout(5000);
                httpURLConnection.setReadTimeout(5000);
                httpURLConnection.connect();
                URL url = httpURLConnection.getURL();
                String string = url.toString();
                AbstractC2855l.f(string, "toString(...)");
                String contentType = httpURLConnection.getContentType();
                if (contentType != null) {
                    str = contentType;
                }
                long contentLengthLong = httpURLConnection.getContentLengthLong();
                String headerField = httpURLConnection.getHeaderField("Content-Disposition");
                AbstractC2855l.d(url);
                String lastPathComponent = ShareIntoUtilsKt.getLastPathComponent(url);
                if (headerField != null && (iD0 = q.d0(headerField, "filename=", 0, false, 6, null)) > 0) {
                    String strSubstring = headerField.substring(iD0 + 9);
                    AbstractC2855l.f(strSubstring, "substring(...)");
                    lastPathComponent = q.E(strSubstring, "\"", PointerEventHelper.POINTER_TYPE_UNKNOWN, false, 4, null);
                }
                ContentType contentTypeFromMimeType = ContentType.INSTANCE.fromMimeType(str);
                resolvedSharePayload.setContentUri(string);
                resolvedSharePayload.setContentType(contentTypeFromMimeType);
                resolvedSharePayload.setContentSize(contentLengthLong >= 0 ? Long.valueOf(contentLengthLong) : null);
                resolvedSharePayload.setContentMimeType(str);
                resolvedSharePayload.setOriginalName(lastPathComponent);
                httpURLConnection.disconnect();
                return resolvedSharePayload;
            } catch (Exception e10) {
                throw new FailedToResolveSharedDataException("Failed to resolve shared data: " + e10.getMessage(), e10);
            }
        }

        public final List<ResolvedSharePayload> parse(Context context, Intent intent) {
            AbstractC2855l.g(context, "context");
            AbstractC2855l.g(intent, "intent");
            String type = intent.getType();
            if (type == null) {
                return AbstractC2800q.j();
            }
            String action = intent.getAction();
            if (action != null) {
                int iHashCode = action.hashCode();
                if (iHashCode != -1173264947) {
                    if (iHashCode == -58484670 && action.equals("android.intent.action.SEND_MULTIPLE")) {
                        return handleSendMultipleAction(context, intent, type);
                    }
                } else if (action.equals("android.intent.action.SEND")) {
                    return handleSendAction(context, intent, type);
                }
            }
            return AbstractC2800q.j();
        }

        private Companion() {
        }
    }
}
