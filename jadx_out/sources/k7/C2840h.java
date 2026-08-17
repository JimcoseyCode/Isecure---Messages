package k7;

import j7.AbstractC2800q;
import j7.T;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: k7.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2840h implements Externalizable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f29184i = new a(null);
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Collection f29185g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f29186h;

    /* JADX INFO: renamed from: k7.h$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C2840h(Collection collection, int i10) {
        AbstractC2855l.g(collection, "collection");
        this.f29185g = collection;
        this.f29186h = i10;
    }

    private final Object readResolve() {
        return this.f29185g;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput input) throws IOException {
        Collection collectionA;
        AbstractC2855l.g(input, "input");
        byte b10 = input.readByte();
        int i10 = b10 & 1;
        if ((b10 & (-2)) != 0) {
            throw new InvalidObjectException("Unsupported flags value: " + ((int) b10) + '.');
        }
        int i11 = input.readInt();
        if (i11 < 0) {
            throw new InvalidObjectException("Illegal size value: " + i11 + '.');
        }
        int i12 = 0;
        if (i10 == 0) {
            List listD = AbstractC2800q.d(i11);
            while (i12 < i11) {
                listD.add(input.readObject());
                i12++;
            }
            collectionA = AbstractC2800q.a(listD);
        } else {
            if (i10 != 1) {
                throw new InvalidObjectException("Unsupported collection type tag: " + i10 + '.');
            }
            Set setC = T.c(i11);
            while (i12 < i11) {
                setC.add(input.readObject());
                i12++;
            }
            collectionA = T.a(setC);
        }
        this.f29185g = collectionA;
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput output) throws IOException {
        AbstractC2855l.g(output, "output");
        output.writeByte(this.f29186h);
        output.writeInt(this.f29185g.size());
        Iterator it = this.f29185g.iterator();
        while (it.hasNext()) {
            output.writeObject(it.next());
        }
    }
}
