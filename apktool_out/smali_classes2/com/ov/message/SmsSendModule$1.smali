.class Lcom/ov/message/SmsSendModule$1;
.super Landroid/content/BroadcastReceiver;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ov/message/SmsSendModule;->sendSmsInternal(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lcom/facebook/react/bridge/Promise;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ov/message/SmsSendModule;

.field final synthetic val$failedCount:Ljava/util/concurrent/atomic/AtomicInteger;

.field final synthetic val$messageId:Ljava/lang/String;

.field final synthetic val$phoneNumber:Ljava/lang/String;

.field final synthetic val$promise:Lcom/facebook/react/bridge/Promise;

.field final synthetic val$sendTimestamp:J

.field final synthetic val$sentCount:Ljava/util/concurrent/atomic/AtomicInteger;

.field final synthetic val$totalParts:I


# direct methods
.method constructor <init>(Lcom/ov/message/SmsSendModule;Ljava/util/concurrent/atomic/AtomicInteger;IJLjava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/Promise;Ljava/util/concurrent/atomic/AtomicInteger;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ov/message/SmsSendModule$1;->this$0:Lcom/ov/message/SmsSendModule;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/ov/message/SmsSendModule$1;->val$sentCount:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 4
    .line 5
    iput p3, p0, Lcom/ov/message/SmsSendModule$1;->val$totalParts:I

    .line 6
    .line 7
    iput-wide p4, p0, Lcom/ov/message/SmsSendModule$1;->val$sendTimestamp:J

    .line 8
    .line 9
    iput-object p6, p0, Lcom/ov/message/SmsSendModule$1;->val$messageId:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p7, p0, Lcom/ov/message/SmsSendModule$1;->val$phoneNumber:Ljava/lang/String;

    .line 12
    .line 13
    iput-object p8, p0, Lcom/ov/message/SmsSendModule$1;->val$promise:Lcom/facebook/react/bridge/Promise;

    .line 14
    .line 15
    iput-object p9, p0, Lcom/ov/message/SmsSendModule$1;->val$failedCount:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 16
    .line 17
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method private handleSendError(Lcom/facebook/react/bridge/Promise;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ov/message/SmsSendModule$1;->val$failedCount:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-ne v0, v1, :cond_1

    .line 9
    .line 10
    iget-object v0, p0, Lcom/ov/message/SmsSendModule$1;->this$0:Lcom/ov/message/SmsSendModule;

    .line 11
    .line 12
    invoke-static {v0, p5, p6}, Lcom/ov/message/SmsSendModule;->c(Lcom/ov/message/SmsSendModule;J)V

    .line 13
    .line 14
    .line 15
    iget-object p5, p0, Lcom/ov/message/SmsSendModule$1;->val$messageId:Ljava/lang/String;

    .line 16
    .line 17
    if-eqz p5, :cond_0

    .line 18
    .line 19
    invoke-static {}, Lcom/ov/message/SmsSendModule;->d()Ljava/util/Map;

    .line 20
    .line 21
    .line 22
    move-result-object p5

    .line 23
    iget-object p6, p0, Lcom/ov/message/SmsSendModule$1;->val$messageId:Ljava/lang/String;

    .line 24
    .line 25
    const-string v0, "failed"

    .line 26
    .line 27
    invoke-interface {p5, p6, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    :cond_0
    new-instance p5, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    invoke-direct {p5}, Ljava/lang/StringBuilder;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p5, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const-string p3, " (destinataire: "

    .line 39
    .line 40
    invoke-virtual {p5, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p5, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string p3, ")"

    .line 47
    .line 48
    invoke-virtual {p5, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {p5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p3

    .line 55
    invoke-interface {p1, p2, p3}, Lcom/facebook/react/bridge/Promise;->reject(Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    :cond_1
    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 7

    .line 1
    const-string v1, "part"

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    invoke-virtual {p2, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/content/BroadcastReceiver;->getResultCode()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, -0x1

    .line 12
    const/4 v3, 0x1

    .line 13
    if-eq v1, v2, :cond_4

    .line 14
    .line 15
    if-eq v1, v3, :cond_3

    .line 16
    .line 17
    const/4 v2, 0x2

    .line 18
    if-eq v1, v2, :cond_2

    .line 19
    .line 20
    const/4 v2, 0x3

    .line 21
    if-eq v1, v2, :cond_1

    .line 22
    .line 23
    const/4 v2, 0x4

    .line 24
    if-eq v1, v2, :cond_0

    .line 25
    .line 26
    iget-object v1, p0, Lcom/ov/message/SmsSendModule$1;->val$promise:Lcom/facebook/react/bridge/Promise;

    .line 27
    .line 28
    new-instance v2, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 31
    .line 32
    .line 33
    const-string v3, "Erreur inconnue: "

    .line 34
    .line 35
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Landroid/content/BroadcastReceiver;->getResultCode()I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    iget-object v4, p0, Lcom/ov/message/SmsSendModule$1;->val$phoneNumber:Ljava/lang/String;

    .line 50
    .line 51
    iget-wide v5, p0, Lcom/ov/message/SmsSendModule$1;->val$sendTimestamp:J

    .line 52
    .line 53
    const-string v2, "UNKNOWN"

    .line 54
    .line 55
    move-object v0, p0

    .line 56
    invoke-direct/range {v0 .. v6}, Lcom/ov/message/SmsSendModule$1;->handleSendError(Lcom/facebook/react/bridge/Promise;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_0
    iget-object v1, p0, Lcom/ov/message/SmsSendModule$1;->val$promise:Lcom/facebook/react/bridge/Promise;

    .line 61
    .line 62
    iget-object v4, p0, Lcom/ov/message/SmsSendModule$1;->val$phoneNumber:Ljava/lang/String;

    .line 63
    .line 64
    iget-wide v5, p0, Lcom/ov/message/SmsSendModule$1;->val$sendTimestamp:J

    .line 65
    .line 66
    const-string v2, "NO_SERVICE"

    .line 67
    .line 68
    const-string v3, "Pas de service r\u00e9seau"

    .line 69
    .line 70
    move-object v0, p0

    .line 71
    invoke-direct/range {v0 .. v6}, Lcom/ov/message/SmsSendModule$1;->handleSendError(Lcom/facebook/react/bridge/Promise;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :cond_1
    iget-object v1, p0, Lcom/ov/message/SmsSendModule$1;->val$promise:Lcom/facebook/react/bridge/Promise;

    .line 76
    .line 77
    iget-object v4, p0, Lcom/ov/message/SmsSendModule$1;->val$phoneNumber:Ljava/lang/String;

    .line 78
    .line 79
    iget-wide v5, p0, Lcom/ov/message/SmsSendModule$1;->val$sendTimestamp:J

    .line 80
    .line 81
    const-string v2, "NULL_PDU"

    .line 82
    .line 83
    const-string v3, "PDU null"

    .line 84
    .line 85
    move-object v0, p0

    .line 86
    invoke-direct/range {v0 .. v6}, Lcom/ov/message/SmsSendModule$1;->handleSendError(Lcom/facebook/react/bridge/Promise;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :cond_2
    iget-object v1, p0, Lcom/ov/message/SmsSendModule$1;->val$promise:Lcom/facebook/react/bridge/Promise;

    .line 91
    .line 92
    iget-object v4, p0, Lcom/ov/message/SmsSendModule$1;->val$phoneNumber:Ljava/lang/String;

    .line 93
    .line 94
    iget-wide v5, p0, Lcom/ov/message/SmsSendModule$1;->val$sendTimestamp:J

    .line 95
    .line 96
    const-string v2, "RADIO_OFF"

    .line 97
    .line 98
    const-string v3, "Radio d\u00e9sactiv\u00e9e"

    .line 99
    .line 100
    move-object v0, p0

    .line 101
    invoke-direct/range {v0 .. v6}, Lcom/ov/message/SmsSendModule$1;->handleSendError(Lcom/facebook/react/bridge/Promise;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 102
    .line 103
    .line 104
    return-void

    .line 105
    :cond_3
    iget-object v1, p0, Lcom/ov/message/SmsSendModule$1;->val$promise:Lcom/facebook/react/bridge/Promise;

    .line 106
    .line 107
    iget-object v4, p0, Lcom/ov/message/SmsSendModule$1;->val$phoneNumber:Ljava/lang/String;

    .line 108
    .line 109
    iget-wide v5, p0, Lcom/ov/message/SmsSendModule$1;->val$sendTimestamp:J

    .line 110
    .line 111
    const-string v2, "GENERIC_FAILURE"

    .line 112
    .line 113
    const-string v3, "\u00c9chec g\u00e9n\u00e9rique de l\'envoi"

    .line 114
    .line 115
    move-object v0, p0

    .line 116
    invoke-direct/range {v0 .. v6}, Lcom/ov/message/SmsSendModule$1;->handleSendError(Lcom/facebook/react/bridge/Promise;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 117
    .line 118
    .line 119
    return-void

    .line 120
    :cond_4
    iget-object v1, p0, Lcom/ov/message/SmsSendModule$1;->val$sentCount:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 121
    .line 122
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    iget v2, p0, Lcom/ov/message/SmsSendModule$1;->val$totalParts:I

    .line 127
    .line 128
    if-ne v1, v2, :cond_6

    .line 129
    .line 130
    iget-object v1, p0, Lcom/ov/message/SmsSendModule$1;->this$0:Lcom/ov/message/SmsSendModule;

    .line 131
    .line 132
    iget-wide v4, p0, Lcom/ov/message/SmsSendModule$1;->val$sendTimestamp:J

    .line 133
    .line 134
    invoke-static {v1, v4, v5}, Lcom/ov/message/SmsSendModule;->c(Lcom/ov/message/SmsSendModule;J)V

    .line 135
    .line 136
    .line 137
    iget-object v1, p0, Lcom/ov/message/SmsSendModule$1;->val$messageId:Ljava/lang/String;

    .line 138
    .line 139
    if-eqz v1, :cond_5

    .line 140
    .line 141
    invoke-static {}, Lcom/ov/message/SmsSendModule;->d()Ljava/util/Map;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    iget-object v2, p0, Lcom/ov/message/SmsSendModule$1;->val$messageId:Ljava/lang/String;

    .line 146
    .line 147
    const-string v4, "sent"

    .line 148
    .line 149
    invoke-interface {v1, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    :cond_5
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    const-string v2, "success"

    .line 157
    .line 158
    invoke-interface {v1, v2, v3}, Lcom/facebook/react/bridge/WritableMap;->putBoolean(Ljava/lang/String;Z)V

    .line 159
    .line 160
    .line 161
    const-string v2, "phoneNumber"

    .line 162
    .line 163
    iget-object v3, p0, Lcom/ov/message/SmsSendModule$1;->val$phoneNumber:Ljava/lang/String;

    .line 164
    .line 165
    invoke-interface {v1, v2, v3}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    const-string v2, "parts"

    .line 169
    .line 170
    iget v3, p0, Lcom/ov/message/SmsSendModule$1;->val$totalParts:I

    .line 171
    .line 172
    invoke-interface {v1, v2, v3}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    .line 173
    .line 174
    .line 175
    iget-wide v2, p0, Lcom/ov/message/SmsSendModule$1;->val$sendTimestamp:J

    .line 176
    .line 177
    long-to-double v2, v2

    .line 178
    const-string v4, "timestamp"

    .line 179
    .line 180
    invoke-interface {v1, v4, v2, v3}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 181
    .line 182
    .line 183
    iget-object v2, p0, Lcom/ov/message/SmsSendModule$1;->val$promise:Lcom/facebook/react/bridge/Promise;

    .line 184
    .line 185
    invoke-interface {v2, v1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    :cond_6
    return-void
.end method
