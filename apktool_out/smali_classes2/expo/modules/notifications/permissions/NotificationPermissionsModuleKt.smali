.class public final Lexpo/modules/notifications/permissions/NotificationPermissionsModuleKt;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0008\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u0016\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0005X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "ANDROID_RESPONSE_KEY",
        "",
        "IMPORTANCE_KEY",
        "INTERRUPTION_FILTER_KEY",
        "PERMISSIONS",
        "",
        "[Ljava/lang/String;",
        "expo-notifications_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final ANDROID_RESPONSE_KEY:Ljava/lang/String; = "android"

.field private static final IMPORTANCE_KEY:Ljava/lang/String; = "importance"

.field private static final INTERRUPTION_FILTER_KEY:Ljava/lang/String; = "interruptionFilter"

.field private static final PERMISSIONS:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "android.permission.POST_NOTIFICATIONS"

    .line 2
    .line 3
    filled-new-array {v0}, [Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lexpo/modules/notifications/permissions/NotificationPermissionsModuleKt;->PERMISSIONS:[Ljava/lang/String;

    .line 8
    .line 9
    return-void
.end method

.method public static final synthetic access$getPERMISSIONS$p()[Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lexpo/modules/notifications/permissions/NotificationPermissionsModuleKt;->PERMISSIONS:[Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
