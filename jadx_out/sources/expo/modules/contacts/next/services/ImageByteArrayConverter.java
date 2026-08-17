package expo.modules.contacts.next.services;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import t7.AbstractC3376c;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lexpo/modules/contacts/next/services/ImageByteArrayConverter;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "contentResolver", "Landroid/content/ContentResolver;", "<init>", "(Landroid/content/ContentResolver;)V", "toByteArray", PointerEventHelper.POINTER_TYPE_UNKNOWN, "uri", "Landroid/net/Uri;", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ImageByteArrayConverter {
    private final ContentResolver contentResolver;

    public ImageByteArrayConverter(ContentResolver contentResolver) {
        AbstractC2855l.g(contentResolver, "contentResolver");
        this.contentResolver = contentResolver;
    }

    public final byte[] toByteArray(Uri uri) throws IOException {
        AbstractC2855l.g(uri, "uri");
        InputStream inputStreamOpenInputStream = this.contentResolver.openInputStream(uri);
        try {
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream);
            AbstractC3376c.a(inputStreamOpenInputStream, null);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmapDecodeStream.compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            AbstractC2855l.f(byteArray, "toByteArray(...)");
            return byteArray;
        } finally {
        }
    }
}
