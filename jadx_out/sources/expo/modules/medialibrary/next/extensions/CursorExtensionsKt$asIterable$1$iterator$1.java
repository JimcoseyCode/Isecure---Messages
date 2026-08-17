package expo.modules.medialibrary.next.extensions;

import android.database.Cursor;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import x7.InterfaceC3550a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0006\u001a\u00020\u0004H\u0096\u0002J\t\u0010\u0007\u001a\u00020\u0002H\u0096\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"expo/modules/medialibrary/next/extensions/CursorExtensionsKt$asIterable$1$iterator$1", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Landroid/database/Cursor;", "hasNextCalled", PointerEventHelper.POINTER_TYPE_UNKNOWN, "hasNextCache", "hasNext", "next", "expo-media-library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CursorExtensionsKt$asIterable$1$iterator$1 implements Iterator<Cursor>, InterfaceC3550a {
    final /* synthetic */ Cursor $this_asIterable;
    private boolean hasNextCache;
    private boolean hasNextCalled;

    CursorExtensionsKt$asIterable$1$iterator$1(Cursor cursor) {
        this.$this_asIterable = cursor;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (!this.hasNextCalled) {
            this.hasNextCache = this.$this_asIterable.moveToNext();
            this.hasNextCalled = true;
        }
        return this.hasNextCache;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public Cursor next() {
        if (!this.hasNextCalled && !this.$this_asIterable.moveToNext()) {
            throw new NoSuchElementException();
        }
        this.hasNextCalled = false;
        return this.$this_asIterable;
    }
}
