.class public final Lexpo/modules/kotlin/defaultmodules/JSLoggerModuleKt;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/kotlin/defaultmodules/JSLoggerModuleKt$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\"\u0014\u0010\u0001\u001a\u00020\u00008\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\u0008\u0001\u0010\u0002\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0002\"\u0014\u0010\u0004\u001a\u00020\u00008\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u0002\"\u0014\u0010\u0005\u001a\u00020\u00008\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0002\"\u0014\u0010\u0006\u001a\u00020\u00008\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0002\"\u0014\u0010\u0007\u001a\u00020\u00008\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0002\"\u0018\u0010\u000b\u001a\u00020\u0000*\u00020\u00088BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\n*\u000c\u0008\u0007\u0010\r\"\u00020\u000c2\u00020\u000c\u00a8\u0006\u000e"
    }
    d2 = {
        "",
        "JSLoggerModuleName",
        "Ljava/lang/String;",
        "onNewError",
        "onNewWarning",
        "onNewDebug",
        "onNewInfo",
        "onNewTrace",
        "Lexpo/modules/core/logging/LogType;",
        "getEventName",
        "(Lexpo/modules/core/logging/LogType;)Ljava/lang/String;",
        "eventName",
        "Lexpo/modules/kotlin/defaultmodules/JSLoggerModule;",
        "ErrorManagerModule",
        "expo-modules-core_release"
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
.field public static final JSLoggerModuleName:Ljava/lang/String; = "ExpoModulesCoreJSLogger"

.field private static final onNewDebug:Ljava/lang/String; = "ExpoModulesCoreJSLogger.onNewDebug"

.field private static final onNewError:Ljava/lang/String; = "ExpoModulesCoreJSLogger.onNewError"

.field private static final onNewInfo:Ljava/lang/String; = "ExpoModulesCoreJSLogger.onNewInfo"

.field private static final onNewTrace:Ljava/lang/String; = "ExpoModulesCoreJSLogger.onNewTrace"

.field private static final onNewWarning:Ljava/lang/String; = "ExpoModulesCoreJSLogger.onNewWarning"


# direct methods
.method public static synthetic ErrorManagerModule$annotations()V
    .locals 0

    .line 1
    return-void
.end method

.method public static final synthetic access$getEventName(Lexpo/modules/core/logging/LogType;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, Lexpo/modules/kotlin/defaultmodules/JSLoggerModuleKt;->getEventName(Lexpo/modules/core/logging/LogType;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final getEventName(Lexpo/modules/core/logging/LogType;)Ljava/lang/String;
    .locals 3

    .line 1
    sget-object v0, Lexpo/modules/kotlin/defaultmodules/JSLoggerModuleKt$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    aget p0, v0, p0

    .line 8
    .line 9
    const-string v0, "ExpoModulesCoreJSLogger.onNewTrace"

    .line 10
    .line 11
    const-string v1, "ExpoModulesCoreJSLogger.onNewDebug"

    .line 12
    .line 13
    const-string v2, "ExpoModulesCoreJSLogger.onNewError"

    .line 14
    .line 15
    packed-switch p0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    new-instance p0, Li7/m;

    .line 19
    .line 20
    invoke-direct {p0}, Li7/m;-><init>()V

    .line 21
    .line 22
    .line 23
    throw p0

    .line 24
    :pswitch_0
    return-object v2

    .line 25
    :pswitch_1
    const-string p0, "ExpoModulesCoreJSLogger.onNewWarning"

    .line 26
    .line 27
    return-object p0

    .line 28
    :pswitch_2
    const-string p0, "ExpoModulesCoreJSLogger.onNewInfo"

    .line 29
    .line 30
    return-object p0

    .line 31
    :pswitch_3
    return-object v1

    .line 32
    :pswitch_4
    return-object v0

    .line 33
    :pswitch_5
    return-object v1

    .line 34
    :pswitch_6
    return-object v0

    .line 35
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
