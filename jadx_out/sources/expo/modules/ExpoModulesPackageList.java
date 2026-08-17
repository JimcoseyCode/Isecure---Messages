package expo.modules;

import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.adapters.react.ReactAdapterPackage;
import expo.modules.application.ApplicationModule;
import expo.modules.asset.AssetModule;
import expo.modules.camera.CameraViewModule;
import expo.modules.clipboard.ClipboardModule;
import expo.modules.constants.ConstantsModule;
import expo.modules.constants.ConstantsService;
import expo.modules.contacts.ContactsModule;
import expo.modules.contacts.next.ContactsNextModule;
import expo.modules.core.BasePackage;
import expo.modules.core.interfaces.Package;
import expo.modules.crypto.CryptoModule;
import expo.modules.crypto.aes.AesCryptoModule;
import expo.modules.devlauncher.DevLauncherPackage;
import expo.modules.devlauncher.modules.ExpoDevLauncherModule;
import expo.modules.devmenu.DevMenuPackage;
import expo.modules.devmenu.modules.DevMenuModule;
import expo.modules.documentpicker.DocumentPickerModule;
import expo.modules.fetch.ExpoFetchModule;
import expo.modules.filesystem.FileSystemModule;
import expo.modules.filesystem.legacy.FileSystemLegacyModule;
import expo.modules.font.FontLoaderModule;
import expo.modules.font.FontUtilsModule;
import expo.modules.haptics.HapticsModule;
import expo.modules.image.ExpoImageModule;
import expo.modules.imageloader.ImageLoaderService;
import expo.modules.imagepicker.ImagePickerModule;
import expo.modules.intentlauncher.IntentLauncherModule;
import expo.modules.keepawake.KeepAwakeModule;
import expo.modules.kotlin.ModulesProvider;
import expo.modules.kotlin.edgeToEdge.EdgeToEdgePackage;
import expo.modules.kotlin.modules.Module;
import expo.modules.kotlin.services.Service;
import expo.modules.linking.ExpoLinkingModule;
import expo.modules.linking.ExpoLinkingPackage;
import expo.modules.logbox.ExpoLogBoxPackage;
import expo.modules.medialibrary.MediaLibraryModule;
import expo.modules.medialibrary.next.MediaLibraryNextModule;
import expo.modules.notifications.NotificationsPackage;
import expo.modules.notifications.badge.BadgeModule;
import expo.modules.notifications.notifications.background.ExpoBackgroundNotificationTasksModule;
import expo.modules.notifications.notifications.categories.ExpoNotificationCategoriesModule;
import expo.modules.notifications.notifications.channels.AndroidXNotificationsChannelsProvider;
import expo.modules.notifications.notifications.channels.NotificationChannelGroupManagerModule;
import expo.modules.notifications.notifications.channels.NotificationChannelManagerModule;
import expo.modules.notifications.notifications.emitting.NotificationsEmitter;
import expo.modules.notifications.notifications.handling.NotificationsHandler;
import expo.modules.notifications.notifications.presentation.ExpoNotificationPresentationModule;
import expo.modules.notifications.notifications.scheduling.NotificationScheduler;
import expo.modules.notifications.permissions.NotificationPermissionsModule;
import expo.modules.notifications.serverregistration.ServerRegistrationModule;
import expo.modules.notifications.tokens.PushTokenModule;
import expo.modules.notifications.topics.TopicSubscriptionModule;
import expo.modules.router.ExpoRouterModule;
import expo.modules.securestore.SecureStoreModule;
import expo.modules.sharing.SharingModule;
import expo.modules.sharing.SharingPackage;
import expo.modules.splashscreen.SplashScreenModule;
import expo.modules.systemui.SystemUIModule;
import expo.modules.systemui.SystemUIPackage;
import expo.modules.webview.DomWebViewModule;
import i7.t;
import j7.AbstractC2800q;
import j7.K;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u0018\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005H\u0016J\u0016\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\u00060\nH\u0016¨\u0006\r"}, d2 = {"Lexpo/modules/ExpoModulesPackageList;", "Lexpo/modules/kotlin/ModulesProvider;", "<init>", "()V", "getModulesMap", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Ljava/lang/Class;", "Lexpo/modules/kotlin/modules/Module;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getServices", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/kotlin/services/Service;", "Companion", "expo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ExpoModulesPackageList implements ModulesProvider {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final List<Package> packagesList = AbstractC2800q.m(new ExpoLogBoxPackage(), new DevLauncherPackage(), new DevMenuPackage(), new ExpoLinkingPackage(), new ReactAdapterPackage(), new BasePackage(), new EdgeToEdgePackage(), new NotificationsPackage(), new SharingPackage(), new SystemUIPackage());
    private static final Map<Class<? extends Module>, String> modulesMap = K.l(t.a(DomWebViewModule.class, null), t.a(ExpoFetchModule.class, null), t.a(ApplicationModule.class, null), t.a(AssetModule.class, null), t.a(CameraViewModule.class, null), t.a(ClipboardModule.class, null), t.a(ConstantsModule.class, null), t.a(ContactsModule.class, null), t.a(ContactsNextModule.class, null), t.a(CryptoModule.class, null), t.a(AesCryptoModule.class, null), t.a(ExpoDevLauncherModule.class, null), t.a(DevMenuModule.class, null), t.a(DocumentPickerModule.class, null), t.a(FileSystemModule.class, null), t.a(FileSystemLegacyModule.class, null), t.a(FontLoaderModule.class, null), t.a(FontUtilsModule.class, null), t.a(HapticsModule.class, null), t.a(ExpoImageModule.class, null), t.a(ImagePickerModule.class, null), t.a(IntentLauncherModule.class, null), t.a(KeepAwakeModule.class, null), t.a(ExpoLinkingModule.class, null), t.a(MediaLibraryModule.class, null), t.a(MediaLibraryNextModule.class, null), t.a(BadgeModule.class, null), t.a(ExpoBackgroundNotificationTasksModule.class, null), t.a(ExpoNotificationCategoriesModule.class, null), t.a(NotificationChannelGroupManagerModule.class, null), t.a(NotificationChannelManagerModule.class, null), t.a(NotificationsEmitter.class, null), t.a(NotificationsHandler.class, null), t.a(NotificationPermissionsModule.class, null), t.a(ExpoNotificationPresentationModule.class, null), t.a(NotificationScheduler.class, null), t.a(ServerRegistrationModule.class, null), t.a(PushTokenModule.class, null), t.a(TopicSubscriptionModule.class, null), t.a(AndroidXNotificationsChannelsProvider.class, null), t.a(ExpoRouterModule.class, null), t.a(SecureStoreModule.class, null), t.a(SharingModule.class, null), t.a(SplashScreenModule.class, null), t.a(SystemUIModule.class, null));

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR'\u0010\t\u001a\u0018\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lexpo/modules/ExpoModulesPackageList$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "packagesList", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/core/interfaces/Package;", "getPackagesList", "()Ljava/util/List;", "modulesMap", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Ljava/lang/Class;", "Lexpo/modules/kotlin/modules/Module;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getModulesMap", "()Ljava/util/Map;", "getPackageList", "expo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Map<Class<? extends Module>, String> getModulesMap() {
            return ExpoModulesPackageList.modulesMap;
        }

        public final List<Package> getPackageList() {
            return getPackagesList();
        }

        public final List<Package> getPackagesList() {
            return ExpoModulesPackageList.packagesList;
        }

        private Companion() {
        }
    }

    public static final List<Package> getPackageList() {
        return INSTANCE.getPackageList();
    }

    @Override // expo.modules.kotlin.ModulesProvider
    public Map<Class<? extends Module>, String> getModulesMap() {
        return modulesMap;
    }

    @Override // expo.modules.kotlin.ModulesProvider
    public List<Class<? extends Service>> getServices() {
        return AbstractC2800q.m(ConstantsService.class, ImageLoaderService.class);
    }
}
