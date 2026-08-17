package expo.modules.contacts.next.domain.model.structuredpostal.operations;

import android.content.ContentProviderOperation;
import android.content.ContentValues;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.contacts.Columns;
import expo.modules.contacts.next.domain.model.Updatable;
import expo.modules.contacts.next.domain.model.structuredpostal.StructuredPostalLabel;
import expo.modules.contacts.next.domain.model.structuredpostal.StructuredPostalModel;
import expo.modules.kotlin.types.ValueOrUndefined;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002By\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0006¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u0014X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lexpo/modules/contacts/next/domain/model/structuredpostal/operations/PatchStructuredPostal;", "Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalModel;", "Lexpo/modules/contacts/next/domain/model/Updatable$Data;", "dataId", "Lexpo/modules/contacts/next/domain/wrappers/DataId;", "street", "Lexpo/modules/kotlin/types/ValueOrUndefined;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "city", "region", "postcode", "country", "label", "Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalLabel;", "<init>", "(Ljava/lang/String;Lexpo/modules/kotlin/types/ValueOrUndefined;Lexpo/modules/kotlin/types/ValueOrUndefined;Lexpo/modules/kotlin/types/ValueOrUndefined;Lexpo/modules/kotlin/types/ValueOrUndefined;Lexpo/modules/kotlin/types/ValueOrUndefined;Lexpo/modules/kotlin/types/ValueOrUndefined;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getDataId-sXKVoX8", "()Ljava/lang/String;", "Ljava/lang/String;", "contentValues", "Landroid/content/ContentValues;", "getContentValues", "()Landroid/content/ContentValues;", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PatchStructuredPostal extends StructuredPostalModel implements Updatable.Data {
    private final ContentValues contentValues;
    private final String dataId;

    public /* synthetic */ PatchStructuredPostal(String str, ValueOrUndefined valueOrUndefined, ValueOrUndefined valueOrUndefined2, ValueOrUndefined valueOrUndefined3, ValueOrUndefined valueOrUndefined4, ValueOrUndefined valueOrUndefined5, ValueOrUndefined valueOrUndefined6, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, valueOrUndefined, valueOrUndefined2, valueOrUndefined3, valueOrUndefined4, valueOrUndefined5, valueOrUndefined6);
    }

    @Override // expo.modules.contacts.next.domain.model.structuredpostal.StructuredPostalModel, expo.modules.contacts.next.domain.model.Updatable
    public ContentValues getContentValues() {
        return this.contentValues;
    }

    @Override // expo.modules.contacts.next.domain.model.Updatable.Data, expo.modules.contacts.next.domain.model.Extractable.Data
    /* JADX INFO: renamed from: getDataId-sXKVoX8, reason: from getter */
    public String getDataId() {
        return this.dataId;
    }

    @Override // expo.modules.contacts.next.domain.model.Updatable.Data, expo.modules.contacts.next.domain.model.Updatable
    public ContentProviderOperation toUpdateOperation() {
        return Updatable.Data.DefaultImpls.toUpdateOperation(this);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PatchStructuredPostal(String str, ValueOrUndefined valueOrUndefined, ValueOrUndefined valueOrUndefined2, ValueOrUndefined valueOrUndefined3, ValueOrUndefined valueOrUndefined4, ValueOrUndefined valueOrUndefined5, ValueOrUndefined valueOrUndefined6, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        ValueOrUndefined valueOrUndefined7;
        ValueOrUndefined valueOrUndefined8;
        ValueOrUndefined valueOrUndefined9;
        if ((i10 & 2) != 0) {
            ValueOrUndefined.Companion companion = ValueOrUndefined.INSTANCE;
            valueOrUndefined = ValueOrUndefined.Undefined.INSTANCE;
            AbstractC2855l.e(valueOrUndefined, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>");
        }
        ValueOrUndefined valueOrUndefined10 = valueOrUndefined;
        if ((i10 & 4) != 0) {
            ValueOrUndefined.Companion companion2 = ValueOrUndefined.INSTANCE;
            valueOrUndefined2 = ValueOrUndefined.Undefined.INSTANCE;
            AbstractC2855l.e(valueOrUndefined2, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>");
        }
        ValueOrUndefined valueOrUndefined11 = valueOrUndefined2;
        if ((i10 & 8) != 0) {
            ValueOrUndefined.Companion companion3 = ValueOrUndefined.INSTANCE;
            valueOrUndefined3 = ValueOrUndefined.Undefined.INSTANCE;
            AbstractC2855l.e(valueOrUndefined3, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>");
        }
        ValueOrUndefined valueOrUndefined12 = valueOrUndefined3;
        if ((i10 & 16) != 0) {
            ValueOrUndefined.Companion companion4 = ValueOrUndefined.INSTANCE;
            ValueOrUndefined.Undefined undefined = ValueOrUndefined.Undefined.INSTANCE;
            AbstractC2855l.e(undefined, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>");
            valueOrUndefined7 = undefined;
        } else {
            valueOrUndefined7 = valueOrUndefined4;
        }
        if ((i10 & 32) != 0) {
            ValueOrUndefined.Companion companion5 = ValueOrUndefined.INSTANCE;
            ValueOrUndefined.Undefined undefined2 = ValueOrUndefined.Undefined.INSTANCE;
            AbstractC2855l.e(undefined2, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>");
            valueOrUndefined8 = undefined2;
        } else {
            valueOrUndefined8 = valueOrUndefined5;
        }
        if ((i10 & 64) != 0) {
            ValueOrUndefined.Companion companion6 = ValueOrUndefined.INSTANCE;
            ValueOrUndefined.Undefined undefined3 = ValueOrUndefined.Undefined.INSTANCE;
            AbstractC2855l.e(undefined3, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>");
            valueOrUndefined9 = undefined3;
        } else {
            valueOrUndefined9 = valueOrUndefined6;
        }
        this(str, valueOrUndefined10, valueOrUndefined11, valueOrUndefined12, valueOrUndefined7, valueOrUndefined8, valueOrUndefined9, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private PatchStructuredPostal(String dataId, ValueOrUndefined<String> street, ValueOrUndefined<String> city, ValueOrUndefined<String> region, ValueOrUndefined<String> postcode, ValueOrUndefined<String> country, ValueOrUndefined<StructuredPostalLabel> label) {
        AbstractC2855l.g(dataId, "dataId");
        AbstractC2855l.g(street, "street");
        AbstractC2855l.g(city, "city");
        AbstractC2855l.g(region, "region");
        AbstractC2855l.g(postcode, "postcode");
        AbstractC2855l.g(country, "country");
        AbstractC2855l.g(label, "label");
        String optional = street.getOptional();
        String optional2 = city.getOptional();
        String optional3 = region.getOptional();
        String optional4 = postcode.getOptional();
        String optional5 = country.getOptional();
        StructuredPostalLabel optional6 = label.getOptional();
        super(optional, optional2, optional3, optional4, optional5, optional6 == null ? new StructuredPostalLabel.Custom("other") : optional6);
        this.dataId = dataId;
        ContentValues contentValues = new ContentValues();
        if (!street.isUndefined()) {
            contentValues.put(Columns.DATA_4, street.getOptional());
        }
        if (!city.isUndefined()) {
            contentValues.put(Columns.DATA_7, city.getOptional());
        }
        if (!region.isUndefined()) {
            contentValues.put(Columns.DATA_8, region.getOptional());
        }
        if (!postcode.isUndefined()) {
            contentValues.put(Columns.DATA_9, postcode.getOptional());
        }
        if (!country.isUndefined()) {
            contentValues.put(Columns.DATA_10, country.getOptional());
        }
        if (!label.isUndefined()) {
            StructuredPostalLabel optional7 = label.getOptional();
            contentValues.put(Columns.TYPE, optional7 != null ? Integer.valueOf(optional7.getType()) : null);
            StructuredPostalLabel optional8 = label.getOptional();
            contentValues.put(Columns.LABEL, optional8 != null ? optional8.getLabel() : null);
        }
        this.contentValues = contentValues;
    }
}
