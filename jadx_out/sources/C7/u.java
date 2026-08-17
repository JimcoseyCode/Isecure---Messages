package C7;

import i7.C2751n;
import j7.AbstractC2800q;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class u implements TypeVariable, Type {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p f538g;

    public u(p typeParameter) {
        AbstractC2855l.g(typeParameter, "typeParameter");
        this.f538g = typeParameter;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) obj;
        return AbstractC2855l.b(getName(), typeVariable.getName()) && AbstractC2855l.b(getGenericDeclaration(), typeVariable.getGenericDeclaration());
    }

    @Override // java.lang.reflect.TypeVariable
    public Type[] getBounds() {
        List upperBounds = this.f538g.getUpperBounds();
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(upperBounds, 10));
        Iterator it = upperBounds.iterator();
        while (it.hasNext()) {
            arrayList.add(v.c((o) it.next(), true));
        }
        return (Type[]) arrayList.toArray(new Type[0]);
    }

    @Override // java.lang.reflect.TypeVariable
    public GenericDeclaration getGenericDeclaration() {
        throw new C2751n("An operation is not implemented: " + ("getGenericDeclaration() is not yet supported for type variables created from KType: " + this.f538g));
    }

    @Override // java.lang.reflect.TypeVariable
    public String getName() {
        return this.f538g.getName();
    }

    @Override // java.lang.reflect.Type
    public String getTypeName() {
        return getName();
    }

    public int hashCode() {
        return getName().hashCode() ^ getGenericDeclaration().hashCode();
    }

    public String toString() {
        return getTypeName();
    }
}
