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
public class i implements Externalizable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f10582g;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f10586k;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f10583h = PointerEventHelper.POINTER_TYPE_UNKNOWN;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List f10584i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private List f10585j = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f10587l = PointerEventHelper.POINTER_TYPE_UNKNOWN;

    public String a() {
        return this.f10583h;
    }

    public int b(int i10) {
        return ((Integer) this.f10584i.get(i10)).intValue();
    }

    public int c() {
        return this.f10584i.size();
    }

    public List d() {
        return this.f10584i;
    }

    public int e() {
        return this.f10585j.size();
    }

    public List f() {
        return this.f10585j;
    }

    public i g(String str) {
        this.f10586k = true;
        this.f10587l = str;
        return this;
    }

    public i h(String str) {
        this.f10582g = true;
        this.f10583h = str;
        return this;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws IOException {
        if (objectInput.readBoolean()) {
            h(objectInput.readUTF());
        }
        int i10 = objectInput.readInt();
        for (int i11 = 0; i11 < i10; i11++) {
            this.f10584i.add(Integer.valueOf(objectInput.readInt()));
        }
        int i12 = objectInput.readInt();
        for (int i13 = 0; i13 < i12; i13++) {
            this.f10585j.add(Integer.valueOf(objectInput.readInt()));
        }
        if (objectInput.readBoolean()) {
            g(objectInput.readUTF());
        }
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeBoolean(this.f10582g);
        if (this.f10582g) {
            objectOutput.writeUTF(this.f10583h);
        }
        int iC = c();
        objectOutput.writeInt(iC);
        for (int i10 = 0; i10 < iC; i10++) {
            objectOutput.writeInt(((Integer) this.f10584i.get(i10)).intValue());
        }
        int iE = e();
        objectOutput.writeInt(iE);
        for (int i11 = 0; i11 < iE; i11++) {
            objectOutput.writeInt(((Integer) this.f10585j.get(i11)).intValue());
        }
        objectOutput.writeBoolean(this.f10586k);
        if (this.f10586k) {
            objectOutput.writeUTF(this.f10587l);
        }
    }
}
