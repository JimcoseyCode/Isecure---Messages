package expo.modules.contacts.next;

import R8.AbstractC1413i;
import R8.C1404d0;
import R8.J;
import R8.N;
import android.content.ContentValues;
import android.net.Uri;
import android.provider.ContactsContract;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.contacts.next.domain.ContactRepository;
import expo.modules.contacts.next.domain.model.Extractable;
import expo.modules.contacts.next.domain.model.ExtractableField;
import expo.modules.contacts.next.domain.model.contact.ContactPatch;
import expo.modules.contacts.next.domain.model.contact.ExistingContact;
import expo.modules.contacts.next.domain.model.contact.NewContact;
import expo.modules.contacts.next.domain.model.contact.UpdateContact;
import expo.modules.contacts.next.domain.model.email.EmailField;
import expo.modules.contacts.next.domain.model.email.operations.ExistingEmail;
import expo.modules.contacts.next.domain.model.event.EventField;
import expo.modules.contacts.next.domain.model.event.operations.ExistingEvent;
import expo.modules.contacts.next.domain.model.headers.DisplayName;
import expo.modules.contacts.next.domain.model.headers.DisplayNameField;
import expo.modules.contacts.next.domain.model.headers.PhotoThumbnailUri;
import expo.modules.contacts.next.domain.model.headers.PhotoThumbnailUriField;
import expo.modules.contacts.next.domain.model.headers.PhotoUri;
import expo.modules.contacts.next.domain.model.headers.PhotoUriField;
import expo.modules.contacts.next.domain.model.headers.starred.Starred;
import expo.modules.contacts.next.domain.model.headers.starred.StarredField;
import expo.modules.contacts.next.domain.model.nickname.NicknameField;
import expo.modules.contacts.next.domain.model.nickname.operations.ExistingNickname;
import expo.modules.contacts.next.domain.model.note.NoteField;
import expo.modules.contacts.next.domain.model.note.operations.ExistingNote;
import expo.modules.contacts.next.domain.model.organization.OrganizationField;
import expo.modules.contacts.next.domain.model.organization.operations.ExistingOrganization;
import expo.modules.contacts.next.domain.model.phone.PhoneField;
import expo.modules.contacts.next.domain.model.phone.operations.ExistingPhone;
import expo.modules.contacts.next.domain.model.photo.PhotoField;
import expo.modules.contacts.next.domain.model.photo.operations.ExistingPhoto;
import expo.modules.contacts.next.domain.model.relationship.RelationField;
import expo.modules.contacts.next.domain.model.relationship.operations.ExistingRelation;
import expo.modules.contacts.next.domain.model.structuredname.StructuredNameField;
import expo.modules.contacts.next.domain.model.structuredname.operations.ExistingStructuredName;
import expo.modules.contacts.next.domain.model.structuredpostal.StructuredPostalField;
import expo.modules.contacts.next.domain.model.structuredpostal.operations.ExistingStructuredPostal;
import expo.modules.contacts.next.domain.model.website.WebsiteField;
import expo.modules.contacts.next.domain.model.website.operations.ExistingWebsite;
import expo.modules.contacts.next.domain.wrappers.ContactId;
import expo.modules.contacts.next.domain.wrappers.RawContactId;
import expo.modules.contacts.next.intents.ContactIntentDelegate;
import expo.modules.contacts.next.mappers.ContactRecordDomainMapper;
import expo.modules.contacts.next.mappers.domain.contacts.ContactsPropertyMapper;
import expo.modules.contacts.next.mappers.domain.contacts.DisplayNameMapper;
import expo.modules.contacts.next.mappers.domain.contacts.MutableContactsPropertyMapper;
import expo.modules.contacts.next.mappers.domain.contacts.PhotoThumbnailUriMapper;
import expo.modules.contacts.next.mappers.domain.contacts.PhotoUriMapper;
import expo.modules.contacts.next.mappers.domain.contacts.StarredMapper;
import expo.modules.contacts.next.mappers.domain.data.MutableDataPropertyMapper;
import expo.modules.contacts.next.mappers.domain.data.NoteMapper;
import expo.modules.contacts.next.mappers.domain.data.OrganizationPropertyMapper;
import expo.modules.contacts.next.mappers.domain.data.PhotoPropertyMapper;
import expo.modules.contacts.next.mappers.domain.data.StructuredNamePropertyMapper;
import expo.modules.contacts.next.mappers.domain.data.list.EmailMapper;
import expo.modules.contacts.next.mappers.domain.data.list.EventMapper;
import expo.modules.contacts.next.mappers.domain.data.list.ListDataPropertyMapper;
import expo.modules.contacts.next.mappers.domain.data.list.NicknameMapper;
import expo.modules.contacts.next.mappers.domain.data.list.PhoneMapper;
import expo.modules.contacts.next.mappers.domain.data.list.RelationMapper;
import expo.modules.contacts.next.mappers.domain.data.list.StructuredPostalMapper;
import expo.modules.contacts.next.mappers.domain.data.list.WebsiteMapper;
import expo.modules.contacts.next.records.ContactQueryOptions;
import expo.modules.contacts.next.records.ExistingRecord;
import expo.modules.contacts.next.records.NewRecord;
import expo.modules.contacts.next.records.SortOrder;
import expo.modules.contacts.next.records.contact.CreateContactRecord;
import expo.modules.contacts.next.records.contact.PatchContactRecord;
import expo.modules.contacts.next.records.fields.AddressRecord;
import expo.modules.contacts.next.records.fields.ContactField;
import expo.modules.contacts.next.records.fields.DateRecord;
import expo.modules.contacts.next.records.fields.EmailRecord;
import expo.modules.contacts.next.records.fields.ExtraNameRecord;
import expo.modules.contacts.next.records.fields.PhoneRecord;
import expo.modules.contacts.next.records.fields.RelationRecord;
import expo.modules.contacts.next.records.fields.UrlAddressRecord;
import expo.modules.contacts.next.services.properties.ContactsProperty;
import expo.modules.contacts.next.services.properties.ListDataProperty;
import expo.modules.contacts.next.services.properties.MutableContactsProperty;
import expo.modules.contacts.next.services.properties.MutableDataProperty;
import expo.modules.kotlin.sharedobjects.SharedObject;
import i7.AbstractC2753p;
import i7.C2735B;
import j7.AbstractC2800q;
import j7.T;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000Þ\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 £\u00012\u00020\u0001:\u0002£\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010JM\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0017\"\b\b\u0000\u0010\u0012*\u00020\u0011\"\u0004\b\u0001\u0010\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019Jg\u0010 \u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u001f\"\b\b\u0000\u0010\u0012*\u00020\u0011\"\b\b\u0001\u0010\u001b*\u00020\u001a\"\b\b\u0002\u0010\u001d*\u00020\u001c2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!JM\u0010&\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010%\"\b\b\u0000\u0010\u0012*\u00020\"\"\u0004\b\u0001\u0010\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000#2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010$H\u0002¢\u0006\u0004\b&\u0010'JM\u0010*\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010)\"\b\b\u0000\u0010\u0012*\u00020\"\"\u0004\b\u0001\u0010\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000#2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010(H\u0002¢\u0006\u0004\b*\u0010+J\u0010\u0010-\u001a\u00020,H\u0086@¢\u0006\u0004\b-\u0010\u0010J\u0018\u00100\u001a\u00020,2\u0006\u0010/\u001a\u00020.H\u0086@¢\u0006\u0004\b0\u00101J\u0018\u00104\u001a\u00020,2\u0006\u00103\u001a\u000202H\u0086@¢\u0006\u0004\b4\u00105J \u0010:\u001a\u0002092\u000e\u00108\u001a\n\u0012\u0004\u0012\u000207\u0018\u000106H\u0086@¢\u0006\u0004\b:\u0010;J\u0010\u0010<\u001a\u00020,H\u0086@¢\u0006\u0004\b<\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010=\u001a\u0004\b>\u0010?R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010C\u001a\u0004\bD\u0010ER\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010F\u001a\u0004\bG\u0010HR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010I\u001a\u0004\bJ\u0010KR%\u0010N\u001a\u0010\u0012\u0004\u0012\u00020L\u0012\u0006\u0012\u0004\u0018\u00010M0\u00178\u0006¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR%\u0010R\u001a\u0010\u0012\u0004\u0012\u00020L\u0012\u0006\u0012\u0004\u0018\u00010M0\u00178\u0006¢\u0006\f\n\u0004\bR\u0010O\u001a\u0004\bS\u0010QR%\u0010T\u001a\u0010\u0012\u0004\u0012\u00020L\u0012\u0006\u0012\u0004\u0018\u00010M0\u00178\u0006¢\u0006\f\n\u0004\bT\u0010O\u001a\u0004\bU\u0010QR%\u0010V\u001a\u0010\u0012\u0004\u0012\u00020L\u0012\u0006\u0012\u0004\u0018\u00010M0\u00178\u0006¢\u0006\f\n\u0004\bV\u0010O\u001a\u0004\bW\u0010QR%\u0010X\u001a\u0010\u0012\u0004\u0012\u00020L\u0012\u0006\u0012\u0004\u0018\u00010M0\u00178\u0006¢\u0006\f\n\u0004\bX\u0010O\u001a\u0004\bY\u0010QR%\u0010Z\u001a\u0010\u0012\u0004\u0012\u00020L\u0012\u0006\u0012\u0004\u0018\u00010M0\u00178\u0006¢\u0006\f\n\u0004\bZ\u0010O\u001a\u0004\b[\u0010QR%\u0010\\\u001a\u0010\u0012\u0004\u0012\u00020L\u0012\u0006\u0012\u0004\u0018\u00010M0\u00178\u0006¢\u0006\f\n\u0004\b\\\u0010O\u001a\u0004\b]\u0010QR%\u0010^\u001a\u0010\u0012\u0004\u0012\u00020L\u0012\u0006\u0012\u0004\u0018\u00010M0\u00178\u0006¢\u0006\f\n\u0004\b^\u0010O\u001a\u0004\b_\u0010QR%\u0010a\u001a\u0010\u0012\u0004\u0012\u00020`\u0012\u0006\u0012\u0004\u0018\u00010M0\u00178\u0006¢\u0006\f\n\u0004\ba\u0010O\u001a\u0004\bb\u0010QR%\u0010c\u001a\u0010\u0012\u0004\u0012\u00020`\u0012\u0006\u0012\u0004\u0018\u00010M0\u00178\u0006¢\u0006\f\n\u0004\bc\u0010O\u001a\u0004\bd\u0010QR%\u0010e\u001a\u0010\u0012\u0004\u0012\u00020`\u0012\u0006\u0012\u0004\u0018\u00010M0\u00178\u0006¢\u0006\f\n\u0004\be\u0010O\u001a\u0004\bf\u0010QR%\u0010g\u001a\u0010\u0012\u0004\u0012\u00020`\u0012\u0006\u0012\u0004\u0018\u00010M0\u00178\u0006¢\u0006\f\n\u0004\bg\u0010O\u001a\u0004\bh\u0010QR%\u0010j\u001a\u0010\u0012\u0004\u0012\u00020i\u0012\u0006\u0012\u0004\u0018\u00010M0\u00178\u0006¢\u0006\f\n\u0004\bj\u0010O\u001a\u0004\bk\u0010QR%\u0010m\u001a\u0010\u0012\u0004\u0012\u00020l\u0012\u0006\u0012\u0004\u0018\u00010M0\u00178\u0006¢\u0006\f\n\u0004\bm\u0010O\u001a\u0004\bn\u0010QR%\u0010p\u001a\u0010\u0012\u0004\u0012\u00020o\u0012\u0006\u0012\u0004\u0018\u00010M0%8\u0006¢\u0006\f\n\u0004\bp\u0010q\u001a\u0004\br\u0010sR%\u0010u\u001a\u0010\u0012\u0004\u0012\u00020t\u0012\u0006\u0012\u0004\u0018\u00010M0%8\u0006¢\u0006\f\n\u0004\bu\u0010q\u001a\u0004\bv\u0010sR%\u0010x\u001a\u0010\u0012\u0004\u0012\u00020w\u0012\u0006\u0012\u0004\u0018\u00010M0%8\u0006¢\u0006\f\n\u0004\bx\u0010q\u001a\u0004\by\u0010sR#\u0010{\u001a\u000e\u0012\u0004\u0012\u00020z\u0012\u0004\u0012\u00020,0)8\u0006¢\u0006\f\n\u0004\b{\u0010|\u001a\u0004\b{\u0010}R/\u0010\u0081\u0001\u001a\u0015\u0012\u0004\u0012\u00020~\u0012\u0004\u0012\u00020\u007f\u0012\u0005\u0012\u00030\u0080\u00010\u001f8\u0006¢\u0006\u0010\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R1\u0010\u0088\u0001\u001a\u0017\u0012\u0005\u0012\u00030\u0085\u0001\u0012\u0005\u0012\u00030\u0086\u0001\u0012\u0005\u0012\u00030\u0087\u00010\u001f8\u0006¢\u0006\u0010\n\u0006\b\u0088\u0001\u0010\u0082\u0001\u001a\u0006\b\u0089\u0001\u0010\u0084\u0001R1\u0010\u008d\u0001\u001a\u0017\u0012\u0005\u0012\u00030\u008a\u0001\u0012\u0005\u0012\u00030\u008b\u0001\u0012\u0005\u0012\u00030\u008c\u00010\u001f8\u0006¢\u0006\u0010\n\u0006\b\u008d\u0001\u0010\u0082\u0001\u001a\u0006\b\u008e\u0001\u0010\u0084\u0001R1\u0010\u0092\u0001\u001a\u0017\u0012\u0005\u0012\u00030\u008f\u0001\u0012\u0005\u0012\u00030\u0090\u0001\u0012\u0005\u0012\u00030\u0091\u00010\u001f8\u0006¢\u0006\u0010\n\u0006\b\u0092\u0001\u0010\u0082\u0001\u001a\u0006\b\u0093\u0001\u0010\u0084\u0001R1\u0010\u0097\u0001\u001a\u0017\u0012\u0005\u0012\u00030\u0094\u0001\u0012\u0005\u0012\u00030\u0095\u0001\u0012\u0005\u0012\u00030\u0096\u00010\u001f8\u0006¢\u0006\u0010\n\u0006\b\u0097\u0001\u0010\u0082\u0001\u001a\u0006\b\u0098\u0001\u0010\u0084\u0001R1\u0010\u009c\u0001\u001a\u0017\u0012\u0005\u0012\u00030\u0099\u0001\u0012\u0005\u0012\u00030\u009a\u0001\u0012\u0005\u0012\u00030\u009b\u00010\u001f8\u0006¢\u0006\u0010\n\u0006\b\u009c\u0001\u0010\u0082\u0001\u001a\u0006\b\u009d\u0001\u0010\u0084\u0001R1\u0010¡\u0001\u001a\u0017\u0012\u0005\u0012\u00030\u009e\u0001\u0012\u0005\u0012\u00030\u009f\u0001\u0012\u0005\u0012\u00030 \u00010\u001f8\u0006¢\u0006\u0010\n\u0006\b¡\u0001\u0010\u0082\u0001\u001a\u0006\b¢\u0001\u0010\u0084\u0001¨\u0006¤\u0001"}, d2 = {"Lexpo/modules/contacts/next/Contact;", "Lexpo/modules/kotlin/sharedobjects/SharedObject;", "Lexpo/modules/contacts/next/domain/wrappers/ContactId;", "contactId", "Lexpo/modules/contacts/next/domain/ContactRepository;", "repository", "Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;", "mapper", "Lexpo/modules/contacts/next/mappers/domain/data/PhotoPropertyMapper;", "photoPropertyMapper", "Lexpo/modules/contacts/next/intents/ContactIntentDelegate;", "intentDelegate", "<init>", "(Ljava/lang/String;Lexpo/modules/contacts/next/domain/ContactRepository;Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;Lexpo/modules/contacts/next/mappers/domain/data/PhotoPropertyMapper;Lexpo/modules/contacts/next/intents/ContactIntentDelegate;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroid/net/Uri;", "getLookupKeyUri", "(Ln7/f;)Ljava/lang/Object;", "Lexpo/modules/contacts/next/domain/model/Extractable$Data;", "TDomain", "TDto", "Lexpo/modules/contacts/next/domain/model/ExtractableField$Data;", "field", "Lexpo/modules/contacts/next/mappers/domain/data/MutableDataPropertyMapper;", "Lexpo/modules/contacts/next/services/properties/MutableDataProperty;", "mutableDataProperty", "(Lexpo/modules/contacts/next/domain/model/ExtractableField$Data;Lexpo/modules/contacts/next/mappers/domain/data/MutableDataPropertyMapper;)Lexpo/modules/contacts/next/services/properties/MutableDataProperty;", "Lexpo/modules/contacts/next/records/ExistingRecord;", "TExistingDto", "Lexpo/modules/contacts/next/records/NewRecord;", "TNewDto", "Lexpo/modules/contacts/next/mappers/domain/data/list/ListDataPropertyMapper;", "Lexpo/modules/contacts/next/services/properties/ListDataProperty;", "listDataProperty", "(Lexpo/modules/contacts/next/domain/model/ExtractableField$Data;Lexpo/modules/contacts/next/mappers/domain/data/list/ListDataPropertyMapper;)Lexpo/modules/contacts/next/services/properties/ListDataProperty;", "Lexpo/modules/contacts/next/domain/model/Extractable;", "Lexpo/modules/contacts/next/domain/model/ExtractableField$Contacts;", "Lexpo/modules/contacts/next/mappers/domain/contacts/ContactsPropertyMapper;", "Lexpo/modules/contacts/next/services/properties/ContactsProperty;", "contactsProperty", "(Lexpo/modules/contacts/next/domain/model/ExtractableField$Contacts;Lexpo/modules/contacts/next/mappers/domain/contacts/ContactsPropertyMapper;)Lexpo/modules/contacts/next/services/properties/ContactsProperty;", "Lexpo/modules/contacts/next/mappers/domain/contacts/MutableContactsPropertyMapper;", "Lexpo/modules/contacts/next/services/properties/MutableContactsProperty;", "mutableContactsProperty", "(Lexpo/modules/contacts/next/domain/model/ExtractableField$Contacts;Lexpo/modules/contacts/next/mappers/domain/contacts/MutableContactsPropertyMapper;)Lexpo/modules/contacts/next/services/properties/MutableContactsProperty;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "delete", "Lexpo/modules/contacts/next/records/contact/PatchContactRecord;", "patchContactRecord", "patch", "(Lexpo/modules/contacts/next/records/contact/PatchContactRecord;Ln7/f;)Ljava/lang/Object;", "Lexpo/modules/contacts/next/records/contact/CreateContactRecord;", "newContactRecord", "update", "(Lexpo/modules/contacts/next/records/contact/CreateContactRecord;Ln7/f;)Ljava/lang/Object;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/contacts/next/records/fields/ContactField;", "fields", "Lexpo/modules/contacts/next/records/contact/GetContactDetailsRecord;", "getDetails", "(Ljava/util/Set;Ln7/f;)Ljava/lang/Object;", "editWithForm", "Ljava/lang/String;", "getContactId-S9XCBSM", "()Ljava/lang/String;", "Lexpo/modules/contacts/next/domain/ContactRepository;", "getRepository", "()Lexpo/modules/contacts/next/domain/ContactRepository;", "Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;", "getMapper", "()Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;", "Lexpo/modules/contacts/next/mappers/domain/data/PhotoPropertyMapper;", "getPhotoPropertyMapper", "()Lexpo/modules/contacts/next/mappers/domain/data/PhotoPropertyMapper;", "Lexpo/modules/contacts/next/intents/ContactIntentDelegate;", "getIntentDelegate", "()Lexpo/modules/contacts/next/intents/ContactIntentDelegate;", "Lexpo/modules/contacts/next/domain/model/structuredname/operations/ExistingStructuredName;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "givenName", "Lexpo/modules/contacts/next/services/properties/MutableDataProperty;", "getGivenName", "()Lexpo/modules/contacts/next/services/properties/MutableDataProperty;", "familyName", "getFamilyName", "middleName", "getMiddleName", "prefix", "getPrefix", "suffix", "getSuffix", "phoneticGivenName", "getPhoneticGivenName", "phoneticFamilyName", "getPhoneticFamilyName", "phoneticMiddleName", "getPhoneticMiddleName", "Lexpo/modules/contacts/next/domain/model/organization/operations/ExistingOrganization;", "company", "getCompany", "department", "getDepartment", "jobTitle", "getJobTitle", "phoneticCompanyName", "getPhoneticCompanyName", "Lexpo/modules/contacts/next/domain/model/note/operations/ExistingNote;", "note", "getNote", "Lexpo/modules/contacts/next/domain/model/photo/operations/ExistingPhoto;", "image", "getImage", "Lexpo/modules/contacts/next/domain/model/headers/DisplayName;", "fullName", "Lexpo/modules/contacts/next/services/properties/ContactsProperty;", "getFullName", "()Lexpo/modules/contacts/next/services/properties/ContactsProperty;", "Lexpo/modules/contacts/next/domain/model/headers/PhotoThumbnailUri;", "thumbnail", "getThumbnail", "Lexpo/modules/contacts/next/domain/model/headers/PhotoUri;", "imageUri", "getImageUri", "Lexpo/modules/contacts/next/domain/model/headers/starred/Starred;", "isFavourite", "Lexpo/modules/contacts/next/services/properties/MutableContactsProperty;", "()Lexpo/modules/contacts/next/services/properties/MutableContactsProperty;", "Lexpo/modules/contacts/next/domain/model/email/operations/ExistingEmail;", "Lexpo/modules/contacts/next/records/fields/EmailRecord$Existing;", "Lexpo/modules/contacts/next/records/fields/EmailRecord$New;", "emails", "Lexpo/modules/contacts/next/services/properties/ListDataProperty;", "getEmails", "()Lexpo/modules/contacts/next/services/properties/ListDataProperty;", "Lexpo/modules/contacts/next/domain/model/phone/operations/ExistingPhone;", "Lexpo/modules/contacts/next/records/fields/PhoneRecord$Existing;", "Lexpo/modules/contacts/next/records/fields/PhoneRecord$New;", "phones", "getPhones", "Lexpo/modules/contacts/next/domain/model/structuredpostal/operations/ExistingStructuredPostal;", "Lexpo/modules/contacts/next/records/fields/AddressRecord$Existing;", "Lexpo/modules/contacts/next/records/fields/AddressRecord$New;", "addresses", "getAddresses", "Lexpo/modules/contacts/next/domain/model/event/operations/ExistingEvent;", "Lexpo/modules/contacts/next/records/fields/DateRecord$Existing;", "Lexpo/modules/contacts/next/records/fields/DateRecord$New;", "dates", "getDates", "Lexpo/modules/contacts/next/domain/model/website/operations/ExistingWebsite;", "Lexpo/modules/contacts/next/records/fields/UrlAddressRecord$Existing;", "Lexpo/modules/contacts/next/records/fields/UrlAddressRecord$New;", "urlAddresses", "getUrlAddresses", "Lexpo/modules/contacts/next/domain/model/relationship/operations/ExistingRelation;", "Lexpo/modules/contacts/next/records/fields/RelationRecord$Existing;", "Lexpo/modules/contacts/next/records/fields/RelationRecord$New;", "relations", "getRelations", "Lexpo/modules/contacts/next/domain/model/nickname/operations/ExistingNickname;", "Lexpo/modules/contacts/next/records/fields/ExtraNameRecord$Existing;", "Lexpo/modules/contacts/next/records/fields/ExtraNameRecord$New;", "extraNames", "getExtraNames", "Companion", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Contact extends SharedObject {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final ListDataProperty<ExistingStructuredPostal, AddressRecord.Existing, AddressRecord.New> addresses;
    private final MutableDataProperty<ExistingOrganization, String> company;
    private final String contactId;
    private final ListDataProperty<ExistingEvent, DateRecord.Existing, DateRecord.New> dates;
    private final MutableDataProperty<ExistingOrganization, String> department;
    private final ListDataProperty<ExistingEmail, EmailRecord.Existing, EmailRecord.New> emails;
    private final ListDataProperty<ExistingNickname, ExtraNameRecord.Existing, ExtraNameRecord.New> extraNames;
    private final MutableDataProperty<ExistingStructuredName, String> familyName;
    private final ContactsProperty<DisplayName, String> fullName;
    private final MutableDataProperty<ExistingStructuredName, String> givenName;
    private final MutableDataProperty<ExistingPhoto, String> image;
    private final ContactsProperty<PhotoUri, String> imageUri;
    private final ContactIntentDelegate intentDelegate;
    private final MutableContactsProperty<Starred, Boolean> isFavourite;
    private final MutableDataProperty<ExistingOrganization, String> jobTitle;
    private final ContactRecordDomainMapper mapper;
    private final MutableDataProperty<ExistingStructuredName, String> middleName;
    private final MutableDataProperty<ExistingNote, String> note;
    private final ListDataProperty<ExistingPhone, PhoneRecord.Existing, PhoneRecord.New> phones;
    private final MutableDataProperty<ExistingOrganization, String> phoneticCompanyName;
    private final MutableDataProperty<ExistingStructuredName, String> phoneticFamilyName;
    private final MutableDataProperty<ExistingStructuredName, String> phoneticGivenName;
    private final MutableDataProperty<ExistingStructuredName, String> phoneticMiddleName;
    private final PhotoPropertyMapper photoPropertyMapper;
    private final MutableDataProperty<ExistingStructuredName, String> prefix;
    private final ListDataProperty<ExistingRelation, RelationRecord.Existing, RelationRecord.New> relations;
    private final ContactRepository repository;
    private final MutableDataProperty<ExistingStructuredName, String> suffix;
    private final ContactsProperty<PhotoThumbnailUri, String> thumbnail;
    private final ListDataProperty<ExistingWebsite, UrlAddressRecord.Existing, UrlAddressRecord.New> urlAddresses;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0086@¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u0012\u001a\u00020\u00112\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u0012\u0010\u0013J0\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u00162\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0086@¢\u0006\u0004\b\u0017\u0010\u0018J>\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00162\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0086@¢\u0006\u0004\b\u001d\u0010\u001eJ\"\u0010\u001f\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010!\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b!\u0010\"J\u0018\u0010$\u001a\u00020#2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b$\u0010\"¨\u0006%"}, d2 = {"Lexpo/modules/contacts/next/Contact$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "Lexpo/modules/contacts/next/records/contact/CreateContactRecord;", "createContactRecord", "Lexpo/modules/contacts/next/domain/ContactRepository;", "contactRepository", "Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;", "contactMapper", "Lexpo/modules/contacts/next/ContactFactory;", "contactFactory", "Lexpo/modules/contacts/next/Contact;", "create", "(Lexpo/modules/contacts/next/records/contact/CreateContactRecord;Lexpo/modules/contacts/next/domain/ContactRepository;Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;Lexpo/modules/contacts/next/ContactFactory;Ln7/f;)Ljava/lang/Object;", "Lexpo/modules/contacts/next/intents/ContactIntentDelegate;", "contactIntentDelegate", PointerEventHelper.POINTER_TYPE_UNKNOWN, "presentCreateForm", "(Lexpo/modules/contacts/next/records/contact/CreateContactRecord;Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;Lexpo/modules/contacts/next/intents/ContactIntentDelegate;Ln7/f;)Ljava/lang/Object;", "Lexpo/modules/contacts/next/records/ContactQueryOptions;", "contactQueryOptions", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getAll", "(Lexpo/modules/contacts/next/domain/ContactRepository;Lexpo/modules/contacts/next/ContactFactory;Lexpo/modules/contacts/next/records/ContactQueryOptions;Ln7/f;)Ljava/lang/Object;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/contacts/next/records/fields/ContactField;", "fields", "Lexpo/modules/contacts/next/records/contact/GetContactDetailsRecord;", "getAllWithDetails", "(Lexpo/modules/contacts/next/domain/ContactRepository;Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;Ljava/util/Set;Lexpo/modules/contacts/next/records/ContactQueryOptions;Ln7/f;)Ljava/lang/Object;", "presentPicker", "(Lexpo/modules/contacts/next/intents/ContactIntentDelegate;Lexpo/modules/contacts/next/ContactFactory;Ln7/f;)Ljava/lang/Object;", "hasAny", "(Lexpo/modules/contacts/next/domain/ContactRepository;Ln7/f;)Ljava/lang/Object;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getCount", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object create(CreateContactRecord createContactRecord, ContactRepository contactRepository, ContactRecordDomainMapper contactRecordDomainMapper, ContactFactory contactFactory, n7.f fVar) {
            Contact$Companion$create$1 contact$Companion$create$1;
            Object objM49insertHoartsk;
            if (fVar instanceof Contact$Companion$create$1) {
                contact$Companion$create$1 = (Contact$Companion$create$1) fVar;
                int i10 = contact$Companion$create$1.label;
                if ((i10 & androidx.customview.widget.a.INVALID_ID) != 0) {
                    contact$Companion$create$1.label = i10 - androidx.customview.widget.a.INVALID_ID;
                } else {
                    contact$Companion$create$1 = new Contact$Companion$create$1(this, fVar);
                }
            }
            Object obj = contact$Companion$create$1.result;
            Object objE = AbstractC3016b.e();
            int i11 = contact$Companion$create$1.label;
            if (i11 == 0) {
                AbstractC2753p.b(obj);
                NewContact domain = contactRecordDomainMapper.toDomain(createContactRecord);
                contact$Companion$create$1.L$0 = contactFactory;
                contact$Companion$create$1.label = 1;
                objM49insertHoartsk = contactRepository.m49insertHoartsk(domain, contact$Companion$create$1);
                if (objM49insertHoartsk == objE) {
                    return objE;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                contactFactory = (ContactFactory) contact$Companion$create$1.L$0;
                AbstractC2753p.b(obj);
                objM49insertHoartsk = ((ContactId) obj).m135unboximpl();
            }
            return contactFactory.m35createkDnipiQ((String) objM49insertHoartsk);
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object getAll(ContactRepository contactRepository, ContactFactory contactFactory, ContactQueryOptions contactQueryOptions, n7.f fVar) {
            Contact$Companion$getAll$1 contact$Companion$getAll$1;
            if (fVar instanceof Contact$Companion$getAll$1) {
                contact$Companion$getAll$1 = (Contact$Companion$getAll$1) fVar;
                int i10 = contact$Companion$getAll$1.label;
                if ((i10 & androidx.customview.widget.a.INVALID_ID) != 0) {
                    contact$Companion$getAll$1.label = i10 - androidx.customview.widget.a.INVALID_ID;
                } else {
                    contact$Companion$getAll$1 = new Contact$Companion$getAll$1(this, fVar);
                }
            }
            Contact$Companion$getAll$1 contact$Companion$getAll$12 = contact$Companion$getAll$1;
            Object allIds = contact$Companion$getAll$12.result;
            Object objE = AbstractC3016b.e();
            int i11 = contact$Companion$getAll$12.label;
            if (i11 == 0) {
                AbstractC2753p.b(allIds);
                Integer limit = contactQueryOptions != null ? contactQueryOptions.getLimit() : null;
                Integer offset = contactQueryOptions != null ? contactQueryOptions.getOffset() : null;
                String name = contactQueryOptions != null ? contactQueryOptions.getName() : null;
                SortOrder sortOrder = contactQueryOptions != null ? contactQueryOptions.getSortOrder() : null;
                contact$Companion$getAll$12.L$0 = contactFactory;
                contact$Companion$getAll$12.label = 1;
                allIds = contactRepository.getAllIds(limit, offset, name, sortOrder, contact$Companion$getAll$12);
                if (allIds == objE) {
                    return objE;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                contactFactory = (ContactFactory) contact$Companion$getAll$12.L$0;
                AbstractC2753p.b(allIds);
            }
            Iterable iterable = (Iterable) allIds;
            ArrayList arrayList = new ArrayList(AbstractC2800q.u(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(contactFactory.m35createkDnipiQ(((ContactId) it.next()).m135unboximpl()));
            }
            return arrayList;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object getAllWithDetails(ContactRepository contactRepository, ContactRecordDomainMapper contactRecordDomainMapper, Set<? extends ContactField> set, ContactQueryOptions contactQueryOptions, n7.f fVar) {
            Contact$Companion$getAllWithDetails$1 contact$Companion$getAllWithDetails$1;
            if (fVar instanceof Contact$Companion$getAllWithDetails$1) {
                contact$Companion$getAllWithDetails$1 = (Contact$Companion$getAllWithDetails$1) fVar;
                int i10 = contact$Companion$getAllWithDetails$1.label;
                if ((i10 & androidx.customview.widget.a.INVALID_ID) != 0) {
                    contact$Companion$getAllWithDetails$1.label = i10 - androidx.customview.widget.a.INVALID_ID;
                } else {
                    contact$Companion$getAllWithDetails$1 = new Contact$Companion$getAllWithDetails$1(this, fVar);
                }
            }
            Contact$Companion$getAllWithDetails$1 contact$Companion$getAllWithDetails$12 = contact$Companion$getAllWithDetails$1;
            Object allPaginated = contact$Companion$getAllWithDetails$12.result;
            Object objE = AbstractC3016b.e();
            int i11 = contact$Companion$getAllWithDetails$12.label;
            if (i11 == 0) {
                AbstractC2753p.b(allPaginated);
                Set<? extends ExtractableField<?>> setT0 = AbstractC2800q.T0(contactRecordDomainMapper.toExtractableFields(set));
                Integer limit = contactQueryOptions != null ? contactQueryOptions.getLimit() : null;
                Integer offset = contactQueryOptions != null ? contactQueryOptions.getOffset() : null;
                String name = contactQueryOptions != null ? contactQueryOptions.getName() : null;
                SortOrder sortOrder = contactQueryOptions != null ? contactQueryOptions.getSortOrder() : null;
                contact$Companion$getAllWithDetails$12.L$0 = contactRecordDomainMapper;
                contact$Companion$getAllWithDetails$12.label = 1;
                allPaginated = contactRepository.getAllPaginated(setT0, limit, offset, name, sortOrder, contact$Companion$getAllWithDetails$12);
                if (allPaginated == objE) {
                    return objE;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                contactRecordDomainMapper = (ContactRecordDomainMapper) contact$Companion$getAllWithDetails$12.L$0;
                AbstractC2753p.b(allPaginated);
            }
            Iterable iterable = (Iterable) allPaginated;
            ArrayList arrayList = new ArrayList(AbstractC2800q.u(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(contactRecordDomainMapper.toRecord((ExistingContact) it.next()));
            }
            return arrayList;
        }

        public final Object getCount(ContactRepository contactRepository, n7.f fVar) {
            return contactRepository.getCount(fVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object hasAny(ContactRepository contactRepository, n7.f fVar) {
            Contact$Companion$hasAny$1 contact$Companion$hasAny$1;
            if (fVar instanceof Contact$Companion$hasAny$1) {
                contact$Companion$hasAny$1 = (Contact$Companion$hasAny$1) fVar;
                int i10 = contact$Companion$hasAny$1.label;
                if ((i10 & androidx.customview.widget.a.INVALID_ID) != 0) {
                    contact$Companion$hasAny$1.label = i10 - androidx.customview.widget.a.INVALID_ID;
                } else {
                    contact$Companion$hasAny$1 = new Contact$Companion$hasAny$1(this, fVar);
                }
            }
            Object count = contact$Companion$hasAny$1.result;
            Object objE = AbstractC3016b.e();
            int i11 = contact$Companion$hasAny$1.label;
            if (i11 == 0) {
                AbstractC2753p.b(count);
                contact$Companion$hasAny$1.label = 1;
                count = contactRepository.getCount(contact$Companion$hasAny$1);
                if (count == objE) {
                    return objE;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC2753p.b(count);
            }
            return kotlin.coroutines.jvm.internal.b.a(((Number) count).intValue() > 0);
        }

        public final Object presentCreateForm(CreateContactRecord createContactRecord, ContactRecordDomainMapper contactRecordDomainMapper, ContactIntentDelegate contactIntentDelegate, n7.f fVar) {
            List<ContentValues> listJ;
            if (createContactRecord == null || (listJ = contactRecordDomainMapper.toContentValues(createContactRecord)) == null) {
                listJ = AbstractC2800q.j();
            }
            return contactIntentDelegate.launchAddContact(listJ, fVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object presentPicker(ContactIntentDelegate contactIntentDelegate, ContactFactory contactFactory, n7.f fVar) throws UnableToExtractIdFromUriException {
            Contact$Companion$presentPicker$1 contact$Companion$presentPicker$1;
            if (fVar instanceof Contact$Companion$presentPicker$1) {
                contact$Companion$presentPicker$1 = (Contact$Companion$presentPicker$1) fVar;
                int i10 = contact$Companion$presentPicker$1.label;
                if ((i10 & androidx.customview.widget.a.INVALID_ID) != 0) {
                    contact$Companion$presentPicker$1.label = i10 - androidx.customview.widget.a.INVALID_ID;
                } else {
                    contact$Companion$presentPicker$1 = new Contact$Companion$presentPicker$1(this, fVar);
                }
            }
            Object objLaunchPickContact = contact$Companion$presentPicker$1.result;
            Object objE = AbstractC3016b.e();
            int i11 = contact$Companion$presentPicker$1.label;
            if (i11 == 0) {
                AbstractC2753p.b(objLaunchPickContact);
                contact$Companion$presentPicker$1.L$0 = contactFactory;
                contact$Companion$presentPicker$1.label = 1;
                objLaunchPickContact = contactIntentDelegate.launchPickContact(contact$Companion$presentPicker$1);
                if (objLaunchPickContact == objE) {
                    return objE;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                contactFactory = (ContactFactory) contact$Companion$presentPicker$1.L$0;
                AbstractC2753p.b(objLaunchPickContact);
            }
            Uri uri = (Uri) objLaunchPickContact;
            if (uri == null) {
                return null;
            }
            String lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment != null) {
                return contactFactory.create(lastPathSegment);
            }
            throw new UnableToExtractIdFromUriException(uri, null, 2, null);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: expo.modules.contacts.next.Contact$editWithForm$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @kotlin.coroutines.jvm.internal.f(c = "expo.modules.contacts.next.Contact$editWithForm$2", f = "Contact.kt", l = {137, 137}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LR8/N;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<anonymous>", "(LR8/N;)Z"}, k = 3, mv = {2, 1, 0})
    static final class AnonymousClass2 extends l implements Function2 {
        Object L$0;
        int label;

        AnonymousClass2(n7.f fVar) {
            super(2, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            return Contact.this.new AnonymousClass2(fVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, n7.f fVar) {
            return ((AnonymousClass2) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ContactIntentDelegate intentDelegate;
            Object objE = AbstractC3016b.e();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC2753p.b(obj);
                intentDelegate = Contact.this.getIntentDelegate();
                Contact contact = Contact.this;
                this.L$0 = intentDelegate;
                this.label = 1;
                obj = contact.getLookupKeyUri(this);
                if (obj != objE) {
                }
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC2753p.b(obj);
                return obj;
            }
            intentDelegate = (ContactIntentDelegate) this.L$0;
            AbstractC2753p.b(obj);
            this.L$0 = null;
            this.label = 2;
            Object objLaunchEditContact = intentDelegate.launchEditContact((Uri) obj, this);
            return objLaunchEditContact == objE ? objE : objLaunchEditContact;
        }
    }

    /* JADX INFO: renamed from: expo.modules.contacts.next.Contact$getDetails$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @kotlin.coroutines.jvm.internal.f(c = "expo.modules.contacts.next.Contact", f = "Contact.kt", l = {131}, m = "getDetails")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(n7.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= androidx.customview.widget.a.INVALID_ID;
            return Contact.this.getDetails(null, this);
        }
    }

    /* JADX INFO: renamed from: expo.modules.contacts.next.Contact$getLookupKeyUri$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @kotlin.coroutines.jvm.internal.f(c = "expo.modules.contacts.next.Contact", f = "Contact.kt", l = {140}, m = "getLookupKeyUri")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class C24601 extends kotlin.coroutines.jvm.internal.d {
        int label;
        /* synthetic */ Object result;

        C24601(n7.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= androidx.customview.widget.a.INVALID_ID;
            return Contact.this.getLookupKeyUri(this);
        }
    }

    /* JADX INFO: renamed from: expo.modules.contacts.next.Contact$getLookupKeyUri$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @kotlin.coroutines.jvm.internal.f(c = "expo.modules.contacts.next.Contact$getLookupKeyUri$2", f = "Contact.kt", l = {141}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LR8/N;", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "<anonymous>", "(LR8/N;)Landroid/net/Uri;"}, k = 3, mv = {2, 1, 0})
    static final class C24612 extends l implements Function2 {
        int label;

        C24612(n7.f fVar) {
            super(2, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            return Contact.this.new C24612(fVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, n7.f fVar) {
            return ((C24612) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC3016b.e();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC2753p.b(obj);
                ContactRepository repository = Contact.this.getRepository();
                String contactId = Contact.this.getContactId();
                this.label = 1;
                obj = repository.m47getLookupKeyD2TBaGg(contactId, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC2753p.b(obj);
            }
            return ContactsContract.Contacts.getLookupUri(Long.parseLong(Contact.this.getContactId()), (String) obj);
        }
    }

    /* JADX INFO: renamed from: expo.modules.contacts.next.Contact$patch$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @kotlin.coroutines.jvm.internal.f(c = "expo.modules.contacts.next.Contact", f = "Contact.kt", l = {103, 107, 118}, m = "patch")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class C24621 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C24621(n7.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= androidx.customview.widget.a.INVALID_ID;
            return Contact.this.patch(null, this);
        }
    }

    /* JADX INFO: renamed from: expo.modules.contacts.next.Contact$update$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @kotlin.coroutines.jvm.internal.f(c = "expo.modules.contacts.next.Contact", f = "Contact.kt", l = {122, 125}, m = "update")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class C24631 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C24631(n7.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= androidx.customview.widget.a.INVALID_ID;
            return Contact.this.update(null, this);
        }
    }

    public /* synthetic */ Contact(String str, ContactRepository contactRepository, ContactRecordDomainMapper contactRecordDomainMapper, PhotoPropertyMapper photoPropertyMapper, ContactIntentDelegate contactIntentDelegate, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, contactRepository, contactRecordDomainMapper, photoPropertyMapper, contactIntentDelegate);
    }

    private final <TDomain extends Extractable, TDto> ContactsProperty<TDomain, TDto> contactsProperty(ExtractableField.Contacts<TDomain> field, ContactsPropertyMapper<TDomain, TDto> mapper) {
        return new ContactsProperty<>(field, mapper, this.contactId, this.repository, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getLookupKeyUri(n7.f fVar) {
        C24601 c24601;
        if (fVar instanceof C24601) {
            c24601 = (C24601) fVar;
            int i10 = c24601.label;
            if ((i10 & androidx.customview.widget.a.INVALID_ID) != 0) {
                c24601.label = i10 - androidx.customview.widget.a.INVALID_ID;
            } else {
                c24601 = new C24601(fVar);
            }
        }
        Object objG = c24601.result;
        Object objE = AbstractC3016b.e();
        int i11 = c24601.label;
        if (i11 == 0) {
            AbstractC2753p.b(objG);
            J jB = C1404d0.b();
            C24612 c24612 = new C24612(null);
            c24601.label = 1;
            objG = AbstractC1413i.g(jB, c24612, c24601);
            if (objG == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(objG);
        }
        AbstractC2855l.f(objG, "withContext(...)");
        return objG;
    }

    private final <TDomain extends Extractable.Data, TExistingDto extends ExistingRecord, TNewDto extends NewRecord> ListDataProperty<TDomain, TExistingDto, TNewDto> listDataProperty(ExtractableField.Data<TDomain> field, ListDataPropertyMapper<TDomain, TExistingDto, TNewDto> mapper) {
        return new ListDataProperty<>(field, mapper, this.contactId, this.repository, null);
    }

    private final <TDomain extends Extractable, TDto> MutableContactsProperty<TDomain, TDto> mutableContactsProperty(ExtractableField.Contacts<TDomain> field, MutableContactsPropertyMapper<TDomain, TDto> mapper) {
        return new MutableContactsProperty<>(field, mapper, this.contactId, this.repository, null);
    }

    private final <TDomain extends Extractable.Data, TDto> MutableDataProperty<TDomain, TDto> mutableDataProperty(ExtractableField.Data<TDomain> field, MutableDataPropertyMapper<TDomain, TDto> mapper) {
        return new MutableDataProperty<>(field, mapper, this.contactId, this.repository, null);
    }

    public final Object delete(n7.f fVar) {
        return this.repository.m42deleteD2TBaGg(this.contactId, fVar);
    }

    public final Object editWithForm(n7.f fVar) {
        return AbstractC1413i.g(C1404d0.b(), new AnonymousClass2(null), fVar);
    }

    public final ListDataProperty<ExistingStructuredPostal, AddressRecord.Existing, AddressRecord.New> getAddresses() {
        return this.addresses;
    }

    public final MutableDataProperty<ExistingOrganization, String> getCompany() {
        return this.company;
    }

    /* JADX INFO: renamed from: getContactId-S9XCBSM, reason: not valid java name and from getter */
    public final String getContactId() {
        return this.contactId;
    }

    public final ListDataProperty<ExistingEvent, DateRecord.Existing, DateRecord.New> getDates() {
        return this.dates;
    }

    public final MutableDataProperty<ExistingOrganization, String> getDepartment() {
        return this.department;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getDetails(Set<? extends ContactField> set, n7.f fVar) throws ContactNotFoundException {
        AnonymousClass1 anonymousClass1;
        Set<ExtractableField<?>> all;
        if (fVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) fVar;
            int i10 = anonymousClass1.label;
            if ((i10 & androidx.customview.widget.a.INVALID_ID) != 0) {
                anonymousClass1.label = i10 - androidx.customview.widget.a.INVALID_ID;
            } else {
                anonymousClass1 = new AnonymousClass1(fVar);
            }
        }
        Object objM44getByIdm7AL99Q = anonymousClass1.result;
        Object objE = AbstractC3016b.e();
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            AbstractC2753p.b(objM44getByIdm7AL99Q);
            if (set == null || (all = AbstractC2800q.T0(this.mapper.toExtractableFields(set))) == null) {
                all = ExtractableField.INSTANCE.getAll();
            }
            ContactRepository contactRepository = this.repository;
            String str = this.contactId;
            anonymousClass1.label = 1;
            objM44getByIdm7AL99Q = contactRepository.m44getByIdm7AL99Q(all, str, anonymousClass1);
            if (objM44getByIdm7AL99Q == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(objM44getByIdm7AL99Q);
        }
        ExistingContact existingContact = (ExistingContact) objM44getByIdm7AL99Q;
        if (existingContact != null) {
            return this.mapper.toRecord(existingContact);
        }
        throw new ContactNotFoundException(null, 1, null);
    }

    public final ListDataProperty<ExistingEmail, EmailRecord.Existing, EmailRecord.New> getEmails() {
        return this.emails;
    }

    public final ListDataProperty<ExistingNickname, ExtraNameRecord.Existing, ExtraNameRecord.New> getExtraNames() {
        return this.extraNames;
    }

    public final MutableDataProperty<ExistingStructuredName, String> getFamilyName() {
        return this.familyName;
    }

    public final ContactsProperty<DisplayName, String> getFullName() {
        return this.fullName;
    }

    public final MutableDataProperty<ExistingStructuredName, String> getGivenName() {
        return this.givenName;
    }

    public final MutableDataProperty<ExistingPhoto, String> getImage() {
        return this.image;
    }

    public final ContactsProperty<PhotoUri, String> getImageUri() {
        return this.imageUri;
    }

    public final ContactIntentDelegate getIntentDelegate() {
        return this.intentDelegate;
    }

    public final MutableDataProperty<ExistingOrganization, String> getJobTitle() {
        return this.jobTitle;
    }

    public final ContactRecordDomainMapper getMapper() {
        return this.mapper;
    }

    public final MutableDataProperty<ExistingStructuredName, String> getMiddleName() {
        return this.middleName;
    }

    public final MutableDataProperty<ExistingNote, String> getNote() {
        return this.note;
    }

    public final ListDataProperty<ExistingPhone, PhoneRecord.Existing, PhoneRecord.New> getPhones() {
        return this.phones;
    }

    public final MutableDataProperty<ExistingOrganization, String> getPhoneticCompanyName() {
        return this.phoneticCompanyName;
    }

    public final MutableDataProperty<ExistingStructuredName, String> getPhoneticFamilyName() {
        return this.phoneticFamilyName;
    }

    public final MutableDataProperty<ExistingStructuredName, String> getPhoneticGivenName() {
        return this.phoneticGivenName;
    }

    public final MutableDataProperty<ExistingStructuredName, String> getPhoneticMiddleName() {
        return this.phoneticMiddleName;
    }

    public final PhotoPropertyMapper getPhotoPropertyMapper() {
        return this.photoPropertyMapper;
    }

    public final MutableDataProperty<ExistingStructuredName, String> getPrefix() {
        return this.prefix;
    }

    public final ListDataProperty<ExistingRelation, RelationRecord.Existing, RelationRecord.New> getRelations() {
        return this.relations;
    }

    public final ContactRepository getRepository() {
        return this.repository;
    }

    public final MutableDataProperty<ExistingStructuredName, String> getSuffix() {
        return this.suffix;
    }

    public final ContactsProperty<PhotoThumbnailUri, String> getThumbnail() {
        return this.thumbnail;
    }

    public final ListDataProperty<ExistingWebsite, UrlAddressRecord.Existing, UrlAddressRecord.New> getUrlAddresses() {
        return this.urlAddresses;
    }

    public final MutableContactsProperty<Starred, Boolean> isFavourite() {
        return this.isFavourite;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object patch(PatchContactRecord patchContactRecord, n7.f fVar) throws RawContactIdNotFoundException, ContactNotFoundException {
        C24621 c24621;
        PatchContactRecord patchContactRecord2;
        PatchContactRecord patchContactRecord3;
        ExistingContact existingContact;
        Object objM149unboximpl;
        String str;
        if (fVar instanceof C24621) {
            c24621 = (C24621) fVar;
            int i10 = c24621.label;
            if ((i10 & androidx.customview.widget.a.INVALID_ID) != 0) {
                c24621.label = i10 - androidx.customview.widget.a.INVALID_ID;
            } else {
                c24621 = new C24621(fVar);
            }
        }
        Object objM44getByIdm7AL99Q = c24621.result;
        Object objE = AbstractC3016b.e();
        int i11 = c24621.label;
        if (i11 == 0) {
            AbstractC2753p.b(objM44getByIdm7AL99Q);
            ContactRepository contactRepository = this.repository;
            Set<? extends ExtractableField<?>> setH = T.h(StructuredNameField.INSTANCE, OrganizationField.INSTANCE, NoteField.INSTANCE, PhotoField.INSTANCE);
            String str2 = this.contactId;
            c24621.L$0 = patchContactRecord;
            c24621.label = 1;
            objM44getByIdm7AL99Q = contactRepository.m44getByIdm7AL99Q(setH, str2, c24621);
            if (objM44getByIdm7AL99Q != objE) {
                patchContactRecord2 = patchContactRecord;
            }
        }
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC2753p.b(objM44getByIdm7AL99Q);
                return objM44getByIdm7AL99Q;
            }
            existingContact = (ExistingContact) c24621.L$1;
            PatchContactRecord patchContactRecord4 = (PatchContactRecord) c24621.L$0;
            AbstractC2753p.b(objM44getByIdm7AL99Q);
            RawContactId rawContactId = (RawContactId) objM44getByIdm7AL99Q;
            if (rawContactId != null) {
                objM149unboximpl = rawContactId.m149unboximpl();
                patchContactRecord3 = patchContactRecord4;
            } else {
                patchContactRecord3 = patchContactRecord4;
                objM149unboximpl = null;
            }
            str = (String) objM149unboximpl;
            if (str != null) {
                throw new RawContactIdNotFoundException(null, 1, null);
            }
            ContactRecordDomainMapper contactRecordDomainMapper = this.mapper;
            String str3 = this.contactId;
            ExistingStructuredName structuredName = existingContact.getStructuredName();
            String dataId = structuredName != null ? structuredName.getDataId() : null;
            ExistingOrganization organization = existingContact.getOrganization();
            String dataId2 = organization != null ? organization.getDataId() : null;
            ExistingNote note = existingContact.getNote();
            String dataId3 = note != null ? note.getDataId() : null;
            ExistingPhoto photo = existingContact.getPhoto();
            ContactPatch contactPatchM166toPatchContactk_3S2wM = contactRecordDomainMapper.m166toPatchContactk_3S2wM(patchContactRecord3, str, str3, dataId, dataId2, dataId3, photo != null ? photo.getDataId() : null);
            ContactRepository contactRepository2 = this.repository;
            c24621.L$0 = null;
            c24621.L$1 = null;
            c24621.label = 3;
            Object objPatch = contactRepository2.patch(contactPatchM166toPatchContactk_3S2wM, c24621);
            return objPatch == objE ? objE : objPatch;
        }
        patchContactRecord2 = (PatchContactRecord) c24621.L$0;
        AbstractC2753p.b(objM44getByIdm7AL99Q);
        ExistingContact existingContact2 = (ExistingContact) objM44getByIdm7AL99Q;
        if (existingContact2 == null) {
            throw new ContactNotFoundException(null, 1, null);
        }
        ContactRepository contactRepository3 = this.repository;
        String str4 = this.contactId;
        c24621.L$0 = patchContactRecord2;
        c24621.L$1 = existingContact2;
        c24621.label = 2;
        Object objM48getRawContactIdK3SHF88 = contactRepository3.m48getRawContactIdK3SHF88(str4, c24621);
        if (objM48getRawContactIdK3SHF88 != objE) {
            patchContactRecord3 = patchContactRecord2;
            existingContact = existingContact2;
            objM149unboximpl = objM48getRawContactIdK3SHF88;
            str = (String) objM149unboximpl;
            if (str != null) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object update(CreateContactRecord createContactRecord, n7.f fVar) throws RawContactIdNotFoundException {
        C24631 c24631;
        Object objM48getRawContactIdK3SHF88;
        if (fVar instanceof C24631) {
            c24631 = (C24631) fVar;
            int i10 = c24631.label;
            if ((i10 & androidx.customview.widget.a.INVALID_ID) != 0) {
                c24631.label = i10 - androidx.customview.widget.a.INVALID_ID;
            } else {
                c24631 = new C24631(fVar);
            }
        }
        Object obj = c24631.result;
        Object objE = AbstractC3016b.e();
        int i11 = c24631.label;
        if (i11 == 0) {
            AbstractC2753p.b(obj);
            ContactRepository contactRepository = this.repository;
            String str = this.contactId;
            c24631.L$0 = createContactRecord;
            c24631.label = 1;
            objM48getRawContactIdK3SHF88 = contactRepository.m48getRawContactIdK3SHF88(str, c24631);
            if (objM48getRawContactIdK3SHF88 != objE) {
            }
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(obj);
            return obj;
        }
        createContactRecord = (CreateContactRecord) c24631.L$0;
        AbstractC2753p.b(obj);
        RawContactId rawContactId = (RawContactId) obj;
        objM48getRawContactIdK3SHF88 = rawContactId != null ? rawContactId.m149unboximpl() : null;
        String str2 = (String) objM48getRawContactIdK3SHF88;
        if (str2 == null) {
            throw new RawContactIdNotFoundException(null, 1, null);
        }
        UpdateContact updateContactM167toUpdateContactZoEY38 = this.mapper.m167toUpdateContactZoEY38(createContactRecord, this.contactId, str2);
        ContactRepository contactRepository2 = this.repository;
        c24631.L$0 = null;
        c24631.label = 2;
        Object objUpdate = contactRepository2.update(updateContactM167toUpdateContactZoEY38, c24631);
        return objUpdate == objE ? objE : objUpdate;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private Contact(String contactId, ContactRepository repository, ContactRecordDomainMapper mapper, PhotoPropertyMapper photoPropertyMapper, ContactIntentDelegate intentDelegate) {
        super(null, 1, null);
        AbstractC2855l.g(contactId, "contactId");
        AbstractC2855l.g(repository, "repository");
        AbstractC2855l.g(mapper, "mapper");
        AbstractC2855l.g(photoPropertyMapper, "photoPropertyMapper");
        AbstractC2855l.g(intentDelegate, "intentDelegate");
        this.contactId = contactId;
        this.repository = repository;
        this.mapper = mapper;
        this.photoPropertyMapper = photoPropertyMapper;
        this.intentDelegate = intentDelegate;
        StructuredNameField structuredNameField = StructuredNameField.INSTANCE;
        this.givenName = mutableDataProperty(structuredNameField, StructuredNamePropertyMapper.GivenName.INSTANCE);
        this.familyName = mutableDataProperty(structuredNameField, StructuredNamePropertyMapper.FamilyName.INSTANCE);
        this.middleName = mutableDataProperty(structuredNameField, StructuredNamePropertyMapper.MiddleName.INSTANCE);
        this.prefix = mutableDataProperty(structuredNameField, StructuredNamePropertyMapper.Prefix.INSTANCE);
        this.suffix = mutableDataProperty(structuredNameField, StructuredNamePropertyMapper.Suffix.INSTANCE);
        this.phoneticGivenName = mutableDataProperty(structuredNameField, StructuredNamePropertyMapper.PhoneticGivenName.INSTANCE);
        this.phoneticFamilyName = mutableDataProperty(structuredNameField, StructuredNamePropertyMapper.PhoneticFamilyName.INSTANCE);
        this.phoneticMiddleName = mutableDataProperty(structuredNameField, StructuredNamePropertyMapper.PhoneticMiddleName.INSTANCE);
        OrganizationField organizationField = OrganizationField.INSTANCE;
        this.company = mutableDataProperty(organizationField, OrganizationPropertyMapper.Company.INSTANCE);
        this.department = mutableDataProperty(organizationField, OrganizationPropertyMapper.Department.INSTANCE);
        this.jobTitle = mutableDataProperty(organizationField, OrganizationPropertyMapper.JobTitle.INSTANCE);
        this.phoneticCompanyName = mutableDataProperty(organizationField, OrganizationPropertyMapper.PhoneticName.INSTANCE);
        this.note = mutableDataProperty(NoteField.INSTANCE, NoteMapper.INSTANCE);
        this.image = mutableDataProperty(PhotoField.INSTANCE, photoPropertyMapper);
        this.fullName = contactsProperty(DisplayNameField.INSTANCE, DisplayNameMapper.INSTANCE);
        this.thumbnail = contactsProperty(PhotoThumbnailUriField.INSTANCE, PhotoThumbnailUriMapper.INSTANCE);
        this.imageUri = contactsProperty(PhotoUriField.INSTANCE, PhotoUriMapper.INSTANCE);
        this.isFavourite = mutableContactsProperty(StarredField.INSTANCE, StarredMapper.INSTANCE);
        this.emails = listDataProperty(EmailField.INSTANCE, EmailMapper.INSTANCE);
        this.phones = listDataProperty(PhoneField.INSTANCE, PhoneMapper.INSTANCE);
        this.addresses = listDataProperty(StructuredPostalField.INSTANCE, StructuredPostalMapper.INSTANCE);
        this.dates = listDataProperty(EventField.INSTANCE, EventMapper.INSTANCE);
        this.urlAddresses = listDataProperty(WebsiteField.INSTANCE, WebsiteMapper.INSTANCE);
        this.relations = listDataProperty(RelationField.INSTANCE, RelationMapper.INSTANCE);
        this.extraNames = listDataProperty(NicknameField.INSTANCE, NicknameMapper.INSTANCE);
    }
}
