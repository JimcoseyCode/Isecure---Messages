.class Lcom/ov/message/SmsSendModule$2;
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

.field final synthetic val$phoneNumber:Ljava/lang/String;

.field final synthetic val$sendTimestamp:J

.field final synthetic val$totalParts:I


# direct methods
.method constructor <init>(Lcom/ov/message/SmsSendModule;JLjava/lang/String;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ov/message/SmsSendModule$2;->this$0:Lcom/ov/message/SmsSendModule;

    .line 2
    .line 3
    iput-wide p2, p0, Lcom/ov/message/SmsSendModule$2;->val$sendTimestamp:J

    .line 4
    .line 5
    iput-object p4, p0, Lcom/ov/message/SmsSendModule$2;->val$phoneNumber:Ljava/lang/String;

    .line 6
    .line 7
    iput p5, p0, Lcom/ov/message/SmsSendModule$2;->val$totalParts:I

    .line 8
    .line 9
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 3

    .line 1
    const/4 p1, 0x0

    .line 2
    const-string v0, "part"

    .line 3
    .line 4
    invoke-virtual {p2, v0, p1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    invoke-virtual {p0}, Landroid/content/BroadcastReceiver;->getResultCode()I

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    const/4 v1, -0x1

    .line 13
    if-ne p2, v1, :cond_0

    .line 14
    .line 15
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    const-string v1, "phoneNumber"

    .line 20
    .line 21
    iget-object v2, p0, Lcom/ov/message/SmsSendModule$2;->val$phoneNumber:Ljava/lang/String;

    .line 22
    .line 23
    invoke-interface {p2, v1, v2}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    add-int/lit8 p1, p1, 0x1

    .line 27
    .line 28
    invoke-interface {p2, v0, p1}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    const-string p1, "totalParts"

    .line 32
    .line 33
    iget v0, p0, Lcom/ov/message/SmsSendModule$2;->val$totalParts:I

    .line 34
    .line 35
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    .line 36
    .line 37
    .line 38
    iget-wide v0, p0, Lcom/ov/message/SmsSendModule$2;->val$sendTimestamp:J

    .line 39
    .line 40
    long-to-double v0, v0

    .line 41
    const-string p1, "timestamp"

    .line 42
    .line 43
    invoke-interface {p2, p1, v0, v1}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 44
    .line 45
    .line 46
    iget-object p1, p0, Lcom/ov/message/SmsSendModule$2;->this$0:Lcom/ov/message/SmsSendModule;

    .line 47
    .line 48
    const-string v0, "onSmsDelivered"

    .line 49
    .line 50
    invoke-static {p1, v0, p2}, Lcom/ov/message/SmsSendModule;->b(Lcom/ov/message/SmsSendModule;Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V

    .line 51
    .line 52
    .line 53
    :cond_0
    return-void
.end method
