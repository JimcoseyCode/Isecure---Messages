package expo.modules.contacts.next.services.properties;

import androidx.customview.widget.a;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.contacts.next.domain.ContactRepository;
import expo.modules.contacts.next.domain.model.Extractable;
import expo.modules.contacts.next.domain.model.Extractable.Data;
import expo.modules.contacts.next.domain.model.ExtractableField;
import expo.modules.contacts.next.mappers.domain.data.DataPropertyMapper;
import i7.AbstractC2753p;
import j7.AbstractC2800q;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\u0004\b\u0001\u0010\u00032\u00020\u0004B9\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00018\u0001H\u0086@¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00078\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\n\u001a\u00020\t8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\f\u001a\u00020\u000b8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lexpo/modules/contacts/next/services/properties/DataProperty;", "Lexpo/modules/contacts/next/domain/model/Extractable$Data;", "TDomain", "TDto", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/contacts/next/domain/model/ExtractableField$Data;", "field", "Lexpo/modules/contacts/next/mappers/domain/data/DataPropertyMapper;", "readMapper", "Lexpo/modules/contacts/next/domain/wrappers/ContactId;", "contactId", "Lexpo/modules/contacts/next/domain/ContactRepository;", "repository", "<init>", "(Lexpo/modules/contacts/next/domain/model/ExtractableField$Data;Lexpo/modules/contacts/next/mappers/domain/data/DataPropertyMapper;Ljava/lang/String;Lexpo/modules/contacts/next/domain/ContactRepository;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "get", "(Ln7/f;)Ljava/lang/Object;", "Lexpo/modules/contacts/next/domain/model/ExtractableField$Data;", "getField", "()Lexpo/modules/contacts/next/domain/model/ExtractableField$Data;", "Lexpo/modules/contacts/next/mappers/domain/data/DataPropertyMapper;", "getReadMapper", "()Lexpo/modules/contacts/next/mappers/domain/data/DataPropertyMapper;", "Ljava/lang/String;", "getContactId-S9XCBSM", "()Ljava/lang/String;", "Lexpo/modules/contacts/next/domain/ContactRepository;", "getRepository", "()Lexpo/modules/contacts/next/domain/ContactRepository;", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class DataProperty<TDomain extends Extractable.Data, TDto> {
    private final String contactId;
    private final ExtractableField.Data<TDomain> field;
    private final DataPropertyMapper<TDomain, TDto> readMapper;
    private final ContactRepository repository;

    /* JADX INFO: renamed from: expo.modules.contacts.next.services.properties.DataProperty$get$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.contacts.next.services.properties.DataProperty", f = "DataProperty.kt", l = {17}, m = "get")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class AnonymousClass1 extends d {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ DataProperty<TDomain, TDto> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(DataProperty<TDomain, TDto> dataProperty, n7.f fVar) {
            super(fVar);
            this.this$0 = dataProperty;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= a.INVALID_ID;
            return this.this$0.get(this);
        }
    }

    public /* synthetic */ DataProperty(ExtractableField.Data data, DataPropertyMapper dataPropertyMapper, String str, ContactRepository contactRepository, DefaultConstructorMarker defaultConstructorMarker) {
        this(data, dataPropertyMapper, str, contactRepository);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(n7.f fVar) {
        AnonymousClass1 anonymousClass1;
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
            ContactRepository contactRepository = this.repository;
            ExtractableField.Data<TDomain> data = this.field;
            String str = this.contactId;
            anonymousClass1.label = 1;
            objM46getFieldFromDatam7AL99Q = contactRepository.m46getFieldFromDatam7AL99Q(data, str, anonymousClass1);
            if (objM46getFieldFromDatam7AL99Q == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(objM46getFieldFromDatam7AL99Q);
        }
        Extractable.Data data2 = (Extractable.Data) AbstractC2800q.g0((List) objM46getFieldFromDatam7AL99Q);
        if (data2 == null) {
            return null;
        }
        return this.readMapper.toDto(data2);
    }

    /* JADX INFO: renamed from: getContactId-S9XCBSM, reason: not valid java name and from getter */
    protected final String getContactId() {
        return this.contactId;
    }

    protected final ExtractableField.Data<TDomain> getField() {
        return this.field;
    }

    protected final DataPropertyMapper<TDomain, TDto> getReadMapper() {
        return this.readMapper;
    }

    protected final ContactRepository getRepository() {
        return this.repository;
    }

    private DataProperty(ExtractableField.Data<TDomain> field, DataPropertyMapper<TDomain, TDto> readMapper, String contactId, ContactRepository repository) {
        AbstractC2855l.g(field, "field");
        AbstractC2855l.g(readMapper, "readMapper");
        AbstractC2855l.g(contactId, "contactId");
        AbstractC2855l.g(repository, "repository");
        this.field = field;
        this.readMapper = readMapper;
        this.contactId = contactId;
        this.repository = repository;
    }
}
