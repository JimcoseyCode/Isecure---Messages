package T5;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class h implements Externalizable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List f10581g = new ArrayList();

    public int a() {
        return this.f10581g.size();
    }

    public List b() {
        return this.f10581g;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws IOException {
        int i10 = objectInput.readInt();
        for (int i11 = 0; i11 < i10; i11++) {
            g gVar = new g();
            gVar.readExternal(objectInput);
            this.f10581g.add(gVar);
        }
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        int iA = a();
        objectOutput.writeInt(iA);
        for (int i10 = 0; i10 < iA; i10++) {
            ((g) this.f10581g.get(i10)).writeExternal(objectOutput);
        }
    }
}
