.class public final synthetic Lexpo/modules/notifications/notifications/background/a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lexpo/modules/interfaces/taskManager/TaskExecutionCallback;


# instance fields
.field public final synthetic a:Landroid/app/job/JobService;

.field public final synthetic b:Landroid/app/job/JobParameters;


# direct methods
.method public synthetic constructor <init>(Landroid/app/job/JobService;Landroid/app/job/JobParameters;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lexpo/modules/notifications/notifications/background/a;->a:Landroid/app/job/JobService;

    .line 5
    .line 6
    iput-object p2, p0, Lexpo/modules/notifications/notifications/background/a;->b:Landroid/app/job/JobParameters;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onFinished(Ljava/util/Map;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lexpo/modules/notifications/notifications/background/a;->a:Landroid/app/job/JobService;

    .line 2
    .line 3
    iget-object v1, p0, Lexpo/modules/notifications/notifications/background/a;->b:Landroid/app/job/JobParameters;

    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lexpo/modules/notifications/notifications/background/BackgroundRemoteNotificationTaskConsumer;->a(Landroid/app/job/JobService;Landroid/app/job/JobParameters;Ljava/util/Map;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
