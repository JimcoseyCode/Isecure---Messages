package expo.modules.contacts.next.domain.model.contact;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.contacts.Columns;
import expo.modules.contacts.next.domain.model.email.operations.ExistingEmail;
import expo.modules.contacts.next.domain.model.event.operations.ExistingEvent;
import expo.modules.contacts.next.domain.model.headers.DisplayName;
import expo.modules.contacts.next.domain.model.headers.PhotoThumbnailUri;
import expo.modules.contacts.next.domain.model.headers.PhotoUri;
import expo.modules.contacts.next.domain.model.headers.starred.Starred;
import expo.modules.contacts.next.domain.model.nickname.operations.ExistingNickname;
import expo.modules.contacts.next.domain.model.note.operations.ExistingNote;
import expo.modules.contacts.next.domain.model.organization.operations.ExistingOrganization;
import expo.modules.contacts.next.domain.model.phone.operations.ExistingPhone;
import expo.modules.contacts.next.domain.model.photo.operations.ExistingPhoto;
import expo.modules.contacts.next.domain.model.relationship.operations.ExistingRelation;
import expo.modules.contacts.next.domain.model.structuredname.operations.ExistingStructuredName;
import expo.modules.contacts.next.domain.model.structuredpostal.operations.ExistingStructuredPostal;
import expo.modules.contacts.next.domain.model.website.operations.ExistingWebsite;
import expo.modules.contacts.next.domain.wrappers.ContactId;
import j7.AbstractC2800q;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b6\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001Bß\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0015\u0012\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0015\u0012\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0015\u0012\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0015\u0012\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0015\u0012\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u0015¢\u0006\u0004\b#\u0010$J\u0010\u0010@\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\bA\u0010&J\u0010\u0010B\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\bCJ\u0010\u0010D\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\bEJ\u0010\u0010F\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\bGJ\u0010\u0010H\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\bIJ\u000b\u0010J\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000f\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015HÆ\u0003J\u000f\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00180\u0015HÆ\u0003J\u000f\u0010P\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0015HÆ\u0003J\u000f\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0015HÆ\u0003J\u000f\u0010R\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0015HÆ\u0003J\u000f\u0010S\u001a\b\u0012\u0004\u0012\u00020 0\u0015HÆ\u0003J\u000f\u0010T\u001a\b\u0012\u0004\u0012\u00020\"0\u0015HÆ\u0003Jê\u0001\u0010U\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00152\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00152\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00152\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00152\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00152\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u0015HÆ\u0001¢\u0006\u0004\bV\u0010WJ\u0013\u0010X\u001a\u00020Y2\b\u0010Z\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010[\u001a\u00020\\HÖ\u0001J\t\u0010]\u001a\u00020^HÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010'\u001a\u0004\b%\u0010&R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0015¢\u0006\b\n\u0000\u001a\u0004\b:\u00109R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0015¢\u0006\b\n\u0000\u001a\u0004\b;\u00109R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0015¢\u0006\b\n\u0000\u001a\u0004\b<\u00109R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0015¢\u0006\b\n\u0000\u001a\u0004\b=\u00109R\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0015¢\u0006\b\n\u0000\u001a\u0004\b>\u00109R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u0015¢\u0006\b\n\u0000\u001a\u0004\b?\u00109¨\u0006_"}, d2 = {"Lexpo/modules/contacts/next/domain/model/contact/ExistingContact;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "contactId", "Lexpo/modules/contacts/next/domain/wrappers/ContactId;", "displayName", "Lexpo/modules/contacts/next/domain/model/headers/DisplayName;", Columns.STARRED, "Lexpo/modules/contacts/next/domain/model/headers/starred/Starred;", "photoUri", "Lexpo/modules/contacts/next/domain/model/headers/PhotoUri;", "photoThumbnailUri", "Lexpo/modules/contacts/next/domain/model/headers/PhotoThumbnailUri;", "structuredName", "Lexpo/modules/contacts/next/domain/model/structuredname/operations/ExistingStructuredName;", "organization", "Lexpo/modules/contacts/next/domain/model/organization/operations/ExistingOrganization;", "photo", "Lexpo/modules/contacts/next/domain/model/photo/operations/ExistingPhoto;", "note", "Lexpo/modules/contacts/next/domain/model/note/operations/ExistingNote;", "emails", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/contacts/next/domain/model/email/operations/ExistingEmail;", "events", "Lexpo/modules/contacts/next/domain/model/event/operations/ExistingEvent;", "nicknames", "Lexpo/modules/contacts/next/domain/model/nickname/operations/ExistingNickname;", "phones", "Lexpo/modules/contacts/next/domain/model/phone/operations/ExistingPhone;", "relations", "Lexpo/modules/contacts/next/domain/model/relationship/operations/ExistingRelation;", "structuredPostals", "Lexpo/modules/contacts/next/domain/model/structuredpostal/operations/ExistingStructuredPostal;", "websites", "Lexpo/modules/contacts/next/domain/model/website/operations/ExistingWebsite;", "<init>", "(Ljava/lang/String;Lexpo/modules/contacts/next/domain/model/headers/DisplayName;Lexpo/modules/contacts/next/domain/model/headers/starred/Starred;Lexpo/modules/contacts/next/domain/model/headers/PhotoUri;Lexpo/modules/contacts/next/domain/model/headers/PhotoThumbnailUri;Lexpo/modules/contacts/next/domain/model/structuredname/operations/ExistingStructuredName;Lexpo/modules/contacts/next/domain/model/organization/operations/ExistingOrganization;Lexpo/modules/contacts/next/domain/model/photo/operations/ExistingPhoto;Lexpo/modules/contacts/next/domain/model/note/operations/ExistingNote;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getContactId-S9XCBSM", "()Ljava/lang/String;", "Ljava/lang/String;", "getDisplayName-akshqVY", "()Lexpo/modules/contacts/next/domain/model/headers/DisplayName;", "getStarred-9dN_u_E", "()Lexpo/modules/contacts/next/domain/model/headers/starred/Starred;", "getPhotoUri-zVP6rjE", "()Lexpo/modules/contacts/next/domain/model/headers/PhotoUri;", "getPhotoThumbnailUri-fITejg0", "()Lexpo/modules/contacts/next/domain/model/headers/PhotoThumbnailUri;", "getStructuredName", "()Lexpo/modules/contacts/next/domain/model/structuredname/operations/ExistingStructuredName;", "getOrganization", "()Lexpo/modules/contacts/next/domain/model/organization/operations/ExistingOrganization;", "getPhoto", "()Lexpo/modules/contacts/next/domain/model/photo/operations/ExistingPhoto;", "getNote", "()Lexpo/modules/contacts/next/domain/model/note/operations/ExistingNote;", "getEmails", "()Ljava/util/List;", "getEvents", "getNicknames", "getPhones", "getRelations", "getStructuredPostals", "getWebsites", "component1", "component1-S9XCBSM", "component2", "component2-akshqVY", "component3", "component3-9dN_u_E", "component4", "component4-zVP6rjE", "component5", "component5-fITejg0", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "copy-ltZXQY0", "(Ljava/lang/String;Lexpo/modules/contacts/next/domain/model/headers/DisplayName;Lexpo/modules/contacts/next/domain/model/headers/starred/Starred;Lexpo/modules/contacts/next/domain/model/headers/PhotoUri;Lexpo/modules/contacts/next/domain/model/headers/PhotoThumbnailUri;Lexpo/modules/contacts/next/domain/model/structuredname/operations/ExistingStructuredName;Lexpo/modules/contacts/next/domain/model/organization/operations/ExistingOrganization;Lexpo/modules/contacts/next/domain/model/photo/operations/ExistingPhoto;Lexpo/modules/contacts/next/domain/model/note/operations/ExistingNote;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lexpo/modules/contacts/next/domain/model/contact/ExistingContact;", "equals", PointerEventHelper.POINTER_TYPE_UNKNOWN, "other", "hashCode", PointerEventHelper.POINTER_TYPE_UNKNOWN, "toString", PointerEventHelper.POINTER_TYPE_UNKNOWN, "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ExistingContact {
    private final String contactId;
    private final DisplayName displayName;
    private final List<ExistingEmail> emails;
    private final List<ExistingEvent> events;
    private final List<ExistingNickname> nicknames;
    private final ExistingNote note;
    private final ExistingOrganization organization;
    private final List<ExistingPhone> phones;
    private final ExistingPhoto photo;
    private final PhotoThumbnailUri photoThumbnailUri;
    private final PhotoUri photoUri;
    private final List<ExistingRelation> relations;
    private final Starred starred;
    private final ExistingStructuredName structuredName;
    private final List<ExistingStructuredPostal> structuredPostals;
    private final List<ExistingWebsite> websites;

    public /* synthetic */ ExistingContact(String str, DisplayName displayName, Starred starred, PhotoUri photoUri, PhotoThumbnailUri photoThumbnailUri, ExistingStructuredName existingStructuredName, ExistingOrganization existingOrganization, ExistingPhoto existingPhoto, ExistingNote existingNote, List list, List list2, List list3, List list4, List list5, List list6, List list7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, displayName, starred, photoUri, photoThumbnailUri, existingStructuredName, existingOrganization, existingPhoto, existingNote, list, list2, list3, list4, list5, list6, list7);
    }

    /* JADX INFO: renamed from: component1-S9XCBSM, reason: not valid java name and from getter */
    public final String getContactId() {
        return this.contactId;
    }

    public final List<ExistingEmail> component10() {
        return this.emails;
    }

    public final List<ExistingEvent> component11() {
        return this.events;
    }

    public final List<ExistingNickname> component12() {
        return this.nicknames;
    }

    public final List<ExistingPhone> component13() {
        return this.phones;
    }

    public final List<ExistingRelation> component14() {
        return this.relations;
    }

    public final List<ExistingStructuredPostal> component15() {
        return this.structuredPostals;
    }

    public final List<ExistingWebsite> component16() {
        return this.websites;
    }

    /* JADX INFO: renamed from: component2-akshqVY, reason: not valid java name and from getter */
    public final DisplayName getDisplayName() {
        return this.displayName;
    }

    /* JADX INFO: renamed from: component3-9dN_u_E, reason: not valid java name and from getter */
    public final Starred getStarred() {
        return this.starred;
    }

    /* JADX INFO: renamed from: component4-zVP6rjE, reason: not valid java name and from getter */
    public final PhotoUri getPhotoUri() {
        return this.photoUri;
    }

    /* JADX INFO: renamed from: component5-fITejg0, reason: not valid java name and from getter */
    public final PhotoThumbnailUri getPhotoThumbnailUri() {
        return this.photoThumbnailUri;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final ExistingStructuredName getStructuredName() {
        return this.structuredName;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final ExistingOrganization getOrganization() {
        return this.organization;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final ExistingPhoto getPhoto() {
        return this.photo;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final ExistingNote getNote() {
        return this.note;
    }

    /* JADX INFO: renamed from: copy-ltZXQY0, reason: not valid java name */
    public final ExistingContact m65copyltZXQY0(String contactId, DisplayName displayName, Starred starred, PhotoUri photoUri, PhotoThumbnailUri photoThumbnailUri, ExistingStructuredName structuredName, ExistingOrganization organization, ExistingPhoto photo, ExistingNote note, List<ExistingEmail> emails, List<ExistingEvent> events, List<ExistingNickname> nicknames, List<ExistingPhone> phones, List<ExistingRelation> relations, List<ExistingStructuredPostal> structuredPostals, List<ExistingWebsite> websites) {
        AbstractC2855l.g(contactId, "contactId");
        AbstractC2855l.g(emails, "emails");
        AbstractC2855l.g(events, "events");
        AbstractC2855l.g(nicknames, "nicknames");
        AbstractC2855l.g(phones, "phones");
        AbstractC2855l.g(relations, "relations");
        AbstractC2855l.g(structuredPostals, "structuredPostals");
        AbstractC2855l.g(websites, "websites");
        return new ExistingContact(contactId, displayName, starred, photoUri, photoThumbnailUri, structuredName, organization, photo, note, emails, events, nicknames, phones, relations, structuredPostals, websites, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExistingContact)) {
            return false;
        }
        ExistingContact existingContact = (ExistingContact) other;
        return ContactId.m132equalsimpl0(this.contactId, existingContact.contactId) && AbstractC2855l.b(this.displayName, existingContact.displayName) && AbstractC2855l.b(this.starred, existingContact.starred) && AbstractC2855l.b(this.photoUri, existingContact.photoUri) && AbstractC2855l.b(this.photoThumbnailUri, existingContact.photoThumbnailUri) && AbstractC2855l.b(this.structuredName, existingContact.structuredName) && AbstractC2855l.b(this.organization, existingContact.organization) && AbstractC2855l.b(this.photo, existingContact.photo) && AbstractC2855l.b(this.note, existingContact.note) && AbstractC2855l.b(this.emails, existingContact.emails) && AbstractC2855l.b(this.events, existingContact.events) && AbstractC2855l.b(this.nicknames, existingContact.nicknames) && AbstractC2855l.b(this.phones, existingContact.phones) && AbstractC2855l.b(this.relations, existingContact.relations) && AbstractC2855l.b(this.structuredPostals, existingContact.structuredPostals) && AbstractC2855l.b(this.websites, existingContact.websites);
    }

    /* JADX INFO: renamed from: getContactId-S9XCBSM, reason: not valid java name */
    public final String m66getContactIdS9XCBSM() {
        return this.contactId;
    }

    /* JADX INFO: renamed from: getDisplayName-akshqVY, reason: not valid java name */
    public final DisplayName m67getDisplayNameakshqVY() {
        return this.displayName;
    }

    public final List<ExistingEmail> getEmails() {
        return this.emails;
    }

    public final List<ExistingEvent> getEvents() {
        return this.events;
    }

    public final List<ExistingNickname> getNicknames() {
        return this.nicknames;
    }

    public final ExistingNote getNote() {
        return this.note;
    }

    public final ExistingOrganization getOrganization() {
        return this.organization;
    }

    public final List<ExistingPhone> getPhones() {
        return this.phones;
    }

    public final ExistingPhoto getPhoto() {
        return this.photo;
    }

    /* JADX INFO: renamed from: getPhotoThumbnailUri-fITejg0, reason: not valid java name */
    public final PhotoThumbnailUri m68getPhotoThumbnailUrifITejg0() {
        return this.photoThumbnailUri;
    }

    /* JADX INFO: renamed from: getPhotoUri-zVP6rjE, reason: not valid java name */
    public final PhotoUri m69getPhotoUrizVP6rjE() {
        return this.photoUri;
    }

    public final List<ExistingRelation> getRelations() {
        return this.relations;
    }

    /* JADX INFO: renamed from: getStarred-9dN_u_E, reason: not valid java name */
    public final Starred m70getStarred9dN_u_E() {
        return this.starred;
    }

    public final ExistingStructuredName getStructuredName() {
        return this.structuredName;
    }

    public final List<ExistingStructuredPostal> getStructuredPostals() {
        return this.structuredPostals;
    }

    public final List<ExistingWebsite> getWebsites() {
        return this.websites;
    }

    public int hashCode() {
        int iM133hashCodeimpl = ContactId.m133hashCodeimpl(this.contactId) * 31;
        DisplayName displayName = this.displayName;
        int iM81hashCodeimpl = (iM133hashCodeimpl + (displayName == null ? 0 : DisplayName.m81hashCodeimpl(displayName.m83unboximpl()))) * 31;
        Starred starred = this.starred;
        int iM105hashCodeimpl = (iM81hashCodeimpl + (starred == null ? 0 : Starred.m105hashCodeimpl(starred.m107unboximpl()))) * 31;
        PhotoUri photoUri = this.photoUri;
        int iM97hashCodeimpl = (iM105hashCodeimpl + (photoUri == null ? 0 : PhotoUri.m97hashCodeimpl(photoUri.m99unboximpl()))) * 31;
        PhotoThumbnailUri photoThumbnailUri = this.photoThumbnailUri;
        int iM89hashCodeimpl = (iM97hashCodeimpl + (photoThumbnailUri == null ? 0 : PhotoThumbnailUri.m89hashCodeimpl(photoThumbnailUri.m91unboximpl()))) * 31;
        ExistingStructuredName existingStructuredName = this.structuredName;
        int iHashCode = (iM89hashCodeimpl + (existingStructuredName == null ? 0 : existingStructuredName.hashCode())) * 31;
        ExistingOrganization existingOrganization = this.organization;
        int iHashCode2 = (iHashCode + (existingOrganization == null ? 0 : existingOrganization.hashCode())) * 31;
        ExistingPhoto existingPhoto = this.photo;
        int iHashCode3 = (iHashCode2 + (existingPhoto == null ? 0 : existingPhoto.hashCode())) * 31;
        ExistingNote existingNote = this.note;
        return ((((((((((((((iHashCode3 + (existingNote != null ? existingNote.hashCode() : 0)) * 31) + this.emails.hashCode()) * 31) + this.events.hashCode()) * 31) + this.nicknames.hashCode()) * 31) + this.phones.hashCode()) * 31) + this.relations.hashCode()) * 31) + this.structuredPostals.hashCode()) * 31) + this.websites.hashCode();
    }

    public String toString() {
        return "ExistingContact(contactId=" + ContactId.m134toStringimpl(this.contactId) + ", displayName=" + this.displayName + ", starred=" + this.starred + ", photoUri=" + this.photoUri + ", photoThumbnailUri=" + this.photoThumbnailUri + ", structuredName=" + this.structuredName + ", organization=" + this.organization + ", photo=" + this.photo + ", note=" + this.note + ", emails=" + this.emails + ", events=" + this.events + ", nicknames=" + this.nicknames + ", phones=" + this.phones + ", relations=" + this.relations + ", structuredPostals=" + this.structuredPostals + ", websites=" + this.websites + ")";
    }

    private ExistingContact(String contactId, DisplayName displayName, Starred starred, PhotoUri photoUri, PhotoThumbnailUri photoThumbnailUri, ExistingStructuredName existingStructuredName, ExistingOrganization existingOrganization, ExistingPhoto existingPhoto, ExistingNote existingNote, List<ExistingEmail> emails, List<ExistingEvent> events, List<ExistingNickname> nicknames, List<ExistingPhone> phones, List<ExistingRelation> relations, List<ExistingStructuredPostal> structuredPostals, List<ExistingWebsite> websites) {
        AbstractC2855l.g(contactId, "contactId");
        AbstractC2855l.g(emails, "emails");
        AbstractC2855l.g(events, "events");
        AbstractC2855l.g(nicknames, "nicknames");
        AbstractC2855l.g(phones, "phones");
        AbstractC2855l.g(relations, "relations");
        AbstractC2855l.g(structuredPostals, "structuredPostals");
        AbstractC2855l.g(websites, "websites");
        this.contactId = contactId;
        this.displayName = displayName;
        this.starred = starred;
        this.photoUri = photoUri;
        this.photoThumbnailUri = photoThumbnailUri;
        this.structuredName = existingStructuredName;
        this.organization = existingOrganization;
        this.photo = existingPhoto;
        this.note = existingNote;
        this.emails = emails;
        this.events = events;
        this.nicknames = nicknames;
        this.phones = phones;
        this.relations = relations;
        this.structuredPostals = structuredPostals;
        this.websites = websites;
    }

    public /* synthetic */ ExistingContact(String str, DisplayName displayName, Starred starred, PhotoUri photoUri, PhotoThumbnailUri photoThumbnailUri, ExistingStructuredName existingStructuredName, ExistingOrganization existingOrganization, ExistingPhoto existingPhoto, ExistingNote existingNote, List list, List list2, List list3, List list4, List list5, List list6, List list7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : displayName, (i10 & 4) != 0 ? null : starred, (i10 & 8) != 0 ? null : photoUri, (i10 & 16) != 0 ? null : photoThumbnailUri, (i10 & 32) != 0 ? null : existingStructuredName, (i10 & 64) != 0 ? null : existingOrganization, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? null : existingPhoto, (i10 & 256) != 0 ? null : existingNote, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? AbstractC2800q.j() : list, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? AbstractC2800q.j() : list2, (i10 & 2048) != 0 ? AbstractC2800q.j() : list3, (i10 & 4096) != 0 ? AbstractC2800q.j() : list4, (i10 & 8192) != 0 ? AbstractC2800q.j() : list5, (i10 & 16384) != 0 ? AbstractC2800q.j() : list6, (i10 & 32768) != 0 ? AbstractC2800q.j() : list7, null);
    }
}
