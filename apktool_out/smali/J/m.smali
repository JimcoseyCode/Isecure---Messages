.class public final synthetic LJ/m;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Landroidx/concurrent/futures/c$c;


# instance fields
.field public final synthetic a:Lm5/a;

.field public final synthetic b:Ljava/util/concurrent/ScheduledExecutorService;

.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>(Lm5/a;Ljava/util/concurrent/ScheduledExecutorService;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LJ/m;->a:Lm5/a;

    .line 5
    .line 6
    iput-object p2, p0, LJ/m;->b:Ljava/util/concurrent/ScheduledExecutorService;

    .line 7
    .line 8
    iput-wide p3, p0, LJ/m;->c:J

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, LJ/m;->a:Lm5/a;

    .line 2
    .line 3
    iget-object v1, p0, LJ/m;->b:Ljava/util/concurrent/ScheduledExecutorService;

    .line 4
    .line 5
    iget-wide v2, p0, LJ/m;->c:J

    .line 6
    .line 7
    invoke-static {v0, v1, v2, v3, p1}, LJ/n;->d(Lm5/a;Ljava/util/concurrent/ScheduledExecutorService;JLandroidx/concurrent/futures/c$a;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method
