package J1;

import J1.o;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC1764k;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Map f5337a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o.b f5338b;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private final class b implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final FragmentManager f5341a;

        b(FragmentManager fragmentManager) {
            this.f5341a = fragmentManager;
        }

        private void b(FragmentManager fragmentManager, Set set) {
            List listV0 = fragmentManager.v0();
            int size = listV0.size();
            for (int i10 = 0; i10 < size; i10++) {
                Fragment fragment = (Fragment) listV0.get(i10);
                b(fragment.getChildFragmentManager(), set);
                com.bumptech.glide.k kVarA = m.this.a(fragment.getLifecycle());
                if (kVarA != null) {
                    set.add(kVarA);
                }
            }
        }

        @Override // J1.p
        public Set a() {
            HashSet hashSet = new HashSet();
            b(this.f5341a, hashSet);
            return hashSet;
        }
    }

    m(o.b bVar) {
        this.f5338b = bVar;
    }

    com.bumptech.glide.k a(AbstractC1764k abstractC1764k) {
        Q1.l.b();
        return (com.bumptech.glide.k) this.f5337a.get(abstractC1764k);
    }

    com.bumptech.glide.k b(Context context, com.bumptech.glide.b bVar, AbstractC1764k abstractC1764k, FragmentManager fragmentManager, boolean z10) {
        Q1.l.b();
        com.bumptech.glide.k kVarA = a(abstractC1764k);
        if (kVarA != null) {
            return kVarA;
        }
        k kVar = new k(abstractC1764k);
        com.bumptech.glide.k kVarA2 = this.f5338b.a(bVar, kVar, new b(fragmentManager), context);
        this.f5337a.put(abstractC1764k, kVarA2);
        kVar.b(new a(abstractC1764k));
        if (z10) {
            kVarA2.onStart();
        }
        return kVarA2;
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements l {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ AbstractC1764k f5339g;

        a(AbstractC1764k abstractC1764k) {
            this.f5339g = abstractC1764k;
        }

        @Override // J1.l
        public void onDestroy() {
            m.this.f5337a.remove(this.f5339g);
        }

        @Override // J1.l
        public void onStart() {
        }

        @Override // J1.l
        public void onStop() {
        }
    }
}
