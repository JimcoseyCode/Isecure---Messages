.class public Lcom/ov/message/SmsSendModule;
.super Lcom/facebook/react/bridge/ReactContextBaseJavaModule;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# static fields
.field private static final ACTION_SMS_DELIVERED:Ljava/lang/String; = "com.ov.message.SMS_DELIVERED_MODULE"

.field private static final ACTION_SMS_SENT:Ljava/lang/String; = "com.ov.message.SMS_SENT_MODULE"

.field private static final MODULE_NAME:Ljava/lang/String; = "SmsSendModule"

.field private static final TAG:Ljava/lang/String; = "SmsSendModule"

.field private static final sendResults:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final activeReceivers:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "[",
            "Landroid/content/BroadcastReceiver;",
            ">;"
        }
    .end annotation
.end field

.field private final reactContext:Lcom/facebook/react/bridge/ReactApplicationContext;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/ov/message/SmsSendModule;->sendResults:Ljava/util/Map;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/bridge/ReactContextBaseJavaModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/ov/message/SmsSendModule;->activeReceivers:Ljava/util/Map;

    .line 10
    .line 11
    iput-object p1, p0, Lcom/ov/message/SmsSendModule;->reactContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 12
    .line 13
    return-void
.end method

.method public static synthetic a(Lcom/ov/message/SmsSendModule;JLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/ov/message/SmsSendModule;->lambda$sendSmsInternal$0(JLjava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method static bridge synthetic b(Lcom/ov/message/SmsSendModule;Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/ov/message/SmsSendModule;->emitEvent(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method static bridge synthetic c(Lcom/ov/message/SmsSendModule;J)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/ov/message/SmsSendModule;->unregisterReceiversForSession(J)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method static bridge synthetic d()Ljava/util/Map;
    .locals 1

    .line 1
    sget-object v0, Lcom/ov/message/SmsSendModule;->sendResults:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method private emitEvent(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/ov/message/SmsSendModule;->reactContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 2
    .line 3
    const-class v1, Lcom/facebook/react/modules/core/DeviceEventManagerModule$RCTDeviceEventEmitter;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lcom/facebook/react/bridge/ReactContext;->getJSModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/JavaScriptModule;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lcom/facebook/react/modules/core/DeviceEventManagerModule$RCTDeviceEventEmitter;

    .line 10
    .line 11
    invoke-interface {v0, p1, p2}, Lcom/facebook/react/modules/core/DeviceEventManagerModule$RCTDeviceEventEmitter;->emit(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    .line 14
    :catch_0
    return-void
.end method

.method private getPendingIntentFlags()I
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1f

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    const/high16 v0, 0xc000000

    .line 8
    .line 9
    return v0

    .line 10
    :cond_0
    const/high16 v0, 0x8000000

    .line 11
    .line 12
    return v0
.end method

.method private getSmsManager(I)Landroid/telephony/SmsManager;
    .locals 3

    .line 1
    if-gez p1, :cond_0

    .line 2
    .line 3
    invoke-static {}, Landroid/telephony/SmsManager;->getDefault()Landroid/telephony/SmsManager;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1

    .line 8
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 9
    .line 10
    :try_start_0
    iget-object v1, p0, Lcom/ov/message/SmsSendModule;->reactContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 11
    .line 12
    const-string v2, "telephony_subscription_service"

    .line 13
    .line 14
    invoke-virtual {v1, v2}, Lcom/facebook/react/bridge/ReactContext;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Landroid/telephony/SubscriptionManager;

    .line 19
    .line 20
    if-eqz v1, :cond_2

    .line 21
    .line 22
    invoke-virtual {v1}, Landroid/telephony/SubscriptionManager;->getActiveSubscriptionInfoList()Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    if-eqz v1, :cond_2

    .line 27
    .line 28
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-ge p1, v2, :cond_2

    .line 33
    .line 34
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    check-cast p1, Landroid/telephony/SubscriptionInfo;

    .line 39
    .line 40
    invoke-virtual {p1}, Landroid/telephony/SubscriptionInfo;->getSubscriptionId()I

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    const/16 v1, 0x1f

    .line 45
    .line 46
    if-lt v0, v1, :cond_1

    .line 47
    .line 48
    iget-object v0, p0, Lcom/ov/message/SmsSendModule;->reactContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 49
    .line 50
    const-class v1, Landroid/telephony/SmsManager;

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    check-cast v0, Landroid/telephony/SmsManager;

    .line 57
    .line 58
    invoke-static {v0, p1}, Lcom/ov/message/o;->a(Landroid/telephony/SmsManager;I)Landroid/telephony/SmsManager;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    return-object p1

    .line 63
    :cond_1
    invoke-static {p1}, Landroid/telephony/SmsManager;->getSmsManagerForSubscriptionId(I)Landroid/telephony/SmsManager;

    .line 64
    .line 65
    .line 66
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 67
    return-object p1

    .line 68
    :catch_0
    :cond_2
    invoke-static {}, Landroid/telephony/SmsManager;->getDefault()Landroid/telephony/SmsManager;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    return-object p1
.end method

.method private synthetic lambda$sendSmsInternal$0(JLjava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ov/message/SmsSendModule;->activeReceivers:Ljava/util/Map;

    .line 2
    .line 3
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-direct {p0, p1, p2}, Lcom/ov/message/SmsSendModule;->unregisterReceiversForSession(J)V

    .line 14
    .line 15
    .line 16
    if-eqz p3, :cond_0

    .line 17
    .line 18
    sget-object p1, Lcom/ov/message/SmsSendModule;->sendResults:Ljava/util/Map;

    .line 19
    .line 20
    invoke-interface {p1, p3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    if-nez p2, :cond_0

    .line 25
    .line 26
    const-string p2, "timeout"

    .line 27
    .line 28
    invoke-interface {p1, p3, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void
.end method

.method private saveToSentBox(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    :try_start_0
    new-instance v0, Landroid/content/ContentValues;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "address"

    .line 7
    .line 8
    invoke-virtual {v0, v1, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string p1, "body"

    .line 12
    .line 13
    invoke-virtual {v0, p1, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string p1, "type"

    .line 17
    .line 18
    const/4 p2, 0x2

    .line 19
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    invoke-virtual {v0, p1, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 24
    .line 25
    .line 26
    const-string p1, "date"

    .line 27
    .line 28
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 29
    .line 30
    .line 31
    move-result-wide v1

    .line 32
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    invoke-virtual {v0, p1, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 37
    .line 38
    .line 39
    const-string p1, "read"

    .line 40
    .line 41
    const/4 p2, 0x1

    .line 42
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    invoke-virtual {v0, p1, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 47
    .line 48
    .line 49
    iget-object p1, p0, Lcom/ov/message/SmsSendModule;->reactContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 50
    .line 51
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    const-string p2, "content://sms/sent"

    .line 56
    .line 57
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    invoke-virtual {p1, p2, v0}, Landroid/content/ContentResolver;->insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 62
    .line 63
    .line 64
    :catch_0
    return-void
.end method

.method private sendSmsInternal(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lcom/facebook/react/bridge/Promise;)V
    .locals 24

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v10, p2

    .line 4
    .line 5
    const-string v11, "phone"

    .line 6
    .line 7
    const-string v12, "total"

    .line 8
    .line 9
    const-string v13, "part"

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    :try_start_0
    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result v0
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_8
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_7

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    :cond_0
    move-object/from16 v8, p5

    .line 24
    .line 25
    move-object v7, v1

    .line 26
    goto/16 :goto_5

    .line 27
    .line 28
    :cond_1
    if-eqz v10, :cond_2

    .line 29
    .line 30
    :try_start_1
    invoke-virtual {v10}, Ljava/lang/String;->isEmpty()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_3

    .line 35
    .line 36
    :cond_2
    move-object v7, v1

    .line 37
    goto/16 :goto_4

    .line 38
    .line 39
    :cond_3
    move/from16 v0, p3

    .line 40
    .line 41
    invoke-direct {v1, v0}, Lcom/ov/message/SmsSendModule;->getSmsManager(I)Landroid/telephony/SmsManager;

    .line 42
    .line 43
    .line 44
    move-result-object v14

    .line 45
    invoke-virtual {v14, v10}, Landroid/telephony/SmsManager;->divideMessage(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 46
    .line 47
    .line 48
    move-result-object v15

    .line 49
    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    new-instance v2, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 54
    .line 55
    const/4 v0, 0x0

    .line 56
    invoke-direct {v2, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 57
    .line 58
    .line 59
    new-instance v9, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 60
    .line 61
    invoke-direct {v9, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 62
    .line 63
    .line 64
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 65
    .line 66
    .line 67
    move-result-wide v4

    .line 68
    new-instance v6, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 71
    .line 72
    .line 73
    const-string v7, "com.ov.message.SMS_SENT_MODULE_"

    .line 74
    .line 75
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v6, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    new-instance v7, Ljava/lang/StringBuilder;

    .line 86
    .line 87
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 88
    .line 89
    .line 90
    const-string v8, "com.ov.message.SMS_DELIVERED_MODULE_"

    .line 91
    .line 92
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v7, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v7

    .line 102
    move v8, v0

    .line 103
    new-instance v0, Lcom/ov/message/SmsSendModule$1;

    .line 104
    .line 105
    move-object v10, v6

    .line 106
    move/from16 p3, v8

    .line 107
    .line 108
    move-object/from16 v16, v14

    .line 109
    .line 110
    move-object/from16 v6, p4

    .line 111
    .line 112
    move-object/from16 v8, p5

    .line 113
    .line 114
    move-object v14, v7

    .line 115
    move-object/from16 v7, p1

    .line 116
    .line 117
    invoke-direct/range {v0 .. v9}, Lcom/ov/message/SmsSendModule$1;-><init>(Lcom/ov/message/SmsSendModule;Ljava/util/concurrent/atomic/AtomicInteger;IJLjava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/Promise;Ljava/util/concurrent/atomic/AtomicInteger;)V
    :try_end_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    .line 118
    .line 119
    .line 120
    move-object v6, v0

    .line 121
    :try_start_2
    new-instance v0, Lcom/ov/message/SmsSendModule$2;
    :try_end_2
    .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_5
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_4

    .line 122
    .line 123
    move-wide/from16 v22, v4

    .line 124
    .line 125
    move v5, v3

    .line 126
    move-wide/from16 v2, v22

    .line 127
    .line 128
    move-object/from16 v1, p0

    .line 129
    .line 130
    move-object/from16 v4, p1

    .line 131
    .line 132
    :try_start_3
    invoke-direct/range {v0 .. v5}, Lcom/ov/message/SmsSendModule$2;-><init>(Lcom/ov/message/SmsSendModule;JLjava/lang/String;I)V
    :try_end_3
    .catch Ljava/lang/SecurityException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    .line 133
    .line 134
    .line 135
    move-object v7, v1

    .line 136
    move-object v1, v4

    .line 137
    move v9, v5

    .line 138
    :try_start_4
    iget-object v4, v7, Lcom/ov/message/SmsSendModule;->activeReceivers:Ljava/util/Map;

    .line 139
    .line 140
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 141
    .line 142
    .line 143
    move-result-object v5

    .line 144
    move-object/from16 v17, v15

    .line 145
    .line 146
    const/4 v15, 0x2

    .line 147
    new-array v8, v15, [Landroid/content/BroadcastReceiver;

    .line 148
    .line 149
    aput-object v6, v8, p3

    .line 150
    .line 151
    const/4 v15, 0x1

    .line 152
    aput-object v0, v8, v15

    .line 153
    .line 154
    invoke-interface {v4, v5, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    iget-object v4, v7, Lcom/ov/message/SmsSendModule;->reactContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 158
    .line 159
    new-instance v5, Landroid/content/IntentFilter;

    .line 160
    .line 161
    invoke-direct {v5, v10}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    const/4 v8, 0x2

    .line 165
    invoke-static {v4, v6, v5, v8}, Lcom/ov/message/i;->a(Lcom/facebook/react/bridge/ReactApplicationContext;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;I)Landroid/content/Intent;

    .line 166
    .line 167
    .line 168
    iget-object v4, v7, Lcom/ov/message/SmsSendModule;->reactContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 169
    .line 170
    new-instance v5, Landroid/content/IntentFilter;

    .line 171
    .line 172
    invoke-direct {v5, v14}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    invoke-static {v4, v0, v5, v8}, Lcom/ov/message/i;->a(Lcom/facebook/react/bridge/ReactApplicationContext;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;I)Landroid/content/Intent;

    .line 176
    .line 177
    .line 178
    new-instance v4, Ljava/util/ArrayList;

    .line 179
    .line 180
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 181
    .line 182
    .line 183
    new-instance v5, Ljava/util/ArrayList;

    .line 184
    .line 185
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 186
    .line 187
    .line 188
    invoke-direct {v7}, Lcom/ov/message/SmsSendModule;->getPendingIntentFlags()I

    .line 189
    .line 190
    .line 191
    move-result v0

    .line 192
    move/from16 v6, p3

    .line 193
    .line 194
    :goto_0
    if-ge v6, v9, :cond_4

    .line 195
    .line 196
    new-instance v8, Landroid/content/Intent;

    .line 197
    .line 198
    invoke-direct {v8, v10}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v8, v13, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 202
    .line 203
    .line 204
    invoke-virtual {v8, v12, v9}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v8, v11, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 208
    .line 209
    .line 210
    iget-object v15, v7, Lcom/ov/message/SmsSendModule;->reactContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 211
    .line 212
    move-object/from16 v19, v10

    .line 213
    .line 214
    long-to-int v10, v2

    .line 215
    move-wide/from16 v20, v2

    .line 216
    .line 217
    add-int v2, v10, v6

    .line 218
    .line 219
    invoke-static {v15, v2, v8, v0}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 220
    .line 221
    .line 222
    move-result-object v2

    .line 223
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 224
    .line 225
    .line 226
    new-instance v2, Landroid/content/Intent;

    .line 227
    .line 228
    invoke-direct {v2, v14}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v2, v13, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 232
    .line 233
    .line 234
    invoke-virtual {v2, v12, v9}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 235
    .line 236
    .line 237
    invoke-virtual {v2, v11, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 238
    .line 239
    .line 240
    iget-object v3, v7, Lcom/ov/message/SmsSendModule;->reactContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 241
    .line 242
    add-int/2addr v10, v9

    .line 243
    add-int/2addr v10, v6

    .line 244
    invoke-static {v3, v10, v2, v0}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 245
    .line 246
    .line 247
    move-result-object v2

    .line 248
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 249
    .line 250
    .line 251
    add-int/lit8 v6, v6, 0x1

    .line 252
    .line 253
    move-object/from16 v10, v19

    .line 254
    .line 255
    move-wide/from16 v2, v20

    .line 256
    .line 257
    const/4 v15, 0x1

    .line 258
    goto :goto_0

    .line 259
    :catch_0
    move-exception v0

    .line 260
    :goto_1
    move-object/from16 v8, p5

    .line 261
    .line 262
    goto/16 :goto_6

    .line 263
    .line 264
    :catch_1
    :goto_2
    move-object/from16 v8, p5

    .line 265
    .line 266
    goto/16 :goto_7

    .line 267
    .line 268
    :cond_4
    move-wide/from16 v20, v2

    .line 269
    .line 270
    move v0, v15

    .line 271
    if-ne v9, v0, :cond_5

    .line 272
    .line 273
    move/from16 v8, p3

    .line 274
    .line 275
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    move-object v4, v0

    .line 280
    check-cast v4, Landroid/app/PendingIntent;

    .line 281
    .line 282
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    move-object v5, v0

    .line 287
    check-cast v5, Landroid/app/PendingIntent;

    .line 288
    .line 289
    const/4 v2, 0x0

    .line 290
    move-object/from16 v3, p2

    .line 291
    .line 292
    move-object/from16 v0, v16

    .line 293
    .line 294
    move-wide/from16 v10, v20

    .line 295
    .line 296
    invoke-virtual/range {v0 .. v5}, Landroid/telephony/SmsManager;->sendTextMessage(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/app/PendingIntent;Landroid/app/PendingIntent;)V

    .line 297
    .line 298
    .line 299
    goto :goto_3

    .line 300
    :cond_5
    move-object/from16 v0, v16

    .line 301
    .line 302
    move-wide/from16 v10, v20

    .line 303
    .line 304
    const/4 v2, 0x0

    .line 305
    move-object/from16 v1, p1

    .line 306
    .line 307
    move-object/from16 v3, v17

    .line 308
    .line 309
    invoke-virtual/range {v0 .. v5}, Landroid/telephony/SmsManager;->sendMultipartTextMessage(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 310
    .line 311
    .line 312
    :goto_3
    invoke-direct/range {p0 .. p2}, Lcom/ov/message/SmsSendModule;->saveToSentBox(Ljava/lang/String;Ljava/lang/String;)V

    .line 313
    .line 314
    .line 315
    const/16 v18, 0x1

    .line 316
    .line 317
    add-int/lit8 v3, v9, -0x1

    .line 318
    .line 319
    const/4 v8, 0x0

    .line 320
    invoke-static {v8, v3}, Ljava/lang/Math;->max(II)I

    .line 321
    .line 322
    .line 323
    move-result v0

    .line 324
    int-to-long v0, v0

    .line 325
    const-wide/16 v2, 0x1770

    .line 326
    .line 327
    mul-long/2addr v0, v2

    .line 328
    const-wide/32 v2, 0xafc8

    .line 329
    .line 330
    .line 331
    add-long/2addr v0, v2

    .line 332
    new-instance v2, Landroid/os/Handler;

    .line 333
    .line 334
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 335
    .line 336
    .line 337
    move-result-object v3

    .line 338
    invoke-direct {v2, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 339
    .line 340
    .line 341
    new-instance v3, Lcom/ov/message/p;

    .line 342
    .line 343
    move-object/from16 v6, p4

    .line 344
    .line 345
    invoke-direct {v3, v7, v10, v11, v6}, Lcom/ov/message/p;-><init>(Lcom/ov/message/SmsSendModule;JLjava/lang/String;)V

    .line 346
    .line 347
    .line 348
    invoke-virtual {v2, v3, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 349
    .line 350
    .line 351
    return-void

    .line 352
    :catch_2
    move-exception v0

    .line 353
    move-object v7, v1

    .line 354
    goto :goto_1

    .line 355
    :catch_3
    move-object v7, v1

    .line 356
    goto :goto_2

    .line 357
    :catch_4
    move-exception v0

    .line 358
    move-object/from16 v7, p0

    .line 359
    .line 360
    goto :goto_1

    .line 361
    :catch_5
    move-object/from16 v7, p0

    .line 362
    .line 363
    goto :goto_2

    .line 364
    :goto_4
    const-string v0, "INVALID_MESSAGE"

    .line 365
    .line 366
    const-string v1, "Message vide"
    :try_end_4
    .catch Ljava/lang/SecurityException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 367
    .line 368
    move-object/from16 v8, p5

    .line 369
    .line 370
    :try_start_5
    invoke-interface {v8, v0, v1}, Lcom/facebook/react/bridge/Promise;->reject(Ljava/lang/String;Ljava/lang/String;)V

    .line 371
    .line 372
    .line 373
    return-void

    .line 374
    :catch_6
    move-exception v0

    .line 375
    goto :goto_6

    .line 376
    :catch_7
    move-exception v0

    .line 377
    move-object/from16 v8, p5

    .line 378
    .line 379
    move-object v7, v1

    .line 380
    goto :goto_6

    .line 381
    :catch_8
    move-object/from16 v8, p5

    .line 382
    .line 383
    move-object v7, v1

    .line 384
    goto :goto_7

    .line 385
    :goto_5
    const-string v0, "INVALID_PHONE"

    .line 386
    .line 387
    const-string v1, "Num\u00e9ro de t\u00e9l\u00e9phone invalide"

    .line 388
    .line 389
    invoke-interface {v8, v0, v1}, Lcom/facebook/react/bridge/Promise;->reject(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_5
    .catch Ljava/lang/SecurityException; {:try_start_5 .. :try_end_5} :catch_9
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_6

    .line 390
    .line 391
    .line 392
    return-void

    .line 393
    :goto_6
    new-instance v1, Ljava/lang/StringBuilder;

    .line 394
    .line 395
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 396
    .line 397
    .line 398
    const-string v2, "Erreur d\'envoi: "

    .line 399
    .line 400
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 401
    .line 402
    .line 403
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 404
    .line 405
    .line 406
    move-result-object v0

    .line 407
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 408
    .line 409
    .line 410
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 411
    .line 412
    .line 413
    move-result-object v0

    .line 414
    const-string v1, "SEND_ERROR"

    .line 415
    .line 416
    invoke-interface {v8, v1, v0}, Lcom/facebook/react/bridge/Promise;->reject(Ljava/lang/String;Ljava/lang/String;)V

    .line 417
    .line 418
    .line 419
    goto :goto_8

    .line 420
    :catch_9
    :goto_7
    const-string v0, "PERMISSION_DENIED"

    .line 421
    .line 422
    const-string v1, "Permission SEND_SMS non accord\u00e9e"

    .line 423
    .line 424
    invoke-interface {v8, v0, v1}, Lcom/facebook/react/bridge/Promise;->reject(Ljava/lang/String;Ljava/lang/String;)V

    .line 425
    .line 426
    .line 427
    :goto_8
    return-void
.end method

.method private unregisterReceiversForSession(J)V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/ov/message/SmsSendModule;->activeReceivers:Ljava/util/Map;

    .line 2
    .line 3
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, [Landroid/content/BroadcastReceiver;

    .line 12
    .line 13
    if-eqz p1, :cond_1

    .line 14
    .line 15
    const/4 p2, 0x0

    .line 16
    aget-object p2, p1, p2

    .line 17
    .line 18
    if-eqz p2, :cond_0

    .line 19
    .line 20
    iget-object v0, p0, Lcom/ov/message/SmsSendModule;->reactContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 21
    .line 22
    invoke-virtual {v0, p2}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    const/4 p2, 0x1

    .line 26
    aget-object p1, p1, p2

    .line 27
    .line 28
    if-eqz p1, :cond_1

    .line 29
    .line 30
    iget-object p2, p0, Lcom/ov/message/SmsSendModule;->reactContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 31
    .line 32
    invoke-virtual {p2, p1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 33
    .line 34
    .line 35
    :catch_0
    :cond_1
    return-void
.end method


# virtual methods
.method public addListener(Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    return-void
.end method

.method public clearSendResult(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    sget-object v0, Lcom/ov/message/SmsSendModule;->sendResults:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 7
    .line 8
    invoke-interface {p2, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "SmsSendModule"

    .line 2
    .line 3
    return-object v0
.end method

.method public getSendResult(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    sget-object v0, Lcom/ov/message/SmsSendModule;->sendResults:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Ljava/lang/String;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-interface {p2, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    const/4 p1, 0x0

    .line 16
    invoke-interface {p2, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public isReady(Lcom/facebook/react/bridge/Promise;)V
    .locals 4
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "ready"

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-interface {v0, v1, v2}, Lcom/facebook/react/bridge/WritableMap;->putBoolean(Ljava/lang/String;Z)V

    .line 9
    .line 10
    .line 11
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 12
    .line 13
    const-string v3, "androidVersion"

    .line 14
    .line 15
    invoke-interface {v0, v3, v1}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    .line 16
    .line 17
    .line 18
    const/16 v3, 0x1f

    .line 19
    .line 20
    if-lt v1, v3, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v2, 0x0

    .line 24
    :goto_0
    const-string v1, "flagImmutableRequired"

    .line 25
    .line 26
    invoke-interface {v0, v1, v2}, Lcom/facebook/react/bridge/WritableMap;->putBoolean(Ljava/lang/String;Z)V

    .line 27
    .line 28
    .line 29
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public onCatalystInstanceDestroy()V
    .locals 3

    .line 1
    invoke-super {p0}, Lcom/facebook/react/bridge/NativeModule;->onCatalystInstanceDestroy()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/ov/message/SmsSendModule;->activeReceivers:Ljava/util/Map;

    .line 5
    .line 6
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Ljava/lang/Long;

    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 27
    .line 28
    .line 29
    move-result-wide v1

    .line 30
    invoke-direct {p0, v1, v2}, Lcom/ov/message/SmsSendModule;->unregisterReceiversForSession(J)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    iget-object v0, p0, Lcom/ov/message/SmsSendModule;->activeReceivers:Ljava/util/Map;

    .line 35
    .line 36
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public removeListeners(Ljava/lang/Integer;)V
    .locals 0
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    return-void
.end method

.method public sendSms(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V
    .locals 6
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    const/4 v3, -0x1

    .line 2
    const/4 v4, 0x0

    .line 3
    move-object v0, p0

    .line 4
    move-object v1, p1

    .line 5
    move-object v2, p2

    .line 6
    move-object v5, p3

    .line 7
    invoke-direct/range {v0 .. v5}, Lcom/ov/message/SmsSendModule;->sendSmsInternal(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lcom/facebook/react/bridge/Promise;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public sendSmsWithId(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V
    .locals 6
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    const/4 v3, -0x1

    .line 2
    move-object v0, p0

    .line 3
    move-object v1, p1

    .line 4
    move-object v2, p2

    .line 5
    move-object v4, p3

    .line 6
    move-object v5, p4

    .line 7
    invoke-direct/range {v0 .. v5}, Lcom/ov/message/SmsSendModule;->sendSmsInternal(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lcom/facebook/react/bridge/Promise;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public sendSmsWithSim(Ljava/lang/String;Ljava/lang/String;ILcom/facebook/react/bridge/Promise;)V
    .locals 6
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    const/4 v4, 0x0

    .line 2
    move-object v0, p0

    .line 3
    move-object v1, p1

    .line 4
    move-object v2, p2

    .line 5
    move v3, p3

    .line 6
    move-object v5, p4

    .line 7
    invoke-direct/range {v0 .. v5}, Lcom/ov/message/SmsSendModule;->sendSmsInternal(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lcom/facebook/react/bridge/Promise;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
