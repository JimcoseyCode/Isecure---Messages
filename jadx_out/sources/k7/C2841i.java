package k7;

import j7.K;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: k7.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class C2841i implements Externalizable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f29187h = new a(null);
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map f29188g;

    /* JADX INFO: renamed from: k7.i$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C2841i(Map map) {
        AbstractC2855l.g(map, "map");
        this.f29188g = map;
    }

    private final Object readResolve() {
        return this.f29188g;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput input) throws IOException {
        AbstractC2855l.g(input, "input");
        byte b10 = input.readByte();
        if (b10 != 0) {
            throw new InvalidObjectException("Unsupported flags value: " + ((int) b10));
        }
        int i10 = input.readInt();
        if (i10 < 0) {
            throw new InvalidObjectException("Illegal size value: " + i10 + '.');
        }
        Map mapD = K.d(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            mapD.put(input.readObject(), input.readObject());
        }
        this.f29188g = K.b(mapD);
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput output) throws IOException {
        AbstractC2855l.g(output, "output");
        output.writeByte(0);
        output.writeInt(this.f29188g.size());
        for (Map.Entry entry : this.f29188g.entrySet()) {
            output.writeObject(entry.getKey());
            output.writeObject(entry.getValue());
        }
    }
}
