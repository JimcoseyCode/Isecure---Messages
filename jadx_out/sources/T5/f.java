package T5;

import com.facebook.react.uimanager.events.PointerEventHelper;
import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class f implements Externalizable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f10510g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f10512i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f10515l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f10517n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f10519p;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f10511h = PointerEventHelper.POINTER_TYPE_UNKNOWN;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f10513j = PointerEventHelper.POINTER_TYPE_UNKNOWN;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private List f10514k = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f10516m = PointerEventHelper.POINTER_TYPE_UNKNOWN;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f10518o = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f10520q = PointerEventHelper.POINTER_TYPE_UNKNOWN;

    public String a() {
        return this.f10520q;
    }

    public String b(int i10) {
        return (String) this.f10514k.get(i10);
    }

    public int c() {
        return this.f10514k.size();
    }

    public String d() {
        return this.f10516m;
    }

    public String e() {
        return this.f10511h;
    }

    public int f() {
        return c();
    }

    public f g(String str) {
        this.f10519p = true;
        this.f10520q = str;
        return this;
    }

    public String getFormat() {
        return this.f10513j;
    }

    public f h(String str) {
        this.f10512i = true;
        this.f10513j = str;
        return this;
    }

    public f i(String str) {
        this.f10515l = true;
        this.f10516m = str;
        return this;
    }

    public f j(boolean z10) {
        this.f10517n = true;
        this.f10518o = z10;
        return this;
    }

    public f k(String str) {
        this.f10510g = true;
        this.f10511h = str;
        return this;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws IOException {
        k(objectInput.readUTF());
        h(objectInput.readUTF());
        int i10 = objectInput.readInt();
        for (int i11 = 0; i11 < i10; i11++) {
            this.f10514k.add(objectInput.readUTF());
        }
        if (objectInput.readBoolean()) {
            i(objectInput.readUTF());
        }
        if (objectInput.readBoolean()) {
            g(objectInput.readUTF());
        }
        j(objectInput.readBoolean());
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeUTF(this.f10511h);
        objectOutput.writeUTF(this.f10513j);
        int iF = f();
        objectOutput.writeInt(iF);
        for (int i10 = 0; i10 < iF; i10++) {
            objectOutput.writeUTF((String) this.f10514k.get(i10));
        }
        objectOutput.writeBoolean(this.f10515l);
        if (this.f10515l) {
            objectOutput.writeUTF(this.f10516m);
        }
        objectOutput.writeBoolean(this.f10519p);
        if (this.f10519p) {
            objectOutput.writeUTF(this.f10520q);
        }
        objectOutput.writeBoolean(this.f10518o);
    }
}
