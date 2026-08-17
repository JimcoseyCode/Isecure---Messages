package m8;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: m8.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class C2954m extends AbstractList implements RandomAccess, n {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final n f29698h = new C2954m().k();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f29699g;

    public C2954m() {
        this.f29699g = new ArrayList();
    }

    private static AbstractC2945d o(Object obj) {
        return obj instanceof AbstractC2945d ? (AbstractC2945d) obj : obj instanceof String ? AbstractC2945d.s((String) obj) : AbstractC2945d.q((byte[]) obj);
    }

    private static String p(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof AbstractC2945d ? ((AbstractC2945d) obj).E() : AbstractC2951j.b((byte[]) obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f29699g.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void add(int i10, String str) {
        this.f29699g.add(i10, str);
        ((AbstractList) this).modCount++;
    }

    @Override // m8.n
    public List g() {
        return Collections.unmodifiableList(this.f29699g);
    }

    @Override // m8.n
    public void i(AbstractC2945d abstractC2945d) {
        this.f29699g.add(abstractC2945d);
        ((AbstractList) this).modCount++;
    }

    @Override // m8.n
    public AbstractC2945d j(int i10) {
        Object obj = this.f29699g.get(i10);
        AbstractC2945d abstractC2945dO = o(obj);
        if (abstractC2945dO != obj) {
            this.f29699g.set(i10, abstractC2945dO);
        }
        return abstractC2945dO;
    }

    @Override // m8.n
    public n k() {
        return new w(this);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public String get(int i10) {
        Object obj = this.f29699g.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC2945d) {
            AbstractC2945d abstractC2945d = (AbstractC2945d) obj;
            String strE = abstractC2945d.E();
            if (abstractC2945d.x()) {
                this.f29699g.set(i10, strE);
            }
            return strE;
        }
        byte[] bArr = (byte[]) obj;
        String strB = AbstractC2951j.b(bArr);
        if (AbstractC2951j.a(bArr)) {
            this.f29699g.set(i10, strB);
        }
        return strB;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public String remove(int i10) {
        Object objRemove = this.f29699g.remove(i10);
        ((AbstractList) this).modCount++;
        return p(objRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public String set(int i10, String str) {
        return p(this.f29699g.set(i10, str));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f29699g.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection collection) {
        if (collection instanceof n) {
            collection = ((n) collection).g();
        }
        boolean zAddAll = this.f29699g.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    public C2954m(n nVar) {
        this.f29699g = new ArrayList(nVar.size());
        addAll(nVar);
    }
}
