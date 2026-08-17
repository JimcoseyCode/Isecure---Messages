package androidx.transition;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.AbstractC1793k;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class t extends AbstractC1793k {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    int f18409U;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    ArrayList f18407S = new ArrayList();

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private boolean f18408T = true;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    boolean f18410V = false;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private int f18411W = 0;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a extends q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC1793k f18412a;

        a(AbstractC1793k abstractC1793k) {
            this.f18412a = abstractC1793k;
        }

        @Override // androidx.transition.AbstractC1793k.g
        public void d(AbstractC1793k abstractC1793k) {
            this.f18412a.a0();
            abstractC1793k.V(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class b extends q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        t f18414a;

        b(t tVar) {
            this.f18414a = tVar;
        }

        @Override // androidx.transition.q, androidx.transition.AbstractC1793k.g
        public void a(AbstractC1793k abstractC1793k) {
            t tVar = this.f18414a;
            if (tVar.f18410V) {
                return;
            }
            tVar.h0();
            this.f18414a.f18410V = true;
        }

        @Override // androidx.transition.AbstractC1793k.g
        public void d(AbstractC1793k abstractC1793k) {
            t tVar = this.f18414a;
            int i10 = tVar.f18409U - 1;
            tVar.f18409U = i10;
            if (i10 == 0) {
                tVar.f18410V = false;
                tVar.p();
            }
            abstractC1793k.V(this);
        }
    }

    private void o0(AbstractC1793k abstractC1793k) {
        this.f18407S.add(abstractC1793k);
        abstractC1793k.f18383x = this;
    }

    private void z0() {
        b bVar = new b(this);
        Iterator it = this.f18407S.iterator();
        while (it.hasNext()) {
            ((AbstractC1793k) it.next()).a(bVar);
        }
        this.f18409U = this.f18407S.size();
    }

    @Override // androidx.transition.AbstractC1793k
    public void T(View view) {
        super.T(view);
        int size = this.f18407S.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((AbstractC1793k) this.f18407S.get(i10)).T(view);
        }
    }

    @Override // androidx.transition.AbstractC1793k
    public void Y(View view) {
        super.Y(view);
        int size = this.f18407S.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((AbstractC1793k) this.f18407S.get(i10)).Y(view);
        }
    }

    @Override // androidx.transition.AbstractC1793k
    protected void a0() {
        if (this.f18407S.isEmpty()) {
            h0();
            p();
            return;
        }
        z0();
        if (this.f18408T) {
            Iterator it = this.f18407S.iterator();
            while (it.hasNext()) {
                ((AbstractC1793k) it.next()).a0();
            }
            return;
        }
        for (int i10 = 1; i10 < this.f18407S.size(); i10++) {
            ((AbstractC1793k) this.f18407S.get(i10 - 1)).a(new a((AbstractC1793k) this.f18407S.get(i10)));
        }
        AbstractC1793k abstractC1793k = (AbstractC1793k) this.f18407S.get(0);
        if (abstractC1793k != null) {
            abstractC1793k.a0();
        }
    }

    @Override // androidx.transition.AbstractC1793k
    public void c0(AbstractC1793k.f fVar) {
        super.c0(fVar);
        this.f18411W |= 8;
        int size = this.f18407S.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((AbstractC1793k) this.f18407S.get(i10)).c0(fVar);
        }
    }

    @Override // androidx.transition.AbstractC1793k
    protected void cancel() {
        super.cancel();
        int size = this.f18407S.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((AbstractC1793k) this.f18407S.get(i10)).cancel();
        }
    }

    @Override // androidx.transition.AbstractC1793k
    public void e0(AbstractC1789g abstractC1789g) {
        super.e0(abstractC1789g);
        this.f18411W |= 4;
        if (this.f18407S != null) {
            for (int i10 = 0; i10 < this.f18407S.size(); i10++) {
                ((AbstractC1793k) this.f18407S.get(i10)).e0(abstractC1789g);
            }
        }
    }

    @Override // androidx.transition.AbstractC1793k
    public void f0(s sVar) {
        super.f0(sVar);
        this.f18411W |= 2;
        int size = this.f18407S.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((AbstractC1793k) this.f18407S.get(i10)).f0(sVar);
        }
    }

    @Override // androidx.transition.AbstractC1793k
    public void g(v vVar) {
        if (K(vVar.f18417b)) {
            for (AbstractC1793k abstractC1793k : this.f18407S) {
                if (abstractC1793k.K(vVar.f18417b)) {
                    abstractC1793k.g(vVar);
                    vVar.f18418c.add(abstractC1793k);
                }
            }
        }
    }

    @Override // androidx.transition.AbstractC1793k
    void i(v vVar) {
        super.i(vVar);
        int size = this.f18407S.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((AbstractC1793k) this.f18407S.get(i10)).i(vVar);
        }
    }

    @Override // androidx.transition.AbstractC1793k
    String i0(String str) {
        String strI0 = super.i0(str);
        for (int i10 = 0; i10 < this.f18407S.size(); i10++) {
            StringBuilder sb = new StringBuilder();
            sb.append(strI0);
            sb.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
            sb.append(((AbstractC1793k) this.f18407S.get(i10)).i0(str + "  "));
            strI0 = sb.toString();
        }
        return strI0;
    }

    @Override // androidx.transition.AbstractC1793k
    public void j(v vVar) {
        if (K(vVar.f18417b)) {
            for (AbstractC1793k abstractC1793k : this.f18407S) {
                if (abstractC1793k.K(vVar.f18417b)) {
                    abstractC1793k.j(vVar);
                    vVar.f18418c.add(abstractC1793k);
                }
            }
        }
    }

    @Override // androidx.transition.AbstractC1793k
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public t a(AbstractC1793k.g gVar) {
        return (t) super.a(gVar);
    }

    @Override // androidx.transition.AbstractC1793k
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public AbstractC1793k clone() {
        t tVar = (t) super.clone();
        tVar.f18407S = new ArrayList();
        int size = this.f18407S.size();
        for (int i10 = 0; i10 < size; i10++) {
            tVar.o0(((AbstractC1793k) this.f18407S.get(i10)).clone());
        }
        return tVar;
    }

    @Override // androidx.transition.AbstractC1793k
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public t b(View view) {
        for (int i10 = 0; i10 < this.f18407S.size(); i10++) {
            ((AbstractC1793k) this.f18407S.get(i10)).b(view);
        }
        return (t) super.b(view);
    }

    public t n0(AbstractC1793k abstractC1793k) {
        o0(abstractC1793k);
        long j10 = this.f18368i;
        if (j10 >= 0) {
            abstractC1793k.b0(j10);
        }
        if ((this.f18411W & 1) != 0) {
            abstractC1793k.d0(v());
        }
        if ((this.f18411W & 2) != 0) {
            z();
            abstractC1793k.f0(null);
        }
        if ((this.f18411W & 4) != 0) {
            abstractC1793k.e0(y());
        }
        if ((this.f18411W & 8) != 0) {
            abstractC1793k.c0(u());
        }
        return this;
    }

    @Override // androidx.transition.AbstractC1793k
    void o(ViewGroup viewGroup, w wVar, w wVar2, ArrayList arrayList, ArrayList arrayList2) {
        long jC = C();
        int size = this.f18407S.size();
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC1793k abstractC1793k = (AbstractC1793k) this.f18407S.get(i10);
            if (jC > 0 && (this.f18408T || i10 == 0)) {
                long jC2 = abstractC1793k.C();
                if (jC2 > 0) {
                    abstractC1793k.g0(jC2 + jC);
                } else {
                    abstractC1793k.g0(jC);
                }
            }
            abstractC1793k.o(viewGroup, wVar, wVar2, arrayList, arrayList2);
        }
    }

    public AbstractC1793k p0(int i10) {
        if (i10 < 0 || i10 >= this.f18407S.size()) {
            return null;
        }
        return (AbstractC1793k) this.f18407S.get(i10);
    }

    @Override // androidx.transition.AbstractC1793k
    public AbstractC1793k q(Class cls, boolean z10) {
        for (int i10 = 0; i10 < this.f18407S.size(); i10++) {
            ((AbstractC1793k) this.f18407S.get(i10)).q(cls, z10);
        }
        return super.q(cls, z10);
    }

    public int q0() {
        return this.f18407S.size();
    }

    @Override // androidx.transition.AbstractC1793k
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public t V(AbstractC1793k.g gVar) {
        return (t) super.V(gVar);
    }

    @Override // androidx.transition.AbstractC1793k
    /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
    public t W(View view) {
        for (int i10 = 0; i10 < this.f18407S.size(); i10++) {
            ((AbstractC1793k) this.f18407S.get(i10)).W(view);
        }
        return (t) super.W(view);
    }

    @Override // androidx.transition.AbstractC1793k
    /* JADX INFO: renamed from: v0, reason: merged with bridge method [inline-methods] */
    public t b0(long j10) {
        ArrayList arrayList;
        super.b0(j10);
        if (this.f18368i >= 0 && (arrayList = this.f18407S) != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((AbstractC1793k) this.f18407S.get(i10)).b0(j10);
            }
        }
        return this;
    }

    @Override // androidx.transition.AbstractC1793k
    /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
    public t d0(TimeInterpolator timeInterpolator) {
        this.f18411W |= 1;
        ArrayList arrayList = this.f18407S;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((AbstractC1793k) this.f18407S.get(i10)).d0(timeInterpolator);
            }
        }
        return (t) super.d0(timeInterpolator);
    }

    public t x0(int i10) {
        if (i10 == 0) {
            this.f18408T = true;
            return this;
        }
        if (i10 == 1) {
            this.f18408T = false;
            return this;
        }
        throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i10);
    }

    @Override // androidx.transition.AbstractC1793k
    /* JADX INFO: renamed from: y0, reason: merged with bridge method [inline-methods] */
    public t g0(long j10) {
        return (t) super.g0(j10);
    }
}
