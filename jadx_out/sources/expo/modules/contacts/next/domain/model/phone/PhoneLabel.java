package expo.modules.contacts.next.domain.model.phone;

import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.notifications.service.NotificationsService;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0015\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f B\u001d\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0015!\"#$%&'()*+,-./012345¨\u00066"}, d2 = {"Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel;", PointerEventHelper.POINTER_TYPE_UNKNOWN, NotificationsService.EVENT_TYPE_KEY, PointerEventHelper.POINTER_TYPE_UNKNOWN, "label", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "(ILjava/lang/String;)V", "getType", "()I", "getLabel", "()Ljava/lang/String;", "Home", "Mobile", "Work", "FaxWork", "FaxHome", "Pager", "Other", "Callback", "Car", "CompanyMain", "Isdn", "Main", "OtherFax", "Radio", "Telex", "TtyTdd", "WorkMobile", "WorkPager", "Assistant", "Mms", "Custom", "Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$Assistant;", "Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$Callback;", "Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$Car;", "Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$CompanyMain;", "Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$Custom;", "Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$FaxHome;", "Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$FaxWork;", "Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$Home;", "Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$Isdn;", "Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$Main;", "Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$Mms;", "Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$Mobile;", "Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$Other;", "Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$OtherFax;", "Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$Pager;", "Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$Radio;", "Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$Telex;", "Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$TtyTdd;", "Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$Work;", "Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$WorkMobile;", "Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$WorkPager;", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class PhoneLabel {
    private final String label;
    private final int type;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$Assistant;", "Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel;", "<init>", "()V", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Assistant extends PhoneLabel {
        public static final Assistant INSTANCE = new Assistant();

        /* JADX WARN: Multi-variable type inference failed */
        private Assistant() {
            super(19, null, 2, 0 == true ? 1 : 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$Callback;", "Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel;", "<init>", "()V", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Callback extends PhoneLabel {
        public static final Callback INSTANCE = new Callback();

        /* JADX WARN: Multi-variable type inference failed */
        private Callback() {
            super(8, null, 2, 0 == true ? 1 : 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$Car;", "Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel;", "<init>", "()V", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Car extends PhoneLabel {
        public static final Car INSTANCE = new Car();

        /* JADX WARN: Multi-variable type inference failed */
        private Car() {
            super(9, null, 2, 0 == true ? 1 : 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$CompanyMain;", "Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel;", "<init>", "()V", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CompanyMain extends PhoneLabel {
        public static final CompanyMain INSTANCE = new CompanyMain();

        /* JADX WARN: Multi-variable type inference failed */
        private CompanyMain() {
            super(10, null, 2, 0 == true ? 1 : 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$Custom;", "Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel;", "label", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "(Ljava/lang/String;)V", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Custom extends PhoneLabel {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Custom(String label) {
            super(0, label, null);
            AbstractC2855l.g(label, "label");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$FaxHome;", "Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel;", "<init>", "()V", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FaxHome extends PhoneLabel {
        public static final FaxHome INSTANCE = new FaxHome();

        /* JADX WARN: Multi-variable type inference failed */
        private FaxHome() {
            super(5, null, 2, 0 == true ? 1 : 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$FaxWork;", "Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel;", "<init>", "()V", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FaxWork extends PhoneLabel {
        public static final FaxWork INSTANCE = new FaxWork();

        /* JADX WARN: Multi-variable type inference failed */
        private FaxWork() {
            super(4, null, 2, 0 == true ? 1 : 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$Home;", "Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel;", "<init>", "()V", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Home extends PhoneLabel {
        public static final Home INSTANCE = new Home();

        /* JADX WARN: Multi-variable type inference failed */
        private Home() {
            super(1, null, 2, 0 == true ? 1 : 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$Isdn;", "Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel;", "<init>", "()V", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Isdn extends PhoneLabel {
        public static final Isdn INSTANCE = new Isdn();

        /* JADX WARN: Multi-variable type inference failed */
        private Isdn() {
            super(11, null, 2, 0 == true ? 1 : 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$Main;", "Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel;", "<init>", "()V", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Main extends PhoneLabel {
        public static final Main INSTANCE = new Main();

        /* JADX WARN: Multi-variable type inference failed */
        private Main() {
            super(12, null, 2, 0 == true ? 1 : 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$Mms;", "Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel;", "<init>", "()V", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Mms extends PhoneLabel {
        public static final Mms INSTANCE = new Mms();

        /* JADX WARN: Multi-variable type inference failed */
        private Mms() {
            super(20, null, 2, 0 == true ? 1 : 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$Mobile;", "Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel;", "<init>", "()V", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Mobile extends PhoneLabel {
        public static final Mobile INSTANCE = new Mobile();

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        private Mobile() {
            int i10 = 2;
            super(i10, null, i10, 0 == true ? 1 : 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$Other;", "Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel;", "<init>", "()V", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Other extends PhoneLabel {
        public static final Other INSTANCE = new Other();

        /* JADX WARN: Multi-variable type inference failed */
        private Other() {
            super(7, null, 2, 0 == true ? 1 : 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$OtherFax;", "Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel;", "<init>", "()V", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OtherFax extends PhoneLabel {
        public static final OtherFax INSTANCE = new OtherFax();

        /* JADX WARN: Multi-variable type inference failed */
        private OtherFax() {
            super(13, null, 2, 0 == true ? 1 : 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$Pager;", "Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel;", "<init>", "()V", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Pager extends PhoneLabel {
        public static final Pager INSTANCE = new Pager();

        /* JADX WARN: Multi-variable type inference failed */
        private Pager() {
            super(6, null, 2, 0 == true ? 1 : 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$Radio;", "Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel;", "<init>", "()V", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Radio extends PhoneLabel {
        public static final Radio INSTANCE = new Radio();

        /* JADX WARN: Multi-variable type inference failed */
        private Radio() {
            super(14, null, 2, 0 == true ? 1 : 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$Telex;", "Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel;", "<init>", "()V", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Telex extends PhoneLabel {
        public static final Telex INSTANCE = new Telex();

        /* JADX WARN: Multi-variable type inference failed */
        private Telex() {
            super(15, null, 2, 0 == true ? 1 : 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$TtyTdd;", "Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel;", "<init>", "()V", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TtyTdd extends PhoneLabel {
        public static final TtyTdd INSTANCE = new TtyTdd();

        /* JADX WARN: Multi-variable type inference failed */
        private TtyTdd() {
            super(16, null, 2, 0 == true ? 1 : 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$Work;", "Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel;", "<init>", "()V", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Work extends PhoneLabel {
        public static final Work INSTANCE = new Work();

        /* JADX WARN: Multi-variable type inference failed */
        private Work() {
            super(3, null, 2, 0 == true ? 1 : 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$WorkMobile;", "Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel;", "<init>", "()V", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class WorkMobile extends PhoneLabel {
        public static final WorkMobile INSTANCE = new WorkMobile();

        /* JADX WARN: Multi-variable type inference failed */
        private WorkMobile() {
            super(17, null, 2, 0 == true ? 1 : 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$WorkPager;", "Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel;", "<init>", "()V", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class WorkPager extends PhoneLabel {
        public static final WorkPager INSTANCE = new WorkPager();

        /* JADX WARN: Multi-variable type inference failed */
        private WorkPager() {
            super(18, null, 2, 0 == true ? 1 : 0);
        }
    }

    public /* synthetic */ PhoneLabel(int i10, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, str);
    }

    public final String getLabel() {
        return this.label;
    }

    public final int getType() {
        return this.type;
    }

    private PhoneLabel(int i10, String str) {
        this.type = i10;
        this.label = str;
    }

    public /* synthetic */ PhoneLabel(int i10, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, (i11 & 2) != 0 ? null : str, null);
    }
}
