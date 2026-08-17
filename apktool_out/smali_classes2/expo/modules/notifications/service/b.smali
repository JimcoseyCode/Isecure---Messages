.class public final synthetic Lexpo/modules/notifications/service/b;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lw7/a;


# instance fields
.field public final synthetic g:Landroid/content/Intent;

.field public final synthetic h:Landroid/content/BroadcastReceiver$PendingResult;

.field public final synthetic i:Lexpo/modules/notifications/service/NotificationsService;

.field public final synthetic j:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Intent;Landroid/content/BroadcastReceiver$PendingResult;Lexpo/modules/notifications/service/NotificationsService;Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lexpo/modules/notifications/service/b;->g:Landroid/content/Intent;

    .line 5
    .line 6
    iput-object p2, p0, Lexpo/modules/notifications/service/b;->h:Landroid/content/BroadcastReceiver$PendingResult;

    .line 7
    .line 8
    iput-object p3, p0, Lexpo/modules/notifications/service/b;->i:Lexpo/modules/notifications/service/NotificationsService;

    .line 9
    .line 10
    iput-object p4, p0, Lexpo/modules/notifications/service/b;->j:Landroid/content/Context;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lexpo/modules/notifications/service/b;->g:Landroid/content/Intent;

    .line 2
    .line 3
    iget-object v1, p0, Lexpo/modules/notifications/service/b;->h:Landroid/content/BroadcastReceiver$PendingResult;

    .line 4
    .line 5
    iget-object v2, p0, Lexpo/modules/notifications/service/b;->i:Lexpo/modules/notifications/service/NotificationsService;

    .line 6
    .line 7
    iget-object v3, p0, Lexpo/modules/notifications/service/b;->j:Landroid/content/Context;

    .line 8
    .line 9
    invoke-static {v0, v1, v2, v3}, Lexpo/modules/notifications/service/NotificationsService;->a(Landroid/content/Intent;Landroid/content/BroadcastReceiver$PendingResult;Lexpo/modules/notifications/service/NotificationsService;Landroid/content/Context;)Li7/B;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method
