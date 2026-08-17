package expo.modules.medialibrary.next.extensions.resolver;

import android.content.ContentResolver;
import android.net.Uri;
import i7.C2735B;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import t7.AbstractC3375b;
import t7.AbstractC3376c;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroid/content/ContentResolver;", "Landroid/net/Uri;", "from", "to", "Li7/B;", "copyUriContent", "(Landroid/content/ContentResolver;Landroid/net/Uri;Landroid/net/Uri;)V", "expo-media-library_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class TransferExtensionsKt {
    public static final void copyUriContent(ContentResolver contentResolver, Uri from, Uri to) throws IOException {
        AbstractC2855l.g(contentResolver, "<this>");
        AbstractC2855l.g(from, "from");
        AbstractC2855l.g(to, "to");
        InputStream inputStreamOpenInputStream = contentResolver.openInputStream(from);
        try {
            OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(to);
            if (inputStreamOpenInputStream != null && outputStreamOpenOutputStream != null) {
                try {
                    AbstractC3375b.b(inputStreamOpenInputStream, outputStreamOpenOutputStream, 0, 2, null);
                } finally {
                }
            }
            C2735B c2735b = C2735B.f28704a;
            AbstractC3376c.a(outputStreamOpenOutputStream, null);
            AbstractC3376c.a(inputStreamOpenInputStream, null);
        } finally {
        }
    }
}
