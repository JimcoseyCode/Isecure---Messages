.class public final Lcom/ov/message/MainApplication$reactNativeHost$1;
.super Lcom/facebook/react/defaults/DefaultReactNativeHost;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ov/message/MainApplication;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\u0014J\u0008\u0010\u0005\u001a\u00020\u0006H\u0014J\u0008\u0010\u0007\u001a\u00020\u0008H\u0016R\u0014\u0010\t\u001a\u00020\u0008X\u0094D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u0008X\u0094D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\n\u00a8\u0006\u000c"
    }
    d2 = {
        "com/ov/message/MainApplication$reactNativeHost$1",
        "Lcom/facebook/react/defaults/DefaultReactNativeHost;",
        "getPackages",
        "",
        "Lcom/facebook/react/ReactPackage;",
        "getJSMainModuleName",
        "",
        "getUseDeveloperSupport",
        "",
        "isNewArchEnabled",
        "()Z",
        "isHermesEnabled",
        "OV-Message-1.0.0_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final isHermesEnabled:Z

.field private final isNewArchEnabled:Z


# direct methods
.method constructor <init>(Lcom/ov/message/MainApplication;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/defaults/DefaultReactNativeHost;-><init>(Landroid/app/Application;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x1

    .line 5
    iput-boolean p1, p0, Lcom/ov/message/MainApplication$reactNativeHost$1;->isNewArchEnabled:Z

    .line 6
    .line 7
    iput-boolean p1, p0, Lcom/ov/message/MainApplication$reactNativeHost$1;->isHermesEnabled:Z

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method protected getJSMainModuleName()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, ".expo/.virtual-metro-entry"

    .line 2
    .line 3
    return-object v0
.end method

.method protected getPackages()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/facebook/react/ReactPackage;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/facebook/react/PackageList;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/facebook/react/PackageList;-><init>(Lcom/facebook/react/ReactNativeHost;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/facebook/react/PackageList;->getPackages()Ljava/util/ArrayList;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v1, Lcom/ov/message/SmsEventPackage;

    .line 11
    .line 12
    invoke-direct {v1}, Lcom/ov/message/SmsEventPackage;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    new-instance v1, Lcom/ov/message/SmsRoleHelperPackage;

    .line 19
    .line 20
    invoke-direct {v1}, Lcom/ov/message/SmsRoleHelperPackage;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    new-instance v1, Lcom/ov/message/SmsServicePackage;

    .line 27
    .line 28
    invoke-direct {v1}, Lcom/ov/message/SmsServicePackage;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    new-instance v1, Lcom/ov/message/SmsDeletePackage;

    .line 35
    .line 36
    invoke-direct {v1}, Lcom/ov/message/SmsDeletePackage;-><init>()V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    new-instance v1, Lcom/ov/message/CallPackage;

    .line 43
    .line 44
    invoke-direct {v1}, Lcom/ov/message/CallPackage;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    new-instance v1, Lcom/ov/message/MutedContactsPackage;

    .line 51
    .line 52
    invoke-direct {v1}, Lcom/ov/message/MutedContactsPackage;-><init>()V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    new-instance v1, Lcom/ov/message/BlockedContactsPackage;

    .line 59
    .line 60
    invoke-direct {v1}, Lcom/ov/message/BlockedContactsPackage;-><init>()V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    new-instance v1, Lcom/ov/message/NotificationPackage;

    .line 67
    .line 68
    invoke-direct {v1}, Lcom/ov/message/NotificationPackage;-><init>()V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    new-instance v1, Lcom/ov/message/SmsBindPackage;

    .line 75
    .line 76
    invoke-direct {v1}, Lcom/ov/message/SmsBindPackage;-><init>()V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    new-instance v1, Lcom/ov/message/ContactSyncPackage;

    .line 83
    .line 84
    invoke-direct {v1}, Lcom/ov/message/ContactSyncPackage;-><init>()V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    new-instance v1, Lcom/ov/message/PhoneNumberPackage;

    .line 91
    .line 92
    invoke-direct {v1}, Lcom/ov/message/PhoneNumberPackage;-><init>()V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    new-instance v1, Lcom/ov/message/SmsSendPackage;

    .line 99
    .line 100
    invoke-direct {v1}, Lcom/ov/message/SmsSendPackage;-><init>()V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    new-instance v1, Lcom/ov/message/SmsReadPackage;

    .line 107
    .line 108
    invoke-direct {v1}, Lcom/ov/message/SmsReadPackage;-><init>()V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    new-instance v1, Lcom/ov/message/FileStoragePackage;

    .line 115
    .line 116
    invoke-direct {v1}, Lcom/ov/message/FileStoragePackage;-><init>()V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    new-instance v1, Lcom/ov/message/SecureWindowPackage;

    .line 123
    .line 124
    invoke-direct {v1}, Lcom/ov/message/SecureWindowPackage;-><init>()V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    new-instance v1, Lcom/ov/message/RcsHelperPackage;

    .line 131
    .line 132
    invoke-direct {v1}, Lcom/ov/message/RcsHelperPackage;-><init>()V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    new-instance v1, Lcom/ov/message/AppKillSchedulerPackage;

    .line 139
    .line 140
    invoke-direct {v1}, Lcom/ov/message/AppKillSchedulerPackage;-><init>()V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    new-instance v1, Lcom/ov/message/PairingAuthPackage;

    .line 147
    .line 148
    invoke-direct {v1}, Lcom/ov/message/PairingAuthPackage;-><init>()V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    invoke-static {v0}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    return-object v0
.end method

.method public getUseDeveloperSupport()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method protected isHermesEnabled()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/ov/message/MainApplication$reactNativeHost$1;->isHermesEnabled:Z

    .line 2
    .line 3
    return v0
.end method

.method protected isNewArchEnabled()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/ov/message/MainApplication$reactNativeHost$1;->isNewArchEnabled:Z

    .line 2
    .line 3
    return v0
.end method
