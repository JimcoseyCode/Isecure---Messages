package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements j {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected Context f14298g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected Context f14299h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected e f14300i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected LayoutInflater f14301j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected LayoutInflater f14302k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private j.a f14303l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f14304m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f14305n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected k f14306o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f14307p;

    public a(Context context, int i10, int i11) {
        this.f14298g = context;
        this.f14301j = LayoutInflater.from(context);
        this.f14304m = i10;
        this.f14305n = i11;
    }

    @Override // androidx.appcompat.view.menu.j
    public void a(e eVar, boolean z10) {
        j.a aVar = this.f14303l;
        if (aVar != null) {
            aVar.a(eVar, z10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.j
    public void b(boolean z10) {
        ViewGroup viewGroup = (ViewGroup) this.f14306o;
        if (viewGroup == null) {
            return;
        }
        e eVar = this.f14300i;
        int i10 = 0;
        if (eVar != null) {
            eVar.t();
            ArrayList arrayListG = this.f14300i.G();
            int size = arrayListG.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                g gVar = (g) arrayListG.get(i12);
                if (s(i11, gVar)) {
                    View childAt = viewGroup.getChildAt(i11);
                    g itemData = childAt instanceof k.a ? ((k.a) childAt).getItemData() : null;
                    View viewP = p(gVar, childAt, viewGroup);
                    if (gVar != itemData) {
                        viewP.setPressed(false);
                        viewP.jumpDrawablesToCurrentState();
                    }
                    if (viewP != childAt) {
                        j(viewP, i11);
                    }
                    i11++;
                }
            }
            i10 = i11;
        }
        while (i10 < viewGroup.getChildCount()) {
            if (!n(viewGroup, i10)) {
                i10++;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean d(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean e(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void f(j.a aVar) {
        this.f14303l = aVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public void g(Context context, e eVar) {
        this.f14299h = context;
        this.f14302k = LayoutInflater.from(context);
        this.f14300i = eVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public int getId() {
        return this.f14307p;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.appcompat.view.menu.j
    public boolean i(m mVar) {
        j.a aVar = this.f14303l;
        e eVar = mVar;
        if (aVar == null) {
            return false;
        }
        if (mVar == null) {
            eVar = this.f14300i;
        }
        return aVar.b(eVar);
    }

    protected void j(View view, int i10) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f14306o).addView(view, i10);
    }

    public abstract void l(g gVar, k.a aVar);

    public k.a m(ViewGroup viewGroup) {
        return (k.a) this.f14301j.inflate(this.f14305n, viewGroup, false);
    }

    protected boolean n(ViewGroup viewGroup, int i10) {
        viewGroup.removeViewAt(i10);
        return true;
    }

    public j.a o() {
        return this.f14303l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View p(g gVar, View view, ViewGroup viewGroup) {
        k.a aVarM = view instanceof k.a ? (k.a) view : m(viewGroup);
        l(gVar, aVarM);
        return (View) aVarM;
    }

    public k q(ViewGroup viewGroup) {
        if (this.f14306o == null) {
            k kVar = (k) this.f14301j.inflate(this.f14304m, viewGroup, false);
            this.f14306o = kVar;
            kVar.b(this.f14300i);
            b(true);
        }
        return this.f14306o;
    }

    public void r(int i10) {
        this.f14307p = i10;
    }

    public abstract boolean s(int i10, g gVar);
}
