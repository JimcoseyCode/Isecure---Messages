package D0;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class j implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LocaleList f738a;

    j(Object obj) {
        this.f738a = (LocaleList) obj;
    }

    @Override // D0.i
    public String a() {
        return this.f738a.toLanguageTags();
    }

    @Override // D0.i
    public Object b() {
        return this.f738a;
    }

    public boolean equals(Object obj) {
        return this.f738a.equals(((i) obj).b());
    }

    @Override // D0.i
    public Locale get(int i10) {
        return this.f738a.get(i10);
    }

    public int hashCode() {
        return this.f738a.hashCode();
    }

    @Override // D0.i
    public boolean isEmpty() {
        return this.f738a.isEmpty();
    }

    @Override // D0.i
    public int size() {
        return this.f738a.size();
    }

    public String toString() {
        return this.f738a.toString();
    }
}
