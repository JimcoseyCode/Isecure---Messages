package expo.modules.medialibrary.next.extensions;

import android.database.Cursor;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import x7.InterfaceC3550a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"asIterable", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Landroid/database/Cursor;", "expo-media-library_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class CursorExtensionsKt {

    /* JADX INFO: renamed from: expo.modules.medialibrary.next.extensions.CursorExtensionsKt$asIterable$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0096\u0002¨\u0006\u0005"}, d2 = {"expo/modules/medialibrary/next/extensions/CursorExtensionsKt$asIterable$1", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Landroid/database/Cursor;", "iterator", PointerEventHelper.POINTER_TYPE_UNKNOWN, "expo-media-library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass1 implements Iterable<Cursor>, InterfaceC3550a {
        final /* synthetic */ Cursor $this_asIterable;

        AnonymousClass1(Cursor cursor) {
            this.$this_asIterable = cursor;
        }

        @Override // java.lang.Iterable
        public Iterator<Cursor> iterator() {
            return new CursorExtensionsKt$asIterable$1$iterator$1(this.$this_asIterable);
        }
    }

    public static final Iterable<Cursor> asIterable(Cursor cursor) {
        AbstractC2855l.g(cursor, "<this>");
        return new AnonymousClass1(cursor);
    }
}
