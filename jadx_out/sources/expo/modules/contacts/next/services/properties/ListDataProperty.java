package expo.modules.contacts.next.services.properties;

import androidx.customview.widget.a;
import com.facebook.react.uimanager.drawable.OutsetBoxShadowDrawableKt;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.views.text.TextAttributeProps;
import expo.modules.contacts.next.RawContactIdNotFoundException;
import expo.modules.contacts.next.domain.ContactRepository;
import expo.modules.contacts.next.domain.model.Appendable;
import expo.modules.contacts.next.domain.model.Extractable;
import expo.modules.contacts.next.domain.model.Extractable.Data;
import expo.modules.contacts.next.domain.model.ExtractableField;
import expo.modules.contacts.next.domain.wrappers.DataId;
import expo.modules.contacts.next.domain.wrappers.RawContactId;
import expo.modules.contacts.next.mappers.domain.data.list.ListDataPropertyMapper;
import expo.modules.contacts.next.records.ExistingRecord;
import expo.modules.contacts.next.records.NewRecord;
import i7.AbstractC2753p;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u0003*\b\b\u0002\u0010\u0006*\u00020\u00052\u00020\u0007B?\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012H\u0086@¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00028\u0002H\u0086@¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00028\u0001H\u0086@¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00028\u0001H\u0086@¢\u0006\u0004\b\u001c\u0010\u001bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001dR&\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001eR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001fR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010 ¨\u0006!"}, d2 = {"Lexpo/modules/contacts/next/services/properties/ListDataProperty;", "Lexpo/modules/contacts/next/domain/model/Extractable$Data;", "TDomain", "Lexpo/modules/contacts/next/records/ExistingRecord;", "TExistingDto", "Lexpo/modules/contacts/next/records/NewRecord;", "TNewDto", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/contacts/next/domain/model/ExtractableField$Data;", "extractableField", "Lexpo/modules/contacts/next/mappers/domain/data/list/ListDataPropertyMapper;", "mapper", "Lexpo/modules/contacts/next/domain/wrappers/ContactId;", "contactId", "Lexpo/modules/contacts/next/domain/ContactRepository;", "repository", "<init>", "(Lexpo/modules/contacts/next/domain/model/ExtractableField$Data;Lexpo/modules/contacts/next/mappers/domain/data/list/ListDataPropertyMapper;Ljava/lang/String;Lexpo/modules/contacts/next/domain/ContactRepository;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getAll", "(Ln7/f;)Ljava/lang/Object;", "record", PointerEventHelper.POINTER_TYPE_UNKNOWN, "add", "(Lexpo/modules/contacts/next/records/NewRecord;Ln7/f;)Ljava/lang/Object;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "update", "(Lexpo/modules/contacts/next/records/ExistingRecord;Ln7/f;)Ljava/lang/Object;", "delete", "Lexpo/modules/contacts/next/domain/model/ExtractableField$Data;", "Lexpo/modules/contacts/next/mappers/domain/data/list/ListDataPropertyMapper;", "Ljava/lang/String;", "Lexpo/modules/contacts/next/domain/ContactRepository;", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ListDataProperty<TDomain extends Extractable.Data, TExistingDto extends ExistingRecord, TNewDto extends NewRecord> {
    private final String contactId;
    private final ExtractableField.Data<TDomain> extractableField;
    private final ListDataPropertyMapper<TDomain, TExistingDto, TNewDto> mapper;
    private final ContactRepository repository;

    /* JADX INFO: renamed from: expo.modules.contacts.next.services.properties.ListDataProperty$add$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.contacts.next.services.properties.ListDataProperty", f = "ListDataProperty.kt", l = {OutsetBoxShadowDrawableKt.MIN_OUTSET_BOX_SHADOW_SDK_VERSION, 30}, m = "add")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class AnonymousClass1 extends d {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ ListDataProperty<TDomain, TExistingDto, TNewDto> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ListDataProperty<TDomain, TExistingDto, TNewDto> listDataProperty, n7.f fVar) {
            super(fVar);
            this.this$0 = listDataProperty;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= a.INVALID_ID;
            return this.this$0.add(null, this);
        }
    }

    /* JADX INFO: renamed from: expo.modules.contacts.next.services.properties.ListDataProperty$getAll$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.contacts.next.services.properties.ListDataProperty", f = "ListDataProperty.kt", l = {TextAttributeProps.TA_KEY_ACCESSIBILITY_ROLE}, m = "getAll")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class C24701 extends d {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ ListDataProperty<TDomain, TExistingDto, TNewDto> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C24701(ListDataProperty<TDomain, TExistingDto, TNewDto> listDataProperty, n7.f fVar) {
            super(fVar);
            this.this$0 = listDataProperty;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= a.INVALID_ID;
            return this.this$0.getAll(this);
        }
    }

    public /* synthetic */ ListDataProperty(ExtractableField.Data data, ListDataPropertyMapper listDataPropertyMapper, String str, ContactRepository contactRepository, DefaultConstructorMarker defaultConstructorMarker) {
        this(data, listDataPropertyMapper, str, contactRepository);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0073, code lost:
    
        if (r7 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object add(TNewDto tnewdto, n7.f fVar) throws RawContactIdNotFoundException {
        AnonymousClass1 anonymousClass1;
        Object objM48getRawContactIdK3SHF88;
        Object objM41append4zbj8jY;
        if (fVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) fVar;
            int i10 = anonymousClass1.label;
            if ((i10 & a.INVALID_ID) != 0) {
                anonymousClass1.label = i10 - a.INVALID_ID;
            } else {
                anonymousClass1 = new AnonymousClass1(this, fVar);
            }
        }
        Object obj = anonymousClass1.result;
        Object objE = AbstractC3016b.e();
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            AbstractC2753p.b(obj);
            ContactRepository contactRepository = this.repository;
            String str = this.contactId;
            anonymousClass1.L$0 = tnewdto;
            anonymousClass1.label = 1;
            objM48getRawContactIdK3SHF88 = contactRepository.m48getRawContactIdK3SHF88(str, anonymousClass1);
            if (objM48getRawContactIdK3SHF88 != objE) {
            }
            return objE;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(obj);
            objM41append4zbj8jY = ((DataId) obj).m142unboximpl();
            return (String) objM41append4zbj8jY;
        }
        tnewdto = (TNewDto) anonymousClass1.L$0;
        AbstractC2753p.b(obj);
        RawContactId rawContactId = (RawContactId) obj;
        objM48getRawContactIdK3SHF88 = rawContactId != null ? rawContactId.m149unboximpl() : null;
        String str2 = (String) objM48getRawContactIdK3SHF88;
        if (str2 == null) {
            throw new RawContactIdNotFoundException(null, 1, null);
        }
        ContactRepository contactRepository2 = this.repository;
        Appendable appendableMo204toAppendableMYK5hZQ = this.mapper.mo204toAppendableMYK5hZQ(tnewdto, str2);
        anonymousClass1.L$0 = null;
        anonymousClass1.label = 2;
        objM41append4zbj8jY = contactRepository2.m41append4zbj8jY(appendableMo204toAppendableMYK5hZQ, anonymousClass1);
    }

    public final Object delete(TExistingDto texistingdto, n7.f fVar) {
        return this.repository.m43deleteFieldEntrybM46d30(DataId.m137constructorimpl(texistingdto.getId()), fVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getAll(n7.f fVar) {
        C24701 c24701;
        if (fVar instanceof C24701) {
            c24701 = (C24701) fVar;
            int i10 = c24701.label;
            if ((i10 & a.INVALID_ID) != 0) {
                c24701.label = i10 - a.INVALID_ID;
            } else {
                c24701 = new C24701(this, fVar);
            }
        }
        Object objM46getFieldFromDatam7AL99Q = c24701.result;
        Object objE = AbstractC3016b.e();
        int i11 = c24701.label;
        if (i11 == 0) {
            AbstractC2753p.b(objM46getFieldFromDatam7AL99Q);
            ContactRepository contactRepository = this.repository;
            ExtractableField.Data<TDomain> data = this.extractableField;
            String str = this.contactId;
            c24701.label = 1;
            objM46getFieldFromDatam7AL99Q = contactRepository.m46getFieldFromDatam7AL99Q(data, str, c24701);
            if (objM46getFieldFromDatam7AL99Q == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(objM46getFieldFromDatam7AL99Q);
        }
        Iterable iterable = (Iterable) objM46getFieldFromDatam7AL99Q;
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(this.mapper.toDto((Extractable.Data) it.next()));
        }
        return arrayList;
    }

    public final Object update(TExistingDto texistingdto, n7.f fVar) {
        return this.repository.update(this.mapper.toUpdatable(texistingdto), fVar);
    }

    private ListDataProperty(ExtractableField.Data<TDomain> extractableField, ListDataPropertyMapper<TDomain, TExistingDto, TNewDto> mapper, String contactId, ContactRepository repository) {
        AbstractC2855l.g(extractableField, "extractableField");
        AbstractC2855l.g(mapper, "mapper");
        AbstractC2855l.g(contactId, "contactId");
        AbstractC2855l.g(repository, "repository");
        this.extractableField = extractableField;
        this.mapper = mapper;
        this.contactId = contactId;
        this.repository = repository;
    }
}
