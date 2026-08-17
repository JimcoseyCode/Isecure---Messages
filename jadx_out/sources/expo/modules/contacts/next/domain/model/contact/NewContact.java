package expo.modules.contacts.next.domain.model.contact;

import android.content.ContentProviderOperation;
import android.provider.ContactsContract;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.contacts.Columns;
import expo.modules.contacts.next.domain.model.Insertable;
import expo.modules.contacts.next.domain.model.headers.starred.Starred;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\u000e\u001a\r\u0012\t\u0012\u00070\u000f¢\u0006\u0002\b\u00100\u0005J\u0010\u0010\u0011\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0012\u0010\nJ\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J*\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001e"}, d2 = {"Lexpo/modules/contacts/next/domain/model/contact/NewContact;", PointerEventHelper.POINTER_TYPE_UNKNOWN, Columns.STARRED, "Lexpo/modules/contacts/next/domain/model/headers/starred/Starred;", "modelsToInsert", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/contacts/next/domain/model/Insertable;", "<init>", "(ILjava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getStarred-NmMWud4", "()I", "I", "getModelsToInsert", "()Ljava/util/List;", "toInsertOperations", "Landroid/content/ContentProviderOperation;", "Lkotlin/jvm/internal/EnhancedNullability;", "component1", "component1-NmMWud4", "component2", "copy", "copy-CCdV_P0", "(ILjava/util/List;)Lexpo/modules/contacts/next/domain/model/contact/NewContact;", "equals", PointerEventHelper.POINTER_TYPE_UNKNOWN, "other", "hashCode", PointerEventHelper.POINTER_TYPE_UNKNOWN, "toString", PointerEventHelper.POINTER_TYPE_UNKNOWN, "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class NewContact {
    private final List<Insertable> modelsToInsert;
    private final int starred;

    public /* synthetic */ NewContact(int i10, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-CCdV_P0$default, reason: not valid java name */
    public static /* synthetic */ NewContact m71copyCCdV_P0$default(NewContact newContact, int i10, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = newContact.starred;
        }
        if ((i11 & 2) != 0) {
            list = newContact.modelsToInsert;
        }
        return newContact.m73copyCCdV_P0(i10, list);
    }

    /* JADX INFO: renamed from: component1-NmMWud4, reason: not valid java name and from getter */
    public final int getStarred() {
        return this.starred;
    }

    public final List<Insertable> component2() {
        return this.modelsToInsert;
    }

    /* JADX INFO: renamed from: copy-CCdV_P0, reason: not valid java name */
    public final NewContact m73copyCCdV_P0(int starred, List<? extends Insertable> modelsToInsert) {
        AbstractC2855l.g(modelsToInsert, "modelsToInsert");
        return new NewContact(starred, modelsToInsert, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewContact)) {
            return false;
        }
        NewContact newContact = (NewContact) other;
        return Starred.m104equalsimpl0(this.starred, newContact.starred) && AbstractC2855l.b(this.modelsToInsert, newContact.modelsToInsert);
    }

    public final List<Insertable> getModelsToInsert() {
        return this.modelsToInsert;
    }

    /* JADX INFO: renamed from: getStarred-NmMWud4, reason: not valid java name */
    public final int m74getStarredNmMWud4() {
        return this.starred;
    }

    public int hashCode() {
        return (Starred.m105hashCodeimpl(this.starred) * 31) + this.modelsToInsert.hashCode();
    }

    public final List<ContentProviderOperation> toInsertOperations() {
        List listC = AbstractC2800q.c();
        ContentProviderOperation contentProviderOperationBuild = ContentProviderOperation.newInsert(ContactsContract.RawContacts.CONTENT_URI).withValue(Columns.STARRED, Integer.valueOf(this.starred)).build();
        AbstractC2855l.f(contentProviderOperationBuild, "build(...)");
        listC.add(contentProviderOperationBuild);
        List<Insertable> list = this.modelsToInsert;
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Insertable) it.next()).toInsertOperation());
        }
        listC.addAll(arrayList);
        return AbstractC2800q.a(listC);
    }

    public String toString() {
        return "NewContact(starred=" + Starred.m106toStringimpl(this.starred) + ", modelsToInsert=" + this.modelsToInsert + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    private NewContact(int i10, List<? extends Insertable> modelsToInsert) {
        AbstractC2855l.g(modelsToInsert, "modelsToInsert");
        this.starred = i10;
        this.modelsToInsert = modelsToInsert;
    }
}
