package H1;

import x1.r;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class e extends F1.j implements r {
    public e(c cVar) {
        super(cVar);
    }

    @Override // x1.v
    public Class a() {
        return c.class;
    }

    @Override // x1.v
    public int b() {
        return ((c) this.f1800g).i();
    }

    @Override // F1.j, x1.r
    public void initialize() {
        ((c) this.f1800g).e().prepareToDraw();
    }

    @Override // x1.v
    public void recycle() {
        ((c) this.f1800g).stop();
        ((c) this.f1800g).k();
    }
}
