package Z2;

import android.graphics.Bitmap;
import g2.AbstractC2662a;
import m2.AbstractC2895b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b extends AbstractC2895b {
    protected abstract void a(Bitmap bitmap);

    @Override // m2.AbstractC2895b
    public void onNewResultImpl(m2.c cVar) {
        if (cVar.isFinished()) {
            AbstractC2662a abstractC2662a = (AbstractC2662a) cVar.getResult();
            try {
                a((abstractC2662a == null || !(abstractC2662a.J() instanceof d3.d)) ? null : ((d3.d) abstractC2662a.J()).h0());
            } finally {
                AbstractC2662a.B(abstractC2662a);
            }
        }
    }
}
