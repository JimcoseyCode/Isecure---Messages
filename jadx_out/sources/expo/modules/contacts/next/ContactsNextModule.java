package expo.modules.contacts.next;

import C7.o;
import C7.q;
import android.content.ContentResolver;
import android.content.Context;
import expo.modules.contacts.next.domain.ContactRepository;
import expo.modules.contacts.next.intents.ContactIntentDelegate;
import expo.modules.contacts.next.mappers.ContactRecordDomainMapper;
import expo.modules.contacts.next.mappers.domain.data.PhotoPropertyMapper;
import expo.modules.contacts.next.observers.ContactsObserverDelegate;
import expo.modules.contacts.next.records.ContactQueryOptions;
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
import expo.modules.contacts.next.services.ImageByteArrayConverter;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.classcomponent.ClassComponentBuilder;
import expo.modules.kotlin.events.BasicEventListener;
import expo.modules.kotlin.events.EventListener;
import expo.modules.kotlin.events.EventName;
import expo.modules.kotlin.exception.Exceptions;
import expo.modules.kotlin.functions.AsyncFunctionBuilder;
import expo.modules.kotlin.functions.AsyncFunctionComponent;
import expo.modules.kotlin.functions.AsyncFunctionWithPromiseComponent;
import expo.modules.kotlin.functions.BoolAsyncFunctionComponent;
import expo.modules.kotlin.functions.DoubleAsyncFunctionComponent;
import expo.modules.kotlin.functions.FloatAsyncFunctionComponent;
import expo.modules.kotlin.functions.IntAsyncFunctionComponent;
import expo.modules.kotlin.functions.StringAsyncFunctionComponent;
import expo.modules.kotlin.functions.SuspendFunctionComponent;
import expo.modules.kotlin.functions.SyncFunctionComponent;
import expo.modules.kotlin.functions.UntypedAsyncFunctionComponent;
import expo.modules.kotlin.modules.Module;
import expo.modules.kotlin.modules.ModuleDefinitionBuilder;
import expo.modules.kotlin.modules.ModuleDefinitionData;
import expo.modules.kotlin.objects.PropertyComponentBuilderWithThis;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeProvider;
import expo.modules.kotlin.types.LazyKType;
import expo.modules.kotlin.types.ReturnType;
import expo.modules.kotlin.types.ReturnTypeProvider;
import expo.modules.kotlin.types.TypeConverterProvider;
import i7.AbstractC2746i;
import i7.C2735B;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;
import l1.AbstractC2861a;
import v7.AbstractC3430a;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010.\u001a\u00020/H\u0016R\u0014\u0010\u0004\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\r\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010\u001f\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\r\u001a\u0004\b!\u0010\"R\u001b\u0010$\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\r\u001a\u0004\b&\u0010'R\u001b\u0010)\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\r\u001a\u0004\b+\u0010,¨\u00060"}, d2 = {"Lexpo/modules/contacts/next/ContactsNextModule;", "Lexpo/modules/kotlin/modules/Module;", "<init>", "()V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "imageByteArrayConverter", "Lexpo/modules/contacts/next/services/ImageByteArrayConverter;", "getImageByteArrayConverter", "()Lexpo/modules/contacts/next/services/ImageByteArrayConverter;", "imageByteArrayConverter$delegate", "Lkotlin/Lazy;", "photoPropertyMapper", "Lexpo/modules/contacts/next/mappers/domain/data/PhotoPropertyMapper;", "getPhotoPropertyMapper", "()Lexpo/modules/contacts/next/mappers/domain/data/PhotoPropertyMapper;", "photoPropertyMapper$delegate", "contactMapper", "Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;", "getContactMapper", "()Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;", "contactMapper$delegate", "contactIntentDelegate", "Lexpo/modules/contacts/next/intents/ContactIntentDelegate;", "contactRepository", "Lexpo/modules/contacts/next/domain/ContactRepository;", "getContactRepository", "()Lexpo/modules/contacts/next/domain/ContactRepository;", "contactRepository$delegate", "contactFactory", "Lexpo/modules/contacts/next/ContactFactory;", "getContactFactory", "()Lexpo/modules/contacts/next/ContactFactory;", "contactFactory$delegate", "permissionsDelegate", "Lexpo/modules/contacts/next/ContactsPermissionsDelegate;", "getPermissionsDelegate", "()Lexpo/modules/contacts/next/ContactsPermissionsDelegate;", "permissionsDelegate$delegate", "observerDelegate", "Lexpo/modules/contacts/next/observers/ContactsObserverDelegate;", "getObserverDelegate", "()Lexpo/modules/contacts/next/observers/ContactsObserverDelegate;", "observerDelegate$delegate", "definition", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ContactsNextModule extends Module {

    /* JADX INFO: renamed from: imageByteArrayConverter$delegate, reason: from kotlin metadata */
    private final Lazy imageByteArrayConverter = AbstractC2746i.b(new InterfaceC3487a() { // from class: expo.modules.contacts.next.a
        @Override // w7.InterfaceC3487a
        public final Object invoke() {
            return ContactsNextModule.imageByteArrayConverter_delegate$lambda$0(this.f26476g);
        }
    });

    /* JADX INFO: renamed from: photoPropertyMapper$delegate, reason: from kotlin metadata */
    private final Lazy photoPropertyMapper = AbstractC2746i.b(new InterfaceC3487a() { // from class: expo.modules.contacts.next.b
        @Override // w7.InterfaceC3487a
        public final Object invoke() {
            return ContactsNextModule.photoPropertyMapper_delegate$lambda$1(this.f26477g);
        }
    });

    /* JADX INFO: renamed from: contactMapper$delegate, reason: from kotlin metadata */
    private final Lazy contactMapper = AbstractC2746i.b(new InterfaceC3487a() { // from class: expo.modules.contacts.next.c
        @Override // w7.InterfaceC3487a
        public final Object invoke() {
            return ContactsNextModule.contactMapper_delegate$lambda$2(this.f26478g);
        }
    });
    private final ContactIntentDelegate contactIntentDelegate = new ContactIntentDelegate();

    /* JADX INFO: renamed from: contactRepository$delegate, reason: from kotlin metadata */
    private final Lazy contactRepository = AbstractC2746i.b(new InterfaceC3487a() { // from class: expo.modules.contacts.next.d
        @Override // w7.InterfaceC3487a
        public final Object invoke() {
            return ContactsNextModule.contactRepository_delegate$lambda$3(this.f26479g);
        }
    });

    /* JADX INFO: renamed from: contactFactory$delegate, reason: from kotlin metadata */
    private final Lazy contactFactory = AbstractC2746i.b(new InterfaceC3487a() { // from class: expo.modules.contacts.next.e
        @Override // w7.InterfaceC3487a
        public final Object invoke() {
            return ContactsNextModule.contactFactory_delegate$lambda$4(this.f26480g);
        }
    });

    /* JADX INFO: renamed from: permissionsDelegate$delegate, reason: from kotlin metadata */
    private final Lazy permissionsDelegate = AbstractC2746i.b(new InterfaceC3487a() { // from class: expo.modules.contacts.next.f
        @Override // w7.InterfaceC3487a
        public final Object invoke() {
            return ContactsNextModule.permissionsDelegate_delegate$lambda$5(this.f26481g);
        }
    });

    /* JADX INFO: renamed from: observerDelegate$delegate, reason: from kotlin metadata */
    private final Lazy observerDelegate = AbstractC2746i.b(new InterfaceC3487a() { // from class: expo.modules.contacts.next.g
        @Override // w7.InterfaceC3487a
        public final Object invoke() {
            return ContactsNextModule.observerDelegate_delegate$lambda$6(this.f26482g);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final ContactFactory contactFactory_delegate$lambda$4(ContactsNextModule contactsNextModule) {
        return new ContactFactory(contactsNextModule.getContactRepository(), contactsNextModule.getContactMapper(), contactsNextModule.getPhotoPropertyMapper(), contactsNextModule.contactIntentDelegate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ContactRecordDomainMapper contactMapper_delegate$lambda$2(ContactsNextModule contactsNextModule) {
        return new ContactRecordDomainMapper(contactsNextModule.getImageByteArrayConverter());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ContactRepository contactRepository_delegate$lambda$3(ContactsNextModule contactsNextModule) {
        ContentResolver contentResolver = contactsNextModule.getContext().getContentResolver();
        AbstractC2855l.f(contentResolver, "getContentResolver(...)");
        return new ContactRepository(contentResolver);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ContactFactory getContactFactory() {
        return (ContactFactory) this.contactFactory.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ContactRecordDomainMapper getContactMapper() {
        return (ContactRecordDomainMapper) this.contactMapper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ContactRepository getContactRepository() {
        return (ContactRepository) this.contactRepository.getValue();
    }

    private final Context getContext() throws Exceptions.ReactContextLost {
        Context reactContext = getAppContext().getReactContext();
        if (reactContext != null) {
            return reactContext;
        }
        throw new Exceptions.ReactContextLost();
    }

    private final ImageByteArrayConverter getImageByteArrayConverter() {
        return (ImageByteArrayConverter) this.imageByteArrayConverter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ContactsObserverDelegate getObserverDelegate() {
        return (ContactsObserverDelegate) this.observerDelegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ContactsPermissionsDelegate getPermissionsDelegate() {
        return (ContactsPermissionsDelegate) this.permissionsDelegate.getValue();
    }

    private final PhotoPropertyMapper getPhotoPropertyMapper() {
        return (PhotoPropertyMapper) this.photoPropertyMapper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageByteArrayConverter imageByteArrayConverter_delegate$lambda$0(ContactsNextModule contactsNextModule) {
        ContentResolver contentResolver = contactsNextModule.getContext().getContentResolver();
        AbstractC2855l.f(contentResolver, "getContentResolver(...)");
        return new ImageByteArrayConverter(contentResolver);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ContactsObserverDelegate observerDelegate_delegate$lambda$6(ContactsNextModule contactsNextModule) {
        return new ContactsObserverDelegate(contactsNextModule.getAppContext(), contactsNextModule);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ContactsPermissionsDelegate permissionsDelegate_delegate$lambda$5(ContactsNextModule contactsNextModule) {
        return new ContactsPermissionsDelegate(contactsNextModule.getAppContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PhotoPropertyMapper photoPropertyMapper_delegate$lambda$1(ContactsNextModule contactsNextModule) {
        return new PhotoPropertyMapper(contactsNextModule.getImageByteArrayConverter());
    }

    /* JADX WARN: Removed duplicated region for block: B:377:0x1c0e A[Catch: all -> 0x00c6, TryCatch #0 {all -> 0x00c6, blocks: (B:3:0x0065, B:5:0x007b, B:7:0x00ab, B:11:0x00d1, B:13:0x00f9, B:15:0x0118, B:17:0x012e, B:18:0x0142, B:20:0x0181, B:21:0x0195, B:23:0x01d7, B:25:0x01ee, B:27:0x0205, B:29:0x0220, B:31:0x0255, B:32:0x0267, B:34:0x029c, B:35:0x02ae, B:37:0x02c3, B:38:0x02d5, B:40:0x030a, B:41:0x031c, B:43:0x0331, B:44:0x0343, B:46:0x0378, B:47:0x038a, B:49:0x03bf, B:50:0x03d1, B:52:0x0406, B:53:0x0418, B:55:0x042d, B:56:0x043f, B:58:0x0474, B:59:0x0486, B:61:0x04bb, B:62:0x04cd, B:64:0x04e2, B:65:0x04f4, B:67:0x0529, B:68:0x053b, B:70:0x0570, B:71:0x0582, B:73:0x0597, B:74:0x05a9, B:76:0x05de, B:77:0x05f0, B:79:0x0625, B:80:0x0637, B:82:0x064c, B:83:0x065e, B:85:0x0693, B:86:0x06a5, B:88:0x06da, B:89:0x06ec, B:91:0x0701, B:92:0x0713, B:94:0x0748, B:95:0x075a, B:97:0x078f, B:98:0x07a1, B:100:0x07b6, B:101:0x07c8, B:103:0x07fd, B:104:0x080f, B:106:0x0844, B:107:0x0856, B:109:0x086b, B:110:0x087d, B:112:0x08b2, B:113:0x08c4, B:115:0x08f9, B:116:0x090b, B:118:0x0920, B:119:0x0932, B:121:0x0967, B:122:0x0979, B:124:0x09ae, B:125:0x09c0, B:127:0x09d5, B:128:0x09e7, B:130:0x0a1c, B:131:0x0a2e, B:133:0x0a63, B:134:0x0a75, B:136:0x0a8a, B:137:0x0a9c, B:139:0x0ad1, B:140:0x0ae3, B:142:0x0b18, B:143:0x0b2a, B:145:0x0b3f, B:146:0x0b51, B:148:0x0b86, B:149:0x0b98, B:151:0x0bcd, B:152:0x0bdf, B:154:0x0bf4, B:155:0x0c06, B:157:0x0c3b, B:158:0x0c4d, B:160:0x0c82, B:161:0x0c94, B:163:0x0ca9, B:164:0x0cbb, B:166:0x0cf0, B:167:0x0d02, B:169:0x0d37, B:170:0x0d49, B:172:0x0d5e, B:173:0x0d70, B:175:0x0da5, B:176:0x0db7, B:178:0x0dec, B:179:0x0dfe, B:181:0x0e13, B:182:0x0e25, B:184:0x0e5a, B:185:0x0e6c, B:187:0x0ea1, B:188:0x0eb3, B:190:0x0ee8, B:191:0x0efa, B:193:0x0f0f, B:194:0x0f21, B:196:0x0f56, B:197:0x0f68, B:199:0x0f7d, B:200:0x0f8f, B:202:0x0fc4, B:203:0x0fd6, B:205:0x0feb, B:206:0x0ffd, B:208:0x1032, B:209:0x1044, B:211:0x1079, B:212:0x108b, B:214:0x10a0, B:215:0x10b2, B:217:0x10e7, B:218:0x10f9, B:220:0x110e, B:221:0x1120, B:223:0x1155, B:224:0x1167, B:226:0x117c, B:227:0x118e, B:229:0x11c3, B:230:0x11d5, B:232:0x120a, B:233:0x121c, B:235:0x1233, B:236:0x1247, B:238:0x127c, B:239:0x128e, B:241:0x12a3, B:242:0x12b5, B:244:0x12ea, B:245:0x12fc, B:247:0x1311, B:248:0x1323, B:250:0x1358, B:251:0x136a, B:253:0x139f, B:254:0x13b1, B:256:0x13c8, B:257:0x13dc, B:259:0x1411, B:260:0x1423, B:262:0x1438, B:263:0x144a, B:265:0x147f, B:266:0x1491, B:268:0x14a6, B:269:0x14b8, B:271:0x14ed, B:272:0x14ff, B:274:0x1534, B:275:0x1546, B:277:0x155d, B:278:0x1571, B:280:0x15a6, B:281:0x15b8, B:283:0x15cd, B:284:0x15df, B:286:0x1614, B:287:0x1626, B:289:0x163b, B:290:0x164d, B:292:0x1682, B:293:0x1694, B:295:0x16c9, B:296:0x16db, B:298:0x16f2, B:299:0x1706, B:301:0x173b, B:302:0x174d, B:304:0x1762, B:305:0x1774, B:307:0x17a9, B:308:0x17bb, B:310:0x17d0, B:311:0x17e2, B:313:0x1817, B:314:0x1829, B:316:0x185e, B:317:0x1870, B:319:0x1887, B:320:0x189b, B:322:0x18d0, B:323:0x18e2, B:325:0x18f7, B:326:0x1909, B:328:0x193e, B:329:0x1950, B:331:0x1965, B:332:0x1977, B:334:0x19ac, B:335:0x19be, B:337:0x19f3, B:338:0x1a05, B:340:0x1a3a, B:341:0x1a4c, B:343:0x1a9c, B:344:0x1aae, B:346:0x1ae3, B:347:0x1af5, B:349:0x1b0a, B:350:0x1b1c, B:352:0x1b6a, B:375:0x1bff, B:377:0x1c0e, B:398:0x1c9e, B:378:0x1c1d, B:380:0x1c36, B:381:0x1c48, B:383:0x1c5b, B:385:0x1c62, B:387:0x1c6a, B:388:0x1c70, B:390:0x1c78, B:391:0x1c7e, B:393:0x1c86, B:394:0x1c8c, B:396:0x1c92, B:397:0x1c98, B:354:0x1b7b, B:356:0x1b94, B:357:0x1ba6, B:359:0x1bb9, B:361:0x1bc0, B:363:0x1bc8, B:364:0x1bce, B:366:0x1bd6, B:367:0x1bdc, B:369:0x1be4, B:370:0x1bea, B:372:0x1bf2, B:374:0x1bf9, B:401:0x1cef, B:402:0x1cf6), top: B:405:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:378:0x1c1d A[Catch: all -> 0x00c6, TryCatch #0 {all -> 0x00c6, blocks: (B:3:0x0065, B:5:0x007b, B:7:0x00ab, B:11:0x00d1, B:13:0x00f9, B:15:0x0118, B:17:0x012e, B:18:0x0142, B:20:0x0181, B:21:0x0195, B:23:0x01d7, B:25:0x01ee, B:27:0x0205, B:29:0x0220, B:31:0x0255, B:32:0x0267, B:34:0x029c, B:35:0x02ae, B:37:0x02c3, B:38:0x02d5, B:40:0x030a, B:41:0x031c, B:43:0x0331, B:44:0x0343, B:46:0x0378, B:47:0x038a, B:49:0x03bf, B:50:0x03d1, B:52:0x0406, B:53:0x0418, B:55:0x042d, B:56:0x043f, B:58:0x0474, B:59:0x0486, B:61:0x04bb, B:62:0x04cd, B:64:0x04e2, B:65:0x04f4, B:67:0x0529, B:68:0x053b, B:70:0x0570, B:71:0x0582, B:73:0x0597, B:74:0x05a9, B:76:0x05de, B:77:0x05f0, B:79:0x0625, B:80:0x0637, B:82:0x064c, B:83:0x065e, B:85:0x0693, B:86:0x06a5, B:88:0x06da, B:89:0x06ec, B:91:0x0701, B:92:0x0713, B:94:0x0748, B:95:0x075a, B:97:0x078f, B:98:0x07a1, B:100:0x07b6, B:101:0x07c8, B:103:0x07fd, B:104:0x080f, B:106:0x0844, B:107:0x0856, B:109:0x086b, B:110:0x087d, B:112:0x08b2, B:113:0x08c4, B:115:0x08f9, B:116:0x090b, B:118:0x0920, B:119:0x0932, B:121:0x0967, B:122:0x0979, B:124:0x09ae, B:125:0x09c0, B:127:0x09d5, B:128:0x09e7, B:130:0x0a1c, B:131:0x0a2e, B:133:0x0a63, B:134:0x0a75, B:136:0x0a8a, B:137:0x0a9c, B:139:0x0ad1, B:140:0x0ae3, B:142:0x0b18, B:143:0x0b2a, B:145:0x0b3f, B:146:0x0b51, B:148:0x0b86, B:149:0x0b98, B:151:0x0bcd, B:152:0x0bdf, B:154:0x0bf4, B:155:0x0c06, B:157:0x0c3b, B:158:0x0c4d, B:160:0x0c82, B:161:0x0c94, B:163:0x0ca9, B:164:0x0cbb, B:166:0x0cf0, B:167:0x0d02, B:169:0x0d37, B:170:0x0d49, B:172:0x0d5e, B:173:0x0d70, B:175:0x0da5, B:176:0x0db7, B:178:0x0dec, B:179:0x0dfe, B:181:0x0e13, B:182:0x0e25, B:184:0x0e5a, B:185:0x0e6c, B:187:0x0ea1, B:188:0x0eb3, B:190:0x0ee8, B:191:0x0efa, B:193:0x0f0f, B:194:0x0f21, B:196:0x0f56, B:197:0x0f68, B:199:0x0f7d, B:200:0x0f8f, B:202:0x0fc4, B:203:0x0fd6, B:205:0x0feb, B:206:0x0ffd, B:208:0x1032, B:209:0x1044, B:211:0x1079, B:212:0x108b, B:214:0x10a0, B:215:0x10b2, B:217:0x10e7, B:218:0x10f9, B:220:0x110e, B:221:0x1120, B:223:0x1155, B:224:0x1167, B:226:0x117c, B:227:0x118e, B:229:0x11c3, B:230:0x11d5, B:232:0x120a, B:233:0x121c, B:235:0x1233, B:236:0x1247, B:238:0x127c, B:239:0x128e, B:241:0x12a3, B:242:0x12b5, B:244:0x12ea, B:245:0x12fc, B:247:0x1311, B:248:0x1323, B:250:0x1358, B:251:0x136a, B:253:0x139f, B:254:0x13b1, B:256:0x13c8, B:257:0x13dc, B:259:0x1411, B:260:0x1423, B:262:0x1438, B:263:0x144a, B:265:0x147f, B:266:0x1491, B:268:0x14a6, B:269:0x14b8, B:271:0x14ed, B:272:0x14ff, B:274:0x1534, B:275:0x1546, B:277:0x155d, B:278:0x1571, B:280:0x15a6, B:281:0x15b8, B:283:0x15cd, B:284:0x15df, B:286:0x1614, B:287:0x1626, B:289:0x163b, B:290:0x164d, B:292:0x1682, B:293:0x1694, B:295:0x16c9, B:296:0x16db, B:298:0x16f2, B:299:0x1706, B:301:0x173b, B:302:0x174d, B:304:0x1762, B:305:0x1774, B:307:0x17a9, B:308:0x17bb, B:310:0x17d0, B:311:0x17e2, B:313:0x1817, B:314:0x1829, B:316:0x185e, B:317:0x1870, B:319:0x1887, B:320:0x189b, B:322:0x18d0, B:323:0x18e2, B:325:0x18f7, B:326:0x1909, B:328:0x193e, B:329:0x1950, B:331:0x1965, B:332:0x1977, B:334:0x19ac, B:335:0x19be, B:337:0x19f3, B:338:0x1a05, B:340:0x1a3a, B:341:0x1a4c, B:343:0x1a9c, B:344:0x1aae, B:346:0x1ae3, B:347:0x1af5, B:349:0x1b0a, B:350:0x1b1c, B:352:0x1b6a, B:375:0x1bff, B:377:0x1c0e, B:398:0x1c9e, B:378:0x1c1d, B:380:0x1c36, B:381:0x1c48, B:383:0x1c5b, B:385:0x1c62, B:387:0x1c6a, B:388:0x1c70, B:390:0x1c78, B:391:0x1c7e, B:393:0x1c86, B:394:0x1c8c, B:396:0x1c92, B:397:0x1c98, B:354:0x1b7b, B:356:0x1b94, B:357:0x1ba6, B:359:0x1bb9, B:361:0x1bc0, B:363:0x1bc8, B:364:0x1bce, B:366:0x1bd6, B:367:0x1bdc, B:369:0x1be4, B:370:0x1bea, B:372:0x1bf2, B:374:0x1bf9, B:401:0x1cef, B:402:0x1cf6), top: B:405:0x0065 }] */
    @Override // expo.modules.kotlin.modules.Module
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ModuleDefinitionData definition() {
        Class cls;
        Class cls2;
        Class cls3;
        AnyType anyType;
        Class cls4;
        Class cls5;
        Class cls6;
        String str;
        Class cls7;
        ModuleDefinitionBuilder moduleDefinitionBuilder;
        Class cls8;
        AsyncFunctionComponent stringAsyncFunctionComponent;
        AsyncFunctionComponent floatAsyncFunctionComponent;
        AsyncFunctionComponent intAsyncFunctionComponent;
        AbstractC2861a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder2 = new ModuleDefinitionBuilder(this);
            moduleDefinitionBuilder2.Name("ExpoContactsNext");
            C7.d dVarB = D.b(Contact.class);
            Module module = moduleDefinitionBuilder2.getModule();
            if (module == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            AppContext appContext = module.getAppContext();
            String simpleName = AbstractC3430a.b(dVarB).getSimpleName();
            AbstractC2855l.f(simpleName, "getSimpleName(...)");
            AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
            C7.d dVarB2 = D.b(Contact.class);
            Boolean bool = Boolean.FALSE;
            AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB2, bool));
            if (anyType2 == null) {
                cls = RelationRecord.Existing.class;
                cls2 = ExtraNameRecord.Existing.class;
                cls3 = DateRecord.Existing.class;
                anyType = new AnyType(new LazyKType(D.b(Contact.class), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$$inlined$Class$1
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Contact.class);
                    }
                }), null);
            } else {
                cls = RelationRecord.Existing.class;
                cls2 = ExtraNameRecord.Existing.class;
                cls3 = DateRecord.Existing.class;
                anyType = anyType2;
            }
            ClassComponentBuilder classComponentBuilder = new ClassComponentBuilder(appContext, simpleName, dVarB, anyType, moduleDefinitionBuilder2.getConverters());
            TypeConverterProvider converters = classComponentBuilder.getConverters();
            AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(D.b(String.class), bool));
            if (anyType3 == null) {
                cls4 = PhoneRecord.Existing.class;
                cls5 = EmailRecord.Existing.class;
                cls6 = Set.class;
                anyType3 = new AnyType(new LazyKType(D.b(String.class), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Constructor$1
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(String.class);
                    }
                }), converters);
            } else {
                cls4 = PhoneRecord.Existing.class;
                cls5 = EmailRecord.Existing.class;
                cls6 = Set.class;
            }
            AnyType[] anyTypeArr = {anyType3};
            ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
            ReturnType returnType = returnTypeProvider.getTypes().get(D.b(Object.class));
            if (returnType == null) {
                returnType = new ReturnType(D.b(Object.class));
                returnTypeProvider.getTypes().put(D.b(Object.class), returnType);
            }
            classComponentBuilder.setConstructor(new SyncFunctionComponent("constructor", anyTypeArr, returnType, new Function1() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Constructor$2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] objArr) {
                    AbstractC2855l.g(objArr, "<destruct>");
                    return this.this$0.getContactFactory().create((String) objArr[0]);
                }
            }));
            PropertyComponentBuilderWithThis propertyComponentBuilderWithThis = new PropertyComponentBuilderWithThis(classComponentBuilder.getOwnerType().getKType(), "id");
            AnyType[] anyTypeArr2 = {new AnyType(propertyComponentBuilderWithThis.getThisType(), null, 2, null)};
            ReturnType returnType2 = returnTypeProvider.getTypes().get(D.b(String.class));
            if (returnType2 == null) {
                returnType2 = new ReturnType(D.b(String.class));
                returnTypeProvider.getTypes().put(D.b(String.class), returnType2);
            }
            SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent("get", anyTypeArr2, returnType2, new Function1() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Property$1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] it) {
                    AbstractC2855l.g(it, "it");
                    return ((Contact) it[0]).getContactId();
                }
            });
            syncFunctionComponent.setOwnerType(propertyComponentBuilderWithThis.getThisType());
            syncFunctionComponent.setCanTakeOwner(true);
            propertyComponentBuilderWithThis.setGetter(syncFunctionComponent);
            classComponentBuilder.getProperties().put("id", propertyComponentBuilderWithThis);
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction = classComponentBuilder.AsyncFunction("getDetails");
            String name = asyncFunctionBuilderAsyncFunction.getName();
            TypeConverterProvider converters2 = asyncFunctionBuilderAsyncFunction.getConverters();
            AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Contact.class), bool));
            if (anyType4 == null) {
                str = "onContactsChange";
                anyType4 = new AnyType(new LazyKType(D.b(Contact.class), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$1
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Contact.class);
                    }
                }), converters2);
            } else {
                str = "onContactsChange";
            }
            C7.d dVarB3 = D.b(cls6);
            Boolean bool2 = Boolean.TRUE;
            AnyType anyType5 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, bool2));
            if (anyType5 == null) {
                moduleDefinitionBuilder = moduleDefinitionBuilder2;
                cls7 = String.class;
                anyType5 = new AnyType(new LazyKType(D.b(cls6), true, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$2
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.g(Set.class, q.f518c.d(D.o(ContactField.class)));
                    }
                }), converters2);
            } else {
                cls7 = String.class;
                moduleDefinitionBuilder = moduleDefinitionBuilder2;
            }
            asyncFunctionBuilderAsyncFunction.setAsyncFunctionComponent(new SuspendFunctionComponent(name, new AnyType[]{anyType4, anyType5}, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$3(null)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction2 = classComponentBuilder.AsyncFunction("delete");
            String name2 = asyncFunctionBuilderAsyncFunction2.getName();
            TypeConverterProvider converters3 = asyncFunctionBuilderAsyncFunction2.getConverters();
            AnyType anyType6 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Contact.class), bool));
            if (anyType6 == null) {
                anyType6 = new AnyType(new LazyKType(D.b(Contact.class), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$4
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Contact.class);
                    }
                }), converters3);
            }
            asyncFunctionBuilderAsyncFunction2.setAsyncFunctionComponent(new SuspendFunctionComponent(name2, new AnyType[]{anyType6}, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$5(null)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction3 = classComponentBuilder.AsyncFunction("patch");
            String name3 = asyncFunctionBuilderAsyncFunction3.getName();
            TypeConverterProvider converters4 = asyncFunctionBuilderAsyncFunction3.getConverters();
            AnyType anyType7 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Contact.class), bool));
            if (anyType7 == null) {
                anyType7 = new AnyType(new LazyKType(D.b(Contact.class), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$6
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Contact.class);
                    }
                }), converters4);
            }
            AnyType anyType8 = anyTypeProvider.getTypesMap().get(new Pair(D.b(PatchContactRecord.class), bool));
            if (anyType8 == null) {
                anyType8 = new AnyType(new LazyKType(D.b(PatchContactRecord.class), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$7
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(PatchContactRecord.class);
                    }
                }), converters4);
            }
            asyncFunctionBuilderAsyncFunction3.setAsyncFunctionComponent(new SuspendFunctionComponent(name3, new AnyType[]{anyType7, anyType8}, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$8(null)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction4 = classComponentBuilder.AsyncFunction("update");
            String name4 = asyncFunctionBuilderAsyncFunction4.getName();
            TypeConverterProvider converters5 = asyncFunctionBuilderAsyncFunction4.getConverters();
            AnyType anyType9 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Contact.class), bool));
            if (anyType9 == null) {
                anyType9 = new AnyType(new LazyKType(D.b(Contact.class), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$9
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Contact.class);
                    }
                }), converters5);
            }
            AnyType anyType10 = anyTypeProvider.getTypesMap().get(new Pair(D.b(CreateContactRecord.class), bool));
            if (anyType10 == null) {
                anyType10 = new AnyType(new LazyKType(D.b(CreateContactRecord.class), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$10
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(CreateContactRecord.class);
                    }
                }), converters5);
            }
            asyncFunctionBuilderAsyncFunction4.setAsyncFunctionComponent(new SuspendFunctionComponent(name4, new AnyType[]{anyType9, anyType10}, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$11(null)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction5 = classComponentBuilder.AsyncFunction("getFullName");
            String name5 = asyncFunctionBuilderAsyncFunction5.getName();
            TypeConverterProvider converters6 = asyncFunctionBuilderAsyncFunction5.getConverters();
            AnyType anyType11 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Contact.class), bool));
            if (anyType11 == null) {
                anyType11 = new AnyType(new LazyKType(D.b(Contact.class), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$12
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Contact.class);
                    }
                }), converters6);
            }
            asyncFunctionBuilderAsyncFunction5.setAsyncFunctionComponent(new SuspendFunctionComponent(name5, new AnyType[]{anyType11}, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$13(null)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction6 = classComponentBuilder.AsyncFunction("getGivenName");
            String name6 = asyncFunctionBuilderAsyncFunction6.getName();
            TypeConverterProvider converters7 = asyncFunctionBuilderAsyncFunction6.getConverters();
            AnyType anyType12 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Contact.class), bool));
            if (anyType12 == null) {
                anyType12 = new AnyType(new LazyKType(D.b(Contact.class), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$14
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Contact.class);
                    }
                }), converters7);
            }
            asyncFunctionBuilderAsyncFunction6.setAsyncFunctionComponent(new SuspendFunctionComponent(name6, new AnyType[]{anyType12}, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$15(null)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction7 = classComponentBuilder.AsyncFunction("setGivenName");
            String name7 = asyncFunctionBuilderAsyncFunction7.getName();
            TypeConverterProvider converters8 = asyncFunctionBuilderAsyncFunction7.getConverters();
            AnyType anyType13 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Contact.class), bool));
            if (anyType13 == null) {
                anyType13 = new AnyType(new LazyKType(D.b(Contact.class), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$16
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Contact.class);
                    }
                }), converters8);
            }
            AnyType anyType14 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls7), bool2));
            if (anyType14 == null) {
                anyType14 = new AnyType(new LazyKType(D.b(cls7), true, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$17
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.f(String.class);
                    }
                }), converters8);
            }
            asyncFunctionBuilderAsyncFunction7.setAsyncFunctionComponent(new SuspendFunctionComponent(name7, new AnyType[]{anyType13, anyType14}, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$18(null)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction8 = classComponentBuilder.AsyncFunction("getFamilyName");
            String name8 = asyncFunctionBuilderAsyncFunction8.getName();
            TypeConverterProvider converters9 = asyncFunctionBuilderAsyncFunction8.getConverters();
            AnyType anyType15 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Contact.class), bool));
            if (anyType15 == null) {
                anyType15 = new AnyType(new LazyKType(D.b(Contact.class), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$19
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Contact.class);
                    }
                }), converters9);
            }
            asyncFunctionBuilderAsyncFunction8.setAsyncFunctionComponent(new SuspendFunctionComponent(name8, new AnyType[]{anyType15}, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$20(null)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction9 = classComponentBuilder.AsyncFunction("setFamilyName");
            String name9 = asyncFunctionBuilderAsyncFunction9.getName();
            TypeConverterProvider converters10 = asyncFunctionBuilderAsyncFunction9.getConverters();
            AnyType anyType16 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Contact.class), bool));
            if (anyType16 == null) {
                anyType16 = new AnyType(new LazyKType(D.b(Contact.class), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$21
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Contact.class);
                    }
                }), converters10);
            }
            AnyType anyType17 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls7), bool2));
            if (anyType17 == null) {
                anyType17 = new AnyType(new LazyKType(D.b(cls7), true, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$22
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.f(String.class);
                    }
                }), converters10);
            }
            asyncFunctionBuilderAsyncFunction9.setAsyncFunctionComponent(new SuspendFunctionComponent(name9, new AnyType[]{anyType16, anyType17}, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$23(null)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction10 = classComponentBuilder.AsyncFunction("getMiddleName");
            String name10 = asyncFunctionBuilderAsyncFunction10.getName();
            TypeConverterProvider converters11 = asyncFunctionBuilderAsyncFunction10.getConverters();
            AnyType anyType18 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Contact.class), bool));
            if (anyType18 == null) {
                anyType18 = new AnyType(new LazyKType(D.b(Contact.class), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$24
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Contact.class);
                    }
                }), converters11);
            }
            asyncFunctionBuilderAsyncFunction10.setAsyncFunctionComponent(new SuspendFunctionComponent(name10, new AnyType[]{anyType18}, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$25(null)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction11 = classComponentBuilder.AsyncFunction("setMiddleName");
            String name11 = asyncFunctionBuilderAsyncFunction11.getName();
            TypeConverterProvider converters12 = asyncFunctionBuilderAsyncFunction11.getConverters();
            AnyType anyType19 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Contact.class), bool));
            if (anyType19 == null) {
                anyType19 = new AnyType(new LazyKType(D.b(Contact.class), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$26
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Contact.class);
                    }
                }), converters12);
            }
            AnyType anyType20 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls7), bool2));
            if (anyType20 == null) {
                anyType20 = new AnyType(new LazyKType(D.b(cls7), true, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$27
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.f(String.class);
                    }
                }), converters12);
            }
            asyncFunctionBuilderAsyncFunction11.setAsyncFunctionComponent(new SuspendFunctionComponent(name11, new AnyType[]{anyType19, anyType20}, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$28(null)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction12 = classComponentBuilder.AsyncFunction("getPrefix");
            String name12 = asyncFunctionBuilderAsyncFunction12.getName();
            TypeConverterProvider converters13 = asyncFunctionBuilderAsyncFunction12.getConverters();
            AnyType anyType21 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Contact.class), bool));
            if (anyType21 == null) {
                anyType21 = new AnyType(new LazyKType(D.b(Contact.class), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$29
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Contact.class);
                    }
                }), converters13);
            }
            asyncFunctionBuilderAsyncFunction12.setAsyncFunctionComponent(new SuspendFunctionComponent(name12, new AnyType[]{anyType21}, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$30(null)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction13 = classComponentBuilder.AsyncFunction("setPrefix");
            String name13 = asyncFunctionBuilderAsyncFunction13.getName();
            TypeConverterProvider converters14 = asyncFunctionBuilderAsyncFunction13.getConverters();
            AnyType anyType22 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Contact.class), bool));
            if (anyType22 == null) {
                anyType22 = new AnyType(new LazyKType(D.b(Contact.class), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$31
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Contact.class);
                    }
                }), converters14);
            }
            AnyType anyType23 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls7), bool2));
            if (anyType23 == null) {
                anyType23 = new AnyType(new LazyKType(D.b(cls7), true, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$32
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.f(String.class);
                    }
                }), converters14);
            }
            asyncFunctionBuilderAsyncFunction13.setAsyncFunctionComponent(new SuspendFunctionComponent(name13, new AnyType[]{anyType22, anyType23}, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$33(null)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction14 = classComponentBuilder.AsyncFunction("getSuffix");
            String name14 = asyncFunctionBuilderAsyncFunction14.getName();
            TypeConverterProvider converters15 = asyncFunctionBuilderAsyncFunction14.getConverters();
            AnyType anyType24 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Contact.class), bool));
            if (anyType24 == null) {
                anyType24 = new AnyType(new LazyKType(D.b(Contact.class), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$34
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Contact.class);
                    }
                }), converters15);
            }
            asyncFunctionBuilderAsyncFunction14.setAsyncFunctionComponent(new SuspendFunctionComponent(name14, new AnyType[]{anyType24}, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$35(null)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction15 = classComponentBuilder.AsyncFunction("setSuffix");
            String name15 = asyncFunctionBuilderAsyncFunction15.getName();
            TypeConverterProvider converters16 = asyncFunctionBuilderAsyncFunction15.getConverters();
            AnyType anyType25 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Contact.class), bool));
            if (anyType25 == null) {
                anyType25 = new AnyType(new LazyKType(D.b(Contact.class), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$36
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Contact.class);
                    }
                }), converters16);
            }
            AnyType anyType26 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls7), bool2));
            if (anyType26 == null) {
                anyType26 = new AnyType(new LazyKType(D.b(cls7), true, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$37
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.f(String.class);
                    }
                }), converters16);
            }
            asyncFunctionBuilderAsyncFunction15.setAsyncFunctionComponent(new SuspendFunctionComponent(name15, new AnyType[]{anyType25, anyType26}, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$38(null)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction16 = classComponentBuilder.AsyncFunction("getPhoneticGivenName");
            String name16 = asyncFunctionBuilderAsyncFunction16.getName();
            TypeConverterProvider converters17 = asyncFunctionBuilderAsyncFunction16.getConverters();
            AnyType anyType27 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Contact.class), bool));
            if (anyType27 == null) {
                anyType27 = new AnyType(new LazyKType(D.b(Contact.class), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$39
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Contact.class);
                    }
                }), converters17);
            }
            asyncFunctionBuilderAsyncFunction16.setAsyncFunctionComponent(new SuspendFunctionComponent(name16, new AnyType[]{anyType27}, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$40(null)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction17 = classComponentBuilder.AsyncFunction("setPhoneticGivenName");
            String name17 = asyncFunctionBuilderAsyncFunction17.getName();
            TypeConverterProvider converters18 = asyncFunctionBuilderAsyncFunction17.getConverters();
            AnyType anyType28 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Contact.class), bool));
            if (anyType28 == null) {
                anyType28 = new AnyType(new LazyKType(D.b(Contact.class), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$41
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Contact.class);
                    }
                }), converters18);
            }
            AnyType anyType29 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls7), bool2));
            if (anyType29 == null) {
                anyType29 = new AnyType(new LazyKType(D.b(cls7), true, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$42
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.f(String.class);
                    }
                }), converters18);
            }
            asyncFunctionBuilderAsyncFunction17.setAsyncFunctionComponent(new SuspendFunctionComponent(name17, new AnyType[]{anyType28, anyType29}, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$43(null)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction18 = classComponentBuilder.AsyncFunction("getPhoneticMiddleName");
            String name18 = asyncFunctionBuilderAsyncFunction18.getName();
            TypeConverterProvider converters19 = asyncFunctionBuilderAsyncFunction18.getConverters();
            AnyType anyType30 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Contact.class), bool));
            if (anyType30 == null) {
                anyType30 = new AnyType(new LazyKType(D.b(Contact.class), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$44
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Contact.class);
                    }
                }), converters19);
            }
            asyncFunctionBuilderAsyncFunction18.setAsyncFunctionComponent(new SuspendFunctionComponent(name18, new AnyType[]{anyType30}, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$45(null)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction19 = classComponentBuilder.AsyncFunction("setPhoneticMiddleName");
            String name19 = asyncFunctionBuilderAsyncFunction19.getName();
            TypeConverterProvider converters20 = asyncFunctionBuilderAsyncFunction19.getConverters();
            AnyType anyType31 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Contact.class), bool));
            if (anyType31 == null) {
                anyType31 = new AnyType(new LazyKType(D.b(Contact.class), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$46
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Contact.class);
                    }
                }), converters20);
            }
            AnyType anyType32 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls7), bool2));
            if (anyType32 == null) {
                anyType32 = new AnyType(new LazyKType(D.b(cls7), true, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$47
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.f(String.class);
                    }
                }), converters20);
            }
            asyncFunctionBuilderAsyncFunction19.setAsyncFunctionComponent(new SuspendFunctionComponent(name19, new AnyType[]{anyType31, anyType32}, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$48(null)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction20 = classComponentBuilder.AsyncFunction("getPhoneticFamilyName");
            String name20 = asyncFunctionBuilderAsyncFunction20.getName();
            TypeConverterProvider converters21 = asyncFunctionBuilderAsyncFunction20.getConverters();
            AnyType anyType33 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Contact.class), bool));
            if (anyType33 == null) {
                anyType33 = new AnyType(new LazyKType(D.b(Contact.class), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$49
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Contact.class);
                    }
                }), converters21);
            }
            asyncFunctionBuilderAsyncFunction20.setAsyncFunctionComponent(new SuspendFunctionComponent(name20, new AnyType[]{anyType33}, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$50(null)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction21 = classComponentBuilder.AsyncFunction("setPhoneticFamilyName");
            String name21 = asyncFunctionBuilderAsyncFunction21.getName();
            TypeConverterProvider converters22 = asyncFunctionBuilderAsyncFunction21.getConverters();
            AnyType anyType34 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Contact.class), bool));
            if (anyType34 == null) {
                anyType34 = new AnyType(new LazyKType(D.b(Contact.class), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$51
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Contact.class);
                    }
                }), converters22);
            }
            AnyType anyType35 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls7), bool2));
            if (anyType35 == null) {
                anyType35 = new AnyType(new LazyKType(D.b(cls7), true, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$52
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.f(String.class);
                    }
                }), converters22);
            }
            asyncFunctionBuilderAsyncFunction21.setAsyncFunctionComponent(new SuspendFunctionComponent(name21, new AnyType[]{anyType34, anyType35}, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$53(null)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction22 = classComponentBuilder.AsyncFunction("getCompany");
            String name22 = asyncFunctionBuilderAsyncFunction22.getName();
            TypeConverterProvider converters23 = asyncFunctionBuilderAsyncFunction22.getConverters();
            AnyType anyType36 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Contact.class), bool));
            if (anyType36 == null) {
                anyType36 = new AnyType(new LazyKType(D.b(Contact.class), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$54
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Contact.class);
                    }
                }), converters23);
            }
            asyncFunctionBuilderAsyncFunction22.setAsyncFunctionComponent(new SuspendFunctionComponent(name22, new AnyType[]{anyType36}, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$55(null)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction23 = classComponentBuilder.AsyncFunction("setCompany");
            String name23 = asyncFunctionBuilderAsyncFunction23.getName();
            TypeConverterProvider converters24 = asyncFunctionBuilderAsyncFunction23.getConverters();
            AnyType anyType37 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Contact.class), bool));
            if (anyType37 == null) {
                anyType37 = new AnyType(new LazyKType(D.b(Contact.class), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$56
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Contact.class);
                    }
                }), converters24);
            }
            AnyType anyType38 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls7), bool2));
            if (anyType38 == null) {
                anyType38 = new AnyType(new LazyKType(D.b(cls7), true, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$57
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.f(String.class);
                    }
                }), converters24);
            }
            asyncFunctionBuilderAsyncFunction23.setAsyncFunctionComponent(new SuspendFunctionComponent(name23, new AnyType[]{anyType37, anyType38}, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$58(null)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction24 = classComponentBuilder.AsyncFunction("getDepartment");
            String name24 = asyncFunctionBuilderAsyncFunction24.getName();
            TypeConverterProvider converters25 = asyncFunctionBuilderAsyncFunction24.getConverters();
            AnyType anyType39 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Contact.class), bool));
            if (anyType39 == null) {
                anyType39 = new AnyType(new LazyKType(D.b(Contact.class), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$59
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Contact.class);
                    }
                }), converters25);
            }
            asyncFunctionBuilderAsyncFunction24.setAsyncFunctionComponent(new SuspendFunctionComponent(name24, new AnyType[]{anyType39}, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$60(null)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction25 = classComponentBuilder.AsyncFunction("setDepartment");
            String name25 = asyncFunctionBuilderAsyncFunction25.getName();
            TypeConverterProvider converters26 = asyncFunctionBuilderAsyncFunction25.getConverters();
            AnyType anyType40 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Contact.class), bool));
            if (anyType40 == null) {
                anyType40 = new AnyType(new LazyKType(D.b(Contact.class), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$61
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Contact.class);
                    }
                }), converters26);
            }
            AnyType anyType41 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls7), bool2));
            if (anyType41 == null) {
                anyType41 = new AnyType(new LazyKType(D.b(cls7), true, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$62
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.f(String.class);
                    }
                }), converters26);
            }
            asyncFunctionBuilderAsyncFunction25.setAsyncFunctionComponent(new SuspendFunctionComponent(name25, new AnyType[]{anyType40, anyType41}, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$63(null)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction26 = classComponentBuilder.AsyncFunction("getJobTitle");
            String name26 = asyncFunctionBuilderAsyncFunction26.getName();
            TypeConverterProvider converters27 = asyncFunctionBuilderAsyncFunction26.getConverters();
            AnyType anyType42 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Contact.class), bool));
            if (anyType42 == null) {
                anyType42 = new AnyType(new LazyKType(D.b(Contact.class), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$64
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Contact.class);
                    }
                }), converters27);
            }
            asyncFunctionBuilderAsyncFunction26.setAsyncFunctionComponent(new SuspendFunctionComponent(name26, new AnyType[]{anyType42}, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$65(null)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction27 = classComponentBuilder.AsyncFunction("setJobTitle");
            String name27 = asyncFunctionBuilderAsyncFunction27.getName();
            TypeConverterProvider converters28 = asyncFunctionBuilderAsyncFunction27.getConverters();
            AnyType anyType43 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Contact.class), bool));
            if (anyType43 == null) {
                anyType43 = new AnyType(new LazyKType(D.b(Contact.class), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$66
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Contact.class);
                    }
                }), converters28);
            }
            AnyType anyType44 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls7), bool2));
            if (anyType44 == null) {
                anyType44 = new AnyType(new LazyKType(D.b(cls7), true, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$67
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.f(String.class);
                    }
                }), converters28);
            }
            asyncFunctionBuilderAsyncFunction27.setAsyncFunctionComponent(new SuspendFunctionComponent(name27, new AnyType[]{anyType43, anyType44}, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$68(null)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction28 = classComponentBuilder.AsyncFunction("getPhoneticCompanyName");
            String name28 = asyncFunctionBuilderAsyncFunction28.getName();
            TypeConverterProvider converters29 = asyncFunctionBuilderAsyncFunction28.getConverters();
            AnyType anyType45 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Contact.class), bool));
            if (anyType45 == null) {
                anyType45 = new AnyType(new LazyKType(D.b(Contact.class), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$69
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Contact.class);
                    }
                }), converters29);
            }
            asyncFunctionBuilderAsyncFunction28.setAsyncFunctionComponent(new SuspendFunctionComponent(name28, new AnyType[]{anyType45}, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$70(null)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction29 = classComponentBuilder.AsyncFunction("setPhoneticCompanyName");
            String name29 = asyncFunctionBuilderAsyncFunction29.getName();
            TypeConverterProvider converters30 = asyncFunctionBuilderAsyncFunction29.getConverters();
            AnyType anyType46 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Contact.class), bool));
            if (anyType46 == null) {
                anyType46 = new AnyType(new LazyKType(D.b(Contact.class), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$71
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Contact.class);
                    }
                }), converters30);
            }
            AnyType anyType47 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls7), bool2));
            if (anyType47 == null) {
                anyType47 = new AnyType(new LazyKType(D.b(cls7), true, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$72
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.f(String.class);
                    }
                }), converters30);
            }
            asyncFunctionBuilderAsyncFunction29.setAsyncFunctionComponent(new SuspendFunctionComponent(name29, new AnyType[]{anyType46, anyType47}, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$73(null)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction30 = classComponentBuilder.AsyncFunction("getNote");
            String name30 = asyncFunctionBuilderAsyncFunction30.getName();
            TypeConverterProvider converters31 = asyncFunctionBuilderAsyncFunction30.getConverters();
            AnyType anyType48 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Contact.class), bool));
            if (anyType48 == null) {
                anyType48 = new AnyType(new LazyKType(D.b(Contact.class), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$74
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Contact.class);
                    }
                }), converters31);
            }
            asyncFunctionBuilderAsyncFunction30.setAsyncFunctionComponent(new SuspendFunctionComponent(name30, new AnyType[]{anyType48}, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$75(null)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction31 = classComponentBuilder.AsyncFunction("setNote");
            String name31 = asyncFunctionBuilderAsyncFunction31.getName();
            TypeConverterProvider converters32 = asyncFunctionBuilderAsyncFunction31.getConverters();
            AnyType anyType49 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Contact.class), bool));
            if (anyType49 == null) {
                anyType49 = new AnyType(new LazyKType(D.b(Contact.class), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$76
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Contact.class);
                    }
                }), converters32);
            }
            AnyType anyType50 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls7), bool2));
            if (anyType50 == null) {
                anyType50 = new AnyType(new LazyKType(D.b(cls7), true, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$77
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.f(String.class);
                    }
                }), converters32);
            }
            asyncFunctionBuilderAsyncFunction31.setAsyncFunctionComponent(new SuspendFunctionComponent(name31, new AnyType[]{anyType49, anyType50}, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$78(null)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction32 = classComponentBuilder.AsyncFunction("getImage");
            String name32 = asyncFunctionBuilderAsyncFunction32.getName();
            TypeConverterProvider converters33 = asyncFunctionBuilderAsyncFunction32.getConverters();
            AnyType anyType51 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Contact.class), bool));
            if (anyType51 == null) {
                anyType51 = new AnyType(new LazyKType(D.b(Contact.class), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$79
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Contact.class);
                    }
                }), converters33);
            }
            asyncFunctionBuilderAsyncFunction32.setAsyncFunctionComponent(new SuspendFunctionComponent(name32, new AnyType[]{anyType51}, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$80(null)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction33 = classComponentBuilder.AsyncFunction("setImage");
            String name33 = asyncFunctionBuilderAsyncFunction33.getName();
            TypeConverterProvider converters34 = asyncFunctionBuilderAsyncFunction33.getConverters();
            AnyType anyType52 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Contact.class), bool));
            if (anyType52 == null) {
                anyType52 = new AnyType(new LazyKType(D.b(Contact.class), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$81
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Contact.class);
                    }
                }), converters34);
            }
            AnyType anyType53 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls7), bool2));
            if (anyType53 == null) {
                anyType53 = new AnyType(new LazyKType(D.b(cls7), true, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$82
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.f(String.class);
                    }
                }), converters34);
            }
            asyncFunctionBuilderAsyncFunction33.setAsyncFunctionComponent(new SuspendFunctionComponent(name33, new AnyType[]{anyType52, anyType53}, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$83(null)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction34 = classComponentBuilder.AsyncFunction("getThumbnail");
            String name34 = asyncFunctionBuilderAsyncFunction34.getName();
            TypeConverterProvider converters35 = asyncFunctionBuilderAsyncFunction34.getConverters();
            AnyType anyType54 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Contact.class), bool));
            if (anyType54 == null) {
                anyType54 = new AnyType(new LazyKType(D.b(Contact.class), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$84
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Contact.class);
                    }
                }), converters35);
            }
            asyncFunctionBuilderAsyncFunction34.setAsyncFunctionComponent(new SuspendFunctionComponent(name34, new AnyType[]{anyType54}, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$85(null)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction35 = classComponentBuilder.AsyncFunction("setIsFavourite");
            String name35 = asyncFunctionBuilderAsyncFunction35.getName();
            TypeConverterProvider converters36 = asyncFunctionBuilderAsyncFunction35.getConverters();
            AnyType anyType55 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Contact.class), bool));
            if (anyType55 == null) {
                anyType55 = new AnyType(new LazyKType(D.b(Contact.class), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$86
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Contact.class);
                    }
                }), converters36);
            }
            AnyType anyType56 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Boolean.class), bool));
            if (anyType56 == null) {
                anyType56 = new AnyType(new LazyKType(D.b(Boolean.class), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$87
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Boolean.TYPE);
                    }
                }), converters36);
            }
            asyncFunctionBuilderAsyncFunction35.setAsyncFunctionComponent(new SuspendFunctionComponent(name35, new AnyType[]{anyType55, anyType56}, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$88(null)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction36 = classComponentBuilder.AsyncFunction("getIsFavourite");
            String name36 = asyncFunctionBuilderAsyncFunction36.getName();
            TypeConverterProvider converters37 = asyncFunctionBuilderAsyncFunction36.getConverters();
            AnyType anyType57 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Contact.class), bool));
            if (anyType57 == null) {
                anyType57 = new AnyType(new LazyKType(D.b(Contact.class), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$89
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Contact.class);
                    }
                }), converters37);
            }
            asyncFunctionBuilderAsyncFunction36.setAsyncFunctionComponent(new SuspendFunctionComponent(name36, new AnyType[]{anyType57}, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$90(null)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction37 = classComponentBuilder.AsyncFunction("getEmails");
            String name37 = asyncFunctionBuilderAsyncFunction37.getName();
            TypeConverterProvider converters38 = asyncFunctionBuilderAsyncFunction37.getConverters();
            AnyType anyType58 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Contact.class), bool));
            if (anyType58 == null) {
                anyType58 = new AnyType(new LazyKType(D.b(Contact.class), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$91
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Contact.class);
                    }
                }), converters38);
            }
            asyncFunctionBuilderAsyncFunction37.setAsyncFunctionComponent(new SuspendFunctionComponent(name37, new AnyType[]{anyType58}, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$92(null)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction38 = classComponentBuilder.AsyncFunction("addEmail");
            String name38 = asyncFunctionBuilderAsyncFunction38.getName();
            TypeConverterProvider converters39 = asyncFunctionBuilderAsyncFunction38.getConverters();
            AnyType anyType59 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Contact.class), bool));
            if (anyType59 == null) {
                anyType59 = new AnyType(new LazyKType(D.b(Contact.class), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$93
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Contact.class);
                    }
                }), converters39);
            }
            AnyType anyType60 = anyTypeProvider.getTypesMap().get(new Pair(D.b(EmailRecord.New.class), bool));
            if (anyType60 == null) {
                anyType60 = new AnyType(new LazyKType(D.b(EmailRecord.New.class), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$94
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(EmailRecord.New.class);
                    }
                }), converters39);
            }
            asyncFunctionBuilderAsyncFunction38.setAsyncFunctionComponent(new SuspendFunctionComponent(name38, new AnyType[]{anyType59, anyType60}, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$95(null)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction39 = classComponentBuilder.AsyncFunction("updateEmail");
            String name39 = asyncFunctionBuilderAsyncFunction39.getName();
            TypeConverterProvider converters40 = asyncFunctionBuilderAsyncFunction39.getConverters();
            AnyType anyType61 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Contact.class), bool));
            if (anyType61 == null) {
                anyType61 = new AnyType(new LazyKType(D.b(Contact.class), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$96
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Contact.class);
                    }
                }), converters40);
            }
            AnyType anyType62 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls5), bool));
            if (anyType62 == null) {
                anyType62 = new AnyType(new LazyKType(D.b(cls5), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$97
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(EmailRecord.Existing.class);
                    }
                }), converters40);
            }
            asyncFunctionBuilderAsyncFunction39.setAsyncFunctionComponent(new SuspendFunctionComponent(name39, new AnyType[]{anyType61, anyType62}, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$98(null)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction40 = classComponentBuilder.AsyncFunction("deleteEmail");
            String name40 = asyncFunctionBuilderAsyncFunction40.getName();
            TypeConverterProvider converters41 = asyncFunctionBuilderAsyncFunction40.getConverters();
            AnyType anyType63 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Contact.class), bool));
            if (anyType63 == null) {
                anyType63 = new AnyType(new LazyKType(D.b(Contact.class), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$99
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Contact.class);
                    }
                }), converters41);
            }
            AnyType anyType64 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls5), bool));
            if (anyType64 == null) {
                anyType64 = new AnyType(new LazyKType(D.b(cls5), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$100
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(EmailRecord.Existing.class);
                    }
                }), converters41);
            }
            asyncFunctionBuilderAsyncFunction40.setAsyncFunctionComponent(new SuspendFunctionComponent(name40, new AnyType[]{anyType63, anyType64}, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$101(null)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction41 = classComponentBuilder.AsyncFunction("getPhones");
            String name41 = asyncFunctionBuilderAsyncFunction41.getName();
            TypeConverterProvider converters42 = asyncFunctionBuilderAsyncFunction41.getConverters();
            AnyType anyType65 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Contact.class), bool));
            if (anyType65 == null) {
                anyType65 = new AnyType(new LazyKType(D.b(Contact.class), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$102
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Contact.class);
                    }
                }), converters42);
            }
            asyncFunctionBuilderAsyncFunction41.setAsyncFunctionComponent(new SuspendFunctionComponent(name41, new AnyType[]{anyType65}, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$103(null)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction42 = classComponentBuilder.AsyncFunction("addPhone");
            String name42 = asyncFunctionBuilderAsyncFunction42.getName();
            TypeConverterProvider converters43 = asyncFunctionBuilderAsyncFunction42.getConverters();
            AnyType anyType66 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Contact.class), bool));
            if (anyType66 == null) {
                anyType66 = new AnyType(new LazyKType(D.b(Contact.class), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$104
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Contact.class);
                    }
                }), converters43);
            }
            AnyType anyType67 = anyTypeProvider.getTypesMap().get(new Pair(D.b(PhoneRecord.New.class), bool));
            if (anyType67 == null) {
                anyType67 = new AnyType(new LazyKType(D.b(PhoneRecord.New.class), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$105
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(PhoneRecord.New.class);
                    }
                }), converters43);
            }
            asyncFunctionBuilderAsyncFunction42.setAsyncFunctionComponent(new SuspendFunctionComponent(name42, new AnyType[]{anyType66, anyType67}, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$106(null)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction43 = classComponentBuilder.AsyncFunction("updatePhone");
            String name43 = asyncFunctionBuilderAsyncFunction43.getName();
            TypeConverterProvider converters44 = asyncFunctionBuilderAsyncFunction43.getConverters();
            AnyType anyType68 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Contact.class), bool));
            if (anyType68 == null) {
                anyType68 = new AnyType(new LazyKType(D.b(Contact.class), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$107
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Contact.class);
                    }
                }), converters44);
            }
            AnyType anyType69 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls4), bool));
            if (anyType69 == null) {
                anyType69 = new AnyType(new LazyKType(D.b(cls4), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$108
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(PhoneRecord.Existing.class);
                    }
                }), converters44);
            }
            asyncFunctionBuilderAsyncFunction43.setAsyncFunctionComponent(new SuspendFunctionComponent(name43, new AnyType[]{anyType68, anyType69}, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$109(null)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction44 = classComponentBuilder.AsyncFunction("deletePhone");
            String name44 = asyncFunctionBuilderAsyncFunction44.getName();
            TypeConverterProvider converters45 = asyncFunctionBuilderAsyncFunction44.getConverters();
            AnyType anyType70 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Contact.class), bool));
            if (anyType70 == null) {
                anyType70 = new AnyType(new LazyKType(D.b(Contact.class), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$110
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Contact.class);
                    }
                }), converters45);
            }
            AnyType anyType71 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls4), bool));
            if (anyType71 == null) {
                anyType71 = new AnyType(new LazyKType(D.b(cls4), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$111
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(PhoneRecord.Existing.class);
                    }
                }), converters45);
            }
            asyncFunctionBuilderAsyncFunction44.setAsyncFunctionComponent(new SuspendFunctionComponent(name44, new AnyType[]{anyType70, anyType71}, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$112(null)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction45 = classComponentBuilder.AsyncFunction("getAddresses");
            String name45 = asyncFunctionBuilderAsyncFunction45.getName();
            TypeConverterProvider converters46 = asyncFunctionBuilderAsyncFunction45.getConverters();
            AnyType anyType72 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Contact.class), bool));
            if (anyType72 == null) {
                anyType72 = new AnyType(new LazyKType(D.b(Contact.class), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$113
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Contact.class);
                    }
                }), converters46);
            }
            asyncFunctionBuilderAsyncFunction45.setAsyncFunctionComponent(new SuspendFunctionComponent(name45, new AnyType[]{anyType72}, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$114(null)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction46 = classComponentBuilder.AsyncFunction("addAddress");
            String name46 = asyncFunctionBuilderAsyncFunction46.getName();
            TypeConverterProvider converters47 = asyncFunctionBuilderAsyncFunction46.getConverters();
            AnyType anyType73 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Contact.class), bool));
            if (anyType73 == null) {
                anyType73 = new AnyType(new LazyKType(D.b(Contact.class), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$115
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Contact.class);
                    }
                }), converters47);
            }
            AnyType anyType74 = anyTypeProvider.getTypesMap().get(new Pair(D.b(AddressRecord.New.class), bool));
            if (anyType74 == null) {
                anyType74 = new AnyType(new LazyKType(D.b(AddressRecord.New.class), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$116
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(AddressRecord.New.class);
                    }
                }), converters47);
            }
            asyncFunctionBuilderAsyncFunction46.setAsyncFunctionComponent(new SuspendFunctionComponent(name46, new AnyType[]{anyType73, anyType74}, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$117(null)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction47 = classComponentBuilder.AsyncFunction("updateAddress");
            String name47 = asyncFunctionBuilderAsyncFunction47.getName();
            TypeConverterProvider converters48 = asyncFunctionBuilderAsyncFunction47.getConverters();
            AnyType anyType75 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Contact.class), bool));
            if (anyType75 == null) {
                anyType75 = new AnyType(new LazyKType(D.b(Contact.class), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$118
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Contact.class);
                    }
                }), converters48);
            }
            AnyType anyType76 = anyTypeProvider.getTypesMap().get(new Pair(D.b(AddressRecord.Existing.class), bool));
            if (anyType76 == null) {
                anyType76 = new AnyType(new LazyKType(D.b(AddressRecord.Existing.class), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$119
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(AddressRecord.Existing.class);
                    }
                }), converters48);
            }
            asyncFunctionBuilderAsyncFunction47.setAsyncFunctionComponent(new SuspendFunctionComponent(name47, new AnyType[]{anyType75, anyType76}, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$120(null)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction48 = classComponentBuilder.AsyncFunction("deleteAddress");
            String name48 = asyncFunctionBuilderAsyncFunction48.getName();
            TypeConverterProvider converters49 = asyncFunctionBuilderAsyncFunction48.getConverters();
            AnyType anyType77 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Contact.class), bool));
            if (anyType77 == null) {
                anyType77 = new AnyType(new LazyKType(D.b(Contact.class), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$121
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Contact.class);
                    }
                }), converters49);
            }
            AnyType anyType78 = anyTypeProvider.getTypesMap().get(new Pair(D.b(AddressRecord.Existing.class), bool));
            if (anyType78 == null) {
                anyType78 = new AnyType(new LazyKType(D.b(AddressRecord.Existing.class), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$122
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(AddressRecord.Existing.class);
                    }
                }), converters49);
            }
            asyncFunctionBuilderAsyncFunction48.setAsyncFunctionComponent(new SuspendFunctionComponent(name48, new AnyType[]{anyType77, anyType78}, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$123(null)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction49 = classComponentBuilder.AsyncFunction("getDates");
            String name49 = asyncFunctionBuilderAsyncFunction49.getName();
            TypeConverterProvider converters50 = asyncFunctionBuilderAsyncFunction49.getConverters();
            AnyType anyType79 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Contact.class), bool));
            if (anyType79 == null) {
                anyType79 = new AnyType(new LazyKType(D.b(Contact.class), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$124
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Contact.class);
                    }
                }), converters50);
            }
            asyncFunctionBuilderAsyncFunction49.setAsyncFunctionComponent(new SuspendFunctionComponent(name49, new AnyType[]{anyType79}, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$125(null)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction50 = classComponentBuilder.AsyncFunction("addDate");
            String name50 = asyncFunctionBuilderAsyncFunction50.getName();
            TypeConverterProvider converters51 = asyncFunctionBuilderAsyncFunction50.getConverters();
            AnyType anyType80 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Contact.class), bool));
            if (anyType80 == null) {
                anyType80 = new AnyType(new LazyKType(D.b(Contact.class), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$126
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Contact.class);
                    }
                }), converters51);
            }
            AnyType anyType81 = anyTypeProvider.getTypesMap().get(new Pair(D.b(DateRecord.New.class), bool));
            if (anyType81 == null) {
                anyType81 = new AnyType(new LazyKType(D.b(DateRecord.New.class), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$127
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(DateRecord.New.class);
                    }
                }), converters51);
            }
            asyncFunctionBuilderAsyncFunction50.setAsyncFunctionComponent(new SuspendFunctionComponent(name50, new AnyType[]{anyType80, anyType81}, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$128(null)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction51 = classComponentBuilder.AsyncFunction("updateDate");
            String name51 = asyncFunctionBuilderAsyncFunction51.getName();
            TypeConverterProvider converters52 = asyncFunctionBuilderAsyncFunction51.getConverters();
            AnyType anyType82 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Contact.class), bool));
            if (anyType82 == null) {
                anyType82 = new AnyType(new LazyKType(D.b(Contact.class), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$129
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Contact.class);
                    }
                }), converters52);
            }
            AnyType anyType83 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls3), bool));
            if (anyType83 == null) {
                anyType83 = new AnyType(new LazyKType(D.b(cls3), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$130
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(DateRecord.Existing.class);
                    }
                }), converters52);
            }
            asyncFunctionBuilderAsyncFunction51.setAsyncFunctionComponent(new SuspendFunctionComponent(name51, new AnyType[]{anyType82, anyType83}, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$131(null)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction52 = classComponentBuilder.AsyncFunction("deleteDate");
            String name52 = asyncFunctionBuilderAsyncFunction52.getName();
            TypeConverterProvider converters53 = asyncFunctionBuilderAsyncFunction52.getConverters();
            AnyType anyType84 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Contact.class), bool));
            if (anyType84 == null) {
                anyType84 = new AnyType(new LazyKType(D.b(Contact.class), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$132
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Contact.class);
                    }
                }), converters53);
            }
            AnyType anyType85 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls3), bool));
            if (anyType85 == null) {
                anyType85 = new AnyType(new LazyKType(D.b(cls3), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$133
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(DateRecord.Existing.class);
                    }
                }), converters53);
            }
            asyncFunctionBuilderAsyncFunction52.setAsyncFunctionComponent(new SuspendFunctionComponent(name52, new AnyType[]{anyType84, anyType85}, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$134(null)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction53 = classComponentBuilder.AsyncFunction("getExtraNames");
            String name53 = asyncFunctionBuilderAsyncFunction53.getName();
            TypeConverterProvider converters54 = asyncFunctionBuilderAsyncFunction53.getConverters();
            AnyType anyType86 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Contact.class), bool));
            if (anyType86 == null) {
                anyType86 = new AnyType(new LazyKType(D.b(Contact.class), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$135
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Contact.class);
                    }
                }), converters54);
            }
            asyncFunctionBuilderAsyncFunction53.setAsyncFunctionComponent(new SuspendFunctionComponent(name53, new AnyType[]{anyType86}, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$136(null)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction54 = classComponentBuilder.AsyncFunction("addExtraName");
            String name54 = asyncFunctionBuilderAsyncFunction54.getName();
            TypeConverterProvider converters55 = asyncFunctionBuilderAsyncFunction54.getConverters();
            AnyType anyType87 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Contact.class), bool));
            if (anyType87 == null) {
                anyType87 = new AnyType(new LazyKType(D.b(Contact.class), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$137
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Contact.class);
                    }
                }), converters55);
            }
            AnyType anyType88 = anyTypeProvider.getTypesMap().get(new Pair(D.b(ExtraNameRecord.New.class), bool));
            if (anyType88 == null) {
                anyType88 = new AnyType(new LazyKType(D.b(ExtraNameRecord.New.class), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$138
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(ExtraNameRecord.New.class);
                    }
                }), converters55);
            }
            asyncFunctionBuilderAsyncFunction54.setAsyncFunctionComponent(new SuspendFunctionComponent(name54, new AnyType[]{anyType87, anyType88}, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$139(null)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction55 = classComponentBuilder.AsyncFunction("updateExtraName");
            String name55 = asyncFunctionBuilderAsyncFunction55.getName();
            TypeConverterProvider converters56 = asyncFunctionBuilderAsyncFunction55.getConverters();
            AnyType anyType89 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Contact.class), bool));
            if (anyType89 == null) {
                anyType89 = new AnyType(new LazyKType(D.b(Contact.class), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$140
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Contact.class);
                    }
                }), converters56);
            }
            AnyType anyType90 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls2), bool));
            if (anyType90 == null) {
                anyType90 = new AnyType(new LazyKType(D.b(cls2), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$141
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(ExtraNameRecord.Existing.class);
                    }
                }), converters56);
            }
            asyncFunctionBuilderAsyncFunction55.setAsyncFunctionComponent(new SuspendFunctionComponent(name55, new AnyType[]{anyType89, anyType90}, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$142(null)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction56 = classComponentBuilder.AsyncFunction("deleteExtraName");
            String name56 = asyncFunctionBuilderAsyncFunction56.getName();
            TypeConverterProvider converters57 = asyncFunctionBuilderAsyncFunction56.getConverters();
            AnyType anyType91 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Contact.class), bool));
            if (anyType91 == null) {
                anyType91 = new AnyType(new LazyKType(D.b(Contact.class), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$143
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Contact.class);
                    }
                }), converters57);
            }
            AnyType anyType92 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls2), bool));
            if (anyType92 == null) {
                anyType92 = new AnyType(new LazyKType(D.b(cls2), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$144
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(ExtraNameRecord.Existing.class);
                    }
                }), converters57);
            }
            asyncFunctionBuilderAsyncFunction56.setAsyncFunctionComponent(new SuspendFunctionComponent(name56, new AnyType[]{anyType91, anyType92}, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$145(null)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction57 = classComponentBuilder.AsyncFunction("getRelations");
            String name57 = asyncFunctionBuilderAsyncFunction57.getName();
            TypeConverterProvider converters58 = asyncFunctionBuilderAsyncFunction57.getConverters();
            AnyType anyType93 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Contact.class), bool));
            if (anyType93 == null) {
                anyType93 = new AnyType(new LazyKType(D.b(Contact.class), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$146
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Contact.class);
                    }
                }), converters58);
            }
            asyncFunctionBuilderAsyncFunction57.setAsyncFunctionComponent(new SuspendFunctionComponent(name57, new AnyType[]{anyType93}, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$147(null)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction58 = classComponentBuilder.AsyncFunction("addRelation");
            String name58 = asyncFunctionBuilderAsyncFunction58.getName();
            TypeConverterProvider converters59 = asyncFunctionBuilderAsyncFunction58.getConverters();
            AnyType anyType94 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Contact.class), bool));
            if (anyType94 == null) {
                anyType94 = new AnyType(new LazyKType(D.b(Contact.class), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$148
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Contact.class);
                    }
                }), converters59);
            }
            AnyType anyType95 = anyTypeProvider.getTypesMap().get(new Pair(D.b(RelationRecord.New.class), bool));
            if (anyType95 == null) {
                anyType95 = new AnyType(new LazyKType(D.b(RelationRecord.New.class), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$149
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(RelationRecord.New.class);
                    }
                }), converters59);
            }
            asyncFunctionBuilderAsyncFunction58.setAsyncFunctionComponent(new SuspendFunctionComponent(name58, new AnyType[]{anyType94, anyType95}, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$150(null)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction59 = classComponentBuilder.AsyncFunction("updateRelation");
            String name59 = asyncFunctionBuilderAsyncFunction59.getName();
            TypeConverterProvider converters60 = asyncFunctionBuilderAsyncFunction59.getConverters();
            AnyType anyType96 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Contact.class), bool));
            if (anyType96 == null) {
                anyType96 = new AnyType(new LazyKType(D.b(Contact.class), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$151
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Contact.class);
                    }
                }), converters60);
            }
            AnyType anyType97 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls), bool));
            if (anyType97 == null) {
                anyType97 = new AnyType(new LazyKType(D.b(cls), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$152
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(RelationRecord.Existing.class);
                    }
                }), converters60);
            }
            asyncFunctionBuilderAsyncFunction59.setAsyncFunctionComponent(new SuspendFunctionComponent(name59, new AnyType[]{anyType96, anyType97}, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$153(null)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction60 = classComponentBuilder.AsyncFunction("deleteRelation");
            String name60 = asyncFunctionBuilderAsyncFunction60.getName();
            TypeConverterProvider converters61 = asyncFunctionBuilderAsyncFunction60.getConverters();
            AnyType anyType98 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Contact.class), bool));
            if (anyType98 == null) {
                anyType98 = new AnyType(new LazyKType(D.b(Contact.class), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$154
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Contact.class);
                    }
                }), converters61);
            }
            AnyType anyType99 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls), bool));
            if (anyType99 == null) {
                anyType99 = new AnyType(new LazyKType(D.b(cls), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$155
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(RelationRecord.Existing.class);
                    }
                }), converters61);
            }
            asyncFunctionBuilderAsyncFunction60.setAsyncFunctionComponent(new SuspendFunctionComponent(name60, new AnyType[]{anyType98, anyType99}, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$156(null)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction61 = classComponentBuilder.AsyncFunction("getUrlAddresses");
            String name61 = asyncFunctionBuilderAsyncFunction61.getName();
            TypeConverterProvider converters62 = asyncFunctionBuilderAsyncFunction61.getConverters();
            AnyType anyType100 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Contact.class), bool));
            if (anyType100 == null) {
                anyType100 = new AnyType(new LazyKType(D.b(Contact.class), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$157
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Contact.class);
                    }
                }), converters62);
            }
            asyncFunctionBuilderAsyncFunction61.setAsyncFunctionComponent(new SuspendFunctionComponent(name61, new AnyType[]{anyType100}, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$158(null)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction62 = classComponentBuilder.AsyncFunction("addUrlAddress");
            String name62 = asyncFunctionBuilderAsyncFunction62.getName();
            TypeConverterProvider converters63 = asyncFunctionBuilderAsyncFunction62.getConverters();
            AnyType anyType101 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Contact.class), bool));
            if (anyType101 == null) {
                anyType101 = new AnyType(new LazyKType(D.b(Contact.class), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$159
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Contact.class);
                    }
                }), converters63);
            }
            AnyType anyType102 = anyTypeProvider.getTypesMap().get(new Pair(D.b(UrlAddressRecord.New.class), bool));
            if (anyType102 == null) {
                anyType102 = new AnyType(new LazyKType(D.b(UrlAddressRecord.New.class), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$160
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(UrlAddressRecord.New.class);
                    }
                }), converters63);
            }
            asyncFunctionBuilderAsyncFunction62.setAsyncFunctionComponent(new SuspendFunctionComponent(name62, new AnyType[]{anyType101, anyType102}, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$161(null)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction63 = classComponentBuilder.AsyncFunction("updateUrlAddress");
            String name63 = asyncFunctionBuilderAsyncFunction63.getName();
            TypeConverterProvider converters64 = asyncFunctionBuilderAsyncFunction63.getConverters();
            AnyType anyType103 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Contact.class), bool));
            if (anyType103 == null) {
                anyType103 = new AnyType(new LazyKType(D.b(Contact.class), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$162
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Contact.class);
                    }
                }), converters64);
            }
            AnyType anyType104 = anyTypeProvider.getTypesMap().get(new Pair(D.b(UrlAddressRecord.Existing.class), bool));
            if (anyType104 == null) {
                anyType104 = new AnyType(new LazyKType(D.b(UrlAddressRecord.Existing.class), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$163
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(UrlAddressRecord.Existing.class);
                    }
                }), converters64);
            }
            asyncFunctionBuilderAsyncFunction63.setAsyncFunctionComponent(new SuspendFunctionComponent(name63, new AnyType[]{anyType103, anyType104}, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$164(null)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction64 = classComponentBuilder.AsyncFunction("deleteUrlAddress");
            String name64 = asyncFunctionBuilderAsyncFunction64.getName();
            TypeConverterProvider converters65 = asyncFunctionBuilderAsyncFunction64.getConverters();
            AnyType anyType105 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Contact.class), bool));
            if (anyType105 == null) {
                anyType105 = new AnyType(new LazyKType(D.b(Contact.class), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$165
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Contact.class);
                    }
                }), converters65);
            }
            AnyType anyType106 = anyTypeProvider.getTypesMap().get(new Pair(D.b(UrlAddressRecord.Existing.class), bool));
            if (anyType106 == null) {
                anyType106 = new AnyType(new LazyKType(D.b(UrlAddressRecord.Existing.class), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$166
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(UrlAddressRecord.Existing.class);
                    }
                }), converters65);
            }
            asyncFunctionBuilderAsyncFunction64.setAsyncFunctionComponent(new SuspendFunctionComponent(name64, new AnyType[]{anyType105, anyType106}, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$167(null)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction65 = classComponentBuilder.AsyncFunction("editWithForm");
            String name65 = asyncFunctionBuilderAsyncFunction65.getName();
            TypeConverterProvider converters66 = asyncFunctionBuilderAsyncFunction65.getConverters();
            AnyType anyType107 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Contact.class), bool));
            if (anyType107 == null) {
                anyType107 = new AnyType(new LazyKType(D.b(Contact.class), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$168
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Contact.class);
                    }
                }), converters66);
            }
            asyncFunctionBuilderAsyncFunction65.setAsyncFunctionComponent(new SuspendFunctionComponent(name65, new AnyType[]{anyType107}, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$169(null)));
            AsyncFunctionBuilder asyncFunctionBuilderStaticAsyncFunction = classComponentBuilder.StaticAsyncFunction("create");
            String name66 = asyncFunctionBuilderStaticAsyncFunction.getName();
            TypeConverterProvider converters67 = asyncFunctionBuilderStaticAsyncFunction.getConverters();
            AnyType anyType108 = anyTypeProvider.getTypesMap().get(new Pair(D.b(CreateContactRecord.class), bool));
            if (anyType108 == null) {
                anyType108 = new AnyType(new LazyKType(D.b(CreateContactRecord.class), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$170
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(CreateContactRecord.class);
                    }
                }), converters67);
            }
            asyncFunctionBuilderStaticAsyncFunction.setAsyncFunctionComponent(new SuspendFunctionComponent(name66, new AnyType[]{anyType108}, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$171(null, this)));
            AsyncFunctionBuilder asyncFunctionBuilderStaticAsyncFunction2 = classComponentBuilder.StaticAsyncFunction("presentCreateForm");
            String name67 = asyncFunctionBuilderStaticAsyncFunction2.getName();
            TypeConverterProvider converters68 = asyncFunctionBuilderStaticAsyncFunction2.getConverters();
            AnyType anyType109 = anyTypeProvider.getTypesMap().get(new Pair(D.b(CreateContactRecord.class), bool2));
            if (anyType109 == null) {
                anyType109 = new AnyType(new LazyKType(D.b(CreateContactRecord.class), true, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$172
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.f(CreateContactRecord.class);
                    }
                }), converters68);
            }
            asyncFunctionBuilderStaticAsyncFunction2.setAsyncFunctionComponent(new SuspendFunctionComponent(name67, new AnyType[]{anyType109}, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$173(null, this)));
            AsyncFunctionBuilder asyncFunctionBuilderStaticAsyncFunction3 = classComponentBuilder.StaticAsyncFunction("presentPicker");
            asyncFunctionBuilderStaticAsyncFunction3.setAsyncFunctionComponent(new SuspendFunctionComponent(asyncFunctionBuilderStaticAsyncFunction3.getName(), new AnyType[0], new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$174(null, this)));
            AsyncFunctionBuilder asyncFunctionBuilderStaticAsyncFunction4 = classComponentBuilder.StaticAsyncFunction("getAll");
            String name68 = asyncFunctionBuilderStaticAsyncFunction4.getName();
            TypeConverterProvider converters69 = asyncFunctionBuilderStaticAsyncFunction4.getConverters();
            AnyType anyType110 = anyTypeProvider.getTypesMap().get(new Pair(D.b(ContactQueryOptions.class), bool2));
            if (anyType110 == null) {
                anyType110 = new AnyType(new LazyKType(D.b(ContactQueryOptions.class), true, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$175
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.f(ContactQueryOptions.class);
                    }
                }), converters69);
            }
            asyncFunctionBuilderStaticAsyncFunction4.setAsyncFunctionComponent(new SuspendFunctionComponent(name68, new AnyType[]{anyType110}, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$176(null, this)));
            AsyncFunctionBuilder asyncFunctionBuilderStaticAsyncFunction5 = classComponentBuilder.StaticAsyncFunction("getAllDetails");
            String name69 = asyncFunctionBuilderStaticAsyncFunction5.getName();
            TypeConverterProvider converters70 = asyncFunctionBuilderStaticAsyncFunction5.getConverters();
            AnyType anyType111 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls6), bool));
            if (anyType111 == null) {
                anyType111 = new AnyType(new LazyKType(D.b(cls6), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$177
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.p(Set.class, q.f518c.d(D.o(ContactField.class)));
                    }
                }), converters70);
            }
            AnyType anyType112 = anyTypeProvider.getTypesMap().get(new Pair(D.b(ContactQueryOptions.class), bool2));
            if (anyType112 == null) {
                anyType112 = new AnyType(new LazyKType(D.b(ContactQueryOptions.class), true, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$178
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.f(ContactQueryOptions.class);
                    }
                }), converters70);
            }
            asyncFunctionBuilderStaticAsyncFunction5.setAsyncFunctionComponent(new SuspendFunctionComponent(name69, new AnyType[]{anyType111, anyType112}, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$179(null, this)));
            AsyncFunctionBuilder asyncFunctionBuilderStaticAsyncFunction6 = classComponentBuilder.StaticAsyncFunction("getCount");
            asyncFunctionBuilderStaticAsyncFunction6.setAsyncFunctionComponent(new SuspendFunctionComponent(asyncFunctionBuilderStaticAsyncFunction6.getName(), new AnyType[0], new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$180(null, this)));
            AsyncFunctionBuilder asyncFunctionBuilderStaticAsyncFunction7 = classComponentBuilder.StaticAsyncFunction("hasAny");
            asyncFunctionBuilderStaticAsyncFunction7.setAsyncFunctionComponent(new SuspendFunctionComponent(asyncFunctionBuilderStaticAsyncFunction7.getName(), new AnyType[0], new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$181(null, this)));
            if (AbstractC2855l.b(Promise.class, Promise.class)) {
                stringAsyncFunctionComponent = new AsyncFunctionWithPromiseComponent("requestPermissionsAsync", new AnyType[0], new Function2() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$StaticAsyncFunction$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Object[]) obj, (Promise) obj2);
                        return C2735B.f28704a;
                    }

                    public final void invoke(Object[] objArr, Promise promise) {
                        AbstractC2855l.g(objArr, "<unused var>");
                        AbstractC2855l.g(promise, "promise");
                        this.this$0.getPermissionsDelegate().requestPermissions(promise);
                    }
                });
            } else {
                TypeConverterProvider converters71 = classComponentBuilder.getConverters();
                AnyType anyType113 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Promise.class), bool));
                if (anyType113 == null) {
                    anyType113 = new AnyType(new LazyKType(D.b(Promise.class), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$StaticAsyncFunction$2
                        @Override // w7.InterfaceC3487a
                        public final o invoke() {
                            return D.o(Promise.class);
                        }
                    }), converters71);
                }
                AnyType[] anyTypeArr3 = {anyType113};
                Function1 function1 = new Function1() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$StaticAsyncFunction$3
                    @Override // kotlin.jvm.functions.Function1
                    public final C2735B invoke(Object[] objArr) {
                        AbstractC2855l.g(objArr, "<destruct>");
                        this.this$0.getPermissionsDelegate().requestPermissions((Promise) objArr[0]);
                        return C2735B.f28704a;
                    }
                };
                if (AbstractC2855l.b(C2735B.class, Integer.TYPE)) {
                    floatAsyncFunctionComponent = new IntAsyncFunctionComponent("requestPermissionsAsync", anyTypeArr3, function1);
                } else if (AbstractC2855l.b(C2735B.class, Boolean.TYPE)) {
                    floatAsyncFunctionComponent = new BoolAsyncFunctionComponent("requestPermissionsAsync", anyTypeArr3, function1);
                } else if (AbstractC2855l.b(C2735B.class, Double.TYPE)) {
                    floatAsyncFunctionComponent = new DoubleAsyncFunctionComponent("requestPermissionsAsync", anyTypeArr3, function1);
                } else {
                    if (!AbstractC2855l.b(C2735B.class, Float.TYPE)) {
                        cls8 = cls7;
                        stringAsyncFunctionComponent = AbstractC2855l.b(C2735B.class, cls8) ? new StringAsyncFunctionComponent("requestPermissionsAsync", anyTypeArr3, function1) : new UntypedAsyncFunctionComponent("requestPermissionsAsync", anyTypeArr3, function1);
                        classComponentBuilder.getStaticAsyncFunctions().put("requestPermissionsAsync", stringAsyncFunctionComponent);
                        if (AbstractC2855l.b(Promise.class, Promise.class)) {
                            TypeConverterProvider converters72 = classComponentBuilder.getConverters();
                            AnyType anyType114 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Promise.class), bool));
                            if (anyType114 == null) {
                                anyType114 = new AnyType(new LazyKType(D.b(Promise.class), false, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$StaticAsyncFunction$5
                                    @Override // w7.InterfaceC3487a
                                    public final o invoke() {
                                        return D.o(Promise.class);
                                    }
                                }), converters72);
                            }
                            AnyType[] anyTypeArr4 = {anyType114};
                            Function1 function12 = new Function1() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$StaticAsyncFunction$6
                                @Override // kotlin.jvm.functions.Function1
                                public final C2735B invoke(Object[] objArr) {
                                    AbstractC2855l.g(objArr, "<destruct>");
                                    this.this$0.getPermissionsDelegate().getPermissions((Promise) objArr[0]);
                                    return C2735B.f28704a;
                                }
                            };
                            intAsyncFunctionComponent = AbstractC2855l.b(C2735B.class, Integer.TYPE) ? new IntAsyncFunctionComponent("getPermissions", anyTypeArr4, function12) : AbstractC2855l.b(C2735B.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent("getPermissions", anyTypeArr4, function12) : AbstractC2855l.b(C2735B.class, Double.TYPE) ? new DoubleAsyncFunctionComponent("getPermissions", anyTypeArr4, function12) : AbstractC2855l.b(C2735B.class, Float.TYPE) ? new FloatAsyncFunctionComponent("getPermissions", anyTypeArr4, function12) : AbstractC2855l.b(C2735B.class, cls8) ? new StringAsyncFunctionComponent("getPermissions", anyTypeArr4, function12) : new UntypedAsyncFunctionComponent("getPermissions", anyTypeArr4, function12);
                        } else {
                            intAsyncFunctionComponent = new AsyncFunctionWithPromiseComponent("getPermissions", new AnyType[0], new Function2() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$StaticAsyncFunction$4
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((Object[]) obj, (Promise) obj2);
                                    return C2735B.f28704a;
                                }

                                public final void invoke(Object[] objArr, Promise promise) {
                                    AbstractC2855l.g(objArr, "<unused var>");
                                    AbstractC2855l.g(promise, "promise");
                                    this.this$0.getPermissionsDelegate().getPermissions(promise);
                                }
                            });
                        }
                        classComponentBuilder.getStaticAsyncFunctions().put("getPermissions", intAsyncFunctionComponent);
                        moduleDefinitionBuilder.getClassData().add(classComponentBuilder.buildClass());
                        ModuleDefinitionBuilder moduleDefinitionBuilder3 = moduleDefinitionBuilder;
                        moduleDefinitionBuilder3.Events(str);
                        Map<EventName, EventListener> eventListeners = moduleDefinitionBuilder3.getEventListeners();
                        EventName eventName = EventName.MODULE_DESTROY;
                        eventListeners.put(eventName, new BasicEventListener(eventName, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$$inlined$OnDestroy$1
                            @Override // w7.InterfaceC3487a
                            public /* bridge */ /* synthetic */ Object invoke() {
                                m38invoke();
                                return C2735B.f28704a;
                            }

                            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                            public final void m38invoke() {
                                this.this$0.getObserverDelegate().stopObservingContactChanges();
                            }
                        }));
                        String str2 = str;
                        moduleDefinitionBuilder3.OnStartObserving(str2, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$1$3
                            @Override // w7.InterfaceC3487a
                            public /* bridge */ /* synthetic */ Object invoke() throws ContactsObserverException {
                                m36invoke();
                                return C2735B.f28704a;
                            }

                            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                            public final void m36invoke() throws ContactsObserverException {
                                this.this$0.getObserverDelegate().startObservingContactChanges();
                            }
                        });
                        moduleDefinitionBuilder3.OnStopObserving(str2, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$1$4
                            @Override // w7.InterfaceC3487a
                            public /* bridge */ /* synthetic */ Object invoke() {
                                m37invoke();
                                return C2735B.f28704a;
                            }

                            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                            public final void m37invoke() {
                                this.this$0.getObserverDelegate().stopObservingContactChanges();
                            }
                        });
                        moduleDefinitionBuilder3.RegisterActivityContracts(new ContactsNextModule$definition$1$5(this, null));
                        ModuleDefinitionData moduleDefinitionDataBuildModule = moduleDefinitionBuilder3.buildModule();
                        AbstractC2861a.f();
                        return moduleDefinitionDataBuildModule;
                    }
                    floatAsyncFunctionComponent = new FloatAsyncFunctionComponent("requestPermissionsAsync", anyTypeArr3, function1);
                }
                stringAsyncFunctionComponent = floatAsyncFunctionComponent;
            }
            cls8 = cls7;
            classComponentBuilder.getStaticAsyncFunctions().put("requestPermissionsAsync", stringAsyncFunctionComponent);
            if (AbstractC2855l.b(Promise.class, Promise.class)) {
            }
            classComponentBuilder.getStaticAsyncFunctions().put("getPermissions", intAsyncFunctionComponent);
            moduleDefinitionBuilder.getClassData().add(classComponentBuilder.buildClass());
            ModuleDefinitionBuilder moduleDefinitionBuilder32 = moduleDefinitionBuilder;
            moduleDefinitionBuilder32.Events(str);
            Map<EventName, EventListener> eventListeners2 = moduleDefinitionBuilder32.getEventListeners();
            EventName eventName2 = EventName.MODULE_DESTROY;
            eventListeners2.put(eventName2, new BasicEventListener(eventName2, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$$inlined$OnDestroy$1
                @Override // w7.InterfaceC3487a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m38invoke();
                    return C2735B.f28704a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m38invoke() {
                    this.this$0.getObserverDelegate().stopObservingContactChanges();
                }
            }));
            String str22 = str;
            moduleDefinitionBuilder32.OnStartObserving(str22, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$1$3
                @Override // w7.InterfaceC3487a
                public /* bridge */ /* synthetic */ Object invoke() throws ContactsObserverException {
                    m36invoke();
                    return C2735B.f28704a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m36invoke() throws ContactsObserverException {
                    this.this$0.getObserverDelegate().startObservingContactChanges();
                }
            });
            moduleDefinitionBuilder32.OnStopObserving(str22, new InterfaceC3487a() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$1$4
                @Override // w7.InterfaceC3487a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m37invoke();
                    return C2735B.f28704a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m37invoke() {
                    this.this$0.getObserverDelegate().stopObservingContactChanges();
                }
            });
            moduleDefinitionBuilder32.RegisterActivityContracts(new ContactsNextModule$definition$1$5(this, null));
            ModuleDefinitionData moduleDefinitionDataBuildModule2 = moduleDefinitionBuilder32.buildModule();
            AbstractC2861a.f();
            return moduleDefinitionDataBuildModule2;
        } catch (Throwable th) {
            AbstractC2861a.f();
            throw th;
        }
    }
}
