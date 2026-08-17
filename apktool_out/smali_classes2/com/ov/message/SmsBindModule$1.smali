.class Lcom/ov/message/SmsBindModule$1;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ov/message/SmsBindModule;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ov/message/SmsBindModule;


# direct methods
.method constructor <init>(Lcom/ov/message/SmsBindModule;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ov/message/SmsBindModule$1;->this$0:Lcom/ov/message/SmsBindModule;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/ov/message/SmsBindModule$1;->this$0:Lcom/ov/message/SmsBindModule;

    .line 2
    .line 3
    const/4 p2, 0x1

    .line 4
    invoke-static {p1, p2}, Lcom/ov/message/SmsBindModule;->a(Lcom/ov/message/SmsBindModule;Z)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/ov/message/SmsBindModule$1;->this$0:Lcom/ov/message/SmsBindModule;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-static {p1, v0}, Lcom/ov/message/SmsBindModule;->a(Lcom/ov/message/SmsBindModule;Z)V

    .line 5
    .line 6
    .line 7
    return-void
.end method
