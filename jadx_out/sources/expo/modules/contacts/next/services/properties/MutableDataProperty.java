package expo.modules.contacts.next.services.properties;

import androidx.customview.widget.a;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.views.text.TextAttributeProps;
import expo.modules.contacts.next.RawContactIdNotFoundException;
import expo.modules.contacts.next.domain.ContactRepository;
import expo.modules.contacts.next.domain.model.Appendable;
import expo.modules.contacts.next.domain.model.Extractable;
import expo.modules.contacts.next.domain.model.Extractable.Data;
import expo.modules.contacts.next.domain.model.ExtractableField;
import expo.modules.contacts.next.domain.model.Updatable;
import expo.modules.contacts.next.domain.wrappers.DataId;
import expo.modules.contacts.next.domain.wrappers.RawContactId;
import expo.modules.contacts.next.mappers.domain.data.MutableDataPropertyMapper;
import i7.AbstractC2753p;
import j7.AbstractC2800q;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\u0004\b\u0001\u0010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B9\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00028\u0001H\u0086@¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0013¨\u0006\u0014"}, d2 = {"Lexpo/modules/contacts/next/services/properties/MutableDataProperty;", "Lexpo/modules/contacts/next/domain/model/Extractable$Data;", "TDomain", "TDto", "Lexpo/modules/contacts/next/services/properties/DataProperty;", "Lexpo/modules/contacts/next/domain/model/ExtractableField$Data;", "field", "Lexpo/modules/contacts/next/mappers/domain/data/MutableDataPropertyMapper;", "mapper", "Lexpo/modules/contacts/next/domain/wrappers/ContactId;", "contactId", "Lexpo/modules/contacts/next/domain/ContactRepository;", "repository", "<init>", "(Lexpo/modules/contacts/next/domain/model/ExtractableField$Data;Lexpo/modules/contacts/next/mappers/domain/data/MutableDataPropertyMapper;Ljava/lang/String;Lexpo/modules/contacts/next/domain/ContactRepository;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "newValue", PointerEventHelper.POINTER_TYPE_UNKNOWN, "set", "(Ljava/lang/Object;Ln7/f;)Ljava/lang/Object;", "Lexpo/modules/contacts/next/mappers/domain/data/MutableDataPropertyMapper;", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MutableDataProperty<TDomain extends Extractable.Data, TDto> extends DataProperty<TDomain, TDto> {
    private final MutableDataPropertyMapper<TDomain, TDto> mapper;

    /* JADX INFO: renamed from: expo.modules.contacts.next.services.properties.MutableDataProperty$set$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.contacts.next.services.properties.MutableDataProperty", f = "MutableDataProperty.kt", l = {TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS, TextAttributeProps.TA_KEY_ACCESSIBILITY_ROLE, TextAttributeProps.TA_KEY_ROLE, 29}, m = "set")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class AnonymousClass1 extends d {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ MutableDataProperty<TDomain, TDto> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MutableDataProperty<TDomain, TDto> mutableDataProperty, n7.f fVar) {
            super(fVar);
            this.this$0 = mutableDataProperty;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= a.INVALID_ID;
            return this.this$0.set(null, this);
        }
    }

    public /* synthetic */ MutableDataProperty(ExtractableField.Data data, MutableDataPropertyMapper mutableDataPropertyMapper, String str, ContactRepository contactRepository, DefaultConstructorMarker defaultConstructorMarker) {
        this(data, mutableDataPropertyMapper, str, contactRepository);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c7, code lost:
    
        if (r10 == r1) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object set(TDto tdto, n7.f fVar) throws RawContactIdNotFoundException {
        AnonymousClass1 anonymousClass1;
        TDto tdto2;
        Object objM48getRawContactIdK3SHF88;
        Object obj;
        String str;
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
        Object objM46getFieldFromDatam7AL99Q = anonymousClass1.result;
        Object objE = AbstractC3016b.e();
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            AbstractC2753p.b(objM46getFieldFromDatam7AL99Q);
            ContactRepository repository = getRepository();
            ExtractableField.Data<TDomain> field = getField();
            String contactId = getContactId();
            anonymousClass1.L$0 = tdto;
            anonymousClass1.label = 1;
            objM46getFieldFromDatam7AL99Q = repository.m46getFieldFromDatam7AL99Q(field, contactId, anonymousClass1);
            tdto2 = tdto;
            if (objM46getFieldFromDatam7AL99Q != objE) {
            }
            return objE;
        }
        if (i11 == 1) {
            TDto tdto3 = (TDto) anonymousClass1.L$0;
            AbstractC2753p.b(objM46getFieldFromDatam7AL99Q);
            tdto2 = tdto3;
        } else {
            if (i11 == 2) {
                AbstractC2753p.b(objM46getFieldFromDatam7AL99Q);
                return objM46getFieldFromDatam7AL99Q;
            }
            if (i11 != 3) {
                if (i11 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC2753p.b(objM46getFieldFromDatam7AL99Q);
                objM41append4zbj8jY = ((DataId) objM46getFieldFromDatam7AL99Q).m142unboximpl();
                return b.a(true);
            }
            Object obj2 = anonymousClass1.L$0;
            AbstractC2753p.b(objM46getFieldFromDatam7AL99Q);
            RawContactId rawContactId = (RawContactId) objM46getFieldFromDatam7AL99Q;
            if (rawContactId != null) {
                objM48getRawContactIdK3SHF88 = rawContactId.m149unboximpl();
                obj = obj2;
            } else {
                objM48getRawContactIdK3SHF88 = null;
                obj = obj2;
            }
            str = (String) objM48getRawContactIdK3SHF88;
            if (str != null) {
                throw new RawContactIdNotFoundException(null, 1, null);
            }
            Appendable appendableMo174toAppendableMYK5hZQ = this.mapper.mo174toAppendableMYK5hZQ(obj, str);
            ContactRepository repository2 = getRepository();
            anonymousClass1.L$0 = null;
            anonymousClass1.label = 4;
            objM41append4zbj8jY = repository2.m41append4zbj8jY(appendableMo174toAppendableMYK5hZQ, anonymousClass1);
        }
        Extractable.Data data = (Extractable.Data) AbstractC2800q.g0((List) objM46getFieldFromDatam7AL99Q);
        String dataId = data != null ? data.getDataId() : null;
        if (dataId != null) {
            Updatable.Data dataMo175toUpdatablebM46d30 = this.mapper.mo175toUpdatablebM46d30(dataId, tdto2);
            ContactRepository repository3 = getRepository();
            anonymousClass1.L$0 = null;
            anonymousClass1.label = 2;
            Object objUpdate = repository3.update(dataMo175toUpdatablebM46d30, anonymousClass1);
            if (objUpdate != objE) {
                return objUpdate;
            }
        } else {
            ContactRepository repository4 = getRepository();
            String contactId2 = getContactId();
            anonymousClass1.L$0 = tdto2;
            anonymousClass1.label = 3;
            objM48getRawContactIdK3SHF88 = repository4.m48getRawContactIdK3SHF88(contactId2, anonymousClass1);
            obj = tdto2;
            if (objM48getRawContactIdK3SHF88 != objE) {
                str = (String) objM48getRawContactIdK3SHF88;
                if (str != null) {
                }
            }
        }
        return objE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private MutableDataProperty(ExtractableField.Data<TDomain> field, MutableDataPropertyMapper<TDomain, TDto> mapper, String contactId, ContactRepository repository) {
        super(field, mapper, contactId, repository, null);
        AbstractC2855l.g(field, "field");
        AbstractC2855l.g(mapper, "mapper");
        AbstractC2855l.g(contactId, "contactId");
        AbstractC2855l.g(repository, "repository");
        this.mapper = mapper;
    }
}
