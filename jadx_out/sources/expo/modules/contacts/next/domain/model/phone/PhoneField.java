package expo.modules.contacts.next.domain.model.phone;

import android.database.Cursor;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.views.text.TextAttributeProps;
import expo.modules.contacts.Columns;
import expo.modules.contacts.next.domain.model.ExtractableField;
import expo.modules.contacts.next.domain.model.phone.PhoneLabel;
import expo.modules.contacts.next.domain.model.phone.operations.ExistingPhone;
import expo.modules.contacts.next.domain.wrappers.DataId;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\f\u0010\u0011\u001a\u00020\u0012*\u00020\u0010H\u0002R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nX\u0096\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u0013"}, d2 = {"Lexpo/modules/contacts/next/domain/model/phone/PhoneField;", "Lexpo/modules/contacts/next/domain/model/ExtractableField$Data;", "Lexpo/modules/contacts/next/domain/model/phone/operations/ExistingPhone;", "<init>", "()V", "mimeType", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getMimeType", "()Ljava/lang/String;", "projection", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getProjection", "()[Ljava/lang/String;", "[Ljava/lang/String;", "extract", "cursor", "Landroid/database/Cursor;", "extractLabel", "Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel;", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PhoneField implements ExtractableField.Data<ExistingPhone> {
    public static final PhoneField INSTANCE = new PhoneField();
    private static final String mimeType = "vnd.android.cursor.item/phone_v2";
    private static final String[] projection = {"_id", Columns.DATA, Columns.TYPE, Columns.LABEL};

    private PhoneField() {
    }

    private final PhoneLabel extractLabel(Cursor cursor) {
        switch (cursor.getInt(cursor.getColumnIndexOrThrow(Columns.TYPE))) {
            case 1:
                return PhoneLabel.Home.INSTANCE;
            case 2:
                return PhoneLabel.Mobile.INSTANCE;
            case 3:
                return PhoneLabel.Work.INSTANCE;
            case 4:
                return PhoneLabel.FaxWork.INSTANCE;
            case 5:
                return PhoneLabel.FaxHome.INSTANCE;
            case 6:
                return PhoneLabel.Pager.INSTANCE;
            case 7:
                return PhoneLabel.Other.INSTANCE;
            case 8:
                return PhoneLabel.Callback.INSTANCE;
            case 9:
                return PhoneLabel.Car.INSTANCE;
            case 10:
                return PhoneLabel.CompanyMain.INSTANCE;
            case 11:
                return PhoneLabel.Isdn.INSTANCE;
            case 12:
                return PhoneLabel.Main.INSTANCE;
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                return PhoneLabel.OtherFax.INSTANCE;
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                return PhoneLabel.Radio.INSTANCE;
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                return PhoneLabel.Telex.INSTANCE;
            case 16:
                return PhoneLabel.TtyTdd.INSTANCE;
            case 17:
                return PhoneLabel.WorkMobile.INSTANCE;
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
                return PhoneLabel.WorkPager.INSTANCE;
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
                return PhoneLabel.Assistant.INSTANCE;
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DX /* 20 */:
                return PhoneLabel.Mms.INSTANCE;
            default:
                String string = cursor.getString(cursor.getColumnIndexOrThrow(Columns.LABEL));
                AbstractC2855l.d(string);
                return new PhoneLabel.Custom(string);
        }
    }

    @Override // expo.modules.contacts.next.domain.model.ExtractableField.Data
    public String getMimeType() {
        return mimeType;
    }

    @Override // expo.modules.contacts.next.domain.model.ExtractableField
    public String[] getProjection() {
        return projection;
    }

    @Override // expo.modules.contacts.next.domain.model.ExtractableField
    public ExistingPhone extract(Cursor cursor) {
        AbstractC2855l.g(cursor, "cursor");
        String string = cursor.getString(cursor.getColumnIndexOrThrow("_id"));
        AbstractC2855l.f(string, "getString(...)");
        return new ExistingPhone(DataId.m137constructorimpl(string), cursor.getString(cursor.getColumnIndexOrThrow(Columns.DATA)), INSTANCE.extractLabel(cursor), null);
    }
}
