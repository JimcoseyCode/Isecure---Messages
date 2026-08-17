package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final V0.b f17163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final char[] f17164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f17165c = new a(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Typeface f17166d;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final SparseArray f17167a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private p f17168b;

        private a() {
            this(1);
        }

        a a(int i10) {
            SparseArray sparseArray = this.f17167a;
            if (sparseArray == null) {
                return null;
            }
            return (a) sparseArray.get(i10);
        }

        final p b() {
            return this.f17168b;
        }

        void c(p pVar, int i10, int i11) {
            a aVarA = a(pVar.b(i10));
            if (aVarA == null) {
                aVarA = new a();
                this.f17167a.put(pVar.b(i10), aVarA);
            }
            if (i11 > i10) {
                aVarA.c(pVar, i10 + 1, i11);
            } else {
                aVarA.f17168b = pVar;
            }
        }

        a(int i10) {
            this.f17167a = new SparseArray(i10);
        }
    }

    private n(Typeface typeface, V0.b bVar) {
        this.f17166d = typeface;
        this.f17163a = bVar;
        this.f17164b = new char[bVar.k() * 2];
        a(bVar);
    }

    private void a(V0.b bVar) {
        int iK = bVar.k();
        for (int i10 = 0; i10 < iK; i10++) {
            p pVar = new p(this, i10);
            Character.toChars(pVar.f(), this.f17164b, i10 * 2);
            h(pVar);
        }
    }

    public static n b(Typeface typeface, ByteBuffer byteBuffer) {
        try {
            D0.l.a("EmojiCompat.MetadataRepo.create");
            return new n(typeface, m.b(byteBuffer));
        } finally {
            D0.l.b();
        }
    }

    public char[] c() {
        return this.f17164b;
    }

    public V0.b d() {
        return this.f17163a;
    }

    int e() {
        return this.f17163a.l();
    }

    a f() {
        return this.f17165c;
    }

    Typeface g() {
        return this.f17166d;
    }

    void h(p pVar) {
        H0.g.h(pVar, "emoji metadata cannot be null");
        H0.g.b(pVar.c() > 0, "invalid metadata codepoint length");
        this.f17165c.c(pVar, 0, pVar.c() - 1);
    }
}
