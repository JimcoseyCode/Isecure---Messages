package com.facebook.react.modules.network;

import P8.C1385d;
import P8.o;
import P8.q;
import android.content.Context;
import android.net.Uri;
import android.util.Base64;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.uimanager.events.PointerEventHelper;
import d2.AbstractC2325a;
import e9.C;
import e9.x;
import expo.modules.notifications.notifications.presentation.builders.ExpoNotificationBuilder;
import j7.AbstractC2800q;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.List;
import java.util.ListIterator;
import java.util.zip.GZIPOutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import t7.AbstractC3376c;
import t9.AbstractC3386c;
import t9.F;
import t9.InterfaceC3392i;
import t9.k;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0015\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001f\u001a\u00020\u00162\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u001e\u001a\u00020\fH\u0007¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010%\u001a\u00020$2\u0006\u0010!\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\b%\u0010&J\u0019\u0010(\u001a\u0004\u0018\u00010\u00162\u0006\u0010'\u001a\u00020\u0004H\u0007¢\u0006\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010+R\u0014\u0010-\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010+¨\u0006."}, d2 = {"Lcom/facebook/react/modules/network/RequestBodyUtil;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "encodingType", PointerEventHelper.POINTER_TYPE_UNKNOWN, "isGzipEncoding", "(Ljava/lang/String;)Z", "Landroid/content/Context;", "context", "fileContentUriStr", "Ljava/io/InputStream;", "getFileInputStream", "(Landroid/content/Context;Ljava/lang/String;)Ljava/io/InputStream;", "Landroid/net/Uri;", "uri", "getDownloadFileInputStream", "(Landroid/content/Context;Landroid/net/Uri;)Ljava/io/InputStream;", "Le9/x;", "mediaType", ExpoNotificationBuilder.EXTRAS_BODY_KEY, "Le9/C;", "createGzip", "(Le9/x;Ljava/lang/String;)Le9/C;", "Lt9/F;", "source", "Li7/B;", "closeQuietly", "(Lt9/F;)V", "inputStream", "create", "(Le9/x;Ljava/io/InputStream;)Le9/C;", "requestBody", "Lcom/facebook/react/modules/network/ProgressListener;", "listener", "Lcom/facebook/react/modules/network/ProgressRequestBody;", "createProgressRequest", "(Le9/C;Lcom/facebook/react/modules/network/ProgressListener;)Lcom/facebook/react/modules/network/ProgressRequestBody;", "method", "getEmptyBody", "(Ljava/lang/String;)Le9/C;", "CONTENT_ENCODING_GZIP", "Ljava/lang/String;", "NAME", "TEMP_FILE_SUFFIX", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RequestBodyUtil {
    private static final String CONTENT_ENCODING_GZIP = "gzip";
    public static final RequestBodyUtil INSTANCE = new RequestBodyUtil();
    private static final String NAME = "RequestBodyUtil";
    private static final String TEMP_FILE_SUFFIX = "temp";

    private RequestBodyUtil() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void closeQuietly(F source) {
        try {
            source.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final C create(final x mediaType, final InputStream inputStream) {
        AbstractC2855l.g(inputStream, "inputStream");
        return new C() { // from class: com.facebook.react.modules.network.RequestBodyUtil.create.1
            @Override // e9.C
            public long contentLength() {
                try {
                    return inputStream.available();
                } catch (IOException unused) {
                    return 0L;
                }
            }

            @Override // e9.C
            /* JADX INFO: renamed from: contentType, reason: from getter */
            public x get$mediaType() {
                return mediaType;
            }

            @Override // e9.C
            public void writeTo(InterfaceC3392i sink) throws IOException {
                AbstractC2855l.g(sink, "sink");
                F fE = null;
                try {
                    fE = AbstractC3386c.a().e(inputStream);
                    sink.G(fE);
                } finally {
                    if (fE != null) {
                        RequestBodyUtil.INSTANCE.closeQuietly(fE);
                    }
                }
            }
        };
    }

    public static final C createGzip(x mediaType, String body) {
        AbstractC2855l.g(body, "body");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            byte[] bytes = body.getBytes(C1385d.f8858b);
            AbstractC2855l.f(bytes, "getBytes(...)");
            gZIPOutputStream.write(bytes);
            gZIPOutputStream.close();
            C.a aVar = C.Companion;
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            AbstractC2855l.f(byteArray, "toByteArray(...)");
            return C.a.i(aVar, mediaType, byteArray, 0, 0, 12, null);
        } catch (IOException unused) {
            return null;
        }
    }

    public static final ProgressRequestBody createProgressRequest(C requestBody, ProgressListener listener) {
        AbstractC2855l.g(requestBody, "requestBody");
        AbstractC2855l.g(listener, "listener");
        return new ProgressRequestBody(requestBody, listener);
    }

    private final InputStream getDownloadFileInputStream(Context context, Uri uri) throws IOException {
        File fileCreateTempFile = File.createTempFile(NAME, TEMP_FILE_SUFFIX, context.getApplicationContext().getCacheDir());
        fileCreateTempFile.deleteOnExit();
        URL url = new URL(uri.toString());
        FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
        try {
            InputStream inputStreamOpenStream = url.openStream();
            try {
                ReadableByteChannel readableByteChannelNewChannel = Channels.newChannel(inputStreamOpenStream);
                try {
                    fileOutputStream.getChannel().transferFrom(readableByteChannelNewChannel, 0L, Long.MAX_VALUE);
                    FileInputStream fileInputStream = new FileInputStream(fileCreateTempFile);
                    AbstractC3376c.a(readableByteChannelNewChannel, null);
                    AbstractC3376c.a(inputStreamOpenStream, null);
                    AbstractC3376c.a(fileOutputStream, null);
                    return fileInputStream;
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public static final C getEmptyBody(String method) {
        AbstractC2855l.g(method, "method");
        int iHashCode = method.hashCode();
        if (iHashCode == 79599 ? method.equals("PUT") : iHashCode == 2461856 ? method.equals("POST") : iHashCode == 75900968 && method.equals("PATCH")) {
            return C.Companion.c(null, k.f32604k);
        }
        return null;
    }

    public static final InputStream getFileInputStream(Context context, String fileContentUriStr) {
        List listJ;
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(fileContentUriStr, "fileContentUriStr");
        try {
            Uri uri = Uri.parse(fileContentUriStr);
            String scheme = uri.getScheme();
            if (scheme != null && q.K(scheme, "http", false, 2, null)) {
                RequestBodyUtil requestBodyUtil = INSTANCE;
                AbstractC2855l.d(uri);
                return requestBodyUtil.getDownloadFileInputStream(context, uri);
            }
            if (!q.K(fileContentUriStr, "data:", false, 2, null)) {
                return context.getContentResolver().openInputStream(uri);
            }
            List listF = new o(",").f(fileContentUriStr, 0);
            if (listF.isEmpty()) {
                listJ = AbstractC2800q.j();
            } else {
                ListIterator listIterator = listF.listIterator(listF.size());
                while (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() != 0) {
                        listJ = AbstractC2800q.I0(listF, listIterator.nextIndex() + 1);
                        break;
                    }
                }
                listJ = AbstractC2800q.j();
            }
            return new ByteArrayInputStream(Base64.decode(((String[]) listJ.toArray(new String[0]))[1], 0));
        } catch (Exception e10) {
            AbstractC2325a.n(ReactConstants.TAG, "Could not retrieve file for contentUri " + fileContentUriStr, e10);
            return null;
        }
    }

    public static final boolean isGzipEncoding(String encodingType) {
        return q.x(CONTENT_ENCODING_GZIP, encodingType, true);
    }
}
